/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Renamed from Cm
 */
public class cm_0 {
    int l = -1;
    boolean Q = false;
    byte[] w;
    int o;
    private static final long a;

    /*
     * Unable to fully structure code
     */
    public void g(InputStream var1_1, br_1 var2_2, int var3_3, cm_0 var4_4) throws Exception {
        var6_5 = 0;
        var5_6 = QI.N();
        var7_7 = new byte[var3_3];
        var8_8 = false;
        var9_9 = false;
        try {
            if (var5_6 == null) {
                while (true) {
                    this.Q = true;
                    break;
                }
            }
            ** GOTO lbl23
        }
        catch (Exception v0) {
            throw cm_0.a(v0);
        }
        do {
            block10: {
                block9: {
                    v1 = var9_9;
                    if (var5_6 == null) break block9;
                    if (v1) break block10;
                    v1 = true;
                }
                var9_9 = v1;
            }
            var2_2.t(var7_7, 0, var6_5);
lbl23:
            // 2 sources

            if ((var6_5 = var1_1.read(var7_7)) > 0) ** continue;
        } while (var5_6 == null);
    }

    /*
     * Unable to fully structure code
     */
    void u(long var1_1, int var3_2, int var4_3) {
        block5: {
            var6_4 = (long)(1000.0f * (float)var4_3 / (float)var3_2);
            var5_5 = QI.N();
            var8_6 = System.currentTimeMillis() - var1_1;
            try {
                v0 = var8_6;
                v1 = var6_4;
                if (var5_5 != null) {
                    if (v0 >= v1) break block5;
                }
                ** GOTO lbl16
            }
            catch (InterruptedException v2) {
                throw cm_0.a(v2);
            }
            try {
                v0 = var6_4;
                v1 = var8_6;
lbl16:
                // 2 sources

                Thread.sleep(v0 - v1);
            }
            catch (InterruptedException var10_7) {
                var10_7.printStackTrace();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void H(br_2 var1_1, OutputStream var2_2, UR var3_3) throws Exception {
        block8: {
            block7: {
                var5_4 = 0;
                var6_5 = new byte[(int)cm_0.a];
                var7_6 = false;
                var4_7 = QI.N();
                var8_8 = false;
                try {
                    if (var4_7 == null) {
                        while (true) {
                            v0 = var8_8;
                            if (var4_7 == null) break block7;
                            break;
                        }
                    }
                    ** GOTO lbl28
                }
                catch (Exception v1) {
                    throw cm_0.a(v1);
                }
                try {
                    if (v0) break block8;
                    this.w = var6_5;
                    this.o = var5_4;
                    v0 = true;
                }
                catch (Exception v2) {
                    throw cm_0.a(v2);
                }
            }
            var8_8 = v0;
        }
        do {
            var2_2.write(var6_5, 0, var5_4);
lbl28:
            // 2 sources

            if ((var5_4 = var1_1.Z(var6_5, 0, var6_5.length)) > 0) ** continue;
        } while (var4_7 == null);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7080321076139620390L;
        a = 0xBD1F2C86F037FF6L ^ l2;
    }
}

