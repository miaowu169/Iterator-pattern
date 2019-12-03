package com.practice.ConcreteAggregate;
/*
 * tools类,封装玩家的信息
 * @name 玩家的名字
 * @description 玩家的游戏段位
 * @gameName 玩家在游戏中的名字
 * @status 玩家的状态
 */

public class PlayerInfor {
	String name;
	String description;
	String gameName;
	String status;
	
	public PlayerInfor(String name,String description,String gameName,String status) {
		this.name = name;
		this.description = description;
		this.gameName = gameName;
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getGameName() {
		return gameName;
	}
	
	public String getStatus() {
		return status;
	}
}
