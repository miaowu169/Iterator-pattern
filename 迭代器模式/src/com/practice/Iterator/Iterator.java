package com.practice.Iterator;

/*
 * Iterater�࣬�����˷��ʺͱ���Ԫ�صĽӿ�
 */

public interface Iterator {
	void setPlayer(int i);	//����Ϊ��ǰ���
	void next();		//������һ�������Ϣ
	void previous();		//����ǰһ�������Ϣ
	boolean isLast();		//�жϵ�ǰ����Ƿ�Ϊĩλ���
	Object currentPlayer();	//���ص�ǰ�����Ϣ
	boolean isFirst();	//�жϵ�ǰ����Ƿ�Ϊ��λ���
	int getNumber();	//�ܹ��ж������
}
