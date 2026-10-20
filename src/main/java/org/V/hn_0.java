/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.EnumSet;
import java.util.Map;
import org.D;
import org.F.c;
import org.I;
import org.P;
import org.U;
import org.Y;
import org.b_0;
import org.f;
import org.v.N9;
import org.v.RD;
import org.v.RG;
import org.v._E;
import org.v.fK;
import org.v.f_0;
import org.v.fu_0;
import org.v.hG;
import org.v.hO;
import org.v.hc_0;
import org.v.nt_0;
import org.v.rs_0;

/*
 * Renamed from org.v.hn
 */
public class hn_0
extends f
implements D {
    private static final Class[] X;
    @c
    private Y R;
    private final hO r = new hO();
    private String[] S = new String[0];
    private int j = -1;
    private String Z;
    @c
    private Class P;
    private Class[] s;
    @c
    private Class h;
    private static final String[] b;
    private static final String[] c;
    private static final long d;

    public hn_0(String string) throws b_0 {
        this.Z = hn_0.a(-21408, -22790);
        this.s = X;
        this.D(string);
    }

    public hn_0(@c String string, InputStream inputStream) throws b_0, IOException {
        this.Z = hn_0.a(-21408, -22790);
        this.s = X;
        this.f(string, inputStream);
    }

    public hn_0(@c String string, Reader reader) throws b_0, IOException {
        this.Z = hn_0.a(-21408, -22790);
        this.s = X;
        this.Y(string, reader);
    }

    public hn_0(hc_0 hc_02, @c ClassLoader classLoader) throws b_0, IOException {
        this.Z = hn_0.a(-21405, 18238);
        this.s = X;
        this.w(classLoader);
        this.S(hc_02);
    }

    public hn_0(hc_0 hc_02, @c Class clazz, Class[] classArray, @c ClassLoader classLoader) throws b_0, IOException {
        this.Z = hn_0.a(-21408, -22790);
        this.s = X;
        this.Q(clazz);
        this.P(classArray);
        this.w(classLoader);
        this.S(hc_02);
    }

    public hn_0(hc_0 hc_02, String string, @c Class clazz, Class[] classArray, @c ClassLoader classLoader) throws b_0, IOException {
        this.Z = hn_0.a(-21408, -22790);
        this.s = X;
        this.t(string);
        this.Q(clazz);
        this.P(classArray);
        this.w(classLoader);
        this.S(hc_02);
    }

    public hn_0() {
        this.Z = hn_0.a(-21408, -22790);
        this.s = X;
    }

    @Override
    public void P(String[] stringArray) {
        this.S = (String[])stringArray.clone();
    }

    @Override
    public String[] i() {
        return (String[])this.S.clone();
    }

    @Override
    public void t(String string) {
        this.Z = string;
    }

    @Override
    public void Q(@c Class clazz) {
        this.P = clazz;
    }

    @Override
    public void Z(@c Class clazz) {
        this.Q(clazz);
    }

    @Override
    public void P(Class[] classArray) {
        this.s = classArray;
    }

    @Override
    public void Q(Class[] classArray) {
        this.P(classArray);
    }

    @Override
    public void w(@c ClassLoader classLoader) {
        this.r.C(classLoader);
    }

    @Override
    public void N(boolean bl, boolean bl2, boolean bl3) {
        this.r.I(bl, bl2, bl3);
    }

    @Override
    public void n(int n10) {
        this.r.n(n10);
        this.j = n10;
    }

    @Override
    public void v(int n10) {
        this.r.v(n10);
    }

    @Override
    public void q(@c U u10) {
        this.r.N(u10);
    }

    @Override
    public void t(@c Y y2) {
        this.r.q(y2);
        this.R = y2;
    }

    public EnumSet z() {
        return this.r.A();
    }

    public hn_0 p(EnumSet enumSet) {
        this.r.C(enumSet);
        return this;
    }

    @Override
    public final void Y(@c String string, Reader reader) throws b_0, IOException {
        this.S(new hc_0(string, reader));
    }

    public void S(hc_0 hc_02) throws b_0, IOException {
        block4: {
            hG hG2 = new hG(hc_02);
            String[] stringArray = RG.C();
            hG2.Q(this.j);
            fK[] fKArray = this.q(hG2);
            RD rD = new RD(hc_02.F(), fKArray);
            String[] stringArray2 = stringArray;
            _E _E2 = this.X(hc_02.m(), rD);
            while (!hG2.d(f_0.END_OF_INPUT)) {
                try {
                    hG2.j(_E2);
                    if (stringArray2 != null) {
                        if (stringArray2 != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (b_0 b_02) {
                    throw hn_0.a(b_02);
                }
            }
            this.o(rD);
        }
    }

    void o(RD rD) throws b_0 {
        Class<?> clazz;
        this.r.T(rD);
        try {
            clazz = this.r.Y().loadClass(this.Z);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new P(hn_0.a(-21402, 29328) + this.Z + "'", classNotFoundException);
        }
        this.h = clazz;
    }

    @Override
    public Class t() {
        return this.d();
    }

    @Override
    public Map Q() {
        return this.r.Q();
    }

    /*
     * Exception decompiling
     */
    final fK[] q(@c hG var1_1) throws b_0, IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    protected _E X(I i2, RD rD) {
        String string;
        block5: {
            int n10;
            block4: {
                string = this.Z;
                String[] stringArray = RG.C();
                n10 = string.lastIndexOf((int)d);
                try {
                    try {
                        if (stringArray == null) break block4;
                        if (n10 == -1) break block5;
                    }
                    catch (P p2) {
                        throw hn_0.a(p2);
                    }
                    rD.g(new rs_0(i2, string.substring(0, n10)));
                }
                catch (P p3) {
                    throw hn_0.a(p3);
                }
            }
            string = string.substring(n10 + 1);
        }
        _E _E2 = new _E(i2, null, new fu_0[]{new N9(hn_0.a(-21407, -1073), i2)}, string, null, this.k(i2, this.P), this.r.J(i2, this.s));
        rD.Y(_E2);
        return _E2;
    }

    @c
    protected nt_0 k(I i2, @c Class clazz) {
        return this.r.D(i2, clazz);
    }

    protected nt_0 N(I i2, Class clazz) {
        return this.r.S(i2, clazz);
    }

    public nt_0[] m(I i2, Class[] classArray) {
        return this.r.J(i2, classArray);
    }

    private Class d() {
        block5: {
            Class clazz;
            block4: {
                String[] stringArray = RG.C();
                try {
                    try {
                        clazz = this.h;
                        if (stringArray == null) break block4;
                        if (clazz == null) break block5;
                    }
                    catch (P p2) {
                        throw hn_0.a(p2);
                    }
                    clazz = this.h;
                }
                catch (P p3) {
                    throw hn_0.a(p3);
                }
            }
            return clazz;
        }
        throw new IllegalStateException(hn_0.a(-21401, 3161));
    }

    @Override
    public Object c(Reader reader) throws b_0, IOException {
        this.f(reader);
        try {
            return this.t().newInstance();
        }
        catch (InstantiationException instantiationException) {
            b_0 b_02 = new b_0(hn_0.a(-21403, -7339), null);
            b_02.initCause(instantiationException);
            throw b_02;
        }
        catch (IllegalAccessException illegalAccessException) {
            b_0 b_03 = new b_0(hn_0.a(-21404, 16817), null);
            b_03.initCause(illegalAccessException);
            throw b_03;
        }
    }

    @Deprecated
    public static Object z(hc_0 hc_02, @c Class clazz, @c ClassLoader classLoader) throws b_0, IOException {
        Class[] classArray;
        Class clazz2;
        String string;
        hc_0 hc_03;
        block18: {
            int n10;
            block17: {
                block16: {
                    Class clazz3;
                    String[] stringArray;
                    block15: {
                        block14: {
                            block13: {
                                block12: {
                                    stringArray = RG.C();
                                    try {
                                        hc_03 = hc_02;
                                        string = hn_0.a(-21408, -22790);
                                        clazz2 = clazz;
                                        if (stringArray == null) break block12;
                                        if (clazz2 == null) break block13;
                                    }
                                    catch (b_0 b_02) {
                                        throw hn_0.a(b_02);
                                    }
                                    clazz2 = clazz;
                                }
                                try {
                                    try {
                                        if (stringArray == null) break block14;
                                        if (clazz2.isInterface()) break block13;
                                    }
                                    catch (b_0 b_03) {
                                        throw hn_0.a(b_03);
                                    }
                                    clazz2 = clazz;
                                    break block14;
                                }
                                catch (b_0 b_04) {
                                    throw hn_0.a(b_04);
                                }
                            }
                            clazz2 = null;
                        }
                        try {
                            clazz3 = clazz;
                            if (stringArray == null) break block15;
                            if (clazz3 == null) break block16;
                        }
                        catch (b_0 b_05) {
                            throw hn_0.a(b_05);
                        }
                        clazz3 = clazz;
                    }
                    try {
                        try {
                            n10 = clazz3.isInterface() ? 1 : 0;
                            if (stringArray == null) break block17;
                            if (n10 == 0) break block16;
                        }
                        catch (b_0 b_06) {
                            throw hn_0.a(b_06);
                        }
                        Class[] classArray2 = new Class[1];
                        classArray = classArray2;
                        classArray2[0] = clazz;
                        break block18;
                    }
                    catch (b_0 b_07) {
                        throw hn_0.a(b_07);
                    }
                }
                n10 = 0;
            }
            classArray = new Class[n10];
        }
        return hn_0.Y(hc_03, string, clazz2, classArray, classLoader);
    }

    @Deprecated
    public static Object Y(hc_0 hc_02, String string, @c Class clazz, Class[] classArray, @c ClassLoader classLoader) throws b_0, IOException {
        hn_0 hn_02 = new hn_0();
        hn_02.t(string);
        hn_02.Q(clazz);
        hn_02.P(classArray);
        hn_02.w(classLoader);
        hn_02.S(hc_02);
        Class clazz2 = hn_02.t();
        try {
            return clazz2.newInstance();
        }
        catch (InstantiationException instantiationException) {
            throw new b_0(instantiationException.getMessage(), null);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new P(illegalAccessException.toString(), illegalAccessException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[8];
                    var5_1 = 0;
                    var4_2 = "\u008e`\u0006\u00130B\u00ebl{\u0006\u0089\u00c29\u00adH\u00c7\u0002at=\u00fb}\u00f8\u00b0\u00d6\u00da\u00cf\u00fcW\u009e\u00c2\u00e6~\u00f2\u00aa\u00f9\u00b3\u0002T\u0083WT\u0088_G\u00a4=\u00c7&\u00c4p+2\u00aa\\\u0091\u00ccaL\u0010\u00a2\u0019\u00e9\u0011T/\u008d\u0012\u0081\u00a0\u0002\u00b3];E`'\u00e8\u00a7o\u00dcp\b\u00dfw3\u00b3\u00dfy\u0099\u00dbsg32r\u00e8\u0081\u0018I\u00baef\u00f4\u0096\u00e8\u00b8\u00b8\u001b\u00c3\u000b!u]$\u00e7\u00b5\u00a4\u00e4\u00fe\u00f9\u00e1\u00fe*\u00df\u009d\u00a9{h\u00daK\u00a6\u00fd\u00d5\u00b3\u00ce\u00a3\u008f\u00f5L\u000e\u00f2:gaS\u008f\u0004B%\u009a},th2\u0011\nj\"\u007f,\u00f0\u00f0\u00f7\u0016\u0080\u00d1\u00d4!\u00be\u0006\u00bd\u0007\u00ce\u00d0\u00af(Y\u00ca\u00b2A\u0083-X@\u0081\u00ea\u00cf\u00ee\u00fc\u0011{\u00d1";
                    var6_3 = "\u008e`\u0006\u00130B\u00ebl{\u0006\u0089\u00c29\u00adH\u00c7\u0002at=\u00fb}\u00f8\u00b0\u00d6\u00da\u00cf\u00fcW\u009e\u00c2\u00e6~\u00f2\u00aa\u00f9\u00b3\u0002T\u0083WT\u0088_G\u00a4=\u00c7&\u00c4p+2\u00aa\\\u0091\u00ccaL\u0010\u00a2\u0019\u00e9\u0011T/\u008d\u0012\u0081\u00a0\u0002\u00b3];E`'\u00e8\u00a7o\u00dcp\b\u00dfw3\u00b3\u00dfy\u0099\u00dbsg32r\u00e8\u0081\u0018I\u00baef\u00f4\u0096\u00e8\u00b8\u00b8\u001b\u00c3\u000b!u]$\u00e7\u00b5\u00a4\u00e4\u00fe\u00f9\u00e1\u00fe*\u00df\u009d\u00a9{h\u00daK\u00a6\u00fd\u00d5\u00b3\u00ce\u00a3\u008f\u00f5L\u000e\u00f2:gaS\u008f\u0004B%\u009a},th2\u0011\nj\"\u007f,\u00f0\u00f0\u00f7\u0016\u0080\u00d1\u00d4!\u00be\u0006\u00bd\u0007\u00ce\u00d0\u00af(Y\u00ca\u00b2A\u0083-X@\u0081\u00ea\u00cf\u00ee\u00fc\u0011{\u00d1".length();
                    var3_4 = 2;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 115;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "X-'$g\\\u00b0\u0019L\u00a8\u001dXi\u0088\u0097l\u00e3\u00d3\u008b1~P\u00act<\u00a1\u00c7\u00ff\u00e1\u00bb\u00b1/\u00adL%+\u00bbL\u0000[@\u00e8\u001a`\u00bc^\u0001\u0001!\u00d9\u009a\u000f\u00fd\u00da`|\"\u0003\u00fc\u00ad\f\u008d\u00f6\u00e6c\u00f0\u00f7\u0016\u00ba.\u00e0\u00d3\u0089\u0001\u0089\u00a0:\u0080V\u00df_O\u0007\u0010\u00ba\u00fd\u00c1\f\u00ae\u00ab=";
                        var6_3 = "X-'$g\\\u00b0\u0019L\u00a8\u001dXi\u0088\u0097l\u00e3\u00d3\u008b1~P\u00act<\u00a1\u00c7\u00ff\u00e1\u00bb\u00b1/\u00adL%+\u00bbL\u0000[@\u00e8\u001a`\u00bc^\u0001\u0001!\u00d9\u009a\u000f\u00fd\u00da`|\"\u0003\u00fc\u00ad\f\u008d\u00f6\u00e6c\u00f0\u00f7\u0016\u00ba.\u00e0\u00d3\u0089\u0001\u0089\u00a0:\u0080V\u00df_O\u0007\u0010\u00ba\u00fd\u00c1\f\u00ae\u00ab=".length();
                        var3_4 = 56;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 81;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 2;
                                break;
                            }
                            case 1: {
                                v15 = 8;
                                break;
                            }
                            case 2: {
                                v15 = 97;
                                break;
                            }
                            case 3: {
                                v15 = 70;
                                break;
                            }
                            case 4: {
                                v15 = 82;
                                break;
                            }
                            case 5: {
                                v15 = 81;
                                break;
                            }
                            default: {
                                v15 = 44;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
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
                } while (v10 > var8_6);
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
            hn_0.b = var7;
            hn_0.c = new String[8];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 5575544975762966738L;
        ** while (true)
        hn_0.d = -2986097232139204356L ^ var0_7;
        hn_0.X = new Class[0];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFAC60) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 208;
                    break;
                }
                case 1: {
                    n14 = 42;
                    break;
                }
                case 2: {
                    n14 = 67;
                    break;
                }
                case 3: {
                    n14 = 61;
                    break;
                }
                case 4: {
                    n14 = 227;
                    break;
                }
                case 5: {
                    n14 = 112;
                    break;
                }
                case 6: {
                    n14 = 137;
                    break;
                }
                case 7: {
                    n14 = 201;
                    break;
                }
                case 8: {
                    n14 = 130;
                    break;
                }
                case 9: {
                    n14 = 8;
                    break;
                }
                case 10: {
                    n14 = 190;
                    break;
                }
                case 11: {
                    n14 = 56;
                    break;
                }
                case 12: {
                    n14 = 19;
                    break;
                }
                case 13: {
                    n14 = 223;
                    break;
                }
                case 14: {
                    n14 = 237;
                    break;
                }
                case 15: {
                    n14 = 73;
                    break;
                }
                case 16: {
                    n14 = 251;
                    break;
                }
                case 17: {
                    n14 = 68;
                    break;
                }
                case 18: {
                    n14 = 0;
                    break;
                }
                case 19: {
                    n14 = 202;
                    break;
                }
                case 20: {
                    n14 = 252;
                    break;
                }
                case 21: {
                    n14 = 144;
                    break;
                }
                case 22: {
                    n14 = 79;
                    break;
                }
                case 23: {
                    n14 = 188;
                    break;
                }
                case 24: {
                    n14 = 209;
                    break;
                }
                case 25: {
                    n14 = 225;
                    break;
                }
                case 26: {
                    n14 = 90;
                    break;
                }
                case 27: {
                    n14 = 28;
                    break;
                }
                case 28: {
                    n14 = 85;
                    break;
                }
                case 29: {
                    n14 = 166;
                    break;
                }
                case 30: {
                    n14 = 121;
                    break;
                }
                case 31: {
                    n14 = 29;
                    break;
                }
                case 32: {
                    n14 = 183;
                    break;
                }
                case 33: {
                    n14 = 46;
                    break;
                }
                case 34: {
                    n14 = 95;
                    break;
                }
                case 35: {
                    n14 = 230;
                    break;
                }
                case 36: {
                    n14 = 108;
                    break;
                }
                case 37: {
                    n14 = 198;
                    break;
                }
                case 38: {
                    n14 = 133;
                    break;
                }
                case 39: {
                    n14 = 205;
                    break;
                }
                case 40: {
                    n14 = 113;
                    break;
                }
                case 41: {
                    n14 = 173;
                    break;
                }
                case 42: {
                    n14 = 247;
                    break;
                }
                case 43: {
                    n14 = 214;
                    break;
                }
                case 44: {
                    n14 = 117;
                    break;
                }
                case 45: {
                    n14 = 139;
                    break;
                }
                case 46: {
                    n14 = 82;
                    break;
                }
                case 47: {
                    n14 = 9;
                    break;
                }
                case 48: {
                    n14 = 59;
                    break;
                }
                case 49: {
                    n14 = 62;
                    break;
                }
                case 50: {
                    n14 = 69;
                    break;
                }
                case 51: {
                    n14 = 192;
                    break;
                }
                case 52: {
                    n14 = 1;
                    break;
                }
                case 53: {
                    n14 = 34;
                    break;
                }
                case 54: {
                    n14 = 229;
                    break;
                }
                case 55: {
                    n14 = 31;
                    break;
                }
                case 56: {
                    n14 = 154;
                    break;
                }
                case 57: {
                    n14 = 143;
                    break;
                }
                case 58: {
                    n14 = 94;
                    break;
                }
                case 59: {
                    n14 = 217;
                    break;
                }
                case 60: {
                    n14 = 5;
                    break;
                }
                case 61: {
                    n14 = 220;
                    break;
                }
                case 62: {
                    n14 = 148;
                    break;
                }
                case 63: {
                    n14 = 254;
                    break;
                }
                case 64: {
                    n14 = 36;
                    break;
                }
                case 65: {
                    n14 = 72;
                    break;
                }
                case 66: {
                    n14 = 248;
                    break;
                }
                case 67: {
                    n14 = 124;
                    break;
                }
                case 68: {
                    n14 = 168;
                    break;
                }
                case 69: {
                    n14 = 41;
                    break;
                }
                case 70: {
                    n14 = 2;
                    break;
                }
                case 71: {
                    n14 = 244;
                    break;
                }
                case 72: {
                    n14 = 63;
                    break;
                }
                case 73: {
                    n14 = 86;
                    break;
                }
                case 74: {
                    n14 = 186;
                    break;
                }
                case 75: {
                    n14 = 218;
                    break;
                }
                case 76: {
                    n14 = 204;
                    break;
                }
                case 77: {
                    n14 = 178;
                    break;
                }
                case 78: {
                    n14 = 17;
                    break;
                }
                case 79: {
                    n14 = 84;
                    break;
                }
                case 80: {
                    n14 = 60;
                    break;
                }
                case 81: {
                    n14 = 76;
                    break;
                }
                case 82: {
                    n14 = 177;
                    break;
                }
                case 83: {
                    n14 = 129;
                    break;
                }
                case 84: {
                    n14 = 92;
                    break;
                }
                case 85: {
                    n14 = 3;
                    break;
                }
                case 86: {
                    n14 = 146;
                    break;
                }
                case 87: {
                    n14 = 87;
                    break;
                }
                case 88: {
                    n14 = 169;
                    break;
                }
                case 89: {
                    n14 = 49;
                    break;
                }
                case 90: {
                    n14 = 25;
                    break;
                }
                case 91: {
                    n14 = 125;
                    break;
                }
                case 92: {
                    n14 = 149;
                    break;
                }
                case 93: {
                    n14 = 30;
                    break;
                }
                case 94: {
                    n14 = 123;
                    break;
                }
                case 95: {
                    n14 = 91;
                    break;
                }
                case 96: {
                    n14 = 158;
                    break;
                }
                case 97: {
                    n14 = 81;
                    break;
                }
                case 98: {
                    n14 = 189;
                    break;
                }
                case 99: {
                    n14 = 232;
                    break;
                }
                case 100: {
                    n14 = 54;
                    break;
                }
                case 101: {
                    n14 = 15;
                    break;
                }
                case 102: {
                    n14 = 77;
                    break;
                }
                case 103: {
                    n14 = 114;
                    break;
                }
                case 104: {
                    n14 = 99;
                    break;
                }
                case 105: {
                    n14 = 203;
                    break;
                }
                case 106: {
                    n14 = 106;
                    break;
                }
                case 107: {
                    n14 = 21;
                    break;
                }
                case 108: {
                    n14 = 18;
                    break;
                }
                case 109: {
                    n14 = 175;
                    break;
                }
                case 110: {
                    n14 = 253;
                    break;
                }
                case 111: {
                    n14 = 187;
                    break;
                }
                case 112: {
                    n14 = 101;
                    break;
                }
                case 113: {
                    n14 = 246;
                    break;
                }
                case 114: {
                    n14 = 184;
                    break;
                }
                case 115: {
                    n14 = 200;
                    break;
                }
                case 116: {
                    n14 = 142;
                    break;
                }
                case 117: {
                    n14 = 127;
                    break;
                }
                case 118: {
                    n14 = 157;
                    break;
                }
                case 119: {
                    n14 = 126;
                    break;
                }
                case 120: {
                    n14 = 213;
                    break;
                }
                case 121: {
                    n14 = 27;
                    break;
                }
                case 122: {
                    n14 = 215;
                    break;
                }
                case 123: {
                    n14 = 51;
                    break;
                }
                case 124: {
                    n14 = 194;
                    break;
                }
                case 125: {
                    n14 = 164;
                    break;
                }
                case 126: {
                    n14 = 136;
                    break;
                }
                case 127: {
                    n14 = 210;
                    break;
                }
                case 128: {
                    n14 = 55;
                    break;
                }
                case 129: {
                    n14 = 219;
                    break;
                }
                case 130: {
                    n14 = 13;
                    break;
                }
                case 131: {
                    n14 = 224;
                    break;
                }
                case 132: {
                    n14 = 107;
                    break;
                }
                case 133: {
                    n14 = 179;
                    break;
                }
                case 134: {
                    n14 = 7;
                    break;
                }
                case 135: {
                    n14 = 33;
                    break;
                }
                case 136: {
                    n14 = 96;
                    break;
                }
                case 137: {
                    n14 = 228;
                    break;
                }
                case 138: {
                    n14 = 211;
                    break;
                }
                case 139: {
                    n14 = 4;
                    break;
                }
                case 140: {
                    n14 = 97;
                    break;
                }
                case 141: {
                    n14 = 122;
                    break;
                }
                case 142: {
                    n14 = 105;
                    break;
                }
                case 143: {
                    n14 = 239;
                    break;
                }
                case 144: {
                    n14 = 150;
                    break;
                }
                case 145: {
                    n14 = 50;
                    break;
                }
                case 146: {
                    n14 = 11;
                    break;
                }
                case 147: {
                    n14 = 250;
                    break;
                }
                case 148: {
                    n14 = 170;
                    break;
                }
                case 149: {
                    n14 = 44;
                    break;
                }
                case 150: {
                    n14 = 231;
                    break;
                }
                case 151: {
                    n14 = 100;
                    break;
                }
                case 152: {
                    n14 = 165;
                    break;
                }
                case 153: {
                    n14 = 71;
                    break;
                }
                case 154: {
                    n14 = 199;
                    break;
                }
                case 155: {
                    n14 = 172;
                    break;
                }
                case 156: {
                    n14 = 145;
                    break;
                }
                case 157: {
                    n14 = 163;
                    break;
                }
                case 158: {
                    n14 = 134;
                    break;
                }
                case 159: {
                    n14 = 38;
                    break;
                }
                case 160: {
                    n14 = 135;
                    break;
                }
                case 161: {
                    n14 = 238;
                    break;
                }
                case 162: {
                    n14 = 151;
                    break;
                }
                case 163: {
                    n14 = 249;
                    break;
                }
                case 164: {
                    n14 = 23;
                    break;
                }
                case 165: {
                    n14 = 131;
                    break;
                }
                case 166: {
                    n14 = 212;
                    break;
                }
                case 167: {
                    n14 = 191;
                    break;
                }
                case 168: {
                    n14 = 160;
                    break;
                }
                case 169: {
                    n14 = 116;
                    break;
                }
                case 170: {
                    n14 = 140;
                    break;
                }
                case 171: {
                    n14 = 222;
                    break;
                }
                case 172: {
                    n14 = 83;
                    break;
                }
                case 173: {
                    n14 = 74;
                    break;
                }
                case 174: {
                    n14 = 162;
                    break;
                }
                case 175: {
                    n14 = 235;
                    break;
                }
                case 176: {
                    n14 = 53;
                    break;
                }
                case 177: {
                    n14 = 109;
                    break;
                }
                case 178: {
                    n14 = 80;
                    break;
                }
                case 179: {
                    n14 = 26;
                    break;
                }
                case 180: {
                    n14 = 58;
                    break;
                }
                case 181: {
                    n14 = 93;
                    break;
                }
                case 182: {
                    n14 = 156;
                    break;
                }
                case 183: {
                    n14 = 221;
                    break;
                }
                case 184: {
                    n14 = 110;
                    break;
                }
                case 185: {
                    n14 = 66;
                    break;
                }
                case 186: {
                    n14 = 153;
                    break;
                }
                case 187: {
                    n14 = 39;
                    break;
                }
                case 188: {
                    n14 = 102;
                    break;
                }
                case 189: {
                    n14 = 45;
                    break;
                }
                case 190: {
                    n14 = 118;
                    break;
                }
                case 191: {
                    n14 = 119;
                    break;
                }
                case 192: {
                    n14 = 245;
                    break;
                }
                case 193: {
                    n14 = 206;
                    break;
                }
                case 194: {
                    n14 = 70;
                    break;
                }
                case 195: {
                    n14 = 43;
                    break;
                }
                case 196: {
                    n14 = 132;
                    break;
                }
                case 197: {
                    n14 = 181;
                    break;
                }
                case 198: {
                    n14 = 104;
                    break;
                }
                case 199: {
                    n14 = 243;
                    break;
                }
                case 200: {
                    n14 = 57;
                    break;
                }
                case 201: {
                    n14 = 10;
                    break;
                }
                case 202: {
                    n14 = 196;
                    break;
                }
                case 203: {
                    n14 = 22;
                    break;
                }
                case 204: {
                    n14 = 197;
                    break;
                }
                case 205: {
                    n14 = 35;
                    break;
                }
                case 206: {
                    n14 = 120;
                    break;
                }
                case 207: {
                    n14 = 242;
                    break;
                }
                case 208: {
                    n14 = 171;
                    break;
                }
                case 209: {
                    n14 = 147;
                    break;
                }
                case 210: {
                    n14 = 6;
                    break;
                }
                case 211: {
                    n14 = 64;
                    break;
                }
                case 212: {
                    n14 = 111;
                    break;
                }
                case 213: {
                    n14 = 75;
                    break;
                }
                case 214: {
                    n14 = 167;
                    break;
                }
                case 215: {
                    n14 = 180;
                    break;
                }
                case 216: {
                    n14 = 193;
                    break;
                }
                case 217: {
                    n14 = 241;
                    break;
                }
                case 218: {
                    n14 = 20;
                    break;
                }
                case 219: {
                    n14 = 176;
                    break;
                }
                case 220: {
                    n14 = 161;
                    break;
                }
                case 221: {
                    n14 = 115;
                    break;
                }
                case 222: {
                    n14 = 152;
                    break;
                }
                case 223: {
                    n14 = 88;
                    break;
                }
                case 224: {
                    n14 = 47;
                    break;
                }
                case 225: {
                    n14 = 236;
                    break;
                }
                case 226: {
                    n14 = 207;
                    break;
                }
                case 227: {
                    n14 = 52;
                    break;
                }
                case 228: {
                    n14 = 185;
                    break;
                }
                case 229: {
                    n14 = 216;
                    break;
                }
                case 230: {
                    n14 = 155;
                    break;
                }
                case 231: {
                    n14 = 128;
                    break;
                }
                case 232: {
                    n14 = 174;
                    break;
                }
                case 233: {
                    n14 = 16;
                    break;
                }
                case 234: {
                    n14 = 195;
                    break;
                }
                case 235: {
                    n14 = 226;
                    break;
                }
                case 236: {
                    n14 = 182;
                    break;
                }
                case 237: {
                    n14 = 24;
                    break;
                }
                case 238: {
                    n14 = 233;
                    break;
                }
                case 239: {
                    n14 = 14;
                    break;
                }
                case 240: {
                    n14 = 98;
                    break;
                }
                case 241: {
                    n14 = 103;
                    break;
                }
                case 242: {
                    n14 = 40;
                    break;
                }
                case 243: {
                    n14 = 240;
                    break;
                }
                case 244: {
                    n14 = 65;
                    break;
                }
                case 245: {
                    n14 = 12;
                    break;
                }
                case 246: {
                    n14 = 37;
                    break;
                }
                case 247: {
                    n14 = 89;
                    break;
                }
                case 248: {
                    n14 = 138;
                    break;
                }
                case 249: {
                    n14 = 159;
                    break;
                }
                case 250: {
                    n14 = 255;
                    break;
                }
                case 251: {
                    n14 = 141;
                    break;
                }
                case 252: {
                    n14 = 48;
                    break;
                }
                case 253: {
                    n14 = 234;
                    break;
                }
                case 254: {
                    n14 = 32;
                    break;
                }
                default: {
                    n14 = 78;
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
            hn_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

