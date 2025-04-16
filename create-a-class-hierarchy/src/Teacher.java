public class Teacher extends Employee {
    String qualifications;

    public Teacher(String name, Date dob, Date appointment, String qualifications, int salary) {
        this.name = name;
        this.dob = dob;
        this.dateOfAppointment = appointment;
        this.qualifications = qualifications;
        this.salary = salary;
    }

    @Override
    public void setSalary(int sal) {
        this.salary = sal;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Appointment Date: " + dateOfAppointment);
        System.out.println("Qualifications: " + qualifications);
        System.out.println("Salary: " + salary);
    }

    @Override
    public String toString() {
        return this.name; // Return the teacher's name
    }
}
