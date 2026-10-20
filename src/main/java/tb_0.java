/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Renamed from Tb
 */
public class tb_0
implements Runnable {
    boolean C = false;
    Object S = new Object();
    long E = 0L;
    LinkedBlockingQueue X = new LinkedBlockingQueue();

    public tb_0() {
        la_1.b.execute(this);
    }

    public void x(qm_0 qm_02, int n10) {
        lq_0 lq_02 = new lq_0(qm_02, n10);
        lq_02.q(this.z(qm_02));
        this.X.add(lq_02);
    }

    long z(qm_0 qm_02) {
        int n10;
        block3: {
            int n11;
            block2: {
                n10 = qm_02.d.s + (int)((float)qm_02.d.s * cs_0.P);
                ky_2[] ky_2Array = qm_0.J();
                n11 = n10;
                if (ky_2Array == null) break block2;
                if (n11 >= cs_0.C) break block3;
                n11 = cs_0.C;
            }
            n10 = n11;
        }
        long l2 = System.currentTimeMillis() + (long)n10;
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var1_1 = qm_0.J();
        while (true) {
            try {
                block19: while (true) {
                    block25: {
                        block23: {
                            block27: {
                                block24: {
                                    block29: {
                                        block28: {
                                            block21: {
                                                block22: {
                                                    var2_2 = (lq_0)this.X.take();
                                                    if (!var2_2.V.Z()) break block25;
                                                    var3_4 = var2_2.V() - System.currentTimeMillis();
                                                    if (var1_1 == null) break block21;
                                                    try {
                                                        block26: {
                                                            if (var3_4 <= 0L) break block22;
                                                            break block26;
                                                            catch (InterruptedException v0) {
                                                                throw tb_0.a(v0);
                                                            }
                                                        }
                                                        Thread.sleep(var3_4);
                                                    }
                                                    catch (InterruptedException v1) {
                                                        throw tb_0.a(v1);
                                                    }
                                                }
                                                var2_2.g();
                                            }
                                            v2 = var2_2;
                                            if (var1_1 == null) break block27;
                                            if (v2.V.J.Y(var2_2.h) == null) break block24;
                                            break block28;
                                            catch (InterruptedException v3) {
                                                throw tb_0.a(v3);
                                            }
                                        }
                                        v4 = (int)var2_2.V.Q;
                                        if (var1_1 == null) break block23;
                                        break block29;
                                        catch (InterruptedException v5) {
                                            throw tb_0.a(v5);
                                        }
                                    }
                                    try {
                                        block30: {
                                            if (v4 != 0) break block24;
                                            break block30;
                                            catch (InterruptedException v6) {
                                                throw tb_0.a(v6);
                                            }
                                        }
                                        var2_2.V.J.T(var2_2.h, var2_2.H());
                                    }
                                    catch (InterruptedException v7) {
                                        throw tb_0.a(v7);
                                    }
                                }
                                v2 = var2_2;
                            }
                            v4 = v2.H();
                        }
                        if (var1_1 == null) ** GOTO lbl71
                        try {
                            block31: {
                                if (v4 >= cs_0.h) break block25;
                                break block31;
                                catch (InterruptedException v8) {
                                    throw tb_0.a(v8);
                                }
                            }
                            var2_2.q(this.z(var2_2.V));
                            this.X.add(var2_2);
                        }
                        catch (InterruptedException v9) {
                            throw tb_0.a(v9);
                        }
                    }
                    do {
                        v4 = var2_2.V.d.u;
lbl71:
                        // 2 sources

                        if (v4 == 0) continue block19;
                    } while (var1_1 == null);
                    break;
                }
            }
            catch (InterruptedException var2_3) {
                var2_3.printStackTrace();
                continue;
            }
            break;
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

