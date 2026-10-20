/*
 * Decompiled with CFR 0.152.
 */
class O5
implements Runnable {
    final xQ w;
    private final String r;

    O5(xQ xQ2, String string) {
        this.w = xQ2;
        this.r = string;
    }

    @Override
    public void run() {
        this.w.s.remove(this.r);
    }
}

