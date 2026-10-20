/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.Socket;
import sockslib.client.Socks5;
import sockslib.client.SocksProxy;
import sockslib.client.SocksSocket;

/*
 * Renamed from tb
 */
public class tb_2 {
    InputStream y;
    OutputStream t;
    InputStream n;
    OutputStream T;
    String s;
    int L;
    String z;
    int M;
    boolean U;
    lv_2 B;
    int X;

    tb_2(String string, int n10, String string2, int n11, lv_2 lv_22, int n12) {
        this.y = null;
        this.t = null;
        this.n = null;
        this.T = null;
        this.U = false;
        this.X = n12;
        this.s = string;
        this.L = n10;
        this.z = string2;
        this.M = n11;
        this.B = lv_22;
    }

    /*
     * Unable to fully structure code
     */
    void l(Socket var1_1) {
        var2_2 = BS.s();
        try {
            block87: {
                block88: {
                    block93: {
                        block92: {
                            block83: {
                                block84: {
                                    block85: {
                                        block82: {
                                            block81: {
                                                this.y = var1_1.getInputStream();
                                                this.t = var1_1.getOutputStream();
                                                v0 = this;
                                                if (var2_2 == 0) break block81;
                                                try {
                                                    block90: {
                                                        if ((lv_2)v0.B != null) break block82;
                                                        break block90;
                                                        catch (Exception v1) {
                                                            throw tb_2.a(v1);
                                                        }
                                                    }
                                                    v0 = this;
                                                }
                                                catch (Exception v2) {
                                                    throw tb_2.a(v2);
                                                }
                                            }
                                            try {
                                                v3 = (ow_2)cf_0.Q(v0.z, this.M, this.X, null);
                                            }
                                            catch (InvocationTargetException v4) {
                                                throw v4.getTargetException();
                                            }
                                            var3_3 = v3;
                                            try {
                                                v5 = var3_3.B();
                                            }
                                            catch (InvocationTargetException v6) {
                                                throw v6.getTargetException();
                                            }
                                            this.n = v5;
                                            try {
                                                v7 = var3_3.l();
                                            }
                                            catch (InvocationTargetException v8) {
                                                throw v8.getTargetException();
                                            }
                                            this.T = v7;
                                            if (var2_2 != 0) break block87;
                                        }
                                        try {
                                            v9 = yt_1.i();
                                        }
                                        catch (InvocationTargetException v10) {
                                            throw v10.getTargetException();
                                        }
                                        try {
                                            v11 = v9.h();
                                        }
                                        catch (InvocationTargetException v12) {
                                            throw v12.getTargetException();
                                        }
                                        try {
                                            v13 = this.B.i();
                                        }
                                        catch (InvocationTargetException v14) {
                                            throw v14.getTargetException();
                                        }
                                        try {
                                            v15 = (ld_1)v11.D(v13);
                                        }
                                        catch (InvocationTargetException v16) {
                                            throw v16.getTargetException();
                                        }
                                        var3_3 = v15;
                                        if (var3_3 == null) ** GOTO lbl189
                                        var4_5 = null;
                                        try {
                                            try {
                                                v17 = (Integer)var3_3.H();
                                            }
                                            catch (InvocationTargetException v18) {
                                                throw v18.getTargetException();
                                            }
                                            v19 = ld_1.v;
                                            if (var2_2 == 0) break block83;
                                            if (v17 != v19) break block84;
                                        }
                                        catch (Exception v20) {
                                            throw tb_2.a(v20);
                                        }
                                        var5_6 = null;
                                        try {
                                            v21 = var3_3.f();
                                        }
                                        catch (InvocationTargetException v22) {
                                            throw v22.getTargetException();
                                        }
                                        try {
                                            v23 = (Boolean)lk_0.Y(v21);
                                        }
                                        catch (InvocationTargetException v24) {
                                            throw v24.getTargetException();
                                        }
                                        if (var2_2 == 0) break block85;
                                        try {
                                            block91: {
                                                if (v23) ** break block86
                                                break block91;
                                                catch (Exception v25) {
                                                    throw tb_2.a(v25);
                                                }
                                            }
                                            try {
                                                v26 = var3_3.c();
                                            }
                                            catch (InvocationTargetException v27) {
                                                throw v27.getTargetException();
                                            }
                                            try {
                                                v23 = (Boolean)lk_0.Y(v26);
                                            }
                                            catch (InvocationTargetException v28) {
                                                throw v28.getTargetException();
                                            }
                                        }
                                        catch (Exception v29) {
                                            throw tb_2.a(v29);
                                        }
                                    }
                                    if (!v23) {
                                        try {
                                            v30 = (String)var3_3.B();
                                        }
                                        catch (InvocationTargetException v31) {
                                            throw v31.getTargetException();
                                        }
                                        try {
                                            v32 = (Integer)var3_3.p();
                                        }
                                        catch (InvocationTargetException v33) {
                                            throw v33.getTargetException();
                                        }
                                        try {
                                            v34 = (String)var3_3.f();
                                        }
                                        catch (InvocationTargetException v35) {
                                            throw v35.getTargetException();
                                        }
                                        try {
                                            v36 = (String)var3_3.c();
                                        }
                                        catch (InvocationTargetException v37) {
                                            throw v37.getTargetException();
                                        }
                                        var5_6 = new Socks5(new InetSocketAddress(v30, v32), v34, v36);
                                    } else {
                                        try {
                                            v38 = (String)var3_3.B();
                                        }
                                        catch (InvocationTargetException v39) {
                                            throw v39.getTargetException();
                                        }
                                        try {
                                            v40 = (Integer)var3_3.p();
                                        }
                                        catch (InvocationTargetException v41) {
                                            throw v41.getTargetException();
                                        }
                                        var5_6 = new Socks5(new InetSocketAddress(v38, v40));
                                    }
                                    var4_5 = new SocksSocket((SocksProxy)var5_6, new InetSocketAddress((String)this.z, this.M));
                                    break block92;
                                }
                                try {
                                    v17 = (Integer)var3_3.H();
                                }
                                catch (InvocationTargetException v42) {
                                    throw v42.getTargetException();
                                }
                                v19 = ld_1.i;
                            }
                            if (v17 == v19) {
                                try {
                                    v43 = (String)var3_3.B();
                                }
                                catch (InvocationTargetException v44) {
                                    throw v44.getTargetException();
                                }
                                try {
                                    v45 = (Integer)var3_3.p();
                                }
                                catch (InvocationTargetException v46) {
                                    throw v46.getTargetException();
                                }
                                try {
                                    v47 = (String)var3_3.f();
                                }
                                catch (InvocationTargetException v48) {
                                    throw v48.getTargetException();
                                }
                                try {
                                    v49 = (String)var3_3.c();
                                }
                                catch (InvocationTargetException v50) {
                                    throw v50.getTargetException();
                                }
                                var4_5 = fi_2.I((String)this.z, this.M, v43, v45, v47, v49);
                            }
                        }
                        this.n = new DataInputStream(var4_5.getInputStream());
                        this.T = new DataOutputStream(var4_5.getOutputStream());
                        if (var2_2 != 0) break block87;
lbl189:
                        // 3 sources

                        v51 = this;
                        if (var2_2 == 0) break block88;
                        break block93;
                        catch (Exception v52) {
                            throw tb_2.a(v52);
                        }
                    }
                    try {
                        block94: {
                            try {
                                v53 = (Boolean)v51.B.o();
                            }
                            catch (InvocationTargetException v54) {
                                throw v54.getTargetException();
                            }
                            if (!v53) break block87;
                            break block94;
                            catch (Exception v55) {
                                throw tb_2.a(v55);
                            }
                        }
                        v51 = this;
                    }
                    catch (Exception v56) {
                        throw tb_2.a(v56);
                    }
                }
                try {
                    v57 = (ow_2)cf_0.Q(v51.z, this.M, this.X, null);
                }
                catch (InvocationTargetException v58) {
                    throw v58.getTargetException();
                }
                var4_5 = v57;
                try {
                    v59 = var4_5.B();
                }
                catch (InvocationTargetException v60) {
                    throw v60.getTargetException();
                }
                this.n = v59;
                try {
                    v61 = var4_5.l();
                }
                catch (InvocationTargetException v62) {
                    throw v62.getTargetException();
                }
                this.T = v61;
            }
            try {
                yt_1.F.J(new ne_0(this));
            }
            catch (InvocationTargetException v63) {
                throw v63.getTargetException();
            }
            try {
                yt_1.F.J(new lg_0(this));
            }
            catch (InvocationTargetException v64) {
                throw v64.getTargetException();
            }
        }
        catch (Exception var3_4) {
            var3_4.printStackTrace();
            try {
                this.c();
            }
            catch (InvocationTargetException v65) {
                throw v65.getTargetException();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    void c() {
        block22: {
            block27: {
                block28: {
                    block25: {
                        block26: {
                            block23: {
                                block24: {
                                    block21: {
                                        var1_1 = BS.s();
                                        v0 = this;
                                        if (var1_1 == 0) break block21;
                                        try {
                                            block29: {
                                                if (v0.U) break block22;
                                                break block29;
                                                catch (IOException v1) {
                                                    throw tb_2.a(v1);
                                                }
                                            }
                                            this.U = true;
                                            v0 = this;
                                        }
                                        catch (IOException v2) {
                                            throw tb_2.a(v2);
                                        }
                                    }
                                    try {
                                        if (var1_1 == 0) break block23;
                                        if ((InputStream)v0.y == null) break block24;
                                    }
                                    catch (IOException v3) {
                                        throw tb_2.a(v3);
                                    }
                                    try {
                                        ((InputStream)this.y).close();
                                    }
                                    catch (IOException var2_2) {
                                        var2_2.printStackTrace();
                                    }
                                }
                                v0 = this;
                            }
                            try {
                                if (var1_1 == 0) break block25;
                                if ((OutputStream)v0.t == null) break block26;
                            }
                            catch (IOException v4) {
                                throw tb_2.a(v4);
                            }
                            try {
                                ((OutputStream)this.t).close();
                            }
                            catch (IOException var2_3) {
                                var2_3.printStackTrace();
                            }
                        }
                        v0 = this;
                    }
                    try {
                        if (var1_1 == 0) break block27;
                        if ((InputStream)v0.n == null) break block28;
                    }
                    catch (IOException v5) {
                        throw tb_2.a(v5);
                    }
                    try {
                        ((InputStream)this.n).close();
                    }
                    catch (IOException var2_5) {
                        var2_5.printStackTrace();
                    }
                }
                v0 = this;
            }
            try {
                v6 = (OutputStream)v0.T;
                if (var1_1 != 0) {
                    if (v6 == null) break block22;
                }
                ** GOTO lbl69
            }
            catch (IOException v7) {
                throw tb_2.a(v7);
            }
            try {
                v6 = (OutputStream)this.T;
lbl69:
                // 2 sources

                v6.close();
            }
            catch (IOException var2_6) {
                var2_6.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

