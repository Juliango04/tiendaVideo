
package tiendavideo;
/**
 *
 * @author leobusta
 */
public class Producto {
    private final String nombre;
    private final double precio;
    private final String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        String output;
        output = "Nombre: "+nombre+"\nPrecio: "+precio+"\nCodigo: "+codigo;
        
        return output;
    }
    
     public void imprimir(){
        String output;
        output = "Nombre: "+nombre+"\nPrecio: "+precio+"\nCodigo: "+codigo;
        
         System.out.println(output);
    }   
}