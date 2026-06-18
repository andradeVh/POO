package ads.poo;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado = false;

    public Livro(String titulo, String autor, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    public void setEmprestado(){
        this.emprestado = !this.emprestado;
    }

    public boolean getEmprestado(){
        return emprestado;
    }
}

