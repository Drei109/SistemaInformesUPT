package Entidad;

/**
 *
 * @author enzocv
 */
public class ClsEntidadDetallePruebaEntrada {

    //Atributos
    private int idDetallePruebaEntrada;// INT(11) NOT NULL,
    private int idPruebaEntrada;// INT(11) NULL DEFAULT NULL,
    private String habilidad;// VARCHAR(50) NULL DEFAULT NULL,
    private int cantNoAceptalbe;// SMALLINT(6) NULL DEFAULT NULL,
    private int cantSuficiente;// SMALLINT(6) NULL DEFAULT NULL,
    private int cantBueno;// SMALLINT(6) NULL DEFAULT NULL,
    private String medidasCorrectivas;

    public String getMedidasCorrectivas() {
        return medidasCorrectivas;
    }

    public void setMedidasCorrectivas(String medidasCorrectivas) {
        this.medidasCorrectivas = medidasCorrectivas;
    }
    
    //GET y SET
    public int getIdDetallePruebaEntrada() {
        return idDetallePruebaEntrada;
    }

    public void setIdDetallePruebaEntrada(int idDetallePruebaEntrada) {
        this.idDetallePruebaEntrada = idDetallePruebaEntrada;
    }

    public int getIdPruebaEntrada() {
        return idPruebaEntrada;
    }

    public void setIdPruebaEntrada(int idPruebaEntrada) {
        this.idPruebaEntrada = idPruebaEntrada;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getCantNoAceptalbe() {
        return cantNoAceptalbe;
    }

    public void setCantNoAceptalbe(int cantNoAceptalbe) {
        this.cantNoAceptalbe = cantNoAceptalbe;
    }

    public int getCantSuficiente() {
        return cantSuficiente;
    }

    public void setCantSuficiente(int cantSuficiente) {
        this.cantSuficiente = cantSuficiente;
    }

    public int getCantBueno() {
        return cantBueno;
    }

    public void setCantBueno(int cantBueno) {
        this.cantBueno = cantBueno;
    }
}
