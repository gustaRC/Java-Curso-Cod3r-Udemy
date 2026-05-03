package modelo.heranca.tablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "arqueiro_table_per_class")
public class ArqueiroTablePerClass extends JogadorTablePerClass {

    @Column(name = "arco_longo")
    private boolean arcoLongo;

    @Column(name = "arco_curto")
    private boolean arcoCurto;

    public ArqueiroTablePerClass() {
        super();
    }

    public ArqueiroTablePerClass(String nome, int vida, boolean arcoLongo, boolean arcoCurto) {
        super(nome, vida);
        setArcoLongo(arcoLongo);
        setArcoCurto(arcoCurto);
    }

    public boolean isArcoLongo() {
        return arcoLongo;
    }

    public void setArcoLongo(boolean arcoLongo) {
        if (arcoLongo) {
            setArcoCurto(false);
        }
        this.arcoLongo = arcoLongo;
    }

    public boolean isArcoCurto() {
        return arcoCurto;
    }

    public void setArcoCurto(boolean arcoCurto) {
        if (arcoCurto) {
            setArcoLongo(false);
        }
        this.arcoCurto = arcoCurto;
    }
}
