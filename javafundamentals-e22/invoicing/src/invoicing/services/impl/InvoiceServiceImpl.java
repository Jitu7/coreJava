package invoicing.services.impl;

import invoicing.model.Invoice;
import invoicing.services.InvoiceService;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public List<Invoice> generateInvoices() {
        Invoice invoice = new Invoice();
        invoice.setAmount(10);
        return List.of(invoice);
    }
}
