/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com.IF;
import com.RI;
import com.dm_2;
import com.fq_0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class H1
implements fq_0 {
    private static final Set B;
    private final Hashtable m = new Hashtable();
    private final Vector g = new Vector();
    private static final Hashtable J;
    private static final String[] a;
    private static final String[] b;

    public static H1 f(String string) throws IOException {
        try (StringReader stringReader = new StringReader(string);){
            H1 h12;
            try (BufferedReader bufferedReader = new BufferedReader(stringReader);){
                h12 = new H1(bufferedReader);
            }
            return h12;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static H1 q(String var0) throws IOException {
        block10: {
            block9: {
                var2_1 = Files.newBufferedReader(Paths.get(E8.V(var0), new String[0]), StandardCharsets.UTF_8);
                var1_2 = dm_2.F();
                try {
                    var3_3 = new H1(var2_1);
                }
                catch (Throwable var3_4) {
                    block11: {
                        try {
                            v0 = var2_1;
                            if (var1_2) {
                                if (v0 == null) break block11;
                            }
                            ** GOTO lbl16
                        }
                        catch (Throwable v1) {
                            throw H1.a(v1);
                        }
                        try {
                            v0 = var2_1;
lbl16:
                            // 2 sources

                            v0.close();
                        }
                        catch (Throwable var4_5) {
                            var3_4.addSuppressed(var4_5);
                        }
                    }
                    throw var3_4;
                }
                try {
                    v2 = var2_1;
                    if (!var1_2) break block9;
                    if (v2 == null) break block10;
                }
                catch (Throwable v3) {
                    throw H1.a(v3);
                }
                v2 = var2_1;
            }
            v2.close();
        }
        return var3_3;
    }

    H1(BufferedReader bufferedReader) throws IOException {
        this.J(bufferedReader);
    }

    /*
     * Unable to fully structure code
     */
    private void J(BufferedReader var1_1) throws IOException {
        block25: {
            var3_2 = "";
            var4_3 = new Vector<String[]>();
            var5_4 = null;
            var2_5 = dm_2.J();
            while ((var5_4 = var1_1.readLine()) != null) {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        var5_4 = var5_4.trim();
                                        try {
                                            try {
                                                v0 = var5_4;
                                                if (var2_5) break block25;
                                                v1 = v0.length();
                                                if (var2_5) break block26;
                                            }
                                            catch (IOException v2) {
                                                throw H1.a(v2);
                                            }
                                            if (v1 == 0) continue;
                                        }
                                        catch (IOException v3) {
                                            throw H1.a(v3);
                                        }
                                        try {
                                            v4 = var5_4;
                                            v5 = "#";
                                            if (var2_5) break block27;
                                            v1 = (int)v4.startsWith(v5);
                                        }
                                        catch (IOException v6) {
                                            throw H1.a(v6);
                                        }
                                    }
                                    try {
                                        if (v1 != 0 && !var2_5) continue;
                                    }
                                    catch (IOException v7) {
                                        throw H1.a(v7);
                                    }
                                    v4 = var5_4;
                                    v5 = H1.a(-22384, 24030);
                                }
                                var6_6 = v4.split(v5, 2);
                                for (var7_7 = 0; var7_7 < var6_6.length; ++var7_7) {
                                    try {
                                        var6_6[var7_7] = var6_6[var7_7].trim();
                                        if (!var2_5) {
                                            if (!var2_5) continue;
                                            break;
                                        }
                                        break block28;
                                    }
                                    catch (IOException v8) {
                                        throw H1.a(v8);
                                    }
                                }
                                try {
                                    try {
                                        v9 = var6_6.length;
                                        if (var2_5) break block29;
                                        if (v9 > 1) break block28;
                                    }
                                    catch (IOException v10) {
                                        throw H1.a(v10);
                                    }
                                    if (!var2_5) continue;
                                }
                                catch (IOException v11) {
                                    throw H1.a(v11);
                                }
                            }
                            try {
                                v12 = var6_6[0];
                                if (var2_5) break block30;
                                v9 = (int)v12.equalsIgnoreCase(H1.a(-22382, 28822));
                            }
                            catch (IOException v13) {
                                throw H1.a(v13);
                            }
                        }
                        try {
                            if (v9 != 0) {
                                this.m.put(var3_2, var4_3);
                                this.g.addElement(var3_2);
                                v12 = var6_6[1];
                            }
                            ** GOTO lbl83
                        }
                        catch (IOException v14) {
                            throw H1.a(v14);
                        }
                    }
                    var3_2 = v12;
                    var4_3 = new Vector<E>();
                    try {
                        if (!var2_5) break block31;
lbl83:
                        // 2 sources

                        var4_3.addElement(var6_6);
                    }
                    catch (IOException v15) {
                        throw H1.a(v15);
                    }
                }
                if (!var2_5) continue;
            }
            v0 = this.m.put(var3_2, var4_3);
        }
        this.g.addElement(var3_2);
    }

    @Override
    public IF s(String string) {
        return new RI(this, string);
    }

    static Hashtable v() {
        return J;
    }

    static Hashtable H(H1 h12) {
        return h12.m;
    }

    static Vector T(H1 h12) {
        return h12.g;
    }

    static Hashtable l() {
        return J;
    }

    static Set e() {
        return B;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var9 = new String[27];
                    var7_1 = 0;
                    var6_2 = "2iv=\n\u00c6\u00a7\u00a5>\u00bbX\u0019\u008e\u00bb\u00af\u0005\u0091. \u00b0i\u000b=>\u00e3\u00d3\u00da\u00e9\u009d]\u0086\u00db\u001c\n^;\u00b6\u00ad\u00d9*U\u00d02f\u0007\u00e9\u00e1\u009c\u00b9\u00fbf\u0088\u0011L\u00e7\u00e9\u00e8\u009b\u008e\u00b5\u00b1\u0083F\u00bc\u0001\u00d0xW\u00e2<\u0007Q<sMa6\u001f\u0007\u00bb\u00d1.\u00f0\u00ca\u0081j\u0010zq\u000b:\u00c7\u00d4>\u00fa\u00f2/\u0092?\u001c\u00dd\u00f5.\u000f\u009c\u001a\u00f3W\u00d8y\u00ddO\u008e\u0099\u001d\u008b\u00fb!\u00db\u000fgi\u008c97\u00b4 \u00f61\u00ae\u00eam\u0015\u00fd\u0004\u00181\u00aa\u001c\u0003\u00dc\u0097\u009a\u001d\u0018\u00cb\u009a\u00d0\u00c0\rJdE\u00e4E\u00ffi\t\u00fb5\u0007j~\u00ecJ\u00e5\u0018I\u0004/\u009a@\u00af\u000b\u00146\u00c6\u00d2~\u00c9\tY\u0014[N\u0011\u0014w\u00b2\u00fe\u0014\u00c8PKqeFA\u00ab\u00e9\u0083\u00ebd\r\u008e\u00e5\u0089\u00d2>\u00dc\u00c0\u00b8\u00b2]\u009c(\r\u0016\u00f3\u009fD\u00a5\u00d7C\u00fb\u00874\u0098\u001f\u00bap@V\u00c4\u0093\u00e3IZ\u0093\u009c\u000f\u00f2\u00ae3\u008c+\u00d3z\u00f4\u00d5\u008a\u00aa\u0007L\u00b8,\u0003\u0017x\u009e\f\u00a9o\u00ab\u0007cuV\u00da\u009c\u00ee,\u00fe\u0004~*J\u009d\u0004h\u009b\u0088\u00ab\rmZ\u00f5%\u00b1\"1g\u008c\u00a6[W\u00f5";
                    var8_3 = "2iv=\n\u00c6\u00a7\u00a5>\u00bbX\u0019\u008e\u00bb\u00af\u0005\u0091. \u00b0i\u000b=>\u00e3\u00d3\u00da\u00e9\u009d]\u0086\u00db\u001c\n^;\u00b6\u00ad\u00d9*U\u00d02f\u0007\u00e9\u00e1\u009c\u00b9\u00fbf\u0088\u0011L\u00e7\u00e9\u00e8\u009b\u008e\u00b5\u00b1\u0083F\u00bc\u0001\u00d0xW\u00e2<\u0007Q<sMa6\u001f\u0007\u00bb\u00d1.\u00f0\u00ca\u0081j\u0010zq\u000b:\u00c7\u00d4>\u00fa\u00f2/\u0092?\u001c\u00dd\u00f5.\u000f\u009c\u001a\u00f3W\u00d8y\u00ddO\u008e\u0099\u001d\u008b\u00fb!\u00db\u000fgi\u008c97\u00b4 \u00f61\u00ae\u00eam\u0015\u00fd\u0004\u00181\u00aa\u001c\u0003\u00dc\u0097\u009a\u001d\u0018\u00cb\u009a\u00d0\u00c0\rJdE\u00e4E\u00ffi\t\u00fb5\u0007j~\u00ecJ\u00e5\u0018I\u0004/\u009a@\u00af\u000b\u00146\u00c6\u00d2~\u00c9\tY\u0014[N\u0011\u0014w\u00b2\u00fe\u0014\u00c8PKqeFA\u00ab\u00e9\u0083\u00ebd\r\u008e\u00e5\u0089\u00d2>\u00dc\u00c0\u00b8\u00b2]\u009c(\r\u0016\u00f3\u009fD\u00a5\u00d7C\u00fb\u00874\u0098\u001f\u00bap@V\u00c4\u0093\u00e3IZ\u0093\u009c\u000f\u00f2\u00ae3\u008c+\u00d3z\u00f4\u00d5\u008a\u00aa\u0007L\u00b8,\u0003\u0017x\u009e\f\u00a9o\u00ab\u0007cuV\u00da\u009c\u00ee,\u00fe\u0004~*J\u009d\u0004h\u009b\u0088\u00ab\rmZ\u00f5%\u00b1\"1g\u008c\u00a6[W\u00f5".length();
                    var5_4 = 4;
                    var4_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 18;
                        v1 = ++var4_5;
                        v2 = var6_2.substring(v1, v1 + var5_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var9[var7_1++] = v4.intern();
                        if ((var4_5 += var5_4) < var8_3) {
                            var5_4 = var6_2.charAt(var4_5);
                            ** continue;
                        }
                        var6_2 = "\f*\u0006\u00e25\u00fc\u00c3z\u00b4\u00f4I\u00c4\u00fd\u00ee\u00fe\u00bc|\u0017n\u00bc\u0092\u007fT\u008c2\u00a6F\u00aa\u00b0\u00c8CU\u00ee\u00ba\u0004\u009c\u0016\u00fd\u000ef:";
                        var8_3 = "\f*\u0006\u00e25\u00fc\u00c3z\u00b4\u00f4I\u00c4\u00fd\u00ee\u00fe\u00bc|\u0017n\u00bc\u0092\u007fT\u008c2\u00a6F\u00aa\u00b0\u00c8CU\u00ee\u00ba\u0004\u009c\u0016\u00fd\u000ef:".length();
                        var5_4 = 17;
                        var4_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 7;
                            v5 = ++var4_5;
                            v2 = var6_2.substring(v5, v5 + var5_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var9[var7_1++] = v4.intern();
                        if ((var4_5 += var5_4) < var8_3) {
                            var5_4 = var6_2.charAt(var4_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var10_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var10_6;
                    while (true) {
                        switch (var10_6 % 7) {
                            case 0: {
                                v15 = 64;
                                break;
                            }
                            case 1: {
                                v15 = 22;
                                break;
                            }
                            case 2: {
                                v15 = 90;
                                break;
                            }
                            case 3: {
                                v15 = 116;
                                break;
                            }
                            case 4: {
                                v15 = 15;
                                break;
                            }
                            case 5: {
                                v15 = 86;
                                break;
                            }
                            default: {
                                v15 = 56;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var10_6;
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
                } while (v10 > var10_6);
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
            H1.a = var9;
            H1.b = new String[27];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_7 = 6648637467162394274L;
        ** while (true)
        var0_8 = 5131659248757980836L ^ var2_7;
        v17 = new String[(int)var0_8];
        v17[0] = H1.a(-22390, -13050);
        v17[1] = H1.a(-22379, -30601);
        v17[2] = H1.a(-22389, -20642);
        v17[3] = H1.a(-22372, 10104);
        v17[4] = H1.a(-22370, -4538);
        v17[5] = H1.a(-22400, 31100);
        H1.B = Stream.of(v17).map((Function<String, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, toUpperCase(), (Ljava/lang/String;)Ljava/lang/String;)()).collect(Collectors.toSet());
        H1.J = new Hashtable<K, V>();
        H1.J.put(H1.a(-22394, 6446), H1.a(-22397, -13860));
        H1.J.put(H1.a(-22399, -7707), H1.a(-22398, 8981));
        H1.J.put(H1.a(-22381, 17521), H1.a(-22374, 20542));
        H1.J.put(H1.a(-22378, -9228), H1.a(-22374, 20542));
        H1.J.put(H1.a(-22369, 13936), H1.a(-22395, -27121));
        H1.J.put(H1.a(-22377, -12254), H1.a(-22396, 4130));
        H1.J.put(H1.a(-22376, 30129), H1.a(-22383, 9981));
        H1.J.put(H1.a(-22375, 2140), H1.a(-22371, 25612));
        H1.J.put(H1.a(-22380, 14377), H1.a(-22373, -3517));
        H1.J.put(H1.a(-22393, 5826), H1.a(-22392, -31468));
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFA892) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 194;
                    break;
                }
                case 1: {
                    n14 = 47;
                    break;
                }
                case 2: {
                    n14 = 68;
                    break;
                }
                case 3: {
                    n14 = 55;
                    break;
                }
                case 4: {
                    n14 = 10;
                    break;
                }
                case 5: {
                    n14 = 246;
                    break;
                }
                case 6: {
                    n14 = 196;
                    break;
                }
                case 7: {
                    n14 = 238;
                    break;
                }
                case 8: {
                    n14 = 26;
                    break;
                }
                case 9: {
                    n14 = 241;
                    break;
                }
                case 10: {
                    n14 = 184;
                    break;
                }
                case 11: {
                    n14 = 208;
                    break;
                }
                case 12: {
                    n14 = 133;
                    break;
                }
                case 13: {
                    n14 = 164;
                    break;
                }
                case 14: {
                    n14 = 123;
                    break;
                }
                case 15: {
                    n14 = 23;
                    break;
                }
                case 16: {
                    n14 = 218;
                    break;
                }
                case 17: {
                    n14 = 210;
                    break;
                }
                case 18: {
                    n14 = 189;
                    break;
                }
                case 19: {
                    n14 = 250;
                    break;
                }
                case 20: {
                    n14 = 129;
                    break;
                }
                case 21: {
                    n14 = 60;
                    break;
                }
                case 22: {
                    n14 = 124;
                    break;
                }
                case 23: {
                    n14 = 89;
                    break;
                }
                case 24: {
                    n14 = 255;
                    break;
                }
                case 25: {
                    n14 = 155;
                    break;
                }
                case 26: {
                    n14 = 237;
                    break;
                }
                case 27: {
                    n14 = 20;
                    break;
                }
                case 28: {
                    n14 = 130;
                    break;
                }
                case 29: {
                    n14 = 2;
                    break;
                }
                case 30: {
                    n14 = 172;
                    break;
                }
                case 31: {
                    n14 = 119;
                    break;
                }
                case 32: {
                    n14 = 63;
                    break;
                }
                case 33: {
                    n14 = 230;
                    break;
                }
                case 34: {
                    n14 = 234;
                    break;
                }
                case 35: {
                    n14 = 24;
                    break;
                }
                case 36: {
                    n14 = 78;
                    break;
                }
                case 37: {
                    n14 = 45;
                    break;
                }
                case 38: {
                    n14 = 46;
                    break;
                }
                case 39: {
                    n14 = 141;
                    break;
                }
                case 40: {
                    n14 = 216;
                    break;
                }
                case 41: {
                    n14 = 173;
                    break;
                }
                case 42: {
                    n14 = 85;
                    break;
                }
                case 43: {
                    n14 = 179;
                    break;
                }
                case 44: {
                    n14 = 193;
                    break;
                }
                case 45: {
                    n14 = 99;
                    break;
                }
                case 46: {
                    n14 = 136;
                    break;
                }
                case 47: {
                    n14 = 137;
                    break;
                }
                case 48: {
                    n14 = 84;
                    break;
                }
                case 49: {
                    n14 = 75;
                    break;
                }
                case 50: {
                    n14 = 186;
                    break;
                }
                case 51: {
                    n14 = 104;
                    break;
                }
                case 52: {
                    n14 = 90;
                    break;
                }
                case 53: {
                    n14 = 6;
                    break;
                }
                case 54: {
                    n14 = 236;
                    break;
                }
                case 55: {
                    n14 = 17;
                    break;
                }
                case 56: {
                    n14 = 27;
                    break;
                }
                case 57: {
                    n14 = 39;
                    break;
                }
                case 58: {
                    n14 = 152;
                    break;
                }
                case 59: {
                    n14 = 22;
                    break;
                }
                case 60: {
                    n14 = 71;
                    break;
                }
                case 61: {
                    n14 = 228;
                    break;
                }
                case 62: {
                    n14 = 138;
                    break;
                }
                case 63: {
                    n14 = 146;
                    break;
                }
                case 64: {
                    n14 = 54;
                    break;
                }
                case 65: {
                    n14 = 249;
                    break;
                }
                case 66: {
                    n14 = 14;
                    break;
                }
                case 67: {
                    n14 = 204;
                    break;
                }
                case 68: {
                    n14 = 21;
                    break;
                }
                case 69: {
                    n14 = 0;
                    break;
                }
                case 70: {
                    n14 = 7;
                    break;
                }
                case 71: {
                    n14 = 16;
                    break;
                }
                case 72: {
                    n14 = 253;
                    break;
                }
                case 73: {
                    n14 = 81;
                    break;
                }
                case 74: {
                    n14 = 86;
                    break;
                }
                case 75: {
                    n14 = 91;
                    break;
                }
                case 76: {
                    n14 = 161;
                    break;
                }
                case 77: {
                    n14 = 103;
                    break;
                }
                case 78: {
                    n14 = 215;
                    break;
                }
                case 79: {
                    n14 = 36;
                    break;
                }
                case 80: {
                    n14 = 15;
                    break;
                }
                case 81: {
                    n14 = 66;
                    break;
                }
                case 82: {
                    n14 = 34;
                    break;
                }
                case 83: {
                    n14 = 125;
                    break;
                }
                case 84: {
                    n14 = 96;
                    break;
                }
                case 85: {
                    n14 = 201;
                    break;
                }
                case 86: {
                    n14 = 1;
                    break;
                }
                case 87: {
                    n14 = 120;
                    break;
                }
                case 88: {
                    n14 = 42;
                    break;
                }
                case 89: {
                    n14 = 98;
                    break;
                }
                case 90: {
                    n14 = 159;
                    break;
                }
                case 91: {
                    n14 = 83;
                    break;
                }
                case 92: {
                    n14 = 128;
                    break;
                }
                case 93: {
                    n14 = 233;
                    break;
                }
                case 94: {
                    n14 = 150;
                    break;
                }
                case 95: {
                    n14 = 58;
                    break;
                }
                case 96: {
                    n14 = 110;
                    break;
                }
                case 97: {
                    n14 = 50;
                    break;
                }
                case 98: {
                    n14 = 31;
                    break;
                }
                case 99: {
                    n14 = 19;
                    break;
                }
                case 100: {
                    n14 = 219;
                    break;
                }
                case 101: {
                    n14 = 195;
                    break;
                }
                case 102: {
                    n14 = 53;
                    break;
                }
                case 103: {
                    n14 = 252;
                    break;
                }
                case 104: {
                    n14 = 162;
                    break;
                }
                case 105: {
                    n14 = 147;
                    break;
                }
                case 106: {
                    n14 = 13;
                    break;
                }
                case 107: {
                    n14 = 205;
                    break;
                }
                case 108: {
                    n14 = 206;
                    break;
                }
                case 109: {
                    n14 = 178;
                    break;
                }
                case 110: {
                    n14 = 52;
                    break;
                }
                case 111: {
                    n14 = 209;
                    break;
                }
                case 112: {
                    n14 = 102;
                    break;
                }
                case 113: {
                    n14 = 112;
                    break;
                }
                case 114: {
                    n14 = 153;
                    break;
                }
                case 115: {
                    n14 = 82;
                    break;
                }
                case 116: {
                    n14 = 65;
                    break;
                }
                case 117: {
                    n14 = 28;
                    break;
                }
                case 118: {
                    n14 = 116;
                    break;
                }
                case 119: {
                    n14 = 243;
                    break;
                }
                case 120: {
                    n14 = 239;
                    break;
                }
                case 121: {
                    n14 = 231;
                    break;
                }
                case 122: {
                    n14 = 132;
                    break;
                }
                case 123: {
                    n14 = 244;
                    break;
                }
                case 124: {
                    n14 = 185;
                    break;
                }
                case 125: {
                    n14 = 72;
                    break;
                }
                case 126: {
                    n14 = 32;
                    break;
                }
                case 127: {
                    n14 = 61;
                    break;
                }
                case 128: {
                    n14 = 175;
                    break;
                }
                case 129: {
                    n14 = 248;
                    break;
                }
                case 130: {
                    n14 = 113;
                    break;
                }
                case 131: {
                    n14 = 127;
                    break;
                }
                case 132: {
                    n14 = 145;
                    break;
                }
                case 133: {
                    n14 = 251;
                    break;
                }
                case 134: {
                    n14 = 225;
                    break;
                }
                case 135: {
                    n14 = 9;
                    break;
                }
                case 136: {
                    n14 = 149;
                    break;
                }
                case 137: {
                    n14 = 226;
                    break;
                }
                case 138: {
                    n14 = 180;
                    break;
                }
                case 139: {
                    n14 = 74;
                    break;
                }
                case 140: {
                    n14 = 37;
                    break;
                }
                case 141: {
                    n14 = 57;
                    break;
                }
                case 142: {
                    n14 = 97;
                    break;
                }
                case 143: {
                    n14 = 192;
                    break;
                }
                case 144: {
                    n14 = 114;
                    break;
                }
                case 145: {
                    n14 = 117;
                    break;
                }
                case 146: {
                    n14 = 35;
                    break;
                }
                case 147: {
                    n14 = 134;
                    break;
                }
                case 148: {
                    n14 = 122;
                    break;
                }
                case 149: {
                    n14 = 115;
                    break;
                }
                case 150: {
                    n14 = 213;
                    break;
                }
                case 151: {
                    n14 = 165;
                    break;
                }
                case 152: {
                    n14 = 168;
                    break;
                }
                case 153: {
                    n14 = 227;
                    break;
                }
                case 154: {
                    n14 = 140;
                    break;
                }
                case 155: {
                    n14 = 174;
                    break;
                }
                case 156: {
                    n14 = 202;
                    break;
                }
                case 157: {
                    n14 = 143;
                    break;
                }
                case 158: {
                    n14 = 107;
                    break;
                }
                case 159: {
                    n14 = 177;
                    break;
                }
                case 160: {
                    n14 = 18;
                    break;
                }
                case 161: {
                    n14 = 139;
                    break;
                }
                case 162: {
                    n14 = 190;
                    break;
                }
                case 163: {
                    n14 = 157;
                    break;
                }
                case 164: {
                    n14 = 121;
                    break;
                }
                case 165: {
                    n14 = 245;
                    break;
                }
                case 166: {
                    n14 = 106;
                    break;
                }
                case 167: {
                    n14 = 64;
                    break;
                }
                case 168: {
                    n14 = 158;
                    break;
                }
                case 169: {
                    n14 = 240;
                    break;
                }
                case 170: {
                    n14 = 49;
                    break;
                }
                case 171: {
                    n14 = 163;
                    break;
                }
                case 172: {
                    n14 = 191;
                    break;
                }
                case 173: {
                    n14 = 247;
                    break;
                }
                case 174: {
                    n14 = 224;
                    break;
                }
                case 175: {
                    n14 = 80;
                    break;
                }
                case 176: {
                    n14 = 109;
                    break;
                }
                case 177: {
                    n14 = 44;
                    break;
                }
                case 178: {
                    n14 = 188;
                    break;
                }
                case 179: {
                    n14 = 87;
                    break;
                }
                case 180: {
                    n14 = 111;
                    break;
                }
                case 181: {
                    n14 = 170;
                    break;
                }
                case 182: {
                    n14 = 33;
                    break;
                }
                case 183: {
                    n14 = 92;
                    break;
                }
                case 184: {
                    n14 = 40;
                    break;
                }
                case 185: {
                    n14 = 211;
                    break;
                }
                case 186: {
                    n14 = 207;
                    break;
                }
                case 187: {
                    n14 = 76;
                    break;
                }
                case 188: {
                    n14 = 108;
                    break;
                }
                case 189: {
                    n14 = 77;
                    break;
                }
                case 190: {
                    n14 = 203;
                    break;
                }
                case 191: {
                    n14 = 51;
                    break;
                }
                case 192: {
                    n14 = 160;
                    break;
                }
                case 193: {
                    n14 = 30;
                    break;
                }
                case 194: {
                    n14 = 197;
                    break;
                }
                case 195: {
                    n14 = 70;
                    break;
                }
                case 196: {
                    n14 = 166;
                    break;
                }
                case 197: {
                    n14 = 220;
                    break;
                }
                case 198: {
                    n14 = 182;
                    break;
                }
                case 199: {
                    n14 = 200;
                    break;
                }
                case 200: {
                    n14 = 38;
                    break;
                }
                case 201: {
                    n14 = 105;
                    break;
                }
                case 202: {
                    n14 = 25;
                    break;
                }
                case 203: {
                    n14 = 79;
                    break;
                }
                case 204: {
                    n14 = 151;
                    break;
                }
                case 205: {
                    n14 = 126;
                    break;
                }
                case 206: {
                    n14 = 4;
                    break;
                }
                case 207: {
                    n14 = 223;
                    break;
                }
                case 208: {
                    n14 = 5;
                    break;
                }
                case 209: {
                    n14 = 73;
                    break;
                }
                case 210: {
                    n14 = 214;
                    break;
                }
                case 211: {
                    n14 = 167;
                    break;
                }
                case 212: {
                    n14 = 183;
                    break;
                }
                case 213: {
                    n14 = 11;
                    break;
                }
                case 214: {
                    n14 = 131;
                    break;
                }
                case 215: {
                    n14 = 59;
                    break;
                }
                case 216: {
                    n14 = 232;
                    break;
                }
                case 217: {
                    n14 = 171;
                    break;
                }
                case 218: {
                    n14 = 142;
                    break;
                }
                case 219: {
                    n14 = 199;
                    break;
                }
                case 220: {
                    n14 = 69;
                    break;
                }
                case 221: {
                    n14 = 100;
                    break;
                }
                case 222: {
                    n14 = 176;
                    break;
                }
                case 223: {
                    n14 = 217;
                    break;
                }
                case 224: {
                    n14 = 118;
                    break;
                }
                case 225: {
                    n14 = 169;
                    break;
                }
                case 226: {
                    n14 = 8;
                    break;
                }
                case 227: {
                    n14 = 221;
                    break;
                }
                case 228: {
                    n14 = 212;
                    break;
                }
                case 229: {
                    n14 = 198;
                    break;
                }
                case 230: {
                    n14 = 187;
                    break;
                }
                case 231: {
                    n14 = 144;
                    break;
                }
                case 232: {
                    n14 = 135;
                    break;
                }
                case 233: {
                    n14 = 148;
                    break;
                }
                case 234: {
                    n14 = 95;
                    break;
                }
                case 235: {
                    n14 = 41;
                    break;
                }
                case 236: {
                    n14 = 229;
                    break;
                }
                case 237: {
                    n14 = 48;
                    break;
                }
                case 238: {
                    n14 = 101;
                    break;
                }
                case 239: {
                    n14 = 67;
                    break;
                }
                case 240: {
                    n14 = 242;
                    break;
                }
                case 241: {
                    n14 = 222;
                    break;
                }
                case 242: {
                    n14 = 254;
                    break;
                }
                case 243: {
                    n14 = 3;
                    break;
                }
                case 244: {
                    n14 = 94;
                    break;
                }
                case 245: {
                    n14 = 29;
                    break;
                }
                case 246: {
                    n14 = 93;
                    break;
                }
                case 247: {
                    n14 = 154;
                    break;
                }
                case 248: {
                    n14 = 62;
                    break;
                }
                case 249: {
                    n14 = 235;
                    break;
                }
                case 250: {
                    n14 = 156;
                    break;
                }
                case 251: {
                    n14 = 12;
                    break;
                }
                case 252: {
                    n14 = 56;
                    break;
                }
                case 253: {
                    n14 = 88;
                    break;
                }
                case 254: {
                    n14 = 43;
                    break;
                }
                default: {
                    n14 = 181;
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
            H1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

