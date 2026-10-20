/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from xg
 */
public class xg_0
implements bg_1 {
    private double M;
    private double V;
    private static String G;

    public xg_0() {
        String string = xg_0.r();
        this.M = 0.6;
        String string2 = string;
        this.V = 0.4;
        if (ky_2.F() != null) {
            xg_0.w("Un1KOc");
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public double N(String var1_1, String var2_2) {
        block16: {
            block15: {
                block14: {
                    var3_3 = xg_0.r();
                    v0 = this.L(var1_1);
                    if (var3_3 != null) {
                        if (v0) {
                            v0 = this.L(var2_2);
                            if (var3_3 != null) {
                                if (v0) {
                                    return 1.0;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = this.L(var1_1);
                        }
                    }
                    if (var3_3 == null) break block14;
                    if (v0) break block15;
                    v0 = this.L(var2_2);
                }
                if (!v0) break block16;
            }
            return 0.0;
        }
        var4_4 = new ArrayList<Character>();
        v1 = var1_1;
        if (var3_3 != null) {
            v1 = v1.length() >= var2_2.length() ? var1_1 : var2_2;
        }
        var5_5 = v1;
        v2 = var1_1;
        if (var3_3 != null) {
            v2 = v2.length() < var2_2.length() ? var1_1 : var2_2;
        }
        var6_6 = v2;
        var7_7 = 0;
        while (var7_7 < var5_5.length()) {
            var8_9 = Character.valueOf(var5_5.charAt(var7_7));
            if (var3_3 != null) {
                if (var6_6.contains(var8_9.toString())) {
                    var4_4.add(var8_9);
                }
                ++var7_7;
            }
            if (var3_3 != null) continue;
            ky_2.K(new String[1]);
            break;
        }
        var7_8 = Math.min(1.0 * (double)var1_1.length() / (double)var2_2.length(), 1.0 * (double)var2_2.length() / (double)var1_1.length());
        var9_10 = this.M * (1.0 * (double)var4_4.size() / (double)var1_1.length() + 1.0 * (double)var4_4.size() / (double)var2_2.length()) / 2.0;
        var11_11 = this.V * var7_8 * (this.y(var1_1, var4_4) + this.y(var2_2, var4_4)) / 2.0;
        return var9_10 + var11_11;
    }

    private double y(String string, List list) {
        double d2 = 0.0;
        double d3 = 0.0;
        String string2 = xg_0.r();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (list.contains(Character.valueOf(string.charAt(i2)))) {
                d2 += (double)(i2 + 1);
            }
            d3 += (double)(i2 + 1);
            if (string2 != null) continue;
        }
        return 1.0 * d2 / d3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean L(String string) {
        String string2 = xg_0.r();
        String string3 = string;
        if (string2 != null) {
            if (string3 == null) return true;
            string3 = string.trim();
        }
        boolean bl = string3.equals("");
        if (string2 == null) return bl;
        if (!bl) return false;
        return true;
    }

    public static void w(String string) {
        G = string;
    }

    public static String r() {
        return G;
    }

    static {
        if (xg_0.r() == null) {
            xg_0.w("hNsx4");
        }
    }
}

