package sample;

import java.util.Stack;

public class BT {

	Node n= new Node();
	 public BT(int data) {
		 n.data=data;
	}
	 
	 Node addLeftNode(int data,Node targetNode){
		 Node n= new Node();
		 n.data= data;
		 targetNode.left_node=n;
		 return targetNode.left_node;
	 }
	 
	 Node addRightNode(int data,Node targetNode){
		 Node n= new Node();
		 n.data= data;
		 targetNode.right_node=n;
		 return targetNode.right_node;
	 }
	 
	 Node getRootNode(){
		 return this.n;
	 }
	 
	 public static void main(String[] args) {
		 BT bt= new BT(7);
		 Node rootLeft=bt.addLeftNode(5, bt.getRootNode());
		 Node rootRight=bt.addRightNode(8, bt.getRootNode());
		 
		 bt.addLeftNode(3,rootLeft);
		 bt.addRightNode(4,rootLeft);
		 
		 bt.addLeftNode(6,rootRight);
		 bt.addRightNode(9,rootRight);
		 
		//bt.inOrder(bt.getRootNode());
		System.out.println(bt.sizeOfTree(bt.getRootNode()));
		// bt.postOrder(bt.getRootNode());
		 
	}
	 
	 int sizeOfTree(Node root){
		 if(root==null){
			 return 0;
		 }
		 else	
			 return 1+ sizeOfTree(root.left_node)+sizeOfTree(root.right_node); 
	 }
	 
	  void inOrder(Node node){
		  
		  Stack<Node> stack= new Stack<Node>();
		  while(node!=null){
			  stack.push(node);
			  node=node.left_node;
		  }
		  
		  while(stack.size()>0){
			  node=stack.pop();
			  System.out.println(node.data);
			  if(node.right_node!=null){
				  node=node.right_node;
				  while(node!=null){
					  stack.push(node);
					  node=node.left_node;
				  }
			  }
		  }
		  
	  }
	  
	  void postOrder(Node root){
		  if(root==null)
			  return;
		  postOrder(root.left_node);
		  postOrder(root.right_node);
		  System.out.println(root.data);
	  }
}
