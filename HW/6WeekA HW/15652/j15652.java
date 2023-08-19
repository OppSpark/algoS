import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;





/*
public class j15652{
    static int [] num;
    static boolean[] vi;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        num = new int[N + 1];

        vi = new boolean[N + 1];

        dfs(N, M, 0, index);
    }

    static void dfs(int N, int M, int cnt, int index){
        if(cnt == M){
            for(int i = 0; i < M; i++){
                System.out.print(num[i] + " ");
            }
            System.out.println("");

            return;

        }

        for(int i = 1; i <= N; i++){
            if(index <= 1){
                num[cnt] = i;
            dfs(N, M, cnt + 1, num[cnt]);
            }
        }
    }
    
} */



public class j15652 {

	static int[] arr;
	static int depth;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		
		dfs(1, 0);
		System.out.println(sb.toString());
}
	public static void dfs(int a, int depth) {
		
		if(depth == N) {
			for(int i = 0 ; i < arr.length ; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = a ; i <= M; i++) {
			arr[depth] = i;
			dfs(i,depth+1);
		}
		
	}
}











