class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q=new LinkedList<>();
        int rc=0;
        q.add(0);
        boolean []visited=new boolean[rooms.size()];
        visited[0]=true;
        while(!q.isEmpty())
        {
            int cr=q.poll();
            rc++;
            for(int x:rooms.get(cr))
            {
                if(!visited[x])
                {
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
        return rc==rooms.size();
    }
}