/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.db_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Renamed from tX
 */
class tx_1
implements Runnable {
    final db_1 B;
    final F6 Q;

    tx_1(F6 f62, db_1 db_12) {
        this.Q = f62;
        this.B = db_12;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block18: {
            var2_1 = null;
            var1_2 = F6.i();
            var2_1 = new BufferedReader(new InputStreamReader(((db_1)this.B).B()));
            while ((var3_3 = var2_1.readLine()) != null) {
            }
            try {
                v0 = var2_1;
                if (var1_2) {
                    if (v0 == null) break block18;
                }
                ** GOTO lbl17
            }
            catch (IOException v1) {
                throw tx_1.a(v1);
            }
            try {
                v0 = var2_1;
lbl17:
                // 2 sources

                v0.close();
            }
            catch (IOException var3_4) {
                var3_4.printStackTrace();
            }
            break block18;
            catch (IOException var3_5) {
                try {
                    var3_5.printStackTrace();
                    v2 = var2_1;
                    if (!var1_2) ** GOTO lbl47
                }
                catch (Throwable var4_7) {
                    block19: {
                        try {
                            v3 = var2_1;
                            if (var1_2) {
                                if (v3 == null) break block19;
                            }
                            ** GOTO lbl38
                        }
                        catch (IOException v4) {
                            throw tx_1.a(v4);
                        }
                        try {
                            v3 = var2_1;
lbl38:
                            // 2 sources

                            v3.close();
                        }
                        catch (IOException var5_8) {
                            var5_8.printStackTrace();
                        }
                    }
                    throw var4_7;
                }
                if (v2 == null) break block18;
                try {
                    v2 = var2_1;
lbl47:
                    // 2 sources

                    v2.close();
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

