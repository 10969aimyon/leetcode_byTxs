package com.xiao.binaryTree;

public class BinaryTree {

    // 该树的
    BinaryTreeNode[] btn;
    // 该树的根节点
    BinaryTreeNode root;
    //
    int size;


    /**
     * 初始化二叉树，用一个整型数组填充
     * @param arrayNode
     */
    public BinaryTree(int[] arrayNode) {
        size = arrayNode.length;
        btn = new BinaryTreeNode[size];

        // 将arrayNode元素转化为节点
        for (int i = 0; i < size; i++){
            btn[i] = new BinaryTreeNode();
            btn[i].setBinaryNode(arrayNode[i]);
            if (i == 0){
                root = btn[i];  // 初始化根节点
            }
        }
        // 把二叉树的左右子树节点补全
        for (int j = 0; j <= (size - 2) / 2; j++){
            btn[j].setLeftNode(btn[2 * j + 1]);
            btn[j].setRightNode(btn[2 * j + 2]);
        }
    }

    // 用递归方法先序遍历
    void preOrder(BinaryTreeNode node){
        if (node != null){
            printNode(node);
            preOrder(node.leftNode);
            preOrder(node.rightNode);
        }

    }

    // 中序遍历
    void inOrder(BinaryTreeNode node){
        if (node != null){
            inOrder(node.leftNode);
            printNode(node);
            inOrder(node.rightNode);
        }
    }

    // 后序遍历
    void postOrder(BinaryTreeNode node){
        if (node != null){
            postOrder(node.leftNode);
            postOrder(node.rightNode);
            printNode(node);
        }
    }

    // 打印节点信息
    void printNode(BinaryTreeNode node){
        System.out.println(node.data);
    }


}
