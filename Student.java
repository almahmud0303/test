public class Student {
    // Fields
    private String name;
    private int age;
    private String studentId;
    private String grade;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, int age, String studentId, String grade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Optional: toString method for easy printing
    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", studentId='" + studentId + '\'' +
               ", grade='" + grade + '\'' +
               '}';
    }

    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student("Alice", 20, "S123", "A");
            System.out.println(s1);
    
            s1.setGrade("A+");
            System.out.println("Updated grade: " + s1.getGrade());
        }
    }
    
}
