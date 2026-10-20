/*
 * Decompiled with CFR 0.152.
 */
package org.T;

import java.util.ArrayList;
import org.F.c;
import org.T.N;

public class x {
    private final int X;
    @c
    private final String Y;
    public static final x[] D;
    public static final x[] u;
    private static final long[] a;
    private static final Integer[] b;

    public x(int n10, String string) {
        this.X = n10;
        this.Y = string;
    }

    public x(@c String string) {
        this.X = 0;
        this.Y = string;
    }

    public int b() {
        return this.X;
    }

    public boolean f(String string) {
        return x.M(this.Y, string);
    }

    public static x[] k(String string) {
        ArrayList<x> arrayList = new ArrayList<x>();
        int n10 = 0;
        boolean bl = N.R();
        block0: while (true) {
            int n11 = n10;
            int n12 = string.length();
            block1: while (n11 < n12) {
                int n13;
                block8: {
                    int n14;
                    int n15;
                    int n16;
                    block11: {
                        int n17;
                        block12: {
                            block13: {
                                int n18;
                                block9: {
                                    block10: {
                                        n17 = n16 = string.charAt(n10);
                                        n18 = x.a(15753, 8882260775175847049L);
                                        if (!bl) break block9;
                                        if (n17 != n18) break block10;
                                        n15 = 0;
                                        ++n10;
                                        if (bl) break block11;
                                    }
                                    n17 = n16;
                                    if (!bl) break block12;
                                    n18 = x.a(22543, 683291834762893582L);
                                }
                                if (n17 != n18) break block13;
                                n15 = 1;
                                ++n10;
                                if (bl) break block11;
                            }
                            n17 = 0;
                        }
                        n15 = n17;
                    }
                    for (n14 = n10; n14 < string.length(); ++n14) {
                        n13 = n16 = string.charAt(n14);
                        if (bl) {
                            n12 = x.a(15753, 8882260775175847049L);
                            if (!bl) continue block1;
                            if (n13 == n12 || n16 == x.a(22543, 683291834762893582L)) break;
                            if (bl) continue;
                        }
                        break block8;
                    }
                    arrayList.add(new x(n15, string.substring(n10, n14)));
                    n13 = n14;
                }
                n10 = n13;
                if (bl) continue block0;
            }
            break;
        }
        return arrayList.toArray(new x[arrayList.size()]);
    }

    public static boolean h(x[] xArray, String string) {
        boolean bl;
        block6: {
            boolean bl2 = N.m();
            x[] xArray2 = xArray;
            if (!bl2) {
                if (xArray2 == null) {
                    return false;
                }
                xArray2 = xArray;
            }
            for (int i2 = (v11473087).length - 1; i2 >= 0; --i2) {
                bl = xArray[i2].f(string);
                if (!bl2) {
                    int n10;
                    if (!bl2) {
                        if (!bl) continue;
                        n10 = xArray[i2].b();
                    }
                    if (!bl2) {
                        n10 = n10 == 0 ? 1 : 0;
                    }
                    return n10 != 0;
                }
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        boolean bl = N.R();
        StringBuilder stringBuilder = new StringBuilder();
        int n10 = this.X;
        if (bl) {
            if (n10 == 0) {
                n10 = x.a(18241, 440691696027371075L);
                return stringBuilder.append((char)n10).append(this.Y).toString();
            }
            n10 = this.X;
        }
        if (!bl) return stringBuilder.append((char)n10).append(this.Y).toString();
        if (n10 == 1) {
            n10 = x.a(27490, 455984008477256295L);
            return stringBuilder.append((char)n10).append(this.Y).toString();
        }
        n10 = x.a(21613, 4508860898254394734L);
        return stringBuilder.append((char)n10).append(this.Y).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean M(@c String string, String string2) {
        boolean bl;
        int n10;
        boolean bl2;
        block14: {
            bl2 = N.m();
            if (string == null) {
                return true;
            }
            block4: for (n10 = 0; n10 < string.length(); ++n10) {
                int c2 = string.charAt(n10);
                bl = c2 != 0;
                if (!bl2) {
                    int n11;
                    if (!bl2) {
                        switch (bl ? 1 : 0) {
                            case 63: {
                                int n12 = n10;
                                if (bl2) return n12 != 0;
                                if (n12 != string2.length()) continue block4;
                                return 0 != 0;
                            }
                            case 42: {
                                String string3 = string;
                                if (!bl2) {
                                    if (string3.length() == n10 + 1) {
                                        return true;
                                    }
                                    string3 = string.substring(n10 + 1);
                                }
                                string = string3;
                                do {
                                    if (n10 > string2.length()) return false;
                                    boolean bl3 = x.M(string, string2.substring(n10));
                                    if (bl2) return bl3;
                                    if (bl2) boolean bl4;
                                    return bl4;
                                    if (bl3) {
                                        return true;
                                    }
                                    ++n10;
                                } while (!bl2);
                                return false;
                            }
                            default: {
                                n11 = n10;
                            }
                        }
                    }
                    int n13 = string2.length();
                    if (!bl2) {
                        if (n11 == n13) {
                            return false;
                        }
                        n11 = string2.charAt(n10);
                        if (bl2) return n11 != 0;
                        n13 = c2;
                    }
                    if (n11 == n13) continue;
                    return 0 != 0;
                }
                break block14;
            }
            bl = string2.length();
        }
        if (bl2) return bl;
        if (bl != n10) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6976898198744434628L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "\u009f\u001a\u00bb\u00fd\u00e2\u00ce\u001e\u00e7\u00e4\u0093:\u00910\u0084{f\u00a58\u00f7-D#\u0092\u0095";
                var5_4 = "\u009f\u001a\u00bb\u00fd\u00e2\u00ce\u001e\u00e7\u00e4\u0093:\u00910\u0084{f\u00a58\u00f7-D#\u0092\u0095".length();
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
                    var4_3 = "\u00c3\u00c61_o\u0014\u0081\u00ac\u00c0\u00e1D\u00f6b\u00b2-\u008e";
                    var5_4 = "\u00c3\u00c61_o\u0014\u0081\u00ac\u00c0\u00e1D\u00f6b\u00b2-\u008e".length();
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
        x.a = var6_1;
        x.b = new Integer[5];
        x.D = new x[]{new x("*")};
        x.u = new x[0];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4101;
        if (b[n11] == null) {
            x.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

