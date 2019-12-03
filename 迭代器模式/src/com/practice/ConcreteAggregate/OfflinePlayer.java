package com.practice.ConcreteAggregate;

import com.practice.Aggregate.Player;
import com.practice.ConcreteIterator.OfflinePlayerIterator;
import com.practice.Iterator.Iterator;
/*
 * ConcreteAggregate类：创建相应迭代器的接口，实现createIterater用于创建一个迭代器对象
 * PlayerItems:数组，用于存放PlayerInfor类型的玩家信息数据
 * @MAX_ITEMS 定义数组的长度
 */
public class OfflinePlayer implements Player {
	static final int MAX_ITEMS = 5;
	int numberOfItems = 0;
	PlayerInfor [] playerItems;
	
	public OfflinePlayer() {
		playerItems = new PlayerInfor[MAX_ITEMS];
		
		addItem("孙七","永恒钻石III","美团骑手牛笔","离线");
		addItem("周八","","胡桃……泽","离线");
		addItem("吴九","至尊星耀V","憨批滚吧你","离线");
		addItem("郑十","至尊星耀I","北楚","离线");
		addItem("邱十一","荣耀黄金I","蒸血-Stalk","离线");
	}
	
	public void addItem(String name,String description,String gameName,String status) {
		PlayerInfor playerItem = new PlayerInfor(name,description,gameName,status);
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("数组越界");
		}else {
			playerItems[numberOfItems] = playerItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public PlayerInfor[] getPlayerItems() {
		return playerItems;
	}
	
	public Iterator createIterator() {
		return new OfflinePlayerIterator();
	}

}
