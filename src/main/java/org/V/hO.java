/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.F.c;
import org.I;
import org.T.E;
import org.U;
import org.Y;
import org.b_0;
import org.f;
import org.h.cr_0;
import org.o;
import org.v.RB;
import org.v.RG;
import org.v._m_0;
import org.v.fN;
import org.v.fw_0;
import org.v.hG;
import org.v.h_1;
import org.v.hc_0;
import org.v.nb_0;
import org.v.nt_0;
import org.v.rd_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hO
extends f
implements o {
    private static final boolean s;
    private static final Logger X;
    private ClassLoader D = Thread.currentThread().getContextClassLoader();
    @c
    private _m_0 W;
    @c
    private U c;
    @c
    private Y B;
    private boolean z;
    private boolean C;
    private boolean G;
    private int q;
    private int u;
    private EnumSet g;
    @c
    private Collection n;
    @c
    private Map h;
    @c
    private ClassLoader O;
    private static final String[] b;
    private static final String[] d;

    public static void main(String[] stringArray) throws Exception {
        String[] stringArray2;
        block16: {
            int n10;
            int n11;
            block13: {
                block15: {
                    String[] stringArray3;
                    block14: {
                        stringArray3 = RG.C();
                        try {
                            try {
                                try {
                                    try {
                                        n11 = stringArray.length;
                                        n10 = 1;
                                        if (stringArray3 == null) break block13;
                                        if (n11 < n10) break block14;
                                    }
                                    catch (Exception exception) {
                                        throw hO.a(exception);
                                    }
                                    n11 = hO.a(5231, 5839).equals(stringArray[0]) ? 1 : 0;
                                    if (stringArray3 == null) break block15;
                                }
                                catch (Exception exception) {
                                    throw hO.a(exception);
                                }
                                if (n11 == 0) break block14;
                            }
                            catch (Exception exception) {
                                throw hO.a(exception);
                            }
                            System.out.println(hO.a(5226, 11137));
                            System.out.println(hO.a(5230, -8857) + hO.class.getName() + hO.a(5225, 29721));
                            System.out.println(hO.a(5217, 26849));
                            System.out.println(hO.a(5220, -25602));
                            System.out.println(hO.a(5229, -32161));
                            System.exit(1);
                        }
                        catch (Exception exception) {
                            throw hO.a(exception);
                        }
                    }
                    try {
                        stringArray2 = stringArray;
                        if (stringArray3 == null) break block16;
                        n11 = stringArray2.length;
                    }
                    catch (Exception exception) {
                        throw hO.a(exception);
                    }
                }
                n10 = 2;
            }
            try {
                if (n11 < n10) {
                    System.err.println(hO.a(5227, -6697));
                    System.exit(1);
                }
            }
            catch (Exception exception) {
                throw hO.a(exception);
            }
            stringArray2 = stringArray;
        }
        String string = stringArray2[0];
        String string2 = stringArray[1];
        String[] stringArray4 = new String[stringArray.length - 2];
        System.arraycopy(stringArray, 2, stringArray4, 0, stringArray4.length);
        ClassLoader classLoader = new hO(string, new FileInputStream(string)).Y();
        Class<?> clazz = classLoader.loadClass(string2);
        Method method = clazz.getMethod(hO.a(5222, 25075), String[].class);
        method.invoke(null, new Object[]{stringArray4});
    }

    public hO(@c String string, Reader reader) throws IOException, b_0 {
        this.C = this.z = Boolean.getBoolean(hO.a(5224, -21622));
        this.G = this.z;
        this.q = -1;
        this.u = -1;
        this.g = EnumSet.noneOf(rd_0.class);
        this.Y(string, reader);
    }

    public hO(@c String string, InputStream inputStream) throws IOException, b_0 {
        this.C = this.z = Boolean.getBoolean(hO.a(5224, -21622));
        this.G = this.z;
        this.q = -1;
        this.u = -1;
        this.g = EnumSet.noneOf(rd_0.class);
        this.f(string, inputStream);
    }

    public hO(String string) throws IOException, b_0 {
        this.C = this.z = Boolean.getBoolean(hO.a(5218, -27394));
        this.G = this.z;
        this.q = -1;
        this.u = -1;
        this.g = EnumSet.noneOf(rd_0.class);
        this.c(string);
    }

    public hO(hc_0 hc_02, @c ClassLoader classLoader) throws IOException, b_0 {
        this.C = this.z = Boolean.getBoolean(hO.a(5224, -21622));
        this.G = this.z;
        this.q = -1;
        this.u = -1;
        this.g = EnumSet.noneOf(rd_0.class);
        this.C(classLoader);
        this.E(hc_02);
    }

    public hO() {
        this.C = this.z = Boolean.getBoolean(hO.a(5224, -21622));
        this.G = this.z;
        this.q = -1;
        this.u = -1;
        this.g = EnumSet.noneOf(rd_0.class);
    }

    @Override
    public void C(@c ClassLoader classLoader) {
        ClassLoader classLoader2;
        block2: {
            block3: {
                String[] stringArray = RG.C();
                try {
                    hO hO2 = this;
                    classLoader2 = classLoader;
                    if (stringArray == null) break block2;
                    if (classLoader2 == null) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw hO.a(illegalStateException);
                }
                classLoader2 = classLoader;
                break block2;
            }
            classLoader2 = Thread.currentThread().getContextClassLoader();
        }
        hO2.D = classLoader2;
    }

    @Override
    public void I(boolean bl, boolean bl2, boolean bl3) {
        this.z = bl;
        this.C = bl2;
        this.G = bl3;
    }

    @Override
    public final void Y(@c String string, Reader reader) throws b_0, IOException {
        this.E(new hc_0(string, reader));
    }

    public void E(hc_0 hc_02) throws b_0, IOException {
        RB rB;
        hG hG2 = new hG(hc_02);
        hG2.Q(this.q);
        hG2.S(this.B);
        try {
            rB = hG2.X();
        }
        catch (b_0 b_02) {
            this.n = Collections.emptyList();
            throw b_02;
        }
        this.a(rB);
    }

    public void T(RB rB) throws b_0 {
        X.entering(null, hO.a(5219, 4066), rB);
        this.T();
        _m_0 _m_02 = this.W = new _m_0(this.D);
        try {
            h_1 h_12 = new h_1(rB, _m_02).F(this.g);
            h_12.s(this.u);
            h_12.E(this.c);
            h_12.Y(this.B);
            ArrayList arrayList = new ArrayList();
            h_12.q(this.z, this.C, this.G, new fN(this, arrayList));
            this.n = arrayList;
        }
        catch (b_0 b_02) {
            this.n = Collections.emptyList();
            throw b_02;
        }
        finally {
            this.W = null;
        }
    }

    public cr_0[] R() {
        Collection collection = this.T();
        return collection.toArray(new cr_0[collection.size()]);
    }

    @Override
    public void n(int n10) {
        this.q = n10;
    }

    @Override
    public void v(int n10) {
        this.u = n10;
    }

    @Override
    public Map Q() {
        Map map;
        block4: {
            block5: {
                String[] stringArray = RG.C();
                try {
                    try {
                        map = this.h;
                        if (stringArray == null) break block4;
                        if (map == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw hO.a(illegalStateException);
                    }
                    return this.h;
                }
                catch (IllegalStateException illegalStateException) {
                    throw hO.a(illegalStateException);
                }
            }
            map = this.h = this.O();
        }
        return map;
    }

    private Map O() {
        HashMap<String, byte[]> hashMap;
        block4: {
            HashMap<String, byte[]> hashMap2 = new HashMap<String, byte[]>();
            cr_0[] cr_0Array = this.R();
            String[] stringArray = RG.C();
            for (cr_0 cr_02 : cr_0Array) {
                try {
                    hashMap = hashMap2;
                    if (stringArray != null) {
                        hashMap.put(cr_02.t(), cr_02.q());
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw hO.a(illegalStateException);
                }
            }
            hashMap = hashMap2;
        }
        return hashMap;
    }

    @Override
    public ClassLoader Y() {
        ClassLoader classLoader;
        block4: {
            block5: {
                String[] stringArray = RG.C();
                try {
                    try {
                        classLoader = this.O;
                        if (stringArray == null) break block4;
                        if (classLoader == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw hO.a(illegalStateException);
                    }
                    return this.O;
                }
                catch (IllegalStateException illegalStateException) {
                    throw hO.a(illegalStateException);
                }
            }
            classLoader = this.O = this.p();
        }
        return classLoader;
    }

    private ClassLoader p() {
        Map map = this.Q();
        return (ClassLoader)AccessController.doPrivileged(new fw_0(this, map));
    }

    public boolean equals(@c Object object) {
        hO hO2;
        hO hO3;
        block10: {
            block11: {
                Object object2;
                String[] stringArray;
                block8: {
                    block9: {
                        stringArray = RG.C();
                        try {
                            try {
                                object2 = object;
                                if (stringArray == null) break block8;
                                if (object2 instanceof hO) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw hO.a(illegalStateException);
                            }
                            return false;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw hO.a(illegalStateException);
                        }
                    }
                    object2 = object;
                }
                hO3 = (hO)object2;
                try {
                    try {
                        hO2 = this;
                        if (stringArray == null) break block10;
                        if (hO2.getClass() == hO3.getClass()) break block11;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw hO.a(illegalStateException);
                    }
                    return false;
                }
                catch (IllegalStateException illegalStateException) {
                    throw hO.a(illegalStateException);
                }
            }
            hO2 = this;
        }
        return hO2.T().equals(hO3.T());
    }

    public int hashCode() {
        return this.D.hashCode();
    }

    @Override
    public void N(@c U u10) {
        this.c = u10;
    }

    @Override
    public void q(@c Y y2) {
        this.B = y2;
    }

    public EnumSet A() {
        return this.g;
    }

    public hO C(EnumSet enumSet) {
        this.g = enumSet;
        return this;
    }

    @c
    protected nt_0 D(I i2, @c Class clazz) {
        try {
            if (clazz == null) {
                return null;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw hO.a(illegalStateException);
        }
        return this.S(i2, clazz);
    }

    protected nt_0 S(I i2, Class clazz) {
        return new nb_0(this, i2, clazz, i2);
    }

    protected nt_0[] J(I i2, @c Class[] classArray) {
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
                        catch (IllegalStateException illegalStateException) {
                            throw hO.a(illegalStateException);
                        }
                        return new nt_0[0];
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw hO.a(illegalStateException);
                    }
                }
                classArray2 = classArray;
            }
            nt_0[] nt_0Array2 = new nt_0[classArray2.length];
            for (int i3 = 0; i3 < classArray.length; ++i3) {
                try {
                    nt_0Array = nt_0Array2;
                    if (stringArray != null) {
                        nt_0Array[i3] = this.S(i2, classArray[i3]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block10;
                }
                catch (IllegalStateException illegalStateException) {
                    throw hO.a(illegalStateException);
                }
            }
            nt_0Array = nt_0Array2;
        }
        return nt_0Array;
    }

    protected final ClassLoader a(RB rB) throws b_0 {
        this.T(rB);
        return this.Y();
    }

    private void T() {
        try {
            if (this.n != null) {
                throw new IllegalStateException(hO.a(5223, 19273));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw hO.a(illegalStateException);
        }
    }

    private Collection T() {
        Collection collection;
        block4: {
            Collection collection2;
            block5: {
                collection2 = this.n;
                String[] stringArray = RG.C();
                try {
                    try {
                        collection = collection2;
                        if (stringArray == null) break block4;
                        if (collection != null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw hO.a(illegalStateException);
                    }
                    throw new IllegalStateException(hO.a(5221, -18259));
                }
                catch (IllegalStateException illegalStateException) {
                    throw hO.a(illegalStateException);
                }
            }
            collection = collection2;
        }
        return collection;
    }

    static boolean p() {
        return s;
    }

    static ClassLoader E(hO hO2) {
        return hO2.D;
    }

    static _m_0 P(hO hO2) {
        return hO2.W;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[15];
                var3_1 = 0;
                var2_2 = "\u0089\u00d3\u001f\u0007U\t\u001c\u00c0Dh\u00c9\u00e54_\u00f1\u0012\u00c8\u00e3')=ad\u00a6\u00aa=hN\u001e;\u00b1\u0015|\u0001\u001d8(_T\u008a\u0019u\u009c\u00ea\u00fcb2DP\u00d5\u00db\"{\u00a9\u00e3\u00fb.\u00e2\u008b\u00de#\u00e3\u00a5E3\u00b0\u00dc\u0099\u001f\u0084\u0017\u00e3\u0082\u00deU\u008ed\u00d4\u009a|0\u00cb\u00ca\u00d4\u00ab\u008e\u00d4\u00acg\u00dc\u0090s\u0080\u0089\u001fV\u00dav\u00c1\u00e6\u0084\u0010\u00cb\u00dd^@\u0014\u00db\u0019\u00b1Y\u00d4\u008f\u007f\u00fdP\u0006\u00eed\u0080\u00827L*\u0000\u00ff\u0094_\u00f5\u00b6Z@\u0086dEE$+\u00a2O\u00d0J{v\r1=\f\u001d\u00a6\u00f0aS\u00c7\u0081\u00c9\u00f6\u00be\u00cb\u00fe(\u00b2\u00cc\u00c4\u00ee@+\u00828va)\u0005\u0012\u0088-z\u00c1~`\u00e4I:\u00ce\u00fe\u00fd\u00ff\u0012\u00b4\u00c5\u00a5t\u00e2s\u00adp\u00d0q'\u009d\u00ab\n\u0099#\u001e\u0095d\u00de\u00f1_#\u00bb\u00c7##V\\\u00dc\u00aa\u00aeW\u0095\u00a4\u0011b\u00a8\u00c0\u00f7\u00e8tYX\u00a5\u00ac\u00d19\u00d2\u0096\u00edZ[\u00e8\u00f6\u00b8\\D\u0004\u0094L\u00f8\u00de\"\no\u00156\u0090\u00fe\u0004\u00fe\u00b5\u00dd\u00f6\u00f5}H%\u0085F@BL\u009d\u0004e\u008cPw\u00b9\u00f5\u00f11\u0014\u00f8\u00a2\u00bdF\u00c5\u00bch\u00ff\u00b5\u0015h\t\u009e\u00b2\u00db\u00d7\u00f2?\u00f5q6\u008b/\u00b8<\u009d\u00c1S \u0095\u00f0\u00a5B\t\u00a8\u00ad\u00cc\u0001\u0011\u00c3\u00c4\u00f9N\u00f9,\r\u00d8p\u00e5[\u00f4\u0011\u00ac\u007fD\u001c\u008fe\u0092\u00d8c\u0011v\u008f\u0084Q\u00f2\u0091\u00c2\u00d2\u00af\u00aa\u0014\u0096\u0004\u00e7\u009e_N";
                var4_3 = "\u0089\u00d3\u001f\u0007U\t\u001c\u00c0Dh\u00c9\u00e54_\u00f1\u0012\u00c8\u00e3')=ad\u00a6\u00aa=hN\u001e;\u00b1\u0015|\u0001\u001d8(_T\u008a\u0019u\u009c\u00ea\u00fcb2DP\u00d5\u00db\"{\u00a9\u00e3\u00fb.\u00e2\u008b\u00de#\u00e3\u00a5E3\u00b0\u00dc\u0099\u001f\u0084\u0017\u00e3\u0082\u00deU\u008ed\u00d4\u009a|0\u00cb\u00ca\u00d4\u00ab\u008e\u00d4\u00acg\u00dc\u0090s\u0080\u0089\u001fV\u00dav\u00c1\u00e6\u0084\u0010\u00cb\u00dd^@\u0014\u00db\u0019\u00b1Y\u00d4\u008f\u007f\u00fdP\u0006\u00eed\u0080\u00827L*\u0000\u00ff\u0094_\u00f5\u00b6Z@\u0086dEE$+\u00a2O\u00d0J{v\r1=\f\u001d\u00a6\u00f0aS\u00c7\u0081\u00c9\u00f6\u00be\u00cb\u00fe(\u00b2\u00cc\u00c4\u00ee@+\u00828va)\u0005\u0012\u0088-z\u00c1~`\u00e4I:\u00ce\u00fe\u00fd\u00ff\u0012\u00b4\u00c5\u00a5t\u00e2s\u00adp\u00d0q'\u009d\u00ab\n\u0099#\u001e\u0095d\u00de\u00f1_#\u00bb\u00c7##V\\\u00dc\u00aa\u00aeW\u0095\u00a4\u0011b\u00a8\u00c0\u00f7\u00e8tYX\u00a5\u00ac\u00d19\u00d2\u0096\u00edZ[\u00e8\u00f6\u00b8\\D\u0004\u0094L\u00f8\u00de\"\no\u00156\u0090\u00fe\u0004\u00fe\u00b5\u00dd\u00f6\u00f5}H%\u0085F@BL\u009d\u0004e\u008cPw\u00b9\u00f5\u00f11\u0014\u00f8\u00a2\u00bdF\u00c5\u00bch\u00ff\u00b5\u0015h\t\u009e\u00b2\u00db\u00d7\u00f2?\u00f5q6\u008b/\u00b8<\u009d\u00c1S \u0095\u00f0\u00a5B\t\u00a8\u00ad\u00cc\u0001\u0011\u00c3\u00c4\u00f9N\u00f9,\r\u00d8p\u00e5[\u00f4\u0011\u00ac\u007fD\u001c\u008fe\u0092\u00d8c\u0011v\u008f\u0084Q\u00f2\u0091\u00c2\u00d2\u00af\u00aa\u0014\u0096\u0004\u00e7\u009e_N".length();
                var1_4 = 5;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 44;
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
                    var2_2 = "\u00bcI\u00d8&\u0095\u0084\u00ec\u00d1\u009b8~_\u00fe\u00a9\u00f3\u00fa\u00f0\u008fS\u00b8\u00ae5;\u00fc\u00c2\u00a0\u00cc\u008c\u00ee\u009d\u00cb\u00e7\u00a3\u00da\u00a4\u00de\u009f\u009fk=h\u00b3\u00e0H\u00dc*H\u00f5Q\u00b2c\u00f4\u00c4\u007f\u00e7{\u0091H\u00b1\u001a\u00b8\u00cb[\u001f\u0088\u000f%\u009c\u00ddi)\u00dd\u00d2\u009fD\u00a2q\u00d5\u00b5Q\u00cd\u00a1r\u00bb\u0015\u0015\u00d0L@,7c|+\u00cf\u00ee;R;5\u00e8\u00a36#\u0092l\u00b4\u00cce\u00da\u00c1|H\u001b:\u00e4";
                    var4_3 = "\u00bcI\u00d8&\u0095\u0084\u00ec\u00d1\u009b8~_\u00fe\u00a9\u00f3\u00fa\u00f0\u008fS\u00b8\u00ae5;\u00fc\u00c2\u00a0\u00cc\u008c\u00ee\u009d\u00cb\u00e7\u00a3\u00da\u00a4\u00de\u009f\u009fk=h\u00b3\u00e0H\u00dc*H\u00f5Q\u00b2c\u00f4\u00c4\u007f\u00e7{\u0091H\u00b1\u001a\u00b8\u00cb[\u001f\u0088\u000f%\u009c\u00ddi)\u00dd\u00d2\u009fD\u00a2q\u00d5\u00b5Q\u00cd\u00a1r\u00bb\u0015\u0015\u00d0L@,7c|+\u00cf\u00ee;R;5\u00e8\u00a36#\u0092l\u00b4\u00cce\u00da\u00c1|H\u001b:\u00e4".length();
                    var1_4 = 43;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 109;
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
                            v15 = 35;
                            break;
                        }
                        case 1: {
                            v15 = 101;
                            break;
                        }
                        case 2: {
                            v15 = 14;
                            break;
                        }
                        case 3: {
                            v15 = 113;
                            break;
                        }
                        case 4: {
                            v15 = 103;
                            break;
                        }
                        case 5: {
                            v15 = 42;
                            break;
                        }
                        default: {
                            v15 = 25;
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
        hO.b = var5;
        hO.d = new String[15];
        hO.s = E.Q(hO.class, hO.a(5228, 6243));
        hO.X = Logger.getLogger(hO.class.getName());
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x146F) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 136;
                    break;
                }
                case 1: {
                    n14 = 163;
                    break;
                }
                case 2: {
                    n14 = 217;
                    break;
                }
                case 3: {
                    n14 = 26;
                    break;
                }
                case 4: {
                    n14 = 167;
                    break;
                }
                case 5: {
                    n14 = 101;
                    break;
                }
                case 6: {
                    n14 = 61;
                    break;
                }
                case 7: {
                    n14 = 130;
                    break;
                }
                case 8: {
                    n14 = 161;
                    break;
                }
                case 9: {
                    n14 = 166;
                    break;
                }
                case 10: {
                    n14 = 204;
                    break;
                }
                case 11: {
                    n14 = 254;
                    break;
                }
                case 12: {
                    n14 = 110;
                    break;
                }
                case 13: {
                    n14 = 75;
                    break;
                }
                case 14: {
                    n14 = 120;
                    break;
                }
                case 15: {
                    n14 = 234;
                    break;
                }
                case 16: {
                    n14 = 49;
                    break;
                }
                case 17: {
                    n14 = 174;
                    break;
                }
                case 18: {
                    n14 = 141;
                    break;
                }
                case 19: {
                    n14 = 52;
                    break;
                }
                case 20: {
                    n14 = 135;
                    break;
                }
                case 21: {
                    n14 = 223;
                    break;
                }
                case 22: {
                    n14 = 46;
                    break;
                }
                case 23: {
                    n14 = 3;
                    break;
                }
                case 24: {
                    n14 = 165;
                    break;
                }
                case 25: {
                    n14 = 44;
                    break;
                }
                case 26: {
                    n14 = 176;
                    break;
                }
                case 27: {
                    n14 = 59;
                    break;
                }
                case 28: {
                    n14 = 53;
                    break;
                }
                case 29: {
                    n14 = 37;
                    break;
                }
                case 30: {
                    n14 = 208;
                    break;
                }
                case 31: {
                    n14 = 146;
                    break;
                }
                case 32: {
                    n14 = 40;
                    break;
                }
                case 33: {
                    n14 = 95;
                    break;
                }
                case 34: {
                    n14 = 159;
                    break;
                }
                case 35: {
                    n14 = 121;
                    break;
                }
                case 36: {
                    n14 = 148;
                    break;
                }
                case 37: {
                    n14 = 32;
                    break;
                }
                case 38: {
                    n14 = 124;
                    break;
                }
                case 39: {
                    n14 = 207;
                    break;
                }
                case 40: {
                    n14 = 243;
                    break;
                }
                case 41: {
                    n14 = 85;
                    break;
                }
                case 42: {
                    n14 = 180;
                    break;
                }
                case 43: {
                    n14 = 67;
                    break;
                }
                case 44: {
                    n14 = 233;
                    break;
                }
                case 45: {
                    n14 = 151;
                    break;
                }
                case 46: {
                    n14 = 45;
                    break;
                }
                case 47: {
                    n14 = 222;
                    break;
                }
                case 48: {
                    n14 = 14;
                    break;
                }
                case 49: {
                    n14 = 251;
                    break;
                }
                case 50: {
                    n14 = 54;
                    break;
                }
                case 51: {
                    n14 = 156;
                    break;
                }
                case 52: {
                    n14 = 57;
                    break;
                }
                case 53: {
                    n14 = 249;
                    break;
                }
                case 54: {
                    n14 = 187;
                    break;
                }
                case 55: {
                    n14 = 16;
                    break;
                }
                case 56: {
                    n14 = 239;
                    break;
                }
                case 57: {
                    n14 = 144;
                    break;
                }
                case 58: {
                    n14 = 183;
                    break;
                }
                case 59: {
                    n14 = 214;
                    break;
                }
                case 60: {
                    n14 = 118;
                    break;
                }
                case 61: {
                    n14 = 117;
                    break;
                }
                case 62: {
                    n14 = 186;
                    break;
                }
                case 63: {
                    n14 = 82;
                    break;
                }
                case 64: {
                    n14 = 212;
                    break;
                }
                case 65: {
                    n14 = 83;
                    break;
                }
                case 66: {
                    n14 = 63;
                    break;
                }
                case 67: {
                    n14 = 115;
                    break;
                }
                case 68: {
                    n14 = 84;
                    break;
                }
                case 69: {
                    n14 = 18;
                    break;
                }
                case 70: {
                    n14 = 91;
                    break;
                }
                case 71: {
                    n14 = 219;
                    break;
                }
                case 72: {
                    n14 = 225;
                    break;
                }
                case 73: {
                    n14 = 195;
                    break;
                }
                case 74: {
                    n14 = 28;
                    break;
                }
                case 75: {
                    n14 = 200;
                    break;
                }
                case 76: {
                    n14 = 94;
                    break;
                }
                case 77: {
                    n14 = 24;
                    break;
                }
                case 78: {
                    n14 = 155;
                    break;
                }
                case 79: {
                    n14 = 72;
                    break;
                }
                case 80: {
                    n14 = 71;
                    break;
                }
                case 81: {
                    n14 = 77;
                    break;
                }
                case 82: {
                    n14 = 230;
                    break;
                }
                case 83: {
                    n14 = 111;
                    break;
                }
                case 84: {
                    n14 = 6;
                    break;
                }
                case 85: {
                    n14 = 43;
                    break;
                }
                case 86: {
                    n14 = 210;
                    break;
                }
                case 87: {
                    n14 = 132;
                    break;
                }
                case 88: {
                    n14 = 89;
                    break;
                }
                case 89: {
                    n14 = 123;
                    break;
                }
                case 90: {
                    n14 = 58;
                    break;
                }
                case 91: {
                    n14 = 15;
                    break;
                }
                case 92: {
                    n14 = 248;
                    break;
                }
                case 93: {
                    n14 = 51;
                    break;
                }
                case 94: {
                    n14 = 106;
                    break;
                }
                case 95: {
                    n14 = 227;
                    break;
                }
                case 96: {
                    n14 = 114;
                    break;
                }
                case 97: {
                    n14 = 100;
                    break;
                }
                case 98: {
                    n14 = 139;
                    break;
                }
                case 99: {
                    n14 = 102;
                    break;
                }
                case 100: {
                    n14 = 73;
                    break;
                }
                case 101: {
                    n14 = 9;
                    break;
                }
                case 102: {
                    n14 = 175;
                    break;
                }
                case 103: {
                    n14 = 129;
                    break;
                }
                case 104: {
                    n14 = 198;
                    break;
                }
                case 105: {
                    n14 = 31;
                    break;
                }
                case 106: {
                    n14 = 62;
                    break;
                }
                case 107: {
                    n14 = 41;
                    break;
                }
                case 108: {
                    n14 = 96;
                    break;
                }
                case 109: {
                    n14 = 160;
                    break;
                }
                case 110: {
                    n14 = 188;
                    break;
                }
                case 111: {
                    n14 = 127;
                    break;
                }
                case 112: {
                    n14 = 247;
                    break;
                }
                case 113: {
                    n14 = 74;
                    break;
                }
                case 114: {
                    n14 = 19;
                    break;
                }
                case 115: {
                    n14 = 78;
                    break;
                }
                case 116: {
                    n14 = 226;
                    break;
                }
                case 117: {
                    n14 = 211;
                    break;
                }
                case 118: {
                    n14 = 10;
                    break;
                }
                case 119: {
                    n14 = 48;
                    break;
                }
                case 120: {
                    n14 = 128;
                    break;
                }
                case 121: {
                    n14 = 171;
                    break;
                }
                case 122: {
                    n14 = 11;
                    break;
                }
                case 123: {
                    n14 = 13;
                    break;
                }
                case 124: {
                    n14 = 189;
                    break;
                }
                case 125: {
                    n14 = 116;
                    break;
                }
                case 126: {
                    n14 = 231;
                    break;
                }
                case 127: {
                    n14 = 119;
                    break;
                }
                case 128: {
                    n14 = 30;
                    break;
                }
                case 129: {
                    n14 = 92;
                    break;
                }
                case 130: {
                    n14 = 76;
                    break;
                }
                case 131: {
                    n14 = 64;
                    break;
                }
                case 132: {
                    n14 = 199;
                    break;
                }
                case 133: {
                    n14 = 20;
                    break;
                }
                case 134: {
                    n14 = 36;
                    break;
                }
                case 135: {
                    n14 = 50;
                    break;
                }
                case 136: {
                    n14 = 93;
                    break;
                }
                case 137: {
                    n14 = 0;
                    break;
                }
                case 138: {
                    n14 = 145;
                    break;
                }
                case 139: {
                    n14 = 185;
                    break;
                }
                case 140: {
                    n14 = 140;
                    break;
                }
                case 141: {
                    n14 = 168;
                    break;
                }
                case 142: {
                    n14 = 55;
                    break;
                }
                case 143: {
                    n14 = 35;
                    break;
                }
                case 144: {
                    n14 = 125;
                    break;
                }
                case 145: {
                    n14 = 38;
                    break;
                }
                case 146: {
                    n14 = 33;
                    break;
                }
                case 147: {
                    n14 = 194;
                    break;
                }
                case 148: {
                    n14 = 108;
                    break;
                }
                case 149: {
                    n14 = 104;
                    break;
                }
                case 150: {
                    n14 = 206;
                    break;
                }
                case 151: {
                    n14 = 1;
                    break;
                }
                case 152: {
                    n14 = 143;
                    break;
                }
                case 153: {
                    n14 = 184;
                    break;
                }
                case 154: {
                    n14 = 232;
                    break;
                }
                case 155: {
                    n14 = 253;
                    break;
                }
                case 156: {
                    n14 = 103;
                    break;
                }
                case 157: {
                    n14 = 244;
                    break;
                }
                case 158: {
                    n14 = 42;
                    break;
                }
                case 159: {
                    n14 = 173;
                    break;
                }
                case 160: {
                    n14 = 122;
                    break;
                }
                case 161: {
                    n14 = 215;
                    break;
                }
                case 162: {
                    n14 = 112;
                    break;
                }
                case 163: {
                    n14 = 179;
                    break;
                }
                case 164: {
                    n14 = 131;
                    break;
                }
                case 165: {
                    n14 = 79;
                    break;
                }
                case 166: {
                    n14 = 196;
                    break;
                }
                case 167: {
                    n14 = 88;
                    break;
                }
                case 168: {
                    n14 = 90;
                    break;
                }
                case 169: {
                    n14 = 138;
                    break;
                }
                case 170: {
                    n14 = 39;
                    break;
                }
                case 171: {
                    n14 = 221;
                    break;
                }
                case 172: {
                    n14 = 197;
                    break;
                }
                case 173: {
                    n14 = 12;
                    break;
                }
                case 174: {
                    n14 = 158;
                    break;
                }
                case 175: {
                    n14 = 27;
                    break;
                }
                case 176: {
                    n14 = 172;
                    break;
                }
                case 177: {
                    n14 = 149;
                    break;
                }
                case 178: {
                    n14 = 229;
                    break;
                }
                case 179: {
                    n14 = 65;
                    break;
                }
                case 180: {
                    n14 = 80;
                    break;
                }
                case 181: {
                    n14 = 7;
                    break;
                }
                case 182: {
                    n14 = 8;
                    break;
                }
                case 183: {
                    n14 = 177;
                    break;
                }
                case 184: {
                    n14 = 17;
                    break;
                }
                case 185: {
                    n14 = 4;
                    break;
                }
                case 186: {
                    n14 = 34;
                    break;
                }
                case 187: {
                    n14 = 181;
                    break;
                }
                case 188: {
                    n14 = 23;
                    break;
                }
                case 189: {
                    n14 = 182;
                    break;
                }
                case 190: {
                    n14 = 105;
                    break;
                }
                case 191: {
                    n14 = 235;
                    break;
                }
                case 192: {
                    n14 = 162;
                    break;
                }
                case 193: {
                    n14 = 178;
                    break;
                }
                case 194: {
                    n14 = 242;
                    break;
                }
                case 195: {
                    n14 = 68;
                    break;
                }
                case 196: {
                    n14 = 133;
                    break;
                }
                case 197: {
                    n14 = 147;
                    break;
                }
                case 198: {
                    n14 = 203;
                    break;
                }
                case 199: {
                    n14 = 191;
                    break;
                }
                case 200: {
                    n14 = 126;
                    break;
                }
                case 201: {
                    n14 = 201;
                    break;
                }
                case 202: {
                    n14 = 22;
                    break;
                }
                case 203: {
                    n14 = 154;
                    break;
                }
                case 204: {
                    n14 = 164;
                    break;
                }
                case 205: {
                    n14 = 228;
                    break;
                }
                case 206: {
                    n14 = 213;
                    break;
                }
                case 207: {
                    n14 = 5;
                    break;
                }
                case 208: {
                    n14 = 86;
                    break;
                }
                case 209: {
                    n14 = 2;
                    break;
                }
                case 210: {
                    n14 = 134;
                    break;
                }
                case 211: {
                    n14 = 246;
                    break;
                }
                case 212: {
                    n14 = 245;
                    break;
                }
                case 213: {
                    n14 = 238;
                    break;
                }
                case 214: {
                    n14 = 99;
                    break;
                }
                case 215: {
                    n14 = 169;
                    break;
                }
                case 216: {
                    n14 = 240;
                    break;
                }
                case 217: {
                    n14 = 150;
                    break;
                }
                case 218: {
                    n14 = 69;
                    break;
                }
                case 219: {
                    n14 = 170;
                    break;
                }
                case 220: {
                    n14 = 236;
                    break;
                }
                case 221: {
                    n14 = 237;
                    break;
                }
                case 222: {
                    n14 = 66;
                    break;
                }
                case 223: {
                    n14 = 220;
                    break;
                }
                case 224: {
                    n14 = 216;
                    break;
                }
                case 225: {
                    n14 = 205;
                    break;
                }
                case 226: {
                    n14 = 56;
                    break;
                }
                case 227: {
                    n14 = 98;
                    break;
                }
                case 228: {
                    n14 = 209;
                    break;
                }
                case 229: {
                    n14 = 153;
                    break;
                }
                case 230: {
                    n14 = 47;
                    break;
                }
                case 231: {
                    n14 = 250;
                    break;
                }
                case 232: {
                    n14 = 87;
                    break;
                }
                case 233: {
                    n14 = 137;
                    break;
                }
                case 234: {
                    n14 = 70;
                    break;
                }
                case 235: {
                    n14 = 192;
                    break;
                }
                case 236: {
                    n14 = 193;
                    break;
                }
                case 237: {
                    n14 = 202;
                    break;
                }
                case 238: {
                    n14 = 255;
                    break;
                }
                case 239: {
                    n14 = 21;
                    break;
                }
                case 240: {
                    n14 = 107;
                    break;
                }
                case 241: {
                    n14 = 29;
                    break;
                }
                case 242: {
                    n14 = 97;
                    break;
                }
                case 243: {
                    n14 = 252;
                    break;
                }
                case 244: {
                    n14 = 113;
                    break;
                }
                case 245: {
                    n14 = 81;
                    break;
                }
                case 246: {
                    n14 = 224;
                    break;
                }
                case 247: {
                    n14 = 218;
                    break;
                }
                case 248: {
                    n14 = 157;
                    break;
                }
                case 249: {
                    n14 = 142;
                    break;
                }
                case 250: {
                    n14 = 241;
                    break;
                }
                case 251: {
                    n14 = 152;
                    break;
                }
                case 252: {
                    n14 = 109;
                    break;
                }
                case 253: {
                    n14 = 25;
                    break;
                }
                case 254: {
                    n14 = 190;
                    break;
                }
                default: {
                    n14 = 60;
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
            hO.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

