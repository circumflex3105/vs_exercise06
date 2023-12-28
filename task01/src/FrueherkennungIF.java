import java.rmi.Remote;
        import java.rmi.RemoteException;

public interface FrueherkennungIF extends Remote {
    Bericht analysiere(Roentgenbild bild) throws RemoteException;
}