public class Q3 {
    public static void main(String[] args) {
        Pessoa pessoa1=new Pessoa("joanes", 32,"Graduacao", Genero.GENEROFLUIDO, OrietacaoSexual.NAOIDENTIFICADO, SexoBiologico.NAOIDENTIFICADO);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getGrauEscolaridade());
        System.out.println(pessoa1.getIdentidadeGenero());
        System.out.println(pessoa1.getOrientacaoSexual());
        System.out.println(pessoa1.getSexoBiologico());
        pessoa1.dormir();
        pessoa1.cagar();
    }
}

enum Genero {
    CISGENERO, TRANSGENERO, GENEROFLUIDO, NAOBINARIO, NAOIDENTIFICADO;
}

enum OrietacaoSexual {
    HETEROSSEXUAL, HOMOSSEXUAL, NAOIDENTIFICADO;
}

enum SexoBiologico {
    MASCULINO, FEMININO, NAOIDENTIFICADO;
}

class Pessoa {
    protected String nome;
    protected int idade;
    protected String grauEscolaridade;
    protected Genero identidadeGenero;
    protected OrietacaoSexual orientacaoSexual;
    protected SexoBiologico sexoBiologico;

    public Pessoa(){
        nome = "Nome nao informado";
        idade = -1;
        grauEscolaridade = "Escolaridade nao informada";
        identidadeGenero = Genero.NAOIDENTIFICADO;
        orientacaoSexual = OrietacaoSexual.NAOIDENTIFICADO;
        sexoBiologico = SexoBiologico.NAOIDENTIFICADO;
    }

    public Pessoa(String _nome, int _idade, String _grau, Genero _genero, OrietacaoSexual _orient, SexoBiologico _sexo){
        nome = _nome;
        idade = _idade;
        grauEscolaridade = _grau;
        identidadeGenero = _genero;
        orientacaoSexual = _orient;
        sexoBiologico = _sexo;
    }

    


    public void dormir(){
        System.out.println(nome + " foi dormir.");
    }

    public void cagar(){
        System.out.println(nome + " foi cagar.");
    }

    public void comer(){
        System.out.println(nome + " foi comer.");
    }
    public void estudar(){
        System.out.println(nome + " foi estudar.");
    }
    public void viver(){
        System.out.println(nome + " foi viver.");
    }
    public void sobreviver(){
        System.out.println(nome + " foi sobreviver.");
    }
    public void trabalhar(){
        System.out.println(nome + " foi trabalhar.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGrauEscolaridade() {
        return grauEscolaridade;
    }

    public void setGrauEscolaridade(String grauEscolaridade) {
        this.grauEscolaridade = grauEscolaridade;
    }

    public String getIdentidadeGenero() {
        return identidadeGenero.name();
    }

    

    public String getOrientacaoSexual() {
        return orientacaoSexual.name();
    }

    

    public String getSexoBiologico() {
        return sexoBiologico.name();
    }

    
}