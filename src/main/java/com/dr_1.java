/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xv_0;

/*
 * Renamed from com.dR
 */
public final class dr_1
extends Enum {
    public static final dr_1 random;
    public static final dr_1 horizontal;
    public static final dr_1 vertical;
    public static final dr_1 up;
    public static final dr_1 down;
    public static final dr_1 left;
    public static final dr_1 right;
    private static final /* synthetic */ dr_1[] o;
    private static final long[] a;
    private static final Integer[] b;

    public static dr_1[] values() {
        return (dr_1[])o.clone();
    }

    public static dr_1 valueOf(String string) {
        return Enum.valueOf(dr_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dr_1() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean V() {
        String[] stringArray = xv_0.X();
        boolean bl = this.equals((Object)horizontal);
        if (stringArray == null) return bl;
        if (bl) return true;
        bl = this.equals((Object)left);
        if (stringArray == null) return bl;
        if (bl) return true;
        bl = this.equals((Object)right);
        if (stringArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Z() {
        String[] stringArray = xv_0.X();
        boolean bl = this.equals((Object)vertical);
        if (stringArray == null) return bl;
        if (bl) return true;
        bl = this.equals((Object)up);
        if (stringArray == null) return bl;
        if (bl) return true;
        bl = this.equals((Object)down);
        if (stringArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    private static /* synthetic */ dr_1[] q() {
        dr_1[] dr_1Array = new dr_1[dr_1.a(3331, 6469096508546516382L)];
        dr_1Array[0] = random;
        dr_1Array[1] = horizontal;
        dr_1Array[2] = vertical;
        dr_1Array[3] = up;
        dr_1Array[4] = down;
        dr_1Array[5] = left;
        dr_1Array[dr_1.a((int)22145, (long)6358466083983973917L)] = right;
        return dr_1Array;
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
                        var11_2 = "~YH\u0004\u0006hWQ\u000e\nX\u0002oF\blSM\u001e\fVfv\nrYM\u0003\u001fZinWS";
                        var13_3 = "~YH\u0004\u0006hWQ\u000e\nX\u0002oF\blSM\u001e\fVfv\nrYM\u0003\u001fZinWS".length();
                        var10_4 = 4;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 27;
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
                            var11_2 = "\u0014#$~m\u0004\n/%b";
                            var13_3 = "\u0014#$~m\u0004\n/%b".length();
                            var10_4 = 5;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 103;
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
                                    v15 = 1;
                                    break;
                                }
                                case 1: {
                                    v15 = 45;
                                    break;
                                }
                                case 2: {
                                    v15 = 36;
                                    break;
                                }
                                case 3: {
                                    v15 = 113;
                                    break;
                                }
                                case 4: {
                                    v15 = 126;
                                    break;
                                }
                                case 5: {
                                    v15 = 46;
                                    break;
                                }
                                default: {
                                    v15 = 28;
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
                var0_7 = 4490621120676421447L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u00f3\u00b9\u00cd\u00a7\u001fjZ\u00de/\u0087cD\u0012\u00f3\u0001\\\u00b4\u00badLK\u00a9\u00e4\u0019";
                var5_11 = "\u00f3\u00b9\u00cd\u00a7\u001fjZ\u00de/\u0087cD\u0012\u00f3\u0001\\\u00b4\u00badLK\u00a9\u00e4\u0019".length();
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
        dr_1.a = var6_8;
        dr_1.b = new Integer[3];
        dr_1.random = new dr_1(var8[1], 0);
        dr_1.horizontal = new dr_1(var8[4], 1);
        dr_1.vertical = new dr_1(var8[3], 2);
        dr_1.up = new dr_1(var8[2], 3);
        dr_1.down = new dr_1(var8[0], 4);
        dr_1.left = new dr_1(var8[6], 5);
        dr_1.right = new dr_1(var8[5], dr_1.a(13255, 1058623017906682712L));
        dr_1.o = dr_1.q();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x89D;
        if (b[n11] == null) {
            dr_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

