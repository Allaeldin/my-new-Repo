package template;

public class Car extends VehicleTemplate {

	@Override
	protected void assembleComponents() {
System.out.println("adding Mirrors ,Windows, join the Parts in Car body ");
		
	}

	@Override
	protected void installGearBox() {
		System.out.println("Installing 4 Gear Box");
		
	}

}
