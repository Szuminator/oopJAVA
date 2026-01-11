public class Student implements Comparable<Student>{
    String name;
    double averageGrade;
    int yearOfBirth;

    public Student(String name, int yearOfBirth, double averageGrade) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.averageGrade, this.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
