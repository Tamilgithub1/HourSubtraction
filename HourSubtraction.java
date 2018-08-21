import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String t1=in.nextLine();
	String t2=in.nextLine();
	String s1[]=t1.split(" ");
	String s2[]=t2.split(" ");
	int a=Integer.parseInt(s1[0]);
	int b=Integer.parseInt(s2[0]);
	int a1=Integer.parseInt(s1[1]);
	int b1=Integer.parseInt(s2[1]);
	int h=Math.abs(a-b);
	int m=Math.abs(a1-b1);
	System.out.println(h+" "+m);
	
}
}
