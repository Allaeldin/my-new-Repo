package template;

public abstract class VehicleTemplate {
	
	
	public final void buildVehicle() {
		
		collectComponents();
		assembleComponents();
		installGearBox();
		startVehicle();		
		
		System.out.println("Vehicle is On");
		
		
		
		
	}

	private void startVehicle() {
		System.out.println("The Engine is powering up");
		
	}

	protected abstract void assembleComponents();

	protected abstract void installGearBox();

	private void collectComponents() {
	System.out.println("Bring rear and front Light ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
