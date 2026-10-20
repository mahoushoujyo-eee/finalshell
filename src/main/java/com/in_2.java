/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KO;
import com.O2;
import com.YP;
import com.bc_0;
import com.dc_1;
import com.ez_0;
import com.im_2;
import com.j_0;
import com.ky_2;
import com.ua_0;
import com.ya_1;
import com.yw_0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from com.in
 */
public class in_2 {
    private static final Logger P;
    private final List e;
    private YP Z;
    private KO n;
    private im_2 K;
    private static final String a;
    private static final long b;

    public in_2(@NotNull YP yP, @NotNull KO kO) {
        boolean bl = ya_1.w();
        this.Z = yP;
        this.n = kO;
        this.e = new ArrayList();
        boolean bl2 = bl;
        if (!bl2) {
            ky_2.K(new String[4]);
        }
    }

    public void G(@NotNull im_2 im_22) {
        this.K = im_22;
    }

    public void U(@NotNull ua_0 ua_02, @NotNull dc_1 dc_12) {
        boolean bl = ya_1.w();
        in_2 in_22 = this;
        if (bl) {
            if (in_22.e.isEmpty()) {
                return;
            }
            in_22 = this;
        }
        in_22.P(ua_02, dc_12);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private void P(@NotNull ua_0 var1_1, @NotNull dc_1 var2_2) {
        block18: {
            v0 = ya_1.w();
            this.K.w();
            var3_3 = v0;
            try {
                v1 = var4_4 = in_2.W(var1_1, var2_2);
                if (var3_3) {
                    if (v1 == -1) {
                        v2 = this;
                        if (var3_3) {
                            var4_4 = v2.E(this.K.x(), var2_2);
                            if (var4_4 == -1) {
                                in_2.P.debug(in_2.a);
                                return;
                            }
                            v2 = this;
                        }
                        var1_1 = v2.K.x();
                    }
                    v1 = var5_5 = var4_4;
                }
                while (var5_5 > 0 && var1_1.t(var5_5 - 1).G()) {
                    --var5_5;
                    if (var3_3) continue;
                }
                var6_6 = this.Z(var1_1, var5_5, var4_4);
                var7_7 = this.e.iterator();
                block5: while (true) {
                    v3 = var7_7.hasNext();
                    block6: while (v3 != 0) {
                        var8_8 = (bc_0)var7_7.next();
                        var9_9 = var8_8.g(var6_6);
                        if (!var3_3) break block18;
                        v4 = var9_9;
                        if (var3_3) {
                            if (v4 == null) continue block5;
                            v4 = var9_9;
                        }
                        block7: for (O2 var11_11 : v4.A()) {
                            var12_12 = new yw_0(this.Z.K(), this.Z.s(), var11_11.O(), this.n, null);
                            v3 = var11_11.U();
                            if (!var3_3) continue block6;
                            if (var3_3) {
                                if (v3 < 0) continue;
                                v5 = var11_11.c();
                            }
                            if (!var3_3) ** GOTO lbl43
                            v6 = var6_6.length();
                            block8: while (v5 <= v6) {
                                v5 = 0;
lbl43:
                                // 2 sources

                                var13_13 = v5;
                                for (var14_14 = var5_5; var14_14 <= var4_4; ++var14_14) {
                                    var15_15 = Math.max(var13_13, var11_11.U());
                                    var16_16 = Math.min(var13_13 + this.K.B(), var11_11.c());
                                    v7 = var15_15;
                                    v6 = var16_16;
                                    if (!var3_3) continue block8;
                                    if (var3_3) {
                                        if (v7 < v6) {
                                            var1_1.t(var14_14).W(var15_15 - var13_13, new j_0(var6_6.substring(var15_15, var16_16)), var12_12);
                                        }
                                        v8 = var13_13;
                                        v9 = this.K.B();
                                    }
                                    var13_13 = v8 + v9;
                                    if (var3_3) continue;
                                }
                                if (var3_3) continue block7;
                            }
                        }
                        if (var3_3) continue block5;
                    }
                    break block18;
                    break;
                }
                {
                    break block18;
                    break;
                }
            }
            finally {
                this.K.h();
            }
        }
    }

    private int E(@NotNull ua_0 ua_02, @NotNull dc_1 dc_12) {
        int n10 = Math.max(0, ua_02.b() - (int)b);
        boolean bl = ya_1.w();
        for (int i2 = ua_02.b() - 1; i2 >= n10; --i2) {
            if (ua_02.t(i2) != dc_12) continue;
            return i2;
        }
        return -1;
    }

    private static int W(@NotNull ua_0 ua_02, @NotNull dc_1 dc_12) {
        int n10 = 0;
        boolean bl = ya_1.H();
        while (n10 < ua_02.b()) {
            dc_1 dc_13 = ua_02.t(n10);
            if (!bl) {
                if (dc_13 == dc_12) {
                    return n10;
                }
                ++n10;
            }
            if (!bl) continue;
        }
        return -1;
    }

    @NotNull
    private String Z(@NotNull ua_0 ua_02, int n10, int n11) {
        String string;
        block3: {
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl = ya_1.H();
            int n12 = n10;
            while (n12 <= n11) {
                block4: {
                    String string2;
                    block5: {
                        String string3;
                        block6: {
                            string = ua_02.t(n12).V();
                            if (bl) break block3;
                            string2 = string;
                            if (bl) break block4;
                            if (n12 >= n11) break block5;
                            string3 = string2;
                            if (bl) break block6;
                            if (string3.length() >= this.K.B()) break block5;
                            string3 = string2 + new j_0('\u0000', this.K.B() - string2.length());
                        }
                        string2 = string3;
                    }
                    stringBuilder.append(string2);
                    ++n12;
                }
                if (!bl) continue;
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    public void p(@NotNull bc_0 bc_02) {
        this.e.add(bc_02);
    }

    @NotNull
    public List Y(@NotNull String string) {
        ArrayList arrayList = new ArrayList();
        boolean bl = ya_1.w();
        for (bc_0 bc_02 : this.e) {
            ez_0 ez_02 = bc_02.g(string);
            if (ez_02 != null) {
                arrayList.addAll(ez_02.A());
            }
            if (bl) continue;
        }
        if (ky_2.F() != null) {
            ya_1.K(!bl);
        }
        return arrayList;
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
                char[] cArray3 = "\u00149\u0000PTA\u001911\u0000Z\u001bYP9=NXTG\u0019;1\u0000UH\u0015I%7\r[HFP9?".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 125;
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
                            n17 = 42;
                            break;
                        }
                        case 1: {
                            n17 = 37;
                            break;
                        }
                        case 2: {
                            n17 = 19;
                            break;
                        }
                        case 3: {
                            n17 = 67;
                            break;
                        }
                        case 4: {
                            n17 = 70;
                            break;
                        }
                        case 5: {
                            n17 = 72;
                            break;
                        }
                        default: {
                            n17 = 68;
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
        long l2 = 3828723530021475443L;
        b = 0x4DEC462EDE1C14BBL ^ l2;
        P = LoggerFactory.getLogger(in_2.class);
    }
}

