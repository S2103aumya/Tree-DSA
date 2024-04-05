import java.util.*;
public class Main
{
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
            this.left=left;
            this.right=right;
        }
        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }
    public static List<Node> postorder(Node root){
        List<Node>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        l.addAll(postorder(root.left));
        l.addAll(postorder(root.right));
        l.add(root);
        return l;
    }
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.right.left=new Node(4);
		root.right.right=new Node(5);
		List<Node>l=new ArrayList<>(postorder(root));
		System.out.print(l);
	}
}
