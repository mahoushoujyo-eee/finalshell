/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KB;
import com.XE;
import com.dc_1;
import com.im_2;
import com.j_0;
import com.ru_1;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class a7 {
    private static final Logger e;
    private static final List k;
    private static final long[] a;
    private static final Integer[] b;

    public static List j() {
        return new ArrayList(k);
    }

    public static KB q(XE xE2, XE xE3) {
        XE xE4;
        boolean bl;
        block8: {
            int n10;
            int n11;
            block7: {
                bl = j_0.g();
                n11 = xE2.r;
                n10 = xE3.r;
                if (!bl) break block7;
                if (n11 == n10) {
                    XE xE5 = xE2;
                    if (bl) {
                        xE5 = xE5.q <= xE3.q ? xE2 : xE3;
                    }
                    XE xE6 = xE2;
                    if (bl) {
                        xE6 = xE6.q > xE3.q ? xE2 : xE3;
                    }
                    return KB.Z(xE5, xE6);
                }
                xE4 = xE2;
                if (!bl) break block8;
                n11 = xE4.r;
                n10 = xE3.r;
            }
            xE4 = n11 < n10 ? xE2 : xE3;
        }
        XE xE7 = xE2;
        if (bl) {
            xE7 = xE7.r > xE3.r ? xE2 : xE3;
        }
        return KB.Z(xE4, xE7);
    }

    public static String t(ru_1 ru_12, im_2 im_22) {
        return a7.v(ru_12.N(), ru_12.e(), im_22);
    }

    @NotNull
    public static String v(@NotNull XE xE2, @NotNull XE xE3, @NotNull im_2 im_22) {
        String string;
        block5: {
            KB kB = a7.q(xE2, xE3);
            ((XE)kB.X).r = Math.max(((XE)kB.X).r, -im_22.H());
            kB = a7.q((XE)kB.X, (XE)kB.S);
            XE xE4 = (XE)kB.X;
            XE xE5 = (XE)kB.S;
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl = j_0.g();
            for (int i2 = xE4.r; i2 <= xE5.r; ++i2) {
                block14: {
                    int n10;
                    int n11;
                    block13: {
                        String string2;
                        block11: {
                            block12: {
                                dc_1 dc_12;
                                block9: {
                                    block10: {
                                        int n12;
                                        int n13;
                                        block6: {
                                            block7: {
                                                block8: {
                                                    dc_12 = im_22.D(i2);
                                                    string = dc_12.V();
                                                    if (!bl) break block5;
                                                    string2 = string;
                                                    n13 = i2;
                                                    n12 = xE4.r;
                                                    if (!bl) break block6;
                                                    if (n13 != n12) break block7;
                                                    if (i2 != xE5.r) break block8;
                                                    stringBuilder.append(a7.j(string2.substring(Math.min(string2.length(), xE4.q), Math.min(string2.length(), xE5.q))));
                                                    if (bl) break block9;
                                                }
                                                stringBuilder.append(a7.j(string2.substring(Math.min(string2.length(), xE4.q))));
                                                if (bl) break block9;
                                            }
                                            n13 = i2;
                                            n12 = xE5.r;
                                        }
                                        if (n13 != n12) break block10;
                                        stringBuilder.append(a7.j(string2.substring(0, Math.min(string2.length(), xE5.q))));
                                        if (bl) break block9;
                                    }
                                    stringBuilder.append(a7.j(dc_12.V()));
                                }
                                n11 = dc_12.G();
                                if (!bl) break block11;
                                if (n11 != 0) break block12;
                                n11 = i2;
                                n10 = xE5.r;
                                if (!bl) break block13;
                                if (n11 < n10) break block14;
                            }
                            n11 = xE5.q;
                        }
                        n10 = string2.length();
                    }
                    if (n11 <= n10) continue;
                }
                stringBuilder.append("\n");
                if (bl) continue;
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    private static String j(String string) {
        boolean bl = j_0.g();
        String string2 = string;
        if (bl) {
            if (string2.indexOf(a7.a(11496, 7192703627292897938L)) != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                char[] cArray = string.toCharArray();
                int n10 = cArray.length;
                int n11 = 0;
                while (n11 < n10) {
                    char c2 = cArray[n11];
                    if (bl) {
                        if (c2 != a7.a(18297, 7840242565733456139L)) {
                            stringBuilder.append(c2);
                        }
                        ++n11;
                    }
                    if (bl) continue;
                }
                return stringBuilder.toString();
            }
            string2 = string;
        }
        return string2;
    }

    public static XE t(XE xE2, im_2 im_22) {
        return a7.A(xE2, im_22, k);
    }

    public static XE A(XE xE2, im_2 im_22, @NotNull List list) {
        int n10;
        int n11;
        block12: {
            int n12;
            block11: {
                boolean bl;
                int n13;
                block10: {
                    n11 = xE2.q;
                    n10 = xE2.r;
                    n13 = im_22.B();
                    bl = j_0.P();
                    if (list.contains(Character.valueOf(im_22.g(n11, n10)))) {
                        return new XE(n11, n10);
                    }
                    String string = im_22.D(n10).V();
                    while (n11 < string.length()) {
                        n12 = list.contains(Character.valueOf(string.charAt(n11))) ? 1 : 0;
                        if (!bl && !bl) {
                            if (n12 != 0) break;
                            int n14 = --n11;
                            if (!bl) {
                                if (n14 >= 0) continue;
                                n14 = n10;
                            }
                            int n15 = -im_22.H();
                            if (!bl) {
                                if (n14 <= n15) {
                                    return new XE(0, n10);
                                }
                                --n10;
                                n14 = n13;
                                n15 = 1;
                            }
                            n11 = n14 - n15;
                            string = im_22.D(n10).V();
                            if (!bl) continue;
                        }
                        break block10;
                    }
                    n12 = ++n11;
                }
                if (bl) break block11;
                if (n12 < n13) break block12;
                ++n10;
                n12 = 0;
            }
            n11 = n12;
        }
        return new XE(n11, n10);
    }

    public static XE l(XE xE2, im_2 im_22) {
        return a7.e(xE2, im_22, k);
    }

    public static XE e(XE xE2, im_2 im_22, @NotNull List list) {
        int n10;
        int n11;
        block13: {
            int n12;
            block12: {
                int n13;
                boolean bl;
                block9: {
                    n11 = xE2.q;
                    n10 = xE2.r;
                    bl = j_0.g();
                    n13 = im_22.B();
                    int n14 = im_22.O();
                    if (list.contains(Character.valueOf(im_22.g(n11, n10)))) {
                        return new XE(n11, n10);
                    }
                    String string = im_22.D(n10).V();
                    while (n11 < string.length()) {
                        int n15;
                        block11: {
                            int n16;
                            block10: {
                                n12 = list.contains(Character.valueOf(string.charAt(n11))) ? 1 : 0;
                                if (!bl || !bl) break block9;
                                if (n12 != 0) break;
                                n15 = ++n11;
                                n16 = n13;
                                if (!bl) break block10;
                                if (n15 < n16) continue;
                                n15 = n10;
                                if (!bl) break block11;
                                n16 = n14 - 1;
                            }
                            if (n15 >= n16) {
                                return new XE(n13 - 1, n14 - 1);
                            }
                            ++n10;
                            n15 = 0;
                        }
                        n11 = n15;
                        string = im_22.D(n10).V();
                        if (bl) continue;
                    }
                    n12 = --n11;
                }
                if (!bl) break block12;
                if (n12 >= 0) break block13;
                --n10;
                n12 = n13 - 1;
            }
            n11 = n12;
        }
        return new XE(n11, n10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1985475908755173609L;
                var6_1 = new long[16];
                var3_2 = 0;
                var4_3 = "\u00a5+\u0098\u00df\u00e9\u00e66\u00d5\u00b3\u00ac\u00be\fuC7\u00e2\u0098e\u0089\u00e7\u000fx\u0018\u0092\u00b6\u0096N\u00d7\u00f5[\u00ff\u00ed\u00a0#~\u008f\u00ec\u0006\u00a2{\u0006u\u00dc7,\u00cd\u008c\u00f0P%\u00d9\u0006\u00f6\u00ea|C\n\r%\u0082\u00f0D\u001c\u0083\u0016X\u00d7C\u00c4U\u00d4\u0094\u00121\u00b1\u00c5\u00a3\u00f6w\u00b5\u00a1\u001bT\u00e6]\u0012\u00c4l\u008a\u00b9\u00bd3\u00d9\u00ca\u00c1A\u00ec\u00de\bl0\u0002\u00c9\u00e2\tJ\u0084\u00e1\u0001#\u0084\u008d";
                var5_4 = "\u00a5+\u0098\u00df\u00e9\u00e66\u00d5\u00b3\u00ac\u00be\fuC7\u00e2\u0098e\u0089\u00e7\u000fx\u0018\u0092\u00b6\u0096N\u00d7\u00f5[\u00ff\u00ed\u00a0#~\u008f\u00ec\u0006\u00a2{\u0006u\u00dc7,\u00cd\u008c\u00f0P%\u00d9\u0006\u00f6\u00ea|C\n\r%\u0082\u00f0D\u001c\u0083\u0016X\u00d7C\u00c4U\u00d4\u0094\u00121\u00b1\u00c5\u00a3\u00f6w\u00b5\u00a1\u001bT\u00e6]\u0012\u00c4l\u008a\u00b9\u00bd3\u00d9\u00ca\u00c1A\u00ec\u00de\bl0\u0002\u00c9\u00e2\tJ\u0084\u00e1\u0001#\u0084\u008d".length();
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
                    var4_3 = "#H\u00b62[ M\u00d2\u008e\u00fe/M\u00b9<\u0099I";
                    var5_4 = "#H\u00b62[ M\u00d2\u008e\u00fe/M\u00b9<\u0099I".length();
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
        a7.a = var6_1;
        a7.b = new Integer[16];
        a7.e = LoggerFactory.getLogger(a7.class);
        a7.k = new ArrayList<E>();
        a7.k.add(Character.valueOf((char)a7.a(22626, 2244382156637111836L)));
        a7.k.add(Character.valueOf((char)a7.a(9195, 7615428294738115995L)));
        a7.k.add(Character.valueOf((char)a7.a(25195, 8123182551163419664L)));
        a7.k.add(Character.valueOf((char)a7.a(12282, 6786821499416768911L)));
        a7.k.add(Character.valueOf((char)a7.a(22870, 7354986469430232873L)));
        a7.k.add(Character.valueOf((char)a7.a(27187, 8034862303483606080L)));
        a7.k.add(Character.valueOf((char)a7.a(4858, 6849909085041118338L)));
        a7.k.add(Character.valueOf((char)a7.a(6402, 1222933587863848821L)));
        a7.k.add(Character.valueOf((char)a7.a(30602, 7890933545576573435L)));
        a7.k.add(Character.valueOf((char)a7.a(30298, 3512148641316513830L)));
        a7.k.add(Character.valueOf((char)a7.a(29288, 4229037994221677585L)));
        a7.k.add(Character.valueOf((char)a7.a(4356, 7496727672314744697L)));
        a7.k.add(Character.valueOf((char)a7.a(10957, 509120130096067769L)));
        a7.k.add(Character.valueOf((char)a7.a(14901, 6735810988826125379L)));
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5E7E;
        if (b[n11] == null) {
            a7.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

