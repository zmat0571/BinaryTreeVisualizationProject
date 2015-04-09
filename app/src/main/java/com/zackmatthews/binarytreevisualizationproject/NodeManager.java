package com.zackmatthews.binarytreevisualizationproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by c1bank on 4/9/15.
 */
public class NodeManager {


    private Node head;

    public List<Node> nodes = new ArrayList<Node>();

    public NodeManager(Node head){
        this.head = head;
    }

    public void populateTree(Node child, int depth){

        if(!nodes.contains(child)){
            nodes.add(child);
        }
        Random rand = new Random();

        if(head == null || child == null){return;}

        if(depth > 0){

            int leftVal = rand.nextInt(head.value - head.value /5) + 1;
            Node childLeft = new Node(leftVal, child.pos_x + Node.NODE_LEFT_X_OFFSET - (depth * 10), child.pos_y + Node.NODE_Y_OFFSET);
            childLeft.type = Node.NODE_TYPE_LEFT_CHILD;
            child.childLeft = childLeft;


            int rightVal = rand.nextInt(head.value * 3) + 1;
            Node childRight  = new Node(rightVal, child.pos_x + Node.NODE_RIGHT_X_OFFSET + (depth * 10), child.pos_y + Node.NODE_Y_OFFSET);
            childRight.type = Node.NODE_TYPE_RIGHT_CHILD;
            child.childRight = childRight;

            nodes.add(childRight);
            nodes.add(childLeft);

            if(depth > depth / 2){
                populateTree(childLeft, --depth);
            }



            populateTree(childRight, --depth);

        }



    }

}
