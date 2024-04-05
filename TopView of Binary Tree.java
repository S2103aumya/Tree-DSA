import java.util.*;
public class Main
{
    class Pair{
    int hd;
    Node node;
    Pair(Node node,int hd){
        this.hd=hd;
        this.node=node;
    }
    static ArrayList<Integer> topView(Node root)
    {
       ArrayList<Integer>l=new ArrayList<>();
       if(root==null){
           return l;
       }
       Map<Integer,Integer>mp=new TreeMap<>();
       Queue<Node>q=new LinkedList<>();
       q.add(root);
       Map<Node,Integer>hm=new HashMap<>();
       hm.put(root,0);
       while(!q.isEmpty()){
           Node curr=q.poll();
           int hd=hm.get(curr);
           if(!mp.containsKey(hd)){
               mp.put(hd,curr.data);
           }
           if(curr.left!=null){
               q.add(curr.left);
               hm.put(curr.left,hd-1);
           }
           if(curr.right!=null){
               q.add(curr.right);
               hm.put(curr.right,hd+1);
           }
       }
       for(int m:mp.values()){
           l.add(m);
       }
       return l;
    }

	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
