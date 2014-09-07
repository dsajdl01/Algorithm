package algorithms;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * QuickFindUF class (UF Union Find) simulate solving dynamic activities problem 
 * call quick find [eager algorithm] where data structure is simply integer array
 * that is index of object and interpretation is two object (in this case integers)
 * p and q that are conected in and only if they entry in the array are the same (have the same id).
 *   
 *
 * Integer array id[] on length N 
 * 
 * @author David Sajdl
 *
 */

public class QuickFindUF {
	
	// declare instance array variables
	private int[] id;
	
		/**
		 * constructor where array is created with length N
		 * and assigned values form 0 to N
		 */
	
	public QuickFindUF(int N){
		this.id = new int[N];
		
		for(int i = 0; i < N; i ++){
			id[i] = i;
		}
	}
	/**
	 * connected method check if two arguments p and q (object) are equal in 
	 * this case if two integers are the same
	 * 
	 * @param p integer 
	 * @param q integer
	 * @return true if arguments (integers) are the same otherwise false
	 */
	public boolean connected(int p, int q){
		return id[p] == id[q];
	}
	
	/**
	 * it change all entries of the id[p] to the id[q] 
	 * 
	 * @param p integer (index of the array) 
	 * @param q integer (index of the array)
	 */
	
	public void union(int p, int q){
		// finding id to each arguments
		int pid = id[p];
		int qid = id[q];
		// go through array and check if first id is equal to other id if yes then change id for second id
		for(int i = 0; i<id.length; i++){
			if(id[i] == pid){
				id[i]= qid;
			}
		}
	}

	/**
	 * it prints out all elements in the array that represent 
	 * connection of the components
	 */
	public void printConnectedComponents(){
		for(int i = 0; i < id.length; i++){
			System.out.print(id[i] + " ");
		}
		System.out.println();
	}
	/**
	 * it prints out how many connected components are in the array   
	 */
	public void uniqComponents(){
		Set<Integer> uniqKey = new LinkedHashSet<Integer>();
		for(int x : id){
			uniqKey.add(x);
		}
		for(Integer y : uniqKey){
			System.out.print(y +", ");
		}
		System.out.println("\nThere are " + uniqKey.size() + " connected components");
		
	}
	/**
	 * main methods create object of QuickFindUF that create array length of 10 
	 * then 10 different elements that represent object are connected with union() method 
	 */
	  public static void main(String[] args) {  
          try { 
              
        	  // it creates id array with 10 object(10 integers) with 10 components
              int N = 10; 
              System.out.print("The array is: "); 
              QuickFindUF uf = new QuickFindUF(N); 
              uf.printConnectedComponents(); 
              System.out.println();
              
              //union operation to connect integers (object)  
              int p =4;
              int q =3;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              }   
               p =3;
               q =8;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              } 
               p =6;
               q =5;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              } 
               p =9;
               q =4;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              } 
               p =2;
               q =1;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              } 
               p =8;
               q =9;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              } 
               p =5;
               q =0;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              } 
               p =7;
               q =2;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              } 
               p =6;
               q =1;
              if(!uf.connected(p,q)){
                  System.out.println("union("+p+","+q+")");
                  uf.union(p,q); 
                  uf.printConnectedComponents();} 
              else{ 
                  System.out.println("You have entered same number of the union. They are already connected"); 
              }
              
              // to print how many components are in the array
               System.out.println(); 
               uf.uniqComponents(); 
      
      } 
      catch(Exception en){ 
          System.out.println(en); 
      } 
  } 
}
