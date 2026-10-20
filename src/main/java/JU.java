/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class JU {
    private String W = "qqwry.Dat";
    private String c;
    private String Q;
    private long z;
    private int S;
    private int u;
    private long d;
    private long h;
    private long H;
    private long q;
    private long P;
    private long p;
    private long t;
    private long D;
    private RandomAccessFile J;
    private byte[] Z;
    private static final String[] a;
    private static final String[] b;
    private static final long[] e;
    private static final Integer[] f;
    private static final long[] g;
    private static final Long[] i;

    /*
     * Unable to fully structure code
     */
    private long K(byte[] var1_1) {
        var3_2 = 0L;
        var2_3 = QI.N();
        var5_4 = 0;
        if (var2_3 != null) ** GOTO lbl30
        block0: while (true) {
            v0 = 1L;
            do {
                var6_5 = v0;
                var8_6 = 0;
                if (var2_3 != null) ** GOTO lbl16
                block2: while (true) {
                    v1 = var6_5 * JU.b(20967, 2056173557039323437L);
                    do {
                        var6_5 = v1;
                        ++var8_6;
lbl16:
                        // 2 sources

                        if (var8_6 < var5_4) continue block2;
                        v1 = var3_2;
                    } while (var2_3 == null);
                    break;
                }
                v2 = var1_1;
                v3 = var5_4;
                if (var2_3 == null) ** GOTO lbl27
                if (v2[v3] < 0) {
                    v4 = JU.a(23616, 5326862907161902554L) + var1_1[var5_4];
                } else {
                    v2 = var1_1;
                    v3 = var5_4;
lbl27:
                    // 2 sources

                    v4 = v2[v3];
                }
                var3_2 = v1 + (long)v4 * var6_5;
                ++var5_4;
lbl30:
                // 2 sources

                if (var5_4 < var1_1.length) continue block0;
                v0 = var3_2;
            } while (var2_3 == null);
            break;
        }
        return v0;
    }

    /*
     * Exception decompiling
     */
    private long A(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP], 6[DOLOOP]], but top level block is 1[TRYBLOCK]
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i(String string) throws Exception {
        String[] stringArray;
        block13: {
            JU jU;
            block14: {
                this.z = this.A(string);
                this.J = new RandomAccessFile(this.W, "r");
                stringArray = QI.N();
                try {
                    try {
                        this.Z = new byte[4];
                        this.J.seek(0L);
                        this.J.read(this.Z);
                        this.p = this.K(this.Z);
                        this.J.read(this.Z);
                        this.t = this.K(this.Z);
                        this.S = (int)((this.t - this.p) / JU.b(2819, 6159728159312511936L));
                        jU = this;
                        if (stringArray == null) break block13;
                        if (jU.S > 1) break block14;
                    }
                    catch (Exception exception) {
                        throw JU.a(exception);
                    }
                    this.Q = this.c = "未知";
                    throw new Exception();
                }
                catch (Exception exception) {
                    throw JU.a(exception);
                }
            }
            this.h = 0L;
            jU = this;
        }
        jU.d = this.S;
        block10: while (true) {
            long l2 = (this.h + this.d) / JU.b(6865, 5806973823154033174L);
            this.g(l2);
            boolean bl = true;
            do {
                block20: {
                    block17: {
                        block15: {
                            block19: {
                                block18: {
                                    if (!bl || (bl = false)) break block18;
                                    if (this.z != this.q) break block19;
                                    this.h = l2;
                                }
                                if (stringArray != null) break block20;
                            }
                            try {
                                JU jU;
                                block16: {
                                    try {
                                        try {
                                            jU = this;
                                            if (stringArray == null) break block15;
                                            if (jU.z <= this.q) break block16;
                                        }
                                        catch (Exception exception) {
                                            throw JU.a(exception);
                                        }
                                        this.h = l2;
                                        if (stringArray != null) break block17;
                                    }
                                    catch (Exception exception) {
                                        throw JU.a(exception);
                                    }
                                }
                                jU = this;
                            }
                            catch (Exception exception) {
                                throw JU.a(exception);
                            }
                        }
                        jU.d = l2;
                    }
                    if (this.h < this.d - 1L) continue block10;
                }
                this.g(this.h);
                this.g();
                this.A(this.z);
                this.J.close();
            } while (stringArray == null);
            break;
        }
    }

    private String U(long l2) throws IOException {
        int n10;
        block24: {
            long l3;
            int n11 = 0;
            String[] stringArray = QI.N();
            do {
                int n12;
                int n13;
                block22: {
                    block21: {
                        this.J.seek(l2);
                        this.Z = new byte[1];
                        this.J.read(this.Z);
                        if (this.Z[0] < 0) {
                            try {
                                n13 = JU.a(13268, 5041556145516810828L) + this.Z[0];
                                if (stringArray != null) {
                                }
                                break block21;
                            }
                            catch (IOException iOException) {
                                throw JU.a(iOException);
                            }
                        }
                        n13 = this.Z[0];
                        n13 = n11 = n13;
                    }
                    try {
                        try {
                            block23: {
                                try {
                                    try {
                                        try {
                                            n12 = 1;
                                            if (stringArray == null) break block22;
                                            if (n13 == n12) break block23;
                                        }
                                        catch (IOException iOException) {
                                            throw JU.a(iOException);
                                        }
                                        n10 = n11;
                                        if (stringArray == null) break block24;
                                    }
                                    catch (IOException iOException) {
                                        throw JU.a(iOException);
                                    }
                                    if (n10 != 2) break;
                                }
                                catch (IOException iOException) {
                                    throw JU.a(iOException);
                                }
                            }
                            this.Z = new byte[3];
                            this.J.read(this.Z);
                            if (stringArray == null) continue;
                        }
                        catch (IOException iOException) {
                            throw JU.a(iOException);
                        }
                        n13 = n11;
                        n12 = 2;
                    }
                    catch (IOException iOException) {
                        throw JU.a(iOException);
                    }
                }
                try {
                    if (n13 == n12) {
                        this.u = JU.a(757, 6571048245440553836L);
                        this.D = l2 - JU.b(17333, 798059639594961780L);
                    }
                }
                catch (IOException iOException) {
                    throw JU.a(iOException);
                }
                l2 = this.K(this.Z);
            } while (stringArray != null);
            n10 = (l3 = l2 - JU.b(16455, 6349168546533886092L)) == 0L ? 0 : (l3 < 0L ? -1 : 1);
        }
        try {
            if (n10 < 0) {
                return "";
            }
        }
        catch (IOException iOException) {
            throw JU.a(iOException);
        }
        this.J.seek(l2);
        return this.I();
    }

    private String I() throws IOException {
        long l2 = this.J.length();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte by = this.J.readByte();
        do {
            byteArrayOutputStream.write(by);
        } while ((by = this.J.readByte()) != 0 && this.J.getFilePointer() < l2);
        return byteArrayOutputStream.toString();
    }

    /*
     * Unable to fully structure code
     */
    private void A(long var1_1) throws IOException {
        block31: {
            block28: {
                block29: {
                    block32: {
                        block30: {
                            block26: {
                                var3_2 = QI.N();
                                try {
                                    try {
                                        block27: {
                                            try {
                                                try {
                                                    try {
                                                        v0 = this.u;
                                                        v1 = 1;
                                                        if (var3_2 == null) break block26;
                                                        if (v0 == v1) break block27;
                                                    }
                                                    catch (IOException v2) {
                                                        throw JU.a(v2);
                                                    }
                                                    v3 = this;
                                                    if (var3_2 == null) break block28;
                                                }
                                                catch (IOException v4) {
                                                    throw JU.a(v4);
                                                }
                                                if (v3.u == 2) {
                                                }
                                                ** GOTO lbl84
                                            }
                                            catch (IOException v5) {
                                                throw JU.a(v5);
                                            }
                                        }
                                        this.c = this.U(this.D + JU.b(24130, 2046877826402440838L));
                                        v6 = this;
                                        if (var3_2 == null) break block29;
                                    }
                                    catch (IOException v7) {
                                        throw JU.a(v7);
                                    }
                                    v0 = v6.u;
                                    v1 = 1;
                                }
                                catch (IOException v8) {
                                    throw JU.a(v8);
                                }
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (v0 == v1) {
                                                this.Q = this.U(this.J.getFilePointer());
                                                cfr_temp_0 = this.z - this.A("255.255.255.0");
                                                v9 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                if (var3_2 == null) break block30;
                                            }
                                            ** GOTO lbl76
                                        }
                                        catch (IOException v10) {
                                            throw JU.a(v10);
                                        }
                                        if (v9 < 0) break block31;
                                    }
                                    catch (IOException v11) {
                                        throw JU.a(v11);
                                    }
                                    v12 = this;
                                    if (var3_2 == null) break block32;
                                }
                                catch (IOException v13) {
                                    throw JU.a(v13);
                                }
                                cfr_temp_1 = v12.z - this.A("255.255.255.255");
                                v9 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                            }
                            catch (IOException v14) {
                                throw JU.a(v14);
                            }
                        }
                        try {
                            if (v9 > 0) break block31;
                            this.Q = this.U(this.D + JU.b(14610, 5607223311547937234L));
                            v12 = this;
                        }
                        catch (IOException v15) {
                            throw JU.a(v15);
                        }
                    }
                    try {
                        v12.c = this.U(this.D + JU.b(10878, 2614362255680316091L));
                        if (var3_2 != null) break block31;
lbl76:
                        // 2 sources

                        v6 = this;
                    }
                    catch (IOException v16) {
                        throw JU.a(v16);
                    }
                }
                try {
                    v6.Q = this.U(this.D + JU.b(23505, 5927161472955568921L));
                    if (var3_2 != null) break block31;
lbl84:
                    // 2 sources

                    this.c = this.U(this.D + JU.b(24130, 2046877826402440838L));
                    v3 = this;
                }
                catch (IOException v17) {
                    throw JU.a(v17);
                }
            }
            v3.Q = this.U(this.J.getFilePointer());
        }
    }

    private long g() throws IOException {
        int n10;
        block6: {
            int n11;
            byte[] byArray;
            block4: {
                block5: {
                    this.J.seek(this.D);
                    this.Z = new byte[4];
                    String[] stringArray = QI.N();
                    try {
                        try {
                            this.J.read(this.Z);
                            this.P = this.K(this.Z);
                            this.Z = new byte[1];
                            this.J.read(this.Z);
                            JU jU = this;
                            byArray = this.Z;
                            n11 = 0;
                            if (stringArray == null) break block4;
                            if (byArray[n11] >= 0) break block5;
                        }
                        catch (IOException iOException) {
                            throw JU.a(iOException);
                        }
                        n10 = JU.a(23616, 5326862907161902554L) + this.Z[0];
                        break block6;
                    }
                    catch (IOException iOException) {
                        throw JU.a(iOException);
                    }
                }
                byArray = this.Z;
                n11 = 0;
            }
            n10 = byArray[n11];
        }
        jU.u = n10;
        return this.P;
    }

    private long g(long l2) throws IOException {
        this.H = this.p + l2 * JU.b(31050, 8545736823142838668L);
        this.J.seek(this.H);
        this.Z = new byte[4];
        this.J.read(this.Z);
        this.q = this.K(this.Z);
        this.Z = new byte[3];
        this.J.read(this.Z);
        this.D = this.K(this.Z);
        return this.q;
    }

    public String o() {
        return this.Q;
    }

    public String a() {
        return this.c;
    }

    public void x(String string) {
        this.W = string;
    }

    public static void main(String[] stringArray) throws Exception {
        JU jU = new JU();
        jU.i("122.114.56.168");
        jy_0.g(String.valueOf(jU.a()) + " " + jU.o());
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                var21 = new String[6];
                                var19_1 = 0;
                                var18_2 = "\u00ec4)\u00a8\u0018\u00c0\u00dfA0\u000e\u007f\u0083V)R8\u00a7\u00ed\u0000\u00fc\u00be\u0083\u00cd\u0091\u0002\u00f8V\r\u00de\u00de\u0006e\u00bc\u00b5\u0018\u00d8\u00d1YxKk";
                                var20_3 = "\u00ec4)\u00a8\u0018\u00c0\u00dfA0\u000e\u007f\u0083V)R8\u00a7\u00ed\u0000\u00fc\u00be\u0083\u00cd\u0091\u0002\u00f8V\r\u00de\u00de\u0006e\u00bc\u00b5\u0018\u00d8\u00d1YxKk".length();
                                var17_4 = 9;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 67;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = ",Z\u009d0\n\u00da\u000b\u00f0v\u0099I\u0096\u008a\u0007\u0006\u0002\u6727\u77bc";
                                    var20_3 = ",Z\u009d0\n\u00da\u000b\u00f0v\u0099I\u0096\u008a\u0007\u0006\u0002\u6727\u77bc".length();
                                    var17_4 = 15;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 15;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 93;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 49;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 28;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 14;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 117;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 45;
                                            break;
                                        }
                                        default: {
                                            v15 = 75;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        JU.a = var21;
                        JU.b = new String[6];
                        var8_7 = 8070760161456388995L;
                        var14_8 = new long[3];
                        var11_9 = 0;
                        var12_10 = "\u00ef?+nJL\u00e8\u00cf\t\u00e7\u00d9\u00e2]\u008bX\u00ed\u0085\u0019\u00ef\u00af~m\u0087Y";
                        var13_11 = "\u00ef?+nJL\u00e8\u00cf\t\u00e7\u00d9\u00e2]\u008bX\u00ed\u0085\u0019\u00ef\u00af~m\u0087Y".length();
                        var10_12 = 0;
                        while (true) {
                            break block30;
                            break;
                        }
lbl107:
                        // 1 sources

                        while (true) {
                            var14_8[v17] = (((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L) ^ var8_7;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                    v17 = var11_9++;
                    ** while (true)
                }
                JU.e = var14_8;
                JU.f = new Integer[3];
                var0_14 = 9156469775385679444L;
                var6_15 = new long[11];
                var3_16 = 0;
                var4_17 = "5\u009d\u009b\u00c6\u00dai\u0092\u00ec*i\u0090\u009fv\u00bd\u00d5\u00932\u00c2\u008b[\u00dblg\u0093t\u0001\u0017\u00bc\u00e9\u00d4\u009d$\t\u008a\u00de\u00e2a\u0011\u00a7\u00df/\u0084\u00d3S\u008b`D@cu\u00a86\u00ab!\u0080\u00d6[ZD!\u00daut\u00e3c\u009a\u00aeK\u00d9\u0097\u008ey";
                var5_18 = "5\u009d\u009b\u00c6\u00dai\u0092\u00ec*i\u0090\u009fv\u00bd\u00d5\u00932\u00c2\u008b[\u00dblg\u0093t\u0001\u0017\u00bc\u00e9\u00d4\u009d$\t\u008a\u00de\u00e2a\u0011\u00a7\u00df/\u0084\u00d3S\u008b`D@cu\u00a86\u00ab!\u0080\u00d6[ZD!\u00daut\u00e3c\u009a\u00aeK\u00d9\u0097\u008ey".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v18 = var6_15;
                    v19 = var3_16++;
                    v20 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v21 = -1;
                    break block32;
                    break;
                }
lbl134:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "'\u000e\u0097\u0098=J\u009e\u00d4-S\u00d1K\u00af\u0093\u0005E";
                    var5_18 = "'\u000e\u0097\u0098=J\u009e\u00d4-S\u00d1K\u00af\u0093\u0005E".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v18 = var6_15;
                        v19 = var3_16++;
                        v20 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v21 = 0;
                        break block32;
                        break;
                    }
                    break;
                }
lbl147:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            v22 = v20 ^ var0_14;
            switch (v21) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl158:
                // 1 sources

                ** continue;
            }
        }
        JU.g = var6_15;
        JU.i = new Long[11];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF952B) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 67;
                    break;
                }
                case 1: {
                    n14 = 79;
                    break;
                }
                case 2: {
                    n14 = 210;
                    break;
                }
                case 3: {
                    n14 = 18;
                    break;
                }
                case 4: {
                    n14 = 63;
                    break;
                }
                case 5: {
                    n14 = 206;
                    break;
                }
                case 6: {
                    n14 = 35;
                    break;
                }
                case 7: {
                    n14 = 36;
                    break;
                }
                case 8: {
                    n14 = 123;
                    break;
                }
                case 9: {
                    n14 = 150;
                    break;
                }
                case 10: {
                    n14 = 133;
                    break;
                }
                case 11: {
                    n14 = 20;
                    break;
                }
                case 12: {
                    n14 = 216;
                    break;
                }
                case 13: {
                    n14 = 40;
                    break;
                }
                case 14: {
                    n14 = 85;
                    break;
                }
                case 15: {
                    n14 = 135;
                    break;
                }
                case 16: {
                    n14 = 59;
                    break;
                }
                case 17: {
                    n14 = 245;
                    break;
                }
                case 18: {
                    n14 = 187;
                    break;
                }
                case 19: {
                    n14 = 222;
                    break;
                }
                case 20: {
                    n14 = 87;
                    break;
                }
                case 21: {
                    n14 = 69;
                    break;
                }
                case 22: {
                    n14 = 89;
                    break;
                }
                case 23: {
                    n14 = 21;
                    break;
                }
                case 24: {
                    n14 = 76;
                    break;
                }
                case 25: {
                    n14 = 9;
                    break;
                }
                case 26: {
                    n14 = 190;
                    break;
                }
                case 27: {
                    n14 = 90;
                    break;
                }
                case 28: {
                    n14 = 91;
                    break;
                }
                case 29: {
                    n14 = 83;
                    break;
                }
                case 30: {
                    n14 = 248;
                    break;
                }
                case 31: {
                    n14 = 110;
                    break;
                }
                case 32: {
                    n14 = 234;
                    break;
                }
                case 33: {
                    n14 = 98;
                    break;
                }
                case 34: {
                    n14 = 52;
                    break;
                }
                case 35: {
                    n14 = 196;
                    break;
                }
                case 36: {
                    n14 = 148;
                    break;
                }
                case 37: {
                    n14 = 26;
                    break;
                }
                case 38: {
                    n14 = 201;
                    break;
                }
                case 39: {
                    n14 = 116;
                    break;
                }
                case 40: {
                    n14 = 231;
                    break;
                }
                case 41: {
                    n14 = 38;
                    break;
                }
                case 42: {
                    n14 = 62;
                    break;
                }
                case 43: {
                    n14 = 139;
                    break;
                }
                case 44: {
                    n14 = 233;
                    break;
                }
                case 45: {
                    n14 = 225;
                    break;
                }
                case 46: {
                    n14 = 0;
                    break;
                }
                case 47: {
                    n14 = 57;
                    break;
                }
                case 48: {
                    n14 = 24;
                    break;
                }
                case 49: {
                    n14 = 163;
                    break;
                }
                case 50: {
                    n14 = 71;
                    break;
                }
                case 51: {
                    n14 = 121;
                    break;
                }
                case 52: {
                    n14 = 181;
                    break;
                }
                case 53: {
                    n14 = 151;
                    break;
                }
                case 54: {
                    n14 = 132;
                    break;
                }
                case 55: {
                    n14 = 197;
                    break;
                }
                case 56: {
                    n14 = 118;
                    break;
                }
                case 57: {
                    n14 = 122;
                    break;
                }
                case 58: {
                    n14 = 212;
                    break;
                }
                case 59: {
                    n14 = 53;
                    break;
                }
                case 60: {
                    n14 = 247;
                    break;
                }
                case 61: {
                    n14 = 51;
                    break;
                }
                case 62: {
                    n14 = 220;
                    break;
                }
                case 63: {
                    n14 = 16;
                    break;
                }
                case 64: {
                    n14 = 252;
                    break;
                }
                case 65: {
                    n14 = 42;
                    break;
                }
                case 66: {
                    n14 = 164;
                    break;
                }
                case 67: {
                    n14 = 166;
                    break;
                }
                case 68: {
                    n14 = 184;
                    break;
                }
                case 69: {
                    n14 = 10;
                    break;
                }
                case 70: {
                    n14 = 105;
                    break;
                }
                case 71: {
                    n14 = 240;
                    break;
                }
                case 72: {
                    n14 = 137;
                    break;
                }
                case 73: {
                    n14 = 127;
                    break;
                }
                case 74: {
                    n14 = 180;
                    break;
                }
                case 75: {
                    n14 = 75;
                    break;
                }
                case 76: {
                    n14 = 195;
                    break;
                }
                case 77: {
                    n14 = 254;
                    break;
                }
                case 78: {
                    n14 = 100;
                    break;
                }
                case 79: {
                    n14 = 176;
                    break;
                }
                case 80: {
                    n14 = 162;
                    break;
                }
                case 81: {
                    n14 = 86;
                    break;
                }
                case 82: {
                    n14 = 6;
                    break;
                }
                case 83: {
                    n14 = 68;
                    break;
                }
                case 84: {
                    n14 = 237;
                    break;
                }
                case 85: {
                    n14 = 43;
                    break;
                }
                case 86: {
                    n14 = 84;
                    break;
                }
                case 87: {
                    n14 = 218;
                    break;
                }
                case 88: {
                    n14 = 109;
                    break;
                }
                case 89: {
                    n14 = 34;
                    break;
                }
                case 90: {
                    n14 = 204;
                    break;
                }
                case 91: {
                    n14 = 168;
                    break;
                }
                case 92: {
                    n14 = 198;
                    break;
                }
                case 93: {
                    n14 = 33;
                    break;
                }
                case 94: {
                    n14 = 15;
                    break;
                }
                case 95: {
                    n14 = 235;
                    break;
                }
                case 96: {
                    n14 = 217;
                    break;
                }
                case 97: {
                    n14 = 50;
                    break;
                }
                case 98: {
                    n14 = 177;
                    break;
                }
                case 99: {
                    n14 = 81;
                    break;
                }
                case 100: {
                    n14 = 215;
                    break;
                }
                case 101: {
                    n14 = 186;
                    break;
                }
                case 102: {
                    n14 = 73;
                    break;
                }
                case 103: {
                    n14 = 92;
                    break;
                }
                case 104: {
                    n14 = 193;
                    break;
                }
                case 105: {
                    n14 = 246;
                    break;
                }
                case 106: {
                    n14 = 115;
                    break;
                }
                case 107: {
                    n14 = 22;
                    break;
                }
                case 108: {
                    n14 = 104;
                    break;
                }
                case 109: {
                    n14 = 82;
                    break;
                }
                case 110: {
                    n14 = 2;
                    break;
                }
                case 111: {
                    n14 = 1;
                    break;
                }
                case 112: {
                    n14 = 182;
                    break;
                }
                case 113: {
                    n14 = 55;
                    break;
                }
                case 114: {
                    n14 = 106;
                    break;
                }
                case 115: {
                    n14 = 61;
                    break;
                }
                case 116: {
                    n14 = 111;
                    break;
                }
                case 117: {
                    n14 = 208;
                    break;
                }
                case 118: {
                    n14 = 64;
                    break;
                }
                case 119: {
                    n14 = 117;
                    break;
                }
                case 120: {
                    n14 = 4;
                    break;
                }
                case 121: {
                    n14 = 156;
                    break;
                }
                case 122: {
                    n14 = 174;
                    break;
                }
                case 123: {
                    n14 = 152;
                    break;
                }
                case 124: {
                    n14 = 30;
                    break;
                }
                case 125: {
                    n14 = 209;
                    break;
                }
                case 126: {
                    n14 = 146;
                    break;
                }
                case 127: {
                    n14 = 113;
                    break;
                }
                case 128: {
                    n14 = 74;
                    break;
                }
                case 129: {
                    n14 = 147;
                    break;
                }
                case 130: {
                    n14 = 23;
                    break;
                }
                case 131: {
                    n14 = 170;
                    break;
                }
                case 132: {
                    n14 = 126;
                    break;
                }
                case 133: {
                    n14 = 232;
                    break;
                }
                case 134: {
                    n14 = 130;
                    break;
                }
                case 135: {
                    n14 = 114;
                    break;
                }
                case 136: {
                    n14 = 14;
                    break;
                }
                case 137: {
                    n14 = 223;
                    break;
                }
                case 138: {
                    n14 = 125;
                    break;
                }
                case 139: {
                    n14 = 88;
                    break;
                }
                case 140: {
                    n14 = 143;
                    break;
                }
                case 141: {
                    n14 = 94;
                    break;
                }
                case 142: {
                    n14 = 136;
                    break;
                }
                case 143: {
                    n14 = 31;
                    break;
                }
                case 144: {
                    n14 = 243;
                    break;
                }
                case 145: {
                    n14 = 158;
                    break;
                }
                case 146: {
                    n14 = 200;
                    break;
                }
                case 147: {
                    n14 = 78;
                    break;
                }
                case 148: {
                    n14 = 5;
                    break;
                }
                case 149: {
                    n14 = 149;
                    break;
                }
                case 150: {
                    n14 = 192;
                    break;
                }
                case 151: {
                    n14 = 172;
                    break;
                }
                case 152: {
                    n14 = 65;
                    break;
                }
                case 153: {
                    n14 = 242;
                    break;
                }
                case 154: {
                    n14 = 101;
                    break;
                }
                case 155: {
                    n14 = 11;
                    break;
                }
                case 156: {
                    n14 = 178;
                    break;
                }
                case 157: {
                    n14 = 17;
                    break;
                }
                case 158: {
                    n14 = 167;
                    break;
                }
                case 159: {
                    n14 = 183;
                    break;
                }
                case 160: {
                    n14 = 129;
                    break;
                }
                case 161: {
                    n14 = 19;
                    break;
                }
                case 162: {
                    n14 = 44;
                    break;
                }
                case 163: {
                    n14 = 97;
                    break;
                }
                case 164: {
                    n14 = 60;
                    break;
                }
                case 165: {
                    n14 = 39;
                    break;
                }
                case 166: {
                    n14 = 241;
                    break;
                }
                case 167: {
                    n14 = 236;
                    break;
                }
                case 168: {
                    n14 = 191;
                    break;
                }
                case 169: {
                    n14 = 47;
                    break;
                }
                case 170: {
                    n14 = 228;
                    break;
                }
                case 171: {
                    n14 = 12;
                    break;
                }
                case 172: {
                    n14 = 25;
                    break;
                }
                case 173: {
                    n14 = 202;
                    break;
                }
                case 174: {
                    n14 = 211;
                    break;
                }
                case 175: {
                    n14 = 120;
                    break;
                }
                case 176: {
                    n14 = 213;
                    break;
                }
                case 177: {
                    n14 = 185;
                    break;
                }
                case 178: {
                    n14 = 194;
                    break;
                }
                case 179: {
                    n14 = 37;
                    break;
                }
                case 180: {
                    n14 = 49;
                    break;
                }
                case 181: {
                    n14 = 54;
                    break;
                }
                case 182: {
                    n14 = 160;
                    break;
                }
                case 183: {
                    n14 = 171;
                    break;
                }
                case 184: {
                    n14 = 99;
                    break;
                }
                case 185: {
                    n14 = 226;
                    break;
                }
                case 186: {
                    n14 = 70;
                    break;
                }
                case 187: {
                    n14 = 199;
                    break;
                }
                case 188: {
                    n14 = 142;
                    break;
                }
                case 189: {
                    n14 = 249;
                    break;
                }
                case 190: {
                    n14 = 173;
                    break;
                }
                case 191: {
                    n14 = 77;
                    break;
                }
                case 192: {
                    n14 = 255;
                    break;
                }
                case 193: {
                    n14 = 188;
                    break;
                }
                case 194: {
                    n14 = 157;
                    break;
                }
                case 195: {
                    n14 = 28;
                    break;
                }
                case 196: {
                    n14 = 13;
                    break;
                }
                case 197: {
                    n14 = 80;
                    break;
                }
                case 198: {
                    n14 = 95;
                    break;
                }
                case 199: {
                    n14 = 93;
                    break;
                }
                case 200: {
                    n14 = 154;
                    break;
                }
                case 201: {
                    n14 = 229;
                    break;
                }
                case 202: {
                    n14 = 155;
                    break;
                }
                case 203: {
                    n14 = 251;
                    break;
                }
                case 204: {
                    n14 = 153;
                    break;
                }
                case 205: {
                    n14 = 27;
                    break;
                }
                case 206: {
                    n14 = 250;
                    break;
                }
                case 207: {
                    n14 = 131;
                    break;
                }
                case 208: {
                    n14 = 141;
                    break;
                }
                case 209: {
                    n14 = 102;
                    break;
                }
                case 210: {
                    n14 = 107;
                    break;
                }
                case 211: {
                    n14 = 179;
                    break;
                }
                case 212: {
                    n14 = 138;
                    break;
                }
                case 213: {
                    n14 = 230;
                    break;
                }
                case 214: {
                    n14 = 124;
                    break;
                }
                case 215: {
                    n14 = 3;
                    break;
                }
                case 216: {
                    n14 = 205;
                    break;
                }
                case 217: {
                    n14 = 219;
                    break;
                }
                case 218: {
                    n14 = 214;
                    break;
                }
                case 219: {
                    n14 = 224;
                    break;
                }
                case 220: {
                    n14 = 145;
                    break;
                }
                case 221: {
                    n14 = 41;
                    break;
                }
                case 222: {
                    n14 = 66;
                    break;
                }
                case 223: {
                    n14 = 96;
                    break;
                }
                case 224: {
                    n14 = 165;
                    break;
                }
                case 225: {
                    n14 = 119;
                    break;
                }
                case 226: {
                    n14 = 175;
                    break;
                }
                case 227: {
                    n14 = 169;
                    break;
                }
                case 228: {
                    n14 = 108;
                    break;
                }
                case 229: {
                    n14 = 144;
                    break;
                }
                case 230: {
                    n14 = 128;
                    break;
                }
                case 231: {
                    n14 = 72;
                    break;
                }
                case 232: {
                    n14 = 244;
                    break;
                }
                case 233: {
                    n14 = 56;
                    break;
                }
                case 234: {
                    n14 = 48;
                    break;
                }
                case 235: {
                    n14 = 227;
                    break;
                }
                case 236: {
                    n14 = 7;
                    break;
                }
                case 237: {
                    n14 = 253;
                    break;
                }
                case 238: {
                    n14 = 238;
                    break;
                }
                case 239: {
                    n14 = 32;
                    break;
                }
                case 240: {
                    n14 = 239;
                    break;
                }
                case 241: {
                    n14 = 221;
                    break;
                }
                case 242: {
                    n14 = 159;
                    break;
                }
                case 243: {
                    n14 = 203;
                    break;
                }
                case 244: {
                    n14 = 103;
                    break;
                }
                case 245: {
                    n14 = 207;
                    break;
                }
                case 246: {
                    n14 = 161;
                    break;
                }
                case 247: {
                    n14 = 8;
                    break;
                }
                case 248: {
                    n14 = 134;
                    break;
                }
                case 249: {
                    n14 = 29;
                    break;
                }
                case 250: {
                    n14 = 189;
                    break;
                }
                case 251: {
                    n14 = 112;
                    break;
                }
                case 252: {
                    n14 = 45;
                    break;
                }
                case 253: {
                    n14 = 140;
                    break;
                }
                case 254: {
                    n14 = 58;
                    break;
                }
                default: {
                    n14 = 46;
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
            JU.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2198;
        if (f[n11] == null) {
            JU.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x8C2) & Short.MAX_VALUE;
        if (i[n11] == null) {
            JU.i[n11] = g[n11] ^ l2;
        }
        return i[n11];
    }
}

