/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

class FI
implements Runnable {
    final cm_2 f;
    private final o9_0 j;
    private final a6 h;

    FI(cm_2 cm_22, o9_0 o9_02, a6 a62) {
        this.f = cm_22;
        this.j = o9_02;
        this.h = a62;
    }

    @Override
    public void run() {
        b2_0 b2_02 = null;
        ky_2[] ky_2Array = a6.P();
        int n10 = 0;
        block0: while (n10 < this.f.I) {
            b2_02 = this.j.W(this.f.S, this.f.Y, 1);
            do {
                if (b2_02.g == 0.0f || ky_2Array == null) {
                    ++n10;
                    continue block0;
                }
                this.h.g = b2_02;
            } while (ky_2Array == null);
        }
    }
}

