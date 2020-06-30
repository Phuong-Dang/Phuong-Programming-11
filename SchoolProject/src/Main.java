import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Students
        ArrayList<Student> students = new ArrayList<>();

        //Adding Students
        Student Heather = new Student ("Heather", "Graham", (int)(Math.random()*10));
        students.add (Heather);

        Student Troy = new Student ("Troy", "Yates", (int)(Math.random()*10));
        students.add(Troy);

        Student Gracie = new Student ("Gracie", "Hensley", (int)(Math.random()*10));
        students.add(Gracie);

        Student Aimee = new Student ("Aimee", "Pearce", (int)(Math.random()*10));
        students.add(Aimee);

        Student  Evie = new Student ("Evie", "Barr", (int)(Math.random()*10));
        students.add (Evie);

        Student Tiffany = new Student ("Tiffany", "Yoder", (int)(Math.random()*10));
        students.add (Tiffany);

        Student Rhiannon  = new Student ("Rhiannon", "Zamora", (int)(Math.random()*10));
        students.add (Rhiannon);

        Student Rachel  = new Student ("Rachel", "Charles", (int)(Math.random()*10));
        students.add(Rachel);

        Student Antonia = new Student ("Antonia", "Page", (int)(Math.random()*10));
        students.add(Antonia);

        Student Jessie = new Student ("Jessie", "Jefferson", (int)(Math.random()*10));
        students.add(Jessie);


        //Printing Student Names
        System.out.println("\nStudents List");
        System.out.println(students);

        //Removing Students
        students.remove(Heather);
        students.remove (Evie);
        students.remove (Jessie);
        System.out.println("\nNew Student List");
        System.out.println(students);


        System.out.println("\n-----------------------------------------------------------------\n");

        //Teachers
        ArrayList<Teacher> teachers = new ArrayList<>();

        //Adding Teachers
        Teacher Ethan = new Teacher("Ethan", "Klein", "Math");
        Teacher Patrick = new Teacher ("Patrick", "Howard", "History" );
        Teacher Stacy = new Teacher("Stacy", "Andrews", "Literature");

        teachers.add(Ethan);
        teachers.add(Patrick);
        teachers.add(Stacy);

        //Printing Teachers
        System.out.println("Teachers List");
        System.out.println(teachers);

        teachers.remove(Ethan);
        System.out.println("\nNew Teachers List");
        System.out.println(teachers);
    }
}