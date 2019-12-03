package com.practice.ConcreteAggregate;

import com.practice.Aggregate.Player;
import com.practice.ConcreteIterator.OfflinePlayerIterator;
import com.practice.Iterator.Iterator;
/*
 * ConcreteAggregate�ࣺ������Ӧ�������Ľӿڣ�ʵ��createIterater���ڴ���һ������������
 * PlayerItems:���飬���ڴ��PlayerInfor���͵������Ϣ����
 * @MAX_ITEMS ��������ĳ���
 */
public class OfflinePlayer implements Player {
	static final int MAX_ITEMS = 5;
	int numberOfItems = 0;
	PlayerInfor [] playerItems;
	
	public OfflinePlayer() {
		playerItems = new PlayerInfor[MAX_ITEMS];
		
		addItem("����","������ʯIII","��������ţ��","����");
		addItem("�ܰ�","","���ҡ�����","����");
		addItem("���","������ҫV","����������","����");
		addItem("֣ʮ","������ҫI","����","����");
		addItem("��ʮһ","��ҫ�ƽ�I","��Ѫ-Stalk","����");
	}
	
	public void addItem(String name,String description,String gameName,String status) {
		PlayerInfor playerItem = new PlayerInfor(name,description,gameName,status);
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("����Խ��");
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
