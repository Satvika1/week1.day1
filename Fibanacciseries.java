package week1.day1;

public class Fibanacciseries {
public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	int a = 0;
	int b =1 ;
	int sum;
	for(int i=0;i<8; i++) {
		sum = a+b;
		a = b;b = sum;
		System.out.println(a + " ");
		
	}
	

}
	}


