package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	
    	while(true) {
    		
    	
    		System.out.print(">> "); 
        	
        	String input = sc.nextLine();
        	
        	String[] sp = input.split(" ");
    	
        
        	if (sp[0].equals("/q")){
	    		
	            System.out.println("종료");			// 종료 if를 제일 앞으로 빼니까 잘됨.
	            break;  							// Add if 에 먼저들어가면 오류가 나는데, 아마 sp[1]에 아무값도 없는데 비어있는 값을 조건따지라고 해서 error 나는듯.  
	    	}
	    	
	    		
	    	else if (sp[1].equals("+")){
	    		
	            int a = Integer.parseInt(sp[0]);
	            int b = Integer.parseInt(sp[2]);
	    		Add add = new Add();
	    		add.setValue(a, b);
	    		System.out.println(add.caculate());
	    		
	    	}
	    	
	    	
	    	else if (sp[1].equals("-")){
	    		
	            int a = Integer.parseInt(sp[0]);
	            int b = Integer.parseInt(sp[2]);
	    		Sub sub = new Sub();
	    		sub.setValue(a, b);
	    		sub.caculate();
	    		System.out.println(sub.caculate());
	    	}
	    	
	    	else if (sp[1].equals("*")){
	    		
	            int a = Integer.parseInt(sp[0]);
	            int b = Integer.parseInt(sp[2]);
	    		Mul mul = new Mul();
	    		mul.setValue(a, b);
	    		mul.caculate();
	    		System.out.println(mul.caculate());
	    	}
	    	
	    	else if (sp[1].equals("/")){
	    		
	            int a = Integer.parseInt(sp[0]);
	            int b = Integer.parseInt(sp[2]);
	    		Div div = new Div();
	    		div.setValue(a, b);
	    		div.caculate();
	    		System.out.println(div.caculate());
	    	}
	    	
	    	    	
	    	else {
	    		
	    		System.out.println("알 수 없는 연산 입니다.");
	    	}
	    	
    	sc.close();
	    	
    	}
    	
    			
    }
}
