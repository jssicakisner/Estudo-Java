package classes_objetos_atributos;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", "Sample College", "123 Main Street");

        // Access and print the student details
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("College Name: " + student.getCollegeName());
        System.out.println("Address: " + student.getAddress());

        // Update student information
        student.setStudentName("Jane Smith");
        student.setAddress("456 Elm Street");

        // Print updated student information
        System.out.println("\nUpdated Student Information:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("College Name: " + student.getCollegeName());
        System.out.println("Address: " + student.getAddress());
    }
}
