package t1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import p2.Administrator;
import p2.Istoric;
import p2.Suspendari;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test1 {
    @Test
    public void testAdministratorAfis() {

        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Administrator x=new Administrator("5012242323","Mihai Ioan","mihai@gmail.com","XM234","12345");
        System.out.print(x);
        Assertions.assertEquals("Administrator{" +
                ", CNP='" + "5012242323" + '\'' +
                ", Nume='" + "Mihai Ioan" + '\'' +
                ", Email='" + "mihai@gmail.com" + '\'' +
                ", Serie='" + "XM234" + '\'' +
                '}', bos.toString(), "Afisare");
        System.setOut(originalOut);

    }
    @Test
    public void testIstoricAfis() {

        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Istoric x=new Istoric("20/12/2020","10/01/2021","Ion");
        System.out.print(x);
        Assertions.assertEquals("Nume Carte: "+"Ion"+", "+
                "Data Imprumutari: "+"20/12/2020"+", "+
                "Data Aduceri: "+"10/01/2021"+"\n", bos.toString(), "Afisare");
        System.setOut(originalOut);
    }
    @Test
    public void testSuspendariAfis()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Suspendari x=new Suspendari("5637892345678","Ion","ion@gmail.com","XM2345",12,"Harap-Alb","");
        System.out.print(x);

        Assertions.assertEquals("Suspendari{" +
                "cnpUtilizator='" + x.getCnpUtilizator() + '\'' +
                ", numeUtilizator='" + x.getNumeUtilizator() + '\'' +
                ", email='" + x.getEmail() + '\'' +
                ", serieUtilizator='" + x.getSerieUtilizator() + '\'' +
                ", idCarte=" + x.getIdCarte() +
                ", numeCarte='" + x.getNumeCarte() + '\'' +
                ", dataAcces='" + x.getDataAcces() + '\'' +
                '}', bos.toString(), "Afisare");
        System.setOut(originalOut);
    }
    @Test
    public void testIstoric()
    {
        Istoric x=new Istoric("20/12/2020","10/01/2021","Ion");
        Assertions.assertEquals("Ion",x.getC());
        Assertions.assertEquals("20/12/2020",x.getDataImprumut());
        Assertions.assertEquals("10/01/2021",x.getDataAducere());
    }
    @Test
    public void testAdministrator()
    {
        Administrator x=new Administrator("5012242323","Mihai Ioan","mihai@gmail.com","XM234","12345");
        Assertions.assertEquals("Mihai Ioan",x.getNumeUtilizator());
        Assertions.assertEquals("XM234",x.getSerieUtilizator());
    }
    @Test
    public void testSuspendari()
    {
        Suspendari x=new Suspendari("5637892345678","Ion","ion@gmail.com","XM2345",12,"Harap-Alb","");
        Assertions.assertEquals("Ion",x.getNumeUtilizator());
        Assertions.assertEquals("5637892345678",x.getCnpUtilizator());
        Assertions.assertEquals("ion@gmail.com",x.getEmail());
        Assertions.assertEquals(12,x.getIdCarte());
    }
}
