package logicaNegocio;

/**
 *
 * @author DeveloperDreamTeam
 */
public class ComplexOperations implements Operations{
    
    Complex resultado = new Complex();
    Complex arg1C= new Complex();
    Complex arg2C = new Complex();
    
    public Object div(Object arg1, Object arg2) {
        Complex arg1Co=(Complex)arg1;
        Complex arg2Co=(Complex)arg2;                
        Complex numerador=new Complex();
        Complex denominador=new Complex();
        
        Complex conjugado=new Complex(arg2Co.getReal(),arg2Co.getImag()*-1.0);                        
        numerador.setReal(arg1Co.getReal()*conjugado.getReal()-arg1Co.getImag()*conjugado.getImag());
        numerador.setImag(arg1Co.getReal()*conjugado.getImag()+conjugado.getReal()*arg1Co.getImag());        
        denominador.setReal(arg2Co.getReal()*conjugado.getReal()-arg2Co.getImag()*conjugado.getImag());
        denominador.setImag(arg2Co.getReal()*conjugado.getImag()+conjugado.getReal()*arg2Co.getImag());
        
        resultado.setReal(numerador.getReal()/denominador.getReal());
        resultado.setImag(numerador.getImag()/denominador.getReal());                  
        return resultado;
    }

    public Object mult(Object arg1, Object arg2) {
        arg1C=(Complex)arg1;
        arg2C=(Complex)arg2;
        resultado.setReal(arg1C.getReal()*arg2C.getReal()-arg1C.getImag()*arg2C.getImag());
        resultado.setImag(arg1C.getReal()*arg2C.getImag()+arg2C.getReal()*arg1C.getImag());
        return resultado;
    }

    public Object substraction(Object arg1, Object arg2) {
        arg1C=(Complex)arg1;
        arg2C=(Complex)arg2;
        resultado.setReal(arg1C.getReal()-arg2C.getReal());
        resultado.setImag(arg1C.getImag()-arg2C.getImag());
        return resultado;
    }

    public Object sum(Object arg1, Object arg2) {        
        arg1C=(Complex)arg1;
        arg2C=(Complex)arg2;
        resultado.setReal(arg1C.getReal()+ arg2C.getReal() );
        resultado.setImag(arg1C.getImag()+ arg2C.getImag());
        return resultado;
    }
}
