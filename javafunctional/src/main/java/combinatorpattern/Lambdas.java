package combinatorpattern;



import java.util.function.BiFunction;

public class Lambdas {
    public static void main(String[] args) {

        Integer number = null;
        int counter = 0;


    BiFunction<String, Integer, String> upperCasesName = (name, age) -> {
        if (name.isBlank()) throw new IllegalArgumentException("");
        System.out.println(age);
        return name.toUpperCase();
    };

        System.out.println(upperCasesName.apply("Alex", null));

    }
}
// Pure functional programming has a set of rules to follow
//===========================
//-No state
//===========================
//- Pure Functions
//===========================
//- No Side Effects
//===========================
//- Higher Order Functions
//===============================================================================
//    * The function takes one or more functions as parameters.
//    * The function returns another function as result.
//===============================================================================