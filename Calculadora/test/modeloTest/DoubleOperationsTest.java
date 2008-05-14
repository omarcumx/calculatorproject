package modeloTest;

import modelo.DoubleOperations;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author DeveloperDreamTeam
 */
public class DoubleOperationsTest {

    private Object arg1 = "5.0";
    private Object arg2 = "10.0";

    public DoubleOperationsTest() {
    }

    /**
     * Test of div method, of class DoubleOperations.
     */
    @Test
    public void div() {
        System.out.println("Test : metodo div de la clase DoubleOperations");
        DoubleOperations instance = new DoubleOperations();
        Object expResult = Double.parseDouble(String.valueOf("0.5"));
        Object result = (Double) instance.div(arg1, arg2);
        assertEquals(expResult, result);
    }

    /**
     * Test of mult method, of class DoubleOperations.
     */
    @Test
    public void mult() {
        System.out.println("Test : metodo mult de la clase DoubleOperations");
        DoubleOperations instance = new DoubleOperations();
        Object expResult = Double.parseDouble(String.valueOf("50.0"));
        Object result = (Double) instance.mult(arg1, arg2);
        assertEquals(expResult, result);
    }

    /**
     * Test of substraction method, of class DoubleOperations.
     */
    @Test
    public void substraction() {
        System.out.println("Test : metodo substraction de la clase DoubleOperations");
        DoubleOperations instance = new DoubleOperations();
        Object expResult = Double.parseDouble(String.valueOf("-5.0"));
        Object result = (Double) instance.substraction(arg1, arg2);
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class DoubleOperations.
     */
    @Test
    public void sum() {
        System.out.println("Test : metodo sum de la clase DoubleOperations");
        DoubleOperations instance = new DoubleOperations();
        Object expResult = Double.parseDouble(String.valueOf("15.0"));
        Object result = (Double) instance.sum(arg1, arg2);
        assertEquals(expResult, result);
    }
}
