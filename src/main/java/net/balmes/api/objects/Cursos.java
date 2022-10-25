package net.balmes.api.objects;

public class Cursos {
    final String group = "Cursos";
    private String cfgs;
    private String año;
    private int curs;
    private String aula;
    private String grupo;

    public Cursos(String cfgs, String año, int curs, String aula, String grupo) {
        this.cfgs = cfgs;
        this.año = año;
        this.curs = curs;
        this.aula = aula;
        this.grupo = grupo;
    }
    public String getGroup() {
        return group;
    }

    public String getCFGS() {
        return cfgs;
    }

    public void setCFGS(String cfgs) {
        this.cfgs = cfgs;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) { this.año = año; }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) { this.curs = curs; }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }


    @Override
    public String toString() {
        return "Cursos [group=" + group + ", cfgs=" + cfgs + ", año=" + año + ", curs=" + curs + ", aula=" + aula + ",grupo=" + grupo + " ]";
    }

}



