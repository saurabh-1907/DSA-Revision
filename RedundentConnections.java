class Solution {
    int ans[] = new int[2];
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = edges.length;
        for(int i = 0; i < n; i++){
            arr.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++){
            arr.get(edges[i][0] - 1).add(edges[i][1] - 1);
            arr.get(edges[i][1] - 1).add(edges[i][0] - 1);
        }
        boolean vis[] = new boolean[n];
        dfs(arr, n, vis, 0, -1);
        return ans;

    }
    void dfs(List<List<Integer>> arr, int n, boolean vis[], int node, int parent){
        vis[node] = true;
        int len = arr.get(node).size();
        for(int i = 0; i < len; i++){
            int curr = arr.get(node).get(i);
            if(curr == parent) continue;
            if(!vis[curr]){
                dfs(arr, n, vis, curr, node);
            }
            else{
                ans[0] = node;
                ans[1] = curr;
                return;
            }
        }
        return;
    }

}
