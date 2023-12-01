import java.util.*;
import java.io.*;

public class j2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		Stack<int[]> top = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0; i<num; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			while(!top.isEmpty()) {
				if(top.peek()[0] < n)
					top.pop();
				else { 
					System.out.print(top.peek()[1] + " ");
					break;
				}
			}
			
			if(top.empty()) 
				System.out.print("0 ");
			top.push(new int[] {n, i+1}); 
		}
			
	}

}