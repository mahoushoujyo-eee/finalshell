/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/*
 * Renamed from Qu
 */
public class qu_0 {
    InetAddress s;
    String M;
    int F;
    InetAddress l;
    int r;
    int a;
    B2 P;
    static Random U;
    QI m;
    DatagramSocket T;
    boolean n = true;
    int y = (int)d;
    FO K;
    int B = -1;
    HashMap b = new HashMap();
    public HashMap c = new HashMap();
    boolean V = false;
    static int Y;
    static int w;
    int q = -1;
    Object t = new Object();
    HashSet A = new HashSet();
    ArrayList p = new ArrayList();
    boolean N = false;
    Object f = new Object();
    private static final long d;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3564761179627992480L;
        d = 0xAA44D56DECD0A640L ^ l2;
        U = new Random();
        Y = 0;
    }

    qu_0(QI qI, FO fO2, InetAddress inetAddress, int n10, int n11, B2 b2) {
        this.m = qI;
        this.K = fO2;
        this.l = inetAddress;
        this.r = n10;
        this.a = n11;
        this.P = b2;
        try {
            this.T = new DatagramSocket();
            this.T.setSoTimeout(this.y);
        }
        catch (SocketException socketException) {
            socketException.printStackTrace();
        }
        QI.U.execute(new z6(this));
    }

    void T() {
        block3: {
            qu_0 qu_02;
            block2: {
                String[] stringArray = QI.N();
                qu_02 = this;
                if (stringArray == null) break block2;
                if (qu_02.V) break block3;
                this.T.close();
                this.n = false;
                qu_02 = this;
            }
            qu_02.T.close();
        }
    }

    void K(DatagramPacket datagramPacket) {
        ++this.B;
        byte[] byArray = new byte[datagramPacket.getLength()];
        System.arraycopy(datagramPacket.getData(), 0, byArray, 0, datagramPacket.getLength());
        this.W(byArray, this.B);
        this.m.e.p(this, this.B);
    }

    void O(String string, int n10) {
        this.M = string;
        this.F = n10;
    }

    public void W(byte[] byArray, int n10) {
        block3: {
            byte[] byArray2;
            qu_0 qu_02;
            block2: {
                long l2 = System.nanoTime();
                String[] stringArray = QI.N();
                wr_0 wr_02 = new wr_0(this.a, this.m.q, n10, byArray);
                this.c.put(n10, wr_02);
                qu_02 = this;
                byArray2 = wr_02.B();
                if (stringArray == null) break block2;
                qu_02.k(byArray2);
                if (!yh_0.Y) break block3;
                qu_02 = this;
                byArray2 = wr_02.B();
            }
            qu_02.k(byArray2);
        }
        uy_0 uy_02 = new uy_0("", U.nextLong(), byArray.length, uy_0.T);
        QI.V(uy_02);
    }

    public void k(int n10) {
        wr_0 wr_02 = (wr_0)this.c.get(n10);
        if (wr_02 != null) {
            this.W(wr_02.M(), wr_02.i());
        }
    }

    public void H() {
        we_0 we_02 = new we_0(this.a, this.m.q, this.M, this.F);
        this.k(we_02.f());
    }

    void k(byte[] byArray) {
        DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
        datagramPacket.setAddress(this.l);
        datagramPacket.setPort(this.r);
        try {
            this.P.P(datagramPacket);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    void J(wr_0 wr_02) {
        DatagramPacket datagramPacket = new DatagramPacket(wr_02.M(), wr_02.M().length);
        datagramPacket.setAddress(this.s);
        datagramPacket.setPort(this.F);
        try {
            this.T.send(datagramPacket);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void D(DatagramPacket datagramPacket) {
        Object object = this.t;
        synchronized (object) {
            WC wC;
            short s2;
            int n10;
            String[] stringArray;
            block17: {
                int n11;
                block18: {
                    qu_0 qu_02;
                    int n12;
                    block19: {
                        block20: {
                            qu_0 qu_03;
                            block22: {
                                block23: {
                                    qu_0 qu_04;
                                    block24: {
                                        block25: {
                                            int n13;
                                            block21: {
                                                stringArray = QI.N();
                                                int n14 = ca_1.I(datagramPacket);
                                                n11 = ca_1.m(datagramPacket);
                                                if (stringArray == null) return;
                                                if (n14 != yh_0.i) return;
                                                n10 = n11;
                                                s2 = D6.nw;
                                                if (stringArray != null) {
                                                    if (n10 == s2) {
                                                        wC = new we_0(datagramPacket);
                                                        QI.U.execute(new BC(this, (we_0)wC));
                                                        if (stringArray != null) return;
                                                    }
                                                    n10 = n11;
                                                    s2 = D6.nr;
                                                }
                                                if (stringArray != null) {
                                                    if (n10 == s2) return;
                                                    n10 = n11;
                                                    s2 = D6.L;
                                                }
                                                if (stringArray == null) break block17;
                                                if (n10 != s2) break block18;
                                                wC = new wr_0(datagramPacket);
                                                n12 = ((wr_0)wC).i();
                                                qu_02 = this;
                                                if (stringArray == null) break block19;
                                                if (qu_02.A.contains(n12)) break block20;
                                                n13 = datagramPacket.getLength();
                                                if (stringArray == null) break block21;
                                                if (n13 > w) {
                                                    w = datagramPacket.getLength();
                                                }
                                                qu_03 = this;
                                                if (stringArray == null) break block22;
                                                n13 = qu_03.N ? 1 : 0;
                                            }
                                            if (n13 != 0) break block23;
                                            qu_04 = this;
                                            if (stringArray == null) break block24;
                                            if (qu_04.m.g != 2) break block25;
                                            qu_0 qu_05 = this;
                                            if (stringArray != null) {
                                                if (qu_05.s == null) {
                                                    Object object2 = this.f;
                                                    synchronized (object2) {
                                                        this.p.add(wC);
                                                    }
                                                    return;
                                                }
                                                this.X();
                                                qu_05 = this;
                                            }
                                            qu_05.J((wr_0)wC);
                                            if (stringArray != null) break block20;
                                        }
                                        qu_04 = this;
                                    }
                                    qu_04.K.a(((wr_0)wC).M());
                                    if (stringArray != null) break block20;
                                }
                                this.b.put(n12, wC);
                                qu_03 = this;
                            }
                            qu_03.b();
                        }
                        qu_02 = this;
                    }
                    qu_02.m.T.d(this, n12);
                    if (stringArray != null) return;
                }
                n10 = n11;
                s2 = D6.T;
            }
            if (n10 != s2) return;
            wC = new WA(datagramPacket);
            ArrayList arrayList = ((WA)wC).Z();
            int n15 = 0;
            boolean bl = true;
            do {
                if (bl && !(bl = false) && stringArray != null) continue;
                int n16 = (Integer)arrayList.get(n15);
                this.c.remove(n16);
                ++n15;
            } while (n15 < arrayList.size());
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void b() {
        var2_1 = this.t;
        synchronized (var2_1) {
            var1_2 = QI.N();
            var3_3 = this.q + 1;
            if (var1_2 != null) ** GOTO lbl32
            block3: while (true) {
                v0 /* !! */  = this.b.get(var3_3);
                do {
                    block12: {
                        block10: {
                            block11: {
                                var4_4 = (wr_0)v0 /* !! */ ;
                                v1 = this;
                                if (var1_2 == null) break block10;
                                if (v1.m.g != 2) break block11;
                                v2 = this;
                                if (var1_2 != null) {
                                    if (v2.s == null) {
                                        return;
                                    }
                                    v2 = this;
                                }
                                v2.J(var4_4);
                                if (var1_2 != null) break block12;
                            }
                            v1 = this;
                        }
                        v1.K.a(var4_4.M());
                    }
                    this.b.remove(var3_3);
                    this.A.add(var3_3);
                    ++this.q;
                    var3_3 = this.q + 1;
lbl32:
                    // 2 sources

                    if (this.b.containsKey(var3_3)) continue block3;
                    v0 /* !! */  = var2_1;
                } while (var1_2 == null);
                break;
            }
            // ** MonitorExit[v0 /* !! */ ] (shouldn't be in output)
            return;
        }
    }

    public void F(ArrayList arrayList) {
        WA wA = new WA(this.a, arrayList, 0, this.a, this.m.q);
        wA.K(this.l);
        wA.S(this.r);
        try {
            this.P.P(wA.H());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void X() {
        block5: {
            var1_1 = QI.N();
            v0 = this.p;
            if (var1_1 == null) break block5;
            if (v0.size() <= 0) ** GOTO lbl26
            v0 = this.f;
        }
        var2_2 = v0;
        synchronized (v0) {
            var4_3 = this.p.iterator();
            if (var1_1 != null) ** GOTO lbl17
            block3: while (true) {
                v1 /* !! */  = var4_3.next();
                do {
                    var3_4 = (wr_0)v1 /* !! */ ;
                    this.J(var3_4);
lbl17:
                    // 2 sources

                    if (var4_3.hasNext()) continue block3;
                    this.p.clear();
                    v1 /* !! */  = var2_2;
                } while (var1_1 == null);
                break;
            }
            // ** MonitorExit[v1 /* !! */ ] (shouldn't be in output)
lbl26:
            // 2 sources

            return;
        }
    }

    public boolean I() {
        return this.n;
    }

    public void m(boolean bl) {
        this.n = bl;
    }

    public wr_0 g(int n10) {
        return (wr_0)this.c.get(n10);
    }
}

