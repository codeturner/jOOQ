/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class F378 extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1982554145;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> I = createParameter("I", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> IO = createParameter("IO", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> O = createParameter("O", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public F378() {
		super("F378", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(I);
		addInOutParameter(IO);
		addOutParameter(O);
	}

	/**
	 * Set the <code>I</code> parameter to the routine
	 */
	public void setI(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.routines.F378.I, value);
	}

	/**
	 * Set the <code>IO</code> parameter to the routine
	 */
	public void setIO(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.routines.F378.IO, value);
	}

	public java.math.BigDecimal getIO() {
		return getValue(IO);
	}

	public java.math.BigDecimal getO() {
		return getValue(O);
	}
}
