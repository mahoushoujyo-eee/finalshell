/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from br
 */
public class br_2 {
    o__0 q;
    boolean R = false;
    UR E;
    private static final String a;

    br_2(UR uR2) {
        this.E = uR2;
        this.q = uR2.e;
    }

    public int Z(byte[] byArray, int n10, int n11) throws pV, InterruptedException {
        int n12;
        block4: {
            byte[] byArray2;
            block5: {
                byArray2 = null;
                byArray2 = this.N();
                String[] stringArray = QI.N();
                try {
                    try {
                        n12 = n11;
                        if (stringArray == null) break block4;
                        if (n12 >= byArray2.length) break block5;
                    }
                    catch (pV pV2) {
                        throw br_2.a(pV2);
                    }
                    throw new pV(a);
                }
                catch (pV pV3) {
                    throw br_2.a(pV3);
                }
            }
            System.arraycopy(byArray2, 0, byArray, n10, byArray2.length);
            n12 = byArray2.length;
        }
        return n12;
    }

    public byte[] N() throws pV, InterruptedException {
        return this.q.n();
    }

    public void O() {
        block3: {
            br_2 br_22;
            block2: {
                String[] stringArray = QI.N();
                br_22 = this;
                if (stringArray == null) break block2;
                if (br_22.R) break block3;
                br_22 = this;
            }
            br_22.q.F();
        }
    }

    private static pV a(pV pV2) {
        return pV2;
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
                char[] cArray3 = "5\u0015dB\u0016v\u00155\u0015dB\u0016v\u00155\u0015".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 102;
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
                            n17 = 33;
                            break;
                        }
                        case 1: {
                            n17 = 1;
                            break;
                        }
                        case 2: {
                            n17 = 112;
                            break;
                        }
                        case 3: {
                            n17 = 86;
                            break;
                        }
                        case 4: {
                            n17 = 2;
                            break;
                        }
                        case 5: {
                            n17 = 98;
                            break;
                        }
                        default: {
                            n17 = 1;
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
    }
}

