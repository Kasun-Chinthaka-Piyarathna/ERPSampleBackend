package com.company.erp.controller;

import com.company.erp.constants.ApiConstants;
import com.company.erp.dto.MessageResponse;
import com.company.erp.dto.QuotationData;
import com.company.erp.service.QuotationService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/quotations")
public class QuotationController {
    @Resource(name = "quotationService")
    private QuotationService quotationService;

    /**
     * Post request to submit quotation int the system.
     *
     * @param quotationData
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<?> saveClient(final @RequestBody QuotationData quotationData) {
        quotationService.saveQuotation(quotationData);
        return ResponseEntity.ok(new MessageResponse(ApiConstants.STATUS_SUCCESS,
                "Quotation has been submitted successfully!", null));
    }


}
