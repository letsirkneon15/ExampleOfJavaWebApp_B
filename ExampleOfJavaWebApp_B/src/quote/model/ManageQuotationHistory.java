package quote.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import quote.pojo.Usso_Quotation_History;

public class ManageQuotationHistory {

	private PreparedStatement ps;
	private ResultSet rs;
	
	public ArrayList<Usso_Quotation_History> getQuoteHistArr(Connection conn, String firmCode, String osaCode, 
			String custCode, String globalAccountName, int frRowNum, int toRowNum){
		
		ArrayList<Usso_Quotation_History> quoteArr = new ArrayList<>();
		
		/*String qry = "SELECT outer.* FROM (SELECT rownum rn, inner.* from("
				+ "SELECT a.* from USSO_QUOTATION_HISTORY a WHERE OSA_HQ LIKE ?" +
				" AND END_CUSTOMER LIKE ? AND GLOBAL_ACCOUNT_NAME LIKE ?) inner) outer WHERE outer.rn >= ? and outer.rn <= ?"; */
		
		String qry = "SELECT * FROM USSO_QUOTATION_HISTORY WHERE OSA_HQ LIKE ?" +
		" AND END_CUSTOMER LIKE ? AND GLOBAL_ACCOUNT_NAME LIKE ?";
		
		System.out.println("Qry: " + qry + " osaCode:" + osaCode + " custCode: " + custCode + "globalAccountName: " + globalAccountName);
		
		try{
			ps = conn.prepareStatement(qry);
			ps.setString(1, osaCode.trim() + '%');
			ps.setString(2, custCode + '%');
			ps.setString(3, globalAccountName + '%');
			/*ps.setInt(4, frRowNum);
			ps.setInt(5, toRowNum);*/
			
			rs = ps.executeQuery();
			while(rs.next()){
				quoteArr.add(new Usso_Quotation_History(
						rs.getString("QUOTE"), rs.getString("DEBIT_NUMBER"),
						rs.getString("ORIGINAL_QUOTE_NO"), rs.getString("DESIGNREGNUM"), 
						rs.getString("LINE_REF"), rs.getDate("ENQUIRY_DATE"), 
						rs.getDate("SYSTEM_CREATION_DATE"), rs.getDate("QUOTE_COMPLETED"),
						rs.getDate("QUOTE_SUBMITTED"), 	rs.getDate("EFFECTIVE FROM"),
						rs.getDate("EFFECTIVE_TO"), rs.getString("LASTMODIFIED"),
						rs.getDate("ARCHIVED"), 
						rs.getString("QUOTEDBY"), rs.getString("SUBMITTER"),
						rs.getString("RESPONSIBLE_QUOTATION_PERSON"), rs.getString("APPROVER"),
						rs.getString("SALESPERSON"), rs.getString("SALESMANAGER"),
						rs.getString("RESPONSIBLE_FOLLOWUP_PERSON"), rs.getString("SALESOFFICE"),
						rs.getString("SALESTELEPHONE"), rs.getString("CUSTOMER_TYPE"),
						rs.getString("CUSTOMER_NAME"),	rs.getString("PROCUREMENT_ACCOUNT_CODE"),
						rs.getString("DISTRIBUTOR"), rs.getString("END_CUSTOMER"),
						rs.getString("END_CUSTOMER_ACCOUNT_CODE"), rs.getString("ENDCUSTPARENT_NAME"),
						rs.getString("END_CUSTOMER_CONTACT"), rs.getString("SENSITIVE_END_CUSTOMER"),
						rs.getString("DISTY_END_CUSTOMER"), rs.getString("EMS_END_CUSTOMER"),
						rs.getString("EMS_END_CUSTOMER_CODE"), rs.getString("PARENT_NAME"), 
						rs.getString("DESIGN_POINT_CUST_CODE"), rs.getString("PRODUCTION_POINT_CUST_CODE"),
						rs.getString("PROCUREMENT_CUST_CODE"), rs.getString("GPN"),
						rs.getString("CPN"), rs.getString("ALTERNATIVE_PART_NUMBER"), 
						rs.getString("CORRECTED_GPN"), rs.getString("ORIGIN"),
						rs.getInt("LEADTIME"), rs.getString("DRP_ISSUED"),
						rs.getString("SHIP_DEBIT_ITEM"), rs.getString("AUTOMOTIVE_SPEC_REQUESTED"),
						rs.getString("AUTOMOTIVE_SPEC"), rs.getString("MEDICAL_SPEC_REQUESTED"),
						rs.getString("H40_CODE"), rs.getString("H40_DESC"), 
						rs.getString("H30_CODE"), rs.getString("H30_DESC"), 
						rs.getString("H20_DESC"), rs.getString("H10_DESC"),
						rs.getString("CURRENCY"), rs.getString("BIDBUY"),
						rs.getString("PB"), rs.getInt("TARGET"), 
						rs.getString("TARGET_CURRENCY"), rs.getInt("TARGET_COST"),
						rs.getString("TARGET_SP_CURRENCY"), rs.getFloat("QUOTE_PRICE"),
						rs.getInt("DBP"), rs.getInt("FSP"),
						rs.getInt("MARGIN"), rs.getInt("XRATE_R"), 
						rs.getInt("XRATE_S"), rs.getString("PEACE_QUOTE"),
						rs.getInt("QTY"), rs.getInt("SALES_ORDER_INCREMENT"),
						rs.getInt("ESTIMATED_ANNUAL_USAGE"), rs.getInt("MINIMUM_ORDER_QTY"), 
						rs.getInt("ORDERED_QUANTITY"), rs.getInt("QUANTITY_TO"), 
						rs.getString("COMPETITOR"), rs.getString("ENQUIRY_REFERENCE"), 
						rs.getString("CUSTOMER_CONTACT_NAME"), rs.getString("CUSTOMER_CONTACT_EMAIL"),
						rs.getString("DRP_REQUESTED"), rs.getDate("DRP_LAST_VISIT"), 
						rs.getString("CUSTOMER_COMMENT"), rs.getDate("MASS_PRODUCTION_START_DATE"), 
						rs.getDate("PROTOTYPE_START_DATE"), rs.getString("INTERNAL_COMMENTS_HEADER"),
						rs.getString("INTERNAL_COMMENTS_LINE"), rs.getString("LINE_COMMENT"), 
						rs.getString("QUOTEWLP"), rs.getString("FOLLOWUP_REASON"), 
						rs.getString("STATUSCOMMENTS"), rs.getDate("FOLLOWUP_DATE"),
						rs.getString("SALES_CHANNEL"), rs.getString("SBU"), 
						rs.getString("REGION"), rs.getString("MARKET_SEGMENT"), 
						rs.getString("DETAIL_APPLICATION"), rs.getString("PROGRAMNAME"),
						rs.getString("QUOTETYPE"), rs.getString("ANNUAL_QUOTE"), 
						rs.getString("STATUS"), rs.getString("OPPORTUNITY"), 
						rs.getString("QUOTATION_DELAY_CODE"), rs.getString("KAM"),
						rs.getString("CLASS"), rs.getString("SECONDTIERCUST"),
						rs.getString("PRICINGBASEDON"), rs.getString("QUOTE_TYPE"), 
						rs.getInt("OFFER_REBATE_PRICE"), rs.getString("NON_AUTO_TP_CALCULATE"),
						rs.getString("CUSTOMER_INFORMATION"), rs.getString("TARIFF_DESCRIPTION"), 
						rs.getInt("ORIGINAL_CONTRACT_PRICE"), rs.getString("CONTRACT_PRICE_CURRENCY"), 
						rs.getInt("PRICE_BASE"), rs.getString("TP_CURRENCY"), 
						rs.getInt("TP_PRICE"), rs.getInt("FIT"), 
						rs.getInt("DUTY_RATIO"), rs.getInt("NET_WEIGHT"), 
						rs.getString("MSL_LEVEL"), rs.getString("COMPLIANCE_SYMBOL_ROHS"),
						rs.getString("LEAD_CONTENT_STATUS"), rs.getString("TP_TYPE"), 
						rs.getString("FIRMCODE"), rs.getString("CATEGORY"),
						rs.getString("SITE_CODE"), rs.getString("SITE_NAME"),
						rs.getString("OSA_HQ"), rs.getString("ACTUAL_PN"), 
						rs.getString("MPN_NO_PLUS"), rs.getString("PACK_CODE"),
						rs.getDate("VALID_PERIOD"), rs.getString("PD_INCHARGE"),
						rs.getInt("CURRENT_SHARE"), rs.getString("INCOTERM"),
						rs.getString("MPN_STD_CUSTOM"), rs.getString("NON_CANCEL_RESCHED"), 
						rs.getString("GLOBAL_ACCOUNT_NAME")		
						));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				rs.close();
				ps.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	
		return quoteArr;
		
	}
}
