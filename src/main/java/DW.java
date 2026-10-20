/*
 * Decompiled with CFR 0.152.
 */
class DW {
    String F;
    int l;
    final a0 z;
    private static final long a;

    DW(a0 a02) {
        this.z = a02;
        this.l = (int)a;
    }

    public String C() {
        return this.F;
    }

    public void B(String string) {
        this.F = string;
    }

    public int h() {
        return this.l;
    }

    public void o(int n10) {
        this.l = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4686021638084408293L;
        a = 0x7D4DD0792BD0B3B5L ^ l2;
    }
}

