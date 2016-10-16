package org.example.proxy.statics.dao.impl;

import org.example.proxy.statics.dao.Count;

public class CountImpl implements Count {

	@Override
	public void queryCount() {
		System.out.println("查看账户方法...");
	}

	@Override
	public void updateCount() {
		System.out.println("修改账户方法...");
	}

}
