class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int dist[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dist[i][j] = -1;
            }
        }
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid.get(i).get(j) == 1){
                      dist[i][j] = 0;
                      q.offer(new int[]{i, j});
                }
            }
        }

        int dir[][] = {
            {0, 1}, {0, -1}, {1, 0},{-1, 0}
        };

        while(!q.isEmpty()){
            int curr[] = q.poll();
            int r = curr[0];
            int c = curr[1];
            for(int i = 0; i < 4; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr >= 0 && nc >= 0 && nr < n && nc < n && dist[nr][nc] == -1){
                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        // binary serach

        int low = 0;
        int high = 2*n;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(isPossible(dist, n, mid)){
                ans = mid;
                low = mid + 1;

            }else{
                high = mid - 1;
            }
        }
        return ans;

    }
    public boolean isPossible(int dist[][], int n, int limit){
        if(dist[0][0] < limit){
            return false;
        }
        boolean vis[][] = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        vis[0][0] = true;
        int dir[][] = {
            {0,1}, {0, -1}, {1, 0}, {-1, 0}
        };
        while(!q.isEmpty()){
            int curr[] = q.poll();
            int r = curr[0];
            int c = curr[1];
            if(r == n -1 && c == n - 1){
                return true;
            }
            for(int i = 0; i < 4; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];

                if(nr >= 0 && nc >= 0 && nr < n && nc < n && !vis[nr][nc] && dist[nr][nc] >= limit){

                    vis[nr][nc] = true;

                    q.offer(new int[]{nr, nc});
                }

            }
        }
        return false;    
    }
}