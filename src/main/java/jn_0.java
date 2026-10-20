/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Jn
 */
class jn_0
implements Runnable {
    final xQ p;
    private final String t;

    jn_0(xQ xQ2, String string) {
        this.p = xQ2;
        this.t = string;
    }

    @Override
    public void run() {
        this.p.Q.remove(this.t);
    }
}

