/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.CN;
import com.EP;
import com.GV;
import com.HI;
import com.IG;
import com.O0;
import com.S7;
import com.ca_1;
import com.da_0;
import com.en_0;
import com.fc_0;
import com.hi_0;
import com.ks_0;
import com.ky_2;
import com.ni_2;
import com.nj_2;
import com.nl_1;
import com.oc_0;
import com.uy_0;
import com.wr_2;
import com.xd_2;
import com.ym_1;
import com.yn_2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Ok
 */
public abstract class ok_0
implements ca_1,
xd_2 {
    public static TimeZone X;
    public static Locale Y;
    public static String Z;
    static final wr_2[] s;
    public static String z;
    public static int h;
    public static int a;
    private static final ConcurrentHashMap A;
    private static final ThreadLocal H;
    private static final ThreadLocal w;
    private static ky_2[] i;
    private static final String[] b;
    private static final String[] c;
    private static final long[] f;
    private static final Integer[] j;

    private static void z(Properties properties) {
        block17: {
            block16: {
                int n10;
                String string;
                block15: {
                    string = properties.getProperty(ok_0.a(22088, -16668));
                    n10 = EP.MapSortField.a();
                    try {
                        if (!ok_0.a(22085, 15788).equals(string)) break block15;
                        a |= n10;
                        break block16;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                }
                try {
                    if (ok_0.a(22082, 23817).equals(string)) {
                        a &= ~n10;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
            }
            try {
                if (ok_0.a(22087, 28665).equals(properties.getProperty(ok_0.a(22089, -14243)))) {
                    h |= ks_0.NonStringKeyAsString.v();
                }
            }
            catch (RuntimeException runtimeException) {
                throw ok_0.a(runtimeException);
            }
            try {
                try {
                    if (!ok_0.a(22087, 28665).equals(properties.getProperty(ok_0.a(22094, 10644))) && !ok_0.a(22087, 28665).equals(properties.getProperty(ok_0.a(22090, 7620)))) break block17;
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
                h |= ks_0.ErrorOnEnumNotMatch.v();
            }
            catch (RuntimeException runtimeException) {
                throw ok_0.a(runtimeException);
            }
        }
        try {
            if (ok_0.a(22083, -31277).equals(properties.getProperty(ok_0.a(22091, -523)))) {
                IG.D.P(false);
                en_0.a.g(false);
            }
        }
        catch (RuntimeException runtimeException) {
            throw ok_0.a(runtimeException);
        }
    }

    public static void W(String string) {
        Z = string;
        IG.D.q.U(string, 0, string.length(), string.hashCode(), true);
    }

    public static Object X(String string) {
        return ok_0.E(string, h);
    }

    public static Object q(String string, IG iG) {
        return ok_0.Z(string, iG, h);
    }

    public static Object l(String string, IG iG, ks_0[] ks_0Array) {
        Object object2;
        block2: {
            int n10 = h;
            String string2 = hi_0.C();
            for (Object object2 : ks_0Array) {
                if (string2 == null) {
                    Object object3 = object2;
                    n10 = ks_0.H(n10, object3, true);
                    if (string2 == null) continue;
                }
                break block2;
            }
            object2 = ok_0.Z(string, iG, n10);
        }
        return object2;
    }

    public static Object Z(String string, IG iG, int n10) {
        try {
            if (string == null) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ok_0.a(runtimeException);
        }
        yn_2 yn_22 = new yn_2(string, iG, n10);
        Object object = yn_22.M();
        yn_22.Y(object);
        yn_22.close();
        return object;
    }

    public static Object E(String string, int n10) {
        return ok_0.Z(string, IG.G(), n10);
    }

    public static Object T(byte[] byArray, ks_0[] ks_0Array) {
        char[] cArray = ok_0.O(byArray.length);
        int n10 = S7.U(byArray, 0, byArray.length, cArray);
        try {
            if (n10 < 0) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ok_0.a(runtimeException);
        }
        return ok_0.C(new String(cArray, 0, n10), ks_0Array);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object g(byte[] byArray, int n10, int n11, CharsetDecoder charsetDecoder, ks_0[] ks_0Array) {
        Object object2;
        int n12;
        String string;
        block8: {
            block9: {
                byte[] byArray2;
                block7: {
                    string = hi_0.C();
                    try {
                        byArray2 = byArray;
                        if (string != null) break block7;
                        if (byArray2 == null) return null;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                    byArray2 = byArray;
                }
                try {
                    try {
                        n12 = byArray2.length;
                        if (string != null) break block8;
                        if (n12 != 0) break block9;
                        return null;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
            }
            n12 = h;
        }
        int n13 = n12;
        for (Object object2 : ks_0Array) {
            if (string != null) return object2;
            ks_0 ks_02 = object2;
            n13 = ks_0.H(n13, ks_02, true);
            if (string == null) continue;
        }
        object2 = ok_0.L(byArray, n10, n11, charsetDecoder, n13);
        return object2;
    }

    public static Object L(byte[] byArray, int n10, int n11, CharsetDecoder charsetDecoder, int n12) {
        charsetDecoder.reset();
        int n13 = (int)((double)n11 * (double)charsetDecoder.maxCharsPerByte());
        char[] cArray = ok_0.O(n13);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray, n10, n11);
        CharBuffer charBuffer = CharBuffer.wrap(cArray);
        S7.a(charsetDecoder, byteBuffer, charBuffer);
        int n14 = charBuffer.position();
        yn_2 yn_22 = new yn_2(cArray, n14, IG.G(), n12);
        Object object = yn_22.M();
        yn_22.Y(object);
        yn_22.close();
        return object;
    }

    public static Object C(String string, ks_0[] ks_0Array) {
        Object object2;
        block2: {
            int n10 = h;
            String string2 = hi_0.C();
            for (Object object2 : ks_0Array) {
                if (string2 == null) {
                    Object object3 = object2;
                    n10 = ks_0.H(n10, object3, true);
                    if (string2 == null) continue;
                }
                break block2;
            }
            object2 = ok_0.E(string, n10);
        }
        return object2;
    }

    public static O0 J(String string, ks_0[] ks_0Array) {
        return (O0)ok_0.C(string, ks_0Array);
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static O0 y(String string) {
        Object object;
        Object object2;
        block6: {
            object2 = ok_0.X(string);
            String string2 = hi_0.C();
            object = object2;
            if (string2 != null) return (O0)object;
            try {
                if (!(object instanceof O0)) break block6;
                return (O0)object2;
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
            }
            catch (RuntimeException runtimeException) {
                throw ok_0.a(runtimeException);
            }
        }
        try {
            object = ok_0.b(object2);
            return (O0)object;
        }
        catch (RuntimeException runtimeException) {
            throw new hi_0(ok_0.a(22084, -24661), runtimeException);
        }
    }

    public static Object G(String string, HI hI2, ks_0[] ks_0Array) {
        return ok_0.Z(string, hI2.I, IG.D, h, ks_0Array);
    }

    public static Object I(String string, Class clazz, ks_0[] ks_0Array) {
        return ok_0.X(string, clazz, IG.D, null, h, ks_0Array);
    }

    public static Object R(String string, Class clazz, fc_0 fc_02, ks_0[] ks_0Array) {
        return ok_0.X(string, clazz, IG.D, fc_02, h, ks_0Array);
    }

    public static Object B(String string, Type type, ks_0[] ks_0Array) {
        return ok_0.Z(string, type, IG.D, h, ks_0Array);
    }

    public static Object S(String string, Type type, fc_0 fc_02, ks_0[] ks_0Array) {
        return ok_0.X(string, type, IG.D, fc_02, h, ks_0Array);
    }

    public static Object F(String string, Type type, int n10, ks_0[] ks_0Array) {
        String string2 = hi_0.C();
        try {
            if (string == null) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ok_0.a(runtimeException);
        }
        for (ks_0 ks_02 : ks_0Array) {
            n10 = ks_0.H(n10, ks_02, true);
            if (string2 == null) continue;
        }
        yn_2 yn_22 = new yn_2(string, IG.G(), n10);
        Object object = yn_22.o(type);
        yn_22.Y(object);
        yn_22.close();
        return object;
    }

    public static Object w(String string, Type type, IG iG, ks_0[] ks_0Array) {
        return ok_0.X(string, type, iG, null, h, ks_0Array);
    }

    public static Object Z(String string, Type type, IG iG, int n10, ks_0[] ks_0Array) {
        return ok_0.X(string, type, iG, null, n10, ks_0Array);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object X(String string, Type type, IG iG, fc_0 fc_02, int n10, ks_0[] ks_0Array) {
        Object object;
        yn_2 yn_22;
        block28: {
            block29: {
                boolean bl;
                block32: {
                    String string2;
                    block33: {
                        block30: {
                            block31: {
                                block27: {
                                    ks_0[] ks_0Array2;
                                    block26: {
                                        String string3;
                                        block25: {
                                            string2 = hi_0.C();
                                            try {
                                                string3 = string;
                                                if (string2 != null) break block25;
                                                if (string3 == null) return null;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw ok_0.a(runtimeException);
                                            }
                                            string3 = string;
                                        }
                                        try {
                                            if (string3.length() == 0) {
                                                return null;
                                            }
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw ok_0.a(runtimeException);
                                        }
                                        try {
                                            ks_0Array2 = ks_0Array;
                                            if (string2 != null) break block26;
                                            if (ks_0Array2 == null) break block27;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw ok_0.a(runtimeException);
                                        }
                                        ks_0Array2 = ks_0Array;
                                    }
                                    for (ks_0 ks_02 : ks_0Array2) {
                                        n10 |= ks_02.mask;
                                        if (string2 == null) continue;
                                    }
                                }
                                yn_22 = new yn_2(string, iG, n10);
                                try {
                                    try {
                                        try {
                                            try {
                                                object = fc_02;
                                                if (string2 != null) break block28;
                                                if (object == null) break block29;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw ok_0.a(runtimeException);
                                            }
                                            bl = fc_02 instanceof da_0;
                                            if (string2 != null) break block30;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw ok_0.a(runtimeException);
                                        }
                                        if (!bl) break block31;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw ok_0.a(runtimeException);
                                    }
                                    yn_22.Q().add((da_0)fc_02);
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ok_0.a(runtimeException);
                                }
                            }
                            bl = fc_02 instanceof GV;
                        }
                        try {
                            try {
                                if (string2 != null) break block32;
                                if (!bl) break block33;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ok_0.a(runtimeException);
                            }
                            yn_22.l().add((GV)fc_02);
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                    }
                    try {
                        object = fc_02;
                        if (string2 != null) break block28;
                        bl = object instanceof ni_2;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                }
                try {
                    if (bl) {
                        yn_22.E((ni_2)fc_02);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
            }
            object = yn_22.r(type, null);
        }
        fc_0 fc_03 = object;
        yn_22.Y(fc_03);
        yn_22.close();
        return fc_03;
    }

    public static Object l(byte[] byArray, Type type, ks_0[] ks_0Array) {
        return ok_0.r(byArray, 0, byArray.length, S7.v, type, ks_0Array);
    }

    public static Object r(byte[] byArray, int n10, int n11, Charset charset, Type type, ks_0[] ks_0Array) {
        return ok_0.L(byArray, n10, n11, charset, type, IG.D, null, h, ks_0Array);
    }

    public static Object A(byte[] byArray, Charset charset, Type type, IG iG, fc_0 fc_02, int n10, ks_0[] ks_0Array) {
        return ok_0.L(byArray, 0, byArray.length, charset, type, iG, fc_02, n10, ks_0Array);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Object L(byte[] byArray, int n10, int n11, Charset charset, Type type, IG iG, fc_0 fc_02, int n12, ks_0[] ks_0Array) {
        String string;
        block29: {
            String string2;
            block24: {
                Charset charset2;
                block23: {
                    string2 = hi_0.C();
                    try {
                        charset2 = charset;
                        if (string2 != null) break block23;
                        if (charset2 != null) break block24;
                    }
                    catch (Exception exception) {
                        throw ok_0.a(exception);
                    }
                    charset2 = S7.v;
                }
                charset = charset2;
            }
            string = null;
            if (charset == S7.v) {
                String string3;
                block28: {
                    int n13;
                    char[] cArray;
                    block26: {
                        block27: {
                            cArray = ok_0.O(byArray.length);
                            n13 = S7.U(byArray, n10, n11, cArray);
                            if (n13 < 0) {
                                InputStreamReader inputStreamReader = null;
                                try {
                                    inputStreamReader = new InputStreamReader((InputStream)new GZIPInputStream(new ByteArrayInputStream(byArray, n10, n11)), ok_0.a(22081, 19135));
                                    string = S7.G(inputStreamReader);
                                    S7.o(inputStreamReader);
                                }
                                catch (Exception exception) {
                                    Object var15_15 = null;
                                    return var15_15;
                                }
                                finally {
                                    S7.o(inputStreamReader);
                                }
                            }
                            try {
                                try {
                                    try {
                                        string3 = string;
                                        if (string2 != null) break block26;
                                        if (string3 != null) break block27;
                                    }
                                    catch (Exception exception) {
                                        throw ok_0.a(exception);
                                    }
                                    if (n13 >= 0) break block27;
                                }
                                catch (Exception exception) {
                                    throw ok_0.a(exception);
                                }
                                return null;
                            }
                            catch (Exception exception) {
                                throw ok_0.a(exception);
                            }
                        }
                        string3 = string;
                    }
                    try {
                        try {
                            if (string2 != null) break block28;
                            if (string3 != null) break block29;
                        }
                        catch (Exception exception) {
                            throw ok_0.a(exception);
                        }
                        string3 = new String(cArray, 0, n13);
                    }
                    catch (Exception exception) {
                        throw ok_0.a(exception);
                    }
                }
                string = string3;
            } else {
                try {
                    if (n11 < 0) {
                        return null;
                    }
                }
                catch (Exception exception) {
                    throw ok_0.a(exception);
                }
                string = new String(byArray, n10, n11, charset);
            }
        }
        return ok_0.X(string, type, iG, fc_02, n12, ks_0Array);
    }

    public static Object F(byte[] byArray, int n10, int n11, CharsetDecoder charsetDecoder, Type type, ks_0[] ks_0Array) {
        charsetDecoder.reset();
        int n12 = (int)((double)n11 * (double)charsetDecoder.maxCharsPerByte());
        char[] cArray = ok_0.O(n12);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray, n10, n11);
        CharBuffer charBuffer = CharBuffer.wrap(cArray);
        S7.a(charsetDecoder, byteBuffer, charBuffer);
        int n13 = charBuffer.position();
        return ok_0.r(cArray, n13, type, ks_0Array);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object r(char[] cArray, int n10, Type type, ks_0[] ks_0Array) {
        int n11;
        String string;
        block8: {
            block9: {
                char[] cArray2;
                block7: {
                    string = hi_0.C();
                    try {
                        cArray2 = cArray;
                        if (string != null) break block7;
                        if (cArray2 == null) return null;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                    cArray2 = cArray;
                }
                try {
                    try {
                        n11 = cArray2.length;
                        if (string != null) break block8;
                        if (n11 != 0) break block9;
                        return null;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
            }
            n11 = h;
        }
        int n12 = n11;
        for (ks_0 ks_02 : ks_0Array) {
            n12 = ks_0.H(n12, ks_02, true);
            if (string == null) continue;
        }
        yn_2 yn_22 = new yn_2(cArray, n10, IG.G(), n12);
        Object object = yn_22.o(type);
        yn_22.Y(object);
        yn_22.close();
        return object;
    }

    public static Object c(InputStream inputStream, Type type, ks_0[] ks_0Array) throws IOException {
        return ok_0.a(inputStream, S7.v, type, ks_0Array);
    }

    public static Object a(InputStream inputStream, Charset charset, Type type, ks_0[] ks_0Array) throws IOException {
        return ok_0.K(inputStream, charset, type, IG.D, ks_0Array);
    }

    public static Object K(InputStream inputStream, Charset charset, Type type, IG iG, ks_0[] ks_0Array) throws IOException {
        return ok_0.A(inputStream, charset, type, iG, null, h, ks_0Array);
    }

    public static Object A(InputStream inputStream, Charset charset, Type type, IG iG, fc_0 fc_02, int n10, ks_0[] ks_0Array) throws IOException {
        String string;
        block11: {
            Charset charset2;
            block10: {
                string = hi_0.C();
                try {
                    charset2 = charset;
                    if (string != null) break block10;
                    if (charset2 != null) break block11;
                }
                catch (IOException iOException) {
                    throw ok_0.a(iOException);
                }
                charset2 = S7.v;
            }
            charset = charset2;
        }
        byte[] byArray = ok_0.K(ok_0.a(4340, 6658045543267204732L));
        int n11 = 0;
        do {
            int n12;
            int n13;
            block13: {
                block12: {
                    int n14;
                    if ((n14 = inputStream.read(byArray, n11, byArray.length - n11)) == -1) {
                        try {
                            if (string != null) break block12;
                            if (string == null) break;
                        }
                        catch (IOException iOException) {
                            throw ok_0.a(iOException);
                        }
                    }
                    n11 += n14;
                }
                try {
                    try {
                        n13 = n11;
                        n12 = byArray.length;
                        if (string != null) break block13;
                        if (n13 != n12) continue;
                    }
                    catch (IOException iOException) {
                        throw ok_0.a(iOException);
                    }
                    n13 = byArray.length * 3;
                    n12 = 2;
                }
                catch (IOException iOException) {
                    throw ok_0.a(iOException);
                }
            }
            byte[] byArray2 = new byte[n13 / n12];
            System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
            byArray = byArray2;
        } while (string == null);
        return ok_0.L(byArray, 0, n11, charset, type, iG, fc_02, n10, ks_0Array);
    }

    public static Object n(String string, Class clazz) {
        return ok_0.I(string, clazz, new ks_0[0]);
    }

    public static oc_0 D(String string) {
        return ok_0.f(string, IG.D);
    }

    /*
     * Unable to fully structure code
     */
    public static oc_0 f(String var0, IG var1_1) {
        block19: {
            block21: {
                block20: {
                    block18: {
                        var2_2 = hi_0.C();
                        try {
                            if (var0 == null) {
                                return null;
                            }
                        }
                        catch (RuntimeException v0) {
                            throw ok_0.a(v0);
                        }
                        var3_3 = new yn_2(var0, var1_1);
                        var5_4 = var3_3.N;
                        try {
                            v1 = var5_4.P();
                            v2 = ok_0.a(12087, 4365792771298181563L);
                            if (var2_2 != null) break block18;
                            if (v1 == v2) {
                            }
                            ** GOTO lbl24
                        }
                        catch (RuntimeException v3) {
                            throw ok_0.a(v3);
                        }
                        var5_4.K();
                        var4_5 = null;
                        try {
                            try {
                                if (var2_2 == null) break block19;
lbl24:
                                // 2 sources

                                v1 = var5_4.P();
                                if (var2_2 != null) break block20;
                            }
                            catch (RuntimeException v4) {
                                throw ok_0.a(v4);
                            }
                            v2 = ok_0.a(1511, 1011378586708601696L);
                        }
                        catch (RuntimeException v5) {
                            throw ok_0.a(v5);
                        }
                    }
                    try {
                        if (v1 != v2) break block21;
                        v1 = (int)var5_4.k();
                    }
                    catch (RuntimeException v6) {
                        throw ok_0.a(v6);
                    }
                }
                if (v1 == 0) break block21;
                var4_5 = null;
                if (var2_2 == null) break block19;
            }
            var4_5 = new oc_0();
            var3_3.B(var4_5);
            var3_3.Y(var4_5);
        }
        var3_3.close();
        return var4_5;
    }

    public static List o(String string, Class clazz) {
        return ok_0.u(string, clazz, IG.D);
    }

    /*
     * Unable to fully structure code
     */
    public static List u(String var0, Class var1_1, IG var2_2) {
        block19: {
            block21: {
                block20: {
                    block18: {
                        var3_3 = hi_0.C();
                        try {
                            if (var0 == null) {
                                return null;
                            }
                        }
                        catch (RuntimeException v0) {
                            throw ok_0.a(v0);
                        }
                        var5_4 = new yn_2(var0, var2_2);
                        var6_5 = var5_4.N;
                        var7_6 = var6_5.P();
                        try {
                            v1 = var7_6;
                            v2 = ok_0.a(21192, 6954785655616781381L);
                            if (var3_3 != null) break block18;
                            if (v1 == v2) {
                            }
                            ** GOTO lbl25
                        }
                        catch (RuntimeException v3) {
                            throw ok_0.a(v3);
                        }
                        var6_5.K();
                        var4_7 = null;
                        try {
                            try {
                                if (var3_3 == null) break block19;
lbl25:
                                // 2 sources

                                v1 = var7_6;
                                if (var3_3 != null) break block20;
                            }
                            catch (RuntimeException v4) {
                                throw ok_0.a(v4);
                            }
                            v2 = ok_0.a(1511, 1011378586708601696L);
                        }
                        catch (RuntimeException v5) {
                            throw ok_0.a(v5);
                        }
                    }
                    try {
                        if (v1 != v2) break block21;
                        v1 = (int)var6_5.k();
                    }
                    catch (RuntimeException v6) {
                        throw ok_0.a(v6);
                    }
                }
                if (v1 == 0) break block21;
                var4_7 = null;
                if (var3_3 == null) break block19;
            }
            var4_7 = new ArrayList<E>();
            var5_4.s(var1_1, var4_7);
            var5_4.Y(var4_7);
        }
        var5_4.close();
        return var4_7;
    }

    public static List B(String string, Type[] typeArray) {
        return ok_0.V(string, typeArray, IG.D);
    }

    /*
     * Unable to fully structure code
     */
    public static List V(String var0, Type[] var1_1, IG var2_2) {
        block9: {
            block8: {
                var3_3 = hi_0.C();
                try {
                    if (var0 == null) {
                        return null;
                    }
                }
                catch (RuntimeException v0) {
                    throw ok_0.a(v0);
                }
                var5_4 = new yn_2(var0, var2_2);
                var6_5 = var5_4.h(var1_1);
                try {
                    v1 = var6_5;
                    if (var3_3 != null) break block8;
                    if (v1 == null) {
                    }
                    ** GOTO lbl21
                }
                catch (RuntimeException v2) {
                    throw ok_0.a(v2);
                }
                var4_6 = null;
                try {
                    if (var3_3 == null) break block9;
lbl21:
                    // 2 sources

                    v1 = var6_5;
                }
                catch (RuntimeException v3) {
                    throw ok_0.a(v3);
                }
            }
            var4_6 = Arrays.asList(v1);
        }
        var5_4.Y(var4_6);
        var5_4.close();
        return var4_6;
    }

    public static String x(Object object) {
        return ok_0.G(object, s, new EP[0]);
    }

    public static String i(Object object, EP[] ePArray) {
        return ok_0.z(object, a, ePArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static String z(Object object, int n10, EP[] ePArray) {
        String string = hi_0.C();
        try (ym_1 ym_12 = new ym_1(null, n10, ePArray);){
            String string2;
            block19: {
                String string3;
                block18: {
                    boolean bl;
                    int n11;
                    block20: {
                        block23: {
                            int n12;
                            block17: {
                                block21: {
                                    nl_1 nl_12 = new nl_1(ym_12);
                                    nl_12.B(object);
                                    string3 = ym_12.toString();
                                    n11 = string3.length();
                                    n12 = n11;
                                    if (string != null) break block17;
                                    if (n12 <= 0) break block18;
                                    break block21;
                                    catch (RuntimeException runtimeException) {
                                        throw ok_0.a(runtimeException);
                                    }
                                }
                                try {
                                    block22: {
                                        string2 = string3;
                                        if (string != null) break block19;
                                        break block22;
                                        catch (RuntimeException runtimeException) {
                                            throw ok_0.a(runtimeException);
                                        }
                                    }
                                    n12 = string2.charAt(n11 - 1);
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ok_0.a(runtimeException);
                                }
                            }
                            if (n12 != ok_0.a(14220, 3738329768231262474L)) break block18;
                            bl = object instanceof Number;
                            if (string != null) break block20;
                            break block23;
                            catch (RuntimeException runtimeException) {
                                throw ok_0.a(runtimeException);
                            }
                        }
                        try {
                            block24: {
                                if (!bl) break block18;
                                break block24;
                                catch (RuntimeException runtimeException) {
                                    throw ok_0.a(runtimeException);
                                }
                            }
                            bl = ym_12.I(EP.WriteClassName);
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                    }
                    if (!bl) {
                        String string4 = string3.substring(0, n11 - 1);
                        return string4;
                    }
                }
                string2 = string3;
            }
            String string5 = string2;
            return string5;
        }
    }

    public static String D(Object object, String string, EP[] ePArray) {
        return ok_0.D(object, en_0.a, null, string, a, ePArray);
    }

    public static String N(Object object, wr_2 wr_22, EP[] ePArray) {
        return ok_0.D(object, en_0.a, new wr_2[]{wr_22}, null, a, ePArray);
    }

    public static String G(Object object, wr_2[] wr_2Array, EP[] ePArray) {
        return ok_0.D(object, en_0.a, wr_2Array, null, a, ePArray);
    }

    public static byte[] Y(Object object, EP[] ePArray) {
        return ok_0.p(object, a, ePArray);
    }

    public static byte[] Q(Object object, wr_2 wr_22, EP[] ePArray) {
        return ok_0.h(object, en_0.a, new wr_2[]{wr_22}, a, ePArray);
    }

    public static byte[] p(Object object, int n10, EP[] ePArray) {
        return ok_0.L(object, en_0.a, n10, ePArray);
    }

    public static String K(Object object, en_0 en_02, EP[] ePArray) {
        return ok_0.J(object, en_02, null, ePArray);
    }

    public static String J(Object object, en_0 en_02, wr_2 wr_22, EP[] ePArray) {
        return ok_0.D(object, en_02, new wr_2[]{wr_22}, null, a, ePArray);
    }

    public static String y(Object object, en_0 en_02, wr_2[] wr_2Array, EP[] ePArray) {
        return ok_0.D(object, en_02, wr_2Array, null, a, ePArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String D(Object object, en_0 en_02, wr_2[] wr_2Array, String string, int n10, EP[] ePArray) {
        String string2 = hi_0.C();
        try (ym_1 ym_12 = new ym_1(null, n10, ePArray);){
            block18: {
                nl_1 nl_12;
                block17: {
                    wr_2[] wr_2Array2;
                    block16: {
                        block15: {
                            String string3;
                            block14: {
                                nl_12 = new nl_1(ym_12, en_02);
                                try {
                                    string3 = string;
                                    if (string2 != null) break block14;
                                    if (string3 == null) break block15;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ok_0.a(runtimeException);
                                }
                                string3 = string;
                            }
                            try {
                                if (string3.length() != 0) {
                                    nl_12.W(string);
                                    nl_12.D(EP.WriteDateUseDateFormat, true);
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                throw ok_0.a(runtimeException);
                            }
                        }
                        try {
                            wr_2Array2 = wr_2Array;
                            if (string2 != null) break block16;
                            if (wr_2Array2 == null) break block17;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                        wr_2Array2 = wr_2Array;
                    }
                    for (wr_2 wr_22 : wr_2Array2) {
                        try {
                            nl_12.a(wr_22);
                            if (string2 == null) {
                                if (string2 == null) continue;
                                break;
                            }
                            break block18;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                    }
                }
                nl_12.B(object);
            }
            String string4 = ym_12.toString();
            return string4;
        }
    }

    public static String n(Object object, en_0 en_02, EP[] ePArray) {
        return ok_0.D(object, en_02, s, null, 0, ePArray);
    }

    public static byte[] g(Object object, en_0 en_02, EP[] ePArray) {
        return ok_0.h(object, en_02, s, a, ePArray);
    }

    public static byte[] L(Object object, en_0 en_02, int n10, EP[] ePArray) {
        return ok_0.h(object, en_02, s, n10, ePArray);
    }

    public static byte[] o(Object object, wr_2[] wr_2Array, EP[] ePArray) {
        return ok_0.h(object, en_0.a, wr_2Array, a, ePArray);
    }

    public static byte[] k(Object object, en_0 en_02, wr_2 wr_22, EP[] ePArray) {
        return ok_0.h(object, en_02, new wr_2[]{wr_22}, a, ePArray);
    }

    public static byte[] h(Object object, en_0 en_02, wr_2[] wr_2Array, int n10, EP[] ePArray) {
        return ok_0.t(object, en_02, wr_2Array, null, n10, ePArray);
    }

    public static byte[] t(Object object, en_0 en_02, wr_2[] wr_2Array, String string, int n10, EP[] ePArray) {
        return ok_0.d(S7.v, object, en_02, wr_2Array, string, n10, ePArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] d(Charset charset, Object object, en_0 en_02, wr_2[] wr_2Array, String string, int n10, EP[] ePArray) {
        String string2 = hi_0.C();
        try (ym_1 ym_12 = new ym_1(null, n10, ePArray);){
            block18: {
                nl_1 nl_12;
                block17: {
                    wr_2[] wr_2Array2;
                    block16: {
                        block15: {
                            String string3;
                            block14: {
                                nl_12 = new nl_1(ym_12, en_02);
                                try {
                                    string3 = string;
                                    if (string2 != null) break block14;
                                    if (string3 == null) break block15;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ok_0.a(runtimeException);
                                }
                                string3 = string;
                            }
                            try {
                                if (string3.length() != 0) {
                                    nl_12.W(string);
                                    nl_12.D(EP.WriteDateUseDateFormat, true);
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                throw ok_0.a(runtimeException);
                            }
                        }
                        try {
                            wr_2Array2 = wr_2Array;
                            if (string2 != null) break block16;
                            if (wr_2Array2 == null) break block17;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                        wr_2Array2 = wr_2Array;
                    }
                    for (wr_2 wr_22 : wr_2Array2) {
                        try {
                            nl_12.a(wr_22);
                            if (string2 == null) {
                                if (string2 == null) continue;
                                break;
                            }
                            break block18;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                    }
                }
                nl_12.B(object);
            }
            byte[] byArray = ym_12.f(charset);
            return byArray;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] t(Charset charset, Object object, en_0 en_02, wr_2[] wr_2Array, String string, int n10, EP[] ePArray) {
        String string2 = hi_0.C();
        try (ym_1 ym_12 = new ym_1(null, n10, ePArray);){
            block18: {
                nl_1 nl_12;
                block17: {
                    wr_2[] wr_2Array2;
                    block16: {
                        block15: {
                            String string3;
                            block14: {
                                nl_12 = new nl_1(ym_12, en_02);
                                try {
                                    string3 = string;
                                    if (string2 != null) break block14;
                                    if (string3 == null) break block15;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw ok_0.a(runtimeException);
                                }
                                string3 = string;
                            }
                            try {
                                if (string3.length() != 0) {
                                    nl_12.Q(string);
                                    nl_12.D(EP.WriteDateUseDateFormat, true);
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                throw ok_0.a(runtimeException);
                            }
                        }
                        try {
                            wr_2Array2 = wr_2Array;
                            if (string2 != null) break block16;
                            if (wr_2Array2 == null) break block17;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                        wr_2Array2 = wr_2Array;
                    }
                    for (wr_2 wr_22 : wr_2Array2) {
                        try {
                            nl_12.a(wr_22);
                            if (string2 == null) {
                                if (string2 == null) continue;
                                break;
                            }
                            break block18;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                    }
                }
                nl_12.B(object);
            }
            byte[] byArray = ym_12.f(charset);
            return byArray;
        }
    }

    public static String b(Object object, boolean bl) {
        try {
            if (!bl) {
                return ok_0.x(object);
            }
        }
        catch (RuntimeException runtimeException) {
            throw ok_0.a(runtimeException);
        }
        return ok_0.i(object, new EP[]{EP.PrettyFormat});
    }

    public static void T(Object object, Writer writer, EP[] ePArray) {
        ok_0.v(writer, object, ePArray);
    }

    public static void v(Writer writer, Object object, EP[] ePArray) {
        ok_0.u(writer, object, a, ePArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void u(Writer writer, Object object, int n10, EP[] ePArray) {
        try (ym_1 ym_12 = new ym_1(writer, n10, ePArray);){
            nl_1 nl_12 = new nl_1(ym_12);
            nl_12.B(object);
        }
    }

    public static final int O(OutputStream outputStream, Object object, EP[] ePArray) throws IOException {
        return ok_0.k(outputStream, object, a, ePArray);
    }

    public static final int k(OutputStream outputStream, Object object, int n10, EP[] ePArray) throws IOException {
        return ok_0.R(outputStream, S7.v, object, en_0.a, null, null, n10, ePArray);
    }

    public static final int S(OutputStream outputStream, Charset charset, Object object, EP[] ePArray) throws IOException {
        return ok_0.R(outputStream, charset, object, en_0.a, null, null, a, ePArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final int R(OutputStream outputStream, Charset charset, Object object, en_0 en_02, wr_2[] wr_2Array, String string, int n10, EP[] ePArray) throws IOException {
        String string2 = hi_0.C();
        try (ym_1 ym_12 = new ym_1(null, n10, ePArray);){
            int n11;
            block18: {
                nl_1 nl_12;
                block17: {
                    wr_2[] wr_2Array2;
                    block16: {
                        block15: {
                            String string3;
                            block14: {
                                nl_12 = new nl_1(ym_12, en_02);
                                try {
                                    string3 = string;
                                    if (string2 != null) break block14;
                                    if (string3 == null) break block15;
                                }
                                catch (IOException iOException) {
                                    throw ok_0.a(iOException);
                                }
                                string3 = string;
                            }
                            try {
                                if (string3.length() != 0) {
                                    nl_12.W(string);
                                    nl_12.D(EP.WriteDateUseDateFormat, true);
                                }
                            }
                            catch (IOException iOException) {
                                throw ok_0.a(iOException);
                            }
                        }
                        try {
                            wr_2Array2 = wr_2Array;
                            if (string2 != null) break block16;
                            if (wr_2Array2 == null) break block17;
                        }
                        catch (IOException iOException) {
                            throw ok_0.a(iOException);
                        }
                        wr_2Array2 = wr_2Array;
                    }
                    for (wr_2 wr_22 : wr_2Array2) {
                        try {
                            nl_12.a(wr_22);
                            if (string2 == null) {
                                if (string2 == null) continue;
                                break;
                            }
                            break block18;
                        }
                        catch (IOException iOException) {
                            throw ok_0.a(iOException);
                        }
                    }
                }
                nl_12.B(object);
            }
            int n12 = n11 = ym_12.c(outputStream, charset);
            return n12;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final int x(OutputStream outputStream, Charset charset, Object object, en_0 en_02, wr_2[] wr_2Array, String string, int n10, EP[] ePArray) throws IOException {
        String string2 = hi_0.C();
        try (ym_1 ym_12 = new ym_1(null, n10, ePArray);){
            int n11;
            block18: {
                nl_1 nl_12;
                block17: {
                    wr_2[] wr_2Array2;
                    block16: {
                        block15: {
                            String string3;
                            block14: {
                                nl_12 = new nl_1(ym_12, en_02);
                                try {
                                    string3 = string;
                                    if (string2 != null) break block14;
                                    if (string3 == null) break block15;
                                }
                                catch (IOException iOException) {
                                    throw ok_0.a(iOException);
                                }
                                string3 = string;
                            }
                            try {
                                if (string3.length() != 0) {
                                    nl_12.Q(string);
                                    nl_12.D(EP.WriteDateUseDateFormat, true);
                                }
                            }
                            catch (IOException iOException) {
                                throw ok_0.a(iOException);
                            }
                        }
                        try {
                            wr_2Array2 = wr_2Array;
                            if (string2 != null) break block16;
                            if (wr_2Array2 == null) break block17;
                        }
                        catch (IOException iOException) {
                            throw ok_0.a(iOException);
                        }
                        wr_2Array2 = wr_2Array;
                    }
                    for (wr_2 wr_22 : wr_2Array2) {
                        try {
                            nl_12.a(wr_22);
                            if (string2 == null) {
                                if (string2 == null) continue;
                                break;
                            }
                            break block18;
                        }
                        catch (IOException iOException) {
                            throw ok_0.a(iOException);
                        }
                    }
                }
                nl_12.B(object);
            }
            int n12 = n11 = ym_12.c(outputStream, charset);
            return n12;
        }
    }

    public String toString() {
        return this.V();
    }

    @Override
    public String V() {
        try (ym_1 ym_12 = new ym_1();){
            new nl_1(ym_12).B(this);
            String string = ym_12.toString();
            return string;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String y(EP[] ePArray) {
        try (ym_1 ym_12 = new ym_1(null, a, ePArray);){
            new nl_1(ym_12).B(this);
            String string = ym_12.toString();
            return string;
        }
    }

    @Override
    public void M(Appendable appendable) {
        try (ym_1 ym_12 = new ym_1();){
            new nl_1(ym_12).B(this);
            appendable.append(ym_12.toString());
        }
    }

    public static Object b(Object object) {
        return ok_0.l(object, en_0.a);
    }

    public static Object M(Object object, IG iG) {
        return ok_0.l(object, en_0.a);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object l(Object var0, en_0 var1_1) {
        block72: {
            block73: {
                block75: {
                    block74: {
                        block70: {
                            block71: {
                                block68: {
                                    block69: {
                                        block67: {
                                            block65: {
                                                block66: {
                                                    block61: {
                                                        block62: {
                                                            block64: {
                                                                block78: {
                                                                    block63: {
                                                                        block59: {
                                                                            block60: {
                                                                                block57: {
                                                                                    block58: {
                                                                                        var2_2 = hi_0.C();
                                                                                        v0 = var0;
                                                                                        if (var2_2 != null) break block57;
                                                                                        try {
                                                                                            if (v0 != null) break block58;
                                                                                            return null;
                                                                                            catch (Exception v1) {
                                                                                                throw ok_0.a(v1);
                                                                                            }
                                                                                        }
                                                                                        catch (Exception v2) {
                                                                                            throw ok_0.a(v2);
                                                                                        }
                                                                                    }
                                                                                    v0 = var0;
                                                                                }
                                                                                v3 = v0 instanceof ok_0;
                                                                                if (var2_2 != null) break block59;
                                                                                try {
                                                                                    if (!v3) break block60;
                                                                                    return var0;
                                                                                    catch (Exception v4) {
                                                                                        throw ok_0.a(v4);
                                                                                    }
                                                                                }
                                                                                catch (Exception v5) {
                                                                                    throw ok_0.a(v5);
                                                                                }
                                                                            }
                                                                            v3 = var0 instanceof Map;
                                                                        }
                                                                        try {
                                                                            if (var2_2 != null) break block61;
                                                                            if (!v3) break block62;
                                                                        }
                                                                        catch (Exception v6) {
                                                                            throw ok_0.a(v6);
                                                                        }
                                                                        var3_3 = (Map)var0;
                                                                        var4_7 = var3_3.size();
                                                                        try {
                                                                            v7 = var3_3 instanceof LinkedHashMap;
                                                                            if (var2_2 != null) break block63;
                                                                            if (v7) {
                                                                            }
                                                                            ** GOTO lbl47
                                                                        }
                                                                        catch (Exception v8) {
                                                                            throw ok_0.a(v8);
                                                                        }
                                                                        var5_11 /* !! */  = new LinkedHashMap<K, V>(var4_7);
                                                                        try {
                                                                            if (var2_2 == null) break block64;
lbl47:
                                                                            // 2 sources

                                                                            v7 = var3_3 instanceof TreeMap;
                                                                        }
                                                                        catch (Exception v9) {
                                                                            throw ok_0.a(v9);
                                                                        }
                                                                    }
                                                                    if (!v7) break block78;
                                                                    var5_11 /* !! */  = new TreeMap<K, V>();
                                                                    if (var2_2 == null) break block64;
                                                                }
                                                                var5_11 /* !! */  = new HashMap<K, V>(var4_7);
                                                            }
                                                            var6_16 = new O0(var5_11 /* !! */ );
                                                            for (Map.Entry<K, V> var8_24 : var3_3.entrySet()) {
                                                                var9_27 = var8_24.getKey();
                                                                var10_31 = B8.i(var9_27);
                                                                var11_34 = ok_0.l(var8_24.getValue(), var1_1);
                                                                try {
                                                                    v10 = var6_16;
                                                                    if (var2_2 != null) return v10;
                                                                    v10.C(var10_31, var11_34);
                                                                    if (var2_2 == null) continue;
                                                                    break;
                                                                }
                                                                catch (Exception v11) {
                                                                    throw ok_0.a(v11);
                                                                }
                                                            }
                                                            v10 = var6_16;
                                                            return v10;
                                                        }
                                                        v3 = var0 instanceof Collection;
                                                    }
                                                    try {
                                                        if (var2_2 != null) break block65;
                                                        if (!v3) break block66;
                                                    }
                                                    catch (Exception v12) {
                                                        throw ok_0.a(v12);
                                                    }
                                                    var3_4 = (Collection)var0;
                                                    var4_8 = new oc_0(var3_4.size());
                                                    for (E var6_17 : var3_4) {
                                                        var7_21 = ok_0.l(var6_17, var1_1);
                                                        try {
                                                            v13 = var4_8;
                                                            if (var2_2 != null) return v13;
                                                            v13.add(var7_21);
                                                            if (var2_2 == null) continue;
                                                            break;
                                                        }
                                                        catch (Exception v14) {
                                                            throw ok_0.a(v14);
                                                        }
                                                    }
                                                    v13 = var4_8;
                                                    return v13;
                                                }
                                                try {
                                                    v15 = var0;
                                                    if (var2_2 != null) break block67;
                                                    v3 = v15 instanceof CN;
                                                }
                                                catch (Exception v16) {
                                                    throw ok_0.a(v16);
                                                }
                                            }
                                            if (v3) {
                                                var3_5 = ok_0.x(var0);
                                                return ok_0.X(var3_5);
                                            }
                                            v15 = var0;
                                        }
                                        var3_6 = v15.getClass();
                                        v17 = var3_6.isEnum();
                                        if (var2_2 != null) break block68;
                                        try {
                                            if (!v17) break block69;
                                            return ((Enum)var0).name();
                                            catch (Exception v18) {
                                                throw ok_0.a(v18);
                                            }
                                        }
                                        catch (Exception v19) {
                                            throw ok_0.a(v19);
                                        }
                                    }
                                    v17 = var3_6.isArray();
                                }
                                try {
                                    if (var2_2 != null) break block70;
                                    if (!v17) break block71;
                                }
                                catch (Exception v20) {
                                    throw ok_0.a(v20);
                                }
                                var4_9 = Array.getLength(var0);
                                var5_13 = new oc_0(var4_9);
                                for (var6_18 = 0; var6_18 < var4_9; ++var6_18) {
                                    var7_22 = Array.get(var0, var6_18);
                                    var8_25 = ok_0.b(var7_22);
                                    try {
                                        v21 = var5_13;
                                        if (var2_2 != null) return v21;
                                        v21.add(var8_25);
                                        if (var2_2 == null) continue;
                                        break;
                                    }
                                    catch (Exception v22) {
                                        throw ok_0.a(v22);
                                    }
                                }
                                v21 = var5_13;
                                return v21;
                            }
                            try {
                                v23 = var3_6;
                                if (var2_2 != null) return v23;
                                v17 = IG.C(v23);
                            }
                            catch (Exception v24) {
                                throw ok_0.a(v24);
                            }
                        }
                        if (v17) {
                            v23 = var0;
                            return v23;
                        }
                        var4_10 = var1_1.O(var3_6);
                        try {
                            v25 = var4_10;
                            if (var2_2 != null) break block72;
                            if (!(v25 instanceof nj_2)) break block73;
                        }
                        catch (Exception v26) {
                            throw ok_0.a(v26);
                        }
                        var5_14 = (nj_2)var4_10;
                        var6_19 = var5_14.j();
                        var7_23 = false;
                        try {
                            v27 = var6_19;
                            if (var2_2 != null) break block74;
                            if (v27 == null) break block75;
                        }
                        catch (Exception v28) {
                            throw ok_0.a(v28);
                        }
                        v27 = var6_19;
                    }
                    for (EP var11_35 : v27.u()) {
                        block77: {
                            block76: {
                                v29 = var11_35;
                                v30 = EP.SortField;
                                if (var2_2 != null) break block76;
                                try {
                                    block79: {
                                        if (v29 == v30) break block77;
                                        break block79;
                                        catch (Exception v31) {
                                            throw ok_0.a(v31);
                                        }
                                    }
                                    v29 = var11_35;
                                    v30 = EP.MapSortField;
                                }
                                catch (Exception v32) {
                                    throw ok_0.a(v32);
                                }
                            }
                            if (v29 != v30) continue;
                        }
                        var7_23 = true;
                        if (var2_2 == null) continue;
                    }
                }
                var8_26 = new O0(var7_23);
                try {
                    var9_29 = var5_14.k(var0);
                    for (Map.Entry<K, V> var11_37 : var9_29.entrySet()) {
                        try {
                            var8_26.C((String)var11_37.getKey(), ok_0.l(var11_37.getValue(), var1_1));
                            if (var2_2 == null && var2_2 == null) continue;
                            return var8_26;
                        }
                        catch (Exception v33) {
                            throw ok_0.a(v33);
                            return var8_26;
                        }
                    }
                }
                catch (Exception var9_30) {
                    throw new hi_0(ok_0.a(22086, 721), var9_30);
                }
            }
            v25 = var0;
        }
        var5_15 = ok_0.K(v25, var1_1, new EP[0]);
        return ok_0.X(var5_15);
    }

    public static Object z(ok_0 ok_02, Class clazz) {
        return B8.B(ok_02, clazz, IG.G());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object X(Class clazz) {
        Class clazz2;
        Object object;
        block19: {
            String string;
            block18: {
                block17: {
                    string = hi_0.C();
                    try {
                        try {
                            object = clazz;
                            clazz2 = oc_0.class;
                            if (string != null) break block17;
                            if (object == clazz2) return this;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ok_0.a(runtimeException);
                        }
                        object = clazz;
                        clazz2 = ok_0.class;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                }
                try {
                    try {
                        if (string != null) break block18;
                        if (object == clazz2) return this;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                    object = clazz;
                    clazz2 = Collection.class;
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
            }
            try {
                try {
                    try {
                        if (string != null) break block19;
                        if (object == clazz2) return this;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                    object = clazz;
                    if (string != null) return object;
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
                clazz2 = List.class;
            }
            catch (RuntimeException runtimeException) {
                throw ok_0.a(runtimeException);
            }
        }
        try {
            if (object == clazz2) {
                return this;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ok_0.a(runtimeException);
        }
        object = B8.B(this, clazz, IG.G());
        return object;
    }

    public Object W(Type type) {
        return B8.I(this, type, IG.G());
    }

    public Object X(HI hI2) {
        Type type;
        block4: {
            block3: {
                HI hI3;
                block2: {
                    String string = hi_0.C();
                    try {
                        hI3 = hI2;
                        if (string != null) break block2;
                        if (hI3 == null) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ok_0.a(runtimeException);
                    }
                    hI3 = hI2;
                }
                type = hI3.O();
                break block4;
            }
            type = null;
        }
        Type type2 = type;
        return B8.I(this, type2, IG.G());
    }

    /*
     * Unable to fully structure code
     */
    private static byte[] K(int var0) {
        block17: {
            block16: {
                block14: {
                    block15: {
                        var2_1 = (byte[])ok_0.H.get();
                        var1_2 = hi_0.C();
                        try {
                            try {
                                try {
                                    v0 = var2_1;
                                    if (var1_2 != null) break block14;
                                    if (v0 == null) {
                                    }
                                    ** GOTO lbl35
                                }
                                catch (RuntimeException v1) {
                                    throw ok_0.a(v1);
                                }
                                v2 = var0;
                                if (var1_2 != null) break block15;
                            }
                            catch (RuntimeException v3) {
                                throw ok_0.a(v3);
                            }
                            if (v2 <= ok_0.a(4340, 6658045543267204732L)) {
                            }
                            ** GOTO lbl27
                        }
                        catch (RuntimeException v4) {
                            throw ok_0.a(v4);
                        }
                        var2_1 = new byte[ok_0.a(4340, 6658045543267204732L)];
                        try {
                            ok_0.H.set(var2_1);
                            if (var1_2 == null) break block16;
lbl27:
                            // 2 sources

                            v2 = var0;
                        }
                        catch (RuntimeException v5) {
                            throw ok_0.a(v5);
                        }
                    }
                    var2_1 = new byte[v2];
                    try {
                        if (var1_2 == null) break block16;
lbl35:
                        // 2 sources

                        v0 = var2_1;
                    }
                    catch (RuntimeException v6) {
                        throw ok_0.a(v6);
                    }
                }
                try {
                    if (var1_2 != null) break block17;
                    if (v0.length >= var0) break block16;
                }
                catch (RuntimeException v7) {
                    throw ok_0.a(v7);
                }
                var2_1 = new byte[var0];
            }
            v0 = var2_1;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    private static char[] O(int var0) {
        block17: {
            block16: {
                block14: {
                    block15: {
                        var2_1 = (char[])ok_0.w.get();
                        var1_2 = hi_0.C();
                        try {
                            try {
                                try {
                                    v0 = var2_1;
                                    if (var1_2 != null) break block14;
                                    if (v0 == null) {
                                    }
                                    ** GOTO lbl35
                                }
                                catch (RuntimeException v1) {
                                    throw ok_0.a(v1);
                                }
                                v2 = var0;
                                if (var1_2 != null) break block15;
                            }
                            catch (RuntimeException v3) {
                                throw ok_0.a(v3);
                            }
                            if (v2 <= ok_0.a(660, 2940802758088387613L)) {
                            }
                            ** GOTO lbl27
                        }
                        catch (RuntimeException v4) {
                            throw ok_0.a(v4);
                        }
                        var2_1 = new char[ok_0.a(4340, 6658045543267204732L)];
                        try {
                            ok_0.w.set(var2_1);
                            if (var1_2 == null) break block16;
lbl27:
                            // 2 sources

                            v2 = var0;
                        }
                        catch (RuntimeException v5) {
                            throw ok_0.a(v5);
                        }
                    }
                    var2_1 = new char[v2];
                    try {
                        if (var1_2 == null) break block16;
lbl35:
                        // 2 sources

                        v0 = var2_1;
                    }
                    catch (RuntimeException v6) {
                        throw ok_0.a(v6);
                    }
                }
                try {
                    if (var1_2 != null) break block17;
                    if (v0.length >= var0) break block16;
                }
                catch (RuntimeException v7) {
                    throw ok_0.a(v7);
                }
                var2_1 = new char[var0];
            }
            v0 = var2_1;
        }
        return v0;
    }

    /*
     * Exception decompiling
     */
    public static boolean Q(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 5[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Could not resolve type clashes
     */
    public static boolean y(String string) {
        String string2;
        block22: {
            int n10;
            block21: {
                block20: {
                    String string3;
                    block19: {
                        string2 = hi_0.C();
                        try {
                            string3 = string;
                            if (string2 != null) break block19;
                            if (string3 == null) break block20;
                        }
                        catch (Exception exception) {
                            throw ok_0.a(exception);
                        }
                        string3 = string;
                    }
                    try {
                        n10 = string3.length();
                        if (string2 != null) break block21;
                        if (n10 != 0) break block22;
                    }
                    catch (Exception exception) {
                        throw ok_0.a(exception);
                    }
                }
                n10 = 0;
            }
            return n10 != 0;
        }
        try (uy_0 uy_02 = new uy_0(string);){
            boolean bl;
            block23: {
                block24: {
                    int n11;
                    block27: {
                        int n12;
                        block25: {
                            block26: {
                                block28: {
                                    uy_02.K();
                                    boolean bl2 = uy_02.P();
                                    bl = bl2;
                                    if (string2 != null) break block23;
                                    if (bl != ok_0.a(21142, 6343635491314646040L)) break block24;
                                    break block28;
                                    catch (Exception exception) {
                                        throw ok_0.a(exception);
                                    }
                                }
                                try {
                                    block29: {
                                        n11 = uy_02.w();
                                        n12 = ok_0.a(32614, 6517112391450169826L);
                                        if (string2 != null) break block25;
                                        break block29;
                                        catch (Exception exception) {
                                            throw ok_0.a(exception);
                                        }
                                    }
                                    if (n11 != n12) break block26;
                                }
                                catch (Exception exception) {
                                    throw ok_0.a(exception);
                                }
                                boolean bl3 = false;
                                return bl3;
                            }
                            try {
                                uy_02.d(true);
                                n11 = uy_02.P();
                                if (string2 != null) break block27;
                                n12 = ok_0.a(2451, 8158925982375077657L);
                            }
                            catch (Exception exception) {
                                throw ok_0.a(exception);
                            }
                        }
                        n11 = n11 == n12 ? 1 : 0;
                    }
                    int n13 = n11;
                    return n13 != 0;
                }
                bl = false;
            }
            boolean bl4 = bl;
            return bl4;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Could not resolve type clashes
     */
    public static boolean q(String string) {
        String string2;
        block21: {
            int n10;
            block20: {
                block19: {
                    String string3;
                    block18: {
                        string2 = hi_0.C();
                        try {
                            string3 = string;
                            if (string2 != null) break block18;
                            if (string3 == null) break block19;
                        }
                        catch (Exception exception) {
                            throw ok_0.a(exception);
                        }
                        string3 = string;
                    }
                    try {
                        n10 = string3.length();
                        if (string2 != null) break block20;
                        if (n10 != 0) break block21;
                    }
                    catch (Exception exception) {
                        throw ok_0.a(exception);
                    }
                }
                n10 = 0;
            }
            return n10 != 0;
        }
        try (uy_0 uy_02 = new uy_0(string);){
            boolean bl;
            block22: {
                block23: {
                    boolean bl2;
                    block24: {
                        block25: {
                            block27: {
                                block26: {
                                    uy_02.K();
                                    boolean bl3 = uy_02.P();
                                    bl = bl3;
                                    if (string2 != null) break block22;
                                    if (bl != ok_0.a(24935, 2026361931282583522L)) break block23;
                                    break block26;
                                    catch (Exception exception) {
                                        throw ok_0.a(exception);
                                    }
                                }
                                uy_02.X(true);
                                bl2 = uy_02.P();
                                if (string2 != null) break block24;
                                break block27;
                                catch (Exception exception) {
                                    throw ok_0.a(exception);
                                }
                            }
                            try {
                                block28: {
                                    if (bl2 != ok_0.a(1511, 1011378586708601696L)) break block25;
                                    break block28;
                                    catch (Exception exception) {
                                        throw ok_0.a(exception);
                                    }
                                }
                                bl2 = true;
                                break block24;
                            }
                            catch (Exception exception) {
                                throw ok_0.a(exception);
                            }
                        }
                        bl2 = false;
                    }
                    boolean bl4 = bl2;
                    return bl4;
                }
                bl = false;
            }
            boolean bl5 = bl;
            return bl5;
        }
    }

    public static void c(yn_2 yn_22, Object object) {
        yn_22.Y(object);
    }

    public static void Y(Type type, Type type2) {
        block7: {
            Type type3;
            String string;
            block6: {
                string = hi_0.C();
                try {
                    type3 = type;
                    if (string != null) break block6;
                    if (type3 == null) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
                type3 = type2;
            }
            try {
                try {
                    if (string != null || type3 == null) break block7;
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
                type3 = A.put(type, type2);
            }
            catch (RuntimeException runtimeException) {
                throw ok_0.a(runtimeException);
            }
        }
    }

    public static void y(Type type) {
        block4: {
            String string = hi_0.C();
            try {
                Type type2;
                try {
                    type2 = type;
                    if (string != null || type2 == null) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw ok_0.a(runtimeException);
                }
                type2 = A.remove(type);
            }
            catch (RuntimeException runtimeException) {
                throw ok_0.a(runtimeException);
            }
        }
    }

    public static void d() {
        A.clear();
    }

    public static Type k(Type type) {
        try {
            if (type != null) {
                return (Type)A.get(type);
            }
        }
        catch (RuntimeException runtimeException) {
            throw ok_0.a(runtimeException);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[14];
                        var11_1 = 0;
                        var10_2 = "\u00bcx\u00b7\u00f1\u009b\u0005\u00a1#\u0014\u009a\u00ef\u0005\u0087l\u00af\u00be\u00aa\u0013^_\u0002\u0004\u00d2\u001dh\u0010)\b-HO\u0085\u00bf\u0004\u00eb\u00f3\u009a\u0004\u0003\u00c2\t\u00c1\f\u009d(\u00e5\u0014\u0019sR\u00f6\u00b8\u0083\u0084\u00d7\u0004\u00fa<6\u001e\u001b:5\u00c0\u000b<\u00ac\u00a7M\u00c9\n\u0085\u0091\u000bKP\u0017$U![:\u00f4/3a2\u008b\u0012\u00b5\u00db\u0089\u0082\u00af_J\u00e2Axp\u00c6\u00d0\u0081\u00ecUZ!,8\u00978\u000b\u0099n\u008c\u00c4\u0099\u00adyP\u0097\u00a4\u00e7\u00d7@\u00b4*\u00ad\u008aGKAN\u0099\u00d6[\u00f3\u0081U\u00a2\u00a0\u001f{W^\u00a3\u00f8R\u0002-\u0014\u0093$exF\u00f1x\u00d7\u001f\u00da\u00c9vD\u001f\u0086\u00aa\u00e5\u0016\t\u0086!\u0087\u0004\u00c1\u00b7\u008c\u0015\u0090\u00ca\u00be\u00abV\u00a9c\u0097yWv(\u0016F\u00fd1!)\u009b,{\u00b3!\u00f0\u0002\u00b4\u0012\u0016?#Im\u00878\u00e9\u00d9ulg\u009d\u00c6\u009d\u00aam\u00ad`\u00b4\f\u00a1\u008c\u00dc\u00d5";
                        var12_3 = "\u00bcx\u00b7\u00f1\u009b\u0005\u00a1#\u0014\u009a\u00ef\u0005\u0087l\u00af\u00be\u00aa\u0013^_\u0002\u0004\u00d2\u001dh\u0010)\b-HO\u0085\u00bf\u0004\u00eb\u00f3\u009a\u0004\u0003\u00c2\t\u00c1\f\u009d(\u00e5\u0014\u0019sR\u00f6\u00b8\u0083\u0084\u00d7\u0004\u00fa<6\u001e\u001b:5\u00c0\u000b<\u00ac\u00a7M\u00c9\n\u0085\u0091\u000bKP\u0017$U![:\u00f4/3a2\u008b\u0012\u00b5\u00db\u0089\u0082\u00af_J\u00e2Axp\u00c6\u00d0\u0081\u00ecUZ!,8\u00978\u000b\u0099n\u008c\u00c4\u0099\u00adyP\u0097\u00a4\u00e7\u00d7@\u00b4*\u00ad\u008aGKAN\u0099\u00d6[\u00f3\u0081U\u00a2\u00a0\u001f{W^\u00a3\u00f8R\u0002-\u0014\u0093$exF\u00f1x\u00d7\u001f\u00da\u00c9vD\u001f\u0086\u00aa\u00e5\u0016\t\u0086!\u0087\u0004\u00c1\u00b7\u008c\u0015\u0090\u00ca\u00be\u00abV\u00a9c\u0097yWv(\u0016F\u00fd1!)\u009b,{\u00b3!\u00f0\u0002\u00b4\u0012\u0016?#Im\u00878\u00e9\u00d9ulg\u009d\u00c6\u009d\u00aam\u00ad`\u00b4\f\u00a1\u008c\u00dc\u00d5".length();
                        var9_4 = 5;
                        ok_0.X(null);
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 4;
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
                            var10_2 = "\u0019\u00ce=Z\u00b4#\u00b8#4S\u00ffJ&\u00a0'\u00f0P\u0006\u00cd@E\u0082\u00df\u00c0D\u0004\u00f8\u00fe \u0013\u00c0\u00da\u0099\u00f0/\u0080\u0005\u0082\u00101\u00ae";
                            var12_3 = "\u0019\u00ce=Z\u00b4#\u00b8#4S\u00ffJ&\u00a0'\u00f0P\u0006\u00cd@E\u0082\u00df\u00c0D\u0004\u00f8\u00fe \u0013\u00c0\u00da\u0099\u00f0/\u0080\u0005\u0082\u00101\u00ae".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 97;
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
                                    v15 = 26;
                                    break;
                                }
                                case 1: {
                                    v15 = 107;
                                    break;
                                }
                                case 2: {
                                    v15 = 33;
                                    break;
                                }
                                case 3: {
                                    v15 = 41;
                                    break;
                                }
                                case 4: {
                                    v15 = 73;
                                    break;
                                }
                                case 5: {
                                    v15 = 39;
                                    break;
                                }
                                default: {
                                    v15 = 90;
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
                ok_0.b = var13;
                ok_0.c = new String[14];
                var0_7 = 3230512175600390237L;
                var6_8 = new long[12];
                var3_9 = 0;
                var4_10 = "\u001ecE\u00b9R@\u00c5\u00fa\u0007\u00904x\u00a1b\u00ecIAX\u0091-\u00819l\u0010\u00c7I\u008bn-\u000e\u0011\u00eeu\u0007<R\u00f2\u001a\u00fd\u001e-\u00a0\u00cd\u00f5-\u0017\u00b7P\"\u0083\u009aL+e\u00bc@\u00111\u009a\r}\u00ed.!mN\u00a4\u00a0\u007f\u000f\u00bb)\u00aa\u008a\u00f4\u001e\r\u008d\ty";
                var5_11 = "\u001ecE\u00b9R@\u00c5\u00fa\u0007\u00904x\u00a1b\u00ecIAX\u0091-\u00819l\u0010\u00c7I\u008bn-\u000e\u0011\u00eeu\u0007<R\u00f2\u001a\u00fd\u001e-\u00a0\u00cd\u00f5-\u0017\u00b7P\"\u0083\u009aL+e\u00bc@\u00111\u009a\r}\u00ed.!mN\u00a4\u00a0\u007f\u000f\u00bb)\u00aa\u008a\u00f4\u001e\r\u008d\ty".length();
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
                    var4_10 = "\u00f1\u0090\u0003\u0098\u0091E_\u00b11\u0007B\u00e4\u00f0\u0093A\u00a5";
                    var5_11 = "\u00f1\u0090\u0003\u0098\u0091E_\u00b11\u0007B\u00e4\u00f0\u0093A\u00a5".length();
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
        ok_0.f = var6_8;
        ok_0.j = new Integer[12];
        ok_0.X = TimeZone.getDefault();
        ok_0.Y = Locale.getDefault();
        ok_0.Z = ok_0.a(22095, -11194);
        ok_0.s = new wr_2[0];
        ok_0.z = ok_0.a(22080, 13348);
        ok_0.A = new ConcurrentHashMap<K, V>(ok_0.a(17368, 6563529773784935763L));
        var15_14 = 0;
        var15_14 |= ks_0.AutoCloseSource.v();
        var15_14 |= ks_0.InternFieldNames.v();
        var15_14 |= ks_0.UseBigDecimal.v();
        var15_14 |= ks_0.AllowUnQuotedFieldNames.v();
        var15_14 |= ks_0.AllowSingleQuotes.v();
        var15_14 |= ks_0.AllowArbitraryCommas.v();
        var15_14 |= ks_0.SortFeidFastMatch.v();
        ok_0.h = var15_14 |= ks_0.IgnoreNotMatch.v();
        var15_14 = 0;
        var15_14 |= EP.QuoteFieldNames.a();
        var15_14 |= EP.SkipTransientField.a();
        var15_14 |= EP.WriteEnumUsingName.a();
        ok_0.a = var15_14 |= EP.SortField.a();
        ok_0.z(S7.S);
        ok_0.H = new ThreadLocal<T>();
        ok_0.w = new ThreadLocal<T>();
    }

    public static void X(ky_2[] ky_2Array) {
        i = ky_2Array;
    }

    public static ky_2[] j() {
        return i;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x5643) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 216;
                    break;
                }
                case 1: {
                    n14 = 97;
                    break;
                }
                case 2: {
                    n14 = 79;
                    break;
                }
                case 3: {
                    n14 = 106;
                    break;
                }
                case 4: {
                    n14 = 165;
                    break;
                }
                case 5: {
                    n14 = 145;
                    break;
                }
                case 6: {
                    n14 = 107;
                    break;
                }
                case 7: {
                    n14 = 194;
                    break;
                }
                case 8: {
                    n14 = 118;
                    break;
                }
                case 9: {
                    n14 = 47;
                    break;
                }
                case 10: {
                    n14 = 110;
                    break;
                }
                case 11: {
                    n14 = 95;
                    break;
                }
                case 12: {
                    n14 = 217;
                    break;
                }
                case 13: {
                    n14 = 239;
                    break;
                }
                case 14: {
                    n14 = 99;
                    break;
                }
                case 15: {
                    n14 = 236;
                    break;
                }
                case 16: {
                    n14 = 208;
                    break;
                }
                case 17: {
                    n14 = 64;
                    break;
                }
                case 18: {
                    n14 = 210;
                    break;
                }
                case 19: {
                    n14 = 98;
                    break;
                }
                case 20: {
                    n14 = 84;
                    break;
                }
                case 21: {
                    n14 = 189;
                    break;
                }
                case 22: {
                    n14 = 14;
                    break;
                }
                case 23: {
                    n14 = 52;
                    break;
                }
                case 24: {
                    n14 = 231;
                    break;
                }
                case 25: {
                    n14 = 131;
                    break;
                }
                case 26: {
                    n14 = 20;
                    break;
                }
                case 27: {
                    n14 = 83;
                    break;
                }
                case 28: {
                    n14 = 129;
                    break;
                }
                case 29: {
                    n14 = 144;
                    break;
                }
                case 30: {
                    n14 = 42;
                    break;
                }
                case 31: {
                    n14 = 232;
                    break;
                }
                case 32: {
                    n14 = 170;
                    break;
                }
                case 33: {
                    n14 = 18;
                    break;
                }
                case 34: {
                    n14 = 185;
                    break;
                }
                case 35: {
                    n14 = 8;
                    break;
                }
                case 36: {
                    n14 = 100;
                    break;
                }
                case 37: {
                    n14 = 2;
                    break;
                }
                case 38: {
                    n14 = 132;
                    break;
                }
                case 39: {
                    n14 = 58;
                    break;
                }
                case 40: {
                    n14 = 17;
                    break;
                }
                case 41: {
                    n14 = 71;
                    break;
                }
                case 42: {
                    n14 = 45;
                    break;
                }
                case 43: {
                    n14 = 89;
                    break;
                }
                case 44: {
                    n14 = 172;
                    break;
                }
                case 45: {
                    n14 = 60;
                    break;
                }
                case 46: {
                    n14 = 202;
                    break;
                }
                case 47: {
                    n14 = 39;
                    break;
                }
                case 48: {
                    n14 = 33;
                    break;
                }
                case 49: {
                    n14 = 204;
                    break;
                }
                case 50: {
                    n14 = 55;
                    break;
                }
                case 51: {
                    n14 = 197;
                    break;
                }
                case 52: {
                    n14 = 49;
                    break;
                }
                case 53: {
                    n14 = 161;
                    break;
                }
                case 54: {
                    n14 = 133;
                    break;
                }
                case 55: {
                    n14 = 234;
                    break;
                }
                case 56: {
                    n14 = 19;
                    break;
                }
                case 57: {
                    n14 = 56;
                    break;
                }
                case 58: {
                    n14 = 37;
                    break;
                }
                case 59: {
                    n14 = 41;
                    break;
                }
                case 60: {
                    n14 = 6;
                    break;
                }
                case 61: {
                    n14 = 178;
                    break;
                }
                case 62: {
                    n14 = 65;
                    break;
                }
                case 63: {
                    n14 = 12;
                    break;
                }
                case 64: {
                    n14 = 235;
                    break;
                }
                case 65: {
                    n14 = 248;
                    break;
                }
                case 66: {
                    n14 = 7;
                    break;
                }
                case 67: {
                    n14 = 253;
                    break;
                }
                case 68: {
                    n14 = 93;
                    break;
                }
                case 69: {
                    n14 = 29;
                    break;
                }
                case 70: {
                    n14 = 242;
                    break;
                }
                case 71: {
                    n14 = 173;
                    break;
                }
                case 72: {
                    n14 = 171;
                    break;
                }
                case 73: {
                    n14 = 151;
                    break;
                }
                case 74: {
                    n14 = 137;
                    break;
                }
                case 75: {
                    n14 = 86;
                    break;
                }
                case 76: {
                    n14 = 27;
                    break;
                }
                case 77: {
                    n14 = 54;
                    break;
                }
                case 78: {
                    n14 = 160;
                    break;
                }
                case 79: {
                    n14 = 149;
                    break;
                }
                case 80: {
                    n14 = 25;
                    break;
                }
                case 81: {
                    n14 = 229;
                    break;
                }
                case 82: {
                    n14 = 69;
                    break;
                }
                case 83: {
                    n14 = 184;
                    break;
                }
                case 84: {
                    n14 = 21;
                    break;
                }
                case 85: {
                    n14 = 3;
                    break;
                }
                case 86: {
                    n14 = 113;
                    break;
                }
                case 87: {
                    n14 = 135;
                    break;
                }
                case 88: {
                    n14 = 16;
                    break;
                }
                case 89: {
                    n14 = 238;
                    break;
                }
                case 90: {
                    n14 = 177;
                    break;
                }
                case 91: {
                    n14 = 192;
                    break;
                }
                case 92: {
                    n14 = 152;
                    break;
                }
                case 93: {
                    n14 = 222;
                    break;
                }
                case 94: {
                    n14 = 174;
                    break;
                }
                case 95: {
                    n14 = 61;
                    break;
                }
                case 96: {
                    n14 = 9;
                    break;
                }
                case 97: {
                    n14 = 224;
                    break;
                }
                case 98: {
                    n14 = 36;
                    break;
                }
                case 99: {
                    n14 = 53;
                    break;
                }
                case 100: {
                    n14 = 1;
                    break;
                }
                case 101: {
                    n14 = 201;
                    break;
                }
                case 102: {
                    n14 = 252;
                    break;
                }
                case 103: {
                    n14 = 127;
                    break;
                }
                case 104: {
                    n14 = 117;
                    break;
                }
                case 105: {
                    n14 = 139;
                    break;
                }
                case 106: {
                    n14 = 102;
                    break;
                }
                case 107: {
                    n14 = 244;
                    break;
                }
                case 108: {
                    n14 = 156;
                    break;
                }
                case 109: {
                    n14 = 22;
                    break;
                }
                case 110: {
                    n14 = 162;
                    break;
                }
                case 111: {
                    n14 = 251;
                    break;
                }
                case 112: {
                    n14 = 125;
                    break;
                }
                case 113: {
                    n14 = 187;
                    break;
                }
                case 114: {
                    n14 = 212;
                    break;
                }
                case 115: {
                    n14 = 183;
                    break;
                }
                case 116: {
                    n14 = 158;
                    break;
                }
                case 117: {
                    n14 = 213;
                    break;
                }
                case 118: {
                    n14 = 186;
                    break;
                }
                case 119: {
                    n14 = 198;
                    break;
                }
                case 120: {
                    n14 = 88;
                    break;
                }
                case 121: {
                    n14 = 143;
                    break;
                }
                case 122: {
                    n14 = 164;
                    break;
                }
                case 123: {
                    n14 = 82;
                    break;
                }
                case 124: {
                    n14 = 63;
                    break;
                }
                case 125: {
                    n14 = 72;
                    break;
                }
                case 126: {
                    n14 = 85;
                    break;
                }
                case 127: {
                    n14 = 0;
                    break;
                }
                case 128: {
                    n14 = 240;
                    break;
                }
                case 129: {
                    n14 = 123;
                    break;
                }
                case 130: {
                    n14 = 246;
                    break;
                }
                case 131: {
                    n14 = 218;
                    break;
                }
                case 132: {
                    n14 = 78;
                    break;
                }
                case 133: {
                    n14 = 207;
                    break;
                }
                case 134: {
                    n14 = 73;
                    break;
                }
                case 135: {
                    n14 = 77;
                    break;
                }
                case 136: {
                    n14 = 76;
                    break;
                }
                case 137: {
                    n14 = 153;
                    break;
                }
                case 138: {
                    n14 = 114;
                    break;
                }
                case 139: {
                    n14 = 51;
                    break;
                }
                case 140: {
                    n14 = 119;
                    break;
                }
                case 141: {
                    n14 = 209;
                    break;
                }
                case 142: {
                    n14 = 140;
                    break;
                }
                case 143: {
                    n14 = 223;
                    break;
                }
                case 144: {
                    n14 = 191;
                    break;
                }
                case 145: {
                    n14 = 130;
                    break;
                }
                case 146: {
                    n14 = 115;
                    break;
                }
                case 147: {
                    n14 = 148;
                    break;
                }
                case 148: {
                    n14 = 190;
                    break;
                }
                case 149: {
                    n14 = 116;
                    break;
                }
                case 150: {
                    n14 = 121;
                    break;
                }
                case 151: {
                    n14 = 146;
                    break;
                }
                case 152: {
                    n14 = 24;
                    break;
                }
                case 153: {
                    n14 = 243;
                    break;
                }
                case 154: {
                    n14 = 188;
                    break;
                }
                case 155: {
                    n14 = 154;
                    break;
                }
                case 156: {
                    n14 = 226;
                    break;
                }
                case 157: {
                    n14 = 23;
                    break;
                }
                case 158: {
                    n14 = 62;
                    break;
                }
                case 159: {
                    n14 = 142;
                    break;
                }
                case 160: {
                    n14 = 67;
                    break;
                }
                case 161: {
                    n14 = 43;
                    break;
                }
                case 162: {
                    n14 = 15;
                    break;
                }
                case 163: {
                    n14 = 26;
                    break;
                }
                case 164: {
                    n14 = 205;
                    break;
                }
                case 165: {
                    n14 = 4;
                    break;
                }
                case 166: {
                    n14 = 230;
                    break;
                }
                case 167: {
                    n14 = 138;
                    break;
                }
                case 168: {
                    n14 = 203;
                    break;
                }
                case 169: {
                    n14 = 245;
                    break;
                }
                case 170: {
                    n14 = 227;
                    break;
                }
                case 171: {
                    n14 = 40;
                    break;
                }
                case 172: {
                    n14 = 157;
                    break;
                }
                case 173: {
                    n14 = 80;
                    break;
                }
                case 174: {
                    n14 = 66;
                    break;
                }
                case 175: {
                    n14 = 169;
                    break;
                }
                case 176: {
                    n14 = 196;
                    break;
                }
                case 177: {
                    n14 = 150;
                    break;
                }
                case 178: {
                    n14 = 175;
                    break;
                }
                case 179: {
                    n14 = 87;
                    break;
                }
                case 180: {
                    n14 = 199;
                    break;
                }
                case 181: {
                    n14 = 96;
                    break;
                }
                case 182: {
                    n14 = 155;
                    break;
                }
                case 183: {
                    n14 = 167;
                    break;
                }
                case 184: {
                    n14 = 136;
                    break;
                }
                case 185: {
                    n14 = 94;
                    break;
                }
                case 186: {
                    n14 = 134;
                    break;
                }
                case 187: {
                    n14 = 91;
                    break;
                }
                case 188: {
                    n14 = 10;
                    break;
                }
                case 189: {
                    n14 = 104;
                    break;
                }
                case 190: {
                    n14 = 57;
                    break;
                }
                case 191: {
                    n14 = 48;
                    break;
                }
                case 192: {
                    n14 = 126;
                    break;
                }
                case 193: {
                    n14 = 50;
                    break;
                }
                case 194: {
                    n14 = 221;
                    break;
                }
                case 195: {
                    n14 = 225;
                    break;
                }
                case 196: {
                    n14 = 35;
                    break;
                }
                case 197: {
                    n14 = 168;
                    break;
                }
                case 198: {
                    n14 = 34;
                    break;
                }
                case 199: {
                    n14 = 70;
                    break;
                }
                case 200: {
                    n14 = 147;
                    break;
                }
                case 201: {
                    n14 = 206;
                    break;
                }
                case 202: {
                    n14 = 74;
                    break;
                }
                case 203: {
                    n14 = 247;
                    break;
                }
                case 204: {
                    n14 = 108;
                    break;
                }
                case 205: {
                    n14 = 46;
                    break;
                }
                case 206: {
                    n14 = 249;
                    break;
                }
                case 207: {
                    n14 = 44;
                    break;
                }
                case 208: {
                    n14 = 214;
                    break;
                }
                case 209: {
                    n14 = 111;
                    break;
                }
                case 210: {
                    n14 = 228;
                    break;
                }
                case 211: {
                    n14 = 220;
                    break;
                }
                case 212: {
                    n14 = 122;
                    break;
                }
                case 213: {
                    n14 = 181;
                    break;
                }
                case 214: {
                    n14 = 112;
                    break;
                }
                case 215: {
                    n14 = 11;
                    break;
                }
                case 216: {
                    n14 = 176;
                    break;
                }
                case 217: {
                    n14 = 32;
                    break;
                }
                case 218: {
                    n14 = 233;
                    break;
                }
                case 219: {
                    n14 = 182;
                    break;
                }
                case 220: {
                    n14 = 215;
                    break;
                }
                case 221: {
                    n14 = 68;
                    break;
                }
                case 222: {
                    n14 = 105;
                    break;
                }
                case 223: {
                    n14 = 75;
                    break;
                }
                case 224: {
                    n14 = 141;
                    break;
                }
                case 225: {
                    n14 = 90;
                    break;
                }
                case 226: {
                    n14 = 193;
                    break;
                }
                case 227: {
                    n14 = 59;
                    break;
                }
                case 228: {
                    n14 = 28;
                    break;
                }
                case 229: {
                    n14 = 31;
                    break;
                }
                case 230: {
                    n14 = 179;
                    break;
                }
                case 231: {
                    n14 = 120;
                    break;
                }
                case 232: {
                    n14 = 180;
                    break;
                }
                case 233: {
                    n14 = 241;
                    break;
                }
                case 234: {
                    n14 = 38;
                    break;
                }
                case 235: {
                    n14 = 128;
                    break;
                }
                case 236: {
                    n14 = 92;
                    break;
                }
                case 237: {
                    n14 = 250;
                    break;
                }
                case 238: {
                    n14 = 237;
                    break;
                }
                case 239: {
                    n14 = 124;
                    break;
                }
                case 240: {
                    n14 = 159;
                    break;
                }
                case 241: {
                    n14 = 13;
                    break;
                }
                case 242: {
                    n14 = 219;
                    break;
                }
                case 243: {
                    n14 = 103;
                    break;
                }
                case 244: {
                    n14 = 195;
                    break;
                }
                case 245: {
                    n14 = 254;
                    break;
                }
                case 246: {
                    n14 = 255;
                    break;
                }
                case 247: {
                    n14 = 163;
                    break;
                }
                case 248: {
                    n14 = 81;
                    break;
                }
                case 249: {
                    n14 = 211;
                    break;
                }
                case 250: {
                    n14 = 109;
                    break;
                }
                case 251: {
                    n14 = 166;
                    break;
                }
                case 252: {
                    n14 = 200;
                    break;
                }
                case 253: {
                    n14 = 5;
                    break;
                }
                case 254: {
                    n14 = 30;
                    break;
                }
                default: {
                    n14 = 101;
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
            ok_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6E8F;
        if (j[n11] == null) {
            ok_0.j[n11] = (int)(f[n11] ^ l2);
        }
        return j[n11];
    }
}

