/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class gH {
    boolean V;
    boolean B;
    int U;
    Runnable N;
    public static int m;
    public static int E;
    public static int y;
    Thread K;
    long Q;
    int w;
    boolean k;
    boolean a;
    String C;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1430174936627474900L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00c2l\u0099&\bX\u00f1\u00b1\u00e4\u00ff\u00c9k\bX\u00f1\u00b0\u009bK\u00bc\u00ef\bX\u00f1\u008e";
        int n11 = "\u00c2l\u0099&\bX\u00f1\u00b1\u00e4\u00ff\u00c9k\bX\u00f1\u00b0\u009bK\u00bc\u00ef\bX\u00f1\u008e".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        gH.m = (int)lArray[2];
        gH.E = (int)lArray[1];
        gH.y = (int)lArray[0];
    }

    gH(Runnable runnable, int n10) {
        this.k = false;
        this.N = runnable;
        this.U = n10;
    }

    public void Z() {
        block6: {
            gH gH2;
            String string;
            block5: {
                string = d8_0.Q();
                gH2 = this;
                if (string != null) break block5;
                if (gH2.a) break block6;
                this.a = true;
                gH2 = this;
            }
            if (string == null) {
                if ((Thread)gH2.K != null) {
                    ((Thread)this.K).interrupt();
                }
                gH2 = this;
            }
            gH2.V = true;
        }
    }

    public boolean F() {
        return this.V;
    }

    public boolean v() {
        return this.B;
    }

    public long X() {
        return this.Q;
    }

    public void I(long l2) {
        this.Q = l2;
    }

    public int e() {
        return this.w;
    }

    public void k(int n10) {
        this.w = n10;
    }

    public Runnable c() {
        return (Runnable)this.N;
    }

    public void l(Runnable runnable) {
        this.N = runnable;
    }

    public int X() {
        return this.U;
    }

    public void R(int n10) {
        this.U = n10;
    }

    public boolean r() {
        return this.k;
    }

    public void j(boolean bl) {
        this.k = bl;
    }

    public boolean R() {
        return this.a;
    }

    public Thread q() {
        return (Thread)this.K;
    }

    public void K(Thread thread) {
        this.K = thread;
    }

    public String R() {
        return (String)this.C;
    }

    public void M(String string) {
        this.C = string;
    }
}

