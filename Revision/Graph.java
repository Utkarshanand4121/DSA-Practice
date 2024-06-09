import java.util.*;

public class Graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        // int V = 5;
        // ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 - vertices
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 1));
        // 1-vertices
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 3));

        // 2-vertices
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 4));

        // 3-vertices
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4-vertices
        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 2));

        // 5-vertices
        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 4, 2));
        graph[5].add(new Edge(5, 6, 2));

        // 6-vertices
        graph[6].add(new Edge(6, 5, 1));

        // 2's neighour
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i); // src, dest, wt
            System.out.println(e.dest);
        }
    }

    public static void bfs(ArrayList<Edge> graph[]) { // O(V + E)
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

        q.add(0); // source = 0;

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) { // O(V + E)
        // visit

        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    // Has Path
    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]) {
        if (src == dest) {
            return true;
        }

        vis[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            // e.dest == neighbour
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    // Connected Component
    // by bfs

    public static void bfs1(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph[i].size(); i++) {
            if (!vis[i]) {
                bfsUtil(graph, vis);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> graph[], boolean vis[]) { // O(V + E)
        Queue<Integer> q = new LinkedList<>();

        q.add(0); // source = 0;

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // by dfs
    public static void dfs1(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph[i].size(); i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]) { // O(V + E)
        // visit

        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    // Cycle Detection

    // Undirected graph
    // O(V + E)
    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                    // cycle exists here in one of the parts
                }
            }

        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // case 3
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            // case 1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }

            // case 2 -- do nothing
        }
        return false;
    }

    // Bipartite graph
    public static boolean isBipartite(ArrayList<Edge> graph[]) { // O(V + E)
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1; // no color
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                // BFS
                q.add(i);
                col[i] = 0; // Yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false; // NOT Bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    // Cycle in Directed Graph
    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest] == true) { // cycle
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    // Topological Sorting

    public static void topSort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, s); // modified dfs
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    // Topological Sort -- Khan's algorithm
    public static void calIndegree(ArrayList<Edge>[] graph, int indegre[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indegre[e.dest]++;
            }
        }
    }

    public static void topSort2(ArrayList<Edge> graph[]) {
        int inde[] = new int[graph.length];
        calIndegree(graph, inde);

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inde.length; i++) {
            if (inde[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " "); // Topological sorting

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inde[e.dest]--;
                if (inde[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }

    }

    // All path from src to dest
    // T.C : exponential
    public static void printallpath(ArrayList<Edge> graph[], int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printallpath(graph, e.dest, dest, path + src);
        }
    }

    // Dijkstra's Algorithm
    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int dis[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dis[u] + wt < dis[v]) { // update distance of src to v
                        dis[v] = dis[u] + wt;
                        pq.add(new Pair(v, dis[v]));
                    }
                }
            }
        }

        // print all path from src to dest
        for (int i = 0; i < dis.length; i++) {
            System.out.print(dis[i] + " ");
        }
        System.out.println();
    }

    // Bellman Ford Algo
    public static void bellman(ArrayList<Edge> graph[], int src) { // O(VE)
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        int V = graph.length;

        for (int i = 0; i < V - 1; i++) {
            // Edge -- O(E)
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    // u,v,wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    // relaxation
                    if ((dist[u] != Integer.MAX_VALUE) && (dist[u] + wt < dist[v])) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        // Print
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    // Prims Algo
    static class Pair2 implements Comparable<Pair2> {
        int v;
        int cost;

        public Pair2(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair2 p2) {
            return this.cost - p2.cost; // ascending
        }
    }

    public static void prims(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        pq.add(new Pair2(0, 0));

        int finalCost = 0;
        while (!pq.isEmpty()) {
            Pair2 curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;

                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair2(e.dest, e.wt));
                }
            }
        }
        System.out.print("Min cost is : " + finalCost);
    }

    // Cheapest Flight with k stops
    public static void createGraph2(int flight[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int costs;
        int stops;

        public Info(int v, int c, int s) {
            this.v = v;
            this.costs = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n, int flight[][], int src, int dest, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph2(flight, graph);

        int dist[] = new int[n];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops > k) {
                break;
            }

            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (curr.costs + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.costs + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        // dist[dest]
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }

    // Connecting cities
    public static int connectCities(int cities[][]) {
        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];

        pq.add(new Pair2(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair2 curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;

                for (int i = 0; i < cities[curr.v].length; i++) {
                    if (cities[curr.v][i] != 0) {
                        pq.add(new Pair2(i, cities[curr.v][i]));
                    }
                }
            }
        }

        return finalCost;
    }

    // Disjoint Set
    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }

        return find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    // Krusskal's Algo
    static class Edge2 implements Comparable<Edge2>{
        int src;
        int dest;
        int wt;

        public Edge2(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge2 e2) {
            return this.wt - e2.wt;
        }
    }

    static void createGraph1(ArrayList<Edge2> edges) {
        // edges
        edges.add(new Edge2(0, 1, 10));
        edges.add(new Edge2(0, 2, 15));
        edges.add(new Edge2(0, 3, 30));
        edges.add(new Edge2(1, 3, 40));
        edges.add(new Edge2(2, 3, 50));
    }

    public static int find2(int x) {
        if (x == par[x]) {
            return x;
        }

        return par[x] = find2(par[x]);
    }

    public static void krushkalMst(ArrayList<Edge2> edges, int V) {
        init();
        Collections.sort(edges);
        int mstCount = 0;
        int count = 0;

        for(int i=0; count<V-1; i++) {
            Edge2 e = edges.get(i);
            //(src, dest, wt)

            int parA = find2(e.src);
            int parB = find2(e.dest);
            if(parA != parB) {
                union(e.src, e.dest);
                mstCount += e.wt;
                count++;
            }
        }

        System.out.println(mstCount);
    }

    // Flood Fill
    public static void helper(int image[][], int sr, int sc, int color,boolean vis[][], int orgCol) {
        if(sc < 0 || sr < 0 || sr >= image.length || sc >= image[0].length
            || vis[sr][sc] || image[sr][sc] != orgCol) {
                return;
        }

        image[sr][sc] = color;
        //left
        helper(image, sr, sc-1, color, vis, orgCol);
        //right
        helper(image, sr, sc+1, color, vis, orgCol);
        //up
        helper(image, sr-1, sc, color, vis, orgCol);
        //down
        helper(image, sr+1, sc, color, vis, orgCol);
    }

    public static int[][] floodFill(int image[][], int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    // Kosaraju algo
    static class Edge1 {
        int src;
        int dest;

        public Edge1(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void topSort3(ArrayList<Edge1> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge1 e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topSort3(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs1(ArrayList<Edge1> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");

        for(int i=0; i<graph[curr].size(); i++) {
            Edge1 e = graph[curr].get(i);
            if(!vis[e.dest]) {
                dfs1(graph, e.dest, vis);
            }
        }
    }
    public static void kosaraju(ArrayList<Edge1> graph[], int V) { // O(V+E)
        // Step 1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                topSort3(graph, i, vis, s);
            }
        }

        // Step 2
        ArrayList<Edge1> transpose[] = new ArrayList[V];
        for(int i=0; i<graph.length; i++) {
            transpose[i] = new ArrayList<>();
        }

        for(int i=0; i<V; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge1 e = graph[i].get(j);
                transpose[e.dest].add(new Edge1(e.dest, e.src));
            }
        }

        // Step 3
        while(!s.isEmpty()) {
            int curr = s.pop();
            if(!vis[curr]) {
                System.out.print("SCC -> ");
                dfs1(transpose, curr, vis); // scc
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        // int V = 7;
        // ArrayList<Edge> graph[] = new ArrayList[V];
        // createGraph(graph);
        // bfs(graph);
        // System.out.println();
        // dfs(graph, 0, new boolean[V]);

        // System.out.println(hasPath(graph, 0, 5, new boolean[V]));

        // System.out.println(detectCycle(graph));

        // System.out.println(isBipartite(graph));

        // System.out.println(isCycle(graph));

        // topSort(graph);
        // dijkstra(graph, 0);

        // Cheapest Flight with k stops
        // int n = 4;
        // int flight[][] = {{0,1,100}, {1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        // int src = 0, dest = 3, k = 1;
        // System.out.println(cheapestFlight(n, flight, src, dest, k));

        // init();
        // union(1, 3);
        // System.out.println(find(3));
        // union(2, 4);
        // union(3, 6);
        // union(1, 4);
        // System.out.println(find(3));
        // System.out.println(find(4));
        // union(1, 5);

        int V = 4;
        ArrayList<Edge2> edges = new ArrayList<>();
        createGraph1(edges);
        krushkalMst(edges, V);

    }
}
