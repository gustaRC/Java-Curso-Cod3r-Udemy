package minhaPratica.classes;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public abstract class BaseClass {

	private long id;
	private String name;

	protected BaseClass(String name) {
		setName(name);
		setId();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	private void setId() {
		id = ThreadLocalRandom.current().nextInt(100000, 999999);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseClass other = (BaseClass) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
