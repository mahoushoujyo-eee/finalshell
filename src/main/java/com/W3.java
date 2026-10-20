/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.KE;
import com.a0;
import com.hi_0;
import com.ph_2;
import com.yn_2;
import java.util.ArrayList;

class W3
implements a0 {
    private final String e;
    private final long H;
    private final boolean v;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public W3(String string, boolean bl) {
        this.e = string;
        this.H = B8.z(string);
        this.v = bl;
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        Object object3;
        block2: {
            block3: {
                String string = hi_0.C();
                try {
                    object3 = this;
                    if (string != null) break block2;
                    if (!((W3)object3).v) break block3;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw W3.a(unsupportedOperationException);
                }
                ArrayList arrayList = new ArrayList();
                ph_22.L(object2, this.e, arrayList);
                return arrayList;
            }
            object3 = ph_22.S(object2, this.e, this.H);
        }
        return object3;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void Z(ph_2 var1_1, yn_2 var2_2, KE var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    public void M(ph_2 ph_22, Object object, Object object2) {
        block6: {
            String string = hi_0.C();
            try {
                boolean bl;
                block7: {
                    try {
                        try {
                            bl = this.v;
                            if (string != null) break block6;
                            if (!bl) break block7;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw W3.a(unsupportedOperationException);
                        }
                        ph_22.R(object, this.e, this.H, object2);
                        if (string == null) break block6;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw W3.a(unsupportedOperationException);
                    }
                }
                bl = ph_22.u(object, this.e, this.H, object2);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw W3.a(unsupportedOperationException);
            }
        }
    }

    public boolean m(ph_2 ph_22, Object object) {
        return ph_22.N(object, this.e, this.v);
    }

    static boolean Z(W3 w3) {
        return w3.v;
    }

    static String h(W3 w3) {
        return w3.e;
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
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
                v0 = "A&&)L]4\b 9#E\u001cb\b".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 45;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 5;
                                break;
                            }
                            case 1: {
                                v9 = 103;
                                break;
                            }
                            case 2: {
                                v9 = 103;
                                break;
                            }
                            case 3: {
                                v9 = 97;
                                break;
                            }
                            case 4: {
                                v9 = 6;
                                break;
                            }
                            case 5: {
                                v9 = 17;
                                break;
                            }
                            default: {
                                v9 = 117;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
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
                } while (v4 > var8);
                ** while (true)
                W3.a = new String(v10).intern();
                var0_1 = 2545553499727064658L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "\u00c3\u000b\u0011\u00c6\u00d5\u00ad\u00fa+\u00de.\u00c5\u00b6\u00c2;%\u00a7\u009c\r%\u0089M%\u000e9";
                var5_5 = "\u00c3\u000b\u0011\u00c6\u00d5\u00ad\u00fa+\u00de.\u00c5\u00b6\u00c2;%\u00a7\u009c\r%\u0089M%\u000e9".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "^\u00c2\u00ca\u00ffa\u0018\u00dd\u00a2\u0098\u00e1\u00b2K_\u0087S ";
                    var5_5 = "^\u00c2\u00ca\u00ffa\u0018\u00dd\u00a2\u0098\u00e1\u00b2K_\u0087S ".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
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
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
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
        W3.b = var6_2;
        W3.c = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xA3C;
        if (c[n11] == null) {
            W3.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

