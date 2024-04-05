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
    static List<List<Integer>> Levelorder(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        List<List<Integer>>lst=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                l.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            lst.add(l);
        }
        Collections.reverse(lst);
        return lst;
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
        
        List<List<Integer>>mainlst=Levelorder(root);
        System.out.print(mainlst);
    }
}
