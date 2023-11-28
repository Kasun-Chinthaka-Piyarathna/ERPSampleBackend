package com.company.erp.service;

import com.company.erp.data.Quotation;
import com.company.erp.dto.QuotationData;
import com.company.erp.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("quotationService")
public class DefaultQuotationService implements QuotationService {


    @Autowired
    private QuotationRepository quotationRepository;

    private Quotation populateQuotationEntity(QuotationData quotationData) {
        Quotation quotation = new Quotation();
        quotation.setQuotationLink(quotationData.getQuotationLink());
        quotation.setQuotationApproval(quotationData.getQuotationApproval());
        return quotation;
    }

    private QuotationData populateQuotationData(final Quotation quotation) {
        QuotationData quotationData = new QuotationData();
        quotationData.setQuotationLink(quotation.getQuotationLink());
        quotationData.setQuotationApproval(quotation.getQuotationApproval());
        return quotationData;
    }

    @Override
    public QuotationData saveQuotation(QuotationData quotationData) {
        Quotation quotationDataModel = populateQuotationEntity(quotationData);
        return populateQuotationData(quotationRepository.save(quotationDataModel));
    }
}
