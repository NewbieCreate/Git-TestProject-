package backjun;

public class Exam {
	public static void main(String[] args) {
	int sum[] = {20,30,40,50};
	int min = Integer.MIN_VALUE;
	int max = Integer.MAX_VALUE;
	
	for(int i = 0; i <sum.length; i++) {
		min = Math.min(min, i);
		max = Math.max(max, i);
	}System.out.println("최대값은  ?" + max);
	System.out.println("최소값은 ? " + min);
	}

}
