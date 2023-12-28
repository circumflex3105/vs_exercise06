import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FrueherkennungIF extends Remote {
    BerichtIF analysiere(RoentgenbildIF bild) throws RemoteException;
}