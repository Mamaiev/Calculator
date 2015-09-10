package sample;


import com.sun.javafx.image.IntPixelGetter;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    String a = "";
    String b = "";
    double number = 0;
    int result;
    char c;
    private String operator = "";
    public Button buttonNumber;
    public TextField text;
    private Model model = new Model();
    boolean start = true;


    public void VariableText() {
//        if (a.equals("") && b.equals("")) a = text.getText();
//        else if (!a.equals("") && b.equals("")) b = text.getText();
//        else if (!a.equals("") && !b.equals("")) {a = text.getText(); b = "";}
        System.out.println("a = " + a + "b = " + "c = " + c);
    }


//    public void PlusButtonClicked(){
//        if (text.getText().matches("\\+")) {resultButtonClicked();
//            text.setText(result + " + ");}
//        else {
//            a = text.getText();
//            text.setText(text.getText() + " + ");
//            text.positionCaret(text.getText().length());
//            c = '+';
//        }
//
//    }
//    public void MinusButtonClicked(){
//        if (text.getText().matches("[\\+]+")) {resultButtonClicked();
//            text.setText(result + " - ");}
//        else {
//            a = text.getText();
//            text.setText(text.getText() + " - ");
//            text.positionCaret(text.getText().length());
//            c = '-';
//        }
//
//    }
//    public void MultiplyButtonClicked(){
//        if (!text.getText().matches("\\d")) {resultButtonClicked();
//            text.setText(result + " * ");}
//        else {
//            a = text.getText();
//            text.setText(text.getText() + " * ");
//            text.positionCaret(text.getText().length());
//            c = '*';
//        }
//
//    }
//    public void DivisionButtonClicked(){
//        if (text.getText().matches("[+=/*]")) {resultButtonClicked();
//            text.setText(result + " / ");}
//        else {
//            a = text.getText();
//            text.setText(text.getText() + " / ");
//            text.positionCaret(text.getText().length());
//            c = '/';
//        }
//    }
//    public void resultButtonClicked(){
//        if (text.getText().split(" ").length > 2) {
//            a = text.getText().split(" ")[0];
//            b = text.getText().split(" ")[2];
//        } else {
//            a = text.getText().split(" ")[0];
//            b = a;
//        }
//        System.out.println("a = " + a + " b = " + b + " c = " + c);
//        int a1 = Integer.parseInt(a);
//        int a2 = Integer.parseInt(b);
//        switch (c) {
//            case '+': result = a1 + a2; break;
//            case '-': result = a1 - a2; break;
//            case '*': result = a1 * a2; break;
//            case '/': try {result = a1 / a2; break;} catch (Exception e) {
//                text.setText("Cabbom!!!!!!!"); break;
//            }
//        }
//        System.out.println(a1 + " " + a2);
//
//        text.setText(result + "");
//
//    }

    public void numberButtonClicked(ActionEvent e){
        if (start) {
            text.setText("");
            start = false;
        }
        String a;
        a = ((Button)e.getSource()).getText();
        text.setText(text.getText() + a);
        text.positionCaret(text.getText().length());
    }


    public void operationButtonClicked(ActionEvent e){
        String operation;
        operation = ((Button)e.getSource()).getText();

        if (!operation.equals("=")) {
            if (!operator.isEmpty()) return;
            operator = operation;
            number = Double.parseDouble(text.getText());
            text.setText("");
        }
        else {
            if (operator.isEmpty()) return;
            text.setText(String.valueOf(model.calculate(number,Double.parseDouble(text.getText()), operator)));
            start = true;
//            operator = "";
        }
    }


    public void cosButtonClicked(){
        int x = (int)Math.cos(Double.parseDouble(text.getText()));
        text.setText(x + "");
    }

    public void sinButtonClicked(){
        int x = (int)Math.sin(Double.parseDouble(text.getText()));
        text.setText(x + "");    }

    public void tanButtonClicked(){
       int x = (int)Math.tan(Double.parseDouble(text.getText()));
        text.setText(x + "");
    }
    public void ctanButtonClicked(){
        int x = (int)Math.atan(Double.parseDouble(text.getText()));
        text.setText(x + "");
    }



}