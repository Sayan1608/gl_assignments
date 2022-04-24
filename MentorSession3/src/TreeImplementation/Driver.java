package TreeImplementation;

public class Driver {

	public static void main(String[] args) {
		LeastCommonAncestor tree = new LeastCommonAncestor();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		
		System.out.println("Least Common Ancestor (20,30) : "+tree.findLCA(20,30));
		System.out.println("Least Common Ancestor(40, 30): " + tree.findLCA(40,30));
		System.out.println("Least Common Ancestor(60, 70): " + tree.findLCA(60,70));
		System.out.println("Least Common Ancestor(20, 40): " + tree.findLCA(20,40));
		System.out.println("Least Common Ancestor(20, 90): " + tree.findLCA(20,90));
	}

}
