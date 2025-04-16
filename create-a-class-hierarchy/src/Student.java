public class Student extends Person {
    String subject;
    Teacher teacher;

    public Student(String name, Date date, Teacher teacher, String subject) {
        this.name = name;
        this.dob = date;
        this.teacher = teacher;
        this.subject = subject;
    }

    @Override
    public void getDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("DOB: " + this.dob);
        System.out.println("Teacher: " + this.teacher);
        System.out.println("Subject: " + this.subject);
    }
}
