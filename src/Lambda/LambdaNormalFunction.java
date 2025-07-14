package Lambda;


import java.util.function.BinaryOperator;

public class LambdaNormalFunction {
public static void main(String[] args) {

    BinaryOperator<Integer> multiply = (a, b) -> a * b;
    int vale = multiply.apply(2,2);
    System.out.println(vale);


    }
}
