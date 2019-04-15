package coomandpattern;

public class moveeast implements command{
	player player;
	public moveeast(player player) {
		this.player = player;
	}
	
	public void execute() {
		player.X = player.X + 1;
	}
	
	public boolean undo() {
		return true ;
	}

}
