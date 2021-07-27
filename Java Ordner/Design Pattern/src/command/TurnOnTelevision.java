package command;

public class TurnOnTelevision implements Command {
	
	
 Television television ;
 public TurnOnTelevision(Television television) {
  this.television = television;
}

	@Override
	public void execute() {
	this.television.turnOn();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
