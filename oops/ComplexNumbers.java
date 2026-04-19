package oops;

public class ComplexNumbers {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.complex(3, 3);
        Complex c2 = new Complex();
        c2.complex(3, 4);

        c1.add(c2);
        c1.dispalay();
    }

}

class Complex {

    int real;
    int imag;

    void complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    void add(Complex c) {
        this.real += c.real;
        this.imag += c.imag;
    }

    void dispalay() {
        System.out.println("(" + real + "," + imag + "i )");
    }

}
