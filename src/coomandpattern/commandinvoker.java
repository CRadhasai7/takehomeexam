package coomandpattern;


import java.util.concurrent.ThreadLocalRandom;

public class commandinvoker {
	private command command;
	
	
	public void startplay(player player) {
		for (int i = 0; i < 50; i++) {
			int r = ThreadLocalRandom.current().nextInt(1, 4);
			if (r == 1) {
				command mn = new movenorth(player);
				mn.execute();
				System.out.println("player moved north");
				player.playerposition();
				
			} else if (r == 2){
				command me = new moveeast(player);
				me.execute();
				System.out.println("player moved east ");
				player.playerposition();
				
			} else if (r == 3) {
				command ms = new movesouth(player);
				ms.execute();
				System.out.println("player moved south");
				player.playerposition();
				
			} else if (r == 4) {
				command mw = new movewest(player);
				mw.execute();
				System.out.println("player moved north");
				player.playerposition();
			}
		}
		player.playerposition();
		command m = new movenorth(player);
		
		boolean t = m.undo();
		if (t == true) {
			player.X = 0;
			player.Y = 0;
		}
		System.out.println("move has been undone");
		player.playerposition();
		}
	    
		
		
	}


