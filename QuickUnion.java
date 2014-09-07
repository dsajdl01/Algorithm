package algorithms;

/**
 * QuickUnion class simulate solving dynamic activities problem 
 * call quick union [lazy approach]. So  as Quick Find is to slow for huge problem. 
 * Using same data structure but different interpretation where array represent set of tree
 * So each entry in the array contain reference to its parents in the tree.
 * Each entry in the array has, associated with it, root
 * 
 * 
 * @author David Sajdl
 *
 */

public class QuickUnion {
	
	private int[] id;
	
	/**
	 * constructor where array is created with length N
	 * and set id of each object to itself
	 * it represents array where each element has it own root
	 */
	public QuickUnion(int N){
		id = new int[N];
		for(int i = 0; i < N; i++){
			id[i] = i;
		}
	}
	/**
	 * it finding a root by chasing
	 *  parent pointers until reach the point where id[i] is equal to i
	 *  if not equal it move i up one level by the tree
	 *  or it chase parent pointers until reach the root.
	 * 
	 * @param i integer as component
	 * @return i integer that is the root of the component
	 */
	private int root(int i){
			while(i != id[i]){
				i = id[i];
			}
			return i;
		}
	
	/**
	 * check if p and q have the same root
	 * 
	 * @param p integer 
	 * @param q integer
	 * @return true if two components (integers) have the same root otherwise false
	 */
	public boolean connectedRoot(int p, int q){
		return root(p) == root(q);
	}
	
	/**
	 * is merging components containing p and q,
	 * to set id of p's root to the id of q,s root 
	 * 
	 * @param p integer  
	 * @param q integer
	 */
	public void unionRoot(int p, int q){
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
	
	/**
	 * it prints out array where elements are connected to parents root 
	 */
	public void printConnectionRoot(){
		for(int i = 0; i < id.length; i++){
			System.out.print(id[i] + ", ");
		}
		System.out.println();
			
	}
	/**
	 * main method create object of QuickFind that creates array on the length 10
	 * then 10 elements are connected to root parents and print out results
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		try{
			// create new object
			int length = 10;
			QuickUnion qu = new QuickUnion(length);
			qu.printConnectionRoot();
			System.out.println();
			// set p and q elements
			int p = 4;
			int q = 3;
			// check if they have same root
			if(!qu.connectedRoot(p,q)){
				// if not print union and call unionRooth method to connect element 3 as root to 4  
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				// if yes print out message
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 3;
			q = 8;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 6;
			q = 5;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 9;
			q = 4;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 2;
			q = 1;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 8;
			q = 9;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 5;
			q = 0;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 7;
			q = 2;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 6;
			q = 1;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
			p = 7;
			q = 3;
			if(!qu.connectedRoot(p,q)){
				System.out.println("union(" + p + "," + q + ")");
				qu.unionRoot(p, q);
				qu.printConnectionRoot();
			}
			else{
				System.out.println("The union("+p+","+q+") is already connected");
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
	}

}
