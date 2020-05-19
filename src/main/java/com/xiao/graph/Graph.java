package com.xiao.graph;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private ArrayList<String> vertexList;   // 存储顶点集合
    private int[][] edges;                  // 存储图对应的邻接矩阵
    private int numOfEdges;                 // 表示边的数量
    private int numOfVertex;                // 表示顶点的数目
    private boolean[] visited;              // 记录顶点访问情况

    public Graph(int n){
        // 初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfVertex = n;
        visited = new boolean[n];
    }

    // 插入节点
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    // 添加边
    public void insertEdge(int v1, int v2, int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }


    // 得到第一个邻接节点的下标w
    public int getFirstNeighbor(int v){
        for (int j = 0; j < getNumOfVertex(); j++) {
            if (edges[v][j] >0){
                return j;
            }
        }
        return -1;
    }

    // 根据前一个邻接节点的下标获取下一个邻接节点的下标
    public int getNextNeighbor(int v1, int v2){
        for (int j = v2 + 1; j < getNumOfVertex(); j++) {
            if (edges[v1][v2] > 0){
                return j;
            }
        }
        return -1;
    }

    // 深度优先遍历
    private void dfs(int i){
        // 首先我们访问该顶点
        System.out.print(vertexList.get(i) +"->");
        // 将该顶点设置为已访问
        visited[i] = true;
        // 查找i节点的第一个邻接节点w
        int w = getFirstNeighbor(i);
        while (w != -1){
            // 如果该节点没有被访问过
            if(!visited[w]){
                dfs(w);
            }
            w = getNextNeighbor(i, w);
        }
    }

    // 对DFS进行重载，遍历所有顶点
    public void dfs(){
        // 遍历所有节点，进行dfs
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!visited[i]){
                dfs(i);
            }
        }
    }

    // 对一个节点进行广度优先遍历的方法
    private void bfs(int i){
        int u;  // 表示队列的头结点对应的下标
        int w;  // 表示队列的邻接节点的下标
        LinkedList<Integer> queue = new LinkedList<>(); // 记录顶点访问顺序
        // 访问节点
        System.out.print(vertexList.get(i) +"->");
        // 标记为已访问
        visited[i] = true;
        // 将顶点加入队列
        queue.addLast(i);

        // 当队列非空时
        while (!queue.isEmpty()){
            // 取出队列头顶点
            u = queue.removeFirst();
            // 得到第一个邻接节点的下标w
            w = getFirstNeighbor(u);

            while (w != -1){    // 存在
                if (!visited[w]){
                    System.out.print(vertexList.get(w) +"->");
                    visited[w] = true;
                    queue.addLast(w);
                }
                w = getNextNeighbor(u, w);
            }

        }

    }

    // 遍历所有顶点进行bfs
    public void bfs(){
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!visited[i]){
                bfs(i);
            }
        }
    }

    // 返回顶点的个数
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

//        // 测试dfs
//        System.out.println("DFS-----------------");
//        graph.dfs();

        // 测试bfs
        System.out.println();
        System.out.println("BFS-----------------");
        graph.bfs();
    }


}
