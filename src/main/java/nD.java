/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class nD {
    public ArrayList I = new ArrayList();
    public a6 F;
    public b2_0 k;
    private static final String a;

    void D(a6 a62) {
        this.I.add(a62);
    }

    /*
     * Unable to fully structure code
     */
    void X(bc_0 var1_1) {
        block8: {
            block6: {
                block7: {
                    var3_2 = new b2_0();
                    var3_2.t = 0;
                    var3_2.g = 1.0f;
                    var2_3 = a6.P();
                    v0 = this;
                    if (var2_3 == null) break block6;
                    if (v0.I.size() <= 0) break block7;
                    var4_4 = (a6)this.I.get(0);
                    var5_5 = var4_4.g;
                    var3_2.t += var5_5.t;
                    var3_2.g *= var5_5.g;
                    var6_6 = 0;
                    if (var2_3 != null) ** GOTO lbl23
                    block0: while (true) {
                        v1 = (a6)this.I.get(var6_6);
                        do {
                            var7_8 = v1;
                            var8_9 = (a6)this.I.get(var6_6 + 1);
                            var9_10 = var1_1.q(var7_8.m, var8_9.m);
                            var3_2.t += var9_10.t;
                            var3_2.g *= var9_10.g;
                            ++var6_6;
lbl23:
                            // 2 sources

                            if (var6_6 < this.I.size() - 1) continue block0;
                            v1 = (a6)this.I.get(this.I.size() - 1);
                        } while (var2_3 == null);
                        break;
                    }
                    var6_7 = v1;
                    this.I.size();
                    var7_8 = var1_1.q(var6_7.m, this.F.m);
                    if (var2_3 == null) break block8;
                    if (!var6_7.B.equals(this.F.B) && !var6_7.j.equals(this.F.j)) {
                        var3_2.t += var7_8.t;
                        var3_2.g *= var7_8.g;
                    }
                }
                v0 = this;
            }
            v0.k = var3_2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        var2_1 = "";
        var3_2 = 0;
        var1_3 = a6.P();
        if (var1_3 != null) ** GOTO lbl11
        block0: while (true) {
            v0 /* !! */  = this.I.get(var3_2);
            do {
                var4_4 = (a6)v0 /* !! */ ;
                var2_1 = String.valueOf(var2_1) + var4_4.B + nD.a;
                ++var3_2;
lbl11:
                // 2 sources

                if (var3_2 < this.I.size()) continue block0;
                v0 /* !! */  = var2_1;
            } while (var1_3 == null);
            break;
        }
        return v0 /* !! */ ;
    }

    b2_0 B() {
        return this.k;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "@V".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 18;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 127;
                            break;
                        }
                        case 1: {
                            n17 = 122;
                            break;
                        }
                        case 2: {
                            n17 = 47;
                            break;
                        }
                        case 3: {
                            n17 = 123;
                            break;
                        }
                        case 4: {
                            n17 = 112;
                            break;
                        }
                        case 5: {
                            n17 = 8;
                            break;
                        }
                        default: {
                            n17 = 21;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

