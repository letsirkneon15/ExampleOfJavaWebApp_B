package quote.pojo;

import java.util.Date;

public class Quotation_History_Display_Info {
	
	private String endCustomer;
    private String quoteType;
    private String siteCode;
    private String cpn;
    private String mpnNoPlus;
    private String packCode;
    private String oem; 
    private int estimatedAnnualUsage;
    private float nextQuarterSP;
    private String nextQuarterCurrency;
    private float currentQuarterSP;
    private String currentQuarterCurrency;
	private int leadtime;
	private int salesOrderIncrement;
	private int minimumOrderQty;
	private String nonCancelResched;
	private String mpnStdCustom;
    private Date effectiveFrom;
    private Date validPeriod;
    private String internalCommentsLine;
        
	public Quotation_History_Display_Info(String endCustomer, String quoteType, String siteCode, String cpn,
			String mpnNoPlus, String packCode, String oem, int estimatedAnnualUsage, float nextQuarterSP,
			String nextQuarterCurrency, float currentQuarterSP, String currentQuarterCurrency, int leadtime,
			int salesOrderIncrement, int minimumOrderQty, String nonCancelResched, String mpnStdCustom,
			Date effectiveFrom, Date validPeriod, String internalCommentsLine) {
		this.endCustomer = endCustomer;
		this.quoteType = quoteType;
		this.siteCode = siteCode;
		this.cpn = cpn;
		this.mpnNoPlus = mpnNoPlus;
		this.packCode = packCode;
		this.oem = oem;
		this.estimatedAnnualUsage = estimatedAnnualUsage;
		this.nextQuarterSP = nextQuarterSP;
		this.nextQuarterCurrency = nextQuarterCurrency;
		this.currentQuarterSP = currentQuarterSP;
		this.currentQuarterCurrency = currentQuarterCurrency;
		this.leadtime = leadtime;
		this.salesOrderIncrement = salesOrderIncrement;
		this.minimumOrderQty = minimumOrderQty;
		this.nonCancelResched = nonCancelResched;
		this.mpnStdCustom = mpnStdCustom;
		this.effectiveFrom = effectiveFrom;
		this.validPeriod = validPeriod;
		this.internalCommentsLine = internalCommentsLine;
	}
	public String getEndCustomer() {
		return endCustomer;
	}
	public void setEndCustomer(String endCustomer) {
		this.endCustomer = endCustomer;
	}
	public String getQuoteType() {
		return quoteType;
	}
	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}
	public String getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getCpn() {
		return cpn;
	}
	public void setCpn(String cpn) {
		this.cpn = cpn;
	}
	public String getMpnNoPlus() {
		return mpnNoPlus;
	}
	public void setMpnNoPlus(String mpnNoPlus) {
		this.mpnNoPlus = mpnNoPlus;
	}
	public String getPackCode() {
		return packCode;
	}
	public void setPackCode(String packCode) {
		this.packCode = packCode;
	}
	public String getOem() {
		return oem;
	}
	public void setOem(String oem) {
		this.oem = oem;
	}
	public int getEstimatedAnnualUsage() {
		return estimatedAnnualUsage;
	}
	public void setEstimatedAnnualUsage(int estimatedAnnualUsage) {
		this.estimatedAnnualUsage = estimatedAnnualUsage;
	}
	public float getNextQuarterSP() {
		return nextQuarterSP;
	}
	public void setNextQuarterSP(float nextQuarterSP) {
		this.nextQuarterSP = nextQuarterSP;
	}
	public String getNextQuarterCurrency() {
		return nextQuarterCurrency;
	}
	public void setNextQuarterCurrency(String nextQuarterCurrency) {
		this.nextQuarterCurrency = nextQuarterCurrency;
	}
	public float getCurrentQuarterSP() {
		return currentQuarterSP;
	}
	public void setCurrentQuarterSP(float currentQuarterSP) {
		this.currentQuarterSP = currentQuarterSP;
	}
	public String getCurrentQuarterCurrency() {
		return currentQuarterCurrency;
	}
	public void setCurrentQuarterCurrency(String currentQuarterCurrency) {
		this.currentQuarterCurrency = currentQuarterCurrency;
	}
	public int getLeadtime() {
		return leadtime;
	}
	public void setLeadtime(int leadtime) {
		this.leadtime = leadtime;
	}
	public int getSalesOrderIncrement() {
		return salesOrderIncrement;
	}
	public void setSalesOrderIncrement(int salesOrderIncrement) {
		this.salesOrderIncrement = salesOrderIncrement;
	}
	public int getMinimumOrderQty() {
		return minimumOrderQty;
	}
	public void setMinimumOrderQty(int minimumOrderQty) {
		this.minimumOrderQty = minimumOrderQty;
	}
	public String getNonCancelResched() {
		return nonCancelResched;
	}
	public void setNonCancelResched(String nonCancelResched) {
		this.nonCancelResched = nonCancelResched;
	}
	public String getMpnStdCustom() {
		return mpnStdCustom;
	}
	public void setMpnStdCustom(String mpnStdCustom) {
		this.mpnStdCustom = mpnStdCustom;
	}
	public Date getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	public Date getValidPeriod() {
		return validPeriod;
	}
	public void setValidPeriod(Date validPeriod) {
		this.validPeriod = validPeriod;
	}
	public String getInternalCommentsLine() {
		return internalCommentsLine;
	}
	public void setInternalCommentsLine(String internalCommentsLine) {
		this.internalCommentsLine = internalCommentsLine;
	}
	
}
