package D03_核心类库_03集合_数据结构_算法.数据结构.图;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    private ArrayList<String> vertexlist; // 存储顶点集合
    private int[][] edges; // 存储图对应的邻接矩阵
    private int numOfEdges;//表示边的数目

    public static void main(String[] args) {
        int n = 5;
        String Vertexs[] = {"A","B","C","D","E"};
        //创建 图 对象
        Graph graph = new Graph(n);
        //循环添加顶点
        for (String vertex : Vertexs){
            graph.insertVertex(vertex);
        }
        //添加边 A0 B1 C2 D3 E4
        //A-B A-C B-C B-D B-E
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.insertEdge(0,3,1);
        graph.insertEdge(1,2,1);
        graph.insertEdge(1,3,1);
        graph.insertEdge(1,4,1);

        //显示
        graph.showGraph();
        System.out.println(graph.getNumOfEdges());
        System.out.println(graph.getNumOfVertex());
        System.out.println(graph.getWeight(1,1));
        System.out.println(graph.getValueByIndex(3));



    }

    //构造器
    public Graph(int n){
        //初始化顶点集合 vertexlist 和 邻接矩阵 edges
        edges = new int[n][n];
        vertexlist = new ArrayList<String>(n);
        numOfEdges = 0;
    }
    //插入节点
    public void insertVertex(String vertex){
        vertexlist.add(vertex);
    }
    //添加边
    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }
    //其他图的常用方法
    //1 显示邻接矩阵
    public void showGraph(){
        for(int[] link : edges){
            System.out.println(Arrays.toString(link));
        }
    }

    //2 返回节点的个数
    public int getNumOfVertex(){
        return vertexlist.size();
    }
    //3 返回边的个数
    public int getNumOfEdges(){
        return numOfEdges;
    }

    //4 返回v1 v2 的权值
    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }
    //5 返回结点i(下标)对应的数据 0->"A" 1->"B" 2->"C"
    public String getValueByIndex(int i){
        return vertexlist.get(i);
    }

}
