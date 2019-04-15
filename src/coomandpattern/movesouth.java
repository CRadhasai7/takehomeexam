package coomandpattern;

public class movesouth implements command{
	player player;
	public movesouth(player player) {
		this.player = player;
	}
	
	public void execute() {
		player.Y = player.Y - 1;
	}
	
	public boolean undo() {
		return true;
		
	}
}


