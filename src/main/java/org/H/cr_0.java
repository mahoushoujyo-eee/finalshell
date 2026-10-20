/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.F.c;
import org.H.C5;
import org.H.CA;
import org.H.CX;
import org.H.C_;
import org.H.D;
import org.H.E;
import org.H.G;
import org.H.K;
import org.H.L;
import org.H.N;
import org.H.P;
import org.H.R;
import org.H.V;
import org.H.W;
import org.H.Y;
import org.h.a_0;
import org.h.c_0;
import org.h.ca_0;
import org.h.cb_0;
import org.h.cc_0;
import org.h.ce_0;
import org.h.cj_0;
import org.h.cm_0;
import org.h.cn_0;
import org.h.cp_0;
import org.h.cq_0;
import org.h.ct_0;
import org.h.cy_0;
import org.h.e_0;
import org.h.h_0;
import org.h.i_0;
import org.h.l_0;
import org.h.n_0;
import org.h.q_0;
import org.h.r_0;
import org.h.s_0;
import org.h.t_0;
import org.h.v_0;
import org.h.w_0;
import org.h.x_0;
import org.v.f0;
import org.v.f3;
import org.v.f7;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.H.Cr
 */
public class cr_0
implements w_0 {
    private short n;
    private short p;
    private final List O;
    public final short f;
    public final short m;
    public final short c;
    public final short[] v;
    public final List r;
    public final List P;
    private final List E;
    private final Map s;
    static final boolean Q;
    private static ky_2[] j;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public cr_0(short n10, String string, @c String string2, String[] stringArray) {
        block51: {
            short s2;
            ky_2[] ky_2Array;
            block50: {
                String string3;
                cr_0 cr_02;
                block48: {
                    block49: {
                        block45: {
                            int n11;
                            block47: {
                                block46: {
                                    block44: {
                                        block41: {
                                            int n12;
                                            int n13;
                                            block43: {
                                                block42: {
                                                    block39: {
                                                        Matcher matcher;
                                                        block40: {
                                                            ky_2[] ky_2Array2 = cr_0.q();
                                                            ky_2Array = ky_2Array2;
                                                            String string4 = System.getProperty(cr_0.a(-3908, -4188));
                                                            matcher = Pattern.compile(cr_0.a(-3961, -27583)).matcher(string4);
                                                            try {
                                                                try {
                                                                    n11 = matcher.matches();
                                                                    if (ky_2Array != null) break block39;
                                                                    if (n11 != 0) break block40;
                                                                    throw new AssertionError((Object)(cr_0.a(-3943, 27663) + string4 + "\""));
                                                                }
                                                                catch (l_0 l_02) {
                                                                    throw cr_0.a(l_02);
                                                                }
                                                            }
                                                            catch (l_0 l_03) {
                                                                throw cr_0.a(l_03);
                                                            }
                                                        }
                                                        this.n = Short.parseShort(matcher.group(1));
                                                        this.p = Short.parseShort(matcher.group(2));
                                                        this.O = new ArrayList();
                                                        this.O.add(null);
                                                        this.s = new HashMap();
                                                        n11 = n10 & cr_0.a(26529, 4775865309260308602L);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (ky_2Array != null) break block41;
                                                                            if (n11 == 0) break block42;
                                                                        }
                                                                        catch (l_0 l_04) {
                                                                            throw cr_0.a(l_04);
                                                                        }
                                                                        n11 = Q;
                                                                        if (ky_2Array != null) break block41;
                                                                    }
                                                                    catch (l_0 l_05) {
                                                                        throw cr_0.a(l_05);
                                                                    }
                                                                    if (n11 != 0) break block42;
                                                                }
                                                                catch (l_0 l_06) {
                                                                    throw cr_0.a(l_06);
                                                                }
                                                                int n12 = n10 & cr_0.a(24077, 5558043731721935327L);
                                                                n12 = cr_0.a(11231, 6746250836839640079L);
                                                                if (ky_2Array != null) break block43;
                                                            }
                                                            catch (l_0 l_07) {
                                                                throw cr_0.a(l_07);
                                                            }
                                                            if (n13 == n12) break block42;
                                                            throw new AssertionError((Object)Integer.toString(n10 & cr_0.a(3352, 3297462318966672071L), cr_0.a(18802, 6795476611289829030L)));
                                                        }
                                                        catch (l_0 l_08) {
                                                            throw cr_0.a(l_08);
                                                        }
                                                    }
                                                    catch (l_0 l_09) {
                                                        throw cr_0.a(l_09);
                                                    }
                                                }
                                                int n12 = n10;
                                                n12 = cr_0.a(22051, 7929979938283442685L);
                                            }
                                            n11 = n13 & n12;
                                        }
                                        try {
                                            if (ky_2Array != null) break block44;
                                            if (n11 != 0) break block45;
                                        }
                                        catch (l_0 l_010) {
                                            throw cr_0.a(l_010);
                                        }
                                        n11 = Q ? 1 : 0;
                                    }
                                    try {
                                        try {
                                            if (ky_2Array != null) break block46;
                                            if (n11 != 0) break block45;
                                        }
                                        catch (l_0 l_011) {
                                            throw cr_0.a(l_011);
                                        }
                                        n11 = n10 & cr_0.a(1383, 3557800276026983094L);
                                    }
                                    catch (l_0 l_012) {
                                        throw cr_0.a(l_012);
                                    }
                                }
                                try {
                                    try {
                                        if (ky_2Array != null) break block47;
                                        if (n11 != 0) throw new AssertionError((Object)Integer.toString(n10 & cr_0.a(3352, 3297462318966672071L), cr_0.a(9337, 8659875189018370980L)));
                                    }
                                    catch (l_0 l_013) {
                                        throw cr_0.a(l_013);
                                    }
                                    n11 = n10 & cr_0.a(23050, 6846695116299591118L);
                                }
                                catch (l_0 l_014) {
                                    throw cr_0.a(l_014);
                                }
                            }
                            try {
                                if (n11 == cr_0.a(3109, 8194210228352355312L)) {
                                    throw new AssertionError((Object)Integer.toString(n10 & cr_0.a(3352, 3297462318966672071L), cr_0.a(9337, 8659875189018370980L)));
                                }
                            }
                            catch (l_0 l_015) {
                                throw cr_0.a(l_015);
                            }
                        }
                        try {
                            try {
                                this.f = (short)n10;
                                cr_0 cr_02 = this;
                                cr_02 = this;
                                string3 = string;
                                if (ky_2Array != null) break block48;
                                cr_03.m = cr_02.X(string3);
                                cr_03 = this;
                                if (string2 != null) break block49;
                            }
                            catch (l_0 l_016) {
                                throw cr_0.a(l_016);
                            }
                            s2 = 0;
                            break block50;
                        }
                        catch (l_0 l_017) {
                            throw cr_0.a(l_017);
                        }
                    }
                    cr_02 = this;
                    string3 = string2;
                }
                s2 = cr_02.X(string3);
            }
            cr_03.c = s2;
            this.v = new short[stringArray.length];
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                try {
                    this.v[i2] = this.X(stringArray[i2]);
                    if (ky_2Array == null) {
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block51;
                }
                catch (l_0 l_018) {
                    throw cr_0.a(l_018);
                }
            }
            this.r = new ArrayList();
            this.P = new ArrayList();
            this.E = new ArrayList();
        }
        try {
            if (ky_2.F() == null) return;
            cr_0.Q(new ky_2[4]);
            return;
        }
        catch (l_0 l_019) {
            throw cr_0.a(l_019);
        }
    }

    public void X(String string) {
        this.E.add(new ct_0(this.H(cr_0.a(-3955, -4111)), this.H(string)));
    }

    public void a() {
        this.E.add(new cy_0(this.H(cr_0.a(-3940, 4302))));
    }

    @c
    public cq_0 F() {
        return (cq_0)this.f(this.E, cr_0.a(-3966, 8071));
    }

    @c
    public cc_0 P() {
        return (cc_0)this.f(this.E, cr_0.a(-3964, 26895));
    }

    @c
    private Y f(List list, String string) throws ClassFormatError {
        Y y2;
        block14: {
            Short s2 = (Short)this.s.get(new s_0(string));
            ky_2[] ky_2Array = cr_0.q();
            try {
                if (s2 == null) {
                    return null;
                }
            }
            catch (ClassFormatError classFormatError) {
                throw cr_0.a(classFormatError);
            }
            Y y3 = null;
            for (Y y4 : list) {
                block16: {
                    Y y5;
                    block17: {
                        block15: {
                            try {
                                try {
                                    try {
                                        y2 = y4;
                                        if (ky_2Array != null) break block14;
                                        if (ky_2Array != null) break block15;
                                    }
                                    catch (ClassFormatError classFormatError) {
                                        throw cr_0.a(classFormatError);
                                    }
                                    if (Y.H(y2) != s2) break block16;
                                }
                                catch (ClassFormatError classFormatError) {
                                    throw cr_0.a(classFormatError);
                                }
                                y5 = y3;
                            }
                            catch (ClassFormatError classFormatError) {
                                throw cr_0.a(classFormatError);
                            }
                        }
                        try {
                            try {
                                if (ky_2Array != null) break block16;
                                if (y5 == null) break block17;
                            }
                            catch (ClassFormatError classFormatError) {
                                throw cr_0.a(classFormatError);
                            }
                            throw new l_0(cr_0.a(-3965, 30633) + string + cr_0.a(-3959, 11439));
                        }
                        catch (ClassFormatError classFormatError) {
                            throw cr_0.a(classFormatError);
                        }
                    }
                    y5 = y3 = y4;
                }
                if (ky_2Array == null) continue;
            }
            y2 = y3;
        }
        return y2;
    }

    public void V(CX cX) {
        cq_0 cq_02;
        block2: {
            cq_0 cq_03;
            block3: {
                cq_03 = this.F();
                ky_2[] ky_2Array = cr_0.q();
                try {
                    cq_02 = cq_03;
                    if (ky_2Array != null) break block2;
                    if (cq_02 != null) break block3;
                }
                catch (l_0 l_02) {
                    throw cr_0.a(l_02);
                }
                cq_03 = new cq_0(this.H(cr_0.a(-3937, -12830)));
                this.E.add(cq_03);
            }
            cq_02 = cq_03;
        }
        cq_02.u().add(cX);
    }

    @c
    private C_ q(boolean bl, List list) {
        String string;
        try {
            string = bl ? cr_0.a(-3947, 18101) : cr_0.a(-3949, -23846);
        }
        catch (l_0 l_02) {
            throw cr_0.a(l_02);
        }
        String string2 = string;
        return (C_)this.f(list, string2);
    }

    @Override
    public v_0[] R(boolean bl) {
        C_ c_;
        C_ c_2;
        block4: {
            block5: {
                c_2 = this.q(bl, this.E);
                ky_2[] ky_2Array = cr_0.q();
                try {
                    try {
                        c_ = c_2;
                        if (ky_2Array != null) break block4;
                        if (c_ != null) break block5;
                    }
                    catch (l_0 l_02) {
                        throw cr_0.a(l_02);
                    }
                    return new v_0[0];
                }
                catch (l_0 l_03) {
                    throw cr_0.a(l_03);
                }
            }
            c_ = c_2;
        }
        return C_.j(c_).toArray(new v_0[C_.j(c_2).size()]);
    }

    @Override
    public void t(boolean bl, String string, Map map) {
        this.h(bl, string, map, this.E);
    }

    private void h(boolean bl, String string, Map map, List list) {
        C_ c_;
        block6: {
            C_ c_2;
            block7: {
                String string2;
                block9: {
                    block8: {
                        c_2 = this.q(bl, list);
                        ky_2[] ky_2Array = cr_0.q();
                        try {
                            try {
                                try {
                                    c_ = c_2;
                                    if (ky_2Array != null) break block6;
                                    if (c_ != null) break block7;
                                }
                                catch (l_0 l_02) {
                                    throw cr_0.a(l_02);
                                }
                                if (!bl) break block8;
                            }
                            catch (l_0 l_03) {
                                throw cr_0.a(l_03);
                            }
                            string2 = cr_0.a(-3951, -23139);
                            break block9;
                        }
                        catch (l_0 l_04) {
                            throw cr_0.a(l_04);
                        }
                    }
                    string2 = cr_0.a(-3905, -16539);
                }
                String string3 = string2;
                c_2 = new C_(this.H(string3));
                list.add(c_2);
            }
            c_ = c_2;
        }
        c_.A().add(new v_0(this.H(string), map));
    }

    public cr_0(InputStream inputStream) throws IOException {
        block10: {
            DataInputStream dataInputStream;
            block11: {
                DataInputStream dataInputStream2;
                ky_2[] ky_2Array;
                block12: {
                    block9: {
                        InputStream inputStream2;
                        block8: {
                            ky_2[] ky_2Array2 = cr_0.q();
                            ky_2Array = ky_2Array2;
                            try {
                                try {
                                    inputStream2 = inputStream;
                                    if (ky_2Array != null) break block8;
                                    if (!(inputStream2 instanceof DataInputStream)) break block9;
                                }
                                catch (IOException iOException) {
                                    throw cr_0.a(iOException);
                                }
                                inputStream2 = inputStream;
                            }
                            catch (IOException iOException) {
                                throw cr_0.a(iOException);
                            }
                        }
                        dataInputStream2 = (DataInputStream)inputStream2;
                        break block12;
                    }
                    dataInputStream2 = new DataInputStream(inputStream);
                }
                dataInputStream = dataInputStream2;
                int n10 = dataInputStream.readInt();
                try {
                    try {
                        if (ky_2Array != null) break block10;
                        if (n10 == cr_0.a(30868, 1699225920352550734L)) break block11;
                    }
                    catch (IOException iOException) {
                        throw cr_0.a(iOException);
                    }
                    throw new l_0(cr_0.a(-3967, -5596));
                }
                catch (IOException iOException) {
                    throw cr_0.a(iOException);
                }
            }
            this.p = dataInputStream.readShort();
            this.n = dataInputStream.readShort();
            this.O = new ArrayList();
            this.s = new HashMap();
            this.d(dataInputStream);
            this.f = dataInputStream.readShort();
            this.m = dataInputStream.readShort();
            this.c = dataInputStream.readShort();
            this.v = cr_0.i(dataInputStream);
            this.r = Collections.unmodifiableList(this.x(dataInputStream));
            this.P = Collections.unmodifiableList(this.v(dataInputStream));
            this.E = Collections.unmodifiableList(this.u(dataInputStream));
        }
    }

    public String t() {
        return this.X(this.m).E(this).replace((char)cr_0.a(30828, 6463482802301599675L), (char)cr_0.a(25708, 6093012669770064816L));
    }

    public void e(short s2, short s3) {
        this.n = s2;
        this.p = s3;
    }

    public short V() {
        return this.n;
    }

    public short x() {
        return this.p;
    }

    /*
     * Unable to fully structure code
     */
    public short X(String var1_1) {
        block11: {
            block12: {
                block10: {
                    var2_2 = cr_0.q();
                    try {
                        v0 = f0.D(var1_1);
                        if (var2_2 != null) break block10;
                        if (v0) {
                        }
                        ** GOTO lbl14
                    }
                    catch (l_0 v1) {
                        throw cr_0.a(v1);
                    }
                    var3_3 = f0.x(var1_1);
                    try {
                        try {
                            if (var2_2 == null) break block11;
lbl14:
                            // 2 sources

                            v2 = var1_1;
                            if (var2_2 != null) break block12;
                        }
                        catch (l_0 v3) {
                            throw cr_0.a(v3);
                        }
                        v0 = f0.J(v2);
                    }
                    catch (l_0 v4) {
                        throw cr_0.a(v4);
                    }
                }
                if (!v0) ** GOTO lbl30
                v2 = var1_1;
            }
            var3_3 = v2;
            try {
                if (var2_2 == null) break block11;
lbl30:
                // 2 sources

                throw new l_0("\"" + f0.g(var1_1) + cr_0.a(-3954, -16199));
            }
            catch (l_0 v5) {
                throw cr_0.a(v5);
            }
        }
        return this.C(new G(this.H(var3_3)));
    }

    public short c(String string, String string2, String string3) {
        return this.C(new W(this.X(string), this.o(string2, string3)));
    }

    public short S(String string, String string2, String string3) {
        return this.C(new V(this.X(string), this.o(string2, string3)));
    }

    public short i(String string, String string2, String string3) {
        return this.C(new E(this.X(string), this.o(string2, string3)));
    }

    public short P(String string) {
        return this.C(new q_0(this.H(string)));
    }

    public short n(int n10) {
        return this.C(new N(n10));
    }

    public short t(float f10) {
        return this.C(new h_0(f10));
    }

    public short R(long l2) {
        return this.C(new D(l2));
    }

    public short f(double d2) {
        return this.C(new L(d2));
    }

    private short o(String string, String string2) {
        return this.C(new R(this.H(string), this.H(string2)));
    }

    public short H(String string) {
        return this.C(new s_0(string));
    }

    private short O(Object object) {
        block55: {
            short s2;
            block54: {
                ky_2[] ky_2Array;
                block52: {
                    block53: {
                        block50: {
                            block51: {
                                block48: {
                                    block49: {
                                        block44: {
                                            block45: {
                                                int n10;
                                                cr_0 cr_02;
                                                block46: {
                                                    block47: {
                                                        block42: {
                                                            block43: {
                                                                short s3;
                                                                block40: {
                                                                    block38: {
                                                                        block39: {
                                                                            ky_2Array = cr_0.q();
                                                                            try {
                                                                                try {
                                                                                    s3 = object instanceof String;
                                                                                    if (ky_2Array != null) break block38;
                                                                                    if (s3 == 0) break block39;
                                                                                }
                                                                                catch (l_0 l_02) {
                                                                                    throw cr_0.a(l_02);
                                                                                }
                                                                                return this.P((String)object);
                                                                            }
                                                                            catch (l_0 l_03) {
                                                                                throw cr_0.a(l_03);
                                                                            }
                                                                        }
                                                                        s3 = object instanceof Byte;
                                                                    }
                                                                    try {
                                                                        block41: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (ky_2Array != null) break block40;
                                                                                                if (s3 != 0) break block41;
                                                                                            }
                                                                                            catch (l_0 l_04) {
                                                                                                throw cr_0.a(l_04);
                                                                                            }
                                                                                            s3 = object instanceof Short;
                                                                                            if (ky_2Array != null) break block40;
                                                                                        }
                                                                                        catch (l_0 l_05) {
                                                                                            throw cr_0.a(l_05);
                                                                                        }
                                                                                        if (s3 != 0) break block41;
                                                                                    }
                                                                                    catch (l_0 l_06) {
                                                                                        throw cr_0.a(l_06);
                                                                                    }
                                                                                    s2 = object instanceof Integer;
                                                                                    if (ky_2Array != null) break block42;
                                                                                }
                                                                                catch (l_0 l_07) {
                                                                                    throw cr_0.a(l_07);
                                                                                }
                                                                                if (s2 == 0) break block43;
                                                                            }
                                                                            catch (l_0 l_08) {
                                                                                throw cr_0.a(l_08);
                                                                            }
                                                                        }
                                                                        s3 = this.n(((Number)object).intValue());
                                                                    }
                                                                    catch (l_0 l_09) {
                                                                        throw cr_0.a(l_09);
                                                                    }
                                                                }
                                                                return s3;
                                                            }
                                                            s2 = object instanceof Boolean;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (ky_2Array != null) break block44;
                                                                    if (s2 == 0) break block45;
                                                                }
                                                                catch (l_0 l_010) {
                                                                    throw cr_0.a(l_010);
                                                                }
                                                                cr_02 = this;
                                                                n10 = ((Boolean)object).booleanValue();
                                                                if (ky_2Array != null) break block46;
                                                            }
                                                            catch (l_0 l_011) {
                                                                throw cr_0.a(l_011);
                                                            }
                                                            if (n10 == 0) break block47;
                                                        }
                                                        catch (l_0 l_012) {
                                                            throw cr_0.a(l_012);
                                                        }
                                                        n10 = 1;
                                                        break block46;
                                                    }
                                                    n10 = 0;
                                                }
                                                return cr_02.n(n10);
                                            }
                                            s2 = object instanceof Character;
                                        }
                                        try {
                                            try {
                                                if (ky_2Array != null) break block48;
                                                if (s2 == 0) break block49;
                                            }
                                            catch (l_0 l_013) {
                                                throw cr_0.a(l_013);
                                            }
                                            return this.n(((Character)object).charValue());
                                        }
                                        catch (l_0 l_014) {
                                            throw cr_0.a(l_014);
                                        }
                                    }
                                    s2 = object instanceof Float;
                                }
                                try {
                                    try {
                                        if (ky_2Array != null) break block50;
                                        if (s2 == 0) break block51;
                                    }
                                    catch (l_0 l_015) {
                                        throw cr_0.a(l_015);
                                    }
                                    return this.t(((Float)object).floatValue());
                                }
                                catch (l_0 l_016) {
                                    throw cr_0.a(l_016);
                                }
                            }
                            s2 = object instanceof Long;
                        }
                        try {
                            try {
                                if (ky_2Array != null) break block52;
                                if (s2 == 0) break block53;
                            }
                            catch (l_0 l_017) {
                                throw cr_0.a(l_017);
                            }
                            return this.R((Long)object);
                        }
                        catch (l_0 l_018) {
                            throw cr_0.a(l_018);
                        }
                    }
                    s2 = object instanceof Double;
                }
                try {
                    try {
                        if (ky_2Array != null) break block54;
                        if (s2 == 0) break block55;
                    }
                    catch (l_0 l_019) {
                        throw cr_0.a(l_019);
                    }
                    s2 = this.f((Double)object);
                }
                catch (l_0 l_020) {
                    throw cr_0.a(l_020);
                }
            }
            return s2;
        }
        throw new l_0(cr_0.a(-3946, -2836) + object.getClass().getName() + "\"");
    }

    private short C(x_0 x_02) {
        int n10;
        block14: {
            short s2;
            block15: {
                ky_2[] ky_2Array;
                block12: {
                    block13: {
                        block11: {
                            Short s3;
                            block10: {
                                Short s4 = (Short)this.s.get(x_02);
                                ky_2Array = cr_0.q();
                                try {
                                    s3 = s4;
                                    if (ky_2Array != null) break block10;
                                    if (s3 == null) break block11;
                                }
                                catch (l_0 l_02) {
                                    throw cr_0.a(l_02);
                                }
                                s3 = s4;
                            }
                            return s3;
                        }
                        s2 = (short)this.O.size();
                        try {
                            try {
                                this.O.add(x_02);
                                n10 = x_02.x();
                                if (ky_2Array != null) break block12;
                                if (n10 == 0) break block13;
                            }
                            catch (l_0 l_03) {
                                throw cr_0.a(l_03);
                            }
                            this.O.add(null);
                        }
                        catch (l_0 l_04) {
                            throw cr_0.a(l_04);
                        }
                    }
                    n10 = this.O.size();
                }
                try {
                    try {
                        if (ky_2Array != null) break block14;
                        if (n10 <= cr_0.a(3352, 3297462318966672071L)) break block15;
                    }
                    catch (l_0 l_05) {
                        throw cr_0.a(l_05);
                    }
                    throw new l_0(cr_0.a(-3958, 18334) + this.t() + cr_0.a(-3906, -12649));
                }
                catch (l_0 l_06) {
                    throw cr_0.a(l_06);
                }
            }
            this.s.put(x_02, s2);
            n10 = s2;
        }
        return (short)n10;
    }

    public c_0 Q(short s2, String string, String string2, @c Object object) {
        ArrayList<ce_0> arrayList = new ArrayList<ce_0>();
        try {
            if (object != null) {
                arrayList.add(new ce_0(this.H(cr_0.a(-3962, -4264)), this.O(object)));
            }
        }
        catch (l_0 l_02) {
            throw cr_0.a(l_02);
        }
        c_0 c_02 = new c_0(this, s2, this.H(string), this.H(string2), arrayList);
        this.r.add(c_02);
        return c_02;
    }

    public P x(short s2, String string, f3 f32) {
        block11: {
            int n10;
            ky_2[] ky_2Array;
            block9: {
                block10: {
                    ky_2Array = cr_0.q();
                    try {
                        n10 = f7.G(s2);
                        if (ky_2Array != null) break block9;
                        if (n10 == 0) break block10;
                    }
                    catch (l_0 l_02) {
                        throw cr_0.a(l_02);
                    }
                    n10 = 0;
                    break block9;
                }
                n10 = 1;
            }
            int n11 = n10;
            for (String string2 : f32.R) {
                n11 += f0.l(string2);
                try {
                    if (ky_2Array == null) {
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block11;
                }
                catch (l_0 l_03) {
                    throw cr_0.a(l_03);
                }
            }
            try {
                if (n11 > cr_0.a(7774, 2143103964597098886L)) {
                    throw new l_0(cr_0.a(-3945, 1971) + string + cr_0.a(-3960, 24720) + n11 + ")");
                }
            }
            catch (l_0 l_04) {
                throw cr_0.a(l_04);
            }
        }
        P p2 = new P(this, s2, this.H(string), this.H(f32.toString()), new ArrayList());
        this.P.add(p2);
        return p2;
    }

    public x_0 R(short s2) {
        x_0 x_02;
        block4: {
            x_0 x_03;
            block5: {
                x_03 = (x_0)this.O.get(cr_0.a(4521, 8482207461179037295L) & s2);
                ky_2[] ky_2Array = cr_0.q();
                try {
                    try {
                        x_02 = x_03;
                        if (ky_2Array != null) break block4;
                        if (x_02 != null) break block5;
                    }
                    catch (l_0 l_02) {
                        throw cr_0.a(l_02);
                    }
                    throw new l_0(cr_0.a(-3941, 25220) + s2);
                }
                catch (l_0 l_03) {
                    throw cr_0.a(l_03);
                }
            }
            x_02 = x_03;
        }
        return x_02;
    }

    public G X(short s2) {
        return (G)this.R(s2);
    }

    public W A(short s2) {
        return (W)this.R(s2);
    }

    public E H(short s2) {
        return (E)this.R(s2);
    }

    public t_0 Y(short s2) {
        return (t_0)this.R(s2);
    }

    public a_0 M(short s2) {
        return (a_0)this.R(s2);
    }

    public V N(short s2) {
        return (V)this.R(s2);
    }

    public K S(short s2) {
        return (K)this.R(s2);
    }

    public R I(short s2) {
        return (R)this.R(s2);
    }

    public s_0 C(short s2) {
        return (s_0)this.R(s2);
    }

    public n_0 G(short s2) {
        return (n_0)this.R(s2);
    }

    public int u() {
        return this.O.size();
    }

    public String S(short s2) {
        return s_0.e(this.C(s2));
    }

    private static byte[] v(DataInputStream dataInputStream) throws IOException {
        byte[] byArray = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(byArray);
        return byArray;
    }

    private static short[] i(DataInputStream dataInputStream) throws IOException {
        short[] sArray;
        block4: {
            short[] sArray2 = new short[dataInputStream.readUnsignedShort()];
            ky_2[] ky_2Array = cr_0.q();
            for (int i2 = 0; i2 < sArray2.length; ++i2) {
                try {
                    sArray = sArray2;
                    if (ky_2Array == null) {
                        sArray[i2] = dataInputStream.readShort();
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IOException iOException) {
                    throw cr_0.a(iOException);
                }
            }
            sArray = sArray2;
        }
        return sArray;
    }

    private void d(DataInputStream dataInputStream) throws IOException {
        this.O.clear();
        ky_2[] ky_2Array = cr_0.q();
        this.s.clear();
        ky_2[] ky_2Array2 = ky_2Array;
        int n10 = dataInputStream.readUnsignedShort();
        this.O.add(null);
        int n11 = 1;
        while (n11 < n10) {
            block5: {
                block6: {
                    x_0 x_02 = x_0.r(dataInputStream);
                    try {
                        try {
                            this.O.add(x_02);
                            this.s.put(x_02, (short)n11);
                            if (ky_2Array2 != null) break block5;
                            if (!x_02.x()) break block6;
                        }
                        catch (IOException iOException) {
                            throw cr_0.a(iOException);
                        }
                        this.O.add(null);
                        ++n11;
                    }
                    catch (IOException iOException) {
                        throw cr_0.a(iOException);
                    }
                }
                ++n11;
            }
            if (ky_2Array2 == null) continue;
        }
    }

    private List x(DataInputStream dataInputStream) throws IOException {
        ArrayList<c_0> arrayList;
        block4: {
            ArrayList<c_0> arrayList2 = new ArrayList<c_0>();
            ky_2[] ky_2Array = cr_0.q();
            for (int i2 = dataInputStream.readUnsignedShort(); i2 > 0; --i2) {
                try {
                    arrayList = arrayList2;
                    if (ky_2Array == null) {
                        arrayList.add(new c_0(this, dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), this.u(dataInputStream)));
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IOException iOException) {
                    throw cr_0.a(iOException);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private List v(DataInputStream dataInputStream) throws IOException {
        ArrayList<P> arrayList;
        block4: {
            int n10 = dataInputStream.readUnsignedShort();
            ky_2[] ky_2Array = cr_0.q();
            ArrayList<P> arrayList2 = new ArrayList<P>(n10);
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    arrayList = arrayList2;
                    if (ky_2Array == null) {
                        arrayList.add(this.u(dataInputStream));
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IOException iOException) {
                    throw cr_0.a(iOException);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private List u(DataInputStream dataInputStream) throws IOException {
        ArrayList<Y> arrayList;
        block4: {
            int n10 = dataInputStream.readUnsignedShort();
            ArrayList<Y> arrayList2 = new ArrayList<Y>(n10);
            ky_2[] ky_2Array = cr_0.q();
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    arrayList = arrayList2;
                    if (ky_2Array == null) {
                        arrayList.add(this.g(dataInputStream));
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IOException iOException) {
                    throw cr_0.a(iOException);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public void Z(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream;
        block6: {
            block5: {
                OutputStream outputStream2;
                block4: {
                    ky_2[] ky_2Array = cr_0.q();
                    try {
                        try {
                            outputStream2 = outputStream;
                            if (ky_2Array != null) break block4;
                            if (!(outputStream2 instanceof DataOutputStream)) break block5;
                        }
                        catch (IOException iOException) {
                            throw cr_0.a(iOException);
                        }
                        outputStream2 = outputStream;
                    }
                    catch (IOException iOException) {
                        throw cr_0.a(iOException);
                    }
                }
                dataOutputStream = (DataOutputStream)outputStream2;
                break block6;
            }
            dataOutputStream = new DataOutputStream(outputStream);
        }
        DataOutputStream dataOutputStream2 = dataOutputStream;
        dataOutputStream2.writeInt(cr_0.a(8617, 6216401127606232703L));
        dataOutputStream2.writeShort(this.p);
        dataOutputStream2.writeShort(this.n);
        cr_0.Q(dataOutputStream2, this.O);
        dataOutputStream2.writeShort(this.f);
        dataOutputStream2.writeShort(this.m);
        dataOutputStream2.writeShort(this.c);
        cr_0.q(dataOutputStream2, this.v);
        cr_0.n(dataOutputStream2, this.r);
        cr_0.c(dataOutputStream2, this.P);
        cr_0.u(dataOutputStream2, this.E);
    }

    private static void Q(DataOutputStream dataOutputStream, List list) throws IOException {
        ky_2[] ky_2Array = cr_0.q();
        dataOutputStream.writeShort(list.size());
        ky_2[] ky_2Array2 = ky_2Array;
        for (int i2 = 1; i2 < list.size(); ++i2) {
            x_0 x_02;
            block4: {
                x_0 x_03 = (x_0)list.get(i2);
                try {
                    x_02 = x_03;
                    if (ky_2Array2 != null) break block4;
                    if (x_02 == null) {
                        continue;
                    }
                }
                catch (IOException iOException) {
                    throw cr_0.a(iOException);
                }
                x_02 = x_03;
            }
            x_02.R(dataOutputStream);
            if (ky_2Array2 == null) continue;
        }
    }

    private static void q(DataOutputStream dataOutputStream, short[] sArray) throws IOException {
        dataOutputStream.writeShort(sArray.length);
        short[] sArray2 = sArray;
        int n10 = sArray2.length;
        ky_2[] ky_2Array = cr_0.q();
        for (int i2 = 0; i2 < n10; ++i2) {
            short s2 = sArray2[i2];
            dataOutputStream.writeShort(s2);
            if (ky_2Array == null) continue;
        }
    }

    private static void n(DataOutputStream dataOutputStream, List list) throws IOException {
        ky_2[] ky_2Array = cr_0.q();
        dataOutputStream.writeShort(list.size());
        ky_2[] ky_2Array2 = ky_2Array;
        for (c_0 c_02 : list) {
            c_02.y(dataOutputStream);
            if (ky_2Array2 == null) continue;
        }
    }

    private static void c(DataOutputStream dataOutputStream, List list) throws IOException {
        ky_2[] ky_2Array = cr_0.q();
        dataOutputStream.writeShort(list.size());
        Iterator iterator = list.iterator();
        ky_2[] ky_2Array2 = ky_2Array;
        while (iterator.hasNext()) {
            P p2 = (P)iterator.next();
            p2.i(dataOutputStream);
            if (ky_2Array2 == null) continue;
        }
    }

    private static void u(DataOutputStream dataOutputStream, List list) throws IOException {
        ky_2[] ky_2Array = cr_0.q();
        dataOutputStream.writeShort(list.size());
        ky_2[] ky_2Array2 = ky_2Array;
        for (Y y2 : list) {
            y2.B(dataOutputStream);
            if (ky_2Array2 == null) continue;
        }
    }

    public static String R(String string) {
        int n10 = string.lastIndexOf(cr_0.a(25708, 6093012669770064816L)) + 1;
        ky_2[] ky_2Array = cr_0.q();
        String string2 = string;
        if (ky_2Array == null) {
            n10 = string2.indexOf(cr_0.a(15361, 4505217578693409732L), n10);
            if (n10 != -1) {
                string = string.substring(0, n10);
            }
            string2 = string.replace((char)cr_0.a(25708, 6093012669770064816L), (char)cr_0.a(30828, 6463482802301599675L)) + cr_0.a(-3942, -16735);
        }
        return string2;
    }

    public static String A(String string) {
        return string.replace((char)cr_0.a(30086, 6345853368709968469L), (char)cr_0.a(18573, 8657281779608833876L)) + cr_0.a(-3912, 12705);
    }

    public byte[] q() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.Z(byteArrayOutputStream);
        }
        catch (IOException iOException) {
            throw new l_0(iOException.toString(), iOException);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private P u(DataInputStream dataInputStream) throws IOException {
        return new P(this, dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), this.u(dataInputStream));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Y g(DataInputStream var1_1) throws IOException {
        block76: {
            block89: {
                block88: {
                    block87: {
                        block86: {
                            block85: {
                                block84: {
                                    block83: {
                                        block82: {
                                            block81: {
                                                block80: {
                                                    block79: {
                                                        block78: {
                                                            block77: {
                                                                block75: {
                                                                    var3_2 = var1_1.readShort();
                                                                    var2_3 = cr_0.q();
                                                                    var4_4 = var1_1.readInt();
                                                                    var5_5 = new byte[var4_4];
                                                                    var1_1.readFully(var5_5);
                                                                    var6_6 = new ByteArrayInputStream(var5_5);
                                                                    var7_7 = new DataInputStream(var6_6);
                                                                    var8_8 = this.S(var3_2);
                                                                    try {
                                                                        v0 = cr_0.a(-3944, -18546).equals(var8_8);
                                                                        if (var2_3 != null) break block75;
                                                                        if (v0 != 0) {
                                                                        }
                                                                        ** GOTO lbl20
                                                                    }
                                                                    catch (IOException v1) {
                                                                        throw cr_0.a(v1);
                                                                    }
                                                                    var9_9 = ce_0.n(var3_2, var7_7);
                                                                    try {
                                                                        if (var2_3 == null) break block76;
lbl20:
                                                                        // 2 sources

                                                                        v0 = cr_0.a(-3953, 32510).equals(var8_8);
                                                                    }
                                                                    catch (IOException v2) {
                                                                        throw cr_0.a(v2);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var2_3 != null) break block77;
                                                                    if (v0 != 0) {
                                                                    }
                                                                    ** GOTO lbl35
                                                                }
                                                                catch (IOException v3) {
                                                                    throw cr_0.a(v3);
                                                                }
                                                                var9_9 = cp_0.E(var3_2, this, var7_7);
                                                                try {
                                                                    if (var2_3 == null) break block76;
lbl35:
                                                                    // 2 sources

                                                                    v0 = cr_0.a(-3956, -19411).equals(var8_8);
                                                                }
                                                                catch (IOException v4) {
                                                                    throw cr_0.a(v4);
                                                                }
                                                            }
                                                            try {
                                                                if (var2_3 != null) break block78;
                                                                if (v0 != 0) {
                                                                }
                                                                ** GOTO lbl50
                                                            }
                                                            catch (IOException v5) {
                                                                throw cr_0.a(v5);
                                                            }
                                                            var9_9 = cb_0.f(var3_2, var7_7);
                                                            try {
                                                                if (var2_3 == null) break block76;
lbl50:
                                                                // 2 sources

                                                                v0 = cr_0.a(-3966, 8071).equals(var8_8);
                                                            }
                                                            catch (IOException v6) {
                                                                throw cr_0.a(v6);
                                                            }
                                                        }
                                                        try {
                                                            if (var2_3 != null) break block79;
                                                            if (v0 != 0) {
                                                            }
                                                            ** GOTO lbl65
                                                        }
                                                        catch (IOException v7) {
                                                            throw cr_0.a(v7);
                                                        }
                                                        var9_9 = cq_0.T(var3_2, var7_7);
                                                        try {
                                                            if (var2_3 == null) break block76;
lbl65:
                                                            // 2 sources

                                                            v0 = cr_0.a(-3963, -28650).equals(var8_8);
                                                        }
                                                        catch (IOException v8) {
                                                            throw cr_0.a(v8);
                                                        }
                                                    }
                                                    try {
                                                        if (var2_3 != null) break block80;
                                                        if (v0 != 0) {
                                                        }
                                                        ** GOTO lbl80
                                                    }
                                                    catch (IOException v9) {
                                                        throw cr_0.a(v9);
                                                    }
                                                    var9_9 = CA.K(var3_2, var7_7);
                                                    try {
                                                        if (var2_3 == null) break block76;
lbl80:
                                                        // 2 sources

                                                        v0 = cr_0.a(-3968, -17269).equals(var8_8);
                                                    }
                                                    catch (IOException v10) {
                                                        throw cr_0.a(v10);
                                                    }
                                                }
                                                try {
                                                    if (var2_3 != null) break block81;
                                                    if (v0 != 0) {
                                                    }
                                                    ** GOTO lbl95
                                                }
                                                catch (IOException v11) {
                                                    throw cr_0.a(v11);
                                                }
                                                var9_9 = cc_0.J(var3_2, var7_7);
                                                try {
                                                    if (var2_3 == null) break block76;
lbl95:
                                                    // 2 sources

                                                    v0 = cr_0.a(-3948, -22978).equals(var8_8);
                                                }
                                                catch (IOException v12) {
                                                    throw cr_0.a(v12);
                                                }
                                            }
                                            try {
                                                if (var2_3 != null) break block82;
                                                if (v0 != 0) {
                                                }
                                                ** GOTO lbl110
                                            }
                                            catch (IOException v13) {
                                                throw cr_0.a(v13);
                                            }
                                            var9_9 = ct_0.N(var3_2, var7_7);
                                            try {
                                                if (var2_3 == null) break block76;
lbl110:
                                                // 2 sources

                                                v0 = cr_0.a(-3911, -29298).equals(var8_8);
                                            }
                                            catch (IOException v14) {
                                                throw cr_0.a(v14);
                                            }
                                        }
                                        try {
                                            if (var2_3 != null) break block83;
                                            if (v0 != 0) {
                                            }
                                            ** GOTO lbl125
                                        }
                                        catch (IOException v15) {
                                            throw cr_0.a(v15);
                                        }
                                        var9_9 = cm_0.J(var3_2, var7_7, this);
                                        try {
                                            if (var2_3 == null) break block76;
lbl125:
                                            // 2 sources

                                            v0 = cr_0.a(-3952, 1820).equals(var8_8);
                                        }
                                        catch (IOException v16) {
                                            throw cr_0.a(v16);
                                        }
                                    }
                                    try {
                                        if (var2_3 != null) break block84;
                                        if (v0 != 0) {
                                        }
                                        ** GOTO lbl140
                                    }
                                    catch (IOException v17) {
                                        throw cr_0.a(v17);
                                    }
                                    var9_9 = C5.L(var3_2, var7_7);
                                    try {
                                        if (var2_3 == null) break block76;
lbl140:
                                        // 2 sources

                                        v0 = cr_0.a(-3939, 4339).equals(var8_8);
                                    }
                                    catch (IOException v18) {
                                        throw cr_0.a(v18);
                                    }
                                }
                                try {
                                    if (var2_3 != null) break block85;
                                    if (v0 != 0) {
                                    }
                                    ** GOTO lbl155
                                }
                                catch (IOException v19) {
                                    throw cr_0.a(v19);
                                }
                                var9_9 = cn_0.Z(var3_2, var7_7);
                                try {
                                    if (var2_3 == null) break block76;
lbl155:
                                    // 2 sources

                                    v0 = cr_0.a(-3957, -28995).equals(var8_8);
                                }
                                catch (IOException v20) {
                                    throw cr_0.a(v20);
                                }
                            }
                            try {
                                if (var2_3 != null) break block86;
                                if (v0 != 0) {
                                }
                                ** GOTO lbl170
                            }
                            catch (IOException v21) {
                                throw cr_0.a(v21);
                            }
                            var9_9 = cy_0.w(var3_2, var7_7);
                            try {
                                if (var2_3 == null) break block76;
lbl170:
                                // 2 sources

                                v0 = cr_0.a(-3938, 12798).equals(var8_8);
                            }
                            catch (IOException v22) {
                                throw cr_0.a(v22);
                            }
                        }
                        try {
                            if (var2_3 != null) break block87;
                            if (v0 != 0) {
                            }
                            ** GOTO lbl185
                        }
                        catch (IOException v23) {
                            throw cr_0.a(v23);
                        }
                        var9_9 = cj_0.H(var3_2, var7_7);
                        try {
                            if (var2_3 == null) break block76;
lbl185:
                            // 2 sources

                            v0 = cr_0.a(-3951, -23139).equals(var8_8);
                        }
                        catch (IOException v24) {
                            throw cr_0.a(v24);
                        }
                    }
                    try {
                        if (var2_3 != null) break block88;
                        if (v0 != 0) {
                        }
                        ** GOTO lbl200
                    }
                    catch (IOException v25) {
                        throw cr_0.a(v25);
                    }
                    var9_9 = C_.d(var3_2, var7_7);
                    try {
                        if (var2_3 == null) break block76;
lbl200:
                        // 2 sources

                        v0 = (short)cr_0.a(-3905, -16539).equals(var8_8);
                    }
                    catch (IOException v26) {
                        throw cr_0.a(v26);
                    }
                }
                try {
                    if (var2_3 != null) break block89;
                    if (v0 != 0) {
                    }
                    ** GOTO lbl217
                }
                catch (IOException v27) {
                    throw cr_0.a(v27);
                }
                v0 = var3_2;
            }
            var9_9 = C_.d(v0, var7_7);
            try {
                if (var2_3 == null) break block76;
lbl217:
                // 2 sources

                return new e_0(this, var3_2, var5_5);
            }
            catch (IOException v28) {
                throw cr_0.a(v28);
            }
        }
        try {
            if (var6_6.available() > 0) {
                throw new l_0(var5_5.length - var6_6.available() + cr_0.a(-3907, 16304) + var8_8 + "\"");
            }
        }
        catch (IOException v29) {
            throw cr_0.a(v29);
        }
        return var9_9;
    }

    /*
     * Exception decompiling
     */
    private static r_0 g(DataInputStream var0) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    public i_0 M(String string) {
        return new i_0(this.X(string), string);
    }

    public ca_0 u(short s2) {
        return new ca_0(s2);
    }

    public String toString() {
        try {
            return this.S(G.Y(this.X(this.m)));
        }
        catch (Exception exception) {
            return super.toString();
        }
    }

    static C_ Z(cr_0 cr_02, boolean bl, List list) {
        return cr_02.q(bl, list);
    }

    static void q(cr_0 cr_02, boolean bl, String string, Map map, List list) {
        cr_02.h(bl, string, map, list);
    }

    static void m(DataOutputStream dataOutputStream, List list) throws IOException {
        cr_0.u(dataOutputStream, list);
    }

    static short[] a(DataInputStream dataInputStream) throws IOException {
        return cr_0.i(dataInputStream);
    }

    static void D(DataOutputStream dataOutputStream, short[] sArray) throws IOException {
        cr_0.q(dataOutputStream, sArray);
    }

    static r_0 d(DataInputStream dataInputStream) throws IOException {
        return cr_0.g(dataInputStream);
    }

    static byte[] S(DataInputStream dataInputStream) throws IOException {
        return cr_0.v(dataInputStream);
    }

    static Y U(cr_0 cr_02, DataInputStream dataInputStream) throws IOException {
        return cr_02.g(dataInputStream);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        var13 = new String[38];
                        var11_1 = 0;
                        var10_2 = "0\u00fb\tVLl\u001d\u0091`\u001f\u0012\u00aa\u00bc@\u00e6\u001d>\u001fN,'1\u00b3\u0094\u00ff]\u00a89\u00cc\u0011\u00fa\u00b0\u00ebH\u00dc\u0013)![\u00bd?\u0007\u00b4t.D\u00d9\f\u00b7\u00a7K\u00a0\u00ceg\u00b5\u00c1\u00cf\u00b5\u0013\u00ae\r\u00bd`Ao\u0089h\u0099S-B\u00c7\u0006\u0085%K5W\u00f2\u00c3\u0001,\u00ab\u008c\u001f\"\u00c4T\u0006\u009fe\u00fc\u00b9\u00a1\u00a0\u009aM\u0085ao\u009c5n~g\u00b6\u00c4\u00f5\u0013\u00a8\u00a7\u007f\u0005\u00dbHB\u00ca\u0012\u001c\u00bd\u008c\u0012\u00c1\u00e0\u00e5\u00a5\u00bf\u00d4\u000fif\u0003\u008c\u0093CBpu\u00e6|\u0019\u00ec\u00da/\u00eb\u008c\u00a8\n\r\u0081^R\u0005\u00ea\u00d5\u009a\u00b3\u00c1\u0019\u00b9\u00d9\u00f2\u0006\u00e2\u00aeA$c\u00d8\u00d3\u0012\u00ab5\u00b2\u00ea\u00e2\u0003\u00fdz\r\f\u00df\u0018\u0098 \u00d1\u00ca\u0013\u0010\u00ad\u00e9\u0094\u00e7\u0013\u00d1\u0019\u00c7\u0091\u00a5\u00a4\u0088[\u0017$\u009841\u00b9\u00ad!8`f\u00e1\u0014\u00d1\u00fb\bc7O\u00d5\nB\u00df\u00e5\u000f\u0018~\u001b|\u00f8\u00ca\u00c9\u0087w\u001f\u00e1\u00c8y\u0004\u0003\u0019\u0097\u00907/Z\u008bV\u0080\u0081L\u008f\u0080 g\u00c3\u00a0\u00ccJ8S\u00b5)\u00c8\u00bcz \f\u00c2$\b&\u00dc}\u0098\u00c9\u00e8\u0007\u00e7\u00b5nl\u00a8\u00b2n\u00f4\f&\u0010\u0096XWBw<\u00cc\u00f1G\u0000\u001b\u008f\u00f84\":*Z\u00ab\u0007\u00d0\u00b8\u00a7\u00c3\u00b77V\u00f5\u00ff\u00cf\u00ca\u0012\u00dd',\u00e3\u00d9t\n\u00f0l#\rm\u00e5\u0086N\u0011\u008b\n\u00f2\u00e0\u00a1~\u00fao**L\u00d7!\u0089\u00ba\u008d\u0092\u00a3\u00d8\t\u00b6wI\u00e3Hlh\u00ee\u00c8&\u00e5 {\u0005{\u0000\r0\u008a\u00b5\u0000\u0013\u00bd\u00eex\u00ee\u0004\u00aa.\u00a9\u00b0\u001b3\u00e9\u00db\u00ea\u001b\u00c96\u0015\u00b8\u00b3jE\u001a\u00a0\u00a7\u00d9\u0002\u00a5\u001a\u001cWP\u00ad1\u009dL\u007f\u000b\u00eaE\u00e9jr<\u00e1\u00be\u00e6>\u00f0\u0018\u00b0\u00e3\u00e0\u001f\u00bdf\u001f\u0092\u008bk\u00a8\n\u0002\u00df\u00a0[\u007f[\u00c6\u00da\u008a\u00ae\u0084[\n\u00e80\u0012//Cqt\u00ed\u00a3\t\u00d0\u00a4\u00f7,b\u00abH\u009a\\\t\u008c\u0000u\u00b0\u0013pO\u00c9\u009b\rJ\u00e7\u00bf\u009fVvb\u0090R:(\tx\f}\u00d4U\u00f4\u001du\u00bd6\u00eb<\u00130\tx%\u00e2\u001c\u00c0\u00ad\u001cZ\u00d6\u0014\rD\u0004\u00d8\"\u00c6\u00fd\u00db\u00d1\u008d\u000f\u00e3\u00f0$\u0018>~\u00ec\u001c8\f\u0019\u00ae\u009e\u0081tC\u00e2E%%N\u00bc\u000b\u008a\u00c1^\u001d\u00aa\u00d8L\u0007J\u00890\u0012\u00c3\u00b5\u009a\b\u00b3\u00d6\u00cd\u00d3\u00c0\u00f7\u00b9\u00e3@\u008a\u00d5\u00ef{E1=\u00e6I\u0014l\u00f2XK\u00a2x\u0018/a\u008cjWq[\u00db~\u0002Q\u0084\u00c4K\u00c6;DJ\u0007;9[%\u009f\u00faZN\u0012\u00ef\u0082I\u00a4\u009c\u0016[\nH\u0096#\u007f\u00d6\u0019^8Hm\u008a\r\u000e\u008ad\u00ed\u00bd\u00e3a\u007f\u00cc\u00d7\u00dcN\u00b1\u00ae\u00a8\u00f3\u0007\u0012\u009e\u0087\u00a2\u001f\u00b6\u00a4\u00e7`\u001b\u007f\u00da*f\u00f9\u00a2\"\u00ba\b\u00f2Y\u00e3\u00ff?\u00b0G\u0005\u00dd\u00d1\u008e\u00d1U_=\u00ec\u00fb\u0095";
                        var12_3 = "0\u00fb\tVLl\u001d\u0091`\u001f\u0012\u00aa\u00bc@\u00e6\u001d>\u001fN,'1\u00b3\u0094\u00ff]\u00a89\u00cc\u0011\u00fa\u00b0\u00ebH\u00dc\u0013)![\u00bd?\u0007\u00b4t.D\u00d9\f\u00b7\u00a7K\u00a0\u00ceg\u00b5\u00c1\u00cf\u00b5\u0013\u00ae\r\u00bd`Ao\u0089h\u0099S-B\u00c7\u0006\u0085%K5W\u00f2\u00c3\u0001,\u00ab\u008c\u001f\"\u00c4T\u0006\u009fe\u00fc\u00b9\u00a1\u00a0\u009aM\u0085ao\u009c5n~g\u00b6\u00c4\u00f5\u0013\u00a8\u00a7\u007f\u0005\u00dbHB\u00ca\u0012\u001c\u00bd\u008c\u0012\u00c1\u00e0\u00e5\u00a5\u00bf\u00d4\u000fif\u0003\u008c\u0093CBpu\u00e6|\u0019\u00ec\u00da/\u00eb\u008c\u00a8\n\r\u0081^R\u0005\u00ea\u00d5\u009a\u00b3\u00c1\u0019\u00b9\u00d9\u00f2\u0006\u00e2\u00aeA$c\u00d8\u00d3\u0012\u00ab5\u00b2\u00ea\u00e2\u0003\u00fdz\r\f\u00df\u0018\u0098 \u00d1\u00ca\u0013\u0010\u00ad\u00e9\u0094\u00e7\u0013\u00d1\u0019\u00c7\u0091\u00a5\u00a4\u0088[\u0017$\u009841\u00b9\u00ad!8`f\u00e1\u0014\u00d1\u00fb\bc7O\u00d5\nB\u00df\u00e5\u000f\u0018~\u001b|\u00f8\u00ca\u00c9\u0087w\u001f\u00e1\u00c8y\u0004\u0003\u0019\u0097\u00907/Z\u008bV\u0080\u0081L\u008f\u0080 g\u00c3\u00a0\u00ccJ8S\u00b5)\u00c8\u00bcz \f\u00c2$\b&\u00dc}\u0098\u00c9\u00e8\u0007\u00e7\u00b5nl\u00a8\u00b2n\u00f4\f&\u0010\u0096XWBw<\u00cc\u00f1G\u0000\u001b\u008f\u00f84\":*Z\u00ab\u0007\u00d0\u00b8\u00a7\u00c3\u00b77V\u00f5\u00ff\u00cf\u00ca\u0012\u00dd',\u00e3\u00d9t\n\u00f0l#\rm\u00e5\u0086N\u0011\u008b\n\u00f2\u00e0\u00a1~\u00fao**L\u00d7!\u0089\u00ba\u008d\u0092\u00a3\u00d8\t\u00b6wI\u00e3Hlh\u00ee\u00c8&\u00e5 {\u0005{\u0000\r0\u008a\u00b5\u0000\u0013\u00bd\u00eex\u00ee\u0004\u00aa.\u00a9\u00b0\u001b3\u00e9\u00db\u00ea\u001b\u00c96\u0015\u00b8\u00b3jE\u001a\u00a0\u00a7\u00d9\u0002\u00a5\u001a\u001cWP\u00ad1\u009dL\u007f\u000b\u00eaE\u00e9jr<\u00e1\u00be\u00e6>\u00f0\u0018\u00b0\u00e3\u00e0\u001f\u00bdf\u001f\u0092\u008bk\u00a8\n\u0002\u00df\u00a0[\u007f[\u00c6\u00da\u008a\u00ae\u0084[\n\u00e80\u0012//Cqt\u00ed\u00a3\t\u00d0\u00a4\u00f7,b\u00abH\u009a\\\t\u008c\u0000u\u00b0\u0013pO\u00c9\u009b\rJ\u00e7\u00bf\u009fVvb\u0090R:(\tx\f}\u00d4U\u00f4\u001du\u00bd6\u00eb<\u00130\tx%\u00e2\u001c\u00c0\u00ad\u001cZ\u00d6\u0014\rD\u0004\u00d8\"\u00c6\u00fd\u00db\u00d1\u008d\u000f\u00e3\u00f0$\u0018>~\u00ec\u001c8\f\u0019\u00ae\u009e\u0081tC\u00e2E%%N\u00bc\u000b\u008a\u00c1^\u001d\u00aa\u00d8L\u0007J\u00890\u0012\u00c3\u00b5\u009a\b\u00b3\u00d6\u00cd\u00d3\u00c0\u00f7\u00b9\u00e3@\u008a\u00d5\u00ef{E1=\u00e6I\u0014l\u00f2XK\u00a2x\u0018/a\u008cjWq[\u00db~\u0002Q\u0084\u00c4K\u00c6;DJ\u0007;9[%\u009f\u00faZN\u0012\u00ef\u0082I\u00a4\u009c\u0016[\nH\u0096#\u007f\u00d6\u0019^8Hm\u008a\r\u000e\u008ad\u00ed\u00bd\u00e3a\u007f\u00cc\u00d7\u00dcN\u00b1\u00ae\u00a8\u00f3\u0007\u0012\u009e\u0087\u00a2\u001f\u00b6\u00a4\u00e7`\u001b\u007f\u00da*f\u00f9\u00a2\"\u00ba\b\u00f2Y\u00e3\u00ff?\u00b0G\u0005\u00dd\u00d1\u008e\u00d1U_=\u00ec\u00fb\u0095".length();
                        var9_4 = 10;
                        var8_5 = -1;
                        cr_0.Q(null);
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 64;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block28;
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
                            var10_2 = "\u00fb\u000e\u0012d\u00ff\u0012\r\u00d2\u00dc\u00e8\u00c9\u0014\u00db\u0080\u00d1\u00bb\u00cf\u0000\u00f7\u00eb";
                            var12_3 = "\u00fb\u000e\u0012d\u00ff\u0012\r\u00d2\u00dc\u00e8\u00c9\u0014\u00db\u0080\u00d1\u00bb\u00cf\u0000\u00f7\u00eb".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 90;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block28;
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
                            break block29;
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
                                    v15 = 68;
                                    break;
                                }
                                case 1: {
                                    v15 = 108;
                                    break;
                                }
                                case 2: {
                                    v15 = 115;
                                    break;
                                }
                                case 3: {
                                    v15 = 87;
                                    break;
                                }
                                case 4: {
                                    v15 = 80;
                                    break;
                                }
                                case 5: {
                                    v15 = 91;
                                    break;
                                }
                                default: {
                                    v15 = 126;
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
                cr_0.a = var13;
                cr_0.b = new String[38];
                var0_7 = 4939948446599757188L;
                var6_8 = new long[19];
                var3_9 = 0;
                var4_10 = "\u00edX\u00cf\u00c3'5\u00f32\u00f5\u00ba;\u00ea\u00c3\u0082\u00b2d4\u00b9\u00cc\"z\u00e2!E0\u00c0}\u00c1kZB\u0010C>.\u00ff\u00e7\u00d0\u0015\u008b\u0093;\u001e\u00c122\u001f2G\u001c\u001a{\u00f3\r k\u00e6R5\u00ee.\u00feO\u00ff\u00f4\u0005[1\u00c1\u00cb^\u001a\u00e2\u00f8}pH\u00fa\u009e0\u0015ZM^A\t\u00eey\u00d41\u00bd$VlH\u00bc\u0094\u00d7b\u00ae\u000e\u00d8\u00a4\u00fd\u0089j\u009a\u00fezY\u00f2\u00ffY\u001c\u0089\u00c4\u0005\u0013xt\u0093\u0090\u00b4I\u0085\u00c0_\u00fe\u0095\u00f8\u00cb\u00d9\u00a4\"dZ";
                var5_11 = "\u00edX\u00cf\u00c3'5\u00f32\u00f5\u00ba;\u00ea\u00c3\u0082\u00b2d4\u00b9\u00cc\"z\u00e2!E0\u00c0}\u00c1kZB\u0010C>.\u00ff\u00e7\u00d0\u0015\u008b\u0093;\u001e\u00c122\u001f2G\u001c\u001a{\u00f3\r k\u00e6R5\u00ee.\u00feO\u00ff\u00f4\u0005[1\u00c1\u00cb^\u001a\u00e2\u00f8}pH\u00fa\u009e0\u0015ZM^A\t\u00eey\u00d41\u00bd$VlH\u00bc\u0094\u00d7b\u00ae\u000e\u00d8\u00a4\u00fd\u0089j\u009a\u00fezY\u00f2\u00ffY\u001c\u0089\u00c4\u0005\u0013xt\u0093\u0090\u00b4I\u0085\u00c0_\u00fe\u0095\u00f8\u00cb\u00d9\u00a4\"dZ".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block30;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "4\u00a1\u00df\u0091\u00d5\u008f\u0086dJ\u00c8\u00ffc\u00ba\u00ecT\u0014";
                    var5_11 = "4\u00a1\u00df\u0091\u00d5\u008f\u0086dJ\u00c8\u00ffc\u00ba\u00ecT\u0014".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block31;
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
        cr_0.d = var6_8;
        cr_0.e = new Integer[19];
        try {
            v22 = cr_0.class.desiredAssertionStatus() == false;
        }
        catch (l_0 v23) {
            throw cr_0.a(v23);
        }
        cr_0.Q = v22;
    }

    public static void Q(ky_2[] ky_2Array) {
        j = ky_2Array;
    }

    public static ky_2[] q() {
        return j;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF09C) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 32;
                    break;
                }
                case 1: {
                    n14 = 24;
                    break;
                }
                case 2: {
                    n14 = 49;
                    break;
                }
                case 3: {
                    n14 = 105;
                    break;
                }
                case 4: {
                    n14 = 103;
                    break;
                }
                case 5: {
                    n14 = 217;
                    break;
                }
                case 6: {
                    n14 = 253;
                    break;
                }
                case 7: {
                    n14 = 62;
                    break;
                }
                case 8: {
                    n14 = 99;
                    break;
                }
                case 9: {
                    n14 = 228;
                    break;
                }
                case 10: {
                    n14 = 36;
                    break;
                }
                case 11: {
                    n14 = 222;
                    break;
                }
                case 12: {
                    n14 = 165;
                    break;
                }
                case 13: {
                    n14 = 254;
                    break;
                }
                case 14: {
                    n14 = 66;
                    break;
                }
                case 15: {
                    n14 = 173;
                    break;
                }
                case 16: {
                    n14 = 194;
                    break;
                }
                case 17: {
                    n14 = 53;
                    break;
                }
                case 18: {
                    n14 = 54;
                    break;
                }
                case 19: {
                    n14 = 96;
                    break;
                }
                case 20: {
                    n14 = 134;
                    break;
                }
                case 21: {
                    n14 = 208;
                    break;
                }
                case 22: {
                    n14 = 74;
                    break;
                }
                case 23: {
                    n14 = 182;
                    break;
                }
                case 24: {
                    n14 = 15;
                    break;
                }
                case 25: {
                    n14 = 145;
                    break;
                }
                case 26: {
                    n14 = 101;
                    break;
                }
                case 27: {
                    n14 = 161;
                    break;
                }
                case 28: {
                    n14 = 204;
                    break;
                }
                case 29: {
                    n14 = 51;
                    break;
                }
                case 30: {
                    n14 = 205;
                    break;
                }
                case 31: {
                    n14 = 251;
                    break;
                }
                case 32: {
                    n14 = 171;
                    break;
                }
                case 33: {
                    n14 = 233;
                    break;
                }
                case 34: {
                    n14 = 132;
                    break;
                }
                case 35: {
                    n14 = 125;
                    break;
                }
                case 36: {
                    n14 = 55;
                    break;
                }
                case 37: {
                    n14 = 186;
                    break;
                }
                case 38: {
                    n14 = 207;
                    break;
                }
                case 39: {
                    n14 = 200;
                    break;
                }
                case 40: {
                    n14 = 33;
                    break;
                }
                case 41: {
                    n14 = 84;
                    break;
                }
                case 42: {
                    n14 = 157;
                    break;
                }
                case 43: {
                    n14 = 163;
                    break;
                }
                case 44: {
                    n14 = 27;
                    break;
                }
                case 45: {
                    n14 = 42;
                    break;
                }
                case 46: {
                    n14 = 38;
                    break;
                }
                case 47: {
                    n14 = 91;
                    break;
                }
                case 48: {
                    n14 = 0;
                    break;
                }
                case 49: {
                    n14 = 83;
                    break;
                }
                case 50: {
                    n14 = 133;
                    break;
                }
                case 51: {
                    n14 = 248;
                    break;
                }
                case 52: {
                    n14 = 94;
                    break;
                }
                case 53: {
                    n14 = 195;
                    break;
                }
                case 54: {
                    n14 = 118;
                    break;
                }
                case 55: {
                    n14 = 123;
                    break;
                }
                case 56: {
                    n14 = 241;
                    break;
                }
                case 57: {
                    n14 = 151;
                    break;
                }
                case 58: {
                    n14 = 45;
                    break;
                }
                case 59: {
                    n14 = 102;
                    break;
                }
                case 60: {
                    n14 = 121;
                    break;
                }
                case 61: {
                    n14 = 216;
                    break;
                }
                case 62: {
                    n14 = 237;
                    break;
                }
                case 63: {
                    n14 = 252;
                    break;
                }
                case 64: {
                    n14 = 114;
                    break;
                }
                case 65: {
                    n14 = 72;
                    break;
                }
                case 66: {
                    n14 = 219;
                    break;
                }
                case 67: {
                    n14 = 28;
                    break;
                }
                case 68: {
                    n14 = 164;
                    break;
                }
                case 69: {
                    n14 = 174;
                    break;
                }
                case 70: {
                    n14 = 147;
                    break;
                }
                case 71: {
                    n14 = 138;
                    break;
                }
                case 72: {
                    n14 = 229;
                    break;
                }
                case 73: {
                    n14 = 37;
                    break;
                }
                case 74: {
                    n14 = 146;
                    break;
                }
                case 75: {
                    n14 = 183;
                    break;
                }
                case 76: {
                    n14 = 196;
                    break;
                }
                case 77: {
                    n14 = 98;
                    break;
                }
                case 78: {
                    n14 = 75;
                    break;
                }
                case 79: {
                    n14 = 245;
                    break;
                }
                case 80: {
                    n14 = 142;
                    break;
                }
                case 81: {
                    n14 = 197;
                    break;
                }
                case 82: {
                    n14 = 135;
                    break;
                }
                case 83: {
                    n14 = 80;
                    break;
                }
                case 84: {
                    n14 = 120;
                    break;
                }
                case 85: {
                    n14 = 234;
                    break;
                }
                case 86: {
                    n14 = 170;
                    break;
                }
                case 87: {
                    n14 = 187;
                    break;
                }
                case 88: {
                    n14 = 177;
                    break;
                }
                case 89: {
                    n14 = 128;
                    break;
                }
                case 90: {
                    n14 = 155;
                    break;
                }
                case 91: {
                    n14 = 19;
                    break;
                }
                case 92: {
                    n14 = 85;
                    break;
                }
                case 93: {
                    n14 = 110;
                    break;
                }
                case 94: {
                    n14 = 111;
                    break;
                }
                case 95: {
                    n14 = 230;
                    break;
                }
                case 96: {
                    n14 = 154;
                    break;
                }
                case 97: {
                    n14 = 168;
                    break;
                }
                case 98: {
                    n14 = 150;
                    break;
                }
                case 99: {
                    n14 = 48;
                    break;
                }
                case 100: {
                    n14 = 5;
                    break;
                }
                case 101: {
                    n14 = 90;
                    break;
                }
                case 102: {
                    n14 = 225;
                    break;
                }
                case 103: {
                    n14 = 137;
                    break;
                }
                case 104: {
                    n14 = 13;
                    break;
                }
                case 105: {
                    n14 = 81;
                    break;
                }
                case 106: {
                    n14 = 2;
                    break;
                }
                case 107: {
                    n14 = 18;
                    break;
                }
                case 108: {
                    n14 = 57;
                    break;
                }
                case 109: {
                    n14 = 16;
                    break;
                }
                case 110: {
                    n14 = 88;
                    break;
                }
                case 111: {
                    n14 = 112;
                    break;
                }
                case 112: {
                    n14 = 113;
                    break;
                }
                case 113: {
                    n14 = 93;
                    break;
                }
                case 114: {
                    n14 = 213;
                    break;
                }
                case 115: {
                    n14 = 26;
                    break;
                }
                case 116: {
                    n14 = 169;
                    break;
                }
                case 117: {
                    n14 = 184;
                    break;
                }
                case 118: {
                    n14 = 79;
                    break;
                }
                case 119: {
                    n14 = 236;
                    break;
                }
                case 120: {
                    n14 = 12;
                    break;
                }
                case 121: {
                    n14 = 240;
                    break;
                }
                case 122: {
                    n14 = 126;
                    break;
                }
                case 123: {
                    n14 = 60;
                    break;
                }
                case 124: {
                    n14 = 92;
                    break;
                }
                case 125: {
                    n14 = 11;
                    break;
                }
                case 126: {
                    n14 = 144;
                    break;
                }
                case 127: {
                    n14 = 97;
                    break;
                }
                case 128: {
                    n14 = 238;
                    break;
                }
                case 129: {
                    n14 = 209;
                    break;
                }
                case 130: {
                    n14 = 246;
                    break;
                }
                case 131: {
                    n14 = 203;
                    break;
                }
                case 132: {
                    n14 = 191;
                    break;
                }
                case 133: {
                    n14 = 34;
                    break;
                }
                case 134: {
                    n14 = 64;
                    break;
                }
                case 135: {
                    n14 = 235;
                    break;
                }
                case 136: {
                    n14 = 59;
                    break;
                }
                case 137: {
                    n14 = 65;
                    break;
                }
                case 138: {
                    n14 = 215;
                    break;
                }
                case 139: {
                    n14 = 1;
                    break;
                }
                case 140: {
                    n14 = 109;
                    break;
                }
                case 141: {
                    n14 = 10;
                    break;
                }
                case 142: {
                    n14 = 223;
                    break;
                }
                case 143: {
                    n14 = 178;
                    break;
                }
                case 144: {
                    n14 = 40;
                    break;
                }
                case 145: {
                    n14 = 153;
                    break;
                }
                case 146: {
                    n14 = 67;
                    break;
                }
                case 147: {
                    n14 = 220;
                    break;
                }
                case 148: {
                    n14 = 58;
                    break;
                }
                case 149: {
                    n14 = 175;
                    break;
                }
                case 150: {
                    n14 = 89;
                    break;
                }
                case 151: {
                    n14 = 159;
                    break;
                }
                case 152: {
                    n14 = 249;
                    break;
                }
                case 153: {
                    n14 = 39;
                    break;
                }
                case 154: {
                    n14 = 100;
                    break;
                }
                case 155: {
                    n14 = 47;
                    break;
                }
                case 156: {
                    n14 = 50;
                    break;
                }
                case 157: {
                    n14 = 180;
                    break;
                }
                case 158: {
                    n14 = 14;
                    break;
                }
                case 159: {
                    n14 = 140;
                    break;
                }
                case 160: {
                    n14 = 185;
                    break;
                }
                case 161: {
                    n14 = 52;
                    break;
                }
                case 162: {
                    n14 = 206;
                    break;
                }
                case 163: {
                    n14 = 129;
                    break;
                }
                case 164: {
                    n14 = 71;
                    break;
                }
                case 165: {
                    n14 = 143;
                    break;
                }
                case 166: {
                    n14 = 7;
                    break;
                }
                case 167: {
                    n14 = 87;
                    break;
                }
                case 168: {
                    n14 = 86;
                    break;
                }
                case 169: {
                    n14 = 218;
                    break;
                }
                case 170: {
                    n14 = 201;
                    break;
                }
                case 171: {
                    n14 = 78;
                    break;
                }
                case 172: {
                    n14 = 82;
                    break;
                }
                case 173: {
                    n14 = 119;
                    break;
                }
                case 174: {
                    n14 = 17;
                    break;
                }
                case 175: {
                    n14 = 106;
                    break;
                }
                case 176: {
                    n14 = 68;
                    break;
                }
                case 177: {
                    n14 = 8;
                    break;
                }
                case 178: {
                    n14 = 179;
                    break;
                }
                case 179: {
                    n14 = 232;
                    break;
                }
                case 180: {
                    n14 = 167;
                    break;
                }
                case 181: {
                    n14 = 226;
                    break;
                }
                case 182: {
                    n14 = 149;
                    break;
                }
                case 183: {
                    n14 = 160;
                    break;
                }
                case 184: {
                    n14 = 107;
                    break;
                }
                case 185: {
                    n14 = 148;
                    break;
                }
                case 186: {
                    n14 = 158;
                    break;
                }
                case 187: {
                    n14 = 30;
                    break;
                }
                case 188: {
                    n14 = 189;
                    break;
                }
                case 189: {
                    n14 = 198;
                    break;
                }
                case 190: {
                    n14 = 25;
                    break;
                }
                case 191: {
                    n14 = 116;
                    break;
                }
                case 192: {
                    n14 = 172;
                    break;
                }
                case 193: {
                    n14 = 210;
                    break;
                }
                case 194: {
                    n14 = 211;
                    break;
                }
                case 195: {
                    n14 = 188;
                    break;
                }
                case 196: {
                    n14 = 131;
                    break;
                }
                case 197: {
                    n14 = 212;
                    break;
                }
                case 198: {
                    n14 = 70;
                    break;
                }
                case 199: {
                    n14 = 247;
                    break;
                }
                case 200: {
                    n14 = 243;
                    break;
                }
                case 201: {
                    n14 = 199;
                    break;
                }
                case 202: {
                    n14 = 250;
                    break;
                }
                case 203: {
                    n14 = 190;
                    break;
                }
                case 204: {
                    n14 = 239;
                    break;
                }
                case 205: {
                    n14 = 9;
                    break;
                }
                case 206: {
                    n14 = 122;
                    break;
                }
                case 207: {
                    n14 = 156;
                    break;
                }
                case 208: {
                    n14 = 130;
                    break;
                }
                case 209: {
                    n14 = 6;
                    break;
                }
                case 210: {
                    n14 = 95;
                    break;
                }
                case 211: {
                    n14 = 244;
                    break;
                }
                case 212: {
                    n14 = 136;
                    break;
                }
                case 213: {
                    n14 = 108;
                    break;
                }
                case 214: {
                    n14 = 192;
                    break;
                }
                case 215: {
                    n14 = 31;
                    break;
                }
                case 216: {
                    n14 = 221;
                    break;
                }
                case 217: {
                    n14 = 69;
                    break;
                }
                case 218: {
                    n14 = 127;
                    break;
                }
                case 219: {
                    n14 = 41;
                    break;
                }
                case 220: {
                    n14 = 231;
                    break;
                }
                case 221: {
                    n14 = 20;
                    break;
                }
                case 222: {
                    n14 = 46;
                    break;
                }
                case 223: {
                    n14 = 176;
                    break;
                }
                case 224: {
                    n14 = 35;
                    break;
                }
                case 225: {
                    n14 = 3;
                    break;
                }
                case 226: {
                    n14 = 4;
                    break;
                }
                case 227: {
                    n14 = 77;
                    break;
                }
                case 228: {
                    n14 = 56;
                    break;
                }
                case 229: {
                    n14 = 214;
                    break;
                }
                case 230: {
                    n14 = 141;
                    break;
                }
                case 231: {
                    n14 = 255;
                    break;
                }
                case 232: {
                    n14 = 44;
                    break;
                }
                case 233: {
                    n14 = 152;
                    break;
                }
                case 234: {
                    n14 = 181;
                    break;
                }
                case 235: {
                    n14 = 202;
                    break;
                }
                case 236: {
                    n14 = 21;
                    break;
                }
                case 237: {
                    n14 = 139;
                    break;
                }
                case 238: {
                    n14 = 227;
                    break;
                }
                case 239: {
                    n14 = 193;
                    break;
                }
                case 240: {
                    n14 = 29;
                    break;
                }
                case 241: {
                    n14 = 224;
                    break;
                }
                case 242: {
                    n14 = 166;
                    break;
                }
                case 243: {
                    n14 = 242;
                    break;
                }
                case 244: {
                    n14 = 124;
                    break;
                }
                case 245: {
                    n14 = 22;
                    break;
                }
                case 246: {
                    n14 = 76;
                    break;
                }
                case 247: {
                    n14 = 61;
                    break;
                }
                case 248: {
                    n14 = 43;
                    break;
                }
                case 249: {
                    n14 = 117;
                    break;
                }
                case 250: {
                    n14 = 73;
                    break;
                }
                case 251: {
                    n14 = 162;
                    break;
                }
                case 252: {
                    n14 = 115;
                    break;
                }
                case 253: {
                    n14 = 104;
                    break;
                }
                case 254: {
                    n14 = 63;
                    break;
                }
                default: {
                    n14 = 23;
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
            cr_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7D4;
        if (e[n11] == null) {
            cr_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

