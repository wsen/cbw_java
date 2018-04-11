package labyrinth_server.protocol;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LabyrinthService extends Remote {

    public static final String HOST = "10.10.44.165";

    public static final String NAME = "rmi://" + HOST + "/LabyrinthService";

    PlayerService login() throws RemoteException;

}
