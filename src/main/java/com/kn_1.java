/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.NE;
import com.O_;
import com.TJ;
import com.au_0;
import com.dh_2;
import com.i2_0;
import com.ku_2;
import com.ky_2;
import com.ld_2;
import com.og_2;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.kN
 */
public class kn_1
extends ky_2
implements au_0 {
    public static final ImageIcon I;
    public static final ImageIcon m;
    public static final ImageIcon M;
    public static final ImageIcon g;
    protected String h;
    protected dh_2 n;
    protected final ky_2 o;
    protected final O_ X;
    protected final ky_2 P;
    protected final KD N;
    private static final String[] a;
    private static final String[] b;

    public kn_1() {
        this("");
    }

    public kn_1(String string) {
        this(NE.E(kn_1.b(-21875, -25703)), string);
    }

    public kn_1(String string, String string2) {
        this(string, null, string2);
    }

    public kn_1(Icon icon) {
        this(icon, "");
    }

    public kn_1(Icon icon, String string) {
        this(NE.E(kn_1.b(-21874, 18868)), icon, string);
    }

    public kn_1(String string, Icon icon) {
        this(string, icon, "");
    }

    public kn_1(String string, Icon icon, String string2) {
        super(true);
        this.h = string;
        this.D(0);
        this.u(false);
        this.I(false, false, false, false);
        this.o = new ky_2(kn_1.b(-21882, 19128));
        this.add((Component)this.o, kn_1.b(-21885, 7600));
        this.X = new O_(string2, icon);
        this.X.S(kn_1.b(-21883, -26009));
        this.o.add((Component)this.X, kn_1.b(-21884, 27552));
        this.P = new ky_2(kn_1.b(-21886, 21457), (LayoutManager)new TJ(0, false));
        this.o.add((Component)this.P, kn_1.b(-21876, 5173));
        this.N = new KD();
        this.N.O(0);
        this.N.f(0);
        this.N.setFocusable(false);
        this.N.E(false, true, false, false);
        this.P.add(this.N);
    }

    public String B() {
        return this.h;
    }

    public void l(String string) {
        this.h = string;
    }

    public void X(Icon icon) {
        this.X.setIcon(icon);
    }

    public Icon i() {
        return this.X.getIcon();
    }

    public dh_2 E() {
        return this.n;
    }

    public void k(dh_2 dh_22) {
        this.n = dh_22;
        this.I(dh_22.equals((Object)dh_2.bottom), dh_22.equals((Object)dh_2.right), dh_22.equals((Object)dh_2.top), dh_22.equals((Object)dh_2.left));
        this.N.setIcon(this.a(dh_22));
    }

    public void x(og_2 og_22) {
        this.o.L(og_22);
    }

    public og_2 U() {
        return this.o.l();
    }

    public ky_2 z() {
        return this.o;
    }

    public O_ A() {
        return this.X;
    }

    public ky_2 y() {
        return this.P;
    }

    public void G(KD kD) {
        block4: {
            Component component;
            block2: {
                KD kD2;
                block3: {
                    int n10 = ku_2.H();
                    kD.f(0);
                    kD.E(false, true, false, false);
                    int n11 = n10;
                    kD2 = kD;
                    if (n11 != 0) break block2;
                    if (kD2.getText() == null) break block3;
                    component = kD;
                    if (n11 != 0) break block4;
                    if (component.getText().trim().length() != 0) break block2;
                }
                kD2 = kD.O(0);
            }
            component = this.P.add((Component)kD, 0);
        }
        this.P.revalidate();
        this.P.repaint();
    }

    public KD u() {
        return this.N;
    }

    public String c() {
        return this.X.getText();
    }

    public void C(String string) {
        this.X.setText(string);
    }

    protected Icon a(dh_2 dh_22) {
        int n10 = ku_2.H();
        boolean bl = dh_22.equals((Object)dh_2.top);
        if (n10 == 0) {
            if (bl) {
                return I;
            }
            bl = dh_22.equals((Object)dh_2.left);
        }
        if (n10 == 0) {
            if (bl) {
                return m;
            }
            bl = dh_22.equals((Object)dh_2.right);
        }
        if (n10 == 0) {
            if (bl) {
                return M;
            }
            bl = dh_22.equals((Object)dh_2.bottom);
        }
        if (bl) {
            return g;
        }
        return null;
    }

    @Override
    public void u(String string, Object[] objectArray) {
        i2_0.n(this, string, objectArray);
    }

    @Override
    public void F(Object[] objectArray) {
        i2_0.U(this, objectArray);
    }

    @Override
    public void N(String string, Object[] objectArray) {
        i2_0.q(this, string, objectArray);
    }

    @Override
    public void M() {
        i2_0.L(this);
    }

    @Override
    public boolean k() {
        return i2_0.Z(this);
    }

    @Override
    public void M(ld_2 ld_22) {
        i2_0.g(this, ld_22);
    }

    @Override
    public void i() {
        i2_0.o(this);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[12];
                var3_1 = 0;
                var2_2 = "'\u00aa\u0095\u00c3\u00c6\u0085\u0094\u00b7\r\u00a3$\u00a5L\u00f1(\u00d0\u001e\u00eb\u00f1{\u0012\u0010\u00cc\u00d3\u0087\u0091\u00e5&U\u001c\u00b9\u00ac_\u00d7\f\u001a\u00dc<\u00fd\u0006\u00fa\u00ff\u00e0=\u00c0\u00b6\u0014\u00c6\u0094\u00a9\u0004A}d\u00a8\u0013@\u00e7\u00d94~'!\u00ff\u00d5\u00cd\u00bc\u0016\u00daG*~12jA\u00d2}\u00df~3\u008a\u00c7\u00a9\u00ff\u0010J\u000e\u00b0|\u0005\u00f8R\u0010\u00c3L\u0015?\u00c76\u00e6-\u00c9\u00b1\u00d0\u00ee\t\u00f2_\u001c\u00dc9]Jx\u00e3\u0013\b\u0014\u00db\u00c2\u00aaF\u00be\u00dd\u00c3R\u00a0Y;E#\u009e\u0004\u007f1\u001a\u00b9\u00c3\u0003\u000f\u00b3\u00e0\u0013\fjPS\u00e1\u007f(\u0006\u00dd\u00d3\u0094\n\u00da\u00ab\u00aa\u00a2%\u00ae\u00a7";
                var4_3 = "'\u00aa\u0095\u00c3\u00c6\u0085\u0094\u00b7\r\u00a3$\u00a5L\u00f1(\u00d0\u001e\u00eb\u00f1{\u0012\u0010\u00cc\u00d3\u0087\u0091\u00e5&U\u001c\u00b9\u00ac_\u00d7\f\u001a\u00dc<\u00fd\u0006\u00fa\u00ff\u00e0=\u00c0\u00b6\u0014\u00c6\u0094\u00a9\u0004A}d\u00a8\u0013@\u00e7\u00d94~'!\u00ff\u00d5\u00cd\u00bc\u0016\u00daG*~12jA\u00d2}\u00df~3\u008a\u00c7\u00a9\u00ff\u0010J\u000e\u00b0|\u0005\u00f8R\u0010\u00c3L\u0015?\u00c76\u00e6-\u00c9\u00b1\u00d0\u00ee\t\u00f2_\u001c\u00dc9]Jx\u00e3\u0013\b\u0014\u00db\u00c2\u00aaF\u00be\u00dd\u00c3R\u00a0Y;E#\u009e\u0004\u007f1\u001a\u00b9\u00c3\u0003\u000f\u00b3\u00e0\u0013\fjPS\u00e1\u007f(\u0006\u00dd\u00d3\u0094\n\u00da\u00ab\u00aa\u00a2%\u00ae\u00a7".length();
                var1_4 = 20;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 113;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u000b\u001a\u00b4\u00b4\u0003vs~";
                    var4_3 = "\u000b\u001a\u00b4\u00b4\u0003vs~".length();
                    var1_4 = 4;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 15;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 126;
                            break;
                        }
                        case 1: {
                            v15 = 106;
                            break;
                        }
                        case 2: {
                            v15 = 106;
                            break;
                        }
                        case 3: {
                            v15 = 109;
                            break;
                        }
                        case 4: {
                            v15 = 8;
                            break;
                        }
                        case 5: {
                            v15 = 107;
                            break;
                        }
                        default: {
                            v15 = 51;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        kn_1.a = var5;
        kn_1.b = new String[12];
        kn_1.I = new ImageIcon(ku_2.class.getResource(kn_1.b(-21881, 21783)));
        kn_1.m = new ImageIcon(ku_2.class.getResource(kn_1.b(-21873, 9854)));
        kn_1.M = new ImageIcon(ku_2.class.getResource(kn_1.b(-21887, -32380)));
        kn_1.g = new ImageIcon(ku_2.class.getResource(kn_1.b(-21888, 14546)));
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFAA86) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 93;
                    break;
                }
                case 1: {
                    n14 = 189;
                    break;
                }
                case 2: {
                    n14 = 243;
                    break;
                }
                case 3: {
                    n14 = 20;
                    break;
                }
                case 4: {
                    n14 = 0;
                    break;
                }
                case 5: {
                    n14 = 37;
                    break;
                }
                case 6: {
                    n14 = 45;
                    break;
                }
                case 7: {
                    n14 = 73;
                    break;
                }
                case 8: {
                    n14 = 251;
                    break;
                }
                case 9: {
                    n14 = 236;
                    break;
                }
                case 10: {
                    n14 = 171;
                    break;
                }
                case 11: {
                    n14 = 220;
                    break;
                }
                case 12: {
                    n14 = 165;
                    break;
                }
                case 13: {
                    n14 = 197;
                    break;
                }
                case 14: {
                    n14 = 145;
                    break;
                }
                case 15: {
                    n14 = 123;
                    break;
                }
                case 16: {
                    n14 = 176;
                    break;
                }
                case 17: {
                    n14 = 159;
                    break;
                }
                case 18: {
                    n14 = 6;
                    break;
                }
                case 19: {
                    n14 = 149;
                    break;
                }
                case 20: {
                    n14 = 206;
                    break;
                }
                case 21: {
                    n14 = 195;
                    break;
                }
                case 22: {
                    n14 = 69;
                    break;
                }
                case 23: {
                    n14 = 38;
                    break;
                }
                case 24: {
                    n14 = 19;
                    break;
                }
                case 25: {
                    n14 = 68;
                    break;
                }
                case 26: {
                    n14 = 148;
                    break;
                }
                case 27: {
                    n14 = 226;
                    break;
                }
                case 28: {
                    n14 = 43;
                    break;
                }
                case 29: {
                    n14 = 242;
                    break;
                }
                case 30: {
                    n14 = 2;
                    break;
                }
                case 31: {
                    n14 = 161;
                    break;
                }
                case 32: {
                    n14 = 217;
                    break;
                }
                case 33: {
                    n14 = 1;
                    break;
                }
                case 34: {
                    n14 = 219;
                    break;
                }
                case 35: {
                    n14 = 235;
                    break;
                }
                case 36: {
                    n14 = 66;
                    break;
                }
                case 37: {
                    n14 = 221;
                    break;
                }
                case 38: {
                    n14 = 245;
                    break;
                }
                case 39: {
                    n14 = 61;
                    break;
                }
                case 40: {
                    n14 = 108;
                    break;
                }
                case 41: {
                    n14 = 241;
                    break;
                }
                case 42: {
                    n14 = 205;
                    break;
                }
                case 43: {
                    n14 = 178;
                    break;
                }
                case 44: {
                    n14 = 114;
                    break;
                }
                case 45: {
                    n14 = 84;
                    break;
                }
                case 46: {
                    n14 = 33;
                    break;
                }
                case 47: {
                    n14 = 60;
                    break;
                }
                case 48: {
                    n14 = 121;
                    break;
                }
                case 49: {
                    n14 = 225;
                    break;
                }
                case 50: {
                    n14 = 229;
                    break;
                }
                case 51: {
                    n14 = 35;
                    break;
                }
                case 52: {
                    n14 = 181;
                    break;
                }
                case 53: {
                    n14 = 166;
                    break;
                }
                case 54: {
                    n14 = 86;
                    break;
                }
                case 55: {
                    n14 = 191;
                    break;
                }
                case 56: {
                    n14 = 74;
                    break;
                }
                case 57: {
                    n14 = 126;
                    break;
                }
                case 58: {
                    n14 = 239;
                    break;
                }
                case 59: {
                    n14 = 194;
                    break;
                }
                case 60: {
                    n14 = 133;
                    break;
                }
                case 61: {
                    n14 = 158;
                    break;
                }
                case 62: {
                    n14 = 124;
                    break;
                }
                case 63: {
                    n14 = 152;
                    break;
                }
                case 64: {
                    n14 = 231;
                    break;
                }
                case 65: {
                    n14 = 179;
                    break;
                }
                case 66: {
                    n14 = 24;
                    break;
                }
                case 67: {
                    n14 = 140;
                    break;
                }
                case 68: {
                    n14 = 200;
                    break;
                }
                case 69: {
                    n14 = 96;
                    break;
                }
                case 70: {
                    n14 = 82;
                    break;
                }
                case 71: {
                    n14 = 8;
                    break;
                }
                case 72: {
                    n14 = 18;
                    break;
                }
                case 73: {
                    n14 = 167;
                    break;
                }
                case 74: {
                    n14 = 248;
                    break;
                }
                case 75: {
                    n14 = 185;
                    break;
                }
                case 76: {
                    n14 = 228;
                    break;
                }
                case 77: {
                    n14 = 232;
                    break;
                }
                case 78: {
                    n14 = 62;
                    break;
                }
                case 79: {
                    n14 = 125;
                    break;
                }
                case 80: {
                    n14 = 9;
                    break;
                }
                case 81: {
                    n14 = 89;
                    break;
                }
                case 82: {
                    n14 = 94;
                    break;
                }
                case 83: {
                    n14 = 15;
                    break;
                }
                case 84: {
                    n14 = 22;
                    break;
                }
                case 85: {
                    n14 = 212;
                    break;
                }
                case 86: {
                    n14 = 244;
                    break;
                }
                case 87: {
                    n14 = 127;
                    break;
                }
                case 88: {
                    n14 = 119;
                    break;
                }
                case 89: {
                    n14 = 164;
                    break;
                }
                case 90: {
                    n14 = 14;
                    break;
                }
                case 91: {
                    n14 = 10;
                    break;
                }
                case 92: {
                    n14 = 85;
                    break;
                }
                case 93: {
                    n14 = 36;
                    break;
                }
                case 94: {
                    n14 = 109;
                    break;
                }
                case 95: {
                    n14 = 49;
                    break;
                }
                case 96: {
                    n14 = 5;
                    break;
                }
                case 97: {
                    n14 = 255;
                    break;
                }
                case 98: {
                    n14 = 79;
                    break;
                }
                case 99: {
                    n14 = 169;
                    break;
                }
                case 100: {
                    n14 = 208;
                    break;
                }
                case 101: {
                    n14 = 129;
                    break;
                }
                case 102: {
                    n14 = 139;
                    break;
                }
                case 103: {
                    n14 = 107;
                    break;
                }
                case 104: {
                    n14 = 173;
                    break;
                }
                case 105: {
                    n14 = 227;
                    break;
                }
                case 106: {
                    n14 = 100;
                    break;
                }
                case 107: {
                    n14 = 168;
                    break;
                }
                case 108: {
                    n14 = 70;
                    break;
                }
                case 109: {
                    n14 = 26;
                    break;
                }
                case 110: {
                    n14 = 130;
                    break;
                }
                case 111: {
                    n14 = 180;
                    break;
                }
                case 112: {
                    n14 = 21;
                    break;
                }
                case 113: {
                    n14 = 249;
                    break;
                }
                case 114: {
                    n14 = 59;
                    break;
                }
                case 115: {
                    n14 = 253;
                    break;
                }
                case 116: {
                    n14 = 113;
                    break;
                }
                case 117: {
                    n14 = 91;
                    break;
                }
                case 118: {
                    n14 = 34;
                    break;
                }
                case 119: {
                    n14 = 44;
                    break;
                }
                case 120: {
                    n14 = 99;
                    break;
                }
                case 121: {
                    n14 = 75;
                    break;
                }
                case 122: {
                    n14 = 246;
                    break;
                }
                case 123: {
                    n14 = 30;
                    break;
                }
                case 124: {
                    n14 = 104;
                    break;
                }
                case 125: {
                    n14 = 128;
                    break;
                }
                case 126: {
                    n14 = 135;
                    break;
                }
                case 127: {
                    n14 = 16;
                    break;
                }
                case 128: {
                    n14 = 210;
                    break;
                }
                case 129: {
                    n14 = 196;
                    break;
                }
                case 130: {
                    n14 = 134;
                    break;
                }
                case 131: {
                    n14 = 118;
                    break;
                }
                case 132: {
                    n14 = 142;
                    break;
                }
                case 133: {
                    n14 = 131;
                    break;
                }
                case 134: {
                    n14 = 201;
                    break;
                }
                case 135: {
                    n14 = 204;
                    break;
                }
                case 136: {
                    n14 = 50;
                    break;
                }
                case 137: {
                    n14 = 150;
                    break;
                }
                case 138: {
                    n14 = 115;
                    break;
                }
                case 139: {
                    n14 = 64;
                    break;
                }
                case 140: {
                    n14 = 41;
                    break;
                }
                case 141: {
                    n14 = 120;
                    break;
                }
                case 142: {
                    n14 = 55;
                    break;
                }
                case 143: {
                    n14 = 81;
                    break;
                }
                case 144: {
                    n14 = 47;
                    break;
                }
                case 145: {
                    n14 = 4;
                    break;
                }
                case 146: {
                    n14 = 111;
                    break;
                }
                case 147: {
                    n14 = 163;
                    break;
                }
                case 148: {
                    n14 = 233;
                    break;
                }
                case 149: {
                    n14 = 65;
                    break;
                }
                case 150: {
                    n14 = 187;
                    break;
                }
                case 151: {
                    n14 = 172;
                    break;
                }
                case 152: {
                    n14 = 237;
                    break;
                }
                case 153: {
                    n14 = 203;
                    break;
                }
                case 154: {
                    n14 = 213;
                    break;
                }
                case 155: {
                    n14 = 254;
                    break;
                }
                case 156: {
                    n14 = 76;
                    break;
                }
                case 157: {
                    n14 = 87;
                    break;
                }
                case 158: {
                    n14 = 151;
                    break;
                }
                case 159: {
                    n14 = 23;
                    break;
                }
                case 160: {
                    n14 = 106;
                    break;
                }
                case 161: {
                    n14 = 202;
                    break;
                }
                case 162: {
                    n14 = 52;
                    break;
                }
                case 163: {
                    n14 = 46;
                    break;
                }
                case 164: {
                    n14 = 218;
                    break;
                }
                case 165: {
                    n14 = 72;
                    break;
                }
                case 166: {
                    n14 = 190;
                    break;
                }
                case 167: {
                    n14 = 162;
                    break;
                }
                case 168: {
                    n14 = 90;
                    break;
                }
                case 169: {
                    n14 = 11;
                    break;
                }
                case 170: {
                    n14 = 188;
                    break;
                }
                case 171: {
                    n14 = 214;
                    break;
                }
                case 172: {
                    n14 = 122;
                    break;
                }
                case 173: {
                    n14 = 174;
                    break;
                }
                case 174: {
                    n14 = 182;
                    break;
                }
                case 175: {
                    n14 = 48;
                    break;
                }
                case 176: {
                    n14 = 192;
                    break;
                }
                case 177: {
                    n14 = 54;
                    break;
                }
                case 178: {
                    n14 = 77;
                    break;
                }
                case 179: {
                    n14 = 230;
                    break;
                }
                case 180: {
                    n14 = 31;
                    break;
                }
                case 181: {
                    n14 = 57;
                    break;
                }
                case 182: {
                    n14 = 103;
                    break;
                }
                case 183: {
                    n14 = 80;
                    break;
                }
                case 184: {
                    n14 = 211;
                    break;
                }
                case 185: {
                    n14 = 238;
                    break;
                }
                case 186: {
                    n14 = 160;
                    break;
                }
                case 187: {
                    n14 = 138;
                    break;
                }
                case 188: {
                    n14 = 53;
                    break;
                }
                case 189: {
                    n14 = 207;
                    break;
                }
                case 190: {
                    n14 = 13;
                    break;
                }
                case 191: {
                    n14 = 40;
                    break;
                }
                case 192: {
                    n14 = 39;
                    break;
                }
                case 193: {
                    n14 = 58;
                    break;
                }
                case 194: {
                    n14 = 136;
                    break;
                }
                case 195: {
                    n14 = 71;
                    break;
                }
                case 196: {
                    n14 = 117;
                    break;
                }
                case 197: {
                    n14 = 141;
                    break;
                }
                case 198: {
                    n14 = 153;
                    break;
                }
                case 199: {
                    n14 = 216;
                    break;
                }
                case 200: {
                    n14 = 146;
                    break;
                }
                case 201: {
                    n14 = 186;
                    break;
                }
                case 202: {
                    n14 = 63;
                    break;
                }
                case 203: {
                    n14 = 252;
                    break;
                }
                case 204: {
                    n14 = 29;
                    break;
                }
                case 205: {
                    n14 = 67;
                    break;
                }
                case 206: {
                    n14 = 101;
                    break;
                }
                case 207: {
                    n14 = 175;
                    break;
                }
                case 208: {
                    n14 = 83;
                    break;
                }
                case 209: {
                    n14 = 116;
                    break;
                }
                case 210: {
                    n14 = 156;
                    break;
                }
                case 211: {
                    n14 = 193;
                    break;
                }
                case 212: {
                    n14 = 199;
                    break;
                }
                case 213: {
                    n14 = 32;
                    break;
                }
                case 214: {
                    n14 = 137;
                    break;
                }
                case 215: {
                    n14 = 56;
                    break;
                }
                case 216: {
                    n14 = 154;
                    break;
                }
                case 217: {
                    n14 = 144;
                    break;
                }
                case 218: {
                    n14 = 97;
                    break;
                }
                case 219: {
                    n14 = 25;
                    break;
                }
                case 220: {
                    n14 = 209;
                    break;
                }
                case 221: {
                    n14 = 240;
                    break;
                }
                case 222: {
                    n14 = 51;
                    break;
                }
                case 223: {
                    n14 = 155;
                    break;
                }
                case 224: {
                    n14 = 177;
                    break;
                }
                case 225: {
                    n14 = 222;
                    break;
                }
                case 226: {
                    n14 = 184;
                    break;
                }
                case 227: {
                    n14 = 198;
                    break;
                }
                case 228: {
                    n14 = 78;
                    break;
                }
                case 229: {
                    n14 = 98;
                    break;
                }
                case 230: {
                    n14 = 147;
                    break;
                }
                case 231: {
                    n14 = 143;
                    break;
                }
                case 232: {
                    n14 = 110;
                    break;
                }
                case 233: {
                    n14 = 215;
                    break;
                }
                case 234: {
                    n14 = 132;
                    break;
                }
                case 235: {
                    n14 = 183;
                    break;
                }
                case 236: {
                    n14 = 7;
                    break;
                }
                case 237: {
                    n14 = 157;
                    break;
                }
                case 238: {
                    n14 = 105;
                    break;
                }
                case 239: {
                    n14 = 88;
                    break;
                }
                case 240: {
                    n14 = 12;
                    break;
                }
                case 241: {
                    n14 = 223;
                    break;
                }
                case 242: {
                    n14 = 250;
                    break;
                }
                case 243: {
                    n14 = 92;
                    break;
                }
                case 244: {
                    n14 = 27;
                    break;
                }
                case 245: {
                    n14 = 234;
                    break;
                }
                case 246: {
                    n14 = 102;
                    break;
                }
                case 247: {
                    n14 = 247;
                    break;
                }
                case 248: {
                    n14 = 112;
                    break;
                }
                case 249: {
                    n14 = 95;
                    break;
                }
                case 250: {
                    n14 = 224;
                    break;
                }
                case 251: {
                    n14 = 170;
                    break;
                }
                case 252: {
                    n14 = 42;
                    break;
                }
                case 253: {
                    n14 = 17;
                    break;
                }
                case 254: {
                    n14 = 3;
                    break;
                }
                default: {
                    n14 = 28;
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
            kn_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

