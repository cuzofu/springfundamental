package org.example.proxy.statics.dao;

import org.example.proxy.statics.dao.impl.CountImpl;
import org.example.proxy.statics.dao.impl.CountImpl2;
import org.example.proxy.statics.dao.proxy.CountProxy;

public class CountTest {

	public static void main(String[] args) {
		CountImpl countImpl = new CountImpl();
		CountProxy proxy = new CountProxy(countImpl);
		proxy.updateCount();
		proxy.queryCount();
		CountImpl2 countImpl2 = new CountImpl2();
		CountProxy proxy2 = new CountProxy(countImpl2);
		proxy2.updateCount();
		proxy2.queryCount();
	}

}
