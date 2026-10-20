/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com.aB;
import com.i3_0;
import com.pc_0;
import com.uJ;

class Y7
implements aB {
    private i3_0 G;
    private byte[] j;
    private String B;
    private String c;
    private static final String a;

    Y7(i3_0 i3_02, byte[] byArray, String string) {
        this.G = i3_02;
        this.j = byArray;
        this.B = string;
        this.c = E8.B(new uJ(byArray).S());
    }

    @Override
    public boolean M(byte[] byArray) throws pc_0 {
        return true;
    }

    @Override
    public byte[] u() {
        return this.j;
    }

    @Override
    public byte[] v(byte[] byArray) {
        return this.G.H(this.j, byArray, null);
    }

    @Override
    public byte[] l(byte[] byArray, String string) {
        return this.G.H(this.j, byArray, string);
    }

    @Override
    @Deprecated
    public boolean j() {
        throw new RuntimeException(a);
    }

    @Override
    public String B() {
        return this.c;
    }

    @Override
    public String b() {
        return this.B;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void v() {
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
                char[] cArray3 = "H\u001cBQqjFJ\u0016[\u0014vsSB".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 97;
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
                            n17 = 71;
                            break;
                        }
                        case 1: {
                            n17 = 18;
                            break;
                        }
                        case 2: {
                            n17 = 87;
                            break;
                        }
                        case 3: {
                            n17 = 16;
                            break;
                        }
                        case 4: {
                            n17 = 121;
                            break;
                        }
                        case 5: {
                            n17 = 102;
                            break;
                        }
                        default: {
                            n17 = 87;
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

