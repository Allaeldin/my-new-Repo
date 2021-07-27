package template;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		VehicleTemplate  car = new Car();
		car.buildVehicle();
		
		VehicleTemplate busTemplate = new Bus();
		System.out.println("--------------------------");
		busTemplate.buildVehicle();
		
		
		
		
		
		
		
	}

}
