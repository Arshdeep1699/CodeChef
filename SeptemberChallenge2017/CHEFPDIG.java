import java.util.Scanner;

public class CHEFPDIG {
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while(t>0){
        	  String num = sc.next();
        	  int [] arr = new int [10];
        	  boolean[] ans = new boolean [91];
        	  for(int i =0;i<num.length();i++){
        		  arr[num.charAt(i)-48]++;
        	  }
        	  
        	  if(arr[6]>0){
        		  if(arr[5]>0){
        			  ans[65]=true;
        		  }
        		  if(arr[6]>1){
        			  ans[66]=true;
        		  }
        		  for(int j =7;j<=9;j++){
        			  if(arr[j]>0){
        				  ans[60+j]=true;
        			  }
        		  }
        	  }
        	  if(arr[7]>0){
        		  for(int j=0;j<=9;j++){
        			  if(arr[j]>0&&j!=7){
        				  ans[70+j]=true;
        			  }
        			  
        		  }
        		  if(arr[7]>1){
    				  ans[77]=true;
    			  }
        		  
        	  }
        	  if(arr[8]>0){
        		  for(int j=0;j<=9;j++){
        			  if(arr[j]>0&&j!=8){
        				  ans[80+j]=true;
        			  }
        			  
        		  }
        		  if(arr[8]>1){
    				  ans[88]=true;
    			  }
        		
        	  }
        	  if(arr[9]>0 && arr[0]>0){
        		  ans[90]=true;
        	  }
        	  int check=0;
        	  for(int i=65;i<=90;i++){
        		  if(ans[i]){
        			  check++;
        			  System.out.print((char)i);
        		  }
        	  }
        	  if(check==0){
        		  System.out.println();
        	  }
        	  System.out.println();
        	  t--;
          }
	}
}
