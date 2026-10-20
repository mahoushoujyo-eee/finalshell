/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.icmp4j.j;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KV {
    public boolean Z;
    public long K_;
    private long U;
    private long l;
    private long KP;
    private long b;
    private long KM;
    private long q;
    long K0;
    long KQ;
    long Kr;
    long W;
    public ArrayList Kx;
    public ArrayList y;
    ArrayList KT;
    int Ko;
    ArrayList Q;
    int K6;
    int H;
    int j;
    String L;
    String Y;
    float i;
    float Kw;
    float F;
    long KA;
    long N;
    long K9;
    long Ki;
    float Kn;
    float v;
    ArrayList Ke;
    ty_0 KU;
    zh_0 O;
    String X;
    String x;
    String Kc;
    boolean I;
    int c;
    ArrayList C;
    private HashMap r;
    private HashMap B;
    private HashMap Kq;
    HashMap o;
    HashMap t;
    public ArrayList e;
    ui_1 KR;
    ui_1 z;
    ArrayList s;
    ArrayList k;
    ArrayList M;
    HashMap KX;
    String KN;
    String Kk;
    List S;
    public static int d;
    public static int A;
    public static int R;
    int K3;
    U E;
    _y_0 Ky;
    ArrayList J;
    HashMap Kt;
    HashMap w;
    HashMap KV;
    String K;
    public String P;
    public String T;
    public String K7;
    public String h;
    public String KF;
    public String G;
    public String u;
    public String a;
    public ArrayList f;
    public float K4;
    public float Ka;
    public float D;
    public float KE;
    public float n;
    public float g;
    public float p;
    public float m;
    private static String[] V;
    private static final long[] ab;
    private static final Integer[] bb;

    public KV() {
        this.Z = false;
        this.Kx = new ArrayList();
        this.y = new ArrayList();
        this.KT = new ArrayList();
        this.Q = new ArrayList();
        this.H = KV.a(24028, 8752817068883030092L);
        this.j = KV.a(31136, 8576188376594519091L);
        this.Y = "";
        this.Ke = new ArrayList();
        this.I = false;
        this.c = 0;
        this.C = new ArrayList();
        this.r = new HashMap();
        this.B = new HashMap();
        this.Kq = new HashMap();
        this.o = new HashMap();
        this.t = new HashMap();
        this.e = new ArrayList();
        this.z = null;
        this.s = new ArrayList();
        this.k = new ArrayList();
        this.M = new ArrayList();
        this.KX = new HashMap();
        this.S = new ArrayList();
        this.K3 = KV.d;
        this.J = new ArrayList();
        this.Kt = new HashMap();
        this.w = new HashMap();
        this.KV = new HashMap();
        this.f = new ArrayList();
        this.m = -1.0f;
    }

    public void I(String string, bo_2 bo_22) {
        ((HashMap)this.KV).put(string, bo_22);
    }

    public bo_2 b(String string) {
        return (bo_2)((HashMap)this.KV).get(string);
    }

    public void w(String string, ArrayList arrayList) {
        ((HashMap)this.Kt).put(string, arrayList);
        ((HashMap)this.w).put(string, System.currentTimeMillis());
    }

    public void L(String string) {
        ((HashMap)this.Kt).remove(string);
    }

    public ArrayList F(String string) {
        return (ArrayList)((HashMap)this.Kt).get(string);
    }

    public Long R(String string) {
        return (Long)((HashMap)this.w).get(string);
    }

    public void Y() {
        ((HashMap)this.Kt).clear();
    }

    public ui_1 h(String string) {
        ui_1 ui_12;
        block5: {
            ui_1 ui_13 = null;
            String[] stringArray = KV.b();
            Iterator iterator = ((ArrayList)this.e).iterator();
            while (iterator.hasNext()) {
                ui_1 ui_14;
                ui_12 = ui_14 = (ui_1)iterator.next();
                if (stringArray != null) break block5;
                if (stringArray == null) {
                    String string2;
                    try {
                        string2 = (String)ui_12.U();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (string2.equals(string)) {
                        ui_1 ui_15 = ui_13 = ui_14;
                    }
                }
                if (stringArray == null) continue;
            }
            ui_12 = ui_13;
        }
        return ui_12;
    }

    public synchronized u8_0 m(int n10) {
        u8_0 u8_02 = (u8_0)((HashMap)this.r).get(n10);
        String[] stringArray = KV.b();
        u8_0 u8_03 = u8_02;
        if (stringArray == null) {
            if (u8_03 == null) {
                u8_02 = new u8_0();
                try {
                    u8_02.W(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((HashMap)this.r).put(n10, u8_02);
            }
            u8_03 = u8_02;
        }
        return u8_03;
    }

    public synchronized boolean m(int n10) {
        return ((HashMap)this.r).containsKey(n10);
    }

    public synchronized void H(int n10) {
        ((HashMap)this.r).remove(n10);
    }

    public HashMap E() {
        return (HashMap)this.r;
    }

    public synchronized HashMap h() {
        return (HashMap)((HashMap)this.r).clone();
    }

    public void w() {
        ((ArrayList)this.KT).clear();
        ((ArrayList)this.Kx).clear();
        ((ArrayList)this.y).clear();
        ((ArrayList)this.Ke).clear();
        ((HashMap)this.r).clear();
        ((HashMap)this.B).clear();
        ((HashMap)this.o).clear();
        ((HashMap)this.t).clear();
        ((HashMap)this.Kq).clear();
        ((ArrayList)this.s).clear();
        ((ArrayList)this.k).clear();
        ((ArrayList)this.M).clear();
        ((HashMap)this.KX).clear();
        try {
            yt_1.F.W((Object)new VW(this), KV.a(5184, 8510190696092334545L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public long w() {
        return this.U;
    }

    public synchronized void l(long l2) {
        block8: {
            long l3;
            String[] stringArray;
            block10: {
                int n10;
                block9: {
                    this.U = l2;
                    String[] stringArray2 = KV.b();
                    ((ArrayList)this.Kx).add(this.U);
                    stringArray = stringArray2;
                    n10 = ((ArrayList)this.Kx).size();
                    if (stringArray != null) break block9;
                    if (n10 > this.H) {
                        ((ArrayList)this.Kx).remove(0);
                    }
                    l3 = this.U;
                    if (stringArray != null) break block10;
                    long l4 = l3 - this.KP;
                    n10 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                }
                if (n10 > 0) {
                    this.KP = this.U;
                }
                l3 = 0L;
            }
            long l5 = l3;
            Iterator iterator = ((ArrayList)this.Kx).iterator();
            while (iterator.hasNext()) {
                long l6 = (Long)iterator.next();
                l5 += l6;
                if (stringArray == null) {
                    if (stringArray == null) continue;
                }
                break block8;
            }
            this.KM = l5 / (long)((ArrayList)this.Kx).size();
        }
    }

    public long r() {
        return this.l;
    }

    public synchronized void t(j j2) {
        block10: {
            int n10;
            String[] stringArray;
            block13: {
                block14: {
                    block11: {
                        block12: {
                            String[] stringArray2 = KV.b();
                            ((ArrayList)this.KT).add(j2);
                            stringArray = stringArray2;
                            n10 = ((ArrayList)this.KT).size();
                            if (stringArray == null) {
                                if (n10 > this.j) {
                                    ((ArrayList)this.KT).remove(0);
                                }
                                n10 = this.I ? 1 : 0;
                            }
                            if (stringArray != null) break block11;
                            if (n10 != 0) break block12;
                            n10 = j2.q() ? 1 : 0;
                            if (stringArray != null) break block13;
                            if (n10 == 0) break block14;
                            this.Ko = j2.r();
                            if (stringArray == null) break block14;
                        }
                        n10 = j2.r();
                    }
                    if (stringArray != null) break block13;
                    if (n10 >= 0) {
                        this.Ko = j2.r();
                    }
                }
                n10 = 0;
            }
            int n11 = n10;
            for (j j3 : (ArrayList)this.KT) {
                if (stringArray == null) {
                    if (j3.r() < 0) {
                        ++n11;
                    }
                    if (stringArray == null) continue;
                }
                break block10;
            }
            this.c = n11;
        }
    }

    public synchronized void V(long l2) {
        block8: {
            long l3;
            String[] stringArray;
            block10: {
                int n10;
                block9: {
                    this.l = l2;
                    String[] stringArray2 = KV.b();
                    ((ArrayList)this.y).add(this.l);
                    stringArray = stringArray2;
                    n10 = ((ArrayList)this.y).size();
                    if (stringArray != null) break block9;
                    if (n10 > this.H) {
                        ((ArrayList)this.y).remove(0);
                    }
                    l3 = this.l;
                    if (stringArray != null) break block10;
                    long l4 = l3 - this.b;
                    n10 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                }
                if (n10 > 0) {
                    this.b = this.l;
                }
                l3 = 0L;
            }
            long l5 = l3;
            Iterator iterator = ((ArrayList)this.y).iterator();
            while (iterator.hasNext()) {
                long l6 = (Long)iterator.next();
                l5 += l6;
                if (stringArray == null) {
                    if (stringArray == null) continue;
                }
                break block8;
            }
            this.q = l5 / (long)((ArrayList)this.y).size();
        }
    }

    public ArrayList h() {
        return (ArrayList)this.Kx;
    }

    public synchronized ArrayList L() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList)this.Kx);
        return arrayList;
    }

    public synchronized ArrayList Y() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList)this.y);
        return arrayList;
    }

    public synchronized ArrayList e() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList)this.KT);
        return arrayList;
    }

    public ArrayList X() {
        return (ArrayList)this.KT;
    }

    public void a(ArrayList arrayList) {
        this.KT = arrayList;
    }

    public void y() {
        this.W = 0L;
        this.Kr = 0L;
        this.KQ = 0L;
        this.K0 = 0L;
    }

    public ArrayList I() {
        return (ArrayList)this.y;
    }

    public void A(ArrayList arrayList) {
        this.y = arrayList;
    }

    public String l() {
        return (String)this.L;
    }

    public void m(String string) {
        this.L = string;
    }

    public long z() {
        return this.K0;
    }

    public void M(long l2) {
        this.K0 = l2;
    }

    public long J() {
        return this.KQ;
    }

    public void z(long l2) {
        this.KQ = l2;
    }

    public long e() {
        return this.Kr;
    }

    public void w(long l2) {
        this.Kr = l2;
    }

    public long M() {
        return this.W;
    }

    public void v(long l2) {
        this.W = l2;
    }

    public float b() {
        return this.i;
    }

    public void g(float f10) {
        this.i = f10;
    }

    public long m() {
        return this.KA;
    }

    public void g(long l2) {
        this.KA = l2;
    }

    public long b() {
        return this.K9;
    }

    public void f(long l2) {
        this.K9 = l2;
    }

    public float V() {
        return this.Kn;
    }

    public void S(float f10) {
        this.Kn = f10;
    }

    public float g() {
        return this.Kw;
    }

    public void x(float f10) {
        this.Kw = f10;
    }

    public float P() {
        return this.F;
    }

    public void K(float f10) {
        this.F = f10;
    }

    public int A() {
        return this.Ko;
    }

    public void W(int n10) {
        this.Ko = n10;
    }

    public ArrayList K() {
        return (ArrayList)this.Ke;
    }

    public void W(ArrayList arrayList) {
        this.Ke = arrayList;
    }

    public ty_0 O() {
        return (ty_0)this.KU;
    }

    public void U(ty_0 ty_02) {
        this.KU = ty_02;
    }

    public zh_0 K() {
        return (zh_0)this.O;
    }

    public void l(zh_0 zh_02) {
        this.O = zh_02;
    }

    public String S() {
        return (String)this.X;
    }

    public void g(String string) {
        this.X = string;
    }

    public String v() {
        return (String)this.x;
    }

    public void N(String string) {
        this.x = string;
    }

    public String D() {
        return (String)this.Kc;
    }

    public void z(String string) {
        this.Kc = string;
    }

    public boolean g() {
        return this.I;
    }

    public void s(boolean bl) {
        this.I = bl;
    }

    public int B() {
        return this.c;
    }

    public void t(int n10) {
        this.c = n10;
    }

    public ArrayList Q() {
        return (ArrayList)this.C;
    }

    public void Q(ArrayList arrayList) {
        this.C = arrayList;
    }

    public int i() {
        return ((HashMap)this.r).size();
    }

    public HashMap T() {
        return (HashMap)this.B;
    }

    public void K(HashMap hashMap) {
        this.B = hashMap;
    }

    public HashMap W() {
        return (HashMap)this.Kq;
    }

    public void k(HashMap hashMap) {
        this.Kq = hashMap;
    }

    public long G() {
        return this.KP;
    }

    public void H(long l2) {
        this.KP = l2;
    }

    public long v() {
        return this.b;
    }

    public void F(long l2) {
        this.b = l2;
    }

    public long I() {
        return this.KM;
    }

    public void W(long l2) {
        this.KM = l2;
    }

    public long k() {
        return this.q;
    }

    public void U(long l2) {
        this.q = l2;
    }

    public HashMap Y() {
        return (HashMap)this.o;
    }

    public void Y(HashMap hashMap) {
        this.o = hashMap;
    }

    public HashMap f() {
        return (HashMap)this.t;
    }

    public void H(HashMap hashMap) {
        this.t = hashMap;
    }

    public ArrayList E() {
        return (ArrayList)this.e;
    }

    public ui_1 b() {
        return (ui_1)this.KR;
    }

    public void j(ui_1 ui_12) {
        this.KR = ui_12;
    }

    public ui_1 I() {
        return (ui_1)this.z;
    }

    public void x(ui_1 ui_12) {
        this.z = ui_12;
    }

    public float O() {
        return this.v;
    }

    public void b(float f10) {
        this.v = f10;
    }

    public long S() {
        return this.N;
    }

    public void i(long l2) {
        this.N = l2;
    }

    public long p() {
        return this.Ki;
    }

    public void E(long l2) {
        this.Ki = l2;
    }

    public String V() {
        return (String)this.Y;
    }

    public void t(String string) {
        this.Y = string;
    }

    public ArrayList b() {
        return (ArrayList)this.s;
    }

    public void J(ArrayList arrayList) {
        this.s = arrayList;
    }

    public ArrayList s() {
        return (ArrayList)this.k;
    }

    public void E(ArrayList arrayList) {
        this.k = arrayList;
    }

    public ArrayList N() {
        return (ArrayList)this.M;
    }

    public void q(ArrayList arrayList) {
        this.M = arrayList;
    }

    public HashMap Z() {
        return (HashMap)this.KX;
    }

    public void s(HashMap hashMap) {
        this.KX = hashMap;
    }

    public ArrayList z() {
        return (ArrayList)this.Q;
    }

    public void v(ArrayList arrayList) {
        this.Q = arrayList;
    }

    public int U() {
        return this.K6;
    }

    public void e(int n10) {
        this.K6 = n10;
    }

    public String N() {
        return (String)this.KN;
    }

    public void x(String string) {
        this.KN = string;
    }

    public String C() {
        return (String)this.Kk;
    }

    public void P(String string) {
        this.Kk = string;
    }

    public List Y() {
        return (List)this.S;
    }

    public void P(List list) {
        this.S = list;
    }

    public int X() {
        return this.K3;
    }

    public void G(int n10) {
        this.K3 = n10;
    }

    public _y_0 C() {
        return (_y_0)this.Ky;
    }

    public void O(_y_0 _y_02) {
        this.Ky = _y_02;
    }

    public U h() {
        return (U)this.E;
    }

    public void E(U u10) {
        this.E = u10;
    }

    public ArrayList M() {
        return (ArrayList)this.J;
    }

    public void T(ArrayList arrayList) {
        this.J = arrayList;
    }

    public String Z() {
        return (String)this.K;
    }

    public void s(String string) {
        this.K = string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2640909237110135954L;
                var6_1 = new long[4];
                KV.W(null);
                var3_2 = 0;
                var4_3 = "f\u00b5N2\u00e2\u0095\u00a6\u00ab\u00af\u0094\u00ff\u0018o@\u00ed\u00f2";
                var5_4 = "f\u00b5N2\u00e2\u0095\u00a6\u00ab\u00af\u0094\u00ff\u0018o@\u00ed\u00f2".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00d2\u00b2m\u00abP?I\u008d,rf\u0013\u001f0\u0001\u00e3";
                    var5_4 = "\u00d2\u00b2m\u00abP?I\u008d,rf\u0013\u001f0\u0001\u00e3".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl39:
                // 1 sources

                ** continue;
            }
        }
        KV.ab = var6_1;
        KV.bb = new Integer[4];
        KV.d = 0;
        KV.A = 1;
        KV.R = KV.a(12513, 7343562933933137267L);
    }

    public static void W(String[] stringArray) {
        V = stringArray;
    }

    public static String[] b() {
        return V;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6D91;
        if (bb[n11] == null) {
            KV.bb[n11] = (int)(ab[n11] ^ l2);
        }
        return bb[n11];
    }
}

