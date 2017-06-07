package javaapplication8;

/**
 *
 * @author Dimitris
 */
public class Algos {

    public int min_max(Node root, boolean max) {
        if (root.childrenList.isEmpty()) {
            return root.value;
        }

        if (max) {
            int max_value = 0;
            for (Node child : root.childrenList) {
                int value = min_max(child, !max);
                if (value > max_value) {
                    max_value = value;
                    root.bestChild = child;
                }
            }
            //System.out.print("max timh "+max_value);
            return max_value;
        } else {
            int min_value = 99999;
            for (Node child : root.childrenList) {
                int value = min_max(child, !max);
                if (value < min_value) {
                    min_value = value;
                    root.bestChild = child;
                }
            }
            //System.out.print("min timh "+min_value);
            return min_value;
        }
    }

    //alpha-beta algo
    public int AlphaBeta(Node root, int alpha, int beta, boolean max) {
        //leaf
        if (root.childrenList.isEmpty()) {
            return root.value;
        }

        if (max) {
            int value = 0;
            for (Node child : root.childrenList) {
                value = Math.max(value, AlphaBeta(child, alpha, beta, !max));
                if (value > alpha) {
                    root.bestChild = child;
                    alpha = value;
                }
                if (beta <= alpha) {
                    break;
                }
            }
            return value;
        } else {
            int value = 99;
            for (Node child : root.childrenList) {
                value = Math.min(value, AlphaBeta(child, alpha, beta, !max));
                if (value < beta) {
                    root.bestChild = child;
                    beta = value;
                }
                if (beta <= alpha) {
                    break;
                }
            }
            return value;
        }
    }

    //print result for minmax
    //prints the move max player will start
    //without "if (root.height == 1)" it prints the path
    public void printMinMax(Node root) {
        if (root.bestChild != null) {
            if (root.height == 1) {
                System.out.print(root.name + "\t");
            }
            printMinMax(root.bestChild);

        } else {
            if (root.height == 1) {
                System.out.print(root.name+ "\t");
            }
        }
    }

    //print result for alpha-beta
    //prints the move, max player will start with
    //without "if (root.height == 1)" it prints the path
    public void printAlpaBeta(Node root) {
        if (root.bestChild != null) {
            if (root.height == 1) {
                System.out.print(root.name + "\t");

            }
            printAlpaBeta(root.bestChild);
        } else {
            if (root.height == 1) {
                System.out.print(root.name + "\t");
            }
        }
    }

}
