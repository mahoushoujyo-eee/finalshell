/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.crypto.digests.RIPEMD160Digest
 */
package com;

import com.KF;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;

public class K4
extends KF {
    private static String G;
    private static final String b;
    private static final long e;

    public K4() {
        this.Z = b;
        this.N = (int)e;
        this.M = new RIPEMD160Digest();
    }

    @Override
    public boolean P() {
        return super.P();
    }

    @Override
    public String k() {
        return super.k();
    }

    @Override
    public void U(byte[] byArray, int n10) {
        super.U(byArray, n10);
    }

    @Override
    public void o(byte[] byArray, int n10, int n11) {
        super.o(byArray, n10, n11);
    }

    @Override
    public void H(int n10) {
        super.H(n10);
    }

    @Override
    public void L(byte[] byArray) throws Exception {
        super.L(byArray);
    }

    @Override
    public int h() {
        return super.h();
    }

    public static void Y(String string) {
        G = string;
    }

    public static String z() {
        return G;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (K4.z() != null) {
                    K4.Y("D4nod");
                }
                char[] cArray3 = "\u000fA|=Vl+\u0017Ip:J(r".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 85;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 50;
                            break;
                        }
                        case 1: {
                            n17 = 121;
                            break;
                        }
                        case 2: {
                            n17 = 72;
                            break;
                        }
                        case 3: {
                            n17 = 11;
                            break;
                        }
                        case 4: {
                            n17 = 46;
                            break;
                        }
                        case 5: {
                            n17 = 75;
                            break;
                        }
                        default: {
                            n17 = 23;
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
        b = new String(cArray).intern();
        long l2 = 8283999924223748808L;
        e = 0x371A1AE962B82ADCL ^ l2;
    }
}

