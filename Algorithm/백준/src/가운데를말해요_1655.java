import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class 가운데를말해요_1655 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> up = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> down = new PriorityQueue<>();
		
		int middle = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		up.add(middle);
		sb.append(middle + "\n");
		
		for (int i = 1; i < N; i++) {
			int buf = Integer.parseInt(br.readLine());
			
			if(up.size() > down.size()) {
				down.add(buf);
			}
			else {
				up.add(buf);
			}
			
			if(up.peek() > down.peek()) {
				int tmp1 = up.poll();
				int tmp2 = down.poll();
				
				up.add(tmp2);
				down.add(tmp1);
			}
			
			sb.append(up.peek() + "\n");
		}

		System.out.println(sb.toString());
		
	}
}
