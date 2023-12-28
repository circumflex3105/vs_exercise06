import java.rmi.RemoteException;

public class FrueherkennungService implements FrueherkennungIF {


    @Override
    public Bericht analysiere(RoentgenbildIF bild) throws RemoteException {
        System.out.println("Empfangen: " + bild.toString());

        Bericht antwort = new Bericht();
        antwort.setDiagnose("Schnupfen");
        antwort.setWeiteresVorgehen("Eine Woche Bettruhe und VS-Videos");

        System.out.println("Sende: " + antwort);

        return antwort;

    }
}