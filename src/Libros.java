public class Libros {
    public int ISBN;
    public String Titulo;
    public  String Autor;
    public String Editorial;
    public  String Categoria;
    public void setISBN(int ISBN)
    {
      this.ISBN=ISBN;
    }
    public void setTitulo(String Titulo)
    {
        this.Titulo=Titulo;
    }
    public void setAutor(String Autor)
    {
        this.Autor=Autor;
    }
    public void setEditorial(String Editorial)
    {
        this.Editorial=Editorial;
    }
    public void setCategoria(String Categoria)
    {
        this.Categoria=Categoria;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public String getCategoria() {
        return Categoria;
    }
}
