package D03_核心类库_03集合_数据结构_算法.数据结构.图;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph3 {
    private ArrayList<String> vertexlist; // 存储顶点集合
    private int[][] edges; // 存储图对应的邻接矩阵
    private int numOfEdges;//表示边的数目
    //定义给数组boolean[], 记录某个结点是否被访问
    private boolean[] isVisited;



    public static void main(String[] args) {
        int n = 8;
//        String Vertexs[] = {"A","B","C","D","E"};
        String Vertexs[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
        //创建 图 对象
        Graph3 graph = new Graph3(n);
        //循环添加顶点
        for (String vertex : Vertexs){
            graph.insertVertex(vertex);
        }
        //更新边的关系
        graph.insertEdge(0, 1, 1);
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(1, 4, 1);
        graph.insertEdge(3, 7, 1);
        graph.insertEdge(4, 7, 1);
        graph.insertEdge(2, 5, 1);
        graph.insertEdge(2, 6, 1);
        graph.insertEdge(5, 6, 1);



        //显示
        graph.showGraph();
//        System.out.println(graph.getNumOfEdges());
//        System.out.println(graph.getNumOfVertex());
//        System.out.println(graph.getWeight(1,1));
//        System.out.println(graph.getValueByIndex(3));

        //测试一把，我们的dfs遍历是否ok
        System.out.println("深度遍历");
        graph.dfs(); // A->B->C->D->E

        System.out.println();
        System.out.println("广度优先!");
        graph.bfs(); // A->B->C->D-E


    }

    //构造器
    public Graph3(int n){
        //初始化顶点集合 vertexlist 和 邻接矩阵 edges
        edges = new int[n][n];
        vertexlist = new ArrayList<String>(n);
        numOfEdges = 0;
        isVisited = new boolean[5];
    }

    //得到第一个邻接结点的下标 w
    public int getFirstNeighbor(int index){
        for (int j = 0; j<vertexlist.size();j++){
            if (edges[index][j] == 1){
                return j;
            }
        }
        return -1;
    }

    //根据前一个邻接结点的下标来获取下一个邻接结点
    public int getNextNeighor(int v1,int v2 ){
        for(int j = v2+1;j<vertexlist.size();j++){
            if (edges[v1][j] == 1){
                return j;
            }
        }
        return -1;
    }

    //深度优先遍历算法
    //i 第一次就是 0
    private void dfs(boolean[] isVisited,int i){
        //首先我们访问该结点,输出
        System.out.print(getValueByIndex(i)+"->");
        //将结点设置为已经访问
        isVisited[i]=true;
        //查找结点i的第一个邻接结点w
        int w = getFirstNeighbor(i);
        while (w != -1){ //说明有
            if (!isVisited[w]){
                dfs(isVisited,w);
            }
            //如果 w 结点已经被访问过
            w= getNextNeighor(i,w);
        }

    }

    //对dfs 进行一个重载, 遍历我们所有的结点，并进行 dfs
    public void dfs(){
        isVisited = new boolean[vertexlist.size()];
        //遍历所有的结点，进行dfs[回溯]
        for (int i = 0;i < getNumOfVertex();i++){
            if(!isVisited[i]){
                dfs(isVisited,i);
            }
        }
    }

    //对一个结点进行广度优先遍历的方法
    private void bfs(boolean[] isVisited ,int i){
        int u; // 表示队列的头结点对应下标
        int w;  // 邻接结点w
        //队列，记录结点访问的顺序
        LinkedList queue = new LinkedList();
        //访问结点，输出结点信息
        System.out.print(getValueByIndex(i) + "=>");
        //标记为已访问
        isVisited[i] = true;
        //将结点加入队列
        queue.addLast(i);

        while (!queue.isEmpty()){
            //取出队列的头结点下标
            u = (Integer)queue.removeFirst();
            //得到第一个邻接结点的下标 w
            w = getFirstNeighbor(u);
            while (w!=-1){ //找到
                // 是否访问过
                if (!isVisited[w]){
                    System.out.print(getValueByIndex(w) + "=>");
                    // 标记已经访问
                    isVisited[w] = true;
                    // 入队
                    queue.addLast(w);

                }
                //以u为前驱点，找w后面的下一个邻结点
                w = getNextNeighor(u,w); //体现出我们的广度优先
            }
        }
    }

    //遍历所有的结点，都进行广度优先搜索
    public void bfs(){
        isVisited = new boolean[vertexlist.size()];
        for (int i = 0;i<getNumOfVertex();i++){
            if (!isVisited[i]){
                bfs(isVisited,i);
            }
        }
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
    //显示邻接矩阵
    public void showGraph(){
        for(int[] link : edges){
            System.out.println(Arrays.toString(link));
        }
    }

    //返回节点的个数
    public int getNumOfVertex(){
        return vertexlist.size();
    }
    //返回边的个数
    public int getNumOfEdges(){
        return numOfEdges;
    }

    //返回v1 v2 的权值
    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }
    //返回结点i(下标)对应的数据 0->"A" 1->"B" 2->"C"
    public String getValueByIndex(int i){
        return vertexlist.get(i);
    }

}
