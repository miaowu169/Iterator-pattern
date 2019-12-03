package com.practice.ConcreteIterator;

import java.util.ArrayList;

import com.practice.ConcreteAggregate.OnlinePlayer;
import com.practice.ConcreteAggregate.PlayerInfor;
import com.practice.Iterator.Iterator;
/*
 * ConcreteIterator��:ʵ�ֳ���������Ľӿڣ���ɶԾۺ϶���ı���
 * @playerItems:�����Ϣ���
 * @palyers:OnlinePlayerIterator����ͨ��players�õ�������Ϣ
 */
public class OnlinePlayerIterator implements Iterator {
	ArrayList<PlayerInfor>playerItems;
	OnlinePlayer players;
	private int currentIndex = 0;
	
	public OnlinePlayerIterator() {
		players = new OnlinePlayer();
		playerItems = players.getPlayerItems();//�õ�OnlinePlayer�����еļ���
	}

	public void setPlayer(int i) {
		currentIndex = i;
	}

	public void next() {	//���ʼ����е���һ��Ԫ��
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
