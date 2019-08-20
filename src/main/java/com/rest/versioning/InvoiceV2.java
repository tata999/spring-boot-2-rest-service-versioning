package com.rest.versioning;

import com.rest.versioning.InvoiceName;

public class InvoiceV2 {

    private com.rest.versioning.InvoiceName name;

    public InvoiceV2() {
        super();
    }

    public InvoiceV2(com.rest.versioning.InvoiceName name) {
        super();
        this.name = name;
    }

    public com.rest.versioning.InvoiceName getName() {
        return name;
    }

    public void setName(InvoiceName name) {
        this.name = name;
    }
}
