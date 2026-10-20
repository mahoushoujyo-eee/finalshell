/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from tW
 */
class tw_1
extends Thread {
    final L0 v;
    private static final long[] a;
    private static final Long[] b;

    tw_1(L0 l0) {
        this.v = l0;
    }

    @Override
    public void run() {
        long l2 = System.currentTimeMillis();
        boolean bl = zD.d();
        while (true) {
            if (Math.abs(System.currentTimeMillis() - l2) > tw_1.a(24930, 538320805014106729L)) {
                l2 = System.currentTimeMillis();
                try {
                    if (bl) continue;
                    try {
                        this.v.S();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (InterruptedException interruptedException) {
                    throw tw_1.a(interruptedException);
                }
            }
            try {
                Thread.sleep(tw_1.a(27927, 7278848123819589149L));
            }
            catch (InterruptedException interruptedException) {
                return;
            }
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 515389026270463201L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0000_x}1\u00ed5`b$\u00ae[\r\u00b4\u00ba\u0098";
        int n11 = "\u0000_x}1\u00ed5`b$\u00ae[\r\u00b4\u00ba\u0098".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x130B) & Short.MAX_VALUE;
        if (b[n11] == null) {
            tw_1.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

