/*
 * Decompiled with CFR 0.152.
 */
package com.I;

import com.I.L;
import com.NE;
import com.cz_0;
import com.ky_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import javax.swing.ImageIcon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class x {
    public static ImageIcon b;
    public static ImageIcon D;
    public static ImageIcon e;
    public static ImageIcon z;
    public static ImageIcon o;
    private String x;
    private L M;
    private String Q;
    private ImageIcon h;
    private x S;
    private ZipEntry d;
    private List A;
    private static int[] g;
    private static final String[] a;
    private static final String[] c;

    public x() {
        this.A = new ArrayList();
        this.v(null);
    }

    public x(L l2, String string) {
        this.A = new ArrayList();
        this.y(l2);
        this.N(string);
        this.v(null);
    }

    public x(L l2, String string, x x10) {
        this.A = new ArrayList();
        this.y(l2);
        this.N(string);
        this.v(x10);
    }

    public x(L l2, String string, x x10, List list) {
        int[] nArray = com.I.x.w();
        this.A = new ArrayList();
        int[] nArray2 = nArray;
        this.y(l2);
        this.N(string);
        this.v(x10);
        this.S(list);
        if (nArray2 == null) {
            ky_2.K(new String[3]);
        }
    }

    public String B() {
        int[] nArray = com.I.x.w();
        String string = this.x;
        if (nArray != null) {
            if (string == null) {
                this.m();
            }
            string = this.x;
        }
        return string;
    }

    private void m() {
        this.L(NE.E(com.I.x.a(-811, -20083)));
    }

    public void L(String string) {
        this.x = string;
    }

    public L B() {
        return this.M;
    }

    public void y(L l2) {
        this.M = l2;
    }

    public String v() {
        return this.Q;
    }

    public void N(String string) {
        this.Q = string;
    }

    public x x() {
        return this.S;
    }

    public void v(x x10) {
        this.S = x10;
    }

    public ZipEntry H() {
        return this.d;
    }

    public void x(ZipEntry zipEntry) {
        this.d = zipEntry;
    }

    public List G() {
        return this.A;
    }

    public x y(int n10) {
        return (x)this.A.get(n10);
    }

    public x q(String string) {
        Iterator iterator = this.A.iterator();
        int[] nArray = com.I.x.w();
        while (iterator.hasNext()) {
            block4: {
                x x10;
                block3: {
                    x x11;
                    x10 = x11 = (x)iterator.next();
                    if (nArray == null) break block3;
                    if (!x10.v().equals(string)) break block4;
                    x10 = x11;
                }
                return x10;
            }
            if (nArray != null) continue;
        }
        return null;
    }

    public void S(List list) {
        this.A = list;
    }

    public void C(x x10) {
        this.A.add(x10);
    }

    public void M(int n10, x x10) {
        this.A.add(n10, x10);
    }

    public void i(x x10) {
        this.A.remove(x10);
    }

    public ImageIcon u() {
        ImageIcon imageIcon;
        int[] nArray = com.I.x.w();
        x x10 = this;
        if (nArray != null) {
            if (x10.h != null) {
                return this.h;
            }
            x10 = this;
        }
        boolean bl = x10.M.equals((Object)L.jarEntry);
        if (nArray != null) {
            if (bl) {
                return b;
            }
            bl = this.M.equals((Object)L.packageEntry);
        }
        if (nArray != null) {
            if (bl) {
                return D;
            }
            bl = this.M.equals((Object)L.javaEntry);
        }
        if (nArray != null) {
            if (bl) {
                return z;
            }
            bl = this.M.equals((Object)L.classEntry);
        }
        if (nArray != null) {
            if (bl) {
                return e;
            }
            bl = false;
        }
        ImageIcon imageIcon2 = imageIcon = cz_0.a(bl, this.i(), 1.0f);
        if (nArray != null) {
            if (imageIcon2 != null) {
                return imageIcon;
            }
            imageIcon2 = o;
        }
        return imageIcon2;
    }

    public void n(ImageIcon imageIcon) {
        this.h = imageIcon;
    }

    public String i() {
        return cz_0.G(this.Q, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean E(Class clazz) {
        int[] nArray = com.I.x.w();
        Class clazz2 = clazz;
        if (nArray != null) {
            if (clazz2 == null) return false;
            clazz2 = clazz;
        }
        boolean bl = clazz2.getCanonicalName().equals(this.F());
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public String F() {
        String string;
        block9: {
            block8: {
                boolean bl;
                block7: {
                    int[] nArray;
                    block6: {
                        string = this.v();
                        nArray = com.I.x.w();
                        for (x x10 = this.x(); x10 != null; x10 = x10.x()) {
                            bl = x10.B().equals((Object)L.jarEntry);
                            if (nArray != null && nArray != null) {
                                if (bl) break;
                                string = x10.v() + "." + string;
                                if (nArray != null) continue;
                            }
                            break block6;
                        }
                        bl = this.M.equals((Object)L.classEntry);
                    }
                    if (nArray == null) break block7;
                    if (bl) break block8;
                    bl = this.M.equals((Object)L.javaEntry);
                }
                if (!bl) break block9;
            }
            string = string.substring(0, string.lastIndexOf("."));
        }
        return string;
    }

    public String r() {
        String string = this.v();
        x x10 = this.x();
        int[] nArray = com.I.x.w();
        while (x10 != null) {
            block4: {
                x x11;
                boolean bl;
                block3: {
                    bl = x10.B().equals((Object)L.jarEntry);
                    if (nArray == null) break block3;
                    if (bl) break;
                    x11 = x10.x();
                    if (nArray == null) break block4;
                    bl = x11.B().equals((Object)L.jarEntry);
                }
                if (bl) break;
                string = x10.v() + "/" + string;
                x11 = x10 = x10.x();
            }
            if (nArray != null) continue;
        }
        return string;
    }

    public List X() {
        ArrayList<x> arrayList = new ArrayList<x>();
        x x10 = this;
        int[] nArray = com.I.x.w();
        while (x10 != null) {
            x x11 = x10;
            if (nArray != null) {
                if (x11.B().equals((Object)L.jarEntry)) break;
                arrayList.add(0, x10);
                x11 = x10 = x10.x();
            }
            if (nArray != null) continue;
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int[] nArray = com.I.x.w();
        Object object2 = object;
        if (nArray != null) {
            if (object2 == null) return false;
            object2 = object;
        }
        boolean bl = object2 instanceof x;
        if (nArray != null) {
            if (!bl) return false;
            bl = ((x)object).r().equals(this.r());
        }
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public String toString() {
        return this.v() + com.I.x.a(-809, -32260) + (Object)((Object)this.B()) + ")";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[7];
                var3_1 = 0;
                var2_2 = "\u00ebVI\u00c8b\u00b3\u0017\u00b4\u0087\u00ea\u00dfb\u00c4\u0002zI\u0011}G\u009b\u00ea8\u00f7F<\u00e5\u00be\u00b1\f8\b\u00d7\u00b4\u00fc\u0002.\u00f3\u000e\u00c3zLM\u00c2\u0003\u000f\u00aa\u0017kNnj\u00f8";
                var4_3 = "\u00ebVI\u00c8b\u00b3\u0017\u00b4\u0087\u00ea\u00dfb\u00c4\u0002zI\u0011}G\u009b\u00ea8\u00f7F<\u00e5\u00be\u00b1\f8\b\u00d7\u00b4\u00fc\u0002.\u00f3\u000e\u00c3zLM\u00c2\u0003\u000f\u00aa\u0017kNnj\u00f8".length();
                var1_4 = 13;
                var0_5 = -1;
                com.I.x.q(new int[4]);
lbl8:
                // 2 sources

                while (true) {
                    v0 = 22;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00ac(h\u00ce\u008f\u00bajQ\u00dan\u00cf\u008d{\u00d1\u00d6\u000e\u00e6\u0092!\u0099\u00a6PF\u0001`\u00da0\u0015l^";
                    var4_3 = "\u00ac(h\u00ce\u008f\u00bajQ\u00dan\u00cf\u008d{\u00d1\u00d6\u000e\u00e6\u0092!\u0099\u00a6PF\u0001`\u00da0\u0015l^".length();
                    var1_4 = 15;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 115;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 30;
                            break;
                        }
                        case 1: {
                            v15 = 70;
                            break;
                        }
                        case 2: {
                            v15 = 8;
                            break;
                        }
                        case 3: {
                            v15 = 127;
                            break;
                        }
                        case 4: {
                            v15 = 111;
                            break;
                        }
                        case 5: {
                            v15 = 29;
                            break;
                        }
                        default: {
                            v15 = 21;
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
lbl86:
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
lbl96:
                // 1 sources

                ** continue;
            }
        }
        com.I.x.a = var5;
        com.I.x.c = new String[7];
        com.I.x.b = new ImageIcon(x.class.getResource(com.I.x.a(-812, 21625)));
        com.I.x.D = new ImageIcon(x.class.getResource(com.I.x.a(-810, -7028)));
        com.I.x.e = new ImageIcon(x.class.getResource(com.I.x.a(-815, 4668)));
        com.I.x.z = new ImageIcon(x.class.getResource(com.I.x.a(-814, 13908)));
        com.I.x.o = new ImageIcon(x.class.getResource(com.I.x.a(-816, -30238)));
    }

    public static void q(int[] nArray) {
        g = nArray;
    }

    public static int[] w() {
        return g;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFFCD4) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 27;
                    break;
                }
                case 1: {
                    n14 = 62;
                    break;
                }
                case 2: {
                    n14 = 127;
                    break;
                }
                case 3: {
                    n14 = 202;
                    break;
                }
                case 4: {
                    n14 = 77;
                    break;
                }
                case 5: {
                    n14 = 208;
                    break;
                }
                case 6: {
                    n14 = 1;
                    break;
                }
                case 7: {
                    n14 = 54;
                    break;
                }
                case 8: {
                    n14 = 73;
                    break;
                }
                case 9: {
                    n14 = 61;
                    break;
                }
                case 10: {
                    n14 = 47;
                    break;
                }
                case 11: {
                    n14 = 18;
                    break;
                }
                case 12: {
                    n14 = 251;
                    break;
                }
                case 13: {
                    n14 = 15;
                    break;
                }
                case 14: {
                    n14 = 189;
                    break;
                }
                case 15: {
                    n14 = 72;
                    break;
                }
                case 16: {
                    n14 = 243;
                    break;
                }
                case 17: {
                    n14 = 75;
                    break;
                }
                case 18: {
                    n14 = 120;
                    break;
                }
                case 19: {
                    n14 = 32;
                    break;
                }
                case 20: {
                    n14 = 255;
                    break;
                }
                case 21: {
                    n14 = 103;
                    break;
                }
                case 22: {
                    n14 = 144;
                    break;
                }
                case 23: {
                    n14 = 241;
                    break;
                }
                case 24: {
                    n14 = 235;
                    break;
                }
                case 25: {
                    n14 = 244;
                    break;
                }
                case 26: {
                    n14 = 84;
                    break;
                }
                case 27: {
                    n14 = 176;
                    break;
                }
                case 28: {
                    n14 = 106;
                    break;
                }
                case 29: {
                    n14 = 109;
                    break;
                }
                case 30: {
                    n14 = 111;
                    break;
                }
                case 31: {
                    n14 = 60;
                    break;
                }
                case 32: {
                    n14 = 172;
                    break;
                }
                case 33: {
                    n14 = 170;
                    break;
                }
                case 34: {
                    n14 = 158;
                    break;
                }
                case 35: {
                    n14 = 212;
                    break;
                }
                case 36: {
                    n14 = 89;
                    break;
                }
                case 37: {
                    n14 = 175;
                    break;
                }
                case 38: {
                    n14 = 246;
                    break;
                }
                case 39: {
                    n14 = 58;
                    break;
                }
                case 40: {
                    n14 = 154;
                    break;
                }
                case 41: {
                    n14 = 159;
                    break;
                }
                case 42: {
                    n14 = 214;
                    break;
                }
                case 43: {
                    n14 = 43;
                    break;
                }
                case 44: {
                    n14 = 177;
                    break;
                }
                case 45: {
                    n14 = 227;
                    break;
                }
                case 46: {
                    n14 = 13;
                    break;
                }
                case 47: {
                    n14 = 21;
                    break;
                }
                case 48: {
                    n14 = 104;
                    break;
                }
                case 49: {
                    n14 = 183;
                    break;
                }
                case 50: {
                    n14 = 143;
                    break;
                }
                case 51: {
                    n14 = 188;
                    break;
                }
                case 52: {
                    n14 = 210;
                    break;
                }
                case 53: {
                    n14 = 79;
                    break;
                }
                case 54: {
                    n14 = 97;
                    break;
                }
                case 55: {
                    n14 = 130;
                    break;
                }
                case 56: {
                    n14 = 124;
                    break;
                }
                case 57: {
                    n14 = 140;
                    break;
                }
                case 58: {
                    n14 = 51;
                    break;
                }
                case 59: {
                    n14 = 229;
                    break;
                }
                case 60: {
                    n14 = 167;
                    break;
                }
                case 61: {
                    n14 = 215;
                    break;
                }
                case 62: {
                    n14 = 28;
                    break;
                }
                case 63: {
                    n14 = 171;
                    break;
                }
                case 64: {
                    n14 = 231;
                    break;
                }
                case 65: {
                    n14 = 207;
                    break;
                }
                case 66: {
                    n14 = 248;
                    break;
                }
                case 67: {
                    n14 = 4;
                    break;
                }
                case 68: {
                    n14 = 220;
                    break;
                }
                case 69: {
                    n14 = 209;
                    break;
                }
                case 70: {
                    n14 = 178;
                    break;
                }
                case 71: {
                    n14 = 131;
                    break;
                }
                case 72: {
                    n14 = 200;
                    break;
                }
                case 73: {
                    n14 = 217;
                    break;
                }
                case 74: {
                    n14 = 33;
                    break;
                }
                case 75: {
                    n14 = 145;
                    break;
                }
                case 76: {
                    n14 = 252;
                    break;
                }
                case 77: {
                    n14 = 86;
                    break;
                }
                case 78: {
                    n14 = 162;
                    break;
                }
                case 79: {
                    n14 = 149;
                    break;
                }
                case 80: {
                    n14 = 221;
                    break;
                }
                case 81: {
                    n14 = 70;
                    break;
                }
                case 82: {
                    n14 = 123;
                    break;
                }
                case 83: {
                    n14 = 153;
                    break;
                }
                case 84: {
                    n14 = 12;
                    break;
                }
                case 85: {
                    n14 = 78;
                    break;
                }
                case 86: {
                    n14 = 40;
                    break;
                }
                case 87: {
                    n14 = 113;
                    break;
                }
                case 88: {
                    n14 = 105;
                    break;
                }
                case 89: {
                    n14 = 129;
                    break;
                }
                case 90: {
                    n14 = 67;
                    break;
                }
                case 91: {
                    n14 = 98;
                    break;
                }
                case 92: {
                    n14 = 48;
                    break;
                }
                case 93: {
                    n14 = 122;
                    break;
                }
                case 94: {
                    n14 = 95;
                    break;
                }
                case 95: {
                    n14 = 240;
                    break;
                }
                case 96: {
                    n14 = 10;
                    break;
                }
                case 97: {
                    n14 = 69;
                    break;
                }
                case 98: {
                    n14 = 238;
                    break;
                }
                case 99: {
                    n14 = 20;
                    break;
                }
                case 100: {
                    n14 = 228;
                    break;
                }
                case 101: {
                    n14 = 83;
                    break;
                }
                case 102: {
                    n14 = 163;
                    break;
                }
                case 103: {
                    n14 = 155;
                    break;
                }
                case 104: {
                    n14 = 39;
                    break;
                }
                case 105: {
                    n14 = 213;
                    break;
                }
                case 106: {
                    n14 = 57;
                    break;
                }
                case 107: {
                    n14 = 174;
                    break;
                }
                case 108: {
                    n14 = 115;
                    break;
                }
                case 109: {
                    n14 = 236;
                    break;
                }
                case 110: {
                    n14 = 157;
                    break;
                }
                case 111: {
                    n14 = 201;
                    break;
                }
                case 112: {
                    n14 = 230;
                    break;
                }
                case 113: {
                    n14 = 99;
                    break;
                }
                case 114: {
                    n14 = 85;
                    break;
                }
                case 115: {
                    n14 = 110;
                    break;
                }
                case 116: {
                    n14 = 36;
                    break;
                }
                case 117: {
                    n14 = 112;
                    break;
                }
                case 118: {
                    n14 = 26;
                    break;
                }
                case 119: {
                    n14 = 53;
                    break;
                }
                case 120: {
                    n14 = 142;
                    break;
                }
                case 121: {
                    n14 = 245;
                    break;
                }
                case 122: {
                    n14 = 66;
                    break;
                }
                case 123: {
                    n14 = 55;
                    break;
                }
                case 124: {
                    n14 = 132;
                    break;
                }
                case 125: {
                    n14 = 160;
                    break;
                }
                case 126: {
                    n14 = 146;
                    break;
                }
                case 127: {
                    n14 = 88;
                    break;
                }
                case 128: {
                    n14 = 3;
                    break;
                }
                case 129: {
                    n14 = 80;
                    break;
                }
                case 130: {
                    n14 = 128;
                    break;
                }
                case 131: {
                    n14 = 165;
                    break;
                }
                case 132: {
                    n14 = 19;
                    break;
                }
                case 133: {
                    n14 = 195;
                    break;
                }
                case 134: {
                    n14 = 133;
                    break;
                }
                case 135: {
                    n14 = 108;
                    break;
                }
                case 136: {
                    n14 = 119;
                    break;
                }
                case 137: {
                    n14 = 203;
                    break;
                }
                case 138: {
                    n14 = 56;
                    break;
                }
                case 139: {
                    n14 = 114;
                    break;
                }
                case 140: {
                    n14 = 0;
                    break;
                }
                case 141: {
                    n14 = 150;
                    break;
                }
                case 142: {
                    n14 = 232;
                    break;
                }
                case 143: {
                    n14 = 192;
                    break;
                }
                case 144: {
                    n14 = 185;
                    break;
                }
                case 145: {
                    n14 = 234;
                    break;
                }
                case 146: {
                    n14 = 7;
                    break;
                }
                case 147: {
                    n14 = 87;
                    break;
                }
                case 148: {
                    n14 = 52;
                    break;
                }
                case 149: {
                    n14 = 100;
                    break;
                }
                case 150: {
                    n14 = 35;
                    break;
                }
                case 151: {
                    n14 = 49;
                    break;
                }
                case 152: {
                    n14 = 37;
                    break;
                }
                case 153: {
                    n14 = 31;
                    break;
                }
                case 154: {
                    n14 = 161;
                    break;
                }
                case 155: {
                    n14 = 179;
                    break;
                }
                case 156: {
                    n14 = 196;
                    break;
                }
                case 157: {
                    n14 = 216;
                    break;
                }
                case 158: {
                    n14 = 11;
                    break;
                }
                case 159: {
                    n14 = 247;
                    break;
                }
                case 160: {
                    n14 = 191;
                    break;
                }
                case 161: {
                    n14 = 5;
                    break;
                }
                case 162: {
                    n14 = 233;
                    break;
                }
                case 163: {
                    n14 = 94;
                    break;
                }
                case 164: {
                    n14 = 134;
                    break;
                }
                case 165: {
                    n14 = 151;
                    break;
                }
                case 166: {
                    n14 = 81;
                    break;
                }
                case 167: {
                    n14 = 181;
                    break;
                }
                case 168: {
                    n14 = 184;
                    break;
                }
                case 169: {
                    n14 = 25;
                    break;
                }
                case 170: {
                    n14 = 156;
                    break;
                }
                case 171: {
                    n14 = 226;
                    break;
                }
                case 172: {
                    n14 = 68;
                    break;
                }
                case 173: {
                    n14 = 224;
                    break;
                }
                case 174: {
                    n14 = 242;
                    break;
                }
                case 175: {
                    n14 = 135;
                    break;
                }
                case 176: {
                    n14 = 152;
                    break;
                }
                case 177: {
                    n14 = 141;
                    break;
                }
                case 178: {
                    n14 = 46;
                    break;
                }
                case 179: {
                    n14 = 91;
                    break;
                }
                case 180: {
                    n14 = 50;
                    break;
                }
                case 181: {
                    n14 = 193;
                    break;
                }
                case 182: {
                    n14 = 126;
                    break;
                }
                case 183: {
                    n14 = 164;
                    break;
                }
                case 184: {
                    n14 = 225;
                    break;
                }
                case 185: {
                    n14 = 71;
                    break;
                }
                case 186: {
                    n14 = 44;
                    break;
                }
                case 187: {
                    n14 = 29;
                    break;
                }
                case 188: {
                    n14 = 74;
                    break;
                }
                case 189: {
                    n14 = 205;
                    break;
                }
                case 190: {
                    n14 = 125;
                    break;
                }
                case 191: {
                    n14 = 9;
                    break;
                }
                case 192: {
                    n14 = 101;
                    break;
                }
                case 193: {
                    n14 = 148;
                    break;
                }
                case 194: {
                    n14 = 93;
                    break;
                }
                case 195: {
                    n14 = 82;
                    break;
                }
                case 196: {
                    n14 = 45;
                    break;
                }
                case 197: {
                    n14 = 254;
                    break;
                }
                case 198: {
                    n14 = 116;
                    break;
                }
                case 199: {
                    n14 = 42;
                    break;
                }
                case 200: {
                    n14 = 107;
                    break;
                }
                case 201: {
                    n14 = 34;
                    break;
                }
                case 202: {
                    n14 = 223;
                    break;
                }
                case 203: {
                    n14 = 64;
                    break;
                }
                case 204: {
                    n14 = 117;
                    break;
                }
                case 205: {
                    n14 = 41;
                    break;
                }
                case 206: {
                    n14 = 237;
                    break;
                }
                case 207: {
                    n14 = 137;
                    break;
                }
                case 208: {
                    n14 = 198;
                    break;
                }
                case 209: {
                    n14 = 182;
                    break;
                }
                case 210: {
                    n14 = 219;
                    break;
                }
                case 211: {
                    n14 = 23;
                    break;
                }
                case 212: {
                    n14 = 22;
                    break;
                }
                case 213: {
                    n14 = 166;
                    break;
                }
                case 214: {
                    n14 = 121;
                    break;
                }
                case 215: {
                    n14 = 180;
                    break;
                }
                case 216: {
                    n14 = 197;
                    break;
                }
                case 217: {
                    n14 = 199;
                    break;
                }
                case 218: {
                    n14 = 65;
                    break;
                }
                case 219: {
                    n14 = 249;
                    break;
                }
                case 220: {
                    n14 = 204;
                    break;
                }
                case 221: {
                    n14 = 218;
                    break;
                }
                case 222: {
                    n14 = 206;
                    break;
                }
                case 223: {
                    n14 = 92;
                    break;
                }
                case 224: {
                    n14 = 118;
                    break;
                }
                case 225: {
                    n14 = 187;
                    break;
                }
                case 226: {
                    n14 = 63;
                    break;
                }
                case 227: {
                    n14 = 239;
                    break;
                }
                case 228: {
                    n14 = 186;
                    break;
                }
                case 229: {
                    n14 = 250;
                    break;
                }
                case 230: {
                    n14 = 190;
                    break;
                }
                case 231: {
                    n14 = 24;
                    break;
                }
                case 232: {
                    n14 = 253;
                    break;
                }
                case 233: {
                    n14 = 16;
                    break;
                }
                case 234: {
                    n14 = 96;
                    break;
                }
                case 235: {
                    n14 = 138;
                    break;
                }
                case 236: {
                    n14 = 8;
                    break;
                }
                case 237: {
                    n14 = 2;
                    break;
                }
                case 238: {
                    n14 = 147;
                    break;
                }
                case 239: {
                    n14 = 14;
                    break;
                }
                case 240: {
                    n14 = 194;
                    break;
                }
                case 241: {
                    n14 = 136;
                    break;
                }
                case 242: {
                    n14 = 168;
                    break;
                }
                case 243: {
                    n14 = 59;
                    break;
                }
                case 244: {
                    n14 = 102;
                    break;
                }
                case 245: {
                    n14 = 6;
                    break;
                }
                case 246: {
                    n14 = 222;
                    break;
                }
                case 247: {
                    n14 = 38;
                    break;
                }
                case 248: {
                    n14 = 139;
                    break;
                }
                case 249: {
                    n14 = 169;
                    break;
                }
                case 250: {
                    n14 = 17;
                    break;
                }
                case 251: {
                    n14 = 211;
                    break;
                }
                case 252: {
                    n14 = 76;
                    break;
                }
                case 253: {
                    n14 = 30;
                    break;
                }
                case 254: {
                    n14 = 173;
                    break;
                }
                default: {
                    n14 = 90;
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
            com.I.x.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

