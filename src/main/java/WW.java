/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import org.apache.hc.client5.http.classic.HttpClient;

class WW
implements Runnable {
    final da_1 x;
    final um_1 F;
    private static final long a;
    private static final long[] b;
    private static final Long[] c;

    WW(um_1 um_12, da_1 da_12) {
        this.F = um_12;
        this.x = da_12;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block44: {
            block42: {
                yy_2 yy_22;
                String[] stringArray;
                block43: {
                    int n10;
                    block41: {
                        yy_2 yy_23;
                        Object object;
                        HttpClient httpClient;
                        String[] stringArray2 = da_1.q();
                        long l2 = WW.a(22416, 2412097208438520462L);
                        this.F.u = new tl_1();
                        stringArray = stringArray2;
                        try {
                            httpClient = (HttpClient)this.F.u.F();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        HttpClient httpClient2 = httpClient;
                        try {
                            this.F.u.a(httpClient2);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (System.currentTimeMillis() - this.F.m <= 1L * l2) break block44;
                        try {
                            object = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            yy_23 = (yy_2)object.Y();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        yy_22 = yy_23;
                        try {
                            yy_22.B(this.F.u);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n10 = ((Boolean)yy_22.X()).booleanValue();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray != null) break block41;
                        try {
                            block47: {
                                if (n10 != 0) break block42;
                                break block47;
                                catch (InterruptedException interruptedException) {
                                    throw WW.a(interruptedException);
                                }
                            }
                            try {
                                n10 = ((Boolean)yy_22.l()).booleanValue() ? 1 : 0;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        catch (InterruptedException interruptedException) {
                            throw WW.a(interruptedException);
                        }
                    }
                    if (stringArray != null) break block43;
                    try {
                        block48: {
                            if (n10 != 0) break block42;
                            break block48;
                            catch (InterruptedException interruptedException) {
                                throw WW.a(interruptedException);
                            }
                        }
                        try {
                            this.x.j();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n10 = 0;
                    }
                    catch (InterruptedException interruptedException) {
                        throw WW.a(interruptedException);
                    }
                }
                for (int i2 = v1447857; i2 < (int)a; ++i2) {
                    da_1 da_12;
                    block46: {
                        boolean bl;
                        block45: {
                            try {
                                Thread.sleep(WW.a(13147, 6942859828494605892L));
                                if (stringArray != null) break block44;
                            }
                            catch (InterruptedException interruptedException) {
                                interruptedException.printStackTrace();
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            bl = (Boolean)yy_22.l();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (stringArray != null) break block45;
                                        if (!bl) continue;
                                    }
                                    catch (InterruptedException interruptedException) {
                                        throw WW.a(interruptedException);
                                    }
                                    da_12 = (da_1)this.x;
                                    if (stringArray != null) break block46;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw WW.a(interruptedException);
                                }
                                bl = da_12.isVisible();
                            }
                            catch (InterruptedException interruptedException) {
                                throw WW.a(interruptedException);
                            }
                        }
                        try {
                            if (bl) continue;
                            ((da_1)this.x).setLocationRelativeTo(null);
                            try {
                                this.x.setVisible(true);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            da_12 = (da_1)this.x;
                        }
                        catch (InterruptedException interruptedException) {
                            throw WW.a(interruptedException);
                        }
                    }
                    try {
                        lk_0.V(da_12);
                        continue;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            }
            this.F.m = System.currentTimeMillis();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 117857613449041625L;
        a = 0xF38D54B6FFB496EBL ^ l2;
        long l3 = 1382739955694580007L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "2I\u0007\b~|\u0017\u00a9si\u0084\u0093I*/\u0007";
        int n11 = "2I\u0007\b~|\u0017\u00a9si\u0084\u0093I*/\u0007".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l3;
        } while (n12 < n11);
        b = lArray;
        c = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x2D1E) & Short.MAX_VALUE;
        if (c[n11] == null) {
            WW.c[n11] = b[n11] ^ l2;
        }
        return c[n11];
    }
}

