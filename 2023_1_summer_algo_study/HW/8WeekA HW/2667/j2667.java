import java.util.*;
import java.util.NoSuchElementException;

public class j2667 {
    static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        int N = sc.nextInt();
        sc.nextLine();

  
        int[][] dangi = new int[N][N];

        boolean[][] visited  = new boolean[N][N];



        for(int i=0; i<N; i++){
            String str = sc.nextLine();
            for(int j=0; j<N; j++){
                dangi[i][j] = str.charAt(j) - 48;
            }
        }

        for(int i=0; i<dangi.length; i++){
            String str = sc.nextLine();
            for(int j=0; j<str.length(); j++){
                dangi[i][j] = str.charAt(j) - 48;
            }
        }

        int count = 0;
        List<Integer> dangiNum = new ArrayList<>();
        for(int i=0; i<dangi.length; i++){
            for(int j=0; j<dangi[0].length; j++){
                if(visited[i][j] == false && dangi[i][j] == 1) {
                    count++;
                    q.add(new Node(i, j, count));
                    visited[i][j] = true;
                    int tmp = bfs(visited, dangi, 0);
                    dangiNum.add(tmp);
                }
            }
        }

        System.out.println(dangiNum.size());
        Collections.sort(dangiNum);
        for(int i=0; i<dangiNum.size(); i++){
            System.out.println(dangiNum.get(i));
        }
    }

    public static int bfs(boolean[][] visited, int[][] dangi, int countNum) {

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while(!q.isEmpty()){
            Node out = q.poll();
            dangi[out.x][out.y] = out.count;
            visited[out.x][out.y] = true;
            countNum += 1;

            for(int k=0; k<4; k++){
                int x = out.x + dx[k];
                int y = out.y + dy[k];
                if(x>=0 && y>=0 && x<dangi.length && y<dangi[0].length) {
                    if(visited[x][y] == false && dangi[x][y] == 1){
                        q.add(new Node(x, y, out.count));
                    }
                }
            }
        }

        return countNum;
    }

    static class Node{
        int x;
        int y;
        int count;
        
        public Node(int x, int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}