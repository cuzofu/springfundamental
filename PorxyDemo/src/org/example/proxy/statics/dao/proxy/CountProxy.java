package org.example.proxy.statics.dao.proxy;

import org.example.proxy.statics.dao.Count;

public class CountProxy implements Count {

	private Count count;

	public CountProxy() {
	}

	public CountProxy(Count count) {
		this.count = count;
	}

	@Override
	public void queryCount() {
		System.out.println("事务处理之前");
		count.queryCount();
		System.out.println("事务处理之后");
	}

	@Override
	public void updateCount() {
		System.out.println("事务处理之前");
		count.updateCount();
		System.out.println("事务处理之后");
	}

}
