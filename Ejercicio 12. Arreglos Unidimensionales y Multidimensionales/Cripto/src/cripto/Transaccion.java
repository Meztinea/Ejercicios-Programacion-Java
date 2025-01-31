
package cripto;


public class Transaccion {
    
    //Creando los atributos de la clase
    
    
    protected int idTransaccion = 1;
    
    //Solicitados al usuario
    protected String criptomoneda;
    protected String tipoTransaccion;
    protected int cantidadCriptomoneda;
    
    //Calculados en los métodos
    protected double tipoCambio;
    protected double montoTransaccion;
    protected double comision;
    protected double valorRealTransaccion;
    
    
    //Creando los métodos para la clase

    

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public void setCriptomoneda(String criptomoneda) {
        this.criptomoneda = criptomoneda;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public void setCantidadCriptomoneda(int cantidadCriptomoneda) {
        this.cantidadCriptomoneda = cantidadCriptomoneda;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void setValorRealTransaccion(double valorRealTransaccion) {
        this.valorRealTransaccion = valorRealTransaccion;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public String getCriptomoneda() {
        return criptomoneda;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public int getCantidadCriptomoneda() {
        return cantidadCriptomoneda;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public double getComision() {
        return comision;
    }

    public double getValorRealTransaccion() {
        return valorRealTransaccion;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
