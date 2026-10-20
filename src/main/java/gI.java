/*
 * Decompiled with CFR 0.152.
 */
class gI {
    String Z;
    int t;
    final or_2 o;
    private static final long a;

    gI(or_2 or_22) {
        this.o = or_22;
        this.t = (int)a;
    }

    public String a() {
        return this.Z;
    }

    public void C(String string) {
        this.Z = string;
    }

    public int D() {
        return this.t;
    }

    public void Z(int n10) {
        this.t = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6165765050631770184L;
        a = 0xE6795CA65B6CD018L ^ l2;
    }
}

