
package javaapplication8;

/**
 *
 * @author Dimitris
 */
public class MinmaxAlphaBeta {

    public static void main(String[] args) {
        
        //minimax
        treeGenerator treeGen = new treeGenerator();
        Tree tree = new Tree(treeGen.initializeTree());
        tree.setHeights(tree.root, 0);
        tree.setMaxHeight(tree.root, 0);
        Algos a = new Algos();
        a.min_max(tree.root,true);
        System.out.print("With the minmax algo, max player will start with the move ");
        a.printMinMax(tree.root);
        System.out.print("\n");
        ///telos minimax
        
        
        
        
        
        
        //alpa-beta
//        treeGenerator treeGen2 = new treeGenerator();
//        Tree tree2 = new Tree(treeGen2.initializeTree());
//        tree2.setHeights(tree2.root, 0);
//        tree2.setMaxHeight(tree2.root, 0);
//        Algos helper2 = new Algos();
//        helper2.AlphaBeta(tree2.root, 0, 99, true);
//        System.out.print("With the alpha-beta algo, max player will start with the move ");
//        helper2.printAlpaBeta(tree2.root);
    }

}
