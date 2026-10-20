/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XB;

/*
 * Renamed from com.nl
 */
final class nl_2 {
    int J;
    int p;
    int Y;
    long E;
    String P;
    String k;
    String U;
    int r;
    nl_2 B;
    private static final long[] a;
    private static final Integer[] b;

    nl_2() {
    }

    nl_2(int n10, nl_2 nl_22) {
        this.J = n10;
        this.p = nl_22.p;
        this.Y = nl_22.Y;
        this.E = nl_22.E;
        this.P = nl_22.P;
        this.k = nl_22.k;
        this.U = nl_22.U;
        this.r = nl_22.r;
    }

    void y(int n10, String string, String string2, String string3) {
        this.p = n10;
        this.P = string;
        this.k = string2;
        this.U = string3;
        int[] nArray = XB.X();
        if (nArray == null) {
            switch (n10) {
                case 1: 
                case 7: 
                case 8: 
                case 13: {
                    this.r = nl_2.a(7774, 149780135012464228L) & n10 + string.hashCode();
                    return;
                }
                case 12: {
                    this.r = nl_2.a(29302, 6716061752367356493L) & n10 + string.hashCode() * string2.hashCode();
                    return;
                }
            }
            this.r = nl_2.a(29302, 6716061752367356493L) & n10 + string.hashCode() * string2.hashCode() * string3.hashCode();
        }
    }

    void r(int n10) {
        this.p = nl_2.a(8896, 7642846246444813048L);
        this.Y = n10;
        this.r = nl_2.a(29302, 6716061752367356493L) & this.p + n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean F(nl_2 nl_22) {
        int[] nArray = XB.X();
        boolean bl = this.p;
        if (nArray == null) {
            switch (bl) {
                case 1: 
                case 7: 
                case 8: 
                case 13: {
                    return nl_22.P.equals(this.P);
                }
                case 5: 
                case 6: 
                case 15: {
                    long l2 = nl_22.E - this.E;
                    long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                    if (nArray != null) return (boolean)l3;
                    l3 = l3 == false ? (long)1 : (long)0;
                    return (boolean)l3;
                }
                case 3: 
                case 4: {
                    int n10 = nl_22.Y;
                    if (nArray != null) return n10 != 0;
                    if (n10 != this.Y) return 0 != 0;
                    return 1 != 0;
                }
                case 12: {
                    boolean bl2 = nl_22.P.equals(this.P);
                    if (nArray == null) {
                        if (!bl2) return false;
                        bl2 = nl_22.k.equals(this.k);
                    }
                    if (nArray != null) return bl2;
                    if (!bl2) return false;
                    return true;
                }
            }
            bl = nl_22.P.equals(this.P);
        }
        if (nArray == null) {
            if (!bl) return false;
            bl = nl_22.k.equals(this.k);
        }
        if (nArray == null) {
            if (!bl) return false;
            bl = nl_22.U.equals(this.U);
        }
        if (nArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 656050105280159580L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00c3\u0010\u00f6\u00af\n8\u00d6\u00c7\u00ed\\\\\u00cb\u00a8\u009a\u00ba\u00ee\r\u00bb\u0087\u00df\u00a0Q\u0095\u00a7";
        int n11 = "\u00c3\u0010\u00f6\u00af\n8\u00d6\u00c7\u00ed\\\\\u00cb\u00a8\u009a\u00ba\u00ee\r\u00bb\u0087\u00df\u00a0Q\u0095\u00a7".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x683A;
        if (b[n11] == null) {
            nl_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

