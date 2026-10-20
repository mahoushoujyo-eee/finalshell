/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from ub
 */
class ub_2
implements Comparator {
    final FK J;

    ub_2(FK fK2) {
        this.J = fK2;
    }

    public int c(L1 l1, L1 l12) {
        double d2;
        block11: {
            int n10;
            block10: {
                String[] stringArray;
                block8: {
                    double d3;
                    double d4;
                    block9: {
                        int n11;
                        int n12;
                        try {
                            n12 = (Integer)l1.K();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        d4 = n12;
                        try {
                            n11 = (Integer)l12.K();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        d3 = n11;
                        stringArray = FK.i();
                        n10 = 0;
                        d2 = d4 == d3 ? 0 : (d4 > d3 ? 1 : -1);
                        if (stringArray != null) break block8;
                        if (d2 <= 0) break block9;
                        n10 = -1;
                        if (stringArray == null) break block10;
                    }
                    d2 = d3 == d4 ? 0 : (d3 > d4 ? 1 : -1);
                }
                if (stringArray != null) break block11;
                if (d2 > 0) {
                    n10 = 1;
                }
            }
            d2 = n10;
        }
        return (int)d2;
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.c((Object)((L1)object), (Object)((L1)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

