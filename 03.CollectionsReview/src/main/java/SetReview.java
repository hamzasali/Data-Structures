import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> set = new LinkedHashSet<>();


        // 2 add element
        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));
        System.out.println(set.add(new Student(4, "Mary")));

//        System.out.println(set);
        String str = "Java Developer";

        System.out.println(firstRepeatingChar(str));

    }

    public static Character firstRepeatingChar(String str) {
        Set<Character> result = new LinkedHashSet<>();
        char[] eachChar = str.toCharArray();

        for (Character each : eachChar) {
            if (!result.add(each)) return each;
        }
        return null;
    }
}
