package nwgc;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.Reader;

public class SdfGenerator {
    Reader reader;

    SdfGenerator(Reader reader) {
        this.reader = reader;
    }

    public String getStringSdfRepresentation() throws IOException {
        return IOUtils.toString(reader);
    }
}