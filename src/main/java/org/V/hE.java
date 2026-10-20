/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import org.C;
import org.F.c;
import org.I;
import org.P;
import org.U;
import org.Y;
import org.b_0;
import org.c_0;
import org.v.NS;
import org.v.NV;
import org.v.R8;
import org.v.RC;
import org.v.RG;
import org.v.RY;
import org.v._r_0;
import org.v._x_0;
import org.v.fK;
import org.v.f_0;
import org.v.hG;
import org.v.hI;
import org.v.hc_0;
import org.v.nt_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hE
extends c_0
implements C {
    private int l = -1;
    @c
    private Y E;
    private final hI U = new hI();
    private static final String[] c;
    private static final String[] d;

    public hE(String string, Class clazz, String[] stringArray, Class[] classArray) throws b_0 {
        this.U.Z(hE.a(18935, 10670));
        this.U.A(C.G);
        this.y(clazz);
        this.F(stringArray, classArray);
        this.D(string);
    }

    public hE(String string, Class clazz, String[] stringArray, Class[] classArray, Class[] classArray2, @c ClassLoader classLoader) throws b_0 {
        this.U.Z(hE.a(18935, 10670));
        this.U.A(C.G);
        this.y(clazz);
        this.F(stringArray, classArray);
        this.K(classArray2);
        this.c(classLoader);
        this.D(string);
    }

    public hE(String string, Class clazz, String[] stringArray, Class[] classArray, Class[] classArray2, Class clazz2, Class[] classArray3, @c ClassLoader classLoader) throws b_0 {
        this.U.Z(hE.a(18935, 10670));
        this.U.A(C.G);
        this.y(clazz);
        this.F(stringArray, classArray);
        this.K(classArray2);
        this.O(clazz2);
        this.b(classArray3);
        this.c(classLoader);
        this.D(string);
    }

    public hE(hc_0 hc_02, String string, @c Class clazz, Class[] classArray, boolean bl, Class clazz2, String string2, String[] stringArray, Class[] classArray2, Class[] classArray3, @c ClassLoader classLoader) throws b_0, IOException {
        this.U.Z(hE.a(18935, 10670));
        this.U.A(C.G);
        this.F(string);
        this.O(clazz);
        this.b(classArray);
        this.M(bl);
        this.y(clazz2);
        this.v(string2);
        this.F(stringArray, classArray2);
        this.K(classArray3);
        this.c(classLoader);
        this.Z(hc_02);
    }

    public hE() {
        this.U.Z(hE.a(18935, 10670));
        this.U.A(C.G);
    }

    @Override
    public void c(@c ClassLoader classLoader) {
        this.U.e(classLoader);
    }

    @Override
    public void w(boolean bl, boolean bl2, boolean bl3) {
        this.U.L(bl, bl2, bl3);
    }

    @Override
    public void n(int n10) {
        this.U.n(n10);
        this.l = n10;
    }

    @Override
    public void v(int n10) {
        this.U.v(n10);
    }

    @Override
    public void l(@c U u10) {
        this.U.e(u10);
    }

    @Override
    public void X(@c Y y2) {
        this.U.s(y2);
        this.E = y2;
    }

    @Override
    public void u(String[] stringArray) {
        this.U.A(stringArray);
    }

    @Override
    public String[] F() {
        return this.U.H();
    }

    public EnumSet G() {
        return this.U.u();
    }

    public hE N(EnumSet enumSet) {
        this.U.S(enumSet);
        return this;
    }

    @Override
    public void E(Class clazz) {
        this.U.A(clazz);
    }

    @Override
    public Class o() {
        return this.U.c();
    }

    @Override
    public void b(Class[] classArray) {
        this.U.j(classArray);
    }

    @Override
    public void z(Class clazz) {
        this.U.J(clazz);
    }

    @Override
    public void y(Class clazz) {
        this.U.J(clazz);
    }

    @Override
    public void V(Class[] classArray) {
        this.U.B(classArray);
    }

    @Override
    public void C(boolean bl) {
        this.U.h(bl);
    }

    @Override
    public void Q(boolean[] blArray) {
        this.U.e(blArray);
    }

    @Override
    public void F(String[] stringArray, Class[] classArray) {
        this.U.N(stringArray, classArray);
    }

    @Override
    public void O(String[][] stringArray, Class[][] classArray) {
        this.U.Y(stringArray, classArray);
    }

    @Override
    public void F(String string) {
        this.U.Z(string);
    }

    @Override
    public void O(@c Class clazz) {
        this.U.c(clazz);
    }

    @Override
    public void M(boolean bl) {
        this.U.Y(bl);
    }

    @Override
    public void W(boolean[] blArray) {
        this.U.p(blArray);
    }

    @Override
    public void v(String string) {
        this.U.L(string);
    }

    @Override
    public void V(String[] stringArray) {
        this.U.E(stringArray);
    }

    @Override
    public void K(Class[] classArray) {
        this.U.I(classArray);
    }

    @Override
    public void v(Class[][] classArray) {
        this.U.q(classArray);
    }

    @Override
    public Method Z() {
        return this.U.E();
    }

    @Override
    public Method y(int n10) {
        return this.U.R(n10);
    }

    @Override
    public Method[] l() {
        return this.U.C();
    }

    @Override
    public void Y(@c String string, Reader reader) throws b_0, IOException {
        this.Z(new hc_0(string, reader));
    }

    @Override
    public void a(String[] stringArray, Reader[] readerArray) throws b_0, IOException {
        block4: {
            int n10 = stringArray.length;
            hc_0[] hc_0Array = new hc_0[n10];
            String[] stringArray2 = RG.C();
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    hc_0Array[i2] = new hc_0(stringArray[i2], readerArray[i2]);
                    if (stringArray2 != null) {
                        if (stringArray2 != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (b_0 b_02) {
                    throw hE.a(b_02);
                }
            }
            this.n(hc_0Array);
        }
    }

    public final void Z(hc_0 hc_02) throws b_0, IOException {
        this.n(new hc_0[]{hc_02});
    }

    public final void n(hc_0[] hc_0Array) throws b_0, IOException {
        block4: {
            hG[] hGArray = new hG[hc_0Array.length];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < hc_0Array.length; ++i2) {
                try {
                    hGArray[i2] = new hG(hc_0Array[i2]);
                    hGArray[i2].Q(this.l);
                    hGArray[i2].S(this.E);
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (b_0 b_02) {
                    throw hE.a(b_02);
                }
            }
            this.p(hGArray);
        }
    }

    public final void p(hG[] hGArray) throws b_0, IOException {
        block22: {
            hG hG2;
            hI hI2;
            String string;
            String[] stringArray;
            int n10;
            block25: {
                block21: {
                    hG[] hGArray2;
                    block20: {
                        String string2;
                        block24: {
                            block19: {
                                hG[] hGArray3;
                                block18: {
                                    n10 = hGArray.length;
                                    stringArray = RG.C();
                                    try {
                                        try {
                                            this.U.E(n10);
                                            hGArray3 = hGArray;
                                            if (stringArray == null) break block18;
                                            if (hGArray3.length < 1) break block19;
                                        }
                                        catch (b_0 b_02) {
                                            throw hE.a(b_02);
                                        }
                                        hGArray3 = hGArray;
                                    }
                                    catch (b_0 b_03) {
                                        throw hE.a(b_03);
                                    }
                                }
                                string2 = hGArray3[0].g().F();
                                break block24;
                            }
                            string2 = null;
                        }
                        string = string2;
                        try {
                            try {
                                hI2 = this.U;
                                hGArray2 = hGArray;
                                if (stringArray == null) break block20;
                                if (hGArray2.length != 1) break block21;
                            }
                            catch (b_0 b_04) {
                                throw hE.a(b_04);
                            }
                            hGArray2 = hGArray;
                        }
                        catch (b_0 b_05) {
                            throw hE.a(b_05);
                        }
                    }
                    hG2 = hGArray2[0];
                    break block25;
                }
                hG2 = null;
            }
            fK[] fKArray = hI2.A(hG2);
            _r_0[][] _r_0Array = new _r_0[n10][];
            NS[][] nSArray = new NS[n10][];
            for (int i2 = 0; i2 < hGArray.length; ++i2) {
                R8 r8;
                hG hG3;
                block26: {
                    NV nV2;
                    block23: {
                        Class clazz = this.U.L(i2);
                        hG3 = hGArray[i2];
                        nV2 = hG3.V();
                        try {
                            if (stringArray == null) break block22;
                            if (clazz != Void.TYPE) break block23;
                        }
                        catch (b_0 b_06) {
                            throw hE.a(b_06);
                        }
                        r8 = new RY(nV2);
                        if (stringArray != null) break block26;
                    }
                    r8 = new RC(hG3.C(), nV2);
                }
                try {
                    if (!hG3.d(f_0.END_OF_INPUT)) {
                        throw new b_0(hE.a(18928, -29689) + hG3.M() + "\"", hG3.C());
                    }
                }
                catch (b_0 b_07) {
                    throw hE.a(b_07);
                }
                _r_0Array[i2] = new _r_0[]{r8};
                nSArray[i2] = new NS[0];
                if (stringArray != null) continue;
            }
            this.U.D(string, fKArray, _r_0Array, nSArray);
        }
    }

    protected nt_0[] G(I i2, @c Class[] classArray) {
        nt_0[] nt_0Array;
        block10: {
            Class[] classArray2;
            String[] stringArray;
            block8: {
                block9: {
                    stringArray = RG.C();
                    try {
                        try {
                            classArray2 = classArray;
                            if (stringArray == null) break block8;
                            if (classArray2 != null) break block9;
                        }
                        catch (P p2) {
                            throw hE.a(p2);
                        }
                        return new nt_0[0];
                    }
                    catch (P p3) {
                        throw hE.a(p3);
                    }
                }
                classArray2 = classArray;
            }
            nt_0[] nt_0Array2 = new nt_0[classArray2.length];
            for (int i3 = 0; i3 < classArray.length; ++i3) {
                try {
                    nt_0Array = nt_0Array2;
                    if (stringArray != null) {
                        nt_0Array[i3] = this.L(i2, classArray[i3]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block10;
                }
                catch (P p5) {
                    throw hE.a(p5);
                }
            }
            nt_0Array = nt_0Array2;
        }
        return nt_0Array;
    }

    @c
    protected nt_0 l(I i2, @c Class clazz) {
        return this.U.N(i2, clazz);
    }

    protected nt_0 L(I i2, Class clazz) {
        return this.U.k(i2, clazz);
    }

    @Override
    @c
    public Object V(@c Object[] objectArray) throws InvocationTargetException {
        return this.C(0, objectArray);
    }

    @Override
    @c
    public Object C(int n10, @c Object[] objectArray) throws InvocationTargetException {
        Method method = this.y(n10);
        try {
            return method.invoke(null, objectArray);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new P(illegalAccessException.toString(), illegalAccessException);
        }
    }

    @Override
    public Class Z() {
        return this.U.e();
    }

    @Override
    public Map Q() {
        return this.U.Q();
    }

    @Deprecated
    public static Object y(String string, Class clazz, String[] stringArray, @c ClassLoader classLoader) throws b_0 {
        try {
            return hE.S(new hc_0(null, new StringReader(string)), hE.a(18933, -31788), null, clazz, stringArray, null);
        }
        catch (IOException iOException) {
            AssertionError assertionError = new AssertionError((Object)hE.a(18941, -22561));
            ((Throwable)((Object)assertionError)).initCause(iOException);
            throw assertionError;
        }
    }

    @Deprecated
    public static Object S(hc_0 hc_02, String string, @c Class clazz, Class clazz2, String[] stringArray, @c ClassLoader classLoader) throws b_0, IOException {
        return hE.L(hc_02, new String[0], string, clazz, clazz2, stringArray, classLoader);
    }

    @Deprecated
    public static Object L(hc_0 hc_02, String[] stringArray, String string, @c Class clazz, Class clazz2, String[] stringArray2, @c ClassLoader classLoader) throws b_0, IOException {
        hE hE2 = new hE();
        hE2.F(string);
        hE2.O(clazz);
        hE2.u(stringArray);
        hE2.c(classLoader);
        return hE2.Z(hc_02, clazz2, stringArray2);
    }

    @Override
    public Object j(Reader reader, Class clazz, String[] stringArray) throws b_0, IOException {
        return this.Z(new hc_0(null, reader), clazz, stringArray);
    }

    @Override
    public Object H(String string, Class clazz, String[] stringArray) throws b_0 {
        try {
            return this.j(new StringReader(string), clazz, stringArray);
        }
        catch (IOException iOException) {
            throw new P(hE.a(18932, 2600), iOException);
        }
    }

    /*
     * Unable to fully structure code
     */
    public Object Z(hc_0 var1_1, Class var2_2, String[] var3_3) throws b_0, IOException {
        block20: {
            block24: {
                block25: {
                    block18: {
                        block19: {
                            block21: {
                                block17: {
                                    var4_4 = RG.C();
                                    v0 = var2_2;
                                    if (var4_4 == null) break block21;
                                    try {
                                        block22: {
                                            if (v0.isInterface()) break block17;
                                            break block22;
                                            catch (InstantiationException v1) {
                                                throw hE.a(v1);
                                            }
                                        }
                                        throw new P("\"" + var2_2 + hE.a(18940, 9850));
                                    }
                                    catch (InstantiationException v2) {
                                        throw hE.a(v2);
                                    }
                                }
                                v0 = var2_2;
                            }
                            var6_5 = v0.getDeclaredMethods();
                            v3 = var6_5;
                            if (var4_4 == null) break block18;
                            try {
                                block23: {
                                    if (v3.length == 1) break block19;
                                    break block23;
                                    catch (InstantiationException v4) {
                                        throw hE.a(v4);
                                    }
                                }
                                throw new P(hE.a(18930, -24608) + var2_2 + hE.a(18934, 15687));
                            }
                            catch (InstantiationException v5) {
                                throw hE.a(v5);
                            }
                        }
                        v3 = var6_5;
                    }
                    var5_6 = v3[0];
                    this.b(new Class[]{var2_2});
                    this.C(true);
                    this.M(false);
                    v6 = this;
                    if (var4_4 == null) break block24;
                    if (!(v6 instanceof C)) ** GOTO lbl52
                    break block25;
                    catch (InstantiationException v7) {
                        throw hE.a(v7);
                    }
                }
                try {
                    block26: {
                        this.y(var5_6.getReturnType());
                        if (var4_4 != null) break block20;
                        break block26;
                        catch (InstantiationException v8) {
                            throw hE.a(v8);
                        }
                    }
                    v6 = this;
                }
                catch (InstantiationException v9) {
                    throw hE.a(v9);
                }
            }
            v6.y(var5_6.getReturnType());
        }
        this.v(var5_6.getName());
        this.F(var3_3, var5_6.getParameterTypes());
        this.K(var5_6.getExceptionTypes());
        this.Z(var1_1);
        var6_5 = this.Z().getDeclaringClass();
        try {
            return var6_5.newInstance();
        }
        catch (InstantiationException var7_7) {
            throw new P(var7_7.toString(), var7_7);
        }
        catch (IllegalAccessException var7_8) {
            throw new P(var7_8.toString(), var7_8);
        }
    }

    public static String[] R(hc_0 hc_02) throws b_0, IOException {
        hG hG2;
        hG hG3;
        block7: {
            hG3 = new hG(hc_02);
            String[] stringArray = RG.C();
            while (hG3.Z(hE.a(18929, 29963))) {
                try {
                    hG2 = hG3;
                    if (stringArray != null) {
                        hG2.l();
                        if (stringArray != null) continue;
                        break;
                    }
                    break block7;
                }
                catch (b_0 b_02) {
                    throw hE.a(b_02);
                }
            }
            hG2 = hG3;
        }
        NV nV2 = hG2.V();
        try {
            if (!hG3.d(f_0.END_OF_INPUT)) {
                throw new b_0(hE.a(18931, 9524) + hG3.M() + "\"", hc_02.m());
            }
        }
        catch (b_0 b_03) {
            throw hE.a(b_03);
        }
        HashSet hashSet = new HashSet();
        new _x_0(hashSet).U(nV2);
        return hashSet.toArray(new String[hashSet.size()]);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "\u00dd$ \u0005;N:\rj\u00e72\u001e\u0018j\u00eb\u00b5\u0005\u00ef\u00ecB\u0014#g\u00c7~F\u0097\u0019\u009b\u00ed\u00a4\u0006\u00cc#\u0080\u0002$\u00f3!N \t\u00d6\u00d8J\u001f\u0015W\u00e2\u00ccx5\u001ex\u009a\u0098xM\t\u00f3`J\u00fe\u0080r\u00ac\u00d3\u0016;\u00a8q^\u0006Q\u0095\u00d5\u009e\u00fc\u001a\u0012\u0004\u00ea\u00d1\u0005\u00c9\u008d\u001d\u00ce<\u008c\u00edG\u00c9@\u001c\u0095\u00a1\u00b0\u0012\u0005u\u00f1\u00f6\u00cd\u00f3\u009d\u0001,u\u00efx\u0089\u00a7\u0014i\u00a0/\u000bC\u00fd\u00b7\u00fa4\u00cf\u00e2\u00f2\u0081\u00baX";
                var4_3 = "\u00dd$ \u0005;N:\rj\u00e72\u001e\u0018j\u00eb\u00b5\u0005\u00ef\u00ecB\u0014#g\u00c7~F\u0097\u0019\u009b\u00ed\u00a4\u0006\u00cc#\u0080\u0002$\u00f3!N \t\u00d6\u00d8J\u001f\u0015W\u00e2\u00ccx5\u001ex\u009a\u0098xM\t\u00f3`J\u00fe\u0080r\u00ac\u00d3\u0016;\u00a8q^\u0006Q\u0095\u00d5\u009e\u00fc\u001a\u0012\u0004\u00ea\u00d1\u0005\u00c9\u008d\u001d\u00ce<\u008c\u00edG\u00c9@\u001c\u0095\u00a1\u00b0\u0012\u0005u\u00f1\u00f6\u00cd\u00f3\u009d\u0001,u\u00efx\u0089\u00a7\u0014i\u00a0/\u000bC\u00fd\u00b7\u00fa4\u00cf\u00e2\u00f2\u0081\u00baX".length();
                var1_4 = 2;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 59;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00ac8qP\u00e0-P\u00d0\u00e2N\u00ff+\r\u0017\u00f2\u00a4\u00eb\u0017\u001c\r*9\u00f1u\u00e5\u00cdxd\u00be\u00de>\u00c8\u0015\u0003/\u00ae;\u00f1!F;\u0095=q\u008a\u00d1(\u00c2<\u0011\u00a1?\u00c8\u00fc";
                    var4_3 = "\u00ac8qP\u00e0-P\u00d0\u00e2N\u00ff+\r\u0017\u00f2\u00a4\u00eb\u0017\u001c\r*9\u00f1u\u00e5\u00cdxd\u00be\u00de>\u00c8\u0015\u0003/\u00ae;\u00f1!F;\u0095=q\u008a\u00d1(\u00c2<\u0011\u00a1?\u00c8\u00fc".length();
                    var1_4 = 32;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 121;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 63;
                            break;
                        }
                        case 1: {
                            v15 = 101;
                            break;
                        }
                        case 2: {
                            v15 = 112;
                            break;
                        }
                        case 3: {
                            v15 = 115;
                            break;
                        }
                        case 4: {
                            v15 = 24;
                            break;
                        }
                        case 5: {
                            v15 = 13;
                            break;
                        }
                        default: {
                            v15 = 102;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        hE.c = var5;
        hE.d = new String[10];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x49F5) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 178;
                    break;
                }
                case 1: {
                    n14 = 224;
                    break;
                }
                case 2: {
                    n14 = 227;
                    break;
                }
                case 3: {
                    n14 = 151;
                    break;
                }
                case 4: {
                    n14 = 12;
                    break;
                }
                case 5: {
                    n14 = 166;
                    break;
                }
                case 6: {
                    n14 = 236;
                    break;
                }
                case 7: {
                    n14 = 254;
                    break;
                }
                case 8: {
                    n14 = 243;
                    break;
                }
                case 9: {
                    n14 = 17;
                    break;
                }
                case 10: {
                    n14 = 82;
                    break;
                }
                case 11: {
                    n14 = 108;
                    break;
                }
                case 12: {
                    n14 = 42;
                    break;
                }
                case 13: {
                    n14 = 238;
                    break;
                }
                case 14: {
                    n14 = 199;
                    break;
                }
                case 15: {
                    n14 = 247;
                    break;
                }
                case 16: {
                    n14 = 156;
                    break;
                }
                case 17: {
                    n14 = 252;
                    break;
                }
                case 18: {
                    n14 = 193;
                    break;
                }
                case 19: {
                    n14 = 200;
                    break;
                }
                case 20: {
                    n14 = 179;
                    break;
                }
                case 21: {
                    n14 = 66;
                    break;
                }
                case 22: {
                    n14 = 107;
                    break;
                }
                case 23: {
                    n14 = 140;
                    break;
                }
                case 24: {
                    n14 = 135;
                    break;
                }
                case 25: {
                    n14 = 235;
                    break;
                }
                case 26: {
                    n14 = 16;
                    break;
                }
                case 27: {
                    n14 = 159;
                    break;
                }
                case 28: {
                    n14 = 204;
                    break;
                }
                case 29: {
                    n14 = 248;
                    break;
                }
                case 30: {
                    n14 = 77;
                    break;
                }
                case 31: {
                    n14 = 222;
                    break;
                }
                case 32: {
                    n14 = 59;
                    break;
                }
                case 33: {
                    n14 = 158;
                    break;
                }
                case 34: {
                    n14 = 114;
                    break;
                }
                case 35: {
                    n14 = 117;
                    break;
                }
                case 36: {
                    n14 = 212;
                    break;
                }
                case 37: {
                    n14 = 57;
                    break;
                }
                case 38: {
                    n14 = 186;
                    break;
                }
                case 39: {
                    n14 = 123;
                    break;
                }
                case 40: {
                    n14 = 171;
                    break;
                }
                case 41: {
                    n14 = 229;
                    break;
                }
                case 42: {
                    n14 = 52;
                    break;
                }
                case 43: {
                    n14 = 22;
                    break;
                }
                case 44: {
                    n14 = 163;
                    break;
                }
                case 45: {
                    n14 = 69;
                    break;
                }
                case 46: {
                    n14 = 102;
                    break;
                }
                case 47: {
                    n14 = 175;
                    break;
                }
                case 48: {
                    n14 = 182;
                    break;
                }
                case 49: {
                    n14 = 101;
                    break;
                }
                case 50: {
                    n14 = 13;
                    break;
                }
                case 51: {
                    n14 = 162;
                    break;
                }
                case 52: {
                    n14 = 23;
                    break;
                }
                case 53: {
                    n14 = 32;
                    break;
                }
                case 54: {
                    n14 = 11;
                    break;
                }
                case 55: {
                    n14 = 138;
                    break;
                }
                case 56: {
                    n14 = 189;
                    break;
                }
                case 57: {
                    n14 = 100;
                    break;
                }
                case 58: {
                    n14 = 185;
                    break;
                }
                case 59: {
                    n14 = 93;
                    break;
                }
                case 60: {
                    n14 = 126;
                    break;
                }
                case 61: {
                    n14 = 112;
                    break;
                }
                case 62: {
                    n14 = 70;
                    break;
                }
                case 63: {
                    n14 = 49;
                    break;
                }
                case 64: {
                    n14 = 249;
                    break;
                }
                case 65: {
                    n14 = 219;
                    break;
                }
                case 66: {
                    n14 = 38;
                    break;
                }
                case 67: {
                    n14 = 115;
                    break;
                }
                case 68: {
                    n14 = 37;
                    break;
                }
                case 69: {
                    n14 = 19;
                    break;
                }
                case 70: {
                    n14 = 75;
                    break;
                }
                case 71: {
                    n14 = 210;
                    break;
                }
                case 72: {
                    n14 = 121;
                    break;
                }
                case 73: {
                    n14 = 15;
                    break;
                }
                case 74: {
                    n14 = 223;
                    break;
                }
                case 75: {
                    n14 = 190;
                    break;
                }
                case 76: {
                    n14 = 51;
                    break;
                }
                case 77: {
                    n14 = 231;
                    break;
                }
                case 78: {
                    n14 = 184;
                    break;
                }
                case 79: {
                    n14 = 253;
                    break;
                }
                case 80: {
                    n14 = 81;
                    break;
                }
                case 81: {
                    n14 = 169;
                    break;
                }
                case 82: {
                    n14 = 18;
                    break;
                }
                case 83: {
                    n14 = 97;
                    break;
                }
                case 84: {
                    n14 = 43;
                    break;
                }
                case 85: {
                    n14 = 207;
                    break;
                }
                case 86: {
                    n14 = 76;
                    break;
                }
                case 87: {
                    n14 = 78;
                    break;
                }
                case 88: {
                    n14 = 160;
                    break;
                }
                case 89: {
                    n14 = 234;
                    break;
                }
                case 90: {
                    n14 = 244;
                    break;
                }
                case 91: {
                    n14 = 72;
                    break;
                }
                case 92: {
                    n14 = 208;
                    break;
                }
                case 93: {
                    n14 = 110;
                    break;
                }
                case 94: {
                    n14 = 119;
                    break;
                }
                case 95: {
                    n14 = 214;
                    break;
                }
                case 96: {
                    n14 = 50;
                    break;
                }
                case 97: {
                    n14 = 86;
                    break;
                }
                case 98: {
                    n14 = 141;
                    break;
                }
                case 99: {
                    n14 = 228;
                    break;
                }
                case 100: {
                    n14 = 139;
                    break;
                }
                case 101: {
                    n14 = 61;
                    break;
                }
                case 102: {
                    n14 = 206;
                    break;
                }
                case 103: {
                    n14 = 187;
                    break;
                }
                case 104: {
                    n14 = 188;
                    break;
                }
                case 105: {
                    n14 = 170;
                    break;
                }
                case 106: {
                    n14 = 127;
                    break;
                }
                case 107: {
                    n14 = 67;
                    break;
                }
                case 108: {
                    n14 = 31;
                    break;
                }
                case 109: {
                    n14 = 155;
                    break;
                }
                case 110: {
                    n14 = 88;
                    break;
                }
                case 111: {
                    n14 = 21;
                    break;
                }
                case 112: {
                    n14 = 98;
                    break;
                }
                case 113: {
                    n14 = 245;
                    break;
                }
                case 114: {
                    n14 = 148;
                    break;
                }
                case 115: {
                    n14 = 73;
                    break;
                }
                case 116: {
                    n14 = 198;
                    break;
                }
                case 117: {
                    n14 = 68;
                    break;
                }
                case 118: {
                    n14 = 137;
                    break;
                }
                case 119: {
                    n14 = 183;
                    break;
                }
                case 120: {
                    n14 = 217;
                    break;
                }
                case 121: {
                    n14 = 133;
                    break;
                }
                case 122: {
                    n14 = 39;
                    break;
                }
                case 123: {
                    n14 = 240;
                    break;
                }
                case 124: {
                    n14 = 124;
                    break;
                }
                case 125: {
                    n14 = 90;
                    break;
                }
                case 126: {
                    n14 = 33;
                    break;
                }
                case 127: {
                    n14 = 128;
                    break;
                }
                case 128: {
                    n14 = 25;
                    break;
                }
                case 129: {
                    n14 = 111;
                    break;
                }
                case 130: {
                    n14 = 172;
                    break;
                }
                case 131: {
                    n14 = 134;
                    break;
                }
                case 132: {
                    n14 = 103;
                    break;
                }
                case 133: {
                    n14 = 157;
                    break;
                }
                case 134: {
                    n14 = 29;
                    break;
                }
                case 135: {
                    n14 = 181;
                    break;
                }
                case 136: {
                    n14 = 197;
                    break;
                }
                case 137: {
                    n14 = 216;
                    break;
                }
                case 138: {
                    n14 = 152;
                    break;
                }
                case 139: {
                    n14 = 9;
                    break;
                }
                case 140: {
                    n14 = 14;
                    break;
                }
                case 141: {
                    n14 = 230;
                    break;
                }
                case 142: {
                    n14 = 8;
                    break;
                }
                case 143: {
                    n14 = 205;
                    break;
                }
                case 144: {
                    n14 = 145;
                    break;
                }
                case 145: {
                    n14 = 147;
                    break;
                }
                case 146: {
                    n14 = 226;
                    break;
                }
                case 147: {
                    n14 = 239;
                    break;
                }
                case 148: {
                    n14 = 58;
                    break;
                }
                case 149: {
                    n14 = 233;
                    break;
                }
                case 150: {
                    n14 = 5;
                    break;
                }
                case 151: {
                    n14 = 250;
                    break;
                }
                case 152: {
                    n14 = 71;
                    break;
                }
                case 153: {
                    n14 = 237;
                    break;
                }
                case 154: {
                    n14 = 55;
                    break;
                }
                case 155: {
                    n14 = 80;
                    break;
                }
                case 156: {
                    n14 = 84;
                    break;
                }
                case 157: {
                    n14 = 149;
                    break;
                }
                case 158: {
                    n14 = 1;
                    break;
                }
                case 159: {
                    n14 = 220;
                    break;
                }
                case 160: {
                    n14 = 154;
                    break;
                }
                case 161: {
                    n14 = 24;
                    break;
                }
                case 162: {
                    n14 = 48;
                    break;
                }
                case 163: {
                    n14 = 95;
                    break;
                }
                case 164: {
                    n14 = 65;
                    break;
                }
                case 165: {
                    n14 = 153;
                    break;
                }
                case 166: {
                    n14 = 62;
                    break;
                }
                case 167: {
                    n14 = 89;
                    break;
                }
                case 168: {
                    n14 = 180;
                    break;
                }
                case 169: {
                    n14 = 96;
                    break;
                }
                case 170: {
                    n14 = 116;
                    break;
                }
                case 171: {
                    n14 = 176;
                    break;
                }
                case 172: {
                    n14 = 246;
                    break;
                }
                case 173: {
                    n14 = 45;
                    break;
                }
                case 174: {
                    n14 = 202;
                    break;
                }
                case 175: {
                    n14 = 63;
                    break;
                }
                case 176: {
                    n14 = 94;
                    break;
                }
                case 177: {
                    n14 = 118;
                    break;
                }
                case 178: {
                    n14 = 136;
                    break;
                }
                case 179: {
                    n14 = 209;
                    break;
                }
                case 180: {
                    n14 = 146;
                    break;
                }
                case 181: {
                    n14 = 26;
                    break;
                }
                case 182: {
                    n14 = 225;
                    break;
                }
                case 183: {
                    n14 = 129;
                    break;
                }
                case 184: {
                    n14 = 104;
                    break;
                }
                case 185: {
                    n14 = 164;
                    break;
                }
                case 186: {
                    n14 = 44;
                    break;
                }
                case 187: {
                    n14 = 203;
                    break;
                }
                case 188: {
                    n14 = 122;
                    break;
                }
                case 189: {
                    n14 = 113;
                    break;
                }
                case 190: {
                    n14 = 232;
                    break;
                }
                case 191: {
                    n14 = 105;
                    break;
                }
                case 192: {
                    n14 = 53;
                    break;
                }
                case 193: {
                    n14 = 177;
                    break;
                }
                case 194: {
                    n14 = 106;
                    break;
                }
                case 195: {
                    n14 = 125;
                    break;
                }
                case 196: {
                    n14 = 194;
                    break;
                }
                case 197: {
                    n14 = 131;
                    break;
                }
                case 198: {
                    n14 = 173;
                    break;
                }
                case 199: {
                    n14 = 221;
                    break;
                }
                case 200: {
                    n14 = 92;
                    break;
                }
                case 201: {
                    n14 = 2;
                    break;
                }
                case 202: {
                    n14 = 7;
                    break;
                }
                case 203: {
                    n14 = 64;
                    break;
                }
                case 204: {
                    n14 = 35;
                    break;
                }
                case 205: {
                    n14 = 132;
                    break;
                }
                case 206: {
                    n14 = 211;
                    break;
                }
                case 207: {
                    n14 = 20;
                    break;
                }
                case 208: {
                    n14 = 174;
                    break;
                }
                case 209: {
                    n14 = 213;
                    break;
                }
                case 210: {
                    n14 = 46;
                    break;
                }
                case 211: {
                    n14 = 161;
                    break;
                }
                case 212: {
                    n14 = 251;
                    break;
                }
                case 213: {
                    n14 = 144;
                    break;
                }
                case 214: {
                    n14 = 54;
                    break;
                }
                case 215: {
                    n14 = 99;
                    break;
                }
                case 216: {
                    n14 = 191;
                    break;
                }
                case 217: {
                    n14 = 74;
                    break;
                }
                case 218: {
                    n14 = 28;
                    break;
                }
                case 219: {
                    n14 = 85;
                    break;
                }
                case 220: {
                    n14 = 167;
                    break;
                }
                case 221: {
                    n14 = 165;
                    break;
                }
                case 222: {
                    n14 = 218;
                    break;
                }
                case 223: {
                    n14 = 143;
                    break;
                }
                case 224: {
                    n14 = 215;
                    break;
                }
                case 225: {
                    n14 = 201;
                    break;
                }
                case 226: {
                    n14 = 3;
                    break;
                }
                case 227: {
                    n14 = 120;
                    break;
                }
                case 228: {
                    n14 = 242;
                    break;
                }
                case 229: {
                    n14 = 0;
                    break;
                }
                case 230: {
                    n14 = 40;
                    break;
                }
                case 231: {
                    n14 = 36;
                    break;
                }
                case 232: {
                    n14 = 30;
                    break;
                }
                case 233: {
                    n14 = 79;
                    break;
                }
                case 234: {
                    n14 = 60;
                    break;
                }
                case 235: {
                    n14 = 56;
                    break;
                }
                case 236: {
                    n14 = 83;
                    break;
                }
                case 237: {
                    n14 = 6;
                    break;
                }
                case 238: {
                    n14 = 168;
                    break;
                }
                case 239: {
                    n14 = 150;
                    break;
                }
                case 240: {
                    n14 = 4;
                    break;
                }
                case 241: {
                    n14 = 109;
                    break;
                }
                case 242: {
                    n14 = 87;
                    break;
                }
                case 243: {
                    n14 = 34;
                    break;
                }
                case 244: {
                    n14 = 142;
                    break;
                }
                case 245: {
                    n14 = 241;
                    break;
                }
                case 246: {
                    n14 = 195;
                    break;
                }
                case 247: {
                    n14 = 27;
                    break;
                }
                case 248: {
                    n14 = 41;
                    break;
                }
                case 249: {
                    n14 = 255;
                    break;
                }
                case 250: {
                    n14 = 47;
                    break;
                }
                case 251: {
                    n14 = 130;
                    break;
                }
                case 252: {
                    n14 = 196;
                    break;
                }
                case 253: {
                    n14 = 91;
                    break;
                }
                case 254: {
                    n14 = 10;
                    break;
                }
                default: {
                    n14 = 192;
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
            hE.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

