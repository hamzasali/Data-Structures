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
        System.out.println("Printing with iterator---------------");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        // Backwards Iteration
        System.out.println("Printing Backward with iterator---------------");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }

        // 3. for each loop
        System.out.println("Printing with for each loop");
        for (Student student : students) {
            System.out.println(student);
        }


        // 4. Lambda
        System.out.println("Printing with lambda");
        students.forEach(student -> System.out.println(student));

        // Sorting Elements in List
        System.out.println("Printing in descending order by Id ");
        Collections.sort(students, new sortByIdDescending());
        students.forEach(student -> System.out.println(student));

        System.out.println("Printing in descending order by name ");
        Collections.sort(students, new sortByNameDescending());
        students.forEach(student -> System.out.println(student));
    }

    static class sortByIdDescending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }

    }

    static class sortByNameDescending implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }

    }
}
