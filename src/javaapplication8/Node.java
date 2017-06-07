/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

public class Node {

    public int height;
    public String name;
    public int value;
    public Node parent;
    public ArrayList<Node> childrenList = new ArrayList<>();
    public Node bestChild;

    

    public void addChild(Node child) {
        this.childrenList.add(child);
    }

    //root
    public Node(String name) {
        this.name = name;
    }

    //node
    public Node(String name, Node parent) {
        this.name = name;
        this.parent = parent;
        this.parent.addChild(this);
        value = 12345678;
    }

    //leaf
    public Node(String name, int value, Node parent) {
        this.name = name;
        this.value = value;
        this.parent = parent;
        this.parent.addChild(this);
    }
}
