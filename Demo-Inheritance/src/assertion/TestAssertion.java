package assertion;

public class TestAssertion {
public static void main(String[] args) {
	int distance=100;
	System.out.println("entering assert statement");
	assert(distance>0);
	distance = -100;
	assert(distance >0):"distance is negetive";
	System.out.println("end of program");
}
}
