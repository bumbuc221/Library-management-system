package p2;

/**
 * Clasa <h1>Administrator</h1>
 * @version 2.01
 * @author Bumbuc Ivan
 */
public class Administrator extends Utilizator{
    private String parola;

    /**
     * Constructirul cu parametri ai clase <h1>Administartor</h1>
     * @param cnp
     * @param nume
     * @param email
     * @param serie
     * @param parola
     */
    public Administrator(String cnp, String nume, String email, String serie, String parola) {
        super(cnp, nume, email, serie);
        this.parola = parola;
    }

    public String getParola() {
        return parola;
    }
    public void setParola(String s)
    {
        parola=s;
    }
    /**
     * Functia de afisare a clasei <h1>Administartor</h1>
     * @return
     */
    @Override
    public String toString() {
        return "Administrator{" +
                ", CNP='" + cnpUtilizator + '\'' +
                ", Nume='" + numeUtilizator + '\'' +
                ", Email='" + emailUtilizator + '\'' +
                ", Serie='" + serieUtilizator + '\'' +
                '}';
    }
}
