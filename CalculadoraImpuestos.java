/**
 * Clase que calcula cuántos impuestos paga una persona
 * 
 * @author Marina    
 * @version 1.0
 */
public class CalculadoraImpuestos{
    
    /**
     * Calcula el desglose de una factura aplicando impuestos
     * Usa NÚMEROS MÁGICOS, mala práctica
     */
    public void calcularTotalFactura(double subtotal){
        //Números mágicos
        double tasaIVA = 0.21;
        double tasaRetencion = 0.15;
        double costeEnvio = 4.99;
        
        double iva = subtotal * tasaIVA;
        double retencion = subtotal * tasaRetencion;
        double total = (subtotal + iva - retencion) + costeEnvio;
        
        System.out.println("----Facturada Detallada----");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA (21%): " + iva);
        System.out.println("Retencion (15%): " + retencion);
        System.out.println("Envío: " + costeEnvio);
        System.out.println("TOTAL: " + total);
        
        //Otro número mágico
        if (total > 100.0){
            System.out.println("Aviso: Su pedido supera los 100.0 euros.");
        }
    }
    
    /**
     * Método main temporal para probar
     */
    public static void main(String[] args){
        CalculadoraImpuestos calc = new CalculadoraImpuestos();
        calc.calcularTotalFactura(150.0);
    }
}