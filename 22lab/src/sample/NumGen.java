package sample;

import javafx.beans.property.SimpleStringProperty;

public class NumGen {
    private SimpleStringProperty num1;
    private SimpleStringProperty num2;

    public NumGen(String num1, String num2) {
        this.num1 = new SimpleStringProperty(num1);
        this.num2 = new SimpleStringProperty(num2);
    }

    public NumGen() {
        this.num1 = new SimpleStringProperty("0");
        this.num2 = new SimpleStringProperty("0");
    }

    public String getNum1() {
        return num1.get();
    }

    public void setNum1(String num1) {
        this.num1.set(num1);
    }

    public String getNum2() {
        return num2.get();
    }

    public void setNum2(String num2) {
        this.num2.set(num2);
    }
}

