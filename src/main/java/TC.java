/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TC
extends InputStreamReader {
    public TC(InputStream inputStream) {
        super(inputStream);
    }

    public TC(InputStream inputStream, String string) throws UnsupportedEncodingException {
        super(inputStream, string);
    }
}

