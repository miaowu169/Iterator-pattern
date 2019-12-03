package com.practice.Client;

import com.practice.Aggregate.Player;
import com.practice.ConcreteAggregate.OfflinePlayer;
import com.practice.ConcreteAggregate.OnlinePlayer;

/*
 * 测试类
 */
public class PlayerTest {	
	public static void main(String [] args) {
		Player onlinePlayer = new OnlinePlayer();	//集合实现迭代器
		Player offlinePlayer = new OfflinePlayer();	//数组实现迭代器
		
		Desktop display = new Desktop(onlinePlayer,offlinePlayer);
		display.display();
	}
}
