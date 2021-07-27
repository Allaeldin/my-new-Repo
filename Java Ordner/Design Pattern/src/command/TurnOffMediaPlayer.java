package command;

public class TurnOffMediaPlayer implements Command {
	
	
	

	MediaPlayer mediaPlayer;

	public TurnOffMediaPlayer(MediaPlayer mediaPlayer) {
		super();
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void execute() {
		this.mediaPlayer.turnOff();
		
	}


}
