package com.practice.Iterator;

/*
 * Iterater类，定义了访问和遍历元素的接口
 */

public interface Iterator {
	void setPlayer(int i);	//设置为当前玩家
	void next();		//访问下一个玩家信息
	void previous();		//访问前一个玩家信息
	boolean isLast();		//判断当前玩家是否为末位玩家
	Object currentPlayer();	//返回当前玩家信息
	boolean isFirst();	//判断当前玩家是否为首位玩家
	int getNumber();	//总共有多少玩家
}
