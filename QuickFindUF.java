package algorithms;
import java.util.LinkedHashSet;
import java.util.Set;

public class QuickFindUF {

	private int[] id;
	private int[] idRoot;
	
	public QuickFindUF( int N){
		this.id = new int[N];
		this.idRoot = new int[N];
		
		for(int i = 0; i < N; i ++){
			id[i] = i;
			idRoot[i] = i;
		}
	}
	
	public boolean connected(int p, int q){
		return id[p] == id[q];
	}
	
	public boolean connectedRoot(int p, int q){
		return root(p) == root(q);
	}
	
	private int root(int i){
		while(i != idRoot[i]){
			i = idRoot[i];
		}
		return i;
	}
	
	public void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		
		for(int i = 0; i<id.length; i++){
			if(id[i] == pid){
				id[i]= qid;
			}
		}
	}
	
	public void unionRoot(int p, int q){
		int i = root(p);
		int j = root(q);
		idRoot[i] = j;
	}
	
	public void printConnectedComponents(){
		for(int i = 0; i < id.length; i++){
			System.out.print(id[i] + " ");
		}
		System.out.println();
	}
	
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
	
	public void printConnectedComponentsRoot(){
		for(int i = 0; i < idRoot.length; i++){
			System.out.print(idRoot[i] + " ");
		}
	}
}
