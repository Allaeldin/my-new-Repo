package command;

public class REmoteConrol {
	
	
	
	Command[] onCommands;
	Command[] offCommands;
	public REmoteConrol() {
		super();
		this.onCommands = new Command[3];
		this.offCommands = new Command[3];
	}
	
	
	
	
	
	public void addCommand(int slot, Command onCommand,Command offCommand) {
		
		onCommands[slot] = onCommand;
		offCommands[slot]= offCommand;
		
	}

	
	public void onCommandPressed(int slot) {
		
		onCommands[slot].execute();
		
		
	}
	
    public void offCommandPressed(int slot) {
		
		offCommands[slot].execute();
		
		
	}
	
	
}
