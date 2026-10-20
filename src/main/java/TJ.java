/*
 * Decompiled with CFR 0.152.
 */
class TJ
implements Runnable {
    final bg_0 b;
    private final String i;
    private final int M;

    TJ(bg_0 bg_02, String string, int n10) {
        this.b = bg_02;
        this.i = string;
        this.M = n10;
    }

    @Override
    public void run() {
        try {
            new n6(this.i, this.M);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

