public class Demo {
    public static void main(String[] args) {
        double commonBasicSalary = 1000.0;
        double commonMedical = 100.0;

        Employee e1 = new Employee("A", commonBasicSalary, commonMedical);
        Employee e2 = new Employee("A", commonBasicSalary, commonMedical);

        System.out.println(e1.getEmployeeId());
        System.out.println(e2.getEmployeeId());
    }
}
