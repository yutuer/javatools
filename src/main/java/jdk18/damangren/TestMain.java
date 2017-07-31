package jdk18.damangren;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {

	public static void main(String[] args) {
		{
			String[] a = new String[] { "\\|", "&" };
			List<String> l = Arrays.asList("\\|", "&"); // asList返回的是不可修改的list(Arrays.ArrayList),没有override
			// remove方法, 所以不能执行remove操作
		}

		{
			Comparator<Apple> comparing = Comparator.comparing(Apple::getWeight);
			
			List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
			numbers.stream().filter(i -> i > 0).distinct().skip(1).forEach(System.out::println);
			
			Optional<Integer> o1 = numbers.stream().skip(6).findAny();
			o1.ifPresent(System.out::println);
			
			Integer sum = numbers.stream().reduce(1, (a, b) -> a + b);
			System.out.println(sum);
			
			Optional<Integer> reduce = numbers.stream().reduce(Integer::sum);
			reduce.ifPresent(System.out::println);
		}

		{
			Trader raoul = new Trader("Raoul", "Cambridge");
			Trader mario = new Trader("Mario", "Milan");
			Trader alan = new Trader("Alan", "Cambridge");
			Trader brian = new Trader("Brian", "Cambridge");

			List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul,
					2012, 1000), new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(
					mario, 2012, 700), new Transaction(alan, 2012, 950));

			{
				transactions.stream().filter(t -> t.getYear() == 2012)
						.sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

			}

			{
				transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);
				Set<String> collect = transactions.stream().map(t -> t.getTrader().getCity())
						.collect(Collectors.toSet());
			}

			{
				transactions.stream().map(Transaction::getTrader).distinct()
						.filter(t -> t.getCity().equals("Cambridge")).sorted(Comparator.comparing(Trader::getName))
						.forEach(System.out::println);
			}

			{
				transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
			}

			{
				transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
						.mapToInt(Transaction::getValue).reduce(Integer::sum).ifPresent(System.out::println);
			}

			{
				Stream.iterate(new int[] { 0, 1 }, i -> new int[] { i[1], i[0] + i[1] }).limit(10)
						.forEach(i -> System.out.println(i[0] + " " + i[1]));
			}
			{
				Map<Integer, List<Transaction>> collect = transactions.stream().collect(Collectors.groupingBy(Transaction::getYear));
				System.out.println(collect);
			}
			
			{
				System.out.println(transactions.stream().count());
			}
			
			{
				 Integer sum = transactions.stream().collect(Collectors.summingInt(Transaction::getValue));
				 System.out.println(sum);
				 
			}
		}
	}
}
