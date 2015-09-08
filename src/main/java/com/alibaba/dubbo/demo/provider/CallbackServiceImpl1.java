package com.alibaba.dubbo.demo.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.dubbo.demo.CallbackListener;
import com.alibaba.dubbo.demo.CallbackService;

public class CallbackServiceImpl1 implements CallbackService {

	public void addListener(CallbackListener listener, String key, byte[] data) {
		listener.changed(new byte[] { 1, 1, 1, 1 }); // 发送变更通知
	}

	private String getChanged(String key) {
		return "Changed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

}
