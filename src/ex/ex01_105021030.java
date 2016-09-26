package ex;
import java.util.*;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021030 張廷毓
 */
public class ex01_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int minute=sc.nextInt();
		float price=0.5f;
		
		if(minute<=600){
			System.out.print("電話費:"+minute*price);	
		}
		else{
			if(minute>600&&minute<=1200){
				System.out.print("電話費:"+minute*0.5*0.9);	
			}
			else{
				System.out.print("電話費:"+minute*0.5*0.79);
			}
		}
	

		
		
		
		
	}

}