
package javaapplication8;

public class Tree {

    public Node root;
    public int maxHeight;

    public Tree(Node root) {
        this.root = root;
    }

    public Tree() {
    }

    public void setHeights(Node root, int height) {
        root.height=height;
        if (!root.childrenList.isEmpty()) {
            for (Node child : root.childrenList) {
                setHeights(child, height + 1);
            }
        }
    }

    public void setMaxHeight(Node root, int height) {
        if (!root.childrenList.isEmpty()) {
            for (Node child : root.childrenList) {
                setMaxHeight(child, height + 1);
            }
        } else {
            this.maxHeight = root.height;
        }
    }
    
}
