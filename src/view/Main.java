package view;

import Controller.MainInterpreter;
import Controller.picturerepresentation;
import Model.AndExpression;
import Model.OrExpression;
import Model.TerminalExpression;

public class Main {

    public static void main(String[] args) {
        picturerepresentation pir = new picturerepresentation();

        pir.searchpicture("de boer eet een boer" );

    }
}
