package part_1;

public class CalculateNetSalary implements BaseSalary {
    int tax = (int) (baseSalary * 0.25);
    return baseSalary - tax;
    
}
