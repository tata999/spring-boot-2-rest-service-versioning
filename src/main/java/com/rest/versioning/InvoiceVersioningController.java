package com.rest.versioning;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceVersioningController {

    @GetMapping("v1/invoice")
    public InvoiceV1 invoiceV1() {
        return new InvoiceV1("Tim Kroll");
    }

    @GetMapping("v2/invoice")
    public InvoiceV2 invoiceV2() {
        return new InvoiceV2(new InvoiceName("Tim", "Kroll"));
    }

    @GetMapping(value = "/invoice/param", params = "version=1")
    public InvoiceV1 paramV1() {
        return new InvoiceV1("Tim Kroll");
    }

    @GetMapping(value = "/invoice/param", params = "version=2")
    public InvoiceV2 paramV2() {
        return new InvoiceV2(new InvoiceName("Tim", "Kroll"));
    }

    @GetMapping(value = "/invoice/header", headers = "X-API-VERSION=1")
    public InvoiceV1 headerV1() {
        return new InvoiceV1("Tim Kroll");
    }

    @GetMapping(value = "/invoice/header", headers = "X-API-VERSION=2")
    public InvoiceV2 headerV2() {
        return new InvoiceV2(new InvoiceName("Tim", "Kroll"));
    }

    @GetMapping(value = "/invoice/produces", produces = "application/vnd.company.app-v1+json")
    public InvoiceV1 producesV1() {
        return new InvoiceV1("Tim Kroll");
    }

    @GetMapping(value = "/invoice/produces", produces = "application/vnd.company.app-v2+json")
    public InvoiceV2 producesV2() {
        return new InvoiceV2(new InvoiceName("Tim", "Kroll"));
    }

}