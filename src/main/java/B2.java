/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class B2 {
    int O;
    Object P = new Object();
    long t = 0L;
    int G;
    int u;
    int T = this.u = (this.G = B2.a(28572, 1782366320909803639L));
    int H = -1;
    Object Q = new Object();
    long v = 0L;
    long W = 0L;
    long A;
    long J = System.currentTimeMillis();
    Random n = new Random();
    HashMap F = new HashMap();
    public int E = B2.a(18285, 6620142799166425219L);
    int D = -1;
    long d;
    long M;
    int X = 0;
    QI V;
    InetAddress U;
    int y;
    public HashMap k = new HashMap();
    public HashMap h = new HashMap();
    Object w = new Object();
    Object e = new Object();
    public mo_0 x;
    boolean m = false;
    int C;
    int Z = yh_0.D;
    Object l = new Object();
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] f;
    private static final long[] g;
    private static final Long[] i;

    B2(QI qI, int n10, InetAddress inetAddress, int n11) {
        this.x = new mo_0();
        this.O = n10;
        this.V = qI;
        this.U = inetAddress;
        this.y = n11;
    }

    public void f(DatagramPacket datagramPacket) {
        block4: {
            String string;
            long l2;
            block8: {
                block7: {
                    String[] stringArray;
                    block6: {
                        block5: {
                            WC wC;
                            short s2;
                            int n10;
                            block2: {
                                int n11;
                                block3: {
                                    byte[] byArray = datagramPacket.getData();
                                    stringArray = QI.N();
                                    n11 = 0;
                                    n11 = ca_1.m(datagramPacket);
                                    int n12 = lh_1.z(byArray, B2.a(20666, 8019518855206231891L));
                                    n10 = n11;
                                    s2 = D6.G;
                                    if (stringArray == null) break block2;
                                    if (n10 != s2) break block3;
                                    wC = new wk_0(datagramPacket);
                                    this.D(((wk_0)wC).V(), datagramPacket.getAddress(), datagramPacket.getPort());
                                    this.T = ((wk_0)wC).t() * B2.a(27765, 5246059281212171167L);
                                    if (stringArray != null) break block4;
                                }
                                n10 = n11;
                                s2 = D6.nJ;
                            }
                            if (n10 != s2) break block4;
                            wC = new wo_0(datagramPacket);
                            l2 = this.J;
                            this.J = System.currentTimeMillis();
                            Long l3 = (Long)this.F.get(((wo_0)wC).m());
                            if (stringArray == null) break block5;
                            if (l3 == null) break block4;
                            this.E = (int)(System.currentTimeMillis() - l3);
                        }
                        string = "";
                        if (stringArray == null) break block6;
                        if (!this.V.k()) break block7;
                        string = "tcp";
                    }
                    if (stringArray != null) break block8;
                }
                string = "udp";
            }
            long l4 = (System.currentTimeMillis() - l2) / B2.b(28362, 7458193808466825844L);
            jy_0.g("delay_" + string + " " + this.E + "ms " + l4 + " " + datagramPacket.getAddress().getHostAddress() + ":" + datagramPacket.getPort());
        }
    }

    boolean y() {
        this.K();
        int n10 = 0;
        String[] stringArray = QI.N();
        int n11 = this.C;
        if (stringArray != null) {
            if (n11 < this.Z) {
                n10 = 1;
            }
            jy_0.g("checkWin " + (n10 != 0) + " " + this.C + " " + (this.Z - this.C) + " " + this.Z);
            n11 = n10;
        }
        return n11 != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void J() {
        Object object = this.l;
        synchronized (object) {
            this.l.notifyAll();
        }
    }

    void K() {
    }

    public void P(DatagramPacket datagramPacket) throws IOException {
        this.V.e(datagramPacket);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void z(UR uR2) {
        Object object = this.w;
        synchronized (object) {
            this.k.put(uR2.v, uR2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void e(qu_0 qu_02) {
        Object object = this.e;
        synchronized (object) {
            this.h.put(qu_02.a, qu_02);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void O(UR uR2) {
        Object object = this.w;
        synchronized (object) {
            this.k.remove(uR2.v);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void w() {
        this.m = true;
        String[] stringArray = QI.N();
        this.V.S.e(this.O);
        String[] stringArray2 = stringArray;
        Object object = this.w;
        synchronized (object) {
            Iterator iterator = this.h();
            boolean bl = true;
            block3: while (true) {
                if (!bl || (bl = false) || stringArray2 == null) {
                    UR uR2 = (UR)this.k.get(iterator.next());
                    if (uR2 != null) {
                        QI.U.execute(new VE(this, uR2));
                    }
                }
                do {
                    if (iterator.hasNext()) continue block3;
                    // MONITOREXIT @DISABLED, blocks:[0, 1, 3, 4] lbl17 : MonitorExitStatement: MONITOREXIT : var2_2
                } while (stringArray2 == null);
                break;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Iterator h() {
        gN gN2 = null;
        Object object = this.w;
        synchronized (object) {
            gN2 = new gN(this.k.keySet().iterator());
        }
        return gN2;
    }

    public void F(int n10) {
        this.D = n10;
    }

    public void J(UR uR2) {
    }

    public void h() {
        int n10 = Math.abs(this.n.nextInt());
        long l2 = System.currentTimeMillis();
        this.F.put(n10, l2);
        this.A = System.currentTimeMillis();
        wk_0 wk_02 = new wk_0(0, this.V.q, n10, QI.A, QI.l);
        wk_02.K(this.U);
        wk_02.S(this.y);
        try {
            this.P(wk_02.H());
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void D(int n10, InetAddress inetAddress, int n11) {
        wo_0 wo_02 = new wo_0(0, this.V.q, n10);
        wo_02.K(inetAddress);
        wo_02.S(n11);
        try {
            this.P(wo_02.H());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void b(wk_0 wk_02) {
        block3: {
            block2: {
                String[] stringArray = QI.N();
                B2 b2 = this;
                if (stringArray == null) break block2;
                if (b2.V.g != 2) break block3;
                b2 = this;
            }
            b2.T = wk_02.t() * B2.a(16474, 8803193479454707634L);
        }
    }

    public int v() {
        long l2 = System.currentTimeMillis();
        String[] stringArray = QI.N();
        long l3 = this.t - 0L;
        int n10 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (stringArray != null) {
            if (n10 == 0) {
                this.t = l2;
            }
            n10 = (int)((l2 - this.t) / B2.b(28362, 7458193808466825844L));
        }
        long l4 = n10;
        return (int)l4;
    }

    public int l(long l2) {
        int n10 = (int)((l2 - this.t) / B2.b(14283, 7235391077982440310L));
        return n10;
    }

    void U() {
    }

    void A() {
    }

    /*
     * Loose catch block
     */
    public synchronized void z(long l2, int n10) {
        block31: {
            block33: {
                long l3;
                block36: {
                    block37: {
                        long l4;
                        long l5;
                        long l6;
                        long l7;
                        String[] stringArray;
                        block34: {
                            block35: {
                                long l8;
                                block41: {
                                    long l9;
                                    long l10;
                                    block32: {
                                        long l11;
                                        block30: {
                                            int n11;
                                            block28: {
                                                block29: {
                                                    block26: {
                                                        long l12;
                                                        block27: {
                                                            stringArray = QI.N();
                                                            n11 = this.V.g;
                                                            if (stringArray == null) break block26;
                                                            try {
                                                                block38: {
                                                                    if (n11 != 1) break block27;
                                                                    break block38;
                                                                    catch (InterruptedException interruptedException) {
                                                                        throw B2.a(interruptedException);
                                                                    }
                                                                }
                                                                this.T = QI.l;
                                                            }
                                                            catch (InterruptedException interruptedException) {
                                                                throw B2.a(interruptedException);
                                                            }
                                                        }
                                                        n11 = (l12 = this.v - 0L) == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                                    }
                                                    if (stringArray == null) break block28;
                                                    try {
                                                        block39: {
                                                            if (n11 != 0) break block29;
                                                            break block39;
                                                            catch (InterruptedException interruptedException) {
                                                                throw B2.a(interruptedException);
                                                            }
                                                        }
                                                        this.W = l2;
                                                    }
                                                    catch (InterruptedException interruptedException) {
                                                        throw B2.a(interruptedException);
                                                    }
                                                }
                                                try {
                                                    this.v += (long)n10;
                                                    l11 = this.v;
                                                    if (stringArray == null) break block30;
                                                    long l13 = l11 - B2.b(26040, 7010554670540675335L);
                                                    n11 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                                                }
                                                catch (InterruptedException interruptedException) {
                                                    throw B2.a(interruptedException);
                                                }
                                            }
                                            try {
                                                if (n11 <= 0) break block31;
                                                l11 = (long)(1.0E9f * (float)this.v / (float)this.T);
                                            }
                                            catch (InterruptedException interruptedException) {
                                                throw B2.a(interruptedException);
                                            }
                                        }
                                        l7 = l11;
                                        long l14 = System.nanoTime() - this.W;
                                        l10 = l14;
                                        l9 = l7;
                                        if (stringArray == null) break block32;
                                        try {
                                            block40: {
                                                if (l10 >= l9) break block33;
                                                break block40;
                                                catch (InterruptedException interruptedException) {
                                                    throw B2.a(interruptedException);
                                                }
                                            }
                                            l10 = l7;
                                            l9 = l14;
                                        }
                                        catch (InterruptedException interruptedException) {
                                            throw B2.a(interruptedException);
                                        }
                                    }
                                    l6 = l10 - l9;
                                    this.d += l6;
                                    l8 = this.M - this.d;
                                    l5 = l8;
                                    l4 = 0L;
                                    if (stringArray == null) break block34;
                                    if (l5 <= l4) break block35;
                                    break block41;
                                    catch (InterruptedException interruptedException) {
                                        throw B2.a(interruptedException);
                                    }
                                }
                                try {
                                    block42: {
                                        l5 = l6;
                                        l4 = l8;
                                        if (stringArray == null) break block34;
                                        break block42;
                                        catch (InterruptedException interruptedException) {
                                            throw B2.a(interruptedException);
                                        }
                                    }
                                    if (l5 > l4) break block35;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw B2.a(interruptedException);
                                }
                                l6 = 0L;
                                this.M -= l6;
                            }
                            l5 = l7;
                            l4 = B2.b(4271, 7232786824873683989L);
                        }
                        long l15 = l5 / l4;
                        int n12 = (int)(l7 % B2.b(15957, 3881339011018719977L));
                        long l16 = System.nanoTime();
                        try {
                            l3 = l6;
                            if (stringArray == null) break block36;
                            if (l3 <= 0L) break block37;
                        }
                        catch (InterruptedException interruptedException) {
                            throw B2.a(interruptedException);
                        }
                        try {
                            Thread.sleep(l15, n12);
                        }
                        catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        this.M += System.nanoTime() - l16;
                    }
                    l3 = System.nanoTime();
                }
                long l17 = l3;
            }
            this.v = 0L;
        }
    }

    public Object R() {
        return this.P;
    }

    public void F(Object object) {
        this.P = object;
    }

    public void X(int n10) {
        this.O = n10;
    }

    public int p() {
        return this.D;
    }

    public void S(int n10) {
        this.D = n10;
        this.J = System.currentTimeMillis();
    }

    public long e() {
        return this.A;
    }

    public void w(long l2) {
        this.A = l2;
    }

    public long m() {
        return this.J;
    }

    public void T(long l2) {
        this.J = l2;
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[5];
                                var19_1 = 0;
                                var18_2 = "sLK\u0005\u00d7\u0099\u00f6\u008e!\u0003\u0081\u001c\u00f5\u0003\u00fc\u00b8{";
                                var20_3 = "sLK\u0005\u00d7\u0099\u00f6\u008e!\u0003\u0081\u001c\u00f5\u0003\u00fc\u00b8{".length();
                                var17_4 = 9;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 30;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "L\u00a8\u00f0\u0085(q\u0003\u0015\u000b\u00bf";
                                    var20_3 = "L\u00a8\u00f0\u0085(q\u0003\u0015\u000b\u00bf".length();
                                    var17_4 = 6;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 42;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block34;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 125;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 8;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 61;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 86;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 102;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 118;
                                            break;
                                        }
                                        default: {
                                            v15 = 114;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        B2.a = var21;
                        B2.b = new String[5];
                        var8_7 = 3627703123446481894L;
                        var14_8 = new long[5];
                        var11_9 = 0;
                        var12_10 = "\u00fc\u0018Q\u00cc \u00d0\u00a4y\u00c5b%_\u008e\u00f8\u00a3\u0091\u00ec\u0010p\u00800t\u0088T";
                        var13_11 = "\u00fc\u0018Q\u00cc \u00d0\u00a4y\u00c5b%_\u008e\u00f8\u00a3\u0091\u00ec\u0010p\u00800t\u0088T".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00b5\u00a4\u00bd^\u00ed\u0087\u001c\u00bd:\u00b3\u00c4\u00b456\u008b\u009f";
                            var13_11 = "\u00b5\u00a4\u00bd^\u00ed\u0087\u001c\u00bd:\u00b3\u00c4\u00b456\u008b\u009f".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
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
                B2.c = var14_8;
                B2.f = new Integer[5];
                var0_14 = 6876822664683787206L;
                var6_15 = new long[5];
                var3_16 = 0;
                var4_17 = "8\u00ef\u00b2\u0007\u00a4{\u00c2Z>%\u001f\u0093\u001f\u00ddb\u00c1j\u00b2(\u0083cySo";
                var5_18 = "8\u00ef\u00b2\u0007\u00a4{\u00c2Z>%\u001f\u0093\u001f\u00ddb\u00c1j\u00b2(\u0083cySo".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = ";\u0006$\u001e\u0089\u00f9\u009bX;\u000fd\u008c\u0097b\u00fd\u0093";
                    var5_18 = ";\u0006$\u001e\u0089\u00f9\u009bX;\u000fd\u008c\u0097b\u00fd\u0093".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl166:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl177:
                // 1 sources

                ** continue;
            }
        }
        B2.g = var6_15;
        B2.i = new Long[5];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE210) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 171;
                    break;
                }
                case 1: {
                    n14 = 212;
                    break;
                }
                case 2: {
                    n14 = 63;
                    break;
                }
                case 3: {
                    n14 = 202;
                    break;
                }
                case 4: {
                    n14 = 77;
                    break;
                }
                case 5: {
                    n14 = 169;
                    break;
                }
                case 6: {
                    n14 = 74;
                    break;
                }
                case 7: {
                    n14 = 59;
                    break;
                }
                case 8: {
                    n14 = 210;
                    break;
                }
                case 9: {
                    n14 = 241;
                    break;
                }
                case 10: {
                    n14 = 72;
                    break;
                }
                case 11: {
                    n14 = 223;
                    break;
                }
                case 12: {
                    n14 = 14;
                    break;
                }
                case 13: {
                    n14 = 85;
                    break;
                }
                case 14: {
                    n14 = 152;
                    break;
                }
                case 15: {
                    n14 = 174;
                    break;
                }
                case 16: {
                    n14 = 132;
                    break;
                }
                case 17: {
                    n14 = 76;
                    break;
                }
                case 18: {
                    n14 = 4;
                    break;
                }
                case 19: {
                    n14 = 209;
                    break;
                }
                case 20: {
                    n14 = 124;
                    break;
                }
                case 21: {
                    n14 = 18;
                    break;
                }
                case 22: {
                    n14 = 215;
                    break;
                }
                case 23: {
                    n14 = 104;
                    break;
                }
                case 24: {
                    n14 = 254;
                    break;
                }
                case 25: {
                    n14 = 126;
                    break;
                }
                case 26: {
                    n14 = 178;
                    break;
                }
                case 27: {
                    n14 = 181;
                    break;
                }
                case 28: {
                    n14 = 55;
                    break;
                }
                case 29: {
                    n14 = 82;
                    break;
                }
                case 30: {
                    n14 = 49;
                    break;
                }
                case 31: {
                    n14 = 67;
                    break;
                }
                case 32: {
                    n14 = 110;
                    break;
                }
                case 33: {
                    n14 = 109;
                    break;
                }
                case 34: {
                    n14 = 44;
                    break;
                }
                case 35: {
                    n14 = 75;
                    break;
                }
                case 36: {
                    n14 = 65;
                    break;
                }
                case 37: {
                    n14 = 89;
                    break;
                }
                case 38: {
                    n14 = 226;
                    break;
                }
                case 39: {
                    n14 = 28;
                    break;
                }
                case 40: {
                    n14 = 149;
                    break;
                }
                case 41: {
                    n14 = 10;
                    break;
                }
                case 42: {
                    n14 = 61;
                    break;
                }
                case 43: {
                    n14 = 69;
                    break;
                }
                case 44: {
                    n14 = 243;
                    break;
                }
                case 45: {
                    n14 = 54;
                    break;
                }
                case 46: {
                    n14 = 43;
                    break;
                }
                case 47: {
                    n14 = 189;
                    break;
                }
                case 48: {
                    n14 = 52;
                    break;
                }
                case 49: {
                    n14 = 162;
                    break;
                }
                case 50: {
                    n14 = 252;
                    break;
                }
                case 51: {
                    n14 = 221;
                    break;
                }
                case 52: {
                    n14 = 12;
                    break;
                }
                case 53: {
                    n14 = 131;
                    break;
                }
                case 54: {
                    n14 = 230;
                    break;
                }
                case 55: {
                    n14 = 167;
                    break;
                }
                case 56: {
                    n14 = 34;
                    break;
                }
                case 57: {
                    n14 = 93;
                    break;
                }
                case 58: {
                    n14 = 128;
                    break;
                }
                case 59: {
                    n14 = 84;
                    break;
                }
                case 60: {
                    n14 = 118;
                    break;
                }
                case 61: {
                    n14 = 228;
                    break;
                }
                case 62: {
                    n14 = 141;
                    break;
                }
                case 63: {
                    n14 = 37;
                    break;
                }
                case 64: {
                    n14 = 247;
                    break;
                }
                case 65: {
                    n14 = 41;
                    break;
                }
                case 66: {
                    n14 = 3;
                    break;
                }
                case 67: {
                    n14 = 96;
                    break;
                }
                case 68: {
                    n14 = 114;
                    break;
                }
                case 69: {
                    n14 = 23;
                    break;
                }
                case 70: {
                    n14 = 240;
                    break;
                }
                case 71: {
                    n14 = 79;
                    break;
                }
                case 72: {
                    n14 = 188;
                    break;
                }
                case 73: {
                    n14 = 249;
                    break;
                }
                case 74: {
                    n14 = 219;
                    break;
                }
                case 75: {
                    n14 = 208;
                    break;
                }
                case 76: {
                    n14 = 165;
                    break;
                }
                case 77: {
                    n14 = 180;
                    break;
                }
                case 78: {
                    n14 = 204;
                    break;
                }
                case 79: {
                    n14 = 182;
                    break;
                }
                case 80: {
                    n14 = 105;
                    break;
                }
                case 81: {
                    n14 = 227;
                    break;
                }
                case 82: {
                    n14 = 97;
                    break;
                }
                case 83: {
                    n14 = 140;
                    break;
                }
                case 84: {
                    n14 = 187;
                    break;
                }
                case 85: {
                    n14 = 179;
                    break;
                }
                case 86: {
                    n14 = 95;
                    break;
                }
                case 87: {
                    n14 = 71;
                    break;
                }
                case 88: {
                    n14 = 70;
                    break;
                }
                case 89: {
                    n14 = 38;
                    break;
                }
                case 90: {
                    n14 = 6;
                    break;
                }
                case 91: {
                    n14 = 60;
                    break;
                }
                case 92: {
                    n14 = 51;
                    break;
                }
                case 93: {
                    n14 = 232;
                    break;
                }
                case 94: {
                    n14 = 184;
                    break;
                }
                case 95: {
                    n14 = 197;
                    break;
                }
                case 96: {
                    n14 = 133;
                    break;
                }
                case 97: {
                    n14 = 233;
                    break;
                }
                case 98: {
                    n14 = 237;
                    break;
                }
                case 99: {
                    n14 = 99;
                    break;
                }
                case 100: {
                    n14 = 102;
                    break;
                }
                case 101: {
                    n14 = 135;
                    break;
                }
                case 102: {
                    n14 = 116;
                    break;
                }
                case 103: {
                    n14 = 8;
                    break;
                }
                case 104: {
                    n14 = 225;
                    break;
                }
                case 105: {
                    n14 = 81;
                    break;
                }
                case 106: {
                    n14 = 101;
                    break;
                }
                case 107: {
                    n14 = 145;
                    break;
                }
                case 108: {
                    n14 = 207;
                    break;
                }
                case 109: {
                    n14 = 30;
                    break;
                }
                case 110: {
                    n14 = 199;
                    break;
                }
                case 111: {
                    n14 = 80;
                    break;
                }
                case 112: {
                    n14 = 125;
                    break;
                }
                case 113: {
                    n14 = 39;
                    break;
                }
                case 114: {
                    n14 = 64;
                    break;
                }
                case 115: {
                    n14 = 251;
                    break;
                }
                case 116: {
                    n14 = 222;
                    break;
                }
                case 117: {
                    n14 = 119;
                    break;
                }
                case 118: {
                    n14 = 146;
                    break;
                }
                case 119: {
                    n14 = 191;
                    break;
                }
                case 120: {
                    n14 = 103;
                    break;
                }
                case 121: {
                    n14 = 161;
                    break;
                }
                case 122: {
                    n14 = 253;
                    break;
                }
                case 123: {
                    n14 = 136;
                    break;
                }
                case 124: {
                    n14 = 21;
                    break;
                }
                case 125: {
                    n14 = 220;
                    break;
                }
                case 126: {
                    n14 = 155;
                    break;
                }
                case 127: {
                    n14 = 157;
                    break;
                }
                case 128: {
                    n14 = 90;
                    break;
                }
                case 129: {
                    n14 = 235;
                    break;
                }
                case 130: {
                    n14 = 130;
                    break;
                }
                case 131: {
                    n14 = 17;
                    break;
                }
                case 132: {
                    n14 = 159;
                    break;
                }
                case 133: {
                    n14 = 177;
                    break;
                }
                case 134: {
                    n14 = 138;
                    break;
                }
                case 135: {
                    n14 = 205;
                    break;
                }
                case 136: {
                    n14 = 27;
                    break;
                }
                case 137: {
                    n14 = 245;
                    break;
                }
                case 138: {
                    n14 = 108;
                    break;
                }
                case 139: {
                    n14 = 213;
                    break;
                }
                case 140: {
                    n14 = 42;
                    break;
                }
                case 141: {
                    n14 = 203;
                    break;
                }
                case 142: {
                    n14 = 236;
                    break;
                }
                case 143: {
                    n14 = 198;
                    break;
                }
                case 144: {
                    n14 = 46;
                    break;
                }
                case 145: {
                    n14 = 151;
                    break;
                }
                case 146: {
                    n14 = 172;
                    break;
                }
                case 147: {
                    n14 = 68;
                    break;
                }
                case 148: {
                    n14 = 192;
                    break;
                }
                case 149: {
                    n14 = 5;
                    break;
                }
                case 150: {
                    n14 = 120;
                    break;
                }
                case 151: {
                    n14 = 185;
                    break;
                }
                case 152: {
                    n14 = 47;
                    break;
                }
                case 153: {
                    n14 = 229;
                    break;
                }
                case 154: {
                    n14 = 117;
                    break;
                }
                case 155: {
                    n14 = 121;
                    break;
                }
                case 156: {
                    n14 = 24;
                    break;
                }
                case 157: {
                    n14 = 13;
                    break;
                }
                case 158: {
                    n14 = 144;
                    break;
                }
                case 159: {
                    n14 = 113;
                    break;
                }
                case 160: {
                    n14 = 122;
                    break;
                }
                case 161: {
                    n14 = 36;
                    break;
                }
                case 162: {
                    n14 = 193;
                    break;
                }
                case 163: {
                    n14 = 153;
                    break;
                }
                case 164: {
                    n14 = 32;
                    break;
                }
                case 165: {
                    n14 = 156;
                    break;
                }
                case 166: {
                    n14 = 168;
                    break;
                }
                case 167: {
                    n14 = 195;
                    break;
                }
                case 168: {
                    n14 = 40;
                    break;
                }
                case 169: {
                    n14 = 196;
                    break;
                }
                case 170: {
                    n14 = 173;
                    break;
                }
                case 171: {
                    n14 = 176;
                    break;
                }
                case 172: {
                    n14 = 123;
                    break;
                }
                case 173: {
                    n14 = 94;
                    break;
                }
                case 174: {
                    n14 = 248;
                    break;
                }
                case 175: {
                    n14 = 206;
                    break;
                }
                case 176: {
                    n14 = 214;
                    break;
                }
                case 177: {
                    n14 = 57;
                    break;
                }
                case 178: {
                    n14 = 139;
                    break;
                }
                case 179: {
                    n14 = 164;
                    break;
                }
                case 180: {
                    n14 = 211;
                    break;
                }
                case 181: {
                    n14 = 15;
                    break;
                }
                case 182: {
                    n14 = 9;
                    break;
                }
                case 183: {
                    n14 = 190;
                    break;
                }
                case 184: {
                    n14 = 163;
                    break;
                }
                case 185: {
                    n14 = 48;
                    break;
                }
                case 186: {
                    n14 = 224;
                    break;
                }
                case 187: {
                    n14 = 58;
                    break;
                }
                case 188: {
                    n14 = 56;
                    break;
                }
                case 189: {
                    n14 = 160;
                    break;
                }
                case 190: {
                    n14 = 20;
                    break;
                }
                case 191: {
                    n14 = 201;
                    break;
                }
                case 192: {
                    n14 = 147;
                    break;
                }
                case 193: {
                    n14 = 239;
                    break;
                }
                case 194: {
                    n14 = 127;
                    break;
                }
                case 195: {
                    n14 = 107;
                    break;
                }
                case 196: {
                    n14 = 154;
                    break;
                }
                case 197: {
                    n14 = 106;
                    break;
                }
                case 198: {
                    n14 = 25;
                    break;
                }
                case 199: {
                    n14 = 255;
                    break;
                }
                case 200: {
                    n14 = 78;
                    break;
                }
                case 201: {
                    n14 = 88;
                    break;
                }
                case 202: {
                    n14 = 234;
                    break;
                }
                case 203: {
                    n14 = 137;
                    break;
                }
                case 204: {
                    n14 = 45;
                    break;
                }
                case 205: {
                    n14 = 231;
                    break;
                }
                case 206: {
                    n14 = 53;
                    break;
                }
                case 207: {
                    n14 = 7;
                    break;
                }
                case 208: {
                    n14 = 186;
                    break;
                }
                case 209: {
                    n14 = 73;
                    break;
                }
                case 210: {
                    n14 = 1;
                    break;
                }
                case 211: {
                    n14 = 242;
                    break;
                }
                case 212: {
                    n14 = 62;
                    break;
                }
                case 213: {
                    n14 = 11;
                    break;
                }
                case 214: {
                    n14 = 83;
                    break;
                }
                case 215: {
                    n14 = 158;
                    break;
                }
                case 216: {
                    n14 = 112;
                    break;
                }
                case 217: {
                    n14 = 217;
                    break;
                }
                case 218: {
                    n14 = 86;
                    break;
                }
                case 219: {
                    n14 = 244;
                    break;
                }
                case 220: {
                    n14 = 100;
                    break;
                }
                case 221: {
                    n14 = 142;
                    break;
                }
                case 222: {
                    n14 = 150;
                    break;
                }
                case 223: {
                    n14 = 29;
                    break;
                }
                case 224: {
                    n14 = 50;
                    break;
                }
                case 225: {
                    n14 = 91;
                    break;
                }
                case 226: {
                    n14 = 19;
                    break;
                }
                case 227: {
                    n14 = 246;
                    break;
                }
                case 228: {
                    n14 = 250;
                    break;
                }
                case 229: {
                    n14 = 22;
                    break;
                }
                case 230: {
                    n14 = 66;
                    break;
                }
                case 231: {
                    n14 = 111;
                    break;
                }
                case 232: {
                    n14 = 134;
                    break;
                }
                case 233: {
                    n14 = 26;
                    break;
                }
                case 234: {
                    n14 = 16;
                    break;
                }
                case 235: {
                    n14 = 218;
                    break;
                }
                case 236: {
                    n14 = 170;
                    break;
                }
                case 237: {
                    n14 = 98;
                    break;
                }
                case 238: {
                    n14 = 129;
                    break;
                }
                case 239: {
                    n14 = 87;
                    break;
                }
                case 240: {
                    n14 = 92;
                    break;
                }
                case 241: {
                    n14 = 35;
                    break;
                }
                case 242: {
                    n14 = 2;
                    break;
                }
                case 243: {
                    n14 = 115;
                    break;
                }
                case 244: {
                    n14 = 183;
                    break;
                }
                case 245: {
                    n14 = 148;
                    break;
                }
                case 246: {
                    n14 = 194;
                    break;
                }
                case 247: {
                    n14 = 200;
                    break;
                }
                case 248: {
                    n14 = 175;
                    break;
                }
                case 249: {
                    n14 = 33;
                    break;
                }
                case 250: {
                    n14 = 216;
                    break;
                }
                case 251: {
                    n14 = 143;
                    break;
                }
                case 252: {
                    n14 = 0;
                    break;
                }
                case 253: {
                    n14 = 166;
                    break;
                }
                case 254: {
                    n14 = 31;
                    break;
                }
                default: {
                    n14 = 238;
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
            B2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xFEA;
        if (f[n11] == null) {
            B2.f[n11] = (int)(c[n11] ^ l2);
        }
        return f[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x3CBE) & Short.MAX_VALUE;
        if (i[n11] == null) {
            B2.i[n11] = g[n11] ^ l2;
        }
        return i[n11];
    }
}

