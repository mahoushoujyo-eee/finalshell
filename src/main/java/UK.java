/*
 * Decompiled with CFR 0.152.
 */
public class UK
extends ub_0 {
    private x9 N;
    private byte[] n = new byte[0];
    private static final String a;
    private static final long b;

    public static UK v(ky_0 ky_02, tr_2 tr_22) {
        byte[] byArray = new byte[ky_02.l() - tr_22.i() - 1];
        ky_02.A(byArray);
        x9 x92 = x9.X(ky_02.c());
        byte[] byArray2 = new byte[tr_22.i()];
        try {
            ky_02.A(byArray2);
            if (!DF.K(byArray2, tr_22.h())) {
                throw new VL();
            }
        }
        catch (VL vL) {
            throw UK.a(vL);
        }
        return new UK(x92, byArray);
    }

    public UK(x9 x92) {
        this.N = x92;
    }

    public UK(x9 x92, byte[] byArray) {
        this(x92);
        this.n = byArray;
    }

    public x9 e() {
        return this.N;
    }

    public byte[] c() {
        return this.n;
    }

    public void B(byte[] byArray) {
        this.n = byArray;
    }

    public void m(byte[] byArray) {
        this.n = DF.s(byArray, byArray.length);
    }

    @Override
    public ky_0 R() {
        kk_0 kk_02 = kk_0.v(this.n.length * 2 + (int)b);
        tr_2 tr_22 = new tr_2(DZ.CRC16);
        K5 k5 = new K5(this.n);
        tr_22.z(this.n);
        kk_02.A(k5.n(), 0, k5.e());
        kk_02.c(x9.ZDLE.r());
        tr_22.x(this.N.r());
        kk_02.c(this.N.r());
        tr_22.finalize();
        k5 = new K5(tr_22.h());
        kk_02.A(k5.n(), 0, k5.e());
        kk_02.a();
        return kk_02;
    }

    public String toString() {
        return (Object)((Object)this.N) + ":" + this.n.length + a;
    }

    private static VL a(VL vL) {
        return vL;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u0017i[0!I".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 78;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 121;
                            break;
                        }
                        case 1: {
                            n17 = 69;
                            break;
                        }
                        case 2: {
                            n17 = 108;
                            break;
                        }
                        case 3: {
                            n17 = 10;
                            break;
                        }
                        case 4: {
                            n17 = 10;
                            break;
                        }
                        case 5: {
                            n17 = 116;
                            break;
                        }
                        default: {
                            n17 = 39;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 7762788559431115372L;
        b = 0x230076D6D75BA22CL ^ l2;
    }
}

