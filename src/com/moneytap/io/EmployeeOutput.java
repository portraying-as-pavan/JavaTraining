package com.moneytap.io;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EmployeeOutput extends ObjectOutputStream {
    public EmployeeOutput(OutputStream out) throws IOException {
        super(out);
    }

    protected EmployeeOutput() throws IOException, SecurityException {
    }

    @Override
    public void writeStreamHeader(){
        return;
    }
}
