import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        Predicate<Integer> test = (i)->(i%2==0);
        System.out.println(test.test(10));

    }
}
