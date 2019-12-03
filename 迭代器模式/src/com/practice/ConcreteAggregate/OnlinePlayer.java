package com.practice.ConcreteAggregate;

import java.util.ArrayList;
import com.practice.Aggregate.Player;
import com.practice.ConcreteIterator.OnlinePlayerIterator;
import com.practice.Iterator.Iterator;
/*
 * ConcreteAggregate�ࣺ������Ӧ�������Ľӿڣ�ʵ��createIterater���ڴ���һ������������
 * @playerItems ���弯�ϣ����ڴ��PlayerInfor����
 */
public class OnlinePlayer implements Player{
	ArrayList<PlayerInfor> playerItems;
	
	public OnlinePlayer() {
		playerItems = new ArrayList<PlayerInfor>();
		addItem("����","������ҫIII","����Ϊ����","����16����");
		addItem("����","��󲬽�II","Z����J","����14����");
		addItem("����","������ʯIV","�ɰ��ɰ�O","����10����");
		addItem("����","","TANGIAMIN","����2����");
	}

	private void addItem(String name, String description, String gameName, String status) {
		PlayerInfor playInfor = new PlayerInfor(name,description,gameName,status);
		playerItems.add(playInfor);
	}
	
	public ArrayList<PlayerInfor> getPlayerItems() {
		return playerItems;
	}

	public Iterator createIterator() {
		return new OnlinePlayerIterator();
	}
}
