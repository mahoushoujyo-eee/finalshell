/*
 * Decompiled with CFR 0.152.
 */
public class nL {
    public int j = 0;
    public UR T;
    String r;

    public nL(UR uR2, int n10) {
        this.j = n10;
        this.T = uR2;
        this.r = String.valueOf(uR2.v) + "-" + n10;
    }

    public boolean equals(Object object) {
        nL nL2 = (nL)object;
        return nL2.r.equals(this.r);
    }

    public int hashCode() {
        return this.r.hashCode();
    }
}

