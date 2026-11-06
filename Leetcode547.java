class Leetcode547{
    public int findCircleNum(int isConnected[][]){
        int n = isConnected.length;
        DSU dsu = new DSU(n);
        for(int  i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(isConnected[i][j] == 1){
                    dsu.union(i, j);
                }
            }
        }
        return dsu.getComponents();
    }
}
