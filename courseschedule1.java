class Solution {
    public boolean canFinish(int n, int[][] edges) {
        int len = edges.length;
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
            int vis[] = new int[n];
            dfs(arr, n, i, vis);
            vis[i] = 2;
            System.out.println(Arrays.toString(vis));
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(vis[j] != 2){
                    check = true;
                }

            }
            if(!check){
                return true;
            }
        }
        return false;

    }

    void dfs(List<List<Integer>> arr, int n, int node, int vis[]){
        if(vis[node] == 0) vis[node] = 1;
        List<Integer> lst = arr.get(node);
        for(int i = 0; i < lst.size(); i++){
            int currNode = lst.get(i);
            int currNodeSize = arr.get(currNode).size();
            if(currNodeSize == 0) {
                vis[currNode] = 2;
                System.out.println("inside--------------------->" + Arrays.toString(vis) + "------------" + currNode );
                return;
            }  
            if(vis[currNode] == 0){
                dfs(arr, n, currNode, vis);
            }
        }
        vis[node] = 2;
        System.out.println("inside------->2222222" + Arrays.toString(vis) + "------------" + node );


    }

}
