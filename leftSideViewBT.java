// } Driver Code Ends


//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      
      ArrayList<Integer> ans = new ArrayList<Integer>();
      lview(root, ans, 0);
      return ans;
    }
    
    public void lview(Node nod, List<Integer> res, int lvl){
        if(nod == null){
            return;
        }
        
        if(lvl == res.size()){
            res.add(nod.data);
        }
        
        lview(nod.left, res, lvl+1);
        lview(nod.right, res, lvl+1);
    }
}