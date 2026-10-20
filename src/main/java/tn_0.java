/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.Arrays;

/*
 * Renamed from Tn
 */
public class tn_0 {
    private static BigInteger d;
    private static final long[] a;
    private static final Integer[] b;

    public byte[] G(byte[] byArray, ud_1 ud_12) {
        int n10;
        int n11;
        int n12;
        int n13;
        int[] nArray;
        int[] nArray2 = new int[tn_0.a(6832, 5874474620014300320L)];
        try {
            nArray = (int[])cb_2.C(byArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int[] nArray3 = nArray;
        try {
            n13 = (Integer)(Object)ud_12.w();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n14 = n13 / tn_0.a(11257, 3684156388545805807L);
        int n15 = 0;
        for (int i2 = 0; i2 < nArray3.length; i2 += n15) {
            n15 = Math.min(nArray3.length - i2, n14);
            for (int i3 = 0; i3 < n15; ++i3) {
                nArray2[i3] = nArray2[i3] ^ nArray3[i3 + i2];
            }
            if (n15 != n14) continue;
            try {
                this.F(nArray2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            n15 = 0;
        }
        try {
            n12 = (Integer)(Object)ud_12.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        nArray2[n15] = nArray2[n15] ^ n12;
        try {
            n11 = (Integer)(Object)ud_12.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if ((n11 & tn_0.a(17755, 7691826784566203214L)) != 0 && n15 == n14 - 1) {
            try {
                this.F(nArray2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        nArray2[n14 - 1] = nArray2[n14 - 1] ^ tn_0.a(25495, 3066096042537645440L);
        try {
            this.F(nArray2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            n10 = (Integer)(Object)ud_12.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n16 = n10 / tn_0.a(26106, 11780229843055595L);
        while (n16 > 0) {
            n15 = Math.min(n16, n14);
            for (int i4 = 0; i4 < n15; ++i4) {
                byteArrayOutputStream.write((byte)nArray2[i4]);
            }
            if ((n16 -= n15) <= 0) continue;
            try {
                this.F(nArray2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void F(int[] nArray) {
        int[] nArray2;
        int n10;
        int n11;
        BigInteger[][] bigIntegerArray = new BigInteger[5][5];
        for (n11 = 0; n11 < 5; ++n11) {
            for (n10 = 0; n10 < 5; ++n10) {
                BigInteger bigInteger;
                nArray2 = new int[tn_0.a(26106, 11780229843055595L)];
                System.arraycopy(nArray, tn_0.a(26106, 11780229843055595L) * (n11 + 5 * n10), nArray2, 0, nArray2.length);
                try {
                    bigInteger = (BigInteger)cb_2.J(nArray2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bigIntegerArray[n11][n10] = bigInteger;
            }
        }
        try {
            this.Z(bigIntegerArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Arrays.fill(nArray, 0);
        for (n11 = 0; n11 < 5; ++n11) {
            for (n10 = 0; n10 < 5; ++n10) {
                int[] nArray3;
                try {
                    nArray3 = (int[])cb_2.N(bigIntegerArray[n11][n10]);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                nArray2 = nArray3;
                System.arraycopy(nArray2, 0, nArray, tn_0.a(26106, 11780229843055595L) * (n11 + 5 * n10), nArray2.length);
            }
        }
    }

    private void Z(BigInteger[][] bigIntegerArray) {
        int n10 = 1;
        for (int i2 = 0; i2 < tn_0.a(5196, 802608875531928152L); ++i2) {
            int n11;
            int n12;
            int n13;
            BigInteger[] bigIntegerArray2 = new BigInteger[5];
            BigInteger[] bigIntegerArray3 = new BigInteger[5];
            for (n13 = 0; n13 < 5; ++n13) {
                bigIntegerArray2[n13] = bigIntegerArray[n13][0].xor(bigIntegerArray[n13][1]).xor(bigIntegerArray[n13][2]).xor(bigIntegerArray[n13][3]).xor(bigIntegerArray[n13][4]);
            }
            for (n13 = 0; n13 < 5; ++n13) {
                BigInteger bigInteger;
                try {
                    bigInteger = (BigInteger)cb_2.y((Object)bigIntegerArray2[(n13 + 1) % 5], 1);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bigIntegerArray3[n13] = bigIntegerArray2[(n13 + 4) % 5].xor(bigInteger);
            }
            for (n13 = 0; n13 < 5; ++n13) {
                for (n12 = 0; n12 < 5; ++n12) {
                    bigIntegerArray[n13][n12] = bigIntegerArray[n13][n12].xor(bigIntegerArray3[n13]);
                }
            }
            n13 = 1;
            n12 = 0;
            BigInteger bigInteger = bigIntegerArray[n13][n12];
            for (n11 = 0; n11 < tn_0.a(14931, 3019638816695888961L); ++n11) {
                BigInteger bigInteger2;
                int n14 = n13;
                n13 = n12;
                n12 = (2 * n14 + 3 * n12) % 5;
                BigInteger bigInteger3 = bigInteger;
                bigInteger = bigIntegerArray[n13][n12];
                try {
                    bigInteger2 = (BigInteger)cb_2.y((Object)bigInteger3, (n11 + 1) * (n11 + 2) / 2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bigIntegerArray[n13][n12] = bigInteger2;
            }
            for (n11 = 0; n11 < 5; ++n11) {
                int n15;
                BigInteger[] bigIntegerArray4 = new BigInteger[5];
                for (n15 = 0; n15 < 5; ++n15) {
                    bigIntegerArray4[n15] = bigIntegerArray[n15][n11];
                }
                for (n15 = 0; n15 < 5; ++n15) {
                    BigInteger bigInteger4 = bigIntegerArray4[(n15 + 1) % 5].xor((BigInteger)tn_0.d);
                    bigIntegerArray[n15][n11] = bigIntegerArray4[n15].xor(bigInteger4.and(bigIntegerArray4[(n15 + 2) % 5]));
                }
            }
            for (n11 = 0; n11 < tn_0.a(16821, 8078101440061331375L); ++n11) {
                n10 = (n10 << 1 ^ (n10 >> tn_0.a(2752, 449986380990225619L)) * tn_0.a(15916, 7409829986467031093L)) % tn_0.a(5616, 2960860994259321835L);
                int n16 = (1 << n11) - 1;
                if ((n10 & 2) == 0) continue;
                bigIntegerArray[0][0] = bigIntegerArray[0][0].xor(new BigInteger("1").shiftLeft(n16));
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = ":v\u001e%(\u0000\u001d?~\u001d\")\u0007\u0010>{\u001b'/\u0002".toCharArray();
                v1 = v0.length;
                var9_1 = 0;
                v2 = 72;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var9_1;
                    while (true) {
                        switch (var9_1 % 7) {
                            case 0: {
                                v9 = 67;
                                break;
                            }
                            case 1: {
                                v9 = 6;
                                break;
                            }
                            case 2: {
                                v9 = 98;
                                break;
                            }
                            case 3: {
                                v9 = 89;
                                break;
                            }
                            case 4: {
                                v9 = 86;
                                break;
                            }
                            case 5: {
                                v9 = 127;
                                break;
                            }
                            default: {
                                v9 = 97;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var9_1;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var9_1);
                ** while (true)
                var8 = new String(v10).intern();
                var0_2 = 8904151357948399024L;
                var6_3 = new long[11];
                var3_4 = 0;
                var4_5 = "\u00ac\u00c5\u0091\u0018d|\u0011d\u00c6*Q\u00f0\u0097\u00f0!\u00e92\u009b\u0096\u00a6\u00a3\u00f9~S\u00aa\u00b0\u00e4S4\u00d3\u0081\u00d8\u0016L,\u00d1\u00ca|x\u00b0\u0014\u001f\u0091\u00da\u0098\u0091\u00b0W\u00ca\u0018\u00bd\u00f9\u00c34\u00de~\u0094Q\u00c7\u00f5\u00cb{\u008f\u00f0bE;\u00de\u00cc\u00f0\u008f[";
                var5_6 = "\u00ac\u00c5\u0091\u0018d|\u0011d\u00c6*Q\u00f0\u0097\u00f0!\u00e92\u009b\u0096\u00a6\u00a3\u00f9~S\u00aa\u00b0\u00e4S4\u00d3\u0081\u00d8\u0016L,\u00d1\u00ca|x\u00b0\u0014\u001f\u0091\u00da\u0098\u0091\u00b0W\u00ca\u0018\u00bd\u00f9\u00c34\u00de~\u0094Q\u00c7\u00f5\u00cb{\u008f\u00f0bE;\u00de\u00cc\u00f0\u008f[".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v11 = var6_3;
                    v12 = var3_4++;
                    v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00e7\u00b6]_\u0016\u00be\u00da\u0018\u007f\\V\u0091\u00c1\u00b4%\u00f4";
                    var5_6 = "\u00e7\u00b6]_\u0016\u00be\u00da\u0018\u007f\\V\u0091\u00c1\u00b4%\u00f4".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v11 = var6_3;
                        v12 = var3_4++;
                        v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_2;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        tn_0.a = var6_3;
        tn_0.b = new Integer[11];
        tn_0.d = new BigInteger(var8);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1613;
        if (b[n11] == null) {
            tn_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

