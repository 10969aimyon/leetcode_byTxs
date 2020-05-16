package com.xiao.binaryTree2;

public class BinaryTree {
    public Node root;
    public int size;


    public BinaryTree(Node root) {
        this.root = root;
    }

    /**
     * 前序插入
     * @param temp
     * @param num
     */
    public void addPre(Node temp, int num){
        Node addNode = new Node();
        addNode.data = num;
        if (num == 0){
            addNode = null;
        }

        if (temp == null){
            temp = addNode;
            return;
        }
        addPre(temp.leftNode, num);
        addPre(temp.rightNode, num);
    }


    /**
     * 前序输出
     */
    public void preOrder(Node temp){
        if (temp != null){
            System.out.println(temp.data);
            preOrder(temp.leftNode);
            preOrder(temp.rightNode);
        }
    }

}
