/*
 * Decompiled with CFR 0.152.
 */
import com.DI;
import com.c;
import com.ky_2;

/*
 * Renamed from yl
 */
public class yl_2 {
    DI v;
    int q;
    public static int O;
    public static int I;
    public static int l;
    public static int N;
    int i;
    private static final long[] a;
    private static final Integer[] b;

    public yl_2(DI dI, int n10) {
        ky_2[] ky_2Array = ty_2.Y();
        this.i = yl_2.a(19066, 7370518447508552269L);
        this.v = dI;
        ky_2[] ky_2Array2 = ky_2Array;
        this.q = n10;
        if (ky_2.F() != null) {
            ty_2.c(new ky_2[4]);
        }
    }

    public DI o() {
        return (DI)this.v;
    }

    public void D(DI dI) {
        this.v = dI;
    }

    public int e() {
        return this.q;
    }

    public void K(int n10) {
        this.q = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1825543814015552940L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "G{\u009a\\p\u00da#\u00f3^\u00c9E\u00c1\u00e5y\u0096\u0012\u0086\u00a7\u0099C\u00bd\u00e5\u00bf[";
                var5_4 = "G{\u009a\\p\u00da#\u00f3^\u00c9E\u00c1\u00e5y\u0096\u0012\u0086\u00a7\u0099C\u00bd\u00e5\u00bf[".length();
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
                    var4_3 = "-\u00fd\u00b59\n3\u00be#%\u00a7\u00efK\u000ez\u00f7\u0086";
                    var5_4 = "-\u00fd\u00b59\n3\u00be#%\u00a7\u00efK\u000ez\u00f7\u0086".length();
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
        yl_2.a = var6_1;
        yl_2.b = new Integer[5];
        yl_2.O = yl_2.a(11198, 8409889248768334732L);
        yl_2.I = yl_2.a(7688, 1681801961949965883L);
        yl_2.l = yl_2.a(986, 6466826928723375082L);
        yl_2.N = yl_2.a(672, 5951886602034393745L);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3033;
        if (b[n11] == null) {
            yl_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

