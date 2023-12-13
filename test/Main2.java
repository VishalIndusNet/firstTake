import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 78.45, "BFS"));
        students.add(new Student("Alice", 65.32, "CSE"));
        students.add(new Student("Bob", 92.10, "ECE"));
        students.add(new Student("Eva", 75.80, "BFS"));

        
        Collections.sort(students);

       
        System.out.println("Sorted Results based on Percentage:");
       for (Student student : students) {
            System.out.println(student);
        }

    }
}
class Student implements Comparable<Student> {
     String studentName;
     double percentage;
     String department;

    public Student(String studentName, double percentage, String department) {
        this.studentName = studentName;
        this.percentage = percentage;
        this.department = department;
    }

   
   
     public int compareTo(Student o ){
            return Double.compare(this.percentage, o.percentage);
        }
        public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", percentage=" + percentage +
                ", department='" + department + '\'' +
                '}';
    }
          
}
