package ex;
import java.util.*;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021030 張廷毓
 */
public class ex02_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入x座標:");
		int x=sc.nextInt();
		System.out.print("請輸入y座標:");
		int y=sc.nextInt();
		
		if(x*x+y*y <= 100*100)
			System.out.print("在範圍內");
		else
			System.out.print("在範圍外");
		
		
		
		
	}

}