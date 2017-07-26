package com.gongjian.dubbo.provider.impl;

import com.gongjian.dubbo.remote.TestService;

public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}

}
