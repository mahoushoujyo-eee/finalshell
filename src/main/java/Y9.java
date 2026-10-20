/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;

public class Y9 {
    t3_0 K;
    public static int D;
    public static int u;
    public static int C;
    public static int f;
    public static int n;
    boolean i;
    MouseEvent e;
    int V;
    int v;
    int I;
    int Y;
    boolean S;
    boolean L;

    Y9(t3_0 t3_02, int n10) {
        this.K = t3_02;
        this.V = n10;
    }

    public t3_0 l() {
        return (t3_0)this.K;
    }

    public void r(t3_0 t3_02) {
        this.K = t3_02;
    }

    public int Z() {
        return this.V;
    }

    public void L(int n10) {
        this.V = n10;
    }

    public MouseEvent K() {
        return (MouseEvent)this.e;
    }

    public void I(MouseEvent mouseEvent) {
        this.e = mouseEvent;
    }

    public boolean R() {
        return this.S;
    }

    public void a(boolean bl) {
        this.S = bl;
    }

    public boolean g() {
        return this.i;
    }

    public void I(boolean bl) {
        this.i = bl;
    }

    public int L() {
        return this.v;
    }

    public void j(int n10) {
        this.v = n10;
    }

    public int b() {
        return this.I;
    }

    public void m(int n10) {
        this.I = n10;
    }

    public int d() {
        return this.Y;
    }

    public void P(int n10) {
        this.Y = n10;
    }

    public boolean r() {
        return this.L;
    }

    public void Y(boolean bl) {
        this.L = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 4881907864969284400L;
                var0_1 = new long[5];
                var4_2 = 0;
                var5_3 = "\u008b\u0012g\u008fu\u00ae\u000bW6\u00dc\u00d5\nu\u00ae\u000bT\u00e1\u0082>\u00ebu\u00ae\u000bV";
                var6_4 = "\u008b\u0012g\u008fu\u00ae\u000bW6\u00dc\u00d5\nu\u00ae\u000bT\u00e1\u0082>\u00ebu\u00ae\u000bV".length();
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
                    var5_3 = "u$\u00b1\u0092u\u00ae\u000bU\u00a0\u00eeu\nu\u00ae\u000bX";
                    var6_4 = "u$\u00b1\u0092u\u00ae\u000bU\u00a0\u00eeu\nu\u00ae\u000bX".length();
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
        Y9.D = (int)var0_1[1];
        Y9.u = (int)var0_1[3];
        Y9.C = (int)var0_1[2];
        Y9.f = (int)var0_1[0];
        Y9.n = (int)var0_1[4];
    }
}

