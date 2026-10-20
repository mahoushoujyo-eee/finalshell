/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com.H1;
import com.IF;
import com.dm_2;
import java.util.Vector;

class RI
implements IF {
    private String L;
    private Vector r;
    final H1 w;
    private static final String[] a;
    private static final String[] b;

    RI(H1 h12, String string) {
        block20: {
            int n10;
            byte[] byArray;
            boolean bl;
            block19: {
                this.w = h12;
                this.r = new Vector();
                this.L = string;
                bl = dm_2.J();
                this.r.addElement((Vector)H1.H(h12).get(""));
                byArray = E8.J(string);
                try {
                    try {
                        n10 = H1.T(h12).size();
                        if (bl) break block19;
                        if (n10 <= 1) break block20;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw RI.a(numberFormatException);
                    }
                    n10 = 1;
                }
                catch (NumberFormatException numberFormatException) {
                    throw RI.a(numberFormatException);
                }
            }
            int n11 = n10;
            block16: while (true) {
                int n12 = n11;
                block17: while (n12 < H1.T(h12).size()) {
                    String[] stringArray = ((String)H1.T(h12).elementAt(n11)).split(RI.a(-12996, 16958));
                    for (int i2 = 0; i2 < stringArray.length; ++i2) {
                        boolean bl2;
                        block23: {
                            boolean bl3;
                            block21: {
                                String string2;
                                block22: {
                                    bl3 = false;
                                    string2 = stringArray[i2].trim();
                                    n12 = string2.startsWith("!") ? 1 : 0;
                                    if (bl) continue block17;
                                    try {
                                        if (bl) break block21;
                                        if (n12 == 0) break block22;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw RI.a(numberFormatException);
                                    }
                                    bl3 = true;
                                    string2 = string2.substring(1).trim();
                                }
                                bl2 = E8.j(E8.J(string2), byArray);
                            }
                            try {
                                block24: {
                                    try {
                                        try {
                                            try {
                                                if (bl) break block23;
                                                if (!bl2) break block24;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw RI.a(numberFormatException);
                                            }
                                            if (bl3) continue;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw RI.a(numberFormatException);
                                        }
                                        this.r.addElement((Vector)H1.H(h12).get(H1.T(h12).elementAt(n11)));
                                        if (!bl) continue;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw RI.a(numberFormatException);
                                    }
                                }
                                bl2 = bl3;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw RI.a(numberFormatException);
                            }
                        }
                        try {
                            if (!bl2) continue;
                            this.r.addElement((Vector)H1.H(h12).get(H1.T(h12).elementAt(n11)));
                            continue;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw RI.a(numberFormatException);
                        }
                    }
                    ++n11;
                    if (!bl) continue block16;
                }
                break;
            }
        }
    }

    /*
     * Exception decompiling
     */
    private String S(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [40[DOLOOP]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private String[] F(String string) {
        int n10;
        Vector<String> vector;
        block10: {
            string = string.toUpperCase();
            vector = new Vector<String>();
            boolean bl = dm_2.F();
            int n11 = 0;
            block6: while (true) {
                int n12 = n11;
                block7: while (n12 < this.r.size()) {
                    Vector vector2 = (Vector)this.r.elementAt(n11);
                    n10 = 0;
                    if (!bl) break block10;
                    int n13 = n10;
                    while (n13 < vector2.size()) {
                        block11: {
                            block12: {
                                String[] stringArray = (String[])vector2.elementAt(n13);
                                try {
                                    if (!bl) break block11;
                                    n12 = stringArray[0].toUpperCase().equals(string) ? 1 : 0;
                                    if (!bl) continue block7;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw RI.a(numberFormatException);
                                }
                                if (n12 != 0) {
                                    String string2 = stringArray[1];
                                    try {
                                        try {
                                            if (!bl) break block11;
                                            if (string2 == null) break block12;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw RI.a(numberFormatException);
                                        }
                                        vector.remove(string2);
                                        vector.addElement(string2);
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw RI.a(numberFormatException);
                                    }
                                }
                            }
                            ++n13;
                        }
                        if (bl) continue;
                    }
                    ++n11;
                    if (bl) continue block6;
                }
                break;
            }
            n10 = vector.size();
        }
        String[] stringArray = new String[n10];
        vector.toArray(stringArray);
        return stringArray;
    }

    @Override
    public String U() {
        return this.S(RI.a(-12994, -6020));
    }

    @Override
    public String o() {
        return this.S(RI.a(-12999, 26946));
    }

    @Override
    public int x() {
        String string = this.S(RI.a(-12995, 14952));
        int n10 = -1;
        try {
            n10 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        return n10;
    }

    @Override
    public String m(String string) {
        String string2;
        block18: {
            block19: {
                String string3;
                block22: {
                    block23: {
                        String string4;
                        block20: {
                            String string5;
                            boolean bl;
                            block16: {
                                bl = dm_2.J();
                                try {
                                    block17: {
                                        try {
                                            try {
                                                try {
                                                    string5 = string;
                                                    if (bl) break block16;
                                                    if (string5.equals(RI.a(-13000, -29539))) break block17;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw RI.a(numberFormatException);
                                                }
                                                string2 = string;
                                                if (bl) break block18;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw RI.a(numberFormatException);
                                            }
                                            if (!string2.equals(RI.a(-12993, 19915))) break block19;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw RI.a(numberFormatException);
                                        }
                                    }
                                    string5 = this.S(string);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw RI.a(numberFormatException);
                                }
                            }
                            String string6 = string5;
                            try {
                                block21: {
                                    try {
                                        try {
                                            try {
                                                string4 = string6;
                                                if (bl) break block20;
                                                if (string4 == null) break block21;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw RI.a(numberFormatException);
                                            }
                                            string3 = string6;
                                            if (bl) break block22;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw RI.a(numberFormatException);
                                        }
                                        if (!string3.equals(RI.a(-12997, 8864))) break block23;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw RI.a(numberFormatException);
                                    }
                                }
                                string4 = RI.a(-13008, -8105);
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw RI.a(numberFormatException);
                            }
                        }
                        return string4;
                    }
                    string3 = RI.a(-12998, -22170);
                }
                return string3;
            }
            string2 = this.S(string);
        }
        return string2;
    }

    @Override
    public String[] G(String string) {
        return this.F(string);
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[9];
                var3_1 = 0;
                var2_2 = "\u00fe\u00b4\u009a\u00b8Q\u00bf|\f#\u00d4\u0092\u00861\u0010\u0019\u0004\u00d9\u0083\u0086\u00c3\u001aY\u00d9Pd\u00be~\u00f6i\u0016\u00b0\u00ce\u00d3Ye\u00ee\u0016T\u00a4\u00ff{eF4)\u0097r\u0002\u001b\u00b1\u0004\u00c4\u00e6\u0086y\u0004\u00b6\u000e\u00d9\u00eb\b\u0016\u00f0\u00d749\u00ae\u00f0\u00bc";
                var4_3 = "\u00fe\u00b4\u009a\u00b8Q\u00bf|\f#\u00d4\u0092\u00861\u0010\u0019\u0004\u00d9\u0083\u0086\u00c3\u001aY\u00d9Pd\u00be~\u00f6i\u0016\u00b0\u00ce\u00d3Ye\u00ee\u0016T\u00a4\u00ff{eF4)\u0097r\u0002\u001b\u00b1\u0004\u00c4\u00e6\u0086y\u0004\u00b6\u000e\u00d9\u00eb\b\u0016\u00f0\u00d749\u00ae\u00f0\u00bc".length();
                var1_4 = 15;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 65;
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
                    var2_2 = "\u0005\u00de\u00ec\u00fc\u0096>\u008d5\u0014\u00fa}J\u00d5\u0080\u008e\u001a>\u00e5$\u008e\u00b2\u00d8\u0083\u000f\"\u00cb\u00d0\u00f8G\u001f\u001a\u00e2\u0018\u00ba\u00bci\u00e5\u00cb\u00d7\u0092sh";
                    var4_3 = "\u0005\u00de\u00ec\u00fc\u0096>\u008d5\u0014\u00fa}J\u00d5\u0080\u008e\u001a>\u00e5$\u008e\u00b2\u00d8\u0083\u000f\"\u00cb\u00d0\u00f8G\u001f\u001a\u00e2\u0018\u00ba\u00bci\u00e5\u00cb\u00d7\u0092sh".length();
                    var1_4 = 15;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 73;
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
                            v15 = 10;
                            break;
                        }
                        case 1: {
                            v15 = 95;
                            break;
                        }
                        case 2: {
                            v15 = 15;
                            break;
                        }
                        case 3: {
                            v15 = 94;
                            break;
                        }
                        case 4: {
                            v15 = 56;
                            break;
                        }
                        case 5: {
                            v15 = 17;
                            break;
                        }
                        default: {
                            v15 = 119;
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
        RI.a = var5;
        RI.b = new String[9];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFCD38) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 154;
                    break;
                }
                case 1: {
                    n14 = 238;
                    break;
                }
                case 2: {
                    n14 = 208;
                    break;
                }
                case 3: {
                    n14 = 188;
                    break;
                }
                case 4: {
                    n14 = 168;
                    break;
                }
                case 5: {
                    n14 = 119;
                    break;
                }
                case 6: {
                    n14 = 171;
                    break;
                }
                case 7: {
                    n14 = 5;
                    break;
                }
                case 8: {
                    n14 = 136;
                    break;
                }
                case 9: {
                    n14 = 170;
                    break;
                }
                case 10: {
                    n14 = 17;
                    break;
                }
                case 11: {
                    n14 = 7;
                    break;
                }
                case 12: {
                    n14 = 74;
                    break;
                }
                case 13: {
                    n14 = 134;
                    break;
                }
                case 14: {
                    n14 = 44;
                    break;
                }
                case 15: {
                    n14 = 190;
                    break;
                }
                case 16: {
                    n14 = 38;
                    break;
                }
                case 17: {
                    n14 = 27;
                    break;
                }
                case 18: {
                    n14 = 254;
                    break;
                }
                case 19: {
                    n14 = 69;
                    break;
                }
                case 20: {
                    n14 = 51;
                    break;
                }
                case 21: {
                    n14 = 59;
                    break;
                }
                case 22: {
                    n14 = 53;
                    break;
                }
                case 23: {
                    n14 = 139;
                    break;
                }
                case 24: {
                    n14 = 176;
                    break;
                }
                case 25: {
                    n14 = 158;
                    break;
                }
                case 26: {
                    n14 = 20;
                    break;
                }
                case 27: {
                    n14 = 204;
                    break;
                }
                case 28: {
                    n14 = 149;
                    break;
                }
                case 29: {
                    n14 = 162;
                    break;
                }
                case 30: {
                    n14 = 84;
                    break;
                }
                case 31: {
                    n14 = 221;
                    break;
                }
                case 32: {
                    n14 = 133;
                    break;
                }
                case 33: {
                    n14 = 25;
                    break;
                }
                case 34: {
                    n14 = 124;
                    break;
                }
                case 35: {
                    n14 = 66;
                    break;
                }
                case 36: {
                    n14 = 86;
                    break;
                }
                case 37: {
                    n14 = 213;
                    break;
                }
                case 38: {
                    n14 = 112;
                    break;
                }
                case 39: {
                    n14 = 192;
                    break;
                }
                case 40: {
                    n14 = 64;
                    break;
                }
                case 41: {
                    n14 = 130;
                    break;
                }
                case 42: {
                    n14 = 0;
                    break;
                }
                case 43: {
                    n14 = 97;
                    break;
                }
                case 44: {
                    n14 = 217;
                    break;
                }
                case 45: {
                    n14 = 248;
                    break;
                }
                case 46: {
                    n14 = 111;
                    break;
                }
                case 47: {
                    n14 = 227;
                    break;
                }
                case 48: {
                    n14 = 186;
                    break;
                }
                case 49: {
                    n14 = 231;
                    break;
                }
                case 50: {
                    n14 = 93;
                    break;
                }
                case 51: {
                    n14 = 155;
                    break;
                }
                case 52: {
                    n14 = 96;
                    break;
                }
                case 53: {
                    n14 = 157;
                    break;
                }
                case 54: {
                    n14 = 161;
                    break;
                }
                case 55: {
                    n14 = 210;
                    break;
                }
                case 56: {
                    n14 = 141;
                    break;
                }
                case 57: {
                    n14 = 195;
                    break;
                }
                case 58: {
                    n14 = 203;
                    break;
                }
                case 59: {
                    n14 = 220;
                    break;
                }
                case 60: {
                    n14 = 70;
                    break;
                }
                case 61: {
                    n14 = 151;
                    break;
                }
                case 62: {
                    n14 = 76;
                    break;
                }
                case 63: {
                    n14 = 129;
                    break;
                }
                case 64: {
                    n14 = 198;
                    break;
                }
                case 65: {
                    n14 = 46;
                    break;
                }
                case 66: {
                    n14 = 250;
                    break;
                }
                case 67: {
                    n14 = 40;
                    break;
                }
                case 68: {
                    n14 = 185;
                    break;
                }
                case 69: {
                    n14 = 202;
                    break;
                }
                case 70: {
                    n14 = 166;
                    break;
                }
                case 71: {
                    n14 = 184;
                    break;
                }
                case 72: {
                    n14 = 63;
                    break;
                }
                case 73: {
                    n14 = 165;
                    break;
                }
                case 74: {
                    n14 = 6;
                    break;
                }
                case 75: {
                    n14 = 35;
                    break;
                }
                case 76: {
                    n14 = 229;
                    break;
                }
                case 77: {
                    n14 = 55;
                    break;
                }
                case 78: {
                    n14 = 230;
                    break;
                }
                case 79: {
                    n14 = 215;
                    break;
                }
                case 80: {
                    n14 = 98;
                    break;
                }
                case 81: {
                    n14 = 197;
                    break;
                }
                case 82: {
                    n14 = 11;
                    break;
                }
                case 83: {
                    n14 = 144;
                    break;
                }
                case 84: {
                    n14 = 58;
                    break;
                }
                case 85: {
                    n14 = 18;
                    break;
                }
                case 86: {
                    n14 = 251;
                    break;
                }
                case 87: {
                    n14 = 95;
                    break;
                }
                case 88: {
                    n14 = 37;
                    break;
                }
                case 89: {
                    n14 = 209;
                    break;
                }
                case 90: {
                    n14 = 21;
                    break;
                }
                case 91: {
                    n14 = 90;
                    break;
                }
                case 92: {
                    n14 = 183;
                    break;
                }
                case 93: {
                    n14 = 103;
                    break;
                }
                case 94: {
                    n14 = 78;
                    break;
                }
                case 95: {
                    n14 = 200;
                    break;
                }
                case 96: {
                    n14 = 24;
                    break;
                }
                case 97: {
                    n14 = 148;
                    break;
                }
                case 98: {
                    n14 = 222;
                    break;
                }
                case 99: {
                    n14 = 179;
                    break;
                }
                case 100: {
                    n14 = 172;
                    break;
                }
                case 101: {
                    n14 = 122;
                    break;
                }
                case 102: {
                    n14 = 196;
                    break;
                }
                case 103: {
                    n14 = 226;
                    break;
                }
                case 104: {
                    n14 = 71;
                    break;
                }
                case 105: {
                    n14 = 4;
                    break;
                }
                case 106: {
                    n14 = 255;
                    break;
                }
                case 107: {
                    n14 = 80;
                    break;
                }
                case 108: {
                    n14 = 1;
                    break;
                }
                case 109: {
                    n14 = 128;
                    break;
                }
                case 110: {
                    n14 = 62;
                    break;
                }
                case 111: {
                    n14 = 45;
                    break;
                }
                case 112: {
                    n14 = 156;
                    break;
                }
                case 113: {
                    n14 = 131;
                    break;
                }
                case 114: {
                    n14 = 114;
                    break;
                }
                case 115: {
                    n14 = 245;
                    break;
                }
                case 116: {
                    n14 = 60;
                    break;
                }
                case 117: {
                    n14 = 41;
                    break;
                }
                case 118: {
                    n14 = 36;
                    break;
                }
                case 119: {
                    n14 = 244;
                    break;
                }
                case 120: {
                    n14 = 142;
                    break;
                }
                case 121: {
                    n14 = 79;
                    break;
                }
                case 122: {
                    n14 = 201;
                    break;
                }
                case 123: {
                    n14 = 49;
                    break;
                }
                case 124: {
                    n14 = 247;
                    break;
                }
                case 125: {
                    n14 = 68;
                    break;
                }
                case 126: {
                    n14 = 153;
                    break;
                }
                case 127: {
                    n14 = 54;
                    break;
                }
                case 128: {
                    n14 = 219;
                    break;
                }
                case 129: {
                    n14 = 181;
                    break;
                }
                case 130: {
                    n14 = 31;
                    break;
                }
                case 131: {
                    n14 = 105;
                    break;
                }
                case 132: {
                    n14 = 189;
                    break;
                }
                case 133: {
                    n14 = 118;
                    break;
                }
                case 134: {
                    n14 = 253;
                    break;
                }
                case 135: {
                    n14 = 3;
                    break;
                }
                case 136: {
                    n14 = 99;
                    break;
                }
                case 137: {
                    n14 = 115;
                    break;
                }
                case 138: {
                    n14 = 77;
                    break;
                }
                case 139: {
                    n14 = 177;
                    break;
                }
                case 140: {
                    n14 = 15;
                    break;
                }
                case 141: {
                    n14 = 57;
                    break;
                }
                case 142: {
                    n14 = 218;
                    break;
                }
                case 143: {
                    n14 = 106;
                    break;
                }
                case 144: {
                    n14 = 223;
                    break;
                }
                case 145: {
                    n14 = 14;
                    break;
                }
                case 146: {
                    n14 = 123;
                    break;
                }
                case 147: {
                    n14 = 32;
                    break;
                }
                case 148: {
                    n14 = 175;
                    break;
                }
                case 149: {
                    n14 = 164;
                    break;
                }
                case 150: {
                    n14 = 214;
                    break;
                }
                case 151: {
                    n14 = 10;
                    break;
                }
                case 152: {
                    n14 = 138;
                    break;
                }
                case 153: {
                    n14 = 52;
                    break;
                }
                case 154: {
                    n14 = 137;
                    break;
                }
                case 155: {
                    n14 = 167;
                    break;
                }
                case 156: {
                    n14 = 116;
                    break;
                }
                case 157: {
                    n14 = 120;
                    break;
                }
                case 158: {
                    n14 = 107;
                    break;
                }
                case 159: {
                    n14 = 232;
                    break;
                }
                case 160: {
                    n14 = 205;
                    break;
                }
                case 161: {
                    n14 = 143;
                    break;
                }
                case 162: {
                    n14 = 206;
                    break;
                }
                case 163: {
                    n14 = 87;
                    break;
                }
                case 164: {
                    n14 = 240;
                    break;
                }
                case 165: {
                    n14 = 249;
                    break;
                }
                case 166: {
                    n14 = 33;
                    break;
                }
                case 167: {
                    n14 = 178;
                    break;
                }
                case 168: {
                    n14 = 228;
                    break;
                }
                case 169: {
                    n14 = 233;
                    break;
                }
                case 170: {
                    n14 = 113;
                    break;
                }
                case 171: {
                    n14 = 145;
                    break;
                }
                case 172: {
                    n14 = 224;
                    break;
                }
                case 173: {
                    n14 = 34;
                    break;
                }
                case 174: {
                    n14 = 135;
                    break;
                }
                case 175: {
                    n14 = 75;
                    break;
                }
                case 176: {
                    n14 = 110;
                    break;
                }
                case 177: {
                    n14 = 173;
                    break;
                }
                case 178: {
                    n14 = 194;
                    break;
                }
                case 179: {
                    n14 = 236;
                    break;
                }
                case 180: {
                    n14 = 65;
                    break;
                }
                case 181: {
                    n14 = 199;
                    break;
                }
                case 182: {
                    n14 = 132;
                    break;
                }
                case 183: {
                    n14 = 23;
                    break;
                }
                case 184: {
                    n14 = 225;
                    break;
                }
                case 185: {
                    n14 = 193;
                    break;
                }
                case 186: {
                    n14 = 82;
                    break;
                }
                case 187: {
                    n14 = 72;
                    break;
                }
                case 188: {
                    n14 = 127;
                    break;
                }
                case 189: {
                    n14 = 8;
                    break;
                }
                case 190: {
                    n14 = 56;
                    break;
                }
                case 191: {
                    n14 = 242;
                    break;
                }
                case 192: {
                    n14 = 39;
                    break;
                }
                case 193: {
                    n14 = 246;
                    break;
                }
                case 194: {
                    n14 = 73;
                    break;
                }
                case 195: {
                    n14 = 61;
                    break;
                }
                case 196: {
                    n14 = 30;
                    break;
                }
                case 197: {
                    n14 = 26;
                    break;
                }
                case 198: {
                    n14 = 146;
                    break;
                }
                case 199: {
                    n14 = 85;
                    break;
                }
                case 200: {
                    n14 = 243;
                    break;
                }
                case 201: {
                    n14 = 140;
                    break;
                }
                case 202: {
                    n14 = 9;
                    break;
                }
                case 203: {
                    n14 = 101;
                    break;
                }
                case 204: {
                    n14 = 234;
                    break;
                }
                case 205: {
                    n14 = 174;
                    break;
                }
                case 206: {
                    n14 = 91;
                    break;
                }
                case 207: {
                    n14 = 147;
                    break;
                }
                case 208: {
                    n14 = 182;
                    break;
                }
                case 209: {
                    n14 = 102;
                    break;
                }
                case 210: {
                    n14 = 125;
                    break;
                }
                case 211: {
                    n14 = 13;
                    break;
                }
                case 212: {
                    n14 = 235;
                    break;
                }
                case 213: {
                    n14 = 180;
                    break;
                }
                case 214: {
                    n14 = 83;
                    break;
                }
                case 215: {
                    n14 = 42;
                    break;
                }
                case 216: {
                    n14 = 16;
                    break;
                }
                case 217: {
                    n14 = 212;
                    break;
                }
                case 218: {
                    n14 = 81;
                    break;
                }
                case 219: {
                    n14 = 241;
                    break;
                }
                case 220: {
                    n14 = 43;
                    break;
                }
                case 221: {
                    n14 = 48;
                    break;
                }
                case 222: {
                    n14 = 191;
                    break;
                }
                case 223: {
                    n14 = 89;
                    break;
                }
                case 224: {
                    n14 = 121;
                    break;
                }
                case 225: {
                    n14 = 169;
                    break;
                }
                case 226: {
                    n14 = 47;
                    break;
                }
                case 227: {
                    n14 = 22;
                    break;
                }
                case 228: {
                    n14 = 29;
                    break;
                }
                case 229: {
                    n14 = 160;
                    break;
                }
                case 230: {
                    n14 = 159;
                    break;
                }
                case 231: {
                    n14 = 152;
                    break;
                }
                case 232: {
                    n14 = 126;
                    break;
                }
                case 233: {
                    n14 = 12;
                    break;
                }
                case 234: {
                    n14 = 100;
                    break;
                }
                case 235: {
                    n14 = 108;
                    break;
                }
                case 236: {
                    n14 = 67;
                    break;
                }
                case 237: {
                    n14 = 28;
                    break;
                }
                case 238: {
                    n14 = 163;
                    break;
                }
                case 239: {
                    n14 = 88;
                    break;
                }
                case 240: {
                    n14 = 239;
                    break;
                }
                case 241: {
                    n14 = 92;
                    break;
                }
                case 242: {
                    n14 = 19;
                    break;
                }
                case 243: {
                    n14 = 117;
                    break;
                }
                case 244: {
                    n14 = 2;
                    break;
                }
                case 245: {
                    n14 = 207;
                    break;
                }
                case 246: {
                    n14 = 94;
                    break;
                }
                case 247: {
                    n14 = 109;
                    break;
                }
                case 248: {
                    n14 = 150;
                    break;
                }
                case 249: {
                    n14 = 50;
                    break;
                }
                case 250: {
                    n14 = 211;
                    break;
                }
                case 251: {
                    n14 = 104;
                    break;
                }
                case 252: {
                    n14 = 252;
                    break;
                }
                case 253: {
                    n14 = 187;
                    break;
                }
                case 254: {
                    n14 = 216;
                    break;
                }
                default: {
                    n14 = 237;
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
            RI.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

