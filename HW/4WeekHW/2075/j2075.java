import java.util.*;
public class j2075 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++)
                queue.offer(sc.nextInt());
        }

        for(int i = 1; i < num; i++)
            queue.poll();

        System.out.println(queue.poll());
    
    }
}