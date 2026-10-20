/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;

class WL
implements PropertyChangeListener {
    final ux_0 m;
    private static final long[] a;
    private static final Long[] b;

    WL(ux_0 ux_02) {
        this.m = ux_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block24: {
            kj_0 kj_02;
            long l2;
            String[] stringArray;
            block25: {
                int n10;
                block23: {
                    long l3 = System.currentTimeMillis() - this.m.h.hQ;
                    stringArray = F8.y();
                    long l4 = l3 - WL.a(10515, 2619215024826120798L);
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (stringArray != null) break block23;
                    if (l2 <= 0) break block24;
                    long l5 = this.m.h.hQ - WL.a(12161, 6512755223826758861L);
                    l2 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                }
                if (stringArray != null) break block25;
                if (l2 <= 0) break block24;
                try {
                    n10 = (Integer)this.m.h.d.getDividerLocation();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                l2 = ((aE)this.m.h.d).getHeight() - n10 - this.m.h.L;
            }
            long l6 = l2;
            try {
                kj_02 = (kj_0)this.m.h.P.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (stringArray == null) {
                boolean bl;
                try {
                    bl = (Boolean)kj_02.l();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (bl) {
                    Object object;
                    try {
                        object = this.m.h.P.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object.G((int)l6);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        kj_02 = (kj_0)this.m.h.P.Y();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else {
                Object object;
                try {
                    kj_02.G((int)l6);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.S();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8953957269610244155L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00d9\u00dc\u00d3\u0013\u0013\u0099\u00ab\tX\u001b\u008a\u0082L\u0005R\u00ad";
        int n11 = "\u00d9\u00dc\u00d3\u0013\u0013\u0099\u00ab\tX\u001b\u008a\u0082L\u0005R\u00ad".length();
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
        int n11 = (n10 ^ (int)l2 ^ 0x534C) & Short.MAX_VALUE;
        if (b[n11] == null) {
            WL.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

