package p2;

/**
 * <h1>Suspendari</h1>
 * <p>Clasa de suspendari.</p>
 * @version 2.09
 * @author Bumbuc Ivan
 */
public class Suspendari {
    private String cnpUtilizator;
    private String numeUtilizator;
    private String email;
    private String serieUtilizator;
    int idCarte;
    private String numeCarte;
    private String dataAcces;

    /**
     * Constructorul cu parametrii
     * @param cnpUtilizator
     * @param numeUtilizator
     * @param email
     * @param serieUtilizator
     * @param idCarte
     * @param numeCarte
     * @param dataAcces
     */
    public Suspendari(String cnpUtilizator, String numeUtilizator, String email, String serieUtilizator, int idCarte, String numeCarte, String dataAcces) {
        this.cnpUtilizator = cnpUtilizator;
        this.numeUtilizator = numeUtilizator;
        this.email = email;
        this.serieUtilizator = serieUtilizator;
        this.idCarte = idCarte;
        this.numeCarte = numeCarte;
        this.dataAcces = dataAcces;
    }

    public String getCnpUtilizator() {
        return cnpUtilizator;
    }

    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public String getEmail() {
        return email;
    }

    public String getSerieUtilizator() {
        return serieUtilizator;
    }

    public int getIdCarte() {
        return idCarte;
    }

    public String getNumeCarte() {
        return numeCarte;
    }

    public String getDataAcces() {
        return dataAcces;
    }

    @Override
    public String toString() {
        return "Suspendari{" +
                "cnpUtilizator='" + cnpUtilizator + '\'' +
                ", numeUtilizator='" + numeUtilizator + '\'' +
                ", email='" + email + '\'' +
                ", serieUtilizator='" + serieUtilizator + '\'' +
                ", idCarte=" + idCarte +
                ", numeCarte='" + numeCarte + '\'' +
                ", dataAcces='" + dataAcces + '\'' +
                '}';
    }
}
