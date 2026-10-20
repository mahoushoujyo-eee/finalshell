/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from yu
 */
public final class yu_2
extends Enum {
    public static final yu_2 BIN32;
    public static final yu_2 BIN;
    public static final yu_2 HEX;
    private int E;
    private DZ s;
    private x9 Z;
    private static final yu_2[] r;
    private static ky_2[] g;

    public static yu_2[] values() {
        return (yu_2[])r.clone();
    }

    public static yu_2 valueOf(String string) {
        return Enum.valueOf(yu_2.class, string);
    }

    public static yu_2 O(byte by) {
        yu_2[] yu_2Array = yu_2.values();
        ky_2[] ky_2Array = yu_2.c();
        int n10 = yu_2Array.length;
        int n11 = 0;
        while (n11 < n10) {
            yu_2 yu_22 = yu_2Array[n11];
            if (ky_2Array == null) {
                if (yu_22.T() == by) {
                    return yu_22;
                }
                ++n11;
            }
            if (ky_2Array == null) continue;
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private yu_2(x9 x92) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.E = (int)x92;
        this.s = var4_2;
        this.Z = var5_3;
    }

    public DZ s() {
        return this.s;
    }

    public byte T() {
        return this.Z.r();
    }

    public int c() {
        return this.E;
    }

    public boolean d() {
        return this == HEX;
    }

    private static yu_2[] r() {
        return new yu_2[]{BIN32, BIN, HEX};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "0Ze\u0005:Vs)J\u0003:Vs";
            var5_3 = "0Ze\u0005:Vs)J\u0003:Vs".length();
            yu_2.r(null);
            var2_4 = 3;
            var1_5 = -1;
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
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
            v4 = 115;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 11;
                            break;
                        }
                        case 1: {
                            v11 = 108;
                            break;
                        }
                        case 2: {
                            v11 = 78;
                            break;
                        }
                        case 3: {
                            v11 = 105;
                            break;
                        }
                        case 4: {
                            v11 = 11;
                            break;
                        }
                        case 5: {
                            v11 = 117;
                            break;
                        }
                        default: {
                            v11 = 118;
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
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        yu_2.BIN32 = new yu_2(var0[1], 0, 1, DZ.CRC32, x9.ZBIN32);
        yu_2.BIN = new yu_2(var0[2], 1, 1, DZ.CRC16, x9.ZBIN);
        yu_2.HEX = new yu_2(var0[0], 2, 2, DZ.CRC16, x9.ZHEX);
        yu_2.r = yu_2.r();
    }

    public static void r(ky_2[] ky_2Array) {
        g = ky_2Array;
    }

    public static ky_2[] c() {
        return g;
    }
}

