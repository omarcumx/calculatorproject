/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaNegocio;

/**
 *
 * @author Administrador
 */
public class IntegerOperations implements Operations {

    public Object div(Object arg1, Object arg2) {
        if (Integer.parseInt((String) arg1) % Integer.parseInt((String) arg2) == 0){
            return Integer.parseInt((String) arg1) / Integer.parseInt((String) arg2);
        }
        else{
            return Double.parseDouble((String) arg1) / Double.parseDouble((String) arg2);
        }
    }

    public Object mult(Object arg1, Object arg2) {
        return Integer.parseInt((String) arg1) * Integer.parseInt((String) arg2);
    }

    public Object substraction(Object arg1, Object arg2) {
        return Integer.parseInt((String) arg1) - Integer.parseInt((String) arg2);
    }

    public Object sum(Object arg1, Object arg2) {
        return Integer.parseInt((String) arg1) + Integer.parseInt((String) arg2);
    }
}

