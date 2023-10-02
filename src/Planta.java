public class Planta extends Especimen{
    String tipodePlanta, periododeExistencia;

    public Planta(String tipodePlanta, String periododeExistencia) {
        this.tipodePlanta = tipodePlanta;
        this.periododeExistencia = periododeExistencia;
    }

    public Planta(String descubridor, String fecha, String tipodeEspecimen, String eraGeologica,
            String ubicacionHallazgo, String tipodePlanta, String periododeExistencia) {
        super(descubridor, fecha, tipodeEspecimen, eraGeologica, ubicacionHallazgo);
        this.tipodePlanta = tipodePlanta;
        this.periododeExistencia = periododeExistencia;
    }

    public String getTipodePlanta() {
        return tipodePlanta;
    }

    public void setTipodePlanta(String tipodePlanta) {
        this.tipodePlanta = tipodePlanta;
    }

    public String getPeriododeExistencia() {
        return periododeExistencia;
    }

    public void setPeriododeExistencia(String periododeExistencia) {
        this.periododeExistencia = periododeExistencia;
    }
}
