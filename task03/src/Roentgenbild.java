import java.util.Date;

public class Roentgenbild implements RoentgenbildIF {
    private Date aufnahmeVom;
    private transient String patientName;
    private byte[] rawData;

    public Roentgenbild(String patientName) {
        this();
        this.patientName = patientName;
    }

    public Roentgenbild() {
        this.aufnahmeVom = new Date();
        this.rawData = "Ich wäre gerne ein Bild".getBytes();
    }

    @Override
    public Date getAufnahmeVom() {
        return aufnahmeVom;
    }

    public void setAufnahmeVom(Date aufnahmeVom) {
        this.aufnahmeVom = aufnahmeVom;
    }

    @Override
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public byte[] getRawData() {
        return rawData;
    }

    public void setRawData(byte[] rawData) {
        this.rawData = rawData;
    }

    @Override
    public String toString() {
        return "Roentgenbild{" +
                "aufnameDatum=" + aufnahmeVom +
                ", patientenName='" + patientName + '\'' +
                ", rawData=" + rawData.length + " bytes" +
                '}';
    }

}