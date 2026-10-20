/*
 * Decompiled with CFR 0.152.
 */
import com.O_;
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.icmp4j.j;

public class BQ
extends O_ {
    boolean X;
    boolean l;
    boolean C;
    cn_2 K;
    private static final long[] a;
    private static final Integer[] b;

    public BQ() {
        this.X = false;
        this.l = false;
    }

    @Override
    public void paint(Graphics graphics) {
        block27: {
            BQ bQ;
            block25: {
                block26: {
                    int n10;
                    int n11;
                    int n12;
                    Serializable serializable;
                    boolean bl;
                    KV kV;
                    Graphics2D graphics2D;
                    block32: {
                        int[] nArray;
                        block33: {
                            block36: {
                                int n13;
                                int n14;
                                block34: {
                                    block35: {
                                        int n15;
                                        ArrayList arrayList;
                                        int n16;
                                        int n17;
                                        block28: {
                                            block29: {
                                                ArrayList arrayList2;
                                                String string;
                                                KV kV2;
                                                graphics2D = (Graphics2D)graphics;
                                                nArray = YQ.m();
                                                bQ = this;
                                                if (nArray == null) break block25;
                                                if ((cn_2)bQ.K == null) break block26;
                                                try {
                                                    kV2 = (KV)this.K.C();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                kV = kV2;
                                                if (nArray == null) break block27;
                                                if (kV == null) break block26;
                                                bQ = this;
                                                if (nArray == null) break block25;
                                                try {
                                                    string = (String)bQ.K.B();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (string == null) break block26;
                                                bl = this.X;
                                                if (nArray == null) break block28;
                                                if (!bl) break block29;
                                                try {
                                                    arrayList2 = (ArrayList)kV.X();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                serializable = arrayList2;
                                                n12 = ((ArrayList)serializable).size();
                                                n11 = 0;
                                                int n18 = ((ArrayList)serializable).size() - 1;
                                                n10 = this.getWidth();
                                                n17 = 3;
                                                n16 = 0;
                                                n14 = 3;
                                                while (n18 > -1 && n18 <= ((ArrayList)serializable).size() - 1) {
                                                    block31: {
                                                        int n19;
                                                        block30: {
                                                            j j2 = (j)((ArrayList)serializable).get(n18);
                                                            boolean bl2 = false;
                                                            n10 = this.getWidth() - n11 * n17 - 2;
                                                            Color color = new Color(BQ.b(23858, 405101189042242590L), BQ.b(32610, 1181630850680694339L), BQ.b(95, 4827956972381919608L), BQ.b(28022, 1279751076815680592L));
                                                            n19 = j2.r();
                                                            if (nArray == null) break block30;
                                                            if (n19 == 0) {
                                                                color = new Color(BQ.b(25796, 3786072303137897958L), BQ.b(24356, 2336235377905042954L), BQ.b(95, 4827956972381919608L), BQ.b(4618, 3432835749587733285L));
                                                            }
                                                            graphics2D.setColor(color);
                                                            graphics2D.fillRect(n10, this.getHeight() - n14, n17, n14);
                                                            if (nArray == null) break block31;
                                                            n19 = n10;
                                                        }
                                                        if (n19 < n16 && nArray != null) break;
                                                        ++n11;
                                                        --n18;
                                                    }
                                                    if (nArray != null) continue;
                                                }
                                                if (nArray != null) break block26;
                                            }
                                            bl = this.l;
                                        }
                                        if (nArray == null) break block32;
                                        if (!bl) break block33;
                                        serializable = new Color(BQ.b(14011, 187732484572213147L), BQ.b(28447, 243396881608652338L), BQ.b(32511, 5936554321999275994L), BQ.b(32511, 5936554321999275994L));
                                        graphics2D.setColor((Color)serializable);
                                        try {
                                            arrayList = (ArrayList)kV.X();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        n12 = arrayList.size();
                                        try {
                                            n15 = (Integer)kV.B();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        n11 = n15;
                                        float f10 = (float)n11 / (float)n12;
                                        n10 = 3;
                                        n17 = 2;
                                        n16 = 5;
                                        n14 = (int)(((float)this.getWidth() - (float)n16) * f10) + n17;
                                        n13 = n10;
                                        if (nArray == null) break block34;
                                        if (!(f10 > 0.0f)) break block35;
                                        graphics2D.fillRect(this.getWidth() - n14, n13, n14, this.getHeight() - 2 * n10);
                                        if (nArray != null) break block36;
                                    }
                                    serializable = new Color(BQ.b(95, 4827956972381919608L), BQ.b(5969, 6408181156028468850L), BQ.b(95, 4827956972381919608L), BQ.b(16392, 6596589606912760098L));
                                    graphics2D.setColor((Color)serializable);
                                }
                                graphics2D.fillRect(this.getWidth() - n14, n13, n14, this.getHeight() - 2 * n10);
                            }
                            if (nArray != null) break block26;
                        }
                        bQ = this;
                        if (nArray == null) break block25;
                        bl = bQ.C;
                    }
                    if (bl) {
                        int n20;
                        serializable = new Color(BQ.b(2399, 1371192639364419707L), BQ.b(5969, 6408181156028468850L), BQ.b(16392, 6596589606912760098L), BQ.b(4618, 3432835749587733285L));
                        graphics2D.setColor((Color)serializable);
                        n12 = 3;
                        n11 = 2;
                        float f11 = (float)this.getWidth() / 500.0f;
                        try {
                            n20 = (Integer)kV.A();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n10 = (int)(f11 * (float)n20 + (float)n11);
                        graphics2D.fillRect(this.getWidth() - n10, n12, n10, this.getHeight() - 2 * n12);
                    }
                }
                bQ = this;
            }
            super.paint(graphics);
        }
    }

    public boolean S() {
        return this.C;
    }

    public void Z(boolean bl) {
        this.C = bl;
    }

    public boolean j() {
        return this.l;
    }

    public void Q(boolean bl) {
        this.l = bl;
    }

    public boolean G() {
        return this.X;
    }

    public void r(boolean bl) {
        this.X = bl;
    }

    public cn_2 I() {
        return (cn_2)this.K;
    }

    public void P(cn_2 cn_22) {
        this.K = cn_22;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8490783523893611192L;
                var6_1 = new long[13];
                var3_2 = 0;
                var4_3 = "r\u0003\u0095\u00f9\u0010\u00ee\u00be~\u00ca\u00e0\u00a5B\u0097\u00da\u00d3\u00a4\u00fcm9'5\u0099ZO\"Z2\u00c9\u001e\u00f8\u00ad\u001a(\u001dE\u00e4\u00bc\u0011\u00b7\u00a4hQ\u00c2\u00fe\u00cb\u0006\u00c4\u0002_R\u00f6f\u00c9\u00d1e\u00dcg\u000f3\u00e5x\u001c,3\u0016\u00176\u00cd=\u00d0\f\u00ca)R\u0095\u0006\u00dc\u001bA\u000b\u00c9\t\u009e\u00aeh\u0098\u008e\u00c2";
                var5_4 = "r\u0003\u0095\u00f9\u0010\u00ee\u00be~\u00ca\u00e0\u00a5B\u0097\u00da\u00d3\u00a4\u00fcm9'5\u0099ZO\"Z2\u00c9\u001e\u00f8\u00ad\u001a(\u001dE\u00e4\u00bc\u0011\u00b7\u00a4hQ\u00c2\u00fe\u00cb\u0006\u00c4\u0002_R\u00f6f\u00c9\u00d1e\u00dcg\u000f3\u00e5x\u001c,3\u0016\u00176\u00cd=\u00d0\f\u00ca)R\u0095\u0006\u00dc\u001bA\u000b\u00c9\t\u009e\u00aeh\u0098\u008e\u00c2".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "^lX5e\u00d3\u00bc\u0006\u00e0\u00ba\u00d1\u00a4\u00e7z\u0093e";
                    var5_4 = "^lX5e\u00d3\u00bc\u0006\u00e0\u00ba\u00d1\u00a4\u00e7z\u0093e".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
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
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
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
        BQ.a = var6_1;
        BQ.b = new Integer[13];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5926;
        if (b[n11] == null) {
            BQ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

