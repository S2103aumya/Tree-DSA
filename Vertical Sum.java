import java.util.*;
public class Main
{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static ArrayList <Integer> verticalSum(Node root) {
        ArrayList<Integer>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<Node>q=new LinkedList<>();
        Map<Integer,List<Integer>>mp=new TreeMap<>();
        Queue<Integer>columnmp=new LinkedList<>();
        columnmp.add(0);
        q.add(root);
        while(q.size()>0){
            Node curr=q.poll();
            int hd=columnmp.poll();
            if(!mp.containsKey(hd)){
                mp.put(hd,new ArrayList<>());
            }
            mp.get(hd).add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
                columnmp.add(hd-1);
            }
            if(curr.right!=null){
                q.add(curr.right);
                columnmp.add(hd+1);
            }
        }
        for(int m:mp.keySet()){
            int sum=0;
            List<Integer>temp=mp.get(m);
            for(int no:temp){
                sum+=no;
            }
            l.add(sum);
        }
        return l;
    }
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		ArrayList<Integer>l=verticalSum(root);
		System.out.print(l);
	}
}
