package com.rest.versioning;

public class InvoiceV1 {

    private String name;

    public InvoiceV1() {
        super();
    }

    public InvoiceV1(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
