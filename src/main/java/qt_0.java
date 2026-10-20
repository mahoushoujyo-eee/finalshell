/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import org.icmp4j.j;

/*
 * Renamed from Qt
 */
class qt_0
implements Runnable {
    final fh_1 Q;
    private final InetAddress e;
    private static final long[] a;
    private static final Integer[] b;

    qt_0(fh_1 fh_12, InetAddress inetAddress) {
        this.Q = fh_12;
        this.e = inetAddress;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block15: {
            block14: {
                dx_1 dx_12;
                String[] stringArray;
                block12: {
                    block13: {
                        stringArray = xQ.B();
                        dx_12 = fh_1.P(this.Q);
                        if (stringArray == null) break block12;
                        try {
                            block16: {
                                if (!dx_12.w) break block13;
                                break block16;
                                catch (Exception exception) {
                                    throw qt_0.a(exception);
                                }
                            }
                            return;
                        }
                        catch (Exception exception) {
                            throw qt_0.a(exception);
                        }
                    }
                    dx_12 = fh_1.P(this.Q);
                }
                ++dx_12.A;
                j j2 = new j();
                try {
                    j2 = xq_0.A().p(this.e, fh_1.P((fh_1)this.Q).K, fh_1.P(this.Q));
                }
                catch (Exception exception) {
                    // empty catch block
                }
                j2.n(fh_1.P((fh_1)this.Q).A);
                j j3 = j2;
                try {
                    dx_1 dx_13;
                    try {
                        try {
                            xQ.x.W((Object)new lx_0(this, j3), qt_0.a(29194, 9068389979354858305L));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        fh_1.P((fh_1)this.Q).K = (short)(fh_1.P((fh_1)this.Q).K + 1);
                        dx_13 = fh_1.P(this.Q);
                        if (stringArray == null) break block14;
                        if (dx_13.K != qt_0.a(17708, 7282457621599564902L)) break block15;
                    }
                    catch (Exception exception) {
                        throw qt_0.a(exception);
                    }
                    dx_13 = fh_1.P(this.Q);
                }
                catch (Exception exception) {
                    throw qt_0.a(exception);
                }
            }
            dx_13.K = dx_1.I();
        }
    }

    static fh_1 A(qt_0 qt_02) {
        return qt_02.Q;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5599926709614369977L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00dd\u00fd\u0097h\u00fa\u00e1\u00dc|\u00df\u00bcO\u00d8]\u008e\u0017 ";
        int n11 = "\u00dd\u00fd\u0097h\u00fa\u00e1\u00dc|\u00df\u00bcO\u00d8]\u008e\u0017 ".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x714B;
        if (b[n11] == null) {
            qt_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

