/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.KeyStroke;
import org.apache.commons.lang.StringUtils;

class QP
extends qh_0 {
    final zG n;
    final zG T;
    final U w;
    private static final long a;

    QP(U u10, Window window, zG zG2, zG zG3) {
        this.w = u10;
        this.n = zG2;
        this.T = zG3;
        super(window);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void i(KeyEvent var1_1) {
        block78: {
            block79: {
                block77: {
                    block72: {
                        block73: {
                            block75: {
                                block70: {
                                    block71: {
                                        block85: {
                                            block84: {
                                                block83: {
                                                    block82: {
                                                        block81: {
                                                            var3_2 = KeyStroke.getKeyStrokeForEvent(var1_1);
                                                            var2_3 = F8.y();
                                                            var4_4 = false;
                                                            v0 = var1_1.getModifiers();
                                                            if (var2_3 != null) break block70;
                                                            if (v0 == (int)QP.a) break block71;
                                                            break block81;
                                                            catch (Exception v1) {
                                                                throw QP.a(v1);
                                                            }
                                                        }
                                                        v0 = var1_1.getModifiers();
                                                        if (var2_3 != null) break block70;
                                                        break block82;
                                                        catch (Exception v2) {
                                                            throw QP.a(v2);
                                                        }
                                                    }
                                                    if (v0 == 2) break block71;
                                                    break block83;
                                                    catch (Exception v3) {
                                                        throw QP.a(v3);
                                                    }
                                                }
                                                v0 = (int)var1_1.isAltDown();
                                                if (var2_3 != null) break block70;
                                                break block84;
                                                catch (Exception v4) {
                                                    throw QP.a(v4);
                                                }
                                            }
                                            if (v0 != 0) break block71;
                                            break block85;
                                            catch (Exception v5) {
                                                throw QP.a(v5);
                                            }
                                        }
                                        try {
                                            block86: {
                                                v6 = (int)var1_1.isControlDown();
                                                if (var2_3 != null) break block72;
                                                break block86;
                                                catch (Exception v7) {
                                                    throw QP.a(v7);
                                                }
                                            }
                                            if (v6 == 0) break block73;
                                        }
                                        catch (Exception v8) {
                                            throw QP.a(v8);
                                        }
                                    }
                                    v0 = 0;
                                }
                                var5_5 = v0;
                                try {
                                    block76: {
                                        block74: {
                                            var6_6 = var1_1.getKeyChar() + "";
                                            var6_6 = var6_6.trim();
                                            v9 = var6_6.equals("");
                                            if (var2_3 != null) break block74;
                                            try {
                                                block87: {
                                                    if (v9 != 0) break block75;
                                                    break block87;
                                                    catch (Exception v10) {
                                                        throw QP.a(v10);
                                                    }
                                                }
                                                v9 = StringUtils.isNumeric((String)var6_6);
                                            }
                                            catch (Exception v11) {
                                                throw QP.a(v11);
                                            }
                                        }
                                        if (var2_3 != null) break block76;
                                        try {
                                            block88: {
                                                if (v9 == 0) break block75;
                                                break block88;
                                                catch (Exception v12) {
                                                    throw QP.a(v12);
                                                }
                                            }
                                            v9 = Integer.parseInt((String)var6_6);
                                        }
                                        catch (Exception v13) {
                                            throw QP.a(v13);
                                        }
                                    }
                                    var5_5 = v9;
                                }
                                catch (Exception var6_7) {
                                    var6_7.printStackTrace();
                                }
                            }
                            try {
                                v6 = var5_5;
                                if (var2_3 != null) break block72;
                                if (v6 > 0) {
                                }
                                break block73;
                            }
                            catch (Exception v14) {
                                throw QP.a(v14);
                            }
                            try {
                                v15 = (t3_0)this.w.C.x(var5_5);
                            }
                            catch (InvocationTargetException v16) {
                                throw v16.getTargetException();
                            }
                            var6_6 = v15;
                            try {
                                if (var6_6 == null) ** GOTO lbl114
                                try {
                                    this.w.C.X(var6_6);
                                }
                                catch (InvocationTargetException v17) {
                                    throw v17.getTargetException();
                                }
                            }
                            catch (Exception v18) {
                                throw QP.a(v18);
                            }
                        }
                        try {
                            v19 = (KeyStroke)this.n.f();
                        }
                        catch (InvocationTargetException v20) {
                            throw v20.getTargetException();
                        }
                        v6 = (int)var3_2.equals(v19);
                    }
                    try {
                        try {
                            try {
                                if (var2_3 == null) {
                                    if (v6 == 0) ** GOTO lbl142
                                }
                                break block77;
                            }
                            catch (Exception v21) {
                                throw QP.a(v21);
                            }
                            try {
                                this.w.C.m();
                            }
                            catch (InvocationTargetException v22) {
                                throw v22.getTargetException();
                            }
                            if (var2_3 != null) {
                            }
                            break block78;
                        }
                        catch (Exception v23) {
                            throw QP.a(v23);
                        }
lbl142:
                        // 2 sources

                        try {
                            v24 = (KeyStroke)this.T.f();
                        }
                        catch (InvocationTargetException v25) {
                            throw v25.getTargetException();
                        }
                        v6 = (int)var3_2.equals(v24);
                    }
                    catch (Exception v26) {
                        throw QP.a(v26);
                    }
                }
                try {
                    block80: {
                        try {
                            try {
                                if (var2_3 != null) break block79;
                                if (v6 != 0) {
                                }
                                break block80;
                            }
                            catch (Exception v27) {
                                throw QP.a(v27);
                            }
                            try {
                                this.w.C.s();
                            }
                            catch (InvocationTargetException v28) {
                                throw v28.getTargetException();
                            }
                            if (var2_3 == null) break block78;
                        }
                        catch (Exception v29) {
                            throw QP.a(v29);
                        }
                    }
                    try {
                        v30 = yt_1.i();
                    }
                    catch (InvocationTargetException v31) {
                        throw v31.getTargetException();
                    }
                    try {
                        v32 = v30.h();
                    }
                    catch (InvocationTargetException v33) {
                        throw v33.getTargetException();
                    }
                    try {
                        v34 = v32.L(US.k);
                    }
                    catch (InvocationTargetException v35) {
                        throw v35.getTargetException();
                    }
                    try {
                        v36 = (KeyStroke)v34.f();
                    }
                    catch (InvocationTargetException v37) {
                        throw v37.getTargetException();
                    }
                    v6 = (int)var3_2.equals(v36);
                }
                catch (Exception v38) {
                    throw QP.a(v38);
                }
            }
            try {
                if (v6 == 0) break block78;
                try {
                    v39 = this.w.C.Q();
                }
                catch (InvocationTargetException v40) {
                    throw v40.getTargetException();
                }
                try {
                    this.w.C.N(v39);
                }
                catch (InvocationTargetException v41) {
                    throw v41.getTargetException();
                }
            }
            catch (Exception v42) {
                throw QP.a(v42);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2291886859903111746L;
        a = 0x925A0BDCC5E9124AL ^ l2;
    }
}

