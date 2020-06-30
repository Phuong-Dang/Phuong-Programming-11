import java.util.ArrayList;

public class School {
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        public String getName() {

        return name;
        }
        public int getGrade () {
            return grade;
        }

        public void setGrade ( int grade){
            this.grade = grade;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }
        int grade;
        int age;
        String name;

    }
