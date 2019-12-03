package com.practice.ConcreteIterator;

import java.util.ArrayList;

import com.practice.ConcreteAggregate.OnlinePlayer;
import com.practice.ConcreteAggregate.PlayerInfor;
import com.practice.Iterator.Iterator;
/*
 * ConcreteIterator类:实现抽象迭代器的接口，完成对聚合对象的遍历
 * @playerItems:玩家信息项集合
 * @palyers:OnlinePlayerIterator对象，通过players得到集合信息
 */
public class OnlinePlayerIterator implements Iterator {
	ArrayList<PlayerInfor>playerItems;
	OnlinePlayer players;
	private int currentIndex = 0;
	
	public OnlinePlayerIterator() {
		players = new OnlinePlayer();
		playerItems = players.getPlayerItems();//得到OnlinePlayer对象中的集合
	}

	public void setPlayer(int i) {
		currentIndex = i;
	}

	public void next() {	//访问集合中的下一个元素
		if(currentIndex < playerItems.size()) {
			currentIndex ++;
		}
	}

	public void previous() {
		if(currentIndex > 0) {
			currentIndex --;
		}
	}

	public boolean isLast() {
		return currentIndex == playerItems.size();
	}

	public Object currentPlayer() {
		return playerItems.get(currentIndex);
	}

	public boolean isFirst() {
		return currentIndex == 0;
	}

	public int getNumber() {
		return playerItems.size();
	}

}
