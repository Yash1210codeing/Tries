package Tries;
import java.util.*;
public class Tavas_and_Saddas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(Tavas_and_Saddas(str));
	}
  public static int Tavas_and_Saddas(String str) {
	  int n=str.length();
	  int count=(1<<n)-2;
	  int pos=0;
	  for(int i=str.length()-1;i>=0;i++) {
		  if(str.charAt(i)=='7') {
			  count+=(1<<pos);
		  }
		  pos++;
	  }
	  return count+1;
  }
}
