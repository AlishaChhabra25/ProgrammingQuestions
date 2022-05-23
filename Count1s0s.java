import java.util.Arrays;

public class Count1s0s {
	// m represents 0 and n represents 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"001" , "010" , "011110000", "10100000011"};
		for(String itr : s) {
			count(itr);
		}
	}
	private static void count(String itr) {
		// TODO Auto-generated method stub
		int count[] = new int[2];
		for(char c : itr.toCharArray()){
			if(c - '0' == 0) {
				count[0]++;
			}
			else {
				count[1]++;
			}
		}
		System.out.println("m = " + count[0]);
		System.out.println("n = " + count[1]);
		
		Arrays.fill(count, 0);
	}
}
