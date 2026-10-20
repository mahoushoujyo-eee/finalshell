/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class UR {
    public InetAddress s;
    public int f;
    public P z;
    public o__0 e;
    public br_1 l;
    public br_2 J;
    long C;
    QI Y;
    int P;
    private boolean F;
    long w;
    long k;
    static Random o = new Random();
    int v;
    private LinkedBlockingQueue q;
    public B2 B;
    public boolean T;
    public boolean a;
    public boolean K;
    public boolean H;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public UR(QI qI, InetAddress inetAddress, int n10, int n11, int n12, B2 b2) throws Exception {
        UR uR2;
        block10: {
            this.F = true;
            this.w = System.currentTimeMillis();
            this.k = 0L;
            this.q = new LinkedBlockingQueue();
            this.T = false;
            this.a = false;
            this.K = false;
            this.H = false;
            this.B = b2;
            this.Y = qI;
            this.s = inetAddress;
            String[] stringArray = QI.N();
            this.f = n10;
            this.P = n11;
            if (n11 != 1) {
                // empty if block
            }
            this.v = n12;
            try {
                this.z = new P(this);
                this.e = new o__0(this);
                this.l = new br_1(this);
                uR2 = this;
                if (stringArray == null) break block10;
                uR2.J = new br_2(this);
                if (n11 == 2) {
                    qI.m().i(this);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.F = false;
                this.Y.n.remove(n12);
                exception.printStackTrace();
                UR uR3 = this;
                synchronized (uR3) {
                    this.notifyAll();
                }
                throw exception;
            }
            uR2 = this;
        }
        UR uR4 = uR2;
        synchronized (uR2) {
            this.notifyAll();
            // ** MonitorExit[var8_9] (shouldn't be in output)
            return;
        }
    }

    public DatagramPacket u(int n10) throws InterruptedException {
        DatagramPacket datagramPacket = (DatagramPacket)this.q.take();
        return datagramPacket;
    }

    public String toString() {
        return new String(this.s + ":" + this.f);
    }

    public boolean V() {
        return this.F;
    }

    public void Z() {
        block5: {
            UR uR2;
            block6: {
                boolean bl;
                block4: {
                    String[] stringArray = QI.N();
                    bl = this.T;
                    if (stringArray == null) break block4;
                    if (bl) break block5;
                    this.T = true;
                    uR2 = this;
                    if (stringArray == null) break block6;
                    bl = uR2.H;
                }
                if (!bl) {
                    this.z.F();
                }
                uR2 = this;
            }
            uR2.R(false);
        }
    }

    public void d() {
        block3: {
            UR uR2;
            block2: {
                String[] stringArray = QI.N();
                uR2 = this;
                if (stringArray == null) break block2;
                if (uR2.a) break block3;
                this.a = true;
                uR2 = this;
            }
            uR2.R(false);
        }
    }

    public void R(boolean bl) {
        block3: {
            UR uR2;
            block6: {
                block7: {
                    boolean bl2;
                    block4: {
                        block5: {
                            String[] stringArray;
                            block2: {
                                stringArray = QI.N();
                                bl2 = this.K;
                                if (stringArray == null) break block2;
                                if (bl2) break block3;
                                bl2 = this.T;
                            }
                            if (stringArray == null) break block4;
                            if (!bl2) break block5;
                            uR2 = this;
                            if (stringArray == null) break block6;
                            if (uR2.a) break block7;
                        }
                        bl2 = bl;
                    }
                    if (!bl2) break block3;
                }
                this.K = true;
                this.F = false;
                this.J.O();
                this.l.r();
                this.z.w();
                this.e.J();
                this.Y.X(this);
                uR2 = this;
            }
            uR2.B.O(this);
        }
    }

    public void D() {
    }

    void g() {
        this.w = System.currentTimeMillis();
    }
}

