/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FP;
import com.GN;
import com.xe_0;
import com.y1_0;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/*
 * Renamed from com.ye
 */
abstract class ye_2
implements FP {
    protected String N;
    protected int c;
    protected String a;
    protected boolean v;
    private Mac m;
    private final byte[] V = new byte[4];
    private static final long[] h;
    private static final Integer[] i;

    ye_2() {
    }

    @Override
    public int h() {
        return this.c;
    }

    @Override
    public void L(byte[] byArray) throws Exception {
        Object object;
        block5: {
            int n10;
            block4: {
                boolean bl = y1_0.D();
                try {
                    try {
                        n10 = byArray.length;
                        if (bl) break block4;
                        if (n10 <= this.c) break block5;
                    }
                    catch (Exception exception) {
                        throw ye_2.a(exception);
                    }
                    n10 = this.c;
                }
                catch (Exception exception) {
                    throw ye_2.a(exception);
                }
            }
            object = new byte[n10];
            System.arraycopy(byArray, 0, object, 0, this.c);
            byArray = object;
        }
        object = new SecretKeySpec(byArray, this.a);
        this.m = Mac.getInstance(this.a);
        this.m.init((Key)object);
    }

    @Override
    public void H(int n10) {
        this.V[0] = (byte)(n10 >>> ye_2.a(31186, 54014925996639547L));
        this.V[1] = (byte)(n10 >>> ye_2.a(28375, 3846864861336031804L));
        this.V[2] = (byte)(n10 >>> ye_2.a(1556, 6301083332872747772L));
        this.V[3] = (byte)n10;
        this.o(this.V, 0, 4);
    }

    @Override
    public void o(byte[] byArray, int n10, int n11) {
        this.m.update(byArray, n10, n11);
    }

    @Override
    public void U(byte[] byArray, int n10) {
        block7: {
            boolean bl = y1_0.D();
            try {
                this.m.doFinal(byArray, n10);
            }
            catch (ShortBufferException shortBufferException) {
                int n11;
                GN gN2;
                block6: {
                    try {
                        try {
                            gN2 = xe_0.W();
                            n11 = 3;
                            if (bl) break block6;
                            if (!gN2.K(n11)) break block7;
                        }
                        catch (ShortBufferException shortBufferException2) {
                            throw ye_2.a(shortBufferException2);
                        }
                        gN2 = xe_0.W();
                        n11 = 3;
                    }
                    catch (ShortBufferException shortBufferException3) {
                        throw ye_2.a(shortBufferException3);
                    }
                }
                gN2.c(n11, shortBufferException.getMessage(), shortBufferException);
            }
        }
    }

    @Override
    public String k() {
        return this.N;
    }

    @Override
    public boolean P() {
        return this.v;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2728769624800263676L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\b\u00bc\u00dfH\u00dc\u00818\u00df\u00a5Z\u00972<\u001b\u00c7\b\u00baL5\u008f\u0096\u00c5\u00af\u00d0";
        int n11 = "\b\u00bc\u00dfH\u00dc\u00818\u00df\u00a5Z\u00972<\u001b\u00c7\b\u00baL5\u008f\u0096\u00c5\u00af\u00d0".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        h = lArray;
        i = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3CE9;
        if (i[n11] == null) {
            ye_2.i[n11] = (int)(h[n11] ^ l2);
        }
        return i[n11];
    }
}

