package logicaNegocio;


import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author DeveloperDreamTeam
 */
public class IntegerOperationsTest{
    
    private Object arg1 = "5";
    private Object arg2 = "10";

    public IntegerOperationsTest() {
    }
            
    /**
     * Test of div method, of class IntegerOperations.
     */
    @Test
    public void div() {
        System.out.println("Test : metodo div de la clase IntegerOperations");
        IntegerOperations instance = new IntegerOperations();
        Object expResult = Double.parseDouble(String.valueOf("0.5"));
        Object result = (Double)instance.div(arg1, arg2);
        assertEquals(expResult, result);
    }

    /**
     * Test of mult method, of class IntegerOperations.
     */
    @Test
    public void mult() {
        System.out.println("Test : metodo mult de la clase IntegerOperations"); 
        IntegerOperations instance = new IntegerOperations();
        Object expResult =   Integer.parseInt(String.valueOf("50"));
        Object result = (Integer)instance.mult(arg1, arg2);
        assertEquals(expResult, result);
    }

    /**
     * Test of substraction method, of class IntegerOperations.
     */
    @Test
    public void substraction() {
        System.out.println("Test : metodo substraction de la clase IntegerOperations");        
        IntegerOperations instance = new IntegerOperations();
        Object expResult =  Integer.parseInt(String.valueOf("-5"));
        Object result = (Integer)instance.substraction(arg1, arg2);
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class IntegerOperations.
     */
    @Test
    public void sum() {
        System.out.println("Test : metodo sum de la clase IntegerOperations");        
        IntegerOperations instance = new IntegerOperations();
        Object expResult =  Integer.parseInt(String.valueOf("15"));
        Object result = (Integer)instance.sum(arg1, arg2);
        assertEquals(expResult, result);
    }
}