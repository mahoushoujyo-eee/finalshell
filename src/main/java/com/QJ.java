/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dh_0;
import com.nm_2;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class QJ
extends FilterInputStream {
    protected final dh_0 k;
    protected byte[] f;
    private boolean w = false;
    protected boolean n = false;
    private boolean W = true;
    protected boolean L = false;
    private byte[] E = new byte[1];
    private byte[] y = new byte[QJ.a(17988, 8678541723860115610L)];
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] g;

    QJ(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    QJ(InputStream inputStream, boolean bl) throws IOException {
        this(inputStream, new dh_0(bl));
        this.L = true;
    }

    QJ(InputStream inputStream, dh_0 dh_02) throws IOException {
        this(inputStream, dh_02, QJ.a(23509, 3142985755786231048L));
    }

    QJ(InputStream inputStream, dh_0 dh_02, int n10) throws IOException {
        this(inputStream, dh_02, n10, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    QJ(InputStream inputStream, dh_0 dh_02, int n10, boolean bl) throws IOException {
        super(inputStream);
        if (inputStream == null) throw new NullPointerException();
        try {
            if (dh_02 == null) {
                throw new NullPointerException();
            }
        }
        catch (IOException iOException) {
            throw QJ.a(iOException);
        }
        try {
            if (n10 <= 0) {
                throw new IllegalArgumentException(QJ.a(-3300, 24472));
            }
        }
        catch (IOException iOException) {
            throw QJ.a(iOException);
        }
        this.k = dh_02;
        this.f = new byte[n10];
        this.W = bl;
    }

    @Override
    public int read() throws IOException {
        int n10;
        block12: {
            int n11;
            int n12;
            block10: {
                block11: {
                    int[] nArray;
                    block8: {
                        block9: {
                            nArray = nm_2.g();
                            try {
                                try {
                                    n12 = this.w;
                                    if (nArray != null) break block8;
                                    if (n12 == 0) break block9;
                                }
                                catch (IOException iOException) {
                                    throw QJ.a(iOException);
                                }
                                throw new IOException(QJ.a(-3298, 31006));
                            }
                            catch (IOException iOException) {
                                throw QJ.a(iOException);
                            }
                        }
                        n12 = this.read(this.E, 0, 1);
                    }
                    try {
                        try {
                            n11 = -1;
                            if (nArray != null) break block10;
                            if (n12 != n11) break block11;
                        }
                        catch (IOException iOException) {
                            throw QJ.a(iOException);
                        }
                        n10 = -1;
                        break block12;
                    }
                    catch (IOException iOException) {
                        throw QJ.a(iOException);
                    }
                }
                n12 = this.E[0];
                n11 = QJ.a(18116, 1556239961970876443L);
            }
            n10 = n12 & n11;
        }
        return n10;
    }

    /*
     * Exception decompiling
     */
    @Override
    public int read(byte[] var1_1, int var2_2, int var3_3) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[TRYBLOCK]], but top level block is 19[SWITCH]
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
    public int available() throws IOException {
        int n10;
        block10: {
            block11: {
                int[] nArray;
                block8: {
                    block9: {
                        nArray = nm_2.g();
                        try {
                            try {
                                n10 = this.w;
                                if (nArray != null) break block8;
                                if (n10 == 0) break block9;
                            }
                            catch (IOException iOException) {
                                throw QJ.a(iOException);
                            }
                            throw new IOException(QJ.a(-3301, -14251));
                        }
                        catch (IOException iOException) {
                            throw QJ.a(iOException);
                        }
                    }
                    n10 = this.n;
                }
                try {
                    try {
                        if (nArray != null) break block10;
                        if (n10 == 0) break block11;
                    }
                    catch (IOException iOException) {
                        throw QJ.a(iOException);
                    }
                    return 0;
                }
                catch (IOException iOException) {
                    throw QJ.a(iOException);
                }
            }
            n10 = 1;
        }
        return n10;
    }

    @Override
    public long skip(long l2) throws IOException {
        int n10;
        block23: {
            int n11;
            int[] nArray;
            block21: {
                block22: {
                    block19: {
                        block20: {
                            nArray = nm_2.g();
                            try {
                                try {
                                    long l3 = l2 - 0L;
                                    n11 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                    if (nArray != null) break block19;
                                    if (n11 >= 0) break block20;
                                }
                                catch (IOException iOException) {
                                    throw QJ.a(iOException);
                                }
                                throw new IllegalArgumentException(QJ.a(-3299, -15858));
                            }
                            catch (IOException iOException) {
                                throw QJ.a(iOException);
                            }
                        }
                        n11 = this.w ? 1 : 0;
                    }
                    try {
                        try {
                            if (nArray != null) break block21;
                            if (n11 == false) break block22;
                        }
                        catch (IOException iOException) {
                            throw QJ.a(iOException);
                        }
                        throw new IOException(QJ.a(-3301, -14251));
                    }
                    catch (IOException iOException) {
                        throw QJ.a(iOException);
                    }
                }
                n11 = (int)Math.min(l2, QJ.b(3857, 8325819572702381323L));
            }
            long l4 = n11;
            int n12 = 0;
            while (n12 < l4) {
                int n13;
                int n14;
                block26: {
                    long l5;
                    block24: {
                        block25: {
                            l5 = l4 - n12;
                            try {
                                try {
                                    n10 = (int)l5;
                                    if (nArray != null) break block23;
                                    n14 = this.y.length;
                                    if (nArray != null) break block24;
                                }
                                catch (IOException iOException) {
                                    throw QJ.a(iOException);
                                }
                                if (n10 <= n14) break block25;
                            }
                            catch (IOException iOException) {
                                throw QJ.a(iOException);
                            }
                            l5 = this.y.length;
                        }
                        l5 = this.read(this.y, 0, (int)l5);
                        n13 = (int)l5;
                        n14 = -1;
                    }
                    try {
                        block27: {
                            try {
                                try {
                                    if (nArray != null) break block26;
                                    if (n13 != n14) break block27;
                                }
                                catch (IOException iOException) {
                                    throw QJ.a(iOException);
                                }
                                this.n = true;
                                if (nArray == null) break;
                            }
                            catch (IOException iOException) {
                                throw QJ.a(iOException);
                            }
                        }
                        n13 = n12;
                        n14 = (int)l5;
                    }
                    catch (IOException iOException) {
                        throw QJ.a(iOException);
                    }
                }
                n12 = n13 + n14;
                if (nArray == null) continue;
            }
            n10 = n12;
        }
        return n10;
    }

    @Override
    public void close() throws IOException {
        block14: {
            block17: {
                QJ qJ;
                boolean bl;
                block15: {
                    int[] nArray;
                    block16: {
                        block13: {
                            nArray = nm_2.g();
                            try {
                                try {
                                    bl = this.w;
                                    if (nArray != null) break block13;
                                    if (bl) break block14;
                                }
                                catch (IOException iOException) {
                                    throw QJ.a(iOException);
                                }
                                bl = this.L;
                            }
                            catch (IOException iOException) {
                                throw QJ.a(iOException);
                            }
                        }
                        try {
                            try {
                                if (nArray != null) break block15;
                                if (!bl) break block16;
                            }
                            catch (IOException iOException) {
                                throw QJ.a(iOException);
                            }
                            this.k.v();
                        }
                        catch (IOException iOException) {
                            throw QJ.a(iOException);
                        }
                    }
                    try {
                        qJ = this;
                        if (nArray != null) break block17;
                        bl = qJ.W;
                    }
                    catch (IOException iOException) {
                        throw QJ.a(iOException);
                    }
                }
                try {
                    if (bl) {
                        this.in.close();
                    }
                }
                catch (IOException iOException) {
                    throw QJ.a(iOException);
                }
                qJ = this;
            }
            qJ.w = true;
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void f() throws IOException {
        block23: {
            block24: {
                block25: {
                    block21: {
                        block22: {
                            var1_1 = nm_2.g();
                            try {
                                try {
                                    v0 = this.w;
                                    if (var1_1 != null) break block21;
                                    if (v0 == 0) break block22;
                                }
                                catch (IOException v1) {
                                    throw QJ.a(v1);
                                }
                                throw new IOException(QJ.a(-3301, -14251));
                            }
                            catch (IOException v2) {
                                throw QJ.a(v2);
                            }
                        }
                        v0 = this.in.read(this.f, 0, this.f.length);
                    }
                    var2_2 = v0;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (var1_1 != null) break block23;
                                        if (var2_2 != -1) break block24;
                                    }
                                    catch (IOException v3) {
                                        throw QJ.a(v3);
                                    }
                                    v4 = this.k.T.y;
                                    if (var1_1 != null) break block25;
                                }
                                catch (IOException v5) {
                                    throw QJ.a(v5);
                                }
                                if (v4 == 0) {
                                }
                                ** GOTO lbl51
                            }
                            catch (IOException v6) {
                                throw QJ.a(v6);
                            }
                            v4 = (int)this.k.h();
                            if (var1_1 != null) break block25;
                        }
                        catch (IOException v7) {
                            throw QJ.a(v7);
                        }
                        if (v4 == 0) {
                        }
                        ** GOTO lbl51
                    }
                    catch (IOException v8) {
                        throw QJ.a(v8);
                    }
                    this.f[0] = 0;
                    var2_2 = 1;
                    try {
                        if (var1_1 == null) break block24;
lbl51:
                        // 3 sources

                        v4 = (cfr_temp_0 = this.k.T.i - QJ.b(23181, 169652044764762262L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    }
                    catch (IOException v9) {
                        throw QJ.a(v9);
                    }
                }
                try {
                    if (v4 != 0) {
                        throw new IOException(QJ.a(-3297, 27914));
                    }
                }
                catch (IOException v10) {
                    throw QJ.a(v10);
                }
                throw new EOFException(QJ.a(-3302, -5392));
            }
            this.k.Z(this.f, 0, var2_2, true);
        }
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public synchronized void mark(int n10) {
    }

    @Override
    public synchronized void reset() throws IOException {
        throw new IOException(QJ.a(-3304, -8201));
    }

    long m() {
        return this.k.z();
    }

    long K() {
        return this.k.N();
    }

    byte[] X() {
        int n10;
        block4: {
            block5: {
                int[] nArray = nm_2.g();
                try {
                    try {
                        n10 = this.k.L;
                        if (nArray != null) break block4;
                        if (n10 > 0) break block5;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw QJ.a(nullPointerException);
                    }
                    return null;
                }
                catch (NullPointerException nullPointerException) {
                    throw QJ.a(nullPointerException);
                }
            }
            n10 = this.k.L;
        }
        byte[] byArray = new byte[n10];
        System.arraycopy(this.k.x, this.k.f, byArray, 0, this.k.L);
        return byArray;
    }

    void q() throws IOException {
        int n10;
        int n11;
        int n12;
        int[] nArray;
        block8: {
            block9: {
                int[] nArray2 = nm_2.g();
                byte[] byArray = "".getBytes();
                this.k.Z(byArray, 0, 0, false);
                this.k.U(byArray, 0, 0);
                nArray = nArray2;
                n12 = this.k.Q(0);
                try {
                    n11 = this.k.T.z();
                    if (nArray != null) break block8;
                    if (n11 != 0) break block9;
                }
                catch (IOException iOException) {
                    throw QJ.a(iOException);
                }
                return;
            }
            n11 = 1;
        }
        byte[] byArray = new byte[n11];
        do {
            block10: {
                int n13;
                if ((n13 = this.in.read(byArray)) <= 0) {
                    throw new IOException(QJ.a(-3303, 24090));
                }
                this.k.b(byArray);
                n12 = this.k.Q(0);
                try {
                    try {
                        n10 = n12;
                        if (nArray != null) continue;
                        if (n10 == 0) break block10;
                    }
                    catch (IOException iOException) {
                        throw QJ.a(iOException);
                    }
                    throw new IOException(this.k.t);
                }
                catch (IOException iOException) {
                    throw QJ.a(iOException);
                }
            }
            n10 = this.k.T.z() ? 1 : 0;
        } while (n10 != 0);
    }

    dh_0 h() {
        return this.k;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block27: {
                block26: {
                    block25: {
                        block24: {
                            block23: {
                                var21 = new String[8];
                                var19_1 = 0;
                                var18_2 = "\u0099ZsW\u009f\u00d4\u0007+\u00f2\u00fe\u008d\u00a9\u00b0\u00b9J\u0000\u00eaW\u0014\u00b1\u00d5>]\u00ab\bX\u00baz\u0086\u00e7\u00aeq!#\u00e5\u00ff\u00d4\u001e\u00c1\u009b~0\u001bj\u00b0\"\u0016\u00b2\u00bfoGu\u00fa\u008c\\\u00e8u\u008c\u00deGG\u00b9\u00ed\u0000\u001fU\u009e\u00bd,\rX\u00cb\u00b2\u00dc\u00e9u\u000b\u00f3\u0097\u00ecZ\u0098x\"\u00ea\u00e3\u00e7\u00fb\u00d1\u00ed\u0088\f\u00e2\u0014Gu\u0006\u00a4\u008d\u0085~\u0012l\u0006xh_\u00a2l\u009eOa_\u00de\u0082\u00ea\u00df\u0084\u0014q)\u0018\u00b7\u001e\u0098\u0014\u00cc\u00a4\u00d1\u00e1\u00ac\u0000\u00aa\u00ec\u00aa\u00e0\u00c1)\u0091";
                                var20_3 = "\u0099ZsW\u009f\u00d4\u0007+\u00f2\u00fe\u008d\u00a9\u00b0\u00b9J\u0000\u00eaW\u0014\u00b1\u00d5>]\u00ab\bX\u00baz\u0086\u00e7\u00aeq!#\u00e5\u00ff\u00d4\u001e\u00c1\u009b~0\u001bj\u00b0\"\u0016\u00b2\u00bfoGu\u00fa\u008c\\\u00e8u\u008c\u00deGG\u00b9\u00ed\u0000\u001fU\u009e\u00bd,\rX\u00cb\u00b2\u00dc\u00e9u\u000b\u00f3\u0097\u00ecZ\u0098x\"\u00ea\u00e3\u00e7\u00fb\u00d1\u00ed\u0088\f\u00e2\u0014Gu\u0006\u00a4\u008d\u0085~\u0012l\u0006xh_\u00a2l\u009eOa_\u00de\u0082\u00ea\u00df\u0084\u0014q)\u0018\u00b7\u001e\u0098\u0014\u00cc\u00a4\u00d1\u00e1\u00ac\u0000\u00aa\u00ec\u00aa\u00e0\u00c1)\u0091".length();
                                var17_4 = 24;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 111;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block23;
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
                                    var18_2 = "\u00b4\u00d9\u0007\u00b6w\u0010\u00f0w\u00c0T\u0098\u00a7\b\u0013\u008a\u00c3N\u009c\u00e4y\u0006\u00ac\u0001+A\u00e4\u009dM\u00f9t:p2";
                                    var20_3 = "\u00b4\u00d9\u0007\u00b6w\u0010\u00f0w\u00c0T\u0098\u00a7\b\u0013\u008a\u00c3N\u009c\u00e4y\u0006\u00ac\u0001+A\u00e4\u009dM\u00f9t:p2".length();
                                    var17_4 = 13;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 102;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block23;
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
                                    break block24;
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
                                            v15 = 24;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 63;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 115;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 95;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 14;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 35;
                                            break;
                                        }
                                        default: {
                                            v15 = 24;
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
                        QJ.a = var21;
                        QJ.b = new String[8];
                        var8_7 = 6109739940571584177L;
                        var14_8 = new long[3];
                        var11_9 = 0;
                        var12_10 = "\u00ae\u0096\u0094-\u00edC\u00b6U\u00fb\u00cd|\u0099`\u00df\u00b4+\u00f0\u000e\u009a[h\t)\u00b9";
                        var13_11 = "\u00ae\u0096\u0094-\u00edC\u00b6U\u00fb\u00cd|\u0099`\u00df\u00b4+\u00f0\u000e\u009a[h\t)\u00b9".length();
                        var10_12 = 0;
                        while (true) {
                            break block25;
                            break;
                        }
lbl107:
                        // 1 sources

                        while (true) {
                            var14_8[v17] = (((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L) ^ var8_7;
                            if (var10_12 < var13_11) ** continue;
                            break block26;
                            break;
                        }
                    }
                    var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                    v17 = var11_9++;
                    ** while (true)
                }
                QJ.c = var14_8;
                QJ.d = new Integer[3];
                var0_14 = 1994948756419656421L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "h$;\u0099r\u0094@\u0011\u00e6\n=\u000e;\u00e0\u0095\u008c";
                var5_18 = "h$;\u0099r\u0094@\u0011\u00e6\n=\u000e;\u00e0\u0095\u008c".length();
                var2_19 = 0;
                while (true) {
                    break block27;
                    break;
                }
lbl129:
                // 1 sources

                while (true) {
                    var6_15[v18] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block28;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v18 = var3_16++;
            ** while (true)
        }
        QJ.e = var6_15;
        QJ.g = new Long[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF318) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 192;
                    break;
                }
                case 1: {
                    n14 = 38;
                    break;
                }
                case 2: {
                    n14 = 235;
                    break;
                }
                case 3: {
                    n14 = 67;
                    break;
                }
                case 4: {
                    n14 = 142;
                    break;
                }
                case 5: {
                    n14 = 186;
                    break;
                }
                case 6: {
                    n14 = 166;
                    break;
                }
                case 7: {
                    n14 = 29;
                    break;
                }
                case 8: {
                    n14 = 206;
                    break;
                }
                case 9: {
                    n14 = 254;
                    break;
                }
                case 10: {
                    n14 = 189;
                    break;
                }
                case 11: {
                    n14 = 26;
                    break;
                }
                case 12: {
                    n14 = 127;
                    break;
                }
                case 13: {
                    n14 = 47;
                    break;
                }
                case 14: {
                    n14 = 204;
                    break;
                }
                case 15: {
                    n14 = 109;
                    break;
                }
                case 16: {
                    n14 = 233;
                    break;
                }
                case 17: {
                    n14 = 149;
                    break;
                }
                case 18: {
                    n14 = 51;
                    break;
                }
                case 19: {
                    n14 = 176;
                    break;
                }
                case 20: {
                    n14 = 30;
                    break;
                }
                case 21: {
                    n14 = 242;
                    break;
                }
                case 22: {
                    n14 = 155;
                    break;
                }
                case 23: {
                    n14 = 99;
                    break;
                }
                case 24: {
                    n14 = 129;
                    break;
                }
                case 25: {
                    n14 = 5;
                    break;
                }
                case 26: {
                    n14 = 20;
                    break;
                }
                case 27: {
                    n14 = 102;
                    break;
                }
                case 28: {
                    n14 = 207;
                    break;
                }
                case 29: {
                    n14 = 162;
                    break;
                }
                case 30: {
                    n14 = 69;
                    break;
                }
                case 31: {
                    n14 = 58;
                    break;
                }
                case 32: {
                    n14 = 25;
                    break;
                }
                case 33: {
                    n14 = 55;
                    break;
                }
                case 34: {
                    n14 = 13;
                    break;
                }
                case 35: {
                    n14 = 227;
                    break;
                }
                case 36: {
                    n14 = 248;
                    break;
                }
                case 37: {
                    n14 = 122;
                    break;
                }
                case 38: {
                    n14 = 52;
                    break;
                }
                case 39: {
                    n14 = 208;
                    break;
                }
                case 40: {
                    n14 = 85;
                    break;
                }
                case 41: {
                    n14 = 216;
                    break;
                }
                case 42: {
                    n14 = 56;
                    break;
                }
                case 43: {
                    n14 = 197;
                    break;
                }
                case 44: {
                    n14 = 224;
                    break;
                }
                case 45: {
                    n14 = 50;
                    break;
                }
                case 46: {
                    n14 = 89;
                    break;
                }
                case 47: {
                    n14 = 217;
                    break;
                }
                case 48: {
                    n14 = 212;
                    break;
                }
                case 49: {
                    n14 = 187;
                    break;
                }
                case 50: {
                    n14 = 76;
                    break;
                }
                case 51: {
                    n14 = 179;
                    break;
                }
                case 52: {
                    n14 = 36;
                    break;
                }
                case 53: {
                    n14 = 126;
                    break;
                }
                case 54: {
                    n14 = 121;
                    break;
                }
                case 55: {
                    n14 = 141;
                    break;
                }
                case 56: {
                    n14 = 246;
                    break;
                }
                case 57: {
                    n14 = 220;
                    break;
                }
                case 58: {
                    n14 = 253;
                    break;
                }
                case 59: {
                    n14 = 100;
                    break;
                }
                case 60: {
                    n14 = 147;
                    break;
                }
                case 61: {
                    n14 = 17;
                    break;
                }
                case 62: {
                    n14 = 223;
                    break;
                }
                case 63: {
                    n14 = 1;
                    break;
                }
                case 64: {
                    n14 = 241;
                    break;
                }
                case 65: {
                    n14 = 98;
                    break;
                }
                case 66: {
                    n14 = 88;
                    break;
                }
                case 67: {
                    n14 = 16;
                    break;
                }
                case 68: {
                    n14 = 185;
                    break;
                }
                case 69: {
                    n14 = 90;
                    break;
                }
                case 70: {
                    n14 = 169;
                    break;
                }
                case 71: {
                    n14 = 152;
                    break;
                }
                case 72: {
                    n14 = 82;
                    break;
                }
                case 73: {
                    n14 = 148;
                    break;
                }
                case 74: {
                    n14 = 14;
                    break;
                }
                case 75: {
                    n14 = 209;
                    break;
                }
                case 76: {
                    n14 = 92;
                    break;
                }
                case 77: {
                    n14 = 71;
                    break;
                }
                case 78: {
                    n14 = 172;
                    break;
                }
                case 79: {
                    n14 = 60;
                    break;
                }
                case 80: {
                    n14 = 137;
                    break;
                }
                case 81: {
                    n14 = 105;
                    break;
                }
                case 82: {
                    n14 = 195;
                    break;
                }
                case 83: {
                    n14 = 7;
                    break;
                }
                case 84: {
                    n14 = 110;
                    break;
                }
                case 85: {
                    n14 = 238;
                    break;
                }
                case 86: {
                    n14 = 2;
                    break;
                }
                case 87: {
                    n14 = 140;
                    break;
                }
                case 88: {
                    n14 = 165;
                    break;
                }
                case 89: {
                    n14 = 205;
                    break;
                }
                case 90: {
                    n14 = 210;
                    break;
                }
                case 91: {
                    n14 = 201;
                    break;
                }
                case 92: {
                    n14 = 117;
                    break;
                }
                case 93: {
                    n14 = 221;
                    break;
                }
                case 94: {
                    n14 = 113;
                    break;
                }
                case 95: {
                    n14 = 57;
                    break;
                }
                case 96: {
                    n14 = 178;
                    break;
                }
                case 97: {
                    n14 = 200;
                    break;
                }
                case 98: {
                    n14 = 198;
                    break;
                }
                case 99: {
                    n14 = 252;
                    break;
                }
                case 100: {
                    n14 = 28;
                    break;
                }
                case 101: {
                    n14 = 108;
                    break;
                }
                case 102: {
                    n14 = 139;
                    break;
                }
                case 103: {
                    n14 = 128;
                    break;
                }
                case 104: {
                    n14 = 247;
                    break;
                }
                case 105: {
                    n14 = 245;
                    break;
                }
                case 106: {
                    n14 = 167;
                    break;
                }
                case 107: {
                    n14 = 232;
                    break;
                }
                case 108: {
                    n14 = 163;
                    break;
                }
                case 109: {
                    n14 = 9;
                    break;
                }
                case 110: {
                    n14 = 164;
                    break;
                }
                case 111: {
                    n14 = 174;
                    break;
                }
                case 112: {
                    n14 = 222;
                    break;
                }
                case 113: {
                    n14 = 40;
                    break;
                }
                case 114: {
                    n14 = 229;
                    break;
                }
                case 115: {
                    n14 = 240;
                    break;
                }
                case 116: {
                    n14 = 236;
                    break;
                }
                case 117: {
                    n14 = 131;
                    break;
                }
                case 118: {
                    n14 = 37;
                    break;
                }
                case 119: {
                    n14 = 101;
                    break;
                }
                case 120: {
                    n14 = 12;
                    break;
                }
                case 121: {
                    n14 = 78;
                    break;
                }
                case 122: {
                    n14 = 243;
                    break;
                }
                case 123: {
                    n14 = 35;
                    break;
                }
                case 124: {
                    n14 = 250;
                    break;
                }
                case 125: {
                    n14 = 111;
                    break;
                }
                case 126: {
                    n14 = 3;
                    break;
                }
                case 127: {
                    n14 = 124;
                    break;
                }
                case 128: {
                    n14 = 156;
                    break;
                }
                case 129: {
                    n14 = 63;
                    break;
                }
                case 130: {
                    n14 = 8;
                    break;
                }
                case 131: {
                    n14 = 31;
                    break;
                }
                case 132: {
                    n14 = 157;
                    break;
                }
                case 133: {
                    n14 = 134;
                    break;
                }
                case 134: {
                    n14 = 214;
                    break;
                }
                case 135: {
                    n14 = 191;
                    break;
                }
                case 136: {
                    n14 = 239;
                    break;
                }
                case 137: {
                    n14 = 230;
                    break;
                }
                case 138: {
                    n14 = 59;
                    break;
                }
                case 139: {
                    n14 = 74;
                    break;
                }
                case 140: {
                    n14 = 168;
                    break;
                }
                case 141: {
                    n14 = 96;
                    break;
                }
                case 142: {
                    n14 = 182;
                    break;
                }
                case 143: {
                    n14 = 6;
                    break;
                }
                case 144: {
                    n14 = 218;
                    break;
                }
                case 145: {
                    n14 = 94;
                    break;
                }
                case 146: {
                    n14 = 41;
                    break;
                }
                case 147: {
                    n14 = 11;
                    break;
                }
                case 148: {
                    n14 = 86;
                    break;
                }
                case 149: {
                    n14 = 219;
                    break;
                }
                case 150: {
                    n14 = 73;
                    break;
                }
                case 151: {
                    n14 = 213;
                    break;
                }
                case 152: {
                    n14 = 249;
                    break;
                }
                case 153: {
                    n14 = 150;
                    break;
                }
                case 154: {
                    n14 = 173;
                    break;
                }
                case 155: {
                    n14 = 24;
                    break;
                }
                case 156: {
                    n14 = 231;
                    break;
                }
                case 157: {
                    n14 = 153;
                    break;
                }
                case 158: {
                    n14 = 32;
                    break;
                }
                case 159: {
                    n14 = 22;
                    break;
                }
                case 160: {
                    n14 = 151;
                    break;
                }
                case 161: {
                    n14 = 45;
                    break;
                }
                case 162: {
                    n14 = 44;
                    break;
                }
                case 163: {
                    n14 = 136;
                    break;
                }
                case 164: {
                    n14 = 211;
                    break;
                }
                case 165: {
                    n14 = 135;
                    break;
                }
                case 166: {
                    n14 = 159;
                    break;
                }
                case 167: {
                    n14 = 68;
                    break;
                }
                case 168: {
                    n14 = 234;
                    break;
                }
                case 169: {
                    n14 = 226;
                    break;
                }
                case 170: {
                    n14 = 91;
                    break;
                }
                case 171: {
                    n14 = 93;
                    break;
                }
                case 172: {
                    n14 = 66;
                    break;
                }
                case 173: {
                    n14 = 132;
                    break;
                }
                case 174: {
                    n14 = 77;
                    break;
                }
                case 175: {
                    n14 = 54;
                    break;
                }
                case 176: {
                    n14 = 79;
                    break;
                }
                case 177: {
                    n14 = 103;
                    break;
                }
                case 178: {
                    n14 = 175;
                    break;
                }
                case 179: {
                    n14 = 27;
                    break;
                }
                case 180: {
                    n14 = 184;
                    break;
                }
                case 181: {
                    n14 = 61;
                    break;
                }
                case 182: {
                    n14 = 70;
                    break;
                }
                case 183: {
                    n14 = 180;
                    break;
                }
                case 184: {
                    n14 = 171;
                    break;
                }
                case 185: {
                    n14 = 95;
                    break;
                }
                case 186: {
                    n14 = 107;
                    break;
                }
                case 187: {
                    n14 = 42;
                    break;
                }
                case 188: {
                    n14 = 138;
                    break;
                }
                case 189: {
                    n14 = 65;
                    break;
                }
                case 190: {
                    n14 = 114;
                    break;
                }
                case 191: {
                    n14 = 251;
                    break;
                }
                case 192: {
                    n14 = 177;
                    break;
                }
                case 193: {
                    n14 = 154;
                    break;
                }
                case 194: {
                    n14 = 118;
                    break;
                }
                case 195: {
                    n14 = 46;
                    break;
                }
                case 196: {
                    n14 = 215;
                    break;
                }
                case 197: {
                    n14 = 115;
                    break;
                }
                case 198: {
                    n14 = 203;
                    break;
                }
                case 199: {
                    n14 = 34;
                    break;
                }
                case 200: {
                    n14 = 225;
                    break;
                }
                case 201: {
                    n14 = 194;
                    break;
                }
                case 202: {
                    n14 = 133;
                    break;
                }
                case 203: {
                    n14 = 146;
                    break;
                }
                case 204: {
                    n14 = 75;
                    break;
                }
                case 205: {
                    n14 = 39;
                    break;
                }
                case 206: {
                    n14 = 10;
                    break;
                }
                case 207: {
                    n14 = 15;
                    break;
                }
                case 208: {
                    n14 = 53;
                    break;
                }
                case 209: {
                    n14 = 161;
                    break;
                }
                case 210: {
                    n14 = 228;
                    break;
                }
                case 211: {
                    n14 = 106;
                    break;
                }
                case 212: {
                    n14 = 104;
                    break;
                }
                case 213: {
                    n14 = 83;
                    break;
                }
                case 214: {
                    n14 = 81;
                    break;
                }
                case 215: {
                    n14 = 160;
                    break;
                }
                case 216: {
                    n14 = 0;
                    break;
                }
                case 217: {
                    n14 = 123;
                    break;
                }
                case 218: {
                    n14 = 21;
                    break;
                }
                case 219: {
                    n14 = 158;
                    break;
                }
                case 220: {
                    n14 = 80;
                    break;
                }
                case 221: {
                    n14 = 196;
                    break;
                }
                case 222: {
                    n14 = 255;
                    break;
                }
                case 223: {
                    n14 = 72;
                    break;
                }
                case 224: {
                    n14 = 33;
                    break;
                }
                case 225: {
                    n14 = 23;
                    break;
                }
                case 226: {
                    n14 = 145;
                    break;
                }
                case 227: {
                    n14 = 18;
                    break;
                }
                case 228: {
                    n14 = 4;
                    break;
                }
                case 229: {
                    n14 = 144;
                    break;
                }
                case 230: {
                    n14 = 170;
                    break;
                }
                case 231: {
                    n14 = 188;
                    break;
                }
                case 232: {
                    n14 = 119;
                    break;
                }
                case 233: {
                    n14 = 43;
                    break;
                }
                case 234: {
                    n14 = 244;
                    break;
                }
                case 235: {
                    n14 = 48;
                    break;
                }
                case 236: {
                    n14 = 193;
                    break;
                }
                case 237: {
                    n14 = 87;
                    break;
                }
                case 238: {
                    n14 = 116;
                    break;
                }
                case 239: {
                    n14 = 199;
                    break;
                }
                case 240: {
                    n14 = 183;
                    break;
                }
                case 241: {
                    n14 = 49;
                    break;
                }
                case 242: {
                    n14 = 62;
                    break;
                }
                case 243: {
                    n14 = 19;
                    break;
                }
                case 244: {
                    n14 = 120;
                    break;
                }
                case 245: {
                    n14 = 237;
                    break;
                }
                case 246: {
                    n14 = 97;
                    break;
                }
                case 247: {
                    n14 = 190;
                    break;
                }
                case 248: {
                    n14 = 143;
                    break;
                }
                case 249: {
                    n14 = 125;
                    break;
                }
                case 250: {
                    n14 = 64;
                    break;
                }
                case 251: {
                    n14 = 112;
                    break;
                }
                case 252: {
                    n14 = 84;
                    break;
                }
                case 253: {
                    n14 = 130;
                    break;
                }
                case 254: {
                    n14 = 181;
                    break;
                }
                default: {
                    n14 = 202;
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
            QJ.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x66DF;
        if (d[n11] == null) {
            QJ.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0xA1A) & Short.MAX_VALUE;
        if (g[n11] == null) {
            QJ.g[n11] = e[n11] ^ l2;
        }
        return g[n11];
    }
}

