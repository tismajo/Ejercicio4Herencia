public class Especimen {
    String descubridor, fecha, tipodeEspecimen, eraGeologica, ubicacionHallazgo;

    Especimen(){
        
    }

    public Especimen(String descubridor, String fecha, String tipodeEspecimen, String eraGeologica,
            String ubicacionHallazgo) {
        this.descubridor = descubridor;
        this.fecha = fecha;
        this.tipodeEspecimen = tipodeEspecimen;
        this.eraGeologica = eraGeologica;
        this.ubicacionHallazgo = ubicacionHallazgo;
    }

    public String getDescubridor() {
        return descubridor;
    }

    public void setDescubridor(String descubridor) {
        this.descubridor = descubridor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipodeEspecimen() {
        return tipodeEspecimen;
    }

    public void setTipodeEspecimen(String tipodeEspecimen) {
        this.tipodeEspecimen = tipodeEspecimen;
    }

    public String getEraGeologica() {
        return eraGeologica;
    }

    public void setEraGeologica(String eraGeologica) {
        this.eraGeologica = eraGeologica;
    }

    public String getUbicacionHallazgo() {
        return ubicacionHallazgo;
    }

    public void setUbicacionHallazgo(String ubicacionHallazgo) {
        this.ubicacionHallazgo = ubicacionHallazgo;
    }
}