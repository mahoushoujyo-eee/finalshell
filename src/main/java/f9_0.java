/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from f9
 */
public class f9_0 {
    int J;
    Object f = new Object();
    private HashMap C = new HashMap();
    HashMap X = new HashMap();
    long l = 0L;
    int r;
    int h;
    int V = this.h = (this.r = f9_0.a(16045, 7238709439410119833L));
    int d = -1;
    Object A = new Object();
    long m = 0L;
    long F = 0L;
    long i;
    long j = System.currentTimeMillis();
    Random R = new Random();
    HashMap x = new HashMap();
    public int s = f9_0.a(5465, 6098055134163079018L);
    int v = -1;
    long w;
    long L;
    int c = 0;
    la_1 S;
    InetAddress U;
    int p;
    public HashMap N = new HashMap();
    Object T = new Object();
    Object P = new Object();
    String D;
    public tb_0 z = new tb_0();
    boolean u = false;
    private static final String[] a;
    private static final String[] b;
    private static final long[] e;
    private static final Integer[] g;
    private static final long[] k;
    private static final Long[] n;

    f9_0(la_1 la_12, int n10, InetAddress inetAddress, int n11) {
        this.J = n10;
        this.S = la_12;
        this.U = inetAddress;
        this.p = n11;
    }

    public void g(DatagramPacket datagramPacket) {
        block4: {
            String string;
            block8: {
                block7: {
                    ky_2[] ky_2Array;
                    block6: {
                        block5: {
                            vb_0 vb_02;
                            short s2;
                            int n10;
                            block2: {
                                int n11;
                                block3: {
                                    byte[] byArray = datagramPacket.getData();
                                    ky_2Array = qm_0.J();
                                    n11 = 0;
                                    n11 = ym_2.y(datagramPacket);
                                    int n12 = cn_1.m(byArray, f9_0.a(25484, 6311079077445302713L));
                                    n10 = n11;
                                    s2 = BN.y;
                                    if (ky_2Array == null) break block2;
                                    if (n10 != s2) break block3;
                                    vb_02 = new V_(datagramPacket);
                                    this.g(((V_)vb_02).m(), datagramPacket.getAddress(), datagramPacket.getPort());
                                    this.V = ((V_)vb_02).K() * f9_0.a(25882, 921940702012407597L);
                                    if (ky_2Array != null) break block4;
                                }
                                n10 = n11;
                                s2 = BN.I;
                            }
                            if (n10 != s2) break block4;
                            vb_02 = new vf_0(datagramPacket);
                            this.j = System.currentTimeMillis();
                            Long l2 = (Long)this.x.get(((vf_0)vb_02).R());
                            if (ky_2Array == null) break block5;
                            if (l2 == null) break block4;
                            this.s = (int)(System.currentTimeMillis() - l2);
                        }
                        string = "";
                        if (ky_2Array == null) break block6;
                        if (!this.S.h()) break block7;
                        string = f9_0.a(3490, 14104);
                    }
                    if (ky_2Array != null) break block8;
                }
                string = f9_0.a(3489, 15871);
            }
            int n13 = datagramPacket.getPort();
            String string2 = datagramPacket.getAddress().getHostAddress();
            int n14 = this.s;
            String string3 = string;
            lx_2.u(f9_0.a(3491, -407) + string3 + " " + n14 + f9_0.a(3488, -26445) + string2 + ":" + n13);
        }
    }

    public void l(DatagramPacket datagramPacket) throws IOException {
        this.S.H(datagramPacket);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(qm_0 qm_02) {
        Object object = this.T;
        synchronized (object) {
            this.N.put(qm_02.W, qm_02);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void g(qm_0 qm_02) {
        Object object = this.T;
        synchronized (object) {
            this.N.remove(qm_02.W);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q() {
        ky_2[] ky_2Array = qm_0.J();
        this.u = true;
        this.S.e.J(this.J);
        Object object = this.T;
        synchronized (object) {
            ky_2[] ky_2Array2 = ky_2Array;
            Iterator iterator = this.J();
            boolean bl = true;
            block3: while (true) {
                if (!bl || (bl = false) || ky_2Array2 == null) {
                    qm_0 qm_02 = (qm_0)this.N.get(iterator.next());
                    if (qm_02 != null) {
                        la_1.b.execute(new DL(this, qm_02));
                    }
                }
                do {
                    if (iterator.hasNext()) continue block3;
                    // MONITOREXIT @DISABLED, blocks:[0, 1, 3, 4] lbl17 : MonitorExitStatement: MONITOREXIT : var2_1
                } while (ky_2Array2 == null);
                break;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Iterator J() {
        TQ tQ = null;
        Object object = this.T;
        synchronized (object) {
            tQ = new TQ(this.N.keySet().iterator());
        }
        return tQ;
    }

    public void Q(int n10) {
        this.v = n10;
        this.C.clear();
        this.X.clear();
    }

    public void W(qm_0 qm_02) {
    }

    public void I() {
        int n10 = Math.abs(this.R.nextInt());
        long l2 = System.currentTimeMillis();
        this.x.put(n10, l2);
        this.i = System.currentTimeMillis();
        V_ v_2 = new V_(0, this.S.K, n10, la_1.R, la_1.E);
        v_2.D(this.U);
        v_2.A(this.p);
        try {
            this.l(v_2.S());
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void g(int n10, InetAddress inetAddress, int n11) {
        vf_0 vf_02 = new vf_0(0, this.S.K, n10);
        vf_02.D(inetAddress);
        vf_02.A(n11);
        try {
            this.l(vf_02.S());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void i(V_ v_2) {
        block3: {
            block2: {
                ky_2[] ky_2Array = qm_0.J();
                f9_0 f9_02 = this;
                if (ky_2Array == null) break block2;
                if (f9_02.S.i != 2) break block3;
                f9_02 = this;
            }
            f9_02.V = v_2.K() * f9_0.a(25230, 2390998495623870648L);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    fr_0 A(int n10) {
        fr_0 fr_02 = null;
        Object object = this.A;
        synchronized (object) {
            ky_2[] ky_2Array = qm_0.J();
            fr_02 = (fr_0)this.C.get(n10);
            Object object2 = fr_02;
            if (ky_2Array != null) {
                if (object2 == null) {
                    fr_02 = new fr_0();
                    fr_02.H(n10);
                    this.C.put(n10, fr_02);
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return fr_02;
        }
    }

    public int M() {
        long l2 = System.currentTimeMillis();
        ky_2[] ky_2Array = qm_0.J();
        long l3 = this.l - 0L;
        int n10 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (ky_2Array != null) {
            if (n10 == 0) {
                this.l = l2;
            }
            n10 = (int)((l2 - this.l) / f9_0.b(24656, 5434401913817642932L));
        }
        long l4 = n10;
        return (int)l4;
    }

    public int B(long l2) {
        int n10 = (int)((l2 - this.l) / f9_0.b(8574, 8834631273517315739L));
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void l(long var1_1, int var3_2) {
        block32: {
            block34: {
                block35: {
                    block36: {
                        block40: {
                            block33: {
                                block31: {
                                    block29: {
                                        block30: {
                                            block27: {
                                                block28: {
                                                    var4_3 = qm_0.J();
                                                    v0 = this.S.i;
                                                    if (var4_3 == null) break block27;
                                                    try {
                                                        block37: {
                                                            if (v0 != 1) break block28;
                                                            break block37;
                                                            catch (InterruptedException v1) {
                                                                throw f9_0.a(v1);
                                                            }
                                                        }
                                                        this.V = la_1.E;
                                                    }
                                                    catch (InterruptedException v2) {
                                                        throw f9_0.a(v2);
                                                    }
                                                }
                                                v0 = (cfr_temp_0 = this.m - 0L) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                            }
                                            if (var4_3 == null) break block29;
                                            try {
                                                block38: {
                                                    if (v0 != 0) break block30;
                                                    break block38;
                                                    catch (InterruptedException v3) {
                                                        throw f9_0.a(v3);
                                                    }
                                                }
                                                this.F = var1_1;
                                            }
                                            catch (InterruptedException v4) {
                                                throw f9_0.a(v4);
                                            }
                                        }
                                        try {
                                            this.m += (long)var3_2;
                                            v5 = this.m;
                                            if (var4_3 == null) break block31;
                                            cfr_temp_1 = v5 - f9_0.b(14017, 1618229522977153319L);
                                            v0 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                        }
                                        catch (InterruptedException v6) {
                                            throw f9_0.a(v6);
                                        }
                                    }
                                    try {
                                        if (v0 <= 0) break block32;
                                        v5 = (long)(1.0E9f * (float)this.m / (float)this.V);
                                    }
                                    catch (InterruptedException v7) {
                                        throw f9_0.a(v7);
                                    }
                                }
                                var5_4 = v5;
                                var7_5 = System.nanoTime() - this.F;
                                v8 = var7_5;
                                v9 = var5_4;
                                if (var4_3 == null) break block33;
                                try {
                                    block39: {
                                        if (v8 >= v9) break block34;
                                        break block39;
                                        catch (InterruptedException v10) {
                                            throw f9_0.a(v10);
                                        }
                                    }
                                    v8 = var5_4;
                                    v9 = var7_5;
                                }
                                catch (InterruptedException v11) {
                                    throw f9_0.a(v11);
                                }
                            }
                            var9_6 = v8 - v9;
                            this.w += var9_6;
                            var11_7 = this.L - this.w;
                            v12 = var11_7;
                            v13 = 0L;
                            if (var4_3 == null) break block35;
                            if (v12 <= v13) break block36;
                            break block40;
                            catch (InterruptedException v14) {
                                throw f9_0.a(v14);
                            }
                        }
                        try {
                            block41: {
                                v12 = var9_6;
                                v13 = var11_7;
                                if (var4_3 == null) break block35;
                                break block41;
                                catch (InterruptedException v15) {
                                    throw f9_0.a(v15);
                                }
                            }
                            if (v12 > v13) break block36;
                        }
                        catch (InterruptedException v16) {
                            throw f9_0.a(v16);
                        }
                        var9_6 = 0L;
                        this.L -= var9_6;
                    }
                    v12 = var5_4;
                    v13 = f9_0.b(8939, 4001901885511562505L);
                }
                var13_8 = v12 / v13;
                var15_9 = (int)(var5_4 % f9_0.b(21995, 3850596804484006412L));
                var16_10 = System.nanoTime();
                try {
                    v17 = var9_6;
                    if (var4_3 != null) {
                        if (v17 <= 0L) break block34;
                    }
                    ** GOTO lbl110
                }
                catch (InterruptedException v18) {
                    throw f9_0.a(v18);
                }
                try {
                    v17 = var13_8;
lbl110:
                    // 2 sources

                    Thread.sleep(v17, var15_9);
                }
                catch (InterruptedException var18_11) {
                    var18_11.printStackTrace();
                }
                this.L += System.nanoTime() - var16_10;
            }
            this.m = 0L;
        }
    }

    public Object V() {
        return this.f;
    }

    public void P(Object object) {
        this.f = object;
    }

    public void q(int n10) {
        this.J = n10;
    }

    public int L() {
        return this.v;
    }

    public void F(int n10) {
        this.v = n10;
        this.j = System.currentTimeMillis();
    }

    public long Y() {
        return this.i;
    }

    public void I(long l2) {
        this.i = l2;
    }

    public long A() {
        return this.j;
    }

    public void B(long l2) {
        this.j = l2;
    }

    public String P() {
        return this.D;
    }

    public void U(String string) {
        this.D = string;
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
                                var21 = new String[4];
                                var19_1 = 0;
                                var18_2 = "\u00cf\u00f9\u000f\u0006\u0082\u001e\u00a83\u0081\u00d3";
                                var20_3 = "\u00cf\u00f9\u000f\u0006\u0082\u001e\u00a83\u0081\u00d3".length();
                                var17_4 = 3;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 83;
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
                                    var18_2 = "\u00dd8_\u0003\u00d1\u0082\u0095";
                                    var20_3 = "\u00dd8_\u0003\u00d1\u0082\u0095".length();
                                    var17_4 = 3;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 72;
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
                                            v15 = 115;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 115;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 43;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 15;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 80;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 127;
                                            break;
                                        }
                                        default: {
                                            v15 = 11;
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
                        f9_0.a = var21;
                        f9_0.b = new String[4];
                        var8_7 = 2888358686190476467L;
                        var14_8 = new long[5];
                        var11_9 = 0;
                        var12_10 = "\u00d4wv\u00e3\r g\u009e^a\u00db\u0084\u00b4k`\u000bu\u0084\u00b6\u00d8\u00c2\u00ca\u00e5\u0002";
                        var13_11 = "\u00d4wv\u00e3\r g\u009e^a\u00db\u0084\u00b4k`\u000bu\u0084\u00b6\u00d8\u00c2\u00ca\u00e5\u0002".length();
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
                            var12_10 = "b\u0089\u00f5b\u0002\u0012\u00b8*K\u00eb\u0086k\u00ee\u00c5\u0093#";
                            var13_11 = "b\u0089\u00f5b\u0002\u0012\u00b8*K\u00eb\u0086k\u00ee\u00c5\u0093#".length();
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
                f9_0.e = var14_8;
                f9_0.g = new Integer[5];
                var0_14 = 5292859585783822295L;
                var6_15 = new long[5];
                var3_16 = 0;
                var4_17 = "_\u0001\u0018\u00edJ\u00b0>\u00f0|\u0004\u0012\u00a4P#7\u009b\u0002\u001e\u00dc\u007fWg\u00c3\u008b";
                var5_18 = "_\u0001\u0018\u00edJ\u00b0>\u00f0|\u0004\u0012\u00a4P#7\u009b\u0002\u001e\u00dc\u007fWg\u00c3\u008b".length();
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
                    var4_17 = "3\u00ee\u00e9\u0095\u00fb$\u0002\u00a4~\u00fd\u009fO\u00f7D\u00c0\u009e";
                    var5_18 = "3\u00ee\u00e9\u0095\u00fb$\u0002\u00a4~\u00fd\u009fO\u00f7D\u00c0\u009e".length();
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
        f9_0.k = var6_15;
        f9_0.n = new Long[5];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xDA2) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 12;
                case 1 -> 67;
                case 2 -> 245;
                case 3 -> 63;
                case 4 -> 59;
                case 5 -> 73;
                case 6 -> 231;
                case 7 -> 249;
                case 8 -> 101;
                case 9 -> 102;
                case 10 -> 223;
                case 11 -> 156;
                case 12 -> 47;
                case 13 -> 36;
                case 14 -> 121;
                case 15 -> 139;
                case 16 -> 159;
                case 17 -> 197;
                case 18 -> 202;
                case 19 -> 193;
                case 20 -> 107;
                case 21 -> 175;
                case 22 -> 182;
                case 23 -> 184;
                case 24 -> 133;
                case 25 -> 13;
                case 26 -> 5;
                case 27 -> 225;
                case 28 -> 29;
                case 29 -> 118;
                case 30 -> 110;
                case 31 -> 78;
                case 32 -> 185;
                case 33 -> 6;
                case 34 -> 141;
                case 35 -> 212;
                case 36 -> 104;
                case 37 -> 207;
                case 38 -> 167;
                case 39 -> 177;
                case 40 -> 187;
                case 41 -> 0;
                case 42 -> 8;
                case 43 -> 222;
                case 44 -> 111;
                case 45 -> 10;
                case 46 -> 53;
                case 47 -> 43;
                case 48 -> 115;
                case 49 -> 148;
                case 50 -> 195;
                case 51 -> 124;
                case 52 -> 94;
                case 53 -> 2;
                case 54 -> 214;
                case 55 -> 130;
                case 56 -> 232;
                case 57 -> 198;
                case 58 -> 4;
                case 59 -> 235;
                case 60 -> 136;
                case 61 -> 81;
                case 62 -> 62;
                case 63 -> 157;
                case 64 -> 52;
                case 65 -> 49;
                case 66 -> 108;
                case 67 -> 24;
                case 68 -> 71;
                case 69 -> 31;
                case 70 -> 150;
                case 71 -> 88;
                case 72 -> 76;
                case 73 -> 219;
                case 74 -> 186;
                case 75 -> 145;
                case 76 -> 106;
                case 77 -> 32;
                case 78 -> 98;
                case 79 -> 137;
                case 80 -> 14;
                case 81 -> 153;
                case 82 -> 200;
                case 83 -> 253;
                case 84 -> 119;
                case 85 -> 41;
                case 86 -> 158;
                case 87 -> 196;
                case 88 -> 72;
                case 89 -> 248;
                case 90 -> 192;
                case 91 -> 171;
                case 92 -> 116;
                case 93 -> 79;
                case 94 -> 152;
                case 95 -> 154;
                case 96 -> 45;
                case 97 -> 227;
                case 98 -> 205;
                case 99 -> 209;
                case 100 -> 201;
                case 101 -> 44;
                case 102 -> 155;
                case 103 -> 189;
                case 104 -> 211;
                case 105 -> 22;
                case 106 -> 99;
                case 107 -> 151;
                case 108 -> 132;
                case 109 -> 138;
                case 110 -> 160;
                case 111 -> 199;
                case 112 -> 85;
                case 113 -> 75;
                case 114 -> 221;
                case 115 -> 233;
                case 116 -> 170;
                case 117 -> 234;
                case 118 -> 237;
                case 119 -> 38;
                case 120 -> 60;
                case 121 -> 70;
                case 122 -> 57;
                case 123 -> 77;
                case 124 -> 123;
                case 125 -> 228;
                case 126 -> 176;
                case 127 -> 183;
                case 128 -> 218;
                case 129 -> 15;
                case 130 -> 51;
                case 131 -> 178;
                case 132 -> 250;
                case 133 -> 20;
                case 134 -> 80;
                case 135 -> 90;
                case 136 -> 230;
                case 137 -> 58;
                case 138 -> 87;
                case 139 -> 39;
                case 140 -> 224;
                case 141 -> 83;
                case 142 -> 190;
                case 143 -> 18;
                case 144 -> 114;
                case 145 -> 144;
                case 146 -> 19;
                case 147 -> 238;
                case 148 -> 95;
                case 149 -> 35;
                case 150 -> 86;
                case 151 -> 48;
                case 152 -> 143;
                case 153 -> 112;
                case 154 -> 142;
                case 155 -> 117;
                case 156 -> 64;
                case 157 -> 229;
                case 158 -> 127;
                case 159 -> 30;
                case 160 -> 46;
                case 161 -> 251;
                case 162 -> 163;
                case 163 -> 56;
                case 164 -> 210;
                case 165 -> 61;
                case 166 -> 217;
                case 167 -> 173;
                case 168 -> 140;
                case 169 -> 134;
                case 170 -> 179;
                case 171 -> 68;
                case 172 -> 161;
                case 173 -> 188;
                case 174 -> 149;
                case 175 -> 246;
                case 176 -> 244;
                case 177 -> 168;
                case 178 -> 91;
                case 179 -> 191;
                case 180 -> 180;
                case 181 -> 122;
                case 182 -> 9;
                case 183 -> 206;
                case 184 -> 181;
                case 185 -> 135;
                case 186 -> 220;
                case 187 -> 37;
                case 188 -> 128;
                case 189 -> 23;
                case 190 -> 164;
                case 191 -> 93;
                case 192 -> 243;
                case 193 -> 42;
                case 194 -> 89;
                case 195 -> 103;
                case 196 -> 147;
                case 197 -> 162;
                case 198 -> 50;
                case 199 -> 165;
                case 200 -> 55;
                case 201 -> 255;
                case 202 -> 16;
                case 203 -> 11;
                case 204 -> 129;
                case 205 -> 33;
                case 206 -> 236;
                case 207 -> 28;
                case 208 -> 69;
                case 209 -> 169;
                case 210 -> 26;
                case 211 -> 194;
                case 212 -> 242;
                case 213 -> 25;
                case 214 -> 74;
                case 215 -> 226;
                case 216 -> 120;
                case 217 -> 92;
                case 218 -> 216;
                case 219 -> 54;
                case 220 -> 3;
                case 221 -> 166;
                case 222 -> 7;
                case 223 -> 208;
                case 224 -> 109;
                case 225 -> 203;
                case 226 -> 241;
                case 227 -> 100;
                case 228 -> 131;
                case 229 -> 204;
                case 230 -> 40;
                case 231 -> 105;
                case 232 -> 252;
                case 233 -> 215;
                case 234 -> 96;
                case 235 -> 113;
                case 236 -> 97;
                case 237 -> 240;
                case 238 -> 247;
                case 239 -> 125;
                case 240 -> 34;
                case 241 -> 239;
                case 242 -> 21;
                case 243 -> 254;
                case 244 -> 126;
                case 245 -> 174;
                case 246 -> 65;
                case 247 -> 172;
                case 248 -> 84;
                case 249 -> 213;
                case 250 -> 1;
                case 251 -> 82;
                case 252 -> 27;
                case 253 -> 146;
                case 254 -> 66;
                default -> 17;
            };
            int n15 = (n11 & 0xFF) - n14;
            if (n15 < 0) {
                n15 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n14) < 0) {
                n13 += 256;
            }
            int n16 = 0;
            while (n16 < cArray.length) {
                int n17 = n16 % 2;
                int n18 = n16;
                char[] cArray2 = cArray;
                char c2 = cArray[n18];
                if (n17 == 0) {
                    cArray2[n18] = (char)(c2 ^ n15);
                    n15 = ((n15 >>> 3 | n15 << 5) ^ cArray[n16]) & 0xFF;
                } else {
                    cArray2[n18] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n16]) & 0xFF;
                }
                ++n16;
            }
            f9_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1A37;
        if (g[n11] == null) {
            f9_0.g[n11] = (int)(e[n11] ^ l2);
        }
        return g[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x57E6) & Short.MAX_VALUE;
        if (n[n11] == null) {
            f9_0.n[n11] = k[n11] ^ l2;
        }
        return n[n11];
    }
}

