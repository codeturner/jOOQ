/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class P1490 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1061560321;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> VALUE = createParameter("value", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public P1490() {
		super("P1490", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(VALUE);
	}

	/**
	 * Set the <code>value</code> parameter to the routine
	 */
	public void setValue(java.lang.Number value) {
		setNumber(VALUE, value);
	}
}
