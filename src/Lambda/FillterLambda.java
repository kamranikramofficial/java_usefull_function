package Lambda;

import java.util.Arrays;

public class FillterLambda {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

//         Filter values greater than 25
        int[] filtered = Arrays.stream(arr)
                .filter(x -> x < 25)
                .toArray();

        int[] use ;
        Arrays.stream(filtered).forEach((a) -> System.out.println(a));

    }
}