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
    public static List<Node> preorder(Node root){
        List<Node>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Stack<Node>st=new Stack<>();
        st.add(root);
        while(!st.isEmpty()){
            root=st.pop();
            l.add(root);
            if(root.right!=null){
                st.add(root.right);
            }
            if(root.left!=null){
                st.add(root.left);
            }
        }
        return l;
    }
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.right.left=new Node(4);
		root.right.right=new Node(5);
		List<Node>l=new ArrayList<>(preorder(root));
		System.out.print(l);
	}
}
