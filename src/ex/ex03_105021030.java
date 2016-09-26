package ex;
import java.util.*;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021030 張廷毓
 */
public class ex03_105021030 {
	public static void main(String[] args) {
		int sum1= 0;
		int sum2= 0;
		int sum3= 0;
		int sum=0;
		sum1=4*30;
		sum2=4*40;
		sum3=2*60;
		sum=sum1+sum2+sum3;
		System.out.print("早上10點23分停到下午3點20分的停車費:"+sum);

	}

}