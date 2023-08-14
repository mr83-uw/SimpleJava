package nwgc;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class MainClass {
    public static void main(String[] args) {
        try {
            String testCsv = """
                    Sample ids,Barcodes
                    FF,GATCAACA.CTATGTTA
                    FR,GATCAACA.ATTGTATC
                    FC,GATCAACA.GATACAAT
                    FRc,GATCAACA.TAACATAG
                    RF,ACAACTAG.CTATGTTA
                    RR,ACAACTAG.ATTGTATC
                    RC,ACAACTAG.GATACAAT
                    RRc,ACAACTAG.TAACATAG
                    CF,CTAGTTGT.CTATGTTA
                    CR,CTAGTTGT.ATTGTATC
                    CC,CTAGTTGT.GATACAAT
                    CRc,CTAGTTGT.TAACATAG
                    RcF,TGTTGATC.CTATGTTA
                    RcR,TGTTGATC.ATTGTATC
                    RcC,TGTTGATC.GATACAAT
                    RcRc,TGTTGATC.TAACATAG
                    """;

            Reader reader = new StringReader(testCsv);
            SdfGenerator gen = new SdfGenerator(reader);
            System.out.println(gen.getStringSdfRepresentation());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}