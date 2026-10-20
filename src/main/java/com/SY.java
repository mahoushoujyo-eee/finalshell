/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dx_2;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

public final class SY
extends Enum {
    public static final SY BOLD;
    public static final SY ITALIC;
    public static final SY BLINK;
    public static final SY DIM;
    public static final SY INVERSE;
    public static final SY UNDERLINED;
    public static final SY HIDDEN;
    private static final SY[] v;
    private static final long[] a;
    private static final Integer[] b;

    public static SY[] values() {
        return (SY[])v.clone();
    }

    public static SY valueOf(String string) {
        return Enum.valueOf(SY.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SY() {
        void var2_-1;
        void var1_-1;
    }

    private void d(@NotNull EnumSet enumSet, boolean bl) {
        block2: {
            boolean bl2;
            block3: {
                String string = dx_2.g();
                bl2 = bl;
                if (string != null) break block2;
                if (!bl2) break block3;
                enumSet.add(this);
                if (string == null) break block2;
            }
            bl2 = enumSet.remove((Object)this);
        }
    }

    private static SY[] D() {
        SY[] sYArray = new SY[SY.a(11919, 1747797122468568807L)];
        sYArray[0] = BOLD;
        sYArray[1] = ITALIC;
        sYArray[2] = BLINK;
        sYArray[3] = DIM;
        sYArray[4] = INVERSE;
        sYArray[5] = UNDERLINED;
        sYArray[SY.a((int)14686, (long)9178156540940437812L)] = HIDDEN;
        return sYArray;
    }

    static void L(SY sY, EnumSet enumSet, boolean bl) {
        sY.d(enumSet, bl);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var8 = new String[7];
                        var12_1 = 0;
                        var11_2 = "FT\u000b\u001a\u0005FW\u000e\u0010/\u0007MU\u0011\u001b6QE\u0006MO\u0006\u0012-A\nQU\u0003\u001b6NIJ^\u0003";
                        var13_3 = "FT\u000b\u001a\u0005FW\u000e\u0010/\u0007MU\u0011\u001b6QE\u0006MO\u0006\u0012-A\nQU\u0003\u001b6NIJ^\u0003".length();
                        var10_4 = 4;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 83;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "SM\u001c\u0005>S\u0003_M\u0015";
                            var13_3 = "SM\u001c\u0005>S\u0003_M\u0015".length();
                            var10_4 = 6;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 76;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 87;
                                    break;
                                }
                                case 1: {
                                    v15 = 72;
                                    break;
                                }
                                case 2: {
                                    v15 = 20;
                                    break;
                                }
                                case 3: {
                                    v15 = 13;
                                    break;
                                }
                                case 4: {
                                    v15 = 55;
                                    break;
                                }
                                case 5: {
                                    v15 = 81;
                                    break;
                                }
                                default: {
                                    v15 = 83;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                var0_7 = 4201249351936074130L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u00dd;\u00e7'9S\u00a8\u00a0\u00f01\u00db\u00f4b\u00cd5V\u0087\u00e7\u00bb\u0099\u00c2\u00cd?r";
                var5_11 = "\u00dd;\u00e7'9S\u00a8\u00a0\u00f01\u00db\u00f4b\u00cd5V\u0087\u00e7\u00bb\u0099\u00c2\u00cd?r".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        SY.a = var6_8;
        SY.b = new Integer[3];
        SY.BOLD = new SY(var8[0], 0);
        SY.ITALIC = new SY(var8[3], 1);
        SY.BLINK = new SY(var8[1], 2);
        SY.DIM = new SY(var8[6], 3);
        SY.INVERSE = new SY(var8[2], 4);
        SY.UNDERLINED = new SY(var8[4], 5);
        SY.HIDDEN = new SY(var8[5], SY.a(9385, 7666291256228598978L));
        SY.v = SY.D();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x706A;
        if (b[n11] == null) {
            SY.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

