
public class ScopeEx {
	boolean isAdult(int age) {
		int magicAge = 21;
		return age >= magicAge;
	}
	double average(int a, int b) {
		return (a+b)/2.0;
	}

	public static void main(String[] args) {
	ScopeEx scopeEx = new ScopeEx();
	System.out.println(scopeEx.average(2,3));

	}

}
