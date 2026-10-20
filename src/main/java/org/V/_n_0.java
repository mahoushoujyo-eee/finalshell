/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.List;
import org.F.c;
import org.I;
import org.v.RF;
import org.v.RG;
import org.v.RO;
import org.v._U;
import org.v._Y;
import org.v._i_0;
import org.v._v_0;
import org.v.fu_0;
import org.v.hd_0;
import org.v.nt_0;
import org.v.q_2;

/*
 * Renamed from org.v._n
 */
public abstract class _n_0
extends _i_0
implements _Y,
RO {
    @c
    private final String f;
    public final String D;
    public final nt_0[] q;
    public final List Q = new ArrayList();
    @c
    q_2[] F;
    private static final String c;

    protected _n_0(I i2, @c String string, fu_0[] fu_0Array, String string2, @c _U[] _UArray, nt_0[] nt_0Array) {
        super(i2, fu_0Array, _UArray);
        this.f = string;
        this.D = string2;
        String[] stringArray = RG.C();
        this.q = nt_0Array;
        for (nt_0 nt_02 : nt_0Array) {
            nt_02.n(new _v_0(this));
            if (stringArray != null) continue;
        }
    }

    @Override
    public String toString() {
        return this.D;
    }

    public void I(RF rF) {
        block3: {
            hd_0 hd_02;
            block2: {
                String[] stringArray = RG.C();
                this.Q.add(rF);
                rF.C(this);
                String[] stringArray2 = stringArray;
                hd_02 = this.m;
                if (stringArray2 == null) break block2;
                if (hd_02 == null) break block3;
                hd_02 = this.m;
            }
            hd_02.z();
        }
    }

    @Override
    public String j() {
        return this.D;
    }

    @Override
    @c
    public String W() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean w() {
        String[] stringArray = RG.C();
        String string = this.f;
        if (stringArray != null) {
            if (string == null) return 0 != 0;
            string = this.f;
        }
        int n10 = string.indexOf(c);
        if (stringArray == null) return n10 != 0;
        if (n10 == -1) return 0 != 0;
        return 1 != 0;
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
                char[] cArray3 = "\u001a\n%\u0011:(0;\u001a%\u0005".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 49;
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
                            n17 = 107;
                            break;
                        }
                        case 1: {
                            n17 = 95;
                            break;
                        }
                        case 2: {
                            n17 = 113;
                            break;
                        }
                        case 3: {
                            n17 = 80;
                            break;
                        }
                        case 4: {
                            n17 = 121;
                            break;
                        }
                        case 5: {
                            n17 = 124;
                            break;
                        }
                        default: {
                            n17 = 98;
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
        c = new String(cArray).intern();
    }
}

