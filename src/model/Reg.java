package model;

/** Register operand
 * @author Arend Rensink
 */
public class Reg extends Operand {
	private final String name;
	private final int id;

	/** Constructs an operand with a given name. */
	public Reg(String name, int id) {
		super(Type.REG);
		assert name != null && name.length() > 1 : "Register names must be non-empty strings";
		this.name = name;
		this.id = id;
	}

	/** Returns the name of this register. */
	public String getName() {
		return this.name;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Reg)) {
			return false;
		}
		Reg other = (Reg) obj;
		if (!getName().equals(other.getName())) {
			return false;
		}
		return true;
	}
}