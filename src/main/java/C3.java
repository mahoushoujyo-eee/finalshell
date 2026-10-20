/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class C3
implements Runnable {
    private static final long a;
    private static final long[] b;
    private static final Long[] c;

    C3() {
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block39: {
            block41: {
                yy_2 yy_22;
                String[] stringArray;
                block42: {
                    int n10;
                    block40: {
                        yy_2 yy_23;
                        Object object;
                        long l2 = C3.a(26053, 3321171622737765642L);
                        stringArray = F8.y();
                        if (System.currentTimeMillis() - U.p >= 1L * l2) break block39;
                        try {
                            block45: {
                                if ((da_1)U.f == null) break block39;
                                break block45;
                                catch (InterruptedException interruptedException) {
                                    throw C3.a(interruptedException);
                                }
                            }
                            if (System.currentTimeMillis() - U.hc <= 1L * l2) break block39;
                        }
                        catch (InterruptedException interruptedException) {
                            throw C3.a(interruptedException);
                        }
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
                            n10 = ((Boolean)yy_22.X()).booleanValue();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray != null) break block40;
                        try {
                            block46: {
                                if (n10 != 0) break block41;
                                break block46;
                                catch (InterruptedException interruptedException) {
                                    throw C3.a(interruptedException);
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
                            throw C3.a(interruptedException);
                        }
                    }
                    if (stringArray != null) break block42;
                    try {
                        block47: {
                            if (n10 != 0) break block41;
                            break block47;
                            catch (InterruptedException interruptedException) {
                                throw C3.a(interruptedException);
                            }
                        }
                        try {
                            U.f.j();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n10 = 0;
                    }
                    catch (InterruptedException interruptedException) {
                        throw C3.a(interruptedException);
                    }
                }
                for (int i2 = v79122; i2 < (int)a; ++i2) {
                    da_1 da_12;
                    block44: {
                        boolean bl;
                        block43: {
                            try {
                                Thread.sleep(C3.a(11276, 7754499588254936258L));
                                if (stringArray != null) break block39;
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
                                        if (stringArray != null) break block43;
                                        if (!bl) continue;
                                    }
                                    catch (InterruptedException interruptedException) {
                                        throw C3.a(interruptedException);
                                    }
                                    da_12 = (da_1)U.f;
                                    if (stringArray != null) break block44;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw C3.a(interruptedException);
                                }
                                bl = da_12.isVisible();
                            }
                            catch (InterruptedException interruptedException) {
                                throw C3.a(interruptedException);
                            }
                        }
                        try {
                            if (bl) continue;
                            ((da_1)U.f).setLocationRelativeTo(null);
                            try {
                                U.f.setVisible(true);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            da_12 = (da_1)U.f;
                        }
                        catch (InterruptedException interruptedException) {
                            throw C3.a(interruptedException);
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
            U.hc = System.currentTimeMillis();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8087108803887025739L;
        a = 0x81ED6A6E1B9ECE79L ^ l2;
        long l3 = 6965780921769082607L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "N\u00bcG)\u000f\u007f\u0007\u00e5\u000b6\u00e8\u009d\u00c9\u00e4\u0012I";
        int n11 = "N\u00bcG)\u000f\u007f\u0007\u00e5\u000b6\u00e8\u009d\u00c9\u00e4\u0012I".length();
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
        int n11 = (n10 ^ (int)l2 ^ 0xCF) & Short.MAX_VALUE;
        if (c[n11] == null) {
            C3.c[n11] = b[n11] ^ l2;
        }
        return c[n11];
    }
}

