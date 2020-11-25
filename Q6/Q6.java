public class Q6 {
    public static void main(String[] args) {
        String exp=new String("2+5/10<12+16");
        boolean avaliacaoExp = checkExp(exp);
        Expression expression;
        if(avaliacaoExp){
            System.out.println("Expressao logica");
            expression = new ExprLogica();
        }else{
            System.out.println("Expressao aritmetica");
            expression = new ExprAritmetica();
        }

        System.out.println(expression.avaliar(exp));
        System.out.println(expression.imprimirArvore(exp));

        
        

    }

    protected static boolean checkExp(String exp){
        boolean resultado=false;
        if(exp.indexOf(">=", 0)!=-1){
            resultado=true;
        }else if(exp.indexOf("<=", 0)!=-1){
            resultado=true;
        }else if(exp.indexOf("!=", 0)!=-1){
            resultado=true;
        }else if(exp.indexOf("==", 0)!=-1){
            resultado=true;
        }else if(exp.indexOf(">", 0)!=-1){
            resultado=true;
        }else if(exp.indexOf("<", 0)!=-1){
            resultado=true;
        }
        return resultado;
    }
    
}



interface Expression {
    public String avaliar(String exp);
    public String imprimirArvore(String expp);
}

class ExprAritmetica implements Expression{
    private String exp;
    public ExprAritmetica(){

    }
    @Override
    public String avaliar(String exp){
        String resultado="";

        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == '+'){
            String exp1=avaliar(exp.substring(0, i));
            String exp2=avaliar(exp.substring(i+1, exp.length()));
            resultado = Double.toString(Double.valueOf(exp1)+Double.valueOf(exp2));
            return resultado;
            }
        }
        
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == '+'){
            String exp1=avaliar(exp.substring(0, i));
            String exp2=avaliar(exp.substring(i+1, exp.length()));
            resultado = Double.toString(Double.valueOf(exp1)-Double.valueOf(exp2));
            return resultado;
            }
        }
        
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == '*'){
            String exp1=avaliar(exp.substring(0, i));
            String exp2=avaliar(exp.substring(i+1, exp.length()));
            resultado = Double.toString(Double.valueOf(exp1)*Double.valueOf(exp2));
            return resultado;
            }
        }
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == '/'){
            String exp1=avaliar(exp.substring(0, i));
            String exp2=avaliar(exp.substring(i+1, exp.length()));
            resultado = Double.toString(Double.valueOf(exp1)/Double.valueOf(exp2));
            return resultado;
            }
        }
        

        return exp;

    }

    @Override
    public String imprimirArvore(String exp){
        
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == '-'){
                return "("+imprimirArvore(exp.substring(0, i))+"-"+imprimirArvore(exp.substring(i+1, exp.length()))+")";
            }
        }
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == '+'){
                return "("+imprimirArvore(exp.substring(0, i))+"+"+imprimirArvore(exp.substring(i+1, exp.length()))+")";
            }
        }
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == '*'){
                return "("+imprimirArvore(exp.substring(0, i))+"*"+imprimirArvore(exp.substring(i+1, exp.length()))+")";
            }
        }
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i) == '/'){
                return "("+imprimirArvore(exp.substring(0, i))+"/"+imprimirArvore(exp.substring(i+1, exp.length()))+")";
            }
        }
        return "("+exp+")";
    }

    public String getExp() {
        return this.exp;
    }

    public void setExp(String _exp) {
        this.exp = _exp;
    }
        
}




class ExprLogica implements Expression{

    public ExprLogica(){

    }
    @Override
    public String avaliar(String exp){
        boolean resultado=false;

        if(exp.indexOf(">=", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            expArit.setExp(exp.substring(0, exp.indexOf(">=", 0)));
            String exp1 = expArit.avaliar(expArit.getExp());
            expArit.setExp(exp.substring(exp.indexOf(">=", 0)+2, exp.length()));
            String exp2 = expArit.avaliar(expArit.getExp());
            resultado = Double.valueOf(exp1) >= Double.valueOf(exp2);
            return String.valueOf(resultado);
            
        }else if(exp.indexOf("<=", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            expArit.setExp(exp.substring(0, exp.indexOf("<=", 0)));
            String exp1 = expArit.avaliar(expArit.getExp());
            expArit.setExp(exp.substring(exp.indexOf("<=", 0)+2, exp.length()));
            String exp2 = expArit.avaliar(expArit.getExp());
            resultado = Double.valueOf(exp1) <= Double.valueOf(exp2);
            return String.valueOf(resultado);
            
        }else if(exp.indexOf("!=", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            expArit.setExp(exp.substring(0, exp.indexOf("!=", 0)));
            String exp1 = expArit.avaliar(expArit.getExp());
            expArit.setExp(exp.substring(exp.indexOf("!=", 0)+2, exp.length()));
            String exp2 = expArit.avaliar(expArit.getExp());
            resultado = Double.valueOf(exp1) != Double.valueOf(exp2);
            return String.valueOf(resultado);

            
        }else if(exp.indexOf("==", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            expArit.setExp(exp.substring(0, exp.indexOf("==", 0)));
            String exp1 = expArit.avaliar(expArit.getExp());
            expArit.setExp(exp.substring(exp.indexOf("==", 0)+2, exp.length()));
            String exp2 = expArit.avaliar(expArit.getExp());
            resultado = Double.valueOf(exp1) == Double.valueOf(exp2);
            return String.valueOf(resultado);
            
        }else if(exp.indexOf(">", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            expArit.setExp(exp.substring(0, exp.indexOf(">", 0)));
            String exp1 = expArit.avaliar(expArit.getExp());
            expArit.setExp(exp.substring(exp.indexOf(">", 0)+1, exp.length()));
            String exp2 = expArit.avaliar(expArit.getExp());
            resultado = Double.valueOf(exp1) > Double.valueOf(exp2);
            return String.valueOf(resultado);
            
        }else if(exp.indexOf("<", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            expArit.setExp(exp.substring(0, exp.indexOf("<", 0)));
            String exp1 = expArit.avaliar(expArit.getExp());
            expArit.setExp(exp.substring(exp.indexOf("<", 0)+1, exp.length()));
            String exp2 = expArit.avaliar(expArit.getExp());
            resultado = Double.valueOf(exp1) < Double.valueOf(exp2);
            return String.valueOf(resultado);
            
        }

        return String.valueOf(resultado);

    }

    @Override
    public String imprimirArvore(String exp){
        if(exp.indexOf(">=", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            String exp1 = expArit.imprimirArvore(exp.substring(0, exp.indexOf(">=", 0)));
            expArit.setExp(exp.substring(exp.indexOf(">=", 0)+2, exp.length()));
            String exp2 = expArit.imprimirArvore(expArit.getExp());
            return "("+exp1+">="+exp2+")";
            
        }else if(exp.indexOf("<=", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            String exp1 = expArit.imprimirArvore(exp.substring(0, exp.indexOf("<=", 0)));
            expArit.setExp(exp.substring(exp.indexOf("<=", 0)+2, exp.length()));
            String exp2 = expArit.imprimirArvore(expArit.getExp());
            return "("+exp1+"<="+exp2+")";
            
        }else if(exp.indexOf("!=", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            String exp1 = expArit.imprimirArvore(exp.substring(0, exp.indexOf("!=", 0)));
            expArit.setExp(exp.substring(exp.indexOf("!=", 0)+2, exp.length()));
            String exp2 = expArit.imprimirArvore(expArit.getExp());
            return "("+exp1+"!="+exp2+")";
            
        }else if(exp.indexOf("==", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            String exp1 = expArit.imprimirArvore(exp.substring(0, exp.indexOf("==", 0)));
            expArit.setExp(exp.substring(exp.indexOf("==", 0)+2, exp.length()));
            String exp2 = expArit.imprimirArvore(expArit.getExp());
            return "("+exp1+"=="+exp2+")";
            
        }else if(exp.indexOf(">", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            String exp1 = expArit.imprimirArvore(exp.substring(0, exp.indexOf(">", 0)));
            expArit.setExp(exp.substring(exp.indexOf(">", 0)+1, exp.length()));
            String exp2 = expArit.imprimirArvore(expArit.getExp());
            return "("+exp1+">"+exp2+")";
            
        }else if(exp.indexOf("<", 0)!=-1){
            ExprAritmetica expArit = new ExprAritmetica();
            String exp1 = expArit.imprimirArvore(exp.substring(0, exp.indexOf("<", 0)));
            expArit.setExp(exp.substring(exp.indexOf("<", 0)+1, exp.length()));
            String exp2 = expArit.imprimirArvore(expArit.getExp());
            return "("+exp1+"<"+exp2+")";
            
        }
        return exp;
    }
}
