/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ku_0;
import com.y1_0;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

abstract class uV
implements ku_0 {
    private SecretKeyFactory T;
    private byte[] q;
    private int f;
    private static final long[] b;
    private static final Integer[] c;

    uV() {
    }

    abstract String y();

    @Override
    public void l(byte[] byArray, int n10) throws Exception {
        this.T = SecretKeyFactory.getInstance(this.y());
        this.q = byArray;
        this.f = n10;
    }

    @Override
    public byte[] m(byte[] byArray, int n10) {
        char[] cArray = new char[byArray.length];
        boolean bl = y1_0.D();
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            cArray[i2] = (char)(byArray[i2] & uV.a(4005, 1511622107905857971L));
            if (!bl) continue;
        }
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArray, this.q, this.f, n10 * uV.a(32678, 1833642750866811313L));
            byte[] byArray2 = this.T.generateSecret(pBEKeySpec).getEncoded();
            return byArray2;
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8408956735451386150L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "r\u00fb\u00c8\u00cc\u00c6W\u00b8\u009f;\u0081(#tnHj";
        int n11 = "r\u00fb\u00c8\u00cc\u00c6W\u00b8\u009f;\u0081(#tnHj".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1617;
        if (c[n11] == null) {
            uV.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

