/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Renamed from mo
 */
public class mo_0
implements Runnable {
    boolean Y = false;
    Object n = new Object();
    long J = 0L;
    LinkedBlockingQueue r = new LinkedBlockingQueue();
    LinkedBlockingQueue A = new LinkedBlockingQueue();
    private static final long a;

    public mo_0() {
        QI.U.execute(this);
        QI.U.execute(new UE(this));
    }

    public void T(UR uR2, int n10) {
        LJ lJ = new LJ(uR2, n10);
        lJ.C(this.t(uR2));
        this.r.add(lJ);
    }

    long t(UR uR2) {
        int n10;
        block3: {
            int n11;
            block2: {
                n10 = uR2.B.E + (int)((float)uR2.B.E * yh_0.o);
                String[] stringArray = QI.N();
                n11 = n10;
                if (stringArray == null) break block2;
                if (n11 >= yh_0.g) break block3;
                n11 = yh_0.g;
            }
            n10 = n11;
        }
        long l2 = System.currentTimeMillis() + (long)n10;
        return l2;
    }

    long g(UR uR2) {
        long l2 = System.currentTimeMillis() + a;
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var1_1 = QI.N();
        while (true) {
            try {
                block21: while (true) {
                    block25: {
                        block31: {
                            block30: {
                                block29: {
                                    block28: {
                                        block27: {
                                            block24: {
                                                block23: {
                                                    var2_2 = (LJ)this.r.take();
                                                    if (!var2_2.t.V()) break block25;
                                                    var3_4 = var2_2.J() - System.currentTimeMillis();
                                                    v0 = var3_4;
                                                    if (var1_1 == null) break block23;
                                                    try {
                                                        block26: {
                                                            if (v0 <= 0L) break block24;
                                                            break block26;
                                                            catch (InterruptedException v1) {
                                                                throw mo_0.a(v1);
                                                            }
                                                        }
                                                        v0 = var3_4;
                                                    }
                                                    catch (InterruptedException v2) {
                                                        throw mo_0.a(v2);
                                                    }
                                                }
                                                Thread.sleep(v0);
                                            }
                                            v3 = var2_2.t;
                                            if (var1_1 == null) ** GOTO lbl78
                                            if (v3.z.e(var2_2.r) == null) break block25;
                                            break block27;
                                            catch (InterruptedException v4) {
                                                throw mo_0.a(v4);
                                            }
                                        }
                                        v5 = var2_2.t.H;
                                        if (var1_1 == null) ** GOTO lbl79
                                        break block28;
                                        catch (InterruptedException v6) {
                                            throw mo_0.a(v6);
                                        }
                                    }
                                    if (v5) break block25;
                                    break block29;
                                    catch (InterruptedException v7) {
                                        throw mo_0.a(v7);
                                    }
                                }
                                var2_2.J();
                                var2_2.t.z.u(var2_2.r, var2_2.l());
                                v8 = var2_2.l();
                                if (var1_1 == null) break block25;
                                break block30;
                                catch (InterruptedException v9) {
                                    throw mo_0.a(v9);
                                }
                            }
                            if (v8 >= yh_0.X) ** GOTO lbl69
                            break block31;
                            catch (InterruptedException v10) {
                                throw mo_0.a(v10);
                            }
                        }
                        try {
                            block32: {
                                var2_2.C(this.t(var2_2.t));
                                this.r.add(var2_2);
                                if (var1_1 != null) break block25;
                                break block32;
                                catch (InterruptedException v11) {
                                    throw mo_0.a(v11);
                                }
                            }
                            var2_2.C(this.g(var2_2.t));
                            v8 = (int)this.A.add(var2_2);
                        }
                        catch (InterruptedException v12) {
                            throw mo_0.a(v12);
                        }
                    }
                    do {
                        v3 = var2_2.t;
lbl78:
                        // 2 sources

                        v5 = v3.B.m;
lbl79:
                        // 2 sources

                        if (!v5) continue block21;
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void o() {
        var1_1 = QI.N();
        while (true) {
            try {
                block19: while (true) {
                    block23: {
                        block28: {
                            block27: {
                                block26: {
                                    block25: {
                                        block22: {
                                            block21: {
                                                var2_2 = (LJ)this.A.take();
                                                if (!var2_2.t.V()) break block23;
                                                var3_4 = var2_2.J() - System.currentTimeMillis();
                                                v0 = var3_4;
                                                if (var1_1 == null) break block21;
                                                try {
                                                    block24: {
                                                        if (v0 <= 0L) break block22;
                                                        break block24;
                                                        catch (InterruptedException v1) {
                                                            throw mo_0.a(v1);
                                                        }
                                                    }
                                                    v0 = var3_4;
                                                }
                                                catch (InterruptedException v2) {
                                                    throw mo_0.a(v2);
                                                }
                                            }
                                            Thread.sleep(v0);
                                        }
                                        v3 = var2_2.t;
                                        if (var1_1 == null) ** GOTO lbl70
                                        if (v3.z.e(var2_2.r) == null) break block23;
                                        break block25;
                                        catch (InterruptedException v4) {
                                            throw mo_0.a(v4);
                                        }
                                    }
                                    v5 = var2_2.t.H;
                                    if (var1_1 == null) ** GOTO lbl71
                                    break block26;
                                    catch (InterruptedException v6) {
                                        throw mo_0.a(v6);
                                    }
                                }
                                if (v5 != 0) break block23;
                                break block27;
                                catch (InterruptedException v7) {
                                    throw mo_0.a(v7);
                                }
                            }
                            var2_2.J();
                            var2_2.t.z.u(var2_2.r, var2_2.l());
                            v5 = var2_2.l();
                            if (var1_1 == null) ** GOTO lbl71
                            break block28;
                            catch (InterruptedException v8) {
                                throw mo_0.a(v8);
                            }
                        }
                        try {
                            block29: {
                                if (v5 >= yh_0.X + yh_0.q) break block23;
                                break block29;
                                catch (InterruptedException v9) {
                                    throw mo_0.a(v9);
                                }
                            }
                            var2_2.C(this.g(var2_2.t));
                            this.A.add(var2_2);
                        }
                        catch (InterruptedException v10) {
                            throw mo_0.a(v10);
                        }
                    }
                    do {
                        v3 = var2_2.t;
lbl70:
                        // 2 sources

                        v5 = v3.B.m;
lbl71:
                        // 3 sources

                        if (v5 == 0) continue block19;
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

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5663622085784394973L;
        a = 0x4E993A47A53C5F35L ^ l2;
    }
}

