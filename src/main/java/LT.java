/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class LT
implements ActionListener {
    final U a;
    private static final long[] b;
    private static final Long[] c;

    LT(U u10) {
        this.a = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block30: {
            int n10;
            block26: {
                long l2;
                long l3;
                block27: {
                    String[] stringArray;
                    block29: {
                        block28: {
                            int n11;
                            long l4;
                            try {
                                l4 = (Long)U.y.r();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            l3 = System.currentTimeMillis() - l4;
                            stringArray = F8.y();
                            n10 = ((KQ)U.y).isVisible();
                            if (stringArray != null) break block26;
                            if (n10 == 0) break block27;
                            try {
                                n11 = ((Boolean)U.y.O()).booleanValue();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            int n12 = n11;
                            long l6 = l3 - LT.a(27195, 8548535950817463058L);
                            l6 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                            if (stringArray == null) {
                                U u10;
                                if (l6 > 0) {
                                    n12 = 1;
                                }
                                try {
                                    u10 = (U)U.y.S();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                l6 = (long)u10.equals((U)this.a);
                            }
                            if (stringArray == null) {
                                if (l6 == false) {
                                    n12 = 1;
                                }
                                l6 = n12;
                            }
                            if (l6 == false) break block28;
                            try {
                                this.a.v();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (stringArray == null) break block29;
                        }
                        try {
                            U.y.setVisible(false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    if (stringArray == null) break block30;
                }
                n10 = (l2 = l3 - LT.a(13008, 746215865339991032L)) == 0L ? 0 : (l2 < 0L ? -1 : 1);
            }
            if (n10 > 0) {
                try {
                    this.a.v();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
        try {
            U.y.Y(this.a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8360661401461151461L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "~\\\u001e_B0\u0085\u00e7\u0002\u00a5\u0089\u0018\u00c3H\u00dc\u00db";
        int n11 = "~\\\u001e_B0\u0085\u00e7\u0002\u00a5\u0089\u0018\u00c3H\u00dc\u00db".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        b = lArray;
        c = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x6128) & Short.MAX_VALUE;
        if (c[n11] == null) {
            LT.c[n11] = b[n11] ^ l2;
        }
        return c[n11];
    }
}

