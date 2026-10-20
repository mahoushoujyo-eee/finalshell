/*
 * Decompiled with CFR 0.152.
 */
package org.S;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class K {
    private static String[] O;
    private static final String[] b;
    private static final String[] c;
    private static final long e;

    protected K() {
    }

    public static Object E(Class clazz, String string) throws NoSuchMethodException, InstantiationException, InvocationTargetException, IllegalAccessException {
        String string2;
        block56: {
            boolean bl;
            block39: {
                String[] stringArray;
                block40: {
                    Class clazz2;
                    block43: {
                        Class<Comparable<Boolean>> clazz3;
                        block54: {
                            block55: {
                                block52: {
                                    block53: {
                                        block50: {
                                            block51: {
                                                block48: {
                                                    block49: {
                                                        block46: {
                                                            block47: {
                                                                block44: {
                                                                    block45: {
                                                                        block41: {
                                                                            block42: {
                                                                                stringArray = K.y();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                bl = clazz.isPrimitive();
                                                                                                if (stringArray == null) break block39;
                                                                                                if (!bl) break block40;
                                                                                            }
                                                                                            catch (NoSuchMethodException noSuchMethodException) {
                                                                                                throw K.a(noSuchMethodException);
                                                                                            }
                                                                                            clazz2 = clazz;
                                                                                            clazz3 = Boolean.TYPE;
                                                                                            if (stringArray == null) break block41;
                                                                                        }
                                                                                        catch (NoSuchMethodException noSuchMethodException) {
                                                                                            throw K.a(noSuchMethodException);
                                                                                        }
                                                                                        if (clazz2 != clazz3) break block42;
                                                                                    }
                                                                                    catch (NoSuchMethodException noSuchMethodException) {
                                                                                        throw K.a(noSuchMethodException);
                                                                                    }
                                                                                    clazz2 = Boolean.class;
                                                                                    break block43;
                                                                                }
                                                                                catch (NoSuchMethodException noSuchMethodException) {
                                                                                    throw K.a(noSuchMethodException);
                                                                                }
                                                                            }
                                                                            clazz2 = clazz;
                                                                            clazz3 = Character.TYPE;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (stringArray == null) break block44;
                                                                                if (clazz2 != clazz3) break block45;
                                                                            }
                                                                            catch (NoSuchMethodException noSuchMethodException) {
                                                                                throw K.a(noSuchMethodException);
                                                                            }
                                                                            clazz2 = Character.class;
                                                                            break block43;
                                                                        }
                                                                        catch (NoSuchMethodException noSuchMethodException) {
                                                                            throw K.a(noSuchMethodException);
                                                                        }
                                                                    }
                                                                    clazz2 = clazz;
                                                                    clazz3 = Byte.TYPE;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (stringArray == null) break block46;
                                                                        if (clazz2 != clazz3) break block47;
                                                                    }
                                                                    catch (NoSuchMethodException noSuchMethodException) {
                                                                        throw K.a(noSuchMethodException);
                                                                    }
                                                                    clazz2 = Byte.class;
                                                                    break block43;
                                                                }
                                                                catch (NoSuchMethodException noSuchMethodException) {
                                                                    throw K.a(noSuchMethodException);
                                                                }
                                                            }
                                                            clazz2 = clazz;
                                                            clazz3 = Short.TYPE;
                                                        }
                                                        try {
                                                            try {
                                                                if (stringArray == null) break block48;
                                                                if (clazz2 != clazz3) break block49;
                                                            }
                                                            catch (NoSuchMethodException noSuchMethodException) {
                                                                throw K.a(noSuchMethodException);
                                                            }
                                                            clazz2 = Short.class;
                                                            break block43;
                                                        }
                                                        catch (NoSuchMethodException noSuchMethodException) {
                                                            throw K.a(noSuchMethodException);
                                                        }
                                                    }
                                                    clazz2 = clazz;
                                                    clazz3 = Integer.TYPE;
                                                }
                                                try {
                                                    try {
                                                        if (stringArray == null) break block50;
                                                        if (clazz2 != clazz3) break block51;
                                                    }
                                                    catch (NoSuchMethodException noSuchMethodException) {
                                                        throw K.a(noSuchMethodException);
                                                    }
                                                    clazz2 = Integer.class;
                                                    break block43;
                                                }
                                                catch (NoSuchMethodException noSuchMethodException) {
                                                    throw K.a(noSuchMethodException);
                                                }
                                            }
                                            clazz2 = clazz;
                                            clazz3 = Long.TYPE;
                                        }
                                        try {
                                            try {
                                                if (stringArray == null) break block52;
                                                if (clazz2 != clazz3) break block53;
                                            }
                                            catch (NoSuchMethodException noSuchMethodException) {
                                                throw K.a(noSuchMethodException);
                                            }
                                            clazz2 = Long.class;
                                            break block43;
                                        }
                                        catch (NoSuchMethodException noSuchMethodException) {
                                            throw K.a(noSuchMethodException);
                                        }
                                    }
                                    clazz2 = clazz;
                                    clazz3 = Float.TYPE;
                                }
                                try {
                                    try {
                                        if (stringArray == null) break block54;
                                        if (clazz2 != clazz3) break block55;
                                    }
                                    catch (NoSuchMethodException noSuchMethodException) {
                                        throw K.a(noSuchMethodException);
                                    }
                                    clazz2 = Float.class;
                                    break block43;
                                }
                                catch (NoSuchMethodException noSuchMethodException) {
                                    throw K.a(noSuchMethodException);
                                }
                            }
                            try {
                                clazz2 = clazz;
                                if (stringArray == null) break block43;
                                clazz3 = Double.TYPE;
                            }
                            catch (NoSuchMethodException noSuchMethodException) {
                                throw K.a(noSuchMethodException);
                            }
                        }
                        clazz2 = clazz2 == clazz3 ? Double.class : Void.TYPE;
                    }
                    clazz = clazz2;
                }
                try {
                    string2 = "";
                    if (stringArray == null) break block56;
                    bl = string2.equals(string);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    throw K.a(noSuchMethodException);
                }
            }
            try {
                if (bl) {
                    return clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
                }
            }
            catch (NoSuchMethodException noSuchMethodException) {
                throw K.a(noSuchMethodException);
            }
            string2 = clazz.getConstructor(String.class).newInstance(string);
        }
        return string2;
    }

    public static String[] Q(String string) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        block4: {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            arrayList2 = new ArrayList<String>();
            String[] stringArray = K.y();
            while (stringTokenizer.hasMoreTokens()) {
                try {
                    arrayList = arrayList2;
                    if (stringArray != null) {
                        arrayList.add(stringTokenizer.nextToken());
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw K.a(runtimeException);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList.toArray(new String[arrayList2.size()]);
    }

    /*
     * Unable to fully structure code
     */
    public static Class c(String var0) {
        block112: {
            block119: {
                block118: {
                    block117: {
                        block116: {
                            block115: {
                                block114: {
                                    block113: {
                                        block111: {
                                            block94: {
                                                block93: {
                                                    block109: {
                                                        block110: {
                                                            block107: {
                                                                block108: {
                                                                    block105: {
                                                                        block106: {
                                                                            block103: {
                                                                                block104: {
                                                                                    block101: {
                                                                                        block102: {
                                                                                            block99: {
                                                                                                block100: {
                                                                                                    block97: {
                                                                                                        block98: {
                                                                                                            block95: {
                                                                                                                block96: {
                                                                                                                    block121: {
                                                                                                                        block120: {
                                                                                                                            var2_1 = 0;
                                                                                                                            var1_2 = K.y();
                                                                                                                            while (var0.endsWith(K.a(-2058, -13246))) {
                                                                                                                                ++var2_1;
                                                                                                                                var0 = var0.substring(0, var0.length() - 2);
                                                                                                                                try {
                                                                                                                                    if (var1_2 != null) {
                                                                                                                                        if (var1_2 != null) continue;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    break block93;
                                                                                                                                }
                                                                                                                                catch (ClassNotFoundException v0) {
                                                                                                                                    throw K.a(v0);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v1 = var2_1;
                                                                                                                            if (var1_2 == null) break block94;
                                                                                                                            if (v1 != 0) break block93;
                                                                                                                            break block120;
                                                                                                                            catch (ClassNotFoundException v2) {
                                                                                                                                throw K.a(v2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v1 = (int)K.a(-2077, 24476).equals(var0);
                                                                                                                        if (var1_2 == null) break block95;
                                                                                                                        break block121;
                                                                                                                        catch (ClassNotFoundException v3) {
                                                                                                                            throw K.a(v3);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        block122: {
                                                                                                                            if (v1 == 0) break block96;
                                                                                                                            break block122;
                                                                                                                            catch (ClassNotFoundException v4) {
                                                                                                                                throw K.a(v4);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        return Void.TYPE;
                                                                                                                    }
                                                                                                                    catch (ClassNotFoundException v5) {
                                                                                                                        throw K.a(v5);
                                                                                                                    }
                                                                                                                }
                                                                                                                v1 = (int)K.a(-2051, -29243).equals(var0);
                                                                                                            }
                                                                                                            if (var1_2 == null) break block97;
                                                                                                            try {
                                                                                                                block123: {
                                                                                                                    if (v1 == 0) break block98;
                                                                                                                    break block123;
                                                                                                                    catch (ClassNotFoundException v6) {
                                                                                                                        throw K.a(v6);
                                                                                                                    }
                                                                                                                }
                                                                                                                return Boolean.TYPE;
                                                                                                            }
                                                                                                            catch (ClassNotFoundException v7) {
                                                                                                                throw K.a(v7);
                                                                                                            }
                                                                                                        }
                                                                                                        v1 = (int)K.a(-2056, 44).equals(var0);
                                                                                                    }
                                                                                                    if (var1_2 == null) break block99;
                                                                                                    try {
                                                                                                        block124: {
                                                                                                            if (v1 == 0) break block100;
                                                                                                            break block124;
                                                                                                            catch (ClassNotFoundException v8) {
                                                                                                                throw K.a(v8);
                                                                                                            }
                                                                                                        }
                                                                                                        return Character.TYPE;
                                                                                                    }
                                                                                                    catch (ClassNotFoundException v9) {
                                                                                                        throw K.a(v9);
                                                                                                    }
                                                                                                }
                                                                                                v1 = (int)K.a(-2060, 32767).equals(var0);
                                                                                            }
                                                                                            if (var1_2 == null) break block101;
                                                                                            try {
                                                                                                block125: {
                                                                                                    if (v1 == 0) break block102;
                                                                                                    break block125;
                                                                                                    catch (ClassNotFoundException v10) {
                                                                                                        throw K.a(v10);
                                                                                                    }
                                                                                                }
                                                                                                return Byte.TYPE;
                                                                                            }
                                                                                            catch (ClassNotFoundException v11) {
                                                                                                throw K.a(v11);
                                                                                            }
                                                                                        }
                                                                                        v1 = (int)K.a(-2052, -21032).equals(var0);
                                                                                    }
                                                                                    if (var1_2 == null) break block103;
                                                                                    try {
                                                                                        block126: {
                                                                                            if (v1 == 0) break block104;
                                                                                            break block126;
                                                                                            catch (ClassNotFoundException v12) {
                                                                                                throw K.a(v12);
                                                                                            }
                                                                                        }
                                                                                        return Short.TYPE;
                                                                                    }
                                                                                    catch (ClassNotFoundException v13) {
                                                                                        throw K.a(v13);
                                                                                    }
                                                                                }
                                                                                v1 = (int)K.a(-2061, 2532).equals(var0);
                                                                            }
                                                                            if (var1_2 == null) break block105;
                                                                            try {
                                                                                block127: {
                                                                                    if (v1 == 0) break block106;
                                                                                    break block127;
                                                                                    catch (ClassNotFoundException v14) {
                                                                                        throw K.a(v14);
                                                                                    }
                                                                                }
                                                                                return Integer.TYPE;
                                                                            }
                                                                            catch (ClassNotFoundException v15) {
                                                                                throw K.a(v15);
                                                                            }
                                                                        }
                                                                        v1 = (int)K.a(-2053, -25283).equals(var0);
                                                                    }
                                                                    if (var1_2 == null) break block107;
                                                                    try {
                                                                        block128: {
                                                                            if (v1 == 0) break block108;
                                                                            break block128;
                                                                            catch (ClassNotFoundException v16) {
                                                                                throw K.a(v16);
                                                                            }
                                                                        }
                                                                        return Long.TYPE;
                                                                    }
                                                                    catch (ClassNotFoundException v17) {
                                                                        throw K.a(v17);
                                                                    }
                                                                }
                                                                v1 = (int)K.a(-2059, -25669).equals(var0);
                                                            }
                                                            if (var1_2 == null) break block109;
                                                            try {
                                                                block129: {
                                                                    if (v1 == 0) break block110;
                                                                    break block129;
                                                                    catch (ClassNotFoundException v18) {
                                                                        throw K.a(v18);
                                                                    }
                                                                }
                                                                return Float.TYPE;
                                                            }
                                                            catch (ClassNotFoundException v19) {
                                                                throw K.a(v19);
                                                            }
                                                        }
                                                        v1 = (int)K.a(-2055, -1184).equals(var0);
                                                    }
                                                    if (var1_2 == null) break block94;
                                                    try {
                                                        block130: {
                                                            if (v1 == 0) break block93;
                                                            break block130;
                                                            catch (ClassNotFoundException v20) {
                                                                throw K.a(v20);
                                                            }
                                                        }
                                                        return Double.TYPE;
                                                    }
                                                    catch (ClassNotFoundException v21) {
                                                        throw K.a(v21);
                                                    }
                                                }
                                                v1 = (int)K.a(-2054, -27008).equals(var0);
                                            }
                                            try {
                                                if (var1_2 == null) break block111;
                                                if (v1 != 0) {
                                                }
                                                ** GOTO lbl163
                                            }
                                            catch (ClassNotFoundException v22) {
                                                throw K.a(v22);
                                            }
                                            var0 = "V";
                                            try {
                                                if (var1_2 != null) break block112;
lbl163:
                                                // 2 sources

                                                v1 = (int)K.a(-2049, -28867).equals(var0);
                                            }
                                            catch (ClassNotFoundException v23) {
                                                throw K.a(v23);
                                            }
                                        }
                                        try {
                                            if (var1_2 == null) break block113;
                                            if (v1 != 0) {
                                            }
                                            ** GOTO lbl178
                                        }
                                        catch (ClassNotFoundException v24) {
                                            throw K.a(v24);
                                        }
                                        var0 = "Z";
                                        try {
                                            if (var1_2 != null) break block112;
lbl178:
                                            // 2 sources

                                            v1 = (int)K.a(-2080, -901).equals(var0);
                                        }
                                        catch (ClassNotFoundException v25) {
                                            throw K.a(v25);
                                        }
                                    }
                                    try {
                                        if (var1_2 == null) break block114;
                                        if (v1 != 0) {
                                        }
                                        ** GOTO lbl193
                                    }
                                    catch (ClassNotFoundException v26) {
                                        throw K.a(v26);
                                    }
                                    var0 = "C";
                                    try {
                                        if (var1_2 != null) break block112;
lbl193:
                                        // 2 sources

                                        v1 = (int)K.a(-2062, 30798).equals(var0);
                                    }
                                    catch (ClassNotFoundException v27) {
                                        throw K.a(v27);
                                    }
                                }
                                try {
                                    if (var1_2 == null) break block115;
                                    if (v1 != 0) {
                                    }
                                    ** GOTO lbl208
                                }
                                catch (ClassNotFoundException v28) {
                                    throw K.a(v28);
                                }
                                var0 = "B";
                                try {
                                    if (var1_2 != null) break block112;
lbl208:
                                    // 2 sources

                                    v1 = (int)K.a(-2079, 29133).equals(var0);
                                }
                                catch (ClassNotFoundException v29) {
                                    throw K.a(v29);
                                }
                            }
                            try {
                                if (var1_2 == null) break block116;
                                if (v1 != 0) {
                                }
                                ** GOTO lbl223
                            }
                            catch (ClassNotFoundException v30) {
                                throw K.a(v30);
                            }
                            var0 = "S";
                            try {
                                if (var1_2 != null) break block112;
lbl223:
                                // 2 sources

                                v1 = (int)K.a(-2063, -6426).equals(var0);
                            }
                            catch (ClassNotFoundException v31) {
                                throw K.a(v31);
                            }
                        }
                        try {
                            if (var1_2 == null) break block117;
                            if (v1 != 0) {
                            }
                            ** GOTO lbl238
                        }
                        catch (ClassNotFoundException v32) {
                            throw K.a(v32);
                        }
                        var0 = "I";
                        try {
                            if (var1_2 != null) break block112;
lbl238:
                            // 2 sources

                            v1 = (int)K.a(-2050, 31854).equals(var0);
                        }
                        catch (ClassNotFoundException v33) {
                            throw K.a(v33);
                        }
                    }
                    try {
                        if (var1_2 == null) break block118;
                        if (v1 != 0) {
                        }
                        ** GOTO lbl253
                    }
                    catch (ClassNotFoundException v34) {
                        throw K.a(v34);
                    }
                    var0 = "J";
                    try {
                        if (var1_2 != null) break block112;
lbl253:
                        // 2 sources

                        v1 = (int)K.a(-2057, -26024).equals(var0);
                    }
                    catch (ClassNotFoundException v35) {
                        throw K.a(v35);
                    }
                }
                try {
                    if (var1_2 == null) break block119;
                    if (v1 != 0) {
                    }
                    ** GOTO lbl268
                }
                catch (ClassNotFoundException v36) {
                    throw K.a(v36);
                }
                var0 = "F";
                try {
                    if (var1_2 != null) break block112;
lbl268:
                    // 2 sources

                    v1 = (int)K.a(-2064, 16408).equals(var0);
                }
                catch (ClassNotFoundException v37) {
                    throw K.a(v37);
                }
            }
            try {
                if (var1_2 != null) {
                    if (v1 == 0) break block112;
                }
                ** GOTO lbl284
            }
            catch (ClassNotFoundException v38) {
                throw K.a(v38);
            }
            var0 = "D";
        }
        do {
            v1 = --var2_1;
lbl284:
            // 2 sources

            try {
                if (v1 < 0) break;
                v39 = (char)K.e + var0;
                if (var1_2 != null) {
                }
                ** GOTO lbl296
            }
            catch (ClassNotFoundException v40) {
                throw K.a(v40);
            }
            var0 = v39;
        } while (var1_2 != null);
        try {
            v39 = var0;
lbl296:
            // 2 sources

            return Class.forName(v39);
        }
        catch (ClassNotFoundException var3_3) {
            var3_3.printStackTrace();
            System.exit(1);
            throw new RuntimeException();
        }
    }

    public static Class[] b(String string) {
        int n10;
        ArrayList arrayList;
        block4: {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            String[] stringArray = K.y();
            arrayList = new ArrayList();
            while (stringTokenizer.hasMoreTokens()) {
                try {
                    n10 = arrayList.add(K.c(stringTokenizer.nextToken())) ? 1 : 0;
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw K.a(runtimeException);
                }
            }
            n10 = arrayList.size();
        }
        Class[] classArray = new Class[n10];
        arrayList.toArray(classArray);
        return classArray;
    }

    public static void c(String[] stringArray) {
        O = stringArray;
    }

    public static String[] y() {
        return O;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[19];
                    var5_1 = 0;
                    var4_2 = "\u0095\u00e8\u00dc\u0006\u00990\u00f0\u00d4\u0093\u00a9\u0003\u00f9\u00e1Q\u0004O\u0018\u00ed\u0002\u0005h8\u0096\u00b5\u001e\u0004\u009f~\u00f7\u00ce\u0005\u000b\u00a5\u00fa\u0006\u0093\u0002\u00afe\u0006\u001f\u00c3 \u00aa\u0089f\u0004\u008e\u0093\u00e1W\u0004*\u00f3\u0094\u00a9\u0004\u00ad8:\u00d3\u0007 \u001f\u001b?\u00be\u001f\b\u0005\u00c6\\\u00f4\u00aeR\u0007\u00d8\u00dd\u0004g]\u0014t\u0004\u0096\u00d1\u0003\u00ed\u0005\u00f1t\u0012\u00ab\u008e";
                    var6_3 = "\u0095\u00e8\u00dc\u0006\u00990\u00f0\u00d4\u0093\u00a9\u0003\u00f9\u00e1Q\u0004O\u0018\u00ed\u0002\u0005h8\u0096\u00b5\u001e\u0004\u009f~\u00f7\u00ce\u0005\u000b\u00a5\u00fa\u0006\u0093\u0002\u00afe\u0006\u001f\u00c3 \u00aa\u0089f\u0004\u008e\u0093\u00e1W\u0004*\u00f3\u0094\u00a9\u0004\u00ad8:\u00d3\u0007 \u001f\u001b?\u00be\u001f\b\u0005\u00c6\\\u00f4\u00aeR\u0007\u00d8\u00dd\u0004g]\u0014t\u0004\u0096\u00d1\u0003\u00ed\u0005\u00f1t\u0012\u00ab\u008e".length();
                    var3_4 = 3;
                    K.c(new String[3]);
                    var2_5 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        v0 = 71;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "^\u00ac\u00ea\u00a1\u0004\u00af\tk\u00e4";
                        var6_3 = "^\u00ac\u00ea\u00a1\u0004\u00af\tk\u00e4".length();
                        var3_4 = 4;
                        var2_5 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v0 = 29;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl86
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 101;
                                break;
                            }
                            case 1: {
                                v15 = 31;
                                break;
                            }
                            case 2: {
                                v15 = 93;
                                break;
                            }
                            case 3: {
                                v15 = 126;
                                break;
                            }
                            case 4: {
                                v15 = 62;
                                break;
                            }
                            case 5: {
                                v15 = 24;
                                break;
                            }
                            default: {
                                v15 = 16;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
                        v8 = v11;
                        if (v11 != 0) break;
                        v11 = v8;
                        v9 = v9;
                        v14 = v8;
                        v12 = v9;
                        v13 = v8;
                    }
lbl86:
                    // 2 sources

                    v16 = v9;
                    v10 = v10;
                } while (v10 > var8_6);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl96:
                    // 1 sources

                    ** continue;
                }
            }
            K.b = var7;
            K.c = new String[19];
            break block22;
lbl101:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 5807032420183251998L;
        ** while (true)
        K.e = 2397698727922048069L ^ var0_7;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF7F1) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 3;
                    break;
                }
                case 1: {
                    n14 = 187;
                    break;
                }
                case 2: {
                    n14 = 101;
                    break;
                }
                case 3: {
                    n14 = 255;
                    break;
                }
                case 4: {
                    n14 = 15;
                    break;
                }
                case 5: {
                    n14 = 195;
                    break;
                }
                case 6: {
                    n14 = 173;
                    break;
                }
                case 7: {
                    n14 = 73;
                    break;
                }
                case 8: {
                    n14 = 217;
                    break;
                }
                case 9: {
                    n14 = 137;
                    break;
                }
                case 10: {
                    n14 = 216;
                    break;
                }
                case 11: {
                    n14 = 177;
                    break;
                }
                case 12: {
                    n14 = 155;
                    break;
                }
                case 13: {
                    n14 = 124;
                    break;
                }
                case 14: {
                    n14 = 131;
                    break;
                }
                case 15: {
                    n14 = 246;
                    break;
                }
                case 16: {
                    n14 = 230;
                    break;
                }
                case 17: {
                    n14 = 239;
                    break;
                }
                case 18: {
                    n14 = 13;
                    break;
                }
                case 19: {
                    n14 = 129;
                    break;
                }
                case 20: {
                    n14 = 25;
                    break;
                }
                case 21: {
                    n14 = 42;
                    break;
                }
                case 22: {
                    n14 = 103;
                    break;
                }
                case 23: {
                    n14 = 70;
                    break;
                }
                case 24: {
                    n14 = 24;
                    break;
                }
                case 25: {
                    n14 = 204;
                    break;
                }
                case 26: {
                    n14 = 132;
                    break;
                }
                case 27: {
                    n14 = 44;
                    break;
                }
                case 28: {
                    n14 = 206;
                    break;
                }
                case 29: {
                    n14 = 224;
                    break;
                }
                case 30: {
                    n14 = 22;
                    break;
                }
                case 31: {
                    n14 = 250;
                    break;
                }
                case 32: {
                    n14 = 253;
                    break;
                }
                case 33: {
                    n14 = 144;
                    break;
                }
                case 34: {
                    n14 = 179;
                    break;
                }
                case 35: {
                    n14 = 83;
                    break;
                }
                case 36: {
                    n14 = 105;
                    break;
                }
                case 37: {
                    n14 = 43;
                    break;
                }
                case 38: {
                    n14 = 54;
                    break;
                }
                case 39: {
                    n14 = 90;
                    break;
                }
                case 40: {
                    n14 = 38;
                    break;
                }
                case 41: {
                    n14 = 9;
                    break;
                }
                case 42: {
                    n14 = 77;
                    break;
                }
                case 43: {
                    n14 = 201;
                    break;
                }
                case 44: {
                    n14 = 178;
                    break;
                }
                case 45: {
                    n14 = 142;
                    break;
                }
                case 46: {
                    n14 = 219;
                    break;
                }
                case 47: {
                    n14 = 183;
                    break;
                }
                case 48: {
                    n14 = 115;
                    break;
                }
                case 49: {
                    n14 = 182;
                    break;
                }
                case 50: {
                    n14 = 223;
                    break;
                }
                case 51: {
                    n14 = 117;
                    break;
                }
                case 52: {
                    n14 = 154;
                    break;
                }
                case 53: {
                    n14 = 28;
                    break;
                }
                case 54: {
                    n14 = 220;
                    break;
                }
                case 55: {
                    n14 = 227;
                    break;
                }
                case 56: {
                    n14 = 199;
                    break;
                }
                case 57: {
                    n14 = 85;
                    break;
                }
                case 58: {
                    n14 = 71;
                    break;
                }
                case 59: {
                    n14 = 76;
                    break;
                }
                case 60: {
                    n14 = 120;
                    break;
                }
                case 61: {
                    n14 = 7;
                    break;
                }
                case 62: {
                    n14 = 20;
                    break;
                }
                case 63: {
                    n14 = 12;
                    break;
                }
                case 64: {
                    n14 = 159;
                    break;
                }
                case 65: {
                    n14 = 167;
                    break;
                }
                case 66: {
                    n14 = 189;
                    break;
                }
                case 67: {
                    n14 = 113;
                    break;
                }
                case 68: {
                    n14 = 245;
                    break;
                }
                case 69: {
                    n14 = 2;
                    break;
                }
                case 70: {
                    n14 = 192;
                    break;
                }
                case 71: {
                    n14 = 136;
                    break;
                }
                case 72: {
                    n14 = 148;
                    break;
                }
                case 73: {
                    n14 = 80;
                    break;
                }
                case 74: {
                    n14 = 143;
                    break;
                }
                case 75: {
                    n14 = 125;
                    break;
                }
                case 76: {
                    n14 = 23;
                    break;
                }
                case 77: {
                    n14 = 184;
                    break;
                }
                case 78: {
                    n14 = 160;
                    break;
                }
                case 79: {
                    n14 = 33;
                    break;
                }
                case 80: {
                    n14 = 237;
                    break;
                }
                case 81: {
                    n14 = 87;
                    break;
                }
                case 82: {
                    n14 = 98;
                    break;
                }
                case 83: {
                    n14 = 58;
                    break;
                }
                case 84: {
                    n14 = 61;
                    break;
                }
                case 85: {
                    n14 = 164;
                    break;
                }
                case 86: {
                    n14 = 153;
                    break;
                }
                case 87: {
                    n14 = 157;
                    break;
                }
                case 88: {
                    n14 = 200;
                    break;
                }
                case 89: {
                    n14 = 215;
                    break;
                }
                case 90: {
                    n14 = 111;
                    break;
                }
                case 91: {
                    n14 = 242;
                    break;
                }
                case 92: {
                    n14 = 56;
                    break;
                }
                case 93: {
                    n14 = 96;
                    break;
                }
                case 94: {
                    n14 = 35;
                    break;
                }
                case 95: {
                    n14 = 209;
                    break;
                }
                case 96: {
                    n14 = 162;
                    break;
                }
                case 97: {
                    n14 = 19;
                    break;
                }
                case 98: {
                    n14 = 31;
                    break;
                }
                case 99: {
                    n14 = 161;
                    break;
                }
                case 100: {
                    n14 = 36;
                    break;
                }
                case 101: {
                    n14 = 207;
                    break;
                }
                case 102: {
                    n14 = 46;
                    break;
                }
                case 103: {
                    n14 = 158;
                    break;
                }
                case 104: {
                    n14 = 109;
                    break;
                }
                case 105: {
                    n14 = 248;
                    break;
                }
                case 106: {
                    n14 = 16;
                    break;
                }
                case 107: {
                    n14 = 188;
                    break;
                }
                case 108: {
                    n14 = 86;
                    break;
                }
                case 109: {
                    n14 = 63;
                    break;
                }
                case 110: {
                    n14 = 140;
                    break;
                }
                case 111: {
                    n14 = 49;
                    break;
                }
                case 112: {
                    n14 = 82;
                    break;
                }
                case 113: {
                    n14 = 213;
                    break;
                }
                case 114: {
                    n14 = 114;
                    break;
                }
                case 115: {
                    n14 = 231;
                    break;
                }
                case 116: {
                    n14 = 110;
                    break;
                }
                case 117: {
                    n14 = 6;
                    break;
                }
                case 118: {
                    n14 = 156;
                    break;
                }
                case 119: {
                    n14 = 170;
                    break;
                }
                case 120: {
                    n14 = 60;
                    break;
                }
                case 121: {
                    n14 = 99;
                    break;
                }
                case 122: {
                    n14 = 163;
                    break;
                }
                case 123: {
                    n14 = 97;
                    break;
                }
                case 124: {
                    n14 = 11;
                    break;
                }
                case 125: {
                    n14 = 221;
                    break;
                }
                case 126: {
                    n14 = 5;
                    break;
                }
                case 127: {
                    n14 = 118;
                    break;
                }
                case 128: {
                    n14 = 72;
                    break;
                }
                case 129: {
                    n14 = 174;
                    break;
                }
                case 130: {
                    n14 = 225;
                    break;
                }
                case 131: {
                    n14 = 252;
                    break;
                }
                case 132: {
                    n14 = 91;
                    break;
                }
                case 133: {
                    n14 = 100;
                    break;
                }
                case 134: {
                    n14 = 241;
                    break;
                }
                case 135: {
                    n14 = 222;
                    break;
                }
                case 136: {
                    n14 = 141;
                    break;
                }
                case 137: {
                    n14 = 37;
                    break;
                }
                case 138: {
                    n14 = 208;
                    break;
                }
                case 139: {
                    n14 = 130;
                    break;
                }
                case 140: {
                    n14 = 232;
                    break;
                }
                case 141: {
                    n14 = 108;
                    break;
                }
                case 142: {
                    n14 = 79;
                    break;
                }
                case 143: {
                    n14 = 135;
                    break;
                }
                case 144: {
                    n14 = 145;
                    break;
                }
                case 145: {
                    n14 = 68;
                    break;
                }
                case 146: {
                    n14 = 234;
                    break;
                }
                case 147: {
                    n14 = 75;
                    break;
                }
                case 148: {
                    n14 = 149;
                    break;
                }
                case 149: {
                    n14 = 198;
                    break;
                }
                case 150: {
                    n14 = 106;
                    break;
                }
                case 151: {
                    n14 = 30;
                    break;
                }
                case 152: {
                    n14 = 51;
                    break;
                }
                case 153: {
                    n14 = 107;
                    break;
                }
                case 154: {
                    n14 = 190;
                    break;
                }
                case 155: {
                    n14 = 81;
                    break;
                }
                case 156: {
                    n14 = 202;
                    break;
                }
                case 157: {
                    n14 = 226;
                    break;
                }
                case 158: {
                    n14 = 59;
                    break;
                }
                case 159: {
                    n14 = 94;
                    break;
                }
                case 160: {
                    n14 = 40;
                    break;
                }
                case 161: {
                    n14 = 123;
                    break;
                }
                case 162: {
                    n14 = 34;
                    break;
                }
                case 163: {
                    n14 = 52;
                    break;
                }
                case 164: {
                    n14 = 191;
                    break;
                }
                case 165: {
                    n14 = 21;
                    break;
                }
                case 166: {
                    n14 = 92;
                    break;
                }
                case 167: {
                    n14 = 122;
                    break;
                }
                case 168: {
                    n14 = 233;
                    break;
                }
                case 169: {
                    n14 = 169;
                    break;
                }
                case 170: {
                    n14 = 203;
                    break;
                }
                case 171: {
                    n14 = 180;
                    break;
                }
                case 172: {
                    n14 = 93;
                    break;
                }
                case 173: {
                    n14 = 243;
                    break;
                }
                case 174: {
                    n14 = 29;
                    break;
                }
                case 175: {
                    n14 = 254;
                    break;
                }
                case 176: {
                    n14 = 17;
                    break;
                }
                case 177: {
                    n14 = 139;
                    break;
                }
                case 178: {
                    n14 = 102;
                    break;
                }
                case 179: {
                    n14 = 39;
                    break;
                }
                case 180: {
                    n14 = 150;
                    break;
                }
                case 181: {
                    n14 = 235;
                    break;
                }
                case 182: {
                    n14 = 212;
                    break;
                }
                case 183: {
                    n14 = 8;
                    break;
                }
                case 184: {
                    n14 = 116;
                    break;
                }
                case 185: {
                    n14 = 1;
                    break;
                }
                case 186: {
                    n14 = 55;
                    break;
                }
                case 187: {
                    n14 = 57;
                    break;
                }
                case 188: {
                    n14 = 4;
                    break;
                }
                case 189: {
                    n14 = 32;
                    break;
                }
                case 190: {
                    n14 = 84;
                    break;
                }
                case 191: {
                    n14 = 197;
                    break;
                }
                case 192: {
                    n14 = 210;
                    break;
                }
                case 193: {
                    n14 = 67;
                    break;
                }
                case 194: {
                    n14 = 95;
                    break;
                }
                case 195: {
                    n14 = 166;
                    break;
                }
                case 196: {
                    n14 = 218;
                    break;
                }
                case 197: {
                    n14 = 193;
                    break;
                }
                case 198: {
                    n14 = 186;
                    break;
                }
                case 199: {
                    n14 = 138;
                    break;
                }
                case 200: {
                    n14 = 168;
                    break;
                }
                case 201: {
                    n14 = 171;
                    break;
                }
                case 202: {
                    n14 = 62;
                    break;
                }
                case 203: {
                    n14 = 112;
                    break;
                }
                case 204: {
                    n14 = 126;
                    break;
                }
                case 205: {
                    n14 = 88;
                    break;
                }
                case 206: {
                    n14 = 146;
                    break;
                }
                case 207: {
                    n14 = 78;
                    break;
                }
                case 208: {
                    n14 = 64;
                    break;
                }
                case 209: {
                    n14 = 10;
                    break;
                }
                case 210: {
                    n14 = 14;
                    break;
                }
                case 211: {
                    n14 = 45;
                    break;
                }
                case 212: {
                    n14 = 26;
                    break;
                }
                case 213: {
                    n14 = 205;
                    break;
                }
                case 214: {
                    n14 = 104;
                    break;
                }
                case 215: {
                    n14 = 251;
                    break;
                }
                case 216: {
                    n14 = 151;
                    break;
                }
                case 217: {
                    n14 = 244;
                    break;
                }
                case 218: {
                    n14 = 247;
                    break;
                }
                case 219: {
                    n14 = 50;
                    break;
                }
                case 220: {
                    n14 = 196;
                    break;
                }
                case 221: {
                    n14 = 211;
                    break;
                }
                case 222: {
                    n14 = 134;
                    break;
                }
                case 223: {
                    n14 = 74;
                    break;
                }
                case 224: {
                    n14 = 249;
                    break;
                }
                case 225: {
                    n14 = 238;
                    break;
                }
                case 226: {
                    n14 = 119;
                    break;
                }
                case 227: {
                    n14 = 176;
                    break;
                }
                case 228: {
                    n14 = 65;
                    break;
                }
                case 229: {
                    n14 = 53;
                    break;
                }
                case 230: {
                    n14 = 240;
                    break;
                }
                case 231: {
                    n14 = 194;
                    break;
                }
                case 232: {
                    n14 = 152;
                    break;
                }
                case 233: {
                    n14 = 175;
                    break;
                }
                case 234: {
                    n14 = 214;
                    break;
                }
                case 235: {
                    n14 = 229;
                    break;
                }
                case 236: {
                    n14 = 185;
                    break;
                }
                case 237: {
                    n14 = 172;
                    break;
                }
                case 238: {
                    n14 = 18;
                    break;
                }
                case 239: {
                    n14 = 69;
                    break;
                }
                case 240: {
                    n14 = 228;
                    break;
                }
                case 241: {
                    n14 = 133;
                    break;
                }
                case 242: {
                    n14 = 47;
                    break;
                }
                case 243: {
                    n14 = 89;
                    break;
                }
                case 244: {
                    n14 = 128;
                    break;
                }
                case 245: {
                    n14 = 41;
                    break;
                }
                case 246: {
                    n14 = 181;
                    break;
                }
                case 247: {
                    n14 = 27;
                    break;
                }
                case 248: {
                    n14 = 236;
                    break;
                }
                case 249: {
                    n14 = 66;
                    break;
                }
                case 250: {
                    n14 = 165;
                    break;
                }
                case 251: {
                    n14 = 0;
                    break;
                }
                case 252: {
                    n14 = 48;
                    break;
                }
                case 253: {
                    n14 = 147;
                    break;
                }
                case 254: {
                    n14 = 121;
                    break;
                }
                default: {
                    n14 = 127;
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
            K.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

