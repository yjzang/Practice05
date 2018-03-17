package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	List<Goods> list = new ArrayList<Goods>();
    	Scanner sc = new Scanner(System.in);
     	int sum = 0;
    	Goods g1 = new Goods();
    	Goods g2 = new Goods();
    	Goods g3 = new Goods();
    	
    	list.add(g1);
    	list.add(g2);
    	list.add(g3);
    	
    	System.out.println("상품 3개를 입력하세요");
    	
    	for(int i=0; i<list.size(); i++) {
	    	
    		String input = sc.nextLine();
	    	String[] info = input.split(" ");
	    	int price = Integer.parseInt(info[1]);
	    	int count = Integer.parseInt(info[2]);
	    	
	    	list.get(i).setName(info[0]);
	    	list.get(i).setPrice(price);
	    	list.get(i).setCount(count);
	    	
	    	sum = sum + count;
	    	
    	}

    	for(int i=0; i<list.size(); i++) {
	    	
	    	list.get(i).showinfo();
    	}
    	
    	System.out.println("모든 상품의 갯수는 " +sum + "개입니다.");
    	sc.close();   	
    	
    }

}
