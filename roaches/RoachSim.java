package roaches;

public class RoachSim {

	public static void main(String[] args) {

		Roachpopulation rp = new Roachpopulation(10);
		
		System.out.println("The Initial Roach population "
				+ "is " + rp.getRoaches());
		
		rp.breed();
		
		System.out.println("The Roach population after cycle 1 "
				+ "breeding is " + rp.getRoaches());
		
		rp.spray(50);
		
		System.out.println("The Roach population "
				+ "after cycle 1 50 percent spraying is: " + rp.getRoaches());
		
		rp.breed();
		
		System.out.println("The Roach population after "
				+ "cycle 2 breeding is " + rp.getRoaches());
        
		rp.spray(60);
        
		System.out.println("The Roach population after "
				+ "cycle 2 60% spraying: " + rp.getRoaches());

        rp.breed(); 
        
        System.out.println("The Roach population after "
        		+ "cycle 3  breeding: " + rp.getRoaches());
        
        rp.spray(70); 
        
        System.out.println("The Roach population after "
        		+ "cycle 3 70% spraying: " + rp.getRoaches());

        rp.breed();
        
        System.out.println("The Roach population after "
        		+ "cycle 4  breeding: " + rp.getRoaches());
        
        rp.spray(80);
        
        System.out.println("Roach population after "
        		+ "cycle 4 80% spraying: " + rp.getRoaches());
	}
	

}
