/*
 * Decompiled with CFR 0.152.
 */
public class K5 {
    private byte[] q;
    private byte[] K;
    private int b;
    private yu_2 J;

    public K5(byte[] byArray) {
        this(byArray, yu_2.BIN);
    }

    public K5(byte[] byArray, yu_2 yu_22) {
        this.q = byArray;
        this.J = yu_22;
        this.K = new byte[this.q.length * 2];
        this.x();
    }

    private void p(byte by) {
        this.K[this.b] = by;
        ++this.b;
    }

    private void x() {
        byte by = 0;
        String[] stringArray = ub_0.A();
        for (byte by2 : this.q) {
            byte by3;
            block5: {
                block6: {
                    by3 = this.J.d();
                    if (stringArray != null) break block5;
                    if (by3 != 0) break block6;
                    by3 = (byte)(xP.W(by2, by, false) ? 1 : 0);
                    if (stringArray != null) break block5;
                    if (by3 != 0) {
                        this.p(x9.ZDLE.r());
                        by2 = xP.c(by2);
                    }
                }
                this.p(by2);
                by3 = by2;
            }
            by = by3;
            if (stringArray == null) continue;
        }
    }

    public byte[] v() {
        return this.q;
    }

    public int e() {
        return this.b;
    }

    public byte[] n() {
        return this.K;
    }
}

