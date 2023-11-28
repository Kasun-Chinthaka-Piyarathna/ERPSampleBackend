package com.company.erp.data;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Quotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String quotationLink;
    private String quotationApproval;

    public Quotation() {
    }

    public Quotation(String quotationLink, String quotationApproval) {
        this.quotationLink = quotationLink;
        this.quotationApproval = quotationApproval;
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
