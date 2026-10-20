/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Th
 */
class th_0
extends Thread {
    final tp_2 m;

    th_0(tp_2 tp_22) {
        this.m = tp_22;
    }

    @Override
    public void run() {
        this.m.i(this.m.g, this.m.F + 1);
    }
}

