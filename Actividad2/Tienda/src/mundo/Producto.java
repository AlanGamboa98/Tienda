/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alanp
 */
package mundo;

/**
 * Producto de la tienda.
 */
public class Producto {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre del producto.
     */
    private String nombre;

    /**
     * Tipo del producto.
     */
    private String tipo;

    /**
     * Valor unitario del producto.
     */
    private double valorUnitario;

    /**
     * Cantidad de unidades en la bodega del producto.
     */
    private int cantidadBodega;

    /**
     * Cantidad de unidades m�nima que debe haber en bodega para poder hacer un pedido.
     */
    private int cantidadMinima;

    /**
     * Cantidad de unidades vendidas del producto.
     */
    private int cantidadUnidadesVendidas;

    /**
     * Ruta de la imagen del producto.
     */
    private String rutaImagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un producto con los valores dados por par�metro. <br>
     * <b> post: </b> El tipo, nombre, valor unitario, cantidad en bodega, cantidad m�nima y ruta imagen fueron inicializados con los valores dado por par�metro.
     *
     * @param pTipo           Tipo del producto. pTipo != null.
     * @param pNombre         Nombre del producto. pNombre != null && pNombre != "".
     * @param pValorUnitario  Valor unitario del producto. pValorUnitario >= 0.
     * @param pCantidadBodega Cantidad inicial en la bodega. pCantidadBodega >= 0.
     * @param pCantidadMinima Cantidad m�nima que debe haber en bodega. pCantidadMinima >= 0.
     * @param pRutaImagen     Ruta de la imagen del producto. pRutaImagen != null && pRutaImagen != "".
     */
    public Producto(String pTipo, String pNombre, double pValorUnitario, int pCantidadBodega, int pCantidadMinima, String pRutaImagen) {
        tipo = pTipo.toLowerCase();
        nombre = pNombre;
        valorUnitario = pValorUnitario;
        cantidadBodega = pCantidadBodega;
        cantidadMinima = pCantidadMinima;
        rutaImagen = pRutaImagen;
        cantidadUnidadesVendidas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public int getCantidadUnidadesVendidas() {
        return cantidadUnidadesVendidas;
    }

    public void setCantidadUnidadesVendidas(int cantidadUnidadesVendidas) {
        this.cantidadUnidadesVendidas = cantidadUnidadesVendidas;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Producto(String nombre, String tipo, double valorUnitario, int cantidadBodega, int cantidadMinima, int cantidadUnidadesVendidas, String rutaImagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorUnitario = valorUnitario;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.cantidadUnidadesVendidas = cantidadUnidadesVendidas;
        this.rutaImagen = rutaImagen;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Retorna el tipo del producto.
     *
     * @return Tipo de producto.
     */
    public String darTipo() {
        return tipo.toLowerCase();
    }

    /**
     * Retorna el valor unitario del producto.
     *
     * @return Valor unitario del producto.
     */
    public double darValorUnitario() {
        return valorUnitario;
    }

    /**
     * Retorna la cantidad en bodega del producto.
     *
     * @return Cantidad en bodega del producto.
     */
    public int darCantidadBodega() {
        return cantidadBodega;
    }

    /**
     * Retorna la cantidad m�nima del producto.
     *
     * @return Cantidad m�nima del producto.
     */
    public int darCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Retorna la cantidad total de unidades vendidas.
     *
     * @return Cantidad de unidades vendidas.
     */
    public int darCantidadUnidadesVendidas() {
        return cantidadUnidadesVendidas;
    }

    /**
     * Retorna la ruta de la imagen del producto.
     *
     * @return Ruta de la imagen del producto.
     */
    public String darRutaImagen() {
        return rutaImagen;
    }

    /**
     * Cambia el nombre del producto.
     *
     * @param nuevoNombre
     */
    public void cambiarNombre(String nuevoNombre) {
    if(nuevoNombre != null && !nuevoNombre.isEmpty()) {
        this.nombre = nuevoNombre;
    }
}

    /**
     * Cambia el tipo del producto
     */
    public void cambiarTipo(String nuevoTipo) {
        this.tipo = nuevoTipo.toLowerCase();
    }

    /**
     * Cambiar el valor unitario del producto
     */
    public void cambiarValorUnitario(double nuevoValorUnitario) {
    if(nuevoValorUnitario >= 0) {
        this.valorUnitario = nuevoValorUnitario;
    }
}

    /**
     * Cambiar la nueva cantidad en bodega
     */
   public void cambiarCantidadBodega(int nuevaCantidadEnBodega) {
    if(nuevaCantidadEnBodega >= 0) {
        this.cantidadBodega = nuevaCantidadEnBodega;
    }
}

    /**
     * Cambiar la cantidad m�nima en bodega del producto
     */
    public void cambiarCantidadMinima(int nuevaCantidadMinima) {
    if(nuevaCantidadMinima >= 0) {
        this.cantidadMinima = nuevaCantidadMinima;
    }
}

    /**
     * Cambia la cantidad de unidades vendidas del producto
     */
    public void cambiardarCantidadUnidadesVendidas(int nuevaCantidadUnidadesVendidas) {
    if(nuevaCantidadUnidadesVendidas >= 0) {
        this.cantidadUnidadesVendidas = nuevaCantidadUnidadesVendidas;
    }
}

    /**
     * Calcula el valor final del producto, incluyendo los impuestos.
     *
     * @return Precio de venta de una unidad incluyendo el IVA.
     */
    public double calcularPrecioFinal() {
    double iva = darIVA();
    return valorUnitario + (valorUnitario * iva / 100);
}

    /**
     * Retorna el IVA correspondiente al producto.
     *
     * @return IVA.
     */
    public double darIVA() {
    switch (tipo.toLowerCase()) {
        case "supermercado":
            return 4.0;
        case "drogueria":
            return 12.0;
        case "papeleria":
            return 16.0;
        default:
            return 0.0;
    }
}

    /**
     * Vende la cantidad de unidades dada por par�metro. <br>
     * Es decir, disminuye la cantidad de unidades en bodega del producto.
     * Si la cantidad a vender es mayor que la cantidad en bodega se debe
     * dejar la cantidad en bodega en cero, y se debe retornar la cantidad
     * en bodega que hab�a antes.
     * En cualquier otro caso, se disminuye la cantidad en bodega en la
     * cantidad a vender. Hay que retornar esa cantidad vendida.
     *
     * @param pCantidad Cantidad de unidades a vender. pCantidad > 0.
     * @return Cantidad que realmente fue vendida, seg�n la disponibilidad en la bodega.
     */
    public int vender(int pCantidad) {
    if (pCantidad > 0) {
        int cantidadDisponible = Math.min(pCantidad, cantidadBodega);
        cantidadBodega -= cantidadDisponible;
        cantidadUnidadesVendidas += cantidadDisponible;
        return cantidadDisponible;
    }
    return 0;
}

    /**
     * Abastece la cantidad de unidades dada por par�metro. <br>
     * <b>post: </b> Aumenta la cantidad de unidades en bodega del producto.
     *
     * @param pCantidad Cantidad de unidades para abastecer. pCantidad >= 0.
     */
    public void abastecer(int pCantidad) {
    if(pCantidad >= 0) {
        this.cantidadBodega += pCantidad;
    }
}

    /**
     * Indica si se puede abastecer las unidades del producto.
     *
     * @return True si la cantidad en la bodega es menor que la m�nima, false en caso contrario.
     */
    public boolean puedeAbastecer() {
    return cantidadBodega < cantidadMinima;
    }
}
