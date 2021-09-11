package com.moneytap.io;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CarOutputStream extends ObjectOutputStream {
    public CarOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected CarOutputStream() throws IOException, SecurityException {
    }

    @Override
    public void writeStreamHeader(){
        return;
    }
}
