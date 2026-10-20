/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import com.z.f_0;

/*
 * Renamed from com.Z.m
 */
public final class m_0
extends Enum {
    public static final m_0 icons;
    public static final m_0 tiles;
    public static final m_0 table;
    private static final m_0[] i;

    public static m_0[] values() {
        return (m_0[])i.clone();
    }

    public static m_0 valueOf(String string) {
        return Enum.valueOf(m_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private m_0() {
        void var2_-1;
        void var1_-1;
    }

    public int w() {
        String string = T.v();
        int n10 = f_0.j[this.ordinal()];
        if (string == null) {
            switch (n10) {
                case 1: 
                case 2: {
                    return 0;
                }
                case 3: {
                    return 1;
                }
            }
            n10 = -1;
        }
        return n10;
    }

    private static m_0[] f() {
        return new m_0[]{icons, tiles, table};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u000b\u0000_K\u0016\u0005\u000b\bQB\u0000\u0005\u0016\u0002RI\u0000";
            var5_3 = "\u000b\u0000_K\u0016\u0005\u000b\bQB\u0000\u0005\u0016\u0002RI\u0000".length();
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
            v4 = 3;
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
                            v11 = 124;
                            break;
                        }
                        case 1: {
                            v11 = 98;
                            break;
                        }
                        case 2: {
                            v11 = 62;
                            break;
                        }
                        case 3: {
                            v11 = 36;
                            break;
                        }
                        case 4: {
                            v11 = 112;
                            break;
                        }
                        case 5: {
                            v11 = 9;
                            break;
                        }
                        default: {
                            v11 = 7;
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
        m_0.icons = new m_0(var0[2], 0);
        m_0.tiles = new m_0(var0[1], 1);
        m_0.table = new m_0(var0[0], 2);
        m_0.i = m_0.f();
    }
}

