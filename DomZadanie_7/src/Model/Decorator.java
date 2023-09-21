package Model;
import Controler.ComplexNum;
import Controler.Logger;
import Controler.Interfaces.iCalculable;

public class Decorator implements iCalculable {

    private ComplexNum oldCalculator;
    private Logger logger;

    

    public Decorator(ComplexNum oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public iCalculable sumComplex(ComplexNum n1, ComplexNum n2) {
               
        // iCalculable result = oldCalculator.gettResult();
        
        logger.log(String.format("Начало вызова метода sumComplex с параметрами"));
        iCalculable result = oldCalculator.sumComplex(n1, n2);
        logger.log(String.format("Вызов метода sum произошел"));

        return result;

    }

    @Override
    public iCalculable subComplex(ComplexNum n1, ComplexNum n2) {
        logger.log(String.format("Начало вызова метода sumComplex с параметрами"));
        iCalculable result = oldCalculator.subComplex(n1, n2);
        logger.log(String.format("Вызов метода sum произошел"));

        return result;
    }



    @Override
    public iCalculable multiComplex(ComplexNum n1, ComplexNum n2) {
        logger.log(String.format("Начало вызова метода sumComplex с параметрами"));
        iCalculable result = oldCalculator.multiComplex(n1, n2);
        logger.log(String.format("Вызов метода sum произошел"));

        return result;
    }



    @Override
    public iCalculable divComplex(ComplexNum n1, ComplexNum n2) {
         logger.log(String.format("Начало вызова метода sumComplex с параметрами"));
        iCalculable result = oldCalculator.divComplex(n1, n2);
        logger.log(String.format("Вызов метода sum произошел"));

        return result;
    }



    @Override
    public void getResult() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResult'");
    }

}
