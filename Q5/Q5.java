public class Q5 {
    public static void main(String[] args) {
        ColecaoVetor colecao = new ColecaoVetor();
        Professor prof = new Professor("joanes", "123.456.789-12", "matematica", "estatistica");
        colecao.inserir(prof);
        System.out.println("ainda existem "+colecao.tamanhoColecaoNaoNull()+" vagas.");
        prof = new Professor("castor", "987.654.321-12", "informatica", "plc");
        colecao.inserir(prof);
        System.out.println("ainda existem "+colecao.tamanhoColecaoNaoNull()+" vagas.");
        Aluno aluno = new Aluno("eu", "963.852.741-12", "eng. comp.", "robotica");
        colecao.inserir(aluno);
        System.out.println("ainda existem "+colecao.tamanhoColecaoNaoNull()+" vagas.");
        
    }
}

interface Colecao {
    public void inserir(Pessoa p);
    public int tamanhoColecaoNaoNull();
}

class ColecaoVetor implements Colecao{
    private int cursor;
    private Pessoa[] pessoas ;

    @Override
    public void inserir(Pessoa _pessoa){
        pessoas[cursor] = _pessoa;
        cursor++;
    }

    @Override
    public int tamanhoColecaoNaoNull(){
        for(int i=0; i<cursor;i++){
            System.out.println(pessoas[i].getNome());
        }
        return 5-cursor;
    }

    public ColecaoVetor() {
        this.cursor = 0;
        this.pessoas = new Pessoa[5];
    }


}

class Pessoa {
    protected String nome;
    protected String cpf; 

    public Pessoa(String _nome, String _cpf){
        nome = _nome;
        cpf = _cpf;    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }  
}

class Professor extends Pessoa {
    protected String formacao;
    protected String area;

    public Professor(String _nome, String _cpf, String formacao, String area) {
        super(_nome, _cpf);
        this.formacao = formacao;
        this.area = area;
    }
    
}

class Aluno extends Pessoa {
    protected String matricula;
    protected String curso;

    public Aluno(String _nome, String _cpf, String matricula, String curso) {
        super(_nome, _cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
