/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KE;
import com.a0;
import com.hi_0;
import com.oc_0;
import com.ph_2;
import com.yn_2;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from com.ad
 */
class ad_0
implements a0 {
    private final int[] B;

    public ad_0(int[] nArray) {
        this.B = nArray;
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        oc_0 oc_02;
        block4: {
            oc_0 oc_03 = new oc_0(this.B.length);
            String string = hi_0.C();
            for (int i2 = 0; i2 < this.B.length; ++i2) {
                Object object3 = ph_22.n(object2, this.B[i2]);
                try {
                    oc_02 = oc_03;
                    if (string == null) {
                        oc_02.add(object3);
                        if (string == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw ad_0.a(unsupportedOperationException);
                }
            }
            oc_02 = oc_03;
        }
        return oc_02;
    }

    @Override
    public void Z(ph_2 ph_22, yn_2 yn_22, KE kE) {
        block22: {
            block27: {
                List list;
                int[] nArray;
                String string;
                block26: {
                    int n10;
                    KE kE2;
                    block24: {
                        block25: {
                            int n11;
                            block23: {
                                Object object;
                                block21: {
                                    string = hi_0.C();
                                    try {
                                        try {
                                            object = kE;
                                            if (string != null) break block21;
                                            if (!((KE)object).o) break block22;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw ad_0.a(unsupportedOperationException);
                                        }
                                        object = yn_22.M();
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw ad_0.a(unsupportedOperationException);
                                    }
                                }
                                kE2 = object;
                                try {
                                    try {
                                        n11 = kE2 instanceof List;
                                        if (string != null) break block23;
                                        if (n11 == 0) break block22;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw ad_0.a(unsupportedOperationException);
                                    }
                                    n11 = this.B.length;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw ad_0.a(unsupportedOperationException);
                                }
                            }
                            nArray = new int[n11];
                            try {
                                System.arraycopy(this.B, 0, nArray, 0, nArray.length);
                                n10 = nArray[0];
                                if (string != null) break block24;
                                if (n10 < 0) break block25;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw ad_0.a(unsupportedOperationException);
                            }
                            n10 = 1;
                            break block24;
                        }
                        n10 = 0;
                    }
                    int n12 = n10;
                    list = (List)((Object)kE2);
                    try {
                        int n13;
                        try {
                            n13 = n12;
                            if (string != null) break block26;
                            if (n13 == 0) break block22;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw ad_0.a(unsupportedOperationException);
                        }
                        n13 = list.size() - 1;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ad_0.a(unsupportedOperationException);
                    }
                }
                for (int i2 = v5947961; i2 >= 0; --i2) {
                    try {
                        Object object;
                        try {
                            try {
                                if (string != null) break block27;
                                object = nArray;
                                if (string != null) continue;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw ad_0.a(unsupportedOperationException);
                            }
                            if (Arrays.binarySearch(object, i2) >= 0) continue;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw ad_0.a(unsupportedOperationException);
                        }
                        object = list.remove(i2);
                        continue;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw ad_0.a(unsupportedOperationException);
                    }
                }
                kE.t = list;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

