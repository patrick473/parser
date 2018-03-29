package view;

import Controller.MainInterpreter;
import Model.AndExpression;
import Model.OrExpression;
import Model.TerminalExpression;

public class Main {

    public static void main(String[] args) {
        MainInterpreter mip = new MainInterpreter();
        System.out.println(mip.interpret("de man eet een brood"));
    }
}
