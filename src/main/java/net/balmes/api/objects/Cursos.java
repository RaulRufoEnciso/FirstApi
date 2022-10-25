package net.balmes.api.objects;

public class Cursos {
    private String cfgs;
    private String ano;
    private int curs;
    private String aula;
    private String grupo;

    public Cursos(String cfgs, String ano, int curs, String aula, String grupo) {
        this.cfgs = cfgs;
        this.ano = ano;
        this.curs = curs;
        this.aula = aula;
        this.grupo = grupo;
    }

    public String getCFGS() {
        return cfgs;
    }

    public void setCFGS(String cfgs) {
        this.cfgs = cfgs;
    }

    public String getAño() {
        return ano;
    }

    public void setAño(String año) { this.ano = año; }

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
        return "Cursos [cfgs=" + cfgs + ", año=" + ano + ", curs=" + curs + ", aula=" + aula + ",grupo=" + grupo + " ]";
    }

}



