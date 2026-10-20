/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Renamed from Qm
 */
public class qm_0 {
    public InetAddress c;
    public int i;
    public x1 J;
    public D8 j;
    public CU M;
    public tz_2 e;
    long n;
    la_1 u;
    int O;
    private boolean l;
    long N;
    long g;
    static Random D = new Random();
    int W;
    private LinkedBlockingQueue f;
    public f9_0 d;
    public boolean G;
    public boolean s;
    public boolean x;
    public boolean Q;
    private static ky_2[] S;

    static {
        qm_0.F(new ky_2[2]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public qm_0(la_1 la_12, InetAddress inetAddress, int n10, int n11, int n12, f9_0 f9_02) throws Exception {
        qm_0 qm_02;
        block10: {
            this.l = true;
            this.N = System.currentTimeMillis();
            this.g = 0L;
            this.f = new LinkedBlockingQueue();
            this.G = false;
            this.s = false;
            this.x = false;
            this.Q = false;
            this.d = f9_02;
            this.u = la_12;
            this.c = inetAddress;
            this.i = n10;
            ky_2[] ky_2Array = qm_0.J();
            this.O = n11;
            if (n11 != 1) {
                // empty if block
            }
            this.W = n12;
            try {
                this.J = new x1(this);
                this.j = new D8(this);
                this.M = new CU(this);
                qm_02 = this;
                if (ky_2Array == null) break block10;
                qm_02.e = new tz_2(this);
                if (n11 == 2) {
                    la_12.X().S(this);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.l = false;
                this.u.O.remove(n12);
                exception.printStackTrace();
                qm_0 qm_03 = this;
                synchronized (qm_03) {
                    this.notifyAll();
                }
                throw exception;
            }
            qm_02 = this;
        }
        qm_0 qm_04 = qm_02;
        synchronized (qm_02) {
            this.notifyAll();
            // ** MonitorExit[var8_9] (shouldn't be in output)
            return;
        }
    }

    public DatagramPacket X(int n10) throws InterruptedException {
        DatagramPacket datagramPacket = (DatagramPacket)this.f.take();
        return datagramPacket;
    }

    public String toString() {
        return new String(String.valueOf(this.c) + ":" + this.i);
    }

    public boolean Z() {
        return this.l;
    }

    public void l() {
        block5: {
            qm_0 qm_02;
            block6: {
                boolean bl;
                block4: {
                    ky_2[] ky_2Array = qm_0.J();
                    bl = this.G;
                    if (ky_2Array == null) break block4;
                    if (bl) break block5;
                    this.G = true;
                    qm_02 = this;
                    if (ky_2Array == null) break block6;
                    bl = qm_02.Q;
                }
                if (!bl) {
                    this.J.l();
                }
                qm_02 = this;
            }
            qm_02.u(false);
        }
    }

    public void N() {
        block3: {
            qm_0 qm_02;
            block2: {
                ky_2[] ky_2Array = qm_0.J();
                qm_02 = this;
                if (ky_2Array == null) break block2;
                if (qm_02.s) break block3;
                this.s = true;
                qm_02 = this;
            }
            qm_02.u(false);
        }
    }

    public void u(boolean bl) {
        block3: {
            qm_0 qm_02;
            block6: {
                block7: {
                    boolean bl2;
                    block4: {
                        block5: {
                            ky_2[] ky_2Array;
                            block2: {
                                ky_2Array = qm_0.J();
                                bl2 = this.x;
                                if (ky_2Array == null) break block2;
                                if (bl2) break block3;
                                bl2 = this.G;
                            }
                            if (ky_2Array == null) break block4;
                            if (!bl2) break block5;
                            qm_02 = this;
                            if (ky_2Array == null) break block6;
                            if (qm_02.s) break block7;
                        }
                        bl2 = bl;
                    }
                    if (!bl2) break block3;
                }
                this.x = true;
                this.l = false;
                this.e.X();
                this.M.h();
                this.J.I();
                this.j.J();
                this.u.g(this);
                qm_02 = this;
            }
            qm_02.d.g(this);
        }
    }

    public void P() {
    }

    void T() {
        this.N = System.currentTimeMillis();
    }

    public static void F(ky_2[] ky_2Array) {
        S = ky_2Array;
    }

    public static ky_2[] J() {
        return S;
    }
}

