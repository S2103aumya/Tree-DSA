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
    static List<Integer> largestvalue(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer>l=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                ans=Math.max(ans,curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                } 
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            l.add(ans);
        }
        return l;
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
        
        System.out.print(largestvalue(root));
    }
}

