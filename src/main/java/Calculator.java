import java.util.stream.DoubleStream;

public class Calculator {

    private int a, b;

    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    public int somma(int a, int b) {
        return a + b;
    }

    public int moltiplicazione(int a, int b) {
        return a * b;
    }

    public int sottrazione(int a, int b) {
        return a - b;
    }

    public int divisione(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        else return 0;
    }
}