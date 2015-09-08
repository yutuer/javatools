package com.alibaba.dubbo.demo;

public interface CallbackService {
	void addListener(CallbackListener listener, String key, byte[] data);
}
