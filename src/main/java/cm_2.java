/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import com.ok_0;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from cm
 */
public class cm_2 {
    HashMap s = new HashMap();
    ArrayList G = new ArrayList();
    HashMap g = new HashMap();
    public ArrayList j = new ArrayList();
    bc_0 f = new bc_0();
    int Y;
    int S;
    int I;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] h;

    public cm_2() {
        ky_2[] ky_2Array = a6.P();
        this.Y = cm_2.a(26168, 5299035813173178604L);
        this.S = cm_2.a(1731, 6495104020529893397L);
        this.I = cm_2.a(10869, 6928746832989715616L);
        if (ky_2.F() != null) {
            a6.i(new ky_2[5]);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    void N(nD nD2) {
        block3: {
            int n10;
            ArrayList arrayList;
            ky_2[] ky_2Array;
            block2: {
                boolean bl = true;
                ky_2Array = a6.P();
                arrayList = nD2.I;
                int n11 = arrayList.size();
                if (ky_2Array == null) break block2;
                if (n11 <= 1) break block3;
                n11 = n10 = 0;
            }
            boolean bl = true;
            do {
                if (bl && !(bl = false) && ky_2Array != null) continue;
                a6 a62 = (a6)arrayList.get(n10);
                a6 a63 = (a6)arrayList.get(n10 + 1);
                cm_2.f(a62.m, a62.a, a63.m, a63.a);
                ++n10;
            } while (n10 < arrayList.size());
        }
    }

    static void f(String string, int n10, String string2, int n11) {
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void H(String string) {
        int n10 = 0;
        boolean bl = true;
        do {
            ky_2[] ky_2Array;
            if (bl && !(bl = false) && (ky_2Array = a6.P()) != null) continue;
            String string2 = "";
            try {
                byte[] byArray = cm_2.P(string);
                string2 = new String(byArray, "utf-8");
                this.M(string2);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                try {
                    Thread.sleep(cm_2.b(2476, 6020736532139341130L));
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                ++n10;
            }
        } while (n10 < this.I);
    }

    /*
     * Unable to fully structure code
     */
    void M(String var1_1) {
        var3_2 = ok_0.y(var1_1);
        var2_3 = a6.P();
        var4_4 = var3_2.J("proxy_server");
        var5_5 = 0;
        if (var2_3 != null) ** GOTO lbl75
        do {
            block9: {
                block7: {
                    block10: {
                        block8: {
                            var6_6 = var4_4.V(var5_5);
                            var7_7 = new a6();
                            var7_7.r = var6_6.b("id");
                            var7_7.m = var6_6.C("address");
                            v0 = var6_6.containsKey("port");
                            if (var2_3 != null) {
                                if (v0) {
                                    var7_7.a = var6_6.b("port");
                                }
                                var7_7.j = var6_6.C("region");
                                var7_7.B = var6_6.C("name");
                                jy_0.g(var7_7.B);
                                v0 = this.s.containsKey(var7_7.B);
                            }
                            if (var2_3 == null) break block8;
                            if (v0) break block9;
                            this.s.put(var7_7.B, var7_7);
                            this.G.add(var7_7);
                            v1 = var6_6;
                            v2 = "for_test";
                            if (var2_3 == null) break block10;
                            v0 = v1.containsKey(v2);
                        }
                        if (!v0) break block9;
                        v1 = var6_6;
                        v2 = "for_test";
                    }
                    var8_8 = v1.D(v2);
                    var9_9 = var8_8.C("name");
                    var7_7.U = true;
                    var7_7.Z = var9_9;
                    this.g.put(var9_9, var7_7);
                    this.j.add(var7_7);
                    var10_10 = var8_8.J("regions");
                    var11_11 = new ArrayList<String>();
                    var12_12 = 0;
                    if (var2_3 != null) ** GOTO lbl50
                    block1: while (true) {
                        v3 = var11_11.add(var10_10.M(var12_12));
                        do {
                            ++var12_12;
lbl50:
                            // 2 sources

                            if (var12_12 < var10_10.size()) continue block1;
                            var7_7.k = var11_11;
                            v4 = var8_8;
                            v5 = "direct";
                            if (var2_3 == null) break block7;
                            v3 = v4.containsKey(v5);
                        } while (var2_3 == null);
                        break;
                    }
                    if (!v3) break block9;
                    v4 = var8_8;
                    v5 = "direct";
                }
                var12_13 = v4.J(v5);
                var13_14 = new ArrayList<String>();
                var14_15 = 0;
                if (var2_3 != null) ** GOTO lbl70
                block3: while (true) {
                    var13_14.add(var12_13.M(var14_15));
                    do {
                        ++var14_15;
lbl70:
                        // 2 sources

                        if (var14_15 < var12_13.size()) continue block3;
                    } while (var2_3 == null);
                    break;
                }
                var7_7.E = var13_14;
            }
            ++var5_5;
lbl75:
            // 2 sources

        } while (var5_5 < var4_4.size());
    }

    /*
     * Exception decompiling
     */
    public void i() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [96[DOLOOP]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public static byte[] P(String string) throws Exception {
        InputStream inputStream;
        byte[] byArray;
        block3: {
            int n10;
            DataInputStream dataInputStream;
            block2: {
                byArray = null;
                URL uRL = new URL(string);
                HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
                ky_2[] ky_2Array = a6.P();
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                int n11 = httpURLConnection.getContentLength();
                inputStream = httpURLConnection.getInputStream();
                dataInputStream = new DataInputStream(inputStream);
                try {
                    n10 = n11;
                    if (ky_2Array == null) break block2;
                    if (n10 <= 0) break block3;
                }
                catch (Exception exception) {
                    throw cm_2.a(exception);
                }
                n10 = n11;
            }
            byArray = new byte[n10];
            dataInputStream.readFully(byArray);
        }
        inputStream.close();
        return byArray;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[20];
                                var19_1 = 0;
                                var18_2 = "(\u00a3\b\u00bd\u0007mx)V\u00c2\u0092\u0006\u0098X\u008bo\u00e2\u00d8\u0004q\u0099 \u0080\b\u00fae\u008544\u00dfa\u00a3\u0006\u00db\u00aa\"\u00b0l\u00b4\u0007:Ql\u00f5\u00ccyM\u0002\u00b9\u00a4\u0004\u00b4\u0011\u0098\u0091\u0002\u008c\u00cc\f\u00fdb\u00acM\u00a2\t\u001f\u0015\u00f4\u001f\u0082\u00e5\u0004e\u0087`\u009d\u0006\u00ba\u00f6\u00cf\u00bajb\u0007\u00c4M\u00c1L\u0010+\u009d\u0002R\u0089\u0002E\u00a1\u0002\u0014\u00e8\u0005K\u00af\u00d6g\u0084";
                                var20_3 = "(\u00a3\b\u00bd\u0007mx)V\u00c2\u0092\u0006\u0098X\u008bo\u00e2\u00d8\u0004q\u0099 \u0080\b\u00fae\u008544\u00dfa\u00a3\u0006\u00db\u00aa\"\u00b0l\u00b4\u0007:Ql\u00f5\u00ccyM\u0002\u00b9\u00a4\u0004\u00b4\u0011\u0098\u0091\u0002\u008c\u00cc\f\u00fdb\u00acM\u00a2\t\u001f\u0015\u00f4\u001f\u0082\u00e5\u0004e\u0087`\u009d\u0006\u00ba\u00f6\u00cf\u00bajb\u0007\u00c4M\u00c1L\u0010+\u009d\u0002R\u0089\u0002E\u00a1\u0002\u0014\u00e8\u0005K\u00af\u00d6g\u0084".length();
                                var17_4 = 2;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 110;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00ea+\u0004\u00a0\u0019q\u00e7";
                                    var20_3 = "\u00ea+\u0004\u00a0\u0019q\u00e7".length();
                                    var17_4 = 2;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 66;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block34;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 7;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 127;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 65;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 9;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 71;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 10;
                                            break;
                                        }
                                        default: {
                                            v15 = 37;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl85:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl95:
                                // 1 sources

                                ** continue;
                            }
                        }
                        cm_2.a = var21;
                        cm_2.b = new String[20];
                        var8_7 = 6095535706021094460L;
                        var14_8 = new long[5];
                        var11_9 = 0;
                        var12_10 = "\u007f\u00cc\u00d1\u00de\u000f\u00ee\u0018\u009f\u00ce>o\u0093\u00f9ZU$_5\u00ad\u000e\u007f6b\u001e";
                        var13_11 = "\u007f\u00cc\u00d1\u00de\u000f\u00ee\u0018\u009f\u00ce>o\u0093\u00f9ZU$_5\u00ad\u000e\u007f6b\u001e".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "d\u0081u7k\u00fd\u00a7\u00a1(\u00e0\u00f0\r\u0097D{\u0099";
                            var13_11 = "d\u0081u7k\u00fd\u00a7\u00a1(\u00e0\u00f0\r\u0097D{\u0099".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl136:
                        // 1 sources

                        ** continue;
                    }
                }
                cm_2.c = var14_8;
                cm_2.d = new Integer[5];
                var0_14 = 2357423540092042423L;
                var6_15 = new long[5];
                var3_16 = 0;
                var4_17 = "s:\u00b3\u00c285\u008a\u0015\u0015\u00de\u009a\u00c2\u0005\u009f\u00b8\u00d5Ux\u00a9\u0082J\u0016S\u00d9";
                var5_18 = "s:\u00b3\u00c285\u008a\u0015\u0015\u00de\u009a\u00c2\u0005\u009f\u00b8\u00d5Ux\u00a9\u0082J\u0016S\u00d9".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "W\u00ca\u001a\u0013\u0093\u00c4z\u00ab\t\u001d\u0093\u0002\u0016\u00cc\u00893";
                    var5_18 = "W\u00ca\u001a\u0013\u0093\u00c4z\u00ab\t\u001d\u0093\u0002\u0016\u00cc\u00893".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl166:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl177:
                // 1 sources

                ** continue;
            }
        }
        cm_2.e = var6_15;
        cm_2.h = new Long[5];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFDBCA) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 71;
                    break;
                }
                case 1: {
                    n14 = 252;
                    break;
                }
                case 2: {
                    n14 = 223;
                    break;
                }
                case 3: {
                    n14 = 44;
                    break;
                }
                case 4: {
                    n14 = 187;
                    break;
                }
                case 5: {
                    n14 = 19;
                    break;
                }
                case 6: {
                    n14 = 104;
                    break;
                }
                case 7: {
                    n14 = 136;
                    break;
                }
                case 8: {
                    n14 = 232;
                    break;
                }
                case 9: {
                    n14 = 166;
                    break;
                }
                case 10: {
                    n14 = 157;
                    break;
                }
                case 11: {
                    n14 = 112;
                    break;
                }
                case 12: {
                    n14 = 201;
                    break;
                }
                case 13: {
                    n14 = 219;
                    break;
                }
                case 14: {
                    n14 = 195;
                    break;
                }
                case 15: {
                    n14 = 253;
                    break;
                }
                case 16: {
                    n14 = 179;
                    break;
                }
                case 17: {
                    n14 = 40;
                    break;
                }
                case 18: {
                    n14 = 255;
                    break;
                }
                case 19: {
                    n14 = 118;
                    break;
                }
                case 20: {
                    n14 = 155;
                    break;
                }
                case 21: {
                    n14 = 73;
                    break;
                }
                case 22: {
                    n14 = 116;
                    break;
                }
                case 23: {
                    n14 = 159;
                    break;
                }
                case 24: {
                    n14 = 89;
                    break;
                }
                case 25: {
                    n14 = 221;
                    break;
                }
                case 26: {
                    n14 = 225;
                    break;
                }
                case 27: {
                    n14 = 190;
                    break;
                }
                case 28: {
                    n14 = 12;
                    break;
                }
                case 29: {
                    n14 = 36;
                    break;
                }
                case 30: {
                    n14 = 47;
                    break;
                }
                case 31: {
                    n14 = 183;
                    break;
                }
                case 32: {
                    n14 = 160;
                    break;
                }
                case 33: {
                    n14 = 88;
                    break;
                }
                case 34: {
                    n14 = 184;
                    break;
                }
                case 35: {
                    n14 = 10;
                    break;
                }
                case 36: {
                    n14 = 76;
                    break;
                }
                case 37: {
                    n14 = 85;
                    break;
                }
                case 38: {
                    n14 = 121;
                    break;
                }
                case 39: {
                    n14 = 1;
                    break;
                }
                case 40: {
                    n14 = 108;
                    break;
                }
                case 41: {
                    n14 = 62;
                    break;
                }
                case 42: {
                    n14 = 241;
                    break;
                }
                case 43: {
                    n14 = 147;
                    break;
                }
                case 44: {
                    n14 = 243;
                    break;
                }
                case 45: {
                    n14 = 43;
                    break;
                }
                case 46: {
                    n14 = 30;
                    break;
                }
                case 47: {
                    n14 = 86;
                    break;
                }
                case 48: {
                    n14 = 198;
                    break;
                }
                case 49: {
                    n14 = 206;
                    break;
                }
                case 50: {
                    n14 = 202;
                    break;
                }
                case 51: {
                    n14 = 132;
                    break;
                }
                case 52: {
                    n14 = 209;
                    break;
                }
                case 53: {
                    n14 = 247;
                    break;
                }
                case 54: {
                    n14 = 238;
                    break;
                }
                case 55: {
                    n14 = 176;
                    break;
                }
                case 56: {
                    n14 = 146;
                    break;
                }
                case 57: {
                    n14 = 11;
                    break;
                }
                case 58: {
                    n14 = 16;
                    break;
                }
                case 59: {
                    n14 = 37;
                    break;
                }
                case 60: {
                    n14 = 31;
                    break;
                }
                case 61: {
                    n14 = 200;
                    break;
                }
                case 62: {
                    n14 = 244;
                    break;
                }
                case 63: {
                    n14 = 24;
                    break;
                }
                case 64: {
                    n14 = 237;
                    break;
                }
                case 65: {
                    n14 = 29;
                    break;
                }
                case 66: {
                    n14 = 207;
                    break;
                }
                case 67: {
                    n14 = 240;
                    break;
                }
                case 68: {
                    n14 = 74;
                    break;
                }
                case 69: {
                    n14 = 177;
                    break;
                }
                case 70: {
                    n14 = 144;
                    break;
                }
                case 71: {
                    n14 = 97;
                    break;
                }
                case 72: {
                    n14 = 203;
                    break;
                }
                case 73: {
                    n14 = 185;
                    break;
                }
                case 74: {
                    n14 = 84;
                    break;
                }
                case 75: {
                    n14 = 169;
                    break;
                }
                case 76: {
                    n14 = 22;
                    break;
                }
                case 77: {
                    n14 = 123;
                    break;
                }
                case 78: {
                    n14 = 212;
                    break;
                }
                case 79: {
                    n14 = 171;
                    break;
                }
                case 80: {
                    n14 = 235;
                    break;
                }
                case 81: {
                    n14 = 94;
                    break;
                }
                case 82: {
                    n14 = 137;
                    break;
                }
                case 83: {
                    n14 = 111;
                    break;
                }
                case 84: {
                    n14 = 128;
                    break;
                }
                case 85: {
                    n14 = 96;
                    break;
                }
                case 86: {
                    n14 = 227;
                    break;
                }
                case 87: {
                    n14 = 39;
                    break;
                }
                case 88: {
                    n14 = 192;
                    break;
                }
                case 89: {
                    n14 = 215;
                    break;
                }
                case 90: {
                    n14 = 101;
                    break;
                }
                case 91: {
                    n14 = 248;
                    break;
                }
                case 92: {
                    n14 = 75;
                    break;
                }
                case 93: {
                    n14 = 63;
                    break;
                }
                case 94: {
                    n14 = 124;
                    break;
                }
                case 95: {
                    n14 = 122;
                    break;
                }
                case 96: {
                    n14 = 229;
                    break;
                }
                case 97: {
                    n14 = 114;
                    break;
                }
                case 98: {
                    n14 = 222;
                    break;
                }
                case 99: {
                    n14 = 197;
                    break;
                }
                case 100: {
                    n14 = 161;
                    break;
                }
                case 101: {
                    n14 = 119;
                    break;
                }
                case 102: {
                    n14 = 254;
                    break;
                }
                case 103: {
                    n14 = 18;
                    break;
                }
                case 104: {
                    n14 = 70;
                    break;
                }
                case 105: {
                    n14 = 156;
                    break;
                }
                case 106: {
                    n14 = 152;
                    break;
                }
                case 107: {
                    n14 = 105;
                    break;
                }
                case 108: {
                    n14 = 224;
                    break;
                }
                case 109: {
                    n14 = 27;
                    break;
                }
                case 110: {
                    n14 = 188;
                    break;
                }
                case 111: {
                    n14 = 0;
                    break;
                }
                case 112: {
                    n14 = 141;
                    break;
                }
                case 113: {
                    n14 = 163;
                    break;
                }
                case 114: {
                    n14 = 213;
                    break;
                }
                case 115: {
                    n14 = 211;
                    break;
                }
                case 116: {
                    n14 = 115;
                    break;
                }
                case 117: {
                    n14 = 45;
                    break;
                }
                case 118: {
                    n14 = 186;
                    break;
                }
                case 119: {
                    n14 = 67;
                    break;
                }
                case 120: {
                    n14 = 9;
                    break;
                }
                case 121: {
                    n14 = 133;
                    break;
                }
                case 122: {
                    n14 = 180;
                    break;
                }
                case 123: {
                    n14 = 230;
                    break;
                }
                case 124: {
                    n14 = 99;
                    break;
                }
                case 125: {
                    n14 = 5;
                    break;
                }
                case 126: {
                    n14 = 125;
                    break;
                }
                case 127: {
                    n14 = 49;
                    break;
                }
                case 128: {
                    n14 = 196;
                    break;
                }
                case 129: {
                    n14 = 51;
                    break;
                }
                case 130: {
                    n14 = 55;
                    break;
                }
                case 131: {
                    n14 = 234;
                    break;
                }
                case 132: {
                    n14 = 239;
                    break;
                }
                case 133: {
                    n14 = 7;
                    break;
                }
                case 134: {
                    n14 = 35;
                    break;
                }
                case 135: {
                    n14 = 149;
                    break;
                }
                case 136: {
                    n14 = 162;
                    break;
                }
                case 137: {
                    n14 = 140;
                    break;
                }
                case 138: {
                    n14 = 102;
                    break;
                }
                case 139: {
                    n14 = 250;
                    break;
                }
                case 140: {
                    n14 = 150;
                    break;
                }
                case 141: {
                    n14 = 170;
                    break;
                }
                case 142: {
                    n14 = 143;
                    break;
                }
                case 143: {
                    n14 = 4;
                    break;
                }
                case 144: {
                    n14 = 110;
                    break;
                }
                case 145: {
                    n14 = 181;
                    break;
                }
                case 146: {
                    n14 = 135;
                    break;
                }
                case 147: {
                    n14 = 167;
                    break;
                }
                case 148: {
                    n14 = 58;
                    break;
                }
                case 149: {
                    n14 = 131;
                    break;
                }
                case 150: {
                    n14 = 15;
                    break;
                }
                case 151: {
                    n14 = 80;
                    break;
                }
                case 152: {
                    n14 = 54;
                    break;
                }
                case 153: {
                    n14 = 65;
                    break;
                }
                case 154: {
                    n14 = 130;
                    break;
                }
                case 155: {
                    n14 = 153;
                    break;
                }
                case 156: {
                    n14 = 14;
                    break;
                }
                case 157: {
                    n14 = 158;
                    break;
                }
                case 158: {
                    n14 = 217;
                    break;
                }
                case 159: {
                    n14 = 148;
                    break;
                }
                case 160: {
                    n14 = 8;
                    break;
                }
                case 161: {
                    n14 = 79;
                    break;
                }
                case 162: {
                    n14 = 233;
                    break;
                }
                case 163: {
                    n14 = 134;
                    break;
                }
                case 164: {
                    n14 = 107;
                    break;
                }
                case 165: {
                    n14 = 208;
                    break;
                }
                case 166: {
                    n14 = 98;
                    break;
                }
                case 167: {
                    n14 = 95;
                    break;
                }
                case 168: {
                    n14 = 127;
                    break;
                }
                case 169: {
                    n14 = 214;
                    break;
                }
                case 170: {
                    n14 = 168;
                    break;
                }
                case 171: {
                    n14 = 68;
                    break;
                }
                case 172: {
                    n14 = 194;
                    break;
                }
                case 173: {
                    n14 = 249;
                    break;
                }
                case 174: {
                    n14 = 175;
                    break;
                }
                case 175: {
                    n14 = 100;
                    break;
                }
                case 176: {
                    n14 = 226;
                    break;
                }
                case 177: {
                    n14 = 93;
                    break;
                }
                case 178: {
                    n14 = 178;
                    break;
                }
                case 179: {
                    n14 = 26;
                    break;
                }
                case 180: {
                    n14 = 142;
                    break;
                }
                case 181: {
                    n14 = 193;
                    break;
                }
                case 182: {
                    n14 = 17;
                    break;
                }
                case 183: {
                    n14 = 245;
                    break;
                }
                case 184: {
                    n14 = 81;
                    break;
                }
                case 185: {
                    n14 = 120;
                    break;
                }
                case 186: {
                    n14 = 251;
                    break;
                }
                case 187: {
                    n14 = 174;
                    break;
                }
                case 188: {
                    n14 = 172;
                    break;
                }
                case 189: {
                    n14 = 2;
                    break;
                }
                case 190: {
                    n14 = 33;
                    break;
                }
                case 191: {
                    n14 = 204;
                    break;
                }
                case 192: {
                    n14 = 220;
                    break;
                }
                case 193: {
                    n14 = 48;
                    break;
                }
                case 194: {
                    n14 = 41;
                    break;
                }
                case 195: {
                    n14 = 87;
                    break;
                }
                case 196: {
                    n14 = 23;
                    break;
                }
                case 197: {
                    n14 = 145;
                    break;
                }
                case 198: {
                    n14 = 106;
                    break;
                }
                case 199: {
                    n14 = 182;
                    break;
                }
                case 200: {
                    n14 = 242;
                    break;
                }
                case 201: {
                    n14 = 69;
                    break;
                }
                case 202: {
                    n14 = 246;
                    break;
                }
                case 203: {
                    n14 = 129;
                    break;
                }
                case 204: {
                    n14 = 25;
                    break;
                }
                case 205: {
                    n14 = 151;
                    break;
                }
                case 206: {
                    n14 = 90;
                    break;
                }
                case 207: {
                    n14 = 103;
                    break;
                }
                case 208: {
                    n14 = 173;
                    break;
                }
                case 209: {
                    n14 = 191;
                    break;
                }
                case 210: {
                    n14 = 210;
                    break;
                }
                case 211: {
                    n14 = 139;
                    break;
                }
                case 212: {
                    n14 = 78;
                    break;
                }
                case 213: {
                    n14 = 199;
                    break;
                }
                case 214: {
                    n14 = 59;
                    break;
                }
                case 215: {
                    n14 = 77;
                    break;
                }
                case 216: {
                    n14 = 72;
                    break;
                }
                case 217: {
                    n14 = 53;
                    break;
                }
                case 218: {
                    n14 = 165;
                    break;
                }
                case 219: {
                    n14 = 66;
                    break;
                }
                case 220: {
                    n14 = 82;
                    break;
                }
                case 221: {
                    n14 = 20;
                    break;
                }
                case 222: {
                    n14 = 38;
                    break;
                }
                case 223: {
                    n14 = 92;
                    break;
                }
                case 224: {
                    n14 = 138;
                    break;
                }
                case 225: {
                    n14 = 61;
                    break;
                }
                case 226: {
                    n14 = 52;
                    break;
                }
                case 227: {
                    n14 = 6;
                    break;
                }
                case 228: {
                    n14 = 46;
                    break;
                }
                case 229: {
                    n14 = 228;
                    break;
                }
                case 230: {
                    n14 = 189;
                    break;
                }
                case 231: {
                    n14 = 56;
                    break;
                }
                case 232: {
                    n14 = 236;
                    break;
                }
                case 233: {
                    n14 = 34;
                    break;
                }
                case 234: {
                    n14 = 117;
                    break;
                }
                case 235: {
                    n14 = 57;
                    break;
                }
                case 236: {
                    n14 = 64;
                    break;
                }
                case 237: {
                    n14 = 231;
                    break;
                }
                case 238: {
                    n14 = 164;
                    break;
                }
                case 239: {
                    n14 = 216;
                    break;
                }
                case 240: {
                    n14 = 109;
                    break;
                }
                case 241: {
                    n14 = 28;
                    break;
                }
                case 242: {
                    n14 = 91;
                    break;
                }
                case 243: {
                    n14 = 83;
                    break;
                }
                case 244: {
                    n14 = 50;
                    break;
                }
                case 245: {
                    n14 = 218;
                    break;
                }
                case 246: {
                    n14 = 205;
                    break;
                }
                case 247: {
                    n14 = 126;
                    break;
                }
                case 248: {
                    n14 = 113;
                    break;
                }
                case 249: {
                    n14 = 154;
                    break;
                }
                case 250: {
                    n14 = 60;
                    break;
                }
                case 251: {
                    n14 = 13;
                    break;
                }
                case 252: {
                    n14 = 3;
                    break;
                }
                case 253: {
                    n14 = 32;
                    break;
                }
                case 254: {
                    n14 = 21;
                    break;
                }
                default: {
                    n14 = 42;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            cm_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x56D5;
        if (d[n11] == null) {
            cm_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x7CE6) & Short.MAX_VALUE;
        if (h[n11] == null) {
            cm_2.h[n11] = e[n11] ^ l2;
        }
        return h[n11];
    }
}

