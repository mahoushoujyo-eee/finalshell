/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from Qe
 */
public class qe_0 {
    HashMap f;
    long q;

    public qe_0(long l2) {
        this.q = l2;
        this.f = new HashMap();
    }

    public boolean equals(Object object) {
        qe_0 qe_02 = (qe_0)object;
        String[] stringArray = QI.N();
        long l2 = this.q - qe_02.q;
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
        return Long.toString(this.q).hashCode();
    }

    public void I(be_1 be_12, kw_0 kw_02) {
        this.f.put(be_12, kw_02);
    }

    public void h(be_1 be_12) {
        this.f.remove(be_12);
    }

    public int r() {
        return this.f.size();
    }

    public HashMap b() {
        return this.f;
    }
}

