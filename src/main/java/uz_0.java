/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Renamed from Uz
 */
class uz_0
implements MouseListener {
    final C_ t;
    final aM f;
    private static final long[] a;
    private static final Integer[] b;

    uz_0(aM aM2, C_ c_) {
        this.f = aM2;
        this.t = c_;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        int n10 = uz_0.a(11954, 7565056891482505379L);
        ((C_)this.t).setForeground(new Color(n10, n10, n10));
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        ((C_)this.t).setForeground(new Color(uz_0.a(15197, 778928473408738638L), uz_0.a(13236, 3136484287224126886L), uz_0.a(12130, 7158988147851592050L)));
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1395296470180665448L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u0099\u009a\u00b5\u00dbo\u0016\u0018\u00af\u0000\u000615b\u0094\u0099\u008c";
                var5_4 = "\u0099\u009a\u00b5\u00dbo\u0016\u0018\u00af\u0000\u000615b\u0094\u0099\u008c".length();
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
                    var4_3 = "\u00cb\u00fe-\u0095\u00ef\u008e\u008d\u0014\u00d9\u009d.\u0086Z\u00ef\u0005\u00aa";
                    var5_4 = "\u00cb\u00fe-\u0095\u00ef\u008e\u008d\u0014\u00d9\u009d.\u0086Z\u00ef\u0005\u00aa".length();
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
        uz_0.a = var6_1;
        uz_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2E11;
        if (b[n11] == null) {
            uz_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

