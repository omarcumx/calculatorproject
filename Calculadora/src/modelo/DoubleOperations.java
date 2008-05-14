package modelo;

/**
 *
 * @author DeveloperDreamTeam
 */
public class DoubleOperations implements Operations {

    public Object div(Object arg1, Object arg2) {
        return Double.parseDouble(String.valueOf(arg1)) / Double.parseDouble(String.valueOf(arg2));
    }

    public Object mult(Object arg1, Object arg2) {
        return Double.parseDouble(String.valueOf(arg1)) * Double.parseDouble(String.valueOf(arg2));
    }

    public Object substraction(Object arg1, Object arg2) {
        return Double.parseDouble(String.valueOf(arg1)) - Double.parseDouble(String.valueOf(arg2));
    }

    public Object sum(Object arg1, Object arg2) {
        return Double.parseDouble(String.valueOf(arg1)) + Double.parseDouble(String.valueOf(arg2));
    }
}
