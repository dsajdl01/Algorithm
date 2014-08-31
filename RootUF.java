package algorithms;

public class RootUF {
	private int[] id;
	private int[] iz;
	
	public RootUF(int N){
		id = new int[N];
		iz = new int[N];
		for(int i = 0; i < N; i++){
			id[i] = i;
			iz[i] = i;
		}
	}
	
	private int root(int i){
		while(i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	public boolean connectedRoot(int p, int q){
		return root(p) == root(q);
	}
	
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		if(i == j){
			return;
		}
		if(iz[i] < iz[j]){
			id[i] = j;
			iz[j] += iz[i];
		}
		else{
			id[j] = i;
			iz[i] = iz[j];
		}
	}
	
	public void printConnectedComponent(){
		for(int i = 0; i < id.length; i++){
			System.out.print(id[i] + ", ");
		}
		System.out.println();
	}
	public void printIzArray(){
		for(int i = 0; i < iz.length;i++){
			System.out.print(iz[i] + ", ");
		}
		System.out.println();
	}
}
