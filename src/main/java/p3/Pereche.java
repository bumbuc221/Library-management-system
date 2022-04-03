package p3;

/**
 * <h1>Pereche</h1>
 * <p>Clasa pentru identificarea imprumuturilor si a intarzierilor in functie de cnp si id.</p>
 * @author Bumbuc Ivan
 * @version 3.03
 */
public class Pereche{
    private String cnp;
    private int id;

    /**
     * Contructorul cu parametrii
     * @param cnp
     * @param id
     */
    public Pereche(String cnp, int id) {
        this.cnp = cnp;
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metoda de afisare
     * @return Pereche de cnp si id
     */
    @Override
    public String toString() {
        return "Pereche{" +
                "cnp='" + cnp + '\'' +
                ", id=" + id +
                '}';
    }

}
