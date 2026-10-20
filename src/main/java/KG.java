/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class KG {
    public File s;
    long x;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long[] d;
    private static final Long[] e;

    public KG(String string) {
        this.s = new File(string);
    }

    /*
     * Unable to fully structure code
     */
    public byte[][] B() {
        block49: {
            var2_1 = null;
            var3_2 = null;
            this.x = this.s.length();
            var4_3 = null;
            var1_4 = D6.k();
            try {
                block44: {
                    block45: {
                        block42: {
                            block43: {
                                var5_5 = new FileInputStream(this.s);
                                var4_3 = new BufferedInputStream(var5_5);
                                var6_9 = (int)(this.s.length() / KG.b(11746, 4814929303217512045L));
                                try {
                                    cfr_temp_0 = this.s.length() % KG.b(30761, 8083936393603402663L) - 0L;
                                    v0 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                    if (var1_4 != null) break block42;
                                    if (v0 == false) break block43;
                                }
                                catch (FileNotFoundException v1) {
                                    throw KG.a(v1);
                                }
                                ++var6_9;
                            }
                            v0 = var6_9;
                        }
                        try {
                            if (var1_4 != null) break block44;
                            if (v0 != false) break block45;
                        }
                        catch (FileNotFoundException v2) {
                            throw KG.a(v2);
                        }
                        var6_9 = 1;
                    }
                    v0 = var6_9;
                }
                var2_1 = new byte[v0][KG.a(28384, 9131803016244656915L)];
                var7_10 = 0;
                while (var7_10 < var6_9) {
                    block47: {
                        block48: {
                            block46: {
                                var8_11 = 0;
                                try {
                                    cfr_temp_1 = this.x - KG.b(30761, 8083936393603402663L);
                                    v3 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                    if (var1_4 != null) break block46;
                                    if (v3 <= 0) {
                                    }
                                    ** GOTO lbl49
                                }
                                catch (FileNotFoundException v4) {
                                    throw KG.a(v4);
                                }
                                var8_11 = (int)this.x;
                                try {
                                    if (var1_4 == null) break block47;
lbl49:
                                    // 2 sources

                                    v3 = var7_10;
                                }
                                catch (FileNotFoundException v5) {
                                    throw KG.a(v5);
                                }
                            }
                            try {
                                if (var1_4 != null) break block48;
                                if (v3 < var6_9 - 1) {
                                }
                                ** GOTO lbl64
                            }
                            catch (FileNotFoundException v6) {
                                throw KG.a(v6);
                            }
                            var8_11 = KG.a(32510, 646926203746544396L);
                            try {
                                if (var1_4 == null) break block47;
lbl64:
                                // 2 sources

                                v3 = (int)(this.x % KG.b(30761, 8083936393603402663L));
                            }
                            catch (FileNotFoundException v7) {
                                throw KG.a(v7);
                            }
                        }
                        var8_11 = v3;
                    }
                    var9_12 = new byte[var8_11];
                    var3_2 = MessageDigest.getInstance(KG.a);
                    var4_3.read(var9_12);
                    var3_2.update(var9_12);
                    var2_1[var7_10] = var3_2.digest();
                    var9_12 = null;
                    ++var7_10;
                }
                var4_3.close();
            }
            catch (FileNotFoundException var5_6) {
                var5_6.printStackTrace();
                v8 = var4_3;
                if (var1_4 != null) ** GOTO lbl89
                if (v8 == null) break block49;
                try {
                    v8 = var4_3;
lbl89:
                    // 2 sources

                    v8.close();
                }
                catch (IOException var11_13) {
                    var11_13.printStackTrace();
                }
                break block49;
            }
            catch (IOException var5_7) {
                var5_7.printStackTrace();
                v9 = var4_3;
                if (var1_4 != null) ** GOTO lbl102
                if (v9 == null) break block49;
                try {
                    v9 = var4_3;
lbl102:
                    // 2 sources

                    v9.close();
                }
                catch (IOException var11_14) {
                    var11_14.printStackTrace();
                }
                break block49;
            }
            catch (NoSuchAlgorithmException var5_8) {
                var5_8.printStackTrace();
                v10 = var4_3;
                if (var1_4 != null) ** GOTO lbl132
                {
                    catch (Throwable var10_18) {
                        block50: {
                            try {
                                v11 = var4_3;
                                if (var1_4 == null) {
                                    if (v11 == null) break block50;
                                }
                                ** GOTO lbl123
                            }
                            catch (FileNotFoundException v12) {
                                throw KG.a(v12);
                            }
                            try {
                                v11 = var4_3;
lbl123:
                                // 2 sources

                                v11.close();
                            }
                            catch (IOException var11_16) {
                                var11_16.printStackTrace();
                            }
                        }
                        throw var10_18;
                    }
                }
                if (v10 == null) break block49;
                try {
                    v10 = var4_3;
lbl132:
                    // 2 sources

                    v10.close();
                }
                catch (IOException var11_15) {
                    var11_15.printStackTrace();
                }
                break block49;
            }
            try {
                v13 = var4_3;
                if (var1_4 == null) {
                    if (v13 == null) break block49;
                }
                ** GOTO lbl147
            }
            catch (FileNotFoundException v14) {
                throw KG.a(v14);
            }
            try {
                v13 = var4_3;
lbl147:
                // 2 sources

                v13.close();
            }
            catch (IOException var11_17) {
                var11_17.printStackTrace();
            }
        }
        return var2_1;
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                char[] cArray3 = "+1q".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 88;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
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
                            n17 = 62;
                            break;
                        }
                        case 1: {
                            n17 = 45;
                            break;
                        }
                        case 2: {
                            n17 = 28;
                            break;
                        }
                        case 3: {
                            n17 = 98;
                            break;
                        }
                        case 4: {
                            n17 = 96;
                            break;
                        }
                        case 5: {
                            n17 = 124;
                            break;
                        }
                        default: {
                            n17 = 91;
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
        long l2 = 1244861023483180375L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00c2\u00a0|\u0092\u00a5k\u00ceT\u001e\u00e3\u0089R1M\u00de[";
        int n19 = "\u00c2\u00a0|\u0092\u00a5k\u00ceT\u001e\u00e3\u0089R1M\u00de[".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
        long l3 = 5895645863825560377L;
        long[] lArray2 = new long[2];
        int n22 = 0;
        String string2 = "\u0013\u0003\u009a\u001d\u00ea<\u00cdT!\u00fec\u00fc\u00fdO\u0098\u009e";
        int n23 = "\u0013\u0003\u009a\u001d\u00ea<\u00cdT!\u00fec\u00fc\u00fdO\u0098\u009e".length();
        int n24 = 0;
        do {
            byte[] byArray = string2.substring(n24, n24 += 8).getBytes("ISO-8859-1");
            int n25 = n22++;
            lArray2[n25] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l3;
        } while (n24 < n23);
        d = lArray2;
        e = new Long[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x15F3;
        if (c[n11] == null) {
            KG.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x338F) & Short.MAX_VALUE;
        if (e[n11] == null) {
            KG.e[n11] = d[n11] ^ l2;
        }
        return e[n11];
    }
}

