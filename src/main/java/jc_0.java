/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Window;

/*
 * Renamed from Jc
 */
public class jc_0 {
    aM f;
    aM o;
    bq_0 I;
    bq_0 F;
    Window h;
    Window s;
    boolean m;
    boolean n;
    int Y;
    static int g;
    static int S;
    static int w;
    static int p;
    static int e;

    jc_0() {
        this.Y = jc_0.g;
    }

    public aM X() {
        return (aM)this.f;
    }

    public void V(aM aM2) {
        this.f = aM2;
    }

    public aM c() {
        return (aM)this.o;
    }

    public void Q(aM aM2) {
        this.o = aM2;
    }

    public bq_0 I() {
        return (bq_0)this.I;
    }

    public void k(bq_0 bq_02) {
        this.I = bq_02;
    }

    public bq_0 e() {
        return (bq_0)this.F;
    }

    public void m(bq_0 bq_02) {
        this.F = bq_02;
    }

    public boolean s() {
        return this.m;
    }

    public void c(boolean bl) {
        this.m = bl;
    }

    public boolean x() {
        return this.n;
    }

    public void M(boolean bl) {
        this.n = bl;
    }

    public Window o() {
        return (Window)this.h;
    }

    public void v(Window window) {
        this.h = window;
    }

    public Window k() {
        return (Window)this.s;
    }

    public void G(Window window) {
        this.s = window;
    }

    public int V() {
        return this.Y;
    }

    public void u(int n10) {
        this.Y = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 2241013989760599604L;
                var0_1 = new long[5];
                var4_2 = 0;
                var5_3 = "\u00cb@\u00c6?\u00ac\\\u0086\\\u0097\u00a5>\u0097\u00ac\\\u0086R\u008b9\u0099W\u00ac\\\u0086Q";
                var6_4 = "\u00cb@\u00c6?\u00ac\\\u0086\\\u0097\u00a5>\u0097\u00ac\\\u0086R\u008b9\u0099W\u00ac\\\u0086Q".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "\u00d3\u0002\u00ab\u00dc\u00ac\\\u0086P\u00e0\"\u00c15\u00ac\\\u0086S";
                    var6_4 = "\u00d3\u0002\u00ab\u00dc\u00ac\\\u0086P\u00e0\"\u00c15\u00ac\\\u0086S".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var1;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        jc_0.g = (int)var0_1[3];
        jc_0.S = (int)var0_1[2];
        jc_0.w = (int)var0_1[1];
        jc_0.p = (int)var0_1[4];
        jc_0.e = (int)var0_1[0];
    }
}

