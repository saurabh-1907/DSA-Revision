class Solution {
    public boolean canFinish(int n, int[][] edges) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            arr.get(u).add(v);
        }

   
        for(int i = 0; i < n; i++){
            boolean vis[] = new boolean[n];
            dfs(i, vis, arr);
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(!vis[j]){
                    check = true;
                }
            }
            if(!check){
                return true;
            }
        }
        
        return true;
    }
    void dfs(int curr, boolean vis[], List<List<Integer>> arr){
        vis[curr] = true;
        int len = arr.get(curr).size();
        for(int i = 0; i < len; i++){
            if(!vis[i]){
                dfs(arr.get(curr).get(i), vis, arr);
                
            }
            else{
                vis[curr] = false;
            }

        }
    }
}
