/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;

/*
 * Renamed from bo
 */
public class bo_2 {
    String i;
    String g;
    String J;
    public static int f;
    public static int q;
    public static int p;
    public static int e;
    public static int E;
    public static int B;
    int r;
    boolean R;
    boolean n;
    boolean Q;
    String A;

    bo_2(String string, String string2, String string3) {
        this(string, string2, string3, null);
    }

    public bo_2(String string, String string2, String string3, String string4) {
        block9: {
            int n10;
            block16: {
                block17: {
                    String string5;
                    block14: {
                        block15: {
                            block12: {
                                block13: {
                                    block10: {
                                        block11: {
                                            block7: {
                                                block8: {
                                                    int n11;
                                                    String string6 = W2.F();
                                                    string5 = string6;
                                                    this.r = 0;
                                                    this.R = false;
                                                    this.n = false;
                                                    this.Q = false;
                                                    this.g = string;
                                                    this.i = string2;
                                                    this.J = string3;
                                                    n10 = n11 = string.lastIndexOf("/");
                                                    if (string5 != null) {
                                                        if (n10 > -1) {
                                                            string2 = string.substring(n11);
                                                        }
                                                        n10 = string3.startsWith("d") ? 1 : 0;
                                                    }
                                                    if (string5 == null) break block7;
                                                    if (n10 == 0) break block8;
                                                    this.r = bo_2.q;
                                                    this.R = true;
                                                    if (string5 != null) break block9;
                                                }
                                                n10 = string3.startsWith("l") ? 1 : 0;
                                            }
                                            if (string5 == null) break block10;
                                            if (n10 == 0) break block11;
                                            this.r = bo_2.p;
                                            this.n = true;
                                            this.A = string4;
                                            if (string5 != null) break block9;
                                        }
                                        n10 = string3.startsWith("-") ? 1 : 0;
                                    }
                                    if (string5 == null) break block12;
                                    if (n10 == 0) break block13;
                                    this.r = bo_2.f;
                                    if (string5 != null) break block9;
                                }
                                n10 = string3.startsWith("s") ? 1 : 0;
                            }
                            if (string5 == null) break block14;
                            if (n10 == 0) break block15;
                            this.r = bo_2.e;
                            if (string5 != null) break block9;
                        }
                        n10 = string3.startsWith("c") ? 1 : 0;
                    }
                    if (string5 == null) break block16;
                    if (n10 == 0) break block17;
                    this.r = bo_2.E;
                    if (string5 != null) break block9;
                }
                n10 = string3.startsWith("b") ? 1 : 0;
            }
            if (n10 != 0) {
                this.r = bo_2.B;
            }
        }
        if (ky_2.F() != null) {
            W2.d("yD84Kc");
        }
    }

    public String X() {
        return (String)this.i;
    }

    public String U() {
        return (String)this.g;
    }

    public String B() {
        return (String)this.J;
    }

    public void T(String string) {
        this.J = string;
    }

    public boolean n() {
        return this.R;
    }

    public boolean Y(boolean bl) {
        boolean bl2 = bl;
        this.R = bl2;
        return bl2;
    }

    public int P() {
        return this.r;
    }

    public void R(int n10) {
        this.r = n10;
    }

    public String i() {
        return (String)this.A;
    }

    public boolean t() {
        return this.Q;
    }

    public void N(boolean bl) {
        this.Q = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 5935041026846809866L;
                var0_1 = new long[5];
                var4_2 = 0;
                var5_3 = "\u0004y\u00d7\u00ecd\u0092\u00df\t\u00af\u00adb\u00c3d\u0092\u00df\u000e\u00ff8\u00d3#d\u0092\u00df\u000f";
                var6_4 = "\u0004y\u00d7\u00ecd\u0092\u00df\t\u00af\u00adb\u00c3d\u0092\u00df\u000e\u00ff8\u00d3#d\u0092\u00df\u000f".length();
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
                    var5_3 = "h\u00bec\u00a6d\u0092\u00df\b\u00ceiC\nd\u0092\u00df\u000f";
                    var6_4 = "h\u00bec\u00a6d\u0092\u00df\b\u00ceiC\nd\u0092\u00df\u000f".length();
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
        bo_2.f = 1;
        bo_2.q = (int)var0_1[3];
        bo_2.p = (int)var0_1[0];
        bo_2.e = (int)var0_1[1];
        bo_2.E = (int)var0_1[2];
        bo_2.B = (int)var0_1[4];
    }
}

