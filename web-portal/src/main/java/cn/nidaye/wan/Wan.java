package cn.nidaye.wan;

import java.util.Scanner;

import org.junit.Test;

public class Wan {
	@Test
	public void boil(){
	Scanner s = new Scanner(System.in);
	System.out.println("����ڼ��η����ĸ߶�:");
	int n = s.nextInt();
	double h = 100; //ԭ�߶�
	double sum =100;
	for(int i=1;i<=n;i++){
	h = h/2; 
	sum += 2*h;
	if(i==n){
	sum -= 2*h;
	}
	}
	System.out.println("��"+n+"����ؾ������ܸ߶���"+sum);
	System.out.println("��"+n+"�η����߶���"+h);

	}
}
