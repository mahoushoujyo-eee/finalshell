/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nl_1;
import com.nv_2;
import com.wr_2;

public abstract class IK
implements wr_2 {
    private static final ThreadLocal r;
    private static final ThreadLocal W;
    private static final Character X;
    private static final long[] a;
    private static final Integer[] b;

    final char v(nl_1 nl_12, Object object, char c2) {
        nl_1 nl_13 = (nl_1)r.get();
        r.set(nl_12);
        W.set(Character.valueOf(c2));
        this.F(object);
        r.set(nl_13);
        return ((Character)W.get()).charValue();
    }

    protected final void T(String string, Object object) {
        nl_1 nl_12 = (nl_1)r.get();
        char c2 = ((Character)W.get()).charValue();
        char c3 = nl_12.Y.containsKey(object);
        String string2 = nv_2.o();
        nl_12.A(c2, string, object);
        char c4 = c3;
        if (string2 != null) {
            if (c4 == '\u0000') {
                nl_12.Y.remove(object);
            }
            c4 = c2;
        }
        if (c4 != IK.a(2587, 8312443769728312076L)) {
            W.set(X);
        }
    }

    public abstract void F(Object var1);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3607503213273654410L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "8\u00a8\u00fe\u00d4\u001fQ\u0007\u00aa\u00ca\u0090lt,\u00e1'\u00f0";
        int n11 = "8\u00a8\u00fe\u00d4\u001fQ\u0007\u00aa\u00ca\u0090lt,\u00e1'\u00f0".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        r = new ThreadLocal();
        W = new ThreadLocal();
        X = Character.valueOf((char)IK.a(10816, 4816287381485290326L));
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2917;
        if (b[n11] == null) {
            IK.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

