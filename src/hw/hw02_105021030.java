package hw;
import java.util.*;
/*
 已知男生標準體重＝(身高－80 )0.7；女生標準體重＝(身高－70)0.6；試寫一個程式可以計算男生女生的標準體重。
 (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021030 張廷毓
 */
public class hw02_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入性別(1代表男性；2代表女性):");
		int a=sc.nextInt();
		System.out.print("請輸入身高:");
		int b=sc.nextInt();
		
		int weight=0;
		if(a==1){
			weight=(b-80)*7/10;
				System.out.print("男生標準體重:"+weight);
		}
		else{
			if(a==2){
			weight=(b-70)*6/10;
				System.out.print("女生標準體重:"+weight);
			}	
		}
		
		
		
		
	}

}
