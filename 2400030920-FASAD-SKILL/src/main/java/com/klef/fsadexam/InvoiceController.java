package com.klef.fsadexam;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping("/add")
    public Invoice addInvoice(@RequestBody Invoice invoice) {
        return service.addInvoice(invoice);
    }

    @GetMapping("/all")
    public List<Invoice> getInvoices() {
        return service.getAllInvoices();
    }
}