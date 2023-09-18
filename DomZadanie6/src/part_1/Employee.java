package part_1;
public class Employee {
//     1) Переписать код в соответствии с Single Responsibility Principle:

    // public class Employee {
    //     private String name;
    //     private Date dob;
    //     private int baseSalary;

    //     public Employee(String name, Date dob, int baseSalary) {
    //         this.name = name;
    //         this.dob = dob;
    //         this.baseSalary = baseSalary;
    //     }

    //     public String getEmpInfo() {
    //         return "name - " + name + " , dob - " + dob.toString();
    //     }
        
    //     public int calculateNetSalary() {
    //         int tax = (int) (baseSalary * 0.25);//calculate in otherway
    //         return baseSalary - tax;


    private String name;
    private Date dob;
        
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
