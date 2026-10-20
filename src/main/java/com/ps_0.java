/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HF;
import com.P2;
import com.P3;
import com.PC;
import com.PI;
import com.hi_0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/*
 * Renamed from com.Ps
 */
public abstract class ps_0
implements Cloneable,
Closeable {
    protected boolean o;
    protected int p = -1;
    protected char D;
    protected HF r;
    private Boolean k;
    protected int K = 0;
    protected boolean w = false;
    private static final long[] f;
    private static final Integer[] g;

    public static ps_0 a(byte[] byArray) {
        return new PC(byArray);
    }

    public static ps_0 l(InputStream inputStream) {
        return new PI(inputStream);
    }

    public static ps_0 m(String string) {
        return new P3(string);
    }

    public static ps_0 g(Reader reader) {
        return new P2(reader);
    }

    public boolean A() {
        return this.w;
    }

    public ps_0 H(boolean bl) {
        this.w = bl;
        return this;
    }

    public HF L() {
        HF hF2;
        block4: {
            block5: {
                String string = hi_0.C();
                try {
                    try {
                        hF2 = this.r;
                        if (string != null) break block4;
                        if (hF2 != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw ps_0.b(hi_02);
                    }
                    this.y();
                }
                catch (hi_0 hi_03) {
                    throw ps_0.b(hi_03);
                }
            }
            hF2 = this.r;
        }
        return hF2;
    }

    abstract void c();

    /*
     * Exception decompiling
     */
    public boolean y() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[DOLOOP]], but top level block is 5[TRYBLOCK]
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

    @Override
    public void close() throws IOException {
    }

    /*
     * Exception decompiling
     */
    private boolean z() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 114[SWITCH]
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

    /*
     * Unable to fully structure code
     */
    protected void B() {
        v0 = hi_0.C();
        this.c();
        var1_1 = v0;
        do lbl-1000:
        // 4 sources

        {
            block17: {
                block15: {
                    block18: {
                        block14: {
                            block16: {
                                if (this.D != ps_0.a(11097, 7979616061877984922L)) break block18;
                                try {
                                    try {
                                        try {
                                            this.c();
                                            v1 = this;
                                            if (var1_1 != null) break block14;
                                            v2 = v1.D;
                                            v3 = ps_0.a(22824, 7284791296221473987L);
                                            if (var1_1 != null) break block15;
                                        }
                                        catch (hi_0 v4) {
                                            throw ps_0.b(v4);
                                        }
                                        if (v2 != v3) break block16;
                                    }
                                    catch (hi_0 v5) {
                                        throw ps_0.b(v5);
                                    }
                                    this.c();
                                    this.c();
                                    this.c();
                                    this.c();
                                    this.c();
                                    if (var1_1 == null) ** GOTO lbl-1000
                                }
                                catch (hi_0 v6) {
                                    throw ps_0.b(v6);
                                }
                            }
                            v1 = this;
                        }
                        v1.c();
                        if (var1_1 == null) ** GOTO lbl-1000
                    }
                    try {
                        v7 = this;
                        if (var1_1 != null) break block17;
                        v2 = v7.D;
                        v3 = ps_0.a(27891, 3773056323076184339L);
                    }
                    catch (hi_0 v8) {
                        throw ps_0.b(v8);
                    }
                }
                try {
                    try {
                        if (v2 == v3) {
                            this.c();
                            if (var1_1 == null) break;
                        }
                    }
                    catch (hi_0 v9) {
                        throw ps_0.b(v9);
                    }
                    v7 = this;
                }
                catch (hi_0 v10) {
                    throw ps_0.b(v10);
                }
            }
            v7.c();
        } while (var1_1 == null);
    }

    protected boolean K() {
        int c2;
        block16: {
            String string = hi_0.C();
            this.c();
            String string2 = string;
            while (!this.o) {
                ps_0 ps_02;
                block21: {
                    char c3;
                    int n10;
                    block17: {
                        block18: {
                            ps_0 ps_03;
                            block19: {
                                block20: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        c2 = this.D;
                                                        if (string2 != null) break block16;
                                                        n10 = ps_0.a(25808, 1600914574462341437L);
                                                        if (string2 != null) break block17;
                                                    }
                                                    catch (hi_0 hi_02) {
                                                        throw ps_0.b(hi_02);
                                                    }
                                                    if (c2 != n10) break block18;
                                                }
                                                catch (hi_0 hi_03) {
                                                    throw ps_0.b(hi_03);
                                                }
                                                this.c();
                                                ps_03 = this;
                                                if (string2 != null) break block19;
                                            }
                                            catch (hi_0 hi_04) {
                                                throw ps_0.b(hi_04);
                                            }
                                            if (ps_03.D != ps_0.a(22729, 2999040263953771808L)) break block20;
                                        }
                                        catch (hi_0 hi_05) {
                                            throw ps_0.b(hi_05);
                                        }
                                        this.c();
                                        this.c();
                                        this.c();
                                        this.c();
                                        this.c();
                                        if (string2 == null) continue;
                                    }
                                    catch (hi_0 hi_06) {
                                        throw ps_0.b(hi_06);
                                    }
                                }
                                ps_03 = this;
                            }
                            ps_03.c();
                            if (string2 == null) continue;
                        }
                        try {
                            ps_02 = this;
                            if (string2 != null) break block21;
                            c3 = ps_02.D;
                            n10 = ps_0.a(11927, 2642998640577649525L);
                        }
                        catch (hi_0 hi_07) {
                            throw ps_0.b(hi_07);
                        }
                    }
                    try {
                        if (c3 == n10) {
                            this.c();
                            return true;
                        }
                    }
                    catch (hi_0 hi_08) {
                        throw ps_0.b(hi_08);
                    }
                    ps_02 = this;
                }
                ps_02.c();
                if (string2 == null) continue;
            }
            c2 = 0;
        }
        return c2 != 0;
    }

    void N() {
        String string = hi_0.C();
        while (ps_0.O(this.D)) {
            this.c();
            if (string == null) continue;
        }
    }

    static final boolean O(char c2) {
        int n10;
        block24: {
            block26: {
                String string = hi_0.C();
                try {
                    block25: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    n10 = c2;
                                                                    if (string != null) break block24;
                                                                    if (n10 == ps_0.a(13248, 4323713100415534648L)) break block25;
                                                                }
                                                                catch (hi_0 hi_02) {
                                                                    throw ps_0.b(hi_02);
                                                                }
                                                                n10 = c2;
                                                                if (string != null) break block24;
                                                            }
                                                            catch (hi_0 hi_03) {
                                                                throw ps_0.b(hi_03);
                                                            }
                                                            if (n10 == ps_0.a(14448, 7268954453945748913L)) break block25;
                                                        }
                                                        catch (hi_0 hi_04) {
                                                            throw ps_0.b(hi_04);
                                                        }
                                                        n10 = c2;
                                                        if (string != null) break block24;
                                                    }
                                                    catch (hi_0 hi_05) {
                                                        throw ps_0.b(hi_05);
                                                    }
                                                    if (n10 == ps_0.a(20132, 7003018534501710683L)) break block25;
                                                }
                                                catch (hi_0 hi_06) {
                                                    throw ps_0.b(hi_06);
                                                }
                                                n10 = c2;
                                                if (string != null) break block24;
                                            }
                                            catch (hi_0 hi_07) {
                                                throw ps_0.b(hi_07);
                                            }
                                            if (n10 == ps_0.a(22537, 4687129983972830700L)) break block25;
                                        }
                                        catch (hi_0 hi_08) {
                                            throw ps_0.b(hi_08);
                                        }
                                        n10 = c2;
                                        if (string != null) break block24;
                                    }
                                    catch (hi_0 hi_09) {
                                        throw ps_0.b(hi_09);
                                    }
                                    if (n10 == ps_0.a(22877, 2606629963833011374L)) break block25;
                                }
                                catch (hi_0 hi_010) {
                                    throw ps_0.b(hi_010);
                                }
                                n10 = c2;
                                if (string != null) break block24;
                            }
                            catch (hi_0 hi_011) {
                                throw ps_0.b(hi_011);
                            }
                            if (n10 != ps_0.a(31887, 5290651545700288875L)) break block26;
                        }
                        catch (hi_0 hi_012) {
                            throw ps_0.b(hi_012);
                        }
                    }
                    n10 = 1;
                    break block24;
                }
                catch (hi_0 hi_013) {
                    throw ps_0.b(hi_013);
                }
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    private static hi_0 b(hi_0 hi_02) {
        return hi_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8897783394961030310L;
                var6_1 = new long[36];
                var3_2 = 0;
                var4_3 = "Wc\u0006\u001e\u0087\u00db\nk\u00be\u0097)\u00e4X}\u00e7\u00f1\u00a9\u0002\u009e\u00c4\u009c\u00f3\u00f6rU\u0000\u00c1\u00a7\u00cfz%\u0097\u00f3\u00b3\u009drF\u0081s\u0089\u00c8\u0013\u00b1\f\u000f4F\u00a1\u00beu\u0097'\u00ff\u00cd\u0011@\u00f5mZQJ\u00d35\u00c5]F$\u007f\u0093&\u0010\u00105\u00bc\u0019O\u00acN\u00f4\u00e3\t\u00ca\u001c\f\u00f1\u000b\u0091\u00f3nd)\u00f8\u0002[\u00b3\u00d2\u0016\u00b21\u00ef\u00c8\n\u00bb\u0018\u0085\"v\u00b4\u0001\u0094\u00cc51S\u0097\u00fe?\u0097\u00ad\u00c7\u001fc;P\u0099}ZU\u000f\u00d8h{\u00ce\"\u0090\u0004c\u00f3\u008fFx\u0097\u00ad\u008d\u00afg\u00c4r\u0018\u0094\u00d9\u00de\u00e7\u00a2\u001f}lP\u0019\u00e8\u0012Mrx\u000e\r\u00e9\r\u0099\u000e\u00f7\u00b7\u009a\u00dcq\n\u00b5\u0002\u00a5\u00c08c\u00c3\\CE\u00a8\u00f1\u0090\u00fe@6\u008a\u00c5v,/\u00ba&\u00b6e\u009e`\u00b1\u00e2\u00cf\u00d3a;\u0091)\u000e>Hm\u00c2\u00f2\u00b4b\u00f4\u00d5\u00fd\u00fa\u00be\u0092!\u00ad\u00fd\u0019v\u0007\u00f0.\u00fb\u001af\u00ba\u0097?\u0007\u00c8\u0010\u0005=\u008e\u0094\u00d8\u00a33\u00de\u00f3\u009e\u00be\u0085\n\u00db\u008a8m\u00f9=8b`i\u0015\u00dcuo-\u00dd?";
                var5_4 = "Wc\u0006\u001e\u0087\u00db\nk\u00be\u0097)\u00e4X}\u00e7\u00f1\u00a9\u0002\u009e\u00c4\u009c\u00f3\u00f6rU\u0000\u00c1\u00a7\u00cfz%\u0097\u00f3\u00b3\u009drF\u0081s\u0089\u00c8\u0013\u00b1\f\u000f4F\u00a1\u00beu\u0097'\u00ff\u00cd\u0011@\u00f5mZQJ\u00d35\u00c5]F$\u007f\u0093&\u0010\u00105\u00bc\u0019O\u00acN\u00f4\u00e3\t\u00ca\u001c\f\u00f1\u000b\u0091\u00f3nd)\u00f8\u0002[\u00b3\u00d2\u0016\u00b21\u00ef\u00c8\n\u00bb\u0018\u0085\"v\u00b4\u0001\u0094\u00cc51S\u0097\u00fe?\u0097\u00ad\u00c7\u001fc;P\u0099}ZU\u000f\u00d8h{\u00ce\"\u0090\u0004c\u00f3\u008fFx\u0097\u00ad\u008d\u00afg\u00c4r\u0018\u0094\u00d9\u00de\u00e7\u00a2\u001f}lP\u0019\u00e8\u0012Mrx\u000e\r\u00e9\r\u0099\u000e\u00f7\u00b7\u009a\u00dcq\n\u00b5\u0002\u00a5\u00c08c\u00c3\\CE\u00a8\u00f1\u0090\u00fe@6\u008a\u00c5v,/\u00ba&\u00b6e\u009e`\u00b1\u00e2\u00cf\u00d3a;\u0091)\u000e>Hm\u00c2\u00f2\u00b4b\u00f4\u00d5\u00fd\u00fa\u00be\u0092!\u00ad\u00fd\u0019v\u0007\u00f0.\u00fb\u001af\u00ba\u0097?\u0007\u00c8\u0010\u0005=\u008e\u0094\u00d8\u00a33\u00de\u00f3\u009e\u00be\u0085\n\u00db\u008a8m\u00f9=8b`i\u0015\u00dcuo-\u00dd?".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00a0\u00a2?Y\u00c2\u00ebq\u001ep9\u00a1\u00b7B\u00f1\u00f74";
                    var5_4 = "\u00a0\u00a2?Y\u00c2\u00ebq\u001ep9\u00a1\u00b7B\u00f1\u00f74".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        ps_0.f = var6_1;
        ps_0.g = new Integer[36];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x35E3;
        if (g[n11] == null) {
            ps_0.g[n11] = (int)(f[n11] ^ l2);
        }
        return g[n11];
    }
}

