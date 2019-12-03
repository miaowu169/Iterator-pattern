package com.practice.ConcreteIterator;

import com.practice.ConcreteAggregate.OfflinePlayer;
import com.practice.ConcreteAggregate.PlayerInfor;
import com.practice.Iterator.Iterator;
/*
 * ConcreteIterator类:实现抽象迭代器的接口，完成对聚合对象的遍历
 * @playerinfor:OfflinePlayer对象，通过getPlayerItems方法得到数组对象
 * @playerItems:PlayerInfor:存储玩家信息的数组
 */
public class OfflinePlayerIterator implements Iterator {
	OfflinePlayer playerinfor;
	PlayerInfor [] playerItems;
	private int position = 0;
	
	public OfflinePlayerIterator() {
		playerinfor = new OfflinePlayer();
		playerItems = playerinfor.getPlayerItems();
	}
	
	public void setPlayer(int i) {
		position = i;
	}

	public void next() {
		if(position < playerItems.length) {
			position++;
		}
	}

	public void previous() {
		if(position > 0) {
			position--;
		}
	}

	public boolean isLast() {
		return position == playerItems.length;
	}

	public Object currentPlayer() {
		return playerItems[position];
	}

	public boolean isFirst() {
		return position == 0;
	}

	public int getNumber() {
		return playerItems.length;
	}

}
