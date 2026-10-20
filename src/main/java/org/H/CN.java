/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.F.c;
import org.h.cr_0;

public class CN
extends FilterWriter {
    private final StringBuilder V = new StringBuilder();
    private int M;
    @c
    private List I;
    private int U;
    static final /* synthetic */ boolean j;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public CN(Writer writer) {
        super(writer);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void write(@c char[] var1_1, int var2_2, int var3_3) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 9[SIMPLE_IF_TAKEN]
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
    @Override
    public void write(@c String var1_1, int var2_2, int var3_3) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[DOLOOP]], but top level block is 9[SIMPLE_IF_TAKEN]
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
    public void write(int n10) throws IOException {
        block14: {
            char c2;
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            block16: {
                block15: {
                    int n11;
                    ky_2[] ky_2Array;
                    block12: {
                        block13: {
                            ky_2Array = cr_0.q();
                            try {
                                try {
                                    n11 = n10;
                                    if (ky_2Array != null) break block12;
                                    if (n11 != CN.a(22270, 2470792852811644864L)) break block13;
                                }
                                catch (IOException iOException) {
                                    throw CN.a(iOException);
                                }
                                this.V.append((char)CN.a(9740, 2936492272831991603L));
                                this.O(this.V.toString());
                                this.V.setLength(0);
                                return;
                            }
                            catch (IOException iOException) {
                                throw CN.a(iOException);
                            }
                        }
                        try {
                            stringBuilder2 = this.V;
                            if (ky_2Array != null) break block14;
                            n11 = stringBuilder2.length();
                        }
                        catch (IOException iOException) {
                            throw CN.a(iOException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n11 <= 0) break block15;
                                stringBuilder = this.V;
                                c2 = (char)(this.V.length() - 1);
                                if (ky_2Array != null) break block16;
                            }
                            catch (IOException iOException) {
                                throw CN.a(iOException);
                            }
                            if (stringBuilder.charAt(c2) != CN.a(13900, 6891845760786800496L)) break block15;
                        }
                        catch (IOException iOException) {
                            throw CN.a(iOException);
                        }
                        this.O(this.V.toString());
                        this.V.setCharAt(0, (char)n10);
                        this.V.setLength(1);
                        return;
                    }
                    catch (IOException iOException) {
                        throw CN.a(iOException);
                    }
                }
                stringBuilder = this.V;
                c2 = (char)n10;
            }
            stringBuilder2 = stringBuilder.append(c2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void O(String var1_1) throws IOException {
        block46: {
            block59: {
                block58: {
                    block56: {
                        block57: {
                            block54: {
                                block55: {
                                    block52: {
                                        block53: {
                                            block48: {
                                                block51: {
                                                    block49: {
                                                        block50: {
                                                            block47: {
                                                                block45: {
                                                                    block43: {
                                                                        block44: {
                                                                            block42: {
                                                                                var2_2 = cr_0.q();
                                                                                try {
                                                                                    try {
                                                                                        v0 = this.I;
                                                                                        if (var2_2 != null) break block42;
                                                                                        if (v0 != null) {
                                                                                        }
                                                                                        ** GOTO lbl60
                                                                                    }
                                                                                    catch (IOException v1) {
                                                                                        throw CN.a(v1);
                                                                                    }
                                                                                    v0 = this.I;
                                                                                }
                                                                                catch (IOException v2) {
                                                                                    throw CN.a(v2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                v0.add(new StringBuilder(var1_1.length()).append(var1_1));
                                                                                v3 = var1_1.charAt(0);
                                                                                v4 = CN.a(24944, 3606827394543634502L);
                                                                                if (var2_2 != null) break block43;
                                                                                if (v3 != v4) break block44;
                                                                            }
                                                                            catch (IOException v5) {
                                                                                throw CN.a(v5);
                                                                            }
                                                                            ++this.M;
                                                                            var1_1 = var1_1.substring(1);
                                                                        }
                                                                        v3 = var1_1.charAt(0);
                                                                        v4 = CN.a(14478, 4578575377761178038L);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var2_2 != null) break block45;
                                                                                if (v3 != v4) break block46;
                                                                            }
                                                                            catch (IOException v6) {
                                                                                throw CN.a(v6);
                                                                            }
                                                                            v7 = this;
                                                                            if (var2_2 != null) break block47;
                                                                        }
                                                                        catch (IOException v8) {
                                                                            throw CN.a(v8);
                                                                        }
                                                                        v3 = v7.M = v7.M - 1;
                                                                        v4 = this.U;
                                                                    }
                                                                    catch (IOException v9) {
                                                                        throw CN.a(v9);
                                                                    }
                                                                }
                                                                if (v3 >= v4) break block46;
                                                                v7 = this;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v7.K();
                                                                            if (var2_2 == null) break block46;
lbl60:
                                                                            // 2 sources

                                                                            v10 = var1_1.indexOf(CN.a(14434, 1999086222711591253L));
                                                                            v11 = -1;
                                                                            if (var2_2 != null) break block48;
                                                                        }
                                                                        catch (IOException v12) {
                                                                            throw CN.a(v12);
                                                                        }
                                                                        if (v10 != v11) {
                                                                        }
                                                                        ** GOTO lbl101
                                                                    }
                                                                    catch (IOException v13) {
                                                                        throw CN.a(v13);
                                                                    }
                                                                    v14 = var1_1.charAt(0);
                                                                    v15 = CN.a(19222, 7286478498634719781L);
                                                                    if (var2_2 != null) break block49;
                                                                }
                                                                catch (IOException v16) {
                                                                    throw CN.a(v16);
                                                                }
                                                                if (v14 != v15) break block50;
                                                            }
                                                            catch (IOException v17) {
                                                                throw CN.a(v17);
                                                            }
                                                            ++this.M;
                                                            var1_1 = var1_1.substring(1);
                                                        }
                                                        try {
                                                            v14 = var1_1.charAt(0);
                                                            if (var2_2 != null) break block51;
                                                            v15 = CN.a(2505, 1687642134842777852L);
                                                        }
                                                        catch (IOException v18) {
                                                            throw CN.a(v18);
                                                        }
                                                    }
                                                    if (v14 == v15) {
                                                        --this.M;
                                                        var1_1 = var1_1.substring(1);
                                                    }
                                                    this.I = new ArrayList<E>();
                                                    v14 = (char)this.I.add(new StringBuilder(var1_1.length()).append(var1_1));
                                                }
                                                try {
                                                    this.U = this.M;
                                                    if (var2_2 == null) break block46;
lbl101:
                                                    // 2 sources

                                                    v10 = var1_1.charAt(0);
                                                    v11 = CN.a(18544, 8056763678759379265L);
                                                }
                                                catch (IOException v19) {
                                                    throw CN.a(v19);
                                                }
                                            }
                                            try {
                                                if (var2_2 != null) break block52;
                                                if (v10 != v11) break block53;
                                            }
                                            catch (IOException v20) {
                                                throw CN.a(v20);
                                            }
                                            var1_1 = var1_1.substring(1);
                                        }
                                        v10 = var1_1.charAt(0);
                                        v11 = CN.a(19222, 7286478498634719781L);
                                    }
                                    try {
                                        if (var2_2 != null) break block54;
                                        if (v10 != v11) break block55;
                                    }
                                    catch (IOException v21) {
                                        throw CN.a(v21);
                                    }
                                    ++this.M;
                                    var1_1 = var1_1.substring(1);
                                }
                                v10 = var1_1.charAt(0);
                                v11 = CN.a(2505, 1687642134842777852L);
                            }
                            try {
                                if (var2_2 != null) break block56;
                                if (v10 != v11) break block57;
                            }
                            catch (IOException v22) {
                                throw CN.a(v22);
                            }
                            --this.M;
                            var1_1 = var1_1.substring(1);
                        }
                        try {
                            v10 = CN.a(-24597, 30704).indexOf(var1_1.charAt(0));
                            if (var2_2 != null) break block58;
                            v11 = -1;
                        }
                        catch (IOException v23) {
                            throw CN.a(v23);
                        }
                    }
                    if (v10 != v11) break block59;
                    v10 = var3_3 = 0;
                }
                while (var3_3 < this.M) {
                    try {
                        this.out.write(CN.a(-24600, 5222));
                        ++var3_3;
                        if (var2_2 == null) {
                            if (var2_2 == null) continue;
                            break;
                        }
                        break block46;
                    }
                    catch (IOException v24) {
                        throw CN.a(v24);
                    }
                }
            }
            this.out.write(var1_1);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void K() throws IOException {
        block51: {
            block46: {
                block45: {
                    var2_1 = new ArrayList<ArrayList<E>>();
                    var2_1.add(new ArrayList<E>());
                    var3_2 = this.I;
                    var1_3 = cr_0.q();
                    try {
                        try {
                            try {
                                if (CN.j) break block45;
                                v0 = var3_2;
                                if (var1_3 != null) break block46;
                            }
                            catch (IOException v1) {
                                throw CN.a(v1);
                            }
                            if (v0 != null) break block45;
                        }
                        catch (IOException v2) {
                            throw CN.a(v2);
                        }
                        throw new AssertionError();
                    }
                    catch (IOException v3) {
                        throw CN.a(v3);
                    }
                }
                v0 = var3_2;
            }
            var4_4 = v0.iterator();
            while (var4_4.hasNext()) {
                var5_6 = (StringBuilder)var4_4.next();
                var6_7 = 0;
                try {
                    v4 = var5_6.charAt(0);
                    if (var1_3 == null) {
                        v5 = CN.a(19222, 7286478498634719781L);
                    }
                    ** GOTO lbl100
                }
                catch (IOException v6) {
                    throw CN.a(v6);
                }
                block31: while (true) {
                    block49: {
                        block47: {
                            block48: {
                                if (var1_3 == null) {
                                    try {
                                        if (v4 == v5) {
                                            var2_1.add(new ArrayList<E>());
                                            ++var6_7;
                                        }
                                    }
                                    catch (IOException v7) {
                                        throw CN.a(v7);
                                    }
                                    v8 = var5_6.charAt(var6_7);
                                    v5 = CN.a(2505, 1687642134842777852L);
                                }
                                try {
                                    try {
                                        if (var1_3 != null) break block47;
                                        if (v8 != v5) break block48;
                                    }
                                    catch (IOException v9) {
                                        throw CN.a(v9);
                                    }
                                    CN.d((List)var2_1.remove(var2_1.size() - 1));
                                    ++var6_7;
                                }
                                catch (IOException v10) {
                                    throw CN.a(v10);
                                }
                            }
                            try {
                                v8 = var5_6.charAt(var6_7);
                                if (var1_3 != null) break block49;
                                v5 = CN.a(8743, 4075977791415323413L);
                            }
                            catch (IOException v11) {
                                throw CN.a(v11);
                            }
                        }
                        if (v8 == v5) {
                            var7_11 = (List)var2_1.get(var2_1.size() - 1);
                            CN.d(var7_11);
                            var7_11.clear();
                            var5_6.deleteCharAt(var6_7);
                        }
                        v8 = var7_10 = 0;
                    }
                    while (var7_10 < var5_6.length()) {
                        block50: {
                            try {
                                v12 = var5_6.charAt(var7_10);
                                if (var1_3 != null) break block50;
                                v13 = CN.a(15141, 83800833416565269L);
                                if (var1_3 != null) continue block31;
                            }
                            catch (IOException v14) {
                                throw CN.a(v14);
                            }
                            try {
                                if (v12 == v13) {
                                    v12 = (char)((List)var2_1.get(var2_1.size() - 1)).add(var5_6);
                                }
                            }
                            catch (IOException v15) {
                                throw CN.a(v15);
                            }
                        }
                        ++var7_10;
                        if (var1_3 == null) continue;
                    }
                    break;
                }
                if (var1_3 == null) continue;
            }
            var4_4 = var2_1.iterator();
            do {
                v4 = var4_4.hasNext();
lbl100:
                // 2 sources

                if (v4 == '\u0000') break;
                var5_6 = (List)var4_4.next();
                CN.d((List)var5_6);
            } while (var1_3 == null);
            var4_5 = this.U;
            for (StringBuilder var6_9 : var3_2) {
                block57: {
                    block58: {
                        block56: {
                            block54: {
                                block55: {
                                    block52: {
                                        block53: {
                                            var7_12 = var6_9.toString();
                                            try {
                                                try {
                                                    if (var1_3 != null) break block51;
                                                    v16 = var7_12.charAt(0);
                                                    v17 = CN.a(19222, 7286478498634719781L);
                                                    if (var1_3 != null) break block52;
                                                }
                                                catch (IOException v18) {
                                                    throw CN.a(v18);
                                                }
                                                if (v16 != v17) break block53;
                                            }
                                            catch (IOException v19) {
                                                throw CN.a(v19);
                                            }
                                            ++var4_5;
                                            var7_12 = var7_12.substring(1);
                                        }
                                        v16 = var7_12.charAt(0);
                                        v17 = CN.a(2505, 1687642134842777852L);
                                    }
                                    try {
                                        if (var1_3 != null) break block54;
                                        if (v16 != v17) break block55;
                                    }
                                    catch (IOException v20) {
                                        throw CN.a(v20);
                                    }
                                    --var4_5;
                                    var7_12 = var7_12.substring(1);
                                }
                                try {
                                    v16 = CN.a(-24598, 21227).indexOf(var7_12.charAt(0));
                                    if (var1_3 != null) break block56;
                                    v17 = -1;
                                }
                                catch (IOException v21) {
                                    throw CN.a(v21);
                                }
                            }
                            if (v16 != v17) break block58;
                            v16 = var8_13 = 0;
                        }
                        while (var8_13 < var4_5) {
                            try {
                                this.out.write(CN.a(-24596, -29651));
                                ++var8_13;
                                if (var1_3 == null) {
                                    if (var1_3 == null) continue;
                                    break;
                                }
                                break block57;
                            }
                            catch (IOException v22) {
                                throw CN.a(v22);
                            }
                        }
                    }
                    this.out.write(var7_12.toString());
                }
                if (var1_3 == null) continue;
            }
            this.I = null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void d(List var0) {
        var2_1 = new ArrayList<Integer>();
        var1_2 = cr_0.q();
        var3_3 = var0.iterator();
        while (var3_3.hasNext()) {
            block24: {
                block23: {
                    var4_4 = (StringBuilder)var3_3.next();
                    var5_5 = 0;
                    v0 = var4_4.charAt(var5_5);
                    if (var1_2 != null) ** GOTO lbl53
                    v1 = CN.a(19222, 7286478498634719781L);
                    if (var1_2 != null) break block23;
                    if (v0 == v1) {
                        ++var5_5;
                    }
                    v2 = var4_4.charAt(var5_5);
                    if (var1_2 != null) break block24;
                    v1 = CN.a(2505, 1687642134842777852L);
                }
                if (v2 == v1) {
                    // empty if block
                }
                v2 = 0;
            }
            var6_6 = v2;
            for (var7_7 = ++var5_5; var7_7 < var4_4.length(); ++var7_7) {
                block27: {
                    block25: {
                        block26: {
                            v3 = var4_4.charAt(var7_7);
                            v4 = CN.a(15141, 83800833416565269L);
                            if (var1_2 != null) ** GOTO lbl59
                            if (var1_2 == null) {
                                if (v3 != v4) continue;
                                v5 = var7_7;
                                v6 = var5_5;
                            }
                            var8_8 = v5 - v6;
                            var5_5 = var7_7;
                            v7 = var6_6;
                            v8 = var2_1.size();
                            if (var1_2 != null) break block25;
                            if (v7 < v8) break block26;
                            var2_1.add((int)var8_8);
                            if (var1_2 == null) break block27;
                        }
                        v7 = var8_8;
                        v8 = (Integer)var2_1.get(var6_6);
                    }
                    if (v7 > v8) {
                        var2_1.set(var6_6, (int)var8_8);
                    }
                }
                ++var6_6;
                if (var1_2 == null) continue;
            }
            if (var1_2 == null) continue;
        }
        var3_3 = var0.iterator();
        do {
            v0 = var3_3.hasNext();
lbl53:
            // 2 sources

            if (v0 == '\u0000') break;
            var4_4 = (StringBuilder)var3_3.next();
            var5_5 = 0;
            var6_6 = 0;
            v3 = var4_4.charAt(var6_6);
            v4 = CN.a(19222, 7286478498634719781L);
lbl59:
            // 2 sources

            block3: while (true) {
                block29: {
                    block28: {
                        if (var1_2 != null) break block28;
                        if (v3 == v4) {
                            ++var6_6;
                        }
                        v3 = var4_4.charAt(var6_6);
                        if (var1_2 != null) break block29;
                        v4 = CN.a(2505, 1687642134842777852L);
                    }
                    if (v3 == v4) {
                        // empty if block
                    }
                    v3 = var7_7 = ++var6_6;
                }
                while (var7_7 < var4_4.length()) {
                    block31: {
                        block30: {
                            v9 = var4_4.charAt(var7_7);
                            v10 = CN.a(15141, 83800833416565269L);
                            if (var1_2 != null) continue block3;
                            if (var1_2 != null) break block30;
                            if (v9 != v10) break block31;
                            v11 = var7_7;
                            v12 = var6_6;
                        }
                        var8_8 = v11 - v12;
                        var9_9 = (Integer)var2_1.get(var5_5++) - var8_8;
                        var4_4.replace(var7_7, var7_7 + 1, CN.H(var9_9));
                        var6_6 = var7_7 += var9_9 - 1;
                    }
                    ++var7_7;
                    if (var1_2 == null) continue;
                }
                break;
            }
        } while (var1_2 == null);
    }

    private static String H(int n10) {
        ky_2[] ky_2Array = cr_0.q();
        int n11 = n10;
        if (ky_2Array == null) {
            if (n11 < CN.a(26068, 6157992523702062304L)) {
                return CN.a(-24599, 19150).substring(0, n10);
            }
            n11 = n10;
        }
        char[] cArray = new char[n11];
        Arrays.fill(cArray, (char)CN.a(15299, 3424586755954643710L));
        return String.valueOf(cArray);
    }

    @Override
    public void close() throws IOException {
        Writer writer;
        block10: {
            block11: {
                ky_2[] ky_2Array;
                block8: {
                    block9: {
                        ky_2Array = cr_0.q();
                        try {
                            try {
                                writer = this;
                                if (ky_2Array != null) break block8;
                                if (writer.I == null) break block9;
                            }
                            catch (IOException iOException) {
                                throw CN.a(iOException);
                            }
                            this.K();
                        }
                        catch (IOException iOException) {
                            throw CN.a(iOException);
                        }
                    }
                    writer = this;
                }
                try {
                    try {
                        if (ky_2Array != null) break block10;
                        if (writer.V.length() <= 0) break block11;
                    }
                    catch (IOException iOException) {
                        throw CN.a(iOException);
                    }
                    this.O(this.V.toString());
                }
                catch (IOException iOException) {
                    throw CN.a(iOException);
                }
            }
            writer = this.out;
        }
        ((Writer)writer).close();
    }

    @Override
    public void flush() throws IOException {
        Writer writer;
        block10: {
            block11: {
                ky_2[] ky_2Array;
                block8: {
                    block9: {
                        ky_2Array = cr_0.q();
                        try {
                            try {
                                writer = this;
                                if (ky_2Array != null) break block8;
                                if (writer.I == null) break block9;
                            }
                            catch (IOException iOException) {
                                throw CN.a(iOException);
                            }
                            this.K();
                        }
                        catch (IOException iOException) {
                            throw CN.a(iOException);
                        }
                    }
                    writer = this;
                }
                try {
                    try {
                        if (ky_2Array != null) break block10;
                        if (writer.V.length() <= 0) break block11;
                    }
                    catch (IOException iOException) {
                        throw CN.a(iOException);
                    }
                    this.O(this.V.toString());
                    this.V.setLength(0);
                }
                catch (IOException iOException) {
                    throw CN.a(iOException);
                }
            }
            writer = this.out;
        }
        ((Writer)writer).flush();
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
                        var10_2 = "\u00d2\u001e\u000f\u0018\u001e\u001d\u00e7\u00f6'\u0007+=p\n[\u009a\u00b2\u009c\u008b\u0086\u00dc\u0085@i\u00c7\u00f0\u00ed\u00b3\u00e8\u00ad\u00c4zEZ\u0005\u0002\u00cf\u001d";
                        var12_3 = "\u00d2\u001e\u000f\u0018\u001e\u001d\u00e7\u00f6'\u0007+=p\n[\u009a\u00b2\u009c\u008b\u0086\u00dc\u0085@i\u00c7\u00f0\u00ed\u00b3\u00e8\u00ad\u00c4zEZ\u0005\u0002\u00cf\u001d".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 53;
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
                            var10_2 = "\u0016\u00d6\u0004L\u0091\u00e0\u00d5";
                            var12_3 = "\u0016\u00d6\u0004L\u0091\u00e0\u00d5".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 71;
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
                                    v15 = 5;
                                    break;
                                }
                                case 1: {
                                    v15 = 123;
                                    break;
                                }
                                case 2: {
                                    v15 = 98;
                                    break;
                                }
                                case 3: {
                                    v15 = 35;
                                    break;
                                }
                                case 4: {
                                    v15 = 2;
                                    break;
                                }
                                case 5: {
                                    v15 = 60;
                                    break;
                                }
                                default: {
                                    v15 = 10;
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
                CN.a = var13;
                CN.b = new String[5];
                var0_7 = 8594865829780194031L;
                var6_8 = new long[13];
                var3_9 = 0;
                var4_10 = "\u001f\u00e2\u00e4\u0001\u00ac\u00f4\u00ce\u0011\u0085&0\u00e7\u00c7x\u00dd\u00efB\u00fb\u00a3\u001c\u0095\u00da5T\u00e5\u00e9\u00bc\u00a7\u00b0+\u00ecE\u009d\u00aa\u0091\u00e3\u00bf\u009c\u00ef\u0005\u0085\b>\u008fS\u0089\u001cP\u00a9\u0087k\u008a\u00f5\u0080\u00f6\u0004\u00f0\u00c2\u0093\u00f3\u008a\u0095\u001f7\u00a2\u00f0\u00cd\u00b26K\u009d\u0092\u0088\u00bf\u0003\u00ac\u00e7\u001e\u00101+A\u00cfl\u0005X}%";
                var5_11 = "\u001f\u00e2\u00e4\u0001\u00ac\u00f4\u00ce\u0011\u0085&0\u00e7\u00c7x\u00dd\u00efB\u00fb\u00a3\u001c\u0095\u00da5T\u00e5\u00e9\u00bc\u00a7\u00b0+\u00ecE\u009d\u00aa\u0091\u00e3\u00bf\u009c\u00ef\u0005\u0085\b>\u008fS\u0089\u001cP\u00a9\u0087k\u008a\u00f5\u0080\u00f6\u0004\u00f0\u00c2\u0093\u00f3\u008a\u0095\u001f7\u00a2\u00f0\u00cd\u00b26K\u009d\u0092\u0088\u00bf\u0003\u00ac\u00e7\u001e\u00101+A\u00cfl\u0005X}%".length();
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
                    var4_10 = "\u00ed\u00d0\u00ab!\u00b3\u00e5\u008d\u00d6B{\u00bd5|\u00ff\u00ec\u00a5";
                    var5_11 = "\u00ed\u00d0\u00ab!\u00b3\u00e5\u008d\u00d6B{\u00bd5|\u00ff\u00ec\u00a5".length();
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
        CN.c = var6_8;
        CN.d = new Integer[13];
        CN.j = CN.class.desiredAssertionStatus() == false;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9FE8) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 26;
                    break;
                }
                case 1: {
                    n14 = 232;
                    break;
                }
                case 2: {
                    n14 = 231;
                    break;
                }
                case 3: {
                    n14 = 243;
                    break;
                }
                case 4: {
                    n14 = 72;
                    break;
                }
                case 5: {
                    n14 = 67;
                    break;
                }
                case 6: {
                    n14 = 96;
                    break;
                }
                case 7: {
                    n14 = 75;
                    break;
                }
                case 8: {
                    n14 = 139;
                    break;
                }
                case 9: {
                    n14 = 154;
                    break;
                }
                case 10: {
                    n14 = 208;
                    break;
                }
                case 11: {
                    n14 = 113;
                    break;
                }
                case 12: {
                    n14 = 235;
                    break;
                }
                case 13: {
                    n14 = 169;
                    break;
                }
                case 14: {
                    n14 = 255;
                    break;
                }
                case 15: {
                    n14 = 59;
                    break;
                }
                case 16: {
                    n14 = 173;
                    break;
                }
                case 17: {
                    n14 = 103;
                    break;
                }
                case 18: {
                    n14 = 10;
                    break;
                }
                case 19: {
                    n14 = 185;
                    break;
                }
                case 20: {
                    n14 = 181;
                    break;
                }
                case 21: {
                    n14 = 146;
                    break;
                }
                case 22: {
                    n14 = 155;
                    break;
                }
                case 23: {
                    n14 = 200;
                    break;
                }
                case 24: {
                    n14 = 217;
                    break;
                }
                case 25: {
                    n14 = 99;
                    break;
                }
                case 26: {
                    n14 = 24;
                    break;
                }
                case 27: {
                    n14 = 148;
                    break;
                }
                case 28: {
                    n14 = 65;
                    break;
                }
                case 29: {
                    n14 = 44;
                    break;
                }
                case 30: {
                    n14 = 131;
                    break;
                }
                case 31: {
                    n14 = 174;
                    break;
                }
                case 32: {
                    n14 = 43;
                    break;
                }
                case 33: {
                    n14 = 248;
                    break;
                }
                case 34: {
                    n14 = 149;
                    break;
                }
                case 35: {
                    n14 = 83;
                    break;
                }
                case 36: {
                    n14 = 202;
                    break;
                }
                case 37: {
                    n14 = 78;
                    break;
                }
                case 38: {
                    n14 = 176;
                    break;
                }
                case 39: {
                    n14 = 84;
                    break;
                }
                case 40: {
                    n14 = 125;
                    break;
                }
                case 41: {
                    n14 = 1;
                    break;
                }
                case 42: {
                    n14 = 81;
                    break;
                }
                case 43: {
                    n14 = 68;
                    break;
                }
                case 44: {
                    n14 = 2;
                    break;
                }
                case 45: {
                    n14 = 193;
                    break;
                }
                case 46: {
                    n14 = 112;
                    break;
                }
                case 47: {
                    n14 = 143;
                    break;
                }
                case 48: {
                    n14 = 219;
                    break;
                }
                case 49: {
                    n14 = 77;
                    break;
                }
                case 50: {
                    n14 = 106;
                    break;
                }
                case 51: {
                    n14 = 8;
                    break;
                }
                case 52: {
                    n14 = 108;
                    break;
                }
                case 53: {
                    n14 = 46;
                    break;
                }
                case 54: {
                    n14 = 105;
                    break;
                }
                case 55: {
                    n14 = 54;
                    break;
                }
                case 56: {
                    n14 = 244;
                    break;
                }
                case 57: {
                    n14 = 230;
                    break;
                }
                case 58: {
                    n14 = 57;
                    break;
                }
                case 59: {
                    n14 = 114;
                    break;
                }
                case 60: {
                    n14 = 66;
                    break;
                }
                case 61: {
                    n14 = 153;
                    break;
                }
                case 62: {
                    n14 = 167;
                    break;
                }
                case 63: {
                    n14 = 211;
                    break;
                }
                case 64: {
                    n14 = 90;
                    break;
                }
                case 65: {
                    n14 = 115;
                    break;
                }
                case 66: {
                    n14 = 21;
                    break;
                }
                case 67: {
                    n14 = 189;
                    break;
                }
                case 68: {
                    n14 = 213;
                    break;
                }
                case 69: {
                    n14 = 150;
                    break;
                }
                case 70: {
                    n14 = 119;
                    break;
                }
                case 71: {
                    n14 = 135;
                    break;
                }
                case 72: {
                    n14 = 22;
                    break;
                }
                case 73: {
                    n14 = 170;
                    break;
                }
                case 74: {
                    n14 = 118;
                    break;
                }
                case 75: {
                    n14 = 15;
                    break;
                }
                case 76: {
                    n14 = 34;
                    break;
                }
                case 77: {
                    n14 = 175;
                    break;
                }
                case 78: {
                    n14 = 207;
                    break;
                }
                case 79: {
                    n14 = 48;
                    break;
                }
                case 80: {
                    n14 = 95;
                    break;
                }
                case 81: {
                    n14 = 206;
                    break;
                }
                case 82: {
                    n14 = 134;
                    break;
                }
                case 83: {
                    n14 = 109;
                    break;
                }
                case 84: {
                    n14 = 151;
                    break;
                }
                case 85: {
                    n14 = 236;
                    break;
                }
                case 86: {
                    n14 = 247;
                    break;
                }
                case 87: {
                    n14 = 4;
                    break;
                }
                case 88: {
                    n14 = 98;
                    break;
                }
                case 89: {
                    n14 = 25;
                    break;
                }
                case 90: {
                    n14 = 215;
                    break;
                }
                case 91: {
                    n14 = 91;
                    break;
                }
                case 92: {
                    n14 = 172;
                    break;
                }
                case 93: {
                    n14 = 188;
                    break;
                }
                case 94: {
                    n14 = 100;
                    break;
                }
                case 95: {
                    n14 = 201;
                    break;
                }
                case 96: {
                    n14 = 156;
                    break;
                }
                case 97: {
                    n14 = 199;
                    break;
                }
                case 98: {
                    n14 = 102;
                    break;
                }
                case 99: {
                    n14 = 123;
                    break;
                }
                case 100: {
                    n14 = 0;
                    break;
                }
                case 101: {
                    n14 = 144;
                    break;
                }
                case 102: {
                    n14 = 92;
                    break;
                }
                case 103: {
                    n14 = 110;
                    break;
                }
                case 104: {
                    n14 = 137;
                    break;
                }
                case 105: {
                    n14 = 210;
                    break;
                }
                case 106: {
                    n14 = 11;
                    break;
                }
                case 107: {
                    n14 = 71;
                    break;
                }
                case 108: {
                    n14 = 205;
                    break;
                }
                case 109: {
                    n14 = 198;
                    break;
                }
                case 110: {
                    n14 = 127;
                    break;
                }
                case 111: {
                    n14 = 241;
                    break;
                }
                case 112: {
                    n14 = 51;
                    break;
                }
                case 113: {
                    n14 = 234;
                    break;
                }
                case 114: {
                    n14 = 182;
                    break;
                }
                case 115: {
                    n14 = 6;
                    break;
                }
                case 116: {
                    n14 = 31;
                    break;
                }
                case 117: {
                    n14 = 224;
                    break;
                }
                case 118: {
                    n14 = 142;
                    break;
                }
                case 119: {
                    n14 = 93;
                    break;
                }
                case 120: {
                    n14 = 35;
                    break;
                }
                case 121: {
                    n14 = 147;
                    break;
                }
                case 122: {
                    n14 = 33;
                    break;
                }
                case 123: {
                    n14 = 225;
                    break;
                }
                case 124: {
                    n14 = 55;
                    break;
                }
                case 125: {
                    n14 = 3;
                    break;
                }
                case 126: {
                    n14 = 204;
                    break;
                }
                case 127: {
                    n14 = 13;
                    break;
                }
                case 128: {
                    n14 = 88;
                    break;
                }
                case 129: {
                    n14 = 58;
                    break;
                }
                case 130: {
                    n14 = 101;
                    break;
                }
                case 131: {
                    n14 = 128;
                    break;
                }
                case 132: {
                    n14 = 228;
                    break;
                }
                case 133: {
                    n14 = 120;
                    break;
                }
                case 134: {
                    n14 = 253;
                    break;
                }
                case 135: {
                    n14 = 19;
                    break;
                }
                case 136: {
                    n14 = 121;
                    break;
                }
                case 137: {
                    n14 = 184;
                    break;
                }
                case 138: {
                    n14 = 152;
                    break;
                }
                case 139: {
                    n14 = 14;
                    break;
                }
                case 140: {
                    n14 = 104;
                    break;
                }
                case 141: {
                    n14 = 45;
                    break;
                }
                case 142: {
                    n14 = 30;
                    break;
                }
                case 143: {
                    n14 = 180;
                    break;
                }
                case 144: {
                    n14 = 195;
                    break;
                }
                case 145: {
                    n14 = 40;
                    break;
                }
                case 146: {
                    n14 = 27;
                    break;
                }
                case 147: {
                    n14 = 252;
                    break;
                }
                case 148: {
                    n14 = 250;
                    break;
                }
                case 149: {
                    n14 = 63;
                    break;
                }
                case 150: {
                    n14 = 229;
                    break;
                }
                case 151: {
                    n14 = 36;
                    break;
                }
                case 152: {
                    n14 = 61;
                    break;
                }
                case 153: {
                    n14 = 28;
                    break;
                }
                case 154: {
                    n14 = 52;
                    break;
                }
                case 155: {
                    n14 = 74;
                    break;
                }
                case 156: {
                    n14 = 196;
                    break;
                }
                case 157: {
                    n14 = 7;
                    break;
                }
                case 158: {
                    n14 = 233;
                    break;
                }
                case 159: {
                    n14 = 17;
                    break;
                }
                case 160: {
                    n14 = 39;
                    break;
                }
                case 161: {
                    n14 = 86;
                    break;
                }
                case 162: {
                    n14 = 242;
                    break;
                }
                case 163: {
                    n14 = 221;
                    break;
                }
                case 164: {
                    n14 = 122;
                    break;
                }
                case 165: {
                    n14 = 168;
                    break;
                }
                case 166: {
                    n14 = 237;
                    break;
                }
                case 167: {
                    n14 = 159;
                    break;
                }
                case 168: {
                    n14 = 214;
                    break;
                }
                case 169: {
                    n14 = 97;
                    break;
                }
                case 170: {
                    n14 = 85;
                    break;
                }
                case 171: {
                    n14 = 69;
                    break;
                }
                case 172: {
                    n14 = 116;
                    break;
                }
                case 173: {
                    n14 = 132;
                    break;
                }
                case 174: {
                    n14 = 223;
                    break;
                }
                case 175: {
                    n14 = 163;
                    break;
                }
                case 176: {
                    n14 = 29;
                    break;
                }
                case 177: {
                    n14 = 227;
                    break;
                }
                case 178: {
                    n14 = 212;
                    break;
                }
                case 179: {
                    n14 = 130;
                    break;
                }
                case 180: {
                    n14 = 171;
                    break;
                }
                case 181: {
                    n14 = 183;
                    break;
                }
                case 182: {
                    n14 = 62;
                    break;
                }
                case 183: {
                    n14 = 216;
                    break;
                }
                case 184: {
                    n14 = 178;
                    break;
                }
                case 185: {
                    n14 = 190;
                    break;
                }
                case 186: {
                    n14 = 246;
                    break;
                }
                case 187: {
                    n14 = 166;
                    break;
                }
                case 188: {
                    n14 = 136;
                    break;
                }
                case 189: {
                    n14 = 49;
                    break;
                }
                case 190: {
                    n14 = 60;
                    break;
                }
                case 191: {
                    n14 = 79;
                    break;
                }
                case 192: {
                    n14 = 203;
                    break;
                }
                case 193: {
                    n14 = 38;
                    break;
                }
                case 194: {
                    n14 = 222;
                    break;
                }
                case 195: {
                    n14 = 76;
                    break;
                }
                case 196: {
                    n14 = 70;
                    break;
                }
                case 197: {
                    n14 = 138;
                    break;
                }
                case 198: {
                    n14 = 140;
                    break;
                }
                case 199: {
                    n14 = 111;
                    break;
                }
                case 200: {
                    n14 = 16;
                    break;
                }
                case 201: {
                    n14 = 9;
                    break;
                }
                case 202: {
                    n14 = 37;
                    break;
                }
                case 203: {
                    n14 = 47;
                    break;
                }
                case 204: {
                    n14 = 50;
                    break;
                }
                case 205: {
                    n14 = 18;
                    break;
                }
                case 206: {
                    n14 = 80;
                    break;
                }
                case 207: {
                    n14 = 73;
                    break;
                }
                case 208: {
                    n14 = 194;
                    break;
                }
                case 209: {
                    n14 = 56;
                    break;
                }
                case 210: {
                    n14 = 23;
                    break;
                }
                case 211: {
                    n14 = 251;
                    break;
                }
                case 212: {
                    n14 = 53;
                    break;
                }
                case 213: {
                    n14 = 5;
                    break;
                }
                case 214: {
                    n14 = 64;
                    break;
                }
                case 215: {
                    n14 = 129;
                    break;
                }
                case 216: {
                    n14 = 220;
                    break;
                }
                case 217: {
                    n14 = 226;
                    break;
                }
                case 218: {
                    n14 = 186;
                    break;
                }
                case 219: {
                    n14 = 160;
                    break;
                }
                case 220: {
                    n14 = 240;
                    break;
                }
                case 221: {
                    n14 = 245;
                    break;
                }
                case 222: {
                    n14 = 133;
                    break;
                }
                case 223: {
                    n14 = 157;
                    break;
                }
                case 224: {
                    n14 = 20;
                    break;
                }
                case 225: {
                    n14 = 126;
                    break;
                }
                case 226: {
                    n14 = 164;
                    break;
                }
                case 227: {
                    n14 = 82;
                    break;
                }
                case 228: {
                    n14 = 107;
                    break;
                }
                case 229: {
                    n14 = 117;
                    break;
                }
                case 230: {
                    n14 = 89;
                    break;
                }
                case 231: {
                    n14 = 161;
                    break;
                }
                case 232: {
                    n14 = 254;
                    break;
                }
                case 233: {
                    n14 = 94;
                    break;
                }
                case 234: {
                    n14 = 41;
                    break;
                }
                case 235: {
                    n14 = 187;
                    break;
                }
                case 236: {
                    n14 = 218;
                    break;
                }
                case 237: {
                    n14 = 158;
                    break;
                }
                case 238: {
                    n14 = 209;
                    break;
                }
                case 239: {
                    n14 = 239;
                    break;
                }
                case 240: {
                    n14 = 162;
                    break;
                }
                case 241: {
                    n14 = 177;
                    break;
                }
                case 242: {
                    n14 = 124;
                    break;
                }
                case 243: {
                    n14 = 192;
                    break;
                }
                case 244: {
                    n14 = 179;
                    break;
                }
                case 245: {
                    n14 = 191;
                    break;
                }
                case 246: {
                    n14 = 238;
                    break;
                }
                case 247: {
                    n14 = 165;
                    break;
                }
                case 248: {
                    n14 = 42;
                    break;
                }
                case 249: {
                    n14 = 32;
                    break;
                }
                case 250: {
                    n14 = 141;
                    break;
                }
                case 251: {
                    n14 = 145;
                    break;
                }
                case 252: {
                    n14 = 197;
                    break;
                }
                case 253: {
                    n14 = 87;
                    break;
                }
                case 254: {
                    n14 = 12;
                    break;
                }
                default: {
                    n14 = 249;
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
            CN.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2934;
        if (d[n11] == null) {
            CN.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

