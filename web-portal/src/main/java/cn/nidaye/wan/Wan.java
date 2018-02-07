package cn.nidaye.wan;

import java.util.Scanner;

import org.junit.Test;

public class Wan {
	@Test
	public void boil(){
	Scanner s = new Scanner(System.in);
	System.out.println("想求第几次反弹的高度:");
	int n = s.nextInt();
	double h = 100; //原高度
	double sum =100;
	for(int i=1;i<=n;i++){
	h = h/2; 
	sum += 2*h;
	if(i==n){
	sum -= 2*h;
	}
	}
	System.out.println("第"+n+"次落地经过的总高度是"+sum);
	System.out.println("第"+n+"次反弹高度是"+h);

	}
}
