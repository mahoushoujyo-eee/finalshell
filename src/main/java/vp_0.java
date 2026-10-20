/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Vp
 */
class vp_0 {
    static final boolean T;
    private static final long[] a;
    private static final Integer[] b;

    private vp_0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean w(int n10) {
        ky_2[] ky_2Array = yt_1.c();
        boolean bl = n10;
        int n11 = vp_0.a(21356, 987563240864451930L);
        if (ky_2Array != null) {
            if (bl < n11) return false;
            bl = n10;
            if (ky_2Array == null) return bl;
            n11 = vp_0.a(25388, 3795853034977049881L);
        }
        if (bl > n11) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static char B(int n10) {
        ky_2[] ky_2Array = yt_1.c();
        char c2 = vp_0.T;
        if (ky_2Array == null) return c2;
        if (c2 == '\u0000') {
            try {
                c2 = (char)(((Boolean)vp_0.w(n10)).booleanValue() ? 1 : 0);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (ky_2Array == null) return c2;
            if (c2 == '\u0000') {
                throw new AssertionError();
            }
        }
        c2 = (char)(vp_0.a(18218, 5148575415272577309L) | n10 - vp_0.a(2558, 3550467623185274831L) >> vp_0.a(23659, 7852434749248766555L) & vp_0.a(28606, 8392334620802265482L));
        return c2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static char Q(int n10) {
        ky_2[] ky_2Array = yt_1.c();
        char c2 = vp_0.T;
        if (ky_2Array == null) return c2;
        if (c2 == '\u0000') {
            try {
                c2 = (char)(((Boolean)vp_0.w(n10)).booleanValue() ? 1 : 0);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (ky_2Array == null) return c2;
            if (c2 == '\u0000') {
                throw new AssertionError();
            }
        }
        c2 = (char)(vp_0.a(4779, 1814794869388594329L) | n10 - vp_0.a(2558, 3550467623185274831L) & vp_0.a(2521, 7457785910482589674L));
        return c2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2501025936524877641L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "]\u0081\u00f5zrr\u009d\u0018\u00a4`B\u00cdb\u00e0H\u0086\u00e4\u00d8\rH\u0012\u0081\u008f\u00d0\\\u00c2o\u0098]\u00a0\u00cb\\\u00b7\u009eh0\u001d\u00bb-<c\u00fc\u00c8\u00fc\u00c1\u00ef]\u00af";
                var5_4 = "]\u0081\u00f5zrr\u009d\u0018\u00a4`B\u00cdb\u00e0H\u0086\u00e4\u00d8\rH\u0012\u0081\u008f\u00d0\\\u00c2o\u0098]\u00a0\u00cb\\\u00b7\u009eh0\u001d\u00bb-<c\u00fc\u00c8\u00fc\u00c1\u00ef]\u00af".length();
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
                    var4_3 = "V\u0010\u0015n\u009cn\u0012\u0013/l_uN;\u00deT";
                    var5_4 = "V\u0010\u0015n\u009cn\u0012\u0013/l_uN;\u00deT".length();
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
        vp_0.a = var6_1;
        vp_0.b = new Integer[8];
        vp_0.T = oo_0.class.desiredAssertionStatus() == false;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5E30;
        if (b[n11] == null) {
            vp_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

