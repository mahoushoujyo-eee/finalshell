/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import org.F.c;
import org.I;
import org.P;
import org.b_0;
import org.v.NT;
import org.v.NU;
import org.v.RF;
import org.v.RG;
import org.v.RJ;
import org.v._8;
import org.v._U;
import org.v._i_0;
import org.v.f2;
import org.v.fu_0;
import org.v.hU;
import org.v.hd_0;
import org.v.nt_0;
import org.v.u_1;

/*
 * Renamed from org.v._q
 */
public abstract class _q_0
extends _i_0
implements hU {
    public final List k = new ArrayList();
    public final List I = new ArrayList();
    final SortedMap E = new TreeMap();
    private static boolean c;
    private static final String d;

    public _q_0(I i2, fu_0[] fu_0Array, @c _U[] _UArray) {
        super(i2, fu_0Array, _UArray);
    }

    public void K(NU nU2) {
        this.k.add(nU2);
        nU2.C(this);
    }

    public void o(RF rF) {
        this.A(rF);
    }

    public void x(NT nT2) {
        this.A(nT2);
    }

    public void A(_8 _82) {
        block5: {
            hd_0 hd_02;
            block4: {
                this.I.add(_82);
                String[] stringArray = RG.C();
                _82.C(this);
                String[] stringArray2 = stringArray;
                try {
                    try {
                        hd_02 = this.m;
                        if (stringArray2 == null) break block4;
                        if (hd_02 == null) break block5;
                    }
                    catch (P p2) {
                        throw _q_0.a(p2);
                    }
                    hd_02 = this.m;
                }
                catch (P p3) {
                    throw _q_0.a(p3);
                }
            }
            hd_02.z();
        }
    }

    public void B(u_1 u_12) throws b_0 {
        block12: {
            u_1 u_13;
            block13: {
                block14: {
                    _q_0 _q_02;
                    String[] stringArray;
                    block10: {
                        block11: {
                            stringArray = RG.C();
                            try {
                                try {
                                    _q_02 = this;
                                    if (stringArray == null) break block10;
                                    if (_q_02 instanceof f2) break block11;
                                }
                                catch (b_0 b_02) {
                                    throw _q_0.a(b_02);
                                }
                                throw new P();
                            }
                            catch (b_0 b_03) {
                                throw _q_0.a(b_03);
                            }
                        }
                        _q_02 = this.E.get(u_12.h());
                    }
                    u_1 u_14 = (u_1)((Object)_q_02);
                    try {
                        try {
                            try {
                                u_13 = u_14;
                                if (stringArray == null) break block12;
                                if (u_13 == null) break block13;
                            }
                            catch (b_0 b_04) {
                                throw _q_0.a(b_04);
                            }
                            if (u_12.P() == u_14.P()) break block14;
                        }
                        catch (b_0 b_05) {
                            throw _q_0.a(b_05);
                        }
                        throw new P();
                    }
                    catch (b_0 b_06) {
                        throw _q_0.a(b_06);
                    }
                }
                return;
            }
            u_13 = this.E.put(u_12.h(), u_12);
        }
    }

    @Override
    public List t() {
        return this.I;
    }

    NU[] z() {
        List list;
        block2: {
            block3: {
                String[] stringArray = RG.C();
                try {
                    list = this.k;
                    if (stringArray == null) break block2;
                    if (!list.isEmpty()) break block3;
                }
                catch (P p2) {
                    throw _q_0.a(p2);
                }
                NU nU2 = new NU(this.Q(), null, RG.J(this.Q(), new String[]{d}), new RJ(this.Q()), new nt_0[0], null, Collections.emptyList());
                nU2.C(this);
                return new NU[]{nU2};
            }
            list = this.k;
        }
        return list.toArray(new NU[this.k.size()]);
    }

    @Override
    public SortedMap P() {
        return this.E;
    }

    public static void f(boolean bl) {
        c = bl;
    }

    public static boolean g() {
        return c;
    }

    public static boolean j() {
        boolean bl = _q_0.g();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (P p2) {
            throw _q_0.a(p2);
        }
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
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
                if (!_q_0.j()) {
                    _q_0.f(true);
                }
                char[] cArray3 = "b\fJ\u0014B1".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 22;
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
                            n17 = 4;
                            break;
                        }
                        case 1: {
                            n17 = 111;
                            break;
                        }
                        case 2: {
                            n17 = 62;
                            break;
                        }
                        case 3: {
                            n17 = 110;
                            break;
                        }
                        case 4: {
                            n17 = 61;
                            break;
                        }
                        case 5: {
                            n17 = 68;
                            break;
                        }
                        default: {
                            n17 = 100;
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

