/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.cN
 */
public final class cn_1
extends Enum {
    public static final cn_1 mouseClicked;
    public static final cn_1 mousePressed;
    public static final cn_1 mouseDragged;
    public static final cn_1 mouseReleased;
    public static final cn_1 mouseEntered;
    public static final cn_1 mouseExited;
    public static final cn_1 mouseMoved;
    public static final cn_1 mouseWheelMoved;
    private static final /* synthetic */ cn_1[] a;
    private static final long[] b;
    private static final Integer[] c;

    public static cn_1[] values() {
        return (cn_1[])a.clone();
    }

    public static cn_1 valueOf(String string) {
        return Enum.valueOf(cn_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cn_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ cn_1[] P() {
        cn_1[] cn_1Array = new cn_1[cn_1.a(31162, 87639754520109600L)];
        cn_1Array[0] = mouseClicked;
        cn_1Array[1] = mousePressed;
        cn_1Array[2] = mouseDragged;
        cn_1Array[3] = mouseReleased;
        cn_1Array[4] = mouseEntered;
        cn_1Array[5] = mouseExited;
        cn_1Array[cn_1.a((int)15227, (long)227498665006031075L)] = mouseMoved;
        cn_1Array[cn_1.a((int)12804, (long)4089256435986688415L)] = mouseWheelMoved;
        return cn_1Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[8];
                        var12_1 = 0;
                        var11_2 = "\f9vv\u0018Mh\u00001d`\u0019\n\f9vv\u0018Du\u00173g\u000f\f9vv\u0018^r\u00043oH\u0012\u007f\u007f\u0005\r\f9vv\u0018[\u007f\r3bv\u0018m\f\f9vv\u0018Lt\u00153q`\u0019\f\f9vv\u0018Yh\u0004%p`\u0019";
                        var13_3 = "\f9vv\u0018Mh\u00001d`\u0019\n\f9vv\u0018Du\u00173g\u000f\f9vv\u0018^r\u00043oH\u0012\u007f\u007f\u0005\r\f9vv\u0018[\u007f\r3bv\u0018m\f\f9vv\u0018Lt\u00153q`\u0019\f\f9vv\u0018Yh\u0004%p`\u0019".length();
                        var10_4 = 12;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 123;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
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
                            var11_2 = "\u00041~~\u0010Dj\u0000*ni\f\u00041~~\u0010B~\u0000=`h\u0011";
                            var13_3 = "\u00041~~\u0010Dj\u0000*ni\f\u00041~~\u0010B~\u0000=`h\u0011".length();
                            var10_4 = 11;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 115;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
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
                            break block27;
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
                                    v15 = 26;
                                    break;
                                }
                                case 1: {
                                    v15 = 45;
                                    break;
                                }
                                case 2: {
                                    v15 = 120;
                                    break;
                                }
                                case 3: {
                                    v15 = 126;
                                    break;
                                }
                                case 4: {
                                    v15 = 6;
                                    break;
                                }
                                case 5: {
                                    v15 = 114;
                                    break;
                                }
                                default: {
                                    v15 = 97;
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
                var0_7 = 5280913256162224565L;
                var6_8 = new long[5];
                var3_9 = 0;
                var4_10 = "\u00d7Lp%\u00c6\u00ec\u0097\u00ac>d\u00c5\u00ca\u0019\u00bc\tP\u00f8\u00d0\u00b8~\u008dD\u0000-";
                var5_11 = "\u00d7Lp%\u00c6\u00ec\u0097\u00ac>d\u00c5\u00ca\u0019\u00bc\tP\u00f8\u00d0\u00b8~\u008dD\u0000-".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "UN\u00eeX\u00f7l\u00cb\u009d\u00e9\u0082\b\\\u00a7\u00e3i0";
                    var5_11 = "UN\u00eeX\u00f7l\u00cb\u009d\u00e9\u0082\b\\\u00a7\u00e3i0".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl123:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl134:
                // 1 sources

                ** continue;
            }
        }
        cn_1.b = var6_8;
        cn_1.c = new Integer[5];
        cn_1.mouseClicked = new cn_1(var8[7], 0);
        cn_1.mousePressed = new cn_1(var8[5], 1);
        cn_1.mouseDragged = new cn_1(var8[0], 2);
        cn_1.mouseReleased = new cn_1(var8[3], 3);
        cn_1.mouseEntered = new cn_1(var8[4], 4);
        cn_1.mouseExited = new cn_1(var8[6], 5);
        cn_1.mouseMoved = new cn_1(var8[1], cn_1.a(9606, 5253868559035006495L));
        cn_1.mouseWheelMoved = new cn_1(var8[2], cn_1.a(23327, 3952784443236679810L));
        cn_1.a = cn_1.P();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5B99;
        if (c[n11] == null) {
            cn_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

