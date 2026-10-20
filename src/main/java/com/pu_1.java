/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import java.awt.Font;

/*
 * Renamed from com.pU
 */
public class pu_1 {
    private final Font s;
    private final int P;
    private final float p;
    private static int[] S;
    private static final long[] a;
    private static final Integer[] b;

    public pu_1(Font font, int n10, float f10) {
        int[] nArray = pu_1.T();
        this.s = font;
        this.P = n10;
        this.p = f10;
        int[] nArray2 = nArray;
        if (ky_2.F() != null) {
            pu_1.y(new int[4]);
        }
    }

    public Font N() {
        return this.s;
    }

    public int b() {
        return this.P;
    }

    public float F() {
        return this.p;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        pu_1 pu_12;
        pu_1 pu_13;
        int[] nArray;
        block9: {
            int n10;
            block8: {
                nArray = pu_1.T();
                Object object2 = this;
                if (nArray != null) {
                    if (object2 == object) {
                        return true;
                    }
                    object2 = object;
                }
                if (nArray != null) {
                    if (!(object2 instanceof pu_1)) {
                        return false;
                    }
                    object2 = object;
                }
                pu_13 = (pu_1)object2;
                n10 = Float.compare(pu_13.p, this.p);
                if (nArray == null) break block8;
                if (n10 != 0) return false;
                pu_12 = this;
                if (nArray == null) break block9;
                n10 = pu_12.P;
            }
            if (n10 != pu_13.P) return false;
            pu_12 = this;
        }
        Font font = pu_12.s;
        if (nArray != null) {
            if (font == null) return false;
            font = this.s;
        }
        boolean bl = font.equals(pu_13.s);
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public int hashCode() {
        int n10 = this.s.hashCode();
        n10 = pu_1.a(20631, 4518104998748878135L) * n10 + this.P;
        int[] nArray = pu_1.T();
        int n11 = pu_1.a(16048, 6562059783773231889L) * n10;
        float f10 = this.p - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (nArray != null) {
            f11 = f11 != false ? (float)Float.floatToIntBits(this.p) : 0.0f;
        }
        n10 = n11 + f11;
        if (nArray == null) {
            ky_2.K(new String[2]);
        }
        return n10;
    }

    public static void y(int[] nArray) {
        S = nArray;
    }

    public static int[] T() {
        return S;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4450790435057480774L;
        long[] lArray = new long[2];
        int n10 = 0;
        pu_1.y(new int[5]);
        String string = "\u001d\u009a%a7\u0019An\u0012\u00fa$\u0002\u00e5\u00e0\u00afH";
        int n11 = "\u001d\u009a%a7\u0019An\u0012\u00fa$\u0002\u00e5\u00e0\u00afH".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x25A0;
        if (b[n11] == null) {
            pu_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

