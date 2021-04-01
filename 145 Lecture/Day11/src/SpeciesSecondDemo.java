
public class SpeciesSecondDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpeciesSecond ssp1 = new SpeciesSecond();
		
	
		ssp1.writeOutput();
		
		ssp1.setName("WaterBuffalo");
		ssp1.setPopulation(1000);
		ssp1.setGrowthRate(5.5);
		
		ssp1.writeOutput();
		
		SpeciesSecond ssp3 = new SpeciesSecond();
		
		ssp3.setName("Dolphin");
		ssp3.setPopulation(500);
		ssp3.setGrowthRate(30);
		
		System.out.println("Are the two object equal?\n" + ssp1.equals(ssp3));
	}

}
