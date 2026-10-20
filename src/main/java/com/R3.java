/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PX;
import com.XP;
import com.ky_2;
import com.pg_1;
import org.jetbrains.annotations.NotNull;

public class R3 {
    private final PX[] B;
    private PX H;
    private PX w;
    private PX u;
    private static final long[] a;
    private static final Integer[] b;

    public R3() {
        block2: {
            int[] nArray = XP.j();
            this.B = new PX[4];
            int[] nArray2 = nArray;
            for (int i2 = 0; i2 < this.B.length; ++i2) {
                this.B[i2] = new PX(i2);
                if (nArray2 == null) {
                    if (nArray2 == null) continue;
                }
                break block2;
            }
            this.o();
        }
    }

    public void k(@NotNull PX pX, char c2) {
        pX.t(pg_1.T(c2));
    }

    public void E(int n10, pg_1 pg_12) {
        this.D(n10).t(pg_12);
    }

    @NotNull
    public PX V() {
        PX pX = this.H;
        int[] nArray = XP.j();
        PX pX2 = this.u;
        if (nArray == null) {
            if (pX2 != null) {
                pX = this.u;
                this.u = null;
            }
            pX2 = pX;
        }
        return pX2;
    }

    @NotNull
    public PX I() {
        return this.w;
    }

    @NotNull
    public PX D(int n10) {
        return this.B[n10 % 4];
    }

    public char U(char c2) {
        return XP.P(c2, this.V(), this.I());
    }

    public void F(int n10) {
        this.u = this.D(n10);
    }

    public void o() {
        block3: {
            R3 r3;
            int[] nArray = XP.j();
            for (int i2 = 0; i2 < this.B.length; ++i2) {
                r3 = this;
                if (nArray == null) {
                    PX pX = r3.B[i2];
                    int n10 = i2;
                    if (nArray == null) {
                        n10 = n10 == 1 ? R3.a(19207, 6413965814885595917L) : R3.a(9579, 53835227845776736L);
                    }
                    pX.t(pg_1.T((char)n10));
                    if (nArray == null) continue;
                    ky_2.K(new String[1]);
                    break;
                }
                break block3;
            }
            this.H = this.B[0];
            this.w = this.B[1];
            r3 = this;
        }
        r3.u = null;
    }

    public void f(int n10) {
        this.H = this.D(n10);
    }

    public void o(int n10) {
        this.w = this.D(n10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int D() {
        int[] nArray = XP.j();
        PX pX = this.u;
        if (nArray == null) {
            if (pX == null) return -1;
            pX = this.u;
        }
        int n10 = pX.l();
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1346149451910295822L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "+\u001f\u0080=\u0097\u0095d,<-\u00e6XZr\n3";
        int n11 = "+\u001f\u0080=\u0097\u0095d,<-\u00e6XZr\n3".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x700B;
        if (b[n11] == null) {
            R3.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

