/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DQ;
import com.E8;
import com.FP;
import com.O0;
import com.RW;
import com.dg_0;
import com.dm_2;
import com.gq_0;
import com.oc_0;
import com.pc_0;
import com.xe_0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;

/*
 * Renamed from com.Bb
 */
class bb_0
implements RW {
    private xe_0 l = null;
    private String H = null;
    private Vector U = null;
    FP r;
    private static final byte[] K;
    private static final byte[] z;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    bb_0(xe_0 xe_02) {
        this.l = xe_02;
        this.X();
        this.U = new Vector();
    }

    /*
     * Loose catch block
     */
    void G(String string) throws pc_0 {
        block13: {
            boolean bl = dm_2.J();
            try {
                this.H = string;
                File file = new File(string);
                byte[] byArray = new byte[(int)file.length()];
                FileInputStream fileInputStream = new FileInputStream(file);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                dataInputStream.readFully(byArray);
                dataInputStream.close();
                String string2 = new String(byArray, bb_0.a(15193, -14194));
                O0 o0 = O0.y(string2);
                oc_0 oc_02 = o0.J(bb_0.a(15179, 31362));
                for (int i2 = 0; i2 < oc_02.size(); ++i2) {
                    String string3;
                    String string4;
                    int n10;
                    String string5;
                    dg_0 dg_02;
                    O0 o02;
                    block17: {
                        String string6;
                        block16: {
                            block15: {
                                int n11;
                                block14: {
                                    int n12;
                                    block18: {
                                        o02 = oc_02.V(i2);
                                        dg_02 = null;
                                        string5 = o02.C(bb_0.a(15181, 32729));
                                        String string7 = o02.C(bb_0.a(15174, -4981));
                                        n10 = -1;
                                        n12 = DQ.v(string7);
                                        if (bl) break block13;
                                        n11 = n12;
                                        if (bl) break block14;
                                        break block18;
                                        catch (Exception exception) {
                                            throw bb_0.a(exception);
                                        }
                                    }
                                    try {
                                        block19: {
                                            if (n11 == -1) break block15;
                                            break block19;
                                            catch (Exception exception) {
                                                throw bb_0.a(exception);
                                            }
                                        }
                                        n11 = n12;
                                    }
                                    catch (Exception exception) {
                                        throw bb_0.a(exception);
                                    }
                                }
                                n10 = n11;
                            }
                            string4 = o02.C(bb_0.a(15180, -27617));
                            string3 = "";
                            string6 = string4;
                            if (bl) break block16;
                            try {
                                block20: {
                                    if (string6.charAt(0) != bb_0.a(26072, 8194788261751058682L)) break block17;
                                    break block20;
                                    catch (Exception exception) {
                                        throw bb_0.a(exception);
                                    }
                                }
                                string6 = string4;
                            }
                            catch (Exception exception) {
                                throw bb_0.a(exception);
                            }
                        }
                        string3 = string6;
                    }
                    dg_02 = new dg_0(this, string3, string4, n10, E8.M(E8.J(o02.C(bb_0.a(15181, 32729))), 0, string5.length()), o02.C(bb_0.a(15176, 24892)));
                    this.U.addElement(dg_02);
                    if (!bl) continue;
                    break;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    /*
     * Exception decompiling
     */
    void I(InputStream var1_1) throws pc_0 {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [182[DOLOOP]], but top level block is 69[TRYBLOCK]
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

    private void v(String string) throws pc_0 {
        DQ dQ = new DQ(string, -1, null);
        this.U.addElement(dQ);
    }

    String A() {
        return this.H;
    }

    @Override
    public String O() {
        return this.H;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public int e(String var1_1, byte[] var2_2) {
        var4_3 = 1;
        var3_4 = dm_2.J();
        try {
            if (var1_1 == null) {
                return var4_3;
            }
        }
        catch (Exception v0) {
            throw bb_0.a(v0);
        }
        var5_5 = null;
        try {
            var5_5 = new DQ(var1_1, 0, var2_2);
        }
        catch (Exception var6_6) {
            this.l.p().c(0, bb_0.a(15168, -28917) + var1_1 + "'", var6_6);
            return var4_3;
        }
        var6_7 = this.U;
        synchronized (var6_7) {
            var7_8 = 0;
            while (var7_8 < this.U.size()) {
                block33: {
                    block35: {
                        block37: {
                            block38: {
                                block36: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                var8_9 = (DQ)this.U.elementAt(var7_8);
                                                if (var3_4) break block33;
                                                v1 = (int)var8_9.p(var1_1);
                                                if (var3_4) ** break block34
                                                break block41;
                                                catch (Exception v2) {
                                                    throw bb_0.a(v2);
                                                }
                                            }
                                            if (v1 == 0) break block35;
                                            break block42;
                                            catch (Exception v3) {
                                                throw bb_0.a(v3);
                                            }
                                        }
                                        v4 = var8_9.h;
                                        if (var3_4) break block36;
                                        break block43;
                                        catch (Exception v5) {
                                            throw bb_0.a(v5);
                                        }
                                    }
                                    try {
                                        block44: {
                                            if (v4 != var5_5.h) break block35;
                                            break block44;
                                            catch (Exception v6) {
                                                throw bb_0.a(v6);
                                            }
                                        }
                                        v4 = (int)E8.I(var8_9.v, var2_2);
                                    }
                                    catch (Exception v7) {
                                        throw bb_0.a(v7);
                                    }
                                }
                                try {
                                    if (var3_4) break block37;
                                    if (v4 == 0) break block38;
                                }
                                catch (Exception v8) {
                                    throw bb_0.a(v8);
                                }
                                return 0;
                            }
                            v4 = 2;
                        }
                        var4_3 = v4;
                    }
                    ++var7_8;
                }
                if (!var3_4) continue;
            }
        }
        v1 = var4_3;
        {
            block39: {
                block40: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var3_4) break block39;
                                            if (v1 != 1) break block40;
                                        }
                                        catch (Exception v9) {
                                            throw bb_0.a(v9);
                                        }
                                        v1 = (int)var1_1.startsWith("[");
                                        if (var3_4) break block39;
                                    }
                                    catch (Exception v10) {
                                        throw bb_0.a(v10);
                                    }
                                    if (v1 == 0) break block40;
                                }
                                catch (Exception v11) {
                                    throw bb_0.a(v11);
                                }
                                v1 = var1_1.indexOf(bb_0.a(15177, 17279));
                                if (var3_4) break block39;
                            }
                            catch (Exception v12) {
                                throw bb_0.a(v12);
                            }
                            if (v1 <= 1) break block40;
                        }
                        catch (Exception v13) {
                            throw bb_0.a(v13);
                        }
                        return this.e(var1_1.substring(1, var1_1.indexOf(bb_0.a(15175, 23046))), var2_2);
                    }
                    catch (Exception v14) {
                        throw bb_0.a(v14);
                    }
                }
                v1 = var4_3;
            }
            return v1;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void Y(DQ var1_1, gq_0 var2_2) {
        var4_3 = var1_1.h;
        var5_4 = var1_1.c();
        var6_5 = null;
        var3_6 = dm_2.J();
        var7_7 = this.U;
        synchronized (var7_7) {
            var8_8 = 0;
            while (var8_8 < this.U.size()) {
                block13: {
                    block12: {
                        block14: {
                            var6_5 = (DQ)this.U.elementAt(var8_8);
                            if (var3_6) break block13;
                            v0 = var6_5;
                            if (var3_6) ** break block11
                            break block14;
                            catch (IllegalArgumentException v1) {
                                throw bb_0.a(v1);
                            }
                        }
                        try {
                            block15: {
                                if (!v0.p(var5_4)) break block12;
                                break block15;
                                catch (IllegalArgumentException v2) {
                                    throw bb_0.a(v2);
                                }
                            }
                            if (var6_5.h == var4_3) {
                                // empty if block
                            }
                        }
                        catch (IllegalArgumentException v3) {
                            throw bb_0.a(v3);
                        }
                    }
                    ++var8_8;
                }
                if (!var3_6) continue;
            }
        }
        v0 = var1_1;
        {
            var6_5 = v0;
            this.U.addElement(var6_5);
            this.w(var2_2);
            return;
        }
    }

    /*
     * Loose catch block
     */
    void w(gq_0 gq_02) {
        block6: {
            String string;
            block7: {
                string = this.O();
                boolean bl = dm_2.F();
                if (!bl) break block6;
                try {
                    block8: {
                        if (string != null) break block7;
                        break block8;
                        catch (Exception exception) {
                            throw bb_0.a(exception);
                        }
                    }
                    return;
                }
                catch (Exception exception) {
                    throw bb_0.a(exception);
                }
            }
            try {
                this.M(string);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public DQ[] G() {
        return this.R(null, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public DQ[] R(String var1_1, String var2_2) {
        var4_3 = this.U;
        synchronized (var4_3) {
            block40: {
                block37: {
                    block39: {
                        block38: {
                            block35: {
                                var3_4 = dm_2.J();
                                var5_5 = new ArrayList<DQ>();
                                for (var6_6 = 0; var6_6 < this.U.size(); ++var6_6) {
                                    block36: {
                                        block45: {
                                            block44: {
                                                block43: {
                                                    block42: {
                                                        block41: {
                                                            var7_8 = (DQ)this.U.elementAt(var6_6);
                                                            v0 = var7_8.h;
                                                            if (var3_4) break block35;
                                                            if (v0 != -1) ** GOTO lbl22
                                                            break block41;
                                                            catch (IllegalArgumentException v1) {
                                                                throw bb_0.a(v1);
                                                            }
                                                        }
                                                        if (!var3_4) continue;
                                                        break block42;
                                                        catch (IllegalArgumentException v2) {
                                                            throw bb_0.a(v2);
                                                        }
                                                    }
                                                    if (var1_1 == null) ** GOTO lbl61
                                                    break block43;
                                                    catch (IllegalArgumentException v3) {
                                                        throw bb_0.a(v3);
                                                    }
                                                }
                                                if (!var7_8.p(var1_1)) continue;
                                                break block44;
                                                catch (IllegalArgumentException v4) {
                                                    throw bb_0.a(v4);
                                                }
                                            }
                                            v5 = var2_2;
                                            if (var3_4) break block36;
                                            break block45;
                                            catch (IllegalArgumentException v6) {
                                                throw bb_0.a(v6);
                                            }
                                        }
                                        try {
                                            block46: {
                                                if (v5 == null) ** GOTO lbl61
                                                break block46;
                                                catch (IllegalArgumentException v7) {
                                                    throw bb_0.a(v7);
                                                }
                                            }
                                            v5 = var7_8.J();
                                        }
                                        catch (IllegalArgumentException v8) {
                                            throw bb_0.a(v8);
                                        }
                                    }
                                    v9 = v5.equals(var2_2);
                                    if (var3_4) continue;
                                    try {
                                        block47: {
                                            if (!v9) continue;
                                            break block47;
                                            catch (IllegalArgumentException v10) {
                                                throw bb_0.a(v10);
                                            }
                                        }
                                        v9 = var5_5.add(var7_8);
                                        continue;
                                    }
                                    catch (IllegalArgumentException v11) {
                                        throw bb_0.a(v11);
                                    }
                                }
                                v0 = var5_5.size();
                            }
                            var6_7 = new DQ[v0];
                            for (var7_9 = 0; var7_9 < var5_5.size(); ++var7_9) {
                                try {
                                    var6_7[var7_9] = (DQ)var5_5.get(var7_9);
                                    if (!var3_4) {
                                        if (!var3_4) continue;
                                        break;
                                    }
                                    break block37;
                                }
                                catch (IllegalArgumentException v12) {
                                    throw bb_0.a(v12);
                                }
                            }
                            try {
                                v13 = var1_1;
                                if (var3_4) break block38;
                                if (v13 == null) break block37;
                            }
                            catch (IllegalArgumentException v14) {
                                throw bb_0.a(v14);
                            }
                            v13 = var1_1;
                        }
                        v15 = v13.startsWith("[");
                        if (var3_4) break block39;
                        try {
                            block48: {
                                if (v15 == 0) break block37;
                                break block48;
                                catch (IllegalArgumentException v16) {
                                    throw bb_0.a(v16);
                                }
                            }
                            v15 = var1_1.indexOf(bb_0.a(15175, 23046));
                        }
                        catch (IllegalArgumentException v17) {
                            throw bb_0.a(v17);
                        }
                    }
                    if (v15 > 1) {
                        var7_10 = this.R(var1_1.substring(1, var1_1.indexOf(bb_0.a(15175, 23046))), var2_2);
                        try {
                            v18 = var7_10;
                            if (var3_4) break block40;
                            if (v18.length <= 0) break block37;
                        }
                        catch (IllegalArgumentException v19) {
                            throw bb_0.a(v19);
                        }
                        var8_11 = new DQ[var6_7.length + var7_10.length];
                        System.arraycopy(var6_7, 0, var8_11, 0, var6_7.length);
                        System.arraycopy(var7_10, 0, var8_11, var6_7.length, var7_10.length);
                        var6_7 = var8_11;
                    }
                }
                v18 = var6_7;
            }
            return v18;
        }
    }

    @Override
    public void Y(String string, String string2) {
        this.n(string, string2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void n(String var1_1, String var2_2, byte[] var3_3) {
        var5_4 = false;
        var6_5 = this.U;
        synchronized (var6_5) {
            block44: {
                var4_7 = dm_2.F();
                for (var7_8 = 0; var7_8 < this.U.size(); ++var7_8) {
                    block50: {
                        block49: {
                            block47: {
                                block48: {
                                    block63: {
                                        block62: {
                                            block61: {
                                                block60: {
                                                    block59: {
                                                        block58: {
                                                            block45: {
                                                                block46: {
                                                                    block56: {
                                                                        block55: {
                                                                            block54: {
                                                                                block53: {
                                                                                    block52: {
                                                                                        block51: {
                                                                                            var8_9 = (DQ)this.U.elementAt(var7_8);
                                                                                            if (!var4_7) break block44;
                                                                                            v0 = var1_1;
                                                                                            if (!var4_7) break block45;
                                                                                            break block51;
                                                                                            catch (Exception v1) {
                                                                                                throw bb_0.a(v1);
                                                                                            }
                                                                                        }
                                                                                        if (v0 == null) ** GOTO lbl64
                                                                                        break block52;
                                                                                        catch (Exception v2) {
                                                                                            throw bb_0.a(v2);
                                                                                        }
                                                                                    }
                                                                                    if (!var8_9.p(var1_1)) continue;
                                                                                    break block53;
                                                                                    catch (Exception v3) {
                                                                                        throw bb_0.a(v3);
                                                                                    }
                                                                                }
                                                                                v0 = var2_2;
                                                                                if (!var4_7) break block45;
                                                                                break block54;
                                                                                catch (Exception v4) {
                                                                                    throw bb_0.a(v4);
                                                                                }
                                                                            }
                                                                            if (v0 == null) ** GOTO lbl64
                                                                            break block55;
                                                                            catch (Exception v5) {
                                                                                throw bb_0.a(v5);
                                                                            }
                                                                        }
                                                                        if (!var8_9.J().equals(var2_2)) continue;
                                                                        break block56;
                                                                        catch (Exception v6) {
                                                                            throw bb_0.a(v6);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block57: {
                                                                            v7 = var3_3;
                                                                            if (!var4_7) break block46;
                                                                            break block57;
                                                                            catch (Exception v8) {
                                                                                throw bb_0.a(v8);
                                                                            }
                                                                        }
                                                                        if (v7 != null) {
                                                                        }
                                                                        ** GOTO lbl64
                                                                    }
                                                                    catch (Exception v9) {
                                                                        throw bb_0.a(v9);
                                                                    }
                                                                    v7 = var3_3;
                                                                }
                                                                try {
                                                                    if (!E8.I(v7, var8_9.v)) continue;
lbl64:
                                                                    // 4 sources

                                                                    v0 = var8_9.c();
                                                                }
                                                                catch (Exception v10) {
                                                                    throw bb_0.a(v10);
                                                                }
                                                            }
                                                            var9_10 = v0;
                                                            if (!var4_7) break block47;
                                                            if (var1_1 == null) ** GOTO lbl116
                                                            break block58;
                                                            catch (Exception v11) {
                                                                throw bb_0.a(v11);
                                                            }
                                                        }
                                                        v12 = var9_10.equals(var1_1);
                                                        if (!var4_7) break block48;
                                                        break block59;
                                                        catch (Exception v13) {
                                                            throw bb_0.a(v13);
                                                        }
                                                    }
                                                    if (v12) ** GOTO lbl116
                                                    break block60;
                                                    catch (Exception v14) {
                                                        throw bb_0.a(v14);
                                                    }
                                                }
                                                v15 = var8_9;
                                                if (!var4_7) break block49;
                                                break block61;
                                                catch (Exception v16) {
                                                    throw bb_0.a(v16);
                                                }
                                            }
                                            if (!(v15 instanceof dg_0)) ** GOTO lbl126
                                            break block62;
                                            catch (Exception v17) {
                                                throw bb_0.a(v17);
                                            }
                                        }
                                        v15 = (dg_0)var8_9;
                                        if (!var4_7) break block49;
                                        break block63;
                                        catch (Exception v18) {
                                            throw bb_0.a(v18);
                                        }
                                    }
                                    try {
                                        block64: {
                                            if (!v15.d()) ** GOTO lbl126
                                            break block64;
                                            catch (Exception v19) {
                                                throw bb_0.a(v19);
                                            }
                                        }
                                        v12 = this.U.removeElement(var8_9);
                                    }
                                    catch (Exception v20) {
                                        throw bb_0.a(v20);
                                    }
                                }
                                --var7_8;
                            }
                            try {
                                if (var4_7) break block50;
lbl126:
                                // 3 sources

                                v15 = var8_9;
                            }
                            catch (Exception v21) {
                                throw bb_0.a(v21);
                            }
                        }
                        v15.Y = this.L(var9_10, var1_1);
                    }
                    var5_4 = true;
                    if (var4_7) continue;
                }
            }
            if (var5_4) {
                try {
                    this.W();
                }
                catch (Exception var6_6) {
                    // empty catch block
                }
            }
            return;
        }
    }

    void W() throws IOException {
        block5: {
            bb_0 bb_02;
            block4: {
                boolean bl = dm_2.J();
                try {
                    try {
                        bb_02 = this;
                        if (bl) break block4;
                        if (bb_02.H == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw bb_0.a(iOException);
                    }
                    bb_02 = this;
                }
                catch (IOException iOException) {
                    throw bb_0.a(iOException);
                }
            }
            bb_02.M(this.H);
        }
    }

    synchronized void M(String string) throws IOException {
        try {
            if (string == null) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw bb_0.a(throwable);
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(E8.V(string));){
            this.v(fileOutputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void v(OutputStream outputStream) throws IOException {
        boolean bl = dm_2.J();
        try {
            Vector vector = this.U;
            synchronized (vector) {
                O0 o0 = new O0();
                oc_0 oc_02 = new oc_0();
                o0.C(bb_0.a(15194, -14522), oc_02);
                for (int i2 = 0; i2 < this.U.size(); ++i2) {
                    O0 o02 = new O0();
                    oc_02.add(o02);
                    DQ dQ = (DQ)this.U.elementAt(i2);
                    String string = dQ.T();
                    String string2 = dQ.c();
                    String string3 = dQ.J();
                    String string4 = dQ.y();
                    try {
                        o02.C(bb_0.a(15192, 21505), string);
                        o02.C(bb_0.a(15172, 4983), string2);
                        o02.C(bb_0.a(15170, -16896), string3);
                        o02.C(bb_0.a(15195, -13177), string4);
                        o02.C(bb_0.a(15197, -22174), dQ.C());
                        if (bl) return;
                        if (!bl) continue;
                        break;
                    }
                    catch (Exception exception) {
                        throw bb_0.a(exception);
                    }
                }
                outputStream.write(o0.toString().getBytes(bb_0.a(15196, -11679)));
                return;
            }
        }
        catch (Exception exception) {
            System.err.println(exception);
        }
    }

    void L(OutputStream outputStream, DQ dQ) throws IOException {
        block17: {
            String string;
            String string2;
            block16: {
                int n10;
                boolean bl;
                String string3;
                String string4;
                String string5;
                block14: {
                    block15: {
                        string5 = dQ.T();
                        string4 = dQ.c();
                        string3 = dQ.J();
                        bl = dm_2.J();
                        string2 = dQ.y();
                        try {
                            try {
                                n10 = string3.equals(bb_0.a(15173, 8591));
                                if (bl) break block14;
                                if (n10 == 0) break block15;
                            }
                            catch (IOException iOException) {
                                throw bb_0.a(iOException);
                            }
                            outputStream.write(E8.J(string4));
                            outputStream.write(z);
                            return;
                        }
                        catch (IOException iOException) {
                            throw bb_0.a(iOException);
                        }
                    }
                    try {
                        string = string5;
                        if (bl) break block16;
                        n10 = string.length();
                    }
                    catch (IOException iOException) {
                        throw bb_0.a(iOException);
                    }
                }
                try {
                    if (n10 != 0) {
                        outputStream.write(E8.J(string5));
                        outputStream.write(K);
                    }
                }
                catch (IOException iOException) {
                    throw bb_0.a(iOException);
                }
                try {
                    outputStream.write(E8.J(string4));
                    outputStream.write(K);
                    outputStream.write(E8.J(string3));
                    outputStream.write(K);
                    outputStream.write(E8.J(dQ.C()));
                    if (bl) break block17;
                    string = string2;
                }
                catch (IOException iOException) {
                    throw bb_0.a(iOException);
                }
            }
            try {
                if (string != null) {
                    outputStream.write(K);
                    outputStream.write(E8.J(string2));
                }
            }
            catch (IOException iOException) {
                throw bb_0.a(iOException);
            }
            outputStream.write(z);
        }
    }

    String L(String string, String string2) {
        String string3;
        block26: {
            block27: {
                int n10;
                int n11;
                String string4;
                block30: {
                    int n12;
                    int n13;
                    block28: {
                        int n14;
                        int n15;
                        block29: {
                            int n16;
                            int n17;
                            boolean bl;
                            block23: {
                                int n18 = 0;
                                n15 = string2.length();
                                bl = dm_2.F();
                                n14 = string.length();
                                while (n18 < n14) {
                                    String string5;
                                    block25: {
                                        int n19;
                                        int n20;
                                        block22: {
                                            n20 = string.indexOf(bb_0.a(28914, 1340561495199573470L), n18);
                                            try {
                                                try {
                                                    block24: {
                                                        try {
                                                            try {
                                                                try {
                                                                    n19 = n20;
                                                                    if (!bl) break block22;
                                                                    n17 = -1;
                                                                    if (!bl) break block23;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw bb_0.a(illegalArgumentException);
                                                                }
                                                                if (n19 != n17) break block24;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw bb_0.a(illegalArgumentException);
                                                            }
                                                            if (bl) break;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw bb_0.a(illegalArgumentException);
                                                        }
                                                    }
                                                    string5 = string2;
                                                    if (!bl) break block25;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw bb_0.a(illegalArgumentException);
                                                }
                                                n19 = string5.equals(string.substring(n18, n20)) ? 1 : 0;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw bb_0.a(illegalArgumentException);
                                            }
                                        }
                                        if (n19 == 0) {
                                            n18 = n20 + 1;
                                            if (bl) continue;
                                        }
                                        string5 = string.substring(0, n18) + string.substring(n20 + 1);
                                    }
                                    return string5;
                                }
                                try {
                                    try {
                                        string3 = string;
                                        if (!bl) break block26;
                                        if (!string3.endsWith(string2)) break block27;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw bb_0.a(illegalArgumentException);
                                    }
                                    n16 = n14 - n18;
                                    n17 = n15;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw bb_0.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (n16 != n17) break block27;
                                        string4 = string;
                                        n11 = 0;
                                        n13 = n15;
                                        n12 = n14;
                                        if (!bl) break block28;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw bb_0.a(illegalArgumentException);
                                    }
                                    if (n13 != n12) break block29;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw bb_0.a(illegalArgumentException);
                                }
                                n10 = 0;
                                break block30;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw bb_0.a(illegalArgumentException);
                            }
                        }
                        n13 = n14 - n15;
                        n12 = 1;
                    }
                    n10 = n13 - n12;
                }
                return string4.substring(n11, n10);
            }
            string3 = string;
        }
        return string3;
    }

    FP X() throws IllegalArgumentException {
        FP fP2;
        block4: {
            block5: {
                boolean bl = dm_2.J();
                try {
                    try {
                        fP2 = this.r;
                        if (bl) break block4;
                        if (fP2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw bb_0.a(illegalArgumentException);
                    }
                    this.r = this.X(xe_0.r(bb_0.a(15169, 2380)));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw bb_0.a(illegalArgumentException);
                }
            }
            fP2 = this.r;
        }
        return fP2;
    }

    FP X(String string) throws IllegalArgumentException {
        try {
            Class<FP> clazz = Class.forName(string).asSubclass(FP.class);
            return clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            this.l.p().c(3, bb_0.a(15183, 15459) + string, exception);
            throw new IllegalArgumentException(bb_0.a(15171, -15420) + string + bb_0.a(15182, 7961), exception);
        }
    }

    DQ m(String string, byte[] byArray) throws pc_0 {
        dg_0 dg_02 = new dg_0(this, string, byArray);
        dg_02.u();
        return dg_02;
    }

    static xe_0 W(bb_0 bb_02) {
        return bb_02.l;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[22];
                        var11_1 = 0;
                        var10_2 = "\u00da\u00a3\u00e1\u00c1\u00f8\u00cc\u00b8\u00026c\u001a^\u000e^OFb\u001eF\u00e6~F\u0093\u0086\"\u00daUW\u00d4\u000e\u00a4U\u00e7\u00a1\u00cb3\u00ac\t[j\u00a5\u00e1\u0097\u00f05\u00b4E\u0004\u00a9;\u00fb\u00cb\u0003\u00edK\u001a\u0011V\u0012S\u0098\u00a6$R\u00f7C\u00c5x\u00b4\u0093\u00da\u00f1\u00db\u00a8!!mF6\u0088\u00d7\u00ca\u007f\u00c1\u00ed\u0089\u0096\\\u001f\u00cf\u00a4\u0018\u0004\u00f9\u00ea\r\u00bf\u00f3F$\u000e\u009a\u0093\u008f\u00cf\u00bb\u009d+8\u00b4+\u00e4-\u0082B]\u00e5R\u00c6\u00c4\u00f52\u00ad_\u00a7\u008e\u00f83\u0010D\u0019\u00d8\u0004\n;\u00eb<\u0018\u00f9\u00b6\u00e6\u00f6\u00f9-&:\u00ec\u0014\u00dd\u0019\u000bW\u00d84\u00e3\u0081N\tr\u0011\u00ddn,\u00aaB\t\u0090\u00de\u00ce\"\u00d8b\u00e1\b\u00bb\u0004\u0080\u00c1BQ\u0011;5\u0088+\f\u00ab\u00a2\u0087\u001c\u0018\u00fd\u00f7\u00cfF\rY\u00db\u0004\u00fciQ\u0081\u0007\u00d7p\u0096\u009d\u00de9)\u0004\u001c\u00be\u00d1\u00be\u0002It\u0006\r\u00b0\u00cbjAc\u0005X\u0019n\u00ae>\t\u0007\u008d.\u001d\u00e6o\u001bG\u0080\u0007\u001f\u00d8Y\u00ae\u00ef!Z";
                        var12_3 = "\u00da\u00a3\u00e1\u00c1\u00f8\u00cc\u00b8\u00026c\u001a^\u000e^OFb\u001eF\u00e6~F\u0093\u0086\"\u00daUW\u00d4\u000e\u00a4U\u00e7\u00a1\u00cb3\u00ac\t[j\u00a5\u00e1\u0097\u00f05\u00b4E\u0004\u00a9;\u00fb\u00cb\u0003\u00edK\u001a\u0011V\u0012S\u0098\u00a6$R\u00f7C\u00c5x\u00b4\u0093\u00da\u00f1\u00db\u00a8!!mF6\u0088\u00d7\u00ca\u007f\u00c1\u00ed\u0089\u0096\\\u001f\u00cf\u00a4\u0018\u0004\u00f9\u00ea\r\u00bf\u00f3F$\u000e\u009a\u0093\u008f\u00cf\u00bb\u009d+8\u00b4+\u00e4-\u0082B]\u00e5R\u00c6\u00c4\u00f52\u00ad_\u00a7\u008e\u00f83\u0010D\u0019\u00d8\u0004\n;\u00eb<\u0018\u00f9\u00b6\u00e6\u00f6\u00f9-&:\u00ec\u0014\u00dd\u0019\u000bW\u00d84\u00e3\u0081N\tr\u0011\u00ddn,\u00aaB\t\u0090\u00de\u00ce\"\u00d8b\u00e1\b\u00bb\u0004\u0080\u00c1BQ\u0011;5\u0088+\f\u00ab\u00a2\u0087\u001c\u0018\u00fd\u00f7\u00cfF\rY\u00db\u0004\u00fciQ\u0081\u0007\u00d7p\u0096\u009d\u00de9)\u0004\u001c\u00be\u00d1\u00be\u0002It\u0006\r\u00b0\u00cbjAc\u0005X\u0019n\u00ae>\t\u0007\u008d.\u001d\u00e6o\u001bG\u0080\u0007\u001f\u00d8Y\u00ae\u00ef!Z".length();
                        var9_4 = 7;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 77;
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
                            var10_2 = "\u00a5\u00db\u00143\u00b4\u0003\u0097\u00dc\u0090";
                            var12_3 = "\u00a5\u00db\u00143\u00b4\u0003\u0097\u00dc\u0090".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 1;
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
                                    v15 = 91;
                                    break;
                                }
                                case 1: {
                                    v15 = 85;
                                    break;
                                }
                                case 2: {
                                    v15 = 87;
                                    break;
                                }
                                case 3: {
                                    v15 = 20;
                                    break;
                                }
                                case 4: {
                                    v15 = 111;
                                    break;
                                }
                                case 5: {
                                    v15 = 60;
                                    break;
                                }
                                default: {
                                    v15 = 19;
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
                bb_0.a = var13;
                bb_0.b = new String[22];
                var0_7 = 3525204293363952183L;
                var6_8 = new long[14];
                var3_9 = 0;
                var4_10 = "\u00e6\u0086:\u0086\u00dc\u0081\u00c1\u00cc\u009a&\t\u0002\u00fb\u00a9Z\u00c0\u001c\u009f\u00c6*\u000f\u000b\u0094\u00b1\u00a7\u00cbR\u00f2\u00ae\u00b1\u008b\u00cc\u00c4\u00dd1\u00da\u00c2\u00f0\u00a1p\u001e\u00f9\u00e6)\u00adb\t\u00c0\u009c\u00ac\u00bf(jL\u000f\u00c5\u00ad\u00f0\u0014\u00ca\u0003#\u00f3\u008f\u00fc\u0012~=5\u0095\u009a\u008d\u0088\u0099b\u00f0\u00db\u00e2o+9H\bP\u00fdx\u00a0q\u00ee\n\u00a8VW\u00e4\u00f4A";
                var5_11 = "\u00e6\u0086:\u0086\u00dc\u0081\u00c1\u00cc\u009a&\t\u0002\u00fb\u00a9Z\u00c0\u001c\u009f\u00c6*\u000f\u000b\u0094\u00b1\u00a7\u00cbR\u00f2\u00ae\u00b1\u008b\u00cc\u00c4\u00dd1\u00da\u00c2\u00f0\u00a1p\u001e\u00f9\u00e6)\u00adb\t\u00c0\u009c\u00ac\u00bf(jL\u000f\u00c5\u00ad\u00f0\u0014\u00ca\u0003#\u00f3\u008f\u00fc\u0012~=5\u0095\u009a\u008d\u0088\u0099b\u00f0\u00db\u00e2o+9H\bP\u00fdx\u00a0q\u00ee\n\u00a8VW\u00e4\u00f4A".length();
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
                    var4_10 = "\u00c3k\u00b8,\u00d9,\u00f6F\u009ct\u00af\u00bf\u00c1\u00d8\u009b\u0087";
                    var5_11 = "\u00c3k\u00b8,\u00d9,\u00f6F\u009ct\u00af\u00bf\u00c1\u00d8\u009b\u0087".length();
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
        bb_0.c = var6_8;
        bb_0.d = new Integer[14];
        bb_0.K = new byte[]{bb_0.a(16113, 7526733444494273499L)};
        bb_0.z = E8.J("\n");
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x3B48) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 89;
                    break;
                }
                case 1: {
                    n14 = 181;
                    break;
                }
                case 2: {
                    n14 = 176;
                    break;
                }
                case 3: {
                    n14 = 61;
                    break;
                }
                case 4: {
                    n14 = 59;
                    break;
                }
                case 5: {
                    n14 = 123;
                    break;
                }
                case 6: {
                    n14 = 246;
                    break;
                }
                case 7: {
                    n14 = 127;
                    break;
                }
                case 8: {
                    n14 = 105;
                    break;
                }
                case 9: {
                    n14 = 29;
                    break;
                }
                case 10: {
                    n14 = 13;
                    break;
                }
                case 11: {
                    n14 = 213;
                    break;
                }
                case 12: {
                    n14 = 184;
                    break;
                }
                case 13: {
                    n14 = 252;
                    break;
                }
                case 14: {
                    n14 = 108;
                    break;
                }
                case 15: {
                    n14 = 233;
                    break;
                }
                case 16: {
                    n14 = 70;
                    break;
                }
                case 17: {
                    n14 = 205;
                    break;
                }
                case 18: {
                    n14 = 45;
                    break;
                }
                case 19: {
                    n14 = 104;
                    break;
                }
                case 20: {
                    n14 = 157;
                    break;
                }
                case 21: {
                    n14 = 224;
                    break;
                }
                case 22: {
                    n14 = 158;
                    break;
                }
                case 23: {
                    n14 = 57;
                    break;
                }
                case 24: {
                    n14 = 148;
                    break;
                }
                case 25: {
                    n14 = 172;
                    break;
                }
                case 26: {
                    n14 = 138;
                    break;
                }
                case 27: {
                    n14 = 139;
                    break;
                }
                case 28: {
                    n14 = 117;
                    break;
                }
                case 29: {
                    n14 = 167;
                    break;
                }
                case 30: {
                    n14 = 96;
                    break;
                }
                case 31: {
                    n14 = 81;
                    break;
                }
                case 32: {
                    n14 = 2;
                    break;
                }
                case 33: {
                    n14 = 47;
                    break;
                }
                case 34: {
                    n14 = 36;
                    break;
                }
                case 35: {
                    n14 = 140;
                    break;
                }
                case 36: {
                    n14 = 137;
                    break;
                }
                case 37: {
                    n14 = 166;
                    break;
                }
                case 38: {
                    n14 = 208;
                    break;
                }
                case 39: {
                    n14 = 56;
                    break;
                }
                case 40: {
                    n14 = 194;
                    break;
                }
                case 41: {
                    n14 = 107;
                    break;
                }
                case 42: {
                    n14 = 37;
                    break;
                }
                case 43: {
                    n14 = 48;
                    break;
                }
                case 44: {
                    n14 = 106;
                    break;
                }
                case 45: {
                    n14 = 128;
                    break;
                }
                case 46: {
                    n14 = 197;
                    break;
                }
                case 47: {
                    n14 = 124;
                    break;
                }
                case 48: {
                    n14 = 173;
                    break;
                }
                case 49: {
                    n14 = 78;
                    break;
                }
                case 50: {
                    n14 = 114;
                    break;
                }
                case 51: {
                    n14 = 67;
                    break;
                }
                case 52: {
                    n14 = 147;
                    break;
                }
                case 53: {
                    n14 = 254;
                    break;
                }
                case 54: {
                    n14 = 80;
                    break;
                }
                case 55: {
                    n14 = 33;
                    break;
                }
                case 56: {
                    n14 = 71;
                    break;
                }
                case 57: {
                    n14 = 112;
                    break;
                }
                case 58: {
                    n14 = 199;
                    break;
                }
                case 59: {
                    n14 = 43;
                    break;
                }
                case 60: {
                    n14 = 186;
                    break;
                }
                case 61: {
                    n14 = 16;
                    break;
                }
                case 62: {
                    n14 = 162;
                    break;
                }
                case 63: {
                    n14 = 225;
                    break;
                }
                case 64: {
                    n14 = 185;
                    break;
                }
                case 65: {
                    n14 = 79;
                    break;
                }
                case 66: {
                    n14 = 119;
                    break;
                }
                case 67: {
                    n14 = 52;
                    break;
                }
                case 68: {
                    n14 = 25;
                    break;
                }
                case 69: {
                    n14 = 85;
                    break;
                }
                case 70: {
                    n14 = 154;
                    break;
                }
                case 71: {
                    n14 = 17;
                    break;
                }
                case 72: {
                    n14 = 87;
                    break;
                }
                case 73: {
                    n14 = 211;
                    break;
                }
                case 74: {
                    n14 = 209;
                    break;
                }
                case 75: {
                    n14 = 237;
                    break;
                }
                case 76: {
                    n14 = 179;
                    break;
                }
                case 77: {
                    n14 = 93;
                    break;
                }
                case 78: {
                    n14 = 83;
                    break;
                }
                case 79: {
                    n14 = 150;
                    break;
                }
                case 80: {
                    n14 = 249;
                    break;
                }
                case 81: {
                    n14 = 74;
                    break;
                }
                case 82: {
                    n14 = 1;
                    break;
                }
                case 83: {
                    n14 = 232;
                    break;
                }
                case 84: {
                    n14 = 35;
                    break;
                }
                case 85: {
                    n14 = 142;
                    break;
                }
                case 86: {
                    n14 = 10;
                    break;
                }
                case 87: {
                    n14 = 7;
                    break;
                }
                case 88: {
                    n14 = 190;
                    break;
                }
                case 89: {
                    n14 = 84;
                    break;
                }
                case 90: {
                    n14 = 0;
                    break;
                }
                case 91: {
                    n14 = 196;
                    break;
                }
                case 92: {
                    n14 = 60;
                    break;
                }
                case 93: {
                    n14 = 223;
                    break;
                }
                case 94: {
                    n14 = 28;
                    break;
                }
                case 95: {
                    n14 = 4;
                    break;
                }
                case 96: {
                    n14 = 40;
                    break;
                }
                case 97: {
                    n14 = 130;
                    break;
                }
                case 98: {
                    n14 = 126;
                    break;
                }
                case 99: {
                    n14 = 6;
                    break;
                }
                case 100: {
                    n14 = 9;
                    break;
                }
                case 101: {
                    n14 = 62;
                    break;
                }
                case 102: {
                    n14 = 3;
                    break;
                }
                case 103: {
                    n14 = 230;
                    break;
                }
                case 104: {
                    n14 = 134;
                    break;
                }
                case 105: {
                    n14 = 50;
                    break;
                }
                case 106: {
                    n14 = 5;
                    break;
                }
                case 107: {
                    n14 = 136;
                    break;
                }
                case 108: {
                    n14 = 90;
                    break;
                }
                case 109: {
                    n14 = 58;
                    break;
                }
                case 110: {
                    n14 = 153;
                    break;
                }
                case 111: {
                    n14 = 19;
                    break;
                }
                case 112: {
                    n14 = 174;
                    break;
                }
                case 113: {
                    n14 = 109;
                    break;
                }
                case 114: {
                    n14 = 235;
                    break;
                }
                case 115: {
                    n14 = 76;
                    break;
                }
                case 116: {
                    n14 = 51;
                    break;
                }
                case 117: {
                    n14 = 229;
                    break;
                }
                case 118: {
                    n14 = 248;
                    break;
                }
                case 119: {
                    n14 = 182;
                    break;
                }
                case 120: {
                    n14 = 66;
                    break;
                }
                case 121: {
                    n14 = 15;
                    break;
                }
                case 122: {
                    n14 = 216;
                    break;
                }
                case 123: {
                    n14 = 38;
                    break;
                }
                case 124: {
                    n14 = 227;
                    break;
                }
                case 125: {
                    n14 = 228;
                    break;
                }
                case 126: {
                    n14 = 82;
                    break;
                }
                case 127: {
                    n14 = 146;
                    break;
                }
                case 128: {
                    n14 = 21;
                    break;
                }
                case 129: {
                    n14 = 64;
                    break;
                }
                case 130: {
                    n14 = 143;
                    break;
                }
                case 131: {
                    n14 = 101;
                    break;
                }
                case 132: {
                    n14 = 122;
                    break;
                }
                case 133: {
                    n14 = 221;
                    break;
                }
                case 134: {
                    n14 = 94;
                    break;
                }
                case 135: {
                    n14 = 226;
                    break;
                }
                case 136: {
                    n14 = 222;
                    break;
                }
                case 137: {
                    n14 = 115;
                    break;
                }
                case 138: {
                    n14 = 255;
                    break;
                }
                case 139: {
                    n14 = 44;
                    break;
                }
                case 140: {
                    n14 = 14;
                    break;
                }
                case 141: {
                    n14 = 54;
                    break;
                }
                case 142: {
                    n14 = 97;
                    break;
                }
                case 143: {
                    n14 = 131;
                    break;
                }
                case 144: {
                    n14 = 201;
                    break;
                }
                case 145: {
                    n14 = 180;
                    break;
                }
                case 146: {
                    n14 = 152;
                    break;
                }
                case 147: {
                    n14 = 32;
                    break;
                }
                case 148: {
                    n14 = 165;
                    break;
                }
                case 149: {
                    n14 = 175;
                    break;
                }
                case 150: {
                    n14 = 30;
                    break;
                }
                case 151: {
                    n14 = 86;
                    break;
                }
                case 152: {
                    n14 = 132;
                    break;
                }
                case 153: {
                    n14 = 111;
                    break;
                }
                case 154: {
                    n14 = 26;
                    break;
                }
                case 155: {
                    n14 = 241;
                    break;
                }
                case 156: {
                    n14 = 202;
                    break;
                }
                case 157: {
                    n14 = 159;
                    break;
                }
                case 158: {
                    n14 = 151;
                    break;
                }
                case 159: {
                    n14 = 135;
                    break;
                }
                case 160: {
                    n14 = 238;
                    break;
                }
                case 161: {
                    n14 = 210;
                    break;
                }
                case 162: {
                    n14 = 68;
                    break;
                }
                case 163: {
                    n14 = 63;
                    break;
                }
                case 164: {
                    n14 = 204;
                    break;
                }
                case 165: {
                    n14 = 155;
                    break;
                }
                case 166: {
                    n14 = 168;
                    break;
                }
                case 167: {
                    n14 = 118;
                    break;
                }
                case 168: {
                    n14 = 220;
                    break;
                }
                case 169: {
                    n14 = 145;
                    break;
                }
                case 170: {
                    n14 = 149;
                    break;
                }
                case 171: {
                    n14 = 178;
                    break;
                }
                case 172: {
                    n14 = 170;
                    break;
                }
                case 173: {
                    n14 = 12;
                    break;
                }
                case 174: {
                    n14 = 55;
                    break;
                }
                case 175: {
                    n14 = 183;
                    break;
                }
                case 176: {
                    n14 = 244;
                    break;
                }
                case 177: {
                    n14 = 18;
                    break;
                }
                case 178: {
                    n14 = 207;
                    break;
                }
                case 179: {
                    n14 = 193;
                    break;
                }
                case 180: {
                    n14 = 53;
                    break;
                }
                case 181: {
                    n14 = 103;
                    break;
                }
                case 182: {
                    n14 = 91;
                    break;
                }
                case 183: {
                    n14 = 95;
                    break;
                }
                case 184: {
                    n14 = 34;
                    break;
                }
                case 185: {
                    n14 = 219;
                    break;
                }
                case 186: {
                    n14 = 23;
                    break;
                }
                case 187: {
                    n14 = 214;
                    break;
                }
                case 188: {
                    n14 = 121;
                    break;
                }
                case 189: {
                    n14 = 247;
                    break;
                }
                case 190: {
                    n14 = 125;
                    break;
                }
                case 191: {
                    n14 = 72;
                    break;
                }
                case 192: {
                    n14 = 234;
                    break;
                }
                case 193: {
                    n14 = 251;
                    break;
                }
                case 194: {
                    n14 = 69;
                    break;
                }
                case 195: {
                    n14 = 191;
                    break;
                }
                case 196: {
                    n14 = 20;
                    break;
                }
                case 197: {
                    n14 = 236;
                    break;
                }
                case 198: {
                    n14 = 212;
                    break;
                }
                case 199: {
                    n14 = 195;
                    break;
                }
                case 200: {
                    n14 = 99;
                    break;
                }
                case 201: {
                    n14 = 171;
                    break;
                }
                case 202: {
                    n14 = 200;
                    break;
                }
                case 203: {
                    n14 = 100;
                    break;
                }
                case 204: {
                    n14 = 141;
                    break;
                }
                case 205: {
                    n14 = 188;
                    break;
                }
                case 206: {
                    n14 = 231;
                    break;
                }
                case 207: {
                    n14 = 187;
                    break;
                }
                case 208: {
                    n14 = 250;
                    break;
                }
                case 209: {
                    n14 = 156;
                    break;
                }
                case 210: {
                    n14 = 24;
                    break;
                }
                case 211: {
                    n14 = 41;
                    break;
                }
                case 212: {
                    n14 = 163;
                    break;
                }
                case 213: {
                    n14 = 77;
                    break;
                }
                case 214: {
                    n14 = 22;
                    break;
                }
                case 215: {
                    n14 = 192;
                    break;
                }
                case 216: {
                    n14 = 160;
                    break;
                }
                case 217: {
                    n14 = 129;
                    break;
                }
                case 218: {
                    n14 = 98;
                    break;
                }
                case 219: {
                    n14 = 102;
                    break;
                }
                case 220: {
                    n14 = 133;
                    break;
                }
                case 221: {
                    n14 = 217;
                    break;
                }
                case 222: {
                    n14 = 120;
                    break;
                }
                case 223: {
                    n14 = 177;
                    break;
                }
                case 224: {
                    n14 = 88;
                    break;
                }
                case 225: {
                    n14 = 253;
                    break;
                }
                case 226: {
                    n14 = 75;
                    break;
                }
                case 227: {
                    n14 = 243;
                    break;
                }
                case 228: {
                    n14 = 116;
                    break;
                }
                case 229: {
                    n14 = 242;
                    break;
                }
                case 230: {
                    n14 = 169;
                    break;
                }
                case 231: {
                    n14 = 240;
                    break;
                }
                case 232: {
                    n14 = 198;
                    break;
                }
                case 233: {
                    n14 = 27;
                    break;
                }
                case 234: {
                    n14 = 245;
                    break;
                }
                case 235: {
                    n14 = 8;
                    break;
                }
                case 236: {
                    n14 = 110;
                    break;
                }
                case 237: {
                    n14 = 113;
                    break;
                }
                case 238: {
                    n14 = 42;
                    break;
                }
                case 239: {
                    n14 = 49;
                    break;
                }
                case 240: {
                    n14 = 189;
                    break;
                }
                case 241: {
                    n14 = 92;
                    break;
                }
                case 242: {
                    n14 = 65;
                    break;
                }
                case 243: {
                    n14 = 144;
                    break;
                }
                case 244: {
                    n14 = 218;
                    break;
                }
                case 245: {
                    n14 = 239;
                    break;
                }
                case 246: {
                    n14 = 164;
                    break;
                }
                case 247: {
                    n14 = 31;
                    break;
                }
                case 248: {
                    n14 = 46;
                    break;
                }
                case 249: {
                    n14 = 203;
                    break;
                }
                case 250: {
                    n14 = 206;
                    break;
                }
                case 251: {
                    n14 = 73;
                    break;
                }
                case 252: {
                    n14 = 39;
                    break;
                }
                case 253: {
                    n14 = 11;
                    break;
                }
                case 254: {
                    n14 = 161;
                    break;
                }
                default: {
                    n14 = 215;
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
            bb_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x152A;
        if (d[n11] == null) {
            bb_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

