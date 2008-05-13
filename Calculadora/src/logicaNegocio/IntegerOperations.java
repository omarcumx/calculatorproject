package logicaNegocio;

/**
 *
 * @author DeveloperDreamTeam
 */
public class IntegerOperations implements Operations {

    public Object div(Object arg1, Object arg2) {
        if (Integer.parseInt(String.valueOf(arg1)) % Integer.parseInt(String.valueOf(arg2)) == 0) {
            return Integer.parseInt(String.valueOf(arg1)) / Integer.parseInt(String.valueOf(arg2));
        } else {
            return Double.parseDouble(String.valueOf(arg1)) / Double.parseDouble(String.valueOf(arg2));
        }
    }

    public Object mult(Object arg1, Object arg2) {
        return Integer.parseInt(String.valueOf(arg1)) * Integer.parseInt(String.valueOf(arg2));
    }

    public Object substraction(Object arg1, Object arg2) {
        return Integer.parseInt(String.valueOf(arg1)) - Integer.parseInt(String.valueOf(arg2));
    }

    public Object sum(Object arg1, Object arg2) {
        return Integer.parseInt(String.valueOf(arg1)) + Integer.parseInt(String.valueOf(arg2));
    }
}
