package Controler;

import Controler.Interfaces.iCalculable;

public class ComplexNum implements iCalculable {
    public double real, image;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public ComplexNum(double real, double image){
        this.real = real;
        this.image = image;
    }

    // public void showC()
    // {
    //     System.out.print(this.real + "+" + this.image + "i");
    // }

    // сложение действительных частей обоих комплексных чисел
    @Override
    public ComplexNum sumComplex(ComplexNum n1, ComplexNum n2) {
        double real = n1.getReal() + n2.getReal();
        double image = n1.getImage() + n2.getImage();

        return new ComplexNum(real,image);
    }

    @Override
    public ComplexNum multiComplex(ComplexNum n1, ComplexNum n2) {
        double real = (n1.getReal() * n2.getReal()) - (n1.getImage() * n2.getImage());
        double image = (n1.getReal() * n2.getImage()) + (n1.getImage()*n2.getReal());

        return new ComplexNum(real,image);
    }

    @Override
    public ComplexNum divComplex(ComplexNum n1, ComplexNum n2) {
        double real = ((n1.getReal() * n2.getReal()) + (n1.getImage() * n2.getImage()))/((n2.getReal()*n2.getReal()) + (n2.getImage()*n2.getImage()));
        double image = ((n2.getReal() * n1.getImage()) - (n1.getReal()*n2.getImage()))/((n2.getReal()*n2.getReal()) + (n2.getImage()*n2.getImage()));

        return new ComplexNum(real,image);
    }

    @Override
    public iCalculable subComplex(ComplexNum n1, ComplexNum n2) {
        double real = n1.getReal() - n2.getReal();
        double image = n1.getImage() - n2.getImage();

        return new ComplexNum(real,image);
    }

    @Override
    public void getResult() {
        
        System.out.print("Ваш результат: " + this.real + "+" + this.image + "i"  + "\n");
        
    }

    
    public ComplexNum gettResult() {
        ComplexNum result = new ComplexNum(this.real,this.image);

        return result;
    }

    // public ComplexNum gettResult() {
    //     return new ComplexNum(real,image);
    // }

    // @Override
    // public iCalculable getResult() {
    //     ComplexNum result = new ComplexNum(real, image);
    //     // return double real,image;
    //     return new ComplexNum(result.getReal(), result.getImage());
    // }

    

}
