/*
 * Decompiled with CFR 0.152.
 */
final class mR
extends Enum {
    public static final mR FILENAME;
    public static final mR DATA;
    public static final mR NOTHING;
    private static final mR[] Q;

    public static mR[] values() {
        return (mR[])Q.clone();
    }

    public static mR valueOf(String string) {
        return Enum.valueOf(mR.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private mR() {
        void var2_-1;
        void var1_-1;
    }

    private static mR[] O() {
        return new mR[]{FILENAME, DATA, NOTHING};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "d\u0007-HKz$\bl\u00015ELu.o\u0004n\t-A";
            var5_3 = "d\u0007-HKz$\bl\u00015ELu.o\u0004n\t-A".length();
            var2_4 = 7;
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
            v4 = 112;
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
                            v11 = 90;
                            break;
                        }
                        case 1: {
                            v11 = 56;
                            break;
                        }
                        case 2: {
                            v11 = 9;
                            break;
                        }
                        case 3: {
                            v11 = 112;
                            break;
                        }
                        case 4: {
                            v11 = 114;
                            break;
                        }
                        case 5: {
                            v11 = 68;
                            break;
                        }
                        default: {
                            v11 = 19;
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
        mR.FILENAME = new mR(var0[1], 0);
        mR.DATA = new mR(var0[2], 1);
        mR.NOTHING = new mR(var0[0], 2);
        mR.Q = mR.O();
    }
}

