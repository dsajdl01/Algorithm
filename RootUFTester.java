package algorithms;

import java.util.Scanner;

public class RootUFTester {

	public static void main(String[] args) {
		try{
					Scanner in = new Scanner(System.in); 
					System.out.print("Please enter length of the array: ");
					int N = in.nextInt();
					System.out.print("Your array: ");
					RootUF uf = new RootUF(N);
					uf.printConnectedComponent();
					System.out.print("In Array: ");uf.printIzArray();
					System.out.println("\n************************************\n\t ENRTY SOME UNIOS");
					int hi = N - 1;
					System.out.println("The union numbers must be in the range between 0 to " + hi);
					boolean getContinues = true;
					 while(getContinues){
						 System.out.print("Union: ");
						 int p = in.nextInt();
						 System.out.print("to: ");
						 int q = in.nextInt();
						 
						 if(!uf.connectedRoot(p,q)){
							 uf.union(p,q);
							 System.out.println("Your entered union: "+ p +" " + q);
							 uf.printConnectedComponent();
							 System.out.print("Iz Array: ");uf.printIzArray();
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
					 uf.printConnectedComponent();
					 System.out.println();
					 //uf.uniqComponents();
					 System.out.print("Iz Array: ");uf.printIzArray();
					 in.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
