/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bE
 */
public class be_1 {
    public int M = 0;
    public UR I;
    String w;

    public be_1(UR uR2, int n10) {
        this.M = n10;
        this.I = uR2;
        this.w = String.valueOf(uR2.v) + "-" + n10;
    }

    public boolean equals(Object object) {
        be_1 be_12 = (be_1)object;
        return be_12.w.equals(this.w);
    }

    public int hashCode() {
        return this.w.hashCode();
    }
}

