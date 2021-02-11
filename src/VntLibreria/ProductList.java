package VntLibreria;

import java.sql.Blob;

public class ProductList
{

    private String nombre_libro;
    private String autor_libro;
    private Float precio_libro;
    private int no_existencia_libro;
    private String descripcion_libro;
    private Blob mimage;

    public ProductList(String nombre, String autor, float price, int qty, String description, Blob image)
    {
        this.nombre_libro = nombre;
        this.autor_libro = autor;
        this.precio_libro = price;
        this.no_existencia_libro = qty;
        this.descripcion_libro = description;
        this.mimage = image;
    }

    public String getNombre_libro()
    {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro)
    {
        this.nombre_libro = nombre_libro;
    }

    public String getAutor_libro()
    {
        return autor_libro;
    }

    public void setAutor_libro(String autor_libro)
    {
        this.autor_libro = autor_libro;
    }

    public float getPrecio_libro()
    {
        return precio_libro;
    }

    public void setPrecio_libro(float precio_libro)
    {
        this.precio_libro = precio_libro;
    }

    public int getNo_existencia_libro()
    {
        return no_existencia_libro;
    }

    public void setNo_existencia_libro(int no_existencia_libro)
    {
        this.no_existencia_libro = no_existencia_libro;
    }

    public String getDescripcion_libro()
    {
        return descripcion_libro;
    }

    public void setDescripcion_libro(String descripcion_libro)
    {
        this.descripcion_libro = descripcion_libro;
    }

    public Blob getMimage()
    {
        return mimage;
    }

    public void setMimage(Blob mimage)
    {
        this.mimage = mimage;
    }

}
