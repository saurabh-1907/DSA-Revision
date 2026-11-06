class DSU{
    private final int[] parent;
    private final int[] size;
    private int components;
    DSU(int n){
        parent = new int[n];
        size   = new int[n];
        components = n;
        for(int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    // Find with path compression
    int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // Union by size returns false if a and b are already connected

    boolean union(int a, int b){
        int ra = find(a);
        int rb = find(b);
        if(ra == rb) return false;
        if(size[ra] < size[rb]){
            int t = ra;
            ra = rb;
            rb = t;
        }

        parent[rb] = rb;
        size[ra] += size[rb];
        companents--;
        return true;
    }

    boolean connected(int a, int b){
        return find(a) == find(b);
    }
    int getComponents(){
        return components;
    }

    int sizeOf(int x){
        return size[find(x)];
    }
}
