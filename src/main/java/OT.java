/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

class OT
implements Runnable {
    final YI R;
    final jx_0 C;
    private static final long a;

    OT(jx_0 jx_02, YI yI) {
        this.C = jx_02;
        this.R = yI;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block59: {
            block64: {
                block62: {
                    block61: {
                        block63: {
                            block60: {
                                block57: {
                                    block58: {
                                        var1_1 = jx_0.O();
                                        try {
                                            Thread.sleep(OT.a);
                                        }
                                        catch (InterruptedException var2_2) {
                                            var2_2.printStackTrace();
                                        }
                                        var2_3 = true;
                                        try {
                                            v0 = yt_1.i();
                                        }
                                        catch (InvocationTargetException v1) {
                                            throw v1.getTargetException();
                                        }
                                        try {
                                            v2 = (u6_0)v0.h();
                                        }
                                        catch (InvocationTargetException v3) {
                                            throw v3.getTargetException();
                                        }
                                        var3_4 = v2;
                                        try {
                                            v4 = (String)this.R.F();
                                        }
                                        catch (InvocationTargetException v5) {
                                            throw v5.getTargetException();
                                        }
                                        try {
                                            v6 = (String)lk_0.N(new File(v4).getName());
                                        }
                                        catch (InvocationTargetException v7) {
                                            throw v7.getTargetException();
                                        }
                                        var4_5 = v6;
                                        try {
                                            v8 = (ArrayList)var3_4.d();
                                        }
                                        catch (InvocationTargetException v9) {
                                            throw v9.getTargetException();
                                        }
                                        var5_6 = v8;
                                        try {
                                            v10 = var5_6.contains(var4_5);
                                            if (var1_1 != null) break block57;
                                            if (!v10) break block58;
                                        }
                                        catch (InterruptedException v11) {
                                            throw OT.a(v11);
                                        }
                                        var2_3 = false;
                                    }
                                    v10 = var2_3;
                                }
                                try {
                                    if (var1_1 != null) break block59;
                                    if (v10) {
                                    }
                                    ** GOTO lbl151
                                }
                                catch (InterruptedException v12) {
                                    throw OT.a(v12);
                                }
                                var6_7 = 0;
                                try {
                                    try {
                                        v13 = (Integer)var3_4.g();
                                    }
                                    catch (InvocationTargetException v14) {
                                        throw v14.getTargetException();
                                    }
                                    if (var1_1 != null) break block60;
                                    if (v13 == 0) {
                                    }
                                    ** GOTO lbl74
                                }
                                catch (InterruptedException v15) {
                                    throw OT.a(v15);
                                }
                                var6_7 = 1;
                                try {
                                    if (var1_1 == null) break block61;
lbl74:
                                    // 2 sources

                                    try {
                                        v13 = (Integer)var3_4.g();
                                    }
                                    catch (InvocationTargetException v16) {
                                        throw v16.getTargetException();
                                    }
                                }
                                catch (InterruptedException v17) {
                                    throw OT.a(v17);
                                }
                            }
                            try {
                                try {
                                    if (var1_1 != null) break block62;
                                    if (v13 == 1) {
                                    }
                                    break block61;
                                }
                                catch (InterruptedException v18) {
                                    throw OT.a(v18);
                                }
                                try {
                                    v19 = (String)var3_4.O();
                                }
                                catch (InvocationTargetException v20) {
                                    throw v20.getTargetException();
                                }
                                if (v19 != null) break block63;
                            }
                            catch (InterruptedException v21) {
                                throw OT.a(v21);
                            }
                            var6_7 = 1;
                            if (var1_1 == null) break block61;
                        }
                        try {
                            v22 = (String)var3_4.O();
                        }
                        catch (InvocationTargetException v23) {
                            throw v23.getTargetException();
                        }
                        var7_8 = new File(v22);
                        try {
                            v13 = (int)var7_8.exists();
                            if (var1_1 != null) break block62;
                            if (v13 != 0) break block61;
                        }
                        catch (InterruptedException v24) {
                            throw OT.a(v24);
                        }
                        var6_7 = 1;
                    }
                    v13 = var6_7;
                }
                try {
                    try {
                        if (v13 == 0) ** GOTO lbl129
                        SwingUtilities.invokeLater(new t9_0(this));
                        if (var1_1 != null) {
                        }
                        break block64;
                    }
                    catch (InterruptedException v25) {
                        throw OT.a(v25);
                    }
lbl129:
                    // 2 sources

                    try {
                        v26 = (String)this.R.F();
                    }
                    catch (InvocationTargetException v27) {
                        throw v27.getTargetException();
                    }
                    try {
                        v28 = var3_4.O();
                    }
                    catch (InvocationTargetException v29) {
                        throw v29.getTargetException();
                    }
                    try {
                        lk_0.R((Object)new File(v26), v28);
                    }
                    catch (InvocationTargetException v30) {
                        throw v30.getTargetException();
                    }
                }
                catch (InterruptedException v31) {
                    throw OT.a(v31);
                }
            }
            try {
                if (var1_1 == null) break block59;
lbl151:
                // 2 sources

                try {
                    v32 = (String)this.R.F();
                }
                catch (InvocationTargetException v33) {
                    throw v33.getTargetException();
                }
                try {
                    v10 = (Boolean)lk_0.X(new File(v32));
                }
                catch (InvocationTargetException v34) {
                    throw v34.getTargetException();
                }
            }
            catch (InterruptedException v35) {
                throw OT.a(v35);
            }
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6610927057226258166L;
        a = 0x5BBEBB21E1FD57DAL ^ l2;
    }
}

