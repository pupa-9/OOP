import Controler.ComplexNum;
import Controler.Interfaces.iCalculable;
import View.ViewCalculator;



public class App {
    public static void main(String[] args) throws Exception {
        
        iCalculable calculator = new ComplexNum(0, 0);


        // iCalculable decorator = new Decorator(new Calculator(0), new Logger());

        ViewCalculator view = new ViewCalculator(calculator);
        // ViewCalculator view = new ViewCalculator(decorator);
        view.run();
    }  

        
}
