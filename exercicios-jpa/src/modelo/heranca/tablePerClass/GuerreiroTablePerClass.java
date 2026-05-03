package modelo.heranca.tablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "guerreiro_table_per_class")
public class GuerreiroTablePerClass extends JogadorTablePerClass {

    private boolean machado;
    private boolean espada;

    public GuerreiroTablePerClass() {
        super();
    }

    public GuerreiroTablePerClass(String nome, int vida, boolean machado, boolean espada) {
        super(nome, vida);
        setMachado(machado);
        setEspada(espada);
    }

    public boolean isMachado() {
        return machado;
    }

    public void setMachado(boolean machado) {
        if (machado) {
            setEspada(false);
        }
        this.machado = machado;
    }

    public boolean isEspada() {
        return espada;
    }

    public void setEspada(boolean espada) {
        if (espada) {
            setMachado(false);
        }
        this.espada = espada;
    }
}
