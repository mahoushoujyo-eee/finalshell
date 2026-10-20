/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.po_0;

public class CF
implements po_0,
Cloneable {
    protected int[] B;
    private static final long[] a;
    private static final Integer[] b;

    public CF() {
        this.B = new int[CF.a(24370, 4715111695791294126L)];
    }

    public CF(int[] nArray) {
        this.B = nArray;
    }

    public Object clone() {
        try {
            CF cF = (CF)super.clone();
            cF.B = (int[])this.B.clone();
            return cF;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public void V(int[] nArray) {
        this.B = nArray;
    }

    public int[] W() {
        return this.B;
    }

    @Override
    public int D(float f10) {
        int n10;
        block7: {
            int n11;
            block6: {
                String[] stringArray;
                block4: {
                    block5: {
                        n11 = (int)(f10 * 255.0f);
                        stringArray = W5.q();
                        n10 = n11;
                        if (stringArray == null) break block4;
                        if (n10 >= 0) break block5;
                        n11 = 0;
                        if (stringArray != null) break block6;
                    }
                    n10 = n11;
                }
                if (stringArray == null) break block7;
                if (n10 > CF.a(28816, 7043301042965850382L)) {
                    n11 = CF.a(11412, 5172120128805172489L);
                }
            }
            n10 = this.B[n11];
        }
        return n10;
    }

    public void l(int n10, int n11, int n12, int n13) {
        int n14;
        String[] stringArray;
        int n15;
        block3: {
            int n16 = this.B[n11];
            n15 = this.B[n12];
            stringArray = W5.q();
            for (n14 = n11; n14 <= n10; ++n14) {
                this.B[n14] = NM.n((float)(n14 - n11) / (float)(n10 - n11), n16, n13);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block3;
            }
            n14 = n10;
        }
        while (n14 < n12) {
            this.B[n14] = NM.n((float)(n14 - n10) / (float)(n12 - n10), n13, n15);
            ++n14;
            if (stringArray != null) continue;
        }
    }

    public void t(int n10, int n11, int n12, int n13) {
        String[] stringArray = W5.q();
        for (int i2 = n10; i2 <= n11; ++i2) {
            this.B[i2] = NM.n((float)(i2 - n10) / (float)(n11 - n10), n12, n13);
            if (stringArray != null) continue;
        }
    }

    public void o(int n10, int n11, int n12) {
        String[] stringArray = W5.q();
        for (int i2 = n10; i2 <= n11; ++i2) {
            this.B[i2] = n12;
            if (stringArray != null) continue;
        }
    }

    public void l(int n10, int n11) {
        this.B[n10] = n11;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2986575538856208387L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u001d|\u001f\u001a\u000f\u008b/\u00ad.\u00a7HY\u00adq]\u00f5\u00ae\u00a6\u0096\n@{\u0001\u00f2";
        int n11 = "\u001d|\u001f\u001a\u000f\u008b/\u00ad.\u00a7HY\u00adq]\u00f5\u00ae\u00a6\u0096\n@{\u0001\u00f2".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x599C;
        if (b[n11] == null) {
            CF.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

