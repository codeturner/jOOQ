/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
public class GetPlandiffReportXml extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1150104531;


	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED, XMLTYPE) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> REPORT_REF = createParameter("REPORT_REF", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> TID = createParameter("TID", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> METHOD = createParameter("METHOD", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public GetPlandiffReportXml() {
		super("GET_PLANDIFF_REPORT_XML", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(REPORT_REF);
		addInParameter(TID);
		addInParameter(METHOD);
	}

	/**
	 * Set the <code>REPORT_REF</code> parameter to the routine
	 */
	public void setReportRef(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml.REPORT_REF, value);
	}

	/**
	 * Set the <code>REPORT_REF</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setReportRef(org.jooq.Field<java.lang.String> field) {
		setField(REPORT_REF, field);
	}

	/**
	 * Set the <code>TID</code> parameter to the routine
	 */
	public void setTid(java.lang.Number value) {
		setNumber(org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml.TID, value);
	}

	/**
	 * Set the <code>TID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setTid(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(TID, field);
	}

	/**
	 * Set the <code>METHOD</code> parameter to the routine
	 */
	public void setMethod(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.GetPlandiffReportXml.METHOD, value);
	}

	/**
	 * Set the <code>METHOD</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setMethod(org.jooq.Field<java.lang.String> field) {
		setField(METHOD, field);
	}
}
