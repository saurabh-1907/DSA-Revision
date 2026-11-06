class Leetcode648{
    public int[] findRedundentConnection(int edges[][]){
        int n = edges.length;
        DSU dsu = new DSU(n + 1);
        for(int e[] : edges){
            if(!dsu.union(e[0], e[1])){
                return e;
            }
        }
        return new int[0];
    }
}
