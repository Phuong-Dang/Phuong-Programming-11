public class Student {
    //Fields
    private String firstName;
    private String lastName;
    private int grade;
    static int studentNum = 0;
    int idNum;

    //Constructor
    Student (){
        firstName = "";
        lastName = "";
        grade = 0;
        idNum = studentNum;
        studentNum++;
    }

    //Constructor
    Student (String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.idNum = studentNum;
        studentNum++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

        //Return and print out students' name and grade
        public String toString () {
            return "Name: " + this.firstName + " " + this.lastName + " - Grade: " + this.grade;

    }

}
