package p2;

/**
 * <h1>Imprumuturi</h1>
 * <p>Clasa de imprumuturi</p>
 * @version 2.06
 * @author Bumbuc Ivan
 */
public class Imprumuturi {
    private String cnp;
    private int id;
    private String numeUtilizator;
    private String email;
    private String serie;
    private String numeCarte;
    private String dataImprumut;
    private String dataLimita;

    /**
     * Constructor cu parametri
     * @param cnp
     * @param id
     * @param numeUtilizator
     * @param email
     * @param serie
     * @param numeCarte
     * @param dataImprumut
     * @param dataLimita
     */
    public Imprumuturi(String cnp, int id, String numeUtilizator, String email, String serie, String numeCarte, String dataImprumut, String dataLimita) {
        this.cnp = cnp;
        this.id = id;
        this.numeUtilizator = numeUtilizator;
        this.email = email;
        this.serie = serie;
        this.numeCarte = numeCarte;
        this.dataImprumut = dataImprumut;
        this.dataLimita = dataLimita;
    }

    public String getCnp() {
        return cnp;
    }

    public int getId() {
        return id;
    }

    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public String getEmail() {
        return email;
    }

    public String getSerie() {
        return serie;
    }

    public String getNumeCarte() {
        return numeCarte;
    }

    public String getDataImprumut() {
        return dataImprumut;
    }

    public String getDataLimita() {
        return dataLimita;
    }

    @Override
    public String toString() {
        return "Imprumuturi{" +
                "cnp='" + cnp + '\'' +
                ", id=" + id +
                ", numeUtilizator='" + numeUtilizator + '\'' +
                ", email='" + email + '\'' +
                ", serie='" + serie + '\'' +
                ", numeCarte='" + numeCarte + '\'' +
                ", dataImprumut='" + dataImprumut + '\'' +
                ", dataLimita='" + dataLimita + '\'' +
                '}';
    }
}
