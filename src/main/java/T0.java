/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class T0 {
    HashMap c;
    long k;

    public T0(long l2) {
        this.k = l2;
        this.c = new HashMap();
    }

    public boolean equals(Object object) {
        T0 t0 = (T0)object;
        String[] stringArray = QI.N();
        long l2 = this.k - t0.k;
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (stringArray != null) {
            if (l3 == false) {
                return true;
            }
            l3 = 0;
        }
        return (boolean)l3;
    }

    public int hashCode() {
        return Long.toString(this.k).hashCode();
    }

    public void c(nL nL2, kw_0 kw_02) {
        this.c.put(nL2, kw_02);
    }

    public void n(nL nL2) {
        this.c.remove(nL2);
    }

    public int k() {
        return this.c.size();
    }

    public HashMap v() {
        return this.c;
    }
}

