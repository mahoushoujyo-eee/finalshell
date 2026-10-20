/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Renamed from Ja
 */
public class ja_0 {
    private static final long a;

    /*
     * Unable to fully structure code
     */
    public static void M(File var0, File var1_1) throws IOException {
        block38: {
            block37: {
                var3_2 = null;
                var2_3 = d5_0.k();
                var4_4 = null;
                try {
                    block32: {
                        block33: {
                            var5_5 = new File(var1_1.getParent());
                            v0 = var5_5.exists();
                            if (var2_3 != null) break block32;
                            try {
                                block39: {
                                    if (v0) break block33;
                                    break block39;
                                    catch (IOException v1) {
                                        throw ja_0.a(v1);
                                    }
                                }
                                var5_5.mkdirs();
                            }
                            catch (IOException v2) {
                                throw ja_0.a(v2);
                            }
                        }
                        v0 = var1_1.createNewFile();
                    }
                    var3_2 = new FileOutputStream(var1_1);
                    var4_4 = new FileInputStream(var0);
                    var6_7 = new byte[(int)ja_0.a];
                    var7_8 = 0;
                    try {
                        if (var2_3 != null) {
                            while (true) {
                                var3_2.write(var6_7, 0, var7_8);
                                continue;
                                break;
                            }
                        }
                    }
                    catch (IOException v3) {
                        throw ja_0.a(v3);
                    }
                    if ((var7_8 = var4_4.read(var6_7)) != -1) ** continue;
                }
                catch (Throwable var8_9) {
                    block36: {
                        block35: {
                            try {
                                v4 = var3_2;
                                if (var2_3 == null) {
                                    if (v4 == null) break block35;
                                }
                                ** GOTO lbl51
                            }
                            catch (IOException v5) {
                                throw ja_0.a(v5);
                            }
                            try {
                                v4 = var3_2;
lbl51:
                                // 2 sources

                                v4.close();
                            }
                            catch (IOException var9_10) {
                                var9_10.printStackTrace();
                            }
                        }
                        try {
                            v6 = var4_4;
                            if (var2_3 == null) {
                                if (v6 == null) break block36;
                            }
                            ** GOTO lbl66
                        }
                        catch (IOException v7) {
                            throw ja_0.a(v7);
                        }
                        try {
                            v6 = var4_4;
lbl66:
                            // 2 sources

                            v6.close();
                        }
                        catch (IOException var9_11) {
                            var9_11.printStackTrace();
                        }
                    }
                    throw var8_9;
                }
                try {
                    v8 = var3_2;
                    if (var2_3 == null) {
                        if (v8 == null) break block37;
                    }
                    ** GOTO lbl83
                }
                catch (IOException v9) {
                    throw ja_0.a(v9);
                }
                try {
                    v8 = var3_2;
lbl83:
                    // 2 sources

                    v8.close();
                }
                catch (IOException var9_12) {
                    var9_12.printStackTrace();
                }
            }
            try {
                v10 = var4_4;
                if (var2_3 == null) {
                    if (v10 == null) break block38;
                }
                ** GOTO lbl98
            }
            catch (IOException v11) {
                throw ja_0.a(v11);
            }
            try {
                v10 = var4_4;
lbl98:
                // 2 sources

                v10.close();
            }
            catch (IOException var9_13) {
                var9_13.printStackTrace();
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8671268578712264213L;
        a = 0x712E50BA7A270E15L ^ l2;
    }
}

