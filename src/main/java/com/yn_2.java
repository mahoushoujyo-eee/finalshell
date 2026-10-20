/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.GU;
import com.GV;
import com.IG;
import com.O0;
import com.P7;
import com.X4;
import com.en_0;
import com.ep_2;
import com.ev_2;
import com.ge_0;
import com.hf_0;
import com.hi_0;
import com.ks_0;
import com.n_0;
import com.ni_2;
import com.o1_0;
import com.oc_0;
import com.ok_0;
import com.ph_2;
import com.u9;
import com.uK;
import com.uy_0;
import com.xm_1;
import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.yn
 */
public class yn_2
implements Closeable {
    public final Object R;
    public final o1_0 v;
    protected IG x;
    private static final Set g;
    private String W;
    private DateFormat l;
    public final P7 N;
    protected xm_1 C;
    private xm_1[] u;
    private int M;
    private List e;
    public int D;
    private List T;
    private List H;
    protected ni_2 t;
    private int L;
    private String[] d;
    private static boolean j;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] f;

    public String m() {
        return this.W;
    }

    public DateFormat r() {
        DateFormat dateFormat;
        block4: {
            block5: {
                boolean bl = yn_2.o();
                try {
                    try {
                        dateFormat = this.l;
                        if (bl) break block4;
                        if (dateFormat != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    this.l = new SimpleDateFormat(this.W, this.N.w());
                    this.l.setTimeZone(this.N.t());
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            dateFormat = this.l;
        }
        return dateFormat;
    }

    public void B(String string) {
        this.W = string;
        this.l = null;
    }

    public void F(DateFormat dateFormat) {
        this.Q(dateFormat);
    }

    public void Q(DateFormat dateFormat) {
        this.l = dateFormat;
    }

    public yn_2(String string) {
        this(string, IG.G(), ok_0.h);
    }

    public yn_2(String string, IG iG) {
        this((Object)string, new uy_0(string, ok_0.h), iG);
    }

    public yn_2(String string, IG iG, int n10) {
        this((Object)string, new uy_0(string, n10), iG);
    }

    public yn_2(char[] cArray, int n10, IG iG, int n11) {
        this(cArray, new uy_0(cArray, n10, n11), iG);
    }

    public yn_2(P7 p7) {
        this(p7, IG.G());
    }

    public yn_2(P7 p7, IG iG) {
        this(null, p7, iG);
    }

    /*
     * Unable to fully structure code
     */
    public yn_2(Object var1_1, P7 var2_2, IG var3_3) {
        block16: {
            block17: {
                block14: {
                    super();
                    this.W = ok_0.z;
                    this.M = 0;
                    this.D = 0;
                    this.T = null;
                    this.H = null;
                    this.t = null;
                    this.L = 0;
                    this.d = null;
                    this.N = var2_2;
                    var4_4 = yn_2.Y();
                    this.R = var1_1;
                    this.x = var3_3;
                    this.v = var3_3.q;
                    var5_5 = var2_2.w();
                    try {
                        try {
                            block15: {
                                try {
                                    try {
                                        v0 = var5_5;
                                        v1 = yn_2.a(13317, 5213054471498907856L);
                                        if (!var4_4) break block14;
                                        if (v0 != v1) break block15;
                                    }
                                    catch (hi_0 v2) {
                                        throw yn_2.a(v2);
                                    }
                                    var2_2.C();
                                    ((u9)var2_2).Y = yn_2.a(22010, 3599622197168349485L);
                                    if (var4_4) break block16;
                                }
                                catch (hi_0 v3) {
                                    throw yn_2.a(v3);
                                }
                            }
                            v0 = var5_5;
                            if (!var4_4) break block17;
                        }
                        catch (hi_0 v4) {
                            throw yn_2.a(v4);
                        }
                        v1 = yn_2.a(6712, 7785774780551655108L);
                    }
                    catch (hi_0 v5) {
                        throw yn_2.a(v5);
                    }
                }
                try {
                    if (v0 == v1) {
                        v0 = var2_2.C();
                    }
                    ** GOTO lbl56
                }
                catch (hi_0 v6) {
                    throw yn_2.a(v6);
                }
            }
            try {
                ((u9)var2_2).Y = yn_2.a(3888, 1489643710627740636L);
                if (var4_4) break block16;
lbl56:
                // 2 sources

                var2_2.K();
            }
            catch (hi_0 v7) {
                throw yn_2.a(v7);
            }
        }
    }

    public o1_0 K() {
        return this.v;
    }

    public String Z() {
        Object object;
        block4: {
            block5: {
                boolean bl = yn_2.o();
                try {
                    try {
                        object = this.R;
                        if (bl) break block4;
                        if (!(object instanceof char[])) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    return new String((char[])this.R);
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            object = this.R;
        }
        return object.toString();
    }

    /*
     * Exception decompiling
     */
    public final Object B(Map var1_1, Object var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [379[DOLOOP]], but top level block is 69[TRYBLOCK]
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

    public IG L() {
        return this.x;
    }

    public void H(IG iG) {
        this.x = iG;
    }

    public Object M(Class clazz) {
        return this.r(clazz, null);
    }

    public Object o(Type type) {
        return this.r(type, null);
    }

    /*
     * Loose catch block
     */
    public Object r(Type type, Object object) {
        boolean bl;
        block26: {
            Class clazz;
            Type type2;
            block27: {
                block28: {
                    int n10;
                    int n11;
                    block24: {
                        int n12;
                        block25: {
                            n12 = this.N.P();
                            bl = yn_2.Y();
                            n11 = n12;
                            n10 = yn_2.a(14167, 3534403949201376138L);
                            if (!bl) break block24;
                            try {
                                block33: {
                                    if (n11 != n10) break block25;
                                    break block33;
                                    catch (hi_0 hi_02) {
                                        throw yn_2.a(hi_02);
                                    }
                                }
                                this.N.K();
                                return B8.Q(type);
                            }
                            catch (hi_0 hi_03) {
                                throw yn_2.a(hi_03);
                            }
                        }
                        n11 = n12;
                        n10 = 4;
                    }
                    if (n11 != n10) break block26;
                    try {
                        block34: {
                            type2 = type;
                            clazz = byte[].class;
                            if (!bl) break block27;
                            break block34;
                            catch (hi_0 hi_04) {
                                throw yn_2.a(hi_04);
                            }
                        }
                        if (type2 != clazz) break block28;
                    }
                    catch (hi_0 hi_05) {
                        throw yn_2.a(hi_05);
                    }
                    byte[] byArray = this.N.e();
                    this.N.K();
                    return byArray;
                }
                type2 = type;
                clazz = char[].class;
            }
            if (type2 == clazz) {
                String string = this.N.z();
                this.N.K();
                return string.toCharArray();
            }
        }
        X4 x42 = this.x.h(type);
        try {
            Object object2;
            block29: {
                block30: {
                    Object object3;
                    block31: {
                        block32: {
                            block38: {
                                block37: {
                                    block36: {
                                        block35: {
                                            object2 = x42.getClass();
                                            if (!bl) break block29;
                                            if (object2 != ep_2.class) break block30;
                                            break block35;
                                            catch (hi_0 hi_06) {
                                                throw yn_2.a(hi_06);
                                            }
                                        }
                                        object3 = this.N;
                                        if (!bl) break block31;
                                        break block36;
                                        catch (hi_0 hi_07) {
                                            throw yn_2.a(hi_07);
                                        }
                                    }
                                    if (object3.P() == yn_2.a(219, 4572262095367762982L)) break block32;
                                    break block37;
                                    catch (hi_0 hi_08) {
                                        throw yn_2.a(hi_08);
                                    }
                                }
                                object3 = this.N;
                                if (!bl) break block31;
                                break block38;
                                catch (hi_0 hi_09) {
                                    throw yn_2.a(hi_09);
                                }
                            }
                            try {
                                block39: {
                                    if (object3.P() == yn_2.a(14772, 8104049313086917965L)) break block32;
                                    break block39;
                                    catch (hi_0 hi_010) {
                                        throw yn_2.a(hi_010);
                                    }
                                }
                                throw new hi_0(yn_2.a(-32551, -7327) + this.N.B());
                            }
                            catch (hi_0 hi_011) {
                                throw yn_2.a(hi_011);
                            }
                        }
                        object3 = ((ep_2)x42).m(this, type, object, 0);
                    }
                    return object3;
                }
                object2 = x42.z(this, type, object);
            }
            return object2;
        }
        catch (hi_0 hi_012) {
            throw hi_012;
        }
        catch (Throwable throwable) {
            throw new hi_0(throwable.getMessage(), throwable);
        }
    }

    public List v(Class clazz) {
        ArrayList arrayList = new ArrayList();
        this.s(clazz, arrayList);
        return arrayList;
    }

    public void s(Class clazz, Collection collection) {
        this.p(clazz, collection);
    }

    public void p(Type type, Collection collection) {
        this.t(type, collection, null);
    }

    /*
     * Exception decompiling
     */
    public void t(Type var1_1, Collection var2_2, Object var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [50[DOLOOP]], but top level block is 8[TRYBLOCK]
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
     * Could not resolve type clashes
     */
    public Object[] h(Type[] var1_1) {
        block133: {
            block107: {
                block103: {
                    block104: {
                        block105: {
                            block106: {
                                block102: {
                                    block100: {
                                        block101: {
                                            var2_2 = yn_2.Y();
                                            try {
                                                try {
                                                    v0 = this.N.P();
                                                    v1 = yn_2.a(24890, 4742328868287911400L);
                                                    if (!var2_2) break block100;
                                                    if (v0 != v1) break block101;
                                                }
                                                catch (hi_0 v2) {
                                                    throw yn_2.a(v2);
                                                }
                                                this.N.S(yn_2.a(8282, 1514134914315867307L));
                                                return null;
                                            }
                                            catch (hi_0 v3) {
                                                throw yn_2.a(v3);
                                            }
                                        }
                                        try {
                                            v0 = this.N.P();
                                            if (!var2_2) break block102;
                                            v1 = yn_2.a(14772, 8104049313086917965L);
                                        }
                                        catch (hi_0 v4) {
                                            throw yn_2.a(v4);
                                        }
                                    }
                                    try {
                                        if (v0 != v1) {
                                            throw new hi_0(yn_2.a(-32567, -5504) + this.N.B());
                                        }
                                    }
                                    catch (hi_0 v5) {
                                        throw yn_2.a(v5);
                                    }
                                    v0 = var1_1.length;
                                }
                                var3_3 = new Object[v0];
                                try {
                                    try {
                                        try {
                                            try {
                                                v6 = var1_1.length;
                                                if (!var2_2) break block103;
                                                if (v6 != 0) break block104;
                                            }
                                            catch (hi_0 v7) {
                                                throw yn_2.a(v7);
                                            }
                                            this.N.S(yn_2.a(7910, 1402499337094982199L));
                                            v8 = this.N.P();
                                            if (!var2_2) break block105;
                                        }
                                        catch (hi_0 v9) {
                                            throw yn_2.a(v9);
                                        }
                                        if (v8 == yn_2.a(22511, 2540847392978117415L)) break block106;
                                    }
                                    catch (hi_0 v10) {
                                        throw yn_2.a(v10);
                                    }
                                    throw new hi_0(yn_2.a(-32552, -30651));
                                }
                                catch (hi_0 v11) {
                                    throw yn_2.a(v11);
                                }
                            }
                            this.N.S(yn_2.a(30037, 3211048488765522317L));
                            v8 = 0;
                        }
                        return new Object[v8];
                    }
                    this.N.S(2);
                    v6 = var4_4 = 0;
                }
                while (var4_4 < var1_1.length) {
                    block132: {
                        block129: {
                            block130: {
                                block127: {
                                    block112: {
                                        block123: {
                                            block124: {
                                                block125: {
                                                    block122: {
                                                        block116: {
                                                            block119: {
                                                                block121: {
                                                                    block118: {
                                                                        block117: {
                                                                            block115: {
                                                                                block113: {
                                                                                    block114: {
                                                                                        block110: {
                                                                                            block111: {
                                                                                                block109: {
                                                                                                    block108: {
                                                                                                        try {
                                                                                                            v12 = this.N.P();
                                                                                                            v13 = yn_2.a(14167, 3534403949201376138L);
                                                                                                            if (!var2_2) break block107;
                                                                                                            if (v12 != v13) break block108;
                                                                                                        }
                                                                                                        catch (hi_0 v14) {
                                                                                                            throw yn_2.a(v14);
                                                                                                        }
                                                                                                        var5_5 = null;
                                                                                                        this.N.S(yn_2.a(30037, 3211048488765522317L));
                                                                                                        if (var2_2) break block112;
                                                                                                    }
                                                                                                    var6_6 = var1_1[var4_4];
                                                                                                    try {
                                                                                                        try {
                                                                                                            v15 = var6_6;
                                                                                                            v16 /* !! */  = Integer.TYPE;
                                                                                                            if (!var2_2) break block109;
                                                                                                            if (v15 != v16 /* !! */ ) {
                                                                                                            }
                                                                                                            ** GOTO lbl104
                                                                                                        }
                                                                                                        catch (hi_0 v17) {
                                                                                                            throw yn_2.a(v17);
                                                                                                        }
                                                                                                        v15 = var6_6;
                                                                                                        v16 /* !! */  = Integer.class;
                                                                                                    }
                                                                                                    catch (hi_0 v18) {
                                                                                                        throw yn_2.a(v18);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (!var2_2) break block110;
                                                                                                            if (v15 == v16 /* !! */ ) {
                                                                                                            }
                                                                                                            ** GOTO lbl127
                                                                                                        }
                                                                                                        catch (hi_0 v19) {
                                                                                                            throw yn_2.a(v19);
                                                                                                        }
lbl104:
                                                                                                        // 2 sources

                                                                                                        v20 = this.N;
                                                                                                        if (!var2_2) break block111;
                                                                                                    }
                                                                                                    catch (hi_0 v21) {
                                                                                                        throw yn_2.a(v21);
                                                                                                    }
                                                                                                    if (v20.P() == 2) {
                                                                                                    }
                                                                                                    ** GOTO lbl118
                                                                                                }
                                                                                                catch (hi_0 v22) {
                                                                                                    throw yn_2.a(v22);
                                                                                                }
                                                                                                var5_5 = this.N.G();
                                                                                                try {
                                                                                                    this.N.S(yn_2.a(30037, 3211048488765522317L));
                                                                                                    if (var2_2) break block112;
lbl118:
                                                                                                    // 2 sources

                                                                                                    v20 = this.M();
                                                                                                }
                                                                                                catch (hi_0 v23) {
                                                                                                    throw yn_2.a(v23);
                                                                                                }
                                                                                            }
                                                                                            var5_5 = v20;
                                                                                            var5_5 = B8.I(var5_5, var6_6, this.x);
                                                                                            try {
                                                                                                if (var2_2) break block112;
lbl127:
                                                                                                // 2 sources

                                                                                                v15 = var6_6;
                                                                                                v16 /* !! */  = String.class;
                                                                                            }
                                                                                            catch (hi_0 v24) {
                                                                                                throw yn_2.a(v24);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (v15 != v16 /* !! */ ) break block113;
                                                                                                v25 = this.N;
                                                                                                if (!var2_2) break block114;
                                                                                            }
                                                                                            catch (hi_0 v26) {
                                                                                                throw yn_2.a(v26);
                                                                                            }
                                                                                            if (v25.P() == 4) {
                                                                                            }
                                                                                            ** GOTO lbl150
                                                                                        }
                                                                                        catch (hi_0 v27) {
                                                                                            throw yn_2.a(v27);
                                                                                        }
                                                                                        var5_5 = this.N.z();
                                                                                        try {
                                                                                            this.N.S(yn_2.a(30037, 3211048488765522317L));
                                                                                            if (var2_2) break block112;
lbl150:
                                                                                            // 2 sources

                                                                                            v25 = this.M();
                                                                                        }
                                                                                        catch (hi_0 v28) {
                                                                                            throw yn_2.a(v28);
                                                                                        }
                                                                                    }
                                                                                    var5_5 = v25;
                                                                                    var5_5 = B8.I(var5_5, var6_6, this.x);
                                                                                    if (var2_2) break block112;
                                                                                }
                                                                                var7_7 = 0;
                                                                                var8_8 = null;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v29 = var4_4;
                                                                                            if (!var2_2) break block115;
                                                                                            if (v29 != var1_1.length - 1) break block116;
                                                                                        }
                                                                                        catch (hi_0 v30) {
                                                                                            throw yn_2.a(v30);
                                                                                        }
                                                                                        v31 = var6_6;
                                                                                        if (!var2_2) break block117;
                                                                                    }
                                                                                    catch (hi_0 v32) {
                                                                                        throw yn_2.a(v32);
                                                                                    }
                                                                                    v29 = v31 instanceof Class;
                                                                                }
                                                                                catch (hi_0 v33) {
                                                                                    throw yn_2.a(v33);
                                                                                }
                                                                            }
                                                                            if (v29 == 0) break block116;
                                                                            v31 = var6_6;
                                                                        }
                                                                        var9_9 = (Class<?>)v31;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v34 = var9_9;
                                                                                    v35 /* !! */  = byte[].class;
                                                                                    if (!var2_2) break block118;
                                                                                    if (v34 != v35 /* !! */ ) {
                                                                                    }
                                                                                    ** GOTO lbl209
                                                                                }
                                                                                catch (hi_0 v36) {
                                                                                    throw yn_2.a(v36);
                                                                                }
                                                                                v34 = var9_9;
                                                                                if (!var2_2) break block119;
                                                                            }
                                                                            catch (hi_0 v37) {
                                                                                throw yn_2.a(v37);
                                                                            }
                                                                            v35 /* !! */  = char[].class;
                                                                        }
                                                                        catch (hi_0 v38) {
                                                                            throw yn_2.a(v38);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block120: {
                                                                            try {
                                                                                try {
                                                                                    if (v34 != v35 /* !! */ ) break block120;
lbl209:
                                                                                    // 2 sources

                                                                                    v39 = this.N.P();
                                                                                    if (!var2_2) break block121;
                                                                                }
                                                                                catch (hi_0 v40) {
                                                                                    throw yn_2.a(v40);
                                                                                }
                                                                                if (v39 == 4) break block116;
                                                                            }
                                                                            catch (hi_0 v41) {
                                                                                throw yn_2.a(v41);
                                                                            }
                                                                        }
                                                                        v39 = (int)var9_9.isArray();
                                                                    }
                                                                    catch (hi_0 v42) {
                                                                        throw yn_2.a(v42);
                                                                    }
                                                                }
                                                                var7_7 = v39;
                                                                v34 = var9_9.getComponentType();
                                                            }
                                                            var8_8 = v34;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    v43 = var7_7;
                                                                    if (!var2_2) break block122;
                                                                    if (v43 != 0) {
                                                                    }
                                                                    ** GOTO lbl291
                                                                }
                                                                catch (hi_0 v44) {
                                                                    throw yn_2.a(v44);
                                                                }
                                                                v45 = this;
                                                                if (!var2_2) break block123;
                                                            }
                                                            catch (hi_0 v46) {
                                                                throw yn_2.a(v46);
                                                            }
                                                            v43 = v45.N.P();
                                                        }
                                                        catch (hi_0 v47) {
                                                            throw yn_2.a(v47);
                                                        }
                                                    }
                                                    if (v43 == yn_2.a(14772, 8104049313086917965L)) ** GOTO lbl291
                                                    var9_9 = new ArrayList<Object>();
                                                    var10_10 = this.x.h(var8_8);
                                                    var11_11 = var10_10.j();
                                                    try {
                                                        v48 = this.N;
                                                        if (!var2_2) break block124;
                                                        if (v48.P() == yn_2.a(22511, 2540847392978117415L)) break block125;
                                                    }
                                                    catch (hi_0 v49) {
                                                        throw yn_2.a(v49);
                                                    }
                                                    do {
                                                        block126: {
                                                            var12_12 = var10_10.z(this, var6_6, null);
                                                            var9_9.add(var12_12);
                                                            if (this.N.P() != yn_2.a(30037, 3211048488765522317L)) ** GOTO lbl274
                                                            try {
                                                                try {
                                                                    try {
                                                                        this.N.S(var11_11);
                                                                        if (!var2_2) break block126;
                                                                        if (var2_2) continue;
                                                                    }
                                                                    catch (hi_0 v50) {
                                                                        throw yn_2.a(v50);
                                                                    }
lbl274:
                                                                    // 2 sources

                                                                    if (this.N.P() != yn_2.a(22511, 2540847392978117415L)) break block126;
                                                                }
                                                                catch (hi_0 v51) {
                                                                    throw yn_2.a(v51);
                                                                }
                                                                if (var2_2) break;
                                                            }
                                                            catch (hi_0 v52) {
                                                                throw yn_2.a(v52);
                                                            }
                                                        }
                                                        throw new hi_0(yn_2.a(-32525, 725) + ge_0.g(this.N.P()));
                                                    } while (var2_2);
                                                }
                                                v48 = B8.I(var9_9, var6_6, this.x);
                                            }
                                            var5_5 = v48;
                                            try {
                                                if (var2_2) break block112;
lbl291:
                                                // 3 sources

                                                v45 = this;
                                            }
                                            catch (hi_0 v53) {
                                                throw yn_2.a(v53);
                                            }
                                        }
                                        var9_9 = v45.x.h(var6_6);
                                        var5_5 = var9_9.z(this, var6_6, var4_4);
                                    }
                                    try {
                                        block128: {
                                            try {
                                                try {
                                                    var3_3[var4_4] = var5_5;
                                                    v54 = this.N.P();
                                                    v55 = yn_2.a(22511, 2540847392978117415L);
                                                    if (!var2_2) break block127;
                                                    if (v54 != v55) break block128;
                                                }
                                                catch (hi_0 v56) {
                                                    throw yn_2.a(v56);
                                                }
                                                if (var2_2) break;
                                            }
                                            catch (hi_0 v57) {
                                                throw yn_2.a(v57);
                                            }
                                        }
                                        v54 = this.N.P();
                                        v55 = yn_2.a(30037, 3211048488765522317L);
                                    }
                                    catch (hi_0 v58) {
                                        throw yn_2.a(v58);
                                    }
                                }
                                try {
                                    try {
                                        if (!var2_2) break block129;
                                        if (v54 == v55) break block130;
                                    }
                                    catch (hi_0 v59) {
                                        throw yn_2.a(v59);
                                    }
                                    throw new hi_0(yn_2.a(-32540, 5484) + ge_0.g(this.N.P()));
                                }
                                catch (hi_0 v60) {
                                    throw yn_2.a(v60);
                                }
                            }
                            v54 = var4_4;
                            v55 = var1_1.length - 1;
                        }
                        try {
                            block131: {
                                try {
                                    if (v54 != v55) break block131;
                                    this.N.S(yn_2.a(22511, 2540847392978117415L));
                                    if (var2_2) break block132;
                                }
                                catch (hi_0 v61) {
                                    throw yn_2.a(v61);
                                }
                            }
                            this.N.S(2);
                        }
                        catch (hi_0 v62) {
                            throw yn_2.a(v62);
                        }
                    }
                    ++var4_4;
                    if (var2_2) continue;
                }
                try {
                    v63 = this.N;
                    if (!var2_2) break block133;
                    v12 = v63.P();
                    v13 = yn_2.a(22511, 2540847392978117415L);
                }
                catch (hi_0 v64) {
                    throw yn_2.a(v64);
                }
            }
            try {
                if (v12 != v13) {
                    throw new hi_0(yn_2.a(-32518, 8199));
                }
            }
            catch (hi_0 v65) {
                throw yn_2.a(v65);
            }
            v63 = this.N;
        }
        v63.S(yn_2.a(30037, 3211048488765522317L));
        return var3_3;
    }

    /*
     * Exception decompiling
     */
    public void v(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [59[DOLOOP]], but top level block is 6[TRYBLOCK]
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

    public Object I(Type type) {
        block49: {
            Type type2;
            Object object;
            Type type3;
            block48: {
                boolean bl;
                Type type4;
                block44: {
                    boolean bl2;
                    block45: {
                        Object object2;
                        block46: {
                            block47: {
                                block38: {
                                    block39: {
                                        Type type5;
                                        block41: {
                                            block43: {
                                                Object object3;
                                                block42: {
                                                    int n10;
                                                    block40: {
                                                        block36: {
                                                            block37: {
                                                                Type[] typeArray;
                                                                block34: {
                                                                    Type[] typeArray2;
                                                                    block35: {
                                                                        block33: {
                                                                            P7 p7;
                                                                            block32: {
                                                                                bl2 = yn_2.o();
                                                                                try {
                                                                                    try {
                                                                                        p7 = this.N;
                                                                                        if (bl2) break block32;
                                                                                        if (p7.P() != yn_2.a(14167, 3534403949201376138L)) break block33;
                                                                                    }
                                                                                    catch (hi_0 hi_02) {
                                                                                        throw yn_2.a(hi_02);
                                                                                    }
                                                                                    p7 = this.N;
                                                                                }
                                                                                catch (hi_0 hi_03) {
                                                                                    throw yn_2.a(hi_03);
                                                                                }
                                                                            }
                                                                            p7.K();
                                                                            return null;
                                                                        }
                                                                        typeArray2 = ((ParameterizedType)type).getActualTypeArguments();
                                                                        try {
                                                                            try {
                                                                                typeArray = typeArray2;
                                                                                if (bl2) break block34;
                                                                                if (typeArray.length == 1) break block35;
                                                                            }
                                                                            catch (hi_0 hi_04) {
                                                                                throw yn_2.a(hi_04);
                                                                            }
                                                                            throw new hi_0(yn_2.a(-32568, -14762) + type);
                                                                        }
                                                                        catch (hi_0 hi_05) {
                                                                            throw yn_2.a(hi_05);
                                                                        }
                                                                    }
                                                                    typeArray = typeArray2;
                                                                }
                                                                type4 = typeArray[0];
                                                                try {
                                                                    bl = type4 instanceof Class;
                                                                    if (bl2) break block36;
                                                                    if (!bl) break block37;
                                                                }
                                                                catch (hi_0 hi_06) {
                                                                    throw yn_2.a(hi_06);
                                                                }
                                                                ArrayList arrayList = new ArrayList();
                                                                this.s((Class)type4, arrayList);
                                                                return arrayList;
                                                            }
                                                            bl = type4 instanceof WildcardType;
                                                        }
                                                        try {
                                                            if (bl2) break block38;
                                                            if (!bl) break block39;
                                                        }
                                                        catch (hi_0 hi_07) {
                                                            throw yn_2.a(hi_07);
                                                        }
                                                        WildcardType wildcardType = (WildcardType)type4;
                                                        type5 = wildcardType.getUpperBounds()[0];
                                                        try {
                                                            try {
                                                                try {
                                                                    n10 = Object.class.equals((Object)type5);
                                                                    if (bl2) break block40;
                                                                    if (n10 == 0) break block41;
                                                                }
                                                                catch (hi_0 hi_08) {
                                                                    throw yn_2.a(hi_08);
                                                                }
                                                                object3 = wildcardType.getLowerBounds();
                                                                if (bl2) break block42;
                                                            }
                                                            catch (hi_0 hi_09) {
                                                                throw yn_2.a(hi_09);
                                                            }
                                                            n10 = ((Type[])object3).length;
                                                        }
                                                        catch (hi_0 hi_010) {
                                                            throw yn_2.a(hi_010);
                                                        }
                                                    }
                                                    try {
                                                        if (n10 != 0) break block43;
                                                        object3 = this.M();
                                                    }
                                                    catch (hi_0 hi_011) {
                                                        throw yn_2.a(hi_011);
                                                    }
                                                }
                                                return object3;
                                            }
                                            throw new hi_0(yn_2.a(-32517, 11999) + type);
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        this.s((Class)type5, arrayList);
                                        return arrayList;
                                    }
                                    bl = type4 instanceof TypeVariable;
                                }
                                try {
                                    if (bl2) break block44;
                                    if (!bl) break block45;
                                }
                                catch (hi_0 hi_012) {
                                    throw yn_2.a(hi_012);
                                }
                                type3 = (TypeVariable)type4;
                                object = type3.getBounds();
                                try {
                                    try {
                                        object2 = object;
                                        if (bl2) break block46;
                                        if (((Type[])object2).length == 1) break block47;
                                    }
                                    catch (hi_0 hi_013) {
                                        throw yn_2.a(hi_013);
                                    }
                                    throw new hi_0(yn_2.a(-32515, -6774) + type3);
                                }
                                catch (hi_0 hi_014) {
                                    throw yn_2.a(hi_014);
                                }
                            }
                            object2 = object;
                        }
                        Type type6 = object2[0];
                        try {
                            bl = type6 instanceof Class;
                            if (bl2) break block44;
                            if (!bl) break block45;
                        }
                        catch (hi_0 hi_015) {
                            throw yn_2.a(hi_015);
                        }
                        ArrayList arrayList = new ArrayList();
                        this.s((Class)type6, arrayList);
                        return arrayList;
                    }
                    try {
                        type2 = type4;
                        if (bl2) break block48;
                        bl = type2 instanceof ParameterizedType;
                    }
                    catch (hi_0 hi_016) {
                        throw yn_2.a(hi_016);
                    }
                }
                if (!bl) break block49;
                type2 = type4;
            }
            type3 = (ParameterizedType)type2;
            object = new ArrayList();
            this.p(type3, (Collection)object);
            return object;
        }
        throw new hi_0(yn_2.a(-32550, -31846) + type);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void N(String string) {
        P7 p7;
        boolean bl;
        block17: {
            int n10;
            P7 p72;
            block16: {
                block14: {
                    block15: {
                        boolean bl2 = yn_2.o();
                        p72 = this.N;
                        p72.Z();
                        bl = bl2;
                        try {
                            try {
                                n10 = p72.P();
                                if (bl) break block14;
                                if (n10 == 4) break block15;
                                throw new hi_0(yn_2.a(-32565, 17454));
                            }
                            catch (hi_0 hi_02) {
                                throw yn_2.a(hi_02);
                            }
                        }
                        catch (hi_0 hi_03) {
                            throw yn_2.a(hi_03);
                        }
                    }
                    n10 = string.equals(p72.z()) ? 1 : 0;
                }
                try {
                    try {
                        try {
                            if (bl) break block16;
                            if (n10 == 0) throw new hi_0(yn_2.a(-32542, -18345));
                        }
                        catch (hi_0 hi_04) {
                            throw yn_2.a(hi_04);
                        }
                        p72.K();
                        p7 = p72;
                        if (bl) break block17;
                    }
                    catch (hi_0 hi_05) {
                        throw yn_2.a(hi_05);
                    }
                    n10 = p7.P();
                }
                catch (hi_0 hi_06) {
                    throw yn_2.a(hi_06);
                }
            }
            try {
                if (n10 != yn_2.a(30037, 3211048488765522317L)) return;
                p7 = p72;
            }
            catch (hi_0 hi_07) {
                throw yn_2.a(hi_07);
            }
        }
        try {
            p7.K();
            if (!bl) return;
            throw new hi_0(yn_2.a(-32542, -18345));
        }
        catch (hi_0 hi_08) {
            throw yn_2.a(hi_08);
        }
    }

    public int O() {
        return this.D;
    }

    public void l(int n10) {
        this.D = n10;
    }

    public Object O(String string) {
        boolean bl = yn_2.Y();
        for (int i2 = 0; i2 < this.M; ++i2) {
            Object object;
            block5: {
                try {
                    try {
                        object = string;
                        if (!bl) break block5;
                        if (!((String)object).equals(this.u[i2].toString())) continue;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    object = this.u[i2].T;
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            return object;
        }
        return null;
    }

    public void b(Collection collection) {
        block11: {
            block13: {
                int n10;
                boolean bl;
                block12: {
                    block10: {
                        bl = yn_2.o();
                        try {
                            try {
                                n10 = this.D;
                                if (bl) break block10;
                                if (n10 != 1) break block11;
                            }
                            catch (hi_0 hi_02) {
                                throw yn_2.a(hi_02);
                            }
                            n10 = collection instanceof List;
                        }
                        catch (hi_0 hi_03) {
                            throw yn_2.a(hi_03);
                        }
                    }
                    try {
                        try {
                            if (bl) break block12;
                            if (n10 == 0) break block13;
                        }
                        catch (hi_0 hi_04) {
                            throw yn_2.a(hi_04);
                        }
                        n10 = collection.size() - 1;
                    }
                    catch (hi_0 hi_05) {
                        throw yn_2.a(hi_05);
                    }
                }
                int n11 = n10;
                List list = (List)collection;
                n_0 n_02 = this.C();
                n_02.i = new uK(this, list, n11);
                n_02.m = this.C;
                this.l(0);
                if (!bl) break block11;
            }
            n_0 n_03 = this.C();
            n_03.i = new uK(collection);
            n_03.m = this.C;
            this.l(0);
        }
    }

    public void f(Map map, Object object) {
        if (this.D == 1) {
            uK uK2 = new uK(map, object);
            n_0 n_02 = this.C();
            n_02.i = uK2;
            n_02.m = this.C;
            this.l(0);
        }
    }

    public Object u(Map map) {
        return this.B(map, null);
    }

    public O0 Q() {
        Object object;
        Object object2;
        block7: {
            block8: {
                O0 o0 = new O0(this.N.w(ks_0.OrderedField));
                boolean bl = yn_2.o();
                object2 = this.u(o0);
                try {
                    try {
                        object = object2;
                        if (bl) break block7;
                        if (!(object instanceof O0)) break block8;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    return (O0)object2;
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            object = object2;
        }
        try {
            if (object == null) {
                return null;
            }
        }
        catch (hi_0 hi_04) {
            throw yn_2.a(hi_04);
        }
        return new O0((Map)object2);
    }

    public final void B(Collection collection) {
        this.p(collection, null);
    }

    /*
     * Exception decompiling
     */
    public final void p(Collection var1_1, Object var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [33[CASE]], but top level block is 19[TRYBLOCK]
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

    public xm_1 A() {
        return this.C;
    }

    public xm_1 d() {
        return this.C.G;
    }

    public List W() {
        List list;
        block4: {
            block5: {
                boolean bl = yn_2.o();
                try {
                    try {
                        list = this.e;
                        if (bl) break block4;
                        if (list != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    this.e = new ArrayList(2);
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            list = this.e;
        }
        return list;
    }

    public void O(n_0 n_02) {
        List list;
        block4: {
            block5: {
                boolean bl = yn_2.Y();
                try {
                    try {
                        list = this.e;
                        if (!bl) break block4;
                        if (list != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    this.e = new ArrayList(2);
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            list = this.e;
        }
        list.add(n_02);
    }

    public n_0 C() {
        return (n_0)this.e.get(this.e.size() - 1);
    }

    public List l() {
        List list;
        block4: {
            block5: {
                boolean bl = yn_2.Y();
                try {
                    try {
                        list = this.H;
                        if (!bl) break block4;
                        if (list != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    this.H = new ArrayList(2);
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            list = this.H;
        }
        return list;
    }

    public List Q() {
        List list;
        block4: {
            block5: {
                boolean bl = yn_2.o();
                try {
                    try {
                        list = this.T;
                        if (bl) break block4;
                        if (list != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    this.T = new ArrayList(2);
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            list = this.T;
        }
        return list;
    }

    public ni_2 n() {
        return this.t;
    }

    public void E(ni_2 ni_22) {
        this.t = ni_22;
    }

    public void z(xm_1 xm_12) {
        block4: {
            yn_2 yn_22;
            block5: {
                boolean bl = yn_2.o();
                try {
                    try {
                        yn_22 = this;
                        if (bl) break block4;
                        if (!yn_22.N.w(ks_0.DisableCircularReferenceDetect)) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    return;
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            yn_22 = this;
        }
        yn_22.C = xm_12;
    }

    public void A() {
        block7: {
            yn_2 yn_22;
            int n10;
            block5: {
                boolean bl;
                block6: {
                    bl = yn_2.Y();
                    try {
                        n10 = this.N.w(ks_0.DisableCircularReferenceDetect);
                        if (!bl) break block5;
                        if (n10 == 0) break block6;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    return;
                }
                try {
                    this.C = this.C.G;
                    yn_22 = this;
                    if (!bl) break block7;
                    n10 = yn_22.M;
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            if (n10 <= 0) {
                return;
            }
            --this.M;
            yn_22 = this;
        }
        yn_22.u[this.M] = null;
    }

    public xm_1 F(Object object, Object object2) {
        yn_2 yn_22;
        block4: {
            block5: {
                boolean bl = yn_2.o();
                try {
                    try {
                        yn_22 = this;
                        if (bl) break block4;
                        if (!yn_22.N.w(ks_0.DisableCircularReferenceDetect)) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    return null;
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            yn_22 = this;
        }
        return yn_22.L(this.C, object, object2);
    }

    public xm_1 L(xm_1 xm_12, Object object, Object object2) {
        yn_2 yn_22;
        block4: {
            block5: {
                boolean bl = yn_2.Y();
                try {
                    try {
                        yn_22 = this;
                        if (!bl) break block4;
                        if (!yn_22.N.w(ks_0.DisableCircularReferenceDetect)) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw yn_2.a(hi_02);
                    }
                    return null;
                }
                catch (hi_0 hi_03) {
                    throw yn_2.a(hi_03);
                }
            }
            this.C = new xm_1(xm_12, object, object2);
            this.a(this.C);
            yn_22 = this;
        }
        return yn_22.C;
    }

    /*
     * Unable to fully structure code
     */
    private void a(xm_1 var1_1) {
        block12: {
            block13: {
                block11: {
                    var3_2 = this.M++;
                    var2_3 = yn_2.o();
                    try {
                        try {
                            v0 = this;
                            if (var2_3) break block11;
                            if (v0.u == null) {
                            }
                            ** GOTO lbl22
                        }
                        catch (hi_0 v1) {
                            throw yn_2.a(v1);
                        }
                        v0 = this;
                    }
                    catch (hi_0 v2) {
                        throw yn_2.a(v2);
                    }
                }
                try {
                    try {
                        try {
                            v0.u = new xm_1[yn_2.a(14167, 3534403949201376138L)];
                            if (!var2_3) break block12;
lbl22:
                            // 2 sources

                            v3 = var3_2;
                            v4 = this.u.length;
                            if (var2_3) break block13;
                        }
                        catch (hi_0 v5) {
                            throw yn_2.a(v5);
                        }
                        if (v3 < v4) break block12;
                    }
                    catch (hi_0 v6) {
                        throw yn_2.a(v6);
                    }
                    v3 = this.u.length * 3;
                    v4 = 2;
                }
                catch (hi_0 v7) {
                    throw yn_2.a(v7);
                }
            }
            var4_4 = v3 / v4;
            var5_5 = new xm_1[var4_4];
            System.arraycopy(this.u, 0, var5_5, 0, this.u.length);
            this.u = var5_5;
        }
        this.u[var3_2] = var1_1;
    }

    public Object M() {
        return this.F((Object)null);
    }

    public Object x() {
        Object object;
        block2: {
            block3: {
                boolean bl = yn_2.o();
                try {
                    object = this.N;
                    if (bl) break block2;
                    if (object.P() != yn_2.a(8373, 7922450629563733116L)) break block3;
                }
                catch (hi_0 hi_02) {
                    throw yn_2.a(hi_02);
                }
                String string = this.N.z();
                this.N.S(yn_2.a(30037, 3211048488765522317L));
                return string;
            }
            object = this.F((Object)null);
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    public Object F(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 14[SWITCH]
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

    public void i(ks_0 ks_02, boolean bl) {
        this.N.K(ks_02, bl);
    }

    public boolean g(ks_0 ks_02) {
        return this.N.w(ks_02);
    }

    public P7 E() {
        return this.N;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void M(int n10) {
        P7 p7;
        boolean bl;
        P7 p72;
        block6: {
            p72 = this.N;
            bl = yn_2.Y();
            try {
                try {
                    p7 = p72;
                    if (!bl) break block6;
                    if (p7.P() != n10) throw new hi_0(yn_2.a(-32522, 8714) + ge_0.g(n10) + yn_2.a(-32553, 22020) + ge_0.g(p72.P()));
                }
                catch (hi_0 hi_02) {
                    throw yn_2.a(hi_02);
                }
                p7 = p72;
            }
            catch (hi_0 hi_03) {
                throw yn_2.a(hi_03);
            }
        }
        try {
            p7.K();
            if (bl) return;
            throw new hi_0(yn_2.a(-32522, 8714) + ge_0.g(n10) + yn_2.a(-32553, 22020) + ge_0.g(p72.P()));
        }
        catch (hi_0 hi_04) {
            throw yn_2.a(hi_04);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void Q(int var1_1, int var2_2) {
        block9: {
            block8: {
                var4_3 = this.N;
                var3_4 = yn_2.Y();
                try {
                    try {
                        v0 = var4_3;
                        if (!var3_4) break block8;
                        if (v0.P() == var1_1) {
                        }
                        ** GOTO lbl20
                    }
                    catch (hi_0 v1) {
                        throw yn_2.a(v1);
                    }
                    v0 = var4_3;
                }
                catch (hi_0 v2) {
                    throw yn_2.a(v2);
                }
            }
            try {
                v0.S(var2_2);
                if (var3_4) break block9;
lbl20:
                // 2 sources

                this.D(var1_1);
            }
            catch (hi_0 v3) {
                throw yn_2.a(v3);
            }
        }
    }

    public void D(int n10) {
        throw new hi_0(yn_2.a(-32545, 1779) + ge_0.g(n10) + yn_2.a(-32553, 22020) + ge_0.g(this.N.P()));
    }

    /*
     * Loose catch block
     */
    @Override
    public void close() {
        P7 p7 = this.N;
        boolean bl = yn_2.o();
        try {
            P7 p72;
            block10: {
                block11: {
                    block13: {
                        block12: {
                            p72 = p7;
                            if (bl) break block10;
                            if (!p72.w(ks_0.AutoCloseSource)) break block11;
                            break block12;
                            catch (hi_0 hi_02) {
                                throw yn_2.a(hi_02);
                            }
                        }
                        p72 = p7;
                        if (bl) break block10;
                        break block13;
                        catch (hi_0 hi_03) {
                            throw yn_2.a(hi_03);
                        }
                    }
                    try {
                        block14: {
                            if (p72.P() == yn_2.a(23598, 9004499887990122712L)) break block11;
                            break block14;
                            catch (hi_0 hi_04) {
                                throw yn_2.a(hi_04);
                            }
                        }
                        throw new hi_0(yn_2.a(-32557, -11466) + ge_0.g(p7.P()));
                    }
                    catch (hi_0 hi_05) {
                        throw yn_2.a(hi_05);
                    }
                }
                p72 = p7;
            }
            p72.close();
        }
        catch (Throwable throwable) {
            p7.close();
            throw throwable;
        }
    }

    public Object v(String string) {
        boolean bl = yn_2.o();
        try {
            if (this.u == null) {
                return null;
            }
        }
        catch (hi_0 hi_02) {
            throw yn_2.a(hi_02);
        }
        int n10 = 0;
        while (n10 < this.u.length && n10 < this.M) {
            block8: {
                block9: {
                    xm_1 xm_12 = this.u[n10];
                    try {
                        try {
                            if (bl) break block8;
                            if (!xm_12.toString().equals(string)) break block9;
                        }
                        catch (hi_0 hi_03) {
                            throw yn_2.a(hi_03);
                        }
                        return xm_12.T;
                    }
                    catch (hi_0 hi_04) {
                        throw yn_2.a(hi_04);
                    }
                }
                ++n10;
            }
            if (!bl) continue;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void Y(Object var1_1) {
        var2_2 = yn_2.o();
        try {
            if (this.e == null) {
                return;
            }
        }
        catch (hf_0 v0) {
            throw yn_2.a(v0);
        }
        var3_3 = 0;
        var4_4 = this.e.size();
        block52: while (true) {
            v1 = var3_3;
            block53: while (v1 < var4_4) {
                block62: {
                    block68: {
                        block69: {
                            block70: {
                                block65: {
                                    block66: {
                                        block64: {
                                            block67: {
                                                block63: {
                                                    block61: {
                                                        block59: {
                                                            block58: {
                                                                block57: {
                                                                    var5_5 = (n_0)this.e.get(var3_3);
                                                                    var6_6 = var5_5.K;
                                                                    var7_7 = null;
                                                                    v2 = var5_5.m;
                                                                    if (var2_2) break block57;
                                                                    try {
                                                                        block73: {
                                                                            if (v2 == null) break block58;
                                                                            break block73;
                                                                            catch (hf_0 v3) {
                                                                                throw yn_2.a(v3);
                                                                            }
                                                                        }
                                                                        v2 = var5_5.m.T;
                                                                    }
                                                                    catch (hf_0 v4) {
                                                                        throw yn_2.a(v4);
                                                                    }
                                                                }
                                                                var7_7 = v2;
                                                            }
                                                            try {
                                                                v5 = var6_6;
                                                                if (var2_2) break block59;
                                                                if (v5.startsWith("$")) {
                                                                }
                                                                ** GOTO lbl63
                                                            }
                                                            catch (hf_0 v6) {
                                                                throw yn_2.a(v6);
                                                            }
                                                            var8_8 = this.O(var6_6);
                                                            if (var8_8 != null) break block61;
                                                            try {
                                                                block60: {
                                                                    var9_9 = new ph_2(var6_6, en_0.p(), this.x, true);
                                                                    v7 = var9_9;
                                                                    if (var2_2) break block60;
                                                                    try {
                                                                        block74: {
                                                                            if (!v7.X()) break block61;
                                                                            break block74;
                                                                            catch (hf_0 v8) {
                                                                                throw yn_2.a(v8);
                                                                            }
                                                                        }
                                                                        v7 = var9_9.S(var1_1);
                                                                    }
                                                                    catch (hf_0 v9) {
                                                                        throw yn_2.a(v9);
                                                                    }
                                                                }
                                                                var8_8 = v7;
                                                                break block61;
                                                            }
                                                            catch (hf_0 var9_10) {
                                                                try {
                                                                    if (!var2_2) break block61;
lbl63:
                                                                    // 2 sources

                                                                    v5 = var5_5.M.T;
                                                                }
                                                                catch (hf_0 v10) {
                                                                    throw yn_2.a(v10);
                                                                }
                                                            }
                                                        }
                                                        var8_8 = v5;
                                                    }
                                                    var9_9 = var5_5.i;
                                                    try {
                                                        try {
                                                            try {
                                                                if (var2_2) continue block52;
                                                                if (var9_9 == null) break block62;
                                                            }
                                                            catch (hf_0 v11) {
                                                                throw yn_2.a(v11);
                                                            }
                                                            v12 = var8_8;
                                                            if (var2_2) break block63;
                                                        }
                                                        catch (hf_0 v13) {
                                                            throw yn_2.a(v13);
                                                        }
                                                        if (v12 == null) break block64;
                                                    }
                                                    catch (hf_0 v14) {
                                                        throw yn_2.a(v14);
                                                    }
                                                    v12 = var8_8;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v15 = v12.getClass();
                                                                    if (var2_2) break block65;
                                                                    if (v15 != O0.class) break block64;
                                                                }
                                                                catch (hf_0 v16) {
                                                                    throw yn_2.a(v16);
                                                                }
                                                                v17 = var9_9;
                                                                if (var2_2) break block66;
                                                            }
                                                            catch (hf_0 v18) {
                                                                throw yn_2.a(v18);
                                                            }
                                                            if (v17.p == null) break block64;
                                                        }
                                                        catch (hf_0 v19) {
                                                            throw yn_2.a(v19);
                                                        }
                                                        v15 = Map.class;
                                                        if (var2_2) break block65;
                                                    }
                                                    catch (hf_0 v20) {
                                                        throw yn_2.a(v20);
                                                    }
                                                    if (v15.isAssignableFrom(var9_9.p.O)) break block64;
                                                }
                                                catch (hf_0 v21) {
                                                    throw yn_2.a(v21);
                                                }
                                                var10_11 = this.u[0].T;
                                                var11_12 = ph_2.B(var6_6);
                                                try {
                                                    try {
                                                        v22 = var11_12;
                                                        if (var2_2) break block67;
                                                        if (!v22.X()) break block64;
                                                    }
                                                    catch (hf_0 v23) {
                                                        throw yn_2.a(v23);
                                                    }
                                                    v22 = var11_12.S(var10_11);
                                                }
                                                catch (hf_0 v24) {
                                                    throw yn_2.a(v24);
                                                }
                                            }
                                            var8_8 = v22;
                                        }
                                        v17 = var9_9;
                                    }
                                    try {
                                        if (var2_2) break block68;
                                        v15 = v17.X();
                                    }
                                    catch (hf_0 v25) {
                                        throw yn_2.a(v25);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (v15 == null) break block69;
                                                    v17 = var9_9;
                                                    if (var2_2) break block68;
                                                }
                                                catch (hf_0 v26) {
                                                    throw yn_2.a(v26);
                                                }
                                                if (v17.X().isInstance(var7_7)) break block69;
                                            }
                                            catch (hf_0 v27) {
                                                throw yn_2.a(v27);
                                            }
                                            v28 = var5_5.m.G;
                                            if (var2_2) break block70;
                                        }
                                        catch (hf_0 v29) {
                                            throw yn_2.a(v29);
                                        }
                                        if (v28 == null) break block69;
                                    }
                                    catch (hf_0 v30) {
                                        throw yn_2.a(v30);
                                    }
                                    v28 = var5_5.m.G;
                                }
                                catch (hf_0 v31) {
                                    throw yn_2.a(v31);
                                }
                            }
                            var10_11 = v28;
                            while (var10_11 != null) {
                                block72: {
                                    block71: {
                                        try {
                                            v32 = var9_9.X();
                                            if (var2_2) break block71;
                                            v1 = (int)v32.isInstance(var10_11.T);
                                            if (var2_2) continue block53;
                                        }
                                        catch (hf_0 v33) {
                                            throw yn_2.a(v33);
                                        }
                                        try {
                                            if (v1 == 0) break block72;
                                            v32 = var10_11.T;
                                        }
                                        catch (hf_0 v34) {
                                            throw yn_2.a(v34);
                                        }
                                    }
                                    var7_7 = v32;
                                    if (!var2_2) break;
                                }
                                var10_11 = var10_11.G;
                                if (!var2_2) continue;
                            }
                        }
                        v17 = var9_9;
                    }
                    v17.D(var7_7, var8_8);
                }
                ++var3_3;
                if (!var2_2) continue block52;
            }
            break;
        }
    }

    public void u(Object object, String string) {
        block34: {
            block35: {
                yn_2 yn_22;
                boolean bl;
                block32: {
                    block33: {
                        Iterator iterator;
                        block31: {
                            Object object2;
                            Iterator iterator22;
                            block30: {
                                Object object3;
                                block29: {
                                    Object object4;
                                    block28: {
                                        block27: {
                                            List list;
                                            block26: {
                                                boolean bl2 = yn_2.o();
                                                P7 p7 = this.N;
                                                p7.Z();
                                                bl = bl2;
                                                object4 = null;
                                                try {
                                                    try {
                                                        list = this.T;
                                                        if (bl) break block26;
                                                        if (list == null) break block27;
                                                    }
                                                    catch (hi_0 hi_02) {
                                                        throw yn_2.a(hi_02);
                                                    }
                                                    list = this.T;
                                                }
                                                catch (hi_0 hi_03) {
                                                    throw yn_2.a(hi_03);
                                                }
                                            }
                                            for (Iterator iterator22 : list) {
                                                object4 = iterator22.M(object, string);
                                                try {
                                                    if (!bl) {
                                                        if (!bl) continue;
                                                        break;
                                                    }
                                                    break block28;
                                                }
                                                catch (hi_0 hi_04) {
                                                    throw yn_2.a(hi_04);
                                                }
                                            }
                                        }
                                        try {
                                            try {
                                                object3 = object4;
                                                if (bl) break block29;
                                                if (object3 != null) break block28;
                                            }
                                            catch (hi_0 hi_05) {
                                                throw yn_2.a(hi_05);
                                            }
                                            object3 = this.M();
                                            break block29;
                                        }
                                        catch (hi_0 hi_06) {
                                            throw yn_2.a(hi_06);
                                        }
                                    }
                                    object3 = this.o((Type)object4);
                                }
                                iterator = object3;
                                try {
                                    try {
                                        object2 = object;
                                        if (bl) break block30;
                                        if (!(object2 instanceof GU)) break block31;
                                    }
                                    catch (hi_0 hi_07) {
                                        throw yn_2.a(hi_07);
                                    }
                                    object2 = object;
                                }
                                catch (hi_0 hi_08) {
                                    throw yn_2.a(hi_08);
                                }
                            }
                            iterator22 = (GU)object2;
                            iterator22.T(string, iterator);
                            return;
                        }
                        try {
                            yn_22 = this;
                            if (bl) break block32;
                            if (yn_22.H == null) break block33;
                        }
                        catch (hi_0 hi_09) {
                            throw yn_2.a(hi_09);
                        }
                        for (GV gV2 : this.H) {
                            try {
                                gV2.J(object, string, iterator);
                                if (!bl) {
                                    if (!bl) continue;
                                    break;
                                }
                                break block34;
                            }
                            catch (hi_0 hi_010) {
                                throw yn_2.a(hi_010);
                            }
                        }
                    }
                    yn_22 = this;
                }
                try {
                    try {
                        if (bl) break block35;
                        if (yn_22.D != 1) break block34;
                    }
                    catch (hi_0 hi_011) {
                        throw yn_2.a(hi_011);
                    }
                    yn_22 = this;
                }
                catch (hi_0 hi_012) {
                    throw yn_2.a(hi_012);
                }
            }
            yn_22.D = 0;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Object T(ev_2 var1_1, Object var2_2) {
        block97: {
            block98: {
                block102: {
                    block103: {
                        block101: {
                            block99: {
                                block100: {
                                    var3_3 = yn_2.o();
                                    try {
                                        v0 = this;
                                        if (var3_3) break block97;
                                        if (v0.N.P() == yn_2.a(219, 4572262095367762982L)) break block98;
                                    }
                                    catch (hi_0 v1) {
                                        throw yn_2.a(v1);
                                    }
                                    var4_4 = yn_2.a(-32539, -23089) + this.N.B();
                                    try {
                                        if (var3_3) break block99;
                                        if (!(var2_2 instanceof String)) break block100;
                                    }
                                    catch (hi_0 v2) {
                                        throw yn_2.a(v2);
                                    }
                                    var4_4 = var4_4 + yn_2.a(-32528, -20553);
                                    var4_4 = var4_4 + var2_2;
                                }
                                var4_4 = var4_4 + yn_2.a(-32555, 30364);
                                var4_4 = var4_4 + this.N.C();
                            }
                            var5_6 = new oc_0();
                            this.p(var5_6, var2_2);
                            v3 = var5_6;
                            if (var3_3) break block101;
                            try {
                                block131: {
                                    if (v3.size() != 1) break block102;
                                    break block131;
                                    catch (hi_0 v4) {
                                        throw yn_2.a(v4);
                                    }
                                }
                                v3 = var5_6.get(0);
                            }
                            catch (hi_0 v5) {
                                throw yn_2.a(v5);
                            }
                        }
                        var6_8 = v3;
                        v6 = var6_8;
                        if (var3_3) break block103;
                        try {
                            block132: {
                                if (!(v6 instanceof O0)) break block102;
                                break block132;
                                catch (hi_0 v7) {
                                    throw yn_2.a(v7);
                                }
                            }
                            v6 = var6_8;
                        }
                        catch (hi_0 v8) {
                            throw yn_2.a(v8);
                        }
                    }
                    return (O0)v6;
                }
                throw new hi_0(var4_4);
            }
            v0 = this;
        }
        var4_5 = v0.C;
        try {
            var5_7 = 0;
            while (true) {
                block142: {
                    block129: {
                        block130: {
                            block128: {
                                block127: {
                                    block126: {
                                        block125: {
                                            block146: {
                                                block124: {
                                                    block119: {
                                                        block117: {
                                                            block118: {
                                                                block122: {
                                                                    block123: {
                                                                        block144: {
                                                                            block143: {
                                                                                block121: {
                                                                                    block120: {
                                                                                        block140: {
                                                                                            block138: {
                                                                                                block108: {
                                                                                                    block109: {
                                                                                                        block116: {
                                                                                                            block112: {
                                                                                                                block113: {
                                                                                                                    block114: {
                                                                                                                        block115: {
                                                                                                                            block134: {
                                                                                                                                block110: {
                                                                                                                                    block111: {
                                                                                                                                        block107: {
                                                                                                                                            block106: {
                                                                                                                                                block105: {
                                                                                                                                                    block104: {
                                                                                                                                                        this.N.N();
                                                                                                                                                        var6_9 = this.N.w();
                                                                                                                                                        try {
                                                                                                                                                            if (!this.N.w(ks_0.AllowArbitraryCommas)) break block104;
                                                                                                                                                            while (true) {
                                                                                                                                                                v9 = var6_9;
                                                                                                                                                                v10 = yn_2.a(31954, 697824399795292200L);
                                                                                                                                                                if (var3_3) break block105;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        catch (hi_0 v11) {
                                                                                                                                                            throw yn_2.a(v11);
                                                                                                                                                        }
                                                                                                                                                        if (v9 == v10) {
                                                                                                                                                            this.N.C();
                                                                                                                                                            this.N.N();
                                                                                                                                                            var6_9 = this.N.w();
                                                                                                                                                            try {
                                                                                                                                                                if (var3_3) break block106;
                                                                                                                                                                if (!var3_3) ** continue;
                                                                                                                                                            }
                                                                                                                                                            catch (hi_0 v12) {
                                                                                                                                                                throw yn_2.a(v12);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v9 = var6_9;
                                                                                                                                                    v10 = yn_2.a(10319, 2755371857501740174L);
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    if (var3_3) break block107;
                                                                                                                                                    if (v9 != v10) break block106;
                                                                                                                                                }
                                                                                                                                                catch (hi_0 v13) {
                                                                                                                                                    throw yn_2.a(v13);
                                                                                                                                                }
                                                                                                                                                var7_10 = this.N.z(this.v, (char)yn_2.a(1028, 1733405248141455610L));
                                                                                                                                                this.N.N();
                                                                                                                                                var6_9 = this.N.w();
                                                                                                                                                v14 = var6_9;
                                                                                                                                                if (var3_3) break block108;
                                                                                                                                                try {
                                                                                                                                                    block133: {
                                                                                                                                                        if (v14 == yn_2.a(27643, 8961306065264877351L)) break block109;
                                                                                                                                                        break block133;
                                                                                                                                                        catch (hi_0 v15) {
                                                                                                                                                            throw yn_2.a(v15);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    throw new hi_0(yn_2.a(-32563, -10560) + this.N.R());
                                                                                                                                                }
                                                                                                                                                catch (hi_0 v16) {
                                                                                                                                                    throw yn_2.a(v16);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v9 = var6_9;
                                                                                                                                            v10 = yn_2.a(18270, 9132207411403928468L);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (var3_3) break block110;
                                                                                                                                            if (v9 != v10) break block111;
                                                                                                                                        }
                                                                                                                                        catch (hi_0 v17) {
                                                                                                                                            throw yn_2.a(v17);
                                                                                                                                        }
                                                                                                                                        this.N.C();
                                                                                                                                        this.N.w();
                                                                                                                                        this.N.S(yn_2.a(30037, 3211048488765522317L));
                                                                                                                                        var8_11 = var1_1;
                                                                                                                                        return var8_11;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        v9 = var6_9;
                                                                                                                                        if (var3_3) break block112;
                                                                                                                                        v10 = yn_2.a(27520, 2475073599498723184L);
                                                                                                                                    }
                                                                                                                                    catch (hi_0 v18) {
                                                                                                                                        throw yn_2.a(v18);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (v9 != v10) break block113;
                                                                                                                                v19 = this.N;
                                                                                                                                if (var3_3) break block114;
                                                                                                                                break block134;
                                                                                                                                catch (hi_0 v20) {
                                                                                                                                    throw yn_2.a(v20);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                block135: {
                                                                                                                                    if (v19.w(ks_0.AllowSingleQuotes)) break block115;
                                                                                                                                    break block135;
                                                                                                                                    catch (hi_0 v21) {
                                                                                                                                        throw yn_2.a(v21);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                throw new hi_0(yn_2.a(-32518, 8199));
                                                                                                                            }
                                                                                                                            catch (hi_0 v22) {
                                                                                                                                throw yn_2.a(v22);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v19 = this.N;
                                                                                                                    }
                                                                                                                    var7_10 = v19.z(this.v, (char)yn_2.a(3513, 450346293026847099L));
                                                                                                                    this.N.N();
                                                                                                                    var6_9 = this.N.w();
                                                                                                                    v14 = var6_9;
                                                                                                                    if (var3_3) break block108;
                                                                                                                    try {
                                                                                                                        block136: {
                                                                                                                            if (v14 == yn_2.a(30071, 6615470895069495735L)) break block109;
                                                                                                                            break block136;
                                                                                                                            catch (hi_0 v23) {
                                                                                                                                throw yn_2.a(v23);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new hi_0(yn_2.a(-32536, 21890) + this.N.R());
                                                                                                                    }
                                                                                                                    catch (hi_0 v24) {
                                                                                                                        throw yn_2.a(v24);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    v25 = this.N;
                                                                                                                    if (var3_3) break block116;
                                                                                                                    v9 = (char)v25.w(ks_0.AllowUnQuotedFieldNames);
                                                                                                                }
                                                                                                                catch (hi_0 v26) {
                                                                                                                    throw yn_2.a(v26);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (v9 == '\u0000') {
                                                                                                                    throw new hi_0(yn_2.a(-32518, 8199));
                                                                                                                }
                                                                                                            }
                                                                                                            catch (hi_0 v27) {
                                                                                                                throw yn_2.a(v27);
                                                                                                            }
                                                                                                            v25 = this.N;
                                                                                                        }
                                                                                                        var7_10 = v25.w(this.v);
                                                                                                        this.N.N();
                                                                                                        var6_9 = this.N.w();
                                                                                                        v14 = var6_9;
                                                                                                        if (var3_3) break block108;
                                                                                                        try {
                                                                                                            block137: {
                                                                                                                if (v14 == yn_2.a(30071, 6615470895069495735L)) break block109;
                                                                                                                break block137;
                                                                                                                catch (hi_0 v28) {
                                                                                                                    throw yn_2.a(v28);
                                                                                                                }
                                                                                                            }
                                                                                                            throw new hi_0(yn_2.a(-32536, 21890) + this.N.R() + yn_2.a(-32558, -3944) + var6_9);
                                                                                                        }
                                                                                                        catch (hi_0 v29) {
                                                                                                            throw yn_2.a(v29);
                                                                                                        }
                                                                                                    }
                                                                                                    this.N.C();
                                                                                                    this.N.N();
                                                                                                    v14 = this.N.w();
                                                                                                }
                                                                                                var6_9 = v14;
                                                                                                this.N.w();
                                                                                                if (var3_3) break block117;
                                                                                                if (var7_10 != ok_0.Z) break block118;
                                                                                                break block138;
                                                                                                catch (hi_0 v30) {
                                                                                                    throw yn_2.a(v30);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                block139: {
                                                                                                    v31 = this.N.w(ks_0.DisableSpecialKeyDetect);
                                                                                                    if (var3_3) break block119;
                                                                                                    break block139;
                                                                                                    catch (hi_0 v32) {
                                                                                                        throw yn_2.a(v32);
                                                                                                    }
                                                                                                }
                                                                                                if (v31 != 0) break block118;
                                                                                            }
                                                                                            catch (hi_0 v33) {
                                                                                                throw yn_2.a(v33);
                                                                                            }
                                                                                            var8_11 = this.N.z(this.v, (char)yn_2.a(1028, 1733405248141455610L));
                                                                                            var9_12 = this.x.P((String)var8_11, null, this.N.A());
                                                                                            v34 = Map.class.isAssignableFrom((Class<?>)var9_12);
                                                                                            if (var3_3) break block120;
                                                                                            if (v34 == 0) break block121;
                                                                                            break block140;
                                                                                            catch (hi_0 v35) {
                                                                                                throw yn_2.a(v35);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block141: {
                                                                                                this.N.S(yn_2.a(30037, 3211048488765522317L));
                                                                                                if (var3_3) continue;
                                                                                                break block141;
                                                                                                catch (hi_0 v36) {
                                                                                                    throw yn_2.a(v36);
                                                                                                }
                                                                                            }
                                                                                            v34 = this.N.P();
                                                                                        }
                                                                                        catch (hi_0 v37) {
                                                                                            throw yn_2.a(v37);
                                                                                        }
                                                                                    }
                                                                                    if (v34 == yn_2.a(30093, 2398795216609935681L)) {
                                                                                        this.N.S(yn_2.a(30037, 3211048488765522317L));
                                                                                        var10_14 = var1_1;
                                                                                        return var10_14;
                                                                                    }
                                                                                    break block142;
                                                                                }
                                                                                var10_15 = this.x.h(var9_12);
                                                                                this.N.S(yn_2.a(30037, 3211048488765522317L));
                                                                                this.l(2);
                                                                                v38 = var4_5;
                                                                                if (var3_3) break block122;
                                                                                if (v38 == null) break block123;
                                                                                break block143;
                                                                                catch (hi_0 v39) {
                                                                                    throw yn_2.a(v39);
                                                                                }
                                                                            }
                                                                            v38 = var2_2;
                                                                            if (var3_3) break block122;
                                                                            break block144;
                                                                            catch (hi_0 v40) {
                                                                                throw yn_2.a(v40);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block145: {
                                                                                if (v38 instanceof Integer) break block123;
                                                                                break block145;
                                                                                catch (hi_0 v41) {
                                                                                    throw yn_2.a(v41);
                                                                                }
                                                                            }
                                                                            this.A();
                                                                        }
                                                                        catch (hi_0 v42) {
                                                                            throw yn_2.a(v42);
                                                                        }
                                                                    }
                                                                    v38 = var10_15.z(this, var9_12, var2_2);
                                                                }
                                                                var11_16 = (Map)v38;
                                                                return var11_16;
                                                            }
                                                            try {
                                                                v43 = this;
                                                                if (var3_3) break block124;
                                                                v43.N.K();
                                                            }
                                                            catch (hi_0 v44) {
                                                                throw yn_2.a(v44);
                                                            }
                                                        }
                                                        v31 = var5_7;
                                                    }
                                                    if (v31 == 0) break block146;
                                                    v43 = this;
                                                }
                                                v43.z(var4_5);
                                            }
                                            var9_12 = var1_1.d(var7_10);
                                            try {
                                                v45 = this.N;
                                                if (var3_3) break block125;
                                                if (v45.P() == yn_2.a(14167, 3534403949201376138L)) {
                                                }
                                                ** GOTO lbl322
                                            }
                                            catch (hi_0 v46) {
                                                throw yn_2.a(v46);
                                            }
                                            var8_11 = null;
                                            try {
                                                this.N.K();
                                                if (!var3_3) break block126;
lbl322:
                                                // 2 sources

                                                v45 = this.r(var9_12, var7_10);
                                            }
                                            catch (hi_0 v47) {
                                                throw yn_2.a(v47);
                                            }
                                        }
                                        var8_11 = v45;
                                    }
                                    var1_1.j(var7_10, var8_11);
                                    this.L(var4_5, var8_11, var7_10);
                                    this.z(var4_5);
                                    var10_13 = this.N.P();
                                    v48 = var10_13;
                                    v49 = yn_2.a(18871, 7277710567930281304L);
                                    if (var3_3) break block127;
                                    try {
                                        block147: {
                                            if (v48 == v49) break block128;
                                            break block147;
                                            catch (hi_0 v50) {
                                                throw yn_2.a(v50);
                                            }
                                        }
                                        v48 = var10_13;
                                        v49 = yn_2.a(22511, 2540847392978117415L);
                                    }
                                    catch (hi_0 v51) {
                                        throw yn_2.a(v51);
                                    }
                                }
                                try {
                                    if (var3_3) break block129;
                                    if (v48 != v49) break block130;
                                }
                                catch (hi_0 v52) {
                                    throw yn_2.a(v52);
                                }
                            }
                            var11_17 = var1_1;
                            return var11_17;
                        }
                        v48 = var10_13;
                        v49 = yn_2.a(30093, 2398795216609935681L);
                    }
                    if (v48 == v49) {
                        this.N.K();
                        var11_18 = var1_1;
                        return var11_18;
                    }
                }
                ++var5_7;
            }
        }
        finally {
            this.z(var4_5);
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
                        var13 = new String[55];
                        var11_1 = 0;
                        var10_2 = "\u00f3\u0097\u00b4\u008b\u0080\u0083\u00e2\u00f7\u00d9L\u00ac\u0089*\u0014;jqP`\f\u00c4;j!}\u0011\u0007\u00f9<\u009d}\u00e3\u00d1;\u0013p'\u00bc\u00f9\u00808\u00da\u0085\u00ea\u00d9\u0014\u00b9Z\u00cd\u00e8*&\t^\f;\tq\u00bcrC\u0084Sf\u00b4 F\u000e\r\u0080\u0013\ru\u00a6dV=\u00a3\u00ee\u00f6K}\u0016\u00f3\u0006\u00f34\u00a4m\u001c\u0015b\u00b8\u001a\u00b3TF\u000f\u00bcm\u00f77dT\u0004%E\u00a6\u009cG\u009b\u0086KK_f\u00f6\u00d6\u00cf\u0093TPR\u00d3A\u0006~n'f\u00c9\u009e\u00cb\u009f\u00de~uV\u0011\u00d7){\u0011\u0002\u00b74\u0006hM\u00b1]\u00a5_\fEV\u00028\u0011y(\u00a9,\u00ba\u0012)\u000e\u0010\u00c0\u0014\u0085\u00ded\u0011\u00b7\u00d4(v\u00d5:\u001b\u001f#\u00berJ\u0012\u009d\u0088\u0088\u00e7\u00cf\u0010)\u00fa\u009e\u00ba/\u008bH\u00f2\u00e2\u00d6\u00f4r\u00cf9 H\u00d9\u00bb,\u007f\u0015\u00f1A1\u00ca\u0005'\u00ddmQ\u00ffB\u001d\u008a*\u00be\u00ca\u001e\u00b0\u00e6\u00135\u0004<\u00e5'Y\u0006@\u00bf\u00a2`g\u009b\u0015\u00f7\u00f2\u00e8\u00c3A\u00ac\u00e2\u00ae\u00aa\u000b\u00b9\u00b1\u00cf\u008d\u001cM_\u0004hk\u0085\u000e\u00c9\u00ba/\u00ca\u00b9\u008d\u00fd\u008aI\u008f\u00c5!@\u009f\u000e\u00bf\u00f0+\u00b3\u00e6\u009dTG4id\u0011\u008a\u00e8\u0017\u00fc\u00ab\u00ab\u00e6}\u00b2\u0097\u00cd\u00c4\u00b6\u008a\u00ca\u00ac\u00d1z\u00f8\u00ab)\u00d9V\u00cc\u00e7\u00ad\u0003Z\u00a8\u00e7\u0012<oZ\u009d\u00b5w\u00f6\u00be\u00970\u001a\u00d0f~4t\u00bet\fX\u00f3\u00a1\u008ce\u00ef\u00a6{\u00fd\u00e0(b\u0018\u00a7\u00fe\u00f8\u00dd\u001ee\u008d\u00d7ZHV\u000b\u00d7\u0019?<\r\u00f0\u00f5\u0000w\u00bbp/\u0004vQn\u00cf\u000eq.8X[\u00df\u00a1\u00c0\u00c2\u00c6\u00b4\bn\u00ba\u0011(2_\u00a40\u00af\u009b\u009dDz\u00e38\u00f5\u00a4[!\u00af\u0002\u00bf\u00c5\u0014\u00ab`\u009a\u0080\u0093\u00e1\u009e\u00c2\u00d1\u00aa\u00c0\u007f`\u00da\n\u00fbr{\u0083w\u001f\u00f25H;U\u00b3`M\u00faw\u00b3>\u008e|4sZ\u00c3\u00c8\u0093\u0091\u00da\u009a\n$\u0098\u00eb\u00ce\u00cf\u00ce\u00f1\u000e\u000bIw\u00b4\u00b2B\u009cse\u00b0@\u00c6\u00fcy\u0016\u00db~\u0012N\u0085\u00a2\u00b0,xY\u0015\u00e9\u001d\u00cd\u00cbf\u00f5@v\u00e5:\u00db\u001f\u00e5\u00b4\u00aa\u000b\t\u00b5\u00eb\u008d\u008bo\u009d=K\u001c\u008c\u007fMB*\u00a3\u00cd\u00fc\u0011\u00eaU\u0084\u00c5M\n\u00beI>M\u00e2\u00bf\u00c1\u00ab\u00ec\u00bf\u00a6\u0001\n\u00cc\u0091a\u00cc\u00d4\u0080\u00ed\u00b2\u009e/\u00fd\u009cc~\u00eaM\u0086C\u0014\u00e4===\u008aV\u00da\r6L\u0084\u0085\u00cc\u0002~\u001c\n\u0086\u00a0V\u00a5\u00ab\u00f4\u009a|\u008d\u0011\u0084\u000f\u00b8\u00b3\u00a5\u00fa\f\\2\u009d\u00db\u00ef\u00af7\u00ce\u0010\u0007\u00ee0\f\u0080\u0005\u00c5\u00d3W\u00c0\u00f4\u00f7h \u00e1\u00d4\u0007\u000fZ\u001e\u001d\u00b1i\u0095\u001a!'2y\u001a\u00fb\u0089D\u00c7V\u0014\u001az\u00f8\u00bf\u00f4\u009f\u00ca\u0004\"\u00b2GTOe\u001a\rKZ$p\u009c\u00f0\u00d3ZIo\u00cc\u0096E\u0015\u00f8\u00c6\tE}|e\u00b4ZH\u00a7\u00d9\f\u0080d\u00ecP0\u0089\u00ed\u00b9\u001e\u00cf\u00e8\u00cd\u008e\u00b1\u00bf\u000el\u00f7\u0082\u00e3Jm\u0000\u0000\"\u00d8\u009d\u0010\u00cfTWrBlb\u00dc\\\u0085\u00bf\u0011\u008e\u00ec\u00e8\u009b\u00918(\u0001x:T\u00c5?\u00d4\u009f`m\u000b \u00f3\u00b8\u0097\u0098\u00e8S8w'\u008b\u001d\u00a2'\u00e6\u00f9\u00db!\u00bc\u009f\u00d0\u00ab\u0006\u00bc\u00deCP\u001f.\u00de\u00e6\u00d6\u00a1.\u00df1\u00a3\u00d0\u00cb$T\t\u00d4G7\u0010A.\u0014[O\u0002\\Y\u0004A\u00c4\u0082\u0090\t&_i\u0013\u008aNmW`\u0016A5A'\u00ef\u008f\u00fd\u0089\u00d1\u00ed \u007f\u00bb\u001f\u001f<o\u000b%\u008cP\u00f6\u000f\u00b4c\u0080\u00f1L\u00eaCf\u009e\u0012?\u0092\u0013\u00f3O\u0011\u00bb\r\u00c5\u00bc\u00af\u0090?\u0090V{\u0083\u00ed\u00a8G\u00b6{\u00ed\u0014#'\u008bh\u00b1\u00fc\u00daaY\u00de\u00d1\u00f1B\u000bN\u00c1\u00fa<\u0092\u009f\u001aSN|T\u00d3^\u00b0\u00f0\u00e0\u00c0\u00f0\u00c8\u00e6\u00a2,\u00bf\u00ed\u00a3J\u000f{\u00e2m\u00fbB\u008c\u000e\u00c4\u0094D?\u000b\f\u00e9u\u0083/\u0092\u00d9T\u00f1";
                        var12_3 = "\u00f3\u0097\u00b4\u008b\u0080\u0083\u00e2\u00f7\u00d9L\u00ac\u0089*\u0014;jqP`\f\u00c4;j!}\u0011\u0007\u00f9<\u009d}\u00e3\u00d1;\u0013p'\u00bc\u00f9\u00808\u00da\u0085\u00ea\u00d9\u0014\u00b9Z\u00cd\u00e8*&\t^\f;\tq\u00bcrC\u0084Sf\u00b4 F\u000e\r\u0080\u0013\ru\u00a6dV=\u00a3\u00ee\u00f6K}\u0016\u00f3\u0006\u00f34\u00a4m\u001c\u0015b\u00b8\u001a\u00b3TF\u000f\u00bcm\u00f77dT\u0004%E\u00a6\u009cG\u009b\u0086KK_f\u00f6\u00d6\u00cf\u0093TPR\u00d3A\u0006~n'f\u00c9\u009e\u00cb\u009f\u00de~uV\u0011\u00d7){\u0011\u0002\u00b74\u0006hM\u00b1]\u00a5_\fEV\u00028\u0011y(\u00a9,\u00ba\u0012)\u000e\u0010\u00c0\u0014\u0085\u00ded\u0011\u00b7\u00d4(v\u00d5:\u001b\u001f#\u00berJ\u0012\u009d\u0088\u0088\u00e7\u00cf\u0010)\u00fa\u009e\u00ba/\u008bH\u00f2\u00e2\u00d6\u00f4r\u00cf9 H\u00d9\u00bb,\u007f\u0015\u00f1A1\u00ca\u0005'\u00ddmQ\u00ffB\u001d\u008a*\u00be\u00ca\u001e\u00b0\u00e6\u00135\u0004<\u00e5'Y\u0006@\u00bf\u00a2`g\u009b\u0015\u00f7\u00f2\u00e8\u00c3A\u00ac\u00e2\u00ae\u00aa\u000b\u00b9\u00b1\u00cf\u008d\u001cM_\u0004hk\u0085\u000e\u00c9\u00ba/\u00ca\u00b9\u008d\u00fd\u008aI\u008f\u00c5!@\u009f\u000e\u00bf\u00f0+\u00b3\u00e6\u009dTG4id\u0011\u008a\u00e8\u0017\u00fc\u00ab\u00ab\u00e6}\u00b2\u0097\u00cd\u00c4\u00b6\u008a\u00ca\u00ac\u00d1z\u00f8\u00ab)\u00d9V\u00cc\u00e7\u00ad\u0003Z\u00a8\u00e7\u0012<oZ\u009d\u00b5w\u00f6\u00be\u00970\u001a\u00d0f~4t\u00bet\fX\u00f3\u00a1\u008ce\u00ef\u00a6{\u00fd\u00e0(b\u0018\u00a7\u00fe\u00f8\u00dd\u001ee\u008d\u00d7ZHV\u000b\u00d7\u0019?<\r\u00f0\u00f5\u0000w\u00bbp/\u0004vQn\u00cf\u000eq.8X[\u00df\u00a1\u00c0\u00c2\u00c6\u00b4\bn\u00ba\u0011(2_\u00a40\u00af\u009b\u009dDz\u00e38\u00f5\u00a4[!\u00af\u0002\u00bf\u00c5\u0014\u00ab`\u009a\u0080\u0093\u00e1\u009e\u00c2\u00d1\u00aa\u00c0\u007f`\u00da\n\u00fbr{\u0083w\u001f\u00f25H;U\u00b3`M\u00faw\u00b3>\u008e|4sZ\u00c3\u00c8\u0093\u0091\u00da\u009a\n$\u0098\u00eb\u00ce\u00cf\u00ce\u00f1\u000e\u000bIw\u00b4\u00b2B\u009cse\u00b0@\u00c6\u00fcy\u0016\u00db~\u0012N\u0085\u00a2\u00b0,xY\u0015\u00e9\u001d\u00cd\u00cbf\u00f5@v\u00e5:\u00db\u001f\u00e5\u00b4\u00aa\u000b\t\u00b5\u00eb\u008d\u008bo\u009d=K\u001c\u008c\u007fMB*\u00a3\u00cd\u00fc\u0011\u00eaU\u0084\u00c5M\n\u00beI>M\u00e2\u00bf\u00c1\u00ab\u00ec\u00bf\u00a6\u0001\n\u00cc\u0091a\u00cc\u00d4\u0080\u00ed\u00b2\u009e/\u00fd\u009cc~\u00eaM\u0086C\u0014\u00e4===\u008aV\u00da\r6L\u0084\u0085\u00cc\u0002~\u001c\n\u0086\u00a0V\u00a5\u00ab\u00f4\u009a|\u008d\u0011\u0084\u000f\u00b8\u00b3\u00a5\u00fa\f\\2\u009d\u00db\u00ef\u00af7\u00ce\u0010\u0007\u00ee0\f\u0080\u0005\u00c5\u00d3W\u00c0\u00f4\u00f7h \u00e1\u00d4\u0007\u000fZ\u001e\u001d\u00b1i\u0095\u001a!'2y\u001a\u00fb\u0089D\u00c7V\u0014\u001az\u00f8\u00bf\u00f4\u009f\u00ca\u0004\"\u00b2GTOe\u001a\rKZ$p\u009c\u00f0\u00d3ZIo\u00cc\u0096E\u0015\u00f8\u00c6\tE}|e\u00b4ZH\u00a7\u00d9\f\u0080d\u00ecP0\u0089\u00ed\u00b9\u001e\u00cf\u00e8\u00cd\u008e\u00b1\u00bf\u000el\u00f7\u0082\u00e3Jm\u0000\u0000\"\u00d8\u009d\u0010\u00cfTWrBlb\u00dc\\\u0085\u00bf\u0011\u008e\u00ec\u00e8\u009b\u00918(\u0001x:T\u00c5?\u00d4\u009f`m\u000b \u00f3\u00b8\u0097\u0098\u00e8S8w'\u008b\u001d\u00a2'\u00e6\u00f9\u00db!\u00bc\u009f\u00d0\u00ab\u0006\u00bc\u00deCP\u001f.\u00de\u00e6\u00d6\u00a1.\u00df1\u00a3\u00d0\u00cb$T\t\u00d4G7\u0010A.\u0014[O\u0002\\Y\u0004A\u00c4\u0082\u0090\t&_i\u0013\u008aNmW`\u0016A5A'\u00ef\u008f\u00fd\u0089\u00d1\u00ed \u007f\u00bb\u001f\u001f<o\u000b%\u008cP\u00f6\u000f\u00b4c\u0080\u00f1L\u00eaCf\u009e\u0012?\u0092\u0013\u00f3O\u0011\u00bb\r\u00c5\u00bc\u00af\u0090?\u0090V{\u0083\u00ed\u00a8G\u00b6{\u00ed\u0014#'\u008bh\u00b1\u00fc\u00daaY\u00de\u00d1\u00f1B\u000bN\u00c1\u00fa<\u0092\u009f\u001aSN|T\u00d3^\u00b0\u00f0\u00e0\u00c0\u00f0\u00c8\u00e6\u00a2,\u00bf\u00ed\u00a3J\u000f{\u00e2m\u00fbB\u008c\u000e\u00c4\u0094D?\u000b\f\u00e9u\u0083/\u0092\u00d9T\u00f1".length();
                        var9_4 = 26;
                        var8_5 = -1;
                        yn_2.c(true);
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 50;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "M\u00d9\u0080J\u00cb\u00bc\u00b5\u0011\u00c5\u008f\u0007\u00e9c\u00d8\u00df\u000bF\u00e5U#EmZ\u00821";
                            var12_3 = "M\u00d9\u0080J\u00cb\u00bc\u00b5\u0011\u00c5\u008f\u0007\u00e9c\u00d8\u00df\u000bF\u00e5U#EmZ\u00821".length();
                            var9_4 = 7;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 85;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 57;
                                    break;
                                }
                                case 1: {
                                    v15 = 30;
                                    break;
                                }
                                case 2: {
                                    v15 = 54;
                                    break;
                                }
                                case 3: {
                                    v15 = 8;
                                    break;
                                }
                                case 4: {
                                    v15 = 44;
                                    break;
                                }
                                case 5: {
                                    v15 = 35;
                                    break;
                                }
                                default: {
                                    v15 = 86;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                yn_2.a = var13;
                yn_2.b = new String[55];
                var0_7 = 5615600274090338693L;
                var6_8 = new long[51];
                var3_9 = 0;
                var4_10 = "\u00f0o\u001c\u00afh\u0010\u00f91X\u00d0opC\u00a2\u00f9\u00aa\u00c2G\u00ab!v\u00176\u0098\u009f\u00bb\u00cfM=_j\u0007\u008f\u00e5\u0005i\u001efmh\u00aa\u0087\b\u00f9\u00bf\u00b2'\u009e\u00e9\u0017\u00af\u0017 \u00d1(\u0018\u00e4\u00a1mCx\u0080\u00f8\u0089\u00ce\u0005\u00de\u00e9\u00de\u0010\u0018\u00a4\u00e3\u00a0hYBi\b\u00a4HM\u00bc~\u0097\u001fF \u0099{g1Q\u00c9\u00e9.\u00faf\u00f0\u00d3\u0083\u00dc<e7\u0098-V\u00e6\u0018\u0082\u00a5\u009e|i\u00d5\u001e\u00f0\u00cd\u00f8\u00dc>\u00ecl0\u00f9\u00c3\u00bdu\u00d2\u00f2 \u0083\u00db*g`\u0018\u00fey?\u008cx\u009b\u00d9\u00e0\u00a6\u00f5\u0017L\u00a8\u00c93\u00a1\u00b9\u0087$\"\u00e8\u00a8;\u00ef|\u0095\u00c2V\u001alwk\u00c9\u00df\u00ddl-.\u001f\u009a\"\f\u00bfM\u008a\u00ad\u0099\u00b4\u00af\u00c24\n\u00fd\u00eb\u009e\u001d*w\u0089\u0007\u00cf\u0015\u0089\u00e3\u0093\u000b\u00e5\u000e\u00db\u008c\u00f8\u0098\u00edA\u0083\u00a4\u00a26\u008b\"O%\u00a9\u00ba\u009d\u00fa\f\u00c7\u009b\u00dd\u0014z\u00d0\u00d9\u00be\u00f3\u0000\u00fe_5=if\u00a2dZ\u00c30(\b\u001e\u00a3+\u00daG\u00c2u)\u00b9\u0087$\u0099\u00f2\u00f9Y];pJ$\u0019\u008b\u00f3\\]\u00d6\u009a\u008e.DG\u001a\b\u0015$\u00b9\u00cf\u00dd]\u00af\u0086\u008a\ffx\u00db\u00a1\u0081\u00e3t\u0018\u00c2\u00c5_\u00c3\u00eef\u008d\u0093.\u00e9!\u00d0j\u00a0~1\u0094\u0095v\u00e4\u00c6\u009b\u00a3\u00eb&\u00e2\u000f\u0081I6(\u00bc\u00fb\u0095\u00f77\u0002\u00b8u\u008e\u009c%\u0019w\u000bc\u00b0@\u00ed\u00bb\"<\u001a\u00de\u00073\u009a\u009f\u00c3`\u008aY\u0084\u00b5\u00bf2\u00e9\u00dc\u00e4C\u00fb\u0004S\u0012\u00ac6\u00d2\u00de]G\u0015\u00fcm\u00fd>{>\u00fe\u00da\u00a9\n\u00f7l";
                var5_11 = "\u00f0o\u001c\u00afh\u0010\u00f91X\u00d0opC\u00a2\u00f9\u00aa\u00c2G\u00ab!v\u00176\u0098\u009f\u00bb\u00cfM=_j\u0007\u008f\u00e5\u0005i\u001efmh\u00aa\u0087\b\u00f9\u00bf\u00b2'\u009e\u00e9\u0017\u00af\u0017 \u00d1(\u0018\u00e4\u00a1mCx\u0080\u00f8\u0089\u00ce\u0005\u00de\u00e9\u00de\u0010\u0018\u00a4\u00e3\u00a0hYBi\b\u00a4HM\u00bc~\u0097\u001fF \u0099{g1Q\u00c9\u00e9.\u00faf\u00f0\u00d3\u0083\u00dc<e7\u0098-V\u00e6\u0018\u0082\u00a5\u009e|i\u00d5\u001e\u00f0\u00cd\u00f8\u00dc>\u00ecl0\u00f9\u00c3\u00bdu\u00d2\u00f2 \u0083\u00db*g`\u0018\u00fey?\u008cx\u009b\u00d9\u00e0\u00a6\u00f5\u0017L\u00a8\u00c93\u00a1\u00b9\u0087$\"\u00e8\u00a8;\u00ef|\u0095\u00c2V\u001alwk\u00c9\u00df\u00ddl-.\u001f\u009a\"\f\u00bfM\u008a\u00ad\u0099\u00b4\u00af\u00c24\n\u00fd\u00eb\u009e\u001d*w\u0089\u0007\u00cf\u0015\u0089\u00e3\u0093\u000b\u00e5\u000e\u00db\u008c\u00f8\u0098\u00edA\u0083\u00a4\u00a26\u008b\"O%\u00a9\u00ba\u009d\u00fa\f\u00c7\u009b\u00dd\u0014z\u00d0\u00d9\u00be\u00f3\u0000\u00fe_5=if\u00a2dZ\u00c30(\b\u001e\u00a3+\u00daG\u00c2u)\u00b9\u0087$\u0099\u00f2\u00f9Y];pJ$\u0019\u008b\u00f3\\]\u00d6\u009a\u008e.DG\u001a\b\u0015$\u00b9\u00cf\u00dd]\u00af\u0086\u008a\ffx\u00db\u00a1\u0081\u00e3t\u0018\u00c2\u00c5_\u00c3\u00eef\u008d\u0093.\u00e9!\u00d0j\u00a0~1\u0094\u0095v\u00e4\u00c6\u009b\u00a3\u00eb&\u00e2\u000f\u0081I6(\u00bc\u00fb\u0095\u00f77\u0002\u00b8u\u008e\u009c%\u0019w\u000bc\u00b0@\u00ed\u00bb\"<\u001a\u00de\u00073\u009a\u009f\u00c3`\u008aY\u0084\u00b5\u00bf2\u00e9\u00dc\u00e4C\u00fb\u0004S\u0012\u00ac6\u00d2\u00de]G\u0015\u00fcm\u00fd>{>\u00fe\u00da\u00a9\n\u00f7l".length();
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
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "e\u0084\u00e9\u00f4\u008a*\u0094\u00c9\u00f1\u000f)$\u00a4a\u00d2W";
                    var5_11 = "e\u0084\u00e9\u00f4\u008a*\u0094\u00c9\u00f1\u000f)$\u00a4a\u00d2W".length();
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
lbl126:
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
lbl137:
                // 1 sources

                ** continue;
            }
        }
        yn_2.c = var6_8;
        yn_2.f = new Integer[51];
        yn_2.g = new HashSet<E>();
        v22 = new Class[yn_2.a(31441, 5657808290425310730L)];
        v22[0] = Boolean.TYPE;
        v22[1] = Byte.TYPE;
        v22[2] = Short.TYPE;
        v22[3] = Integer.TYPE;
        v22[4] = Long.TYPE;
        v22[5] = Float.TYPE;
        v22[yn_2.a((int)9687, (long)7203648266006810904L)] = Double.TYPE;
        v22[yn_2.a((int)4689, (long)6139443281235961495L)] = Boolean.class;
        v22[yn_2.a((int)14167, (long)3534403949201376138L)] = Byte.class;
        v22[yn_2.a((int)24570, (long)1106742440228105001L)] = Short.class;
        v22[yn_2.a((int)7834, (long)2287588546005068385L)] = Integer.class;
        v22[yn_2.a((int)9467, (long)2162964067648491556L)] = Long.class;
        v22[yn_2.a((int)219, (long)4572262095367762982L)] = Float.class;
        v22[yn_2.a((int)30093, (long)2398795216609935681L)] = Double.class;
        v22[yn_2.a((int)14772, (long)8104049313086917965L)] = BigInteger.class;
        v22[yn_2.a((int)22511, (long)2540847392978117415L)] = BigDecimal.class;
        v22[yn_2.a((int)30037, (long)3211048488765522317L)] = String.class;
        var15_14 = v22;
        yn_2.g.addAll(Arrays.asList(var15_14));
    }

    public static void c(boolean bl) {
        j = bl;
    }

    public static boolean Y() {
        return j;
    }

    public static boolean o() {
        boolean bl = yn_2.Y();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (hi_0 hi_02) {
            throw yn_2.a(hi_02);
        }
        return false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF80F9) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 249;
                    break;
                }
                case 1: {
                    n14 = 102;
                    break;
                }
                case 2: {
                    n14 = 104;
                    break;
                }
                case 3: {
                    n14 = 19;
                    break;
                }
                case 4: {
                    n14 = 74;
                    break;
                }
                case 5: {
                    n14 = 206;
                    break;
                }
                case 6: {
                    n14 = 34;
                    break;
                }
                case 7: {
                    n14 = 100;
                    break;
                }
                case 8: {
                    n14 = 99;
                    break;
                }
                case 9: {
                    n14 = 2;
                    break;
                }
                case 10: {
                    n14 = 166;
                    break;
                }
                case 11: {
                    n14 = 149;
                    break;
                }
                case 12: {
                    n14 = 224;
                    break;
                }
                case 13: {
                    n14 = 62;
                    break;
                }
                case 14: {
                    n14 = 59;
                    break;
                }
                case 15: {
                    n14 = 140;
                    break;
                }
                case 16: {
                    n14 = 163;
                    break;
                }
                case 17: {
                    n14 = 53;
                    break;
                }
                case 18: {
                    n14 = 15;
                    break;
                }
                case 19: {
                    n14 = 225;
                    break;
                }
                case 20: {
                    n14 = 172;
                    break;
                }
                case 21: {
                    n14 = 31;
                    break;
                }
                case 22: {
                    n14 = 1;
                    break;
                }
                case 23: {
                    n14 = 121;
                    break;
                }
                case 24: {
                    n14 = 82;
                    break;
                }
                case 25: {
                    n14 = 126;
                    break;
                }
                case 26: {
                    n14 = 160;
                    break;
                }
                case 27: {
                    n14 = 109;
                    break;
                }
                case 28: {
                    n14 = 70;
                    break;
                }
                case 29: {
                    n14 = 130;
                    break;
                }
                case 30: {
                    n14 = 218;
                    break;
                }
                case 31: {
                    n14 = 245;
                    break;
                }
                case 32: {
                    n14 = 8;
                    break;
                }
                case 33: {
                    n14 = 161;
                    break;
                }
                case 34: {
                    n14 = 155;
                    break;
                }
                case 35: {
                    n14 = 116;
                    break;
                }
                case 36: {
                    n14 = 136;
                    break;
                }
                case 37: {
                    n14 = 78;
                    break;
                }
                case 38: {
                    n14 = 151;
                    break;
                }
                case 39: {
                    n14 = 139;
                    break;
                }
                case 40: {
                    n14 = 210;
                    break;
                }
                case 41: {
                    n14 = 207;
                    break;
                }
                case 42: {
                    n14 = 75;
                    break;
                }
                case 43: {
                    n14 = 181;
                    break;
                }
                case 44: {
                    n14 = 204;
                    break;
                }
                case 45: {
                    n14 = 3;
                    break;
                }
                case 46: {
                    n14 = 152;
                    break;
                }
                case 47: {
                    n14 = 28;
                    break;
                }
                case 48: {
                    n14 = 196;
                    break;
                }
                case 49: {
                    n14 = 193;
                    break;
                }
                case 50: {
                    n14 = 247;
                    break;
                }
                case 51: {
                    n14 = 183;
                    break;
                }
                case 52: {
                    n14 = 235;
                    break;
                }
                case 53: {
                    n14 = 205;
                    break;
                }
                case 54: {
                    n14 = 58;
                    break;
                }
                case 55: {
                    n14 = 87;
                    break;
                }
                case 56: {
                    n14 = 41;
                    break;
                }
                case 57: {
                    n14 = 215;
                    break;
                }
                case 58: {
                    n14 = 221;
                    break;
                }
                case 59: {
                    n14 = 72;
                    break;
                }
                case 60: {
                    n14 = 240;
                    break;
                }
                case 61: {
                    n14 = 203;
                    break;
                }
                case 62: {
                    n14 = 56;
                    break;
                }
                case 63: {
                    n14 = 112;
                    break;
                }
                case 64: {
                    n14 = 10;
                    break;
                }
                case 65: {
                    n14 = 76;
                    break;
                }
                case 66: {
                    n14 = 232;
                    break;
                }
                case 67: {
                    n14 = 117;
                    break;
                }
                case 68: {
                    n14 = 30;
                    break;
                }
                case 69: {
                    n14 = 153;
                    break;
                }
                case 70: {
                    n14 = 44;
                    break;
                }
                case 71: {
                    n14 = 107;
                    break;
                }
                case 72: {
                    n14 = 167;
                    break;
                }
                case 73: {
                    n14 = 158;
                    break;
                }
                case 74: {
                    n14 = 108;
                    break;
                }
                case 75: {
                    n14 = 20;
                    break;
                }
                case 76: {
                    n14 = 169;
                    break;
                }
                case 77: {
                    n14 = 50;
                    break;
                }
                case 78: {
                    n14 = 85;
                    break;
                }
                case 79: {
                    n14 = 228;
                    break;
                }
                case 80: {
                    n14 = 46;
                    break;
                }
                case 81: {
                    n14 = 212;
                    break;
                }
                case 82: {
                    n14 = 26;
                    break;
                }
                case 83: {
                    n14 = 174;
                    break;
                }
                case 84: {
                    n14 = 79;
                    break;
                }
                case 85: {
                    n14 = 23;
                    break;
                }
                case 86: {
                    n14 = 11;
                    break;
                }
                case 87: {
                    n14 = 33;
                    break;
                }
                case 88: {
                    n14 = 200;
                    break;
                }
                case 89: {
                    n14 = 243;
                    break;
                }
                case 90: {
                    n14 = 13;
                    break;
                }
                case 91: {
                    n14 = 251;
                    break;
                }
                case 92: {
                    n14 = 89;
                    break;
                }
                case 93: {
                    n14 = 54;
                    break;
                }
                case 94: {
                    n14 = 164;
                    break;
                }
                case 95: {
                    n14 = 132;
                    break;
                }
                case 96: {
                    n14 = 66;
                    break;
                }
                case 97: {
                    n14 = 254;
                    break;
                }
                case 98: {
                    n14 = 248;
                    break;
                }
                case 99: {
                    n14 = 36;
                    break;
                }
                case 100: {
                    n14 = 223;
                    break;
                }
                case 101: {
                    n14 = 60;
                    break;
                }
                case 102: {
                    n14 = 143;
                    break;
                }
                case 103: {
                    n14 = 97;
                    break;
                }
                case 104: {
                    n14 = 110;
                    break;
                }
                case 105: {
                    n14 = 122;
                    break;
                }
                case 106: {
                    n14 = 194;
                    break;
                }
                case 107: {
                    n14 = 7;
                    break;
                }
                case 108: {
                    n14 = 71;
                    break;
                }
                case 109: {
                    n14 = 253;
                    break;
                }
                case 110: {
                    n14 = 84;
                    break;
                }
                case 111: {
                    n14 = 14;
                    break;
                }
                case 112: {
                    n14 = 17;
                    break;
                }
                case 113: {
                    n14 = 4;
                    break;
                }
                case 114: {
                    n14 = 61;
                    break;
                }
                case 115: {
                    n14 = 195;
                    break;
                }
                case 116: {
                    n14 = 144;
                    break;
                }
                case 117: {
                    n14 = 134;
                    break;
                }
                case 118: {
                    n14 = 239;
                    break;
                }
                case 119: {
                    n14 = 229;
                    break;
                }
                case 120: {
                    n14 = 208;
                    break;
                }
                case 121: {
                    n14 = 47;
                    break;
                }
                case 122: {
                    n14 = 192;
                    break;
                }
                case 123: {
                    n14 = 202;
                    break;
                }
                case 124: {
                    n14 = 55;
                    break;
                }
                case 125: {
                    n14 = 237;
                    break;
                }
                case 126: {
                    n14 = 197;
                    break;
                }
                case 127: {
                    n14 = 68;
                    break;
                }
                case 128: {
                    n14 = 145;
                    break;
                }
                case 129: {
                    n14 = 106;
                    break;
                }
                case 130: {
                    n14 = 52;
                    break;
                }
                case 131: {
                    n14 = 124;
                    break;
                }
                case 132: {
                    n14 = 101;
                    break;
                }
                case 133: {
                    n14 = 173;
                    break;
                }
                case 134: {
                    n14 = 91;
                    break;
                }
                case 135: {
                    n14 = 238;
                    break;
                }
                case 136: {
                    n14 = 42;
                    break;
                }
                case 137: {
                    n14 = 219;
                    break;
                }
                case 138: {
                    n14 = 24;
                    break;
                }
                case 139: {
                    n14 = 81;
                    break;
                }
                case 140: {
                    n14 = 236;
                    break;
                }
                case 141: {
                    n14 = 188;
                    break;
                }
                case 142: {
                    n14 = 51;
                    break;
                }
                case 143: {
                    n14 = 32;
                    break;
                }
                case 144: {
                    n14 = 93;
                    break;
                }
                case 145: {
                    n14 = 178;
                    break;
                }
                case 146: {
                    n14 = 168;
                    break;
                }
                case 147: {
                    n14 = 175;
                    break;
                }
                case 148: {
                    n14 = 227;
                    break;
                }
                case 149: {
                    n14 = 142;
                    break;
                }
                case 150: {
                    n14 = 39;
                    break;
                }
                case 151: {
                    n14 = 191;
                    break;
                }
                case 152: {
                    n14 = 0;
                    break;
                }
                case 153: {
                    n14 = 199;
                    break;
                }
                case 154: {
                    n14 = 49;
                    break;
                }
                case 155: {
                    n14 = 182;
                    break;
                }
                case 156: {
                    n14 = 125;
                    break;
                }
                case 157: {
                    n14 = 114;
                    break;
                }
                case 158: {
                    n14 = 216;
                    break;
                }
                case 159: {
                    n14 = 190;
                    break;
                }
                case 160: {
                    n14 = 131;
                    break;
                }
                case 161: {
                    n14 = 6;
                    break;
                }
                case 162: {
                    n14 = 80;
                    break;
                }
                case 163: {
                    n14 = 209;
                    break;
                }
                case 164: {
                    n14 = 38;
                    break;
                }
                case 165: {
                    n14 = 184;
                    break;
                }
                case 166: {
                    n14 = 241;
                    break;
                }
                case 167: {
                    n14 = 220;
                    break;
                }
                case 168: {
                    n14 = 90;
                    break;
                }
                case 169: {
                    n14 = 111;
                    break;
                }
                case 170: {
                    n14 = 29;
                    break;
                }
                case 171: {
                    n14 = 27;
                    break;
                }
                case 172: {
                    n14 = 198;
                    break;
                }
                case 173: {
                    n14 = 201;
                    break;
                }
                case 174: {
                    n14 = 133;
                    break;
                }
                case 175: {
                    n14 = 21;
                    break;
                }
                case 176: {
                    n14 = 120;
                    break;
                }
                case 177: {
                    n14 = 77;
                    break;
                }
                case 178: {
                    n14 = 170;
                    break;
                }
                case 179: {
                    n14 = 147;
                    break;
                }
                case 180: {
                    n14 = 177;
                    break;
                }
                case 181: {
                    n14 = 138;
                    break;
                }
                case 182: {
                    n14 = 242;
                    break;
                }
                case 183: {
                    n14 = 35;
                    break;
                }
                case 184: {
                    n14 = 137;
                    break;
                }
                case 185: {
                    n14 = 185;
                    break;
                }
                case 186: {
                    n14 = 189;
                    break;
                }
                case 187: {
                    n14 = 214;
                    break;
                }
                case 188: {
                    n14 = 171;
                    break;
                }
                case 189: {
                    n14 = 16;
                    break;
                }
                case 190: {
                    n14 = 57;
                    break;
                }
                case 191: {
                    n14 = 180;
                    break;
                }
                case 192: {
                    n14 = 154;
                    break;
                }
                case 193: {
                    n14 = 213;
                    break;
                }
                case 194: {
                    n14 = 5;
                    break;
                }
                case 195: {
                    n14 = 48;
                    break;
                }
                case 196: {
                    n14 = 63;
                    break;
                }
                case 197: {
                    n14 = 45;
                    break;
                }
                case 198: {
                    n14 = 73;
                    break;
                }
                case 199: {
                    n14 = 252;
                    break;
                }
                case 200: {
                    n14 = 92;
                    break;
                }
                case 201: {
                    n14 = 244;
                    break;
                }
                case 202: {
                    n14 = 88;
                    break;
                }
                case 203: {
                    n14 = 113;
                    break;
                }
                case 204: {
                    n14 = 157;
                    break;
                }
                case 205: {
                    n14 = 105;
                    break;
                }
                case 206: {
                    n14 = 86;
                    break;
                }
                case 207: {
                    n14 = 22;
                    break;
                }
                case 208: {
                    n14 = 12;
                    break;
                }
                case 209: {
                    n14 = 222;
                    break;
                }
                case 210: {
                    n14 = 67;
                    break;
                }
                case 211: {
                    n14 = 186;
                    break;
                }
                case 212: {
                    n14 = 226;
                    break;
                }
                case 213: {
                    n14 = 25;
                    break;
                }
                case 214: {
                    n14 = 233;
                    break;
                }
                case 215: {
                    n14 = 64;
                    break;
                }
                case 216: {
                    n14 = 234;
                    break;
                }
                case 217: {
                    n14 = 37;
                    break;
                }
                case 218: {
                    n14 = 95;
                    break;
                }
                case 219: {
                    n14 = 159;
                    break;
                }
                case 220: {
                    n14 = 94;
                    break;
                }
                case 221: {
                    n14 = 150;
                    break;
                }
                case 222: {
                    n14 = 156;
                    break;
                }
                case 223: {
                    n14 = 165;
                    break;
                }
                case 224: {
                    n14 = 135;
                    break;
                }
                case 225: {
                    n14 = 250;
                    break;
                }
                case 226: {
                    n14 = 179;
                    break;
                }
                case 227: {
                    n14 = 129;
                    break;
                }
                case 228: {
                    n14 = 146;
                    break;
                }
                case 229: {
                    n14 = 141;
                    break;
                }
                case 230: {
                    n14 = 255;
                    break;
                }
                case 231: {
                    n14 = 40;
                    break;
                }
                case 232: {
                    n14 = 231;
                    break;
                }
                case 233: {
                    n14 = 162;
                    break;
                }
                case 234: {
                    n14 = 128;
                    break;
                }
                case 235: {
                    n14 = 96;
                    break;
                }
                case 236: {
                    n14 = 65;
                    break;
                }
                case 237: {
                    n14 = 119;
                    break;
                }
                case 238: {
                    n14 = 118;
                    break;
                }
                case 239: {
                    n14 = 176;
                    break;
                }
                case 240: {
                    n14 = 83;
                    break;
                }
                case 241: {
                    n14 = 98;
                    break;
                }
                case 242: {
                    n14 = 230;
                    break;
                }
                case 243: {
                    n14 = 115;
                    break;
                }
                case 244: {
                    n14 = 246;
                    break;
                }
                case 245: {
                    n14 = 43;
                    break;
                }
                case 246: {
                    n14 = 187;
                    break;
                }
                case 247: {
                    n14 = 9;
                    break;
                }
                case 248: {
                    n14 = 148;
                    break;
                }
                case 249: {
                    n14 = 69;
                    break;
                }
                case 250: {
                    n14 = 217;
                    break;
                }
                case 251: {
                    n14 = 103;
                    break;
                }
                case 252: {
                    n14 = 123;
                    break;
                }
                case 253: {
                    n14 = 211;
                    break;
                }
                case 254: {
                    n14 = 127;
                    break;
                }
                default: {
                    n14 = 18;
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
            yn_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x74DE;
        if (f[n11] == null) {
            yn_2.f[n11] = (int)(c[n11] ^ l2);
        }
        return f[n11];
    }
}

