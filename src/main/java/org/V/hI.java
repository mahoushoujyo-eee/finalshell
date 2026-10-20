/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.F.c;
import org.I;
import org.P;
import org.U;
import org.Y;
import org.b_0;
import org.c_0;
import org.n;
import org.v.N9;
import org.v.NK;
import org.v.NS;
import org.v.R9;
import org.v.RA;
import org.v.RD;
import org.v.RG;
import org.v.RJ;
import org.v.RM;
import org.v.RN;
import org.v.RX;
import org.v.RY;
import org.v._1;
import org.v._E;
import org.v._Q;
import org.v._X;
import org.v._a_0;
import org.v._r_0;
import org.v.d_2;
import org.v.fK;
import org.v.f_0;
import org.v.fu_0;
import org.v.g_1;
import org.v.hG;
import org.v.hV;
import org.v.hc_0;
import org.v.hn_0;
import org.v.nt_0;

public class hI
extends c_0
implements n {
    private int K = -1;
    @c
    private Y v;
    private final hn_0 z = new hn_0();
    @c
    private _a_0[] O;
    private Class u = n.M;
    @c
    private Method[] B;
    static final boolean X;
    private static final String[] c;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;

    @Override
    public void e(@c ClassLoader classLoader) {
        this.z.w(classLoader);
    }

    @Override
    public void L(boolean bl, boolean bl2, boolean bl3) {
        this.z.N(bl, bl2, bl3);
    }

    @Override
    public void n(int n10) {
        this.z.n(n10);
        this.K = n10;
    }

    @Override
    public void v(int n10) {
        this.z.v(n10);
    }

    @Override
    public void e(@c U u10) {
        this.z.q(u10);
    }

    @Override
    public void s(@c Y y2) {
        this.z.t(y2);
        this.v = y2;
    }

    public EnumSet u() {
        return this.z.z();
    }

    public hI S(EnumSet enumSet) {
        this.z.p(enumSet);
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public void E(int var1_1) {
        block12: {
            block11: {
                var3_2 = this.O;
                var2_3 = RG.C();
                try {
                    if (var2_3 == null) break block11;
                    if (var3_2 == null) {
                    }
                    ** GOTO lbl24
                }
                catch (IllegalArgumentException v0) {
                    throw hI.a(v0);
                }
                this.O = var3_2 = new _a_0[var1_1];
            }
            for (var4_4 = 0; var4_4 < var1_1; ++var4_4) {
                try {
                    var3_2[var4_4] = new _a_0(this, hI.a(27890, -3345).replace("*", Integer.toString(var4_4)));
                    if (var2_3 != null) {
                        if (var2_3 != null) continue;
                        break;
                    }
                    break block12;
                }
                catch (IllegalArgumentException v1) {
                    throw hI.a(v1);
                }
            }
            try {
                try {
                    if (var2_3 != null) break block12;
lbl24:
                    // 2 sources

                    if (var1_1 == var3_2.length) break block12;
                }
                catch (IllegalArgumentException v2) {
                    throw hI.a(v2);
                }
                throw new IllegalArgumentException(hI.a(27886, 30240) + var3_2.length + hI.a(27884, -16447) + var1_1);
            }
            catch (IllegalArgumentException v3) {
                throw hI.a(v3);
            }
        }
    }

    private _a_0 Z(int n10) {
        block5: {
            _a_0[] _a_0Array;
            block4: {
                String[] stringArray = RG.C();
                try {
                    try {
                        _a_0Array = this.O;
                        if (stringArray == null) break block4;
                        if (_a_0Array == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw hI.a(illegalArgumentException);
                    }
                    _a_0Array = this.O;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw hI.a(illegalArgumentException);
                }
            }
            return _a_0Array[n10];
        }
        throw new IllegalStateException(hI.a(27901, -15526));
    }

    public hI(String string) throws b_0 {
        this.D(string);
    }

    public hI(String string, Class clazz) throws b_0 {
        this.J(clazz);
        this.D(string);
    }

    public hI(String string, Class clazz, String[] stringArray, Class[] classArray) throws b_0 {
        this.J(clazz);
        this.N(stringArray, classArray);
        this.D(string);
    }

    public hI(String string, Class clazz, String[] stringArray, Class[] classArray, Class[] classArray2) throws b_0 {
        this.J(clazz);
        this.N(stringArray, classArray);
        this.I(classArray2);
        this.D(string);
    }

    public hI(@c String string, InputStream inputStream, Class clazz, String[] stringArray, Class[] classArray, Class[] classArray2, @c ClassLoader classLoader) throws b_0, IOException {
        this.J(clazz);
        this.N(stringArray, classArray);
        this.I(classArray2);
        this.e(classLoader);
        this.f(string, inputStream);
    }

    public hI(@c String string, Reader reader, Class clazz, String[] stringArray, Class[] classArray, Class[] classArray2, @c ClassLoader classLoader) throws b_0, IOException {
        this.J(clazz);
        this.N(stringArray, classArray);
        this.I(classArray2);
        this.e(classLoader);
        this.Y(string, reader);
    }

    public hI(hc_0 hc_02, Class clazz, String[] stringArray, Class[] classArray, Class[] classArray2, @c ClassLoader classLoader) throws b_0, IOException {
        this.J(clazz);
        this.N(stringArray, classArray);
        this.I(classArray2);
        this.e(classLoader);
        this.W(new hc_0[]{hc_02});
    }

    public hI(hc_0 hc_02, @c Class clazz, Class[] classArray, Class clazz2, String[] stringArray, Class[] classArray2, Class[] classArray3, @c ClassLoader classLoader) throws b_0, IOException {
        this.c(clazz);
        this.j(classArray);
        this.J(clazz2);
        this.N(stringArray, classArray2);
        this.I(classArray3);
        this.e(classLoader);
        this.W(new hc_0[]{hc_02});
    }

    public hI(hc_0 hc_02, String string, @c Class clazz, Class[] classArray, boolean bl, Class clazz2, String string2, String[] stringArray, Class[] classArray2, Class[] classArray3, @c ClassLoader classLoader) throws b_0, IOException {
        this.Z(string);
        this.c(clazz);
        this.j(classArray);
        this.Y(bl);
        this.J(clazz2);
        this.L(string2);
        this.N(stringArray, classArray2);
        this.I(classArray3);
        this.e(classLoader);
        this.W(new hc_0[]{hc_02});
    }

    public hI() {
    }

    public hI(int n10) {
        this.E(n10);
    }

    @Override
    public void Z(String string) {
        this.z.t(string);
    }

    @Override
    public void j(Class[] classArray) {
        this.z.P(classArray);
    }

    @Override
    public void c(@c Class clazz) {
        this.z.Q(clazz);
    }

    @Override
    public void A(Class clazz) {
        this.u = clazz;
    }

    @Override
    public Class c() {
        return this.u;
    }

    @Override
    public void h(boolean bl) {
        this.e(new boolean[]{bl});
    }

    @Override
    public void Y(boolean bl) {
        this.p(new boolean[]{bl});
    }

    @Override
    public void J(@c Class clazz) {
        this.B(new Class[]{clazz});
    }

    @Override
    public void L(@c String string) {
        this.E(new String[]{string});
    }

    @Override
    public void N(String[] stringArray, Class[] classArray) {
        this.Y(new String[][]{stringArray}, new Class[][]{classArray});
    }

    @Override
    public void I(Class[] classArray) {
        this.q(new Class[][]{classArray});
    }

    @Override
    public void e(boolean[] blArray) {
        this.E(blArray.length);
        String[] stringArray = RG.C();
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            this.Z((int)i2).i = blArray[i2];
            if (stringArray != null) continue;
        }
    }

    @Override
    public void p(boolean[] blArray) {
        String[] stringArray = RG.C();
        this.E(blArray.length);
        String[] stringArray2 = stringArray;
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            this.Z((int)i2).G = blArray[i2];
            if (stringArray2 != null) continue;
        }
    }

    @Override
    public void B(Class[] classArray) {
        this.E(classArray.length);
        String[] stringArray = RG.C();
        for (int i2 = 0; i2 < classArray.length; ++i2) {
            this.Z((int)i2).K = classArray[i2];
            if (stringArray != null) continue;
        }
    }

    @Override
    public void E(String[] stringArray) {
        String[] stringArray2 = RG.C();
        this.E(stringArray.length);
        String[] stringArray3 = stringArray2;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            _a_0.q(this.Z(i2), stringArray[i2]);
            if (stringArray3 != null) continue;
        }
    }

    @Override
    public void Y(String[][] stringArray, Class[][] classArray) {
        String[] stringArray2 = RG.C();
        this.E(stringArray.length);
        String[] stringArray3 = stringArray2;
        this.E(classArray.length);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            _a_0 _a_02 = this.Z(i2);
            _a_0.R(_a_02, (String[])stringArray[i2].clone());
            _a_0.d(_a_02, (Class[])classArray[i2].clone());
            if (stringArray3 != null) continue;
        }
    }

    @Override
    public void q(Class[][] classArray) {
        String[] stringArray = RG.C();
        this.E(classArray.length);
        String[] stringArray2 = stringArray;
        for (int i2 = 0; i2 < classArray.length; ++i2) {
            _a_0.c(this.Z(i2), classArray[i2]);
            if (stringArray2 != null) continue;
        }
    }

    @Override
    public void Y(@c String string, Reader reader) throws b_0, IOException {
        this.W(new hc_0[]{new hc_0(string, reader)});
    }

    @Override
    public final void a(String[] stringArray, Reader[] readerArray) throws b_0, IOException {
        block4: {
            String[] stringArray2 = RG.C();
            this.E(stringArray.length);
            this.E(readerArray.length);
            hc_0[] hc_0Array = new hc_0[readerArray.length];
            String[] stringArray3 = stringArray2;
            for (int i2 = 0; i2 < readerArray.length; ++i2) {
                try {
                    hc_0Array[i2] = new hc_0(stringArray[i2], readerArray[i2]);
                    if (stringArray3 != null) {
                        if (stringArray3 != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (b_0 b_02) {
                    throw hI.a(b_02);
                }
            }
            this.W(hc_0Array);
        }
    }

    public final void W(hc_0[] hc_0Array) throws b_0, IOException {
        block4: {
            String[] stringArray = RG.C();
            this.E(hc_0Array.length);
            String[] stringArray2 = stringArray;
            hG[] hGArray = new hG[hc_0Array.length];
            for (int i2 = 0; i2 < hc_0Array.length; ++i2) {
                try {
                    hGArray[i2] = new hG(hc_0Array[i2]);
                    hGArray[i2].Q(this.K);
                    hGArray[i2].S(this.v);
                    if (stringArray2 != null) {
                        if (stringArray2 != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (b_0 b_02) {
                    throw hI.a(b_02);
                }
            }
            this.J(hGArray);
        }
    }

    public final void J(hG[] hGArray) throws b_0, IOException {
        block10: {
            String string;
            hI hI2;
            NS[][] nSArray;
            _r_0[][] _r_0Array;
            fK[] fKArray;
            block13: {
                block12: {
                    hG[] hGArray2;
                    block11: {
                        hG hG2;
                        String[] stringArray = RG.C();
                        int n10 = hGArray.length;
                        this.E(n10);
                        String[] stringArray2 = stringArray;
                        try {
                            hG2 = n10 == 1 ? hGArray[0] : null;
                        }
                        catch (b_0 b_02) {
                            throw hI.a(b_02);
                        }
                        hG hG3 = hG2;
                        fKArray = this.A(hG3);
                        _r_0Array = new _r_0[n10][];
                        nSArray = new NS[n10][];
                        for (int i2 = 0; i2 < n10; ++i2) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                this.N(i2, hGArray[i2], arrayList, arrayList2);
                                _r_0Array[i2] = arrayList.toArray(new _r_0[arrayList.size()]);
                                nSArray[i2] = arrayList2.toArray(new NS[arrayList2.size()]);
                                if (stringArray2 != null) {
                                    if (stringArray2 != null) continue;
                                    break;
                                }
                                break block10;
                            }
                            catch (b_0 b_03) {
                                throw hI.a(b_03);
                            }
                        }
                        try {
                            try {
                                hI2 = this;
                                hGArray2 = hGArray;
                                if (stringArray2 == null) break block11;
                                if (hGArray2.length < 1) break block12;
                            }
                            catch (b_0 b_04) {
                                throw hI.a(b_04);
                            }
                            hGArray2 = hGArray;
                        }
                        catch (b_0 b_05) {
                            throw hI.a(b_05);
                        }
                    }
                    string = hGArray2[0].g().F();
                    break block13;
                }
                string = null;
            }
            hI2.D(string, fKArray, _r_0Array, nSArray);
        }
    }

    void D(@c String string, fK[] fKArray, _r_0[][] _r_0Array, NS[][] nSArray) throws b_0 {
        block19: {
            int n10 = _r_0Array.length;
            ArrayList<NS> arrayList = new ArrayList<NS>();
            String[] stringArray = RG.C();
            int n11 = 0;
            while (n11 < n10) {
                block28: {
                    hV[] hVArray;
                    I i2;
                    hI hI2;
                    ArrayList<NS> arrayList2;
                    Class clazz;
                    NS[] nSArray2;
                    _r_0[] _r_0Array2;
                    _a_0 _a_02;
                    block27: {
                        int n12;
                        block25: {
                            block26: {
                                I i3;
                                block24: {
                                    Class clazz2;
                                    block23: {
                                        I i4;
                                        block22: {
                                            _r_0[] _r_0Array3;
                                            block20: {
                                                block21: {
                                                    _a_02 = this.Z(n11);
                                                    _r_0Array2 = _r_0Array[n11];
                                                    nSArray2 = nSArray[n11];
                                                    try {
                                                        try {
                                                            try {
                                                                if (stringArray == null) break block19;
                                                                _r_0Array3 = _r_0Array2;
                                                                if (stringArray == null) break block20;
                                                            }
                                                            catch (b_0 b_02) {
                                                                throw hI.a(b_02);
                                                            }
                                                            if (_r_0Array3.length != 0) break block21;
                                                        }
                                                        catch (b_0 b_03) {
                                                            throw hI.a(b_03);
                                                        }
                                                        i4 = I.z;
                                                        break block22;
                                                    }
                                                    catch (b_0 b_04) {
                                                        throw hI.a(b_04);
                                                    }
                                                }
                                                _r_0Array3 = _r_0Array2;
                                            }
                                            i4 = _r_0Array3[0].Q();
                                        }
                                        i3 = i4;
                                        clazz = _a_02.K;
                                        try {
                                            try {
                                                clazz2 = clazz;
                                                if (stringArray == null) break block23;
                                                if (clazz2 != null) break block24;
                                            }
                                            catch (b_0 b_05) {
                                                throw hI.a(b_05);
                                            }
                                            clazz2 = this.c();
                                        }
                                        catch (b_0 b_06) {
                                            throw hI.a(b_06);
                                        }
                                    }
                                    clazz = clazz2;
                                }
                                try {
                                    try {
                                        arrayList2 = arrayList;
                                        hI2 = this;
                                        i2 = i3;
                                        n12 = _a_02.i;
                                        if (stringArray == null) break block25;
                                        if (n12 == 0) break block26;
                                    }
                                    catch (b_0 b_07) {
                                        throw hI.a(b_07);
                                    }
                                    hV[] hVArray = new hV[1];
                                    hVArray = hVArray;
                                    hVArray2[0] = new RA(this.k(i3, Override.class));
                                    break block27;
                                }
                                catch (b_0 b_08) {
                                    throw hI.a(b_08);
                                }
                            }
                            n12 = 0;
                        }
                        hVArray = new hV[n12];
                    }
                    arrayList2.add(hI2.L(i2, hVArray, _a_02.G, clazz, _a_0.E(_a_02), _a_0.V(_a_02), _a_0.x(_a_02), _a_0.B(_a_02), _r_0Array2));
                    for (NS nS2 : nSArray2) {
                        try {
                            arrayList.add(nS2);
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                                break;
                            }
                            break block28;
                        }
                        catch (b_0 b_09) {
                            throw hI.a(b_09);
                        }
                    }
                    ++n11;
                }
                if (stringArray != null) continue;
            }
            this.b(new RD(string, fKArray), arrayList);
        }
    }

    public final void b(RD rD, Collection collection) throws b_0 {
        block4: {
            _E _E2 = this.z.X(((NS)collection.iterator().next()).Q(), rD);
            Iterator iterator = collection.iterator();
            String[] stringArray = RG.C();
            while (iterator.hasNext()) {
                NS nS2 = (NS)iterator.next();
                try {
                    _E2.O(nS2);
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (b_0 b_02) {
                    throw hI.a(b_02);
                }
            }
            this.n(rD);
        }
    }

    fK[] A(@c hG hG2) throws b_0, IOException {
        return this.z.q(hG2);
    }

    @Override
    public Method[] C() {
        return this.Z();
    }

    Method[] Z() {
        Method[] methodArray;
        block41: {
            int n10;
            Class clazz;
            String[] stringArray;
            Method[] methodArray2;
            block34: {
                _a_0[] _a_0Array;
                block36: {
                    block35: {
                        block33: {
                            Method[] methodArray3;
                            block32: {
                                methodArray2 = this.B;
                                stringArray = RG.C();
                                try {
                                    methodArray3 = methodArray2;
                                    if (stringArray == null) break block32;
                                    if (methodArray3 == null) break block33;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw hI.a(illegalArgumentException);
                                }
                                methodArray3 = methodArray2;
                            }
                            return methodArray3;
                        }
                        clazz = this.e();
                        try {
                            try {
                                try {
                                    try {
                                        n10 = X;
                                        if (stringArray == null) break block34;
                                        if (n10 != 0) break block35;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw hI.a(illegalArgumentException);
                                    }
                                    _a_0Array = this.O;
                                    if (stringArray == null) break block36;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw hI.a(illegalArgumentException);
                                }
                                if (_a_0Array != null) break block35;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw hI.a(illegalArgumentException);
                            }
                            throw new AssertionError();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw hI.a(illegalArgumentException);
                        }
                    }
                    _a_0Array = this.O;
                }
                n10 = _a_0Array.length;
            }
            int n11 = n10;
            methodArray2 = new Method[n11];
            HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>(2 * n11);
            int n12 = 0;
            while (n12 < n11) {
                block37: {
                    block38: {
                        _a_0 _a_02 = this.Z(n12);
                        Integer n13 = hashMap.put(hI.R(_a_0.E(_a_02), _a_0.V(_a_02)), n12);
                        try {
                            try {
                                try {
                                    if (stringArray == null) break block37;
                                    if (X) break block38;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw hI.a(illegalArgumentException);
                                }
                                if (n13 == null) break block38;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw hI.a(illegalArgumentException);
                            }
                            throw new AssertionError();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw hI.a(illegalArgumentException);
                        }
                    }
                    ++n12;
                }
                if (stringArray != null) continue;
            }
            for (Method method : clazz.getDeclaredMethods()) {
                block40: {
                    int n13;
                    Method[] methodArray4;
                    Integer n15;
                    block39: {
                        n15 = (Integer)hashMap.get(hI.R(method.getName(), method.getParameterTypes()));
                        try {
                            if (n15 == null) {
                                continue;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw hI.a(illegalArgumentException);
                        }
                        try {
                            try {
                                try {
                                    if (X) break block39;
                                    methodArray4 = methodArray2;
                                    n13 = n15;
                                    if (stringArray == null) break block40;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw hI.a(illegalArgumentException);
                                }
                                if (methodArray4[n13] == null) break block39;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw hI.a(illegalArgumentException);
                            }
                            throw new AssertionError();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw hI.a(illegalArgumentException);
                        }
                    }
                    methodArray4 = methodArray2;
                    n13 = n15;
                }
                methodArray4[n13] = method;
                if (stringArray != null) continue;
            }
            for (int i2 = 0; i2 < n11; ++i2) {
                try {
                    try {
                        methodArray = methodArray2;
                        if (stringArray == null) break block41;
                        if (methodArray[i2] != null) continue;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw hI.a(illegalArgumentException);
                    }
                    throw new P(hI.a(27903, 19063) + _a_0.E(this.Z(i2)) + hI.a(27882, -15838) + i2 + ")");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw hI.a(illegalArgumentException);
                }
            }
            this.B = methodArray2;
            methodArray = this.B;
        }
        return methodArray;
    }

    @c
    protected nt_0 N(I i2, @c Class clazz) {
        return this.z.k(i2, clazz);
    }

    protected nt_0 k(I i2, Class clazz) {
        return this.z.N(i2, clazz);
    }

    protected nt_0[] v(I i2, Class[] classArray) {
        return this.z.m(i2, classArray);
    }

    protected void n(RD rD) throws b_0 {
        this.z.o(rD);
    }

    private static Object R(String string, Class[] classArray) {
        return Arrays.asList(hI.l(string, classArray, Object.class));
    }

    private static Object[] l(Object object, Object[] objectArray, Class clazz) {
        Object[] objectArray2 = (Object[])Array.newInstance(clazz, 1 + objectArray.length);
        objectArray2[0] = object;
        System.arraycopy(objectArray, 0, objectArray2, 1, objectArray.length);
        return objectArray2;
    }

    @Override
    @c
    public Object s(@c Object[] objectArray) throws InvocationTargetException {
        return this.W(0, objectArray);
    }

    @Override
    @c
    public Object W(int n10, @c Object[] objectArray) throws InvocationTargetException {
        Method method = this.R(n10);
        try {
            return method.invoke(null, objectArray);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new P(illegalAccessException.toString(), illegalAccessException);
        }
    }

    @Override
    public Method E() {
        return this.R(0);
    }

    @Override
    public Method R(int n10) {
        return this.Z()[n10];
    }

    @Override
    public Class e() {
        return this.z.t();
    }

    @Override
    public Map Q() {
        return this.z.Q();
    }

    @c
    protected final Class L(int n10) {
        return this.Z((int)n10).K;
    }

    protected void N(int n10, hG hG2, List list, List list2) throws b_0, IOException {
        String[] stringArray = RG.C();
        while (!hG2.d(f_0.END_OF_INPUT)) {
            hI.s(hG2, list, list2);
            if (stringArray != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void s(hG var0, List var1_1, List var2_2) throws b_0, IOException {
        block51: {
            block52: {
                block50: {
                    block49: {
                        block45: {
                            block46: {
                                block44: {
                                    block42: {
                                        block43: {
                                            block41: {
                                                block39: {
                                                    var3_3 = RG.C();
                                                    try {
                                                        block40: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v0 = var0.d(f_0.IDENTIFIER);
                                                                        if (var3_3 == null) break block39;
                                                                        if (v0 == 0) break block40;
                                                                    }
                                                                    catch (b_0 v1) {
                                                                        throw hI.a(v1);
                                                                    }
                                                                    v2 = var0.k(":");
                                                                    if (var3_3 == null) break block41;
                                                                }
                                                                catch (b_0 v3) {
                                                                    throw hI.a(v3);
                                                                }
                                                                if (!v2) {
                                                                }
                                                                ** GOTO lbl50
                                                            }
                                                            catch (b_0 v4) {
                                                                throw hI.a(v4);
                                                            }
                                                        }
                                                        v5 = new String[hI.a(29636, 1855433022880526553L)];
                                                        v5[0] = hI.a(27877, -11789);
                                                        v5[1] = hI.a(27881, -25740);
                                                        v5[2] = hI.a(27876, 14162);
                                                        v5[3] = hI.a(27878, -433);
                                                        v5[4] = hI.a(27900, 11664);
                                                        v5[5] = hI.a(27893, -26216);
                                                        v5[hI.a((int)29588, (long)2463760692835594379L)] = hI.a(27899, -29215);
                                                        v5[hI.a((int)10851, (long)248250037839554943L)] = hI.a(27875, -9214);
                                                        v5[hI.a((int)10778, (long)2858918420207167745L)] = hI.a(27891, -2265);
                                                        v5[hI.a((int)5076, (long)8476109761066094784L)] = hI.a(27880, -20010);
                                                        v5[hI.a((int)19853, (long)3727565594618465941L)] = hI.a(27897, -11819);
                                                        v5[hI.a((int)7348, (long)3677816505998860206L)] = hI.a(27902, 26631);
                                                        v5[hI.a((int)30190, (long)4638680191467665136L)] = "{";
                                                        v5[hI.a((int)15261, (long)4354910627044915332L)] = ";";
                                                        v0 = var0.a(v5);
                                                    }
                                                    catch (b_0 v6) {
                                                        throw hI.a(v6);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var3_3 == null) break block42;
                                                        if (v0 == -1) break block43;
                                                    }
                                                    catch (b_0 v7) {
                                                        throw hI.a(v7);
                                                    }
lbl50:
                                                    // 2 sources

                                                    v2 = var1_1.add(var0.W());
                                                }
                                                catch (b_0 v8) {
                                                    throw hI.a(v8);
                                                }
                                            }
                                            return;
                                        }
                                        try {
                                            v9 = var0;
                                            if (var3_3 == null) break block44;
                                            v0 = (int)v9.I(hI.a(27885, -27106));
                                        }
                                        catch (b_0 v10) {
                                            throw hI.a(v10);
                                        }
                                    }
                                    if (v0 != 0) {
                                        var4_4 = (_1)var0.f(null, new fu_0[0], g_1.BLOCK);
                                        var1_1.add(new RM(var4_4));
                                        return;
                                    }
                                    v9 = var0;
                                }
                                var4_5 = v9.c();
                                try {
                                    v11 = var0.I(hI.a(27894, 22616));
                                    if (var3_3 == null) break block45;
                                    if (v11 == 0) break block46;
                                }
                                catch (b_0 v12) {
                                    throw hI.a(v12);
                                }
                                var5_6 = var0.Z(f_0.IDENTIFIER);
                                var2_2.add(var0.K(null, var4_5, null, new NK(var0.C(), d_2.VOID), var5_6, false, _X.CLASS_DECLARATION));
                                return;
                            }
                            v11 = var4_5.length;
                        }
                        if (v11 > 0) {
                            block47: {
                                block48: {
                                    var5_7 = var0.H();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v13 = var0.d(f_0.IDENTIFIER);
                                                    if (var3_3 == null) break block47;
                                                    if (!v13) break block48;
                                                }
                                                catch (b_0 v14) {
                                                    throw hI.a(v14);
                                                }
                                                v13 = var0.k("(");
                                                if (var3_3 == null) break block47;
                                            }
                                            catch (b_0 v15) {
                                                throw hI.a(v15);
                                            }
                                            if (!v13) break block48;
                                        }
                                        catch (b_0 v16) {
                                            throw hI.a(v16);
                                        }
                                        var2_2.add(var0.K(null, var4_5, null, var5_7, var0.Z(f_0.IDENTIFIER), false, _X.CLASS_DECLARATION));
                                        return;
                                    }
                                    catch (b_0 v17) {
                                        throw hI.a(v17);
                                    }
                                }
                                v13 = var1_1.add(new RX(var0.C(), var4_5, var5_7, var0.r()));
                            }
                            var0.C(";");
                            return;
                        }
                        var5_8 = var0.n();
                        try {
                            try {
                                v18 = var0.I(";");
                                if (var3_3 == null) break block49;
                                if (!v18) break block50;
                            }
                            catch (b_0 v19) {
                                throw hI.a(v19);
                            }
                            v18 = var1_1.add(new RY(var5_8.Z()));
                        }
                        catch (b_0 v20) {
                            throw hI.a(v20);
                        }
                    }
                    return;
                }
                var6_9 = var5_8.w();
                try {
                    try {
                        try {
                            try {
                                v21 = var0.d(f_0.IDENTIFIER);
                                if (var3_3 == null) break block51;
                                if (!v21) break block52;
                            }
                            catch (b_0 v22) {
                                throw hI.a(v22);
                            }
                            v21 = var0.k("(");
                            if (var3_3 == null) break block51;
                        }
                        catch (b_0 v23) {
                            throw hI.a(v23);
                        }
                        if (!v21) break block52;
                    }
                    catch (b_0 v24) {
                        throw hI.a(v24);
                    }
                    var2_2.add(var0.K(null, var4_5, null, var6_9, var0.Z(f_0.IDENTIFIER), false, _X.CLASS_DECLARATION));
                    return;
                }
                catch (b_0 v25) {
                    throw hI.a(v25);
                }
            }
            v21 = var1_1.add(new RX(var5_8.Q(), var4_5, var6_9, var0.r()));
        }
        var0.C(";");
    }

    private NS L(I i2, hV[] hVArray, boolean bl, Class clazz, String string, Class[] classArray, String[] stringArray, Class[] classArray2, _r_0[] _r_0Array) {
        ArrayList<fu_0> arrayList;
        ArrayList<fu_0> arrayList2;
        RJ rJ;
        block6: {
            block7: {
                String[] stringArray2 = RG.C();
                try {
                    if (stringArray.length != classArray.length) {
                        throw new P(hI.a(27883, 30257) + stringArray.length + hI.a(27892, 22710) + classArray.length + hI.a(27872, 7768));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw hI.a(illegalArgumentException);
                }
                rJ = new RJ(i2, new R9[stringArray.length], false);
                for (int i3 = 0; i3 < rJ.Q.length; ++i3) {
                    rJ.Q[i3] = new R9(i2, RG.J(i2, new String[]{hI.a(27887, -1092)}), this.k(i2, classArray[i3]), stringArray[i3]);
                    if (stringArray2 != null) continue;
                }
                arrayList2 = new ArrayList<fu_0>();
                try {
                    arrayList2.addAll(Arrays.asList(hVArray));
                    arrayList = arrayList2;
                    if (stringArray2 == null) break block6;
                    arrayList.add(new N9(hI.a(27898, 21279), i2));
                    if (!bl) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw hI.a(illegalArgumentException);
                }
                arrayList2.add(new N9(hI.a(27874, -15489), i2));
            }
            arrayList = arrayList2;
        }
        fu_0[] fu_0Array = arrayList.toArray(new fu_0[arrayList2.size()]);
        return new NS(i2, null, fu_0Array, null, this.k(i2, clazz), string, rJ, this.v(i2, classArray2), null, Arrays.asList(_r_0Array));
    }

    @Deprecated
    public static Object i(String string, Class clazz, String[] stringArray) throws b_0 {
        hI hI2 = new hI();
        return hI2.F(string, clazz, stringArray);
    }

    @Deprecated
    public static Object I(hc_0 hc_02, Class clazz, String[] stringArray, @c ClassLoader classLoader) throws b_0, IOException {
        hI hI2 = new hI();
        hI2.e(classLoader);
        return hI2.c(hc_02, clazz, stringArray);
    }

    @Deprecated
    public static Object i(hc_0 hc_02, String string, @c Class clazz, Class clazz2, String[] stringArray, @c ClassLoader classLoader) throws b_0, IOException {
        hI hI2 = new hI();
        hI2.Z(string);
        hI2.c(clazz);
        hI2.e(classLoader);
        return hI2.c(hc_02, clazz2, stringArray);
    }

    @Deprecated
    public static Object k(hc_0 hc_02, String[] stringArray, String string, @c Class clazz, Class clazz2, String[] stringArray2, @c ClassLoader classLoader) throws b_0, IOException {
        hI hI2 = new hI();
        hI2.A(stringArray);
        hI2.Z(string);
        hI2.c(clazz);
        hI2.e(classLoader);
        return hI2.c(hc_02, clazz2, stringArray2);
    }

    @Override
    public void A(String[] stringArray) {
        this.z.P(stringArray);
    }

    @Override
    public String[] H() {
        return this.z.i();
    }

    @Override
    public Object K(Reader reader, Class clazz, String[] stringArray) throws b_0, IOException {
        return this.c(new hc_0(null, reader), clazz, stringArray);
    }

    @Override
    public Object F(String string, Class clazz, String[] stringArray) throws b_0 {
        try {
            return this.K(new StringReader(string), clazz, stringArray);
        }
        catch (IOException iOException) {
            throw new P(hI.a(27896, 27003), iOException);
        }
    }

    /*
     * Loose catch block
     */
    public Object c(hc_0 hc_02, Class clazz, String[] stringArray) throws b_0, IOException {
        Method[] methodArray;
        Object object;
        block12: {
            block13: {
                Class clazz2;
                String[] stringArray2;
                block14: {
                    block11: {
                        stringArray2 = RG.C();
                        clazz2 = clazz;
                        if (stringArray2 == null) break block14;
                        try {
                            block15: {
                                if (clazz2.isInterface()) break block11;
                                break block15;
                                catch (InstantiationException instantiationException) {
                                    throw hI.a(instantiationException);
                                }
                            }
                            throw new P("\"" + clazz + hI.a(27888, 10256));
                        }
                        catch (InstantiationException instantiationException) {
                            throw hI.a(instantiationException);
                        }
                    }
                    clazz2 = clazz;
                }
                object = clazz2.getDeclaredMethods();
                methodArray = object;
                if (stringArray2 == null) break block12;
                try {
                    block16: {
                        if (methodArray.length == 1) break block13;
                        break block16;
                        catch (InstantiationException instantiationException) {
                            throw hI.a(instantiationException);
                        }
                    }
                    throw new P(hI.a(27873, 17471) + clazz + hI.a(27889, -18524));
                }
                catch (InstantiationException instantiationException) {
                    throw hI.a(instantiationException);
                }
            }
            methodArray = object;
        }
        Method method = methodArray[0];
        this.j(new Class[]{clazz});
        this.h(true);
        this.Y(false);
        this.J(method.getReturnType());
        this.L(method.getName());
        this.N(stringArray, method.getParameterTypes());
        this.I(method.getExceptionTypes());
        this.W(new hc_0[]{hc_02});
        object = this.E().getDeclaringClass();
        try {
            Object t2 = ((Class)object).newInstance();
            return t2;
        }
        catch (InstantiationException instantiationException) {
            throw new P(instantiationException.toString(), instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new P(illegalAccessException.toString(), illegalAccessException);
        }
    }

    public static String[] G(hc_0 hc_02) throws b_0, IOException {
        hG hG2 = new hG(hc_02);
        String[] stringArray = RG.C();
        while (hG2.Z(hI.a(27879, 10787))) {
            hG2.l();
            if (stringArray != null) continue;
        }
        RN rN = new RN(hc_02.m());
        while (!hG2.d(f_0.END_OF_INPUT)) {
            rN.q(hG2.F());
            if (stringArray != null) continue;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        new _Q(hashSet, hashSet2).B(rN);
        return hashSet2.toArray(new String[hashSet2.size()]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        var13 = new String[31];
                        var11_1 = 0;
                        var10_2 = "\u0084\u00d4\u00c1\u0019h\u0003\u00d1\u00d2\u00f8\tW\u00d0\u00be\u0089f\u00ff\u00de\u00f1K\u001dp'\u00bf\u0094\u00d2\u009f\u0007(\u00eb]\u0001\u00d1\u009a\u00e9\u00c1hs\u00fb(=Y\u00be\u000f'\u0017\u00a5\u00e7],\u0006\u00a8\u0083\u00c8\u00e5?\u00f0\u0005'\u0095\u0090\u00fe\u00de&\u0080(\t\u0017\u00b2\u00fdHO@\u008bB>%\u009a}E\u00d3:\u00b8\u00f7Z+H\u0093x\u0018;\u00fb\u00af\u001d\u00a5\u00dd\u0091d\u0017\u00a5\u00ffo\u0005q\u001c\u00f0x#\u000eU#\u00d8\u00f1!<\u00bb\u00ce\u00acT\u000e\u00cc\u0001\u00df\u000b\u0099\u0090=\n\u00dd\u00002W\u0017\u00df\u00d7\u0006\u00d2\u00b4<\u00c6Q\u00af\u0006\u00f3\u00ff,\u009d\u00ff\u00e8\u0005nq'\u00f97\u0002\u00eb\u00ff\u0002\u0090\u000f\u0006D^\u00a6\u00ba*O \u00010\u001f\u0006\u009f<X\u00a4e\u001bX3\"\u00f3A\u00beF\u0003\u001bT-D\u0097\u0001~\u00f1\u00d0\u0004\u00fdT\u008d\u00ce\b\u0084\u00a9\u00eb\u001dE\u00d9Mc\u0006U)\u00acL \u00e5\f\u0096\u00ed\u00bbVNY\u0017\u00e7p?\u00f1D\u0003k\u00ad\u00f4/D\u00cf\u0091\u00d8Zl\u00d4u\u00af\u0084}\u00b1N\u00ceX\u00ea#OE\u00e0\u001ek06\u0090\u0092$a\u0006\u00be\u008d\n*5\bs\u001e8-\u00c8\u00de\u0093\u00a9\u00a4\u00a4\u0099i\u0006\u00e0v8h\u009a^.\u00f83s\u0005\u001at\u00d6\u00d1\u000f\u00f1\u0097\u00844\u00da\u00f1\u00a9l\u0085\u00ed`T\u00eb\u00b8\u00ea8F\u009aW\u001a1\u00c7\u00b9\u0081|\u008a\u0082\u0000Vzy\u0015Z\u00a93\u008dr\u0015\u0001\u001e5J0\u00d4\u0099\u00d3\u00e8\u00fb\u0089\u00e0\u0015\u0082\f\u00ef\u0013\u008c\u00cd\u00b6E!\u001a(R\u008a\u000b\u0010\u0088\u0002)\u00d1^\u00a6\u00b6(T\u00d0\u00ccl\u007fZXV\u00b3\u00e9\u00e2(1u\u00f9c\u0084'c\u0005^kyg\u00ba\u0005C\u00aa\u00fa\u0081\u00e6\u0018\u00dbU\f>Z\u00aaU\u009f\u00d4\u00e5h\u001f\u00cb\u0083K\u0081\u00ee\u00ab\u0081\u00a8\u00e9`yX";
                        var12_3 = "\u0084\u00d4\u00c1\u0019h\u0003\u00d1\u00d2\u00f8\tW\u00d0\u00be\u0089f\u00ff\u00de\u00f1K\u001dp'\u00bf\u0094\u00d2\u009f\u0007(\u00eb]\u0001\u00d1\u009a\u00e9\u00c1hs\u00fb(=Y\u00be\u000f'\u0017\u00a5\u00e7],\u0006\u00a8\u0083\u00c8\u00e5?\u00f0\u0005'\u0095\u0090\u00fe\u00de&\u0080(\t\u0017\u00b2\u00fdHO@\u008bB>%\u009a}E\u00d3:\u00b8\u00f7Z+H\u0093x\u0018;\u00fb\u00af\u001d\u00a5\u00dd\u0091d\u0017\u00a5\u00ffo\u0005q\u001c\u00f0x#\u000eU#\u00d8\u00f1!<\u00bb\u00ce\u00acT\u000e\u00cc\u0001\u00df\u000b\u0099\u0090=\n\u00dd\u00002W\u0017\u00df\u00d7\u0006\u00d2\u00b4<\u00c6Q\u00af\u0006\u00f3\u00ff,\u009d\u00ff\u00e8\u0005nq'\u00f97\u0002\u00eb\u00ff\u0002\u0090\u000f\u0006D^\u00a6\u00ba*O \u00010\u001f\u0006\u009f<X\u00a4e\u001bX3\"\u00f3A\u00beF\u0003\u001bT-D\u0097\u0001~\u00f1\u00d0\u0004\u00fdT\u008d\u00ce\b\u0084\u00a9\u00eb\u001dE\u00d9Mc\u0006U)\u00acL \u00e5\f\u0096\u00ed\u00bbVNY\u0017\u00e7p?\u00f1D\u0003k\u00ad\u00f4/D\u00cf\u0091\u00d8Zl\u00d4u\u00af\u0084}\u00b1N\u00ceX\u00ea#OE\u00e0\u001ek06\u0090\u0092$a\u0006\u00be\u008d\n*5\bs\u001e8-\u00c8\u00de\u0093\u00a9\u00a4\u00a4\u0099i\u0006\u00e0v8h\u009a^.\u00f83s\u0005\u001at\u00d6\u00d1\u000f\u00f1\u0097\u00844\u00da\u00f1\u00a9l\u0085\u00ed`T\u00eb\u00b8\u00ea8F\u009aW\u001a1\u00c7\u00b9\u0081|\u008a\u0082\u0000Vzy\u0015Z\u00a93\u008dr\u0015\u0001\u001e5J0\u00d4\u0099\u00d3\u00e8\u00fb\u0089\u00e0\u0015\u0082\f\u00ef\u0013\u008c\u00cd\u00b6E!\u001a(R\u008a\u000b\u0010\u0088\u0002)\u00d1^\u00a6\u00b6(T\u00d0\u00ccl\u007fZXV\u00b3\u00e9\u00e2(1u\u00f9c\u0084'c\u0005^kyg\u00ba\u0005C\u00aa\u00fa\u0081\u00e6\u0018\u00dbU\f>Z\u00aaU\u009f\u00d4\u00e5h\u001f\u00cb\u0083K\u0081\u00ee\u00ab\u0081\u00a8\u00e9`yX".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 63;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block28;
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
                            var10_2 = "/\r!8[\u00d1\u0004\u00c4\u00f8\u00f9\u008d";
                            var12_3 = "/\r!8[\u00d1\u0004\u00c4\u00f8\u00f9\u008d".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 89;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block28;
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
                                    v15 = 12;
                                    break;
                                }
                                case 1: {
                                    v15 = 41;
                                    break;
                                }
                                case 2: {
                                    v15 = 67;
                                    break;
                                }
                                case 3: {
                                    v15 = 35;
                                    break;
                                }
                                case 4: {
                                    v15 = 66;
                                    break;
                                }
                                case 5: {
                                    v15 = 82;
                                    break;
                                }
                                default: {
                                    v15 = 68;
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
                hI.c = var13;
                hI.d = new String[31];
                var0_7 = 9063756843062790238L;
                var6_8 = new long[9];
                var3_9 = 0;
                var4_10 = "2V\u00ba\u00be\u00a9\u00a1a&\u00b8\u008a;RH\u0014\u00b8\u0089S\u00dc{e\u001eT>\u00a2\u009f\u008f\u009c\u0084]O8\u00d3\u00a5\u009a\u008a\u0011\u0019u\u0086\u00c1\u001e1\u00ccj\u00e8\u00d3\u00f0\u00d7\u00073\u00c3y\u00e4gW\u00fb";
                var5_11 = "2V\u00ba\u00be\u00a9\u00a1a&\u00b8\u008a;RH\u0014\u00b8\u0089S\u00dc{e\u001eT>\u00a2\u009f\u008f\u009c\u0084]O8\u00d3\u00a5\u009a\u008a\u0011\u0019u\u0086\u00c1\u001e1\u00ccj\u00e8\u00d3\u00f0\u00d7\u00073\u00c3y\u00e4gW\u00fb".length();
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
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00c8\u00e4H\u00fc_\u0002\u00e1Wj\u0091'\u00b3\u00e8\u00d6\u00d8\u0097";
                    var5_11 = "\u00c8\u00e4H\u00fc_\u0002\u00e1Wj\u0091'\u00b3\u00e8\u00d6\u00d8\u0097".length();
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
lbl125:
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
lbl136:
                // 1 sources

                ** continue;
            }
        }
        hI.e = var6_8;
        hI.f = new Integer[9];
        try {
            v22 = hI.class.desiredAssertionStatus() == false;
        }
        catch (IllegalArgumentException v23) {
            throw hI.a(v23);
        }
        hI.X = v22;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6CE8) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 198;
                    break;
                }
                case 1: {
                    n14 = 15;
                    break;
                }
                case 2: {
                    n14 = 104;
                    break;
                }
                case 3: {
                    n14 = 158;
                    break;
                }
                case 4: {
                    n14 = 125;
                    break;
                }
                case 5: {
                    n14 = 169;
                    break;
                }
                case 6: {
                    n14 = 16;
                    break;
                }
                case 7: {
                    n14 = 131;
                    break;
                }
                case 8: {
                    n14 = 26;
                    break;
                }
                case 9: {
                    n14 = 89;
                    break;
                }
                case 10: {
                    n14 = 56;
                    break;
                }
                case 11: {
                    n14 = 144;
                    break;
                }
                case 12: {
                    n14 = 142;
                    break;
                }
                case 13: {
                    n14 = 151;
                    break;
                }
                case 14: {
                    n14 = 29;
                    break;
                }
                case 15: {
                    n14 = 122;
                    break;
                }
                case 16: {
                    n14 = 189;
                    break;
                }
                case 17: {
                    n14 = 12;
                    break;
                }
                case 18: {
                    n14 = 213;
                    break;
                }
                case 19: {
                    n14 = 199;
                    break;
                }
                case 20: {
                    n14 = 167;
                    break;
                }
                case 21: {
                    n14 = 174;
                    break;
                }
                case 22: {
                    n14 = 61;
                    break;
                }
                case 23: {
                    n14 = 175;
                    break;
                }
                case 24: {
                    n14 = 77;
                    break;
                }
                case 25: {
                    n14 = 182;
                    break;
                }
                case 26: {
                    n14 = 188;
                    break;
                }
                case 27: {
                    n14 = 116;
                    break;
                }
                case 28: {
                    n14 = 147;
                    break;
                }
                case 29: {
                    n14 = 253;
                    break;
                }
                case 30: {
                    n14 = 8;
                    break;
                }
                case 31: {
                    n14 = 74;
                    break;
                }
                case 32: {
                    n14 = 49;
                    break;
                }
                case 33: {
                    n14 = 13;
                    break;
                }
                case 34: {
                    n14 = 208;
                    break;
                }
                case 35: {
                    n14 = 180;
                    break;
                }
                case 36: {
                    n14 = 75;
                    break;
                }
                case 37: {
                    n14 = 6;
                    break;
                }
                case 38: {
                    n14 = 37;
                    break;
                }
                case 39: {
                    n14 = 76;
                    break;
                }
                case 40: {
                    n14 = 194;
                    break;
                }
                case 41: {
                    n14 = 153;
                    break;
                }
                case 42: {
                    n14 = 102;
                    break;
                }
                case 43: {
                    n14 = 64;
                    break;
                }
                case 44: {
                    n14 = 4;
                    break;
                }
                case 45: {
                    n14 = 197;
                    break;
                }
                case 46: {
                    n14 = 82;
                    break;
                }
                case 47: {
                    n14 = 195;
                    break;
                }
                case 48: {
                    n14 = 207;
                    break;
                }
                case 49: {
                    n14 = 243;
                    break;
                }
                case 50: {
                    n14 = 0;
                    break;
                }
                case 51: {
                    n14 = 205;
                    break;
                }
                case 52: {
                    n14 = 235;
                    break;
                }
                case 53: {
                    n14 = 192;
                    break;
                }
                case 54: {
                    n14 = 36;
                    break;
                }
                case 55: {
                    n14 = 137;
                    break;
                }
                case 56: {
                    n14 = 48;
                    break;
                }
                case 57: {
                    n14 = 233;
                    break;
                }
                case 58: {
                    n14 = 62;
                    break;
                }
                case 59: {
                    n14 = 17;
                    break;
                }
                case 60: {
                    n14 = 178;
                    break;
                }
                case 61: {
                    n14 = 211;
                    break;
                }
                case 62: {
                    n14 = 24;
                    break;
                }
                case 63: {
                    n14 = 115;
                    break;
                }
                case 64: {
                    n14 = 193;
                    break;
                }
                case 65: {
                    n14 = 128;
                    break;
                }
                case 66: {
                    n14 = 152;
                    break;
                }
                case 67: {
                    n14 = 34;
                    break;
                }
                case 68: {
                    n14 = 126;
                    break;
                }
                case 69: {
                    n14 = 2;
                    break;
                }
                case 70: {
                    n14 = 132;
                    break;
                }
                case 71: {
                    n14 = 252;
                    break;
                }
                case 72: {
                    n14 = 156;
                    break;
                }
                case 73: {
                    n14 = 135;
                    break;
                }
                case 74: {
                    n14 = 67;
                    break;
                }
                case 75: {
                    n14 = 157;
                    break;
                }
                case 76: {
                    n14 = 130;
                    break;
                }
                case 77: {
                    n14 = 87;
                    break;
                }
                case 78: {
                    n14 = 111;
                    break;
                }
                case 79: {
                    n14 = 202;
                    break;
                }
                case 80: {
                    n14 = 127;
                    break;
                }
                case 81: {
                    n14 = 229;
                    break;
                }
                case 82: {
                    n14 = 248;
                    break;
                }
                case 83: {
                    n14 = 190;
                    break;
                }
                case 84: {
                    n14 = 215;
                    break;
                }
                case 85: {
                    n14 = 159;
                    break;
                }
                case 86: {
                    n14 = 214;
                    break;
                }
                case 87: {
                    n14 = 51;
                    break;
                }
                case 88: {
                    n14 = 100;
                    break;
                }
                case 89: {
                    n14 = 107;
                    break;
                }
                case 90: {
                    n14 = 227;
                    break;
                }
                case 91: {
                    n14 = 201;
                    break;
                }
                case 92: {
                    n14 = 168;
                    break;
                }
                case 93: {
                    n14 = 40;
                    break;
                }
                case 94: {
                    n14 = 94;
                    break;
                }
                case 95: {
                    n14 = 59;
                    break;
                }
                case 96: {
                    n14 = 118;
                    break;
                }
                case 97: {
                    n14 = 109;
                    break;
                }
                case 98: {
                    n14 = 119;
                    break;
                }
                case 99: {
                    n14 = 47;
                    break;
                }
                case 100: {
                    n14 = 220;
                    break;
                }
                case 101: {
                    n14 = 221;
                    break;
                }
                case 102: {
                    n14 = 9;
                    break;
                }
                case 103: {
                    n14 = 42;
                    break;
                }
                case 104: {
                    n14 = 154;
                    break;
                }
                case 105: {
                    n14 = 108;
                    break;
                }
                case 106: {
                    n14 = 90;
                    break;
                }
                case 107: {
                    n14 = 68;
                    break;
                }
                case 108: {
                    n14 = 247;
                    break;
                }
                case 109: {
                    n14 = 231;
                    break;
                }
                case 110: {
                    n14 = 28;
                    break;
                }
                case 111: {
                    n14 = 106;
                    break;
                }
                case 112: {
                    n14 = 35;
                    break;
                }
                case 113: {
                    n14 = 112;
                    break;
                }
                case 114: {
                    n14 = 72;
                    break;
                }
                case 115: {
                    n14 = 251;
                    break;
                }
                case 116: {
                    n14 = 7;
                    break;
                }
                case 117: {
                    n14 = 255;
                    break;
                }
                case 118: {
                    n14 = 164;
                    break;
                }
                case 119: {
                    n14 = 5;
                    break;
                }
                case 120: {
                    n14 = 21;
                    break;
                }
                case 121: {
                    n14 = 129;
                    break;
                }
                case 122: {
                    n14 = 143;
                    break;
                }
                case 123: {
                    n14 = 232;
                    break;
                }
                case 124: {
                    n14 = 139;
                    break;
                }
                case 125: {
                    n14 = 150;
                    break;
                }
                case 126: {
                    n14 = 33;
                    break;
                }
                case 127: {
                    n14 = 226;
                    break;
                }
                case 128: {
                    n14 = 186;
                    break;
                }
                case 129: {
                    n14 = 163;
                    break;
                }
                case 130: {
                    n14 = 95;
                    break;
                }
                case 131: {
                    n14 = 98;
                    break;
                }
                case 132: {
                    n14 = 63;
                    break;
                }
                case 133: {
                    n14 = 25;
                    break;
                }
                case 134: {
                    n14 = 110;
                    break;
                }
                case 135: {
                    n14 = 165;
                    break;
                }
                case 136: {
                    n14 = 60;
                    break;
                }
                case 137: {
                    n14 = 184;
                    break;
                }
                case 138: {
                    n14 = 176;
                    break;
                }
                case 139: {
                    n14 = 39;
                    break;
                }
                case 140: {
                    n14 = 238;
                    break;
                }
                case 141: {
                    n14 = 217;
                    break;
                }
                case 142: {
                    n14 = 52;
                    break;
                }
                case 143: {
                    n14 = 120;
                    break;
                }
                case 144: {
                    n14 = 204;
                    break;
                }
                case 145: {
                    n14 = 113;
                    break;
                }
                case 146: {
                    n14 = 22;
                    break;
                }
                case 147: {
                    n14 = 99;
                    break;
                }
                case 148: {
                    n14 = 171;
                    break;
                }
                case 149: {
                    n14 = 44;
                    break;
                }
                case 150: {
                    n14 = 203;
                    break;
                }
                case 151: {
                    n14 = 218;
                    break;
                }
                case 152: {
                    n14 = 20;
                    break;
                }
                case 153: {
                    n14 = 70;
                    break;
                }
                case 154: {
                    n14 = 73;
                    break;
                }
                case 155: {
                    n14 = 10;
                    break;
                }
                case 156: {
                    n14 = 200;
                    break;
                }
                case 157: {
                    n14 = 212;
                    break;
                }
                case 158: {
                    n14 = 210;
                    break;
                }
                case 159: {
                    n14 = 124;
                    break;
                }
                case 160: {
                    n14 = 18;
                    break;
                }
                case 161: {
                    n14 = 145;
                    break;
                }
                case 162: {
                    n14 = 88;
                    break;
                }
                case 163: {
                    n14 = 136;
                    break;
                }
                case 164: {
                    n14 = 162;
                    break;
                }
                case 165: {
                    n14 = 11;
                    break;
                }
                case 166: {
                    n14 = 117;
                    break;
                }
                case 167: {
                    n14 = 172;
                    break;
                }
                case 168: {
                    n14 = 161;
                    break;
                }
                case 169: {
                    n14 = 146;
                    break;
                }
                case 170: {
                    n14 = 92;
                    break;
                }
                case 171: {
                    n14 = 160;
                    break;
                }
                case 172: {
                    n14 = 181;
                    break;
                }
                case 173: {
                    n14 = 236;
                    break;
                }
                case 174: {
                    n14 = 170;
                    break;
                }
                case 175: {
                    n14 = 58;
                    break;
                }
                case 176: {
                    n14 = 141;
                    break;
                }
                case 177: {
                    n14 = 65;
                    break;
                }
                case 178: {
                    n14 = 191;
                    break;
                }
                case 179: {
                    n14 = 38;
                    break;
                }
                case 180: {
                    n14 = 83;
                    break;
                }
                case 181: {
                    n14 = 219;
                    break;
                }
                case 182: {
                    n14 = 79;
                    break;
                }
                case 183: {
                    n14 = 1;
                    break;
                }
                case 184: {
                    n14 = 41;
                    break;
                }
                case 185: {
                    n14 = 177;
                    break;
                }
                case 186: {
                    n14 = 27;
                    break;
                }
                case 187: {
                    n14 = 101;
                    break;
                }
                case 188: {
                    n14 = 140;
                    break;
                }
                case 189: {
                    n14 = 96;
                    break;
                }
                case 190: {
                    n14 = 3;
                    break;
                }
                case 191: {
                    n14 = 179;
                    break;
                }
                case 192: {
                    n14 = 80;
                    break;
                }
                case 193: {
                    n14 = 14;
                    break;
                }
                case 194: {
                    n14 = 246;
                    break;
                }
                case 195: {
                    n14 = 149;
                    break;
                }
                case 196: {
                    n14 = 187;
                    break;
                }
                case 197: {
                    n14 = 91;
                    break;
                }
                case 198: {
                    n14 = 103;
                    break;
                }
                case 199: {
                    n14 = 228;
                    break;
                }
                case 200: {
                    n14 = 97;
                    break;
                }
                case 201: {
                    n14 = 148;
                    break;
                }
                case 202: {
                    n14 = 230;
                    break;
                }
                case 203: {
                    n14 = 223;
                    break;
                }
                case 204: {
                    n14 = 46;
                    break;
                }
                case 205: {
                    n14 = 78;
                    break;
                }
                case 206: {
                    n14 = 254;
                    break;
                }
                case 207: {
                    n14 = 209;
                    break;
                }
                case 208: {
                    n14 = 86;
                    break;
                }
                case 209: {
                    n14 = 138;
                    break;
                }
                case 210: {
                    n14 = 30;
                    break;
                }
                case 211: {
                    n14 = 85;
                    break;
                }
                case 212: {
                    n14 = 244;
                    break;
                }
                case 213: {
                    n14 = 183;
                    break;
                }
                case 214: {
                    n14 = 173;
                    break;
                }
                case 215: {
                    n14 = 134;
                    break;
                }
                case 216: {
                    n14 = 66;
                    break;
                }
                case 217: {
                    n14 = 32;
                    break;
                }
                case 218: {
                    n14 = 19;
                    break;
                }
                case 219: {
                    n14 = 206;
                    break;
                }
                case 220: {
                    n14 = 133;
                    break;
                }
                case 221: {
                    n14 = 50;
                    break;
                }
                case 222: {
                    n14 = 71;
                    break;
                }
                case 223: {
                    n14 = 242;
                    break;
                }
                case 224: {
                    n14 = 196;
                    break;
                }
                case 225: {
                    n14 = 237;
                    break;
                }
                case 226: {
                    n14 = 240;
                    break;
                }
                case 227: {
                    n14 = 121;
                    break;
                }
                case 228: {
                    n14 = 249;
                    break;
                }
                case 229: {
                    n14 = 81;
                    break;
                }
                case 230: {
                    n14 = 222;
                    break;
                }
                case 231: {
                    n14 = 250;
                    break;
                }
                case 232: {
                    n14 = 245;
                    break;
                }
                case 233: {
                    n14 = 123;
                    break;
                }
                case 234: {
                    n14 = 23;
                    break;
                }
                case 235: {
                    n14 = 114;
                    break;
                }
                case 236: {
                    n14 = 43;
                    break;
                }
                case 237: {
                    n14 = 185;
                    break;
                }
                case 238: {
                    n14 = 45;
                    break;
                }
                case 239: {
                    n14 = 55;
                    break;
                }
                case 240: {
                    n14 = 216;
                    break;
                }
                case 241: {
                    n14 = 155;
                    break;
                }
                case 242: {
                    n14 = 225;
                    break;
                }
                case 243: {
                    n14 = 241;
                    break;
                }
                case 244: {
                    n14 = 53;
                    break;
                }
                case 245: {
                    n14 = 84;
                    break;
                }
                case 246: {
                    n14 = 239;
                    break;
                }
                case 247: {
                    n14 = 166;
                    break;
                }
                case 248: {
                    n14 = 224;
                    break;
                }
                case 249: {
                    n14 = 57;
                    break;
                }
                case 250: {
                    n14 = 69;
                    break;
                }
                case 251: {
                    n14 = 105;
                    break;
                }
                case 252: {
                    n14 = 93;
                    break;
                }
                case 253: {
                    n14 = 31;
                    break;
                }
                case 254: {
                    n14 = 234;
                    break;
                }
                default: {
                    n14 = 54;
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
            hI.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x431C;
        if (f[n11] == null) {
            hI.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

