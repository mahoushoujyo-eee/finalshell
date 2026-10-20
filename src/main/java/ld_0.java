/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from Ld
 */
class ld_0
implements Comparator {
    final vc_0 O;

    ld_0(vc_0 vc_02) {
        this.O = vc_02;
    }

    public int V(L1 l1, L1 l12) {
        double d2;
        block19: {
            int n10;
            block14: {
                int[] nArray;
                block17: {
                    double d3;
                    double d4;
                    block18: {
                        block15: {
                            block16: {
                                block12: {
                                    double d5;
                                    double d6;
                                    block13: {
                                        int n11;
                                        int n12;
                                        int n13;
                                        int n14;
                                        try {
                                            n14 = (Integer)l1.w();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        d6 = n14;
                                        try {
                                            n13 = (Integer)l12.w();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        d5 = n13;
                                        try {
                                            n12 = (Integer)l1.K();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        d4 = n12;
                                        nArray = yb_1.Y();
                                        try {
                                            n11 = (Integer)l12.K();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        d3 = n11;
                                        n10 = 0;
                                        d2 = d6 == d5 ? 0 : (d6 > d5 ? 1 : -1);
                                        if (nArray != null) break block12;
                                        if (d2 <= 0) break block13;
                                        n10 = -1;
                                        if (nArray == null) break block14;
                                    }
                                    d2 = d5 == d6 ? 0 : (d5 > d6 ? 1 : -1);
                                }
                                if (nArray != null) break block15;
                                if (d2 <= 0) break block16;
                                n10 = 1;
                                if (nArray == null) break block14;
                            }
                            d2 = d4 == d3 ? 0 : (d4 > d3 ? 1 : -1);
                        }
                        if (nArray != null) break block17;
                        if (d2 <= 0) break block18;
                        n10 = 1;
                        if (nArray == null) break block14;
                    }
                    d2 = d3 == d4 ? 0 : (d3 > d4 ? 1 : -1);
                }
                if (nArray != null) break block19;
                if (d2 > 0) {
                    n10 = -1;
                }
            }
            d2 = n10;
        }
        return (int)d2;
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.V((Object)((L1)object), (Object)((L1)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

