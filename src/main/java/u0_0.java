/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Renamed from u0
 */
class u0_0
implements Runnable {
    final qg_0 w;

    u0_0(qg_0 qg_02) {
        this.w = qg_02;
    }

    @Override
    public void run() {
        ((Q6)this.w.T).fireTableDataChanged();
    }
}

