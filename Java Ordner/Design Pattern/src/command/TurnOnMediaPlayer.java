package command;

public class TurnOnMediaPlayer implements Command {
	
	
	MediaPlayer mediaPlayer;

	public TurnOnMediaPlayer(MediaPlayer mediaPlayer) {
		super();
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void execute() {
		this.mediaPlayer.turnOn();
		
	}

}
