/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RG;
import org.v.RN;
import org.v._8;
import org.v.e_2;
import org.v.fu_0;
import org.v.hL;
import org.v.h_2;
import org.v.nk_0;
import org.v.s_1;

public final class NT
extends nk_0
implements _8 {
    public final RN O;
    private static final String d;

    public NT(I i2, fu_0[] fu_0Array, RN rN) {
        super(i2, fu_0Array);
        this.O = rN;
        this.O.G(this);
    }

    public boolean v() {
        return RG.G(this.D(), new String[]{d});
    }

    public String toString() {
        return RG.o(this.D()) + this.O;
    }

    @Override
    @c
    public Object T(e_2 e_22) throws Throwable {
        return e_22.W(this);
    }

    @Override
    @c
    public Object i(hL hL2) throws Throwable {
        return hL2.F(this);
    }

    @Override
    @c
    public Object R(h_2 h_22) throws Throwable {
        return h_22.W(this);
    }

    @Override
    @c
    public s_1 U(String string) {
        return this.O.U(string);
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
                char[] cArray3 = "\nx&\"KO".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 40;
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
                            n17 = 81;
                            break;
                        }
                        case 1: {
                            n17 = 36;
                            break;
                        }
                        case 2: {
                            n17 = 111;
                            break;
                        }
                        case 3: {
                            n17 = 126;
                            break;
                        }
                        case 4: {
                            n17 = 10;
                            break;
                        }
                        case 5: {
                            n17 = 4;
                            break;
                        }
                        default: {
                            n17 = 102;
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
        d = new String(cArray).intern();
    }
}

