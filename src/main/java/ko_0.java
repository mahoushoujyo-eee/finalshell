/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from Ko
 */
class ko_0
extends Thread {
    final la_1 c;
    private static final long a;

    ko_0(la_1 la_12) {
        this.c = la_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void run() {
        var1_1 = qm_0.J();
        block44: while (true) {
            var2_2 = null;
            try {
                var2_2 = (DatagramPacket)this.c.Q.take();
            }
            catch (InterruptedException var3_3) {
                var3_3.printStackTrace();
            }
            do lbl-1000:
            // 3 sources

            {
                block65: {
                    block60: {
                        block62: {
                            block61: {
                                block64: {
                                    block63: {
                                        block75: {
                                            block74: {
                                                block72: {
                                                    block56: {
                                                        block57: {
                                                            block71: {
                                                                block58: {
                                                                    block59: {
                                                                        block55: {
                                                                            block54: {
                                                                                block52: {
                                                                                    block53: {
                                                                                        block68: {
                                                                                            block67: {
                                                                                                block50: {
                                                                                                    block51: {
                                                                                                        try {
                                                                                                            if (var2_2 == null && var1_1 != null) continue block44;
                                                                                                        }
                                                                                                        catch (InterruptedException v0) {
                                                                                                            throw ko_0.a(v0);
                                                                                                        }
                                                                                                        var3_4 = System.currentTimeMillis();
                                                                                                        var5_5 = var2_2.getData();
                                                                                                        var6_6 = 0;
                                                                                                        v1 = var2_2.getData().length;
                                                                                                        if (var1_1 == null) break block50;
                                                                                                        try {
                                                                                                            block66: {
                                                                                                                if (v1 >= 4) break block51;
                                                                                                                break block66;
                                                                                                                catch (InterruptedException v2) {
                                                                                                                    throw ko_0.a(v2);
                                                                                                                }
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        catch (InterruptedException v3) {
                                                                                                            throw ko_0.a(v3);
                                                                                                        }
                                                                                                    }
                                                                                                    v1 = ym_2.y(var2_2);
                                                                                                }
                                                                                                if (var1_1 != null) {
                                                                                                    var6_6 = v1;
                                                                                                    if (var2_2 == null) continue block44;
                                                                                                    v1 = cn_1.m(var5_5, 4);
                                                                                                }
                                                                                                var7_7 = v1;
                                                                                                var8_8 = cn_1.m(var5_5, (int)ko_0.a);
                                                                                                v4 = this.c.W.contains(var7_7);
                                                                                                if (var1_1 == null) break block52;
                                                                                                if (v4 == 0) break block53;
                                                                                                break block67;
                                                                                                catch (InterruptedException v5) {
                                                                                                    throw ko_0.a(v5);
                                                                                                }
                                                                                            }
                                                                                            v4 = var7_7;
                                                                                            if (var1_1 == null) break block52;
                                                                                            break block68;
                                                                                            catch (InterruptedException v6) {
                                                                                                throw ko_0.a(v6);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block69: {
                                                                                                if (v4 == 0) break block53;
                                                                                                break block69;
                                                                                                catch (InterruptedException v7) {
                                                                                                    throw ko_0.a(v7);
                                                                                                }
                                                                                            }
                                                                                            if (var1_1 != null) continue block44;
                                                                                        }
                                                                                        catch (InterruptedException v8) {
                                                                                            throw ko_0.a(v8);
                                                                                        }
                                                                                    }
                                                                                    v4 = var6_6;
                                                                                }
                                                                                v9 = BN.y;
                                                                                if (var1_1 == null) break block54;
                                                                                try {
                                                                                    block70: {
                                                                                        if (v4 == v9) break block55;
                                                                                        break block70;
                                                                                        catch (InterruptedException v10) {
                                                                                            throw ko_0.a(v10);
                                                                                        }
                                                                                    }
                                                                                    v4 = var6_6;
                                                                                    v9 = BN.I;
                                                                                }
                                                                                catch (InterruptedException v11) {
                                                                                    throw ko_0.a(v11);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var1_1 == null) break block56;
                                                                                if (v4 != v9) break block57;
                                                                            }
                                                                            catch (InterruptedException v12) {
                                                                                throw ko_0.a(v12);
                                                                            }
                                                                        }
                                                                        var9_9 = null;
                                                                        try {
                                                                            v13 = this.c.i;
                                                                            v14 = 2;
                                                                            if (var1_1 == null) break block58;
                                                                            if (v13 != v14) break block59;
                                                                        }
                                                                        catch (InterruptedException v15) {
                                                                            throw ko_0.a(v15);
                                                                        }
                                                                        var9_9 = this.c.e.d(var8_8, var2_2.getAddress(), var2_2.getPort());
                                                                        break block71;
                                                                    }
                                                                    v13 = this.c.i;
                                                                    v14 = 1;
                                                                }
                                                                if (v13 == v14) {
                                                                    var10_11 = var2_2.getAddress().getHostAddress() + ":" + var2_2.getPort();
                                                                    var11_13 = Math.abs(var10_11.hashCode());
                                                                    var9_9 = this.c.e.d(var11_13, var2_2.getAddress(), var2_2.getPort());
                                                                }
                                                            }
                                                            var9_9.g(var2_2);
                                                            if (var1_1 != null) continue block44;
                                                        }
                                                        v4 = this.c.i;
                                                        v9 = 1;
                                                    }
                                                    if (var1_1 == null) break block60;
                                                    if (v4 != v9) break block61;
                                                    break block72;
                                                    catch (InterruptedException v16) {
                                                        throw ko_0.a(v16);
                                                    }
                                                }
                                                try {
                                                    block73: {
                                                        v4 = (int)this.c.k.contains(var8_8);
                                                        if (var1_1 == null) break block62;
                                                        break block73;
                                                        catch (InterruptedException v17) {
                                                            throw ko_0.a(v17);
                                                        }
                                                    }
                                                    if (v4 != 0) break block61;
                                                }
                                                catch (InterruptedException v18) {
                                                    throw ko_0.a(v18);
                                                }
                                                var9_9 = var2_2.getAddress().getHostAddress() + ":" + var2_2.getPort();
                                                var10_12 = Math.abs(var9_9.hashCode());
                                                var11_14 = this.c.e.d(var10_12, var2_2.getAddress(), var2_2.getPort());
                                                v19 = var11_14.L();
                                                v20 = -1;
                                                if (var1_1 == null) break block63;
                                                if (v19 != v20) ** GOTO lbl154
                                                break block74;
                                                catch (InterruptedException v21) {
                                                    throw ko_0.a(v21);
                                                }
                                            }
                                            var11_14.F(var8_8);
                                            if (var1_1 != null) break block64;
                                            break block75;
                                            catch (InterruptedException v22) {
                                                throw ko_0.a(v22);
                                            }
                                        }
                                        try {
                                            block76: {
                                                v19 = var11_14.L();
                                                if (var1_1 == null) break block61;
                                                break block76;
                                                catch (InterruptedException v23) {
                                                    throw ko_0.a(v23);
                                                }
                                            }
                                            v20 = var8_8;
                                        }
                                        catch (InterruptedException v24) {
                                            throw ko_0.a(v24);
                                        }
                                    }
                                    try {
                                        if (v19 != v20) {
                                            var11_14.Q(var8_8);
                                        }
                                    }
                                    catch (InterruptedException v25) {
                                        throw ko_0.a(v25);
                                    }
                                }
                                v19 = (int)this.c.k.add(var8_8);
                            }
                            try {
                                v26 /* !! */  = this.c;
                                if (var1_1 == null) break block65;
                                v4 = v26 /* !! */ .i;
                            }
                            catch (InterruptedException v27) {
                                throw ko_0.a(v27);
                            }
                        }
                        v9 = 2;
                    }
                    if (v4 == v9) {
                        try {
                            this.c.A(var2_2.getAddress(), var2_2.getPort(), var7_7, var8_8);
                        }
                        catch (Exception var9_10) {
                            var9_10.printStackTrace();
                        }
                    }
                    v26 /* !! */  = this.c.O.get(var7_7);
                }
                var9_9 = (qm_0)v26 /* !! */ ;
                if (var1_1 == null) ** GOTO lbl-1000
                if (var9_9 == null) continue block44;
                var10_11 = var2_2;
                var9_9.j.t((DatagramPacket)var10_11);
            } while (var1_1 == null);
            if (var6_6 != BN.B) continue;
            var11_15 = new cr_2("", this.c.G.nextLong(), var2_2.getLength(), cr_2.Z);
            la_1.F(var11_15);
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4083705893910090027L;
        a = 0xAD64BC9BC5AE1123L ^ l2;
    }
}

