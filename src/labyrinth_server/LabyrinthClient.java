package labyrinth_server;

import labyrinth.protocol.LabyrinthService;
import labyrinth.protocol.PlayerService;

import java.rmi.Naming;

public class LabyrinthClient {
	
	public static void main(String[] args) throws Exception {
        LabyrinthService labyrinth =
                (LabyrinthService) Naming.lookup(LabyrinthService.NAME);

        PlayerService player = labyrinth.login();
        
        String result;

        result = player.moveForward();
        System.out.println("'"+result+"'");

        result = player.turnRight();
        System.out.println("'"+result+"'");

//        result = player.moveForward();
//        System.out.println("'"+result+"'");

        result = player.turnRight();
        System.out.println("'"+result+"'");


    }

}
