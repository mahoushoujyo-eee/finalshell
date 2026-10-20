/*
 * Decompiled with CFR 0.152.
 */
public final class DZ
extends Enum {
    public static final DZ CRC16;
    public static final DZ CRC32;
    private int l;
    private int y;
    private static final DZ[] L;

    public static DZ[] values() {
        return (DZ[])L.clone();
    }

    public static DZ valueOf(String string) {
        return Enum.valueOf(DZ.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private DZ() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.l = var3_1;
        this.y = var4_2;
    }

    public int o() {
        return this.l;
    }

    public int U() {
        return this.y;
    }

    private static DZ[] Y() {
        return new DZ[]{CRC16, CRC32};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "A\\\u0003Z&\u0005A\\\u0003X\"";
            var5_3 = "A\\\u0003Z&\u0005A\\\u0003X\"".length();
            var2_4 = 5;
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
            v4 = 111;
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
                            v11 = 109;
                            break;
                        }
                        case 1: {
                            v11 = 97;
                            break;
                        }
                        case 2: {
                            v11 = 47;
                            break;
                        }
                        case 3: {
                            v11 = 6;
                            break;
                        }
                        case 4: {
                            v11 = 123;
                            break;
                        }
                        case 5: {
                            v11 = 118;
                            break;
                        }
                        default: {
                            v11 = 84;
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
        DZ.CRC16 = new DZ(var0[1], 0, 2, 0);
        DZ.CRC32 = new DZ(var0[0], 1, 4, -1);
        DZ.L = DZ.Y();
    }
}

