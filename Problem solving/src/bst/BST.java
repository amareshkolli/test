package bst;

public class BST {

	public static void main(String[] args) {

		Node node = new Node(4);
		insert(node, 2);
		insert(node, 3);
		insert(node, 1);
		insert(node, 7);
		insert(node, 6);
		preOrder(node);
		
	}
	
	public static Node insert(Node root,int data) {
		System.err.println("insert : "+root.data+" data: "+data);
        if(root.data > data) {
        	System.err.println("in if ");
            if(root.left == null){
            	System.err.println("in 2 if");
                Node node = new Node(data);
                root.left = node;
                System.err.println("end of 2 if, returning root");
                return root;
            }
            System.err.println("out of 2 if");
            root.left = insert(root.left, data);
            System.err.println("end of 1 if");
        } else if(root.data < data) {
        	System.err.println("in else");
             if(root.right == null){
            	 System.err.println("in else , if");
                Node node = new Node(data);
                root.right = node;
                System.err.println("out of else ,if, returning root");
                return root;
            }
            root.right = insert(root.right, data);
            System.err.println("end of else ");
        }
        System.err.println("return root");
    	return root;
    }
	
	public static void preOrder( Node root ) {
	      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }


	static class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

}
