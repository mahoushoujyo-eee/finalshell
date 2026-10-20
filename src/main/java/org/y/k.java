/*
 * Decompiled with CFR 0.152.
 */
package org.y;

import com.GO;
import com.ky_2;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;
import org.F.c;
import org.V.J;
import org.y.H;
import org.y.P;
import org.y.S;
import org.y.i;
import org.z.t;

public final class k {
    public static final ClassLoader r;
    public static final ClassLoader c;
    private static final S L;
    static final boolean p;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] e;

    private k() {
    }

    public static ClassLoader V(J j2, @c ClassLoader classLoader) {
        return new H(classLoader, j2);
    }

    public static Map D(@c ClassLoader classLoader, String string, boolean bl, boolean bl2) throws IOException {
        HashMap hashMap;
        block17: {
            HashMap hashMap2;
            block16: {
                block18: {
                    boolean bl3;
                    block15: {
                        block14: {
                            ClassLoader classLoader2;
                            block13: {
                                bl3 = GO.B();
                                try {
                                    classLoader2 = classLoader;
                                    if (bl3) break block13;
                                    if (classLoader2 != null) break block14;
                                }
                                catch (IOException iOException) {
                                    throw k.a(iOException);
                                }
                                classLoader2 = ClassLoader.getSystemClassLoader();
                            }
                            classLoader = classLoader2;
                        }
                        try {
                            try {
                                if (p || classLoader != null) break block15;
                            }
                            catch (IOException iOException) {
                                throw k.a(iOException);
                            }
                            throw new AssertionError();
                        }
                        catch (IOException iOException) {
                            throw k.a(iOException);
                        }
                    }
                    hashMap2 = new HashMap();
                    for (URL uRL : Collections.list(classLoader.getResources(string))) {
                        try {
                            hashMap2.putAll(k.U(uRL, string, bl, bl2));
                            if (bl3) break block16;
                            if (!bl3) continue;
                        }
                        catch (IOException iOException) {
                            throw k.a(iOException);
                        }
                        ky_2.K(new String[4]);
                        break;
                    }
                    try {
                        try {
                            hashMap = hashMap2;
                            if (bl3) break block17;
                            if (hashMap.isEmpty()) break block18;
                        }
                        catch (IOException iOException) {
                            throw k.a(iOException);
                        }
                        return hashMap2;
                    }
                    catch (IOException iOException) {
                        throw k.a(iOException);
                    }
                }
                hashMap2.putAll(k.p(string, bl, bl2));
            }
            hashMap = hashMap2;
        }
        return hashMap;
    }

    private static Map p(String string, boolean bl, boolean bl2) throws IOException {
        return L.T(string, bl, bl2);
    }

    public static Map U(URL uRL, String string, boolean bl, boolean bl2) throws IOException {
        String string2;
        block18: {
            boolean bl3;
            block14: {
                boolean bl4;
                String string3;
                block15: {
                    JarURLConnection jarURLConnection;
                    JarURLConnection jarURLConnection2;
                    block16: {
                        block17: {
                            string3 = uRL.getProtocol();
                            bl4 = GO.B();
                            try {
                                bl3 = k.a(-18025, 20520).equalsIgnoreCase(string3);
                                if (bl4) break block14;
                                if (!bl3) break block15;
                            }
                            catch (IOException iOException) {
                                throw k.a(iOException);
                            }
                            jarURLConnection2 = (JarURLConnection)uRL.openConnection();
                            try {
                                try {
                                    jarURLConnection2.setUseCaches(false);
                                    jarURLConnection = jarURLConnection2;
                                    if (bl4) break block16;
                                    if (jarURLConnection.getJarEntry().isDirectory()) break block17;
                                }
                                catch (IOException iOException) {
                                    throw k.a(iOException);
                                }
                                return Collections.singletonMap(string, uRL);
                            }
                            catch (IOException iOException) {
                                throw k.a(iOException);
                            }
                        }
                        jarURLConnection = jarURLConnection2;
                    }
                    URL uRL2 = jarURLConnection.getJarFileURL();
                    JarFile jarFile = jarURLConnection2.getJarFile();
                    Map map = k.C(uRL2, jarFile, string, bl, bl2);
                    try {
                        if (bl) {
                            map.put(string, uRL);
                        }
                    }
                    catch (IOException iOException) {
                        throw k.a(iOException);
                    }
                    return map;
                }
                try {
                    string2 = k.a(-18026, -16316);
                    if (bl4) break block18;
                    bl3 = string2.equalsIgnoreCase(string3);
                }
                catch (IOException iOException) {
                    throw k.a(iOException);
                }
            }
            try {
                if (bl3) {
                    return k.s(uRL, string, bl, bl2);
                }
            }
            catch (IOException iOException) {
                throw k.a(iOException);
            }
            string2 = string;
        }
        return Collections.singletonMap(string2, uRL);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Map C(URL var0, JarFile var1_1, String var2_2, boolean var3_3, boolean var4_4) {
        var6_5 = new HashMap<String, URL>();
        var5_6 = GO.s();
        var7_7 = var1_1.entries();
        while (var7_7.hasMoreElements()) {
            block19: {
                block22: {
                    block21: {
                        block20: {
                            block18: {
                                block24: {
                                    block23: {
                                        var8_8 = var7_7.nextElement();
                                        v0 = var8_8.isDirectory();
                                        if (!var5_6) break block18;
                                        if (v0 == 0) ** GOTO lbl27
                                        break block23;
                                        catch (MalformedURLException v1) {
                                            throw k.a(v1);
                                        }
                                    }
                                    v0 = var3_3;
                                    if (!var5_6) break block18;
                                    break block24;
                                    catch (MalformedURLException v2) {
                                        throw k.a(v2);
                                    }
                                }
                                try {
                                    block25: {
                                        if (v0 == 0) break block19;
                                        break block25;
                                        catch (MalformedURLException v3) {
                                            throw k.a(v3);
                                        }
                                    }
                                    v0 = var8_8.getName().startsWith(var2_2);
                                }
                                catch (MalformedURLException v4) {
                                    throw k.a(v4);
                                }
                            }
                            try {
                                if (!var5_6) break block20;
                                if (v0 == 0) break block19;
                            }
                            catch (MalformedURLException v5) {
                                throw k.a(v5);
                            }
                            v0 = var4_4;
                        }
                        if (!var5_6) break block21;
                        try {
                            block26: {
                                if (v0 != 0) break block22;
                                break block26;
                                catch (MalformedURLException v6) {
                                    throw k.a(v6);
                                }
                            }
                            v0 = var8_8.getName().indexOf(k.a(15266, 9139316777076811693L), var2_2.length());
                        }
                        catch (MalformedURLException v7) {
                            throw k.a(v7);
                        }
                    }
                    if (v0 != -1) break block19;
                }
                try {
                    var9_9 = new URL(k.a(-18028, -27043), null, var0.toString() + k.a(-18029, -16355) + var8_8.getName());
                }
                catch (MalformedURLException var10_10) {
                    throw new AssertionError((Object)var10_10);
                }
                var6_5.put(var8_8.getName(), var9_9);
            }
            if (var5_6) continue;
        }
        return var6_5;
    }

    private static Map s(URL uRL, String string, boolean bl, boolean bl2) {
        block10: {
            boolean bl3;
            File file;
            block12: {
                String string2;
                block13: {
                    boolean bl4;
                    block11: {
                        block9: {
                            file = new File(uRL.getFile());
                            bl3 = GO.s();
                            bl4 = file.isFile();
                            if (bl3) {
                                if (bl4) {
                                    return Collections.singletonMap(string, uRL);
                                }
                                bl4 = file.isDirectory();
                            }
                            if (!bl3) break block9;
                            if (!bl4) break block10;
                            bl4 = string.isEmpty();
                        }
                        if (!bl3) break block11;
                        if (bl4) break block12;
                        string2 = string;
                        if (!bl3) break block13;
                        bl4 = string2.endsWith("/");
                    }
                    if (bl4) break block12;
                    string2 = string + (char)k.a(9348, 7304328070342506634L);
                }
                string = string2;
            }
            HashMap<String, URL> hashMap = new HashMap<String, URL>();
            if (bl) {
                hashMap.put(string, uRL);
            }
            for (File file2 : file.listFiles()) {
                Serializable serializable;
                String string3 = string + file2.getName();
                URL uRL2 = k.Z(file2);
                boolean bl5 = bl2;
                if (bl3) {
                    if (bl5) {
                        hashMap.putAll(k.s(uRL2, string3, bl, bl2));
                        if (bl3) continue;
                    }
                    serializable = file2;
                    if (!bl3) continue;
                    bl5 = serializable.isFile();
                }
                if (!bl5) continue;
                serializable = hashMap.put(string3, uRL2);
                if (bl3) continue;
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    private static URL Z(File file) {
        try {
            return file.toURI().toURL();
        }
        catch (MalformedURLException malformedURLException) {
            throw new AssertionError((Object)malformedURLException);
        }
    }

    static Map Z(URL uRL, JarFile jarFile, String string, boolean bl, boolean bl2) {
        return k.C(uRL, jarFile, string, bl, bl2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            block32: {
                                block31: {
                                    var13 = new String[7];
                                    var11_1 = 0;
                                    var10_2 = "\u0081\u009b\u00d5\u0004\u00e5\u0017\u00ca%\u0016&d%Fb\u00f5\u00bee\u0018\u0090!\u00eb\u00f4o\u008e\u00b5@\u00c9\u00deK\u0010\u0003\u0003\u00c7l\u001d\u0002\u0091\u009b";
                                    var12_3 = "\u0081\u009b\u00d5\u0004\u00e5\u0017\u00ca%\u0016&d%Fb\u00f5\u00bee\u0018\u0090!\u00eb\u00f4o\u008e\u00b5@\u00c9\u00deK\u0010\u0003\u0003\u00c7l\u001d\u0002\u0091\u009b".length();
                                    var9_4 = 3;
                                    var8_5 = -1;
lbl7:
                                    // 2 sources

                                    while (true) {
                                        v0 = 65;
                                        v1 = ++var8_5;
                                        v2 = var10_2.substring(v1, v1 + var9_4);
                                        v3 = -1;
                                        break block31;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        var13[var11_1++] = v4.intern();
                                        if ((var8_5 += var9_4) < var12_3) {
                                            var9_4 = var10_2.charAt(var8_5);
                                            ** continue;
                                        }
                                        var10_2 = "\u00b3\u008c\u0093M\u001c\u00032\u00d1=\u00b7\u00d9\u000fW}\u0086<b\u0014U%\u00a1e\u00fa1n\u00e6\u0010U\u00df\u00f2\u00b6e\u00f7\u0004\u009f\u00c27\b\u00dd\u0091\\\u00eb%-\u00eb\u008d1\u000f\u009aJ\u0086\u00b0\u00f4`\u00e8\u0090_\u0088\u00ba\u009f\u00a7E\b,\u0094\u009b\u00a2o\u00a3\b\u0092\u008e\u0015\u0084\u00bb\u00f1\"\u00a57;\u0093";
                                        var12_3 = "\u00b3\u008c\u0093M\u001c\u00032\u00d1=\u00b7\u00d9\u000fW}\u0086<b\u0014U%\u00a1e\u00fa1n\u00e6\u0010U\u00df\u00f2\u00b6e\u00f7\u0004\u009f\u00c27\b\u00dd\u0091\\\u00eb%-\u00eb\u008d1\u000f\u009aJ\u0086\u00b0\u00f4`\u00e8\u0090_\u0088\u00ba\u009f\u00a7E\b,\u0094\u009b\u00a2o\u00a3\b\u0092\u008e\u0015\u0084\u00bb\u00f1\"\u00a57;\u0093".length();
                                        var9_4 = 3;
                                        var8_5 = -1;
lbl22:
                                        // 2 sources

                                        while (true) {
                                            v0 = 42;
                                            v5 = ++var8_5;
                                            v2 = var10_2.substring(v5, v5 + var9_4);
                                            v3 = 0;
                                            break block31;
                                            break;
                                        }
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var13[var11_1++] = v4.intern();
                                        if ((var8_5 += var9_4) < var12_3) {
                                            var9_4 = var10_2.charAt(var8_5);
                                            ** continue;
                                        }
                                        break block32;
                                        break;
                                    }
                                }
                                v6 = v2.toCharArray();
                                v7 = v6.length;
                                var14_6 = 0;
                                v8 = v0;
                                v9 = v6;
                                v10 = v7;
                                if (v7 > 1) ** GOTO lbl85
                                do {
                                    v11 = v8;
                                    v9 = v9;
                                    v12 = v9;
                                    v13 = v8;
                                    v14 = var14_6;
                                    while (true) {
                                        switch (var14_6 % 7) {
                                            case 0: {
                                                v15 = 30;
                                                break;
                                            }
                                            case 1: {
                                                v15 = 103;
                                                break;
                                            }
                                            case 2: {
                                                v15 = 26;
                                                break;
                                            }
                                            case 3: {
                                                v15 = 99;
                                                break;
                                            }
                                            case 4: {
                                                v15 = 123;
                                                break;
                                            }
                                            case 5: {
                                                v15 = 25;
                                                break;
                                            }
                                            default: {
                                                v15 = 95;
                                            }
                                        }
                                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                        ++var14_6;
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
                                } while (v10 > var14_6);
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
                            k.a = var13;
                            k.b = new String[7];
                            var0_7 = 6211108986649984253L;
                            var6_8 = new long[2];
                            var3_9 = 0;
                            var4_10 = "\u00b3)\u0088\u00bc\u00e9\u00ec[\u007f\u00ed]\u0000h9/\u00c4X";
                            var5_11 = "\u00b3)\u0088\u00bc\u00e9\u00ec[\u007f\u00ed]\u0000h9/\u00c4X".length();
                            var2_12 = 0;
                            while (true) {
                                break block33;
                                break;
                            }
lbl107:
                            // 1 sources

                            while (true) {
                                var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                                if (var2_12 < var5_11) ** continue;
                                break block34;
                                break;
                            }
                        }
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var3_9++;
                        ** while (true)
                    }
                    k.d = var6_8;
                    k.e = new Integer[2];
                    try {
                        v18 = k.class.desiredAssertionStatus() == false;
                    }
                    catch (IOException v19) {
                        throw k.a(v19);
                    }
                    k.p = v18;
                    k.r = ClassLoader.getSystemClassLoader();
                    k.c = ClassLoader.getSystemClassLoader().getParent();
                    var15_14 = ClassLoader.getSystemClassLoader().getResource(k.a(-18027, 13091));
                    if (k.p) break block35;
                    try {
                        block37: {
                            if (var15_14 != null) break block35;
                            break block37;
                            catch (IOException v20) {
                                throw k.a(v20);
                            }
                        }
                        throw new AssertionError();
                    }
                    catch (IOException v21) {
                        throw k.a(v21);
                    }
                }
                var16_15 = var15_14.getProtocol();
                if (!k.a(-18025, 20520).equalsIgnoreCase(var16_15)) break block36;
                try {
                    var19_16 = (JarURLConnection)var15_14.openConnection();
                    var19_16.setUseCaches(false);
                    var17_18 = var19_16.getJarFileURL();
                    var18_20 = var19_16.getJarFile();
                }
                catch (IOException var19_17) {
                    throw new AssertionError((Object)var19_17);
                }
                k.L = new i(var17_18, var18_20);
                break block38;
            }
            if (k.a(-18030, 24730).equalsIgnoreCase(var16_15)) {
                var17_19 = t.c().W();
                k.L = new P(var17_19);
            } else {
                throw new AssertionError((Object)k.a(-18031, -21101));
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFB997) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 203;
                    break;
                }
                case 1: {
                    n14 = 150;
                    break;
                }
                case 2: {
                    n14 = 214;
                    break;
                }
                case 3: {
                    n14 = 159;
                    break;
                }
                case 4: {
                    n14 = 172;
                    break;
                }
                case 5: {
                    n14 = 8;
                    break;
                }
                case 6: {
                    n14 = 220;
                    break;
                }
                case 7: {
                    n14 = 164;
                    break;
                }
                case 8: {
                    n14 = 69;
                    break;
                }
                case 9: {
                    n14 = 33;
                    break;
                }
                case 10: {
                    n14 = 179;
                    break;
                }
                case 11: {
                    n14 = 236;
                    break;
                }
                case 12: {
                    n14 = 39;
                    break;
                }
                case 13: {
                    n14 = 95;
                    break;
                }
                case 14: {
                    n14 = 170;
                    break;
                }
                case 15: {
                    n14 = 237;
                    break;
                }
                case 16: {
                    n14 = 178;
                    break;
                }
                case 17: {
                    n14 = 30;
                    break;
                }
                case 18: {
                    n14 = 185;
                    break;
                }
                case 19: {
                    n14 = 65;
                    break;
                }
                case 20: {
                    n14 = 148;
                    break;
                }
                case 21: {
                    n14 = 186;
                    break;
                }
                case 22: {
                    n14 = 34;
                    break;
                }
                case 23: {
                    n14 = 143;
                    break;
                }
                case 24: {
                    n14 = 100;
                    break;
                }
                case 25: {
                    n14 = 221;
                    break;
                }
                case 26: {
                    n14 = 11;
                    break;
                }
                case 27: {
                    n14 = 191;
                    break;
                }
                case 28: {
                    n14 = 75;
                    break;
                }
                case 29: {
                    n14 = 153;
                    break;
                }
                case 30: {
                    n14 = 76;
                    break;
                }
                case 31: {
                    n14 = 24;
                    break;
                }
                case 32: {
                    n14 = 245;
                    break;
                }
                case 33: {
                    n14 = 4;
                    break;
                }
                case 34: {
                    n14 = 58;
                    break;
                }
                case 35: {
                    n14 = 51;
                    break;
                }
                case 36: {
                    n14 = 6;
                    break;
                }
                case 37: {
                    n14 = 79;
                    break;
                }
                case 38: {
                    n14 = 17;
                    break;
                }
                case 39: {
                    n14 = 244;
                    break;
                }
                case 40: {
                    n14 = 137;
                    break;
                }
                case 41: {
                    n14 = 146;
                    break;
                }
                case 42: {
                    n14 = 122;
                    break;
                }
                case 43: {
                    n14 = 87;
                    break;
                }
                case 44: {
                    n14 = 187;
                    break;
                }
                case 45: {
                    n14 = 151;
                    break;
                }
                case 46: {
                    n14 = 168;
                    break;
                }
                case 47: {
                    n14 = 249;
                    break;
                }
                case 48: {
                    n14 = 10;
                    break;
                }
                case 49: {
                    n14 = 63;
                    break;
                }
                case 50: {
                    n14 = 118;
                    break;
                }
                case 51: {
                    n14 = 252;
                    break;
                }
                case 52: {
                    n14 = 113;
                    break;
                }
                case 53: {
                    n14 = 192;
                    break;
                }
                case 54: {
                    n14 = 117;
                    break;
                }
                case 55: {
                    n14 = 201;
                    break;
                }
                case 56: {
                    n14 = 50;
                    break;
                }
                case 57: {
                    n14 = 2;
                    break;
                }
                case 58: {
                    n14 = 71;
                    break;
                }
                case 59: {
                    n14 = 48;
                    break;
                }
                case 60: {
                    n14 = 35;
                    break;
                }
                case 61: {
                    n14 = 181;
                    break;
                }
                case 62: {
                    n14 = 156;
                    break;
                }
                case 63: {
                    n14 = 174;
                    break;
                }
                case 64: {
                    n14 = 108;
                    break;
                }
                case 65: {
                    n14 = 251;
                    break;
                }
                case 66: {
                    n14 = 134;
                    break;
                }
                case 67: {
                    n14 = 78;
                    break;
                }
                case 68: {
                    n14 = 227;
                    break;
                }
                case 69: {
                    n14 = 67;
                    break;
                }
                case 70: {
                    n14 = 1;
                    break;
                }
                case 71: {
                    n14 = 73;
                    break;
                }
                case 72: {
                    n14 = 208;
                    break;
                }
                case 73: {
                    n14 = 182;
                    break;
                }
                case 74: {
                    n14 = 74;
                    break;
                }
                case 75: {
                    n14 = 204;
                    break;
                }
                case 76: {
                    n14 = 7;
                    break;
                }
                case 77: {
                    n14 = 90;
                    break;
                }
                case 78: {
                    n14 = 21;
                    break;
                }
                case 79: {
                    n14 = 129;
                    break;
                }
                case 80: {
                    n14 = 72;
                    break;
                }
                case 81: {
                    n14 = 26;
                    break;
                }
                case 82: {
                    n14 = 230;
                    break;
                }
                case 83: {
                    n14 = 233;
                    break;
                }
                case 84: {
                    n14 = 232;
                    break;
                }
                case 85: {
                    n14 = 123;
                    break;
                }
                case 86: {
                    n14 = 25;
                    break;
                }
                case 87: {
                    n14 = 229;
                    break;
                }
                case 88: {
                    n14 = 200;
                    break;
                }
                case 89: {
                    n14 = 199;
                    break;
                }
                case 90: {
                    n14 = 209;
                    break;
                }
                case 91: {
                    n14 = 247;
                    break;
                }
                case 92: {
                    n14 = 14;
                    break;
                }
                case 93: {
                    n14 = 154;
                    break;
                }
                case 94: {
                    n14 = 234;
                    break;
                }
                case 95: {
                    n14 = 126;
                    break;
                }
                case 96: {
                    n14 = 55;
                    break;
                }
                case 97: {
                    n14 = 160;
                    break;
                }
                case 98: {
                    n14 = 202;
                    break;
                }
                case 99: {
                    n14 = 41;
                    break;
                }
                case 100: {
                    n14 = 183;
                    break;
                }
                case 101: {
                    n14 = 23;
                    break;
                }
                case 102: {
                    n14 = 105;
                    break;
                }
                case 103: {
                    n14 = 102;
                    break;
                }
                case 104: {
                    n14 = 254;
                    break;
                }
                case 105: {
                    n14 = 219;
                    break;
                }
                case 106: {
                    n14 = 62;
                    break;
                }
                case 107: {
                    n14 = 149;
                    break;
                }
                case 108: {
                    n14 = 19;
                    break;
                }
                case 109: {
                    n14 = 195;
                    break;
                }
                case 110: {
                    n14 = 12;
                    break;
                }
                case 111: {
                    n14 = 37;
                    break;
                }
                case 112: {
                    n14 = 145;
                    break;
                }
                case 113: {
                    n14 = 163;
                    break;
                }
                case 114: {
                    n14 = 83;
                    break;
                }
                case 115: {
                    n14 = 59;
                    break;
                }
                case 116: {
                    n14 = 81;
                    break;
                }
                case 117: {
                    n14 = 68;
                    break;
                }
                case 118: {
                    n14 = 135;
                    break;
                }
                case 119: {
                    n14 = 184;
                    break;
                }
                case 120: {
                    n14 = 197;
                    break;
                }
                case 121: {
                    n14 = 16;
                    break;
                }
                case 122: {
                    n14 = 212;
                    break;
                }
                case 123: {
                    n14 = 64;
                    break;
                }
                case 124: {
                    n14 = 53;
                    break;
                }
                case 125: {
                    n14 = 240;
                    break;
                }
                case 126: {
                    n14 = 157;
                    break;
                }
                case 127: {
                    n14 = 207;
                    break;
                }
                case 128: {
                    n14 = 162;
                    break;
                }
                case 129: {
                    n14 = 193;
                    break;
                }
                case 130: {
                    n14 = 18;
                    break;
                }
                case 131: {
                    n14 = 189;
                    break;
                }
                case 132: {
                    n14 = 136;
                    break;
                }
                case 133: {
                    n14 = 99;
                    break;
                }
                case 134: {
                    n14 = 96;
                    break;
                }
                case 135: {
                    n14 = 173;
                    break;
                }
                case 136: {
                    n14 = 141;
                    break;
                }
                case 137: {
                    n14 = 20;
                    break;
                }
                case 138: {
                    n14 = 89;
                    break;
                }
                case 139: {
                    n14 = 180;
                    break;
                }
                case 140: {
                    n14 = 215;
                    break;
                }
                case 141: {
                    n14 = 66;
                    break;
                }
                case 142: {
                    n14 = 27;
                    break;
                }
                case 143: {
                    n14 = 196;
                    break;
                }
                case 144: {
                    n14 = 231;
                    break;
                }
                case 145: {
                    n14 = 250;
                    break;
                }
                case 146: {
                    n14 = 239;
                    break;
                }
                case 147: {
                    n14 = 106;
                    break;
                }
                case 148: {
                    n14 = 13;
                    break;
                }
                case 149: {
                    n14 = 246;
                    break;
                }
                case 150: {
                    n14 = 198;
                    break;
                }
                case 151: {
                    n14 = 28;
                    break;
                }
                case 152: {
                    n14 = 107;
                    break;
                }
                case 153: {
                    n14 = 205;
                    break;
                }
                case 154: {
                    n14 = 49;
                    break;
                }
                case 155: {
                    n14 = 127;
                    break;
                }
                case 156: {
                    n14 = 98;
                    break;
                }
                case 157: {
                    n14 = 109;
                    break;
                }
                case 158: {
                    n14 = 44;
                    break;
                }
                case 159: {
                    n14 = 213;
                    break;
                }
                case 160: {
                    n14 = 91;
                    break;
                }
                case 161: {
                    n14 = 228;
                    break;
                }
                case 162: {
                    n14 = 92;
                    break;
                }
                case 163: {
                    n14 = 80;
                    break;
                }
                case 164: {
                    n14 = 190;
                    break;
                }
                case 165: {
                    n14 = 77;
                    break;
                }
                case 166: {
                    n14 = 121;
                    break;
                }
                case 167: {
                    n14 = 248;
                    break;
                }
                case 168: {
                    n14 = 45;
                    break;
                }
                case 169: {
                    n14 = 165;
                    break;
                }
                case 170: {
                    n14 = 128;
                    break;
                }
                case 171: {
                    n14 = 52;
                    break;
                }
                case 172: {
                    n14 = 255;
                    break;
                }
                case 173: {
                    n14 = 119;
                    break;
                }
                case 174: {
                    n14 = 86;
                    break;
                }
                case 175: {
                    n14 = 155;
                    break;
                }
                case 176: {
                    n14 = 175;
                    break;
                }
                case 177: {
                    n14 = 82;
                    break;
                }
                case 178: {
                    n14 = 70;
                    break;
                }
                case 179: {
                    n14 = 147;
                    break;
                }
                case 180: {
                    n14 = 9;
                    break;
                }
                case 181: {
                    n14 = 218;
                    break;
                }
                case 182: {
                    n14 = 130;
                    break;
                }
                case 183: {
                    n14 = 132;
                    break;
                }
                case 184: {
                    n14 = 56;
                    break;
                }
                case 185: {
                    n14 = 224;
                    break;
                }
                case 186: {
                    n14 = 104;
                    break;
                }
                case 187: {
                    n14 = 47;
                    break;
                }
                case 188: {
                    n14 = 167;
                    break;
                }
                case 189: {
                    n14 = 169;
                    break;
                }
                case 190: {
                    n14 = 15;
                    break;
                }
                case 191: {
                    n14 = 124;
                    break;
                }
                case 192: {
                    n14 = 158;
                    break;
                }
                case 193: {
                    n14 = 57;
                    break;
                }
                case 194: {
                    n14 = 31;
                    break;
                }
                case 195: {
                    n14 = 226;
                    break;
                }
                case 196: {
                    n14 = 133;
                    break;
                }
                case 197: {
                    n14 = 206;
                    break;
                }
                case 198: {
                    n14 = 243;
                    break;
                }
                case 199: {
                    n14 = 61;
                    break;
                }
                case 200: {
                    n14 = 5;
                    break;
                }
                case 201: {
                    n14 = 3;
                    break;
                }
                case 202: {
                    n14 = 97;
                    break;
                }
                case 203: {
                    n14 = 36;
                    break;
                }
                case 204: {
                    n14 = 112;
                    break;
                }
                case 205: {
                    n14 = 138;
                    break;
                }
                case 206: {
                    n14 = 46;
                    break;
                }
                case 207: {
                    n14 = 210;
                    break;
                }
                case 208: {
                    n14 = 216;
                    break;
                }
                case 209: {
                    n14 = 222;
                    break;
                }
                case 210: {
                    n14 = 211;
                    break;
                }
                case 211: {
                    n14 = 115;
                    break;
                }
                case 212: {
                    n14 = 225;
                    break;
                }
                case 213: {
                    n14 = 166;
                    break;
                }
                case 214: {
                    n14 = 223;
                    break;
                }
                case 215: {
                    n14 = 188;
                    break;
                }
                case 216: {
                    n14 = 32;
                    break;
                }
                case 217: {
                    n14 = 22;
                    break;
                }
                case 218: {
                    n14 = 42;
                    break;
                }
                case 219: {
                    n14 = 176;
                    break;
                }
                case 220: {
                    n14 = 144;
                    break;
                }
                case 221: {
                    n14 = 84;
                    break;
                }
                case 222: {
                    n14 = 116;
                    break;
                }
                case 223: {
                    n14 = 43;
                    break;
                }
                case 224: {
                    n14 = 0;
                    break;
                }
                case 225: {
                    n14 = 93;
                    break;
                }
                case 226: {
                    n14 = 114;
                    break;
                }
                case 227: {
                    n14 = 120;
                    break;
                }
                case 228: {
                    n14 = 152;
                    break;
                }
                case 229: {
                    n14 = 103;
                    break;
                }
                case 230: {
                    n14 = 217;
                    break;
                }
                case 231: {
                    n14 = 111;
                    break;
                }
                case 232: {
                    n14 = 194;
                    break;
                }
                case 233: {
                    n14 = 139;
                    break;
                }
                case 234: {
                    n14 = 242;
                    break;
                }
                case 235: {
                    n14 = 235;
                    break;
                }
                case 236: {
                    n14 = 88;
                    break;
                }
                case 237: {
                    n14 = 241;
                    break;
                }
                case 238: {
                    n14 = 29;
                    break;
                }
                case 239: {
                    n14 = 140;
                    break;
                }
                case 240: {
                    n14 = 40;
                    break;
                }
                case 241: {
                    n14 = 38;
                    break;
                }
                case 242: {
                    n14 = 131;
                    break;
                }
                case 243: {
                    n14 = 60;
                    break;
                }
                case 244: {
                    n14 = 85;
                    break;
                }
                case 245: {
                    n14 = 177;
                    break;
                }
                case 246: {
                    n14 = 125;
                    break;
                }
                case 247: {
                    n14 = 238;
                    break;
                }
                case 248: {
                    n14 = 142;
                    break;
                }
                case 249: {
                    n14 = 110;
                    break;
                }
                case 250: {
                    n14 = 54;
                    break;
                }
                case 251: {
                    n14 = 94;
                    break;
                }
                case 252: {
                    n14 = 101;
                    break;
                }
                case 253: {
                    n14 = 161;
                    break;
                }
                case 254: {
                    n14 = 253;
                    break;
                }
                default: {
                    n14 = 171;
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
            k.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5C0F;
        if (e[n11] == null) {
            k.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

