/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.db_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oL
 */
class ol_1
implements Runnable {
    final JA R;

    ol_1(JA jA) {
        this.R = jA;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block23: {
            var2_1 = null;
            var1_2 = F6.g();
            var2_1 = new BufferedReader(new InputStreamReader(((db_1)this.R.k).B()));
            while ((var3_3 = var2_1.readLine()) != null) {
                try {
                    try {
                        this.R.A("" + var3_3);
                    }
                    catch (InvocationTargetException v0) {
                        throw v0.getTargetException();
                    }
                    if (!var1_2) {
                        if (!var1_2) continue;
                        break;
                    }
                    break block23;
                }
                catch (IOException v1) {
                    throw ol_1.a(v1);
                }
            }
            try {
                v2 = var2_1;
                if (!var1_2) {
                    if (v2 == null) break block23;
                }
                ** GOTO lbl30
            }
            catch (IOException v3) {
                throw ol_1.a(v3);
            }
            try {
                v2 = var2_1;
lbl30:
                // 2 sources

                v2.close();
            }
            catch (IOException var3_4) {
                var3_4.printStackTrace();
            }
            break block23;
            catch (IOException var3_5) {
                try {
                    var3_5.printStackTrace();
                    v4 = var2_1;
                    if (var1_2) ** GOTO lbl60
                }
                catch (Throwable var4_7) {
                    block24: {
                        try {
                            v5 = var2_1;
                            if (!var1_2) {
                                if (v5 == null) break block24;
                            }
                            ** GOTO lbl51
                        }
                        catch (IOException v6) {
                            throw ol_1.a(v6);
                        }
                        try {
                            v5 = var2_1;
lbl51:
                            // 2 sources

                            v5.close();
                        }
                        catch (IOException var5_8) {
                            var5_8.printStackTrace();
                        }
                    }
                    throw var4_7;
                }
                if (v4 == null) break block23;
                try {
                    v4 = var2_1;
lbl60:
                    // 2 sources

                    v4.close();
                }
                catch (IOException var3_6) {
                    var3_6.printStackTrace();
                }
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

