/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.List;
import org.F.c;
import org.I;
import org.v.R8;
import org.v.RG;
import org.v._r_0;
import org.v.h_2;

public final class RN
extends R8 {
    public final List D = new ArrayList();
    private static final String d;

    public RN(I i2) {
        super(i2);
    }

    public void q(_r_0 _r_02) {
        this.D.add(_r_02);
        _r_02.G(this);
    }

    public void q(List list) {
        String[] stringArray = RG.C();
        this.D.addAll(list);
        String[] stringArray2 = stringArray;
        for (_r_0 _r_02 : list) {
            _r_02.G(this);
            if (stringArray2 != null) continue;
        }
    }

    public _r_0[] a() {
        return this.D.toArray(new _r_0[this.D.size()]);
    }

    @Override
    @c
    public Object R(h_2 h_22) throws Throwable {
        return h_22.G(this);
    }

    public String toString() {
        return d;
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
                char[] cArray3 = "[s-&jh\u0010".toCharArray();
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
                            n17 = 8;
                            break;
                        }
                        case 1: {
                            n17 = 123;
                            break;
                        }
                        case 2: {
                            n17 = 43;
                            break;
                        }
                        case 3: {
                            n17 = 32;
                            break;
                        }
                        case 4: {
                            n17 = 108;
                            break;
                        }
                        case 5: {
                            n17 = 96;
                            break;
                        }
                        default: {
                            n17 = 69;
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

