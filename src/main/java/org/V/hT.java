/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.HashMap;
import org.b_0;
import org.v.RA;
import org.v.RG;
import org.v.RH;
import org.v._d_0;
import org.v._e_0;
import org.v.c_0;
import org.v.h4;
import org.v.h_1;
import org.v.hy_0;
import org.v.nt_0;
import org.v.rg_0;
import org.v.t_2;

class hT
implements _e_0 {
    static final boolean m;
    final h_1 T;
    private static final String a;

    hT(h_1 h_12) {
        this.T = h_12;
    }

    public h4 v(RA rA) throws b_0 {
        return this.E(rA.A, new hy_0[0]);
    }

    public h4 O(RH rH) throws b_0 {
        return this.E(rH.A, new hy_0[]{new hy_0(a, rH.V)});
    }

    public h4 Y(rg_0 rg_02) throws b_0 {
        return this.E(rg_02.A, rg_02.Z);
    }

    private h4 E(nt_0 nt_02, hy_0[] hy_0Array) throws b_0 {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        String[] stringArray = RG.C();
        for (hy_0 hy_02 : hy_0Array) {
            hashMap.put(hy_02.l, this.z(hy_02.R));
            if (stringArray != null) continue;
        }
        return new c_0(this, hashMap, nt_02);
    }

    /*
     * Loose catch block
     */
    private Object z(t_2 t_22) throws b_0 {
        String[] stringArray = RG.C();
        try {
            Object object;
            block12: {
                Object object2;
                block13: {
                    block16: {
                        object2 = t_22.g(new _d_0(this));
                        if (m) break block13;
                        object = object2;
                        if (stringArray == null) break block12;
                        break block16;
                        catch (Exception exception) {
                            throw hT.a(exception);
                        }
                    }
                    try {
                        block17: {
                            if (object != null) break block13;
                            break block17;
                            catch (Exception exception) {
                                throw hT.a(exception);
                            }
                        }
                        throw new AssertionError();
                    }
                    catch (Exception exception) {
                        throw hT.a(exception);
                    }
                }
                object = object2;
            }
            return object;
        }
        catch (Exception exception) {
            block15: {
                Exception exception2;
                block14: {
                    try {
                        try {
                            exception2 = exception;
                            if (stringArray == null) break block14;
                            if (!(exception2 instanceof b_0)) break block15;
                        }
                        catch (Exception exception3) {
                            throw hT.a(exception3);
                        }
                        exception2 = exception;
                    }
                    catch (Exception exception4) {
                        throw hT.a(exception4);
                    }
                }
                throw (b_0)exception2;
            }
            throw new IllegalStateException(exception);
        }
    }

    @Override
    public Object b(RH rH) throws Throwable {
        return this.O(rH);
    }

    @Override
    public Object a(rg_0 rg_02) throws Throwable {
        return this.Y(rg_02);
    }

    @Override
    public Object z(RA rA) throws Throwable {
        return this.v(rA);
    }

    static Object F(hT hT2, t_2 t_22) throws b_0 {
        return hT2.z(t_22);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                char[] cArray3 = "\u00118\u0019\f\"".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 21;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
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
                            n17 = 114;
                            break;
                        }
                        case 1: {
                            n17 = 76;
                            break;
                        }
                        case 2: {
                            n17 = 96;
                            break;
                        }
                        case 3: {
                            n17 = 108;
                            break;
                        }
                        case 4: {
                            n17 = 82;
                            break;
                        }
                        case 5: {
                            n17 = 114;
                            break;
                        }
                        default: {
                            n17 = 82;
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
        try {
            bl = !h_1.class.desiredAssertionStatus();
        }
        catch (IllegalStateException illegalStateException) {
            throw hT.a(illegalStateException);
        }
        m = bl;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

