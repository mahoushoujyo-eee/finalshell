/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.HI;
import com.P7;
import com.RC;
import com.hi_0;
import com.ks_0;
import com.u7;
import com.yn_2;
import java.io.Closeable;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.df
 */
public class df_2
implements Closeable {
    private final yn_2 e;
    private RC C;
    private transient RC i;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public df_2(Reader reader) {
        this(reader, new ks_0[0]);
    }

    public df_2(Reader reader, ks_0[] ks_0Array) {
        this(new u7(reader));
        ks_0[] ks_0Array2 = ks_0Array;
        int n10 = ks_0Array2.length;
        String string = hi_0.C();
        for (int i2 = 0; i2 < n10; ++i2) {
            ks_0 ks_02 = ks_0Array2[i2];
            this.W(ks_02, true);
            if (string == null) continue;
        }
    }

    public df_2(P7 p7) {
        this(new yn_2(p7));
    }

    public df_2(yn_2 yn_22) {
        this.e = yn_22;
    }

    public void G(TimeZone timeZone) {
        this.e.N.J(timeZone);
    }

    public void V(Locale locale) {
        this.e.N.D(locale);
    }

    public void W(ks_0 ks_02, boolean bl) {
        this.e.i(ks_02, bl);
    }

    public Locale h() {
        return this.e.N.w();
    }

    public TimeZone q() {
        return this.e.N.t();
    }

    public void a() {
        df_2 df_22;
        block25: {
            block22: {
                block23: {
                    df_2 df_23;
                    RC rC;
                    String string;
                    block20: {
                        string = hi_0.C();
                        try {
                            try {
                                block21: {
                                    try {
                                        try {
                                            rC = this.C;
                                            if (string != null) break block20;
                                            if (rC != null) break block21;
                                        }
                                        catch (hi_0 hi_02) {
                                            throw df_2.a(hi_02);
                                        }
                                        this.C = new RC(null, df_2.a(16074, 6738680088542658812L));
                                        if (string == null) break block22;
                                    }
                                    catch (hi_0 hi_03) {
                                        throw df_2.a(hi_03);
                                    }
                                }
                                this.L();
                                df_23 = this;
                                if (string != null) break block23;
                            }
                            catch (hi_0 hi_04) {
                                throw df_2.a(hi_04);
                            }
                            rC = df_23.i;
                        }
                        catch (hi_0 hi_05) {
                            throw df_2.a(hi_05);
                        }
                    }
                    try {
                        block24: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (rC == null) break block24;
                                                df_23 = this;
                                                if (string != null) break block23;
                                            }
                                            catch (hi_0 hi_06) {
                                                throw df_2.a(hi_06);
                                            }
                                            if (df_23.i.K != this.C) break block24;
                                        }
                                        catch (hi_0 hi_07) {
                                            throw df_2.a(hi_07);
                                        }
                                        this.C = this.i;
                                        df_22 = this;
                                        if (string != null) break block25;
                                    }
                                    catch (hi_0 hi_08) {
                                        throw df_2.a(hi_08);
                                    }
                                    if (df_22.C.S == df_2.a(16074, 6738680088542658812L)) break block22;
                                }
                                catch (hi_0 hi_09) {
                                    throw df_2.a(hi_09);
                                }
                                this.C.S = df_2.a(16074, 6738680088542658812L);
                                if (string == null) break block22;
                            }
                            catch (hi_0 hi_010) {
                                throw df_2.a(hi_010);
                            }
                        }
                        df_23 = this;
                    }
                    catch (hi_0 hi_011) {
                        throw df_2.a(hi_011);
                    }
                }
                df_23.C = new RC(this.C, df_2.a(16074, 6738680088542658812L));
            }
            df_22 = this;
        }
        df_22.e.Q(df_2.a(13216, 8914143018644557207L), df_2.a(16414, 7073758786284535355L));
    }

    public void G() {
        this.e.M(df_2.a(8489, 4561076111265554185L));
        this.U();
    }

    public void K() {
        block8: {
            block6: {
                String string = hi_0.C();
                try {
                    df_2 df_22;
                    block7: {
                        try {
                            try {
                                df_22 = this;
                                if (string != null) break block6;
                                if (df_22.C != null) break block7;
                            }
                            catch (hi_0 hi_02) {
                                throw df_2.a(hi_02);
                            }
                            this.C = new RC(null, df_2.a(26701, 2181033325635835488L));
                            if (string == null) break block8;
                        }
                        catch (hi_0 hi_03) {
                            throw df_2.a(hi_03);
                        }
                    }
                    this.L();
                    df_22 = this;
                }
                catch (hi_0 hi_04) {
                    throw df_2.a(hi_04);
                }
            }
            df_22.C = new RC(this.C, df_2.a(14264, 2322034178794473867L));
        }
        this.e.M(df_2.a(405, 6941549716645674934L));
    }

    public void z() {
        this.e.M(df_2.a(15313, 7959610702651246064L));
        this.U();
    }

    /*
     * Exception decompiling
     */
    private void L() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
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
    private void U() {
        block14: {
            block12: {
                block13: {
                    this.i = this.C;
                    this.C = this.C.K;
                    var1_1 = hi_0.C();
                    try {
                        v0 = this.C;
                        if (var1_1 != null) break block12;
                        if (v0 != null) break block13;
                    }
                    catch (hi_0 v1) {
                        throw df_2.a(v1);
                    }
                    return;
                }
                v0 = this.C;
            }
            var2_2 = v0.S;
            var3_3 = -1;
            try {
                v2 = var2_2;
                if (var1_1 != null) break block14;
            }
            catch (hi_0 v3) {
                throw df_2.a(v3);
            }
            {
                ** switch (v2)
            }
lbl-1000:
            // 1 sources

            {
                case 1002: {
                    var3_3 = df_2.a(24505, 8195589133128278427L);
                    if (var1_1 == null) break;
                }
lbl27:
                // 2 sources

                case 1004: {
                    var3_3 = df_2.a(32625, 7468402146301641048L);
                    if (var1_1 == null) break;
                }
lbl30:
                // 2 sources

                case 1001: 
                case 1003: {
                    var3_3 = df_2.a(29877, 7012138120669301406L);
                    break;
                }
            }
lbl33:
            // 4 sources

            v2 = var3_3;
        }
        try {
            if (v2 != -1) {
                this.C.S = var3_3;
            }
        }
        catch (hi_0 v4) {
            throw df_2.a(v4);
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean b() {
        block21: {
            block22: {
                var1_1 = hi_0.C();
                try {
                    try {
                        v0 = this;
                        if (var1_1 != null) break block21;
                        if (v0.C != null) break block22;
                    }
                    catch (hi_0 v1) {
                        throw df_2.a(v1);
                    }
                    throw new hi_0(df_2.a(-14357, -9275));
                }
                catch (hi_0 v2) {
                    throw df_2.a(v2);
                }
            }
            v0 = this;
        }
        var2_2 = v0.e.N.P();
        var3_3 = this.C.S;
        try {
            v3 = var3_3;
            if (var1_1 == null) {
            }
            ** GOTO lbl28
        }
        catch (hi_0 v4) {
            throw df_2.a(v4);
        }
        {
            ** switch (v3)
        }
lbl-1000:
        // 1 sources

        {
            case 1004: 
            case 1005: {
                v3 = var2_2;
lbl28:
                // 2 sources

                try {
                    try {
                        if (var1_1 != null) ** GOTO lbl41
                        if (v3 != df_2.a(29121, 9036493613734465511L)) {
                        }
                        ** GOTO lbl40
                    }
                    catch (hi_0 v5) {
                        throw df_2.a(v5);
                    }
                    v3 = 1;
                    ** GOTO lbl41
                }
                catch (hi_0 v6) {
                    throw df_2.a(v6);
                }
lbl40:
                // 1 sources

                v3 = 0;
lbl41:
                // 3 sources

                return (boolean)v3;
            }
lbl42:
            // 1 sources

            case 1001: 
            case 1003: {
                try {
                    try {
                        v7 = var2_2;
                        if (var1_1 != null) ** GOTO lbl57
                        if (v7 != df_2.a(22818, 2619316412001691404L)) {
                        }
                        ** GOTO lbl56
                    }
                    catch (hi_0 v8) {
                        throw df_2.a(v8);
                    }
                    v7 = 1;
                    ** GOTO lbl57
                }
                catch (hi_0 v9) {
                    throw df_2.a(v9);
                }
lbl56:
                // 1 sources

                v7 = 0;
lbl57:
                // 3 sources

                return (boolean)v7;
            }
        }
lbl58:
        // 1 sources

        throw new hi_0(df_2.a(-14359, 27408) + var3_3);
    }

    public int X() {
        return this.e.N.P();
    }

    @Override
    public void close() {
        this.e.close();
    }

    /*
     * Unable to fully structure code
     */
    public Integer S() {
        block6: {
            block5: {
                var1_1 = hi_0.C();
                try {
                    v0 = this.C;
                    if (var1_1 != null) break block5;
                    if (v0 == null) {
                    }
                    ** GOTO lbl13
                }
                catch (hi_0 v1) {
                    throw df_2.a(v1);
                }
                var2_2 = this.e.M();
                try {
                    if (var1_1 == null) break block6;
lbl13:
                    // 2 sources

                    this.R();
                    v0 = this.e.M();
                }
                catch (hi_0 v2) {
                    throw df_2.a(v2);
                }
            }
            var2_2 = v0;
            this.h();
        }
        return B8.Y(var2_2);
    }

    /*
     * Unable to fully structure code
     */
    public Long o() {
        block6: {
            block5: {
                var1_1 = hi_0.C();
                try {
                    v0 = this.C;
                    if (var1_1 != null) break block5;
                    if (v0 == null) {
                    }
                    ** GOTO lbl13
                }
                catch (hi_0 v1) {
                    throw df_2.a(v1);
                }
                var2_2 = this.e.M();
                try {
                    if (var1_1 == null) break block6;
lbl13:
                    // 2 sources

                    this.R();
                    v0 = this.e.M();
                }
                catch (hi_0 v2) {
                    throw df_2.a(v2);
                }
            }
            var2_2 = v0;
            this.h();
        }
        return B8.s(var2_2);
    }

    /*
     * Unable to fully structure code
     */
    public String c() {
        block16: {
            block18: {
                block17: {
                    block15: {
                        var1_1 = hi_0.C();
                        try {
                            v0 = this;
                            if (var1_1 != null) break block15;
                            if (v0.C == null) {
                            }
                            ** GOTO lbl13
                        }
                        catch (hi_0 v1) {
                            throw df_2.a(v1);
                        }
                        var2_2 = this.e.M();
                        try {
                            if (var1_1 == null) break block16;
lbl13:
                            // 2 sources

                            this.R();
                            v0 = this;
                        }
                        catch (hi_0 v2) {
                            throw df_2.a(v2);
                        }
                    }
                    var3_3 = v0.e.N;
                    try {
                        try {
                            try {
                                v3 = this.C;
                                if (var1_1 != null) break block17;
                                if (v3.S == df_2.a(18777, 2672073003113756542L)) {
                                }
                                ** GOTO lbl44
                            }
                            catch (hi_0 v4) {
                                throw df_2.a(v4);
                            }
                            v3 = var3_3;
                            if (var1_1 != null) break block17;
                        }
                        catch (hi_0 v5) {
                            throw df_2.a(v5);
                        }
                        if (v3.P() == df_2.a(22390, 5037246021153892690L)) {
                        }
                        ** GOTO lbl44
                    }
                    catch (hi_0 v6) {
                        throw df_2.a(v6);
                    }
                    var2_2 = var3_3.z();
                    try {
                        var3_3.K();
                        if (var1_1 == null) break block18;
lbl44:
                        // 3 sources

                        v3 = this.e.M();
                    }
                    catch (hi_0 v7) {
                        throw df_2.a(v7);
                    }
                }
                var2_2 = v3;
            }
            this.h();
        }
        return B8.i(var2_2);
    }

    public Object q(HI hI2) {
        return this.Y(hI2.O());
    }

    public Object Y(Type type) {
        Object object;
        block4: {
            block5: {
                String string = hi_0.C();
                try {
                    try {
                        object = this.C;
                        if (string != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw df_2.a(hi_02);
                    }
                    return this.e.o(type);
                }
                catch (hi_0 hi_03) {
                    throw df_2.a(hi_03);
                }
            }
            this.R();
            object = this.e.o(type);
        }
        RC rC = object;
        this.h();
        return rC;
    }

    public Object l(Class clazz) {
        Object object;
        block4: {
            block5: {
                String string = hi_0.C();
                try {
                    try {
                        object = this.C;
                        if (string != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw df_2.a(hi_02);
                    }
                    return this.e.M(clazz);
                }
                catch (hi_0 hi_03) {
                    throw df_2.a(hi_03);
                }
            }
            this.R();
            object = this.e.M(clazz);
        }
        RC rC = object;
        this.e.Y(rC);
        this.h();
        return rC;
    }

    public void m(Object object) {
        df_2 df_22;
        block4: {
            block5: {
                String string = hi_0.C();
                try {
                    try {
                        df_22 = this;
                        if (string != null) break block4;
                        if (df_22.C != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw df_2.a(hi_02);
                    }
                    this.e.v(object);
                    return;
                }
                catch (hi_0 hi_03) {
                    throw df_2.a(hi_03);
                }
            }
            this.R();
            this.e.v(object);
            df_22 = this;
        }
        df_22.h();
    }

    /*
     * Exception decompiling
     */
    public Object P() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CASE]], but top level block is 3[TRYBLOCK]
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

    public Object z(Map map) {
        Object object;
        block4: {
            block5: {
                String string = hi_0.C();
                try {
                    try {
                        object = this.C;
                        if (string != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw df_2.a(hi_02);
                    }
                    return this.e.u(map);
                }
                catch (hi_0 hi_03) {
                    throw df_2.a(hi_03);
                }
            }
            this.R();
            object = this.e.u(map);
        }
        RC rC = object;
        this.h();
        return rC;
    }

    /*
     * Exception decompiling
     */
    private void R() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 7[SWITCH]
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
     * Exception decompiling
     */
    private void h() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 1[TRYBLOCK]
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

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "\u00ff8\u00b4@\u00c3\u0086\u00dd\u0017\u00ad\u00d1\ngOt\u00b0\u000e\u0010\u00e0\u00fbW8\u00bf\u0089R\u00f6\\\u00ed4\u00e0\u0088\u0084H\u0010\u000f\u0014A\u0080\u001d\u0005\u0007_\u001d\u00fc\u00978Rp\u00c7\u0013";
                    var12_3 = "\u00ff8\u00b4@\u00c3\u0086\u00dd\u0017\u00ad\u00d1\ngOt\u00b0\u000e\u0010\u00e0\u00fbW8\u00bf\u0089R\u00f6\\\u00ed4\u00e0\u0088\u0084H\u0010\u000f\u0014A\u0080\u001d\u0005\u0007_\u001d\u00fc\u00978Rp\u00c7\u0013".length();
                    var9_4 = 16;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 120;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 27;
                                    break;
                                }
                                case 1: {
                                    v11 = 124;
                                    break;
                                }
                                case 2: {
                                    v11 = 119;
                                    break;
                                }
                                case 3: {
                                    v11 = 59;
                                    break;
                                }
                                case 4: {
                                    v11 = 74;
                                    break;
                                }
                                case 5: {
                                    v11 = 54;
                                    break;
                                }
                                default: {
                                    v11 = 124;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
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
                    } while (v6 > var14_6);
                    ** while (true)
                }
                df_2.a = var13;
                df_2.b = new String[3];
                var0_7 = 4940825594417940331L;
                var6_8 = new long[22];
                var3_9 = 0;
                var4_10 = "\u009f\u00de\u00c6R!\u00ca\b\u0083h\u00ced\u0083`\u00f13\u00fc\u00f8Hd\u00e6\rP.+?M\u00a4L\u001799B,@\u00a2\u00e5\u00a9Y%\u001bR?$\u00df/\u0010x\u00d3\u00b5*\"\t\u00e9\u00f0Xo\u00b1\u00daGNu\u009cB\u0094\u0018\u000b\u00ea\u00cew\u00c6\u00a0j\u00f1\u0016\u00dcJ\u00e0EL\u0080,\u00a4I\u00c5\u0084\u00cb\u001a\u0081\u0095\u00b0\u00a4 ]\u00a0\u0092\u00e7\u00a1\u0002o\u00be-L\u00e9\u009f)O\u0091cR\b\u008e\u001f\u00c6\u009bW\u00a1E3\u00ae\u00b1\b$S{\u009ec\u0085\u00de\u00c4\u001a#\u00b90\u00e5\u00c4~d6\u008eK\u00f3&\u00ca\u00f07E\u00d4\u00db\u0088pt\u0088A\u00eb\u0017P\u00b9\u0081\u0098\u0010";
                var5_11 = "\u009f\u00de\u00c6R!\u00ca\b\u0083h\u00ced\u0083`\u00f13\u00fc\u00f8Hd\u00e6\rP.+?M\u00a4L\u001799B,@\u00a2\u00e5\u00a9Y%\u001bR?$\u00df/\u0010x\u00d3\u00b5*\"\t\u00e9\u00f0Xo\u00b1\u00daGNu\u009cB\u0094\u0018\u000b\u00ea\u00cew\u00c6\u00a0j\u00f1\u0016\u00dcJ\u00e0EL\u0080,\u00a4I\u00c5\u0084\u00cb\u001a\u0081\u0095\u00b0\u00a4 ]\u00a0\u0092\u00e7\u00a1\u0002o\u00be-L\u00e9\u009f)O\u0091cR\b\u008e\u001f\u00c6\u009bW\u00a1E3\u00ae\u00b1\b$S{\u009ec\u0085\u00de\u00c4\u001a#\u00b90\u00e5\u00c4~d6\u008eK\u00f3&\u00ca\u00f07E\u00d4\u00db\u0088pt\u0088A\u00eb\u0017P\u00b9\u0081\u0098\u0010".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00dc\u008d\u00a5[\u00e32.\u009a\u00a5\u00de\u007f\u0019;,\u00cd\f";
                    var5_11 = "\u00dc\u008d\u00a5[\u00e32.\u009a\u00a5\u00de\u007f\u0019;,\u00cd\f".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        df_2.c = var6_8;
        df_2.d = new Integer[22];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC7E9) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 91;
                    break;
                }
                case 1: {
                    n14 = 170;
                    break;
                }
                case 2: {
                    n14 = 23;
                    break;
                }
                case 3: {
                    n14 = 132;
                    break;
                }
                case 4: {
                    n14 = 217;
                    break;
                }
                case 5: {
                    n14 = 161;
                    break;
                }
                case 6: {
                    n14 = 62;
                    break;
                }
                case 7: {
                    n14 = 29;
                    break;
                }
                case 8: {
                    n14 = 230;
                    break;
                }
                case 9: {
                    n14 = 93;
                    break;
                }
                case 10: {
                    n14 = 51;
                    break;
                }
                case 11: {
                    n14 = 20;
                    break;
                }
                case 12: {
                    n14 = 64;
                    break;
                }
                case 13: {
                    n14 = 199;
                    break;
                }
                case 14: {
                    n14 = 96;
                    break;
                }
                case 15: {
                    n14 = 55;
                    break;
                }
                case 16: {
                    n14 = 251;
                    break;
                }
                case 17: {
                    n14 = 133;
                    break;
                }
                case 18: {
                    n14 = 101;
                    break;
                }
                case 19: {
                    n14 = 24;
                    break;
                }
                case 20: {
                    n14 = 113;
                    break;
                }
                case 21: {
                    n14 = 246;
                    break;
                }
                case 22: {
                    n14 = 153;
                    break;
                }
                case 23: {
                    n14 = 97;
                    break;
                }
                case 24: {
                    n14 = 107;
                    break;
                }
                case 25: {
                    n14 = 137;
                    break;
                }
                case 26: {
                    n14 = 109;
                    break;
                }
                case 27: {
                    n14 = 193;
                    break;
                }
                case 28: {
                    n14 = 21;
                    break;
                }
                case 29: {
                    n14 = 155;
                    break;
                }
                case 30: {
                    n14 = 34;
                    break;
                }
                case 31: {
                    n14 = 115;
                    break;
                }
                case 32: {
                    n14 = 57;
                    break;
                }
                case 33: {
                    n14 = 242;
                    break;
                }
                case 34: {
                    n14 = 86;
                    break;
                }
                case 35: {
                    n14 = 4;
                    break;
                }
                case 36: {
                    n14 = 239;
                    break;
                }
                case 37: {
                    n14 = 41;
                    break;
                }
                case 38: {
                    n14 = 125;
                    break;
                }
                case 39: {
                    n14 = 150;
                    break;
                }
                case 40: {
                    n14 = 76;
                    break;
                }
                case 41: {
                    n14 = 187;
                    break;
                }
                case 42: {
                    n14 = 13;
                    break;
                }
                case 43: {
                    n14 = 253;
                    break;
                }
                case 44: {
                    n14 = 191;
                    break;
                }
                case 45: {
                    n14 = 228;
                    break;
                }
                case 46: {
                    n14 = 89;
                    break;
                }
                case 47: {
                    n14 = 54;
                    break;
                }
                case 48: {
                    n14 = 158;
                    break;
                }
                case 49: {
                    n14 = 28;
                    break;
                }
                case 50: {
                    n14 = 31;
                    break;
                }
                case 51: {
                    n14 = 169;
                    break;
                }
                case 52: {
                    n14 = 151;
                    break;
                }
                case 53: {
                    n14 = 136;
                    break;
                }
                case 54: {
                    n14 = 252;
                    break;
                }
                case 55: {
                    n14 = 196;
                    break;
                }
                case 56: {
                    n14 = 112;
                    break;
                }
                case 57: {
                    n14 = 114;
                    break;
                }
                case 58: {
                    n14 = 104;
                    break;
                }
                case 59: {
                    n14 = 141;
                    break;
                }
                case 60: {
                    n14 = 87;
                    break;
                }
                case 61: {
                    n14 = 138;
                    break;
                }
                case 62: {
                    n14 = 159;
                    break;
                }
                case 63: {
                    n14 = 200;
                    break;
                }
                case 64: {
                    n14 = 162;
                    break;
                }
                case 65: {
                    n14 = 122;
                    break;
                }
                case 66: {
                    n14 = 0;
                    break;
                }
                case 67: {
                    n14 = 165;
                    break;
                }
                case 68: {
                    n14 = 68;
                    break;
                }
                case 69: {
                    n14 = 163;
                    break;
                }
                case 70: {
                    n14 = 7;
                    break;
                }
                case 71: {
                    n14 = 12;
                    break;
                }
                case 72: {
                    n14 = 190;
                    break;
                }
                case 73: {
                    n14 = 188;
                    break;
                }
                case 74: {
                    n14 = 212;
                    break;
                }
                case 75: {
                    n14 = 194;
                    break;
                }
                case 76: {
                    n14 = 66;
                    break;
                }
                case 77: {
                    n14 = 208;
                    break;
                }
                case 78: {
                    n14 = 95;
                    break;
                }
                case 79: {
                    n14 = 216;
                    break;
                }
                case 80: {
                    n14 = 10;
                    break;
                }
                case 81: {
                    n14 = 17;
                    break;
                }
                case 82: {
                    n14 = 144;
                    break;
                }
                case 83: {
                    n14 = 22;
                    break;
                }
                case 84: {
                    n14 = 219;
                    break;
                }
                case 85: {
                    n14 = 42;
                    break;
                }
                case 86: {
                    n14 = 247;
                    break;
                }
                case 87: {
                    n14 = 14;
                    break;
                }
                case 88: {
                    n14 = 67;
                    break;
                }
                case 89: {
                    n14 = 249;
                    break;
                }
                case 90: {
                    n14 = 19;
                    break;
                }
                case 91: {
                    n14 = 88;
                    break;
                }
                case 92: {
                    n14 = 77;
                    break;
                }
                case 93: {
                    n14 = 11;
                    break;
                }
                case 94: {
                    n14 = 179;
                    break;
                }
                case 95: {
                    n14 = 90;
                    break;
                }
                case 96: {
                    n14 = 223;
                    break;
                }
                case 97: {
                    n14 = 110;
                    break;
                }
                case 98: {
                    n14 = 81;
                    break;
                }
                case 99: {
                    n14 = 5;
                    break;
                }
                case 100: {
                    n14 = 227;
                    break;
                }
                case 101: {
                    n14 = 45;
                    break;
                }
                case 102: {
                    n14 = 80;
                    break;
                }
                case 103: {
                    n14 = 183;
                    break;
                }
                case 104: {
                    n14 = 52;
                    break;
                }
                case 105: {
                    n14 = 73;
                    break;
                }
                case 106: {
                    n14 = 221;
                    break;
                }
                case 107: {
                    n14 = 206;
                    break;
                }
                case 108: {
                    n14 = 53;
                    break;
                }
                case 109: {
                    n14 = 146;
                    break;
                }
                case 110: {
                    n14 = 118;
                    break;
                }
                case 111: {
                    n14 = 203;
                    break;
                }
                case 112: {
                    n14 = 229;
                    break;
                }
                case 113: {
                    n14 = 36;
                    break;
                }
                case 114: {
                    n14 = 32;
                    break;
                }
                case 115: {
                    n14 = 214;
                    break;
                }
                case 116: {
                    n14 = 9;
                    break;
                }
                case 117: {
                    n14 = 171;
                    break;
                }
                case 118: {
                    n14 = 174;
                    break;
                }
                case 119: {
                    n14 = 177;
                    break;
                }
                case 120: {
                    n14 = 222;
                    break;
                }
                case 121: {
                    n14 = 254;
                    break;
                }
                case 122: {
                    n14 = 8;
                    break;
                }
                case 123: {
                    n14 = 123;
                    break;
                }
                case 124: {
                    n14 = 166;
                    break;
                }
                case 125: {
                    n14 = 157;
                    break;
                }
                case 126: {
                    n14 = 120;
                    break;
                }
                case 127: {
                    n14 = 178;
                    break;
                }
                case 128: {
                    n14 = 124;
                    break;
                }
                case 129: {
                    n14 = 65;
                    break;
                }
                case 130: {
                    n14 = 243;
                    break;
                }
                case 131: {
                    n14 = 30;
                    break;
                }
                case 132: {
                    n14 = 72;
                    break;
                }
                case 133: {
                    n14 = 47;
                    break;
                }
                case 134: {
                    n14 = 198;
                    break;
                }
                case 135: {
                    n14 = 134;
                    break;
                }
                case 136: {
                    n14 = 61;
                    break;
                }
                case 137: {
                    n14 = 152;
                    break;
                }
                case 138: {
                    n14 = 226;
                    break;
                }
                case 139: {
                    n14 = 35;
                    break;
                }
                case 140: {
                    n14 = 241;
                    break;
                }
                case 141: {
                    n14 = 185;
                    break;
                }
                case 142: {
                    n14 = 74;
                    break;
                }
                case 143: {
                    n14 = 63;
                    break;
                }
                case 144: {
                    n14 = 75;
                    break;
                }
                case 145: {
                    n14 = 156;
                    break;
                }
                case 146: {
                    n14 = 167;
                    break;
                }
                case 147: {
                    n14 = 143;
                    break;
                }
                case 148: {
                    n14 = 79;
                    break;
                }
                case 149: {
                    n14 = 164;
                    break;
                }
                case 150: {
                    n14 = 182;
                    break;
                }
                case 151: {
                    n14 = 236;
                    break;
                }
                case 152: {
                    n14 = 189;
                    break;
                }
                case 153: {
                    n14 = 195;
                    break;
                }
                case 154: {
                    n14 = 224;
                    break;
                }
                case 155: {
                    n14 = 119;
                    break;
                }
                case 156: {
                    n14 = 27;
                    break;
                }
                case 157: {
                    n14 = 237;
                    break;
                }
                case 158: {
                    n14 = 234;
                    break;
                }
                case 159: {
                    n14 = 48;
                    break;
                }
                case 160: {
                    n14 = 250;
                    break;
                }
                case 161: {
                    n14 = 175;
                    break;
                }
                case 162: {
                    n14 = 201;
                    break;
                }
                case 163: {
                    n14 = 111;
                    break;
                }
                case 164: {
                    n14 = 240;
                    break;
                }
                case 165: {
                    n14 = 186;
                    break;
                }
                case 166: {
                    n14 = 98;
                    break;
                }
                case 167: {
                    n14 = 69;
                    break;
                }
                case 168: {
                    n14 = 197;
                    break;
                }
                case 169: {
                    n14 = 142;
                    break;
                }
                case 170: {
                    n14 = 39;
                    break;
                }
                case 171: {
                    n14 = 192;
                    break;
                }
                case 172: {
                    n14 = 154;
                    break;
                }
                case 173: {
                    n14 = 245;
                    break;
                }
                case 174: {
                    n14 = 207;
                    break;
                }
                case 175: {
                    n14 = 46;
                    break;
                }
                case 176: {
                    n14 = 3;
                    break;
                }
                case 177: {
                    n14 = 16;
                    break;
                }
                case 178: {
                    n14 = 56;
                    break;
                }
                case 179: {
                    n14 = 176;
                    break;
                }
                case 180: {
                    n14 = 220;
                    break;
                }
                case 181: {
                    n14 = 211;
                    break;
                }
                case 182: {
                    n14 = 231;
                    break;
                }
                case 183: {
                    n14 = 60;
                    break;
                }
                case 184: {
                    n14 = 149;
                    break;
                }
                case 185: {
                    n14 = 44;
                    break;
                }
                case 186: {
                    n14 = 15;
                    break;
                }
                case 187: {
                    n14 = 181;
                    break;
                }
                case 188: {
                    n14 = 94;
                    break;
                }
                case 189: {
                    n14 = 128;
                    break;
                }
                case 190: {
                    n14 = 235;
                    break;
                }
                case 191: {
                    n14 = 129;
                    break;
                }
                case 192: {
                    n14 = 25;
                    break;
                }
                case 193: {
                    n14 = 147;
                    break;
                }
                case 194: {
                    n14 = 58;
                    break;
                }
                case 195: {
                    n14 = 106;
                    break;
                }
                case 196: {
                    n14 = 99;
                    break;
                }
                case 197: {
                    n14 = 40;
                    break;
                }
                case 198: {
                    n14 = 215;
                    break;
                }
                case 199: {
                    n14 = 2;
                    break;
                }
                case 200: {
                    n14 = 1;
                    break;
                }
                case 201: {
                    n14 = 218;
                    break;
                }
                case 202: {
                    n14 = 126;
                    break;
                }
                case 203: {
                    n14 = 85;
                    break;
                }
                case 204: {
                    n14 = 37;
                    break;
                }
                case 205: {
                    n14 = 102;
                    break;
                }
                case 206: {
                    n14 = 131;
                    break;
                }
                case 207: {
                    n14 = 172;
                    break;
                }
                case 208: {
                    n14 = 84;
                    break;
                }
                case 209: {
                    n14 = 135;
                    break;
                }
                case 210: {
                    n14 = 117;
                    break;
                }
                case 211: {
                    n14 = 78;
                    break;
                }
                case 212: {
                    n14 = 205;
                    break;
                }
                case 213: {
                    n14 = 71;
                    break;
                }
                case 214: {
                    n14 = 238;
                    break;
                }
                case 215: {
                    n14 = 173;
                    break;
                }
                case 216: {
                    n14 = 232;
                    break;
                }
                case 217: {
                    n14 = 130;
                    break;
                }
                case 218: {
                    n14 = 49;
                    break;
                }
                case 219: {
                    n14 = 103;
                    break;
                }
                case 220: {
                    n14 = 105;
                    break;
                }
                case 221: {
                    n14 = 180;
                    break;
                }
                case 222: {
                    n14 = 38;
                    break;
                }
                case 223: {
                    n14 = 204;
                    break;
                }
                case 224: {
                    n14 = 210;
                    break;
                }
                case 225: {
                    n14 = 92;
                    break;
                }
                case 226: {
                    n14 = 168;
                    break;
                }
                case 227: {
                    n14 = 100;
                    break;
                }
                case 228: {
                    n14 = 213;
                    break;
                }
                case 229: {
                    n14 = 202;
                    break;
                }
                case 230: {
                    n14 = 83;
                    break;
                }
                case 231: {
                    n14 = 121;
                    break;
                }
                case 232: {
                    n14 = 116;
                    break;
                }
                case 233: {
                    n14 = 139;
                    break;
                }
                case 234: {
                    n14 = 50;
                    break;
                }
                case 235: {
                    n14 = 18;
                    break;
                }
                case 236: {
                    n14 = 244;
                    break;
                }
                case 237: {
                    n14 = 145;
                    break;
                }
                case 238: {
                    n14 = 6;
                    break;
                }
                case 239: {
                    n14 = 70;
                    break;
                }
                case 240: {
                    n14 = 255;
                    break;
                }
                case 241: {
                    n14 = 160;
                    break;
                }
                case 242: {
                    n14 = 43;
                    break;
                }
                case 243: {
                    n14 = 59;
                    break;
                }
                case 244: {
                    n14 = 26;
                    break;
                }
                case 245: {
                    n14 = 108;
                    break;
                }
                case 246: {
                    n14 = 248;
                    break;
                }
                case 247: {
                    n14 = 127;
                    break;
                }
                case 248: {
                    n14 = 225;
                    break;
                }
                case 249: {
                    n14 = 82;
                    break;
                }
                case 250: {
                    n14 = 184;
                    break;
                }
                case 251: {
                    n14 = 148;
                    break;
                }
                case 252: {
                    n14 = 233;
                    break;
                }
                case 253: {
                    n14 = 209;
                    break;
                }
                case 254: {
                    n14 = 140;
                    break;
                }
                default: {
                    n14 = 33;
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
            df_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7E26;
        if (d[n11] == null) {
            df_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

