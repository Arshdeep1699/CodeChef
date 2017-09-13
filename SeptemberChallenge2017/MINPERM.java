import java.util.Scanner;

public class MINPERM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n= sc.nextInt();
			if(n%2==0){
				evenPer(n);
			}else{
				oddPer(n);
			}
			t--;
		}

	}
	
	public static void evenPer(int n){
		for(int i =1;i<=n;i+=2){
			System.out.print((i+1)+" "+i+" ");
		}
	}
	
	public static void oddPer(int n){
		evenPer(n-3);
		System.out.println((n-1)+" "+(n)+" "+(n-2)+" ");
	}

}
