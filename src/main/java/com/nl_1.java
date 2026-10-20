/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.S7;
import com.ak_0;
import com.en_0;
import com.hi_0;
import com.nv_2;
import com.ok_0;
import com.uh_0;
import com.wk_0;
import com.ym_1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.nL
 */
public class nl_1
extends nv_2 {
    protected final en_0 B;
    public final ym_1 w;
    private int k = 0;
    private String R = "\t";
    private String V;
    private DateFormat T;
    private String n;
    protected IdentityHashMap Y = null;
    protected uh_0 W;
    protected TimeZone D = ok_0.X;
    protected Locale y = ok_0.Y;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;
    private static final long f;

    public nl_1() {
        this(new ym_1(), en_0.p());
    }

    public nl_1(ym_1 ym_12) {
        this(ym_12, en_0.p());
    }

    public nl_1(en_0 en_02) {
        this(new ym_1(), en_02);
    }

    public nl_1(ym_1 ym_12, en_0 en_02) {
        this.w = ym_12;
        this.B = en_02;
    }

    public String N() {
        nl_1 nl_12;
        block4: {
            block5: {
                String string = nv_2.o();
                try {
                    try {
                        nl_12 = this;
                        if (string == null) break block4;
                        if (!(nl_12.T instanceof SimpleDateFormat)) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw nl_1.a(hi_02);
                    }
                    return ((SimpleDateFormat)this.T).toPattern();
                }
                catch (hi_0 hi_03) {
                    throw nl_1.a(hi_03);
                }
            }
            nl_12 = this;
        }
        return nl_12.V;
    }

    public DateFormat x() {
        DateFormat dateFormat;
        block8: {
            nl_1 nl_12;
            block10: {
                block9: {
                    String string = nv_2.o();
                    try {
                        try {
                            try {
                                try {
                                    dateFormat = this.T;
                                    if (string == null) break block8;
                                    if (dateFormat != null) break block9;
                                }
                                catch (hi_0 hi_02) {
                                    throw nl_1.a(hi_02);
                                }
                                nl_12 = this;
                                if (string == null) break block10;
                            }
                            catch (hi_0 hi_03) {
                                throw nl_1.a(hi_03);
                            }
                            if (nl_12.V == null) break block9;
                        }
                        catch (hi_0 hi_04) {
                            throw nl_1.a(hi_04);
                        }
                        this.T = this.v(this.V);
                    }
                    catch (hi_0 hi_05) {
                        throw nl_1.a(hi_05);
                    }
                }
                nl_12 = this;
            }
            dateFormat = nl_12.T;
        }
        return dateFormat;
    }

    private DateFormat v(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string, this.y);
        simpleDateFormat.setTimeZone(this.D);
        return simpleDateFormat;
    }

    public void r(DateFormat dateFormat) {
        block5: {
            block4: {
                this.T = dateFormat;
                String string = nv_2.o();
                try {
                    nl_1 nl_12;
                    try {
                        nl_12 = this;
                        if (string == null) break block4;
                        if (nl_12.V == null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw nl_1.a(hi_02);
                    }
                    nl_12 = this;
                }
                catch (hi_0 hi_03) {
                    throw nl_1.a(hi_03);
                }
            }
            nl_12.V = null;
        }
    }

    public void W(String string) {
        block5: {
            block4: {
                this.V = string;
                String string2 = nv_2.o();
                try {
                    nl_1 nl_12;
                    try {
                        nl_12 = this;
                        if (string2 == null) break block4;
                        if (nl_12.T == null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw nl_1.a(hi_02);
                    }
                    nl_12 = this;
                }
                catch (hi_0 hi_03) {
                    throw nl_1.a(hi_03);
                }
            }
            nl_12.T = null;
        }
    }

    public void Q(String string) {
        this.n = string;
    }

    public String z() {
        return this.n;
    }

    public uh_0 z() {
        return this.W;
    }

    public void S(uh_0 uh_02) {
        this.W = uh_02;
    }

    public void N(uh_0 uh_02, Object object, Object object2, int n10) {
        this.c(uh_02, object, object2, n10, 0);
    }

    public void c(uh_0 uh_02, Object object, Object object2, int n10, int n11) {
        block10: {
            Object object3;
            block11: {
                nl_1 nl_12;
                String string;
                block8: {
                    block9: {
                        string = nv_2.o();
                        try {
                            try {
                                nl_12 = this;
                                if (string == null) break block8;
                                if (!nl_12.w.g) break block9;
                            }
                            catch (hi_0 hi_02) {
                                throw nl_1.a(hi_02);
                            }
                            return;
                        }
                        catch (hi_0 hi_03) {
                            throw nl_1.a(hi_03);
                        }
                    }
                    this.W = new uh_0(uh_02, object, object2, n10, n11);
                    nl_12 = this;
                }
                try {
                    try {
                        object3 = nl_12.Y;
                        if (string == null) break block10;
                        if (object3 != null) break block11;
                    }
                    catch (hi_0 hi_04) {
                        throw nl_1.a(hi_04);
                    }
                    this.Y = new IdentityHashMap();
                }
                catch (hi_0 hi_05) {
                    throw nl_1.a(hi_05);
                }
            }
            object3 = this.Y.put(object, this.W);
        }
    }

    public void E(Object object, Object object2) {
        this.N(this.W, object, object2, 0);
    }

    public void T() {
        block5: {
            block4: {
                String string = nv_2.o();
                try {
                    nl_1 nl_12;
                    try {
                        nl_12 = this;
                        if (string == null) break block4;
                        if (nl_12.W == null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw nl_1.a(hi_02);
                    }
                    nl_12 = this;
                }
                catch (hi_0 hi_03) {
                    throw nl_1.a(hi_03);
                }
            }
            nl_12.W = this.W.M;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean x(Type type, Object object) {
        uh_0 uh_02;
        block12: {
            String string = nv_2.o();
            try {
                try {
                    try {
                        try {
                            boolean bl;
                            try {
                                try {
                                    if (!this.w.I(EP.WriteClassName)) return false;
                                    if (type != null) return true;
                                }
                                catch (hi_0 hi_02) {
                                    throw nl_1.a(hi_02);
                                }
                                bl = this.w.I(EP.NotWriteRootClassName);
                                if (string == null) return bl;
                            }
                            catch (hi_0 hi_03) {
                                throw nl_1.a(hi_03);
                            }
                            if (!bl) return true;
                        }
                        catch (hi_0 hi_04) {
                            throw nl_1.a(hi_04);
                        }
                        uh_02 = this.W;
                        if (string == null) break block12;
                    }
                    catch (hi_0 hi_05) {
                        throw nl_1.a(hi_05);
                    }
                    if (uh_02 == null) return false;
                }
                catch (hi_0 hi_06) {
                    throw nl_1.a(hi_06);
                }
                uh_02 = this.W.M;
            }
            catch (hi_0 hi_07) {
                throw nl_1.a(hi_07);
            }
        }
        if (uh_02 == null) return false;
        return true;
    }

    public boolean S(Object object) {
        boolean bl;
        block28: {
            block29: {
                block27: {
                    Object object2;
                    Object object3;
                    String string;
                    block26: {
                        Object object4;
                        block24: {
                            uh_0 uh_02;
                            block25: {
                                block22: {
                                    block23: {
                                        IdentityHashMap identityHashMap;
                                        block20: {
                                            block21: {
                                                string = nv_2.o();
                                                try {
                                                    try {
                                                        identityHashMap = this.Y;
                                                        if (string == null) break block20;
                                                        if (identityHashMap != null) break block21;
                                                    }
                                                    catch (hi_0 hi_02) {
                                                        throw nl_1.a(hi_02);
                                                    }
                                                    return false;
                                                }
                                                catch (hi_0 hi_03) {
                                                    throw nl_1.a(hi_03);
                                                }
                                            }
                                            identityHashMap = this.Y.get(object);
                                        }
                                        uh_02 = (uh_0)((Object)identityHashMap);
                                        try {
                                            try {
                                                object4 = uh_02;
                                                if (string == null) break block22;
                                                if (object4 != null) break block23;
                                            }
                                            catch (hi_0 hi_04) {
                                                throw nl_1.a(hi_04);
                                            }
                                            return false;
                                        }
                                        catch (hi_0 hi_05) {
                                            throw nl_1.a(hi_05);
                                        }
                                    }
                                    object4 = object;
                                }
                                try {
                                    try {
                                        if (string == null) break block24;
                                        if (object4 != Collections.emptyMap()) break block25;
                                    }
                                    catch (hi_0 hi_06) {
                                        throw nl_1.a(hi_06);
                                    }
                                    return false;
                                }
                                catch (hi_0 hi_07) {
                                    throw nl_1.a(hi_07);
                                }
                            }
                            object4 = uh_02.D;
                        }
                        object3 = object4;
                        try {
                            object2 = object3;
                            if (string == null) break block26;
                            if (object2 == null) break block27;
                        }
                        catch (hi_0 hi_08) {
                            throw nl_1.a(hi_08);
                        }
                        object2 = object3;
                    }
                    try {
                        try {
                            try {
                                bl = object2 instanceof Integer;
                                if (string == null) break block28;
                                if (bl) break block27;
                            }
                            catch (hi_0 hi_09) {
                                throw nl_1.a(hi_09);
                            }
                            bl = object3 instanceof String;
                            if (string == null) break block28;
                        }
                        catch (hi_0 hi_010) {
                            throw nl_1.a(hi_010);
                        }
                        if (!bl) break block29;
                    }
                    catch (hi_0 hi_011) {
                        throw nl_1.a(hi_011);
                    }
                }
                bl = true;
                break block28;
            }
            bl = false;
        }
        return bl;
    }

    public void G(Object object) {
        block26: {
            Object object2;
            block24: {
                uh_0 uh_02;
                String string;
                block22: {
                    uh_0 uh_03;
                    uh_0 uh_04;
                    block23: {
                        block21: {
                            block20: {
                                uh_04 = this.W;
                                string = nv_2.o();
                                Object object3 = uh_04.Q;
                                try {
                                    try {
                                        if (string == null) break block20;
                                        if (object != object3) break block21;
                                    }
                                    catch (hi_0 hi_02) {
                                        throw nl_1.a(hi_02);
                                    }
                                    this.w.write(nl_1.a(11860, -31103));
                                }
                                catch (hi_0 hi_03) {
                                    throw nl_1.a(hi_03);
                                }
                            }
                            return;
                        }
                        uh_0 uh_05 = uh_04.M;
                        try {
                            try {
                                try {
                                    uh_03 = uh_05;
                                    if (string == null) break block22;
                                    if (uh_03 == null) break block23;
                                }
                                catch (hi_0 hi_04) {
                                    throw nl_1.a(hi_04);
                                }
                                if (object != uh_05.Q) break block23;
                            }
                            catch (hi_0 hi_05) {
                                throw nl_1.a(hi_05);
                            }
                            this.w.write(nl_1.a(11867, 6822));
                            return;
                        }
                        catch (hi_0 hi_06) {
                            throw nl_1.a(hi_06);
                        }
                    }
                    uh_03 = uh_02 = uh_04;
                }
                do {
                    if (uh_02.M == null) {
                        try {
                            if (string == null) continue;
                            if (string != null) break;
                        }
                        catch (hi_0 hi_07) {
                            throw nl_1.a(hi_07);
                        }
                    }
                    uh_02 = uh_02.M;
                } while (string != null);
                try {
                    block25: {
                        try {
                            try {
                                object2 = object;
                                if (string == null) break block24;
                                if (object2 != uh_02.Q) break block25;
                            }
                            catch (hi_0 hi_08) {
                                throw nl_1.a(hi_08);
                            }
                            this.w.write(nl_1.a(11866, -14590));
                            if (string != null) break block26;
                        }
                        catch (hi_0 hi_09) {
                            throw nl_1.a(hi_09);
                        }
                    }
                    this.w.write(nl_1.a(11861, -28101));
                    object2 = this.Y.get(object);
                }
                catch (hi_0 hi_010) {
                    throw nl_1.a(hi_010);
                }
            }
            String string = ((uh_0)object2).toString();
            this.w.write(string);
            this.w.write(nl_1.a(11862, -4785));
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean m(nv_2 var1_1) {
        block37: {
            block44: {
                block38: {
                    block43: {
                        block41: {
                            block39: {
                                block35: {
                                    var2_2 = nv_2.o();
                                    try {
                                        block36: {
                                            try {
                                                try {
                                                    try {
                                                        v0 = this.p;
                                                        if (var2_2 == null) break block35;
                                                        if (v0 == null) break block36;
                                                    }
                                                    catch (hi_0 v1) {
                                                        throw nl_1.a(v1);
                                                    }
                                                    v2 = this.p.size();
                                                    if (var2_2 == null) break block37;
                                                }
                                                catch (hi_0 v3) {
                                                    throw nl_1.a(v3);
                                                }
                                                if (v2 > 0) break block38;
                                            }
                                            catch (hi_0 v4) {
                                                throw nl_1.a(v4);
                                            }
                                        }
                                        v0 = this.x;
                                    }
                                    catch (hi_0 v5) {
                                        throw nl_1.a(v5);
                                    }
                                }
                                try {
                                    block40: {
                                        try {
                                            try {
                                                try {
                                                    if (var2_2 == null) break block39;
                                                    if (v0 == null) break block40;
                                                }
                                                catch (hi_0 v6) {
                                                    throw nl_1.a(v6);
                                                }
                                                v2 = this.x.size();
                                                if (var2_2 == null) break block37;
                                            }
                                            catch (hi_0 v7) {
                                                throw nl_1.a(v7);
                                            }
                                            if (v2 > 0) break block38;
                                        }
                                        catch (hi_0 v8) {
                                            throw nl_1.a(v8);
                                        }
                                    }
                                    v0 = var1_1.p;
                                }
                                catch (hi_0 v9) {
                                    throw nl_1.a(v9);
                                }
                            }
                            try {
                                block42: {
                                    try {
                                        try {
                                            try {
                                                if (var2_2 == null) break block41;
                                                if (v0 == null) break block42;
                                            }
                                            catch (hi_0 v10) {
                                                throw nl_1.a(v10);
                                            }
                                            v2 = var1_1.p.size();
                                            if (var2_2 == null) break block37;
                                        }
                                        catch (hi_0 v11) {
                                            throw nl_1.a(v11);
                                        }
                                        if (v2 > 0) break block38;
                                    }
                                    catch (hi_0 v12) {
                                        throw nl_1.a(v12);
                                    }
                                }
                                v0 = var1_1.x;
                            }
                            catch (hi_0 v13) {
                                throw nl_1.a(v13);
                            }
                        }
                        try {
                            try {
                                if (var2_2 == null) break block43;
                                if (v0 != null) {
                                }
                                ** GOTO lbl97
                            }
                            catch (hi_0 v14) {
                                throw nl_1.a(v14);
                            }
                            v0 = var1_1.x;
                        }
                        catch (hi_0 v15) {
                            throw nl_1.a(v15);
                        }
                    }
                    try {
                        try {
                            try {
                                v2 = v0.size();
                                if (var2_2 == null) break block37;
                                if (v2 > 0) break block38;
                            }
                            catch (hi_0 v16) {
                                throw nl_1.a(v16);
                            }
lbl97:
                            // 2 sources

                            v2 = (int)this.w.z;
                            if (var2_2 == null) break block37;
                        }
                        catch (hi_0 v17) {
                            throw nl_1.a(v17);
                        }
                        if (v2 == 0) break block44;
                    }
                    catch (hi_0 v18) {
                        throw nl_1.a(v18);
                    }
                }
                v2 = 1;
                break block37;
            }
            v2 = 0;
        }
        return (boolean)v2;
    }

    public boolean o(nv_2 nv_22) {
        char n10;
        block16: {
            block19: {
                block17: {
                    List list;
                    String string;
                    block18: {
                        block14: {
                            string = nv_2.o();
                            try {
                                block15: {
                                    try {
                                        try {
                                            try {
                                                list = this.U;
                                                if (string == null) break block14;
                                                if (list == null) break block15;
                                            }
                                            catch (hi_0 hi_02) {
                                                throw nl_1.a(hi_02);
                                            }
                                            n10 = this.U.size();
                                            if (string == null) break block16;
                                        }
                                        catch (hi_0 hi_03) {
                                            throw nl_1.a(hi_03);
                                        }
                                        if (n10 > '\u0000') break block17;
                                    }
                                    catch (hi_0 hi_04) {
                                        throw nl_1.a(hi_04);
                                    }
                                }
                                list = nv_22.U;
                            }
                            catch (hi_0 hi_05) {
                                throw nl_1.a(hi_05);
                            }
                        }
                        try {
                            try {
                                if (string == null) break block18;
                                if (list == null) break block19;
                            }
                            catch (hi_0 hi_06) {
                                throw nl_1.a(hi_06);
                            }
                            list = nv_22.U;
                        }
                        catch (hi_0 hi_07) {
                            throw nl_1.a(hi_07);
                        }
                    }
                    try {
                        n10 = list.size();
                        if (string == null) break block16;
                        if (n10 <= '\u0000') break block19;
                    }
                    catch (hi_0 hi_08) {
                        throw nl_1.a(hi_08);
                    }
                }
                n10 = '\u0001';
                break block16;
            }
            n10 = '\u0000';
        }
        return n10 != '\u0000';
    }

    public boolean T(nv_2 nv_22) {
        char n10;
        block16: {
            block19: {
                block17: {
                    List list;
                    String string;
                    block18: {
                        block14: {
                            string = nv_2.o();
                            try {
                                block15: {
                                    try {
                                        try {
                                            try {
                                                list = this.m;
                                                if (string == null) break block14;
                                                if (list == null) break block15;
                                            }
                                            catch (hi_0 hi_02) {
                                                throw nl_1.a(hi_02);
                                            }
                                            n10 = this.m.size();
                                            if (string == null) break block16;
                                        }
                                        catch (hi_0 hi_03) {
                                            throw nl_1.a(hi_03);
                                        }
                                        if (n10 > '\u0000') break block17;
                                    }
                                    catch (hi_0 hi_04) {
                                        throw nl_1.a(hi_04);
                                    }
                                }
                                list = nv_22.m;
                            }
                            catch (hi_0 hi_05) {
                                throw nl_1.a(hi_05);
                            }
                        }
                        try {
                            try {
                                if (string == null) break block18;
                                if (list == null) break block19;
                            }
                            catch (hi_0 hi_06) {
                                throw nl_1.a(hi_06);
                            }
                            list = nv_22.m;
                        }
                        catch (hi_0 hi_07) {
                            throw nl_1.a(hi_07);
                        }
                    }
                    try {
                        n10 = list.size();
                        if (string == null) break block16;
                        if (n10 <= '\u0000') break block19;
                    }
                    catch (hi_0 hi_08) {
                        throw nl_1.a(hi_08);
                    }
                }
                n10 = '\u0001';
                break block16;
            }
            n10 = '\u0000';
        }
        return n10 != '\u0000';
    }

    public int a() {
        return this.k;
    }

    public void C() {
        ++this.k;
    }

    public void r() {
        --this.k;
    }

    public void i() {
        String string = nv_2.o();
        this.w.write(nl_1.a(9078, 3490853001805057648L));
        String string2 = string;
        for (int i2 = 0; i2 < this.k; ++i2) {
            this.w.write(this.R);
            if (string2 != null) continue;
        }
    }

    public ym_1 S() {
        return this.w;
    }

    public String toString() {
        return this.w.toString();
    }

    public void D(EP eP, boolean bl) {
        this.w.k(eP, bl);
    }

    public boolean z(EP eP) {
        return this.w.I(eP);
    }

    public void e() {
        this.w.Y();
    }

    public en_0 K() {
        return this.B;
    }

    public static void p(Writer writer, Object object) {
        try (ym_1 ym_12 = new ym_1();){
            nl_1 nl_12 = new nl_1(ym_12);
            nl_12.B(object);
            ym_12.F(writer);
        }
    }

    public static void c(ym_1 ym_12, Object object) {
        nl_1 nl_12 = new nl_1(ym_12);
        nl_12.B(object);
    }

    /*
     * Loose catch block
     */
    public final void B(Object object) {
        Object object2;
        block7: {
            block6: {
                String string = nv_2.o();
                object2 = object;
                if (string == null) break block7;
                try {
                    block8: {
                        if (object2 != null) break block6;
                        break block8;
                        catch (IOException iOException) {
                            throw nl_1.a(iOException);
                        }
                    }
                    this.w.Y();
                    return;
                }
                catch (IOException iOException) {
                    throw nl_1.a(iOException);
                }
            }
            object2 = object;
        }
        Class<?> clazz = object2.getClass();
        ak_0 ak_02 = this.E(clazz);
        try {
            ak_02.u(this, object, null, null, 0);
        }
        catch (IOException iOException) {
            throw new hi_0(iOException.getMessage(), iOException);
        }
    }

    /*
     * Loose catch block
     */
    public final void K(Object object, Class clazz) {
        block6: {
            block7: {
                String string = nv_2.o();
                if (string == null) break block7;
                try {
                    block8: {
                        if (object != null) break block6;
                        break block8;
                        catch (IOException iOException) {
                            throw nl_1.a(iOException);
                        }
                    }
                    this.w.Y();
                }
                catch (IOException iOException) {
                    throw nl_1.a(iOException);
                }
            }
            return;
        }
        ak_0 ak_02 = this.E(clazz);
        try {
            ak_02.u(this, object, null, null, 0);
        }
        catch (IOException iOException) {
            throw new hi_0(iOException.getMessage(), iOException);
        }
    }

    public final void c(Object object, Object object2) {
        this.I(object, object2, null, 0);
    }

    protected final void A(char c2, String string, Object object) {
        block4: {
            block5: {
                String string2 = nv_2.o();
                try {
                    try {
                        if (string2 == null) break block4;
                        if (c2 == '\u0000') break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw nl_1.a(hi_02);
                    }
                    this.w.write(c2);
                }
                catch (hi_0 hi_03) {
                    throw nl_1.a(hi_03);
                }
            }
            this.w.u(string);
            this.B(object);
        }
    }

    public final void I(Object object, Object object2, Type type, int n10) {
        String string = nv_2.o();
        try {
            Object object3;
            block4: {
                block5: {
                    try {
                        object3 = object;
                        if (string == null) break block4;
                        if (object3 != null) break block5;
                    }
                    catch (IOException iOException) {
                        throw nl_1.a(iOException);
                    }
                    this.w.Y();
                    return;
                }
                object3 = object;
            }
            Class<?> clazz = object3.getClass();
            ak_0 ak_02 = this.E(clazz);
            ak_02.u(this, object, object2, type, n10);
        }
        catch (IOException iOException) {
            throw new hi_0(iOException.getMessage(), iOException);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void l(Object var1_1, String var2_2) {
        block81: {
            block71: {
                block70: {
                    block63: {
                        block64: {
                            block68: {
                                block67: {
                                    block66: {
                                        block65: {
                                            block55: {
                                                block56: {
                                                    block59: {
                                                        block60: {
                                                            block62: {
                                                                block61: {
                                                                    block76: {
                                                                        block57: {
                                                                            block58: {
                                                                                block74: {
                                                                                    var3_3 = nv_2.o();
                                                                                    v0 = var1_1 instanceof Date;
                                                                                    if (var3_3 == null) break block55;
                                                                                    if (!v0) break block56;
                                                                                    break block74;
                                                                                    catch (IllegalArgumentException v1) {
                                                                                        throw nl_1.a(v1);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block75: {
                                                                                        v2 = nl_1.a(11858, -15011).equals(var2_2);
                                                                                        if (var3_3 == null) break block57;
                                                                                        break block75;
                                                                                        catch (IllegalArgumentException v3) {
                                                                                            throw nl_1.a(v3);
                                                                                        }
                                                                                    }
                                                                                    if (!v2) break block58;
                                                                                }
                                                                                catch (IllegalArgumentException v4) {
                                                                                    throw nl_1.a(v4);
                                                                                }
                                                                                var4_4 = ((Date)var1_1).getTime() / nl_1.f;
                                                                                this.w.v((int)var4_4);
                                                                                return;
                                                                            }
                                                                            v2 = nl_1.a(11864, -28283).equals(var2_2);
                                                                        }
                                                                        try {
                                                                            if (v2) {
                                                                                this.w.i(((Date)var1_1).getTime());
                                                                                return;
                                                                            }
                                                                        }
                                                                        catch (IllegalArgumentException v5) {
                                                                            throw nl_1.a(v5);
                                                                        }
                                                                        var4_5 = this.x();
                                                                        v6 = var4_5;
                                                                        if (var3_3 == null) break block59;
                                                                        if (v6 != null) break block60;
                                                                        break block76;
                                                                        catch (IllegalArgumentException v7) {
                                                                            throw nl_1.a(v7);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block77: {
                                                                            v8 = var2_2;
                                                                            if (var3_3 == null) break block61;
                                                                            break block77;
                                                                            catch (IllegalArgumentException v9) {
                                                                                throw nl_1.a(v9);
                                                                            }
                                                                        }
                                                                        if (v8 != null) {
                                                                        }
                                                                        ** GOTO lbl65
                                                                    }
                                                                    catch (IllegalArgumentException v10) {
                                                                        throw nl_1.a(v10);
                                                                    }
                                                                    try {
                                                                        var4_5 = this.v(var2_2);
                                                                        break block60;
                                                                    }
                                                                    catch (IllegalArgumentException var5_8) {
                                                                        var6_12 = var2_2.replaceAll("T", nl_1.a(11859, 14725));
                                                                        var4_5 = this.v(var6_12);
                                                                        if (var3_3 != null) break block60;
lbl65:
                                                                        // 2 sources

                                                                        try {
                                                                            block78: {
                                                                                v11 = this;
                                                                                if (var3_3 == null) break block62;
                                                                                break block78;
                                                                                catch (IllegalArgumentException v12) {
                                                                                    throw nl_1.a(v12);
                                                                                }
                                                                            }
                                                                            v8 = v11.n;
                                                                        }
                                                                        catch (IllegalArgumentException v13) {
                                                                            throw nl_1.a(v13);
                                                                        }
                                                                    }
                                                                }
                                                                if (v8 == null) ** GOTO lbl81
                                                                var4_5 = this.v(this.n);
                                                                try {
                                                                    if (var3_3 != null) break block60;
lbl81:
                                                                    // 2 sources

                                                                    v11 = this;
                                                                }
                                                                catch (IllegalArgumentException v14) {
                                                                    throw nl_1.a(v14);
                                                                }
                                                            }
                                                            var4_5 = v11.v(ok_0.z);
                                                        }
                                                        v6 = var4_5;
                                                    }
                                                    var5_9 = v6.format((Date)var1_1);
                                                    this.w.y(var5_9);
                                                    return;
                                                }
                                                v0 = var1_1 instanceof byte[];
                                            }
                                            try {
                                                if (var3_3 == null) break block63;
                                                if (!v0) break block64;
                                            }
                                            catch (IllegalArgumentException v15) {
                                                throw nl_1.a(v15);
                                            }
                                            var4_6 = (byte[])var1_1;
                                            v16 = nl_1.a(11865, 18259).equals(var2_2);
                                            if (var3_3 == null) break block65;
                                            try {
                                                block79: {
                                                    if (v16) break block66;
                                                    break block79;
                                                    catch (IllegalArgumentException v17) {
                                                        throw nl_1.a(v17);
                                                    }
                                                }
                                                v16 = nl_1.a(11856, -13883).equals(var2_2);
                                            }
                                            catch (IllegalArgumentException v18) {
                                                throw nl_1.a(v18);
                                            }
                                        }
                                        try {
                                            if (var3_3 == null) break block67;
                                            if (v16) {
                                            }
                                            ** GOTO lbl143
                                        }
                                        catch (IllegalArgumentException v19) {
                                            throw nl_1.a(v19);
                                        }
                                    }
                                    var5_10 = null;
                                    try {
                                        var6_13 = new ByteArrayOutputStream();
                                        var5_10 = var4_6.length < nl_1.a(4155, 2386301453292731711L) ? new GZIPOutputStream((OutputStream)var6_13, var4_6.length) : new GZIPOutputStream(var6_13);
                                        var5_10.write(var4_6);
                                        var5_10.finish();
                                        this.w.B(var6_13.toByteArray());
                                    }
                                    catch (IOException var6_14) {
                                        try {
                                            throw new hi_0(nl_1.a(11857, 13217), var6_14);
                                        }
                                        catch (Throwable var7_16) {
                                            S7.o(var5_10);
                                            throw var7_16;
                                        }
                                    }
                                    S7.o(var5_10);
                                    try {
                                        if (var3_3 != null) break block68;
lbl143:
                                        // 2 sources

                                        v16 = nl_1.a(11863, -20371).equals(var2_2);
                                    }
                                    catch (IllegalArgumentException v20) {
                                        throw nl_1.a(v20);
                                    }
                                }
                                try {
                                    block69: {
                                        try {
                                            if (!v16) break block69;
                                            this.w.W(var4_6);
                                            if (var3_3 != null) break block68;
                                        }
                                        catch (IllegalArgumentException v21) {
                                            throw nl_1.a(v21);
                                        }
                                    }
                                    this.w.B(var4_6);
                                }
                                catch (IllegalArgumentException v22) {
                                    throw nl_1.a(v22);
                                }
                            }
                            return;
                        }
                        try {
                            v23 = var1_1;
                            if (var3_3 == null) break block70;
                            v0 = v23 instanceof Collection;
                        }
                        catch (IllegalArgumentException v24) {
                            throw nl_1.a(v24);
                        }
                    }
                    if (!v0) break block81;
                    v23 = var1_1;
                }
                var4_7 = (Collection)v23;
                var5_11 = var4_7.iterator();
                this.w.write(nl_1.a(16542, 2117451915135135134L));
                var6_15 = 0;
                while (var6_15 < var4_7.size()) {
                    block72: {
                        block73: {
                            var7_17 = var5_11.next();
                            try {
                                try {
                                    try {
                                        if (var3_3 == null) break block71;
                                        if (var3_3 == null) break block72;
                                    }
                                    catch (IllegalArgumentException v25) {
                                        throw nl_1.a(v25);
                                    }
                                    if (var6_15 == 0) break block73;
                                }
                                catch (IllegalArgumentException v26) {
                                    throw nl_1.a(v26);
                                }
                                this.w.write(nl_1.a(6274, 1782675968294188423L));
                            }
                            catch (IllegalArgumentException v27) {
                                throw nl_1.a(v27);
                            }
                        }
                        this.l(var7_17, var2_2);
                        ++var6_15;
                    }
                    if (var3_3 != null) continue;
                }
                this.w.write(nl_1.a(3626, 4843756110726882093L));
            }
            return;
        }
        this.B(var1_1);
    }

    public final void l(String string) {
        wk_0.b.X(this, string);
    }

    public ak_0 E(Class clazz) {
        return this.B.O(clazz);
    }

    public void g() {
        this.w.close();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var15 = new String[12];
                            var13_1 = 0;
                            var12_2 = "\u00ca5\u008d\u00de\u0010\u00c9`A\u0003\u00d6\rX\u000b\u00d6\u0093^\u00942\u0082{T\u0085\u00c7\u00ee\u0015+\u00e0\u00f3\u00f7\u00ce(\u0082\u0002pc\u00ab\u00fa\u0007\u00990\u0018\u0018\u00f6)\u0081\u009e\u0002 \u0081\u0003\u00a8\u00ban\fJH\u001f\u00be\u00b7\u0081\u00e8\u00f9\u009bd\u0094(\t\u009e\"\u0085\u00f3\u00e4(\u0082\u00cc\u00d6\f\u00ef\u00a7\u00abC!>:\u000e\u00c1\u00fe\u00df\u0093\r^\u00c7\u009dO\u00e7\u00bf\u00e2>\u00da\u00f2\u00b0\u0006\u008c";
                            var14_3 = "\u00ca5\u008d\u00de\u0010\u00c9`A\u0003\u00d6\rX\u000b\u00d6\u0093^\u00942\u0082{T\u0085\u00c7\u00ee\u0015+\u00e0\u00f3\u00f7\u00ce(\u0082\u0002pc\u00ab\u00fa\u0007\u00990\u0018\u0018\u00f6)\u0081\u009e\u0002 \u0081\u0003\u00a8\u00ban\fJH\u001f\u00be\u00b7\u0081\u00e8\u00f9\u009bd\u0094(\t\u009e\"\u0085\u00f3\u00e4(\u0082\u00cc\u00d6\f\u00ef\u00a7\u00abC!>:\u000e\u00c1\u00fe\u00df\u0093\r^\u00c7\u009dO\u00e7\u00bf\u00e2>\u00da\u00f2\u00b0\u0006\u008c".length();
                            var11_4 = 8;
                            var10_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 62;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "\u00fc\u00b0\u0093[\u00ad3\u0004\u00c1\u0094z\u00b2";
                                var14_3 = "\u00fc\u00b0\u0093[\u00ad3\u0004\u00c1\u0094z\u00b2".length();
                                var11_4 = 6;
                                var10_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 56;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 110;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 50;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 82;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 28;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 34;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 118;
                                        break;
                                    }
                                    default: {
                                        v15 = 72;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var16_6;
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
                        } while (v10 > var16_6);
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
                    nl_1.a = var15;
                    nl_1.b = new String[12];
                    var2_7 = 428152985575890518L;
                    var8_8 = new long[5];
                    var5_9 = 0;
                    var6_10 = "A\u00b9\u00a4\u00a4dD\u00e1i\u0091\u00e6G\u00cd)\n\u00eb\u00fd\u000b\u00ac\u00c2\u000bytP,";
                    var7_11 = "A\u00b9\u00a4\u00a4dD\u00e1i\u0091\u00e6G\u00cd)\n\u00eb\u00fd\u000b\u00ac\u00c2\u000bytP,".length();
                    var4_12 = 0;
                    while (true) {
                        var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                        v17 = var8_8;
                        v18 = var5_9++;
                        v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl112:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "B\u00cd\u0010\u00ef\u00c0F\u00fd&\u0004\u00d6% x_\u00b3\u0093";
                        var7_11 = "B\u00cd\u0010\u00ef\u00c0F\u00fd&\u0004\u00d6% x_\u00b3\u0093".length();
                        var4_12 = 0;
                        while (true) {
                            var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                            v17 = var8_8;
                            v18 = var5_9++;
                            v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl125:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var2_7;
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
            nl_1.c = var8_8;
            nl_1.e = new Integer[5];
            break block31;
lbl141:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 275667276499653199L;
        ** while (true)
        nl_1.f = 275667276499653031L ^ var0_14;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x2E52) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 209;
                    break;
                }
                case 1: {
                    n14 = 171;
                    break;
                }
                case 2: {
                    n14 = 175;
                    break;
                }
                case 3: {
                    n14 = 44;
                    break;
                }
                case 4: {
                    n14 = 0;
                    break;
                }
                case 5: {
                    n14 = 23;
                    break;
                }
                case 6: {
                    n14 = 140;
                    break;
                }
                case 7: {
                    n14 = 40;
                    break;
                }
                case 8: {
                    n14 = 8;
                    break;
                }
                case 9: {
                    n14 = 21;
                    break;
                }
                case 10: {
                    n14 = 191;
                    break;
                }
                case 11: {
                    n14 = 118;
                    break;
                }
                case 12: {
                    n14 = 247;
                    break;
                }
                case 13: {
                    n14 = 63;
                    break;
                }
                case 14: {
                    n14 = 49;
                    break;
                }
                case 15: {
                    n14 = 160;
                    break;
                }
                case 16: {
                    n14 = 124;
                    break;
                }
                case 17: {
                    n14 = 202;
                    break;
                }
                case 18: {
                    n14 = 132;
                    break;
                }
                case 19: {
                    n14 = 136;
                    break;
                }
                case 20: {
                    n14 = 180;
                    break;
                }
                case 21: {
                    n14 = 139;
                    break;
                }
                case 22: {
                    n14 = 91;
                    break;
                }
                case 23: {
                    n14 = 41;
                    break;
                }
                case 24: {
                    n14 = 219;
                    break;
                }
                case 25: {
                    n14 = 58;
                    break;
                }
                case 26: {
                    n14 = 32;
                    break;
                }
                case 27: {
                    n14 = 225;
                    break;
                }
                case 28: {
                    n14 = 103;
                    break;
                }
                case 29: {
                    n14 = 129;
                    break;
                }
                case 30: {
                    n14 = 128;
                    break;
                }
                case 31: {
                    n14 = 9;
                    break;
                }
                case 32: {
                    n14 = 94;
                    break;
                }
                case 33: {
                    n14 = 101;
                    break;
                }
                case 34: {
                    n14 = 252;
                    break;
                }
                case 35: {
                    n14 = 31;
                    break;
                }
                case 36: {
                    n14 = 68;
                    break;
                }
                case 37: {
                    n14 = 164;
                    break;
                }
                case 38: {
                    n14 = 148;
                    break;
                }
                case 39: {
                    n14 = 168;
                    break;
                }
                case 40: {
                    n14 = 102;
                    break;
                }
                case 41: {
                    n14 = 48;
                    break;
                }
                case 42: {
                    n14 = 163;
                    break;
                }
                case 43: {
                    n14 = 181;
                    break;
                }
                case 44: {
                    n14 = 20;
                    break;
                }
                case 45: {
                    n14 = 95;
                    break;
                }
                case 46: {
                    n14 = 104;
                    break;
                }
                case 47: {
                    n14 = 117;
                    break;
                }
                case 48: {
                    n14 = 241;
                    break;
                }
                case 49: {
                    n14 = 33;
                    break;
                }
                case 50: {
                    n14 = 207;
                    break;
                }
                case 51: {
                    n14 = 93;
                    break;
                }
                case 52: {
                    n14 = 239;
                    break;
                }
                case 53: {
                    n14 = 97;
                    break;
                }
                case 54: {
                    n14 = 234;
                    break;
                }
                case 55: {
                    n14 = 76;
                    break;
                }
                case 56: {
                    n14 = 186;
                    break;
                }
                case 57: {
                    n14 = 205;
                    break;
                }
                case 58: {
                    n14 = 250;
                    break;
                }
                case 59: {
                    n14 = 98;
                    break;
                }
                case 60: {
                    n14 = 141;
                    break;
                }
                case 61: {
                    n14 = 79;
                    break;
                }
                case 62: {
                    n14 = 248;
                    break;
                }
                case 63: {
                    n14 = 231;
                    break;
                }
                case 64: {
                    n14 = 12;
                    break;
                }
                case 65: {
                    n14 = 213;
                    break;
                }
                case 66: {
                    n14 = 238;
                    break;
                }
                case 67: {
                    n14 = 216;
                    break;
                }
                case 68: {
                    n14 = 166;
                    break;
                }
                case 69: {
                    n14 = 81;
                    break;
                }
                case 70: {
                    n14 = 80;
                    break;
                }
                case 71: {
                    n14 = 106;
                    break;
                }
                case 72: {
                    n14 = 222;
                    break;
                }
                case 73: {
                    n14 = 113;
                    break;
                }
                case 74: {
                    n14 = 172;
                    break;
                }
                case 75: {
                    n14 = 194;
                    break;
                }
                case 76: {
                    n14 = 123;
                    break;
                }
                case 77: {
                    n14 = 133;
                    break;
                }
                case 78: {
                    n14 = 223;
                    break;
                }
                case 79: {
                    n14 = 157;
                    break;
                }
                case 80: {
                    n14 = 215;
                    break;
                }
                case 81: {
                    n14 = 13;
                    break;
                }
                case 82: {
                    n14 = 70;
                    break;
                }
                case 83: {
                    n14 = 111;
                    break;
                }
                case 84: {
                    n14 = 195;
                    break;
                }
                case 85: {
                    n14 = 22;
                    break;
                }
                case 86: {
                    n14 = 224;
                    break;
                }
                case 87: {
                    n14 = 3;
                    break;
                }
                case 88: {
                    n14 = 218;
                    break;
                }
                case 89: {
                    n14 = 233;
                    break;
                }
                case 90: {
                    n14 = 84;
                    break;
                }
                case 91: {
                    n14 = 115;
                    break;
                }
                case 92: {
                    n14 = 244;
                    break;
                }
                case 93: {
                    n14 = 227;
                    break;
                }
                case 94: {
                    n14 = 83;
                    break;
                }
                case 95: {
                    n14 = 151;
                    break;
                }
                case 96: {
                    n14 = 67;
                    break;
                }
                case 97: {
                    n14 = 243;
                    break;
                }
                case 98: {
                    n14 = 187;
                    break;
                }
                case 99: {
                    n14 = 138;
                    break;
                }
                case 100: {
                    n14 = 176;
                    break;
                }
                case 101: {
                    n14 = 53;
                    break;
                }
                case 102: {
                    n14 = 25;
                    break;
                }
                case 103: {
                    n14 = 208;
                    break;
                }
                case 104: {
                    n14 = 17;
                    break;
                }
                case 105: {
                    n14 = 11;
                    break;
                }
                case 106: {
                    n14 = 7;
                    break;
                }
                case 107: {
                    n14 = 90;
                    break;
                }
                case 108: {
                    n14 = 43;
                    break;
                }
                case 109: {
                    n14 = 72;
                    break;
                }
                case 110: {
                    n14 = 105;
                    break;
                }
                case 111: {
                    n14 = 78;
                    break;
                }
                case 112: {
                    n14 = 253;
                    break;
                }
                case 113: {
                    n14 = 26;
                    break;
                }
                case 114: {
                    n14 = 159;
                    break;
                }
                case 115: {
                    n14 = 60;
                    break;
                }
                case 116: {
                    n14 = 174;
                    break;
                }
                case 117: {
                    n14 = 178;
                    break;
                }
                case 118: {
                    n14 = 196;
                    break;
                }
                case 119: {
                    n14 = 4;
                    break;
                }
                case 120: {
                    n14 = 203;
                    break;
                }
                case 121: {
                    n14 = 10;
                    break;
                }
                case 122: {
                    n14 = 109;
                    break;
                }
                case 123: {
                    n14 = 149;
                    break;
                }
                case 124: {
                    n14 = 153;
                    break;
                }
                case 125: {
                    n14 = 170;
                    break;
                }
                case 126: {
                    n14 = 65;
                    break;
                }
                case 127: {
                    n14 = 212;
                    break;
                }
                case 128: {
                    n14 = 242;
                    break;
                }
                case 129: {
                    n14 = 34;
                    break;
                }
                case 130: {
                    n14 = 254;
                    break;
                }
                case 131: {
                    n14 = 144;
                    break;
                }
                case 132: {
                    n14 = 204;
                    break;
                }
                case 133: {
                    n14 = 220;
                    break;
                }
                case 134: {
                    n14 = 228;
                    break;
                }
                case 135: {
                    n14 = 73;
                    break;
                }
                case 136: {
                    n14 = 36;
                    break;
                }
                case 137: {
                    n14 = 192;
                    break;
                }
                case 138: {
                    n14 = 154;
                    break;
                }
                case 139: {
                    n14 = 24;
                    break;
                }
                case 140: {
                    n14 = 61;
                    break;
                }
                case 141: {
                    n14 = 245;
                    break;
                }
                case 142: {
                    n14 = 30;
                    break;
                }
                case 143: {
                    n14 = 66;
                    break;
                }
                case 144: {
                    n14 = 39;
                    break;
                }
                case 145: {
                    n14 = 214;
                    break;
                }
                case 146: {
                    n14 = 145;
                    break;
                }
                case 147: {
                    n14 = 50;
                    break;
                }
                case 148: {
                    n14 = 184;
                    break;
                }
                case 149: {
                    n14 = 161;
                    break;
                }
                case 150: {
                    n14 = 198;
                    break;
                }
                case 151: {
                    n14 = 99;
                    break;
                }
                case 152: {
                    n14 = 199;
                    break;
                }
                case 153: {
                    n14 = 130;
                    break;
                }
                case 154: {
                    n14 = 110;
                    break;
                }
                case 155: {
                    n14 = 158;
                    break;
                }
                case 156: {
                    n14 = 173;
                    break;
                }
                case 157: {
                    n14 = 237;
                    break;
                }
                case 158: {
                    n14 = 182;
                    break;
                }
                case 159: {
                    n14 = 46;
                    break;
                }
                case 160: {
                    n14 = 18;
                    break;
                }
                case 161: {
                    n14 = 64;
                    break;
                }
                case 162: {
                    n14 = 69;
                    break;
                }
                case 163: {
                    n14 = 142;
                    break;
                }
                case 164: {
                    n14 = 146;
                    break;
                }
                case 165: {
                    n14 = 185;
                    break;
                }
                case 166: {
                    n14 = 125;
                    break;
                }
                case 167: {
                    n14 = 57;
                    break;
                }
                case 168: {
                    n14 = 152;
                    break;
                }
                case 169: {
                    n14 = 35;
                    break;
                }
                case 170: {
                    n14 = 190;
                    break;
                }
                case 171: {
                    n14 = 5;
                    break;
                }
                case 172: {
                    n14 = 56;
                    break;
                }
                case 173: {
                    n14 = 193;
                    break;
                }
                case 174: {
                    n14 = 71;
                    break;
                }
                case 175: {
                    n14 = 211;
                    break;
                }
                case 176: {
                    n14 = 38;
                    break;
                }
                case 177: {
                    n14 = 162;
                    break;
                }
                case 178: {
                    n14 = 197;
                    break;
                }
                case 179: {
                    n14 = 87;
                    break;
                }
                case 180: {
                    n14 = 240;
                    break;
                }
                case 181: {
                    n14 = 55;
                    break;
                }
                case 182: {
                    n14 = 246;
                    break;
                }
                case 183: {
                    n14 = 210;
                    break;
                }
                case 184: {
                    n14 = 88;
                    break;
                }
                case 185: {
                    n14 = 82;
                    break;
                }
                case 186: {
                    n14 = 107;
                    break;
                }
                case 187: {
                    n14 = 27;
                    break;
                }
                case 188: {
                    n14 = 52;
                    break;
                }
                case 189: {
                    n14 = 183;
                    break;
                }
                case 190: {
                    n14 = 96;
                    break;
                }
                case 191: {
                    n14 = 62;
                    break;
                }
                case 192: {
                    n14 = 206;
                    break;
                }
                case 193: {
                    n14 = 29;
                    break;
                }
                case 194: {
                    n14 = 177;
                    break;
                }
                case 195: {
                    n14 = 137;
                    break;
                }
                case 196: {
                    n14 = 42;
                    break;
                }
                case 197: {
                    n14 = 255;
                    break;
                }
                case 198: {
                    n14 = 155;
                    break;
                }
                case 199: {
                    n14 = 165;
                    break;
                }
                case 200: {
                    n14 = 201;
                    break;
                }
                case 201: {
                    n14 = 47;
                    break;
                }
                case 202: {
                    n14 = 89;
                    break;
                }
                case 203: {
                    n14 = 2;
                    break;
                }
                case 204: {
                    n14 = 75;
                    break;
                }
                case 205: {
                    n14 = 85;
                    break;
                }
                case 206: {
                    n14 = 134;
                    break;
                }
                case 207: {
                    n14 = 116;
                    break;
                }
                case 208: {
                    n14 = 121;
                    break;
                }
                case 209: {
                    n14 = 6;
                    break;
                }
                case 210: {
                    n14 = 15;
                    break;
                }
                case 211: {
                    n14 = 251;
                    break;
                }
                case 212: {
                    n14 = 77;
                    break;
                }
                case 213: {
                    n14 = 169;
                    break;
                }
                case 214: {
                    n14 = 232;
                    break;
                }
                case 215: {
                    n14 = 14;
                    break;
                }
                case 216: {
                    n14 = 229;
                    break;
                }
                case 217: {
                    n14 = 28;
                    break;
                }
                case 218: {
                    n14 = 92;
                    break;
                }
                case 219: {
                    n14 = 156;
                    break;
                }
                case 220: {
                    n14 = 249;
                    break;
                }
                case 221: {
                    n14 = 127;
                    break;
                }
                case 222: {
                    n14 = 135;
                    break;
                }
                case 223: {
                    n14 = 200;
                    break;
                }
                case 224: {
                    n14 = 37;
                    break;
                }
                case 225: {
                    n14 = 19;
                    break;
                }
                case 226: {
                    n14 = 100;
                    break;
                }
                case 227: {
                    n14 = 188;
                    break;
                }
                case 228: {
                    n14 = 131;
                    break;
                }
                case 229: {
                    n14 = 147;
                    break;
                }
                case 230: {
                    n14 = 1;
                    break;
                }
                case 231: {
                    n14 = 86;
                    break;
                }
                case 232: {
                    n14 = 179;
                    break;
                }
                case 233: {
                    n14 = 108;
                    break;
                }
                case 234: {
                    n14 = 189;
                    break;
                }
                case 235: {
                    n14 = 236;
                    break;
                }
                case 236: {
                    n14 = 51;
                    break;
                }
                case 237: {
                    n14 = 54;
                    break;
                }
                case 238: {
                    n14 = 120;
                    break;
                }
                case 239: {
                    n14 = 16;
                    break;
                }
                case 240: {
                    n14 = 143;
                    break;
                }
                case 241: {
                    n14 = 226;
                    break;
                }
                case 242: {
                    n14 = 59;
                    break;
                }
                case 243: {
                    n14 = 230;
                    break;
                }
                case 244: {
                    n14 = 126;
                    break;
                }
                case 245: {
                    n14 = 150;
                    break;
                }
                case 246: {
                    n14 = 119;
                    break;
                }
                case 247: {
                    n14 = 122;
                    break;
                }
                case 248: {
                    n14 = 221;
                    break;
                }
                case 249: {
                    n14 = 45;
                    break;
                }
                case 250: {
                    n14 = 112;
                    break;
                }
                case 251: {
                    n14 = 235;
                    break;
                }
                case 252: {
                    n14 = 114;
                    break;
                }
                case 253: {
                    n14 = 167;
                    break;
                }
                case 254: {
                    n14 = 217;
                    break;
                }
                default: {
                    n14 = 74;
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
            nl_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6D04;
        if (e[n11] == null) {
            nl_1.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

