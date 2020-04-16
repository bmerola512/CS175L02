package roaches;

public class Roachpopulation {
	    private int population;

	    public Roachpopulation(int population) {
	        this.population = population;
	    }

	    public void breed() {
	        population *=2 ;
	    }

	    public void spray(double percent) { 
	        double temp =  population -(population* (percent/100));
	        population =   (int) Math.round(temp);

	    }

	    public int getRoaches() {
	        return population;
	    }
	}


