package task2;

public class Arithmetic {
	public int add(Integer a, Integer b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
	public boolean check(Integer a, Integer b) {
		if (a.compareTo(b) == 0 || 
				a.compareTo(b) == 1) {
			return true;
		}
		return false;
	}
}
