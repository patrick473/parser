package Model;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression {

    private String dutch;
    private String english;

    public TerminalExpression(String dutch, String english) {
        this.dutch = dutch;
        this.english = english;
    }

    public String interpret(String dutch){



            if (this.getDutch().equals(dutch)){
                return this.getEnglish();
            }


        return "false";
    }

    public String getDutch() {
        return dutch;
    }

    public void setDutch(String dutch) {
        this.dutch = dutch;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
