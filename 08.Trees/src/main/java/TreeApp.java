public class TreeApp {
    public static void main(String[] args) {

        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("PRE Order");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("IN Order");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("POST Order");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Level Order");
        tree.levelOrderTraversal();

        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println("Number of leaves:  " +tree.countLeaves(tree.root));
        System.out.println("Sum of Leaf Nodes: " + tree.findSumOfLeaves(tree.root));
        System.out.println(tree.height(tree.root));

        System.out.println("Sum of Node Depth "+tree.calculateNodeDepthSums());
        System.out.println("Sum of Node "+tree.calculateNodeSums());

    }
}
