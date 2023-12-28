import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface RoentgenbildIF extends Remote {
    Date getAufnahmeVom() throws RemoteException;
    String getPatientName() throws RemoteException;
    byte[] getRawData() throws RemoteException;
}
