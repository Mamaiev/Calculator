package sample;

/**
 * Created by Dacha on 08.09.2015.
 */
public class Model {

    public double calculate(double a, double b, String operation) {

        switch (operation) {
            case "+": return  a + b;
            case "-": return  a - b;
            case "*": return  a * b;
            case "/": return  a / b;
        }
        return 0;
    }
}
