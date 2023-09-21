package Controler.Interfaces;

import Controler.ComplexNum;

// Действия, которые мы можем совершить с комплексными числами
public interface iCalculable {
    iCalculable sumComplex(ComplexNum n1, ComplexNum n2);
    iCalculable subComplex(ComplexNum n1, ComplexNum n2);
    iCalculable multiComplex(ComplexNum n1, ComplexNum n2);
    iCalculable divComplex(ComplexNum n1, ComplexNum n2);
    void getResult();
    static ComplexNum gettResult() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gettResult'");
    }
}