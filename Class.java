public class Class implements Comparable<Class> {
    private String name;
    private int minutes;

    public Class(String name, int minutes) {
        this.name = name;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", minutes=" + minutes +
                '}';
    }

    @Override
    public int compareTo(Class anotherClass) {
        return this.name.compareTo(anotherClass.getName());
    }
}
