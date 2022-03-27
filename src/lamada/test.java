package lamada;

public class test {
    static int[] a = new int[]{0,0,0,0,0,0,0,1,1,1,1,1};

    static boolean[] vis = new boolean[12];
    static long ans;

    public static void main(String[] args) {
        int[] path = new int[12];
        f(0,path);
        System.out.println(ans);
    }

    static boolean check(int path[]){
        int g[][] = new int[3][4];
        for (int i = 0; i < 3;i++){
            for(int j = 0;j <4 ;j++){
                if(path[i * 4 +j ]==1) g[i][j] = 1;
                else g[i][j] = 0;
            }
        }


        int cnt = 0;
        for (int i = 0; i < 3;i++){
            for(int j = 0;j <4 ;j++) {
                if(g[i][j] == 1){
                    dfs(g,i,j);
                    cnt++;
                }
            }
            }
        return cnt == 1;
    }

    static void dfs(int g[][],int i,int j) {
        g[i][j] = 0;
        if (i - 1 >= 0 && g[i - 1][j] == 1) dfs(g, i - 1, j);
        if (i + 1 <= 2 && g[i + 1][j] == 1) dfs(g, i + 1, j);
        if (j - 1 >= 0 && g[i][j - 1] == 1) dfs(g, i, j - 1);
        if (j + 1 <= 3 && g[i][j + 1] == 1) dfs(g, i, j + 1);

    }


    static void f(int k,int[] path){
        if( k == 12){
            if(check(path))
                ans++;}

        for(int i=0;i < 12;i++){
            if(i > 0 && a[i]==a[i-1] && !vis[i-1])continue;

            if(!vis[i]){
                vis[i] = true;
                path[k] = a[i];

                f(k+1,path);

                vis[i] = false;
            }
        }
    }
}




