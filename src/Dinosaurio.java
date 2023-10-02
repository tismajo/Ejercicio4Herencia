public class Dinosaurio extends Especimen{
    String tipodeDinosaurio, tamaño, pesoEstimado;

    public Dinosaurio(String tipodeDinosaurio, String tamaño, String pesoEstimado, String ubicacionHallazgo, String tipodeDinosaurio2, String tamaño2, String pesoEstimado2) {
        this.tipodeDinosaurio = tipodeDinosaurio;
        this.tamaño = tamaño;
        this.pesoEstimado = pesoEstimado;
    }

    public Dinosaurio(String descubridor, String fecha, String tipodeEspecimen, String eraGeologica,
            String ubicacionHallazgo, String tipodeDinosaurio, String tamaño, String pesoEstimado) {
        super(descubridor, fecha, tipodeEspecimen, eraGeologica, ubicacionHallazgo);
        this.tipodeDinosaurio = tipodeDinosaurio;
        this.tamaño = tamaño;
        this.pesoEstimado = pesoEstimado;
    }

    public String getTipodeDinosaurio() {
        return tipodeDinosaurio;
    }

    public void setTipodeDinosaurio(String tipodeDinosaurio) {
        this.tipodeDinosaurio = tipodeDinosaurio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPesoEstimado() {
        return pesoEstimado;
    }

    public void setPesoEstimado(String pesoEstimado) {
        this.pesoEstimado = pesoEstimado;
    }
}
