package Model;

public class AndExpression extends Expression{
    private Expression exp1 ;
    private Expression exp2 ;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public Expression getExp1() {
        return exp1;
    }

    public void setExp1(Expression exp1) {
        this.exp1 = exp1;
    }

    public Expression getExp2() {
        return exp2;
    }

    public void setExp2(Expression exp2) {
        this.exp2 = exp2;
    }
    public String interpret(String dutch) {
        System.out.println(dutch);
        String[] splitteddutch = dutch.split(" ");
        String result1 = "";
        String result2 = "";
        for(String s : splitteddutch){
            if (!exp1.interpret(s).equals("false")){
                result1 = exp1.interpret(s);
            }
            if (!exp2.interpret(s).equals("false")){
                result2 = exp2.interpret(s);
            }
        }





        if (result1.equals( "" )|| result2.equals( "") ){
            return "false";
        }
        else{
            return result1 + " "+ result2;
        }

    }
}
