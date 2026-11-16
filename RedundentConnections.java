class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n + 1; i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            boolean vis[] = new boolean[n + 1];
            if(isConnected(u, v, vis, graph)){
                return edge;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);

        }

        return new int[0];
    }

    boolean isConnected(int node, int target, boolean vis[], ArrayList<ArrayList<Integer>> arr){
        if(target == node){
            return true;
        }
        vis[node] = true;
        int len = arr.get(node).size();
        for(int i = 0; i < len; i++){
            int curr = arr.get(node).get(i);
            if(!vis[curr]){
                return isConnected(curr, target, vis, arr);
            }
        }
        return false;
    }
}
