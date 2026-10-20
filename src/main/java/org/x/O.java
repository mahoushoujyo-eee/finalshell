/*
 * Decompiled with CFR 0.152.
 */
package org.x;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.x.V;
import org.x.i;
import org.x.l;

public final class O {
    private static String J;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    private O() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static void main(String[] stringArray) throws Exception {
        block42: {
            String string;
            String string2;
            block41: {
                String[] stringArray2;
                block39: {
                    block40: {
                        string2 = O.f();
                        stringArray2 = stringArray;
                        if (string2 == null) break block39;
                        try {
                            block50: {
                                if (stringArray2.length != 0) break block40;
                                break block50;
                                catch (IOException iOException) {
                                    throw O.a(iOException);
                                }
                            }
                            string = O.a(-6596, 9015);
                            break block41;
                        }
                        catch (IOException iOException) {
                            throw O.a(iOException);
                        }
                    }
                    stringArray2 = stringArray;
                }
                string = stringArray2[0];
            }
            String string3 = string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(string3));
            try {
                HashMap<Integer, String[]> hashMap = new HashMap<Integer, String[]>();
                ArrayList<V> arrayList = new ArrayList<V>();
                ArrayList<i> arrayList2 = new ArrayList<i>();
                String string4 = bufferedReader.readLine();
                block33: while (true) {
                    block47: {
                        String string5;
                        block48: {
                            StringTokenizer stringTokenizer;
                            boolean bl;
                            block45: {
                                block46: {
                                    block54: {
                                        block43: {
                                            block44: {
                                                block52: {
                                                    block51: {
                                                        if (string4 == null) break;
                                                        if (string2 == null) break block42;
                                                        break block51;
                                                        catch (IOException iOException) {
                                                            throw O.a(iOException);
                                                        }
                                                    }
                                                    bl = string4.startsWith(O.a(-6607, 25275));
                                                    if (string2 == null) break block43;
                                                    break block52;
                                                    catch (IOException iOException) {
                                                        throw O.a(iOException);
                                                    }
                                                }
                                                try {
                                                    block53: {
                                                        if (!bl) break block44;
                                                        break block53;
                                                        catch (IOException iOException) {
                                                            throw O.a(iOException);
                                                        }
                                                    }
                                                    bufferedReader.readLine();
                                                    bufferedReader.readLine();
                                                }
                                                catch (IOException iOException) {
                                                    throw O.a(iOException);
                                                }
                                                do {
                                                    if ((string4 = bufferedReader.readLine()).startsWith(O.a(-6599, -13292))) continue block33;
                                                    stringTokenizer = new StringTokenizer(string4);
                                                    stringTokenizer.nextToken();
                                                    stringTokenizer.nextToken();
                                                    stringTokenizer.nextToken();
                                                    stringTokenizer.nextToken();
                                                    stringTokenizer.nextToken();
                                                    arrayList.add(new V(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), stringTokenizer.nextToken()));
                                                } while (string2 != null);
                                            }
                                            bl = string4.startsWith(O.a(-6606, 12423));
                                        }
                                        if (string2 == null) break block45;
                                        if (!bl) break block46;
                                        break block54;
                                        catch (IOException iOException) {
                                            throw O.a(iOException);
                                        }
                                    }
                                    try {
                                        block55: {
                                            bl = string4.endsWith(":");
                                            if (string2 == null) break block45;
                                            break block55;
                                            catch (IOException iOException) {
                                                throw O.a(iOException);
                                            }
                                        }
                                        if (!bl) break block46;
                                    }
                                    catch (IOException iOException) {
                                        throw O.a(iOException);
                                    }
                                    int n10 = Integer.parseInt(string4.substring(O.a(18820, 1918085704644726924L), string4.length() - 1));
                                    ArrayList<String> arrayList3 = new ArrayList<String>();
                                    while ((string4 = bufferedReader.readLine()).startsWith("\t")) {
                                        arrayList3.add(string4.substring(1));
                                        if (string2 != null) continue;
                                    }
                                    hashMap.put(new Integer(n10), arrayList3.toArray(new String[arrayList3.size()]));
                                    if (string2 != null) continue;
                                }
                                try {
                                    string5 = string4;
                                    if (string2 == null) break block47;
                                    bl = string5.startsWith(O.a(-6603, -8520));
                                }
                                catch (IOException iOException) {
                                    throw O.a(iOException);
                                }
                            }
                            try {
                                if (!bl) break block48;
                                bufferedReader.readLine();
                            }
                            catch (IOException iOException) {
                                throw O.a(iOException);
                            }
                            while (true) {
                                int n11;
                                int n12;
                                block49: {
                                    string4 = bufferedReader.readLine();
                                    try {
                                        if (string4.startsWith(O.a(-6600, -23155))) {
                                            continue block33;
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw O.a(iOException);
                                    }
                                    stringTokenizer = new StringTokenizer(string4);
                                    stringTokenizer.nextToken();
                                    stringTokenizer.nextToken();
                                    stringTokenizer.nextToken();
                                    n12 = Integer.parseInt(stringTokenizer.nextToken());
                                    try {
                                        n11 = n12;
                                        if (string2 == null) break block49;
                                        if (n11 == 0) {
                                            continue;
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw O.a(iOException);
                                    }
                                    n11 = Integer.parseInt(stringTokenizer.nextToken());
                                }
                                int n13 = n11;
                                arrayList2.add(new i(n12, n13));
                                if (string2 == null) break;
                            }
                        }
                        string5 = string4 = bufferedReader.readLine();
                    }
                    if (string2 == null) break;
                }
                O.W(arrayList.toArray(new V[arrayList.size()]), hashMap);
                O.a(arrayList2.toArray(new i[arrayList2.size()]), hashMap);
            }
            finally {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    private static void W(V[] vArray, Map map) {
        String string;
        int n10;
        block8: {
            String string2 = O.f();
            Arrays.sort(vArray, new l());
            n10 = 0;
            string = string2;
            int n11 = 0;
            for (V v2 : vArray) {
                n10 += v2.F;
                n11 += v2.J;
                if (string != null) {
                    if (string != null) continue;
                }
                break block8;
            }
            System.out.println(O.a(-6595, -31006));
            System.out.println(O.a(-6597, -16228));
            System.out.println(O.a(-6608, 12781) + n10 + O.a(-6623, 12165) + n11);
        }
        double d2 = 0.0;
        MessageFormat messageFormat = new MessageFormat(O.a(-6593, -14477));
        int n12 = 0;
        while (n12 < vArray.length) {
            V v3 = vArray[n12];
            double d3 = 100.0 * ((double)v3.F / (double)n10);
            Object[] objectArray = new Object[O.a(24585, 8128070144929773824L)];
            objectArray[0] = new Integer(n12 + 1);
            objectArray[1] = new Double(d3);
            objectArray[2] = new Double(d2 += d3);
            objectArray[3] = new Integer(v3.F);
            objectArray[4] = new Integer(v3.J);
            objectArray[5] = v3.Z;
            System.out.println(messageFormat.format(objectArray, new StringBuffer(), new FieldPosition(0)));
            String[] stringArray = (String[])map.get(new Integer(v3.d));
            if (string != null) {
                if (stringArray != null) {
                    for (String string3 : stringArray) {
                        System.out.println(O.a(-6605, -12986) + string3);
                        if (string != null) {
                            if (string != null) continue;
                        }
                        break;
                    }
                } else {
                    ++n12;
                }
            }
            if (string != null) continue;
        }
    }

    private static void a(i[] iArray, Map map) {
        String string;
        int n10;
        block8: {
            n10 = 0;
            i[] iArray2 = iArray;
            int n11 = iArray2.length;
            string = O.f();
            for (int i2 = 0; i2 < n11; ++i2) {
                i i3 = iArray2[i2];
                n10 += i3.a;
                if (string != null) {
                    if (string != null) continue;
                }
                break block8;
            }
            System.out.println(O.a(-6601, 8924));
            System.out.println(O.a(-6598, 3776));
            System.out.println(O.a(-6604, 18072) + n10);
        }
        double d2 = 0.0;
        MessageFormat messageFormat = new MessageFormat(O.a(-6602, 1437));
        int n12 = 0;
        while (n12 < iArray.length) {
            i i4 = iArray[n12];
            double d3 = 100.0 * ((double)i4.a / (double)n10);
            System.out.println(messageFormat.format(new Object[]{new Integer(n12 + 1), new Double(d3), new Double(d2 += d3), new Integer(i4.a)}, new StringBuffer(), new FieldPosition(0)));
            String[] stringArray = (String[])map.get(new Integer(i4.Q));
            if (string != null) {
                if (stringArray != null) {
                    for (String string2 : stringArray) {
                        System.out.println(O.a(-6594, 21377) + string2);
                        if (string != null) {
                            if (string != null) continue;
                        }
                        break;
                    }
                } else {
                    ++n12;
                }
            }
            if (string != null) continue;
        }
    }

    public static void s(String string) {
        J = string;
    }

    public static String f() {
        return J;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[17];
                        var11_1 = 0;
                        var10_2 = "\u0010;\u00cd\u00f6\u00e8L\u009cO\u0016\u00ef\u0097\u0014\u00bb\u000e\u007f\u0096\u00a5\u00fa\u008f\u00a5=\u0012\u0017\u009a\u00b9\u00ad\u0094y4\u009f^\u00a8\u001bb\u00b1\u00ea\u0086\u0085\u008bN\u00d2\u0005\u00fc\u0010GY\u0016\u0088\u000e\u00b7q.u;\r\u00ab\u0007\u00c58\u00e3\u00063\u00c6[7\u009b\u00b2\u0011ru\u0092`\"6\u00caX9\u00b6\u0005\u00c7\u0084cz\u0000\f\u0014=\u00fa\u00af\b\u00bf)\u00cc\u00dfU]\u001as\u0018\u0090\u00a0\u00de\u00b2k\u008e6\u0011\u008c\u00807\u00a0>O9J\u00eb\u00ef\u009d`\u00e0\\\u00e2\"CIE,2iF\u00bc\u008b\u0095\u00e5\u00f5\u0004\u00fb\u00d9\u0083\u009a\u00f3\u00e7c5\u000b%\u001a\u00a2XE\u008b\u0012\u0087| +k\u00f2!Vy\u0014\u00b5,\u00b6\u0014\u0095\u0080&W|\u00af\u00c8\te\u00a2\u001d\u0012\u0085\nr\u00ddZ\u00d7F\u0083\u00cbo\u00d2\u00bc\u00fe%\u0005\u00fd\\\u001eE*\t\u001d5l7\u00dct\u001dC\u00c2\u000f\u00989\u00cf\u00e9\u0089\u0007\u00bf~\u0097r\u00d0_9{)2\u0010u\u00f2<\u0001\u00fe\u00de/R6Q\u00db\u00ff\u00c4\u001f~;\u0019@\u009c\u00f60\u0012\u00a0\u00b0\u0095\u0013{LN\u00166Xq\u00ba\u00cd\"g*\r]\u0013b8\u00d0\u008e\u00b5\u00cb\u0082\u00f6\u001d\u0082-\u00a07K\u009f\u0097\u0003{\u00b3tk[\u00d2\u008b\u00bc\u00a9A\u0012\u0097\u00bcQ[\u008c\u0098\u00066\u00d6\u00ce#\u00bf\u0011Q\u0092\u00f2\t\u00a0\u0082\u00d8\u00f6\u00fbC,8{\u00aep\u00e2\b\u0007\u00ffC3\u00ce\u00d6\u0001\u0081\u009f\u00df\u001a\u00d7u\u0083\u009b-\u000e\u00cdpJ\u0096\u0003\u00a8\u0001\u00a5\u00f9L'\u008b(\u0005bj\u00c7\u00d7\u0014\u00fa\u0013\u001c`\u0017KZ,\u0012y\u00e3\u00ac\u00c8\u0088\u00d0v\u0099\u00b55\u00ad\u00b75LP\u00b7\u00daR4\u00dd\u00ca\u00b3\u0004\u00a8\u001a\u00bbC\u00e6+\u00de\u00f1\u009c\u0086\u00d6\u0097&\u008eG`\u00ae*\u009d\u0087/\u00e4\u0089\u0091H1\u0016\u008d\u0093\u0015\u00c0xA\u00f3\u0089\u00b0\u00d8\u00b4n\u00d9\u000f@\u00f5d\u00b3\u00f5u\u00a1\u0005e\u0004\u001eZ\u009a\u00b7\u00f28\u00b7\u00a5\u0083\u00fa\u00e3";
                        var12_3 = "\u0010;\u00cd\u00f6\u00e8L\u009cO\u0016\u00ef\u0097\u0014\u00bb\u000e\u007f\u0096\u00a5\u00fa\u008f\u00a5=\u0012\u0017\u009a\u00b9\u00ad\u0094y4\u009f^\u00a8\u001bb\u00b1\u00ea\u0086\u0085\u008bN\u00d2\u0005\u00fc\u0010GY\u0016\u0088\u000e\u00b7q.u;\r\u00ab\u0007\u00c58\u00e3\u00063\u00c6[7\u009b\u00b2\u0011ru\u0092`\"6\u00caX9\u00b6\u0005\u00c7\u0084cz\u0000\f\u0014=\u00fa\u00af\b\u00bf)\u00cc\u00dfU]\u001as\u0018\u0090\u00a0\u00de\u00b2k\u008e6\u0011\u008c\u00807\u00a0>O9J\u00eb\u00ef\u009d`\u00e0\\\u00e2\"CIE,2iF\u00bc\u008b\u0095\u00e5\u00f5\u0004\u00fb\u00d9\u0083\u009a\u00f3\u00e7c5\u000b%\u001a\u00a2XE\u008b\u0012\u0087| +k\u00f2!Vy\u0014\u00b5,\u00b6\u0014\u0095\u0080&W|\u00af\u00c8\te\u00a2\u001d\u0012\u0085\nr\u00ddZ\u00d7F\u0083\u00cbo\u00d2\u00bc\u00fe%\u0005\u00fd\\\u001eE*\t\u001d5l7\u00dct\u001dC\u00c2\u000f\u00989\u00cf\u00e9\u0089\u0007\u00bf~\u0097r\u00d0_9{)2\u0010u\u00f2<\u0001\u00fe\u00de/R6Q\u00db\u00ff\u00c4\u001f~;\u0019@\u009c\u00f60\u0012\u00a0\u00b0\u0095\u0013{LN\u00166Xq\u00ba\u00cd\"g*\r]\u0013b8\u00d0\u008e\u00b5\u00cb\u0082\u00f6\u001d\u0082-\u00a07K\u009f\u0097\u0003{\u00b3tk[\u00d2\u008b\u00bc\u00a9A\u0012\u0097\u00bcQ[\u008c\u0098\u00066\u00d6\u00ce#\u00bf\u0011Q\u0092\u00f2\t\u00a0\u0082\u00d8\u00f6\u00fbC,8{\u00aep\u00e2\b\u0007\u00ffC3\u00ce\u00d6\u0001\u0081\u009f\u00df\u001a\u00d7u\u0083\u009b-\u000e\u00cdpJ\u0096\u0003\u00a8\u0001\u00a5\u00f9L'\u008b(\u0005bj\u00c7\u00d7\u0014\u00fa\u0013\u001c`\u0017KZ,\u0012y\u00e3\u00ac\u00c8\u0088\u00d0v\u0099\u00b55\u00ad\u00b75LP\u00b7\u00daR4\u00dd\u00ca\u00b3\u0004\u00a8\u001a\u00bbC\u00e6+\u00de\u00f1\u009c\u0086\u00d6\u0097&\u008eG`\u00ae*\u009d\u0087/\u00e4\u0089\u0091H1\u0016\u008d\u0093\u0015\u00c0xA\u00f3\u0089\u00b0\u00d8\u00b4n\u00d9\u000f@\u00f5d\u00b3\u00f5u\u00a1\u0005e\u0004\u001eZ\u009a\u00b7\u00f28\u00b7\u00a5\u0083\u00fa\u00e3".length();
                        var9_4 = 11;
                        var8_5 = -1;
                        O.s("aJLfC");
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 92;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00df\u00ab\u00fde\u00c7W\u00a6\u00e9\u00b8;\u0007\u001f\u001b\u00bd`\u00db\nk9\u0096y\u00d1C<x\u00ff\u00f4\u0002\u009e\u0002";
                            var12_3 = "\u00df\u00ab\u00fde\u00c7W\u00a6\u00e9\u00b8;\u0007\u001f\u001b\u00bd`\u00db\nk9\u0096y\u00d1C<x\u00ff\u00f4\u0002\u009e\u0002".length();
                            var9_4 = 27;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 120;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 113;
                                    break;
                                }
                                case 1: {
                                    v15 = 59;
                                    break;
                                }
                                case 2: {
                                    v15 = 91;
                                    break;
                                }
                                case 3: {
                                    v15 = 4;
                                    break;
                                }
                                case 4: {
                                    v15 = 96;
                                    break;
                                }
                                case 5: {
                                    v15 = 8;
                                    break;
                                }
                                default: {
                                    v15 = 33;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                O.a = var13;
                O.b = new String[17];
                var0_7 = 8308956590562522974L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u00a0\u000e|\u00ed\u0093a\u008eX\"\u007fz\u00e4 \u0084'\u00d4";
                var5_11 = "\u00a0\u000e|\u00ed\u0093a\u008eX\"\u007fz\u00e4 \u0084'\u00d4".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl108:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        O.c = var6_8;
        O.d = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE631) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 97;
                    break;
                }
                case 1: {
                    n14 = 94;
                    break;
                }
                case 2: {
                    n14 = 8;
                    break;
                }
                case 3: {
                    n14 = 245;
                    break;
                }
                case 4: {
                    n14 = 34;
                    break;
                }
                case 5: {
                    n14 = 148;
                    break;
                }
                case 6: {
                    n14 = 87;
                    break;
                }
                case 7: {
                    n14 = 213;
                    break;
                }
                case 8: {
                    n14 = 89;
                    break;
                }
                case 9: {
                    n14 = 46;
                    break;
                }
                case 10: {
                    n14 = 51;
                    break;
                }
                case 11: {
                    n14 = 92;
                    break;
                }
                case 12: {
                    n14 = 110;
                    break;
                }
                case 13: {
                    n14 = 90;
                    break;
                }
                case 14: {
                    n14 = 221;
                    break;
                }
                case 15: {
                    n14 = 253;
                    break;
                }
                case 16: {
                    n14 = 84;
                    break;
                }
                case 17: {
                    n14 = 204;
                    break;
                }
                case 18: {
                    n14 = 195;
                    break;
                }
                case 19: {
                    n14 = 184;
                    break;
                }
                case 20: {
                    n14 = 100;
                    break;
                }
                case 21: {
                    n14 = 72;
                    break;
                }
                case 22: {
                    n14 = 137;
                    break;
                }
                case 23: {
                    n14 = 73;
                    break;
                }
                case 24: {
                    n14 = 69;
                    break;
                }
                case 25: {
                    n14 = 101;
                    break;
                }
                case 26: {
                    n14 = 158;
                    break;
                }
                case 27: {
                    n14 = 79;
                    break;
                }
                case 28: {
                    n14 = 182;
                    break;
                }
                case 29: {
                    n14 = 175;
                    break;
                }
                case 30: {
                    n14 = 61;
                    break;
                }
                case 31: {
                    n14 = 111;
                    break;
                }
                case 32: {
                    n14 = 31;
                    break;
                }
                case 33: {
                    n14 = 140;
                    break;
                }
                case 34: {
                    n14 = 236;
                    break;
                }
                case 35: {
                    n14 = 78;
                    break;
                }
                case 36: {
                    n14 = 114;
                    break;
                }
                case 37: {
                    n14 = 250;
                    break;
                }
                case 38: {
                    n14 = 127;
                    break;
                }
                case 39: {
                    n14 = 170;
                    break;
                }
                case 40: {
                    n14 = 189;
                    break;
                }
                case 41: {
                    n14 = 198;
                    break;
                }
                case 42: {
                    n14 = 107;
                    break;
                }
                case 43: {
                    n14 = 196;
                    break;
                }
                case 44: {
                    n14 = 254;
                    break;
                }
                case 45: {
                    n14 = 99;
                    break;
                }
                case 46: {
                    n14 = 207;
                    break;
                }
                case 47: {
                    n14 = 211;
                    break;
                }
                case 48: {
                    n14 = 177;
                    break;
                }
                case 49: {
                    n14 = 88;
                    break;
                }
                case 50: {
                    n14 = 220;
                    break;
                }
                case 51: {
                    n14 = 47;
                    break;
                }
                case 52: {
                    n14 = 82;
                    break;
                }
                case 53: {
                    n14 = 68;
                    break;
                }
                case 54: {
                    n14 = 141;
                    break;
                }
                case 55: {
                    n14 = 132;
                    break;
                }
                case 56: {
                    n14 = 136;
                    break;
                }
                case 57: {
                    n14 = 152;
                    break;
                }
                case 58: {
                    n14 = 109;
                    break;
                }
                case 59: {
                    n14 = 249;
                    break;
                }
                case 60: {
                    n14 = 169;
                    break;
                }
                case 61: {
                    n14 = 77;
                    break;
                }
                case 62: {
                    n14 = 104;
                    break;
                }
                case 63: {
                    n14 = 124;
                    break;
                }
                case 64: {
                    n14 = 96;
                    break;
                }
                case 65: {
                    n14 = 115;
                    break;
                }
                case 66: {
                    n14 = 95;
                    break;
                }
                case 67: {
                    n14 = 102;
                    break;
                }
                case 68: {
                    n14 = 224;
                    break;
                }
                case 69: {
                    n14 = 146;
                    break;
                }
                case 70: {
                    n14 = 21;
                    break;
                }
                case 71: {
                    n14 = 55;
                    break;
                }
                case 72: {
                    n14 = 57;
                    break;
                }
                case 73: {
                    n14 = 202;
                    break;
                }
                case 74: {
                    n14 = 155;
                    break;
                }
                case 75: {
                    n14 = 222;
                    break;
                }
                case 76: {
                    n14 = 178;
                    break;
                }
                case 77: {
                    n14 = 20;
                    break;
                }
                case 78: {
                    n14 = 119;
                    break;
                }
                case 79: {
                    n14 = 215;
                    break;
                }
                case 80: {
                    n14 = 0;
                    break;
                }
                case 81: {
                    n14 = 251;
                    break;
                }
                case 82: {
                    n14 = 201;
                    break;
                }
                case 83: {
                    n14 = 181;
                    break;
                }
                case 84: {
                    n14 = 113;
                    break;
                }
                case 85: {
                    n14 = 171;
                    break;
                }
                case 86: {
                    n14 = 108;
                    break;
                }
                case 87: {
                    n14 = 67;
                    break;
                }
                case 88: {
                    n14 = 168;
                    break;
                }
                case 89: {
                    n14 = 25;
                    break;
                }
                case 90: {
                    n14 = 121;
                    break;
                }
                case 91: {
                    n14 = 185;
                    break;
                }
                case 92: {
                    n14 = 192;
                    break;
                }
                case 93: {
                    n14 = 232;
                    break;
                }
                case 94: {
                    n14 = 44;
                    break;
                }
                case 95: {
                    n14 = 156;
                    break;
                }
                case 96: {
                    n14 = 143;
                    break;
                }
                case 97: {
                    n14 = 216;
                    break;
                }
                case 98: {
                    n14 = 12;
                    break;
                }
                case 99: {
                    n14 = 142;
                    break;
                }
                case 100: {
                    n14 = 66;
                    break;
                }
                case 101: {
                    n14 = 16;
                    break;
                }
                case 102: {
                    n14 = 18;
                    break;
                }
                case 103: {
                    n14 = 172;
                    break;
                }
                case 104: {
                    n14 = 138;
                    break;
                }
                case 105: {
                    n14 = 10;
                    break;
                }
                case 106: {
                    n14 = 183;
                    break;
                }
                case 107: {
                    n14 = 180;
                    break;
                }
                case 108: {
                    n14 = 234;
                    break;
                }
                case 109: {
                    n14 = 80;
                    break;
                }
                case 110: {
                    n14 = 5;
                    break;
                }
                case 111: {
                    n14 = 228;
                    break;
                }
                case 112: {
                    n14 = 86;
                    break;
                }
                case 113: {
                    n14 = 70;
                    break;
                }
                case 114: {
                    n14 = 103;
                    break;
                }
                case 115: {
                    n14 = 83;
                    break;
                }
                case 116: {
                    n14 = 33;
                    break;
                }
                case 117: {
                    n14 = 15;
                    break;
                }
                case 118: {
                    n14 = 106;
                    break;
                }
                case 119: {
                    n14 = 19;
                    break;
                }
                case 120: {
                    n14 = 238;
                    break;
                }
                case 121: {
                    n14 = 210;
                    break;
                }
                case 122: {
                    n14 = 45;
                    break;
                }
                case 123: {
                    n14 = 35;
                    break;
                }
                case 124: {
                    n14 = 7;
                    break;
                }
                case 125: {
                    n14 = 81;
                    break;
                }
                case 126: {
                    n14 = 193;
                    break;
                }
                case 127: {
                    n14 = 9;
                    break;
                }
                case 128: {
                    n14 = 120;
                    break;
                }
                case 129: {
                    n14 = 133;
                    break;
                }
                case 130: {
                    n14 = 98;
                    break;
                }
                case 131: {
                    n14 = 53;
                    break;
                }
                case 132: {
                    n14 = 166;
                    break;
                }
                case 133: {
                    n14 = 29;
                    break;
                }
                case 134: {
                    n14 = 200;
                    break;
                }
                case 135: {
                    n14 = 188;
                    break;
                }
                case 136: {
                    n14 = 149;
                    break;
                }
                case 137: {
                    n14 = 32;
                    break;
                }
                case 138: {
                    n14 = 65;
                    break;
                }
                case 139: {
                    n14 = 145;
                    break;
                }
                case 140: {
                    n14 = 176;
                    break;
                }
                case 141: {
                    n14 = 129;
                    break;
                }
                case 142: {
                    n14 = 56;
                    break;
                }
                case 143: {
                    n14 = 225;
                    break;
                }
                case 144: {
                    n14 = 74;
                    break;
                }
                case 145: {
                    n14 = 255;
                    break;
                }
                case 146: {
                    n14 = 48;
                    break;
                }
                case 147: {
                    n14 = 59;
                    break;
                }
                case 148: {
                    n14 = 54;
                    break;
                }
                case 149: {
                    n14 = 144;
                    break;
                }
                case 150: {
                    n14 = 43;
                    break;
                }
                case 151: {
                    n14 = 206;
                    break;
                }
                case 152: {
                    n14 = 39;
                    break;
                }
                case 153: {
                    n14 = 150;
                    break;
                }
                case 154: {
                    n14 = 161;
                    break;
                }
                case 155: {
                    n14 = 60;
                    break;
                }
                case 156: {
                    n14 = 40;
                    break;
                }
                case 157: {
                    n14 = 208;
                    break;
                }
                case 158: {
                    n14 = 36;
                    break;
                }
                case 159: {
                    n14 = 230;
                    break;
                }
                case 160: {
                    n14 = 22;
                    break;
                }
                case 161: {
                    n14 = 91;
                    break;
                }
                case 162: {
                    n14 = 244;
                    break;
                }
                case 163: {
                    n14 = 62;
                    break;
                }
                case 164: {
                    n14 = 147;
                    break;
                }
                case 165: {
                    n14 = 159;
                    break;
                }
                case 166: {
                    n14 = 229;
                    break;
                }
                case 167: {
                    n14 = 6;
                    break;
                }
                case 168: {
                    n14 = 14;
                    break;
                }
                case 169: {
                    n14 = 76;
                    break;
                }
                case 170: {
                    n14 = 2;
                    break;
                }
                case 171: {
                    n14 = 252;
                    break;
                }
                case 172: {
                    n14 = 4;
                    break;
                }
                case 173: {
                    n14 = 217;
                    break;
                }
                case 174: {
                    n14 = 30;
                    break;
                }
                case 175: {
                    n14 = 227;
                    break;
                }
                case 176: {
                    n14 = 174;
                    break;
                }
                case 177: {
                    n14 = 134;
                    break;
                }
                case 178: {
                    n14 = 223;
                    break;
                }
                case 179: {
                    n14 = 75;
                    break;
                }
                case 180: {
                    n14 = 199;
                    break;
                }
                case 181: {
                    n14 = 151;
                    break;
                }
                case 182: {
                    n14 = 11;
                    break;
                }
                case 183: {
                    n14 = 205;
                    break;
                }
                case 184: {
                    n14 = 63;
                    break;
                }
                case 185: {
                    n14 = 231;
                    break;
                }
                case 186: {
                    n14 = 164;
                    break;
                }
                case 187: {
                    n14 = 123;
                    break;
                }
                case 188: {
                    n14 = 24;
                    break;
                }
                case 189: {
                    n14 = 17;
                    break;
                }
                case 190: {
                    n14 = 1;
                    break;
                }
                case 191: {
                    n14 = 160;
                    break;
                }
                case 192: {
                    n14 = 235;
                    break;
                }
                case 193: {
                    n14 = 165;
                    break;
                }
                case 194: {
                    n14 = 125;
                    break;
                }
                case 195: {
                    n14 = 154;
                    break;
                }
                case 196: {
                    n14 = 126;
                    break;
                }
                case 197: {
                    n14 = 248;
                    break;
                }
                case 198: {
                    n14 = 131;
                    break;
                }
                case 199: {
                    n14 = 246;
                    break;
                }
                case 200: {
                    n14 = 163;
                    break;
                }
                case 201: {
                    n14 = 242;
                    break;
                }
                case 202: {
                    n14 = 162;
                    break;
                }
                case 203: {
                    n14 = 214;
                    break;
                }
                case 204: {
                    n14 = 241;
                    break;
                }
                case 205: {
                    n14 = 197;
                    break;
                }
                case 206: {
                    n14 = 116;
                    break;
                }
                case 207: {
                    n14 = 190;
                    break;
                }
                case 208: {
                    n14 = 212;
                    break;
                }
                case 209: {
                    n14 = 122;
                    break;
                }
                case 210: {
                    n14 = 112;
                    break;
                }
                case 211: {
                    n14 = 85;
                    break;
                }
                case 212: {
                    n14 = 41;
                    break;
                }
                case 213: {
                    n14 = 167;
                    break;
                }
                case 214: {
                    n14 = 139;
                    break;
                }
                case 215: {
                    n14 = 187;
                    break;
                }
                case 216: {
                    n14 = 52;
                    break;
                }
                case 217: {
                    n14 = 243;
                    break;
                }
                case 218: {
                    n14 = 233;
                    break;
                }
                case 219: {
                    n14 = 13;
                    break;
                }
                case 220: {
                    n14 = 209;
                    break;
                }
                case 221: {
                    n14 = 28;
                    break;
                }
                case 222: {
                    n14 = 179;
                    break;
                }
                case 223: {
                    n14 = 105;
                    break;
                }
                case 224: {
                    n14 = 173;
                    break;
                }
                case 225: {
                    n14 = 239;
                    break;
                }
                case 226: {
                    n14 = 128;
                    break;
                }
                case 227: {
                    n14 = 118;
                    break;
                }
                case 228: {
                    n14 = 27;
                    break;
                }
                case 229: {
                    n14 = 194;
                    break;
                }
                case 230: {
                    n14 = 3;
                    break;
                }
                case 231: {
                    n14 = 186;
                    break;
                }
                case 232: {
                    n14 = 135;
                    break;
                }
                case 233: {
                    n14 = 23;
                    break;
                }
                case 234: {
                    n14 = 153;
                    break;
                }
                case 235: {
                    n14 = 50;
                    break;
                }
                case 236: {
                    n14 = 42;
                    break;
                }
                case 237: {
                    n14 = 237;
                    break;
                }
                case 238: {
                    n14 = 130;
                    break;
                }
                case 239: {
                    n14 = 38;
                    break;
                }
                case 240: {
                    n14 = 37;
                    break;
                }
                case 241: {
                    n14 = 240;
                    break;
                }
                case 242: {
                    n14 = 247;
                    break;
                }
                case 243: {
                    n14 = 219;
                    break;
                }
                case 244: {
                    n14 = 58;
                    break;
                }
                case 245: {
                    n14 = 218;
                    break;
                }
                case 246: {
                    n14 = 49;
                    break;
                }
                case 247: {
                    n14 = 93;
                    break;
                }
                case 248: {
                    n14 = 71;
                    break;
                }
                case 249: {
                    n14 = 117;
                    break;
                }
                case 250: {
                    n14 = 64;
                    break;
                }
                case 251: {
                    n14 = 157;
                    break;
                }
                case 252: {
                    n14 = 226;
                    break;
                }
                case 253: {
                    n14 = 191;
                    break;
                }
                case 254: {
                    n14 = 26;
                    break;
                }
                default: {
                    n14 = 203;
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
            O.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5909;
        if (d[n11] == null) {
            O.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

