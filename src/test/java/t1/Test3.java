package t1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import p2.Administrator;
import p2.Istoric;
import p2.Suspendari;
import p4.Butoane;

import javax.swing.*;

public class Test3 {
    @Test
    public void test1()
    {
        JTextField x= Butoane.textField(200,200,100,30,30);
        Assertions.assertFalse((null == x));
    }
    @Test
    public void test2()
    {
        JTextPane x=Butoane.textPane(200,200,200,100,"");
        Assertions.assertFalse((null == x));
    }
    @Test
    public void test3()
    {
        Assertions.assertTrue(Butoane.isDigit("1234"));
        Assertions.assertFalse(Butoane.isDigit("1245T"));
    }
    @Test
    public void test4()
    {
        Assertions.assertTrue(Butoane.isAlpha("ana"));
        Assertions.assertFalse(Butoane.isAlpha("ana2"));
    }
    @Test
    public void test5()
    {
        JButton x=Butoane.butonInapoi(20);
        Assertions.assertFalse((null == x));
    }
    @Test
    public  void test6()
    {
        Assertions.assertFalse((null == Butoane.setNext(100, 100)));
    }
    @Test
    public void test7()
    {
        Assertions.assertFalse((null == Butoane.passwordField(100, 100, 50, 50)));
    }
    @Test
    public void test8()
    {
        Assertions.assertFalse((null == Butoane.normal(200, 200, 100, 30, "")));
    }
}
