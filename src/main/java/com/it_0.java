/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/*
 * Renamed from com.It
 */
public class it_0
extends CharsetDecoder {
    private static final Charset u;
    private static final long[] a;
    private static final Integer[] b;

    public it_0() {
        super(u, 1.0f, 1.0f);
    }

    private static boolean W(int n10) {
        int n11;
        block4: {
            block5: {
                int n12 = ph_0.u();
                try {
                    try {
                        n11 = n10 & it_0.a(8707, 5640569001972983768L);
                        if (n12 != 0) break block4;
                        if (n11 == it_0.a(8296, 5733026253764912572L)) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw it_0.a(illegalStateException);
                    }
                    n11 = 1;
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw it_0.a(illegalStateException);
                }
            }
            n11 = 0;
        }
        return n11 != 0;
    }

    private static boolean Z(int n10, int n11) {
        int n12;
        block8: {
            block10: {
                int n13 = ph_0.u();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    n12 = n10 & it_0.a(2029, 9032255608650973739L);
                                    if (n13 != 0) break block8;
                                    if (n12 == 0) break block9;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw it_0.a(illegalStateException);
                                }
                                n12 = n11 & it_0.a(21563, 3772220203294626276L);
                                if (n13 != 0) break block8;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw it_0.a(illegalStateException);
                            }
                            if (n12 == it_0.a(23539, 5744213696562601506L)) break block10;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw it_0.a(illegalStateException);
                        }
                    }
                    n12 = 1;
                    break block8;
                }
                catch (IllegalStateException illegalStateException) {
                    throw it_0.a(illegalStateException);
                }
            }
            n12 = 0;
        }
        return n12 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean h(int n10, int n11, int n12) {
        int n13;
        int n14;
        int n15;
        block16: {
            n15 = ph_0.u();
            try {
                try {
                    block17: {
                        try {
                            try {
                                try {
                                    n14 = n10;
                                    n13 = it_0.a(88, 1176755569841390989L);
                                    if (n15 != 0) break block16;
                                    if (n14 != n13) break block17;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw it_0.a(illegalStateException);
                                }
                                n14 = n11 & it_0.a(24238, 1235635795861609310L);
                                if (n15 != 0) return n14 != 0;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw it_0.a(illegalStateException);
                            }
                            if (n14 == it_0.a(8296, 5733026253764912572L)) return 1 != 0;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw it_0.a(illegalStateException);
                        }
                    }
                    n14 = n11 & it_0.a(8707, 5640569001972983768L);
                    if (n15 != 0) return n14 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw it_0.a(illegalStateException);
                }
                n13 = it_0.a(8296, 5733026253764912572L);
            }
            catch (IllegalStateException illegalStateException) {
                throw it_0.a(illegalStateException);
            }
        }
        try {
            try {
                try {
                    if (n14 != n13) return 1 != 0;
                    n14 = n12 & it_0.a(8707, 5640569001972983768L);
                    if (n15 != 0) return n14 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw it_0.a(illegalStateException);
                }
                if (n14 == it_0.a(8296, 5733026253764912572L)) return 0 != 0;
                return 1 != 0;
            }
            catch (IllegalStateException illegalStateException) {
                throw it_0.a(illegalStateException);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw it_0.a(illegalStateException);
        }
    }

    private static boolean S(int n10, int n11, int n12) {
        int n13;
        block12: {
            block14: {
                int n14 = ph_0.w();
                try {
                    block13: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            n13 = n10 & it_0.a(8707, 5640569001972983768L);
                                            if (n14 == 0) break block12;
                                            if (n13 != it_0.a(8296, 5733026253764912572L)) break block13;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw it_0.a(illegalStateException);
                                        }
                                        n13 = n11 & it_0.a(8707, 5640569001972983768L);
                                        if (n14 == 0) break block12;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw it_0.a(illegalStateException);
                                    }
                                    if (n13 != it_0.a(8296, 5733026253764912572L)) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw it_0.a(illegalStateException);
                                }
                                n13 = n12 & it_0.a(8707, 5640569001972983768L);
                                if (n14 == 0) break block12;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw it_0.a(illegalStateException);
                            }
                            if (n13 == it_0.a(8296, 5733026253764912572L)) break block14;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw it_0.a(illegalStateException);
                        }
                    }
                    n13 = 1;
                    break block12;
                }
                catch (IllegalStateException illegalStateException) {
                    throw it_0.a(illegalStateException);
                }
            }
            n13 = 0;
        }
        return n13 != 0;
    }

    private static CoderResult S(ByteBuffer byteBuffer, int n10) {
        int n11;
        block5: {
            int n12 = ph_0.u();
            for (int i2 = 1; i2 < n10; ++i2) {
                int n13;
                block6: {
                    try {
                        try {
                            n11 = it_0.W(byteBuffer.get()) ? 1 : 0;
                            if (n12 != 0) break block5;
                            if (n12 != 0) break block6;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw it_0.a(illegalStateException);
                        }
                        if (n11 == 0) continue;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw it_0.a(illegalStateException);
                    }
                    n13 = i2;
                }
                return CoderResult.malformedForLength(n13);
            }
            n11 = n10;
        }
        return CoderResult.malformedForLength(n11);
    }

    /*
     * Exception decompiling
     */
    public static CoderResult H(ByteBuffer var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 30[SWITCH]
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

    private static CoderResult i(ByteBuffer byteBuffer, int n10, CharBuffer charBuffer, int n11, int n12) {
        byteBuffer.position(n10 - byteBuffer.arrayOffset());
        CoderResult coderResult = it_0.H(byteBuffer, n12);
        byteBuffer.position(n10);
        charBuffer.position(n11);
        return coderResult;
    }

    /*
     * Unable to fully structure code
     */
    private static CoderResult w(Buffer var0, int var1_1, int var2_2, Buffer var3_3, int var4_4, int var5_5) {
        block9: {
            block8: {
                block7: {
                    v0 = ph_0.w();
                    var0.position(var1_1);
                    var3_3.position(var4_4);
                    var6_6 = v0;
                    try {
                        try {
                            v1 = var5_5;
                            if (var6_6 == 0) break block7;
                            if (v1 != 0) {
                            }
                            ** GOTO lbl23
                        }
                        catch (IllegalStateException v2) {
                            throw it_0.a(v2);
                        }
                        v1 = var2_2 - var1_1;
                    }
                    catch (IllegalStateException v3) {
                        throw it_0.a(v3);
                    }
                }
                try {
                    if (v1 >= var5_5) break block8;
lbl23:
                    // 2 sources

                    v4 = CoderResult.UNDERFLOW;
                    break block9;
                }
                catch (IllegalStateException v5) {
                    throw it_0.a(v5);
                }
            }
            v4 = CoderResult.OVERFLOW;
        }
        return v4;
    }

    /*
     * Unable to fully structure code
     */
    private CoderResult W(ByteBuffer var1_1, CharBuffer var2_2) {
        var4_3 = var1_1.array();
        var5_4 = var1_1.arrayOffset() + var1_1.position();
        var6_5 = var1_1.arrayOffset() + var1_1.limit();
        var3_6 = ph_0.w();
        var7_7 = var2_2.array();
        var8_8 = var2_2.arrayOffset() + var2_2.position();
        var9_9 = var2_2.arrayOffset() + var2_2.limit();
        var10_10 = var8_8 + Math.min(var6_5 - var5_4, var9_9 - var8_8);
        while (var8_8 < var10_10) {
            try {
                try {
                    try {
                        v0 = var4_3[var5_4];
                        if (var3_6 != 0 && var3_6 != 0) {
                        }
                        ** GOTO lbl30
                    }
                    catch (IllegalStateException v1) {
                        throw it_0.a(v1);
                    }
                    if (v0 < 0) break;
                }
                catch (IllegalStateException v2) {
                    throw it_0.a(v2);
                }
                var7_7[var8_8++] = (char)var4_3[var5_4++];
                if (var3_6 != 0) continue;
                break;
            }
            catch (IllegalStateException v3) {
                throw it_0.a(v3);
            }
        }
        do {
            block109: {
                block108: {
                    block107: {
                        block105: {
                            block106: {
                                block104: {
                                    block103: {
                                        block97: {
                                            block101: {
                                                block102: {
                                                    block99: {
                                                        block100: {
                                                            block98: {
                                                                block91: {
                                                                    block95: {
                                                                        block96: {
                                                                            block93: {
                                                                                block94: {
                                                                                    block92: {
                                                                                        block89: {
                                                                                            block90: {
                                                                                                v0 = var5_4;
lbl30:
                                                                                                // 2 sources

                                                                                                if (v0 >= var6_5) break;
                                                                                                var11_11 = var4_3[var5_4];
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v4 = var11_11;
                                                                                                            if (var3_6 == 0) break block89;
                                                                                                            if (v4 >= 0) {
                                                                                                            }
                                                                                                            ** GOTO lbl54
                                                                                                        }
                                                                                                        catch (IllegalStateException v5) {
                                                                                                            throw it_0.a(v5);
                                                                                                        }
                                                                                                        if (var8_8 < var9_9) break block90;
                                                                                                    }
                                                                                                    catch (IllegalStateException v6) {
                                                                                                        throw it_0.a(v6);
                                                                                                    }
                                                                                                    return it_0.w(var1_1, var5_4, var6_5, var2_2, var8_8, 1);
                                                                                                }
                                                                                                catch (IllegalStateException v7) {
                                                                                                    throw it_0.a(v7);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                var7_7[var8_8++] = (char)var11_11;
                                                                                                ++var5_4;
                                                                                                if (var3_6 != 0) continue;
lbl54:
                                                                                                // 2 sources

                                                                                                v4 = var11_11 >> 5;
                                                                                            }
                                                                                            catch (IllegalStateException v8) {
                                                                                                throw it_0.a(v8);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v9 = it_0.a(15647, 4803671133061904596L);
                                                                                                            if (var3_6 == 0) break block91;
                                                                                                            if (v4 == v9) {
                                                                                                            }
                                                                                                            ** GOTO lbl117
                                                                                                        }
                                                                                                        catch (IllegalStateException v10) {
                                                                                                            throw it_0.a(v10);
                                                                                                        }
                                                                                                        v11 = var6_5 - var5_4;
                                                                                                        v12 = 2;
                                                                                                        if (var3_6 == 0) break block92;
                                                                                                    }
                                                                                                    catch (IllegalStateException v13) {
                                                                                                        throw it_0.a(v13);
                                                                                                    }
                                                                                                    if (v11 >= v12) {
                                                                                                    }
                                                                                                    ** GOTO lbl94
                                                                                                }
                                                                                                catch (IllegalStateException v14) {
                                                                                                    throw it_0.a(v14);
                                                                                                }
                                                                                                v11 = var8_8;
                                                                                                if (var3_6 == 0) break block93;
                                                                                            }
                                                                                            catch (IllegalStateException v15) {
                                                                                                throw it_0.a(v15);
                                                                                            }
                                                                                            v12 = var9_9;
                                                                                        }
                                                                                        catch (IllegalStateException v16) {
                                                                                            throw it_0.a(v16);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (v11 < v12) break block94;
lbl94:
                                                                                        // 2 sources

                                                                                        return it_0.w(var1_1, var5_4, var6_5, var2_2, var8_8, 2);
                                                                                    }
                                                                                    catch (IllegalStateException v17) {
                                                                                        throw it_0.a(v17);
                                                                                    }
                                                                                }
                                                                                v11 = var4_3[var5_4 + 1];
                                                                            }
                                                                            var12_12 = v11;
                                                                            try {
                                                                                try {
                                                                                    if (var3_6 == 0) break block95;
                                                                                    if (!it_0.Z(var11_11, var12_12)) break block96;
                                                                                }
                                                                                catch (IllegalStateException v18) {
                                                                                    throw it_0.a(v18);
                                                                                }
                                                                                return it_0.i(var1_1, var5_4, var2_2, var8_8, 2);
                                                                            }
                                                                            catch (IllegalStateException v19) {
                                                                                throw it_0.a(v19);
                                                                            }
                                                                        }
                                                                        var7_7[var8_8++] = (char)(var11_11 << it_0.a(8813, 4546494998168659887L) ^ var12_12 ^ it_0.a(16946, 5115772163159492576L));
                                                                        var5_4 += 2;
                                                                    }
                                                                    try {
                                                                        if (var3_6 != 0) continue;
lbl117:
                                                                        // 2 sources

                                                                        v4 = var11_11 >> 4;
                                                                        v9 = it_0.a(15433, 5708499754881055114L);
                                                                    }
                                                                    catch (IllegalStateException v20) {
                                                                        throw it_0.a(v20);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var3_6 == 0) break block97;
                                                                                    if (v4 == v9) {
                                                                                    }
                                                                                    ** GOTO lbl181
                                                                                }
                                                                                catch (IllegalStateException v21) {
                                                                                    throw it_0.a(v21);
                                                                                }
                                                                                v22 = var6_5 - var5_4;
                                                                                v23 = 3;
                                                                                if (var3_6 == 0) break block98;
                                                                            }
                                                                            catch (IllegalStateException v24) {
                                                                                throw it_0.a(v24);
                                                                            }
                                                                            if (v22 >= v23) {
                                                                            }
                                                                            ** GOTO lbl157
                                                                        }
                                                                        catch (IllegalStateException v25) {
                                                                            throw it_0.a(v25);
                                                                        }
                                                                        v22 = var8_8;
                                                                        if (var3_6 == 0) break block99;
                                                                    }
                                                                    catch (IllegalStateException v26) {
                                                                        throw it_0.a(v26);
                                                                    }
                                                                    v23 = var9_9;
                                                                }
                                                                catch (IllegalStateException v27) {
                                                                    throw it_0.a(v27);
                                                                }
                                                            }
                                                            try {
                                                                if (v22 < v23) break block100;
lbl157:
                                                                // 2 sources

                                                                return it_0.w(var1_1, var5_4, var6_5, var2_2, var8_8, 3);
                                                            }
                                                            catch (IllegalStateException v28) {
                                                                throw it_0.a(v28);
                                                            }
                                                        }
                                                        v22 = var4_3[var5_4 + 1];
                                                    }
                                                    var12_12 = v22;
                                                    var13_13 = var4_3[var5_4 + 2];
                                                    try {
                                                        try {
                                                            if (var3_6 == 0) break block101;
                                                            if (!it_0.h(var11_11, var12_12, var13_13)) break block102;
                                                        }
                                                        catch (IllegalStateException v29) {
                                                            throw it_0.a(v29);
                                                        }
                                                        return it_0.i(var1_1, var5_4, var2_2, var8_8, 3);
                                                    }
                                                    catch (IllegalStateException v30) {
                                                        throw it_0.a(v30);
                                                    }
                                                }
                                                var7_7[var8_8++] = (char)(var11_11 << it_0.a(2728, 1355975074093977467L) ^ var12_12 << it_0.a(17640, 1998431108112777525L) ^ var13_13 ^ it_0.a(808, 2720115985862411994L));
                                                var5_4 += 3;
                                            }
                                            try {
                                                if (var3_6 != 0) continue;
lbl181:
                                                // 2 sources

                                                v4 = var11_11 >> 3;
                                                v9 = it_0.a(15433, 5708499754881055114L);
                                            }
                                            catch (IllegalStateException v31) {
                                                throw it_0.a(v31);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var3_6 == 0) break block103;
                                                if (v4 == v9) {
                                                }
                                                ** GOTO lbl268
                                            }
                                            catch (IllegalStateException v32) {
                                                throw it_0.a(v32);
                                            }
                                            v4 = var6_5 - var5_4;
                                            v9 = 4;
                                        }
                                        catch (IllegalStateException v33) {
                                            throw it_0.a(v33);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var3_6 == 0) break block104;
                                                if (v4 >= v9) {
                                                }
                                                ** GOTO lbl222
                                            }
                                            catch (IllegalStateException v34) {
                                                throw it_0.a(v34);
                                            }
                                            v4 = var9_9 - var8_8;
                                            if (var3_6 == 0) break block105;
                                        }
                                        catch (IllegalStateException v35) {
                                            throw it_0.a(v35);
                                        }
                                        v9 = 2;
                                    }
                                    catch (IllegalStateException v36) {
                                        throw it_0.a(v36);
                                    }
                                }
                                try {
                                    if (v4 >= v9) break block106;
lbl222:
                                    // 2 sources

                                    return it_0.w(var1_1, var5_4, var6_5, var2_2, var8_8, 4);
                                }
                                catch (IllegalStateException v37) {
                                    throw it_0.a(v37);
                                }
                            }
                            v4 = var4_3[var5_4 + 1];
                        }
                        var12_12 = v4;
                        var13_13 = var4_3[var5_4 + 2];
                        var14_14 = var4_3[var5_4 + 3];
                        var15_15 = (var11_11 & it_0.a(19520, 4529600366636796313L)) << it_0.a(10289, 5720425441236545023L) | (var12_12 & it_0.a(10521, 2428894207635123434L)) << it_0.a(6825, 1539102264642723710L) | (var13_13 & it_0.a(644, 602472008941455180L)) << it_0.a(17640, 1998431108112777525L) | var14_14 & it_0.a(644, 602472008941455180L);
                        try {
                            v38 = it_0.S(var12_12, var13_13, var14_14);
                            if (var3_6 == 0) break block107;
                            if (v38 == 0) {
                            }
                            ** GOTO lbl259
                        }
                        catch (IllegalStateException v39) {
                            throw it_0.a(v39);
                        }
                        v38 = var15_15;
                    }
                    try {
                        try {
                            v40 = it_0.a(26166, 4105422016051586035L);
                            if (var3_6 == 0) break block108;
                            if (v38 >= v40) {
                            }
                            ** GOTO lbl259
                        }
                        catch (IllegalStateException v41) {
                            throw it_0.a(v41);
                        }
                        v38 = var15_15;
                        v40 = it_0.a(31606, 1863921380758339250L);
                    }
                    catch (IllegalStateException v42) {
                        throw it_0.a(v42);
                    }
                }
                try {
                    if (v38 <= v40) break block109;
lbl259:
                    // 3 sources

                    return it_0.i(var1_1, var5_4, var2_2, var8_8, 4);
                }
                catch (IllegalStateException v43) {
                    throw it_0.a(v43);
                }
            }
            try {
                var7_7[var8_8++] = (char)(it_0.a(10524, 7461566744375520490L) | var15_15 - it_0.a(26940, 2563961589195025636L) >> it_0.a(31866, 4586847500837271968L) & it_0.a(9921, 1653736800885662481L));
                var7_7[var8_8++] = (char)(it_0.a(16289, 4138658869057813102L) | var15_15 - it_0.a(26940, 2563961589195025636L) & it_0.a(8330, 8330790010166437243L));
                var5_4 += 4;
                if (var3_6 != 0) continue;
lbl268:
                // 2 sources

                return it_0.i(var1_1, var5_4, var2_2, var8_8, 1);
            }
            catch (IllegalStateException v44) {
                throw it_0.a(v44);
            }
        } while (var3_6 != 0);
        return it_0.w(var1_1, var5_4, var6_5, var2_2, var8_8, 0);
    }

    @Override
    protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        return this.W(byteBuffer, charBuffer);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u0015:w8\u0016".toCharArray();
                v1 = v0.length;
                var9_1 = 0;
                v2 = 75;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var9_1;
                    while (true) {
                        switch (var9_1 % 7) {
                            case 0: {
                                v9 = 11;
                                break;
                            }
                            case 1: {
                                v9 = 37;
                                break;
                            }
                            case 2: {
                                v9 = 122;
                                break;
                            }
                            case 3: {
                                v9 = 94;
                                break;
                            }
                            case 4: {
                                v9 = 101;
                                break;
                            }
                            case 5: {
                                v9 = 116;
                                break;
                            }
                            default: {
                                v9 = 119;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var9_1;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var9_1);
                ** while (true)
                var8 = new String(v10).intern();
                var0_2 = 8793688457472071490L;
                var6_3 = new long[37];
                var3_4 = 0;
                var4_5 = "]\u008a\u00f0#-\u00e7_\"}\u0005\u00fe\u00fd\u00e2\u00b4\u00985V\u00de\u0099\tm\u00d4\u00b7\u00ac*2\u00be\u0017\u00e4\u009fI\u00e0\u00973b\u00f4\u0090(\u008f(\u0018\u00bc\t\u00feH\u0014\b0KL\u009cu\u001a\u00b62~\u00a0$\u0093L\u00e57m/\u0086\u00eb\u0000\"SXn\u00e8\u00f3tx\u00b8\u00e8\u00be\u00b0Z\u00bd\u00c5\\l\u00b8\u00a5{\u00a6K\u000b\u001fr~\u00ce\u00de\u00dc\u00c4Q\u00a3\u0013\u00f2\u009f\u00c6\u007fI\u00bajLJ\u00fe\u00c6f_@\u008a\u00e92\u0085\u00b6\u0088\u00efa\u00d2\u00f5\u00964Vq\u0017\u00c2\u00a2\u009co\u00fd\u00b0\u00eb\u000f\u00f3D3`\u00faQ6\fD0\u00a7\u00b5\u0087\u0092x\u00e3\u00ce\u00d1\u00f6\u00b6F\r;\u0094\u00caT\u00f6\u00a78\u0095w\u00f3\u0000J\u00ad\\i\u00c0\u001a\u00c1,\u00a3ThX\u0096\u000f.g\u00de\u00cd\u00d2\u00c0\u00f4\u00b1H\u009c,8z\u00b7G\u00bd\u00f2\u00a3\"w\u0095\u001fPh\u0011\u00ed\u009cM\u0005\u0001\u00101\u00ba\u00a6Gv\u00b2\u001f\u00b7\u00e5\"\u00e1\u00ae\u0086\u00d0\u0011\u00ba\u00af\u00e4\u00df\u00e78\u00fd\u00a6q,rg\u0093\u00dd9.\u0018\u00d0a<\u00f4\u00a6\u00d6\u0089\u0011\u0085\u001a\u00eb]\u00d4h#\u008e\u0018O\u00c1\u0006<\u001e\u000b;\u0097\u00e4\u00cd\u00ac\f\t\u0005\u00cc\u00fc";
                var5_6 = "]\u008a\u00f0#-\u00e7_\"}\u0005\u00fe\u00fd\u00e2\u00b4\u00985V\u00de\u0099\tm\u00d4\u00b7\u00ac*2\u00be\u0017\u00e4\u009fI\u00e0\u00973b\u00f4\u0090(\u008f(\u0018\u00bc\t\u00feH\u0014\b0KL\u009cu\u001a\u00b62~\u00a0$\u0093L\u00e57m/\u0086\u00eb\u0000\"SXn\u00e8\u00f3tx\u00b8\u00e8\u00be\u00b0Z\u00bd\u00c5\\l\u00b8\u00a5{\u00a6K\u000b\u001fr~\u00ce\u00de\u00dc\u00c4Q\u00a3\u0013\u00f2\u009f\u00c6\u007fI\u00bajLJ\u00fe\u00c6f_@\u008a\u00e92\u0085\u00b6\u0088\u00efa\u00d2\u00f5\u00964Vq\u0017\u00c2\u00a2\u009co\u00fd\u00b0\u00eb\u000f\u00f3D3`\u00faQ6\fD0\u00a7\u00b5\u0087\u0092x\u00e3\u00ce\u00d1\u00f6\u00b6F\r;\u0094\u00caT\u00f6\u00a78\u0095w\u00f3\u0000J\u00ad\\i\u00c0\u001a\u00c1,\u00a3ThX\u0096\u000f.g\u00de\u00cd\u00d2\u00c0\u00f4\u00b1H\u009c,8z\u00b7G\u00bd\u00f2\u00a3\"w\u0095\u001fPh\u0011\u00ed\u009cM\u0005\u0001\u00101\u00ba\u00a6Gv\u00b2\u001f\u00b7\u00e5\"\u00e1\u00ae\u0086\u00d0\u0011\u00ba\u00af\u00e4\u00df\u00e78\u00fd\u00a6q,rg\u0093\u00dd9.\u0018\u00d0a<\u00f4\u00a6\u00d6\u0089\u0011\u0085\u001a\u00eb]\u00d4h#\u008e\u0018O\u00c1\u0006<\u001e\u000b;\u0097\u00e4\u00cd\u00ac\f\t\u0005\u00cc\u00fc".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v11 = var6_3;
                    v12 = var3_4++;
                    v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u009a\u00fe\u00ccN\u0093D\u00b1\u00c6\u00b8;\u0015\u00b0gMc\u00a8";
                    var5_6 = "\u009a\u00fe\u00ccN\u0093D\u00b1\u00c6\u00b8;\u0015\u00b0gMc\u00a8".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v11 = var6_3;
                        v12 = var3_4++;
                        v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_2;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        it_0.a = var6_3;
        it_0.b = new Integer[37];
        it_0.u = Charset.forName(var8);
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x45D2;
        if (b[n11] == null) {
            it_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

