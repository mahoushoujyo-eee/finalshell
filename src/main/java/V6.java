/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class V6
extends FilterInputStream {
    long r = 0L;
    int h = 0;
    private boolean E = false;
    private static final long a;
    private static final long b;

    public V6(InputStream inputStream) {
        super(inputStream);
    }

    public int L(long l2) throws IOException {
        block4: {
            int n10;
            block3: {
                boolean bl = CK.r();
                try {
                    n10 = this.E;
                    if (!bl) break block3;
                    if (n10 == 0) break block4;
                }
                catch (IOException iOException) {
                    throw V6.a(iOException);
                }
                n10 = (int)a;
            }
            return n10;
        }
        long l3 = System.currentTimeMillis();
        int n11 = this.read();
        long l4 = System.currentTimeMillis() - l3;
        if (l4 > b) {
            // empty if block
        }
        return n11;
    }

    public void M() {
        this.E = true;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3873445675594635695L;
        a = 0xAF96D6A7CE9759B7L ^ l2;
        long l3 = 8278478027844939072L;
        b = 0x72E30FE7B292EF18L ^ l3;
    }
}

