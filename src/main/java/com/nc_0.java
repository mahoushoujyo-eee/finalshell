/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.EP;
import com.FW;
import com.HR;
import com.ak_0;
import com.dl_1;
import com.nj_2;
import com.nl_1;
import com.np_2;
import com.ns_2;
import com.nv_2;
import com.ok_0;
import com.ph_0;
import com.zO;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Collection;

/*
 * Renamed from com.Nc
 */
public class nc_0
implements Comparable {
    public final ph_0 j;
    protected final boolean O;
    protected int V;
    private final String C;
    private String c;
    private String l;
    protected dl_1 D;
    private String t;
    protected boolean s;
    protected boolean q;
    protected boolean y;
    protected boolean Q;
    protected boolean W;
    protected boolean B;
    private HR b;
    private static final String[] a;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;
    private static final long[] g;
    private static final Long[] h;

    /*
     * Exception decompiling
     */
    public nc_0(Class var1_1, ph_0 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
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
    public void E(nl_1 var1_1) throws IOException {
        block25: {
            block27: {
                block26: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    var3_2 = var1_1.w;
                                    var2_3 = nv_2.o();
                                    try {
                                        try {
                                            v0 = var3_2.e;
                                            if (var2_3 == null) break block21;
                                            if (v0) {
                                            }
                                            ** GOTO lbl51
                                        }
                                        catch (IOException v1) {
                                            throw nc_0.a(v1);
                                        }
                                        v0 = EP.a(var3_2.q, this.j.c, EP.UseSingleQuotes);
                                    }
                                    catch (IOException v2) {
                                        throw nc_0.a(v2);
                                    }
                                }
                                var4_4 = v0;
                                try {
                                    try {
                                        try {
                                            if (var4_4) {
                                                v3 = this;
                                                if (var2_3 == null) break block22;
                                            }
                                            ** GOTO lbl42
                                        }
                                        catch (IOException v4) {
                                            throw nc_0.a(v4);
                                        }
                                        if (v3.c != null) break block23;
                                    }
                                    catch (IOException v5) {
                                        throw nc_0.a(v5);
                                    }
                                    v3 = this;
                                }
                                catch (IOException v6) {
                                    throw nc_0.a(v6);
                                }
                            }
                            v3.c = (char)nc_0.a(18291, 509579454648689958L) + this.j.I + nc_0.a(27560, 6081);
                        }
                        try {
                            var3_2.write(this.c);
                            if (var2_3 != null) break block24;
lbl42:
                            // 2 sources

                            var3_2.write(this.C);
                        }
                        catch (IOException v7) {
                            throw nc_0.a(v7);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var2_3 != null) break block25;
lbl51:
                                // 2 sources

                                v8 = this;
                                if (var2_3 == null) break block26;
                            }
                            catch (IOException v9) {
                                throw nc_0.a(v9);
                            }
                            if (v8.l != null) break block27;
                        }
                        catch (IOException v10) {
                            throw nc_0.a(v10);
                        }
                        v8 = this;
                    }
                    catch (IOException v11) {
                        throw nc_0.a(v11);
                    }
                }
                v8.l = this.j.I + ":";
            }
            var3_2.write(this.l);
        }
    }

    public Object t(Object object) throws InvocationTargetException, IllegalAccessException {
        Object object2;
        block8: {
            Object object3;
            block9: {
                object3 = this.j.e(object);
                String string = nv_2.o();
                try {
                    try {
                        try {
                            try {
                                object2 = this;
                                if (string == null) break block8;
                                if (!((nc_0)object2).W) break block9;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw nc_0.a(invocationTargetException);
                            }
                            object2 = object3;
                            if (string == null) break block8;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw nc_0.a(invocationTargetException);
                        }
                        if (B8.O(object2)) break block9;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw nc_0.a(invocationTargetException);
                    }
                    return null;
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw nc_0.a(invocationTargetException);
                }
            }
            object2 = object3;
        }
        return object2;
    }

    public Object d(Object object) throws InvocationTargetException, IllegalAccessException {
        Object object2;
        block16: {
            Object object3;
            block17: {
                block19: {
                    Class<java.util.Date> clazz;
                    block18: {
                        object3 = this.j.e(object);
                        String string = nv_2.o();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    object2 = this.t;
                                                    if (string == null) break block16;
                                                    if (object2 == null) break block17;
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw nc_0.a(invocationTargetException);
                                                }
                                                object2 = object3;
                                                if (string == null) break block16;
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw nc_0.a(invocationTargetException);
                                            }
                                            if (object2 == null) break block17;
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw nc_0.a(invocationTargetException);
                                        }
                                        object2 = this.j.O;
                                        clazz = java.util.Date.class;
                                        if (string == null) break block18;
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw nc_0.a(invocationTargetException);
                                    }
                                    if (object2 == clazz) break block19;
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw nc_0.a(invocationTargetException);
                                }
                                object2 = this.j.O;
                                if (string == null) break block16;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw nc_0.a(invocationTargetException);
                            }
                            clazz = Date.class;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw nc_0.a(invocationTargetException);
                        }
                    }
                    if (object2 != clazz) break block17;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.t, ok_0.Y);
                simpleDateFormat.setTimeZone(ok_0.X);
                return simpleDateFormat.format(object3);
            }
            object2 = object3;
        }
        return object2;
    }

    public int G(nc_0 nc_02) {
        return this.j.M(nc_02.j);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void L(nl_1 var1_1, Object var2_2) throws Exception {
        block247: {
            block248: {
                block245: {
                    block244: {
                        block242: {
                            block243: {
                                block238: {
                                    block239: {
                                        block240: {
                                            block241: {
                                                block235: {
                                                    block233: {
                                                        block234: {
                                                            block237: {
                                                                block236: {
                                                                    block251: {
                                                                        block232: {
                                                                            block228: {
                                                                                block229: {
                                                                                    block230: {
                                                                                        block231: {
                                                                                            block250: {
                                                                                                block225: {
                                                                                                    block227: {
                                                                                                        block226: {
                                                                                                            block224: {
                                                                                                                block223: {
                                                                                                                    block221: {
                                                                                                                        block222: {
                                                                                                                            block219: {
                                                                                                                                block220: {
                                                                                                                                    block217: {
                                                                                                                                        block218: {
                                                                                                                                            block214: {
                                                                                                                                                block215: {
                                                                                                                                                    block216: {
                                                                                                                                                        block213: {
                                                                                                                                                            block211: {
                                                                                                                                                                block212: {
                                                                                                                                                                    block188: {
                                                                                                                                                                        block189: {
                                                                                                                                                                            block210: {
                                                                                                                                                                                block209: {
                                                                                                                                                                                    block202: {
                                                                                                                                                                                        block208: {
                                                                                                                                                                                            block207: {
                                                                                                                                                                                                block205: {
                                                                                                                                                                                                    block206: {
                                                                                                                                                                                                        block204: {
                                                                                                                                                                                                            block203: {
                                                                                                                                                                                                                block200: {
                                                                                                                                                                                                                    block201: {
                                                                                                                                                                                                                        block199: {
                                                                                                                                                                                                                            block192: {
                                                                                                                                                                                                                                block190: {
                                                                                                                                                                                                                                    block198: {
                                                                                                                                                                                                                                        block197: {
                                                                                                                                                                                                                                            block196: {
                                                                                                                                                                                                                                                block195: {
                                                                                                                                                                                                                                                    block194: {
                                                                                                                                                                                                                                                        block193: {
                                                                                                                                                                                                                                                            block191: {
                                                                                                                                                                                                                                                                var3_3 = nv_2.o();
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            v0 = this.b;
                                                                                                                                                                                                                                                                            if (var3_3 == null) break block188;
                                                                                                                                                                                                                                                                            if (v0 != null) break block189;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        catch (Exception v1) {
                                                                                                                                                                                                                                                                            throw nc_0.a(v1);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        v2 = var2_2;
                                                                                                                                                                                                                                                                        if (var3_3 == null) break block190;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    catch (Exception v3) {
                                                                                                                                                                                                                                                                        throw nc_0.a(v3);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (v2 == null) {
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    ** GOTO lbl131
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (Exception v4) {
                                                                                                                                                                                                                                                                    throw nc_0.a(v4);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var4_4 /* !! */  = this.j.O;
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    v5 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                                                                    v6 /* !! */  = Byte.TYPE;
                                                                                                                                                                                                                                                                    if (var3_3 == null) break block191;
                                                                                                                                                                                                                                                                    if (v5 /* !! */  == v6 /* !! */ ) {
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    ** GOTO lbl34
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (Exception v7) {
                                                                                                                                                                                                                                                                    throw nc_0.a(v7);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var4_4 /* !! */  = Byte.class;
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    if (var3_3 != null) break block192;
lbl34:
                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                    v5 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                                                                    v6 /* !! */  = Short.TYPE;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (Exception v8) {
                                                                                                                                                                                                                                                                    throw nc_0.a(v8);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                if (var3_3 == null) break block193;
                                                                                                                                                                                                                                                                if (v5 /* !! */  == v6 /* !! */ ) {
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                ** GOTO lbl50
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            catch (Exception v9) {
                                                                                                                                                                                                                                                                throw nc_0.a(v9);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            var4_4 /* !! */  = Short.class;
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                if (var3_3 != null) break block192;
lbl50:
                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                v5 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                                                                v6 /* !! */  = Integer.TYPE;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            catch (Exception v10) {
                                                                                                                                                                                                                                                                throw nc_0.a(v10);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            if (var3_3 == null) break block194;
                                                                                                                                                                                                                                                            if (v5 /* !! */  == v6 /* !! */ ) {
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            ** GOTO lbl66
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (Exception v11) {
                                                                                                                                                                                                                                                            throw nc_0.a(v11);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        var4_4 /* !! */  = Integer.class;
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            if (var3_3 != null) break block192;
lbl66:
                                                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                                                            v5 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                                                            v6 /* !! */  = Long.TYPE;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (Exception v12) {
                                                                                                                                                                                                                                                            throw nc_0.a(v12);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        if (var3_3 == null) break block195;
                                                                                                                                                                                                                                                        if (v5 /* !! */  == v6 /* !! */ ) {
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        ** GOTO lbl82
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (Exception v13) {
                                                                                                                                                                                                                                                        throw nc_0.a(v13);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    var4_4 /* !! */  = Long.class;
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        if (var3_3 != null) break block192;
lbl82:
                                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                                        v5 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                                                        v6 /* !! */  = Float.TYPE;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (Exception v14) {
                                                                                                                                                                                                                                                        throw nc_0.a(v14);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    if (var3_3 == null) break block196;
                                                                                                                                                                                                                                                    if (v5 /* !! */  == v6 /* !! */ ) {
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    ** GOTO lbl98
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (Exception v15) {
                                                                                                                                                                                                                                                    throw nc_0.a(v15);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                var4_4 /* !! */  = Float.class;
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    if (var3_3 != null) break block192;
lbl98:
                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                    v5 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                                                    v6 /* !! */  = Double.TYPE;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (Exception v16) {
                                                                                                                                                                                                                                                    throw nc_0.a(v16);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                if (var3_3 == null) break block197;
                                                                                                                                                                                                                                                if (v5 /* !! */  == v6 /* !! */ ) {
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                ** GOTO lbl115
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (Exception v17) {
                                                                                                                                                                                                                                                throw nc_0.a(v17);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            var4_4 /* !! */  = Double.class;
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    if (var3_3 != null) break block192;
lbl115:
                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                    v5 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                                                    if (var3_3 == null) break block198;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (Exception v18) {
                                                                                                                                                                                                                                                    throw nc_0.a(v18);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                v6 /* !! */  = Boolean.TYPE;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (Exception v19) {
                                                                                                                                                                                                                                                throw nc_0.a(v19);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (v5 /* !! */  != v6 /* !! */ ) break block192;
                                                                                                                                                                                                                                        v5 /* !! */  = Boolean.class;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var4_4 /* !! */  = v5 /* !! */ ;
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        if (var3_3 != null) break block192;
lbl131:
                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                        v2 = var2_2;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (Exception v20) {
                                                                                                                                                                                                                                        throw nc_0.a(v20);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                var4_4 /* !! */  = v2.getClass();
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var5_5 = null;
                                                                                                                                                                                                                            var6_7 = this.j.Z();
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                v21 = var6_7;
                                                                                                                                                                                                                                if (var3_3 == null) break block199;
                                                                                                                                                                                                                                if (v21 == null) break block200;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (Exception v22) {
                                                                                                                                                                                                                                throw nc_0.a(v22);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v21 = var6_7;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                v23 /* !! */  = v21.u();
                                                                                                                                                                                                                                if (var3_3 == null) break block201;
                                                                                                                                                                                                                                if (v23 /* !! */  == Void.class) break block200;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (Exception v24) {
                                                                                                                                                                                                                                throw nc_0.a(v24);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v23 /* !! */  = var6_7.u().newInstance();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (Exception v25) {
                                                                                                                                                                                                                            throw nc_0.a(v25);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    var5_5 = (ak_0)v23 /* !! */ ;
                                                                                                                                                                                                                    this.Q = true;
                                                                                                                                                                                                                    break block210;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            if (this.t == null) break block202;
                                                                                                                                                                                                                            v26 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                            v27 /* !! */  = Double.TYPE;
                                                                                                                                                                                                                            if (var3_3 == null) break block203;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (Exception v28) {
                                                                                                                                                                                                                            throw nc_0.a(v28);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (v26 /* !! */  == v27 /* !! */ ) break block204;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (Exception v29) {
                                                                                                                                                                                                                        throw nc_0.a(v29);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v26 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                                    v27 /* !! */  = Double.class;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (Exception v30) {
                                                                                                                                                                                                                    throw nc_0.a(v30);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (var3_3 == null) break block205;
                                                                                                                                                                                                                if (v26 /* !! */  != v27 /* !! */ ) break block206;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (Exception v31) {
                                                                                                                                                                                                                throw nc_0.a(v31);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        var5_5 = new zO(this.t);
                                                                                                                                                                                                        break block202;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v26 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                    v27 /* !! */  = Float.TYPE;
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        if (var3_3 == null) break block207;
                                                                                                                                                                                                        if (v26 /* !! */  == v27 /* !! */ ) break block208;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (Exception v32) {
                                                                                                                                                                                                        throw nc_0.a(v32);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v26 /* !! */  = var4_4 /* !! */ ;
                                                                                                                                                                                                    v27 /* !! */  = Float.class;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (Exception v33) {
                                                                                                                                                                                                    throw nc_0.a(v33);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            if (v26 /* !! */  != v27 /* !! */ ) break block202;
                                                                                                                                                                                        }
                                                                                                                                                                                        var5_5 = new ns_2(this.t);
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            v34 = var5_5;
                                                                                                                                                                                            if (var3_3 == null) break block209;
                                                                                                                                                                                            if (v34 != null) break block210;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (Exception v35) {
                                                                                                                                                                                            throw nc_0.a(v35);
                                                                                                                                                                                        }
                                                                                                                                                                                        v34 = var1_1.E(var4_4 /* !! */ );
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (Exception v36) {
                                                                                                                                                                                        throw nc_0.a(v36);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var5_5 = v34;
                                                                                                                                                                            }
                                                                                                                                                                            this.b = new HR(var5_5, var4_4 /* !! */ );
                                                                                                                                                                        }
                                                                                                                                                                        v0 = this.b;
                                                                                                                                                                    }
                                                                                                                                                                    var4_4 /* !! */  = v0;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            v37 = this;
                                                                                                                                                                            if (var3_3 == null) break block211;
                                                                                                                                                                            if (!v37.y) break block212;
                                                                                                                                                                        }
                                                                                                                                                                        catch (Exception v38) {
                                                                                                                                                                            throw nc_0.a(v38);
                                                                                                                                                                        }
                                                                                                                                                                        v39 = this.j.c | EP.DisableCircularReferenceDetect.mask;
                                                                                                                                                                        break block213;
                                                                                                                                                                    }
                                                                                                                                                                    catch (Exception v40) {
                                                                                                                                                                        throw nc_0.a(v40);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v37 = this;
                                                                                                                                                            }
                                                                                                                                                            v39 = v37.j.c;
                                                                                                                                                        }
                                                                                                                                                        var5_6 = v39 | this.V;
                                                                                                                                                        if (var2_2 != null) break block250;
                                                                                                                                                        var6_7 = var1_1.w;
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        v41 = this.j.O;
                                                                                                                                                                        if (var3_3 == null) break block214;
                                                                                                                                                                        if (v41 != Object.class) break block215;
                                                                                                                                                                    }
                                                                                                                                                                    catch (Exception v42) {
                                                                                                                                                                        throw nc_0.a(v42);
                                                                                                                                                                    }
                                                                                                                                                                    v43 = var6_7;
                                                                                                                                                                    if (var3_3 == null) break block216;
                                                                                                                                                                }
                                                                                                                                                                catch (Exception v44) {
                                                                                                                                                                    throw nc_0.a(v44);
                                                                                                                                                                }
                                                                                                                                                                if (!v43.y(EP.WRITE_MAP_NULL_FEATURES)) break block215;
                                                                                                                                                            }
                                                                                                                                                            catch (Exception v45) {
                                                                                                                                                                throw nc_0.a(v45);
                                                                                                                                                            }
                                                                                                                                                            v43 = var6_7;
                                                                                                                                                        }
                                                                                                                                                        catch (Exception v46) {
                                                                                                                                                            throw nc_0.a(v46);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v43.Y();
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                v41 = var4_4 /* !! */ .A;
                                                                                                                                            }
                                                                                                                                            var7_8 = v41;
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v47 = Number.class;
                                                                                                                                                    v48 = var7_8;
                                                                                                                                                    if (var3_3 == null) break block217;
                                                                                                                                                    if (!v47.isAssignableFrom(v48)) break block218;
                                                                                                                                                }
                                                                                                                                                catch (Exception v49) {
                                                                                                                                                    throw nc_0.a(v49);
                                                                                                                                                }
                                                                                                                                                var6_7.s(this.V, EP.WriteNullNumberAsZero.mask);
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            catch (Exception v50) {
                                                                                                                                                throw nc_0.a(v50);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v47 = String.class;
                                                                                                                                        v48 = var7_8;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (var3_3 == null) break block219;
                                                                                                                                            if (v47 != v48) break block220;
                                                                                                                                        }
                                                                                                                                        catch (Exception v51) {
                                                                                                                                            throw nc_0.a(v51);
                                                                                                                                        }
                                                                                                                                        var6_7.s(this.V, EP.WriteNullStringAsEmpty.mask);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    catch (Exception v52) {
                                                                                                                                        throw nc_0.a(v52);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v47 = Boolean.class;
                                                                                                                                v48 = var7_8;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (var3_3 == null) break block221;
                                                                                                                                    if (v47 != v48) break block222;
                                                                                                                                }
                                                                                                                                catch (Exception v53) {
                                                                                                                                    throw nc_0.a(v53);
                                                                                                                                }
                                                                                                                                var6_7.s(this.V, EP.WriteNullBooleanAsFalse.mask);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            catch (Exception v54) {
                                                                                                                                throw nc_0.a(v54);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v47 = Collection.class;
                                                                                                                        v48 = var7_8;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v55 = v47.isAssignableFrom(v48);
                                                                                                                            if (var3_3 == null) break block223;
                                                                                                                            if (!v55) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl349
                                                                                                                        }
                                                                                                                        catch (Exception v56) {
                                                                                                                            throw nc_0.a(v56);
                                                                                                                        }
                                                                                                                        v55 = var7_8.isArray();
                                                                                                                    }
                                                                                                                    catch (Exception v57) {
                                                                                                                        throw nc_0.a(v57);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (!v55) break block224;
lbl349:
                                                                                                                    // 2 sources

                                                                                                                    var6_7.s(this.V, EP.WriteNullListAsEmpty.mask);
                                                                                                                    return;
                                                                                                                }
                                                                                                                catch (Exception v58) {
                                                                                                                    throw nc_0.a(v58);
                                                                                                                }
                                                                                                            }
                                                                                                            var8_10 = var4_4 /* !! */ .C;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var3_3 == null) break block225;
                                                                                                                            if (!var6_7.y(EP.WRITE_MAP_NULL_FEATURES)) break block226;
                                                                                                                        }
                                                                                                                        catch (Exception v59) {
                                                                                                                            throw nc_0.a(v59);
                                                                                                                        }
                                                                                                                        v60 = var8_10;
                                                                                                                        if (var3_3 == null) break block227;
                                                                                                                    }
                                                                                                                    catch (Exception v61) {
                                                                                                                        throw nc_0.a(v61);
                                                                                                                    }
                                                                                                                    if (!(v60 instanceof nj_2)) break block226;
                                                                                                                }
                                                                                                                catch (Exception v62) {
                                                                                                                    throw nc_0.a(v62);
                                                                                                                }
                                                                                                                var6_7.Y();
                                                                                                                return;
                                                                                                            }
                                                                                                            catch (Exception v63) {
                                                                                                                throw nc_0.a(v63);
                                                                                                            }
                                                                                                        }
                                                                                                        v60 = var8_10;
                                                                                                    }
                                                                                                    v60.u(var1_1, null, this.j.I, this.j.a, var5_6);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v64 = this.j;
                                                                                                            if (var3_3 == null) break block228;
                                                                                                            if (!v64.X) break block229;
                                                                                                        }
                                                                                                        catch (Exception v65) {
                                                                                                            throw nc_0.a(v65);
                                                                                                        }
                                                                                                        v66 = this.q;
                                                                                                        if (var3_3 == null) break block230;
                                                                                                    }
                                                                                                    catch (Exception v67) {
                                                                                                        throw nc_0.a(v67);
                                                                                                    }
                                                                                                    if (!v66) break block231;
                                                                                                }
                                                                                                catch (Exception v68) {
                                                                                                    throw nc_0.a(v68);
                                                                                                }
                                                                                                var1_1.w.y(((Enum)var2_2).name());
                                                                                                return;
                                                                                            }
                                                                                            catch (Exception v69) {
                                                                                                throw nc_0.a(v69);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            v64 = this;
                                                                                            if (var3_3 == null) break block228;
                                                                                            v66 = v64.s;
                                                                                        }
                                                                                        catch (Exception v70) {
                                                                                            throw nc_0.a(v70);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (v66) {
                                                                                            var1_1.w.y(((Enum)var2_2).toString());
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    catch (Exception v71) {
                                                                                        throw nc_0.a(v71);
                                                                                    }
                                                                                }
                                                                                v64 = var2_2;
                                                                            }
                                                                            var6_7 = v64.getClass();
                                                                            try {
                                                                                if (var6_7 != var4_4 /* !! */ .A && !this.Q) break block232;
                                                                            }
                                                                            catch (Exception v72) {
                                                                                throw nc_0.a(v72);
                                                                            }
                                                                            var7_9 = var4_4 /* !! */ .C;
                                                                            if (var3_3 != null) break block251;
                                                                        }
                                                                        var7_9 = var1_1.E(var6_7);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v73 = this;
                                                                                                    if (var3_3 == null) break block233;
                                                                                                    if (v73.t == null) break block234;
                                                                                                }
                                                                                                catch (Exception v74) {
                                                                                                    throw nc_0.a(v74);
                                                                                                }
                                                                                                v75 = var7_9 instanceof zO;
                                                                                                if (var3_3 == null) break block235;
                                                                                            }
                                                                                            catch (Exception v76) {
                                                                                                throw nc_0.a(v76);
                                                                                            }
                                                                                            if (v75 != 0) break block234;
                                                                                        }
                                                                                        catch (Exception v77) {
                                                                                            throw nc_0.a(v77);
                                                                                        }
                                                                                        v75 = var7_9 instanceof ns_2;
                                                                                        if (var3_3 == null) break block235;
                                                                                    }
                                                                                    catch (Exception v78) {
                                                                                        throw nc_0.a(v78);
                                                                                    }
                                                                                    if (v75 != 0) break block234;
                                                                                }
                                                                                catch (Exception v79) {
                                                                                    throw nc_0.a(v79);
                                                                                }
                                                                                v80 = var7_9;
                                                                                if (var3_3 == null) break block236;
                                                                            }
                                                                            catch (Exception v81) {
                                                                                throw nc_0.a(v81);
                                                                            }
                                                                            if (v80 instanceof FW) {
                                                                            }
                                                                            ** GOTO lbl487
                                                                        }
                                                                        catch (Exception v82) {
                                                                            throw nc_0.a(v82);
                                                                        }
                                                                        v80 = var7_9;
                                                                    }
                                                                    catch (Exception v83) {
                                                                        throw nc_0.a(v83);
                                                                    }
                                                                }
                                                                try {
                                                                    ((FW)v80).q(var1_1, var2_2, this.D);
                                                                    if (var3_3 != null) break block237;
lbl487:
                                                                    // 2 sources

                                                                    var1_1.l(var2_2, this.t);
                                                                }
                                                                catch (Exception v84) {
                                                                    throw nc_0.a(v84);
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        v73 = this;
                                                    }
                                                    v75 = v73.j.D;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (var3_3 == null) break block238;
                                                            if (v75 == 0) break block239;
                                                        }
                                                        catch (Exception v85) {
                                                            throw nc_0.a(v85);
                                                        }
                                                        v75 = var7_9 instanceof nj_2;
                                                        if (var3_3 == null) break block240;
                                                    }
                                                    catch (Exception v86) {
                                                        throw nc_0.a(v86);
                                                    }
                                                    if (v75 == 0) break block241;
                                                }
                                                catch (Exception v87) {
                                                    throw nc_0.a(v87);
                                                }
                                                var8_11 = (nj_2)var7_9;
                                                var8_11.z(var1_1, var2_2, this.j.I, this.j.a, var5_6, true);
                                                return;
                                            }
                                            v75 = var7_9 instanceof np_2;
                                        }
                                        try {
                                            if (var3_3 == null) break block238;
                                            if (v75 == 0) break block239;
                                        }
                                        catch (Exception v88) {
                                            throw nc_0.a(v88);
                                        }
                                        var8_12 = (np_2)var7_9;
                                        var8_12.N(var1_1, var2_2, this.j.I, this.j.a, var5_6, true);
                                        return;
                                    }
                                    v75 = this.V & EP.WriteClassName.mask;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var3_3 == null) break block242;
                                                    if (v75 == 0) break block243;
                                                }
                                                catch (Exception v89) {
                                                    throw nc_0.a(v89);
                                                }
                                                if (var6_7 == this.j.O) break block243;
                                            }
                                            catch (Exception v90) {
                                                throw nc_0.a(v90);
                                            }
                                            v75 = var7_9 instanceof nj_2;
                                            if (var3_3 == null) break block242;
                                        }
                                        catch (Exception v91) {
                                            throw nc_0.a(v91);
                                        }
                                        if (v75 == 0) break block243;
                                    }
                                    catch (Exception v92) {
                                        throw nc_0.a(v92);
                                    }
                                    ((nj_2)var7_9).z(var1_1, var2_2, this.j.I, this.j.a, var5_6, false);
                                    return;
                                }
                                catch (Exception v93) {
                                    throw nc_0.a(v93);
                                }
                            }
                            try {
                                v94 = this;
                                if (var3_3 == null) break block244;
                                v75 = (int)v94.B;
                            }
                            catch (Exception v95) {
                                throw nc_0.a(v95);
                            }
                        }
                        if (v75 == 0) break block247;
                        v94 = this;
                    }
                    try {
                        block246: {
                            try {
                                try {
                                    try {
                                        v96 = v94.j.O;
                                        if (var3_3 == null) break block245;
                                        if (v96 == Long.TYPE) break block246;
                                    }
                                    catch (Exception v97) {
                                        throw nc_0.a(v97);
                                    }
                                    v96 = this.j.O;
                                    if (var3_3 == null) break block245;
                                }
                                catch (Exception v98) {
                                    throw nc_0.a(v98);
                                }
                                if (v96 != Long.class) break block247;
                            }
                            catch (Exception v99) {
                                throw nc_0.a(v99);
                            }
                        }
                        v96 = var2_2;
                    }
                    catch (Exception v100) {
                        throw nc_0.a(v100);
                    }
                }
                var8_13 = (Long)v96;
                try {
                    block249: {
                        try {
                            try {
                                if (var3_3 == null) break block248;
                                if (var8_13 > nc_0.b(28023, 1000827825623660474L)) break block249;
                            }
                            catch (Exception v101) {
                                throw nc_0.a(v101);
                            }
                            if (var8_13 >= nc_0.b(24786, 4359680559918709278L)) break block247;
                        }
                        catch (Exception v102) {
                            throw nc_0.a(v102);
                        }
                    }
                    var1_1.S().y(Long.toString(var8_13));
                }
                catch (Exception v103) {
                    throw nc_0.a(v103);
                }
            }
            return;
        }
        var7_9.u(var1_1, var2_2, this.j.I, this.j.a, var5_6);
    }

    public int compareTo(Object object) {
        return this.G((nc_0)object);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            var21 = new String[2];
                            var19_1 = 0;
                            var18_2 = "\u00efQ\u0002H\u009b";
                            var20_3 = "\u00efQ\u0002H\u009b".length();
                            var17_4 = 2;
                            var16_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                var21[var19_1++] = new String(v0).intern();
                                if ((var16_5 += var17_4) < var20_3) {
                                    var17_4 = var18_2.charAt(var16_5);
                                    ** continue;
                                }
                                break block17;
                                break;
                            }
                            v1 = ++var16_5;
                            v2 = var18_2.substring(v1, v1 + var17_4).toCharArray();
                            v3 = v2.length;
                            var22_6 = 0;
                            v4 = 50;
                            v5 = v2;
                            v6 = v3;
                            if (v3 > 1) ** GOTO lbl67
                            do {
                                v7 = v4;
                                v5 = v5;
                                v8 = v5;
                                v9 = v4;
                                v10 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v11 = 118;
                                            break;
                                        }
                                        case 1: {
                                            v11 = 18;
                                            break;
                                        }
                                        case 2: {
                                            v11 = 93;
                                            break;
                                        }
                                        case 3: {
                                            v11 = 2;
                                            break;
                                        }
                                        case 4: {
                                            v11 = 100;
                                            break;
                                        }
                                        case 5: {
                                            v11 = 22;
                                            break;
                                        }
                                        default: {
                                            v11 = 64;
                                        }
                                    }
                                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                    ++var22_6;
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
                            } while (v6 > var22_6);
                            ** while (true)
                        }
                        nc_0.a = var21;
                        nc_0.d = new String[2];
                        var8_7 = 6813104601188412856L;
                        var14_8 = new long[2];
                        var11_9 = 0;
                        var12_10 = ";\u0084\u00b4d\u00f8F\b\u00b9\u0086\u00fe:\u0097\u00a9\u0012\u0088J";
                        var13_11 = ";\u0084\u00b4d\u00f8F\b\u00b9\u0086\u00fe:\u0097\u00a9\u0012\u0088J".length();
                        var10_12 = 0;
                        while (true) {
                            break block18;
                            break;
                        }
lbl85:
                        // 1 sources

                        while (true) {
                            var14_8[v12] = (((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L) ^ var8_7;
                            if (var10_12 < var13_11) ** continue;
                            break block19;
                            break;
                        }
                    }
                    var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                    v12 = var11_9++;
                    ** while (true)
                }
                nc_0.e = var14_8;
                nc_0.f = new Integer[2];
                var0_14 = 9040241693657112137L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "p\u0089;\u0089~{\u0096\f\u00be\u0015\u00d1\u00b2\u00b6:\u00e4V";
                var5_18 = "p\u0089;\u0089~{\u0096\f\u00be\u0015\u00d1\u00b2\u00b6:\u00e4V".length();
                var2_19 = 0;
                while (true) {
                    break block20;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_15[v13] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block21;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v13 = var3_16++;
            ** while (true)
        }
        nc_0.g = var6_15;
        nc_0.h = new Long[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6BA9) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 0;
                    break;
                }
                case 1: {
                    n14 = 42;
                    break;
                }
                case 2: {
                    n14 = 225;
                    break;
                }
                case 3: {
                    n14 = 88;
                    break;
                }
                case 4: {
                    n14 = 160;
                    break;
                }
                case 5: {
                    n14 = 241;
                    break;
                }
                case 6: {
                    n14 = 245;
                    break;
                }
                case 7: {
                    n14 = 80;
                    break;
                }
                case 8: {
                    n14 = 251;
                    break;
                }
                case 9: {
                    n14 = 145;
                    break;
                }
                case 10: {
                    n14 = 168;
                    break;
                }
                case 11: {
                    n14 = 23;
                    break;
                }
                case 12: {
                    n14 = 150;
                    break;
                }
                case 13: {
                    n14 = 187;
                    break;
                }
                case 14: {
                    n14 = 244;
                    break;
                }
                case 15: {
                    n14 = 11;
                    break;
                }
                case 16: {
                    n14 = 84;
                    break;
                }
                case 17: {
                    n14 = 87;
                    break;
                }
                case 18: {
                    n14 = 106;
                    break;
                }
                case 19: {
                    n14 = 246;
                    break;
                }
                case 20: {
                    n14 = 55;
                    break;
                }
                case 21: {
                    n14 = 248;
                    break;
                }
                case 22: {
                    n14 = 70;
                    break;
                }
                case 23: {
                    n14 = 172;
                    break;
                }
                case 24: {
                    n14 = 223;
                    break;
                }
                case 25: {
                    n14 = 17;
                    break;
                }
                case 26: {
                    n14 = 151;
                    break;
                }
                case 27: {
                    n14 = 21;
                    break;
                }
                case 28: {
                    n14 = 240;
                    break;
                }
                case 29: {
                    n14 = 156;
                    break;
                }
                case 30: {
                    n14 = 12;
                    break;
                }
                case 31: {
                    n14 = 169;
                    break;
                }
                case 32: {
                    n14 = 10;
                    break;
                }
                case 33: {
                    n14 = 62;
                    break;
                }
                case 34: {
                    n14 = 16;
                    break;
                }
                case 35: {
                    n14 = 122;
                    break;
                }
                case 36: {
                    n14 = 132;
                    break;
                }
                case 37: {
                    n14 = 146;
                    break;
                }
                case 38: {
                    n14 = 230;
                    break;
                }
                case 39: {
                    n14 = 222;
                    break;
                }
                case 40: {
                    n14 = 161;
                    break;
                }
                case 41: {
                    n14 = 60;
                    break;
                }
                case 42: {
                    n14 = 50;
                    break;
                }
                case 43: {
                    n14 = 144;
                    break;
                }
                case 44: {
                    n14 = 24;
                    break;
                }
                case 45: {
                    n14 = 255;
                    break;
                }
                case 46: {
                    n14 = 47;
                    break;
                }
                case 47: {
                    n14 = 176;
                    break;
                }
                case 48: {
                    n14 = 126;
                    break;
                }
                case 49: {
                    n14 = 180;
                    break;
                }
                case 50: {
                    n14 = 123;
                    break;
                }
                case 51: {
                    n14 = 191;
                    break;
                }
                case 52: {
                    n14 = 75;
                    break;
                }
                case 53: {
                    n14 = 52;
                    break;
                }
                case 54: {
                    n14 = 98;
                    break;
                }
                case 55: {
                    n14 = 217;
                    break;
                }
                case 56: {
                    n14 = 233;
                    break;
                }
                case 57: {
                    n14 = 138;
                    break;
                }
                case 58: {
                    n14 = 91;
                    break;
                }
                case 59: {
                    n14 = 6;
                    break;
                }
                case 60: {
                    n14 = 111;
                    break;
                }
                case 61: {
                    n14 = 179;
                    break;
                }
                case 62: {
                    n14 = 35;
                    break;
                }
                case 63: {
                    n14 = 92;
                    break;
                }
                case 64: {
                    n14 = 231;
                    break;
                }
                case 65: {
                    n14 = 250;
                    break;
                }
                case 66: {
                    n14 = 22;
                    break;
                }
                case 67: {
                    n14 = 178;
                    break;
                }
                case 68: {
                    n14 = 213;
                    break;
                }
                case 69: {
                    n14 = 119;
                    break;
                }
                case 70: {
                    n14 = 5;
                    break;
                }
                case 71: {
                    n14 = 74;
                    break;
                }
                case 72: {
                    n14 = 19;
                    break;
                }
                case 73: {
                    n14 = 149;
                    break;
                }
                case 74: {
                    n14 = 157;
                    break;
                }
                case 75: {
                    n14 = 45;
                    break;
                }
                case 76: {
                    n14 = 33;
                    break;
                }
                case 77: {
                    n14 = 128;
                    break;
                }
                case 78: {
                    n14 = 148;
                    break;
                }
                case 79: {
                    n14 = 97;
                    break;
                }
                case 80: {
                    n14 = 36;
                    break;
                }
                case 81: {
                    n14 = 124;
                    break;
                }
                case 82: {
                    n14 = 142;
                    break;
                }
                case 83: {
                    n14 = 164;
                    break;
                }
                case 84: {
                    n14 = 117;
                    break;
                }
                case 85: {
                    n14 = 200;
                    break;
                }
                case 86: {
                    n14 = 209;
                    break;
                }
                case 87: {
                    n14 = 139;
                    break;
                }
                case 88: {
                    n14 = 197;
                    break;
                }
                case 89: {
                    n14 = 147;
                    break;
                }
                case 90: {
                    n14 = 203;
                    break;
                }
                case 91: {
                    n14 = 43;
                    break;
                }
                case 92: {
                    n14 = 253;
                    break;
                }
                case 93: {
                    n14 = 175;
                    break;
                }
                case 94: {
                    n14 = 99;
                    break;
                }
                case 95: {
                    n14 = 212;
                    break;
                }
                case 96: {
                    n14 = 214;
                    break;
                }
                case 97: {
                    n14 = 89;
                    break;
                }
                case 98: {
                    n14 = 206;
                    break;
                }
                case 99: {
                    n14 = 185;
                    break;
                }
                case 100: {
                    n14 = 152;
                    break;
                }
                case 101: {
                    n14 = 254;
                    break;
                }
                case 102: {
                    n14 = 205;
                    break;
                }
                case 103: {
                    n14 = 137;
                    break;
                }
                case 104: {
                    n14 = 184;
                    break;
                }
                case 105: {
                    n14 = 40;
                    break;
                }
                case 106: {
                    n14 = 249;
                    break;
                }
                case 107: {
                    n14 = 37;
                    break;
                }
                case 108: {
                    n14 = 154;
                    break;
                }
                case 109: {
                    n14 = 29;
                    break;
                }
                case 110: {
                    n14 = 57;
                    break;
                }
                case 111: {
                    n14 = 198;
                    break;
                }
                case 112: {
                    n14 = 133;
                    break;
                }
                case 113: {
                    n14 = 104;
                    break;
                }
                case 114: {
                    n14 = 105;
                    break;
                }
                case 115: {
                    n14 = 20;
                    break;
                }
                case 116: {
                    n14 = 61;
                    break;
                }
                case 117: {
                    n14 = 25;
                    break;
                }
                case 118: {
                    n14 = 15;
                    break;
                }
                case 119: {
                    n14 = 85;
                    break;
                }
                case 120: {
                    n14 = 26;
                    break;
                }
                case 121: {
                    n14 = 192;
                    break;
                }
                case 122: {
                    n14 = 3;
                    break;
                }
                case 123: {
                    n14 = 51;
                    break;
                }
                case 124: {
                    n14 = 63;
                    break;
                }
                case 125: {
                    n14 = 66;
                    break;
                }
                case 126: {
                    n14 = 229;
                    break;
                }
                case 127: {
                    n14 = 158;
                    break;
                }
                case 128: {
                    n14 = 167;
                    break;
                }
                case 129: {
                    n14 = 72;
                    break;
                }
                case 130: {
                    n14 = 34;
                    break;
                }
                case 131: {
                    n14 = 202;
                    break;
                }
                case 132: {
                    n14 = 243;
                    break;
                }
                case 133: {
                    n14 = 67;
                    break;
                }
                case 134: {
                    n14 = 78;
                    break;
                }
                case 135: {
                    n14 = 199;
                    break;
                }
                case 136: {
                    n14 = 234;
                    break;
                }
                case 137: {
                    n14 = 76;
                    break;
                }
                case 138: {
                    n14 = 96;
                    break;
                }
                case 139: {
                    n14 = 69;
                    break;
                }
                case 140: {
                    n14 = 41;
                    break;
                }
                case 141: {
                    n14 = 116;
                    break;
                }
                case 142: {
                    n14 = 8;
                    break;
                }
                case 143: {
                    n14 = 27;
                    break;
                }
                case 144: {
                    n14 = 58;
                    break;
                }
                case 145: {
                    n14 = 39;
                    break;
                }
                case 146: {
                    n14 = 83;
                    break;
                }
                case 147: {
                    n14 = 239;
                    break;
                }
                case 148: {
                    n14 = 159;
                    break;
                }
                case 149: {
                    n14 = 155;
                    break;
                }
                case 150: {
                    n14 = 18;
                    break;
                }
                case 151: {
                    n14 = 215;
                    break;
                }
                case 152: {
                    n14 = 1;
                    break;
                }
                case 153: {
                    n14 = 143;
                    break;
                }
                case 154: {
                    n14 = 210;
                    break;
                }
                case 155: {
                    n14 = 177;
                    break;
                }
                case 156: {
                    n14 = 221;
                    break;
                }
                case 157: {
                    n14 = 195;
                    break;
                }
                case 158: {
                    n14 = 232;
                    break;
                }
                case 159: {
                    n14 = 181;
                    break;
                }
                case 160: {
                    n14 = 120;
                    break;
                }
                case 161: {
                    n14 = 2;
                    break;
                }
                case 162: {
                    n14 = 186;
                    break;
                }
                case 163: {
                    n14 = 109;
                    break;
                }
                case 164: {
                    n14 = 71;
                    break;
                }
                case 165: {
                    n14 = 226;
                    break;
                }
                case 166: {
                    n14 = 208;
                    break;
                }
                case 167: {
                    n14 = 114;
                    break;
                }
                case 168: {
                    n14 = 79;
                    break;
                }
                case 169: {
                    n14 = 237;
                    break;
                }
                case 170: {
                    n14 = 130;
                    break;
                }
                case 171: {
                    n14 = 38;
                    break;
                }
                case 172: {
                    n14 = 115;
                    break;
                }
                case 173: {
                    n14 = 46;
                    break;
                }
                case 174: {
                    n14 = 190;
                    break;
                }
                case 175: {
                    n14 = 113;
                    break;
                }
                case 176: {
                    n14 = 53;
                    break;
                }
                case 177: {
                    n14 = 228;
                    break;
                }
                case 178: {
                    n14 = 131;
                    break;
                }
                case 179: {
                    n14 = 211;
                    break;
                }
                case 180: {
                    n14 = 242;
                    break;
                }
                case 181: {
                    n14 = 100;
                    break;
                }
                case 182: {
                    n14 = 59;
                    break;
                }
                case 183: {
                    n14 = 182;
                    break;
                }
                case 184: {
                    n14 = 9;
                    break;
                }
                case 185: {
                    n14 = 219;
                    break;
                }
                case 186: {
                    n14 = 107;
                    break;
                }
                case 187: {
                    n14 = 247;
                    break;
                }
                case 188: {
                    n14 = 136;
                    break;
                }
                case 189: {
                    n14 = 94;
                    break;
                }
                case 190: {
                    n14 = 86;
                    break;
                }
                case 191: {
                    n14 = 44;
                    break;
                }
                case 192: {
                    n14 = 77;
                    break;
                }
                case 193: {
                    n14 = 224;
                    break;
                }
                case 194: {
                    n14 = 48;
                    break;
                }
                case 195: {
                    n14 = 227;
                    break;
                }
                case 196: {
                    n14 = 183;
                    break;
                }
                case 197: {
                    n14 = 235;
                    break;
                }
                case 198: {
                    n14 = 194;
                    break;
                }
                case 199: {
                    n14 = 153;
                    break;
                }
                case 200: {
                    n14 = 82;
                    break;
                }
                case 201: {
                    n14 = 252;
                    break;
                }
                case 202: {
                    n14 = 102;
                    break;
                }
                case 203: {
                    n14 = 68;
                    break;
                }
                case 204: {
                    n14 = 54;
                    break;
                }
                case 205: {
                    n14 = 173;
                    break;
                }
                case 206: {
                    n14 = 204;
                    break;
                }
                case 207: {
                    n14 = 238;
                    break;
                }
                case 208: {
                    n14 = 103;
                    break;
                }
                case 209: {
                    n14 = 93;
                    break;
                }
                case 210: {
                    n14 = 65;
                    break;
                }
                case 211: {
                    n14 = 90;
                    break;
                }
                case 212: {
                    n14 = 4;
                    break;
                }
                case 213: {
                    n14 = 125;
                    break;
                }
                case 214: {
                    n14 = 141;
                    break;
                }
                case 215: {
                    n14 = 188;
                    break;
                }
                case 216: {
                    n14 = 101;
                    break;
                }
                case 217: {
                    n14 = 216;
                    break;
                }
                case 218: {
                    n14 = 81;
                    break;
                }
                case 219: {
                    n14 = 108;
                    break;
                }
                case 220: {
                    n14 = 207;
                    break;
                }
                case 221: {
                    n14 = 64;
                    break;
                }
                case 222: {
                    n14 = 189;
                    break;
                }
                case 223: {
                    n14 = 171;
                    break;
                }
                case 224: {
                    n14 = 135;
                    break;
                }
                case 225: {
                    n14 = 196;
                    break;
                }
                case 226: {
                    n14 = 174;
                    break;
                }
                case 227: {
                    n14 = 13;
                    break;
                }
                case 228: {
                    n14 = 49;
                    break;
                }
                case 229: {
                    n14 = 121;
                    break;
                }
                case 230: {
                    n14 = 118;
                    break;
                }
                case 231: {
                    n14 = 201;
                    break;
                }
                case 232: {
                    n14 = 56;
                    break;
                }
                case 233: {
                    n14 = 7;
                    break;
                }
                case 234: {
                    n14 = 112;
                    break;
                }
                case 235: {
                    n14 = 127;
                    break;
                }
                case 236: {
                    n14 = 163;
                    break;
                }
                case 237: {
                    n14 = 129;
                    break;
                }
                case 238: {
                    n14 = 220;
                    break;
                }
                case 239: {
                    n14 = 73;
                    break;
                }
                case 240: {
                    n14 = 165;
                    break;
                }
                case 241: {
                    n14 = 134;
                    break;
                }
                case 242: {
                    n14 = 170;
                    break;
                }
                case 243: {
                    n14 = 14;
                    break;
                }
                case 244: {
                    n14 = 162;
                    break;
                }
                case 245: {
                    n14 = 236;
                    break;
                }
                case 246: {
                    n14 = 193;
                    break;
                }
                case 247: {
                    n14 = 28;
                    break;
                }
                case 248: {
                    n14 = 31;
                    break;
                }
                case 249: {
                    n14 = 110;
                    break;
                }
                case 250: {
                    n14 = 32;
                    break;
                }
                case 251: {
                    n14 = 30;
                    break;
                }
                case 252: {
                    n14 = 95;
                    break;
                }
                case 253: {
                    n14 = 218;
                    break;
                }
                case 254: {
                    n14 = 140;
                    break;
                }
                default: {
                    n14 = 166;
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
            nc_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6255;
        if (f[n11] == null) {
            nc_0.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x1ACD) & Short.MAX_VALUE;
        if (h[n11] == null) {
            nc_0.h[n11] = g[n11] ^ l2;
        }
        return h[n11];
    }
}

