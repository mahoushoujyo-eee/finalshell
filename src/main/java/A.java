/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.lang.reflect.InvocationTargetException;

class A
implements Runnable {
    final Transferable S;
    final km_0 Q;
    final int L;
    final yd_0 f;

    A(yd_0 yd_02, Transferable transferable, km_0 km_02, int n10) {
        this.f = yd_02;
        this.S = transferable;
        this.Q = km_02;
        this.L = n10;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block73: {
            var1_1 = km_0.U();
            try {
                block72: {
                    var2_2 = (Object[])((Transferable)this.S).getTransferData((DataFlavor)this.f.p);
                    try {
                        v0 = this.Q.L(this.L);
                    }
                    catch (InvocationTargetException v1) {
                        throw v1.getTargetException();
                    }
                    var3_4 = v0;
                    v2 = var3_4;
                    if (var1_1 != null) break block72;
                    try {
                        block77: {
                            if (!(v2 instanceof tf_2)) break block73;
                            break block77;
                            catch (Exception v3) {
                                throw A.a(v3);
                            }
                        }
                        v2 = var3_4;
                    }
                    catch (Exception v4) {
                        throw A.a(v4);
                    }
                }
                var4_5 = (tf_2)v2;
                for (Class<?> var8_9 : var2_2) {
                    block76: {
                        block74: {
                            if (var1_1 != null) break block73;
                            try {
                                block78: {
                                    v5 = var8_9.getClass().equals(tf_2.class);
                                    if (var1_1 != null) break block74;
                                    break block78;
                                    catch (Exception v6) {
                                        throw A.a(v6);
                                    }
                                }
                                if (v5) {
                                }
                                ** GOTO lbl115
                            }
                            catch (Exception v7) {
                                throw A.a(v7);
                            }
                            var9_10 /* !! */  = (tf_2)var8_9;
                            try {
                                v8 = this.Q.b();
                            }
                            catch (InvocationTargetException v9) {
                                throw v9.getTargetException();
                            }
                            try {
                                v10 = (zD)v8.s();
                            }
                            catch (InvocationTargetException v11) {
                                throw v11.getTargetException();
                            }
                            var10_11 = v10;
                            try {
                                v12 = var9_10 /* !! */.k();
                            }
                            catch (InvocationTargetException v13) {
                                throw v13.getTargetException();
                            }
                            try {
                                v14 = (String)lk_0.e(v12);
                            }
                            catch (InvocationTargetException v15) {
                                throw v15.getTargetException();
                            }
                            var11_12 = v14;
                            try {
                                try {
                                    v16 = var9_10 /* !! */.k();
                                }
                                catch (InvocationTargetException v17) {
                                    throw v17.getTargetException();
                                }
                                try {
                                    v18 = (String)var4_5.k();
                                }
                                catch (InvocationTargetException v19) {
                                    throw v19.getTargetException();
                                }
                                try {
                                    v20 = (String)var9_10 /* !! */.M();
                                }
                                catch (InvocationTargetException v21) {
                                    throw v21.getTargetException();
                                }
                                try {
                                    var10_11.N(v16, (Object)(v18 + var11_12 + v20));
                                }
                                catch (InvocationTargetException v22) {
                                    throw v22.getTargetException();
                                }
                                try {
                                    v23 = this.Q.t();
                                }
                                catch (InvocationTargetException v24) {
                                    throw v24.getTargetException();
                                }
                                try {
                                    v25 = var9_10 /* !! */.k();
                                }
                                catch (InvocationTargetException v26) {
                                    throw v26.getTargetException();
                                }
                                try {
                                    v27 = var4_5.k();
                                }
                                catch (InvocationTargetException v28) {
                                    throw v28.getTargetException();
                                }
                                try {
                                    v23.w(v25, v27, false);
                                }
                                catch (InvocationTargetException v29) {
                                    throw v29.getTargetException();
                                }
                            }
                            catch (Exception var12_14) {
                                var12_14.printStackTrace();
                            }
                            if (var1_1 == null) continue;
lbl115:
                            // 2 sources

                            try {
                                block79: {
                                    v30 = var8_9.getClass();
                                    if (var1_1 != null) break block76;
                                    break block79;
                                    catch (Exception v31) {
                                        throw A.a(v31);
                                    }
                                }
                                v5 = v30.equals(ck_2.class);
                            }
                            catch (Exception v32) {
                                throw A.a(v32);
                            }
                        }
                        if (!v5) continue;
                        v30 = var8_9;
                    }
                    var9_10 /* !! */  = (ck_2)v30;
                    try {
                        v33 = this.Q.t();
                    }
                    catch (InvocationTargetException v34) {
                        throw v34.getTargetException();
                    }
                    try {
                        v35 = (zD)v33.N();
                    }
                    catch (InvocationTargetException v36) {
                        throw v36.getTargetException();
                    }
                    var10_11 = v35;
                    try {
                        v37 = var9_10 /* !! */.d();
                    }
                    catch (InvocationTargetException v38) {
                        throw v38.getTargetException();
                    }
                    try {
                        v39 = (String)lk_0.e(v37);
                    }
                    catch (InvocationTargetException v40) {
                        throw v40.getTargetException();
                    }
                    var11_12 = v39;
                    try {
                        try {
                            v41 = var9_10 /* !! */.d();
                        }
                        catch (InvocationTargetException v42) {
                            throw v42.getTargetException();
                        }
                        try {
                            v43 = (String)var4_5.k();
                        }
                        catch (InvocationTargetException v44) {
                            throw v44.getTargetException();
                        }
                        try {
                            v45 = (String)var9_10 /* !! */.a();
                        }
                        catch (InvocationTargetException v46) {
                            throw v46.getTargetException();
                        }
                        try {
                            var10_11.N(v41, (Object)(v43 + var11_12 + v45));
                        }
                        catch (InvocationTargetException v47) {
                            throw v47.getTargetException();
                        }
                        try {
                            v48 = this.Q.t();
                        }
                        catch (InvocationTargetException v49) {
                            throw v49.getTargetException();
                        }
                        try {
                            v50 = var9_10 /* !! */.d();
                        }
                        catch (InvocationTargetException v51) {
                            throw v51.getTargetException();
                        }
                        try {
                            v52 = var4_5.k();
                        }
                        catch (InvocationTargetException v53) {
                            throw v53.getTargetException();
                        }
                        try {
                            v54 = var9_10 /* !! */.a();
                        }
                        catch (InvocationTargetException v55) {
                            throw v55.getTargetException();
                        }
                        try {
                            v48.P(v50, v52, v54);
                            continue;
                        }
                        catch (InvocationTargetException v56) {
                            throw v56.getTargetException();
                        }
                    }
                    catch (Exception var12_15) {
                        var12_15.printStackTrace();
                    }
                    if (var1_1 == null) continue;
                    break;
                }
            }
            catch (Exception var2_3) {
                var2_3.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

