/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Lg
 */
class lg_0
implements Runnable {
    final tb_2 r;
    private static final long[] a;
    private static final Integer[] b;

    lg_0(tb_2 tb_22) {
        this.r = tb_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block22: {
            var2_1 = new byte[lg_0.a(29858, 6711013880233515367L)];
            var1_2 = BS.t();
            var3_3 = 0;
            while ((var3_3 = ((InputStream)this.r.n).read(var2_1)) > 0) {
                block24: {
                    block23: {
                        block26: {
                            block25: {
                                var4_4 = lg_0.a(15201, 1465714969097180837L) * var3_3 / this.r.X;
                                var6_6 = System.currentTimeMillis();
                                ((OutputStream)this.r.t).write(var2_1, 0, var3_3);
                                var8_7 = System.currentTimeMillis() - var6_6;
                                v0 = (tb_2)this.r;
                                if (var1_2 != 0) break block22;
                                v1 = v0.X;
                                if (var1_2 != 0) break block23;
                                break block25;
                                catch (InterruptedException v2) {
                                    throw lg_0.a(v2);
                                }
                            }
                            if (v1 <= 0) break block24;
                            break block26;
                            catch (InterruptedException v3) {
                                throw lg_0.a(v3);
                            }
                        }
                        try {
                            block27: {
                                v4 = var8_7;
                                v5 = var4_4;
                                if (var1_2 != 0) ** GOTO lbl44
                                break block27;
                                catch (InterruptedException v6) {
                                    throw lg_0.a(v6);
                                }
                            }
                            cfr_temp_0 = v4 - v5;
                            v1 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                        }
                        catch (InterruptedException v7) {
                            throw lg_0.a(v7);
                        }
                    }
                    if (v1 >= 0) break block24;
                    try {
                        v4 = var4_4;
                        v5 = var8_7;
lbl44:
                        // 2 sources

                        Thread.sleep(v4 - v5);
                    }
                    catch (InterruptedException var10_8) {
                        var10_8.printStackTrace();
                    }
                }
                if (var1_2 == 0) continue;
            }
            v0 = (tb_2)this.r;
        }
        try {
            v0.c();
        }
        catch (InvocationTargetException v8) {
            throw v8.getTargetException();
        }
        catch (IOException var4_5) {
            try {
                this.r.c();
            }
            catch (InvocationTargetException v9) {
                throw v9.getTargetException();
            }
        }
        catch (Throwable var11_9) {
            try {
                this.r.c();
            }
            catch (InvocationTargetException v10) {
                throw v10.getTargetException();
            }
            throw var11_9;
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7582271357641438273L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00c0\u00cdB\u008e\u00c0\u00df\u00ed&\u00840\u000fa%\u00d4\u00a1\f";
        int n11 = "\u00c0\u00cdB\u008e\u00c0\u00df\u00ed&\u00840\u000fa%\u00d4\u00a1\f".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2DC5;
        if (b[n11] == null) {
            lg_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

