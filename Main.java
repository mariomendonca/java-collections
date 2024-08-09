import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Class> classes = new ArrayList<>();
        Class c1 = new Class("Math", 60);
        Class c2 = new Class("Chem", 40);
        Class c3 = new Class("Bio", 45);
        Class c4 = new Class("Hist", 80);

        classes.add(c1);
        classes.add(c2);
        classes.add(c3);
        classes.add(c4);

        System.out.println(classes);
        System.out.println("+++++++++++++++++++++++++++++++");
        Collections.sort(classes);
        System.out.println(classes);
        System.out.println("+++++++++++++++++++++++++++++++");

        classes.sort(Comparator.comparing(Class::getMinutes));
        System.out.println(classes);


        System.out.println("+++++++++++++++++++++++++++++++");
        Course course1 = new Course("Learning Java", "Mario Mendonca");
        course1.addNewClass(c1);
        System.out.println(course1.getClasses());

        System.out.println("+++++++++++++++++++++++++++++++");

        Set<String> students = new HashSet<>();
        students.add("Mario");
        students.add("Joao");
        students.add("Jose");

        System.out.println(students);

        students.forEach(student -> System.out.println("aluno: " + student));
        System.out.println("+++++++++++++++++++++++++++++++");

        Student a1 = new Student("Mario", "123123");
        Student a2 = new Student("Joca", "123124");
        Student a3 = new Student("Joao", "123125");

        course1.addStudent(a1);
        course1.addStudent(a2);
        course1.addStudent(a3);

        System.out.println(course1.getStudents());
        System.out.println("+++++++++++++++++++++++++++++++");

        System.out.println(course1.isSubscribed(a1));

        System.out.println(course1.hashCode());
        System.out.println(course1);
        System.out.println(course1.getStudents().stream().findFirst().get().hashCode());
        System.out.println("+++++++++++++++++++++++++++++++");

        System.out.println("for");
        for (Student student : course1.getStudents()) {
            System.out.println(student);
        }

        Iterator<Student> iterator = course1.getStudents().iterator();

        System.out.println("iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
