package com.practice.Client;

import com.practice.Aggregate.Player;
import com.practice.ConcreteAggregate.PlayerInfor;
import com.practice.Iterator.Iterator;
/*
 * �����,���û��ṩ�ӿڹ��û�ʹ��
 * @onlinePlayer �ü���ʵ�ֵ�ConcreteAggregate��
 * @offlinePlayer ������ʵ�ֵ�ConcreteAggregate��
 */
public class Desktop {
	Player onlinePlayer;
	Player offlinePlayer;
	
	public Desktop(Player onlinePlayer2,Player offlinePlayer2) {
		this.onlinePlayer = onlinePlayer2;			
		this.offlinePlayer = offlinePlayer2;
	}
	
	public void display() {
		//����onlinePlayerIterator������
		Iterator onlinePlayIterator = onlinePlayer.createIterator();
		//����offlinePlayerIterator������
		Iterator offlinePlayIterator = offlinePlayer.createIterator();
		
		System.out.println("---�������- - -");
		while(!onlinePlayIterator.isLast()) {
			PlayerInfor infor = (PlayerInfor) onlinePlayIterator.currentPlayer();//���ʵ�ǰ�����Ϣ
			System.out.printf("%-15s",infor.getGameName());
			System.out.printf("%-15s",infor.getName());
			System.out.printf("%-15s",infor.getDescription());
			System.out.printf("%-15s",infor.getStatus());
			onlinePlayIterator.next();//��ת��һ�����Ϣ
			System.out.println();
		}	
		
		System.out.println("---�������- - -");
		while(!offlinePlayIterator.isLast()) {
			PlayerInfor infor = (PlayerInfor) offlinePlayIterator.currentPlayer();
			System.out.printf("%-15s",infor.getGameName());
			System.out.printf("%-15s",infor.getName());
			System.out.printf("%-15s",infor.getDescription());
			System.out.printf("%-15s",infor.getStatus());
			offlinePlayIterator.next();
			System.out.println();
		}
	}
}
