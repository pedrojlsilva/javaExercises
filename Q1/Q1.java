public class Q1 {
    public static void main(String[] args) {
        LivroLivraria livro1 = new LivroLivraria();
        LivroBiblioteca livro2 = new LivroBiblioteca();

        livro1.nome="a bela e a fera";
        livro1.preco=9.82f;
        livro2.nome="joao e o pe de feijao";
        livro2.isEmprestado=true;

        System.out.println(livro1.nome);
        System.out.println(livro1.preco);
        System.out.println(livro2.nome);
        System.out.println(livro2.isEmprestado);

    }

   
}


abstract class Livro {
    public String nome;
    public String autor;
    public String editora;
    public int ano;
    
}

class LivroLivraria extends Livro{
    public float preco;
    public int estoque;
}

class LivroBiblioteca extends Livro{
    public boolean isEmprestado;
}


