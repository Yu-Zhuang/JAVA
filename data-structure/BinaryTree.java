/*
題目：build a binary search tree
*/
class Tree{
	// data attribute
	int val;
	Tree left = null;
	Tree right = null;
	// constructor
	Tree(int value){
		this.val = value;
	}
	// method attribute
	void Add(int element){
		Tree tmp = this;
		while(tmp != null){
			if(element > tmp.val && tmp.right != null)
				tmp = tmp.right;
			else if(element < tmp.val && tmp.left != null)
				tmp = tmp.left;
			else if(element > tmp.val && tmp.right == null){
				tmp.right = new Tree(element);
				break;
			}
			else if(element < tmp.val && tmp.left == null){
				tmp.left = new Tree(element);
				break;
			}
			else if( element == tmp.val ){
				System.out.println("[ warning : element already exist ]");
				break;
			}
		}
	}
	void Preoder(Tree tree){
		if(tree != null){
			System.out.print("["+tree.val+"]-");
			Preoder(tree.left);
			Preoder(tree.right); 
		}
	}
	void Inoder(Tree tree){
		if(tree != null){
			Inoder(tree.left);
			System.out.print("["+tree.val+"]-");
			Inoder(tree.right); 
		}
	}
}

public class BinaryTree{
    public static void main(String[] args){
    	int nums[] = {6,3,2,7,4,5,1};
    	Tree root = new Tree(nums[0]);

    	for(int i=1;i<7;i++)
    		root.Add(nums[i]);

    	root.Inoder(root);
    	System.out.println("|END");
    }
}
