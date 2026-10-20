/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.y1_0;
import com.z5;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/*
 * Renamed from com.xt
 */
@Deprecated
public class xt_2
implements z5 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public byte[] T(byte[] byArray, byte[] byArray2, int n10, int n11) {
        char[] cArray = new char[byArray.length];
        boolean bl = y1_0.Q();
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            cArray[i2] = (char)(byArray[i2] & xt_2.a(615, 8060785003590770234L));
            if (bl) continue;
        }
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArray, byArray2, n10, n11 * xt_2.a(25371, 6000346522534625095L));
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(a);
            byte[] byArray3 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
            return byArray3;
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        return null;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "\f\\z\"W=95jY.|n\r\u000fVpW".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 10;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 86;
                            break;
                        }
                        case 1: {
                            n17 = 20;
                            break;
                        }
                        case 2: {
                            n17 = 59;
                            break;
                        }
                        case 3: {
                            n17 = 108;
                            break;
                        }
                        case 4: {
                            n17 = 27;
                            break;
                        }
                        case 5: {
                            n17 = 5;
                            break;
                        }
                        default: {
                            n17 = 100;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 529648966096395486L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u0088^\u00b4WS9#\u0091\u00efi3O\u0012\u0006\u00c2\u001b";
        int n19 = "\u0088^\u00b4WS9#\u0091\u00efi3O\u0012\u0006\u00c2\u001b".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5C5C;
        if (c[n11] == null) {
            xt_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

