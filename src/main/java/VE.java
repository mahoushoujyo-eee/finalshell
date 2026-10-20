/*
 * Decompiled with CFR 0.152.
 */
class VE
implements Runnable {
    final B2 U;
    private final UR z;

    VE(B2 b2, UR uR2) {
        this.U = b2;
        this.z = uR2;
    }

    @Override
    public void run() {
        this.z.H = true;
        this.z.R(true);
    }
}

