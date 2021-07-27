package command;

public class Executor {
	
	public static final int TV_SLOT = 0;
	public static final int MEDIAPLAYER_SLOT = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		REmoteConrol rEmoteConrol = new REmoteConrol();
		
		Television television = new Television();
		
		TurnOffTelevision turnOffTelevision= new TurnOffTelevision(television);
		TurnOnTelevision turnOnTelevision = new TurnOnTelevision(television);
		
		MediaPlayer mediaPlayer = new MediaPlayer();
		TurnOnMediaPlayer turnOnMediaPlayer = new TurnOnMediaPlayer(mediaPlayer);
		TurnOffMediaPlayer turnOffMediaPlayer = new TurnOffMediaPlayer(mediaPlayer);
		
		
		
		rEmoteConrol.addCommand(TV_SLOT, turnOnTelevision, turnOffTelevision);
		rEmoteConrol.addCommand(MEDIAPLAYER_SLOT, turnOnMediaPlayer, turnOffMediaPlayer);
		
		rEmoteConrol.onCommandPressed(TV_SLOT);
		rEmoteConrol.offCommandPressed(TV_SLOT);
		System.out.println("----------------------");
		rEmoteConrol.offCommandPressed(MEDIAPLAYER_SLOT);
		rEmoteConrol.onCommandPressed(MEDIAPLAYER_SLOT);
		
		
		
		
		
		
		
		
		

	}

}
