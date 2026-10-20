/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ks
 */
public final class ks_0
extends Enum {
    public static final ks_0 Little;
    public static final ks_0 Big;
    private static final ks_0[] X;

    public static ks_0[] values() {
        return (ks_0[])X.clone();
    }

    public static ks_0 valueOf(String string) {
        return Enum.valueOf(ks_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ks_0() {
        void var2_-1;
        void var1_-1;
    }

    private static ks_0[] A() {
        return new ks_0[]{Little, Big};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "k(k\u0006e(xo\u001e\u0003";
            var5_3 = "k(k\u0006e(xo\u001e\u0003".length();
            var2_4 = 3;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 2;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 43;
                            break;
                        }
                        case 1: {
                            v11 = 67;
                            break;
                        }
                        case 2: {
                            v11 = 14;
                            break;
                        }
                        case 3: {
                            v11 = 25;
                            break;
                        }
                        case 4: {
                            v11 = 112;
                            break;
                        }
                        case 5: {
                            v11 = 100;
                            break;
                        }
                        default: {
                            v11 = 111;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        ks_0.Little = new ks_0(var0[1], 0);
        ks_0.Big = new ks_0(var0[0], 1);
        ks_0.X = ks_0.A();
    }
}

