/**
 * Clase que calcula cuántos impuestos paga una persona
 * 
 * @author Marina    
 * @version 1.0
 */
public class CalculadoraImpuestos{
    //Constantes de la clase CalculadoraImpuestos
    public static final double TASA_IVA_GENERAL = 0.21;
    public static final double TASA_RETENCION_IRPF = 0.15;
    public static final double COSTE_ENVIO_ESTANDAR = 4.99;
    public static final double UMBRAL_AVISO_PEDIDO = 100.0;
    
    //Atributos de la clase
    private String nombreCliente;
    
    /**
     * Calcula el desglose de una factura aplicando impuestos
     * Usa NÚMEROS MÁGICOS, mala práctica
     */
    public void calcularTotalFactura(double subtotal){
        //Comprobación si existe cliente
        if (nombreCliente == null){
            System.out.println("ERROR: no se ha asignado ningún cliente.");
        }else{
            System.out.println("----Factura para: " + nombreCliente + " ----");
            double tasaIVA = TASA_IVA_GENERAL;
            double tasaRetencion = TASA_RETENCION_IRPF;
            double costeEnvio = COSTE_ENVIO_ESTANDAR;
        
            double iva = subtotal * tasaIVA;
            double retencion = subtotal * tasaRetencion;
            double total = (subtotal + iva - retencion) + costeEnvio;
        
            System.out.println("----Facturada Detallada----");
            System.out.println("Subtotal: " + subtotal);
            System.out.println("IVA (" + (TASA_IVA_GENERAL * 100) + "%): " + iva);
            System.out.println("Retencion (" + (TASA_RETENCION_IRPF * 100) + "%): " + retencion);
            System.out.println("Envío (" + (COSTE_ENVIO_ESTANDAR * 100) + "%): " + costeEnvio);
            System.out.println("TOTAL: " + total);
            
            //Otro número mágico
            if (total > UMBRAL_AVISO_PEDIDO){
                System.out.println("Aviso: Su pedido supera los " + UMBRAL_AVISO_PEDIDO + " euros");
            }
        }
    }
    
    /**
     * Método setter para asignar un cliente a la calculadora
     */
    public void setNombreCliente(String nombre){
        nombreCliente = nombre;
    }
    
    /**
     * Método main temporal para probar
     */
    public static void main(String[] args){
        CalculadoraImpuestos calc = new CalculadoraImpuestos();
        calc.calcularTotalFactura(150.0);
    }
}