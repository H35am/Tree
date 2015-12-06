
public class Tree {

	Node root;


	private class Node {
		int key;
		String name;
		Node leftChild;
		Node rightChild;

		Node (int key, String name){
			this.key = key;
			this.name = name;
		}

	}


	//---------------------------
	// Constructors
	public Tree(){

	}
	//--------------------------
	//Data structure operations
	/**
	 * Voeg een element toe aan de tree
	 */
	public void insert(Student s){
		Node newNode = new Node(s.studentnummer, s.name);

		if (root == null){

			root = newNode;

		} else {

			Node focusNode = root;
			Node parent;

			while(true){

				parent = focusNode;

				if (newNode.key < focusNode.key){

					focusNode = focusNode.leftChild;

					if (focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				}else
				{
					focusNode = focusNode.rightChild;
					if (focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}



	/**
	 * Verwijder een object uit de boom
	 */
	public void remove(Student n){
		
	}
	
	
	/**
	 * Zoek een studentnummer in de boom en return 
	 * het oject
	 */
	public Student find(Student n){
		Node focusNode = root;

		while(focusNode.key != n.studentnummer)
		{
			if(n.studentnummer < focusNode.key)
				focusNode = focusNode.leftChild;
			else
				focusNode = focusNode.rightChild;

			if(focusNode == null)
				return null;
		}

		return new Student(focusNode.key,focusNode.name);
	}
	
	public boolean isBalanced(){
		return false;//dummy
	}
	
	public void balance(){
		
	}
	
	
	//------------------------------------------------------
	// Utility methods
	/**
	 * Print de tree In-Order
	 */
	public String toString(){
		return "";
	}	
}
