package Model;

public class OrExpression extends Expression {

    private Expression exp1 ;
    private Expression exp2 ;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public String interpret(String dutch){

        String result1 = exp1.interpret(dutch);
        String result2 = exp2.interpret(dutch);

        if (!result1.equals("false")){

            return result1;
        }
        else if (!result2.equals("false")){

            return result2;
        }
        else{
            return "false";
        }
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
}
