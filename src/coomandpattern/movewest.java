package coomandpattern;

public class movewest implements command {
	player player;
	public movewest(player player) {
		this.player = player;
	}
	
	public void execute() {
		player.X = player.X - 1;
	}

	public boolean undo() {
		return true ;
	}

}
