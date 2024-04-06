package oops;
import java.util.*;

import org.w3c.dom.Node;
public class prims_algorithm {
	/*public int vertices=5;
	int minimum_key(int k[], int mst[])    
	{  
	    int minimum  = Integer.MAX_VALUE, min,i;    
	    for (i = 0; i < vertices; i++)  
	        if (mst[i] == 0 && k[i] < minimum )   
	            minimum = k[i]; min = i;    
	    return min;    
	}    
	*/
	int wieght;
	string s;
	string t;
	ArrayList<Integer>a_wieght=new ArrayList;
	ArrayList<Node>a_t=new ArrayList;
	void add(Node i,int j) {
		a_t.add(i);
		a_weight(j);
		
	}
	void display() {
		System.out.println("Adjency wieght"+a_weight);
		System.out.println("Adjency destination(t)"+a_t.add);
	}
	 private static void primMST(int[][] graph) {
	        int[] parent = new int[V];
	        int[] key = new int[V];
	        boolean[] mstSet = new boolean[V];

	        for (int count = 0; count < V - 1; count++) {
	            int u = -1;
	            for (int i = 0; i < V; i++) {
	                if (!mstSet[i] && (u == -1 || key[i] < key[u])) {
	                    u = i;
	                }
	            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node a=new Node();
Node b=new Node();
Node c=new Node();
Node e=new Node();
a.add(4);
b.add(3);
c.add(1);
e.add(2);

	}

}
