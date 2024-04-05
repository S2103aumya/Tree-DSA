import java.util.*;
public class Main{
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    static int deepestleavessum(Node root){
        if(root==null){
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                } 
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans=sum;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        System.out.print(deepestleavessum(root));
    }
}

