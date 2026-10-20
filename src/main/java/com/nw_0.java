/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NP;
import com.xd_1;
import com.yj_1;
import java.awt.Container;
import javax.swing.DefaultButtonModel;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle;
import javax.swing.plaf.UIResource;

/*
 * Renamed from com.Nw
 */
public class nw_0
extends NP {
    private static nw_0 V;
    private static final String[] c;
    private static final String[] d;
    private static final long[] g;
    private static final Integer[] h;

    public static nw_0 l() {
        String[] stringArray = xd_1.U();
        nw_0 nw_02 = V;
        if (stringArray == null) {
            if (nw_02 == null) {
                V = new nw_0();
            }
            nw_02 = V;
        }
        return nw_02;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int getPreferredGap(JComponent var1_1, JComponent var2_2, LayoutStyle.ComponentPlacement var3_3, int var4_4, Container var5_5) {
        block16: {
            v0 = xd_1.U();
            super.getPreferredGap(var1_1, var2_2, var3_3, var4_4, var5_5);
            var7_6 = 0;
            var6_7 = v0;
            v1 = yj_1.W[var3_3.ordinal()];
            if (var6_7 != null) break block16;
            switch (v1) {
                case 1: {
                    v2 = var4_4;
                    if (var6_7 != null) ** GOTO lbl17
                    if (v2 == 3) ** GOTO lbl16
                    v3 = var4_4;
                    if (var6_7 != null) ** GOTO lbl25
                    if (v3 != nw_0.b(28870, 8878360631157840405L)) ** GOTO lbl23
lbl16:
                    // 2 sources

                    v2 = this.i(var1_1, var4_4);
lbl17:
                    // 2 sources

                    v4 = var8_8 = v2;
                    if (var6_7 == null) {
                        if (v4 > 0) {
                            return var8_8;
                        }
                        v4 = nw_0.b(18288, 7863585141233773991L);
                    }
                    return v4;
                }
lbl23:
                // 2 sources

                case 2: {
                    v3 = (int)var1_1.getUIClassID().equals(nw_0.b(5018, -29652));
lbl25:
                    // 2 sources

                    if (var6_7 != null) ** GOTO lbl47
                    if (v3 == 0) ** GOTO lbl46
                    v3 = (int)var2_2.getUIClassID().equals(nw_0.b(5018, -29652));
                    if (var6_7 != null) ** GOTO lbl47
                    if (v3 == 0) ** GOTO lbl46
                    var8_9 = ((JToggleButton)var1_1).getModel();
                    var9_10 = ((JToggleButton)var2_2).getModel();
                    v5 = var8_9 instanceof DefaultButtonModel;
                    if (var6_7 != null) ** GOTO lbl45
                    if (v5 == 0) ** GOTO lbl44
                    v5 = var9_10 instanceof DefaultButtonModel;
                    if (var6_7 != null) ** GOTO lbl45
                    if (v5 == 0) ** GOTO lbl44
                    v6 = ((DefaultButtonModel)var8_9).getGroup();
                    if (var6_7 != null) ** GOTO lbl42
                    if (v6 != ((DefaultButtonModel)var9_10).getGroup()) ** GOTO lbl44
                    v6 = ((DefaultButtonModel)var8_9).getGroup();
lbl42:
                    // 2 sources

                    if (v6 != null) {
                        return 2;
                    }
lbl44:
                    // 5 sources

                    v5 = 5;
lbl45:
                    // 3 sources

                    return v5;
lbl46:
                    // 2 sources

                    v3 = var7_6 = nw_0.b(20359, 1556437013922702677L);
lbl47:
                    // 3 sources

                    if (var6_7 == null) break;
                }
                case 3: {
                    var7_6 = nw_0.b(18288, 7863585141233773991L);
                }
            }
            v1 = (int)this.E(var1_1, var2_2, var4_4);
        }
        if (var6_7 == null) {
            if (v1 != 0) {
                return this.M(var1_1, var2_2, var4_4, var7_6 + nw_0.b(23499, 8175125693640110362L));
            }
            v1 = this.M(var1_1, var2_2, var4_4, var7_6);
        }
        return v1;
    }

    @Override
    public int getContainerGap(JComponent jComponent, int n10, Container container) {
        super.getContainerGap(jComponent, n10, container);
        return this.I(jComponent, n10, nw_0.b(20089, 4451886024593892521L) - this.t(jComponent, n10));
    }

    @Override
    protected int M(JComponent jComponent, JComponent jComponent2, int n10, int n11) {
        n11 = super.M(jComponent, jComponent2, n10, n11);
        String[] stringArray = xd_1.U();
        int n12 = n11;
        if (stringArray == null) {
            if (n12 > 0) {
                int n13;
                int n14 = n13 = this.t(jComponent, n10);
                if (stringArray == null) {
                    if (n14 == 0) {
                        n13 = this.t(jComponent2, this.i(n10));
                    }
                    n14 = n11 - n13;
                }
                n11 = n14;
            }
            n12 = n11;
        }
        if (stringArray == null) {
            if (n12 < 0) {
                return 0;
            }
            n12 = n11;
        }
        return n12;
    }

    private int t(JComponent jComponent, int n10) {
        int n11;
        block11: {
            block12: {
                int n12;
                block13: {
                    block14: {
                        String[] stringArray;
                        String string;
                        block7: {
                            block8: {
                                block9: {
                                    block10: {
                                        block5: {
                                            block6: {
                                                string = jComponent.getUIClassID();
                                                stringArray = xd_1.U();
                                                n11 = string.equals(nw_0.b(5016, 3964));
                                                if (stringArray != null) break block5;
                                                if (n11 != 0) break block6;
                                                n11 = string.equals(nw_0.b(5017, 27437)) ? '\u0001' : '\u0000';
                                                if (stringArray != null) break block7;
                                                if (n11 == 0) break block8;
                                            }
                                            n11 = n10;
                                        }
                                        if (stringArray != null) break block9;
                                        if (n11 == 3) break block10;
                                        n11 = n10;
                                        if (stringArray != null) break block11;
                                        if (n11 != 5) break block12;
                                    }
                                    n11 = jComponent.getBorder() instanceof UIResource;
                                }
                                if (stringArray != null) break block11;
                                if (n11 != 0) {
                                    return 1;
                                }
                                break block12;
                            }
                            n11 = n10;
                        }
                        if (stringArray != null) break block11;
                        if (n11 != 5) break block12;
                        n12 = string.equals(nw_0.b(5022, -2476));
                        if (stringArray != null) break block13;
                        if (n12 != 0) break block14;
                        n11 = string.equals(nw_0.b(5019, 1712)) ? '\u0001' : '\u0000';
                        if (stringArray != null) break block11;
                        if (n11 == 0) break block12;
                    }
                    n12 = 1;
                }
                return n12;
            }
            n11 = 0;
        }
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "]\u0097|y\u0018\u00e8b\u00c6\u0089\u0019\u00ca\u00c7\u00a7\u00d0\n.>\u00e5\u00afn\u0091f'\u00a0\u00b4\bJ\u00bbY\u00b6\u00cek\u00cc\u00e0";
                        var12_3 = "]\u0097|y\u0018\u00e8b\u00c6\u0089\u0019\u00ca\u00c7\u00a7\u00d0\n.>\u00e5\u00afn\u0091f'\u00a0\u00b4\bJ\u00bbY\u00b6\u00cek\u00cc\u00e0".length();
                        var9_4 = 14;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 75;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "d\u00c8\u009dT\u00e2\u008b\u00fbl|\u008a\u00b2sn\u0080\r\u009d\u0019g\u00af\u00dd\u001cH\\\u00db\u00b6G\u00b7\u00ed";
                            var12_3 = "d\u00c8\u009dT\u00e2\u008b\u00fbl|\u008a\u00b2sn\u0080\r\u009d\u0019g\u00af\u00dd\u001cH\\\u00db\u00b6G\u00b7\u00ed".length();
                            var9_4 = 14;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 77;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
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
                                    v15 = 41;
                                    break;
                                }
                                case 1: {
                                    v15 = 120;
                                    break;
                                }
                                case 2: {
                                    v15 = 105;
                                    break;
                                }
                                case 3: {
                                    v15 = 67;
                                    break;
                                }
                                case 4: {
                                    v15 = 127;
                                    break;
                                }
                                case 5: {
                                    v15 = 99;
                                    break;
                                }
                                default: {
                                    v15 = 15;
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
                nw_0.c = var13;
                nw_0.d = new String[5];
                var0_7 = 6563952287364805229L;
                var6_8 = new long[5];
                var3_9 = 0;
                var4_10 = "\u00f6\u0095\u00fc\u00f7\u00ad\u0004(\u007f6}\u00ac\u00fc8\u00dc\u0017>\u00a1\u00f5\u00b2\u00bd\u00c9k\u0083q";
                var5_11 = "\u00f6\u0095\u00fc\u00f7\u00ad\u0004(\u007f6}\u00ac\u00fc8\u00dc\u0017>\u00a1\u00f5\u00b2\u00bd\u00c9k\u0083q".length();
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
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00aa\u00f9\u00d7Jn\u008c\u0016\u00c8V\u009aab&\u00ba\u009f\u00c6";
                    var5_11 = "\u00aa\u00f9\u00d7Jn\u008c\u0016\u00c8V\u009aab&\u00ba\u009f\u00c6".length();
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
lbl125:
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
lbl136:
                // 1 sources

                ** continue;
            }
        }
        nw_0.g = var6_8;
        nw_0.h = new Integer[5];
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x139A) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 217;
                    break;
                }
                case 1: {
                    n14 = 184;
                    break;
                }
                case 2: {
                    n14 = 132;
                    break;
                }
                case 3: {
                    n14 = 241;
                    break;
                }
                case 4: {
                    n14 = 136;
                    break;
                }
                case 5: {
                    n14 = 49;
                    break;
                }
                case 6: {
                    n14 = 61;
                    break;
                }
                case 7: {
                    n14 = 208;
                    break;
                }
                case 8: {
                    n14 = 227;
                    break;
                }
                case 9: {
                    n14 = 215;
                    break;
                }
                case 10: {
                    n14 = 229;
                    break;
                }
                case 11: {
                    n14 = 250;
                    break;
                }
                case 12: {
                    n14 = 13;
                    break;
                }
                case 13: {
                    n14 = 114;
                    break;
                }
                case 14: {
                    n14 = 146;
                    break;
                }
                case 15: {
                    n14 = 177;
                    break;
                }
                case 16: {
                    n14 = 78;
                    break;
                }
                case 17: {
                    n14 = 156;
                    break;
                }
                case 18: {
                    n14 = 99;
                    break;
                }
                case 19: {
                    n14 = 209;
                    break;
                }
                case 20: {
                    n14 = 153;
                    break;
                }
                case 21: {
                    n14 = 111;
                    break;
                }
                case 22: {
                    n14 = 236;
                    break;
                }
                case 23: {
                    n14 = 62;
                    break;
                }
                case 24: {
                    n14 = 117;
                    break;
                }
                case 25: {
                    n14 = 40;
                    break;
                }
                case 26: {
                    n14 = 37;
                    break;
                }
                case 27: {
                    n14 = 115;
                    break;
                }
                case 28: {
                    n14 = 163;
                    break;
                }
                case 29: {
                    n14 = 22;
                    break;
                }
                case 30: {
                    n14 = 150;
                    break;
                }
                case 31: {
                    n14 = 68;
                    break;
                }
                case 32: {
                    n14 = 53;
                    break;
                }
                case 33: {
                    n14 = 80;
                    break;
                }
                case 34: {
                    n14 = 128;
                    break;
                }
                case 35: {
                    n14 = 97;
                    break;
                }
                case 36: {
                    n14 = 38;
                    break;
                }
                case 37: {
                    n14 = 10;
                    break;
                }
                case 38: {
                    n14 = 67;
                    break;
                }
                case 39: {
                    n14 = 41;
                    break;
                }
                case 40: {
                    n14 = 18;
                    break;
                }
                case 41: {
                    n14 = 35;
                    break;
                }
                case 42: {
                    n14 = 249;
                    break;
                }
                case 43: {
                    n14 = 159;
                    break;
                }
                case 44: {
                    n14 = 233;
                    break;
                }
                case 45: {
                    n14 = 100;
                    break;
                }
                case 46: {
                    n14 = 180;
                    break;
                }
                case 47: {
                    n14 = 89;
                    break;
                }
                case 48: {
                    n14 = 232;
                    break;
                }
                case 49: {
                    n14 = 70;
                    break;
                }
                case 50: {
                    n14 = 112;
                    break;
                }
                case 51: {
                    n14 = 244;
                    break;
                }
                case 52: {
                    n14 = 222;
                    break;
                }
                case 53: {
                    n14 = 224;
                    break;
                }
                case 54: {
                    n14 = 240;
                    break;
                }
                case 55: {
                    n14 = 46;
                    break;
                }
                case 56: {
                    n14 = 130;
                    break;
                }
                case 57: {
                    n14 = 43;
                    break;
                }
                case 58: {
                    n14 = 234;
                    break;
                }
                case 59: {
                    n14 = 255;
                    break;
                }
                case 60: {
                    n14 = 237;
                    break;
                }
                case 61: {
                    n14 = 166;
                    break;
                }
                case 62: {
                    n14 = 158;
                    break;
                }
                case 63: {
                    n14 = 193;
                    break;
                }
                case 64: {
                    n14 = 142;
                    break;
                }
                case 65: {
                    n14 = 194;
                    break;
                }
                case 66: {
                    n14 = 155;
                    break;
                }
                case 67: {
                    n14 = 42;
                    break;
                }
                case 68: {
                    n14 = 66;
                    break;
                }
                case 69: {
                    n14 = 5;
                    break;
                }
                case 70: {
                    n14 = 108;
                    break;
                }
                case 71: {
                    n14 = 225;
                    break;
                }
                case 72: {
                    n14 = 39;
                    break;
                }
                case 73: {
                    n14 = 65;
                    break;
                }
                case 74: {
                    n14 = 113;
                    break;
                }
                case 75: {
                    n14 = 60;
                    break;
                }
                case 76: {
                    n14 = 161;
                    break;
                }
                case 77: {
                    n14 = 93;
                    break;
                }
                case 78: {
                    n14 = 210;
                    break;
                }
                case 79: {
                    n14 = 191;
                    break;
                }
                case 80: {
                    n14 = 203;
                    break;
                }
                case 81: {
                    n14 = 202;
                    break;
                }
                case 82: {
                    n14 = 198;
                    break;
                }
                case 83: {
                    n14 = 221;
                    break;
                }
                case 84: {
                    n14 = 245;
                    break;
                }
                case 85: {
                    n14 = 19;
                    break;
                }
                case 86: {
                    n14 = 207;
                    break;
                }
                case 87: {
                    n14 = 144;
                    break;
                }
                case 88: {
                    n14 = 129;
                    break;
                }
                case 89: {
                    n14 = 110;
                    break;
                }
                case 90: {
                    n14 = 64;
                    break;
                }
                case 91: {
                    n14 = 31;
                    break;
                }
                case 92: {
                    n14 = 223;
                    break;
                }
                case 93: {
                    n14 = 106;
                    break;
                }
                case 94: {
                    n14 = 24;
                    break;
                }
                case 95: {
                    n14 = 205;
                    break;
                }
                case 96: {
                    n14 = 105;
                    break;
                }
                case 97: {
                    n14 = 206;
                    break;
                }
                case 98: {
                    n14 = 214;
                    break;
                }
                case 99: {
                    n14 = 103;
                    break;
                }
                case 100: {
                    n14 = 11;
                    break;
                }
                case 101: {
                    n14 = 192;
                    break;
                }
                case 102: {
                    n14 = 82;
                    break;
                }
                case 103: {
                    n14 = 2;
                    break;
                }
                case 104: {
                    n14 = 228;
                    break;
                }
                case 105: {
                    n14 = 59;
                    break;
                }
                case 106: {
                    n14 = 83;
                    break;
                }
                case 107: {
                    n14 = 139;
                    break;
                }
                case 108: {
                    n14 = 69;
                    break;
                }
                case 109: {
                    n14 = 140;
                    break;
                }
                case 110: {
                    n14 = 50;
                    break;
                }
                case 111: {
                    n14 = 47;
                    break;
                }
                case 112: {
                    n14 = 183;
                    break;
                }
                case 113: {
                    n14 = 134;
                    break;
                }
                case 114: {
                    n14 = 81;
                    break;
                }
                case 115: {
                    n14 = 14;
                    break;
                }
                case 116: {
                    n14 = 218;
                    break;
                }
                case 117: {
                    n14 = 162;
                    break;
                }
                case 118: {
                    n14 = 238;
                    break;
                }
                case 119: {
                    n14 = 104;
                    break;
                }
                case 120: {
                    n14 = 137;
                    break;
                }
                case 121: {
                    n14 = 48;
                    break;
                }
                case 122: {
                    n14 = 141;
                    break;
                }
                case 123: {
                    n14 = 119;
                    break;
                }
                case 124: {
                    n14 = 96;
                    break;
                }
                case 125: {
                    n14 = 211;
                    break;
                }
                case 126: {
                    n14 = 131;
                    break;
                }
                case 127: {
                    n14 = 56;
                    break;
                }
                case 128: {
                    n14 = 118;
                    break;
                }
                case 129: {
                    n14 = 85;
                    break;
                }
                case 130: {
                    n14 = 16;
                    break;
                }
                case 131: {
                    n14 = 109;
                    break;
                }
                case 132: {
                    n14 = 58;
                    break;
                }
                case 133: {
                    n14 = 138;
                    break;
                }
                case 134: {
                    n14 = 121;
                    break;
                }
                case 135: {
                    n14 = 0;
                    break;
                }
                case 136: {
                    n14 = 3;
                    break;
                }
                case 137: {
                    n14 = 174;
                    break;
                }
                case 138: {
                    n14 = 29;
                    break;
                }
                case 139: {
                    n14 = 88;
                    break;
                }
                case 140: {
                    n14 = 6;
                    break;
                }
                case 141: {
                    n14 = 189;
                    break;
                }
                case 142: {
                    n14 = 239;
                    break;
                }
                case 143: {
                    n14 = 230;
                    break;
                }
                case 144: {
                    n14 = 254;
                    break;
                }
                case 145: {
                    n14 = 201;
                    break;
                }
                case 146: {
                    n14 = 196;
                    break;
                }
                case 147: {
                    n14 = 251;
                    break;
                }
                case 148: {
                    n14 = 143;
                    break;
                }
                case 149: {
                    n14 = 45;
                    break;
                }
                case 150: {
                    n14 = 33;
                    break;
                }
                case 151: {
                    n14 = 167;
                    break;
                }
                case 152: {
                    n14 = 160;
                    break;
                }
                case 153: {
                    n14 = 216;
                    break;
                }
                case 154: {
                    n14 = 4;
                    break;
                }
                case 155: {
                    n14 = 98;
                    break;
                }
                case 156: {
                    n14 = 15;
                    break;
                }
                case 157: {
                    n14 = 107;
                    break;
                }
                case 158: {
                    n14 = 8;
                    break;
                }
                case 159: {
                    n14 = 36;
                    break;
                }
                case 160: {
                    n14 = 9;
                    break;
                }
                case 161: {
                    n14 = 126;
                    break;
                }
                case 162: {
                    n14 = 77;
                    break;
                }
                case 163: {
                    n14 = 76;
                    break;
                }
                case 164: {
                    n14 = 74;
                    break;
                }
                case 165: {
                    n14 = 252;
                    break;
                }
                case 166: {
                    n14 = 25;
                    break;
                }
                case 167: {
                    n14 = 91;
                    break;
                }
                case 168: {
                    n14 = 243;
                    break;
                }
                case 169: {
                    n14 = 204;
                    break;
                }
                case 170: {
                    n14 = 173;
                    break;
                }
                case 171: {
                    n14 = 220;
                    break;
                }
                case 172: {
                    n14 = 87;
                    break;
                }
                case 173: {
                    n14 = 28;
                    break;
                }
                case 174: {
                    n14 = 12;
                    break;
                }
                case 175: {
                    n14 = 95;
                    break;
                }
                case 176: {
                    n14 = 133;
                    break;
                }
                case 177: {
                    n14 = 90;
                    break;
                }
                case 178: {
                    n14 = 195;
                    break;
                }
                case 179: {
                    n14 = 135;
                    break;
                }
                case 180: {
                    n14 = 187;
                    break;
                }
                case 181: {
                    n14 = 73;
                    break;
                }
                case 182: {
                    n14 = 212;
                    break;
                }
                case 183: {
                    n14 = 148;
                    break;
                }
                case 184: {
                    n14 = 63;
                    break;
                }
                case 185: {
                    n14 = 34;
                    break;
                }
                case 186: {
                    n14 = 71;
                    break;
                }
                case 187: {
                    n14 = 86;
                    break;
                }
                case 188: {
                    n14 = 94;
                    break;
                }
                case 189: {
                    n14 = 149;
                    break;
                }
                case 190: {
                    n14 = 20;
                    break;
                }
                case 191: {
                    n14 = 253;
                    break;
                }
                case 192: {
                    n14 = 55;
                    break;
                }
                case 193: {
                    n14 = 179;
                    break;
                }
                case 194: {
                    n14 = 72;
                    break;
                }
                case 195: {
                    n14 = 188;
                    break;
                }
                case 196: {
                    n14 = 1;
                    break;
                }
                case 197: {
                    n14 = 168;
                    break;
                }
                case 198: {
                    n14 = 57;
                    break;
                }
                case 199: {
                    n14 = 127;
                    break;
                }
                case 200: {
                    n14 = 101;
                    break;
                }
                case 201: {
                    n14 = 52;
                    break;
                }
                case 202: {
                    n14 = 27;
                    break;
                }
                case 203: {
                    n14 = 226;
                    break;
                }
                case 204: {
                    n14 = 185;
                    break;
                }
                case 205: {
                    n14 = 17;
                    break;
                }
                case 206: {
                    n14 = 170;
                    break;
                }
                case 207: {
                    n14 = 116;
                    break;
                }
                case 208: {
                    n14 = 7;
                    break;
                }
                case 209: {
                    n14 = 186;
                    break;
                }
                case 210: {
                    n14 = 92;
                    break;
                }
                case 211: {
                    n14 = 124;
                    break;
                }
                case 212: {
                    n14 = 123;
                    break;
                }
                case 213: {
                    n14 = 23;
                    break;
                }
                case 214: {
                    n14 = 152;
                    break;
                }
                case 215: {
                    n14 = 79;
                    break;
                }
                case 216: {
                    n14 = 125;
                    break;
                }
                case 217: {
                    n14 = 165;
                    break;
                }
                case 218: {
                    n14 = 242;
                    break;
                }
                case 219: {
                    n14 = 197;
                    break;
                }
                case 220: {
                    n14 = 102;
                    break;
                }
                case 221: {
                    n14 = 154;
                    break;
                }
                case 222: {
                    n14 = 176;
                    break;
                }
                case 223: {
                    n14 = 248;
                    break;
                }
                case 224: {
                    n14 = 213;
                    break;
                }
                case 225: {
                    n14 = 21;
                    break;
                }
                case 226: {
                    n14 = 246;
                    break;
                }
                case 227: {
                    n14 = 84;
                    break;
                }
                case 228: {
                    n14 = 172;
                    break;
                }
                case 229: {
                    n14 = 171;
                    break;
                }
                case 230: {
                    n14 = 145;
                    break;
                }
                case 231: {
                    n14 = 182;
                    break;
                }
                case 232: {
                    n14 = 26;
                    break;
                }
                case 233: {
                    n14 = 164;
                    break;
                }
                case 234: {
                    n14 = 54;
                    break;
                }
                case 235: {
                    n14 = 200;
                    break;
                }
                case 236: {
                    n14 = 75;
                    break;
                }
                case 237: {
                    n14 = 181;
                    break;
                }
                case 238: {
                    n14 = 231;
                    break;
                }
                case 239: {
                    n14 = 51;
                    break;
                }
                case 240: {
                    n14 = 199;
                    break;
                }
                case 241: {
                    n14 = 122;
                    break;
                }
                case 242: {
                    n14 = 219;
                    break;
                }
                case 243: {
                    n14 = 30;
                    break;
                }
                case 244: {
                    n14 = 32;
                    break;
                }
                case 245: {
                    n14 = 147;
                    break;
                }
                case 246: {
                    n14 = 235;
                    break;
                }
                case 247: {
                    n14 = 247;
                    break;
                }
                case 248: {
                    n14 = 157;
                    break;
                }
                case 249: {
                    n14 = 169;
                    break;
                }
                case 250: {
                    n14 = 190;
                    break;
                }
                case 251: {
                    n14 = 151;
                    break;
                }
                case 252: {
                    n14 = 44;
                    break;
                }
                case 253: {
                    n14 = 120;
                    break;
                }
                case 254: {
                    n14 = 178;
                    break;
                }
                default: {
                    n14 = 175;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            nw_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2AD3;
        if (h[n11] == null) {
            nw_0.h[n11] = (int)(g[n11] ^ l2);
        }
        return h[n11];
    }
}

