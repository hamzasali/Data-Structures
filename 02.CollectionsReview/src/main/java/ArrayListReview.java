import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class

        List<Student> students = new ArrayList<>();

        // Add elements to ArrayList
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));


        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        System.out.println("Printing with for loop");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // 2. Iterator
        // Forward Iteration


        // Backwards Iteration

        // 3. for each loop


        // 4. Lambda

        // Sorting Elements in List
    }

}
