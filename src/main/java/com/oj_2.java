/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.IJ;
import com.NE;
import com.R9;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.oj
 */
@XStreamAlias(value="Dictionary")
public final class oj_2
implements Serializable {
    @XStreamAsAttribute
    private String k;
    @XStreamAsAttribute
    private String Y;
    @XStreamAsAttribute
    private String Z;
    @XStreamAsAttribute
    private String n;
    @XStreamAsAttribute
    private String S;
    @XStreamAsAttribute
    private String i;
    @XStreamImplicit(itemFieldName="record")
    private List E;
    @XStreamImplicit(itemFieldName="Dictionary")
    private List C;
    @XStreamAlias(value="LanguageInfo")
    private List v;
    private static final String[] a;
    private static final String[] b;

    public oj_2() {
        this.r();
    }

    public oj_2(String string) {
        this.r();
        this.z(string);
    }

    public oj_2(String string, String string2) {
        this.r();
        this.z(string);
        this.D(string2);
    }

    public oj_2(String string, String string2, String string3) {
        this.r();
        this.z(string);
        this.D(string2);
        this.h(string3);
    }

    public oj_2(String string, String string2, String string3, String string4) {
        this.r();
        this.z(string);
        this.D(string2);
        this.h(string3);
        this.q(string4);
    }

    public oj_2(String string, String string2, String string3, String string4, String string5) {
        this.r();
        this.z(string);
        this.D(string2);
        this.h(string3);
        this.q(string4);
        this.f(string5);
    }

    public String o() {
        int[] nArray = G9.J();
        String string = this.k;
        if (nArray != null) {
            if (string == null) {
                this.r();
            }
            string = this.k;
        }
        return string;
    }

    public void r() {
        this.k = NE.E(oj_2.a(-18818, 8900));
    }

    public void n(String string) {
        this.k = string;
    }

    public String C() {
        return this.Y;
    }

    public void D(String string) {
        this.Y = string;
    }

    public String N() {
        return this.Z;
    }

    public void z(String string) {
        this.Z = string;
    }

    public String G() {
        return this.n;
    }

    public void h(String string) {
        this.n = string;
    }

    public String p() {
        return this.S;
    }

    public void q(String string) {
        this.S = string;
    }

    public String z() {
        return this.i;
    }

    public void f(String string) {
        this.i = string;
    }

    public List I() {
        return this.E;
    }

    public void k(List list) {
        this.E = list;
    }

    public List j() {
        return this.C;
    }

    public void y(List list) {
        this.C = list;
    }

    public List n() {
        return this.v;
    }

    public void P(List list) {
        this.v = list;
    }

    public IJ b(String string) {
        block4: {
            List list;
            int[] nArray;
            block3: {
                nArray = G9.J();
                list = this.v;
                if (nArray == null) break block3;
                if (list == null) break block4;
                list = this.v;
            }
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                block6: {
                    IJ iJ;
                    block5: {
                        IJ iJ2;
                        iJ = iJ2 = (IJ)iterator.next();
                        if (nArray == null) break block5;
                        if (!iJ.k().equals(string)) break block6;
                        iJ = iJ2;
                    }
                    return iJ;
                }
                if (nArray != null) continue;
            }
        }
        return null;
    }

    public void N(IJ iJ) {
        block6: {
            boolean bl;
            int[] nArray = G9.J();
            List list = this.v;
            if (nArray != null) {
                if (list == null) {
                    this.v = new ArrayList(1);
                }
                list = this.v;
            }
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                block8: {
                    block7: {
                        IJ iJ2 = (IJ)iterator.next();
                        if (nArray == null) break block7;
                        bl = iJ2.k().equals(iJ.k());
                        if (nArray == null) break block6;
                        if (!bl) break block8;
                        iterator.remove();
                    }
                    if (nArray != null) break;
                }
                if (nArray != null) continue;
            }
            bl = this.v.add(iJ);
        }
    }

    private void S() {
        block3: {
            block2: {
                int[] nArray = G9.J();
                oj_2 oj_22 = this;
                if (nArray == null) break block2;
                if (oj_22.E != null) break block3;
                oj_22 = this;
            }
            oj_22.E = new ArrayList(1);
        }
    }

    public R9 w(String string, String string2, String string3) {
        return this.H(string, new G9[]{new G9(string2, string3)});
    }

    public R9 I(String string, String string2, Character c2, String string3) {
        return this.H(string, new G9[]{new G9(string2, c2, string3)});
    }

    public R9 H(String string, G9[] g9Array) {
        return this.v(new R9(string, g9Array));
    }

    public R9 P(String string, List list) {
        return this.v(new R9(string, list));
    }

    public R9 v(R9 r9) {
        block9: {
            boolean bl;
            this.S();
            Iterator iterator = this.E.iterator();
            int[] nArray = G9.J();
            while (iterator.hasNext()) {
                block12: {
                    R9 r92;
                    block10: {
                        R9 r93;
                        R9 r94;
                        block13: {
                            String string;
                            block11: {
                                r94 = (R9)iterator.next();
                                string = r94.h();
                                if (nArray == null) break block11;
                                bl = string.equals(r9.h());
                                if (nArray == null) break block9;
                                if (!bl) break block12;
                                r93 = r9;
                                if (nArray == null) break block13;
                                string = r93.U();
                            }
                            if (string == null) {
                                r9.v(r94.U());
                            }
                            r93 = r94;
                        }
                        for (G9 g92 : r93.A()) {
                            block15: {
                                R9 r95;
                                G9 g93;
                                block14: {
                                    r92 = r9;
                                    if (nArray == null) break block10;
                                    g93 = g92;
                                    if (nArray == null) break block14;
                                    if (r92.X(g93.I())) break block15;
                                    r95 = r9;
                                    g93 = g92;
                                }
                                r95.s(g93);
                            }
                            if (nArray != null) continue;
                        }
                        r92 = r94;
                    }
                    return r92;
                }
                if (nArray != null) continue;
            }
            bl = this.E.add(r9);
        }
        return r9;
    }

    public void M(R9 r9) {
        block3: {
            List list;
            block2: {
                int[] nArray = G9.J();
                list = this.E;
                if (nArray == null) break block2;
                if (list == null) break block3;
                list = this.E;
            }
            list.remove(r9);
        }
    }

    public void t(String string) {
        int[] nArray = G9.J();
        if (this.E != null) {
            for (int i2 = 0; i2 < this.E.size(); ++i2) {
                String string2 = ((R9)this.E.get(i2)).h();
                if (nArray != null) {
                    if (!string2.equals(string)) continue;
                    string2 = this.E.remove(i2);
                }
                if (nArray != null) break;
                if (nArray != null) continue;
            }
        }
    }

    public void G(String string) {
        block7: {
            List list;
            int[] nArray;
            block6: {
                nArray = G9.J();
                list = this.E;
                if (nArray == null) break block6;
                if (list == null) break block7;
                list = this.E;
            }
            int n10 = list.size() - 1;
            while (n10 >= 0) {
                ((R9)this.E.get(n10)).p(string);
                if (nArray != null) {
                    if (((R9)this.E.get(n10)).E() == 0) {
                        this.E.remove(n10);
                    }
                    --n10;
                }
                if (nArray != null) continue;
            }
        }
    }

    public void m() {
        block3: {
            List list;
            block2: {
                int[] nArray = G9.J();
                list = this.E;
                if (nArray == null) break block2;
                if (list == null) break block3;
                list = this.E;
            }
            list.clear();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int J() {
        int[] nArray = G9.J();
        List list = this.E;
        if (nArray != null) {
            if (list == null) return 0;
            list = this.E;
        }
        int n10 = list.size();
        return n10;
    }

    public void H(oj_2 oj_22) {
        this.C();
        this.C.add(oj_22);
    }

    private void C() {
        block3: {
            block2: {
                int[] nArray = G9.J();
                oj_2 oj_22 = this;
                if (nArray == null) break block2;
                if (oj_22.C != null) break block3;
                oj_22 = this;
            }
            oj_22.C = new ArrayList();
        }
    }

    public void M(oj_2 oj_22) {
        block3: {
            List list;
            block2: {
                int[] nArray = G9.J();
                list = this.C;
                if (nArray == null) break block2;
                if (list == null) break block3;
                list = this.C;
            }
            list.remove(oj_22);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int G() {
        int[] nArray = G9.J();
        List list = this.C;
        if (nArray != null) {
            if (list == null) return 0;
            list = this.C;
        }
        int n10 = list.size();
        return n10;
    }

    public List G() {
        return this.x(new ArrayList());
    }

    /*
     * Unable to fully structure code
     */
    public List x(List var1_1) {
        block9: {
            block7: {
                block8: {
                    var2_2 = G9.J();
                    v0 = this.E;
                    if (var2_2 == null) break block7;
                    if (v0 == null) break block8;
                    for (Serializable var4_4 : this.E) {
                        var4_4.H(var1_1);
                        if (var2_2 != null) {
                            if (var2_2 != null) continue;
                        }
                        ** GOTO lbl-1000
                    }
                }
                v0 = this.C;
            }
            if (var2_2 != null) {
                ** if (v0 == null) goto lbl-1000
lbl-1000:
                // 2 sources

                {
                    for (Serializable var4_4 : this.C) {
                        v0 = var4_4.x((List)var1_1);
                        if (var2_2 != null) {
                            if (var2_2 != null) continue;
                        } else {
                            ** GOTO lbl20
                        }
lbl20:
                        // 2 sources

                        ** GOTO lbl23
                    }
                }
            }
            break block9;
lbl-1000:
            // 4 sources

            {
                v0 = var1_1;
            }
        }
        return v0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int[] nArray = G9.J();
        Object object2 = object;
        if (nArray != null) {
            if (object2 == null) return false;
            object2 = object;
        }
        boolean bl = object2 instanceof oj_2;
        if (nArray != null) {
            if (!bl) return false;
            bl = ((oj_2)object).o().equals(this.o());
        }
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public String toString() {
        int[] nArray = G9.J();
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.Y;
        if (nArray != null) {
            string = string != null ? this.Y + " " : "";
        }
        return stringBuilder.append(string).append(this.J() > 0 ? oj_2.a(-18820, 27777) + this.J() + ")" : "").append(this.G() > 0 ? oj_2.a(-18819, 3850) + this.G() + ")" : "").toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "\u00ec\t\u00fbBv\u008a=y\u0017\u00cd\u00f4\u0013\u00e9\u00fcZ\u00ecbF\u0085\u008d\u007f\u00e7Q\u0080\u00adO_O\u00ec1\u00f6\u0003\u0017|]";
            var4_3 = "\u00ec\t\u00fbBv\u008a=y\u0017\u00cd\u00f4\u0013\u00e9\u00fcZ\u00ecbF\u0085\u008d\u007f\u00e7Q\u0080\u00adO_O\u00ec1\u00f6\u0003\u0017|]".length();
            var1_4 = 11;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 14;
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
                            v11 = 77;
                            break;
                        }
                        case 1: {
                            v11 = 85;
                            break;
                        }
                        case 2: {
                            v11 = 86;
                            break;
                        }
                        case 3: {
                            v11 = 78;
                            break;
                        }
                        case 4: {
                            v11 = 83;
                            break;
                        }
                        case 5: {
                            v11 = 98;
                            break;
                        }
                        default: {
                            v11 = 43;
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
        oj_2.a = var5;
        oj_2.b = new String[3];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFB67C) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 96;
                    break;
                }
                case 1: {
                    n14 = 249;
                    break;
                }
                case 2: {
                    n14 = 8;
                    break;
                }
                case 3: {
                    n14 = 6;
                    break;
                }
                case 4: {
                    n14 = 118;
                    break;
                }
                case 5: {
                    n14 = 63;
                    break;
                }
                case 6: {
                    n14 = 217;
                    break;
                }
                case 7: {
                    n14 = 17;
                    break;
                }
                case 8: {
                    n14 = 161;
                    break;
                }
                case 9: {
                    n14 = 49;
                    break;
                }
                case 10: {
                    n14 = 167;
                    break;
                }
                case 11: {
                    n14 = 204;
                    break;
                }
                case 12: {
                    n14 = 107;
                    break;
                }
                case 13: {
                    n14 = 157;
                    break;
                }
                case 14: {
                    n14 = 185;
                    break;
                }
                case 15: {
                    n14 = 66;
                    break;
                }
                case 16: {
                    n14 = 159;
                    break;
                }
                case 17: {
                    n14 = 69;
                    break;
                }
                case 18: {
                    n14 = 239;
                    break;
                }
                case 19: {
                    n14 = 171;
                    break;
                }
                case 20: {
                    n14 = 137;
                    break;
                }
                case 21: {
                    n14 = 188;
                    break;
                }
                case 22: {
                    n14 = 203;
                    break;
                }
                case 23: {
                    n14 = 193;
                    break;
                }
                case 24: {
                    n14 = 111;
                    break;
                }
                case 25: {
                    n14 = 132;
                    break;
                }
                case 26: {
                    n14 = 182;
                    break;
                }
                case 27: {
                    n14 = 120;
                    break;
                }
                case 28: {
                    n14 = 117;
                    break;
                }
                case 29: {
                    n14 = 89;
                    break;
                }
                case 30: {
                    n14 = 129;
                    break;
                }
                case 31: {
                    n14 = 33;
                    break;
                }
                case 32: {
                    n14 = 148;
                    break;
                }
                case 33: {
                    n14 = 114;
                    break;
                }
                case 34: {
                    n14 = 131;
                    break;
                }
                case 35: {
                    n14 = 41;
                    break;
                }
                case 36: {
                    n14 = 1;
                    break;
                }
                case 37: {
                    n14 = 212;
                    break;
                }
                case 38: {
                    n14 = 211;
                    break;
                }
                case 39: {
                    n14 = 79;
                    break;
                }
                case 40: {
                    n14 = 216;
                    break;
                }
                case 41: {
                    n14 = 70;
                    break;
                }
                case 42: {
                    n14 = 163;
                    break;
                }
                case 43: {
                    n14 = 56;
                    break;
                }
                case 44: {
                    n14 = 81;
                    break;
                }
                case 45: {
                    n14 = 32;
                    break;
                }
                case 46: {
                    n14 = 196;
                    break;
                }
                case 47: {
                    n14 = 53;
                    break;
                }
                case 48: {
                    n14 = 45;
                    break;
                }
                case 49: {
                    n14 = 153;
                    break;
                }
                case 50: {
                    n14 = 178;
                    break;
                }
                case 51: {
                    n14 = 68;
                    break;
                }
                case 52: {
                    n14 = 151;
                    break;
                }
                case 53: {
                    n14 = 130;
                    break;
                }
                case 54: {
                    n14 = 170;
                    break;
                }
                case 55: {
                    n14 = 176;
                    break;
                }
                case 56: {
                    n14 = 237;
                    break;
                }
                case 57: {
                    n14 = 122;
                    break;
                }
                case 58: {
                    n14 = 54;
                    break;
                }
                case 59: {
                    n14 = 35;
                    break;
                }
                case 60: {
                    n14 = 134;
                    break;
                }
                case 61: {
                    n14 = 101;
                    break;
                }
                case 62: {
                    n14 = 253;
                    break;
                }
                case 63: {
                    n14 = 2;
                    break;
                }
                case 64: {
                    n14 = 208;
                    break;
                }
                case 65: {
                    n14 = 184;
                    break;
                }
                case 66: {
                    n14 = 221;
                    break;
                }
                case 67: {
                    n14 = 36;
                    break;
                }
                case 68: {
                    n14 = 22;
                    break;
                }
                case 69: {
                    n14 = 241;
                    break;
                }
                case 70: {
                    n14 = 44;
                    break;
                }
                case 71: {
                    n14 = 136;
                    break;
                }
                case 72: {
                    n14 = 83;
                    break;
                }
                case 73: {
                    n14 = 214;
                    break;
                }
                case 74: {
                    n14 = 195;
                    break;
                }
                case 75: {
                    n14 = 181;
                    break;
                }
                case 76: {
                    n14 = 238;
                    break;
                }
                case 77: {
                    n14 = 77;
                    break;
                }
                case 78: {
                    n14 = 99;
                    break;
                }
                case 79: {
                    n14 = 244;
                    break;
                }
                case 80: {
                    n14 = 165;
                    break;
                }
                case 81: {
                    n14 = 201;
                    break;
                }
                case 82: {
                    n14 = 222;
                    break;
                }
                case 83: {
                    n14 = 179;
                    break;
                }
                case 84: {
                    n14 = 180;
                    break;
                }
                case 85: {
                    n14 = 84;
                    break;
                }
                case 86: {
                    n14 = 5;
                    break;
                }
                case 87: {
                    n14 = 73;
                    break;
                }
                case 88: {
                    n14 = 255;
                    break;
                }
                case 89: {
                    n14 = 4;
                    break;
                }
                case 90: {
                    n14 = 206;
                    break;
                }
                case 91: {
                    n14 = 133;
                    break;
                }
                case 92: {
                    n14 = 51;
                    break;
                }
                case 93: {
                    n14 = 150;
                    break;
                }
                case 94: {
                    n14 = 91;
                    break;
                }
                case 95: {
                    n14 = 76;
                    break;
                }
                case 96: {
                    n14 = 245;
                    break;
                }
                case 97: {
                    n14 = 119;
                    break;
                }
                case 98: {
                    n14 = 250;
                    break;
                }
                case 99: {
                    n14 = 82;
                    break;
                }
                case 100: {
                    n14 = 248;
                    break;
                }
                case 101: {
                    n14 = 210;
                    break;
                }
                case 102: {
                    n14 = 15;
                    break;
                }
                case 103: {
                    n14 = 190;
                    break;
                }
                case 104: {
                    n14 = 59;
                    break;
                }
                case 105: {
                    n14 = 55;
                    break;
                }
                case 106: {
                    n14 = 235;
                    break;
                }
                case 107: {
                    n14 = 164;
                    break;
                }
                case 108: {
                    n14 = 168;
                    break;
                }
                case 109: {
                    n14 = 155;
                    break;
                }
                case 110: {
                    n14 = 7;
                    break;
                }
                case 111: {
                    n14 = 19;
                    break;
                }
                case 112: {
                    n14 = 115;
                    break;
                }
                case 113: {
                    n14 = 46;
                    break;
                }
                case 114: {
                    n14 = 141;
                    break;
                }
                case 115: {
                    n14 = 121;
                    break;
                }
                case 116: {
                    n14 = 147;
                    break;
                }
                case 117: {
                    n14 = 80;
                    break;
                }
                case 118: {
                    n14 = 156;
                    break;
                }
                case 119: {
                    n14 = 207;
                    break;
                }
                case 120: {
                    n14 = 126;
                    break;
                }
                case 121: {
                    n14 = 227;
                    break;
                }
                case 122: {
                    n14 = 100;
                    break;
                }
                case 123: {
                    n14 = 23;
                    break;
                }
                case 124: {
                    n14 = 95;
                    break;
                }
                case 125: {
                    n14 = 40;
                    break;
                }
                case 126: {
                    n14 = 194;
                    break;
                }
                case 127: {
                    n14 = 87;
                    break;
                }
                case 128: {
                    n14 = 106;
                    break;
                }
                case 129: {
                    n14 = 246;
                    break;
                }
                case 130: {
                    n14 = 139;
                    break;
                }
                case 131: {
                    n14 = 252;
                    break;
                }
                case 132: {
                    n14 = 65;
                    break;
                }
                case 133: {
                    n14 = 145;
                    break;
                }
                case 134: {
                    n14 = 110;
                    break;
                }
                case 135: {
                    n14 = 191;
                    break;
                }
                case 136: {
                    n14 = 173;
                    break;
                }
                case 137: {
                    n14 = 86;
                    break;
                }
                case 138: {
                    n14 = 140;
                    break;
                }
                case 139: {
                    n14 = 187;
                    break;
                }
                case 140: {
                    n14 = 192;
                    break;
                }
                case 141: {
                    n14 = 138;
                    break;
                }
                case 142: {
                    n14 = 232;
                    break;
                }
                case 143: {
                    n14 = 14;
                    break;
                }
                case 144: {
                    n14 = 160;
                    break;
                }
                case 145: {
                    n14 = 72;
                    break;
                }
                case 146: {
                    n14 = 24;
                    break;
                }
                case 147: {
                    n14 = 169;
                    break;
                }
                case 148: {
                    n14 = 240;
                    break;
                }
                case 149: {
                    n14 = 219;
                    break;
                }
                case 150: {
                    n14 = 3;
                    break;
                }
                case 151: {
                    n14 = 224;
                    break;
                }
                case 152: {
                    n14 = 94;
                    break;
                }
                case 153: {
                    n14 = 105;
                    break;
                }
                case 154: {
                    n14 = 21;
                    break;
                }
                case 155: {
                    n14 = 215;
                    break;
                }
                case 156: {
                    n14 = 52;
                    break;
                }
                case 157: {
                    n14 = 112;
                    break;
                }
                case 158: {
                    n14 = 233;
                    break;
                }
                case 159: {
                    n14 = 97;
                    break;
                }
                case 160: {
                    n14 = 199;
                    break;
                }
                case 161: {
                    n14 = 218;
                    break;
                }
                case 162: {
                    n14 = 186;
                    break;
                }
                case 163: {
                    n14 = 231;
                    break;
                }
                case 164: {
                    n14 = 20;
                    break;
                }
                case 165: {
                    n14 = 57;
                    break;
                }
                case 166: {
                    n14 = 25;
                    break;
                }
                case 167: {
                    n14 = 47;
                    break;
                }
                case 168: {
                    n14 = 29;
                    break;
                }
                case 169: {
                    n14 = 98;
                    break;
                }
                case 170: {
                    n14 = 128;
                    break;
                }
                case 171: {
                    n14 = 205;
                    break;
                }
                case 172: {
                    n14 = 11;
                    break;
                }
                case 173: {
                    n14 = 174;
                    break;
                }
                case 174: {
                    n14 = 251;
                    break;
                }
                case 175: {
                    n14 = 242;
                    break;
                }
                case 176: {
                    n14 = 243;
                    break;
                }
                case 177: {
                    n14 = 64;
                    break;
                }
                case 178: {
                    n14 = 104;
                    break;
                }
                case 179: {
                    n14 = 38;
                    break;
                }
                case 180: {
                    n14 = 142;
                    break;
                }
                case 181: {
                    n14 = 108;
                    break;
                }
                case 182: {
                    n14 = 189;
                    break;
                }
                case 183: {
                    n14 = 166;
                    break;
                }
                case 184: {
                    n14 = 10;
                    break;
                }
                case 185: {
                    n14 = 61;
                    break;
                }
                case 186: {
                    n14 = 229;
                    break;
                }
                case 187: {
                    n14 = 146;
                    break;
                }
                case 188: {
                    n14 = 88;
                    break;
                }
                case 189: {
                    n14 = 93;
                    break;
                }
                case 190: {
                    n14 = 172;
                    break;
                }
                case 191: {
                    n14 = 0;
                    break;
                }
                case 192: {
                    n14 = 230;
                    break;
                }
                case 193: {
                    n14 = 152;
                    break;
                }
                case 194: {
                    n14 = 12;
                    break;
                }
                case 195: {
                    n14 = 78;
                    break;
                }
                case 196: {
                    n14 = 75;
                    break;
                }
                case 197: {
                    n14 = 9;
                    break;
                }
                case 198: {
                    n14 = 149;
                    break;
                }
                case 199: {
                    n14 = 234;
                    break;
                }
                case 200: {
                    n14 = 90;
                    break;
                }
                case 201: {
                    n14 = 162;
                    break;
                }
                case 202: {
                    n14 = 71;
                    break;
                }
                case 203: {
                    n14 = 175;
                    break;
                }
                case 204: {
                    n14 = 124;
                    break;
                }
                case 205: {
                    n14 = 62;
                    break;
                }
                case 206: {
                    n14 = 13;
                    break;
                }
                case 207: {
                    n14 = 92;
                    break;
                }
                case 208: {
                    n14 = 127;
                    break;
                }
                case 209: {
                    n14 = 197;
                    break;
                }
                case 210: {
                    n14 = 135;
                    break;
                }
                case 211: {
                    n14 = 102;
                    break;
                }
                case 212: {
                    n14 = 28;
                    break;
                }
                case 213: {
                    n14 = 236;
                    break;
                }
                case 214: {
                    n14 = 103;
                    break;
                }
                case 215: {
                    n14 = 43;
                    break;
                }
                case 216: {
                    n14 = 213;
                    break;
                }
                case 217: {
                    n14 = 60;
                    break;
                }
                case 218: {
                    n14 = 74;
                    break;
                }
                case 219: {
                    n14 = 27;
                    break;
                }
                case 220: {
                    n14 = 16;
                    break;
                }
                case 221: {
                    n14 = 202;
                    break;
                }
                case 222: {
                    n14 = 48;
                    break;
                }
                case 223: {
                    n14 = 18;
                    break;
                }
                case 224: {
                    n14 = 158;
                    break;
                }
                case 225: {
                    n14 = 144;
                    break;
                }
                case 226: {
                    n14 = 39;
                    break;
                }
                case 227: {
                    n14 = 37;
                    break;
                }
                case 228: {
                    n14 = 247;
                    break;
                }
                case 229: {
                    n14 = 30;
                    break;
                }
                case 230: {
                    n14 = 177;
                    break;
                }
                case 231: {
                    n14 = 143;
                    break;
                }
                case 232: {
                    n14 = 34;
                    break;
                }
                case 233: {
                    n14 = 50;
                    break;
                }
                case 234: {
                    n14 = 225;
                    break;
                }
                case 235: {
                    n14 = 42;
                    break;
                }
                case 236: {
                    n14 = 113;
                    break;
                }
                case 237: {
                    n14 = 58;
                    break;
                }
                case 238: {
                    n14 = 116;
                    break;
                }
                case 239: {
                    n14 = 254;
                    break;
                }
                case 240: {
                    n14 = 67;
                    break;
                }
                case 241: {
                    n14 = 85;
                    break;
                }
                case 242: {
                    n14 = 154;
                    break;
                }
                case 243: {
                    n14 = 209;
                    break;
                }
                case 244: {
                    n14 = 223;
                    break;
                }
                case 245: {
                    n14 = 109;
                    break;
                }
                case 246: {
                    n14 = 220;
                    break;
                }
                case 247: {
                    n14 = 198;
                    break;
                }
                case 248: {
                    n14 = 200;
                    break;
                }
                case 249: {
                    n14 = 183;
                    break;
                }
                case 250: {
                    n14 = 226;
                    break;
                }
                case 251: {
                    n14 = 123;
                    break;
                }
                case 252: {
                    n14 = 31;
                    break;
                }
                case 253: {
                    n14 = 26;
                    break;
                }
                case 254: {
                    n14 = 228;
                    break;
                }
                default: {
                    n14 = 125;
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
            oj_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

