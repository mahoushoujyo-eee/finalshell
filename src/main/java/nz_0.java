/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/*
 * Renamed from nz
 */
public class nz_0 {
    public String y;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public nz_0(String string) {
        this.y = string;
    }

    public void e(KV kV) {
        block125: {
            Object object;
            String string;
            Object object2;
            Object object3;
            HashMap hashMap;
            ArrayList arrayList;
            ArrayList arrayList2;
            String[] stringArray;
            try {
                stringArray = (String[])lk_0.B(this.y);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String[] stringArray2 = stringArray;
            ArrayList<Object> arrayList3 = new ArrayList<Object>();
            Hashtable<Object, Object> hashtable = new Hashtable<Object, Object>();
            try {
                arrayList2 = (ArrayList)kV.s();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ArrayList arrayList4 = arrayList2;
            try {
                arrayList = (ArrayList)kV.N();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ArrayList arrayList5 = arrayList;
            HashSet<Integer> hashSet = new HashSet<Integer>();
            ArrayList<Object> arrayList6 = new ArrayList<Object>();
            String string2 = W2.F();
            try {
                hashMap = (HashMap)kV.Z();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            HashMap hashMap2 = hashMap;
            int n10 = 0;
            int n11 = 0;
            int n12 = 0;
            while (n12 < stringArray2.length) {
                block126: {
                    block127: {
                        boolean bl;
                        String string3;
                        block131: {
                            int n13;
                            String string4;
                            String string5;
                            String string6;
                            int n14;
                            block130: {
                                String string7;
                                String[] stringArray3;
                                block129: {
                                    boolean bl2;
                                    String n18;
                                    block128: {
                                        string3 = stringArray2[n12].trim();
                                        if (string2 == null) break block126;
                                        if (!(string3.startsWith("tcp") | string3.startsWith("udp"))) break block127;
                                        stringArray3 = string3.split("s+");
                                        object3 = stringArray3[3];
                                        n14 = Integer.parseInt(((String)object3).substring(((String)object3).lastIndexOf(":") + 1));
                                        n18 = stringArray3[4];
                                        bl2 = ((String)object3).startsWith("::ffff:");
                                        if (string2 == null) break block128;
                                        if (bl2) {
                                            object3 = ((String)object3).substring("::ffff:".length());
                                        }
                                        string7 = n18;
                                        if (string2 == null) break block129;
                                        bl2 = string7.startsWith("::ffff:");
                                    }
                                    if (bl2) {
                                        n18 = n18.substring("::ffff:".length());
                                    }
                                    string7 = ((String)object3).substring(0, ((String)object3).lastIndexOf(":"));
                                }
                                object2 = string7;
                                string6 = stringArray3[5];
                                int n15 = stringArray3[nz_0.a(22703, 1777099439116973973L)].indexOf("/");
                                String n20 = null;
                                string = null;
                                if (n15 > 0) {
                                    string = stringArray3[nz_0.a(22086, 6976786919063943549L)].substring(n15 + 1);
                                    n20 = stringArray3[nz_0.a(22086, 6976786919063943549L)].substring(0, n15);
                                }
                                string5 = n20;
                                if (string2 == null) break block130;
                                if (string5 == null) break block127;
                                string5 = n20;
                            }
                            int n16 = Integer.parseInt(string5);
                            String string8 = string6.toUpperCase();
                            bl = string8.equals("LISTEN");
                            if (string2 == null) break block127;
                            if (!bl) break block131;
                            object = new kw_2();
                            arrayList3.add(object);
                            try {
                                object.N(string);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object.D(kw_2.r);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object.B(true);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object.m(n16);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object.L(object2);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object.G(n14);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                string4 = (String)object.R();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                n13 = (Integer)object.p();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object.S(string4 + ":" + n13);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            hashSet.add(n14);
                            if (n14 == nz_0.a(29020, 8296348846758223460L)) {
                                // empty if block
                            }
                            hashtable.put(object3, object);
                            if (string2 != null) break block127;
                            ky_2.K(new String[2]);
                        }
                        bl = arrayList6.add(string3);
                    }
                    ++n12;
                }
                if (string2 != null) continue;
            }
            HashMap<Integer, kw_2> hashMap3 = new HashMap<Integer, kw_2>();
            for (String string9 : arrayList6) {
                block133: {
                    String string10;
                    kw_2 kw_22;
                    kw_2 kw_23;
                    ya_1 ya_12;
                    String string11;
                    Object object4;
                    int n17;
                    int n18;
                    block142: {
                        block143: {
                            HashSet hashSet2;
                            int n19;
                            String string12;
                            block138: {
                                block139: {
                                    block140: {
                                        block141: {
                                            boolean bl;
                                            boolean bl3;
                                            block136: {
                                                block137: {
                                                    Object object5;
                                                    block135: {
                                                        boolean bl4;
                                                        String string13;
                                                        block134: {
                                                            String string14;
                                                            Object object6;
                                                            block132: {
                                                                object3 = string9.split("s+");
                                                                string13 = object3[3];
                                                                n18 = Integer.parseInt(string13.substring(string13.lastIndexOf(":") + 1));
                                                                object2 = object3[4];
                                                                n17 = Integer.parseInt(((String)object2).substring(((String)object2).lastIndexOf(":") + 1));
                                                                object6 = object3[5];
                                                                int n20 = ((String)object3[nz_0.a(22086, 6976786919063943549L)]).indexOf("/");
                                                                string = null;
                                                                string12 = null;
                                                                if (string2 == null) break block125;
                                                                if (n20 > 0) {
                                                                    string12 = ((String)object3[nz_0.a(22086, 6976786919063943549L)]).substring(n20 + 1);
                                                                    string = ((String)object3[nz_0.a(22086, 6976786919063943549L)]).substring(0, n20);
                                                                }
                                                                string14 = string;
                                                                if (string2 == null) break block132;
                                                                if (string14 == null) break block133;
                                                                string14 = string;
                                                            }
                                                            n19 = Integer.parseInt(string14);
                                                            object = ((String)object6).toUpperCase();
                                                            bl4 = string13.startsWith("::ffff:");
                                                            if (string2 == null) break block134;
                                                            if (bl4) {
                                                                string13 = string13.substring("::ffff:".length());
                                                            }
                                                            object5 = object2;
                                                            if (string2 == null) break block135;
                                                            bl4 = ((String)object5).startsWith("::ffff:");
                                                        }
                                                        if (bl4) {
                                                            object2 = ((String)object2).substring("::ffff:".length());
                                                        }
                                                        object5 = string13.substring(0, string13.lastIndexOf(":"));
                                                    }
                                                    object4 = object5;
                                                    string11 = ((String)object2).substring(0, ((String)object2).lastIndexOf(":"));
                                                    bl3 = false;
                                                    bl = arrayList5.contains(object4);
                                                    if (string2 == null) break block136;
                                                    if (!bl) break block137;
                                                    bl = hashSet.contains(n18);
                                                    if (string2 == null) break block136;
                                                    if (bl) {
                                                        bl3 = true;
                                                    }
                                                }
                                                bl = ((String)object).equals("ESTABLISHED");
                                            }
                                            if (!bl) break block133;
                                            ya_12 = new ya_1();
                                            try {
                                                ya_12.c(n19);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                ya_12.Q(object4);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                ya_12.o(n18);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                ya_12.H(string11);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                ya_12.R(n17);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                ya_12.X((String)object4 + ":" + n18 + ">" + string11 + ":" + n17);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            kw_23 = null;
                                            if (string2 == null) break block138;
                                            if (!bl3) break block139;
                                            try {
                                                ya_12.J(ya_1.f);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            ++n10;
                                            kw_22 = kw_23 = (kw_2)hashtable.get((String)object4 + ":" + n18);
                                            if (string2 == null) break block140;
                                            if (kw_22 != null) break block141;
                                            string10 = "0.0.0.0:" + n18;
                                            kw_22 = kw_23 = (kw_2)hashtable.get(string10);
                                            if (string2 == null) break block140;
                                            if (kw_22 == null) {
                                                string10 = ":::" + n18;
                                                kw_23 = (kw_2)hashtable.get(string10);
                                            }
                                        }
                                        kw_22 = kw_23;
                                    }
                                    if (string2 == null) break block142;
                                    if (kw_22 != null) {
                                        HashSet hashSet3;
                                        ArrayList arrayList7;
                                        try {
                                            arrayList7 = (ArrayList)kw_23.D();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        arrayList7.add(ya_12);
                                        try {
                                            hashSet3 = (HashSet)kw_23.s();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        hashSet3.add(string11);
                                    }
                                    break block143;
                                }
                                ++n11;
                                try {
                                    ya_12.J(ya_1.R);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            kw_2 kw_24 = kw_23 = (kw_2)hashMap3.get(n19);
                            if (string2 != null) {
                                ArrayList arrayList8;
                                if (kw_24 == null) {
                                    int n21;
                                    kw_23 = new kw_2();
                                    try {
                                        kw_23.D(kw_2.e);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        kw_23.m(n19);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        kw_23.N(string12);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        n21 = (Integer)kw_23.f();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        kw_23.S(n21 + "");
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    hashMap3.put(n19, kw_23);
                                    arrayList3.add(kw_23);
                                }
                                try {
                                    arrayList8 = (ArrayList)kw_23.D();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                arrayList8.add(ya_12);
                                kw_24 = kw_23;
                            }
                            try {
                                hashSet2 = (HashSet)kw_24.s();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            hashSet2.add(string11);
                        }
                        kw_22 = kw_23;
                    }
                    if (kw_22 != null) {
                        string10 = (String)object4 + ":" + n18 + ">" + string11 + ":" + n17;
                        OZ oZ = (OZ)hashMap2.get(string10);
                        if (string2 != null) {
                            if (oZ != null) {
                                long l2;
                                long l3;
                                long l4;
                                long l5;
                                long l6;
                                try {
                                    l6 = (Long)kw_23.x();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    l5 = (Long)oZ.F();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    kw_23.V(l6 + l5);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    l4 = (Long)kw_23.B();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    l3 = (Long)oZ.K();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    kw_23.Y(l4 + l3);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    l2 = (Long)oZ.F();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    ya_12.m(l2);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                        } else {
                            long l7;
                            try {
                                l7 = (Long)oZ.K();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                ya_12.n(l7);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                    }
                }
                if (string2 != null) continue;
            }
            try {
                kV.J(arrayList3);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    String p(int n10, KV kV) {
        String string;
        block21: {
            li_1 li_12;
            u8_0 u8_02;
            u8_0 u8_03;
            String string2;
            block20: {
                u8_0 u8_04;
                string = null;
                string2 = W2.F();
                try {
                    u8_04 = (u8_0)kV.m(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                u8_02 = u8_03 = u8_04;
                if (string2 == null) break block20;
                if (u8_02 == null) break block21;
                u8_02 = u8_03;
            }
            try {
                li_12 = (li_1)u8_02.H();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (string2 != null) {
                if (li_12 != null) {
                    try {
                        li_12 = (li_1)u8_03.H();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else {
                String string3;
                try {
                    string3 = (String)li_12.B();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (string2 != null) {
                    if (string3 != null) {
                        Object object;
                        try {
                            object = u8_03.H();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            string3 = (String)object.B();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                } else {
                    string = string3;
                }
            }
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[10];
                        var11_1 = 0;
                        var10_2 = "\u0094\\\u0087\u0003\u00c6\u0007\u009a\u000bV\u00dc\u009a-b\u000f]H{\u009c\u00a4\u0007t?|2\u00ee\u0005\u001f\u0007_\f\u0019TB\u00c9\u008a\u0006\u00df\u0083\u0084\u008aAN\b\u00b3\u00aa\u0099^\u0098\u0081G\u00de\u0003\u00da\u00e48";
                        var12_3 = "\u0094\\\u0087\u0003\u00c6\u0007\u009a\u000bV\u00dc\u009a-b\u000f]H{\u009c\u00a4\u0007t?|2\u00ee\u0005\u001f\u0007_\f\u0019TB\u00c9\u008a\u0006\u00df\u0083\u0084\u008aAN\b\u00b3\u00aa\u0099^\u0098\u0081G\u00de\u0003\u00da\u00e48".length();
                        var9_4 = 3;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 120;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
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
                            var10_2 = "\u00e2\u0016\u00d5\u0003\u00e2\u0095n";
                            var12_3 = "\u00e2\u0016\u00d5\u0003\u00e2\u0095n".length();
                            var9_4 = 3;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 18;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
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
                                    v15 = 6;
                                    break;
                                }
                                case 1: {
                                    v15 = 111;
                                    break;
                                }
                                case 2: {
                                    v15 = 94;
                                    break;
                                }
                                case 3: {
                                    v15 = 84;
                                    break;
                                }
                                case 4: {
                                    v15 = 17;
                                    break;
                                }
                                case 5: {
                                    v15 = 114;
                                    break;
                                }
                                default: {
                                    v15 = 7;
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
                nz_0.a = var13;
                nz_0.b = new String[10];
                var0_7 = 2945474438442102764L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "#\u00ad\u00ba\u00afaIX\u007f\u0087\u0000\u00ca\u0088^0V\u0097%\u00ce\u00b2\u00e2\u00a9\u00eb\u00fdW";
                var5_11 = "#\u00ad\u00ba\u00afaIX\u007f\u0087\u0000\u00ca\u0088^0V\u0097%\u00ce\u00b2\u00e2\u00a9\u00eb\u00fdW".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
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
        nz_0.c = var6_8;
        nz_0.d = new Integer[3];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1F8F) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 100;
                    break;
                }
                case 1: {
                    n14 = 188;
                    break;
                }
                case 2: {
                    n14 = 103;
                    break;
                }
                case 3: {
                    n14 = 49;
                    break;
                }
                case 4: {
                    n14 = 251;
                    break;
                }
                case 5: {
                    n14 = 60;
                    break;
                }
                case 6: {
                    n14 = 37;
                    break;
                }
                case 7: {
                    n14 = 72;
                    break;
                }
                case 8: {
                    n14 = 155;
                    break;
                }
                case 9: {
                    n14 = 217;
                    break;
                }
                case 10: {
                    n14 = 208;
                    break;
                }
                case 11: {
                    n14 = 249;
                    break;
                }
                case 12: {
                    n14 = 112;
                    break;
                }
                case 13: {
                    n14 = 24;
                    break;
                }
                case 14: {
                    n14 = 175;
                    break;
                }
                case 15: {
                    n14 = 99;
                    break;
                }
                case 16: {
                    n14 = 215;
                    break;
                }
                case 17: {
                    n14 = 71;
                    break;
                }
                case 18: {
                    n14 = 171;
                    break;
                }
                case 19: {
                    n14 = 39;
                    break;
                }
                case 20: {
                    n14 = 253;
                    break;
                }
                case 21: {
                    n14 = 21;
                    break;
                }
                case 22: {
                    n14 = 152;
                    break;
                }
                case 23: {
                    n14 = 104;
                    break;
                }
                case 24: {
                    n14 = 114;
                    break;
                }
                case 25: {
                    n14 = 246;
                    break;
                }
                case 26: {
                    n14 = 131;
                    break;
                }
                case 27: {
                    n14 = 247;
                    break;
                }
                case 28: {
                    n14 = 118;
                    break;
                }
                case 29: {
                    n14 = 41;
                    break;
                }
                case 30: {
                    n14 = 83;
                    break;
                }
                case 31: {
                    n14 = 161;
                    break;
                }
                case 32: {
                    n14 = 250;
                    break;
                }
                case 33: {
                    n14 = 115;
                    break;
                }
                case 34: {
                    n14 = 22;
                    break;
                }
                case 35: {
                    n14 = 173;
                    break;
                }
                case 36: {
                    n14 = 162;
                    break;
                }
                case 37: {
                    n14 = 142;
                    break;
                }
                case 38: {
                    n14 = 78;
                    break;
                }
                case 39: {
                    n14 = 196;
                    break;
                }
                case 40: {
                    n14 = 232;
                    break;
                }
                case 41: {
                    n14 = 201;
                    break;
                }
                case 42: {
                    n14 = 136;
                    break;
                }
                case 43: {
                    n14 = 105;
                    break;
                }
                case 44: {
                    n14 = 5;
                    break;
                }
                case 45: {
                    n14 = 69;
                    break;
                }
                case 46: {
                    n14 = 88;
                    break;
                }
                case 47: {
                    n14 = 48;
                    break;
                }
                case 48: {
                    n14 = 134;
                    break;
                }
                case 49: {
                    n14 = 154;
                    break;
                }
                case 50: {
                    n14 = 200;
                    break;
                }
                case 51: {
                    n14 = 133;
                    break;
                }
                case 52: {
                    n14 = 74;
                    break;
                }
                case 53: {
                    n14 = 7;
                    break;
                }
                case 54: {
                    n14 = 93;
                    break;
                }
                case 55: {
                    n14 = 67;
                    break;
                }
                case 56: {
                    n14 = 138;
                    break;
                }
                case 57: {
                    n14 = 8;
                    break;
                }
                case 58: {
                    n14 = 198;
                    break;
                }
                case 59: {
                    n14 = 62;
                    break;
                }
                case 60: {
                    n14 = 211;
                    break;
                }
                case 61: {
                    n14 = 157;
                    break;
                }
                case 62: {
                    n14 = 166;
                    break;
                }
                case 63: {
                    n14 = 3;
                    break;
                }
                case 64: {
                    n14 = 106;
                    break;
                }
                case 65: {
                    n14 = 77;
                    break;
                }
                case 66: {
                    n14 = 227;
                    break;
                }
                case 67: {
                    n14 = 86;
                    break;
                }
                case 68: {
                    n14 = 156;
                    break;
                }
                case 69: {
                    n14 = 168;
                    break;
                }
                case 70: {
                    n14 = 178;
                    break;
                }
                case 71: {
                    n14 = 140;
                    break;
                }
                case 72: {
                    n14 = 16;
                    break;
                }
                case 73: {
                    n14 = 80;
                    break;
                }
                case 74: {
                    n14 = 179;
                    break;
                }
                case 75: {
                    n14 = 226;
                    break;
                }
                case 76: {
                    n14 = 128;
                    break;
                }
                case 77: {
                    n14 = 19;
                    break;
                }
                case 78: {
                    n14 = 212;
                    break;
                }
                case 79: {
                    n14 = 213;
                    break;
                }
                case 80: {
                    n14 = 255;
                    break;
                }
                case 81: {
                    n14 = 141;
                    break;
                }
                case 82: {
                    n14 = 121;
                    break;
                }
                case 83: {
                    n14 = 40;
                    break;
                }
                case 84: {
                    n14 = 79;
                    break;
                }
                case 85: {
                    n14 = 197;
                    break;
                }
                case 86: {
                    n14 = 47;
                    break;
                }
                case 87: {
                    n14 = 214;
                    break;
                }
                case 88: {
                    n14 = 169;
                    break;
                }
                case 89: {
                    n14 = 87;
                    break;
                }
                case 90: {
                    n14 = 243;
                    break;
                }
                case 91: {
                    n14 = 29;
                    break;
                }
                case 92: {
                    n14 = 187;
                    break;
                }
                case 93: {
                    n14 = 124;
                    break;
                }
                case 94: {
                    n14 = 159;
                    break;
                }
                case 95: {
                    n14 = 219;
                    break;
                }
                case 96: {
                    n14 = 163;
                    break;
                }
                case 97: {
                    n14 = 254;
                    break;
                }
                case 98: {
                    n14 = 28;
                    break;
                }
                case 99: {
                    n14 = 234;
                    break;
                }
                case 100: {
                    n14 = 184;
                    break;
                }
                case 101: {
                    n14 = 210;
                    break;
                }
                case 102: {
                    n14 = 180;
                    break;
                }
                case 103: {
                    n14 = 143;
                    break;
                }
                case 104: {
                    n14 = 202;
                    break;
                }
                case 105: {
                    n14 = 224;
                    break;
                }
                case 106: {
                    n14 = 203;
                    break;
                }
                case 107: {
                    n14 = 132;
                    break;
                }
                case 108: {
                    n14 = 193;
                    break;
                }
                case 109: {
                    n14 = 46;
                    break;
                }
                case 110: {
                    n14 = 160;
                    break;
                }
                case 111: {
                    n14 = 94;
                    break;
                }
                case 112: {
                    n14 = 81;
                    break;
                }
                case 113: {
                    n14 = 44;
                    break;
                }
                case 114: {
                    n14 = 20;
                    break;
                }
                case 115: {
                    n14 = 109;
                    break;
                }
                case 116: {
                    n14 = 236;
                    break;
                }
                case 117: {
                    n14 = 126;
                    break;
                }
                case 118: {
                    n14 = 73;
                    break;
                }
                case 119: {
                    n14 = 42;
                    break;
                }
                case 120: {
                    n14 = 66;
                    break;
                }
                case 121: {
                    n14 = 98;
                    break;
                }
                case 122: {
                    n14 = 170;
                    break;
                }
                case 123: {
                    n14 = 150;
                    break;
                }
                case 124: {
                    n14 = 52;
                    break;
                }
                case 125: {
                    n14 = 185;
                    break;
                }
                case 126: {
                    n14 = 144;
                    break;
                }
                case 127: {
                    n14 = 153;
                    break;
                }
                case 128: {
                    n14 = 57;
                    break;
                }
                case 129: {
                    n14 = 192;
                    break;
                }
                case 130: {
                    n14 = 14;
                    break;
                }
                case 131: {
                    n14 = 10;
                    break;
                }
                case 132: {
                    n14 = 164;
                    break;
                }
                case 133: {
                    n14 = 139;
                    break;
                }
                case 134: {
                    n14 = 61;
                    break;
                }
                case 135: {
                    n14 = 17;
                    break;
                }
                case 136: {
                    n14 = 54;
                    break;
                }
                case 137: {
                    n14 = 11;
                    break;
                }
                case 138: {
                    n14 = 191;
                    break;
                }
                case 139: {
                    n14 = 146;
                    break;
                }
                case 140: {
                    n14 = 252;
                    break;
                }
                case 141: {
                    n14 = 32;
                    break;
                }
                case 142: {
                    n14 = 230;
                    break;
                }
                case 143: {
                    n14 = 2;
                    break;
                }
                case 144: {
                    n14 = 0;
                    break;
                }
                case 145: {
                    n14 = 85;
                    break;
                }
                case 146: {
                    n14 = 167;
                    break;
                }
                case 147: {
                    n14 = 25;
                    break;
                }
                case 148: {
                    n14 = 174;
                    break;
                }
                case 149: {
                    n14 = 245;
                    break;
                }
                case 150: {
                    n14 = 38;
                    break;
                }
                case 151: {
                    n14 = 241;
                    break;
                }
                case 152: {
                    n14 = 45;
                    break;
                }
                case 153: {
                    n14 = 205;
                    break;
                }
                case 154: {
                    n14 = 68;
                    break;
                }
                case 155: {
                    n14 = 82;
                    break;
                }
                case 156: {
                    n14 = 107;
                    break;
                }
                case 157: {
                    n14 = 194;
                    break;
                }
                case 158: {
                    n14 = 75;
                    break;
                }
                case 159: {
                    n14 = 165;
                    break;
                }
                case 160: {
                    n14 = 53;
                    break;
                }
                case 161: {
                    n14 = 148;
                    break;
                }
                case 162: {
                    n14 = 183;
                    break;
                }
                case 163: {
                    n14 = 111;
                    break;
                }
                case 164: {
                    n14 = 26;
                    break;
                }
                case 165: {
                    n14 = 190;
                    break;
                }
                case 166: {
                    n14 = 50;
                    break;
                }
                case 167: {
                    n14 = 176;
                    break;
                }
                case 168: {
                    n14 = 149;
                    break;
                }
                case 169: {
                    n14 = 240;
                    break;
                }
                case 170: {
                    n14 = 116;
                    break;
                }
                case 171: {
                    n14 = 84;
                    break;
                }
                case 172: {
                    n14 = 6;
                    break;
                }
                case 173: {
                    n14 = 117;
                    break;
                }
                case 174: {
                    n14 = 9;
                    break;
                }
                case 175: {
                    n14 = 129;
                    break;
                }
                case 176: {
                    n14 = 55;
                    break;
                }
                case 177: {
                    n14 = 225;
                    break;
                }
                case 178: {
                    n14 = 120;
                    break;
                }
                case 179: {
                    n14 = 220;
                    break;
                }
                case 180: {
                    n14 = 125;
                    break;
                }
                case 181: {
                    n14 = 23;
                    break;
                }
                case 182: {
                    n14 = 122;
                    break;
                }
                case 183: {
                    n14 = 195;
                    break;
                }
                case 184: {
                    n14 = 123;
                    break;
                }
                case 185: {
                    n14 = 172;
                    break;
                }
                case 186: {
                    n14 = 231;
                    break;
                }
                case 187: {
                    n14 = 137;
                    break;
                }
                case 188: {
                    n14 = 151;
                    break;
                }
                case 189: {
                    n14 = 30;
                    break;
                }
                case 190: {
                    n14 = 233;
                    break;
                }
                case 191: {
                    n14 = 13;
                    break;
                }
                case 192: {
                    n14 = 59;
                    break;
                }
                case 193: {
                    n14 = 130;
                    break;
                }
                case 194: {
                    n14 = 119;
                    break;
                }
                case 195: {
                    n14 = 33;
                    break;
                }
                case 196: {
                    n14 = 204;
                    break;
                }
                case 197: {
                    n14 = 242;
                    break;
                }
                case 198: {
                    n14 = 186;
                    break;
                }
                case 199: {
                    n14 = 237;
                    break;
                }
                case 200: {
                    n14 = 91;
                    break;
                }
                case 201: {
                    n14 = 101;
                    break;
                }
                case 202: {
                    n14 = 95;
                    break;
                }
                case 203: {
                    n14 = 218;
                    break;
                }
                case 204: {
                    n14 = 238;
                    break;
                }
                case 205: {
                    n14 = 34;
                    break;
                }
                case 206: {
                    n14 = 145;
                    break;
                }
                case 207: {
                    n14 = 199;
                    break;
                }
                case 208: {
                    n14 = 15;
                    break;
                }
                case 209: {
                    n14 = 102;
                    break;
                }
                case 210: {
                    n14 = 189;
                    break;
                }
                case 211: {
                    n14 = 43;
                    break;
                }
                case 212: {
                    n14 = 182;
                    break;
                }
                case 213: {
                    n14 = 4;
                    break;
                }
                case 214: {
                    n14 = 70;
                    break;
                }
                case 215: {
                    n14 = 90;
                    break;
                }
                case 216: {
                    n14 = 65;
                    break;
                }
                case 217: {
                    n14 = 158;
                    break;
                }
                case 218: {
                    n14 = 181;
                    break;
                }
                case 219: {
                    n14 = 177;
                    break;
                }
                case 220: {
                    n14 = 216;
                    break;
                }
                case 221: {
                    n14 = 12;
                    break;
                }
                case 222: {
                    n14 = 228;
                    break;
                }
                case 223: {
                    n14 = 113;
                    break;
                }
                case 224: {
                    n14 = 1;
                    break;
                }
                case 225: {
                    n14 = 127;
                    break;
                }
                case 226: {
                    n14 = 18;
                    break;
                }
                case 227: {
                    n14 = 76;
                    break;
                }
                case 228: {
                    n14 = 248;
                    break;
                }
                case 229: {
                    n14 = 209;
                    break;
                }
                case 230: {
                    n14 = 36;
                    break;
                }
                case 231: {
                    n14 = 207;
                    break;
                }
                case 232: {
                    n14 = 223;
                    break;
                }
                case 233: {
                    n14 = 235;
                    break;
                }
                case 234: {
                    n14 = 221;
                    break;
                }
                case 235: {
                    n14 = 56;
                    break;
                }
                case 236: {
                    n14 = 92;
                    break;
                }
                case 237: {
                    n14 = 229;
                    break;
                }
                case 238: {
                    n14 = 206;
                    break;
                }
                case 239: {
                    n14 = 64;
                    break;
                }
                case 240: {
                    n14 = 35;
                    break;
                }
                case 241: {
                    n14 = 147;
                    break;
                }
                case 242: {
                    n14 = 63;
                    break;
                }
                case 243: {
                    n14 = 27;
                    break;
                }
                case 244: {
                    n14 = 239;
                    break;
                }
                case 245: {
                    n14 = 51;
                    break;
                }
                case 246: {
                    n14 = 110;
                    break;
                }
                case 247: {
                    n14 = 108;
                    break;
                }
                case 248: {
                    n14 = 135;
                    break;
                }
                case 249: {
                    n14 = 58;
                    break;
                }
                case 250: {
                    n14 = 96;
                    break;
                }
                case 251: {
                    n14 = 222;
                    break;
                }
                case 252: {
                    n14 = 31;
                    break;
                }
                case 253: {
                    n14 = 97;
                    break;
                }
                case 254: {
                    n14 = 89;
                    break;
                }
                default: {
                    n14 = 244;
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
            nz_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2F3A;
        if (d[n11] == null) {
            nz_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

