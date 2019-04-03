package quote.pojo;

import java.io.Serializable;
import java.util.Date;

public class Usso_Quotation_History implements Serializable {
	private static final long serialVersionUID = 1L;

	private String quote;
	private String debitNum;
	private String origQuoteNum;
	private String designRegNum;
	private String lineRef;
	private Date enquiryDate;
	private Date systemCreationDate;
	private Date quoteCompleted;
	private Date quoteSubmitted;
	private Date effectiveFrom;
	private Date effectiveTo;
	private String lastModified;
	private Date archived;
	private String quotedBy;
    private String submitter;
	private String responsibleQuotationPerson;
	private String approver;
	private String salesPerson;
	private String salesManager;
	private String responsibleFollowUpPerson;
	private String salesOffice;
	private String salesTelephone;
	private String customerType;
	private String customerName;
	private String procuremetAccountCode;
	private String distributor;
	private String endCustomer;
	private String endCustomerAccountCode;
	private String endCustParentName;
	private String endCustomerContact;
	private String sensitiveEndCustomer;
	private String distyEndCustomer;
	private String emsEndCustomer;
	private String emsEndCustomerCode;
	private String parentName;
	private String designPointCustCode;
	private String productionPointCustCode;
	private String procurementCustCode;
	private String gpn;
	private String cpn;
	private String alternativePartNum;
	private String correctedGPN;
	private String origin;
	private int leadtime;
	private String drpIssued;
	private String shipDebitItem;
	private String automotiveSpecRequested;
	private String automotiveSpec;
	private String medicalSpecRequested;
	private String h40Code;
	private String h40Desc;
	private String h30Code;
	private String h30Desc;
	private String h20Desc;
	private String h10Desc;
	private String currency;
	private String bidbuy;
	private String pb;
	private int target;
	private String targetCurrency;
	private int targetCost;
	private String targetSpCurrency;
	private float quotePrice;
	private int dbp;
	private int fsp;
	private int margin;
	private int xrateR;
	private int xrateS;
	private String peaceQuote;
	private int qty;
	private int salesOrderIncrement;
	private int estimatedAnnualUsage;
    private int minimumOrderQty;
    private int orderedQty;
    private int quantityTo;
    private String competitor;
    private String enquiryReference;
    private String customerContactName;
    private String customerContactEmail;
    private String drpRequested;
    private Date drpLastVisit;
    private String customerComment;
    private Date massProductionStartDate;
    private Date prototypeStartDate;
    private String internalCommentsHeader;
    private String internalCommentsLine;
    private String lineComment;
    private String quoteWlp;
    private String followUpReason;
    private String statusComments;
    private Date followUpDate;
    private String salesChannel;
    private String sbu;
    private String region;
    private String marketSegment;
    private String detailApplication;
    private String programName;
    private String quoteType;
    private String annualQuote;
    private String status;
    private String opportunity;
    private String quotationDelayCode;
    private String kam;
    private String qClass;
    private String secondTierCust;
    private String pricingBasedOn;
    private String quote_Type;
    private int offerRebatePrice;
    private String nonAutoTPCalc;
    private String customerInformation;
    private String tariffDescription;
    private int originalContractPrice;
    private String contractPriceCurrency;
    private int priceBase;
    private String tpCurrency;
    private int tpPrice;
    private int fit;
    private int dutyRatio;
    private int netWeight;
    private String mslLevel;
    private String complianceSymbolRohs;
    private String leadContentStatus;
    private String tpType;
    private String firmCode;
    private String category;
    private String siteCode;
    private String siteName;
    private String osaHq;
    private String actualPn;
    private String mpnNoPlus;
    private String packCode;
    private Date validPeriod;
    private String pdIncharge;
    private int currentShare;
    private String incoterm;
    private String mpnStdCustom;
    private String nonCancelResched;
    private String globalAccountName;
    
	public Usso_Quotation_History(String quote, String debitNum, String origQuoteNum, String designRegNum,
			String lineRef, Date enquiryDate, Date systemCreationDate, Date quoteCompleted, Date quoteSubmitted,
			Date effectiveFrom, Date effectiveTo, String lastModified, Date archived, String quotedBy, String submitter,
			String responsibleQuotationPerson, String approver, String salesPerson, String salesManager,
			String responsibleFollowUpPerson, String salesOffice, String salesTelephone, String customerType,
			String customerName, String procuremetAccountCode, String distributor, String endCustomer,
			String endCustomerAccountCode, String endCustParentName, String endCustomerContact,
			String sensitiveEndCustomer, String distyEndCustomer, String emsEndCustomer, String emsEndCustomerCode,
			String parentName, String designPointCustCode, String productionPointCustCode, String procurementCustCode,
			String gpn, String cpn, String alternativePartNum, String correctedGPN, String origin, int leadtime,
			String drpIssued, String shipDebitItem, String automotiveSpecRequested, String automotiveSpec,
			String medicalSpecRequested, String h40Code, String h40Desc, String h30Code, String h30Desc, String h20Desc,
			String h10Desc, String currency, String bidbuy, String pb, int target, String targetCurrency,
			int targetCost, String targetSpCurrency, float quotePrice, int dbp, int fsp, int margin, int xrateR,
			int xrateS, String peaceQuote, int qty, int salesOrderIncrement, int estimatedAnnualUsage,
			int minimumOrderQty, int orderedQty, int quantityTo, String competitor, String enquiryReference,
			String customerContactName, String customerContactEmail, String drpRequested, Date drpLastVisit,
			String customerComment, Date massProductionStartDate, Date prototypeStartDate,
			String internalCommentsHeader, String internalCommentsLine, String lineComment, String quoteWlp,
			String followUpReason, String statusComments, Date followUpDate, String salesChannel, String sbu,
			String region, String marketSegment, String detailApplication, String programName, String quoteType,
			String annualQuote, String status, String opportunity, String quotationDelayCode, String kam, String qClass,
			String secondTierCust, String pricingBasedOn, String quote_Type, int offerRebatePrice, String nonAutoTPCalc,
			String customerInformation, String tariffDescription, int originalContractPrice,
			String contractPriceCurrency, int priceBase, String tpCurrency, int tpPrice, int fit, int dutyRatio,
			int netWeight, String mslLevel, String complianceSymbolRohs, String leadContentStatus, String tpType,
			String firmCode, String category, String siteCode, String siteName, String osaHq, String actualPn,
			String mpnNoPlus, String packCode, Date validPeriod, String pdIncharge, int currentShare, String incoterm,
			String mpnStdCustom, String nonCancelResched, String globalAccountName) {
		this.quote = quote;
		this.debitNum = debitNum;
		this.origQuoteNum = origQuoteNum;
		this.designRegNum = designRegNum;
		this.lineRef = lineRef;
		this.enquiryDate = enquiryDate;
		this.systemCreationDate = systemCreationDate;
		this.quoteCompleted = quoteCompleted;
		this.quoteSubmitted = quoteSubmitted;
		this.effectiveFrom = effectiveFrom;
		this.effectiveTo = effectiveTo;
		this.lastModified = lastModified;
		this.archived = archived;
		this.quotedBy = quotedBy;
		this.submitter = submitter;
		this.responsibleQuotationPerson = responsibleQuotationPerson;
		this.approver = approver;
		this.salesPerson = salesPerson;
		this.salesManager = salesManager;
		this.responsibleFollowUpPerson = responsibleFollowUpPerson;
		this.salesOffice = salesOffice;
		this.salesTelephone = salesTelephone;
		this.customerType = customerType;
		this.customerName = customerName;
		this.procuremetAccountCode = procuremetAccountCode;
		this.distributor = distributor;
		this.endCustomer = endCustomer;
		this.endCustomerAccountCode = endCustomerAccountCode;
		this.endCustParentName = endCustParentName;
		this.endCustomerContact = endCustomerContact;
		this.sensitiveEndCustomer = sensitiveEndCustomer;
		this.distyEndCustomer = distyEndCustomer;
		this.emsEndCustomer = emsEndCustomer;
		this.emsEndCustomerCode = emsEndCustomerCode;
		this.parentName = parentName;
		this.designPointCustCode = designPointCustCode;
		this.productionPointCustCode = productionPointCustCode;
		this.procurementCustCode = procurementCustCode;
		this.gpn = gpn;
		this.cpn = cpn;
		this.alternativePartNum = alternativePartNum;
		this.correctedGPN = correctedGPN;
		this.origin = origin;
		this.leadtime = leadtime;
		this.drpIssued = drpIssued;
		this.shipDebitItem = shipDebitItem;
		this.automotiveSpecRequested = automotiveSpecRequested;
		this.automotiveSpec = automotiveSpec;
		this.medicalSpecRequested = medicalSpecRequested;
		this.h40Code = h40Code;
		this.h40Desc = h40Desc;
		this.h30Code = h30Code;
		this.h30Desc = h30Desc;
		this.h20Desc = h20Desc;
		this.h10Desc = h10Desc;
		this.currency = currency;
		this.bidbuy = bidbuy;
		this.pb = pb;
		this.target = target;
		this.targetCurrency = targetCurrency;
		this.targetCost = targetCost;
		this.targetSpCurrency = targetSpCurrency;
		this.quotePrice = quotePrice;
		this.dbp = dbp;
		this.fsp = fsp;
		this.margin = margin;
		this.xrateR = xrateR;
		this.xrateS = xrateS;
		this.peaceQuote = peaceQuote;
		this.qty = qty;
		this.salesOrderIncrement = salesOrderIncrement;
		this.estimatedAnnualUsage = estimatedAnnualUsage;
		this.minimumOrderQty = minimumOrderQty;
		this.orderedQty = orderedQty;
		this.quantityTo = quantityTo;
		this.competitor = competitor;
		this.enquiryReference = enquiryReference;
		this.customerContactName = customerContactName;
		this.customerContactEmail = customerContactEmail;
		this.drpRequested = drpRequested;
		this.drpLastVisit = drpLastVisit;
		this.customerComment = customerComment;
		this.massProductionStartDate = massProductionStartDate;
		this.prototypeStartDate = prototypeStartDate;
		this.internalCommentsHeader = internalCommentsHeader;
		this.internalCommentsLine = internalCommentsLine;
		this.lineComment = lineComment;
		this.quoteWlp = quoteWlp;
		this.followUpReason = followUpReason;
		this.statusComments = statusComments;
		this.followUpDate = followUpDate;
		this.salesChannel = salesChannel;
		this.sbu = sbu;
		this.region = region;
		this.marketSegment = marketSegment;
		this.detailApplication = detailApplication;
		this.programName = programName;
		this.quoteType = quoteType;
		this.annualQuote = annualQuote;
		this.status = status;
		this.opportunity = opportunity;
		this.quotationDelayCode = quotationDelayCode;
		this.kam = kam;
		this.qClass = qClass;
		this.secondTierCust = secondTierCust;
		this.pricingBasedOn = pricingBasedOn;
		this.quote_Type = quote_Type;
		this.offerRebatePrice = offerRebatePrice;
		this.nonAutoTPCalc = nonAutoTPCalc;
		this.customerInformation = customerInformation;
		this.tariffDescription = tariffDescription;
		this.originalContractPrice = originalContractPrice;
		this.contractPriceCurrency = contractPriceCurrency;
		this.priceBase = priceBase;
		this.tpCurrency = tpCurrency;
		this.tpPrice = tpPrice;
		this.fit = fit;
		this.dutyRatio = dutyRatio;
		this.netWeight = netWeight;
		this.mslLevel = mslLevel;
		this.complianceSymbolRohs = complianceSymbolRohs;
		this.leadContentStatus = leadContentStatus;
		this.tpType = tpType;
		this.firmCode = firmCode;
		this.category = category;
		this.siteCode = siteCode;
		this.siteName = siteName;
		this.osaHq = osaHq;
		this.actualPn = actualPn;
		this.mpnNoPlus = mpnNoPlus;
		this.packCode = packCode;
		this.validPeriod = validPeriod;
		this.pdIncharge = pdIncharge;
		this.currentShare = currentShare;
		this.incoterm = incoterm;
		this.mpnStdCustom = mpnStdCustom;
		this.nonCancelResched = nonCancelResched;
		this.globalAccountName = globalAccountName;
	}
	
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getDebitNum() {
		return debitNum;
	}
	public void setDebitNum(String debitNum) {
		this.debitNum = debitNum;
	}
	public String getOrigQuoteNum() {
		return origQuoteNum;
	}
	public void setOrigQuoteNum(String origQuoteNum) {
		this.origQuoteNum = origQuoteNum;
	}
	public String getDesignRegNum() {
		return designRegNum;
	}
	public void setDesignRegNum(String designRegNum) {
		this.designRegNum = designRegNum;
	}
	public String getLineRef() {
		return lineRef;
	}
	public void setLineRef(String lineRef) {
		this.lineRef = lineRef;
	}
	public Date getEnquiryDate() {
		return enquiryDate;
	}
	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}
	public Date getSystemCreationDate() {
		return systemCreationDate;
	}
	public void setSystemCreationDate(Date systemCreationDate) {
		this.systemCreationDate = systemCreationDate;
	}
	public Date getQuoteCompleted() {
		return quoteCompleted;
	}
	public void setQuoteCompleted(Date quoteCompleted) {
		this.quoteCompleted = quoteCompleted;
	}
	public Date getQuoteSubmitted() {
		return quoteSubmitted;
	}
	public void setQuoteSubmitted(Date quoteSubmitted) {
		this.quoteSubmitted = quoteSubmitted;
	}
	public Date getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	public Date getEffectiveTo() {
		return effectiveTo;
	}
	public void setEffectiveTo(Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}
	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public Date getArchived() {
		return archived;
	}
	public void setArchived(Date archived) {
		this.archived = archived;
	}
	public String getQuotedBy() {
		return quotedBy;
	}
	public void setQuotedBy(String quotedBy) {
		this.quotedBy = quotedBy;
	}
	public String getSubmitter() {
		return submitter;
	}
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}
	public String getResponsibleQuotationPerson() {
		return responsibleQuotationPerson;
	}
	public void setResponsibleQuotationPerson(String responsibleQuotationPerson) {
		this.responsibleQuotationPerson = responsibleQuotationPerson;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public String getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}
	public String getSalesManager() {
		return salesManager;
	}
	public void setSalesManager(String salesManager) {
		this.salesManager = salesManager;
	}
	public String getResponsibleFollowUpPerson() {
		return responsibleFollowUpPerson;
	}
	public void setResponsibleFollowUpPerson(String responsibleFollowUpPerson) {
		this.responsibleFollowUpPerson = responsibleFollowUpPerson;
	}
	public String getSalesOffice() {
		return salesOffice;
	}
	public void setSalesOffice(String salesOffice) {
		this.salesOffice = salesOffice;
	}
	public String getSalesTelephone() {
		return salesTelephone;
	}
	public void setSalesTelephone(String salesTelephone) {
		this.salesTelephone = salesTelephone;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProcuremetAccountCode() {
		return procuremetAccountCode;
	}
	public void setProcuremetAccountCode(String procuremetAccountCode) {
		this.procuremetAccountCode = procuremetAccountCode;
	}
	public String getDistributor() {
		return distributor;
	}
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}
	public String getEndCustomer() {
		return endCustomer;
	}
	public void setEndCustomer(String endCustomer) {
		this.endCustomer = endCustomer;
	}
	public String getEndCustomerAccountCode() {
		return endCustomerAccountCode;
	}
	public void setEndCustomerAccountCode(String endCustomerAccountCode) {
		this.endCustomerAccountCode = endCustomerAccountCode;
	}
	public String getEndCustParentName() {
		return endCustParentName;
	}
	public void setEndCustParentName(String endCustParentName) {
		this.endCustParentName = endCustParentName;
	}
	public String getEndCustomerContact() {
		return endCustomerContact;
	}
	public void setEndCustomerContact(String endCustomerContact) {
		this.endCustomerContact = endCustomerContact;
	}
	public String getSensitiveEndCustomer() {
		return sensitiveEndCustomer;
	}
	public void setSensitiveEndCustomer(String sensitiveEndCustomer) {
		this.sensitiveEndCustomer = sensitiveEndCustomer;
	}
	public String getDistyEndCustomer() {
		return distyEndCustomer;
	}
	public void setDistyEndCustomer(String distyEndCustomer) {
		this.distyEndCustomer = distyEndCustomer;
	}
	public String getEmsEndCustomer() {
		return emsEndCustomer;
	}
	public void setEmsEndCustomer(String emsEndCustomer) {
		this.emsEndCustomer = emsEndCustomer;
	}
	public String getEmsEndCustomerCode() {
		return emsEndCustomerCode;
	}
	public void setEmsEndCustomerCode(String emsEndCustomerCode) {
		this.emsEndCustomerCode = emsEndCustomerCode;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getDesignPointCustCode() {
		return designPointCustCode;
	}
	public void setDesignPointCustCode(String designPointCustCode) {
		this.designPointCustCode = designPointCustCode;
	}
	public String getProductionPointCustCode() {
		return productionPointCustCode;
	}
	public void setProductionPointCustCode(String productionPointCustCode) {
		this.productionPointCustCode = productionPointCustCode;
	}
	public String getProcurementCustCode() {
		return procurementCustCode;
	}
	public void setProcurementCustCode(String procurementCustCode) {
		this.procurementCustCode = procurementCustCode;
	}
	public String getGpn() {
		return gpn;
	}
	public void setGpn(String gpn) {
		this.gpn = gpn;
	}
	public String getCpn() {
		return cpn;
	}
	public void setCpn(String cpn) {
		this.cpn = cpn;
	}
	public String getAlternativePartNum() {
		return alternativePartNum;
	}
	public void setAlternativePartNum(String alternativePartNum) {
		this.alternativePartNum = alternativePartNum;
	}
	public String getCorrectedGPN() {
		return correctedGPN;
	}
	public void setCorrectedGPN(String correctedGPN) {
		this.correctedGPN = correctedGPN;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getLeadtime() {
		return leadtime;
	}
	public void setLeadtime(int leadtime) {
		this.leadtime = leadtime;
	}
	public String getDrpIssued() {
		return drpIssued;
	}
	public void setDrpIssued(String drpIssued) {
		this.drpIssued = drpIssued;
	}
	public String getShipDebitItem() {
		return shipDebitItem;
	}
	public void setShipDebitItem(String shipDebitItem) {
		this.shipDebitItem = shipDebitItem;
	}
	public String getAutomotiveSpecRequested() {
		return automotiveSpecRequested;
	}
	public void setAutomotiveSpecRequested(String automotiveSpecRequested) {
		this.automotiveSpecRequested = automotiveSpecRequested;
	}
	public String getAutomotiveSpec() {
		return automotiveSpec;
	}
	public void setAutomotiveSpec(String automotiveSpec) {
		this.automotiveSpec = automotiveSpec;
	}
	public String getMedicalSpecRequested() {
		return medicalSpecRequested;
	}
	public void setMedicalSpecRequested(String medicalSpecRequested) {
		this.medicalSpecRequested = medicalSpecRequested;
	}
	public String getH40Code() {
		return h40Code;
	}
	public void setH40Code(String h40Code) {
		this.h40Code = h40Code;
	}
	public String getH40Desc() {
		return h40Desc;
	}
	public void setH40Desc(String h40Desc) {
		this.h40Desc = h40Desc;
	}
	public String getH30Code() {
		return h30Code;
	}
	public void setH30Code(String h30Code) {
		this.h30Code = h30Code;
	}
	public String getH30Desc() {
		return h30Desc;
	}
	public void setH30Desc(String h30Desc) {
		this.h30Desc = h30Desc;
	}
	public String getH20Desc() {
		return h20Desc;
	}
	public void setH20Desc(String h20Desc) {
		this.h20Desc = h20Desc;
	}
	public String getH10Desc() {
		return h10Desc;
	}
	public void setH10Desc(String h10Desc) {
		this.h10Desc = h10Desc;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBidbuy() {
		return bidbuy;
	}
	public void setBidbuy(String bidbuy) {
		this.bidbuy = bidbuy;
	}
	public String getPb() {
		return pb;
	}
	public void setPb(String pb) {
		this.pb = pb;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public String getTargetCurrency() {
		return targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}
	public int getTargetCost() {
		return targetCost;
	}
	public void setTargetCost(int targetCost) {
		this.targetCost = targetCost;
	}
	public String getTargetSpCurrency() {
		return targetSpCurrency;
	}
	public void setTargetSpCurrency(String targetSpCurrency) {
		this.targetSpCurrency = targetSpCurrency;
	}
	public float getQuotePrice() {
		return quotePrice;
	}
	public void setQuotePrice(float quotePrice) {
		this.quotePrice = quotePrice;
	}
	public int getDbp() {
		return dbp;
	}
	public void setDbp(int dbp) {
		this.dbp = dbp;
	}
	public int getFsp() {
		return fsp;
	}
	public void setFsp(int fsp) {
		this.fsp = fsp;
	}
	public int getMargin() {
		return margin;
	}
	public void setMargin(int margin) {
		this.margin = margin;
	}
	public int getXrateR() {
		return xrateR;
	}
	public void setXrateR(int xrateR) {
		this.xrateR = xrateR;
	}
	public int getXrateS() {
		return xrateS;
	}
	public void setXrateS(int xrateS) {
		this.xrateS = xrateS;
	}
	public String getPeaceQuote() {
		return peaceQuote;
	}
	public void setPeaceQuote(String peaceQuote) {
		this.peaceQuote = peaceQuote;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getSalesOrderIncrement() {
		return salesOrderIncrement;
	}
	public void setSalesOrderIncrement(int salesOrderIncrement) {
		this.salesOrderIncrement = salesOrderIncrement;
	}
	public int getEstimatedAnnualUsage() {
		return estimatedAnnualUsage;
	}
	public void setEstimatedAnnualUsage(int estimatedAnnualUsage) {
		this.estimatedAnnualUsage = estimatedAnnualUsage;
	}
	public int getMinimumOrderQty() {
		return minimumOrderQty;
	}
	public void setMinimumOrderQty(int minimumOrderQty) {
		this.minimumOrderQty = minimumOrderQty;
	}
	public int getOrderedQty() {
		return orderedQty;
	}
	public void setOrderedQty(int orderedQty) {
		this.orderedQty = orderedQty;
	}
	public int getQuantityTo() {
		return quantityTo;
	}
	public void setQuantityTo(int quantityTo) {
		this.quantityTo = quantityTo;
	}
	public String getCompetitor() {
		return competitor;
	}
	public void setCompetitor(String competitor) {
		this.competitor = competitor;
	}
	public String getEnquiryReference() {
		return enquiryReference;
	}
	public void setEnquiryReference(String enquiryReference) {
		this.enquiryReference = enquiryReference;
	}
	public String getCustomerContactName() {
		return customerContactName;
	}
	public void setCustomerContactName(String customerContactName) {
		this.customerContactName = customerContactName;
	}
	public String getCustomerContactEmail() {
		return customerContactEmail;
	}
	public void setCustomerContactEmail(String customerContactEmail) {
		this.customerContactEmail = customerContactEmail;
	}
	public String getDrpRequested() {
		return drpRequested;
	}
	public void setDrpRequested(String drpRequested) {
		this.drpRequested = drpRequested;
	}
	public Date getDrpLastVisit() {
		return drpLastVisit;
	}
	public void setDrpLastVisit(Date drpLastVisit) {
		this.drpLastVisit = drpLastVisit;
	}
	public String getCustomerComment() {
		return customerComment;
	}
	public void setCustomerComment(String customerComment) {
		this.customerComment = customerComment;
	}
	public Date getMassProductionStartDate() {
		return massProductionStartDate;
	}
	public void setMassProductionStartDate(Date massProductionStartDate) {
		this.massProductionStartDate = massProductionStartDate;
	}
	public Date getPrototypeStartDate() {
		return prototypeStartDate;
	}
	public void setPrototypeStartDate(Date prototypeStartDate) {
		this.prototypeStartDate = prototypeStartDate;
	}
	public String getInternalCommentsHeader() {
		return internalCommentsHeader;
	}
	public void setInternalCommentsHeader(String internalCommentsHeader) {
		this.internalCommentsHeader = internalCommentsHeader;
	}
	public String getInternalCommentsLine() {
		return internalCommentsLine;
	}
	public void setInternalCommentsLine(String internalCommentsLine) {
		this.internalCommentsLine = internalCommentsLine;
	}
	public String getLineComment() {
		return lineComment;
	}
	public void setLineComment(String lineComment) {
		this.lineComment = lineComment;
	}
	public String getQuoteWlp() {
		return quoteWlp;
	}
	public void setQuoteWlp(String quoteWlp) {
		this.quoteWlp = quoteWlp;
	}
	public String getFollowUpReason() {
		return followUpReason;
	}
	public void setFollowUpReason(String followUpReason) {
		this.followUpReason = followUpReason;
	}
	public String getStatusComments() {
		return statusComments;
	}
	public void setStatusComments(String statusComments) {
		this.statusComments = statusComments;
	}
	public Date getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}
	public String getSalesChannel() {
		return salesChannel;
	}
	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}
	public String getSbu() {
		return sbu;
	}
	public void setSbu(String sbu) {
		this.sbu = sbu;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getMarketSegment() {
		return marketSegment;
	}
	public void setMarketSegment(String marketSegment) {
		this.marketSegment = marketSegment;
	}
	public String getDetailApplication() {
		return detailApplication;
	}
	public void setDetailApplication(String detailApplication) {
		this.detailApplication = detailApplication;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getQuoteType() {
		return quoteType;
	}
	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}
	public String getAnnualQuote() {
		return annualQuote;
	}
	public void setAnnualQuote(String annualQuote) {
		this.annualQuote = annualQuote;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(String opportunity) {
		this.opportunity = opportunity;
	}
	public String getQuotationDelayCode() {
		return quotationDelayCode;
	}
	public void setQuotationDelayCode(String quotationDelayCode) {
		this.quotationDelayCode = quotationDelayCode;
	}
	public String getKam() {
		return kam;
	}
	public void setKam(String kam) {
		this.kam = kam;
	}
	public String getqClass() {
		return qClass;
	}
	public void setqClass(String qClass) {
		this.qClass = qClass;
	}
	public String getSecondTierCust() {
		return secondTierCust;
	}
	public void setSecondTierCust(String secondTierCust) {
		this.secondTierCust = secondTierCust;
	}
	public String getPricingBasedOn() {
		return pricingBasedOn;
	}
	public void setPricingBasedOn(String pricingBasedOn) {
		this.pricingBasedOn = pricingBasedOn;
	}
	public String getQuote_Type() {
		return quote_Type;
	}
	public void setQuote_Type(String quote_Type) {
		this.quote_Type = quote_Type;
	}
	public int getOfferRebatePrice() {
		return offerRebatePrice;
	}
	public void setOfferRebatePrice(int offerRebatePrice) {
		this.offerRebatePrice = offerRebatePrice;
	}
	public String getNonAutoTPCalc() {
		return nonAutoTPCalc;
	}
	public void setNonAutoTPCalc(String nonAutoTPCalc) {
		this.nonAutoTPCalc = nonAutoTPCalc;
	}
	public String getCustomerInformation() {
		return customerInformation;
	}
	public void setCustomerInformation(String customerInformation) {
		this.customerInformation = customerInformation;
	}
	public String getTariffDescription() {
		return tariffDescription;
	}
	public void setTariffDescription(String tariffDescription) {
		this.tariffDescription = tariffDescription;
	}
	public int getOriginalContractPrice() {
		return originalContractPrice;
	}
	public void setOriginalContractPrice(int originalContractPrice) {
		this.originalContractPrice = originalContractPrice;
	}
	public String getContractPriceCurrency() {
		return contractPriceCurrency;
	}
	public void setContractPriceCurrency(String contractPriceCurrency) {
		this.contractPriceCurrency = contractPriceCurrency;
	}
	public int getPriceBase() {
		return priceBase;
	}
	public void setPriceBase(int priceBase) {
		this.priceBase = priceBase;
	}
	public String getTpCurrency() {
		return tpCurrency;
	}
	public void setTpCurrency(String tpCurrency) {
		this.tpCurrency = tpCurrency;
	}
	public int getTpPrice() {
		return tpPrice;
	}
	public void setTpPrice(int tpPrice) {
		this.tpPrice = tpPrice;
	}
	public int getFit() {
		return fit;
	}
	public void setFit(int fit) {
		this.fit = fit;
	}
	public int getDutyRatio() {
		return dutyRatio;
	}
	public void setDutyRatio(int dutyRatio) {
		this.dutyRatio = dutyRatio;
	}
	public int getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}
	public String getMslLevel() {
		return mslLevel;
	}
	public void setMslLevel(String mslLevel) {
		this.mslLevel = mslLevel;
	}
	public String getComplianceSymbolRohs() {
		return complianceSymbolRohs;
	}
	public void setComplianceSymbolRohs(String complianceSymbolRohs) {
		this.complianceSymbolRohs = complianceSymbolRohs;
	}
	public String getLeadContentStatus() {
		return leadContentStatus;
	}
	public void setLeadContentStatus(String leadContentStatus) {
		this.leadContentStatus = leadContentStatus;
	}
	public String getTpType() {
		return tpType;
	}
	public void setTpType(String tpType) {
		this.tpType = tpType;
	}
	public String getFirmCode() {
		return firmCode;
	}
	public void setFirmCode(String firmCode) {
		this.firmCode = firmCode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getOsaHq() {
		return osaHq;
	}
	public void setOsaHq(String osaHq) {
		this.osaHq = osaHq;
	}
	public String getActualPn() {
		return actualPn;
	}
	public void setActualPn(String actualPn) {
		this.actualPn = actualPn;
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
	public Date getValidPeriod() {
		return validPeriod;
	}
	public void setValidPeriod(Date validPeriod) {
		this.validPeriod = validPeriod;
	}
	public String getPdIncharge() {
		return pdIncharge;
	}
	public void setPdIncharge(String pdIncharge) {
		this.pdIncharge = pdIncharge;
	}
	public int getCurrentShare() {
		return currentShare;
	}
	public void setCurrentShare(int currentShare) {
		this.currentShare = currentShare;
	}
	public String getIncoterm() {
		return incoterm;
	}
	public void setIncoterm(String incoterm) {
		this.incoterm = incoterm;
	}
	public String getMpnStdCustom() {
		return mpnStdCustom;
	}
	public void setMpnStdCustom(String mpnStdCustom) {
		this.mpnStdCustom = mpnStdCustom;
	}
	public String getNonCancelResched() {
		return nonCancelResched;
	}
	public void setNonCancelResched(String nonCancelResched) {
		this.nonCancelResched = nonCancelResched;
	}
	public String getGlobalAccountName() {
		return globalAccountName;
	}
	public void setGlobalAccountName(String globalAccountName) {
		this.globalAccountName = globalAccountName;
	}  
}
