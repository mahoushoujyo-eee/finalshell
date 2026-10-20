/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;

/*
 * Renamed from yc
 */
class yc_2
implements Runnable {
    final InputStream B;
    final int d;
    final PipedOutputStream m;
    private static final long a;
    private static final long b;

    yc_2(InputStream inputStream, int n10, PipedOutputStream pipedOutputStream) {
        this.B = inputStream;
        this.d = n10;
        this.m = pipedOutputStream;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block56: {
            block54: {
                block55: {
                    block51: {
                        var2_1 = new byte[(int)yc_2.a];
                        var3_2 = 0;
                        var1_3 = BS.t();
                        while ((var3_2 = ((InputStream)this.B).read(var2_1)) > 0) {
                            block53: {
                                block52: {
                                    block63: {
                                        block62: {
                                            var4_4 = yc_2.b * (long)var3_2 / (long)this.d;
                                            var6_11 = System.currentTimeMillis();
                                            ((PipedOutputStream)this.m).write(var2_1, 0, var3_2);
                                            ((PipedOutputStream)this.m).flush();
                                            var8_12 = System.currentTimeMillis() - var6_11;
                                            v0 = this;
                                            if (var1_3 != 0) break block51;
                                            v1 = v0.d;
                                            if (var1_3 != 0) break block52;
                                            break block62;
                                            catch (InterruptedException v2) {
                                                throw yc_2.a(v2);
                                            }
                                        }
                                        if (v1 <= 0) break block53;
                                        break block63;
                                        catch (InterruptedException v3) {
                                            throw yc_2.a(v3);
                                        }
                                    }
                                    try {
                                        block64: {
                                            v4 = var8_12;
                                            v5 = var4_4;
                                            if (var1_3 != 0) ** GOTO lbl45
                                            break block64;
                                            catch (InterruptedException v6) {
                                                throw yc_2.a(v6);
                                            }
                                        }
                                        cfr_temp_0 = v4 - v5;
                                        v1 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                    }
                                    catch (InterruptedException v7) {
                                        throw yc_2.a(v7);
                                    }
                                }
                                if (v1 >= 0) break block53;
                                try {
                                    v4 = var4_4;
                                    v5 = var8_12;
lbl45:
                                    // 2 sources

                                    Thread.sleep(v4 - v5);
                                }
                                catch (InterruptedException var10_13) {
                                    var10_13.printStackTrace();
                                }
                            }
                            if (var1_3 == 0) continue;
                        }
                        v0 = this;
                    }
                    if (var1_3 != 0) break block54;
                    try {
                        block65: {
                            if ((InputStream)v0.B == null) break block55;
                            break block65;
                            catch (InterruptedException v8) {
                                throw yc_2.a(v8);
                            }
                        }
                        ((InputStream)this.B).close();
                        break block55;
                    }
                    catch (InterruptedException v9) {
                        throw yc_2.a(v9);
                    }
                    {
                        catch (IOException var4_5) {
                            var4_5.printStackTrace();
                        }
                    }
                }
                v0 = this;
            }
            try {
                v10 = (PipedOutputStream)v0.m;
                if (var1_3 == 0) {
                    if (v10 == null) break block56;
                }
                ** GOTO lbl81
            }
            catch (InterruptedException v11) {
                throw yc_2.a(v11);
            }
            try {
                v10 = (PipedOutputStream)this.m;
lbl81:
                // 2 sources

                v10.close();
            }
            catch (IOException var4_6) {
                var4_6.printStackTrace();
            }
            break block56;
            catch (IOException var4_7) {
                block57: {
                    block58: {
                        v12 = this;
                        if (var1_3 != 0) break block57;
                        try {
                            block66: {
                                if ((InputStream)v12.B == null) break block58;
                                break block66;
                                catch (InterruptedException v13) {
                                    throw yc_2.a(v13);
                                }
                            }
                            ((InputStream)this.B).close();
                            break block58;
                        }
                        catch (InterruptedException v14) {
                            throw yc_2.a(v14);
                        }
                        {
                            catch (IOException var4_8) {
                                var4_8.printStackTrace();
                            }
                        }
                    }
                    v12 = this;
                }
                try {
                    v15 = (PipedOutputStream)v12.m;
                    if (var1_3 == 0) {
                        if (v15 == null) break block56;
                    }
                    ** GOTO lbl116
                }
                catch (InterruptedException v16) {
                    throw yc_2.a(v16);
                }
                try {
                    v15 = (PipedOutputStream)this.m;
lbl116:
                    // 2 sources

                    v15.close();
                }
                catch (IOException var4_10) {
                    var4_10.printStackTrace();
                }
            }
            catch (Throwable var11_14) {
                block61: {
                    block59: {
                        block60: {
                            try {
                                try {
                                    v17 = this;
                                    if (var1_3 != 0) break block59;
                                    if ((InputStream)v17.B == null) break block60;
                                }
                                catch (InterruptedException v18) {
                                    throw yc_2.a(v18);
                                }
                                ((InputStream)this.B).close();
                                break block60;
                            }
                            catch (InterruptedException v19) {
                                throw yc_2.a(v19);
                            }
                            {
                                catch (IOException var12_15) {
                                    var12_15.printStackTrace();
                                }
                            }
                        }
                        v17 = this;
                    }
                    try {
                        v20 = (PipedOutputStream)v17.m;
                        if (var1_3 == 0) {
                            if (v20 == null) break block61;
                        }
                        ** GOTO lbl150
                    }
                    catch (InterruptedException v21) {
                        throw yc_2.a(v21);
                    }
                    try {
                        v20 = (PipedOutputStream)this.m;
lbl150:
                        // 2 sources

                        v20.close();
                    }
                    catch (IOException var12_16) {
                        var12_16.printStackTrace();
                    }
                }
                throw var11_14;
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
        long l2 = 2259873607493926846L;
        a = 0xA35A15789BF5BFBEL ^ l2;
        long l3 = 7818634203571841965L;
        b = 0x6C815E621C9E6845L ^ l3;
    }
}

