/*
 * Decompiled with CFR 0.152.
 */
package org.T;

import org.T.N;
import org.t.n_0;

class I
extends n_0 {
    private int E = I.a(21072, 1412584213620380446L);
    private int Y = 1;
    private int U = 1;
    private boolean m;
    private static final long[] a;
    private static final Integer[] b;

    I() {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void v(char var1_1) {
        var2_2 = N.R();
        v0 = this.m;
        if (var2_2) {
            if (v0 != '\u0000') {
                this.m = false;
                v0 = var1_1;
                if (var2_2) {
                    if (v0 == I.a(7696, 4855059120827047775L)) {
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1;
            }
        }
        switch (v0 ? 1 : 0) {
            case 13: {
                this.m = true;
                ++this.Y;
                this.U = 1;
                if (var2_2) break;
            }
            case 10: 
            case 133: 
            case 8232: 
            case 8233: {
                ++this.Y;
                this.U = 1;
                if (var2_2) break;
            }
            case 9: {
                this.U = this.U - (this.U - 1) % this.E + this.E;
                if (var2_2) break;
            }
            default: {
                ++this.U;
            }
        }
    }

    @Override
    public int E() {
        return this.Y;
    }

    @Override
    public void e(int n10) {
        this.Y = n10;
    }

    @Override
    public int v() {
        return this.U;
    }

    @Override
    public void R(int n10) {
        this.U = n10;
    }

    @Override
    public void E(int n10) {
        this.E = n10;
    }

    @Override
    public void V() {
        this.U = 1;
        this.Y = 1;
        this.m = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3828438286954153836L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00a8\u00db\u00b0\u00b9&B\u0094z\u0097:l/\u009e\u0002\u00d89";
        int n11 = "\u00a8\u00db\u00b0\u00b9&B\u0094z\u0097:l/\u009e\u0002\u00d89".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x14E;
        if (b[n11] == null) {
            I.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

