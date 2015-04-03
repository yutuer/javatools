package pipei;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import util.MyUtil;

import com.google.common.collect.Lists;

public class PipeiContainer {

	private Queue<Clan> taskQueue = new LinkedBlockingQueue<Clan>();
	private AtomicInteger ai = new AtomicInteger();
	private static final long SleepTime = 2 * MyUtil.SECOND;

	public void clanJoin(Clan c) {
		taskQueue.offer(c);
	}

	public PipeiContainer() {
		super();
		new Task().start();
		new Thread(new PutClanTask()).start();
	}

	private class Task extends Thread {
		@Override
		public void run() {
			try {
				for (;;) {
					System.out.println("now:" + taskQueue);
					List<GeneralBeanTwo<Clan, Clan>> result = findTask();
					notifyResult(result);
					Thread.sleep(SleepTime);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void notifyResult(List<GeneralBeanTwo<Clan, Clan>> results) {
		for (GeneralBeanTwo<Clan, Clan> result : results) {
			System.out.printf("result:%s, %s \n", result.getOne(), result.getTwo());
		}
	}

	public List<GeneralBeanTwo<Clan, Clan>> findTask() {
		int count = taskQueue.size();
		List<GeneralBeanTwo<Clan, Clan>> ret = Lists.newArrayList();
		if (count > 1) {
			for (int i = 0; i < count; i++) {
				Clan c = taskQueue.poll();
				if (c == null) {
					System.out.println("Exception:" + taskQueue);
				}
				boolean isAdd = true;
				double rate = c.getRate();
				int max = (int) (c.getScore() * (1 + rate));
				int min = (int) (c.getScore() * (1 - rate));
				Iterator<Clan> iter = taskQueue.iterator();
				while (iter.hasNext()) {
					Clan iterClan = iter.next();
					int score = iterClan.getScore();
					if (score >= min && score <= max) {
						isAdd = false;
						// 删除掉
						iter.remove();
						ret.add(new GeneralBeanTwo<Clan, Clan>(c, iterClan));
						i += 2;
					}
				}
				if (isAdd) {
					taskQueue.offer(c);
				}
			}
		}
		return ret;
	}

	private class PutClanTask implements Runnable {
		@Override
		public void run() {
			try {
				while (true) {
					Thread.sleep(1000);
					int index = ai.incrementAndGet();
					taskQueue.offer(new Clan(index, new Random().nextInt(1000)));
					if (index > 100) {
						break;
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
