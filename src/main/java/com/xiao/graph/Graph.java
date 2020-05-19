package com.xiao.graph;


import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

    private ArrayList<String> vertexList;   // 存储顶点集合
    private int[][] edges;                  // 存储图对应的邻接矩阵
    private int numOfEdges;                 // 表示边的数量
    private int numOfVertex;                // 表示顶点的数目

    public Graph(int n){
        // 初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfVertex = n;
    }

    // 插入节点
    public void insertVertex(String vertex){
        vertexList.add(vertex);
        numOfVertex++;
    }


    // 添加边
    public void insertEdge(int v1, int v2, int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    // 返回节点的个数
    public int getNumOfVertex(){
        return numOfVertex;
    }
    // 返回边的个数
    public int getNumOfEdges(){
        return numOfEdges;
    }
    // 返回v1和v2的权值
    public int getWeight(int v1, int v2){
        return edges[v1][v2];
    }

    // 显示图对应的矩阵
    public void showGraph(){
        for (int[] edge : edges) {
            System.err.println(Arrays.toString(edge));
        }
    }


    public static void main(String[] args) {
        int n = 5;
        String vertexValue[] = {"A","B","C","D","E"};
        // 创建图对象
        Graph graph = new Graph(n);
        // 添加顶点
        for (String value:vertexValue){
            graph.insertVertex(value);
        }
        // 添加边
        graph.insertEdge(0, 1, 1);
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(1, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(1, 4, 1);

        graph.showGraph();

    }


}
