class DSU {
    private final int[] parent;
    private final int[] size;
    private int components;

    DSU(int n) {
        parent = new int[n];
        size = new int[n];
        components = n;

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int a, int b) {
        int ra = find(a);
        int rb = find(b);

        if (ra == rb) return false;

        if (size[ra] < size[rb]) {
            int temp = ra;
            ra = rb;
            rb = temp;
        }

        parent[rb] = ra;
        size[ra] += size[rb];
        components--;

        return true;
    }

    boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    int getComponents() {
        return components;
    }

    int sizeOf(int x) {
        return size[find(x)];
    }
}
