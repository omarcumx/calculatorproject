package logicaNegocio;

import logicaNegocio.Complex;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DeveloperDreamTeam
 */
public class ComplexOperationsTest {    
    
    Complex arg1=new Complex(1.0,2.0);
    Complex arg2=new Complex(3.0,4.0);
    
    public ComplexOperationsTest() {               
    }

    /**
     * Test of div method, of class ComplexOperations.
     */
    @Test
    public void div() {
        System.out.println("Test : metodo mult de la clase ComplexOperations");
        ComplexOperations instance = new ComplexOperations();
        Complex expResult = new Complex(11.0/25.0,2.0/25.0);
        Complex result = (Complex)instance.div(arg1, arg2);
        assertEquals(expResult.getReal(),result.getReal() ); 
        assertEquals(expResult.getImag(),result.getImag() );
    }

    /**
     * Test of mult method, of class ComplexOperations.
     */
    @Test
    public void mult() {
        System.out.println("Test : metodo mult de la clase ComplexOperations");
        ComplexOperations instance = new ComplexOperations();
        Complex expResult = new Complex(-5,10);
        Complex result = (Complex)instance.mult(arg1, arg2);
        assertEquals(expResult.getReal(),result.getReal() ); 
        assertEquals(expResult.getImag(),result.getImag() );       
    }

    /**
     * Test of substraction method, of class ComplexOperations.
     */
    @Test
    public void substraction() {
        System.out.println("Test : metodo substraction de la clase ComplexOperations");
        ComplexOperations instance = new ComplexOperations();
        Complex expResult = new Complex(-2,-2);
        Complex result = (Complex)instance.substraction(arg1, arg2);
        assertEquals(expResult.getReal(),result.getReal() ); 
        assertEquals(expResult.getImag(),result.getImag() );
    }

    /**
     * Test of sum method, of class ComplexOperations.
     */
    @Test
    public void sum() {
        System.out.println("Test : metodo sum de la clase ComplexOperations");
        ComplexOperations instance = new ComplexOperations();
        Complex expResult = new Complex(4.0,6.0);
        Complex result = (Complex)instance.sum(arg1, arg2);
        assertEquals(expResult.getReal(),result.getReal() ); 
        assertEquals(expResult.getImag(),result.getImag() );
    }
}