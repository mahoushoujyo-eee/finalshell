/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.L6;
import com.NI;
import com._A;
import com._K;
import com._O;
import com.iv_0;
import com.iv_2;
import com.ph_0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/*
 * Renamed from com.xy
 */
public class xy_2
extends AbstractMap
implements Map,
Cloneable,
Serializable {
    volatile transient Set n;
    volatile transient Collection r;
    transient NI[] v;
    transient int t;
    int c;
    final float X;
    volatile transient int b;
    final int U;
    private transient Set L;
    private static final String[] a;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;

    private int s(String string) {
        int n10;
        block2: {
            int n11 = xy_2.a(25292, 3422688848555641083L) * this.U;
            int n12 = ph_0.u();
            for (int i2 = 0; i2 < string.length(); ++i2) {
                n10 = n11 * xy_2.a(25722, 354480240177712710L) ^ string.charAt(i2);
                if (n12 == 0) {
                    n11 = n10;
                    if (n12 == 0) continue;
                }
                break block2;
            }
            n10 = (n11 ^ n11 >> 1) & xy_2.a(9599, 2876523331689762631L);
        }
        return n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public xy_2(int n10, float f10) {
        int n11;
        int n12;
        block22: {
            int n13;
            block23: {
                block21: {
                    block19: {
                        float f11;
                        block20: {
                            block17: {
                                block18: {
                                    int n14 = ph_0.u();
                                    n12 = n14;
                                    try {
                                        try {
                                            this.n = null;
                                            this.r = null;
                                            this.U = new Random().nextInt(xy_2.a(1979, 3181557961431281039L));
                                            this.L = null;
                                            n13 = n10;
                                            if (n12 != 0) break block17;
                                            if (n13 >= 0) break block18;
                                            throw new IllegalArgumentException(xy_2.a(-30326, -32385) + n10);
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw xy_2.a(illegalArgumentException);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw xy_2.a(illegalArgumentException);
                                    }
                                }
                                n13 = n10;
                            }
                            try {
                                if (n12 != 0) break block19;
                                if (n13 <= xy_2.a(28063, 8041742057914107810L)) break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                            n10 = xy_2.a(28063, 8041742057914107810L);
                        }
                        n13 = (f11 = f10 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    }
                    try {
                        try {
                            if (n12 != 0) break block21;
                            if (n13 <= 0) throw new IllegalArgumentException(xy_2.a(-30325, 22816) + f10);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                        n13 = Float.isNaN(f10) ? 1 : 0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (n12 != 0) break block22;
                        if (n13 == 0) break block23;
                        throw new IllegalArgumentException(xy_2.a(-30325, 22816) + f10);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
            }
            n13 = n11 = 1;
        }
        while (n11 < n10) {
            n11 <<= 1;
            try {
                if (n12 != 0) return;
                if (n12 == 0) continue;
                break;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw xy_2.a(illegalArgumentException);
            }
        }
        this.X = f10;
        this.c = (int)((float)n11 * f10);
        this.v = new NI[n11];
        this.y();
    }

    public xy_2(int n10) {
        this(n10, 0.75f);
    }

    public xy_2() {
        this.n = null;
        this.r = null;
        this.U = new Random().nextInt(xy_2.a(12263, 374339204641768926L));
        this.L = null;
        this.X = 0.75f;
        this.c = xy_2.a(24634, 750735936114493964L);
        this.v = new NI[xy_2.a(10481, 5134747017816457921L)];
        this.y();
    }

    public xy_2(Map map) {
        this(Math.max((int)((float)map.size() / 0.75f) + 1, xy_2.a(21203, 8104284561115658473L)), 0.75f);
        this.m(map);
    }

    void y() {
    }

    static int d(int n10) {
        n10 *= n10;
        n10 ^= n10 >>> xy_2.a(5549, 6129187728456679318L) ^ n10 >>> xy_2.a(5148, 5925496626712149549L);
        return n10 ^ n10 >>> xy_2.a(29800, 8549009448377753181L) ^ n10 >>> 4;
    }

    static int O(int n10, int n11) {
        return n10 & n11 - 1;
    }

    @Override
    public int size() {
        return this.t;
    }

    @Override
    public boolean isEmpty() {
        boolean bl;
        block2: {
            block3: {
                int n10 = ph_0.u();
                try {
                    bl = this.t;
                    if (n10 != 0) break block2;
                    if (bl) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public Object get(Object var1_1) {
        block23: {
            block22: {
                block21: {
                    block20: {
                        var2_2 = ph_0.w();
                        try {
                            try {
                                v0 = var1_1;
                                if (var2_2 == 0) break block20;
                                if (v0 != null) break block21;
                            }
                            catch (IllegalArgumentException v1) {
                                throw xy_2.a(v1);
                            }
                            v0 = this.Y();
                        }
                        catch (IllegalArgumentException v2) {
                            throw xy_2.a(v2);
                        }
                    }
                    return v0;
                }
                var3_3 = 0;
                try {
                    v3 = var1_1 instanceof String;
                    if (var2_2 == 0) break block22;
                    if (v3 != 0) {
                    }
                    ** GOTO lbl29
                }
                catch (IllegalArgumentException v4) {
                    throw xy_2.a(v4);
                }
                var3_3 = xy_2.d(this.s((String)var1_1));
                try {
                    if (var2_2 != 0) break block23;
lbl29:
                    // 2 sources

                    v3 = xy_2.d(var1_1.hashCode());
                }
                catch (IllegalArgumentException v5) {
                    throw xy_2.a(v5);
                }
            }
            var3_3 = v3;
        }
        var4_4 = this.v[xy_2.O(var3_3, this.v.length)];
        while (var4_4 != null) {
            block24: {
                block25: {
                    block26: {
                        try {
                            v6 = var4_4;
                            if (var2_2 == 0) break block24;
                            if (v6.m != var3_3) break block25;
                        }
                        catch (IllegalArgumentException v7) {
                            throw xy_2.a(v7);
                        }
                        v8 = var4_4.V;
                        try {
                            block27: {
                                try {
                                    try {
                                        try {
                                            if (var2_2 == 0) break block26;
                                            if (v8 == var1_1) break block27;
                                        }
                                        catch (IllegalArgumentException v9) {
                                            throw xy_2.a(v9);
                                        }
                                        v8 = var1_1;
                                        if (var2_2 == 0) break block26;
                                    }
                                    catch (IllegalArgumentException v10) {
                                        throw xy_2.a(v10);
                                    }
                                    if (!v8.equals(var5_5)) break block25;
                                }
                                catch (IllegalArgumentException v11) {
                                    throw xy_2.a(v11);
                                }
                            }
                            v8 = var4_4.u;
                        }
                        catch (IllegalArgumentException v12) {
                            throw xy_2.a(v12);
                        }
                    }
                    return v8;
                }
                v6 = var4_4 = var4_4.N;
            }
            if (var2_2 != 0) continue;
        }
        return null;
    }

    private Object Y() {
        NI nI2 = this.v[0];
        int n10 = ph_0.w();
        while (nI2 != null) {
            block5: {
                NI nI3;
                block6: {
                    try {
                        try {
                            nI3 = nI2;
                            if (n10 == 0) break block5;
                            if (nI3.V != null) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                        return nI2.u;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                }
                nI3 = nI2 = nI2.N;
            }
            if (n10 != 0) continue;
        }
        return null;
    }

    @Override
    public boolean containsKey(Object object) {
        boolean bl;
        try {
            bl = this.j(object) != null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw xy_2.a(illegalArgumentException);
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final NI j(Object object) {
        int n10;
        int n11;
        block22: {
            int n12;
            block23: {
                block24: {
                    Object object2;
                    block20: {
                        block21: {
                            n11 = ph_0.u();
                            try {
                                try {
                                    object2 = object;
                                    if (n11 != 0) break block20;
                                    if (object2 != null) break block21;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw xy_2.a(illegalArgumentException);
                                }
                                n10 = 0;
                                break block22;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                        }
                        object2 = object;
                    }
                    try {
                        try {
                            n12 = object2 instanceof String;
                            if (n11 != 0) break block23;
                            if (n12 == 0) break block24;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                        n10 = xy_2.d(this.s((String)object));
                        break block22;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                }
                n12 = object.hashCode();
            }
            n10 = xy_2.d(n12);
        }
        int n13 = n10;
        NI nI2 = this.v[xy_2.O(n13, this.v.length)];
        while (nI2 != null) {
            block25: {
                NI nI3;
                block26: {
                    Object object3;
                    block28: {
                        block27: {
                            try {
                                nI3 = nI2;
                                if (n11 != 0) break block25;
                                if (nI3.m != n13) break block26;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                            object3 = nI2.V;
                            try {
                                try {
                                    if (n11 != 0) break block27;
                                    if (object3 == object) return nI2;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw xy_2.a(illegalArgumentException);
                                }
                                object3 = object;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                        }
                        try {
                            if (n11 != 0) break block28;
                            if (object3 == null) break block26;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                        object3 = object;
                    }
                    try {
                        Object object4;
                        if (object3.equals(object4)) {
                            return nI2;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                }
                nI3 = nI2 = nI2.N;
            }
            if (n11 == 0) continue;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public Object put(Object var1_1, Object var2_2) {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            var3_3 = ph_0.u();
                            try {
                                try {
                                    v0 = var1_1;
                                    if (var3_3 != 0) break block22;
                                    if (v0 != null) break block23;
                                }
                                catch (IllegalArgumentException v1) {
                                    throw xy_2.a(v1);
                                }
                                v0 = this.W(var2_2);
                            }
                            catch (IllegalArgumentException v2) {
                                throw xy_2.a(v2);
                            }
                        }
                        return v0;
                    }
                    var4_4 = 0;
                    try {
                        v3 = var1_1 instanceof String;
                        if (var3_3 != 0) break block24;
                        if (v3 != 0) {
                        }
                        ** GOTO lbl29
                    }
                    catch (IllegalArgumentException v4) {
                        throw xy_2.a(v4);
                    }
                    var4_4 = xy_2.d(this.s((String)var1_1));
                    try {
                        if (var3_3 == 0) break block25;
lbl29:
                        // 2 sources

                        v3 = xy_2.d(var1_1.hashCode());
                    }
                    catch (IllegalArgumentException v5) {
                        throw xy_2.a(v5);
                    }
                }
                var4_4 = v3;
            }
            var5_5 = xy_2.O(var4_4, this.v.length);
            var6_6 = this.v[var5_5];
            while (var6_6 != null) {
                block27: {
                    block28: {
                        block29: {
                            try {
                                try {
                                    if (var3_3 != 0) break block26;
                                    v6 = var6_6;
                                    if (var3_3 != 0) break block27;
                                }
                                catch (IllegalArgumentException v7) {
                                    throw xy_2.a(v7);
                                }
                                if (v6.m != var4_4) break block28;
                            }
                            catch (IllegalArgumentException v8) {
                                throw xy_2.a(v8);
                            }
                            v9 = var6_6.V;
                            try {
                                block30: {
                                    try {
                                        try {
                                            try {
                                                if (var3_3 != 0) break block29;
                                                if (v9 == var1_1) break block30;
                                            }
                                            catch (IllegalArgumentException v10) {
                                                throw xy_2.a(v10);
                                            }
                                            v9 = var1_1;
                                            if (var3_3 != 0) break block29;
                                        }
                                        catch (IllegalArgumentException v11) {
                                            throw xy_2.a(v11);
                                        }
                                        if (!v9.equals(var7_7)) break block28;
                                    }
                                    catch (IllegalArgumentException v12) {
                                        throw xy_2.a(v12);
                                    }
                                }
                                v9 = var6_6.u;
                            }
                            catch (IllegalArgumentException v13) {
                                throw xy_2.a(v13);
                            }
                        }
                        var8_8 = v9;
                        var6_6.u = var2_2;
                        return var8_8;
                    }
                    v6 = var6_6 = var6_6.N;
                }
                if (var3_3 == 0) continue;
            }
            ++this.b;
            this.E(var4_4, var1_1, var2_2, var5_5);
        }
        return null;
    }

    private Object W(Object object) {
        block5: {
            NI nI2 = this.v[0];
            int n10 = ph_0.w();
            while (nI2 != null) {
                block6: {
                    NI nI3;
                    block7: {
                        try {
                            try {
                                if (n10 == 0) break block5;
                                nI3 = nI2;
                                if (n10 == 0) break block6;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                            if (nI3.V != null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                        Object object2 = nI2.u;
                        nI2.u = object;
                        return object2;
                    }
                    nI3 = nI2 = nI2.N;
                }
                if (n10 != 0) continue;
            }
            ++this.b;
            this.E(0, null, object, 0);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private void L(Object var1_1, Object var2_2) {
        block28: {
            block25: {
                block26: {
                    block27: {
                        block23: {
                            block24: {
                                var3_3 = ph_0.w();
                                try {
                                    try {
                                        v0 = var1_1;
                                        if (var3_3 == 0) break block23;
                                        if (v0 != null) break block24;
                                    }
                                    catch (IllegalArgumentException v1) {
                                        throw xy_2.a(v1);
                                    }
                                    v2 = 0;
                                    break block25;
                                }
                                catch (IllegalArgumentException v3) {
                                    throw xy_2.a(v3);
                                }
                            }
                            v0 = var1_1;
                        }
                        try {
                            try {
                                v4 = v0 instanceof String;
                                if (var3_3 == 0) break block26;
                                if (v4 == 0) break block27;
                            }
                            catch (IllegalArgumentException v5) {
                                throw xy_2.a(v5);
                            }
                            v2 = xy_2.d(this.s((String)var1_1));
                            break block25;
                        }
                        catch (IllegalArgumentException v6) {
                            throw xy_2.a(v6);
                        }
                    }
                    v4 = var1_1.hashCode();
                }
                v2 = xy_2.d(v4);
            }
            var4_4 = v2;
            var5_5 = xy_2.O(var4_4, this.v.length);
            var6_6 = this.v[var5_5];
            while (var6_6 != null) {
                block29: {
                    block30: {
                        block32: {
                            block31: {
                                try {
                                    try {
                                        if (var3_3 == 0) break block28;
                                        v7 = var6_6;
                                        if (var3_3 == 0) break block29;
                                    }
                                    catch (IllegalArgumentException v8) {
                                        throw xy_2.a(v8);
                                    }
                                    if (v7.m != var4_4) break block30;
                                }
                                catch (IllegalArgumentException v9) {
                                    throw xy_2.a(v9);
                                }
                                v10 = var6_6.V;
                                try {
                                    try {
                                        if (var3_3 == 0) break block31;
                                        if (v10 != var1_1) {
                                        }
                                        ** GOTO lbl74
                                    }
                                    catch (IllegalArgumentException v11) {
                                        throw xy_2.a(v11);
                                    }
                                    v10 = var1_1;
                                }
                                catch (IllegalArgumentException v12) {
                                    throw xy_2.a(v12);
                                }
                            }
                            try {
                                if (var3_3 == 0) break block32;
                                if (v10 == null) break block30;
                            }
                            catch (IllegalArgumentException v13) {
                                throw xy_2.a(v13);
                            }
                            v10 = var1_1;
                        }
                        try {
                            if (!v10.equals(var7_7)) break block30;
lbl74:
                            // 2 sources

                            var6_6.u = var2_2;
                            return;
                        }
                        catch (IllegalArgumentException v14) {
                            throw xy_2.a(v14);
                        }
                    }
                    v7 = var6_6 = var6_6.N;
                }
                if (var3_3 != 0) continue;
            }
            this.Y(var4_4, var1_1, var2_2, var5_5);
        }
    }

    private void m(Map map) {
        Iterator iterator = map.entrySet().iterator();
        int n10 = ph_0.u();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            this.L(entry.getKey(), entry.getValue());
            if (n10 == 0) continue;
        }
    }

    void j(int n10) {
        int n11;
        block4: {
            block5: {
                NI[] nIArray = this.v;
                int n12 = nIArray.length;
                int n13 = ph_0.w();
                try {
                    try {
                        n11 = n12;
                        if (n13 == 0) break block4;
                        if (n11 != xy_2.a(28063, 8041742057914107810L)) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                    this.c = xy_2.a(23111, 2035113894466957433L);
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
            }
            n11 = n10;
        }
        NI[] nIArray = new NI[n11];
        this.g(nIArray);
        this.v = nIArray;
        this.c = (int)((float)n10 * this.X);
    }

    /*
     * Exception decompiling
     */
    void g(NI[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    public void putAll(Map map) {
        int n10;
        block19: {
            int n11;
            int n12;
            block20: {
                int n13;
                block21: {
                    int n14;
                    block18: {
                        int n15;
                        block16: {
                            block17: {
                                n15 = map.size();
                                n10 = ph_0.w();
                                try {
                                    n14 = n15;
                                    if (n10 == 0) break block16;
                                    if (n14 != 0) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw xy_2.a(illegalArgumentException);
                                }
                                return;
                            }
                            n14 = n15;
                        }
                        try {
                            try {
                                if (n10 == 0) break block18;
                                if (n14 <= this.c) break block19;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                            n14 = (int)((float)n15 / this.X + 1.0f);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                    }
                    n12 = n14;
                    try {
                        n13 = n12;
                        if (n10 == 0) break block20;
                        if (n13 <= xy_2.a(1197, 5503730584316800658L)) break block21;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                    n12 = xy_2.a(28063, 8041742057914107810L);
                }
                n13 = n11 = this.v.length;
            }
            while (n11 < n12) {
                n11 <<= 1;
                try {
                    if (n10 != 0) {
                        if (n10 != 0) continue;
                        break;
                    }
                    break block19;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
            }
            try {
                if (n11 > this.v.length) {
                    this.j(n11);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw xy_2.a(illegalArgumentException);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
            if (n10 != 0) continue;
        }
    }

    public Object remove(Object object) {
        Object object2;
        block6: {
            NI nI2;
            block4: {
                NI nI3;
                block5: {
                    nI3 = this.O(object);
                    int n10 = ph_0.u();
                    try {
                        try {
                            nI2 = nI3;
                            if (n10 != 0) break block4;
                            if (nI2 != null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                        object2 = null;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                }
                nI2 = nI3;
            }
            object2 = nI2.u;
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     */
    final NI O(Object var1_1) {
        block33: {
            block30: {
                block31: {
                    block32: {
                        block28: {
                            block29: {
                                var2_2 = ph_0.w();
                                try {
                                    try {
                                        v0 = var1_1;
                                        if (var2_2 == 0) break block28;
                                        if (v0 != null) break block29;
                                    }
                                    catch (IllegalArgumentException v1) {
                                        throw xy_2.a(v1);
                                    }
                                    v2 = 0;
                                    break block30;
                                }
                                catch (IllegalArgumentException v3) {
                                    throw xy_2.a(v3);
                                }
                            }
                            v0 = var1_1;
                        }
                        try {
                            try {
                                v4 = v0 instanceof String;
                                if (var2_2 == 0) break block31;
                                if (v4 == 0) break block32;
                            }
                            catch (IllegalArgumentException v5) {
                                throw xy_2.a(v5);
                            }
                            v2 = xy_2.d(this.s((String)var1_1));
                            break block30;
                        }
                        catch (IllegalArgumentException v6) {
                            throw xy_2.a(v6);
                        }
                    }
                    v4 = var1_1.hashCode();
                }
                v2 = xy_2.d(v4);
            }
            var3_3 = v2;
            var4_4 = xy_2.O(var3_3, this.v.length);
            var6_6 = var5_5 = this.v[var4_4];
            while (var6_6 != null) {
                block34: {
                    block35: {
                        block40: {
                            block38: {
                                block37: {
                                    block36: {
                                        var7_7 = var6_6.N;
                                        try {
                                            try {
                                                v7 = var6_6;
                                                if (var2_2 == 0) break block33;
                                                if (var2_2 == 0) break block34;
                                            }
                                            catch (IllegalArgumentException v8) {
                                                throw xy_2.a(v8);
                                            }
                                            if (v7.m != var3_3) break block35;
                                        }
                                        catch (IllegalArgumentException v9) {
                                            throw xy_2.a(v9);
                                        }
                                        v10 = var6_6.V;
                                        try {
                                            try {
                                                if (var2_2 == 0) break block36;
                                                if (v10 != var1_1) {
                                                }
                                                ** GOTO lbl78
                                            }
                                            catch (IllegalArgumentException v11) {
                                                throw xy_2.a(v11);
                                            }
                                            v10 = var1_1;
                                        }
                                        catch (IllegalArgumentException v12) {
                                            throw xy_2.a(v12);
                                        }
                                    }
                                    try {
                                        if (var2_2 == 0) break block37;
                                        if (v10 == null) break block35;
                                    }
                                    catch (IllegalArgumentException v13) {
                                        throw xy_2.a(v13);
                                    }
                                    v10 = var1_1;
                                }
                                try {
                                    block39: {
                                        try {
                                            try {
                                                try {
                                                    if (!v10.equals(var8_8)) break block35;
lbl78:
                                                    // 2 sources

                                                    ++this.b;
                                                    --this.t;
                                                    v14 = var5_5;
                                                    v15 = var6_6;
                                                    if (var2_2 == 0) break block38;
                                                }
                                                catch (IllegalArgumentException v16) {
                                                    throw xy_2.a(v16);
                                                }
                                                if (v14 != v15) break block39;
                                            }
                                            catch (IllegalArgumentException v17) {
                                                throw xy_2.a(v17);
                                            }
                                            this.v[var4_4] = var7_7;
                                            if (var2_2 != 0) break block40;
                                        }
                                        catch (IllegalArgumentException v18) {
                                            throw xy_2.a(v18);
                                        }
                                    }
                                    v14 = var5_5;
                                    v15 = var7_7;
                                }
                                catch (IllegalArgumentException v19) {
                                    throw xy_2.a(v19);
                                }
                            }
                            v14.N = v15;
                        }
                        return var6_6;
                    }
                    var5_5 = var6_6;
                    v20 = var6_6 = var7_7;
                }
                if (var2_2 != 0) continue;
            }
            v7 = var6_6;
        }
        return v7;
    }

    final NI H(Object object) {
        NI nI2;
        block36: {
            NI nI3;
            int n10;
            Map.Entry entry;
            int n11;
            block33: {
                int n12;
                block34: {
                    Object k2;
                    block35: {
                        Object k3;
                        block31: {
                            block32: {
                                Object object2;
                                block29: {
                                    block30: {
                                        n11 = ph_0.u();
                                        try {
                                            try {
                                                object2 = object;
                                                if (n11 != 0) break block29;
                                                if (object2 instanceof Map.Entry) break block30;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw xy_2.a(illegalArgumentException);
                                            }
                                            return null;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw xy_2.a(illegalArgumentException);
                                        }
                                    }
                                    object2 = object;
                                }
                                entry = (Map.Entry)object2;
                                k2 = entry.getKey();
                                try {
                                    try {
                                        k3 = k2;
                                        if (n11 != 0) break block31;
                                        if (k3 != null) break block32;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw xy_2.a(illegalArgumentException);
                                    }
                                    n10 = 0;
                                    break block33;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw xy_2.a(illegalArgumentException);
                                }
                            }
                            k3 = k2;
                        }
                        try {
                            try {
                                n12 = k3 instanceof String;
                                if (n11 != 0) break block34;
                                if (n12 == 0) break block35;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                            n10 = xy_2.d(this.s((String)k2));
                            break block33;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                    }
                    n12 = k2.hashCode();
                }
                n10 = xy_2.d(n12);
            }
            int n13 = n10;
            int n14 = xy_2.O(n13, this.v.length);
            NI nI4 = nI3 = this.v[n14];
            while (nI4 != null) {
                block37: {
                    NI nI5;
                    NI nI6;
                    block38: {
                        block41: {
                            NI nI7;
                            block39: {
                                nI6 = nI4.N;
                                try {
                                    NI nI8;
                                    block40: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    nI2 = nI4;
                                                                    if (n11 != 0) break block36;
                                                                    if (n11 != 0) break block37;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw xy_2.a(illegalArgumentException);
                                                                }
                                                                if (nI2.m != n13) break block38;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw xy_2.a(illegalArgumentException);
                                                            }
                                                            nI5 = nI4;
                                                            if (n11 != 0) break block37;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw xy_2.a(illegalArgumentException);
                                                        }
                                                        if (!nI5.equals(entry)) break block38;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw xy_2.a(illegalArgumentException);
                                                    }
                                                    ++this.b;
                                                    --this.t;
                                                    nI8 = nI3;
                                                    nI7 = nI4;
                                                    if (n11 != 0) break block39;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw xy_2.a(illegalArgumentException);
                                                }
                                                if (nI8 != nI7) break block40;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw xy_2.a(illegalArgumentException);
                                            }
                                            this.v[n14] = nI6;
                                            if (n11 == 0) break block41;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw xy_2.a(illegalArgumentException);
                                        }
                                    }
                                    nI8 = nI3;
                                    nI7 = nI6;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw xy_2.a(illegalArgumentException);
                                }
                            }
                            nI8.N = nI7;
                        }
                        return nI4;
                    }
                    nI3 = nI4;
                    nI5 = nI4 = nI6;
                }
                if (n11 == 0) continue;
            }
            nI2 = nI4;
        }
        return nI2;
    }

    @Override
    public void clear() {
        block4: {
            ++this.b;
            NI[] nIArray = this.v;
            int n10 = ph_0.w();
            for (int i2 = 0; i2 < nIArray.length; ++i2) {
                try {
                    nIArray[i2] = null;
                    if (n10 != 0) {
                        if (n10 != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
            }
            this.t = 0;
        }
    }

    @Override
    public boolean containsValue(Object object) {
        int n10 = ph_0.u();
        try {
            if (object == null) {
                return this.h();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw xy_2.a(illegalArgumentException);
        }
        NI[] nIArray = this.v;
        int n11 = 0;
        block4: while (true) {
            int n12 = n11;
            block5: while (n12 < nIArray.length) {
                NI nI2 = nIArray[n11];
                while (nI2 != null) {
                    block9: {
                        boolean bl;
                        block8: {
                            n12 = object.equals(nI2.u) ? 1 : 0;
                            if (n10 != 0) continue block5;
                            try {
                                if (n10 != 0) break block8;
                                if (n12 == 0) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                            bl = true;
                        }
                        return bl;
                    }
                    nI2 = nI2.N;
                    if (n10 == 0) continue;
                }
                ++n11;
                if (n10 == 0) continue block4;
            }
            break;
        }
        return false;
    }

    private boolean h() {
        NI[] nIArray = this.v;
        int n10 = ph_0.u();
        for (int i2 = 0; i2 < nIArray.length; ++i2) {
            NI nI2;
            NI nI3 = nI2 = nIArray[i2];
            while (nI2 != null) {
                block6: {
                    block7: {
                        nI3 = nI2;
                        if (n10 != 0) continue;
                        try {
                            try {
                                if (n10 != 0) break block6;
                                if (nI3.u != null) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xy_2.a(illegalArgumentException);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xy_2.a(illegalArgumentException);
                        }
                    }
                    NI nI4 = nI2 = nI2.N;
                }
                if (n10 == 0) continue;
            }
            if (n10 == 0) continue;
        }
        return false;
    }

    @Override
    public Object clone() {
        xy_2 xy_22 = null;
        try {
            xy_22 = (xy_2)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            // empty catch block
        }
        xy_22.v = new NI[this.v.length];
        xy_22.L = null;
        xy_22.b = 0;
        xy_22.t = 0;
        xy_22.y();
        xy_22.m(this);
        return xy_22;
    }

    void E(int n10, Object object, Object object2, int n11) {
        block5: {
            int n12;
            xy_2 xy_22;
            block4: {
                NI nI2 = this.v[n11];
                int n13 = ph_0.u();
                try {
                    try {
                        this.v[n11] = new NI(n10, object, object2, nI2);
                        xy_2 xy_23 = this;
                        xy_22 = xy_23;
                        n12 = xy_23.t;
                        if (n13 != 0) break block4;
                        xy_22.t = n12 + 1;
                        if (n12 < this.c) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xy_2.a(illegalArgumentException);
                    }
                    xy_22 = this;
                    n12 = 2 * this.v.length;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
            }
            xy_22.j(n12);
        }
    }

    void Y(int n10, Object object, Object object2, int n11) {
        NI nI2 = this.v[n11];
        this.v[n11] = new NI(n10, object, object2, nI2);
        ++this.t;
    }

    Iterator e() {
        return new _A(this, null);
    }

    Iterator P() {
        return new _O(this, null);
    }

    Iterator O() {
        return new _K(this, null);
    }

    public Set keySet() {
        Set set;
        block2: {
            block3: {
                Set set2 = this.n;
                int n10 = ph_0.w();
                try {
                    set = set2;
                    if (n10 == 0) break block2;
                    if (set == null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
                set = set2;
                break block2;
            }
            set = this.n = new iv_2(this, null);
        }
        return set;
    }

    public Collection values() {
        Collection collection;
        block2: {
            block3: {
                Collection collection2 = this.r;
                int n10 = ph_0.w();
                try {
                    collection = collection2;
                    if (n10 == 0) break block2;
                    if (collection == null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
                collection = collection2;
                break block2;
            }
            collection = this.r = new iv_0(this, null);
        }
        return collection;
    }

    public Set entrySet() {
        return this.L();
    }

    private Set L() {
        Set set;
        block2: {
            block3: {
                Set set2 = this.L;
                int n10 = ph_0.w();
                try {
                    set = set2;
                    if (n10 == 0) break block2;
                    if (set == null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xy_2.a(illegalArgumentException);
                }
                set = set2;
                break block2;
            }
            set = this.L = new L6(this, null);
        }
        return set;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator iterator;
        Iterator iterator2;
        int n10;
        block10: {
            block9: {
                xy_2 xy_22;
                block8: {
                    n10 = ph_0.u();
                    try {
                        try {
                            xy_22 = this;
                            if (n10 != 0) break block8;
                            if (xy_22.t <= 0) break block9;
                        }
                        catch (IOException iOException) {
                            throw xy_2.a(iOException);
                        }
                        xy_22 = this;
                    }
                    catch (IOException iOException) {
                        throw xy_2.a(iOException);
                    }
                }
                iterator2 = xy_22.L().iterator();
                break block10;
            }
            iterator2 = null;
        }
        Iterator iterator3 = iterator2;
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.v.length);
            objectOutputStream.writeInt(this.t);
            iterator = iterator3;
            if (n10 != 0) {
                return;
            }
            if (iterator == null) return;
        }
        catch (IOException iOException) {
            throw xy_2.a(iOException);
        }
        do {
            iterator = iterator3;
            if (!iterator.hasNext()) return;
            Map.Entry entry = (Map.Entry)iterator3.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        } while (n10 == 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int n10 = ph_0.w();
        int n11 = objectInputStream.readInt();
        this.v = new NI[n11];
        this.y();
        int n12 = n10;
        int n13 = objectInputStream.readInt();
        for (int i2 = 0; i2 < n13; ++i2) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            this.L(object, object2);
            if (n12 != 0) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "'\u0099\u00a3\u00c8\u00fdL\u009b\u0097\\\u00f2t\u00b7\u001e\u00bb\u00f5\u001c\u00cc\u009c\u001e\u00d6\u001c\u001a\u00e8\u009dZH\u00c2\\|\u0095\u00a5\u00b3\u00e6\u00ae\f\u008d\u00da~\u0092\u00f5\"o\u009a\u00ba\u008a!\u00ee]";
                    var12_3 = "'\u0099\u00a3\u00c8\u00fdL\u009b\u0097\\\u00f2t\u00b7\u001e\u00bb\u00f5\u001c\u00cc\u009c\u001e\u00d6\u001c\u001a\u00e8\u009dZH\u00c2\\|\u0095\u00a5\u00b3\u00e6\u00ae\f\u008d\u00da~\u0092\u00f5\"o\u009a\u00ba\u008a!\u00ee]".length();
                    var9_4 = 21;
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
                                    v11 = 104;
                                    break;
                                }
                                case 1: {
                                    v11 = 58;
                                    break;
                                }
                                case 2: {
                                    v11 = 49;
                                    break;
                                }
                                case 3: {
                                    v11 = 79;
                                    break;
                                }
                                case 4: {
                                    v11 = 94;
                                    break;
                                }
                                case 5: {
                                    v11 = 99;
                                    break;
                                }
                                default: {
                                    v11 = 127;
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
                xy_2.a = var13;
                xy_2.d = new String[2];
                var0_7 = 120398060458367585L;
                var6_8 = new long[14];
                var3_9 = 0;
                var4_10 = "\u00dcz_|\u00d8\u000e]\u00c3GHGe\u0093\u00f4U\u00b4$q\u00d4\u0003\u00d8\u00e3\u00b4\u00f3\u00f6\u00ad\u00cc\u00a0c\u0091\u0095\u00e7{\r\u00c7\u0094\u001fi\u0019 \u009d\u0000$\u0085\u00a3\\k\u00f5\u00e4\u00eb\u00e9M\r\u0013\u00a5\u00e3\u008e\u0088\u00e71^\u00bfb\u0098\u0082OA\u0096\u0091G\u00c4;n\u0092\u0004m\u0012(\u00b1q\u008b\u00ac;\u0012\u00ca\u0081O_\u00e5\u00d0\u00ac9\u00d1}\u00d0a";
                var5_11 = "\u00dcz_|\u00d8\u000e]\u00c3GHGe\u0093\u00f4U\u00b4$q\u00d4\u0003\u00d8\u00e3\u00b4\u00f3\u00f6\u00ad\u00cc\u00a0c\u0091\u0095\u00e7{\r\u00c7\u0094\u001fi\u0019 \u009d\u0000$\u0085\u00a3\\k\u00f5\u00e4\u00eb\u00e9M\r\u0013\u00a5\u00e3\u008e\u0088\u00e71^\u00bfb\u0098\u0082OA\u0096\u0091G\u00c4;n\u0092\u0004m\u0012(\u00b1q\u008b\u00ac;\u0012\u00ca\u0081O_\u00e5\u00d0\u00ac9\u00d1}\u00d0a".length();
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
                    var4_10 = "\u00eeR\u00fd@y\u00b7\u00a4@&m\u00ce\u009f\u00c16\u0018\u00b0";
                    var5_11 = "\u00eeR\u00fd@y\u00b7\u00a4@&m\u00ce\u009f\u00c16\u0018\u00b0".length();
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
        xy_2.e = var6_8;
        xy_2.f = new Integer[14];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF898B) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 167;
                    break;
                }
                case 1: {
                    n14 = 55;
                    break;
                }
                case 2: {
                    n14 = 156;
                    break;
                }
                case 3: {
                    n14 = 59;
                    break;
                }
                case 4: {
                    n14 = 215;
                    break;
                }
                case 5: {
                    n14 = 149;
                    break;
                }
                case 6: {
                    n14 = 42;
                    break;
                }
                case 7: {
                    n14 = 116;
                    break;
                }
                case 8: {
                    n14 = 131;
                    break;
                }
                case 9: {
                    n14 = 218;
                    break;
                }
                case 10: {
                    n14 = 220;
                    break;
                }
                case 11: {
                    n14 = 153;
                    break;
                }
                case 12: {
                    n14 = 211;
                    break;
                }
                case 13: {
                    n14 = 23;
                    break;
                }
                case 14: {
                    n14 = 110;
                    break;
                }
                case 15: {
                    n14 = 234;
                    break;
                }
                case 16: {
                    n14 = 29;
                    break;
                }
                case 17: {
                    n14 = 86;
                    break;
                }
                case 18: {
                    n14 = 236;
                    break;
                }
                case 19: {
                    n14 = 244;
                    break;
                }
                case 20: {
                    n14 = 178;
                    break;
                }
                case 21: {
                    n14 = 122;
                    break;
                }
                case 22: {
                    n14 = 65;
                    break;
                }
                case 23: {
                    n14 = 96;
                    break;
                }
                case 24: {
                    n14 = 138;
                    break;
                }
                case 25: {
                    n14 = 202;
                    break;
                }
                case 26: {
                    n14 = 245;
                    break;
                }
                case 27: {
                    n14 = 92;
                    break;
                }
                case 28: {
                    n14 = 41;
                    break;
                }
                case 29: {
                    n14 = 148;
                    break;
                }
                case 30: {
                    n14 = 223;
                    break;
                }
                case 31: {
                    n14 = 219;
                    break;
                }
                case 32: {
                    n14 = 77;
                    break;
                }
                case 33: {
                    n14 = 118;
                    break;
                }
                case 34: {
                    n14 = 9;
                    break;
                }
                case 35: {
                    n14 = 33;
                    break;
                }
                case 36: {
                    n14 = 210;
                    break;
                }
                case 37: {
                    n14 = 36;
                    break;
                }
                case 38: {
                    n14 = 85;
                    break;
                }
                case 39: {
                    n14 = 217;
                    break;
                }
                case 40: {
                    n14 = 253;
                    break;
                }
                case 41: {
                    n14 = 198;
                    break;
                }
                case 42: {
                    n14 = 46;
                    break;
                }
                case 43: {
                    n14 = 252;
                    break;
                }
                case 44: {
                    n14 = 94;
                    break;
                }
                case 45: {
                    n14 = 207;
                    break;
                }
                case 46: {
                    n14 = 4;
                    break;
                }
                case 47: {
                    n14 = 103;
                    break;
                }
                case 48: {
                    n14 = 15;
                    break;
                }
                case 49: {
                    n14 = 247;
                    break;
                }
                case 50: {
                    n14 = 141;
                    break;
                }
                case 51: {
                    n14 = 188;
                    break;
                }
                case 52: {
                    n14 = 134;
                    break;
                }
                case 53: {
                    n14 = 1;
                    break;
                }
                case 54: {
                    n14 = 142;
                    break;
                }
                case 55: {
                    n14 = 162;
                    break;
                }
                case 56: {
                    n14 = 69;
                    break;
                }
                case 57: {
                    n14 = 130;
                    break;
                }
                case 58: {
                    n14 = 228;
                    break;
                }
                case 59: {
                    n14 = 89;
                    break;
                }
                case 60: {
                    n14 = 199;
                    break;
                }
                case 61: {
                    n14 = 161;
                    break;
                }
                case 62: {
                    n14 = 21;
                    break;
                }
                case 63: {
                    n14 = 123;
                    break;
                }
                case 64: {
                    n14 = 19;
                    break;
                }
                case 65: {
                    n14 = 97;
                    break;
                }
                case 66: {
                    n14 = 5;
                    break;
                }
                case 67: {
                    n14 = 185;
                    break;
                }
                case 68: {
                    n14 = 150;
                    break;
                }
                case 69: {
                    n14 = 99;
                    break;
                }
                case 70: {
                    n14 = 105;
                    break;
                }
                case 71: {
                    n14 = 112;
                    break;
                }
                case 72: {
                    n14 = 14;
                    break;
                }
                case 73: {
                    n14 = 246;
                    break;
                }
                case 74: {
                    n14 = 137;
                    break;
                }
                case 75: {
                    n14 = 6;
                    break;
                }
                case 76: {
                    n14 = 108;
                    break;
                }
                case 77: {
                    n14 = 231;
                    break;
                }
                case 78: {
                    n14 = 53;
                    break;
                }
                case 79: {
                    n14 = 237;
                    break;
                }
                case 80: {
                    n14 = 227;
                    break;
                }
                case 81: {
                    n14 = 111;
                    break;
                }
                case 82: {
                    n14 = 120;
                    break;
                }
                case 83: {
                    n14 = 235;
                    break;
                }
                case 84: {
                    n14 = 50;
                    break;
                }
                case 85: {
                    n14 = 62;
                    break;
                }
                case 86: {
                    n14 = 177;
                    break;
                }
                case 87: {
                    n14 = 67;
                    break;
                }
                case 88: {
                    n14 = 197;
                    break;
                }
                case 89: {
                    n14 = 75;
                    break;
                }
                case 90: {
                    n14 = 182;
                    break;
                }
                case 91: {
                    n14 = 35;
                    break;
                }
                case 92: {
                    n14 = 251;
                    break;
                }
                case 93: {
                    n14 = 184;
                    break;
                }
                case 94: {
                    n14 = 24;
                    break;
                }
                case 95: {
                    n14 = 28;
                    break;
                }
                case 96: {
                    n14 = 127;
                    break;
                }
                case 97: {
                    n14 = 165;
                    break;
                }
                case 98: {
                    n14 = 20;
                    break;
                }
                case 99: {
                    n14 = 164;
                    break;
                }
                case 100: {
                    n14 = 193;
                    break;
                }
                case 101: {
                    n14 = 238;
                    break;
                }
                case 102: {
                    n14 = 151;
                    break;
                }
                case 103: {
                    n14 = 175;
                    break;
                }
                case 104: {
                    n14 = 152;
                    break;
                }
                case 105: {
                    n14 = 248;
                    break;
                }
                case 106: {
                    n14 = 192;
                    break;
                }
                case 107: {
                    n14 = 213;
                    break;
                }
                case 108: {
                    n14 = 145;
                    break;
                }
                case 109: {
                    n14 = 169;
                    break;
                }
                case 110: {
                    n14 = 179;
                    break;
                }
                case 111: {
                    n14 = 3;
                    break;
                }
                case 112: {
                    n14 = 233;
                    break;
                }
                case 113: {
                    n14 = 230;
                    break;
                }
                case 114: {
                    n14 = 39;
                    break;
                }
                case 115: {
                    n14 = 56;
                    break;
                }
                case 116: {
                    n14 = 160;
                    break;
                }
                case 117: {
                    n14 = 232;
                    break;
                }
                case 118: {
                    n14 = 126;
                    break;
                }
                case 119: {
                    n14 = 72;
                    break;
                }
                case 120: {
                    n14 = 212;
                    break;
                }
                case 121: {
                    n14 = 173;
                    break;
                }
                case 122: {
                    n14 = 208;
                    break;
                }
                case 123: {
                    n14 = 128;
                    break;
                }
                case 124: {
                    n14 = 124;
                    break;
                }
                case 125: {
                    n14 = 32;
                    break;
                }
                case 126: {
                    n14 = 57;
                    break;
                }
                case 127: {
                    n14 = 224;
                    break;
                }
                case 128: {
                    n14 = 166;
                    break;
                }
                case 129: {
                    n14 = 129;
                    break;
                }
                case 130: {
                    n14 = 229;
                    break;
                }
                case 131: {
                    n14 = 243;
                    break;
                }
                case 132: {
                    n14 = 104;
                    break;
                }
                case 133: {
                    n14 = 70;
                    break;
                }
                case 134: {
                    n14 = 168;
                    break;
                }
                case 135: {
                    n14 = 78;
                    break;
                }
                case 136: {
                    n14 = 154;
                    break;
                }
                case 137: {
                    n14 = 74;
                    break;
                }
                case 138: {
                    n14 = 195;
                    break;
                }
                case 139: {
                    n14 = 249;
                    break;
                }
                case 140: {
                    n14 = 100;
                    break;
                }
                case 141: {
                    n14 = 226;
                    break;
                }
                case 142: {
                    n14 = 254;
                    break;
                }
                case 143: {
                    n14 = 51;
                    break;
                }
                case 144: {
                    n14 = 121;
                    break;
                }
                case 145: {
                    n14 = 88;
                    break;
                }
                case 146: {
                    n14 = 187;
                    break;
                }
                case 147: {
                    n14 = 101;
                    break;
                }
                case 148: {
                    n14 = 63;
                    break;
                }
                case 149: {
                    n14 = 11;
                    break;
                }
                case 150: {
                    n14 = 10;
                    break;
                }
                case 151: {
                    n14 = 136;
                    break;
                }
                case 152: {
                    n14 = 45;
                    break;
                }
                case 153: {
                    n14 = 181;
                    break;
                }
                case 154: {
                    n14 = 48;
                    break;
                }
                case 155: {
                    n14 = 255;
                    break;
                }
                case 156: {
                    n14 = 34;
                    break;
                }
                case 157: {
                    n14 = 221;
                    break;
                }
                case 158: {
                    n14 = 242;
                    break;
                }
                case 159: {
                    n14 = 79;
                    break;
                }
                case 160: {
                    n14 = 66;
                    break;
                }
                case 161: {
                    n14 = 140;
                    break;
                }
                case 162: {
                    n14 = 60;
                    break;
                }
                case 163: {
                    n14 = 83;
                    break;
                }
                case 164: {
                    n14 = 49;
                    break;
                }
                case 165: {
                    n14 = 125;
                    break;
                }
                case 166: {
                    n14 = 135;
                    break;
                }
                case 167: {
                    n14 = 200;
                    break;
                }
                case 168: {
                    n14 = 250;
                    break;
                }
                case 169: {
                    n14 = 61;
                    break;
                }
                case 170: {
                    n14 = 203;
                    break;
                }
                case 171: {
                    n14 = 71;
                    break;
                }
                case 172: {
                    n14 = 132;
                    break;
                }
                case 173: {
                    n14 = 146;
                    break;
                }
                case 174: {
                    n14 = 106;
                    break;
                }
                case 175: {
                    n14 = 102;
                    break;
                }
                case 176: {
                    n14 = 8;
                    break;
                }
                case 177: {
                    n14 = 90;
                    break;
                }
                case 178: {
                    n14 = 87;
                    break;
                }
                case 179: {
                    n14 = 30;
                    break;
                }
                case 180: {
                    n14 = 12;
                    break;
                }
                case 181: {
                    n14 = 170;
                    break;
                }
                case 182: {
                    n14 = 47;
                    break;
                }
                case 183: {
                    n14 = 38;
                    break;
                }
                case 184: {
                    n14 = 139;
                    break;
                }
                case 185: {
                    n14 = 209;
                    break;
                }
                case 186: {
                    n14 = 76;
                    break;
                }
                case 187: {
                    n14 = 73;
                    break;
                }
                case 188: {
                    n14 = 27;
                    break;
                }
                case 189: {
                    n14 = 54;
                    break;
                }
                case 190: {
                    n14 = 143;
                    break;
                }
                case 191: {
                    n14 = 17;
                    break;
                }
                case 192: {
                    n14 = 2;
                    break;
                }
                case 193: {
                    n14 = 158;
                    break;
                }
                case 194: {
                    n14 = 222;
                    break;
                }
                case 195: {
                    n14 = 95;
                    break;
                }
                case 196: {
                    n14 = 13;
                    break;
                }
                case 197: {
                    n14 = 52;
                    break;
                }
                case 198: {
                    n14 = 174;
                    break;
                }
                case 199: {
                    n14 = 107;
                    break;
                }
                case 200: {
                    n14 = 119;
                    break;
                }
                case 201: {
                    n14 = 190;
                    break;
                }
                case 202: {
                    n14 = 22;
                    break;
                }
                case 203: {
                    n14 = 186;
                    break;
                }
                case 204: {
                    n14 = 113;
                    break;
                }
                case 205: {
                    n14 = 16;
                    break;
                }
                case 206: {
                    n14 = 114;
                    break;
                }
                case 207: {
                    n14 = 157;
                    break;
                }
                case 208: {
                    n14 = 82;
                    break;
                }
                case 209: {
                    n14 = 191;
                    break;
                }
                case 210: {
                    n14 = 239;
                    break;
                }
                case 211: {
                    n14 = 26;
                    break;
                }
                case 212: {
                    n14 = 25;
                    break;
                }
                case 213: {
                    n14 = 31;
                    break;
                }
                case 214: {
                    n14 = 214;
                    break;
                }
                case 215: {
                    n14 = 117;
                    break;
                }
                case 216: {
                    n14 = 84;
                    break;
                }
                case 217: {
                    n14 = 98;
                    break;
                }
                case 218: {
                    n14 = 81;
                    break;
                }
                case 219: {
                    n14 = 163;
                    break;
                }
                case 220: {
                    n14 = 204;
                    break;
                }
                case 221: {
                    n14 = 109;
                    break;
                }
                case 222: {
                    n14 = 225;
                    break;
                }
                case 223: {
                    n14 = 196;
                    break;
                }
                case 224: {
                    n14 = 240;
                    break;
                }
                case 225: {
                    n14 = 80;
                    break;
                }
                case 226: {
                    n14 = 43;
                    break;
                }
                case 227: {
                    n14 = 44;
                    break;
                }
                case 228: {
                    n14 = 216;
                    break;
                }
                case 229: {
                    n14 = 144;
                    break;
                }
                case 230: {
                    n14 = 68;
                    break;
                }
                case 231: {
                    n14 = 7;
                    break;
                }
                case 232: {
                    n14 = 91;
                    break;
                }
                case 233: {
                    n14 = 241;
                    break;
                }
                case 234: {
                    n14 = 205;
                    break;
                }
                case 235: {
                    n14 = 171;
                    break;
                }
                case 236: {
                    n14 = 37;
                    break;
                }
                case 237: {
                    n14 = 64;
                    break;
                }
                case 238: {
                    n14 = 159;
                    break;
                }
                case 239: {
                    n14 = 18;
                    break;
                }
                case 240: {
                    n14 = 133;
                    break;
                }
                case 241: {
                    n14 = 58;
                    break;
                }
                case 242: {
                    n14 = 189;
                    break;
                }
                case 243: {
                    n14 = 147;
                    break;
                }
                case 244: {
                    n14 = 115;
                    break;
                }
                case 245: {
                    n14 = 155;
                    break;
                }
                case 246: {
                    n14 = 194;
                    break;
                }
                case 247: {
                    n14 = 172;
                    break;
                }
                case 248: {
                    n14 = 206;
                    break;
                }
                case 249: {
                    n14 = 0;
                    break;
                }
                case 250: {
                    n14 = 201;
                    break;
                }
                case 251: {
                    n14 = 40;
                    break;
                }
                case 252: {
                    n14 = 176;
                    break;
                }
                case 253: {
                    n14 = 93;
                    break;
                }
                case 254: {
                    n14 = 180;
                    break;
                }
                default: {
                    n14 = 183;
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
            xy_2.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6A3D;
        if (f[n11] == null) {
            xy_2.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

