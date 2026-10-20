/*
 * Decompiled with CFR 0.152.
 */
package org.s;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import org.s.P;
import org.s.Q;
import org.s.k_0;
import org.s.k_1;
import org.t.n_0;

public final class W {
    public static final Reader c;
    private static String w;
    private static final long a;

    private W() {
    }

    public static Reader v(Reader reader, Runnable runnable) {
        return new P(reader, runnable);
    }

    public static Reader Q(Reader reader, n_0 n_02) {
        return new k_1(reader, n_02);
    }

    public static Reader u(Reader[] readerArray) {
        return W.H(Arrays.asList(readerArray));
    }

    public static Reader H(Iterable iterable) {
        return new k_0(iterable);
    }

    public static Reader e(Reader reader, Writer writer, boolean bl) {
        return new Q(reader, writer, bl);
    }

    public static String s(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        W.S(reader, stringWriter);
        return stringWriter.toString();
    }

    public static void S(Reader reader, Writer writer) throws IOException {
        int n10;
        char[] cArray = new char[(int)a];
        String string = W.v();
        while ((n10 = reader.read(cArray)) != -1) {
            writer.write(cArray, 0, n10);
            if (string != null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (W.v() == null) {
            W.i("WMZKm");
        }
        long l2 = 1203860507337268925L;
        a = 0x6F093254CAF5BEBDL ^ l2;
        c = new StringReader("");
    }

    public static void i(String string) {
        w = string;
    }

    public static String v() {
        return w;
    }
}

