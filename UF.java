package algorithms;
import java.util.Scanner;

public class UF {

	public static void main(String[] args) { 
			try {
				Scanner in = new Scanner(System.in); 
				int N = 10;
				System.out.print("The array is: ");
				QuickFindUF uf = new QuickFindUF(N);
				uf.printConnectedComponents();
				System.out.println("\n************************************\n\tENRTY YOURS UNIOS");
				System.out.println("The union numbers must be between 0 to 9\n");
				boolean getContinues = true;
				 while(getContinues){
					 System.out.print("Union: ");
					 int p = in.nextInt();
					 System.out.print("to: ");
					 int q = in.nextInt();
					 
					 if(!uf.connected(p,q)){
						 uf.union(p,q);
						 System.out.println("Your entered union: "+ p +" " + q);
						 uf.printConnectedComponents();
					 }
					 else{
						 System.out.println("You have entered same number of the union. They are already connected");
					 }
					 
					 System.out.print("Do you want to continue and add onther union then press y \nor ony other character to interupt loop: ");
					 String str = in.next();
					 
					if(!str.equals("y")){
						 getContinues = false;
					 }
				 }
				 System.out.println("\nyour union array:");
				 uf.printConnectedComponents();
				 System.out.println();
				 uf.uniqComponents();
			in.close();
		}
		catch(Exception en){
			System.out.println(en);
		}
	}
}
