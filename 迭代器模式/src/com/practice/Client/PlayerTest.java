package com.practice.Client;

import com.practice.Aggregate.Player;
import com.practice.ConcreteAggregate.OfflinePlayer;
import com.practice.ConcreteAggregate.OnlinePlayer;

/*
 * ������
 */
public class PlayerTest {	
	public static void main(String [] args) {
		Player onlinePlayer = new OnlinePlayer();	//����ʵ�ֵ�����
		Player offlinePlayer = new OfflinePlayer();	//����ʵ�ֵ�����
		
		Desktop display = new Desktop(onlinePlayer,offlinePlayer);
		display.display();
	}
}
