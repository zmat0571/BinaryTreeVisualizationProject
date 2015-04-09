package com.zackmatthews.binarytreevisualizationproject;

/**
 * Created by c1bank on 4/9/15.
 */
public class Node {

    public float radius = 50;
    public int value;


    public Node childLeft;
    public Node childRight;

    public float pos_x, pos_y;


    public static int NODE_LEFT_X_OFFSET = -120;
    public static int NODE_RIGHT_X_OFFSET = 120;

    public static int NODE_Y_OFFSET = 80;

    public static String NODE_TYPE_LEFT_CHILD = "left";
    public static String NODE_TYPE_RIGHT_CHILD = "right";


    public String type;


    public Node(int value, float posx, float posy){
        this.value = value;
        this.pos_x = posx;
        this.pos_y = posy;
    }

}
