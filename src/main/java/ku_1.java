/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/*
 * Renamed from kU
 */
class ku_1
extends k2_0 {
    private JLabel y;
    final U a;
    private static final long[] b;
    private static final Integer[] c;

    public ku_1(U u10, String string) {
        this.a = u10;
        super(new FlowLayout());
        this.setMinimumSize(new Dimension(ku_1.a(23845, 3071535225548551627L), ku_1.a(21048, 3721634103344216784L)));
        this.setPreferredSize(new Dimension(ku_1.a(8108, 5100437305593526083L), ku_1.a(21169, 2787493154485811802L)));
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        this.y = new JLabel(string);
        ((JLabel)this.y).setBorder(BorderFactory.createEmptyBorder(ku_1.a(3467, 4038129186853872994L), ku_1.a(19897, 9062887053425091923L), ku_1.a(19897, 9062887053425091923L), ku_1.a(19897, 9062887053425091923L)));
        this.add((JLabel)this.y);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8247871120701688630L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "C\u00cb\"#\u0098U1\u00fa\u00a3\u009c:W\u00ccC.o\u0004\u009e\u000f?u/n^\u001b\u00bc\u00a5`wo1\u00b6";
                var5_4 = "C\u00cb\"#\u0098U1\u00fa\u00a3\u009c:W\u00ccC.o\u0004\u009e\u000f?u/n^\u001b\u00bc\u00a5`wo1\u00b6".length();
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
                    var4_3 = "\u00b4\u00e3\u00bf9\t\u00ad\u00fc\u00e3\u0098\u00bcV\u00fa_K>\u00ad";
                    var5_4 = "\u00b4\u00e3\u00bf9\t\u00ad\u00fc\u00e3\u0098\u00bcV\u00fa_K>\u00ad".length();
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
        ku_1.b = var6_1;
        ku_1.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x68EB;
        if (c[n11] == null) {
            ku_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

