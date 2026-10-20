/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/*
 * Renamed from Oo
 */
public class oo_0
extends CharsetDecoder {
    private static final Charset S;
    private static final long[] a;
    private static final Integer[] b;

    public oo_0() {
        super((Charset)oo_0.S, 1.0f, 1.0f);
    }

    private static boolean x(int n10) {
        int n11;
        block4: {
            block5: {
                ky_2[] ky_2Array = yt_1.c();
                try {
                    try {
                        n11 = n10 & oo_0.a(13208, 689404320959572223L);
                        if (ky_2Array == null) break block4;
                        if (n11 == oo_0.a(5676, 181876239625162051L)) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo_0.a(illegalStateException);
                    }
                    n11 = 1;
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo_0.a(illegalStateException);
                }
            }
            n11 = 0;
        }
        return n11 != 0;
    }

    private static boolean O(int n10, int n11) {
        int n12;
        block8: {
            block10: {
                ky_2[] ky_2Array = yt_1.c();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    n12 = n10 & oo_0.a(27801, 4282155249032525808L);
                                    if (ky_2Array == null) break block8;
                                    if (n12 == 0) break block9;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw oo_0.a(illegalStateException);
                                }
                                n12 = n11 & oo_0.a(13208, 689404320959572223L);
                                if (ky_2Array == null) break block8;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw oo_0.a(illegalStateException);
                            }
                            if (n12 == oo_0.a(5676, 181876239625162051L)) break block10;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw oo_0.a(illegalStateException);
                        }
                    }
                    n12 = 1;
                    break block8;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo_0.a(illegalStateException);
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
    private static boolean J(int n10, int n11, int n12) {
        int n13;
        int n14;
        ky_2[] ky_2Array;
        block16: {
            ky_2Array = yt_1.c();
            try {
                try {
                    block17: {
                        try {
                            try {
                                try {
                                    n14 = n10;
                                    n13 = oo_0.a(17957, 1357216946985426256L);
                                    if (ky_2Array == null) break block16;
                                    if (n14 != n13) break block17;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw oo_0.a(illegalStateException);
                                }
                                n14 = n11 & oo_0.a(11219, 1596815004674797742L);
                                if (ky_2Array == null) return n14 != 0;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw oo_0.a(illegalStateException);
                            }
                            if (n14 == oo_0.a(16366, 6028752449774888082L)) return 1 != 0;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw oo_0.a(illegalStateException);
                        }
                    }
                    n14 = n11 & oo_0.a(29426, 4873890222995827083L);
                    if (ky_2Array == null) return n14 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo_0.a(illegalStateException);
                }
                n13 = oo_0.a(5676, 181876239625162051L);
            }
            catch (IllegalStateException illegalStateException) {
                throw oo_0.a(illegalStateException);
            }
        }
        try {
            try {
                try {
                    if (n14 != n13) return 1 != 0;
                    n14 = n12 & oo_0.a(13208, 689404320959572223L);
                    if (ky_2Array == null) return n14 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo_0.a(illegalStateException);
                }
                if (n14 == oo_0.a(5676, 181876239625162051L)) return 0 != 0;
                return 1 != 0;
            }
            catch (IllegalStateException illegalStateException) {
                throw oo_0.a(illegalStateException);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw oo_0.a(illegalStateException);
        }
    }

    private static boolean g(int n10, int n11, int n12) {
        int n13;
        block12: {
            block14: {
                ky_2[] ky_2Array = yt_1.c();
                try {
                    block13: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            n13 = n10 & oo_0.a(13208, 689404320959572223L);
                                            if (ky_2Array == null) break block12;
                                            if (n13 != oo_0.a(5676, 181876239625162051L)) break block13;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw oo_0.a(illegalStateException);
                                        }
                                        n13 = n11 & oo_0.a(13208, 689404320959572223L);
                                        if (ky_2Array == null) break block12;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw oo_0.a(illegalStateException);
                                    }
                                    if (n13 != oo_0.a(5676, 181876239625162051L)) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw oo_0.a(illegalStateException);
                                }
                                n13 = n12 & oo_0.a(13208, 689404320959572223L);
                                if (ky_2Array == null) break block12;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw oo_0.a(illegalStateException);
                            }
                            if (n13 == oo_0.a(5676, 181876239625162051L)) break block14;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw oo_0.a(illegalStateException);
                        }
                    }
                    n13 = 1;
                    break block12;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo_0.a(illegalStateException);
                }
            }
            n13 = 0;
        }
        return n13 != 0;
    }

    private static CoderResult s(ByteBuffer byteBuffer, int n10) {
        int n11;
        block7: {
            ky_2[] ky_2Array = yt_1.c();
            for (int i2 = 1; i2 < n10; ++i2) {
                int n12;
                block8: {
                    try {
                        try {
                            try {
                                n11 = ((Boolean)oo_0.x((int)byteBuffer.get())).booleanValue() ? 1 : 0;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (ky_2Array == null) break block7;
                            if (ky_2Array == null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw oo_0.a(illegalStateException);
                        }
                        if (n11 == 0) continue;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo_0.a(illegalStateException);
                    }
                    n12 = i2;
                }
                return CoderResult.malformedForLength(n12);
            }
            n11 = n10;
        }
        return CoderResult.malformedForLength(n11);
    }

    /*
     * Exception decompiling
     */
    public static CoderResult k(ByteBuffer var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 35[SWITCH]
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

    private static CoderResult Z(ByteBuffer byteBuffer, int n10, CharBuffer charBuffer, int n11, int n12) {
        CoderResult coderResult;
        byteBuffer.position(n10 - byteBuffer.arrayOffset());
        try {
            coderResult = (CoderResult)oo_0.k((Object)byteBuffer, n12);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        CoderResult coderResult2 = coderResult;
        try {
            oo_0.j((Object)byteBuffer, n10, (Object)charBuffer, n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return coderResult2;
    }

    /*
     * Unable to fully structure code
     */
    private static CoderResult G(Buffer var0, int var1_1, int var2_2, Buffer var3_3, int var4_4, int var5_5) {
        block11: {
            block10: {
                block9: {
                    v0 = yt_1.c();
                    try {
                        oo_0.j((Object)var0, var1_1, (Object)var3_3, var4_4);
                    }
                    catch (InvocationTargetException v1) {
                        throw v1.getTargetException();
                    }
                    var6_6 = v0;
                    try {
                        try {
                            v2 = var5_5;
                            if (var6_6 == null) break block9;
                            if (v2 != 0) {
                            }
                            ** GOTO lbl25
                        }
                        catch (IllegalStateException v3) {
                            throw oo_0.a(v3);
                        }
                        v2 = var2_2 - var1_1;
                    }
                    catch (IllegalStateException v4) {
                        throw oo_0.a(v4);
                    }
                }
                try {
                    if (v2 >= var5_5) break block10;
lbl25:
                    // 2 sources

                    v5 = CoderResult.UNDERFLOW;
                    break block11;
                }
                catch (IllegalStateException v6) {
                    throw oo_0.a(v6);
                }
            }
            v5 = CoderResult.OVERFLOW;
        }
        return v5;
    }

    /*
     * Unable to fully structure code
     */
    private CoderResult x(ByteBuffer var1_1, CharBuffer var2_2) {
        var4_3 = var1_1.array();
        var5_4 = var1_1.arrayOffset() + var1_1.position();
        var6_5 = var1_1.arrayOffset() + var1_1.limit();
        var7_6 = var2_2.array();
        var8_7 = var2_2.arrayOffset() + var2_2.position();
        var9_8 = var2_2.arrayOffset() + var2_2.limit();
        var3_9 = yt_1.c();
        var10_10 = var8_7 + Math.min(var6_5 - var5_4, var9_8 - var8_7);
        while (var8_7 < var10_10) {
            try {
                try {
                    try {
                        v0 = var4_3[var5_4];
                        if (var3_9 != null && var3_9 != null) {
                        }
                        ** GOTO lbl30
                    }
                    catch (IllegalStateException v1) {
                        throw oo_0.a(v1);
                    }
                    if (v0 < 0) break;
                }
                catch (IllegalStateException v2) {
                    throw oo_0.a(v2);
                }
                var7_6[var8_7++] = (char)var4_3[var5_4++];
                if (var3_9 != null) continue;
                break;
            }
            catch (IllegalStateException v3) {
                throw oo_0.a(v3);
            }
        }
        do {
            block130: {
                block129: {
                    block127: {
                        block128: {
                            block126: {
                                block125: {
                                    block119: {
                                        block123: {
                                            block124: {
                                                block121: {
                                                    block122: {
                                                        block120: {
                                                            block113: {
                                                                block117: {
                                                                    block118: {
                                                                        block115: {
                                                                            block116: {
                                                                                block114: {
                                                                                    block111: {
                                                                                        block112: {
                                                                                            v0 = var5_4;
lbl30:
                                                                                            // 2 sources

                                                                                            if (v0 >= var6_5) break;
                                                                                            var11_11 = var4_3[var5_4];
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v4 = var11_11;
                                                                                                        if (var3_9 == null) break block111;
                                                                                                        if (v4 >= 0) {
                                                                                                        }
                                                                                                        ** GOTO lbl59
                                                                                                    }
                                                                                                    catch (IllegalStateException v5) {
                                                                                                        throw oo_0.a(v5);
                                                                                                    }
                                                                                                    if (var8_7 < var9_8) break block112;
                                                                                                }
                                                                                                catch (IllegalStateException v6) {
                                                                                                    throw oo_0.a(v6);
                                                                                                }
                                                                                                try {
                                                                                                    v7 = (CoderResult)oo_0.G((Object)var1_1, var5_4, var6_5, (Object)var2_2, var8_7, 1);
                                                                                                }
                                                                                                catch (InvocationTargetException v8) {
                                                                                                    throw v8.getTargetException();
                                                                                                }
                                                                                                return v7;
                                                                                            }
                                                                                            catch (IllegalStateException v9) {
                                                                                                throw oo_0.a(v9);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            var7_6[var8_7++] = (char)var11_11;
                                                                                            ++var5_4;
                                                                                            if (var3_9 != null) continue;
lbl59:
                                                                                            // 2 sources

                                                                                            v4 = var11_11 >> 5;
                                                                                        }
                                                                                        catch (IllegalStateException v10) {
                                                                                            throw oo_0.a(v10);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v11 = oo_0.a(25096, 3096227559546517859L);
                                                                                                        if (var3_9 == null) break block113;
                                                                                                        if (v4 == v11) {
                                                                                                        }
                                                                                                        ** GOTO lbl137
                                                                                                    }
                                                                                                    catch (IllegalStateException v12) {
                                                                                                        throw oo_0.a(v12);
                                                                                                    }
                                                                                                    v13 = var6_5 - var5_4;
                                                                                                    v14 = 2;
                                                                                                    if (var3_9 == null) break block114;
                                                                                                }
                                                                                                catch (IllegalStateException v15) {
                                                                                                    throw oo_0.a(v15);
                                                                                                }
                                                                                                if (v13 >= v14) {
                                                                                                }
                                                                                                ** GOTO lbl99
                                                                                            }
                                                                                            catch (IllegalStateException v16) {
                                                                                                throw oo_0.a(v16);
                                                                                            }
                                                                                            v13 = var8_7;
                                                                                            if (var3_9 == null) break block115;
                                                                                        }
                                                                                        catch (IllegalStateException v17) {
                                                                                            throw oo_0.a(v17);
                                                                                        }
                                                                                        v14 = var9_8;
                                                                                    }
                                                                                    catch (IllegalStateException v18) {
                                                                                        throw oo_0.a(v18);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (v13 < v14) break block116;
lbl99:
                                                                                    // 2 sources

                                                                                    try {
                                                                                        v19 = (CoderResult)oo_0.G((Object)var1_1, var5_4, var6_5, (Object)var2_2, var8_7, 2);
                                                                                    }
                                                                                    catch (InvocationTargetException v20) {
                                                                                        throw v20.getTargetException();
                                                                                    }
                                                                                    return v19;
                                                                                }
                                                                                catch (IllegalStateException v21) {
                                                                                    throw oo_0.a(v21);
                                                                                }
                                                                            }
                                                                            v13 = var4_3[var5_4 + 1];
                                                                        }
                                                                        var12_12 = v13;
                                                                        try {
                                                                            try {
                                                                                if (var3_9 == null) break block117;
                                                                                try {
                                                                                    v22 = (Boolean)oo_0.O(var11_11, var12_12);
                                                                                }
                                                                                catch (InvocationTargetException v23) {
                                                                                    throw v23.getTargetException();
                                                                                }
                                                                                if (!v22) break block118;
                                                                            }
                                                                            catch (IllegalStateException v24) {
                                                                                throw oo_0.a(v24);
                                                                            }
                                                                            try {
                                                                                v25 = (CoderResult)oo_0.Z((Object)var1_1, var5_4, (Object)var2_2, var8_7, 2);
                                                                            }
                                                                            catch (InvocationTargetException v26) {
                                                                                throw v26.getTargetException();
                                                                            }
                                                                            return v25;
                                                                        }
                                                                        catch (IllegalStateException v27) {
                                                                            throw oo_0.a(v27);
                                                                        }
                                                                    }
                                                                    var7_6[var8_7++] = (char)(var11_11 << oo_0.a(6916, 6642617722743488609L) ^ var12_12 ^ oo_0.a(3930, 8194718530277020709L));
                                                                    var5_4 += 2;
                                                                }
                                                                try {
                                                                    if (var3_9 != null) continue;
lbl137:
                                                                    // 2 sources

                                                                    v4 = var11_11 >> 4;
                                                                    v11 = oo_0.a(25096, 3096227559546517859L);
                                                                }
                                                                catch (IllegalStateException v28) {
                                                                    throw oo_0.a(v28);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var3_9 == null) break block119;
                                                                                if (v4 == v11) {
                                                                                }
                                                                                ** GOTO lbl216
                                                                            }
                                                                            catch (IllegalStateException v29) {
                                                                                throw oo_0.a(v29);
                                                                            }
                                                                            v30 = var6_5 - var5_4;
                                                                            v31 = 3;
                                                                            if (var3_9 == null) break block120;
                                                                        }
                                                                        catch (IllegalStateException v32) {
                                                                            throw oo_0.a(v32);
                                                                        }
                                                                        if (v30 >= v31) {
                                                                        }
                                                                        ** GOTO lbl177
                                                                    }
                                                                    catch (IllegalStateException v33) {
                                                                        throw oo_0.a(v33);
                                                                    }
                                                                    v30 = var8_7;
                                                                    if (var3_9 == null) break block121;
                                                                }
                                                                catch (IllegalStateException v34) {
                                                                    throw oo_0.a(v34);
                                                                }
                                                                v31 = var9_8;
                                                            }
                                                            catch (IllegalStateException v35) {
                                                                throw oo_0.a(v35);
                                                            }
                                                        }
                                                        try {
                                                            if (v30 < v31) break block122;
lbl177:
                                                            // 2 sources

                                                            try {
                                                                v36 = (CoderResult)oo_0.G((Object)var1_1, var5_4, var6_5, (Object)var2_2, var8_7, 3);
                                                            }
                                                            catch (InvocationTargetException v37) {
                                                                throw v37.getTargetException();
                                                            }
                                                            return v36;
                                                        }
                                                        catch (IllegalStateException v38) {
                                                            throw oo_0.a(v38);
                                                        }
                                                    }
                                                    v30 = var4_3[var5_4 + 1];
                                                }
                                                var12_12 = v30;
                                                var13_13 = var4_3[var5_4 + 2];
                                                try {
                                                    try {
                                                        if (var3_9 == null) break block123;
                                                        try {
                                                            v39 = (Boolean)oo_0.J(var11_11, var12_12, (int)var13_13);
                                                        }
                                                        catch (InvocationTargetException v40) {
                                                            throw v40.getTargetException();
                                                        }
                                                        if (!v39) break block124;
                                                    }
                                                    catch (IllegalStateException v41) {
                                                        throw oo_0.a(v41);
                                                    }
                                                    try {
                                                        v42 = (CoderResult)oo_0.Z((Object)var1_1, var5_4, (Object)var2_2, var8_7, 3);
                                                    }
                                                    catch (InvocationTargetException v43) {
                                                        throw v43.getTargetException();
                                                    }
                                                    return v42;
                                                }
                                                catch (IllegalStateException v44) {
                                                    throw oo_0.a(v44);
                                                }
                                            }
                                            var7_6[var8_7++] = (char)(var11_11 << oo_0.a(17053, 4672373939300751851L) ^ var12_12 << oo_0.a(6916, 6642617722743488609L) ^ var13_13 ^ oo_0.a(31167, 7461759825354187479L));
                                            var5_4 += 3;
                                        }
                                        try {
                                            if (var3_9 != null) continue;
lbl216:
                                            // 2 sources

                                            v4 = var11_11 >> 3;
                                            v11 = oo_0.a(25096, 3096227559546517859L);
                                        }
                                        catch (IllegalStateException v45) {
                                            throw oo_0.a(v45);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var3_9 == null) break block125;
                                            if (v4 == v11) {
                                            }
                                            ** GOTO lbl321
                                        }
                                        catch (IllegalStateException v46) {
                                            throw oo_0.a(v46);
                                        }
                                        v4 = var6_5 - var5_4;
                                        v11 = 4;
                                    }
                                    catch (IllegalStateException v47) {
                                        throw oo_0.a(v47);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var3_9 == null) break block126;
                                            if (v4 >= v11) {
                                            }
                                            ** GOTO lbl257
                                        }
                                        catch (IllegalStateException v48) {
                                            throw oo_0.a(v48);
                                        }
                                        v4 = var9_8 - var8_7;
                                        if (var3_9 == null) break block127;
                                    }
                                    catch (IllegalStateException v49) {
                                        throw oo_0.a(v49);
                                    }
                                    v11 = 2;
                                }
                                catch (IllegalStateException v50) {
                                    throw oo_0.a(v50);
                                }
                            }
                            try {
                                if (v4 >= v11) break block128;
lbl257:
                                // 2 sources

                                try {
                                    v51 = (CoderResult)oo_0.G((Object)var1_1, var5_4, var6_5, (Object)var2_2, var8_7, 4);
                                }
                                catch (InvocationTargetException v52) {
                                    throw v52.getTargetException();
                                }
                                return v51;
                            }
                            catch (IllegalStateException v53) {
                                throw oo_0.a(v53);
                            }
                        }
                        v4 = var4_3[var5_4 + 1];
                    }
                    var12_12 = v4;
                    var13_13 = var4_3[var5_4 + 2];
                    var14_14 = var4_3[var5_4 + 3];
                    var15_15 = (var11_11 & oo_0.a(27567, 6006764407085035736L)) << oo_0.a(21619, 5302362025873428225L) | (var12_12 & oo_0.a(29625, 8423516448292563137L)) << oo_0.a(2715, 9129453940641141227L) | (var13_13 & oo_0.a(6031, 6047268913849306339L)) << oo_0.a(6916, 6642617722743488609L) | var14_14 & oo_0.a(6031, 6047268913849306339L);
                    try {
                        try {
                            try {
                                v54 = (Boolean)oo_0.g(var12_12, (int)var13_13, (int)var14_14);
                            }
                            catch (InvocationTargetException v55) {
                                throw v55.getTargetException();
                            }
                            if (var3_9 == null) break block129;
                            if (!v54) {
                            }
                            ** GOTO lbl295
                        }
                        catch (IllegalStateException v56) {
                            throw oo_0.a(v56);
                        }
                        try {
                            v54 = (Boolean)vp_0.w(var15_15);
                        }
                        catch (InvocationTargetException v57) {
                            throw v57.getTargetException();
                        }
                    }
                    catch (IllegalStateException v58) {
                        throw oo_0.a(v58);
                    }
                }
                try {
                    if (v54) break block130;
lbl295:
                    // 2 sources

                    try {
                        v59 = (CoderResult)oo_0.Z((Object)var1_1, var5_4, (Object)var2_2, var8_7, 4);
                    }
                    catch (InvocationTargetException v60) {
                        throw v60.getTargetException();
                    }
                    return v59;
                }
                catch (IllegalStateException v61) {
                    throw oo_0.a(v61);
                }
            }
            try {
                v62 = var8_7++;
                try {
                    v63 = ((Character)vp_0.B(var15_15)).charValue();
                }
                catch (InvocationTargetException v64) {
                    throw v64.getTargetException();
                }
                var7_6[v62] = v63;
                v65 = var8_7++;
                try {
                    v66 = ((Character)vp_0.Q(var15_15)).charValue();
                }
                catch (InvocationTargetException v67) {
                    throw v67.getTargetException();
                }
                var7_6[v65] = v66;
                var5_4 += 4;
                if (var3_9 != null) continue;
lbl321:
                // 2 sources

                try {
                    v68 = (CoderResult)oo_0.Z((Object)var1_1, var5_4, (Object)var2_2, var8_7, 1);
                }
                catch (InvocationTargetException v69) {
                    throw v69.getTargetException();
                }
                return v68;
            }
            catch (IllegalStateException v70) {
                throw oo_0.a(v70);
            }
        } while (var3_9 != null);
        try {
            v71 = (CoderResult)oo_0.G((Object)var1_1, var5_4, var6_5, (Object)var2_2, var8_7, 0);
        }
        catch (InvocationTargetException v72) {
            throw v72.getTargetException();
        }
        return v71;
    }

    @Override
    protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        CoderResult coderResult;
        try {
            coderResult = (CoderResult)this.x((Object)byteBuffer, (Object)charBuffer);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return coderResult;
    }

    static void j(Buffer buffer, int n10, Buffer buffer2, int n11) {
        buffer.position(n10);
        buffer2.position(n11);
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
                v0 = ";F?\u0005&".toCharArray();
                v1 = v0.length;
                var9_1 = 0;
                v2 = 26;
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
                                v9 = 116;
                                break;
                            }
                            case 1: {
                                v9 = 8;
                                break;
                            }
                            case 2: {
                                v9 = 99;
                                break;
                            }
                            case 3: {
                                v9 = 50;
                                break;
                            }
                            case 4: {
                                v9 = 4;
                                break;
                            }
                            case 5: {
                                v9 = 27;
                                break;
                            }
                            default: {
                                v9 = 126;
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
                var0_2 = 8680417123626146034L;
                var6_3 = new long[29];
                var3_4 = 0;
                var4_5 = "`%5\u00d5M\u00e9\u00d0\u0087\u00e9\u00d5V\u008e\u00e4\u008dCW\u0082\u0084<\u008d\\m|\u00e0Y\u00c9\u00ee\u00e0FS\u00e8\u00bc3\u00a3\u00a4\u00a1L\u00a5\u00e9=62\u00fa\u00e3%\t\u008e'\u0017\u00f0P\u00cfo\u00d70\f+\u00bb\u001e\n\u00a4\u001e1\u00b9mU\u00ba\u000e\u00be$\u0001\u0015\u0018W\f`>7(-\u00eey0\u00d7d< \u00fd(9\u0003\u00da\u00b4?zB\u00ae&\u00cc\u00d7M@\u0097\u00e1\u001c\u00f8}\u00eb0\u00d6\u00c0I\u00d5y\u0087\u00b3&\u00c0\u00c9\u0015\u00a8\u0015\u0000\u00fa\u00c1\u000e~\u00bf]\u00f4+\u00fc\u00e3\u00e0\u0093E\u00bf\u00ac\u00cc\u0014\u00fc\u0005U1\u0084\u00bfe\u00e7\u009c\u00b4T.Gx\u00e90\u00bea\u0001Hs\u0015\u0090~\u00cd`7\u0004R\u001e\u00ed\u0099z\u0080\u00deovR\u00dc\u00e2\u00fep%\u00a5\u009d\t\u0004\u0089\u00c8\\/\u001c\u00a7\u00b4O U&\u00c8\u00c7\u0083eEb\u00da\u009ep\u00cd\u0097\u0013=\u00a6\u0003]\u000b\u001a";
                var5_6 = "`%5\u00d5M\u00e9\u00d0\u0087\u00e9\u00d5V\u008e\u00e4\u008dCW\u0082\u0084<\u008d\\m|\u00e0Y\u00c9\u00ee\u00e0FS\u00e8\u00bc3\u00a3\u00a4\u00a1L\u00a5\u00e9=62\u00fa\u00e3%\t\u008e'\u0017\u00f0P\u00cfo\u00d70\f+\u00bb\u001e\n\u00a4\u001e1\u00b9mU\u00ba\u000e\u00be$\u0001\u0015\u0018W\f`>7(-\u00eey0\u00d7d< \u00fd(9\u0003\u00da\u00b4?zB\u00ae&\u00cc\u00d7M@\u0097\u00e1\u001c\u00f8}\u00eb0\u00d6\u00c0I\u00d5y\u0087\u00b3&\u00c0\u00c9\u0015\u00a8\u0015\u0000\u00fa\u00c1\u000e~\u00bf]\u00f4+\u00fc\u00e3\u00e0\u0093E\u00bf\u00ac\u00cc\u0014\u00fc\u0005U1\u0084\u00bfe\u00e7\u009c\u00b4T.Gx\u00e90\u00bea\u0001Hs\u0015\u0090~\u00cd`7\u0004R\u001e\u00ed\u0099z\u0080\u00deovR\u00dc\u00e2\u00fep%\u00a5\u009d\t\u0004\u0089\u00c8\\/\u001c\u00a7\u00b4O U&\u00c8\u00c7\u0083eEb\u00da\u009ep\u00cd\u0097\u0013=\u00a6\u0003]\u000b\u001a".length();
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
                    var4_5 = "N\u0094\u00faX\u00fd#X\u0095Iq\u0001\u00b0!\u00efV\u00c3";
                    var5_6 = "N\u0094\u00faX\u00fd#X\u0095Iq\u0001\u00b0!\u00efV\u00c3".length();
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
        oo_0.a = var6_3;
        oo_0.b = new Integer[29];
        oo_0.S = Charset.forName(var8);
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1B7E;
        if (b[n11] == null) {
            oo_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

