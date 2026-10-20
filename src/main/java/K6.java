/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

public class K6
implements Runnable {
    private Thread T;
    private InputStream C;
    private int[] W = new int[K6.a(4878, 3477813539620822517L)];
    private int i = 0;
    private int b = 0;
    private boolean K = false;
    private boolean J = false;
    private static final String a;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] f;

    public K6(InputStream inputStream) {
        this.C = inputStream;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [3, 2, 1, 0, 6 : 75->81)] java.lang.InterruptedException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean A() {
        boolean bl = CK.r();
        int n10 = this.i;
        if (bl) {
            n10 = n10 != this.b ? 1 : 0;
        }
        return n10 != 0;
    }

    /*
     * Unable to fully structure code
     */
    public int p(long var1_1) throws IOException {
        block30: {
            block31: {
                block28: {
                    block27: {
                        block25: {
                            block26: {
                                var3_2 = CK.Z();
                                v0 = this.J;
                                if (var3_2) break block25;
                                try {
                                    block32: {
                                        if (!v0) break block26;
                                        break block32;
                                        catch (InterruptedException v1) {
                                            throw K6.a(v1);
                                        }
                                    }
                                    return K6.a(24935, 2467544592860671903L);
                                }
                                catch (InterruptedException v2) {
                                    throw K6.a(v2);
                                }
                            }
                            v0 = this.K;
                        }
                        if (var3_2) ** GOTO lbl35
                        try {
                            block33: {
                                if (v0) break block27;
                                break block33;
                                catch (InterruptedException v3) {
                                    throw K6.a(v3);
                                }
                            }
                            this.T = new Thread(this);
                            this.T.start();
                            this.K = true;
                        }
                        catch (InterruptedException v4) {
                            throw K6.a(v4);
                        }
                    }
                    while (true) {
                        block29: {
                            block34: {
                                v0 = this.A();
lbl35:
                                // 3 sources

                                if (v0) break;
                                v5 = this.J;
                                if (var3_2) break block28;
                                break block34;
                                catch (InterruptedException v6) {
                                    throw K6.a(v6);
                                }
                            }
                            try {
                                block35: {
                                    if (var3_2) break block28;
                                    break block35;
                                    catch (InterruptedException v7) {
                                        throw K6.a(v7);
                                    }
                                }
                                if (v5 != 0) break;
                            }
                            catch (InterruptedException v8) {
                                throw K6.a(v8);
                            }
                            v9 = var1_1 - 1L;
                            if (var3_2) ** GOTO lbl68
                            try {
                                block36: {
                                    if (v9 >= 0L) break block29;
                                    break block36;
                                    catch (InterruptedException v10) {
                                        throw K6.a(v10);
                                    }
                                }
                                throw new IOException(K6.a);
                            }
                            catch (InterruptedException v11) {
                                throw K6.a(v11);
                            }
                        }
                        try {
                            v9 = K6.b(30081, 7722954458724407424L);
lbl68:
                            // 2 sources

                            Thread.sleep(v9);
                            continue;
                        }
                        catch (InterruptedException var4_3) {
                            if (var3_2) break;
                            continue;
                        }
                        break;
                    }
                    v5 = this.W[this.b];
                }
                var4_4 = v5;
                try {
                    try {
                        v12 = ++this.b;
                        if (var3_2) break block30;
                        if (v12 != K6.a(4878, 3477813539620822517L)) break block31;
                    }
                    catch (InterruptedException v13) {
                        throw K6.a(v13);
                    }
                    this.b = 0;
                }
                catch (InterruptedException v14) {
                    throw K6.a(v14);
                }
            }
            v12 = var4_4;
        }
        return v12;
    }

    public void P() {
        block3: {
            Thread thread;
            block2: {
                this.J = true;
                boolean bl = CK.r();
                thread = this.T;
                if (!bl) break block2;
                if (thread == null) break block3;
                thread = this.T;
            }
            thread.interrupt();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
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
                char[] cArray3 = ")\u001c\u0018\u0018&Yq\b\u0001".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 43;
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
                            n17 = 86;
                            break;
                        }
                        case 1: {
                            n17 = 94;
                            break;
                        }
                        case 2: {
                            n17 = 94;
                            break;
                        }
                        case 3: {
                            n17 = 86;
                            break;
                        }
                        case 4: {
                            n17 = 105;
                            break;
                        }
                        case 5: {
                            n17 = 82;
                            break;
                        }
                        default: {
                            n17 = 53;
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
        long l2 = 2164982477651194909L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u0012\u00c6\u009e\u00ad+\u000fSQf'\u00a5\u00dd5|\u00ad\u00e8(\u00e6$\u00c9\t\u00bd[\u009a";
        int n19 = "\u0012\u00c6\u009e\u00ad+\u000fSQf'\u00a5\u00dd5|\u00ad\u00e8(\u00e6$\u00c9\t\u00bd[\u009a".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        c = lArray;
        d = new Integer[3];
        long l3 = 995829755541878929L;
        long[] lArray2 = new long[2];
        int n22 = 0;
        String string2 = "H\u00e7\u00d4\u00f7M\u00c8\u00faVf\u00fc\u0097\u00cb{\u001f\u00e0u";
        int n23 = "H\u00e7\u00d4\u00f7M\u00c8\u00faVf\u00fc\u0097\u00cb{\u001f\u00e0u".length();
        int n24 = 0;
        do {
            byte[] byArray = string2.substring(n24, n24 += 8).getBytes("ISO-8859-1");
            int n25 = n22++;
            lArray2[n25] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l3;
        } while (n24 < n23);
        e = lArray2;
        f = new Long[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xEFA;
        if (d[n11] == null) {
            K6.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x6D00) & Short.MAX_VALUE;
        if (f[n11] == null) {
            K6.f[n11] = e[n11] ^ l2;
        }
        return f[n11];
    }
}

