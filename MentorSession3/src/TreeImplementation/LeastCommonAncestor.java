package TreeImplementation;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonAncestor {
	Node root;

	private List<Integer> path1 = new ArrayList<Integer>();
	private List<Integer> path2 = new ArrayList<Integer>();

	public int findLCA(int n1, int n2) {
		path1.clear();
		path2.clear();
		return LCAInternal(root, n1, n2);
	}

	private int LCAInternal(Node node, int n1, int n2) {

		if (!findPath(node, n1, path1) || !findPath(node, n2, path2)) {
			System.out.println(path1.size() > 0 ? "node1 is present" : "node1 is missing");
			System.out.println(path2.size() > 0 ? "node2 is present" : "node2 is missing");
			return -1;
		}

		int i = 0;
		for (i = 0; i < path1.size() && i < path2.size(); i++) {
			if (!path1.get(i).equals(path2.get(i)))
				break;
		}

		return path1.get(i - 1);
	}

	private boolean findPath(Node root, int n, List<Integer> path) {
		if (root == null)
			return false;

		path.add(root.data);

		if (root.data == n)
			return true;
		if (root.left != null && findPath(root.left, n, path))
			return true;
		if (root.right != null && findPath(root.right, n, path))
			return true;

		path.remove(path.size() - 1);
		return false;

	}
}