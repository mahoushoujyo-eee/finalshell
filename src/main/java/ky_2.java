/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.db_1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ky
 */
class ky_2
implements Runnable {
    final db_1 n;
    final kx_1 f;
    private static final long a;

    ky_2(kx_1 kx_12, db_1 db_12) {
        this.f = kx_12;
        this.n = db_12;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block28: {
            block27: {
                var2_1 = null;
                var1_2 = F6.g();
                block22: while (true) {
                    Thread.sleep(ky_2.a);
                    do {
                        if (!((db_1)this.n).B()) continue block22;
                    } while (var1_2);
                    break;
                }
                try {
                    v0 = var2_1;
                    if (!var1_2) {
                        if (v0 == null) break block27;
                    }
                    ** GOTO lbl19
                }
                catch (IOException v1) {
                    throw ky_2.a(v1);
                }
                try {
                    v0 = var2_1;
lbl19:
                    // 2 sources

                    v0.close();
                }
                catch (IOException var3_3) {
                    var3_3.printStackTrace();
                }
                break block27;
                catch (Exception var3_4) {
                    try {
                        var3_4.printStackTrace();
                        if (var1_2) break block28;
                        ** if (var2_1 == null) goto lbl-1000
                    }
                    catch (Throwable var4_8) {
                        block29: {
                            try {
                                v2 = var2_1;
                                if (!var1_2) {
                                    if (v2 == null) break block29;
                                }
                                ** GOTO lbl46
                            }
                            catch (IOException v3) {
                                throw ky_2.a(v3);
                            }
                            try {
                                v2 = var2_1;
lbl46:
                                // 2 sources

                                v2.close();
                            }
                            catch (IOException var5_9) {
                                var5_9.printStackTrace();
                            }
                        }
                        throw var4_8;
                    }
lbl-1000:
                    // 1 sources

                    {
                        try {
                            var2_1.close();
                        }
                        catch (IOException var3_5) {
                            var3_5.printStackTrace();
                        }
                    }
lbl-1000:
                    // 2 sources

                    {
                    }
                }
            }
            try {
                try {
                    v4 = this.f.B.F();
                }
                catch (InvocationTargetException v5) {
                    throw v5.getTargetException();
                }
                try {
                    this.f.s.f(v4);
                }
                catch (InvocationTargetException v6) {
                    throw v6.getTargetException();
                }
            }
            catch (Exception var3_6) {
                var3_6.printStackTrace();
            }
        }
        try {
            this.f.q.R.Y();
        }
        catch (InvocationTargetException v7) {
            throw v7.getTargetException();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2293401380359536478L;
        a = 0x1FD3CC678BB87F3AL ^ l2;
    }
}

