package View;
import java.util.Scanner;

import Controler.ComplexNum;
import Controler.Interfaces.iCalculable;

public class ViewCalculator {

    public iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            double real1 = prompt("Введите действительную часть первого комплексного числа: ");
            double image1 = prompt("Введите мнимую часть первого комплексного числа: ");
            ComplexNum c1 = new ComplexNum(real1, image1);
            iCalculable result = new ComplexNum(0, 0);

            while (true) {
                String cmd = promptt("Введите команду (+, -, *, /, =) : ");
                if (cmd.equals("+")) {
                    double real2 = prompt("Введите действительную часть второго комплексного числа: ");
                    double image2 = prompt("Введите мнимую часть второго комплексного числа: ");
                    ComplexNum c2 = new ComplexNum(real2, image2);
                    result = result.sumComplex(c1, c2);
                    continue;
                }
               
                if (cmd.equals("-")) {
                    double real2 = prompt("Введите действительную часть второго комплексного числа: ");
                    double image2 = prompt("Введите мнимую часть второго комплексного числа: ");
                    ComplexNum c2 = new ComplexNum(real2, image2);
                    result = result.subComplex(c1, c2);
                    continue;
                }

                if (cmd.equals("*")) {
                    double real2 = prompt("Введите действительную часть второго комплексного числа: ");
                    double image2 = prompt("Введите мнимую часть второго комплексного числа: ");
                    ComplexNum c2 = new ComplexNum(real2, image2);
                    result = result.multiComplex(c1, c2);
                    continue;
                }
                    

                if (cmd.equals("/")) {
                    double real2 = prompt("Введите действительную часть второго комплексного числа: ");
                    double image2 = prompt("Введите мнимую часть второго комплексного числа: ");
                    ComplexNum c2 = new ComplexNum(real2, image2);
                    result = result.divComplex(c1, c2);
                    continue;
                }

                if (cmd.equals("=")) {
                    result.getResult();
                    break;
                }
                
            }
            break;
        }
    }

    private double prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextDouble();
    }

    private String promptt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
