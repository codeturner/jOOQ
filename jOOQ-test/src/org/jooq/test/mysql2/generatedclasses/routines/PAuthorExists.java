/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 *
 * Check existence of an author
 */
public class PAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -198395741;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("author_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RESULT = createParameter("result", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PAuthorExists() {
		super("p_author_exists", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	/**
	 * Set the <code>author_name</code> parameter to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.routines.PAuthorExists.AUTHOR_NAME, value);
	}

	public java.lang.Integer getResult() {
		return getValue(RESULT);
	}
}
