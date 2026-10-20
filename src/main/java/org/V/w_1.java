/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import com.ky_2;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.F.c;
import org.K;
import org.M;
import org.P;
import org.T.D;
import org.T.N;
import org.T.x;
import org.V.G;
import org.V.J;
import org.V.a;
import org.b_0;
import org.h.cr_0;
import org.v.RB;
import org.v.RG;
import org.v._A;
import org.v._L;
import org.v._V;
import org.v._s_0;
import org.v.e_1;
import org.v.fh_0;
import org.v.h7;
import org.v.hG;
import org.v.h_1;
import org.v.hc_0;
import org.v.q_0;
import org.v.r_0;
import org.v.rd_0;
import org.v.s_0;

/*
 * Renamed from org.v.W
 */
public class w_1
extends M {
    private static final Logger M;
    private EnumSet p;
    @c
    private _L d;
    private D I;
    private final List C;
    public static final x[] E;
    static final boolean f;
    private static final String[] i;
    private static final String[] j;
    private static final long k;

    public w_1() {
        this.p = EnumSet.noneOf(rd_0.class);
        this.I = new D(false);
        this.C = new ArrayList();
    }

    @Deprecated
    public w_1(J j2, _L _L2) {
        this();
        this.B(j2);
        this.P(_L2);
    }

    @Deprecated
    public w_1(File[] fileArray, File[] fileArray2, @c File[] fileArray3, @c File[] fileArray4, @c File file, @c String string, boolean bl, boolean bl2, boolean bl3, boolean bl4, x[] xArray, boolean bl5) {
        J j2;
        w_1 w_12;
        block11: {
            File file2;
            block9: {
                block10: {
                    this.p = EnumSet.noneOf(rd_0.class);
                    String[] stringArray = RG.C();
                    this.I = new D(false);
                    this.C = new ArrayList();
                    this.l(fileArray);
                    this.R(fileArray2);
                    this.B((File[])w_1.a(fileArray3, File.class));
                    String[] stringArray2 = stringArray;
                    try {
                        try {
                            this.Q((File[])w_1.a(fileArray4, File.class));
                            w_12 = this;
                            file2 = file;
                            if (stringArray2 == null) break block9;
                            w_12.Z(file2, bl5);
                            this.z(string);
                            this.U(bl);
                            this.Z(bl2);
                            this.e(bl3);
                            this.r(bl4);
                            w_12 = this;
                            if (!bl5) break block10;
                        }
                        catch (P p2) {
                            throw w_1.a(p2);
                        }
                        j2 = J.a;
                        break block11;
                    }
                    catch (P p3) {
                        throw w_1.a(p3);
                    }
                }
                file2 = file;
            }
            try {
                j2 = file2 == null ? K.L : new q_0(file);
            }
            catch (P p5) {
                throw w_1.a(p5);
            }
        }
        try {
            w_12.Q(j2);
            this.U(bl);
            this.Z(bl2);
            this.e(bl3);
            this.r(bl4);
            this.z(string);
            this.z(new r_0(xArray, new _A(this)));
            this.I.p(w_1.b(-16541, -20710));
            this.I.p(w_1.b(-16536, -16141));
            this.I.a(w_1.b(-16530, -11998), fileArray);
            this.I.a(w_1.b(-16540, -8583), fileArray2);
            this.I.a(w_1.b(-16539, -22403), fileArray3);
            this.I.a(w_1.b(-16529, -24033), fileArray4);
            this.I.a(w_1.b(-16532, -21914), file);
            this.I.a(w_1.b(-16535, 15232), string);
            this.I.a(w_1.b(-16517, 23804), bl);
            this.I.a(w_1.b(-16527, -30248), bl2);
            this.I.a(w_1.b(-16538, 21002), bl2);
            this.I.a(w_1.b(-16519, -13124), bl2);
            this.I.a(w_1.b(-16516, -1876), xArray);
            this.I.a(w_1.b(-16531, -22278), bl5);
            if (ky_2.F() != null) {
                RG.m(new String[5]);
            }
        }
        catch (P p6) {
            throw w_1.a(p6);
        }
    }

    private static Object[] a(@c Object[] objectArray, Class clazz) {
        Object[] objectArray2;
        block6: {
            Object object;
            block4: {
                block5: {
                    String[] stringArray = RG.C();
                    try {
                        try {
                            object = objectArray;
                            if (stringArray == null) break block4;
                            if (object == null) break block5;
                        }
                        catch (P p2) {
                            throw w_1.a(p2);
                        }
                        objectArray2 = objectArray;
                        break block6;
                    }
                    catch (P p3) {
                        throw w_1.a(p3);
                    }
                }
                object = Array.newInstance(clazz, 0);
            }
            objectArray2 = object;
        }
        return objectArray2;
    }

    public EnumSet W() {
        return this.p;
    }

    public w_1 e(EnumSet enumSet) {
        this.p = enumSet;
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     * Loose catch block
     */
    @Override
    public void Q(org.V.N[] nArray) throws b_0, IOException {
        block15: {
            String[] stringArray = RG.C();
            this.I.j();
            String[] stringArray2 = stringArray;
            try {
                int n10;
                block14: {
                    int n11;
                    _s_0 _s_02 = new _s_0(this, this.R, this.c, this.y());
                    this.C.clear();
                    for (Object object : nArray) {
                        M.log(Level.FINE, w_1.b(-16514, -22106), object);
                        h_1 h_12 = new h_1(this.w(object.o(), new BufferedInputStream(object.o()), this.m), _s_02);
                        try {
                            h_12.s(this.U);
                            h_12.E(this.r);
                            h_12.Y(this.l);
                            h_12.F(this.p);
                            n11 = this.C.add(h_12) ? 1 : 0;
                            if (stringArray2 != null) {
                                if (stringArray2 != null) continue;
                                break;
                            }
                            break block14;
                        }
                        catch (b_0 b_02) {
                            throw w_1.a(b_02);
                        }
                    }
                    n11 = n10 = 0;
                }
                while (n10 < this.C.size()) {
                    h_1 h_13;
                    Object object;
                    block16: {
                        h_13 = (h_1)this.C.get(n10);
                        object = h_13.p();
                        if (stringArray2 == null) break block15;
                        try {
                            block18: {
                                if (((RB)object).c != null) break block16;
                                break block18;
                                catch (b_0 b_03) {
                                    throw w_1.a(b_03);
                                }
                            }
                            throw new P();
                        }
                        catch (b_0 b_04) {
                            throw w_1.a(b_04);
                        }
                    }
                    File file = new File(((RB)object).c);
                    h_13.s(this.U);
                    h_13.E(this.r);
                    h_13.Y(this.l);
                    this.I.u(w_1.b(-16542, 32400) + file + "\"");
                    try {
                        h_13.q(this.Q, this.v, this.o, new fh_0(this, file));
                    }
                    finally {
                        this.I.r();
                    }
                    ++n10;
                    if (stringArray2 != null) continue;
                }
                this.I.d(w_1.b(-16513, -5726) + this.C.size() + w_1.b(-16534, -24438));
            }
            catch (Throwable throwable) {
                this.I.d(w_1.b(-16518, -20702) + this.C.size() + w_1.b(-16537, -26084));
                throw throwable;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private RB w(String string, InputStream inputStream, Charset charset) throws b_0, IOException {
        try {
            hc_0 hc_02 = new hc_0(string, new InputStreamReader(inputStream, charset));
            hG hG2 = new hG(hc_02);
            hG2.Q(this.h);
            hG2.S(this.l);
            this.I.u(w_1.b(-16543, 28249) + string + "\"");
            try {
                RB rB = hG2.X();
                this.I.r();
                return rB;
            }
            catch (Throwable throwable) {
                this.I.r();
                throw throwable;
            }
        }
        finally {
            inputStream.close();
        }
    }

    public static File k(String string, File file, @c File file2) {
        block5: {
            File file3;
            block4: {
                String[] stringArray = RG.C();
                try {
                    try {
                        file3 = file2;
                        if (stringArray == null) break block4;
                        if (file3 == null) break block5;
                    }
                    catch (P p2) {
                        throw w_1.a(p2);
                    }
                    file3 = new File(file2, cr_0.A(string));
                }
                catch (P p3) {
                    throw w_1.a(p3);
                }
            }
            return file3;
        }
        int n10 = string.lastIndexOf((int)k);
        return new File(file.getParentFile(), cr_0.A(string.substring(n10 + 1)));
    }

    /*
     * Unable to fully structure code
     */
    public void Z(cr_0 var1_1, File var2_2) throws IOException {
        block34: {
            block29: {
                block28: {
                    block27: {
                        block32: {
                            block26: {
                                var4_3 = cr_0.A(var1_1.t());
                                var3_4 = RG.C();
                                v0 = this.Z;
                                if (var3_4 == null) break block26;
                                try {
                                    block31: {
                                        if (v0 == K.J) break block27;
                                        break block31;
                                        catch (IOException v1) {
                                            throw w_1.a(v1);
                                        }
                                    }
                                    v0 = this.Z;
                                }
                                catch (IOException v2) {
                                    throw w_1.a(v2);
                                }
                            }
                            var5_5 = v0;
                            if (w_1.f) break block28;
                            v3 = var5_5;
                            if (var3_4 == null) break block29;
                            break block32;
                            catch (IOException v4) {
                                throw w_1.a(v4);
                            }
                        }
                        try {
                            block33: {
                                if (v3 != null) break block28;
                                break block33;
                                catch (IOException v5) {
                                    throw w_1.a(v5);
                                }
                            }
                            throw new AssertionError();
                        }
                        catch (IOException v6) {
                            throw w_1.a(v6);
                        }
                    }
                    var5_5 = new h7(this, var2_2);
                }
                v3 = var5_5;
            }
            var6_6 = v3.X(var4_3);
            var1_1.Z(var6_6);
            v7 = var6_6;
            if (var3_4 == null) ** GOTO lbl49
            if (v7 == null) break block34;
            try {
                v7 = var6_6;
lbl49:
                // 2 sources

                v7.close();
            }
            catch (IOException var7_7) {}
            break block34;
            catch (IOException var7_8) {
                try {
                    try {
                        var6_6.close();
                    }
                    catch (IOException var8_9) {
                        // empty catch block
                    }
                    var6_6 = null;
                    if (!var5_5.A(var4_3)) {
                        var8_10 = new IOException(w_1.b(-16544, -13394) + var4_3 + "\"");
                        var8_10.initCause(var7_8);
                        throw var8_10;
                    }
                    throw var7_8;
                }
                catch (Throwable var9_11) {
                    block30: {
                        try {
                            v8 = var6_6;
                            if (var3_4 != null) {
                                if (v8 == null) break block30;
                            }
                            ** GOTO lbl79
                        }
                        catch (IOException v9) {
                            throw w_1.a(v9);
                        }
                        try {
                            v8 = var6_6;
lbl79:
                            // 2 sources

                            v8.close();
                        }
                        catch (IOException var10_12) {
                            // empty catch block
                        }
                    }
                    throw var9_11;
                }
            }
        }
    }

    public void P(_L _L2) {
        this.d = _L2;
    }

    @Override
    public void U(boolean bl) {
        this.I = new D(bl);
    }

    private _L y() {
        s_0 s_02;
        block30: {
            block28: {
                boolean bl;
                Object object;
                block27: {
                    String[] stringArray;
                    block25: {
                        block26: {
                            block29: {
                                File[] fileArray;
                                File[] fileArray2;
                                block23: {
                                    block24: {
                                        w_1 w_12;
                                        block21: {
                                            block22: {
                                                stringArray = RG.C();
                                                try {
                                                    try {
                                                        w_12 = this;
                                                        if (stringArray == null) break block21;
                                                        if (w_12.d == null) break block22;
                                                    }
                                                    catch (P p2) {
                                                        throw w_1.a(p2);
                                                    }
                                                    return this.d;
                                                }
                                                catch (P p3) {
                                                    throw w_1.a(p3);
                                                }
                                            }
                                            w_12 = this;
                                        }
                                        fileArray2 = w_12.V;
                                        try {
                                            fileArray = fileArray2;
                                            if (stringArray == null) break block23;
                                            if (fileArray != null) break block24;
                                        }
                                        catch (P p5) {
                                            throw w_1.a(p5);
                                        }
                                        object = System.getProperty(w_1.b(-16520, 29184));
                                        if (object != null) {
                                            fileArray2 = N.H((String)object);
                                            this.V = fileArray2;
                                        }
                                    }
                                    fileArray = fileArray2;
                                }
                                if (fileArray == null) break block29;
                                s_02 = new s_0(Arrays.asList(new a(fileArray2), new G(this.x), new a(this.e)));
                                if (stringArray != null) break block30;
                            }
                            object = ClassLoader.getSystemClassLoader().getResource(w_1.b(-16533, 1670));
                            try {
                                try {
                                    try {
                                        bl = f;
                                        if (stringArray == null) break block25;
                                        if (bl) break block26;
                                    }
                                    catch (P p6) {
                                        throw w_1.a(p6);
                                    }
                                    if (object != null) break block26;
                                }
                                catch (P p7) {
                                    throw w_1.a(p7);
                                }
                                throw new AssertionError();
                            }
                            catch (P p8) {
                                throw w_1.a(p8);
                            }
                        }
                        bl = f;
                    }
                    try {
                        try {
                            if (stringArray == null) break block27;
                            if (bl) break block28;
                        }
                        catch (P p9) {
                            throw w_1.a(p9);
                        }
                        bl = w_1.b(-16515, 4113).equalsIgnoreCase(((URL)object).getProtocol());
                    }
                    catch (P p10) {
                        throw w_1.a(p10);
                    }
                }
                try {
                    if (!bl) {
                        throw new AssertionError((Object)((URL)object).toString());
                    }
                }
                catch (P p11) {
                    throw w_1.a(p11);
                }
            }
            e_1 e_12 = new e_1(this);
            s_02 = new s_0(Arrays.asList(e_12, new G(this.x), new a(this.e)));
        }
        this.d = new _V(s_02, null);
        return this.d;
    }

    static Logger t() {
        return M;
    }

    static List o(w_1 w_12) {
        return w_12.C;
    }

    static RB Y(w_1 w_12, String string, InputStream inputStream, Charset charset) throws b_0, IOException {
        return w_12.w(string, inputStream, charset);
    }

    static EnumSet N(w_1 w_12) {
        return w_12.p;
    }

    static D w(w_1 w_12) {
        return w_12.I;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    var7 = new String[25];
                    var5_1 = 0;
                    var4_2 = ")\u0006C\u0013xr=Vn\u000fP\u0097\u00ef5\u00e4\f6f9\u00f6\u00fc\u00b7\u0014\u00e3\u0086\u008b\u0000agZ7\u0018M;\u00ca\u0087E#\u00ba\u00db\u0001\u00af&\u0093-peQ\u0084b\u00c6 \u0086\u0085b\u00a02p\u00d1\b\u0015\u00be\u00c8v<v\u00a3\"\u0086\u00ad\u00ecOT\u00d4\u0018\r\u0016\r\u00d9\u00dc\u00d30\u0014\u00a6\u007f\u00bfO\u00f7}}\u00ef\u0099\u0001>}|\u008e\u0016\u009d\u0014\u007f}\u0088\t\u00df\u00c7\u00e2\u00af\u0088\u00fd@\u00a9\u00e5\u00e8\u0084\u00eeku\u00d8\u00e5\u0007O\u00d5\u00bf\u00c2\u008c\u00a0\u00ba\u0015ac\u00bf\u0015\u00bfy\u00d9\u008a^\u00e8%\u0083,6m\u00a6\u00de\u00ad\u0087r\u0000\u000f\u00c5J\u00f1{\u00a0\u00b9W+9w\u00de\u00bf\u00d1\u00f6m\u000b\u0016$\u00a2\u00b0\u00d0\u0000>\u00cb\u00c3_\u0099\t\u0012\u0089F\u00cb\u00a1E\u001cYk2.~\u00b7\u00e5u2#\u007f\u00f2a\u0004QK\u008d\u008e\\'\u00ef\u0092\u0095\u0095\u00a2\u0001\u00d4\u00ff3\u001c\u00fbA\u00ff%mh\u00aa6\u00b8\u0013\u00d2f.\u00ed\\\u00f1\u00f7iw\u00d7\u00800\u0089G\u00ce<\u00b0\f\u000f\u00ab\u00a7'|\u00e7\u00ecK\u00d6\u008b\u00e2]\u00b6&A.i\u001a\u00e1\u00e3\u0011\u00cb&\u0010D\u00ea\u00b6\u00b8y\u00b1~\u000fVoF\u009d\u0018\u00fd\u00f2\u00bb\u0007\u009fL\u00a5\u00e21\u00d9v\u00a9\u00e3!\u0087\u00bc\u00e0\u009bq\u00e1B\u00b4\u00dd\u0092\u0018\u00bc\u00e92\u008a\u001c\u001c\u0014Q\u00e8\u001c\u0088\u00de7&\u0084k\u00bc\u001a\u00ba\u00ba\u008c\u0004\u0098\u00d1\u000b\u00e0@\u00cc\u009f\u00ff\u0085\u0014\u009bQ\b8o\u00b2~\u00f4\u00cd\u000f\u00fc\n\u00e6\r\u00ba\u00f7U\u008c\u00cc\u00a6\u00d2\u00dd\u0014K\u00c9\u000e\u009f\u000f\u0015\u00f8\u00f5\u00cb\u00b6(\u00c0\u00e8\u00c5%K_\u00c1^s\u000bwQlR\u00f8\u00fe\u00f3\u00e0\u00b0\u0011\u0002\n\u0018v\u0081\u00b6Eb^{@}\u0013$\u00cf\u00db\u00c8\u0086\u00d2\u009a\u00de\u00ben\u0094\u009fO\u00c6\u00a8\u00f4\u00b3Po\u0007\u00a4(Vj\u00a5_X\tV\u00b6\u00a0\u00e0\u0081A\u001a\u00df\u00eb\u0003\u00d8\u0090d\u0017nK.\u008e\u00acS\u00bd\u009b\u0015\u001amV-L\u0016q\u00ab\u00e0p\u00cc\u008dL\u00bf\t\u00f0\u00datm\u001b\u00f0I\u00e9\u0081";
                    var6_3 = ")\u0006C\u0013xr=Vn\u000fP\u0097\u00ef5\u00e4\f6f9\u00f6\u00fc\u00b7\u0014\u00e3\u0086\u008b\u0000agZ7\u0018M;\u00ca\u0087E#\u00ba\u00db\u0001\u00af&\u0093-peQ\u0084b\u00c6 \u0086\u0085b\u00a02p\u00d1\b\u0015\u00be\u00c8v<v\u00a3\"\u0086\u00ad\u00ecOT\u00d4\u0018\r\u0016\r\u00d9\u00dc\u00d30\u0014\u00a6\u007f\u00bfO\u00f7}}\u00ef\u0099\u0001>}|\u008e\u0016\u009d\u0014\u007f}\u0088\t\u00df\u00c7\u00e2\u00af\u0088\u00fd@\u00a9\u00e5\u00e8\u0084\u00eeku\u00d8\u00e5\u0007O\u00d5\u00bf\u00c2\u008c\u00a0\u00ba\u0015ac\u00bf\u0015\u00bfy\u00d9\u008a^\u00e8%\u0083,6m\u00a6\u00de\u00ad\u0087r\u0000\u000f\u00c5J\u00f1{\u00a0\u00b9W+9w\u00de\u00bf\u00d1\u00f6m\u000b\u0016$\u00a2\u00b0\u00d0\u0000>\u00cb\u00c3_\u0099\t\u0012\u0089F\u00cb\u00a1E\u001cYk2.~\u00b7\u00e5u2#\u007f\u00f2a\u0004QK\u008d\u008e\\'\u00ef\u0092\u0095\u0095\u00a2\u0001\u00d4\u00ff3\u001c\u00fbA\u00ff%mh\u00aa6\u00b8\u0013\u00d2f.\u00ed\\\u00f1\u00f7iw\u00d7\u00800\u0089G\u00ce<\u00b0\f\u000f\u00ab\u00a7'|\u00e7\u00ecK\u00d6\u008b\u00e2]\u00b6&A.i\u001a\u00e1\u00e3\u0011\u00cb&\u0010D\u00ea\u00b6\u00b8y\u00b1~\u000fVoF\u009d\u0018\u00fd\u00f2\u00bb\u0007\u009fL\u00a5\u00e21\u00d9v\u00a9\u00e3!\u0087\u00bc\u00e0\u009bq\u00e1B\u00b4\u00dd\u0092\u0018\u00bc\u00e92\u008a\u001c\u001c\u0014Q\u00e8\u001c\u0088\u00de7&\u0084k\u00bc\u001a\u00ba\u00ba\u008c\u0004\u0098\u00d1\u000b\u00e0@\u00cc\u009f\u00ff\u0085\u0014\u009bQ\b8o\u00b2~\u00f4\u00cd\u000f\u00fc\n\u00e6\r\u00ba\u00f7U\u008c\u00cc\u00a6\u00d2\u00dd\u0014K\u00c9\u000e\u009f\u000f\u0015\u00f8\u00f5\u00cb\u00b6(\u00c0\u00e8\u00c5%K_\u00c1^s\u000bwQlR\u00f8\u00fe\u00f3\u00e0\u00b0\u0011\u0002\n\u0018v\u0081\u00b6Eb^{@}\u0013$\u00cf\u00db\u00c8\u0086\u00d2\u009a\u00de\u00ben\u0094\u009fO\u00c6\u00a8\u00f4\u00b3Po\u0007\u00a4(Vj\u00a5_X\tV\u00b6\u00a0\u00e0\u0081A\u001a\u00df\u00eb\u0003\u00d8\u0090d\u0017nK.\u008e\u00acS\u00bd\u009b\u0015\u001amV-L\u0016q\u00ab\u00e0p\u00cc\u008dL\u00bf\t\u00f0\u00datm\u001b\u00f0I\u00e9\u0081".length();
                    var3_4 = 18;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 11;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block22;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "e\u0015\u0018JH\u00ca\u00f1z\u0082>\u00e3z\u00bb\u00f3\u00cf\f\u00bf\u0012\u00ab\u00e4\u00de\u00f6\u00f69)%\u0087\u001f";
                        var6_3 = "e\u0015\u0018JH\u00ca\u00f1z\u0082>\u00e3z\u00bb\u00f3\u00cf\f\u00bf\u0012\u00ab\u00e4\u00de\u00f6\u00f69)%\u0087\u001f".length();
                        var3_4 = 15;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 95;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block23;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 49;
                                break;
                            }
                            case 1: {
                                v15 = 110;
                                break;
                            }
                            case 2: {
                                v15 = 96;
                                break;
                            }
                            case 3: {
                                v15 = 99;
                                break;
                            }
                            case 4: {
                                v15 = 90;
                                break;
                            }
                            case 5: {
                                v15 = 73;
                                break;
                            }
                            default: {
                                v15 = 42;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
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
                } while (v10 > var8_6);
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
            w_1.i = var7;
            w_1.j = new String[25];
            break block24;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 7445757312278716810L;
        ** while (true)
        w_1.k = -5566181260136291932L ^ var0_7;
        try {
            v17 = w_1.class.desiredAssertionStatus() == false;
        }
        catch (P v18) {
            throw w_1.a(v18);
        }
        w_1.f = v17;
        w_1.M = Logger.getLogger(w_1.class.getName());
        w_1.E = org.T.x.u;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFBF69) & 0xFFFF;
        if (j[n12] == null) {
            int n13;
            int n14;
            char[] cArray = i[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 217;
                    break;
                }
                case 1: {
                    n14 = 92;
                    break;
                }
                case 2: {
                    n14 = 54;
                    break;
                }
                case 3: {
                    n14 = 134;
                    break;
                }
                case 4: {
                    n14 = 107;
                    break;
                }
                case 5: {
                    n14 = 223;
                    break;
                }
                case 6: {
                    n14 = 64;
                    break;
                }
                case 7: {
                    n14 = 112;
                    break;
                }
                case 8: {
                    n14 = 29;
                    break;
                }
                case 9: {
                    n14 = 166;
                    break;
                }
                case 10: {
                    n14 = 247;
                    break;
                }
                case 11: {
                    n14 = 94;
                    break;
                }
                case 12: {
                    n14 = 23;
                    break;
                }
                case 13: {
                    n14 = 66;
                    break;
                }
                case 14: {
                    n14 = 148;
                    break;
                }
                case 15: {
                    n14 = 139;
                    break;
                }
                case 16: {
                    n14 = 30;
                    break;
                }
                case 17: {
                    n14 = 104;
                    break;
                }
                case 18: {
                    n14 = 111;
                    break;
                }
                case 19: {
                    n14 = 48;
                    break;
                }
                case 20: {
                    n14 = 87;
                    break;
                }
                case 21: {
                    n14 = 3;
                    break;
                }
                case 22: {
                    n14 = 96;
                    break;
                }
                case 23: {
                    n14 = 123;
                    break;
                }
                case 24: {
                    n14 = 213;
                    break;
                }
                case 25: {
                    n14 = 26;
                    break;
                }
                case 26: {
                    n14 = 51;
                    break;
                }
                case 27: {
                    n14 = 20;
                    break;
                }
                case 28: {
                    n14 = 19;
                    break;
                }
                case 29: {
                    n14 = 84;
                    break;
                }
                case 30: {
                    n14 = 147;
                    break;
                }
                case 31: {
                    n14 = 205;
                    break;
                }
                case 32: {
                    n14 = 150;
                    break;
                }
                case 33: {
                    n14 = 202;
                    break;
                }
                case 34: {
                    n14 = 86;
                    break;
                }
                case 35: {
                    n14 = 189;
                    break;
                }
                case 36: {
                    n14 = 80;
                    break;
                }
                case 37: {
                    n14 = 153;
                    break;
                }
                case 38: {
                    n14 = 178;
                    break;
                }
                case 39: {
                    n14 = 210;
                    break;
                }
                case 40: {
                    n14 = 225;
                    break;
                }
                case 41: {
                    n14 = 50;
                    break;
                }
                case 42: {
                    n14 = 49;
                    break;
                }
                case 43: {
                    n14 = 103;
                    break;
                }
                case 44: {
                    n14 = 163;
                    break;
                }
                case 45: {
                    n14 = 15;
                    break;
                }
                case 46: {
                    n14 = 35;
                    break;
                }
                case 47: {
                    n14 = 58;
                    break;
                }
                case 48: {
                    n14 = 12;
                    break;
                }
                case 49: {
                    n14 = 75;
                    break;
                }
                case 50: {
                    n14 = 82;
                    break;
                }
                case 51: {
                    n14 = 5;
                    break;
                }
                case 52: {
                    n14 = 184;
                    break;
                }
                case 53: {
                    n14 = 93;
                    break;
                }
                case 54: {
                    n14 = 227;
                    break;
                }
                case 55: {
                    n14 = 41;
                    break;
                }
                case 56: {
                    n14 = 215;
                    break;
                }
                case 57: {
                    n14 = 17;
                    break;
                }
                case 58: {
                    n14 = 7;
                    break;
                }
                case 59: {
                    n14 = 63;
                    break;
                }
                case 60: {
                    n14 = 57;
                    break;
                }
                case 61: {
                    n14 = 33;
                    break;
                }
                case 62: {
                    n14 = 188;
                    break;
                }
                case 63: {
                    n14 = 195;
                    break;
                }
                case 64: {
                    n14 = 241;
                    break;
                }
                case 65: {
                    n14 = 146;
                    break;
                }
                case 66: {
                    n14 = 11;
                    break;
                }
                case 67: {
                    n14 = 160;
                    break;
                }
                case 68: {
                    n14 = 70;
                    break;
                }
                case 69: {
                    n14 = 37;
                    break;
                }
                case 70: {
                    n14 = 255;
                    break;
                }
                case 71: {
                    n14 = 168;
                    break;
                }
                case 72: {
                    n14 = 46;
                    break;
                }
                case 73: {
                    n14 = 158;
                    break;
                }
                case 74: {
                    n14 = 171;
                    break;
                }
                case 75: {
                    n14 = 32;
                    break;
                }
                case 76: {
                    n14 = 132;
                    break;
                }
                case 77: {
                    n14 = 1;
                    break;
                }
                case 78: {
                    n14 = 226;
                    break;
                }
                case 79: {
                    n14 = 34;
                    break;
                }
                case 80: {
                    n14 = 122;
                    break;
                }
                case 81: {
                    n14 = 159;
                    break;
                }
                case 82: {
                    n14 = 170;
                    break;
                }
                case 83: {
                    n14 = 83;
                    break;
                }
                case 84: {
                    n14 = 169;
                    break;
                }
                case 85: {
                    n14 = 78;
                    break;
                }
                case 86: {
                    n14 = 2;
                    break;
                }
                case 87: {
                    n14 = 124;
                    break;
                }
                case 88: {
                    n14 = 221;
                    break;
                }
                case 89: {
                    n14 = 145;
                    break;
                }
                case 90: {
                    n14 = 157;
                    break;
                }
                case 91: {
                    n14 = 71;
                    break;
                }
                case 92: {
                    n14 = 143;
                    break;
                }
                case 93: {
                    n14 = 238;
                    break;
                }
                case 94: {
                    n14 = 231;
                    break;
                }
                case 95: {
                    n14 = 102;
                    break;
                }
                case 96: {
                    n14 = 99;
                    break;
                }
                case 97: {
                    n14 = 88;
                    break;
                }
                case 98: {
                    n14 = 239;
                    break;
                }
                case 99: {
                    n14 = 108;
                    break;
                }
                case 100: {
                    n14 = 204;
                    break;
                }
                case 101: {
                    n14 = 116;
                    break;
                }
                case 102: {
                    n14 = 85;
                    break;
                }
                case 103: {
                    n14 = 133;
                    break;
                }
                case 104: {
                    n14 = 216;
                    break;
                }
                case 105: {
                    n14 = 229;
                    break;
                }
                case 106: {
                    n14 = 201;
                    break;
                }
                case 107: {
                    n14 = 129;
                    break;
                }
                case 108: {
                    n14 = 243;
                    break;
                }
                case 109: {
                    n14 = 234;
                    break;
                }
                case 110: {
                    n14 = 22;
                    break;
                }
                case 111: {
                    n14 = 165;
                    break;
                }
                case 112: {
                    n14 = 8;
                    break;
                }
                case 113: {
                    n14 = 203;
                    break;
                }
                case 114: {
                    n14 = 167;
                    break;
                }
                case 115: {
                    n14 = 16;
                    break;
                }
                case 116: {
                    n14 = 174;
                    break;
                }
                case 117: {
                    n14 = 211;
                    break;
                }
                case 118: {
                    n14 = 161;
                    break;
                }
                case 119: {
                    n14 = 242;
                    break;
                }
                case 120: {
                    n14 = 140;
                    break;
                }
                case 121: {
                    n14 = 65;
                    break;
                }
                case 122: {
                    n14 = 172;
                    break;
                }
                case 123: {
                    n14 = 120;
                    break;
                }
                case 124: {
                    n14 = 101;
                    break;
                }
                case 125: {
                    n14 = 179;
                    break;
                }
                case 126: {
                    n14 = 43;
                    break;
                }
                case 127: {
                    n14 = 173;
                    break;
                }
                case 128: {
                    n14 = 183;
                    break;
                }
                case 129: {
                    n14 = 164;
                    break;
                }
                case 130: {
                    n14 = 36;
                    break;
                }
                case 131: {
                    n14 = 10;
                    break;
                }
                case 132: {
                    n14 = 199;
                    break;
                }
                case 133: {
                    n14 = 253;
                    break;
                }
                case 134: {
                    n14 = 152;
                    break;
                }
                case 135: {
                    n14 = 249;
                    break;
                }
                case 136: {
                    n14 = 115;
                    break;
                }
                case 137: {
                    n14 = 252;
                    break;
                }
                case 138: {
                    n14 = 209;
                    break;
                }
                case 139: {
                    n14 = 187;
                    break;
                }
                case 140: {
                    n14 = 141;
                    break;
                }
                case 141: {
                    n14 = 27;
                    break;
                }
                case 142: {
                    n14 = 72;
                    break;
                }
                case 143: {
                    n14 = 194;
                    break;
                }
                case 144: {
                    n14 = 214;
                    break;
                }
                case 145: {
                    n14 = 220;
                    break;
                }
                case 146: {
                    n14 = 42;
                    break;
                }
                case 147: {
                    n14 = 95;
                    break;
                }
                case 148: {
                    n14 = 125;
                    break;
                }
                case 149: {
                    n14 = 235;
                    break;
                }
                case 150: {
                    n14 = 38;
                    break;
                }
                case 151: {
                    n14 = 192;
                    break;
                }
                case 152: {
                    n14 = 0;
                    break;
                }
                case 153: {
                    n14 = 59;
                    break;
                }
                case 154: {
                    n14 = 212;
                    break;
                }
                case 155: {
                    n14 = 39;
                    break;
                }
                case 156: {
                    n14 = 228;
                    break;
                }
                case 157: {
                    n14 = 186;
                    break;
                }
                case 158: {
                    n14 = 52;
                    break;
                }
                case 159: {
                    n14 = 130;
                    break;
                }
                case 160: {
                    n14 = 233;
                    break;
                }
                case 161: {
                    n14 = 135;
                    break;
                }
                case 162: {
                    n14 = 222;
                    break;
                }
                case 163: {
                    n14 = 250;
                    break;
                }
                case 164: {
                    n14 = 77;
                    break;
                }
                case 165: {
                    n14 = 118;
                    break;
                }
                case 166: {
                    n14 = 81;
                    break;
                }
                case 167: {
                    n14 = 91;
                    break;
                }
                case 168: {
                    n14 = 114;
                    break;
                }
                case 169: {
                    n14 = 89;
                    break;
                }
                case 170: {
                    n14 = 246;
                    break;
                }
                case 171: {
                    n14 = 4;
                    break;
                }
                case 172: {
                    n14 = 177;
                    break;
                }
                case 173: {
                    n14 = 200;
                    break;
                }
                case 174: {
                    n14 = 191;
                    break;
                }
                case 175: {
                    n14 = 180;
                    break;
                }
                case 176: {
                    n14 = 182;
                    break;
                }
                case 177: {
                    n14 = 197;
                    break;
                }
                case 178: {
                    n14 = 151;
                    break;
                }
                case 179: {
                    n14 = 206;
                    break;
                }
                case 180: {
                    n14 = 196;
                    break;
                }
                case 181: {
                    n14 = 208;
                    break;
                }
                case 182: {
                    n14 = 47;
                    break;
                }
                case 183: {
                    n14 = 119;
                    break;
                }
                case 184: {
                    n14 = 90;
                    break;
                }
                case 185: {
                    n14 = 74;
                    break;
                }
                case 186: {
                    n14 = 40;
                    break;
                }
                case 187: {
                    n14 = 109;
                    break;
                }
                case 188: {
                    n14 = 105;
                    break;
                }
                case 189: {
                    n14 = 232;
                    break;
                }
                case 190: {
                    n14 = 138;
                    break;
                }
                case 191: {
                    n14 = 31;
                    break;
                }
                case 192: {
                    n14 = 155;
                    break;
                }
                case 193: {
                    n14 = 62;
                    break;
                }
                case 194: {
                    n14 = 136;
                    break;
                }
                case 195: {
                    n14 = 21;
                    break;
                }
                case 196: {
                    n14 = 100;
                    break;
                }
                case 197: {
                    n14 = 254;
                    break;
                }
                case 198: {
                    n14 = 69;
                    break;
                }
                case 199: {
                    n14 = 251;
                    break;
                }
                case 200: {
                    n14 = 156;
                    break;
                }
                case 201: {
                    n14 = 56;
                    break;
                }
                case 202: {
                    n14 = 25;
                    break;
                }
                case 203: {
                    n14 = 237;
                    break;
                }
                case 204: {
                    n14 = 13;
                    break;
                }
                case 205: {
                    n14 = 207;
                    break;
                }
                case 206: {
                    n14 = 198;
                    break;
                }
                case 207: {
                    n14 = 193;
                    break;
                }
                case 208: {
                    n14 = 149;
                    break;
                }
                case 209: {
                    n14 = 67;
                    break;
                }
                case 210: {
                    n14 = 14;
                    break;
                }
                case 211: {
                    n14 = 127;
                    break;
                }
                case 212: {
                    n14 = 55;
                    break;
                }
                case 213: {
                    n14 = 144;
                    break;
                }
                case 214: {
                    n14 = 240;
                    break;
                }
                case 215: {
                    n14 = 131;
                    break;
                }
                case 216: {
                    n14 = 121;
                    break;
                }
                case 217: {
                    n14 = 230;
                    break;
                }
                case 218: {
                    n14 = 236;
                    break;
                }
                case 219: {
                    n14 = 24;
                    break;
                }
                case 220: {
                    n14 = 218;
                    break;
                }
                case 221: {
                    n14 = 248;
                    break;
                }
                case 222: {
                    n14 = 117;
                    break;
                }
                case 223: {
                    n14 = 6;
                    break;
                }
                case 224: {
                    n14 = 176;
                    break;
                }
                case 225: {
                    n14 = 244;
                    break;
                }
                case 226: {
                    n14 = 137;
                    break;
                }
                case 227: {
                    n14 = 175;
                    break;
                }
                case 228: {
                    n14 = 113;
                    break;
                }
                case 229: {
                    n14 = 97;
                    break;
                }
                case 230: {
                    n14 = 9;
                    break;
                }
                case 231: {
                    n14 = 44;
                    break;
                }
                case 232: {
                    n14 = 79;
                    break;
                }
                case 233: {
                    n14 = 106;
                    break;
                }
                case 234: {
                    n14 = 126;
                    break;
                }
                case 235: {
                    n14 = 162;
                    break;
                }
                case 236: {
                    n14 = 110;
                    break;
                }
                case 237: {
                    n14 = 61;
                    break;
                }
                case 238: {
                    n14 = 53;
                    break;
                }
                case 239: {
                    n14 = 245;
                    break;
                }
                case 240: {
                    n14 = 128;
                    break;
                }
                case 241: {
                    n14 = 73;
                    break;
                }
                case 242: {
                    n14 = 154;
                    break;
                }
                case 243: {
                    n14 = 181;
                    break;
                }
                case 244: {
                    n14 = 60;
                    break;
                }
                case 245: {
                    n14 = 224;
                    break;
                }
                case 246: {
                    n14 = 68;
                    break;
                }
                case 247: {
                    n14 = 45;
                    break;
                }
                case 248: {
                    n14 = 219;
                    break;
                }
                case 249: {
                    n14 = 28;
                    break;
                }
                case 250: {
                    n14 = 18;
                    break;
                }
                case 251: {
                    n14 = 76;
                    break;
                }
                case 252: {
                    n14 = 185;
                    break;
                }
                case 253: {
                    n14 = 190;
                    break;
                }
                case 254: {
                    n14 = 142;
                    break;
                }
                default: {
                    n14 = 98;
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
            w_1.j[n12] = new String(cArray).intern();
        }
        return j[n12];
    }
}

