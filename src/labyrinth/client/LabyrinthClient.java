package labyrinth.client;

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

        while (){
        for (int i= 0; i<8; i++) {
                result = player.moveForward();
                System.out.println("'"+result+"'");
        }

//            result = player.turnLeft();

        if (result.equals(" **")) {
                System.out.println("Boah Ey");
                player.turnLeft();
                player.moveForward();
        }


//        result = player.moveForward();
//        System.out.println("'"+result+"'");

//        result = player.turnLeft();
//        System.out.println("'**'");
    }

}
