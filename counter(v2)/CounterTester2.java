package counter;

public class CounterTester2 {

	public static void main(String[] args) {
		
		Counter venue = new Counter();
		int rValue=venue.getValue();
		
		venue.clickMany(10);
		
		rValue = venue.getValue();

		venue.unclickMany(5);
		
		rValue = venue.getValue();
		System.out.println("Expected: 5");
		System.out.println("Actual: " + rValue);
		
		venue.reset();
		rValue = 0;
		
			venue.clickMany(3);
		
		rValue = venue.getValue();
		
			venue.unclickMany(4);
		
		rValue = venue.getValue();
		System.out.println("Expected: -1");
		System.out.println("Actual: " + rValue);
		
	}

}
