import java.util.*;
public class Main
{
    static class Node{
        Node left;
        Node right;
        int val;
        Node(int val){
            this.left=left;
            this.right=right;
            this.val=val;
        }
    }
    public static  boolean isSymmetric(Node root) {
        if(root==null){
            return true;
        }
        boolean p=issym(root.left,root.right);
        if(p) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean issym(Node p,Node q){
        if(p==null && q==null ){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return p.val==q.val && issym(p.left,q.right) && issym(p.right,q.left);
    }

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(2);
		root.left.right=new Node(4);
		System.out.print(isSymmetric(root));
	}
}
