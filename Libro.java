
package tiendavideo;

/**
 *
 * @author leobusta
 */
public class Libro extends Producto {
    private final int nro_paginas;

    public Libro(int nro_paginas, String nombre, double precio, String codigo) {
        super(nombre, precio, codigo);
        this.nro_paginas = nro_paginas;
    }

    @Override
    public String toString(){
        String output=super.toString();

        output += "\nNo Paginas:"+nro_paginas;

        return output;
    }

}