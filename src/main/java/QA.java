/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class QA
implements Runnable {
    final ur_1 L;
    private static final long a;
    private static final long[] b;
    private static final Long[] c;

    QA(ur_1 ur_12) {
        this.L = ur_12;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block34: {
            ur_1 ur_12;
            block35: {
                block36: {
                    long l2;
                    String[] stringArray;
                    block33: {
                        block39: {
                            long l3 = QA.a(20500, 6667209510206160763L);
                            stringArray = WT.y();
                            long l4 = System.currentTimeMillis() - this.L.x - 1L * l3;
                            l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                            if (stringArray != null) break block33;
                            if (l2 <= 0) break block34;
                            break block39;
                            catch (InterruptedException interruptedException) {
                                throw QA.a(interruptedException);
                            }
                        }
                        try {
                            block40: {
                                ur_12 = (ur_1)this.L;
                                if (stringArray != null) break block35;
                                break block40;
                                catch (InterruptedException interruptedException) {
                                    throw QA.a(interruptedException);
                                }
                            }
                            try {
                                l2 = (long)((Boolean)ur_12.l.O()).booleanValue();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        catch (InterruptedException interruptedException) {
                            throw QA.a(interruptedException);
                        }
                    }
                    if (l2 != false) break block36;
                    try {
                        boolean bl;
                        block41: {
                            ur_12 = (ur_1)this.L;
                            if (stringArray != null) break block35;
                            break block41;
                            catch (InterruptedException interruptedException) {
                                throw QA.a(interruptedException);
                            }
                        }
                        try {
                            bl = (Boolean)ur_12.l.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (bl) break block36;
                    }
                    catch (InterruptedException interruptedException) {
                        throw QA.a(interruptedException);
                    }
                    try {
                        this.L.b.C();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    for (int i2 = 0; i2 < (int)a; ++i2) {
                        WT wT;
                        block38: {
                            boolean bl;
                            block37: {
                                try {
                                    Thread.sleep(QA.a(18751, 1094906347186300497L));
                                    if (stringArray != null) break block34;
                                }
                                catch (InterruptedException interruptedException) {
                                    interruptedException.printStackTrace();
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                bl = (Boolean)this.L.l.h();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (stringArray != null) break block37;
                                            if (!bl) continue;
                                        }
                                        catch (InterruptedException interruptedException) {
                                            throw QA.a(interruptedException);
                                        }
                                        wT = (WT)this.L.b;
                                        if (stringArray != null) break block38;
                                    }
                                    catch (InterruptedException interruptedException) {
                                        throw QA.a(interruptedException);
                                    }
                                    bl = wT.isVisible();
                                }
                                catch (InterruptedException interruptedException) {
                                    throw QA.a(interruptedException);
                                }
                            }
                            try {
                                if (bl) continue;
                                ((WT)this.L.b).setLocationRelativeTo(null);
                                try {
                                    this.L.b.setVisible(true);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                wT = (WT)this.L.b;
                            }
                            catch (InterruptedException interruptedException) {
                                throw QA.a(interruptedException);
                            }
                        }
                        try {
                            lk_0.V(wT);
                            continue;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                }
                ur_12 = (ur_1)this.L;
            }
            ur_12.x = System.currentTimeMillis();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1987669997443141524L;
        a = 0x818306F6E04CCFA6L ^ l2;
        long l3 = 8852650952532560489L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "&\\@\u009a\u00f5\u0096\u00ff\u0092u\u00eb\f\u00a6\u00dcf,\\";
        int n11 = "&\\@\u009a\u00f5\u0096\u00ff\u0092u\u00eb\f\u00a6\u00dcf,\\".length();
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
        int n11 = (n10 ^ (int)l2 ^ 0x6F6F) & Short.MAX_VALUE;
        if (c[n11] == null) {
            QA.c[n11] = b[n11] ^ l2;
        }
        return c[n11];
    }
}

