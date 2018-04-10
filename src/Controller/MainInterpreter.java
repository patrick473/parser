package Controller;

import Model.AndExpression;
import Model.Expression;
import Model.OrExpression;
import Model.TerminalExpression;

import java.util.ArrayList;


public class MainInterpreter {
    picturerepresentation pir = new picturerepresentation();
    static ArrayList<Expression> buildInterpreterTree(){

        ArrayList<Expression> expresions = new ArrayList<Expression>();
        TerminalExpression te1 = new TerminalExpression("brood", "bread");
        TerminalExpression te2 = new TerminalExpression("man", "man");
        TerminalExpression te3 = new TerminalExpression("boer", "farmer");


        //articles
        TerminalExpression te4 = new TerminalExpression("de", "the");
        TerminalExpression te5 = new TerminalExpression("het", "the");
        TerminalExpression te6 = new TerminalExpression("een", "a");


        //verbs
        TerminalExpression te7 = new TerminalExpression("laat", "lets");
        TerminalExpression te8 = new TerminalExpression("eet", "eats");
        TerminalExpression te9 = new TerminalExpression("koopt", "buys");
        TerminalExpression te10 = new TerminalExpression("snijdt", "cuts");

        OrExpression or1 = new OrExpression(te1, te2);
        OrExpression nouns = new OrExpression(or1, te3);

        OrExpression or2 = new OrExpression(te4, te5);
        OrExpression articles = new OrExpression(or2, te6);


        OrExpression or3 = new OrExpression(te7, te8);
        OrExpression or4 = new OrExpression(te9, te10);
        OrExpression verbs = new OrExpression(or3, or4);


        AndExpression predicative = new AndExpression(articles, nouns);

        expresions.add(predicative);
        expresions.add(verbs);
        expresions.add(predicative);
        return expresions;

    }
    public String interpret(String context) {

        String[] split = context.split(" ");


        ArrayList<Expression> IT = buildInterpreterTree();

        String result;

        String pred1, verb, pred2;

        pred1 = split[0] + " " + split[1];
        verb = split[2];
        pred2 = split[3] + " " + split[4];

        result = IT.get(0).interpret(pred1) + " " + IT.get(1).interpret(verb) + " " + IT.get(2).interpret(pred2);
        if (result.contains("false")) {

            result = "false";
        }
        if (!"false".equals(result)){
            pir.searchpicture(context);
        }
        return result;
    }
}