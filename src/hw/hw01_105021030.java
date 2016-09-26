package hw;
import java.util.*;
/*
假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
請問老問需找多少個1元、5元、50元，其銅板數目最少。(先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 
在此n, a1, a2, a3為整數，且a115+ a220+ a3*30小於或等於N。列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/09/26
 * Author: 105021030 張廷毓
 */
public class hw01_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int found=0;
		
		System.out.print("媽媽給小明$$:");
		int N=sc.nextInt();
		
		System.out.print("蘋果幾個:");
		int apple=sc.nextInt();
		System.out.print("柳丁幾個:");
		int orange=sc.nextInt();
		System.out.print("桃子幾個:");
		int peach=sc.nextInt();
		System.out.println();
		found=N- (apple*15+orange*20+peach*30);
		if(found>=0){
			System.out.println("找回零錢");
			System.out.println("50元:"+found/50+"個");
			System.out.println("5元:"+(found%50)/5+"個");
			System.out.println("1元:"+(found%50%5)/1+"個");
		}
		else
			System.out.print("0");
		
		
		
		
		
	}
}
