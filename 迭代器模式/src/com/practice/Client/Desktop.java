package com.practice.Client;

import com.practice.Aggregate.Player;
import com.practice.ConcreteAggregate.PlayerInfor;
import com.practice.Iterator.Iterator;
/*
 * 外观类,向用户提供接口供用户使用
 * @onlinePlayer 用集合实现的ConcreteAggregate类
 * @offlinePlayer 用数组实现的ConcreteAggregate类
 */
public class Desktop {
	Player onlinePlayer;
	Player offlinePlayer;
	
	public Desktop(Player onlinePlayer2,Player offlinePlayer2) {
		this.onlinePlayer = onlinePlayer2;			
		this.offlinePlayer = offlinePlayer2;
	}
	
	public void display() {
		//调用onlinePlayerIterator迭代器
		Iterator onlinePlayIterator = onlinePlayer.createIterator();
		//调用offlinePlayerIterator迭代器
		Iterator offlinePlayIterator = offlinePlayer.createIterator();
		
		System.out.println("---在线玩家- - -");
		while(!onlinePlayIterator.isLast()) {
			PlayerInfor infor = (PlayerInfor) onlinePlayIterator.currentPlayer();//访问当前玩家信息
			System.out.printf("%-15s",infor.getGameName());
			System.out.printf("%-15s",infor.getName());
			System.out.printf("%-15s",infor.getDescription());
			System.out.printf("%-15s",infor.getStatus());
			onlinePlayIterator.next();//跳转下一玩家信息
			System.out.println();
		}	
		
		System.out.println("---离线玩家- - -");
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
