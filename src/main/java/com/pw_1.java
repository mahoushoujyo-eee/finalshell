/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com.aB;
import com.ls_2;
import com.pc_0;
import com.xe_0;

/*
 * Renamed from com.pW
 */
public class pw_1
implements aB {
    private xe_0 J;
    private ls_2 k;
    private String M;
    private static final String a;

    public static pw_1 e(String string, String string2, xe_0 xe_02) throws pc_0 {
        ls_2 ls_22 = ls_2.X(xe_02, string, string2);
        return new pw_1(xe_02, string, ls_22);
    }

    static pw_1 Z(String string, byte[] byArray, byte[] byArray2, xe_0 xe_02) throws pc_0 {
        ls_2 ls_22 = ls_2.h(xe_02, byArray, byArray2);
        return new pw_1(xe_02, string, ls_22);
    }

    public pw_1(xe_0 xe_02, String string, ls_2 ls_22) throws pc_0 {
        this.J = xe_02;
        this.M = string;
        this.k = ls_22;
    }

    @Override
    public boolean M(byte[] byArray) throws pc_0 {
        return this.k.d(byArray);
    }

    @Override
    public byte[] u() {
        return this.k.O();
    }

    @Override
    public byte[] v(byte[] byArray) {
        return this.k.l(byArray);
    }

    @Override
    public byte[] l(byte[] byArray, String string) {
        return this.k.e(byArray, string);
    }

    @Override
    @Deprecated
    public boolean j() {
        throw new RuntimeException(a);
    }

    @Override
    public String B() {
        byte[] byArray = this.k.A();
        return E8.B(byArray);
    }

    @Override
    public String b() {
        return this.M;
    }

    @Override
    public boolean f() {
        return this.k.t();
    }

    @Override
    public void v() {
        this.k.a();
        this.k = null;
    }

    public ls_2 J() {
        return this.k;
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
                char[] cArray3 = "\u001dt(3gsK\u001f~1v`j^\u0017".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 25;
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
                            n17 = 106;
                            break;
                        }
                        case 1: {
                            n17 = 2;
                            break;
                        }
                        case 2: {
                            n17 = 69;
                            break;
                        }
                        case 3: {
                            n17 = 10;
                            break;
                        }
                        case 4: {
                            n17 = 23;
                            break;
                        }
                        case 5: {
                            n17 = 7;
                            break;
                        }
                        default: {
                            n17 = 34;
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

