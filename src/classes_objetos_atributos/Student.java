package classes_objetos_atributos;

public class Student {
    private int studentId;
    private String studentName;
    private String collegeName;
    private String address;

    // Constructor
    public Student(int studentId, String studentName, String collegeName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
