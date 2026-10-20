/*
 * Decompiled with CFR 0.152.
 */
class DL
implements Runnable {
    final f9_0 X;
    private final qm_0 i;

    DL(f9_0 f9_02, qm_0 qm_02) {
        this.X = f9_02;
        this.i = qm_02;
    }

    @Override
    public void run() {
        this.i.Q = true;
        this.i.u(true);
    }
}

