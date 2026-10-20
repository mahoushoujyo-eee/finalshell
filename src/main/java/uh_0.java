/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Renamed from Uh
 */
public class uh_0
implements bg_1 {
    private static int[] i;

    /*
     * Unable to fully structure code
     */
    @Override
    public double N(String var1_1, String var2_2) {
        block8: {
            var4_3 = D5.f().H(var1_1);
            var5_4 = D5.f().H(var2_2);
            var6_5 = 0.0;
            var3_6 = uh_0.B();
            for (String var9_8 : var4_3) {
                for (String var11_10 : var5_4) {
                    block10: {
                        block9: {
                            var12_11 = new bj_1().r(var9_8, var11_10);
                            v0 = 1.0;
                            if (var3_6 != null) break block8;
                            v1 = var9_8;
                            if (var3_6 != null) ** GOTO lbl16
                            if (v1.length() > var11_10.length()) {
                                v2 = var9_8.length();
                            } else {
                                v1 = var11_10;
lbl16:
                                // 2 sources

                                v2 = v1.length();
                            }
                            var14_12 = v0 - var12_11 / (double)v2;
                            v3 = var6_5;
                            if (var3_6 == null) {
                                v3 = v3 > var14_12 ? var6_5 : var14_12;
                            }
                            v4 = var6_5 = v3;
                            if (var3_6 != null) break block9;
                            if (v4 != 1.0) break block10;
                            v4 = var6_5;
                        }
                        return v4;
                    }
                    if (var3_6 == null) continue;
                    ky_2.K(new String[5]);
                    break;
                }
                if (var3_6 == null) continue;
            }
            v0 = var6_5;
        }
        return v0;
    }

    public static void h(int[] nArray) {
        i = nArray;
    }

    public static int[] B() {
        return i;
    }

    static {
        if (uh_0.B() != null) {
            uh_0.h(new int[2]);
        }
    }
}

