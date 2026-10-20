/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from fE
 */
class fe_1
implements Runnable {
    final byte[] l;
    private static final long a;

    fe_1(byte[] byArray) {
        this.l = byArray;
    }

    @Override
    public void run() {
        bj_2.t = true;
        bj_2.x = true;
        try {
            bj_2.F = bn_1.J.read(this.l, 0, (int)a);
            bj_2.T = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        bj_2.t = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 541338869980506280L;
        a = 0xFB7A74C884CA8E8L ^ l2;
    }
}

