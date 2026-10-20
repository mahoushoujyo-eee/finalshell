/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import com.c;
import com.oc_0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from zj
 */
public class zj_0 {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static void K(oc_0 oc_02) {
        Object object;
        Object object2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object object3;
        Object object4;
        ArrayList arrayList3;
        try {
            arrayList3 = (ArrayList)zj_0.N(oc_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList4 = arrayList3;
        try {
            object4 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = object4.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            arrayList2 = (ArrayList)object3.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList5 = arrayList2;
        try {
            arrayList = (ArrayList)zj_0.H((Object)arrayList4, (Object)arrayList5);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList6 = arrayList;
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.N(arrayList6);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private static ArrayList H(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList<li_2> arrayList3;
        block9: {
            ArrayList<li_2> arrayList4;
            try {
                arrayList4 = (ArrayList<li_2>)le_2.J((Object)arrayList, (Object)arrayList2, new li_2());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            arrayList3 = arrayList4;
            ArrayList<li_2> arrayList5 = new ArrayList<li_2>();
            Iterator iterator = arrayList3.iterator();
            int[] nArray = yb_1.Y();
            while (iterator.hasNext()) {
                boolean bl;
                li_2 li_22 = (li_2)iterator.next();
                try {
                    bl = (Boolean)le_2.H(li_22);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                boolean bl2 = bl;
                if (nArray == null) {
                    boolean bl3 = bl2;
                    if (nArray == null && !bl3) {
                        bl3 = arrayList5.add(li_22);
                    }
                    if (nArray == null) continue;
                }
                break block9;
            }
            arrayList3 = arrayList5;
            try {
                zj_0.i(arrayList3, (Object)arrayList, arrayList2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        return arrayList3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static void i(ArrayList var0, ArrayList var1_1, ArrayList var2_2) {
        block99: {
            block98: {
                block97: {
                    block96: {
                        block95: {
                            block94: {
                                block93: {
                                    var4_3 = new HashSet<String>();
                                    var5_4 = new HashMap<String, lj_2>();
                                    var6_5 = new HashMap<String, lj_2>();
                                    var7_6 = new ArrayList<lj_2>();
                                    var8_7 = var1_1.iterator();
                                    var3_8 = yb_1.Y();
                                    block48: while (var8_7.hasNext()) {
                                        var9_9 = (li_2)var8_7.next();
                                        try {
                                            v0 = (ArrayList)var9_9.Z();
                                        }
                                        catch (InvocationTargetException v1) {
                                            throw v1.getTargetException();
                                        }
                                        var10_10 = v0;
                                        v2 = var10_10.iterator();
                                        if (var3_8 != null) break block93;
                                        var11_11 = v2;
                                        while (var11_11.hasNext()) {
                                            var12_12 = (lj_2)var11_11.next();
                                            try {
                                                v3 = (String)var12_12.g();
                                            }
                                            catch (InvocationTargetException v4) {
                                                throw v4.getTargetException();
                                            }
                                            var5_4.put(v3, (lj_2)var12_12);
                                            if (var3_8 != null) continue block48;
                                            if (var3_8 == null) continue;
                                        }
                                        if (var3_8 == null) continue;
                                    }
                                    v2 = var2_2.iterator();
                                }
                                var8_7 = v2;
                                block50: while (true) {
                                    v5 = var8_7.hasNext();
                                    block51: while (v5) {
                                        var9_9 = (li_2)var8_7.next();
                                        try {
                                            v6 = (ArrayList)var9_9.Z();
                                        }
                                        catch (InvocationTargetException v7) {
                                            throw v7.getTargetException();
                                        }
                                        var10_10 = v6;
                                        v8 = var10_10.iterator();
                                        if (var3_8 != null) break block94;
                                        var11_11 = v8;
                                        while (var11_11.hasNext()) {
                                            block100: {
                                                block101: {
                                                    var12_12 = (lj_2)var11_11.next();
                                                    try {
                                                        v9 = (String)var12_12.g();
                                                    }
                                                    catch (InvocationTargetException v10) {
                                                        throw v10.getTargetException();
                                                    }
                                                    var6_5.put(v9, (lj_2)var12_12);
                                                    try {
                                                        v11 = (String)var12_12.g();
                                                    }
                                                    catch (InvocationTargetException v12) {
                                                        throw v12.getTargetException();
                                                    }
                                                    v5 = var5_4.containsKey(v11);
                                                    if (var3_8 != null) continue block51;
                                                    if (var3_8 != null) break block100;
                                                    if (!v5) break block101;
                                                    try {
                                                        v13 = (String)var12_12.g();
                                                    }
                                                    catch (InvocationTargetException v14) {
                                                        throw v14.getTargetException();
                                                    }
                                                    var4_3.add(v13);
                                                    if (var3_8 == null) break block100;
                                                }
                                                var7_6.add((lj_2)var12_12);
                                            }
                                            if (var3_8 == null) continue;
                                        }
                                        if (var3_8 == null) continue block50;
                                    }
                                    break;
                                }
                                v8 = var1_1.iterator();
                            }
                            var8_7 = v8;
                            block53: while (true) {
                                v15 = var8_7.hasNext();
                                block54: while (v15) {
                                    var9_9 = (li_2)var8_7.next();
                                    try {
                                        v16 = (ArrayList)var9_9.Z();
                                    }
                                    catch (InvocationTargetException v17) {
                                        throw v17.getTargetException();
                                    }
                                    var10_10 = v16;
                                    v18 = var10_10.iterator();
                                    if (var3_8 != null) break block95;
                                    var11_11 = v18;
                                    while (var11_11.hasNext()) {
                                        var12_12 = (lj_2)var11_11.next();
                                        try {
                                            v19 = (String)var12_12.g();
                                        }
                                        catch (InvocationTargetException v20) {
                                            throw v20.getTargetException();
                                        }
                                        v15 = var6_5.containsKey(v19);
                                        if (var3_8 != null) continue block54;
                                        if (var3_8 == null && !v15) {
                                            var7_6.add((lj_2)var12_12);
                                        }
                                        if (var3_8 == null) continue;
                                    }
                                    if (var3_8 == null) continue block53;
                                }
                                break;
                            }
                            v18 = var8_7 = var5_4.keySet().iterator();
                        }
                        while (var8_7.hasNext()) {
                            var9_9 = (String)var8_7.next();
                            var10_10 = (lj_2)var5_4.get(var9_9);
                            if (var3_8 == null) {
                                if (var3_8 == null) continue;
                            }
                            break block96;
                        }
                        var8_7 = var6_5.keySet().iterator();
                    }
                    while (var8_7.hasNext()) {
                        var9_9 = (String)var8_7.next();
                        var10_10 = (lj_2)var6_5.get(var9_9);
                        if (var10_10 != null) {
                            // empty if block
                        }
                        if (var3_8 == null) continue;
                    }
                    try {
                        v21 = (ArrayList)le_2.d((Object)var1_1, (Object)var2_2, new lj_2(), var5_4, var6_5, var4_3, var7_6);
                    }
                    catch (InvocationTargetException v22) {
                        throw v22.getTargetException();
                    }
                    var8_7 = v21;
                    var9_9 = var8_7.iterator();
                    while (var9_9.hasNext()) {
                        var10_10 = (lj_2)var9_9.next();
                        if (var3_8 == null) continue;
                    }
                    var9_9 = new HashMap<K, V>();
                    var10_10 = var0.iterator();
                    while (var10_10.hasNext()) {
                        var11_11 = (li_2)var10_10.next();
                        try {
                            v23 = (String)var11_11.g();
                        }
                        catch (InvocationTargetException v24) {
                            throw v24.getTargetException();
                        }
                        var9_9.put(v23, var11_11);
                        if (var3_8 == null) {
                            if (var3_8 == null) continue;
                        }
                        break block97;
                    }
                    var10_10 = var0.iterator();
                }
                while (var10_10.hasNext()) {
                    var11_11 = (li_2)var10_10.next();
                    try {
                        v25 = (ArrayList)var11_11.Z();
                    }
                    catch (InvocationTargetException v26) {
                        throw v26.getTargetException();
                    }
                    v25.clear();
                    if (var3_8 == null) {
                        if (var3_8 == null) continue;
                    }
                    break block98;
                }
                var10_10 = var8_7.iterator();
            }
            while (var10_10.hasNext()) {
                var11_11 = (lj_2)var10_10.next();
                try {
                    v27 = (String)var11_11.J();
                }
                catch (InvocationTargetException v28) {
                    throw v28.getTargetException();
                }
                var12_12 = (li_2)var9_9.get(v27);
                v29 /* !! */  = var12_12;
                if (var3_8 == null) {
                    if (v29 /* !! */  != null) {
                        try {
                            v30 = (Boolean)le_2.H(var11_11);
                        }
                        catch (InvocationTargetException v31) {
                            throw v31.getTargetException();
                        }
                        v32 = var13_13 = v30;
                        if (var3_8 == null && !v32) {
                            try {
                                v33 = (ArrayList)var12_12.Z();
                            }
                            catch (InvocationTargetException v34) {
                                throw v34.getTargetException();
                            }
                            v32 = v33.add(var11_11);
                        }
                    }
                    if (var3_8 == null) continue;
                }
                ** GOTO lbl231
            }
            var10_10 = var0.iterator();
            while (var10_10.hasNext()) {
                var11_11 = (li_2)var10_10.next();
                try {
                    v35 = (ArrayList)var11_11.Z();
                }
                catch (InvocationTargetException v36) {
                    throw v36.getTargetException();
                }
                var12_12 = v35;
                try {
                    le_2.O(var12_12);
                }
                catch (InvocationTargetException v37) {
                    throw v37.getTargetException();
                }
                if (var3_8 == null) {
                    if (var3_8 == null) continue;
                }
                break block99;
            }
            var10_10 = var8_7.iterator();
        }
        while (var10_10.hasNext()) {
            var11_11 = (lj_2)var10_10.next();
            try {
                v38 = (String)var11_11.g();
            }
            catch (InvocationTargetException v39) {
                throw v39.getTargetException();
            }
            v29 /* !! */  = var5_4.get(v38);
lbl231:
            // 2 sources

            var12_12 = v29 /* !! */ ;
            try {
                v40 = (String)var11_11.g();
            }
            catch (InvocationTargetException v41) {
                throw v41.getTargetException();
            }
            v42 /* !! */  = var6_5.get(v40);
            block64: while (true) {
                var13_14 = (lj_2)v42 /* !! */ ;
                v43 = (var12_12 != null ? 1 : 0) & (var13_14 != null ? 1 : 0);
                if (var3_8 == null) {
                    if (v43 == 0) break;
                    v43 = var14_15 = 0;
                }
                while (var14_15 < lj_2.m) {
                    block104: {
                        block105: {
                            block102: {
                                block103: {
                                    var15_16 = "#" + (var14_15 + 1);
                                    try {
                                        v44 = (dx_2)var12_12.m(var15_16);
                                    }
                                    catch (InvocationTargetException v45) {
                                        throw v45.getTargetException();
                                    }
                                    var16_17 = v44;
                                    try {
                                        v46 = (dx_2)var12_12.m(var15_16);
                                    }
                                    catch (InvocationTargetException v47) {
                                        throw v47.getTargetException();
                                    }
                                    var17_18 = v46;
                                    var18_19 = null;
                                    v42 /* !! */  = var16_17;
                                    if (var3_8 != null) continue block64;
                                    if (var3_8 == null) {
                                        if (v42 /* !! */  != null) {
                                            v48 = var17_18;
                                            if (var3_8 == null) {
                                                if (v48 != null) {
                                                    try {
                                                        v49 = var16_17.V();
                                                    }
                                                    catch (InvocationTargetException v50) {
                                                        throw v50.getTargetException();
                                                    }
                                                    try {
                                                        v51 = var17_18.V();
                                                    }
                                                    catch (InvocationTargetException v52) {
                                                        throw v52.getTargetException();
                                                    }
                                                    try {
                                                        v53 = (ArrayList)TE.g(v49, v51);
                                                    }
                                                    catch (InvocationTargetException v54) {
                                                        throw v54.getTargetException();
                                                    }
                                                    var19_20 = v53;
                                                    var18_19 = var16_17;
                                                    try {
                                                        var18_19.z(var19_20);
                                                    }
                                                    catch (InvocationTargetException v55) {
                                                        throw v55.getTargetException();
                                                    }
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            v48 = var16_17;
                                        }
                                    }
                                    if (var3_8 != null) break block102;
                                    if (v48 != null) break block103;
                                    var18_19 = var17_18;
                                    break block104;
                                }
                                v48 = var17_18;
                            }
                            if (var3_8 != null) break block105;
                            if (v48 != null) break block104;
                            v48 = var16_17;
                        }
                        var18_19 = v48;
                    }
                    ++var14_15;
                    if (var3_8 == null) continue;
                }
                break;
            }
            if (var3_8 == null) continue;
        }
    }

    public static ArrayList N(oc_0 oc_02) {
        ArrayList<li_2> arrayList;
        block74: {
            int n10;
            int[] nArray;
            int[] nArray2;
            block76: {
                int[] nArray3;
                int n11;
                block77: {
                    oc_0 oc_03;
                    block75: {
                        arrayList = new ArrayList<li_2>();
                        nArray2 = yb_1.Y();
                        nArray = null;
                        n10 = 0;
                        oc_03 = oc_02;
                        if (nArray2 != null) break block75;
                        if (oc_03.size() <= 0) break block76;
                        oc_03 = oc_02;
                    }
                    O0 o0 = oc_03.V(0);
                    n11 = o0.containsKey("order");
                    if (nArray2 != null) break block77;
                    if (n11 != 0) break block76;
                    n10 = 1;
                    n11 = oc_02.size();
                }
                try {
                    nArray3 = (int[])le_2.l(n11);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                nArray = nArray3;
            }
            int n12 = 0;
            block42: while (true) {
                int n13 = n12;
                block43: while (n13 < oc_02.size()) {
                    int n14;
                    int[] nArray4;
                    oc_0 oc_04;
                    String string;
                    li_2 li_22;
                    block82: {
                        int[] nArray5;
                        int n15;
                        block87: {
                            block86: {
                                block85: {
                                    block83: {
                                        O0 o0;
                                        block84: {
                                            oc_0 oc_05;
                                            block81: {
                                                int n16;
                                                O0 o02;
                                                block80: {
                                                    int n17;
                                                    block78: {
                                                        block79: {
                                                            li_22 = new li_2();
                                                            arrayList.add(li_22);
                                                            o02 = oc_02.V(n12);
                                                            try {
                                                                le_2.B((Object)li_22, (Object)o02);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            String string2 = o02.C("name");
                                                            try {
                                                                li_22.z(string2);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            string = o02.C("id");
                                                            try {
                                                                li_22.p(string);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            n16 = 0;
                                                            if (nArray2 != null) break block74;
                                                            n17 = n10;
                                                            if (nArray2 != null) break block78;
                                                            if (n17 == 0) break block79;
                                                            n16 = nArray[n12];
                                                            if (nArray2 == null) break block80;
                                                        }
                                                        n17 = o02.b("order");
                                                    }
                                                    n16 = n17;
                                                }
                                                try {
                                                    li_22.Z(n16);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                oc_04 = o02.J("commands");
                                                nArray4 = null;
                                                n14 = 0;
                                                oc_05 = oc_04;
                                                if (nArray2 != null) break block81;
                                                if (oc_05.size() <= 0) break block82;
                                                oc_05 = oc_04;
                                            }
                                            o0 = oc_05.V(0);
                                            n15 = o0.containsKey("order");
                                            if (nArray2 != null) break block83;
                                            if (n15 != 0) break block84;
                                            n14 = 1;
                                            if (nArray2 == null) break block85;
                                        }
                                        n15 = o0.b("order");
                                    }
                                    if (nArray2 != null) break block86;
                                    if (n15 == 0) {
                                        n14 = 1;
                                    }
                                }
                                n15 = n14;
                            }
                            if (nArray2 != null) break block87;
                            if (n15 == 0) break block82;
                            n15 = oc_04.size();
                        }
                        try {
                            nArray5 = (int[])le_2.l(n15);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        nArray4 = nArray5;
                    }
                    block44: for (int i2 = 0; i2 < oc_04.size(); ++i2) {
                        ArrayList arrayList2;
                        int n18;
                        lj_2 lj_22;
                        O0 o0;
                        block92: {
                            int n19;
                            block90: {
                                block91: {
                                    boolean bl;
                                    String string3;
                                    String string4;
                                    String string5;
                                    block89: {
                                        boolean bl2;
                                        block88: {
                                            o0 = oc_04.V(i2);
                                            string5 = o0.C("command");
                                            string4 = o0.C("name");
                                            string3 = o0.C("id");
                                            bl = true;
                                            n13 = o0.containsKey("append_cr") ? 1 : 0;
                                            if (nArray2 != null) continue block43;
                                            if (nArray2 != null) break block88;
                                            if (n13 == 0) break block89;
                                            bl2 = o0.G("append_cr");
                                        }
                                        bl = bl2;
                                    }
                                    lj_22 = new lj_2();
                                    try {
                                        le_2.B((Object)lj_22, (Object)o0);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        lj_22.w(string5);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        lj_22.z(string4);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        lj_22.f(bl);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        lj_22.R(string);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        lj_22.p(string3);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    n18 = 0;
                                    n19 = n14;
                                    if (nArray2 != null) break block90;
                                    if (n19 == 0) break block91;
                                    n18 = nArray4[i2];
                                    if (nArray2 == null) break block92;
                                }
                                n19 = o0.b("order");
                            }
                            n18 = n19;
                        }
                        try {
                            lj_22.Z(n18);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        int n20 = o0.containsKey("param_history");
                        if (nArray2 != null) continue;
                        if (n20 != 0) {
                            O0 o03 = o0.D("param_history");
                            Iterator iterator = o03.entrySet().iterator();
                            block45: while (true) {
                                boolean bl = iterator.hasNext();
                                block46: while (bl) {
                                    dx_2 dx_22;
                                    Map.Entry entry = (Map.Entry)iterator.next();
                                    String string6 = (String)entry.getKey();
                                    oc_0 oc_06 = (oc_0)entry.getValue();
                                    try {
                                        dx_22 = (dx_2)lj_22.m(string6);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    dx_2 dx_23 = dx_22;
                                    n20 = 0;
                                    if (nArray2 != null) continue block44;
                                    int n21 = n20;
                                    while (n21 < oc_06.size()) {
                                        L1 l1;
                                        O0 o04 = (O0)oc_06.get(n21);
                                        try {
                                            l1 = (L1)TE.Q(o04);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        L1 l12 = l1;
                                        if (nArray2 == null) {
                                            Object object;
                                            try {
                                                object = l12.A();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                bl = (Boolean)lk_0.Y(object);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (nArray2 != null) continue block46;
                                            if (!bl) {
                                                boolean bl3 = o04.containsKey("active_time");
                                                if (nArray2 == null) {
                                                    ArrayList arrayList3;
                                                    if (!bl3) {
                                                        long l2 = yt_1.yY - (long)(n12 * zj_0.a(17116, 653507205623955746L) * zj_0.a(17322, 2548841518271610965L));
                                                        try {
                                                            l12.V(l2);
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                    try {
                                                        arrayList3 = (ArrayList)dx_23.V();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    bl3 = arrayList3.add(l12);
                                                }
                                            }
                                            ++n21;
                                        }
                                        if (nArray2 == null) continue;
                                    }
                                    if (nArray2 == null) continue block45;
                                }
                                break;
                            }
                        }
                        try {
                            arrayList2 = (ArrayList)li_22.Z();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n20 = arrayList2.add(lj_22);
                        if (nArray2 == null) continue;
                    }
                    ++n12;
                    if (nArray2 == null) continue block42;
                }
                break;
            }
            try {
                le_2.O(arrayList);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        return arrayList;
    }

    public static oc_0 y(ArrayList arrayList) {
        oc_0 oc_02;
        block35: {
            oc_0 oc_03 = new oc_0();
            int[] nArray = yb_1.Y();
            int n10 = 0;
            block26: while (true) {
                int n11 = n10;
                block27: while (n11 < arrayList.size()) {
                    int n12;
                    String string;
                    String string2;
                    ArrayList arrayList2;
                    li_2 li_22 = (li_2)arrayList.get(n10);
                    try {
                        arrayList2 = (ArrayList)li_22.Z();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ArrayList arrayList3 = arrayList2;
                    O0 o0 = new O0();
                    try {
                        string2 = (String)li_22.F();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    o0.C("name", string2);
                    try {
                        string = (String)li_22.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    o0.C("id", string);
                    try {
                        n12 = (Integer)li_22.Y();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    o0.C("order", n12);
                    try {
                        le_2.b((Object)li_22, (Object)o0);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    oc_0 oc_04 = new oc_0();
                    Object object = o0.C("commands", oc_04);
                    block28: while (true) {
                        oc_02 = oc_03;
                        if (nArray != null) break block35;
                        oc_02.add(o0);
                        for (int i2 = 0; i2 < arrayList3.size(); ++i2) {
                            boolean bl;
                            String string3;
                            String string4;
                            String string5;
                            lj_2 lj_22 = (lj_2)arrayList3.get(i2);
                            O0 o02 = new O0();
                            oc_04.add(o02);
                            try {
                                string5 = (String)lj_22.F();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            o02.C("name", string5);
                            try {
                                string4 = (String)lj_22.l();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            o02.C("command", string4);
                            try {
                                string3 = (String)lj_22.g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            o02.C("id", string3);
                            try {
                                bl = (Boolean)lj_22.o();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            o02.C("append_cr", bl);
                            try {
                                le_2.b((Object)lj_22, (Object)o02);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            O0 o03 = new O0();
                            o02.C("param_history", o03);
                            n11 = 0;
                            if (nArray != null) continue block27;
                            int n13 = n11;
                            while (n13 < lj_2.m) {
                                block36: {
                                    dx_2 dx_22;
                                    String string6 = "#" + (n13 + 1);
                                    try {
                                        dx_22 = (dx_2)lj_22.m(string6);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    dx_2 dx_23 = dx_22;
                                    if (nArray == null) {
                                        object = dx_23;
                                        if (nArray != null) continue block28;
                                        if (object != null) {
                                            ArrayList arrayList4;
                                            oc_0 oc_05 = new oc_0();
                                            try {
                                                arrayList4 = (ArrayList)dx_23.V();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            for (L1 l1 : arrayList4) {
                                                O0 o04;
                                                try {
                                                    o04 = (O0)TE.Z(l1);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                O0 o05 = o04;
                                                oc_05.add(o05);
                                                if (nArray == null) {
                                                    if (nArray == null) continue;
                                                }
                                                break block36;
                                            }
                                            o03.C(string6, oc_05);
                                        }
                                        ++n13;
                                    }
                                }
                                if (nArray == null) continue;
                            }
                            if (nArray == null) continue;
                        }
                        break;
                    }
                    ++n10;
                    if (nArray == null) continue block26;
                }
                break;
            }
            oc_02 = oc_03;
        }
        return oc_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[15];
                        var11_1 = 0;
                        var10_2 = "=\u0085;\u008c\u0007\\\u00bd\u00bbL\u00ac\u0003\u0096\u000bJ\u0089\"C\u00b2m\u009b\f\u001fD\u00d6\u0002B\u0083\b@\u00b68-\u00dc/\u0098)\t\u00f5j\u00d1BP\u00c1\u00dc\u00af\u00ec\u0002Kt\u0005\u000ecu!N\u0007\u0014\u0016\u00b29\u008d\u00ad\u00b2\b\u0017@\u00d2\u00f3\u0081\u00f43R\u0005g\"X\t\u00eb\r\u008c&\u00cf\u00fc\u00d2\u00a9\u00d8\u00f4\u00bc\u00fc\u00f1m\u00e1\tf4\u00a3\u0089\u001e\u00b8\u0015\u0080\u00d5";
                        var12_3 = "=\u0085;\u008c\u0007\\\u00bd\u00bbL\u00ac\u0003\u0096\u000bJ\u0089\"C\u00b2m\u009b\f\u001fD\u00d6\u0002B\u0083\b@\u00b68-\u00dc/\u0098)\t\u00f5j\u00d1BP\u00c1\u00dc\u00af\u00ec\u0002Kt\u0005\u000ecu!N\u0007\u0014\u0016\u00b29\u008d\u00ad\u00b2\b\u0017@\u00d2\u00f3\u0081\u00f43R\u0005g\"X\t\u00eb\r\u008c&\u00cf\u00fc\u00d2\u00a9\u00d8\u00f4\u00bc\u00fc\u00f1m\u00e1\tf4\u00a3\u0089\u001e\u00b8\u0015\u0080\u00d5".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 70;
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
                            var10_2 = "\u00b1\u00c6+e\r\u00a0\u0086\u00cbi\u00d3\u009ay\u0013\t\u0081\u00c6C\u0086";
                            var12_3 = "\u00b1\u00c6+e\r\u00a0\u0086\u00cbi\u00d3\u009ay\u0013\t\u0081\u00c6C\u0086".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 99;
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
                                    v15 = 22;
                                    break;
                                }
                                case 1: {
                                    v15 = 119;
                                    break;
                                }
                                case 2: {
                                    v15 = 30;
                                    break;
                                }
                                case 3: {
                                    v15 = 116;
                                    break;
                                }
                                case 4: {
                                    v15 = 55;
                                    break;
                                }
                                case 5: {
                                    v15 = 36;
                                    break;
                                }
                                default: {
                                    v15 = 66;
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
                zj_0.a = var13;
                zj_0.b = new String[15];
                var0_7 = 7454250973774587374L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u00da\u00c4\u00b5(k)fSU\u00a0pd\u007f.d\u00f0";
                var5_11 = "\u00da\u00c4\u00b5(k)fSU\u00a0pd\u007f.d\u00f0".length();
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
        zj_0.c = var6_8;
        zj_0.d = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFDE70) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 210;
                    break;
                }
                case 1: {
                    n14 = 106;
                    break;
                }
                case 2: {
                    n14 = 244;
                    break;
                }
                case 3: {
                    n14 = 147;
                    break;
                }
                case 4: {
                    n14 = 82;
                    break;
                }
                case 5: {
                    n14 = 222;
                    break;
                }
                case 6: {
                    n14 = 43;
                    break;
                }
                case 7: {
                    n14 = 217;
                    break;
                }
                case 8: {
                    n14 = 86;
                    break;
                }
                case 9: {
                    n14 = 14;
                    break;
                }
                case 10: {
                    n14 = 130;
                    break;
                }
                case 11: {
                    n14 = 145;
                    break;
                }
                case 12: {
                    n14 = 186;
                    break;
                }
                case 13: {
                    n14 = 79;
                    break;
                }
                case 14: {
                    n14 = 245;
                    break;
                }
                case 15: {
                    n14 = 250;
                    break;
                }
                case 16: {
                    n14 = 135;
                    break;
                }
                case 17: {
                    n14 = 166;
                    break;
                }
                case 18: {
                    n14 = 207;
                    break;
                }
                case 19: {
                    n14 = 12;
                    break;
                }
                case 20: {
                    n14 = 148;
                    break;
                }
                case 21: {
                    n14 = 134;
                    break;
                }
                case 22: {
                    n14 = 205;
                    break;
                }
                case 23: {
                    n14 = 168;
                    break;
                }
                case 24: {
                    n14 = 105;
                    break;
                }
                case 25: {
                    n14 = 35;
                    break;
                }
                case 26: {
                    n14 = 241;
                    break;
                }
                case 27: {
                    n14 = 216;
                    break;
                }
                case 28: {
                    n14 = 235;
                    break;
                }
                case 29: {
                    n14 = 192;
                    break;
                }
                case 30: {
                    n14 = 77;
                    break;
                }
                case 31: {
                    n14 = 182;
                    break;
                }
                case 32: {
                    n14 = 170;
                    break;
                }
                case 33: {
                    n14 = 92;
                    break;
                }
                case 34: {
                    n14 = 126;
                    break;
                }
                case 35: {
                    n14 = 32;
                    break;
                }
                case 36: {
                    n14 = 151;
                    break;
                }
                case 37: {
                    n14 = 65;
                    break;
                }
                case 38: {
                    n14 = 62;
                    break;
                }
                case 39: {
                    n14 = 97;
                    break;
                }
                case 40: {
                    n14 = 17;
                    break;
                }
                case 41: {
                    n14 = 71;
                    break;
                }
                case 42: {
                    n14 = 13;
                    break;
                }
                case 43: {
                    n14 = 236;
                    break;
                }
                case 44: {
                    n14 = 22;
                    break;
                }
                case 45: {
                    n14 = 89;
                    break;
                }
                case 46: {
                    n14 = 220;
                    break;
                }
                case 47: {
                    n14 = 117;
                    break;
                }
                case 48: {
                    n14 = 20;
                    break;
                }
                case 49: {
                    n14 = 251;
                    break;
                }
                case 50: {
                    n14 = 206;
                    break;
                }
                case 51: {
                    n14 = 139;
                    break;
                }
                case 52: {
                    n14 = 118;
                    break;
                }
                case 53: {
                    n14 = 30;
                    break;
                }
                case 54: {
                    n14 = 28;
                    break;
                }
                case 55: {
                    n14 = 101;
                    break;
                }
                case 56: {
                    n14 = 133;
                    break;
                }
                case 57: {
                    n14 = 165;
                    break;
                }
                case 58: {
                    n14 = 185;
                    break;
                }
                case 59: {
                    n14 = 9;
                    break;
                }
                case 60: {
                    n14 = 193;
                    break;
                }
                case 61: {
                    n14 = 45;
                    break;
                }
                case 62: {
                    n14 = 178;
                    break;
                }
                case 63: {
                    n14 = 214;
                    break;
                }
                case 64: {
                    n14 = 119;
                    break;
                }
                case 65: {
                    n14 = 2;
                    break;
                }
                case 66: {
                    n14 = 194;
                    break;
                }
                case 67: {
                    n14 = 221;
                    break;
                }
                case 68: {
                    n14 = 174;
                    break;
                }
                case 69: {
                    n14 = 47;
                    break;
                }
                case 70: {
                    n14 = 44;
                    break;
                }
                case 71: {
                    n14 = 100;
                    break;
                }
                case 72: {
                    n14 = 198;
                    break;
                }
                case 73: {
                    n14 = 239;
                    break;
                }
                case 74: {
                    n14 = 189;
                    break;
                }
                case 75: {
                    n14 = 8;
                    break;
                }
                case 76: {
                    n14 = 231;
                    break;
                }
                case 77: {
                    n14 = 247;
                    break;
                }
                case 78: {
                    n14 = 177;
                    break;
                }
                case 79: {
                    n14 = 16;
                    break;
                }
                case 80: {
                    n14 = 153;
                    break;
                }
                case 81: {
                    n14 = 1;
                    break;
                }
                case 82: {
                    n14 = 103;
                    break;
                }
                case 83: {
                    n14 = 171;
                    break;
                }
                case 84: {
                    n14 = 87;
                    break;
                }
                case 85: {
                    n14 = 37;
                    break;
                }
                case 86: {
                    n14 = 3;
                    break;
                }
                case 87: {
                    n14 = 248;
                    break;
                }
                case 88: {
                    n14 = 240;
                    break;
                }
                case 89: {
                    n14 = 252;
                    break;
                }
                case 90: {
                    n14 = 90;
                    break;
                }
                case 91: {
                    n14 = 25;
                    break;
                }
                case 92: {
                    n14 = 156;
                    break;
                }
                case 93: {
                    n14 = 84;
                    break;
                }
                case 94: {
                    n14 = 33;
                    break;
                }
                case 95: {
                    n14 = 38;
                    break;
                }
                case 96: {
                    n14 = 219;
                    break;
                }
                case 97: {
                    n14 = 40;
                    break;
                }
                case 98: {
                    n14 = 237;
                    break;
                }
                case 99: {
                    n14 = 81;
                    break;
                }
                case 100: {
                    n14 = 50;
                    break;
                }
                case 101: {
                    n14 = 167;
                    break;
                }
                case 102: {
                    n14 = 232;
                    break;
                }
                case 103: {
                    n14 = 7;
                    break;
                }
                case 104: {
                    n14 = 94;
                    break;
                }
                case 105: {
                    n14 = 141;
                    break;
                }
                case 106: {
                    n14 = 179;
                    break;
                }
                case 107: {
                    n14 = 55;
                    break;
                }
                case 108: {
                    n14 = 175;
                    break;
                }
                case 109: {
                    n14 = 137;
                    break;
                }
                case 110: {
                    n14 = 91;
                    break;
                }
                case 111: {
                    n14 = 243;
                    break;
                }
                case 112: {
                    n14 = 18;
                    break;
                }
                case 113: {
                    n14 = 107;
                    break;
                }
                case 114: {
                    n14 = 120;
                    break;
                }
                case 115: {
                    n14 = 23;
                    break;
                }
                case 116: {
                    n14 = 190;
                    break;
                }
                case 117: {
                    n14 = 173;
                    break;
                }
                case 118: {
                    n14 = 4;
                    break;
                }
                case 119: {
                    n14 = 125;
                    break;
                }
                case 120: {
                    n14 = 128;
                    break;
                }
                case 121: {
                    n14 = 56;
                    break;
                }
                case 122: {
                    n14 = 74;
                    break;
                }
                case 123: {
                    n14 = 184;
                    break;
                }
                case 124: {
                    n14 = 253;
                    break;
                }
                case 125: {
                    n14 = 109;
                    break;
                }
                case 126: {
                    n14 = 204;
                    break;
                }
                case 127: {
                    n14 = 127;
                    break;
                }
                case 128: {
                    n14 = 238;
                    break;
                }
                case 129: {
                    n14 = 197;
                    break;
                }
                case 130: {
                    n14 = 149;
                    break;
                }
                case 131: {
                    n14 = 157;
                    break;
                }
                case 132: {
                    n14 = 76;
                    break;
                }
                case 133: {
                    n14 = 246;
                    break;
                }
                case 134: {
                    n14 = 52;
                    break;
                }
                case 135: {
                    n14 = 152;
                    break;
                }
                case 136: {
                    n14 = 255;
                    break;
                }
                case 137: {
                    n14 = 19;
                    break;
                }
                case 138: {
                    n14 = 99;
                    break;
                }
                case 139: {
                    n14 = 129;
                    break;
                }
                case 140: {
                    n14 = 211;
                    break;
                }
                case 141: {
                    n14 = 72;
                    break;
                }
                case 142: {
                    n14 = 113;
                    break;
                }
                case 143: {
                    n14 = 24;
                    break;
                }
                case 144: {
                    n14 = 187;
                    break;
                }
                case 145: {
                    n14 = 115;
                    break;
                }
                case 146: {
                    n14 = 140;
                    break;
                }
                case 147: {
                    n14 = 27;
                    break;
                }
                case 148: {
                    n14 = 108;
                    break;
                }
                case 149: {
                    n14 = 144;
                    break;
                }
                case 150: {
                    n14 = 142;
                    break;
                }
                case 151: {
                    n14 = 254;
                    break;
                }
                case 152: {
                    n14 = 181;
                    break;
                }
                case 153: {
                    n14 = 234;
                    break;
                }
                case 154: {
                    n14 = 212;
                    break;
                }
                case 155: {
                    n14 = 80;
                    break;
                }
                case 156: {
                    n14 = 154;
                    break;
                }
                case 157: {
                    n14 = 138;
                    break;
                }
                case 158: {
                    n14 = 164;
                    break;
                }
                case 159: {
                    n14 = 78;
                    break;
                }
                case 160: {
                    n14 = 208;
                    break;
                }
                case 161: {
                    n14 = 31;
                    break;
                }
                case 162: {
                    n14 = 110;
                    break;
                }
                case 163: {
                    n14 = 146;
                    break;
                }
                case 164: {
                    n14 = 143;
                    break;
                }
                case 165: {
                    n14 = 60;
                    break;
                }
                case 166: {
                    n14 = 201;
                    break;
                }
                case 167: {
                    n14 = 180;
                    break;
                }
                case 168: {
                    n14 = 36;
                    break;
                }
                case 169: {
                    n14 = 0;
                    break;
                }
                case 170: {
                    n14 = 163;
                    break;
                }
                case 171: {
                    n14 = 196;
                    break;
                }
                case 172: {
                    n14 = 54;
                    break;
                }
                case 173: {
                    n14 = 51;
                    break;
                }
                case 174: {
                    n14 = 111;
                    break;
                }
                case 175: {
                    n14 = 42;
                    break;
                }
                case 176: {
                    n14 = 233;
                    break;
                }
                case 177: {
                    n14 = 49;
                    break;
                }
                case 178: {
                    n14 = 96;
                    break;
                }
                case 179: {
                    n14 = 161;
                    break;
                }
                case 180: {
                    n14 = 203;
                    break;
                }
                case 181: {
                    n14 = 202;
                    break;
                }
                case 182: {
                    n14 = 114;
                    break;
                }
                case 183: {
                    n14 = 132;
                    break;
                }
                case 184: {
                    n14 = 249;
                    break;
                }
                case 185: {
                    n14 = 41;
                    break;
                }
                case 186: {
                    n14 = 69;
                    break;
                }
                case 187: {
                    n14 = 64;
                    break;
                }
                case 188: {
                    n14 = 104;
                    break;
                }
                case 189: {
                    n14 = 95;
                    break;
                }
                case 190: {
                    n14 = 218;
                    break;
                }
                case 191: {
                    n14 = 158;
                    break;
                }
                case 192: {
                    n14 = 242;
                    break;
                }
                case 193: {
                    n14 = 215;
                    break;
                }
                case 194: {
                    n14 = 53;
                    break;
                }
                case 195: {
                    n14 = 58;
                    break;
                }
                case 196: {
                    n14 = 169;
                    break;
                }
                case 197: {
                    n14 = 226;
                    break;
                }
                case 198: {
                    n14 = 229;
                    break;
                }
                case 199: {
                    n14 = 34;
                    break;
                }
                case 200: {
                    n14 = 155;
                    break;
                }
                case 201: {
                    n14 = 162;
                    break;
                }
                case 202: {
                    n14 = 29;
                    break;
                }
                case 203: {
                    n14 = 59;
                    break;
                }
                case 204: {
                    n14 = 61;
                    break;
                }
                case 205: {
                    n14 = 116;
                    break;
                }
                case 206: {
                    n14 = 200;
                    break;
                }
                case 207: {
                    n14 = 21;
                    break;
                }
                case 208: {
                    n14 = 131;
                    break;
                }
                case 209: {
                    n14 = 88;
                    break;
                }
                case 210: {
                    n14 = 57;
                    break;
                }
                case 211: {
                    n14 = 5;
                    break;
                }
                case 212: {
                    n14 = 98;
                    break;
                }
                case 213: {
                    n14 = 123;
                    break;
                }
                case 214: {
                    n14 = 223;
                    break;
                }
                case 215: {
                    n14 = 85;
                    break;
                }
                case 216: {
                    n14 = 195;
                    break;
                }
                case 217: {
                    n14 = 83;
                    break;
                }
                case 218: {
                    n14 = 102;
                    break;
                }
                case 219: {
                    n14 = 26;
                    break;
                }
                case 220: {
                    n14 = 121;
                    break;
                }
                case 221: {
                    n14 = 122;
                    break;
                }
                case 222: {
                    n14 = 6;
                    break;
                }
                case 223: {
                    n14 = 213;
                    break;
                }
                case 224: {
                    n14 = 63;
                    break;
                }
                case 225: {
                    n14 = 75;
                    break;
                }
                case 226: {
                    n14 = 227;
                    break;
                }
                case 227: {
                    n14 = 39;
                    break;
                }
                case 228: {
                    n14 = 46;
                    break;
                }
                case 229: {
                    n14 = 230;
                    break;
                }
                case 230: {
                    n14 = 199;
                    break;
                }
                case 231: {
                    n14 = 11;
                    break;
                }
                case 232: {
                    n14 = 66;
                    break;
                }
                case 233: {
                    n14 = 48;
                    break;
                }
                case 234: {
                    n14 = 70;
                    break;
                }
                case 235: {
                    n14 = 224;
                    break;
                }
                case 236: {
                    n14 = 183;
                    break;
                }
                case 237: {
                    n14 = 112;
                    break;
                }
                case 238: {
                    n14 = 225;
                    break;
                }
                case 239: {
                    n14 = 176;
                    break;
                }
                case 240: {
                    n14 = 191;
                    break;
                }
                case 241: {
                    n14 = 209;
                    break;
                }
                case 242: {
                    n14 = 68;
                    break;
                }
                case 243: {
                    n14 = 159;
                    break;
                }
                case 244: {
                    n14 = 172;
                    break;
                }
                case 245: {
                    n14 = 228;
                    break;
                }
                case 246: {
                    n14 = 150;
                    break;
                }
                case 247: {
                    n14 = 73;
                    break;
                }
                case 248: {
                    n14 = 188;
                    break;
                }
                case 249: {
                    n14 = 15;
                    break;
                }
                case 250: {
                    n14 = 67;
                    break;
                }
                case 251: {
                    n14 = 10;
                    break;
                }
                case 252: {
                    n14 = 93;
                    break;
                }
                case 253: {
                    n14 = 124;
                    break;
                }
                case 254: {
                    n14 = 136;
                    break;
                }
                default: {
                    n14 = 160;
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
            zj_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3FF;
        if (d[n11] == null) {
            zj_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

