/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Renamed from ts
 */
class ts_2
implements Runnable {
    final cm_2 V;
    private final o9_0 b;
    private final a6 I;
    private final a6 Z;

    ts_2(cm_2 cm_22, o9_0 o9_02, a6 a62, a6 a63) {
        this.V = cm_22;
        this.b = o9_02;
        this.I = a62;
        this.Z = a63;
    }

    @Override
    public void run() {
        b2_0 b2_02;
        b2_0 b2_03 = null;
        ky_2[] ky_2Array = a6.P();
        int n10 = 0;
        block0: while (n10 < 3) {
            b2_02 = b2_03 = this.b.e(this.I.m, this.I.a, this.V.S, this.V.Y, 1);
            do {
                if (b2_02.g == 0.0f || ky_2Array == null) {
                    ++n10;
                    continue block0;
                }
                b2_02 = b2_03;
            } while (ky_2Array == null);
        }
        if (b2_02 != null) {
            this.V.f.l(this.Z.m, this.I.m, b2_03);
            this.Z.g(this.I.m, b2_03);
        }
    }
}

