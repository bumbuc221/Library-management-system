package t1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import p2.*;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    @Test
    public void testIstoric()
    {
        Istoricul x=new Istoricul(203,"5634278967234","Maria",20,"Harap-Alb","Povestiri","2022-01-01","2022-01-14","Intarziat");
        Assertions.assertEquals(203,x.getId());
        Assertions.assertEquals("Maria",x.getNumeUtilizator());
        Assertions.assertEquals(20,x.getIdCarte());
        Assertions.assertEquals("Intarziat",x.getStatus());
    }
    @Test
    public void testSuspendari()
    {
        Suspendari x=new Suspendari("5436789345123","Ion","ion@gmail.com","XM2345",30,"Maitrey","2022-01-31");
        Assertions.assertEquals(30,x.getIdCarte());
        Assertions.assertEquals("ion@gmail.com",x.getEmail());
        Assertions.assertEquals("5436789345123",x.getCnpUtilizator());
    }
    @Test
    public void testUtilizatorNormal()
    {
        List<Istoric> a=new ArrayList<>();
        UtilizatorNormal x=new UtilizatorNormal("3657893546273","Maria","mari@gmail.com","XM2346","2022-20-10",0,0,false,null,a);
        Assertions.assertFalse(x.isSuspendat());
        Assertions.assertEquals(0,x.getPunctePlus());
    }
    @Test
    public void testCarte()
    {
        Carte x=new Carte(12,"Harap-Alb","Ion Creanga","Disponibil",0,"Povestiri","Fantastic","Actiunile unui personaj pentru a ajunge imparat.","harap...",50,4,5,null,5);
        Assertions.assertEquals(12,x.getId());
        Assertions.assertEquals("Ion Creanga",x.getAutorCarte());
        Assertions.assertTrue(x.isDisponibilitate());
        Assertions.assertEquals("Povestiri", x.getCategorie());
        CarteSpeciala x2=new CarteSpeciala(14,"Amurg","","Disponibil",100,"Roman","Iubire","","",500,10,2,2,50,500,"");
        Assertions.assertEquals(100,x2.getPuncte());
        Assertions.assertEquals(500,x2.getNrPagini());
        Assertions.assertEquals(500,x2.getRaritate());
    }
}
