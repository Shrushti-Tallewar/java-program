//Find the maximum height of the tree.
class Node_tree
{
	int data;
	Node_tree left ,right;
	Node_tree(int data)
	{
		this.data = data;
	}
}
public class Tree_01 
{
	public static void main(String[] args)
	{
      Node_tree root = new Node_tree(1);
      root.left = new Node_tree(2);
      root.right = new Node_tree(3);   
      root.left.left = new Node_tree(4);  
      root.left.left.right = new Node_tree(5);  
      root.right.left= new Node_tree(6); 
      root.right.right = new Node_tree(7);
      root.right.right.left=new Node_tree(8);
      root.right.right.left.left=new Node_tree(9);
      System.out.println("Height :"+height(root));
	}
	static int height(Node_tree root)
	{
		if(root == null)
		{
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return Math.max(leftHeight, rightHeight)+1;
	}
}

