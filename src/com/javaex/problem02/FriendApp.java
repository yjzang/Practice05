package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		List<Friend> list = new ArrayList<Friend>();

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");

		Friend f1 = new Friend();
		Friend f2 = new Friend();
		Friend f3 = new Friend();

		list.add(f1);
		list.add(f2);
		list.add(f3);
		

		for (int i = 0; i < list.size(); i++) {

			String info = sc.nextLine();
			String str[] = info.split(" "); // Q. 공백 분리도 배열 대신 list써서 가능한가?

			list.get(i).setName(str[0]);
			list.get(i).setHp(str[1]);
			;
			list.get(i).setSchool(str[2]);

		}

		for (int i = 0; i < list.size(); i++) {

			list.get(i).showInfo();

		}
		sc.close();
	}

}
