import java.util.*;

public class Course {
    private String name;
    private String teacher;
    private List<Class> classes = new ArrayList<>();
    private Set<Student> students = new LinkedHashSet<>();

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Class> getClasses() {
        return Collections.unmodifiableList(classes);
    }

    public void addNewClass(Class newClass) {
        this.classes.add(newClass);
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Boolean isSubscribed(Student student) {
        return students.contains(student);
    }
}
