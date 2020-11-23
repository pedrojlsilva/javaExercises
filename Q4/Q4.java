import jdk.jfr.Unsigned;

public class Q4 {
    public static void main(String[] args) {
        Senha senha = new Senha("A1b5D6E9", 123456789);
        Conta conta = new Conta("123456", "9256", senha);
        System.out.println(conta.getSenha().getAlfaNumerica());
        System.out.println(conta.getIdentificacao());
        conta.getSenha().setAlfaNumerica("plc123456");
        System.out.println(conta.getSenha().getAlfaNumerica());
        
    }
}


class Conta{
    protected String identificacao;
    protected String agencia;
    protected Senha senha;

    protected Conta(String identificacao, String agencia, Senha senha) {
        this.identificacao = identificacao;
        this.agencia = agencia;
        this.senha = senha;
    }

    protected String getIdentificacao() {
        return identificacao;
    }

    protected void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    protected String getAgencia() {
        return agencia;
    }

    protected void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    protected Senha getSenha() {
        return senha;
    }

    protected void setSenha(Senha senha) {
        this.senha = senha;
    }
}

class Senha{
    protected String alfaNumerica;
    protected long numerica;

    protected Senha(String alfaNumerica, long numerica) {
        this.alfaNumerica = alfaNumerica;
        this.numerica = numerica;
    }

    protected String getAlfaNumerica() {
        return alfaNumerica;
    }

    protected void setAlfaNumerica(String alfaNumerica) {
        this.alfaNumerica = alfaNumerica;
    }

    protected long getNumerica() {
        return numerica;
    }

    protected void setNumerica(long numerica) {
        this.numerica = numerica;
    }

    

    
}
