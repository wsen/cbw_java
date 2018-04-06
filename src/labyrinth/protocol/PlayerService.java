package labyrinth.protocol;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PlayerService extends Remote {

    String moveForward() throws RemoteException;

    String turnLeft() throws RemoteException;

    String turnRight() throws RemoteException;

}
