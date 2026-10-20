/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

/*
 * Renamed from lb
 */
class lb_2
implements Runnable {
    final F0 n;
    private final InputStream a;
    private static final long b;

    lb_2(F0 f02, InputStream inputStream) {
        this.n = f02;
        this.a = inputStream;
    }

    @Override
    public void run() {
        byte[] byArray = new byte[(int)b];
        int n10 = 0;
        try {
            while ((n10 = this.a.read(byArray)) > 0) {
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.n.d();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 405675892572364770L;
        b = 0x9BF27AF52EB71BE2L ^ l2;
    }
}

