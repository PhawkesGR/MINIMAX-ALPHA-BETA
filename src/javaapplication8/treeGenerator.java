
package javaapplication8;

/**
 *
 * @author Dimitris
 */
public class treeGenerator {

    public Node initializeTree() {
        Node N1 = new Node("N1");
        Node N2 = new Node("N2", N1);
        Node N3 = new Node("N3", N1);
        Node N4 = new Node("N4", N2);
        Node N5 = new Node("N5", N2);
        Node N6 = new Node("N6", N2);
        Node N7 = new Node("N7", N3);
        Node N8 = new Node("N8", N3);
        Node N9 = new Node("N9", N3);
        Node N10 = new Node("N10", 1, N4);
        Node N11 = new Node("N11", 8, N4);
        Node N12 = new Node("N12", 5, N5);
        Node N13 = new Node("N13", 6, N6);
        Node N14 = new Node("N14", 4, N6);
        Node N15 = new Node("N15", 7, N6);
        Node N16 = new Node("N16", 9, N7);
        Node N17 = new Node("N17", 3, N8);
        Node N18 = new Node("N18", 2, N8);
        Node N19 = new Node("N19", 6, N9);
        Node N20 = new Node("N20", 10, N9);
        Node N21 = new Node("N21", 2, N9);
        return N1;
    }
}
