/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Renamed from lS
 */
class ls_1
implements Runnable {
    final gs_0 f;

    ls_1(gs_0 gs_02) {
        this.f = gs_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block29: {
            var2_1 = System.currentTimeMillis();
            var4_2 = null;
            var1_3 = BS.s();
            try {
                v0 = (String)this.f.V();
            }
            catch (InvocationTargetException v1) {
                throw v1.getTargetException();
            }
            try {
                v2 = (Integer)this.f.l();
            }
            catch (InvocationTargetException v3) {
                throw v3.getTargetException();
            }
            var4_2 = new Socket(v0, v2);
            try {
                (gs_0)this.f.p(System.currentTimeMillis() - var2_1);
            }
            catch (InvocationTargetException v4) {
                throw v4.getTargetException();
            }
            try {
                this.f.Q(true);
            }
            catch (InvocationTargetException v5) {
                throw v5.getTargetException();
            }
            v6 = var4_2;
            if (var1_3 == 0) ** GOTO lbl35
            if (v6 == null) break block29;
            try {
                v6 = var4_2;
lbl35:
                // 2 sources

                v6.close();
            }
            catch (IOException var5_4) {}
            break block29;
            catch (UnknownHostException var5_5) {
                var5_5.printStackTrace();
                v7 = var4_2;
                if (var1_3 == 0) ** GOTO lbl48
                if (v7 == null) break block29;
                try {
                    v7 = var4_2;
lbl48:
                    // 2 sources

                    v7.close();
                }
                catch (IOException var5_6) {}
            }
            catch (IOException var5_7) {
                var5_7.printStackTrace();
                v8 = var4_2;
                if (var1_3 == 0) ** GOTO lbl77
                {
                    catch (Throwable var6_9) {
                        block30: {
                            try {
                                v9 = var4_2;
                                if (var1_3 != 0) {
                                    if (v9 == null) break block30;
                                }
                                ** GOTO lbl68
                            }
                            catch (IOException v10) {
                                throw ls_1.a(v10);
                            }
                            try {
                                v9 = var4_2;
lbl68:
                                // 2 sources

                                v9.close();
                            }
                            catch (IOException var7_10) {
                                // empty catch block
                            }
                        }
                        throw var6_9;
                    }
                }
                if (v8 == null) break block29;
                try {
                    v8 = var4_2;
lbl77:
                    // 2 sources

                    v8.close();
                }
                catch (IOException var5_8) {}
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

