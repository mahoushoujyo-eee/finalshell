/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.H5;
import com.KE;
import com.a0;
import com.hi_0;
import com.ph_2;
import com.yn_2;
import java.util.ArrayList;

/*
 * Renamed from com.Il
 */
class il_0
implements a0 {
    private final int p;
    private final int P;
    private final int g;

    public il_0(int n10, int n11, int n12) {
        this.p = n10;
        this.P = n11;
        this.g = n12;
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        int n10;
        int n11;
        String string;
        int n12;
        block17: {
            int n13;
            block15: {
                block16: {
                    int n14;
                    block14: {
                        int n15;
                        block12: {
                            block13: {
                                n12 = H5.E.T(ph_22, object, object2);
                                string = hi_0.C();
                                try {
                                    try {
                                        n15 = this.p;
                                        if (string != null) break block12;
                                        if (n15 < 0) break block13;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw il_0.a(unsupportedOperationException);
                                    }
                                    n14 = this.p;
                                    break block14;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw il_0.a(unsupportedOperationException);
                                }
                            }
                            n15 = this.p;
                        }
                        n14 = n15 + n12;
                    }
                    n11 = n14;
                    try {
                        try {
                            n13 = this.P;
                            if (string != null) break block15;
                            if (n13 < 0) break block16;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw il_0.a(unsupportedOperationException);
                        }
                        n10 = this.P;
                        break block17;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw il_0.a(unsupportedOperationException);
                    }
                }
                n13 = this.P;
            }
            n10 = n13 + n12;
        }
        int n16 = n10;
        int n17 = (n16 - n11) / this.g + 1;
        try {
            if (n17 == -1) {
                return null;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw il_0.a(unsupportedOperationException);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(n17);
        for (int i2 = n11; i2 <= n16 && i2 < n12; i2 += this.g) {
            Object object3 = ph_22.n(object2, i2);
            arrayList.add(object3);
            if (string == null) continue;
        }
        return arrayList;
    }

    @Override
    public void Z(ph_2 ph_22, yn_2 yn_22, KE kE) {
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

