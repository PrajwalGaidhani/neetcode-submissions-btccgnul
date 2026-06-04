class DSU{
    int[] parent;
    int[] rank;
    public DSU(int n){
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=1;
        }

    }
    public int find(int node){
       int cur=node;
       while(cur!=parent[cur]){
        parent[cur]=parent[parent[cur]];
        cur=parent[cur];
       } 
       return cur;
    }
    public boolean union(int u,int v){
        int pu=find(u);
        int pv=find(v);
        if(pu==pv){
            return false;
        }
        if(rank[pv]>rank[pu]){
            int t=pu;
            pu=pv;
            pv=t;
        }
        parent[pv]=pu;
        rank[pu]+=rank[pv];
        return true;
    }
}


class Solution {

    public int countComponents(int n, int[][] edges) {
        DSU dsu =new DSU(n);
        int res=n;
        for(int[] edge: edges){
            if(dsu.union(edge[0],edge[1])){
                res--;
            }
        }

        return res;

    }
}

// Method 1:
// for given n : we will start from 0 and go to n
// we will check for each n' neighbour and mark it visited
// after that we will process all n and ie for each n do dfs thenbn increment counter


// Method 2 union find
