/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

class mZ
implements Comparator {
    final a3 c;

    mZ(a3 a32) {
        this.c = a32;
    }

    public int compare(Object object, Object object2) {
        int n10;
        block10: {
            int n11;
            block9: {
                int n12;
                int n13;
                try {
                    n13 = (Integer)this.c.V(object);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int n14 = n13;
                int[] nArray = a3.I();
                try {
                    n12 = (Integer)this.c.V(object2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int n15 = n12;
                n10 = n14;
                n11 = n15;
                if (nArray == null) break block9;
                if (n10 > n11) {
                    return 1;
                }
                n10 = n14;
                if (nArray == null) break block10;
                n11 = n15;
            }
            if (n10 < n11) {
                return -1;
            }
            n10 = 0;
        }
        return n10;
    }
}

