package com.practice.ConcreteAggregate;

import java.util.ArrayList;
import com.practice.Aggregate.Player;
import com.practice.ConcreteIterator.OnlinePlayerIterator;
import com.practice.Iterator.Iterator;
/*
 * ConcreteAggregate类：创建相应迭代器的接口，实现createIterater用于创建一个迭代器对象
 * @playerItems 定义集合，用于存放PlayerInfor对象
 */
public class OnlinePlayer implements Player{
	ArrayList<PlayerInfor> playerItems;
	
	public OnlinePlayer() {
		playerItems = new ArrayList<PlayerInfor>();
		addItem("张三","至尊星耀III","长发为君留","开局16分钟");
		addItem("李四","尊贵铂金II","Z三七J","开局14分钟");
		addItem("王五","永恒钻石IV","可爱可爱O","开局10分钟");
		addItem("赵六","","TANGIAMIN","开局2分钟");
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
