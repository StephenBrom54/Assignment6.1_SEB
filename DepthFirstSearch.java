/**
 * DepthFirstSearch class to perform a depth-first search on a tree.
 */
public class DepthFirstSearch {
    Node root;
    int nodesTraversed = 0;

    /**
     * Constructor for DepthFirstSearch class.
     */
    public DepthFirstSearch() {
        System.out.println("Call DFS with root node to do a Depth First Search.");
    }

    /**
     * Recursive method to traverse the tree in depth-first preorder manner.
     * @param node The current node being traversed.
     * @return The height of the tree.
     */
    public int DFS(Node node) {
        if (node == null) {
            return 0;
        }

        // Print the value of the node
        System.out.println(node.getData());
        nodesTraversed++;

        // Recursively call DFS on the left and right children
        int leftHeight = DFS(node.getlChild());
        int rightHeight = DFS(node.getrChild());

        // Return the height of the tree
        return 1 + Math.max(leftHeight, rightHeight);
    }

    /**
     * Method to start the depth-first search.
     */
    public void startDFS() {
        int treeHeight = DFS(root);
        System.out.println("Number of nodes traversed: " + nodesTraversed);
        System.out.println("Height of the tree: " + treeHeight);
    }
}