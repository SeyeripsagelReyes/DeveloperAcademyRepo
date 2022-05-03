public class Main {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        Staff staff = new Staff();

        faculty.setName("Mary");
        faculty.setSalary(2000);
        faculty.setDepartment("Majesco");

        staff.setName("John");
        staff.setSalary(3000);
        staff.setJobTitle("Jr Dev");



        System.out.println(faculty.toString()+"\t Department: "+faculty.getDepartment());

        System.out.println();

        System.out.println(staff.toString()+"\t Job Title: "+staff.getJobTitle());
        
    }
}
