public class Main {
    public static void main(String[] args) {
        Date dobStudent = new Date(5,5,1995);
        Date dobTeacher =  new Date(9,9,1985);
        Date dateOfAppointment = new Date(8,8, 2008);

        Teacher teacher= new Teacher("Madhavan", dobTeacher, dateOfAppointment, "MTech", 50000  );

        Student student1 = new Student("Belinda", dobStudent, teacher, "Electronics");

        teacher.getDetails();
        student1.getDetails();
    
    }
}
