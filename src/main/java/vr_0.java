/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vr
 */
class vr_0
implements Runnable {
    final QI t;
    private final UD o;

    vr_0(QI qI, UD uD2) {
        this.t = qI;
        this.o = uD2;
    }

    @Override
    public void run() {
        this.o.X();
    }
}

