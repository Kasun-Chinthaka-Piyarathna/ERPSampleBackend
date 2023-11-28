package com.company.erp.dto;


public class QuotationData {

    private Long id;
    private String quotationLink;
    private String quotationApproval;

    public QuotationData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuotationLink() {
        return quotationLink;
    }

    public void setQuotationLink(String quotationLink) {
        this.quotationLink = quotationLink;
    }

    public String getQuotationApproval() {
        return quotationApproval;
    }

    public void setQuotationApproval(String quotationApproval) {
        this.quotationApproval = quotationApproval;
    }
}
