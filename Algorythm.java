package zad2;
import java.util.Scanner;

public class Algorythm {

	public static boolean even_odd(int x)
	{
		if(x%2==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		int n0,n1,i=1;
		String eo;
		Scanner getinfo=new Scanner(System.in);
		
		System.out.println("Podaj dowolna liczbe naturalna: ");
		n0=getinfo.nextInt();
		
		do{
			
		if(even_odd(n0)==true)
		{
			n1=n0/2;
			eo="parzyste";
		}
		else
		{
			n1=n0*3+1;
			eo="nieparzyste";
		}
		if(n0==1)
		{
			System.out.println("Koniec obliczen!");
			break;
		}
		System.out.println(i+","+n0+","+eo+","+n1);
		n0=n1;
		i++;
		}
		while(n0>1);
		
		
		
	}

}
