package labyrinth_server.protocol;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by sreinck on 09.11.16.
 */
public interface PlayerService extends Remote {

    String moveForward() throws RemoteException;

    String turnLeft() throws RemoteException;

    String turnRight() throws RemoteException;

    String shoot() throws RemoteException;

}
