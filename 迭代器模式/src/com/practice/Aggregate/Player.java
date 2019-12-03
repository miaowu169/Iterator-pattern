package com.practice.Aggregate;

import com.practice.Iterator.Iterator;

/*
 * Aggregate类，声明createIterator()方法用于一个迭代器对象
 */

public interface Player {
	Iterator createIterator();	//返回一个迭代器类型
}
