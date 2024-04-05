import java.util.*;
public class Main
{
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.left=left;
            this.right=right;
            this.data=data;
        }
    }
    public static ArrayList<Integer> leftview(Node root){
        ArrayList<Integer>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(i==0){
                    l.add(curr.data);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return l;
    }
	public static void main(String[] args) {
		Node root=new Node(2);
		root.left=new Node(1);
		root.right=new Node(3);
		root.left.right=new Node(4);
		ArrayList<Integer>l=leftview(root);
		System.out.print(l);
	}
}
