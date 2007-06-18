/**
 * The person class represents a person who can hold a bank account.
 * For now, the only state it contains is the name of the person.
 *
 * @author Michael Gordon
 */
public class Person {
	/** The person's full name */
	private String name;
	
	/**
	 * Create a new person with name.
	 *
	 * @param name The name of new person we are creating
	 */
	public Person(String name) {
		setName(name);
	}
	
	/**
	 * Create a person with no name.  The name is set to "nameless".
	 * You will want to set the name later.
	 *
	 * @see Person#setName(String)
	 */
	public Person() {
		this("nameless");
	}
	
	/** 
	 * Set the name of this person to name.
	 *
	 * @param name The new full name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the name of the person.
	 *
	 * @return The String of the full name of the person.
	 */
	public String getName() {
		return name;
	}
}