/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.E8;
import com.GN;
import com.IX;
import com.YU;
import com.aQ;
import com.ae_0;
import com.ag_0;
import com.cs_2;
import com.dm_2;
import com.pc_0;
import com.pj_1;
import com.uJ;
import java.net.Socket;
import java.util.Vector;

/*
 * Renamed from com.dS
 */
public class ds_1
extends dm_2 {
    private static Vector G;
    private Socket x = null;
    private IX W = null;
    private aQ a = null;
    private static final String[] f;
    private static final String[] g;
    private static final long[] h;
    private static final Integer[] i;

    ds_1() {
        this.M(ds_1.b(20633, 2584653661390976490L));
        this.Q(ds_1.b(940, 6660855936291333854L));
        this.f(ds_1.b(26425, 6693608346007831118L));
        this.o = new cs_2();
        this.X = true;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void S() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[MONITOR]], but top level block is 32[WHILELOOP]
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
    void D(uJ uJ2) {
        block14: {
            int n10;
            GN gN2;
            int n11;
            byte[] byArray;
            block15: {
                aQ aQ2;
                DI dI;
                boolean bl;
                block12: {
                    block13: {
                        this.N(uJ2.d());
                        this.X(uJ2.K());
                        boolean bl2 = dm_2.J();
                        this.A(uJ2.d());
                        bl = bl2;
                        byArray = uJ2.S();
                        n11 = uJ2.d();
                        byte[] byArray2 = uJ2.S();
                        int n12 = uJ2.d();
                        dI = null;
                        try {
                            dI = this.T();
                        }
                        catch (pc_0 pc_02) {
                            // empty catch block
                        }
                        try {
                            try {
                                aQ2 = this.a = ds_1.y(dI, E8.B(byArray), n11);
                                if (bl) break block12;
                                if (aQ2 != null) break block13;
                            }
                            catch (pc_0 pc_03) {
                                throw ds_1.b(pc_03);
                            }
                            this.a = ds_1.y(dI, null, n11);
                        }
                        catch (pc_0 pc_04) {
                            throw ds_1.b(pc_04);
                        }
                    }
                    aQ2 = this.a;
                }
                try {
                    try {
                        try {
                            if (aQ2 != null) break block14;
                            gN2 = dI.W();
                            n10 = 3;
                            if (bl) break block15;
                        }
                        catch (pc_0 pc_05) {
                            throw ds_1.b(pc_05);
                        }
                        if (!gN2.K(n10)) break block14;
                    }
                    catch (pc_0 pc_06) {
                        throw ds_1.b(pc_06);
                    }
                    gN2 = dI.W();
                    n10 = 3;
                }
                catch (pc_0 pc_07) {
                    throw ds_1.b(pc_07);
                }
            }
            gN2.t(n10, ds_1.b(27708, 31877) + E8.B(byArray) + ":" + n11 + ds_1.b(27704, 2458));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static aQ y(DI dI, String string, int n10) {
        Vector vector = G;
        synchronized (vector) {
            boolean bl = dm_2.J();
            for (int i2 = 0; i2 < G.size(); ++i2) {
                aQ aQ2;
                block16: {
                    aQ aQ3;
                    block15: {
                        String string2;
                        block14: {
                            block13: {
                                int n11;
                                block12: {
                                    aQ aQ4 = aQ3 = (aQ)G.elementAt(i2);
                                    if (!bl) {
                                        if (aQ4.o != dI && !bl) continue;
                                        aQ4 = aQ3;
                                    }
                                    n11 = aQ4.j;
                                    if (bl) break block12;
                                    if (n11 == n10) break block13;
                                    n11 = aQ3.j;
                                }
                                if (!bl) {
                                    if (n11 != 0) continue;
                                    n11 = aQ3.w;
                                }
                                if (n11 != n10 && !bl) continue;
                            }
                            string2 = string;
                            if (bl) break block14;
                            if (string2 == null) break block15;
                            aQ2 = aQ3;
                            if (bl) break block16;
                            string2 = aQ2.M;
                        }
                        if (!string2.equals(string) && !bl) continue;
                    }
                    aQ2 = aQ3;
                }
                return aQ2;
            }
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static String[] R(DI dI) {
        Vector<String> vector = new Vector<String>();
        boolean bl = dm_2.F();
        String[] stringArray = G;
        synchronized (G) {
            String[] stringArray2;
            block11: {
                int n10;
                block10: {
                    n10 = 0;
                    while (n10 < G.size()) {
                        block12: {
                            block13: {
                                aQ aQ2;
                                block14: {
                                    aQ2 = (aQ)G.elementAt(n10);
                                    if (!bl) break block10;
                                    if (!bl) break block12;
                                    if (aQ2.o != dI) break block13;
                                    if (!(aQ2 instanceof ag_0)) break block14;
                                    vector.addElement(aQ2.w + ":" + aQ2.X + ":");
                                    if (bl) break block13;
                                }
                                vector.addElement(aQ2.w + ":" + aQ2.X + ":" + ((ae_0)aQ2).H);
                            }
                            ++n10;
                        }
                        if (bl) continue;
                    }
                    // ** MonitorExit[var3_3] (shouldn't be in output)
                }
                stringArray = new String[vector.size()];
                for (n10 = 0; n10 < vector.size(); ++n10) {
                    stringArray2 = stringArray;
                    if (bl) {
                        stringArray2[n10] = (String)vector.elementAt(n10);
                        if (bl) continue;
                    }
                    break block11;
                }
                stringArray2 = stringArray;
            }
            return stringArray2;
        }
    }

    static String J(String string) {
        String string2;
        block7: {
            block8: {
                String string3;
                block5: {
                    block6: {
                        boolean bl = dm_2.J();
                        string3 = string;
                        if (!bl) {
                            if (string3 == null) {
                                return ds_1.b(27705, -21911);
                            }
                            string3 = string;
                        }
                        if (bl) break block5;
                        if (string3.length() == 0) break block6;
                        string2 = string;
                        if (bl) break block7;
                        if (!string2.equals("*")) break block8;
                    }
                    string3 = "";
                }
                return string3;
            }
            string2 = string;
        }
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void f(DI dI, String string, int n10, int n11, String string2, int n12, pj_1 pj_12) throws pc_0 {
        String string3 = ds_1.J(string);
        Vector vector = G;
        synchronized (vector) {
            if (ds_1.y(dI, string3, n10) != null) {
                throw new pc_0(ds_1.b(27706, 26062) + n10 + ds_1.b(27707, 14326));
            }
            ae_0 ae_02 = new ae_0();
            ae_02.o = dI;
            ae_02.j = n10;
            ae_02.w = n11;
            ae_02.X = string2;
            ae_02.H = n12;
            ae_02.M = string3;
            ae_02.O = pj_12;
            G.addElement(ae_02);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void f(DI dI, String string, int n10, int n11, String string2, Object[] objectArray) throws pc_0 {
        String string3 = ds_1.J(string);
        Vector vector = G;
        synchronized (vector) {
            if (ds_1.y(dI, string3, n10) != null) {
                throw new pc_0(ds_1.b(27711, -28077) + n10 + ds_1.b(27710, -29124));
            }
            ag_0 ag_02 = new ag_0();
            ag_02.o = dI;
            ag_02.j = n10;
            ag_02.w = n10;
            ag_02.X = string2;
            ag_02.k = objectArray;
            ag_02.M = string3;
            G.addElement(ag_02);
        }
    }

    static void f(ds_1 ds_12) {
        block6: {
            DI dI = null;
            try {
                dI = ds_12.T();
            }
            catch (pc_0 pc_02) {
                // empty catch block
            }
            try {
                try {
                    if (dI == null || ds_12.a == null) break block6;
                }
                catch (pc_0 pc_03) {
                    throw ds_1.b(pc_03);
                }
                ds_1.W(dI, ds_12.a.j);
            }
            catch (pc_0 pc_04) {
                throw ds_1.b(pc_04);
            }
        }
    }

    static void W(DI dI, int n10) {
        ds_1.c(dI, null, n10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void c(DI dI, String string, int n10) {
        Object object;
        Object object2 = G;
        synchronized (object2) {
            block17: {
                String string2;
                block16: {
                    boolean bl;
                    block14: {
                        block15: {
                            aQ aQ2;
                            block12: {
                                block13: {
                                    bl = dm_2.J();
                                    object = ds_1.y(dI, ds_1.J(string), n10);
                                    try {
                                        aQ2 = object;
                                        if (bl) break block12;
                                        if (aQ2 != null) break block13;
                                    }
                                    catch (Exception exception) {
                                        throw ds_1.b(exception);
                                    }
                                    object = ds_1.y(dI, null, n10);
                                }
                                aQ2 = object;
                            }
                            if (aQ2 == null) {
                                return;
                            }
                            try {
                                G.removeElement(object);
                                string2 = string;
                                if (bl) break block14;
                                if (string2 != null) break block15;
                            }
                            catch (Exception exception) {
                                throw ds_1.b(exception);
                            }
                            string = ((aQ)object).M;
                        }
                        string2 = string;
                    }
                    try {
                        if (bl) break block16;
                        if (string2 != null) break block17;
                    }
                    catch (Exception exception) {
                        throw ds_1.b(exception);
                    }
                    string2 = ds_1.b(27709, -9776);
                }
                string = string2;
            }
        }
        object2 = new uJ(ds_1.b(31008, 3971855211882060889L));
        object = new YU((uJ)object2);
        try {
            ((YU)object).M();
            ((uJ)object2).V((byte)ds_1.b(10395, 2618938027814014435L));
            ((uJ)object2).q(E8.J(ds_1.b(27700, -21697)));
            ((uJ)object2).V((byte)0);
            ((uJ)object2).q(E8.J(string));
            ((uJ)object2).u(n10);
            dI.D((YU)object);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void M(DI dI) {
        int[] nArray = null;
        int n10 = 0;
        Vector vector = G;
        synchronized (vector) {
            boolean bl = dm_2.F();
            nArray = new int[G.size()];
            int n11 = 0;
            while (n11 < G.size()) {
                aQ aQ2 = (aQ)G.elementAt(n11);
                if (bl) {
                    if (bl) {
                        if (aQ2.o == dI) {
                            nArray[n10++] = aQ2.j;
                        }
                        ++n11;
                    }
                    if (bl) continue;
                }
                break;
            }
            for (int i2 = 0; i2 < n10; ++i2) {
                ds_1.W(dI, nArray[i2]);
                if (bl) continue;
            }
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int M() {
        boolean bl = dm_2.J();
        aQ aQ2 = this.a;
        if (!bl) {
            if (aQ2 == null) return 0;
            aQ2 = this.a;
        }
        int n10 = aQ2.j;
        return n10;
    }

    private void c(pj_1 pj_12) {
        block3: {
            block4: {
                aQ aQ2;
                boolean bl;
                block2: {
                    bl = dm_2.J();
                    aQ2 = this.a;
                    if (bl) break block2;
                    if (aQ2 == null) break block3;
                    aQ2 = this.a;
                }
                if (bl) break block4;
                if (!(aQ2 instanceof ae_0)) break block3;
                aQ2 = this.a;
            }
            ((ae_0)aQ2).O = pj_12;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "B\f\u00e0\u00a4\u00c2\u00e8\u008fn\u00d3\u00d3\u00a1\u00daej\tm^(\u00b8\u00dd\u0005\u001dv\u0007.U!A\u00dfW\u00e5\u00170[\u00b3!\u00f7\u00d6\u00d9\u00a2\u00ca\u001bCV\u00f6\u0093y~5\u00d1#\b\u00d0\u00a5Q\u001d\u00ff\u00fd5g!\u00c3\u00c0q\u00e9':L{\u00b2bK\u0096Hn\u00e2s\u0014%\u00ba3\u00e1\u00d0\u00d2\u00fa\u0013\"\u0080\u00f1Z\u00b0\u00ba\u00d9\t\u001f\u0082\u0096\r\u0090\u0089\u0096\u0015\u009c\u00d4\u0089\t\u00e6\u00d8\u00bc\u00d6\tE\u00b7B\u00ac\u001d4\u00ccLA\u000e\u0007%\u00e9U4\u00ad.\u0089\u00fe<\u00c2]y\u0017\u00c4\\\u00d0\u00c0\"\u008f\u00f2G\u00b0\b";
                        var12_3 = "B\f\u00e0\u00a4\u00c2\u00e8\u008fn\u00d3\u00d3\u00a1\u00daej\tm^(\u00b8\u00dd\u0005\u001dv\u0007.U!A\u00dfW\u00e5\u00170[\u00b3!\u00f7\u00d6\u00d9\u00a2\u00ca\u001bCV\u00f6\u0093y~5\u00d1#\b\u00d0\u00a5Q\u001d\u00ff\u00fd5g!\u00c3\u00c0q\u00e9':L{\u00b2bK\u0096Hn\u00e2s\u0014%\u00ba3\u00e1\u00d0\u00d2\u00fa\u0013\"\u0080\u00f1Z\u00b0\u00ba\u00d9\t\u001f\u0082\u0096\r\u0090\u0089\u0096\u0015\u009c\u00d4\u0089\t\u00e6\u00d8\u00bc\u00d6\tE\u00b7B\u00ac\u001d4\u00ccLA\u000e\u0007%\u00e9U4\u00ad.\u0089\u00fe<\u00c2]y\u0017\u00c4\\\u00d0\u00c0\"\u008f\u00f2G\u00b0\b".length();
                        var9_4 = 23;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 32;
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
                            var10_2 = "3Gv\u0007\u00ea\u00b7\u00df+\u00af\u008fJar\u00d0L\u00b36\u00cd\u00e6.\u00cd\u00c4W\u0014F\u00ac\u00ee0Cz1\u0083\u00c4\u00bdu\u00e1\u00d8\u0099\u00a5\u00e2\u0006\u008asg";
                            var12_3 = "3Gv\u0007\u00ea\u00b7\u00df+\u00af\u008fJar\u00d0L\u00b36\u00cd\u00e6.\u00cd\u00c4W\u0014F\u00ac\u00ee0Cz1\u0083\u00c4\u00bdu\u00e1\u00d8\u0099\u00a5\u00e2\u0006\u008asg".length();
                            var9_4 = 23;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 37;
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
                                    v15 = 22;
                                    break;
                                }
                                case 1: {
                                    v15 = 106;
                                    break;
                                }
                                case 2: {
                                    v15 = 4;
                                    break;
                                }
                                case 3: {
                                    v15 = 71;
                                    break;
                                }
                                case 4: {
                                    v15 = 89;
                                    break;
                                }
                                case 5: {
                                    v15 = 118;
                                    break;
                                }
                                default: {
                                    v15 = 23;
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
                ds_1.f = var13;
                ds_1.g = new String[9];
                var0_7 = 6057640519669434736L;
                var6_8 = new long[10];
                var3_9 = 0;
                var4_10 = "\u00ab\u00f1}\u00e0&\u0095\u00f1Y\u00ed\u00f8G\u0003\u0011(\u00c0e\u0090L3\u00f4\u00d9X\u00af\u00ae\u000f\u00a0\u008a\u000b\u00adu\u00fc\u009a\u00b0\u00fd\u0082\u00ca\u00b9B.\u00b4\u008c\u00fc\u008d\u001f\u00d4\u00ac\u00e6\u00d9\u00eb\u0094U\u00c9\u00faP.\t\u001eL\u009a\u0085\u00a6\u008b\u008b>";
                var5_11 = "\u00ab\u00f1}\u00e0&\u0095\u00f1Y\u00ed\u00f8G\u0003\u0011(\u00c0e\u0090L3\u00f4\u00d9X\u00af\u00ae\u000f\u00a0\u008a\u000b\u00adu\u00fc\u009a\u00b0\u00fd\u0082\u00ca\u00b9B.\u00b4\u008c\u00fc\u008d\u001f\u00d4\u00ac\u00e6\u00d9\u00eb\u0094U\u00c9\u00faP.\t\u001eL\u009a\u0085\u00a6\u008b\u008b>".length();
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
                    var4_10 = "\u00ab92C\u0083u\u0004\u00c3\u0084*\u00e0\u00e5LkU\u00e1";
                    var5_11 = "\u00ab92C\u0083u\u0004\u00c3\u0084*\u00e0\u00e5LkU\u00e1".length();
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
        ds_1.h = var6_8;
        ds_1.i = new Integer[10];
        ds_1.G = new Vector<E>();
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x6C3C) & 0xFFFF;
        if (g[n12] == null) {
            int n13;
            int n14;
            char[] cArray = f[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 214;
                    break;
                }
                case 1: {
                    n14 = 100;
                    break;
                }
                case 2: {
                    n14 = 124;
                    break;
                }
                case 3: {
                    n14 = 130;
                    break;
                }
                case 4: {
                    n14 = 47;
                    break;
                }
                case 5: {
                    n14 = 136;
                    break;
                }
                case 6: {
                    n14 = 22;
                    break;
                }
                case 7: {
                    n14 = 245;
                    break;
                }
                case 8: {
                    n14 = 54;
                    break;
                }
                case 9: {
                    n14 = 29;
                    break;
                }
                case 10: {
                    n14 = 210;
                    break;
                }
                case 11: {
                    n14 = 229;
                    break;
                }
                case 12: {
                    n14 = 196;
                    break;
                }
                case 13: {
                    n14 = 217;
                    break;
                }
                case 14: {
                    n14 = 65;
                    break;
                }
                case 15: {
                    n14 = 70;
                    break;
                }
                case 16: {
                    n14 = 6;
                    break;
                }
                case 17: {
                    n14 = 95;
                    break;
                }
                case 18: {
                    n14 = 117;
                    break;
                }
                case 19: {
                    n14 = 190;
                    break;
                }
                case 20: {
                    n14 = 102;
                    break;
                }
                case 21: {
                    n14 = 167;
                    break;
                }
                case 22: {
                    n14 = 188;
                    break;
                }
                case 23: {
                    n14 = 226;
                    break;
                }
                case 24: {
                    n14 = 168;
                    break;
                }
                case 25: {
                    n14 = 107;
                    break;
                }
                case 26: {
                    n14 = 175;
                    break;
                }
                case 27: {
                    n14 = 215;
                    break;
                }
                case 28: {
                    n14 = 144;
                    break;
                }
                case 29: {
                    n14 = 189;
                    break;
                }
                case 30: {
                    n14 = 230;
                    break;
                }
                case 31: {
                    n14 = 125;
                    break;
                }
                case 32: {
                    n14 = 163;
                    break;
                }
                case 33: {
                    n14 = 13;
                    break;
                }
                case 34: {
                    n14 = 71;
                    break;
                }
                case 35: {
                    n14 = 181;
                    break;
                }
                case 36: {
                    n14 = 122;
                    break;
                }
                case 37: {
                    n14 = 184;
                    break;
                }
                case 38: {
                    n14 = 221;
                    break;
                }
                case 39: {
                    n14 = 153;
                    break;
                }
                case 40: {
                    n14 = 43;
                    break;
                }
                case 41: {
                    n14 = 241;
                    break;
                }
                case 42: {
                    n14 = 56;
                    break;
                }
                case 43: {
                    n14 = 81;
                    break;
                }
                case 44: {
                    n14 = 194;
                    break;
                }
                case 45: {
                    n14 = 7;
                    break;
                }
                case 46: {
                    n14 = 149;
                    break;
                }
                case 47: {
                    n14 = 42;
                    break;
                }
                case 48: {
                    n14 = 30;
                    break;
                }
                case 49: {
                    n14 = 101;
                    break;
                }
                case 50: {
                    n14 = 75;
                    break;
                }
                case 51: {
                    n14 = 39;
                    break;
                }
                case 52: {
                    n14 = 5;
                    break;
                }
                case 53: {
                    n14 = 244;
                    break;
                }
                case 54: {
                    n14 = 34;
                    break;
                }
                case 55: {
                    n14 = 92;
                    break;
                }
                case 56: {
                    n14 = 37;
                    break;
                }
                case 57: {
                    n14 = 24;
                    break;
                }
                case 58: {
                    n14 = 216;
                    break;
                }
                case 59: {
                    n14 = 228;
                    break;
                }
                case 60: {
                    n14 = 8;
                    break;
                }
                case 61: {
                    n14 = 98;
                    break;
                }
                case 62: {
                    n14 = 118;
                    break;
                }
                case 63: {
                    n14 = 9;
                    break;
                }
                case 64: {
                    n14 = 23;
                    break;
                }
                case 65: {
                    n14 = 156;
                    break;
                }
                case 66: {
                    n14 = 197;
                    break;
                }
                case 67: {
                    n14 = 254;
                    break;
                }
                case 68: {
                    n14 = 137;
                    break;
                }
                case 69: {
                    n14 = 160;
                    break;
                }
                case 70: {
                    n14 = 209;
                    break;
                }
                case 71: {
                    n14 = 171;
                    break;
                }
                case 72: {
                    n14 = 177;
                    break;
                }
                case 73: {
                    n14 = 58;
                    break;
                }
                case 74: {
                    n14 = 142;
                    break;
                }
                case 75: {
                    n14 = 76;
                    break;
                }
                case 76: {
                    n14 = 182;
                    break;
                }
                case 77: {
                    n14 = 0;
                    break;
                }
                case 78: {
                    n14 = 61;
                    break;
                }
                case 79: {
                    n14 = 204;
                    break;
                }
                case 80: {
                    n14 = 15;
                    break;
                }
                case 81: {
                    n14 = 62;
                    break;
                }
                case 82: {
                    n14 = 235;
                    break;
                }
                case 83: {
                    n14 = 140;
                    break;
                }
                case 84: {
                    n14 = 66;
                    break;
                }
                case 85: {
                    n14 = 11;
                    break;
                }
                case 86: {
                    n14 = 143;
                    break;
                }
                case 87: {
                    n14 = 123;
                    break;
                }
                case 88: {
                    n14 = 242;
                    break;
                }
                case 89: {
                    n14 = 31;
                    break;
                }
                case 90: {
                    n14 = 67;
                    break;
                }
                case 91: {
                    n14 = 200;
                    break;
                }
                case 92: {
                    n14 = 91;
                    break;
                }
                case 93: {
                    n14 = 251;
                    break;
                }
                case 94: {
                    n14 = 132;
                    break;
                }
                case 95: {
                    n14 = 135;
                    break;
                }
                case 96: {
                    n14 = 60;
                    break;
                }
                case 97: {
                    n14 = 74;
                    break;
                }
                case 98: {
                    n14 = 223;
                    break;
                }
                case 99: {
                    n14 = 138;
                    break;
                }
                case 100: {
                    n14 = 159;
                    break;
                }
                case 101: {
                    n14 = 73;
                    break;
                }
                case 102: {
                    n14 = 139;
                    break;
                }
                case 103: {
                    n14 = 120;
                    break;
                }
                case 104: {
                    n14 = 44;
                    break;
                }
                case 105: {
                    n14 = 89;
                    break;
                }
                case 106: {
                    n14 = 112;
                    break;
                }
                case 107: {
                    n14 = 104;
                    break;
                }
                case 108: {
                    n14 = 220;
                    break;
                }
                case 109: {
                    n14 = 141;
                    break;
                }
                case 110: {
                    n14 = 170;
                    break;
                }
                case 111: {
                    n14 = 111;
                    break;
                }
                case 112: {
                    n14 = 154;
                    break;
                }
                case 113: {
                    n14 = 187;
                    break;
                }
                case 114: {
                    n14 = 4;
                    break;
                }
                case 115: {
                    n14 = 68;
                    break;
                }
                case 116: {
                    n14 = 78;
                    break;
                }
                case 117: {
                    n14 = 41;
                    break;
                }
                case 118: {
                    n14 = 201;
                    break;
                }
                case 119: {
                    n14 = 108;
                    break;
                }
                case 120: {
                    n14 = 232;
                    break;
                }
                case 121: {
                    n14 = 211;
                    break;
                }
                case 122: {
                    n14 = 250;
                    break;
                }
                case 123: {
                    n14 = 80;
                    break;
                }
                case 124: {
                    n14 = 212;
                    break;
                }
                case 125: {
                    n14 = 147;
                    break;
                }
                case 126: {
                    n14 = 103;
                    break;
                }
                case 127: {
                    n14 = 28;
                    break;
                }
                case 128: {
                    n14 = 178;
                    break;
                }
                case 129: {
                    n14 = 238;
                    break;
                }
                case 130: {
                    n14 = 19;
                    break;
                }
                case 131: {
                    n14 = 93;
                    break;
                }
                case 132: {
                    n14 = 252;
                    break;
                }
                case 133: {
                    n14 = 50;
                    break;
                }
                case 134: {
                    n14 = 247;
                    break;
                }
                case 135: {
                    n14 = 183;
                    break;
                }
                case 136: {
                    n14 = 219;
                    break;
                }
                case 137: {
                    n14 = 127;
                    break;
                }
                case 138: {
                    n14 = 231;
                    break;
                }
                case 139: {
                    n14 = 202;
                    break;
                }
                case 140: {
                    n14 = 27;
                    break;
                }
                case 141: {
                    n14 = 249;
                    break;
                }
                case 142: {
                    n14 = 2;
                    break;
                }
                case 143: {
                    n14 = 203;
                    break;
                }
                case 144: {
                    n14 = 225;
                    break;
                }
                case 145: {
                    n14 = 1;
                    break;
                }
                case 146: {
                    n14 = 64;
                    break;
                }
                case 147: {
                    n14 = 21;
                    break;
                }
                case 148: {
                    n14 = 72;
                    break;
                }
                case 149: {
                    n14 = 46;
                    break;
                }
                case 150: {
                    n14 = 185;
                    break;
                }
                case 151: {
                    n14 = 176;
                    break;
                }
                case 152: {
                    n14 = 94;
                    break;
                }
                case 153: {
                    n14 = 69;
                    break;
                }
                case 154: {
                    n14 = 158;
                    break;
                }
                case 155: {
                    n14 = 113;
                    break;
                }
                case 156: {
                    n14 = 233;
                    break;
                }
                case 157: {
                    n14 = 86;
                    break;
                }
                case 158: {
                    n14 = 165;
                    break;
                }
                case 159: {
                    n14 = 36;
                    break;
                }
                case 160: {
                    n14 = 90;
                    break;
                }
                case 161: {
                    n14 = 116;
                    break;
                }
                case 162: {
                    n14 = 45;
                    break;
                }
                case 163: {
                    n14 = 59;
                    break;
                }
                case 164: {
                    n14 = 106;
                    break;
                }
                case 165: {
                    n14 = 234;
                    break;
                }
                case 166: {
                    n14 = 84;
                    break;
                }
                case 167: {
                    n14 = 236;
                    break;
                }
                case 168: {
                    n14 = 164;
                    break;
                }
                case 169: {
                    n14 = 134;
                    break;
                }
                case 170: {
                    n14 = 105;
                    break;
                }
                case 171: {
                    n14 = 222;
                    break;
                }
                case 172: {
                    n14 = 246;
                    break;
                }
                case 173: {
                    n14 = 192;
                    break;
                }
                case 174: {
                    n14 = 79;
                    break;
                }
                case 175: {
                    n14 = 53;
                    break;
                }
                case 176: {
                    n14 = 240;
                    break;
                }
                case 177: {
                    n14 = 157;
                    break;
                }
                case 178: {
                    n14 = 14;
                    break;
                }
                case 179: {
                    n14 = 155;
                    break;
                }
                case 180: {
                    n14 = 243;
                    break;
                }
                case 181: {
                    n14 = 119;
                    break;
                }
                case 182: {
                    n14 = 10;
                    break;
                }
                case 183: {
                    n14 = 96;
                    break;
                }
                case 184: {
                    n14 = 151;
                    break;
                }
                case 185: {
                    n14 = 162;
                    break;
                }
                case 186: {
                    n14 = 191;
                    break;
                }
                case 187: {
                    n14 = 150;
                    break;
                }
                case 188: {
                    n14 = 57;
                    break;
                }
                case 189: {
                    n14 = 199;
                    break;
                }
                case 190: {
                    n14 = 52;
                    break;
                }
                case 191: {
                    n14 = 239;
                    break;
                }
                case 192: {
                    n14 = 88;
                    break;
                }
                case 193: {
                    n14 = 145;
                    break;
                }
                case 194: {
                    n14 = 227;
                    break;
                }
                case 195: {
                    n14 = 121;
                    break;
                }
                case 196: {
                    n14 = 172;
                    break;
                }
                case 197: {
                    n14 = 198;
                    break;
                }
                case 198: {
                    n14 = 18;
                    break;
                }
                case 199: {
                    n14 = 193;
                    break;
                }
                case 200: {
                    n14 = 161;
                    break;
                }
                case 201: {
                    n14 = 186;
                    break;
                }
                case 202: {
                    n14 = 82;
                    break;
                }
                case 203: {
                    n14 = 25;
                    break;
                }
                case 204: {
                    n14 = 16;
                    break;
                }
                case 205: {
                    n14 = 169;
                    break;
                }
                case 206: {
                    n14 = 195;
                    break;
                }
                case 207: {
                    n14 = 115;
                    break;
                }
                case 208: {
                    n14 = 173;
                    break;
                }
                case 209: {
                    n14 = 33;
                    break;
                }
                case 210: {
                    n14 = 174;
                    break;
                }
                case 211: {
                    n14 = 148;
                    break;
                }
                case 212: {
                    n14 = 129;
                    break;
                }
                case 213: {
                    n14 = 38;
                    break;
                }
                case 214: {
                    n14 = 205;
                    break;
                }
                case 215: {
                    n14 = 146;
                    break;
                }
                case 216: {
                    n14 = 110;
                    break;
                }
                case 217: {
                    n14 = 131;
                    break;
                }
                case 218: {
                    n14 = 87;
                    break;
                }
                case 219: {
                    n14 = 179;
                    break;
                }
                case 220: {
                    n14 = 109;
                    break;
                }
                case 221: {
                    n14 = 114;
                    break;
                }
                case 222: {
                    n14 = 40;
                    break;
                }
                case 223: {
                    n14 = 55;
                    break;
                }
                case 224: {
                    n14 = 208;
                    break;
                }
                case 225: {
                    n14 = 166;
                    break;
                }
                case 226: {
                    n14 = 17;
                    break;
                }
                case 227: {
                    n14 = 128;
                    break;
                }
                case 228: {
                    n14 = 253;
                    break;
                }
                case 229: {
                    n14 = 49;
                    break;
                }
                case 230: {
                    n14 = 255;
                    break;
                }
                case 231: {
                    n14 = 99;
                    break;
                }
                case 232: {
                    n14 = 218;
                    break;
                }
                case 233: {
                    n14 = 206;
                    break;
                }
                case 234: {
                    n14 = 85;
                    break;
                }
                case 235: {
                    n14 = 152;
                    break;
                }
                case 236: {
                    n14 = 63;
                    break;
                }
                case 237: {
                    n14 = 26;
                    break;
                }
                case 238: {
                    n14 = 35;
                    break;
                }
                case 239: {
                    n14 = 133;
                    break;
                }
                case 240: {
                    n14 = 248;
                    break;
                }
                case 241: {
                    n14 = 3;
                    break;
                }
                case 242: {
                    n14 = 97;
                    break;
                }
                case 243: {
                    n14 = 20;
                    break;
                }
                case 244: {
                    n14 = 32;
                    break;
                }
                case 245: {
                    n14 = 126;
                    break;
                }
                case 246: {
                    n14 = 224;
                    break;
                }
                case 247: {
                    n14 = 213;
                    break;
                }
                case 248: {
                    n14 = 77;
                    break;
                }
                case 249: {
                    n14 = 51;
                    break;
                }
                case 250: {
                    n14 = 12;
                    break;
                }
                case 251: {
                    n14 = 48;
                    break;
                }
                case 252: {
                    n14 = 83;
                    break;
                }
                case 253: {
                    n14 = 207;
                    break;
                }
                case 254: {
                    n14 = 180;
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
            ds_1.g[n12] = new String(cArray).intern();
        }
        return g[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6570;
        if (i[n11] == null) {
            ds_1.i[n11] = (int)(h[n11] ^ l2);
        }
        return i[n11];
    }
}

