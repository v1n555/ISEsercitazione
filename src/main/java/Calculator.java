import java.util.stream.DoubleStream;

public class Calculator {


    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    public int sottrazione(int a,int b){
        return a-b;
    }
    public int divisione(int a,int b){
        if(b!=0)
        return a/b;
        else return 0;
    }
    private int a,b;
}