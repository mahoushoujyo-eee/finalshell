/*
 * Decompiled with CFR 0.152.
 */
package org.w;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.AccessControlException;
import java.util.Collections;
import java.util.Map;
import org.F.c;
import org.w.d;

public class h
extends ClassLoader {
    private final Map T;
    private Map y = Collections.emptyMap();
    static final /* synthetic */ boolean W;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public h(Map map) {
        this.T = map;
    }

    public h(Map map, ClassLoader classLoader) {
        super(classLoader);
        this.T = map;
    }

    public void H(Map map) {
        this.y = map;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Class findClass(@c String var1_1) throws ClassNotFoundException {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block20: {
                            var2_2 = d.q();
                            if (h.W) break block16;
                            v0 /* !! */  = var1_1;
                            if (var2_2 != null) break block17;
                            break block20;
                            catch (AccessControlException v1) {
                                throw h.a(v1);
                            }
                        }
                        try {
                            block21: {
                                if (v0 /* !! */  != null) break block16;
                                break block21;
                                catch (AccessControlException v2) {
                                    throw h.a(v2);
                                }
                            }
                            throw new AssertionError();
                        }
                        catch (AccessControlException v3) {
                            throw h.a(v3);
                        }
                    }
                    v0 /* !! */  = this.T.get(var1_1);
                }
                var3_3 = (byte[])v0 /* !! */ ;
                v4 = var3_3;
                if (var2_2 != null) break block18;
                try {
                    block22: {
                        if (v4 != null) break block19;
                        break block22;
                        catch (AccessControlException v5) {
                            throw h.a(v5);
                        }
                    }
                    v6 = this;
                    if (var2_2 == null) {
                    }
                    ** GOTO lbl50
                }
                catch (AccessControlException v7) {
                    throw h.a(v7);
                }
                v4 = var3_3 = (byte[])v6.T.get(var1_1.replace((char)h.a(3414, 5971586045051774321L), (char)h.a(19625, 5800405406072661135L)) + h.a);
            }
            try {
                if (v4 == null) {
                    throw new ClassNotFoundException(var1_1);
                }
            }
            catch (AccessControlException v8) {
                throw h.a(v8);
            }
        }
        try {
            v6 = this;
lbl50:
            // 2 sources

            var4_4 = v6.getClass().getProtectionDomain();
        }
        catch (AccessControlException var5_5) {
            var4_4 = null;
        }
        return super.defineClass(var1_1, var3_3, 0, var3_3.length, var4_4);
    }

    @Override
    public InputStream getResourceAsStream(String string) {
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream;
        block6: {
            block7: {
                InputStream inputStream2 = super.getResourceAsStream(string);
                int[] nArray = d.q();
                try {
                    try {
                        inputStream = inputStream2;
                        if (nArray != null) break block6;
                        if (inputStream == null) break block7;
                    }
                    catch (AccessControlException accessControlException) {
                        throw h.a(accessControlException);
                    }
                    return inputStream2;
                }
                catch (AccessControlException accessControlException) {
                    throw h.a(accessControlException);
                }
            }
            inputStream = this.y.get(string);
        }
        byte[] byArray = (byte[])inputStream;
        try {
            byteArrayInputStream = byArray == null ? null : new ByteArrayInputStream(byArray);
        }
        catch (AccessControlException accessControlException) {
            throw h.a(accessControlException);
        }
        return byteArrayInputStream;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        char[] cArray;
        block15: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block14: {
                char[] cArray3 = "EKoou\u0003".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 126;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block14;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block15;
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
                            n17 = 21;
                            break;
                        }
                        case 1: {
                            n17 = 86;
                            break;
                        }
                        case 2: {
                            n17 = 125;
                            break;
                        }
                        case 3: {
                            n17 = 112;
                            break;
                        }
                        case 4: {
                            n17 = 120;
                            break;
                        }
                        case 5: {
                            n17 = 14;
                            break;
                        }
                        default: {
                            n17 = 92;
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
        long l2 = 8275381478105837456L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u0014\u00e3Q\u00da\u0087\u00a5\u00ca\u00cf\u00b88\u0080\u009b!o\u000b0";
        int n19 = "\u0014\u00e3Q\u00da\u0087\u00a5\u00ca\u00cf\u00b88\u0080\u009b!o\u000b0".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
        try {
            bl = !h.class.desiredAssertionStatus();
        }
        catch (AccessControlException accessControlException) {
            throw h.a(accessControlException);
        }
        W = bl;
    }

    private static AccessControlException a(AccessControlException accessControlException) {
        return accessControlException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2827;
        if (c[n11] == null) {
            h.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

