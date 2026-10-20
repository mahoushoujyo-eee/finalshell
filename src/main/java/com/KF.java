/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.crypto.CipherParameters
 *  org.bouncycastle.crypto.Digest
 *  org.bouncycastle.crypto.macs.HMac
 *  org.bouncycastle.crypto.params.KeyParameter
 */
package com;

import com.FP;
import com.K4;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

abstract class KF
implements FP {
    protected String Z;
    protected int N;
    protected Digest M;
    protected boolean i;
    private HMac C;
    private final byte[] l = new byte[4];
    private static final long[] c;
    private static final Integer[] d;

    KF() {
    }

    @Override
    public int h() {
        return this.N;
    }

    @Override
    public void L(byte[] byArray) throws Exception {
        Object object;
        block5: {
            int n10;
            block4: {
                String string = K4.z();
                try {
                    try {
                        n10 = byArray.length;
                        if (string != null) break block4;
                        if (n10 <= this.N) break block5;
                    }
                    catch (Exception exception) {
                        throw KF.a(exception);
                    }
                    n10 = this.N;
                }
                catch (Exception exception) {
                    throw KF.a(exception);
                }
            }
            object = new byte[n10];
            System.arraycopy(byArray, 0, object, 0, this.N);
            byArray = object;
        }
        object = new KeyParameter(byArray, 0, byArray.length);
        this.C = new HMac(this.M);
        this.C.init((CipherParameters)object);
    }

    @Override
    public void H(int n10) {
        this.l[0] = (byte)(n10 >>> KF.a(23333, 7783446884609124978L));
        this.l[1] = (byte)(n10 >>> KF.a(8369, 8227531270450745829L));
        this.l[2] = (byte)(n10 >>> KF.a(25374, 5359407350381859403L));
        this.l[3] = (byte)n10;
        this.o(this.l, 0, 4);
    }

    @Override
    public void o(byte[] byArray, int n10, int n11) {
        this.C.update(byArray, n10, n11);
    }

    @Override
    public void U(byte[] byArray, int n10) {
        this.C.doFinal(byArray, n10);
    }

    @Override
    public String k() {
        return this.Z;
    }

    @Override
    public boolean P() {
        return this.i;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8872236794754149876L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00ef\u00c5~6lX\u007f\u00b7-}\u0092\u0091\u00f3\u00da<\u0001\u00f6\u00c1KUoG\u00c7\u009e";
        int n11 = "\u00ef\u00c5~6lX\u007f\u00b7-}\u0092\u0091\u00f3\u00da<\u0001\u00f6\u00c1KUoG\u00c7\u009e".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        c = lArray;
        d = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3155;
        if (d[n11] == null) {
            KF.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

