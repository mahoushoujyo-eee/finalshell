/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.ne_1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Renamed from com.Gk
 */
public final class gk_0 {
    private static Long C;
    private static Long R;
    private static Long T;
    private static Long o;
    private static final long[] a;
    private static final Integer[] b;

    public static Long s() {
        return C;
    }

    public static Long y() {
        return R;
    }

    public static void k() {
        R = C = Long.valueOf(gk_0.r());
    }

    public static long N() {
        return gk_0.t(false);
    }

    public static long t(boolean bl) {
        block3: {
            block2: {
                String string = FV.D();
                if (string != null) break block2;
                if (C != null) break block3;
                gk_0.k();
            }
            return 0L;
        }
        long l2 = gk_0.r();
        long l3 = bl ? l2 - C : l2 - R;
        R = l2;
        return l3;
    }

    public static void p() {
        gk_0.X(false);
    }

    public static void v(String string) {
        gk_0.o(false, string);
    }

    public static void X(boolean bl) {
        gk_0.o(bl, "");
    }

    public static void o(boolean bl, String string) {
        block4: {
            block3: {
                String string2;
                block2: {
                    string2 = FV.D();
                    if (string2 != null) break block2;
                    if (C != null) break block3;
                    ne_1.n(gk_0.class, string + "0", new Object[0]);
                    gk_0.k();
                }
                if (string2 == null) break block4;
            }
            long l2 = gk_0.r();
            ne_1.n(gk_0.class, string + (bl ? l2 - C : l2 - R), new Object[0]);
            R = l2;
        }
    }

    public static void U() {
        C = null;
        R = null;
    }

    public static Long v() {
        return T;
    }

    public static Long n() {
        return o;
    }

    public static void Y() {
        o = T = Long.valueOf(gk_0.f());
    }

    public static long O() {
        return gk_0.S(false);
    }

    public static long S(boolean bl) {
        block3: {
            block2: {
                String string = FV.D();
                if (string != null) break block2;
                if (T != null) break block3;
                gk_0.Y();
            }
            return 0L;
        }
        long l2 = gk_0.f();
        long l3 = bl ? l2 - T : l2 - o;
        o = l2;
        return l3;
    }

    public static void H() {
        gk_0.o(false);
    }

    public static void p(String string) {
        gk_0.f(false, string);
    }

    public static void o(boolean bl) {
        gk_0.f(bl, "");
    }

    public static void f(boolean bl, String string) {
        block4: {
            block3: {
                String string2;
                block2: {
                    string2 = FV.D();
                    if (string2 != null) break block2;
                    if (T != null) break block3;
                    ne_1.n(gk_0.class, string + "0", new Object[0]);
                    gk_0.Y();
                }
                if (string2 == null) break block4;
            }
            long l2 = gk_0.f();
            ne_1.n(gk_0.class, string + (bl ? l2 - T : l2 - o), new Object[0]);
            o = l2;
        }
    }

    public static void a() {
        T = null;
        o = null;
    }

    public static long r() {
        return System.currentTimeMillis();
    }

    public static long f() {
        return System.nanoTime();
    }

    public static Date V() {
        return new Date(gk_0.r());
    }

    public static boolean N(Date date, Date date2) {
        return gk_0.n(date.getTime(), date2.getTime());
    }

    public static boolean n(Long l2, Long l3) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        calendar.setTimeInMillis(l2);
        boolean bl = gk_0.i(calendar, l3);
        calendar.setTime(date);
        return bl;
    }

    public static boolean X(Calendar calendar, Date date) {
        return gk_0.i(calendar, date.getTime());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean i(Calendar var0, Long var1_1) {
        block6: {
            block5: {
                block4: {
                    var3_2 = var0.getTimeInMillis();
                    var2_3 = FV.D();
                    var5_4 = var0.get(1);
                    var6_5 = var0.get(2);
                    var7_6 = var0.get(5);
                    var0.setTimeInMillis(var1_1);
                    v0 = var5_4;
                    v1 = var0.get(1);
                    if (var2_3 != null) break block4;
                    if (v0 != v1) ** GOTO lbl-1000
                    v0 = var6_5;
                    v1 = var0.get(2);
                }
                if (var2_3 != null) break block5;
                if (v0 != v1) ** GOTO lbl-1000
                v0 = var7_6;
                if (var2_3 != null) break block6;
                v1 = var0.get(5);
            }
            ** if (v0 != v1) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v0 = true;
                ** GOTO lbl25
            }
lbl-1000:
            // 3 sources

            {
                v0 = false;
            }
        }
        var8_7 = v0;
        var0.setTimeInMillis(var3_2);
        return var8_7;
    }

    public static Date E(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(gk_0.a(17741, 6183274106357341088L), 0);
        calendar.set(gk_0.a(29841, 2994919220093020788L), 0);
        calendar.set(gk_0.a(25136, 5339690990995897566L), 0);
        calendar.set(gk_0.a(9957, 8459939535672293379L), 1);
        return calendar.getTime();
    }

    public static Date i(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(gk_0.a(27462, 5505792831978075565L), gk_0.a(9962, 1428326353112610816L));
        calendar.set(gk_0.a(23242, 3930480826444039213L), gk_0.a(24716, 3981677769103015520L));
        calendar.set(gk_0.a(4559, 1425535564778868512L), gk_0.a(29935, 8169139651951520263L));
        calendar.set(gk_0.a(25749, 4130667496479652476L), gk_0.a(26405, 643755650370369985L));
        return calendar.getTime();
    }

    public static void o(Calendar calendar) {
        gk_0.p(calendar, 1);
    }

    public static void J(Calendar calendar) {
        gk_0.p(calendar, -1);
    }

    public static void p(Calendar calendar, int n10) {
        calendar.set(5, calendar.get(5) + n10);
    }

    public static String y(String string) {
        return gk_0.c(string, new Date());
    }

    public static String c(String string, Date date) {
        return new SimpleDateFormat(string).format(date);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2846972290367792592L;
                var6_1 = new long[12];
                var3_2 = 0;
                var4_3 = "\u00af\u000e\u00d5\u008c\u00cd\u0094*\u00fd?\u00e4\u0004)\u008ciY\u0003%\u00be\u0015j\u00c6\u008c~{\u00f8\u001eH\u001b\u0019\u00b4\u00db\u008b\u00eb+\u00ad\u00df01PvH\u0097\u00ab\u00a9\u00f0[\u009d\u00c7\t\u00b3`^8+_\u00a2\u00c5\u0000\u008cF\u0097\u00e0O\u00ec\u0005\u00cf\u00f0idn\u00e1\u00f1[Y\u00b8\u00d7\u0089\u00c7\u001d\u00dd";
                var5_4 = "\u00af\u000e\u00d5\u008c\u00cd\u0094*\u00fd?\u00e4\u0004)\u008ciY\u0003%\u00be\u0015j\u00c6\u008c~{\u00f8\u001eH\u001b\u0019\u00b4\u00db\u008b\u00eb+\u00ad\u00df01PvH\u0097\u00ab\u00a9\u00f0[\u009d\u00c7\t\u00b3`^8+_\u00a2\u00c5\u0000\u008cF\u0097\u00e0O\u00ec\u0005\u00cf\u00f0idn\u00e1\u00f1[Y\u00b8\u00d7\u0089\u00c7\u001d\u00dd".length();
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
                    var4_3 = "\u00d6s(\u0088`b\u00cf\u00a8\u008b\u00fe\u00b4\u00b0\u00ba\u00b9_\u00f6";
                    var5_4 = "\u00d6s(\u0088`b\u00cf\u00a8\u008b\u00fe\u00b4\u00b0\u00ba\u00b9_\u00f6".length();
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
        gk_0.a = var6_1;
        gk_0.b = new Integer[12];
        gk_0.C = null;
        gk_0.R = null;
        gk_0.T = null;
        gk_0.o = null;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1EEF;
        if (b[n11] == null) {
            gk_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

