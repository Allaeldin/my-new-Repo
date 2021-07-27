package command;

public class TurnOffTelevision implements Command {
	
	
	
	
 Television television ;
 public TurnOffTelevision(Television television) {
  this.television = television;
}

	@Override
	public void execute() {
	this.television.turnOff();
		
	}
	
	

}
