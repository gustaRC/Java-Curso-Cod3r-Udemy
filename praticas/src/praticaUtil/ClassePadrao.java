package praticaUtil;

import java.util.concurrent.ThreadLocalRandom;

public abstract class ClassePadrao {

	private int id;

	public ClassePadrao() {
		this.setId();
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = this.gerarId();
	}

	private int gerarId() {
		return ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE);
	}
}
