/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class nT
extends JPanel {
    Color P;
    private static final long[] c;
    private static final Integer[] d;

    public nT() {
        this.P = new Color(nT.a(18309, 3323874423531133518L), nT.a(18309, 3323874423531133518L), nT.a(18309, 3323874423531133518L), nT.a(11939, 4348966307409933162L));
        this.addMouseListener(new ng_0(this));
    }

    public nT(LayoutManager layoutManager) {
        this.P = new Color(nT.a(25323, 6743261566705237795L), nT.a(18309, 3323874423531133518L), nT.a(18309, 3323874423531133518L), nT.a(29547, 2229753643738754721L));
        this.setLayout(layoutManager);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2777747773715257367L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u008dl\u0010\u009b\u009a\u00a1\u00ab\u0019w\u00de\u00a5\u0098\u00e8\u00ecg\u00cb";
                var5_4 = "\u008dl\u0010\u009b\u009a\u00a1\u00ab\u0019w\u00de\u00a5\u0098\u00e8\u00ecg\u00cb".length();
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
                    var4_3 = "\u00e8\u00e6\u0012g{zB\u00a64\u009em7\u0000@v\u00d2";
                    var5_4 = "\u00e8\u00e6\u0012g{zB\u00a64\u009em7\u0000@v\u00d2".length();
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
        nT.c = var6_1;
        nT.d = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1DC9;
        if (d[n11] == null) {
            nT.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

