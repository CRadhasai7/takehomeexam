package coomandpattern;

public class movenorth implements command{
	player player;
	public movenorth(player player) {
		this.player = player;
	}
	
	public void execute() {
		player.Y = player.Y + 1;
	}
	public boolean undo() {
		return true ;
	}

}


