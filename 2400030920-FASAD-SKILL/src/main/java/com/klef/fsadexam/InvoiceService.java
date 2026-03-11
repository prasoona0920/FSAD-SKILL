package com.klef.fsadexam;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository repo;

    public Invoice addInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }
}