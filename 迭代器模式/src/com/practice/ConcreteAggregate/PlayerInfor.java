package com.practice.ConcreteAggregate;
/*
 * tools��,��װ��ҵ���Ϣ
 * @name ��ҵ�����
 * @description ��ҵ���Ϸ��λ
 * @gameName �������Ϸ�е�����
 * @status ��ҵ�״̬
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
