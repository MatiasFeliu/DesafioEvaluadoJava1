package ejerciciosOpcionales.ejercicioD27;

public class Producto {
    private String articulo;
    private String precio;
    private String descripcion;
    private String codigo;
    private String talla;
    private String marca;

    public Producto(){}

    public Producto(String articulo,String precio,String descripcion,String codigo,String talla,String marca){
        this.articulo = articulo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.talla = talla;
        this.marca = marca;
    }
    //Getters

    public String getArticulo() {
        return articulo;
    }
    public String getPrecio(){
        return articulo;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTalla() {
        return talla;
    }

    public String getMarca() {
        return marca;
    }

    // Setters
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "articulo='" + articulo + '\'' +
                ", precio='" + precio + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", talla='" + talla + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
