package template;

public class Bus extends VehicleTemplate {

	@Override
	protected void assembleComponents() {
		System.out.println("adding Mirrors and Chairs for The Bus ");
		
	}

	@Override
	protected void installGearBox() {
		// TODO Auto-generated method stub
		System.out.println("Installing 6 gear Box");
	}

}
