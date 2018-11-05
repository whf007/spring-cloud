package com.xue.sringzuul.controller;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

@Component
public class DemoFilter extends ZuulFilter {

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		
		return "pre";
	}

}
