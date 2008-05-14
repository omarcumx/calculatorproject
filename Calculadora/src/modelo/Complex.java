package modelo;

/**
 *
 * @author DeveloperDreamTeam
 */
public class Complex {

    private double real;
    private double imag;

    public Complex() {
        real = 0.0;
        imag = 0.0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
}

