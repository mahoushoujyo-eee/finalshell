/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BB;
import com.FV;
import com.c8_0;
import com.ew_0;
import com.gs_0;
import com.gw_0;
import com.iw_0;
import com.on_0;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public final class NE {
    private static final List Y;
    private static final iw_0 J;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] f;

    public static String h(String string) {
        return string.replaceAll(NE.a(31683, -30844), "");
    }

    public static Integer m(String string) {
        int n10;
        block13: {
            StringBuilder stringBuilder = new StringBuilder("");
            String string2 = FV.D();
            for (int i2 = 0; i2 < string.length(); ++i2) {
                int n11;
                block14: {
                    char c2 = string.charAt(i2);
                    try {
                        block15: {
                            try {
                                try {
                                    try {
                                        n10 = Character.isDigit(c2) ? 1 : 0;
                                        if (string2 != null) break block13;
                                        if (string2 != null) break block14;
                                    }
                                    catch (gs_0 gs_02) {
                                        throw NE.a(gs_02);
                                    }
                                    if (n10 == 0) break block15;
                                }
                                catch (gs_0 gs_03) {
                                    throw NE.a(gs_03);
                                }
                                stringBuilder.append(c2);
                                if (string2 == null) continue;
                            }
                            catch (gs_0 gs_04) {
                                throw NE.a(gs_04);
                            }
                        }
                        n11 = stringBuilder.length();
                    }
                    catch (gs_0 gs_05) {
                        throw NE.a(gs_05);
                    }
                }
                try {
                    try {
                        if (n11 > 0 && string2 == null) break;
                        continue;
                    }
                    catch (gs_0 gs_06) {
                        throw NE.a(gs_06);
                    }
                }
                catch (gs_0 gs_07) {
                    throw NE.a(gs_07);
                }
            }
            n10 = Integer.parseInt(stringBuilder.toString());
        }
        return n10;
    }

    /*
     * Exception decompiling
     */
    public static String H(String var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[DOLOOP]], but top level block is 3[TRYBLOCK]
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

    public static int a(String string, int n10) {
        int n11;
        block7: {
            int n12;
            String string2 = FV.D();
            for (n12 = n10; n12 > 0; --n12) {
                try {
                    try {
                        try {
                            n11 = Y.contains(string.substring(n12 - 1, n12)) ? 1 : 0;
                            if (string2 != null || string2 != null) break block7;
                        }
                        catch (gs_0 gs_02) {
                            throw NE.a(gs_02);
                        }
                        if (n11 != 0) break;
                        continue;
                    }
                    catch (gs_0 gs_03) {
                        throw NE.a(gs_03);
                    }
                }
                catch (gs_0 gs_04) {
                    throw NE.a(gs_04);
                }
            }
            n11 = n12;
        }
        return n11;
    }

    public static int S(String string, int n10) {
        int n11;
        block7: {
            int n12;
            String string2 = FV.D();
            for (n12 = n10; n12 < string.length() - 1; ++n12) {
                try {
                    try {
                        try {
                            n11 = Y.contains(string.substring(n12, n12 + 1)) ? 1 : 0;
                            if (string2 != null || string2 != null) break block7;
                        }
                        catch (gs_0 gs_02) {
                            throw NE.a(gs_02);
                        }
                        if (n11 != 0) break;
                        continue;
                    }
                    catch (gs_0 gs_03) {
                        throw NE.a(gs_03);
                    }
                }
                catch (gs_0 gs_04) {
                    throw NE.a(gs_04);
                }
            }
            n11 = n12;
        }
        return n11;
    }

    public static String c(String string, int n10) {
        String string2;
        block6: {
            int n11 = 0;
            String string3 = FV.D();
            for (int i2 = 0; i2 < n10; ++i2) {
                block7: {
                    try {
                        string2 = string;
                        if (string3 != null) break block6;
                        if (string3 != null) break block7;
                    }
                    catch (gs_0 gs_02) {
                        throw NE.a(gs_02);
                    }
                    n11 = string2.indexOf("\n", n11);
                    try {
                        if (n11 != -1) {
                            ++n11;
                            if (string3 == null) continue;
                        }
                    }
                    catch (gs_0 gs_03) {
                        throw NE.a(gs_03);
                    }
                    string2 = "";
                }
                return string2;
            }
            string2 = string.substring(n11);
        }
        return string2;
    }

    public static List q(String string, String string2) {
        return Arrays.asList(string.split(string2));
    }

    public static Point z(String string) {
        return NE.Y(string, ",");
    }

    public static Point Y(String string, String string2) {
        Point point;
        String[] stringArray = string.split(string2);
        try {
            point = stringArray.length == 2 ? new Point(Integer.parseInt(stringArray[0].trim()), Integer.parseInt(stringArray[1].trim())) : null;
        }
        catch (gs_0 gs_02) {
            throw NE.a(gs_02);
        }
        return point;
    }

    public static String H(String string) {
        int n10 = string.length();
        char[] cArray = new char[n10];
        string.getChars(0, n10, cArray, 0);
        int n11 = 0;
        int n12 = 0;
        String string2 = FV.D();
        while (n12 < n10) {
            block5: {
                block6: {
                    char c2 = cArray[n12];
                    try {
                        try {
                            if (string2 != null) break block5;
                            if (c2 < NE.a(19080, 5903540064681723344L)) break block6;
                        }
                        catch (gs_0 gs_02) {
                            throw NE.a(gs_02);
                        }
                        cArray[n11] = c2;
                        ++n11;
                    }
                    catch (gs_0 gs_03) {
                        throw NE.a(gs_03);
                    }
                }
                ++n12;
            }
            if (string2 == null) continue;
        }
        return string;
    }

    public static String w(String string, int n10, boolean bl) {
        String string2;
        block16: {
            String string3;
            StringBuilder stringBuilder;
            block21: {
                block22: {
                    int n11;
                    int n12;
                    String string4;
                    String string5;
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    string5 = FV.D();
                                    try {
                                        try {
                                            string2 = string;
                                            if (string5 != null) break block16;
                                            if (string2.length() > n10) break block17;
                                        }
                                        catch (gs_0 gs_02) {
                                            throw NE.a(gs_02);
                                        }
                                        string2 = string;
                                        break block16;
                                    }
                                    catch (gs_0 gs_03) {
                                        throw NE.a(gs_03);
                                    }
                                }
                                try {
                                    try {
                                        stringBuilder = new StringBuilder();
                                        string4 = string;
                                        n12 = 0;
                                        n11 = n10;
                                        if (string5 != null) break block18;
                                        if (n11 <= 3) break block19;
                                    }
                                    catch (gs_0 gs_04) {
                                        throw NE.a(gs_04);
                                    }
                                    n11 = bl ? 1 : 0;
                                }
                                catch (gs_0 gs_05) {
                                    throw NE.a(gs_05);
                                }
                            }
                            try {
                                try {
                                    if (string5 != null) break block20;
                                    if (n11 == 0) break block19;
                                }
                                catch (gs_0 gs_06) {
                                    throw NE.a(gs_06);
                                }
                                n11 = n10 - 3;
                                break block20;
                            }
                            catch (gs_0 gs_07) {
                                throw NE.a(gs_07);
                            }
                        }
                        n11 = n10;
                    }
                    try {
                        try {
                            string3 = string4.substring(n12, n11);
                            if (string5 != null) break block21;
                            stringBuilder = stringBuilder.append(string3);
                            if (!bl) break block22;
                        }
                        catch (gs_0 gs_08) {
                            throw NE.a(gs_08);
                        }
                        string3 = NE.a(31692, 6411);
                        break block21;
                    }
                    catch (gs_0 gs_09) {
                        throw NE.a(gs_09);
                    }
                }
                string3 = "";
            }
            string2 = stringBuilder.append(string3).toString();
        }
        return string2;
    }

    public static String O(String string, int n10, boolean bl) {
        String string2;
        block14: {
            int n11;
            int n12;
            String string3;
            StringBuilder stringBuilder;
            block18: {
                block17: {
                    String string4;
                    block16: {
                        String string5;
                        StringBuilder stringBuilder2;
                        block15: {
                            string4 = FV.D();
                            try {
                                try {
                                    string2 = string;
                                    if (string4 != null) break block14;
                                    if (string2.length() > n10) break block15;
                                }
                                catch (gs_0 gs_02) {
                                    throw NE.a(gs_02);
                                }
                                string2 = string;
                                break block14;
                            }
                            catch (gs_0 gs_03) {
                                throw NE.a(gs_03);
                            }
                        }
                        try {
                            stringBuilder2 = new StringBuilder();
                            string5 = bl ? NE.a(31688, -6818) : "";
                        }
                        catch (gs_0 gs_04) {
                            throw NE.a(gs_04);
                        }
                        try {
                            try {
                                stringBuilder = stringBuilder2.append(string5);
                                string3 = string;
                                n12 = string.length();
                                n11 = n10;
                                if (string4 != null) break block16;
                                if (n11 <= 3) break block17;
                            }
                            catch (gs_0 gs_05) {
                                throw NE.a(gs_05);
                            }
                            n11 = bl ? 1 : 0;
                        }
                        catch (gs_0 gs_06) {
                            throw NE.a(gs_06);
                        }
                    }
                    try {
                        try {
                            if (string4 != null) break block18;
                            if (n11 == 0) break block17;
                        }
                        catch (gs_0 gs_07) {
                            throw NE.a(gs_07);
                        }
                        n11 = n10 - 3;
                        break block18;
                    }
                    catch (gs_0 gs_08) {
                        throw NE.a(gs_08);
                    }
                }
                n11 = n10;
            }
            string2 = stringBuilder.append(string3.substring(n12 - n11)).toString();
        }
        return string2;
    }

    public static List D(String string, String string2) {
        ArrayList<String> arrayList;
        block5: {
            ArrayList<String> arrayList2 = new ArrayList<String>();
            String string3 = FV.D();
            if (string != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, string2, false);
                while (stringTokenizer.hasMoreTokens()) {
                    try {
                        arrayList = arrayList2;
                        if (string3 == null) {
                            arrayList.add(stringTokenizer.nextToken().trim());
                            if (string3 == null) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (gs_0 gs_02) {
                        throw NE.a(gs_02);
                    }
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static List x(String string, String string2) {
        List list = NE.D(string, string2);
        String string3 = FV.D();
        if (list != null) {
            ArrayList<Integer> arrayList;
            block5: {
                ArrayList<Integer> arrayList2 = new ArrayList<Integer>(list.size());
                for (String string4 : list) {
                    try {
                        arrayList = arrayList2;
                        if (string3 == null) {
                            arrayList.add(Integer.parseInt(string4));
                            if (string3 == null) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (gs_0 gs_02) {
                        throw NE.a(gs_02);
                    }
                }
                arrayList = arrayList2;
            }
            return arrayList;
        }
        return null;
    }

    public static String I(List list, String string) {
        return NE.b(list, string, J);
    }

    public static String b(List list, String string, c8_0 c8_02) {
        return NE.y(list, string, c8_02, null);
    }

    public static String y(List list, String string, c8_0 c8_02, on_0 on_02) {
        block13: {
            List list2;
            String string2;
            block12: {
                string2 = FV.D();
                try {
                    list2 = list;
                    if (string2 != null) break block12;
                    if (list2 == null) break block13;
                }
                catch (gs_0 gs_02) {
                    throw NE.a(gs_02);
                }
                list2 = list;
            }
            if (list2.size() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                boolean bl = false;
                for (Object e2 : list) {
                    block17: {
                        boolean bl2;
                        block18: {
                            block16: {
                                block15: {
                                    on_0 on_03;
                                    block14: {
                                        try {
                                            on_03 = on_02;
                                            if (string2 != null) break block14;
                                            if (on_03 == null) break block15;
                                        }
                                        catch (gs_0 gs_03) {
                                            throw NE.a(gs_03);
                                        }
                                        on_03 = on_02;
                                    }
                                    try {
                                        bl2 = on_03.n(e2);
                                        if (string2 != null) break block16;
                                        if (!bl2) break block17;
                                    }
                                    catch (gs_0 gs_04) {
                                        throw NE.a(gs_04);
                                    }
                                }
                                bl2 = bl;
                            }
                            try {
                                try {
                                    if (string2 != null) break block17;
                                    if (!bl2) break block18;
                                }
                                catch (gs_0 gs_05) {
                                    throw NE.a(gs_05);
                                }
                                stringBuilder.append(string);
                            }
                            catch (gs_0 gs_06) {
                                throw NE.a(gs_06);
                            }
                        }
                        stringBuilder.append(c8_02.C(e2));
                        bl2 = bl = true;
                    }
                    if (string2 == null) continue;
                }
                return stringBuilder.toString();
            }
        }
        return null;
    }

    public static String M(List list) {
        block12: {
            StringBuilder stringBuilder;
            block14: {
                int n10;
                String string;
                block13: {
                    List list2;
                    block11: {
                        string = FV.D();
                        try {
                            list2 = list;
                            if (string != null) break block11;
                            if (list2 == null) break block12;
                        }
                        catch (gs_0 gs_02) {
                            throw NE.a(gs_02);
                        }
                        list2 = list;
                    }
                    try {
                        try {
                            n10 = list2.size();
                            if (string != null) break block13;
                            if (n10 <= 0) break block12;
                        }
                        catch (gs_0 gs_03) {
                            throw NE.a(gs_03);
                        }
                        n10 = list.size() - 1;
                    }
                    catch (gs_0 gs_04) {
                        throw NE.a(gs_04);
                    }
                }
                int n11 = n10;
                StringBuilder stringBuilder2 = new StringBuilder();
                for (int i2 = 0; i2 <= n11; ++i2) {
                    String string2;
                    block16: {
                        block15: {
                            try {
                                try {
                                    stringBuilder2.append(list.get(i2));
                                    stringBuilder = stringBuilder2;
                                    if (string != null) break block14;
                                    if (i2 == n11) break block15;
                                }
                                catch (gs_0 gs_05) {
                                    throw NE.a(gs_05);
                                }
                                string2 = ",";
                                break block16;
                            }
                            catch (gs_0 gs_06) {
                                throw NE.a(gs_06);
                            }
                        }
                        string2 = "";
                    }
                    stringBuilder.append(string2);
                    if (string == null) continue;
                }
                stringBuilder = stringBuilder2;
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public static List e(String string, Class clazz) {
        ArrayList arrayList;
        block8: {
            block9: {
                String string2 = FV.D();
                if (string == null) break block9;
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",", false);
                arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    try {
                        arrayList.add(Enum.valueOf(clazz, stringTokenizer.nextToken().trim()));
                        if (string2 == null) {
                            if (string2 == null) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (gs_0 gs_02) {
                        throw NE.a(gs_02);
                    }
                }
                if (string2 == null) break block8;
            }
            arrayList = new ArrayList(0);
        }
        return arrayList;
    }

    public static String T(String string, String[] stringArray) {
        block15: {
            String[] stringArray2;
            String string2;
            block14: {
                string2 = FV.D();
                try {
                    stringArray2 = stringArray;
                    if (string2 != null) break block14;
                    if (stringArray2 == null) break block15;
                }
                catch (gs_0 gs_02) {
                    throw NE.a(gs_02);
                }
                stringArray2 = stringArray;
            }
            if (stringArray2.length > 0) {
                String string3;
                block17: {
                    StringBuilder stringBuilder = new StringBuilder();
                    boolean bl = false;
                    String[] stringArray3 = stringArray;
                    int n10 = stringArray3.length;
                    int n11 = 0;
                    while (n11 < n10) {
                        block16: {
                            block18: {
                                boolean bl2;
                                block19: {
                                    String string4;
                                    block20: {
                                        string4 = stringArray3[n11];
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (string2 != null) break block16;
                                                            string3 = string4;
                                                            if (string2 != null) break block17;
                                                        }
                                                        catch (gs_0 gs_03) {
                                                            throw NE.a(gs_03);
                                                        }
                                                        if (NE.B(string3)) break block18;
                                                    }
                                                    catch (gs_0 gs_04) {
                                                        throw NE.a(gs_04);
                                                    }
                                                    bl2 = bl;
                                                    if (string2 != null) break block19;
                                                }
                                                catch (gs_0 gs_05) {
                                                    throw NE.a(gs_05);
                                                }
                                                if (!bl2) break block20;
                                            }
                                            catch (gs_0 gs_06) {
                                                throw NE.a(gs_06);
                                            }
                                            stringBuilder.append(string);
                                        }
                                        catch (gs_0 gs_07) {
                                            throw NE.a(gs_07);
                                        }
                                    }
                                    stringBuilder.append(string4);
                                    bl2 = true;
                                }
                                bl = bl2;
                            }
                            ++n11;
                        }
                        if (string2 == null) continue;
                    }
                    string3 = stringBuilder.toString();
                }
                return string3;
            }
        }
        return "";
    }

    public static boolean B(String string) {
        boolean bl;
        block8: {
            block9: {
                block7: {
                    String string2;
                    String string3;
                    block6: {
                        string3 = FV.D();
                        try {
                            try {
                                string2 = string;
                                if (string3 != null) break block6;
                                if (string2 == null) break block7;
                            }
                            catch (gs_0 gs_02) {
                                throw NE.a(gs_02);
                            }
                            string2 = string.trim();
                        }
                        catch (gs_0 gs_03) {
                            throw NE.a(gs_03);
                        }
                    }
                    try {
                        bl = string2.isEmpty();
                        if (string3 != null) break block8;
                        if (!bl) break block9;
                    }
                    catch (gs_0 gs_04) {
                        throw NE.a(gs_04);
                    }
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public static String O(String string, int n10) {
        StringBuilder stringBuilder;
        block4: {
            StringBuilder stringBuilder2 = new StringBuilder(n10);
            String string2 = FV.D();
            while (n10-- > 0) {
                try {
                    stringBuilder = stringBuilder2.append(string);
                    if (string2 == null) {
                        if (string2 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (gs_0 gs_02) {
                    throw NE.a(gs_02);
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    public static String p(String var0, boolean var1_1, String var2_2, c8_0 var3_3) {
        block28: {
            var4_4 = FV.D();
            try {
                v0 = var1_1 != '\u0000' ? var2_2.toLowerCase() : var2_2;
            }
            catch (gs_0 v1) {
                throw NE.a(v1);
            }
            var5_5 = v0;
            var6_6 = 0;
            var7_7 = 0;
            var8_8 = new StringBuilder(var0.length());
            for (var9_9 = 0; var9_9 < var0.length(); ++var9_9) {
                block35: {
                    block32: {
                        block36: {
                            block33: {
                                block34: {
                                    block29: {
                                        block30: {
                                            var10_10 = var0.charAt(var9_9);
                                            try {
                                                try {
                                                    try {
                                                        v2 = var5_5;
                                                        if (var4_4 != null) break block28;
                                                        v3 = v2.charAt(var6_6);
                                                        v4 = var1_1;
                                                        if (var4_4 != null) break block29;
                                                    }
                                                    catch (gs_0 v5) {
                                                        throw NE.a(v5);
                                                    }
                                                    if (v4 == '\u0000') break block30;
                                                }
                                                catch (gs_0 v6) {
                                                    throw NE.a(v6);
                                                }
                                                v4 = Character.toLowerCase(var10_10);
                                                break block29;
                                            }
                                            catch (gs_0 v7) {
                                                throw NE.a(v7);
                                            }
                                        }
                                        v4 = var10_10;
                                    }
                                    try {
                                        try {
                                            try {
                                                block31: {
                                                    try {
                                                        if (v3 != v4) break block31;
                                                        ++var6_6;
                                                        if (var4_4 == null) break block32;
                                                    }
                                                    catch (gs_0 v8) {
                                                        throw NE.a(v8);
                                                    }
                                                }
                                                v9 = var5_5.charAt(0);
                                                v10 = var1_1;
                                                if (var4_4 != null) break block33;
                                            }
                                            catch (gs_0 v11) {
                                                throw NE.a(v11);
                                            }
                                            if (v10 == '\u0000') break block34;
                                        }
                                        catch (gs_0 v12) {
                                            throw NE.a(v12);
                                        }
                                        v10 = Character.toLowerCase(var10_10);
                                        break block33;
                                    }
                                    catch (gs_0 v13) {
                                        throw NE.a(v13);
                                    }
                                }
                                v10 = var10_10;
                            }
                            if (v9 != v10) break block36;
                            var6_6 = 1;
                            if (var4_4 == null) break block32;
                        }
                        var6_6 = 0;
                    }
                    try {
                        v14 = var6_6;
                        v15 = var5_5.length();
                        if (var4_4 != null) break block35;
                        if (v14 == v15) {
                        }
                        ** GOTO lbl87
                    }
                    catch (gs_0 v16) {
                        throw NE.a(v16);
                    }
                    var11_11 = var9_9 - var5_5.length() + 1;
                    var12_12 = var0.substring(var11_11, var11_11 + var5_5.length());
                    var8_8.append(var0.substring(var7_7, var11_11));
                    var8_8.append(var3_3.C(var12_12));
                    var7_7 = var11_11 + var5_5.length();
                    var6_6 = 0;
                    try {
                        if (var4_4 == null) continue;
lbl87:
                        // 2 sources

                        v14 = var9_9;
                        v15 = var0.length() - 1;
                    }
                    catch (gs_0 v17) {
                        throw NE.a(v17);
                    }
                }
                try {
                    if (v14 != v15) continue;
                    var8_8.append(var0.substring(var7_7));
                    continue;
                }
                catch (gs_0 v18) {
                    throw NE.a(v18);
                }
            }
            v2 = var8_8.toString();
        }
        return v2;
    }

    public static String K() {
        return NE.N(null, null);
    }

    public static String E(String string) {
        return NE.N(string, null);
    }

    public static String N(String string, String string2) {
        String string3;
        StringBuilder stringBuilder;
        String string4;
        StringBuilder stringBuilder2;
        try {
            stringBuilder2 = new StringBuilder();
            string4 = string == null ? NE.a(31693, -28255) : string;
        }
        catch (gs_0 gs_02) {
            throw NE.a(gs_02);
        }
        try {
            stringBuilder = stringBuilder2.append(string4).append("-").append(NE.A(5)).append("-").append(NE.A(5)).append("-").append(NE.A(5)).append("-").append(NE.A(5)).append("-");
            string3 = string2 == null ? NE.a(31680, -31658) : string2;
        }
        catch (gs_0 gs_03) {
            throw NE.a(gs_03);
        }
        return stringBuilder.append(string3).toString();
    }

    public static String A(int n10) {
        StringBuilder stringBuilder = new StringBuilder(n10);
        for (int i2 = 0; i2 < n10; ++i2) {
            int n11 = 0;
            int n12 = NE.a(5743, 5231743944052136253L);
            switch (gw_0.K(3)) {
                case 0: {
                    n11 = NE.a(1950, 2084992801086359774L);
                    n12 = NE.a(30480, 8967552325923223633L);
                    break;
                }
                case 1: {
                    n11 = NE.a(26286, 1483589171460844013L);
                    n12 = NE.a(14965, 4298132566287447304L);
                    break;
                }
                case 2: {
                    n11 = NE.a(22186, 7702298524846234083L);
                    n12 = NE.a(32067, 7659907886289760773L);
                }
            }
            stringBuilder.append((char)(gw_0.K(n12) + n11));
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    public static long X(String var0) throws gs_0 {
        var1_1 = FV.D();
        try {
            var2_2 = 0L;
            var5_5 = var4_4 = var0.split(" ");
            var6_6 = var5_5.length;
            var7_7 = 0;
            block17: while (true) {
                v0 = var7_7;
                block18: while (v0 < var6_6) {
                    var8_8 = var5_5[var7_7];
                    for (var9_9 = 0; var9_9 < var8_8.length(); ++var9_9) {
                        block21: {
                            v0 = (int)Character.isDigit(var8_8.charAt(var9_9));
                            if (var1_1 != null) continue block18;
                            if (var1_1 != null) break block21;
                            try {
                                block22: {
                                    if (v0 != 0) continue;
                                    break block22;
                                    catch (Throwable v1) {
                                        throw NE.a(v1);
                                    }
                                }
                                v2 = Integer.parseInt(var8_8.substring(0, var9_9));
                            }
                            catch (Throwable v3) {
                                throw NE.a(v3);
                            }
                        }
                        var10_10 = v2;
                        var11_11 = ew_0.valueOf(var8_8.substring(var9_9));
                        try {
                            if (var1_1 == null) {
                            }
                            ** GOTO lbl38
                        }
                        catch (Throwable v4) {
                            throw NE.a(v4);
                        }
                        {
                            ** switch (BB.h[var11_11.ordinal()])
                        }
lbl-1000:
                        // 1 sources

                        {
                            case 1: {
                                var2_2 += (long)(var10_10 * NE.a(2922, 6145140762777633855L));
lbl38:
                                // 2 sources

                                if (var1_1 == null) break;
                            }
lbl39:
                            // 2 sources

                            case 2: {
                                var2_2 += (long)(var10_10 * NE.a(28786, 5025365775197978413L));
                                if (var1_1 == null) break;
                            }
lbl42:
                            // 2 sources

                            case 3: {
                                var2_2 += (long)(var10_10 * NE.a(2407, 1487887020360451645L));
                                if (var1_1 == null) break;
                            }
lbl45:
                            // 2 sources

                            case 4: {
                                var2_2 += (long)(var10_10 * NE.a(5149, 6519506872396634945L));
                                if (var1_1 == null) break;
                            }
lbl48:
                            // 2 sources

                            case 5: {
                                var2_2 += (long)var10_10;
                            }
                        }
lbl50:
                        // 6 sources

                        try {
                            if (var1_1 == null) break;
                            if (var1_1 == null) continue;
                            break;
                        }
                        catch (Throwable v5) {
                            throw NE.a(v5);
                        }
                    }
                    ++var7_7;
                    if (var1_1 == null) continue block17;
                }
                break;
            }
            return var2_2;
        }
        catch (Throwable var2_3) {
            throw new gs_0(var2_3);
        }
    }

    public static String I(long l2) {
        String string;
        StringBuilder stringBuilder;
        String string2;
        StringBuilder stringBuilder2;
        String string3;
        StringBuilder stringBuilder3;
        String string4;
        StringBuilder stringBuilder4;
        String string5;
        StringBuilder stringBuilder5;
        long l3;
        block14: {
            block15: {
                String string6 = FV.D();
                try {
                    try {
                        l3 = l2;
                        if (string6 != null) break block14;
                        if (l3 > 0L) break block15;
                    }
                    catch (gs_0 gs_02) {
                        throw NE.a(gs_02);
                    }
                    throw new IllegalArgumentException(NE.a(31690, -14835) + l2);
                }
                catch (gs_0 gs_03) {
                    throw NE.a(gs_03);
                }
            }
            l3 = l2;
        }
        long l4 = l3;
        long l5 = l4 / NE.b(16603, 5998727064005925846L);
        long l6 = (l4 -= l5 * NE.b(27599, 4585332697408663749L)) / NE.b(19248, 3053120762270896190L);
        long l7 = (l4 -= l6 * NE.b(15343, 3760001400025719015L)) / NE.b(17043, 1219532866820069788L);
        long l8 = (l4 -= l7 * NE.b(25636, 8829180914353504040L)) / NE.b(783, 3994517412131510278L);
        long l9 = l4 -= l8 * NE.b(5673, 4399696765851733282L);
        try {
            stringBuilder5 = new StringBuilder();
            string5 = l5 > 0L ? l5 + NE.a(31694, 6112) : "";
        }
        catch (gs_0 gs_04) {
            throw NE.a(gs_04);
        }
        try {
            stringBuilder4 = stringBuilder5.append(string5);
            string4 = l6 > 0L ? l6 + NE.a(31691, 12340) : "";
        }
        catch (gs_0 gs_05) {
            throw NE.a(gs_05);
        }
        try {
            stringBuilder3 = stringBuilder4.append(string4);
            string3 = l7 > 0L ? l7 + NE.a(31695, 17542) : "";
        }
        catch (gs_0 gs_06) {
            throw NE.a(gs_06);
        }
        try {
            stringBuilder2 = stringBuilder3.append(string3);
            string2 = l8 > 0L ? l8 + NE.a(31682, 5473) : "";
        }
        catch (gs_0 gs_07) {
            throw NE.a(gs_07);
        }
        try {
            stringBuilder = stringBuilder2.append(string2);
            string = l9 > 0L ? l9 + NE.a(31689, 1876) : "";
        }
        catch (gs_0 gs_08) {
            throw NE.a(gs_08);
        }
        String string7 = stringBuilder.append(string).toString();
        return string7.trim();
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
                                var21 = new String[11];
                                var19_1 = 0;
                                var18_2 = "\u00abL\u00d9\u00ec\u00c6\u001a}\u00b8\u007f\u00ec\u00cc\u001c\u00a2\u00d4\u00bd\u0002\u00f8\u00bf\u0003%\u00a1\u00db\u0003Y9q\u0002\u00ab\u00b3\u0002\u00fc\u00f8\u0003#\u001a\u001b\u0006$-\u00e1\u0087Z\u00d0\u0002]Q";
                                var20_3 = "\u00abL\u00d9\u00ec\u00c6\u001a}\u00b8\u007f\u00ec\u00cc\u001c\u00a2\u00d4\u00bd\u0002\u00f8\u00bf\u0003%\u00a1\u00db\u0003Y9q\u0002\u00ab\u00b3\u0002\u00fc\u00f8\u0003#\u001a\u001b\u0006$-\u00e1\u0087Z\u00d0\u0002]Q".length();
                                var17_4 = 15;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 42;
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
                                    var18_2 = "\u000b-\u00a3\u00a3\u0005\u00db\u00f2\u00bc\u0091C\u0002\u00b4`";
                                    var20_3 = "\u000b-\u00a3\u00a3\u0005\u00db\u00f2\u00bc\u0091C\u0002\u00b4`".length();
                                    var17_4 = 10;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 86;
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
                                            v15 = 117;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 126;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 123;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 7;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 41;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 44;
                                            break;
                                        }
                                        default: {
                                            v15 = 106;
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
                        NE.a = var21;
                        NE.b = new String[11];
                        var8_7 = 8347981160931060230L;
                        var14_8 = new long[37];
                        var11_9 = 0;
                        var12_10 = "2r\u00dc$\u00bf\u00c0\u00e9\u00af\u00da\u00e5\u00f2=\u00e1\u00d0\u00bb\u00ab\u0013U\u00b3\u008d\u008f\u0019\u00b2\u00af\u001a\u00a1\u0093\u00b6uR/\u00a4\u00d7\u00eb\u00d4\u007fJ\u008d\u00c6[\u00ad\u0006\u00b7\u00d7\u00bfs\u00ceo\u001f\u00e7\u0085\u00ca\u00f0V\u00ef\u00f6\u00da\u00ef\u008c\u00c8\u001c\\\u00f2\u00cd\u00a1U\u0006\u00ab%\u00bf\u00d4A^\bzV\u00bfv\u0095oQ+i\u00b1\u00e7\u00ee7`\u0018\u0017z\u008e\u00c9\u00f6\u00f29\u008dl/P\u0005\u00f5\u00b31!\u00f1\u0084D\u00f8P\u0098\u0007X\u0086/:\u0094\u00d0A\u00f3\u00920\u00fe7\u00d8\u00f1bw\u008b\u0018\u00b4(\u0014G\u009d\u0007L\u0015,\u0003g2\u00e8\\\u00ad\u0011\u0091\u00a1\u0007\u00c0V\u008a\u0081U _\u00f6\u001b><\u00a3\u00e6\u00b6Y\u00ac\u00a5 &Z\u0094\u0082V\u00e4\u0013\u0006\u00c6\u007f\u00e0\u00df\u0002n6\u00f2\u0092\u000e)\u00ae\u00e9\u00cf\u008bs\u00a4\u0011\u00d0\u0003\u00b5\u0096qX\u0019\u00ac\u0096j\u00d5\u008f\u00d2(\u00b1\u00ef\u00c0)\u0018\f\u00c6\u00ed[9_\n:m\u00a8\u00f8\u00fc\u009b\u00bc\u00a1\u009f\u009bA~\u00c6\u00bc&z\u0002]x\u00c3\u008a\u008b\u00d0?\u00d8\u000b\r\"\u00e8\u0090\u00a0j\u00eb\u00e3\u0093R]\u00f5\u00ef\u008c\u00d3\u00cf\u00c1\u00ad\u00922\u0083l\u008eA\u00a7<\u008d\u0084\u00cb\u00d1\u00b4\u00a8\u00b0*V";
                        var13_11 = "2r\u00dc$\u00bf\u00c0\u00e9\u00af\u00da\u00e5\u00f2=\u00e1\u00d0\u00bb\u00ab\u0013U\u00b3\u008d\u008f\u0019\u00b2\u00af\u001a\u00a1\u0093\u00b6uR/\u00a4\u00d7\u00eb\u00d4\u007fJ\u008d\u00c6[\u00ad\u0006\u00b7\u00d7\u00bfs\u00ceo\u001f\u00e7\u0085\u00ca\u00f0V\u00ef\u00f6\u00da\u00ef\u008c\u00c8\u001c\\\u00f2\u00cd\u00a1U\u0006\u00ab%\u00bf\u00d4A^\bzV\u00bfv\u0095oQ+i\u00b1\u00e7\u00ee7`\u0018\u0017z\u008e\u00c9\u00f6\u00f29\u008dl/P\u0005\u00f5\u00b31!\u00f1\u0084D\u00f8P\u0098\u0007X\u0086/:\u0094\u00d0A\u00f3\u00920\u00fe7\u00d8\u00f1bw\u008b\u0018\u00b4(\u0014G\u009d\u0007L\u0015,\u0003g2\u00e8\\\u00ad\u0011\u0091\u00a1\u0007\u00c0V\u008a\u0081U _\u00f6\u001b><\u00a3\u00e6\u00b6Y\u00ac\u00a5 &Z\u0094\u0082V\u00e4\u0013\u0006\u00c6\u007f\u00e0\u00df\u0002n6\u00f2\u0092\u000e)\u00ae\u00e9\u00cf\u008bs\u00a4\u0011\u00d0\u0003\u00b5\u0096qX\u0019\u00ac\u0096j\u00d5\u008f\u00d2(\u00b1\u00ef\u00c0)\u0018\f\u00c6\u00ed[9_\n:m\u00a8\u00f8\u00fc\u009b\u00bc\u00a1\u009f\u009bA~\u00c6\u00bc&z\u0002]x\u00c3\u008a\u008b\u00d0?\u00d8\u000b\r\"\u00e8\u0090\u00a0j\u00eb\u00e3\u0093R]\u00f5\u00ef\u008c\u00d3\u00cf\u00c1\u00ad\u00922\u0083l\u008eA\u00a7<\u008d\u0084\u00cb\u00d1\u00b4\u00a8\u00b0*V".length();
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
                            var12_10 = "\u0099\r\u00bf@\u0003\u00eb\u001f\u00144\u0089Z;\u0092\u0019b\u00b5";
                            var13_11 = "\u0099\r\u00bf@\u0003\u00eb\u001f\u00144\u0089Z;\u0092\u0019b\u00b5".length();
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
                NE.c = var14_8;
                NE.d = new Integer[37];
                var0_14 = 5299507507319969930L;
                var6_15 = new long[8];
                var3_16 = 0;
                var4_17 = "3\f,\u00bc\u00c3\u00e0\u008d\u00c2\u001a\u00b4c\u0084\u0095\u00ec\u009f\\c\u00d5|\u00d7\u00c1\u00e2\u00a64Yg\u0007Q\u00ac\u00eb+v}\u00a5\u0094\u00a5\u00e1\u00e5V\u00ed~\u00e4\u00c1\u0093\u00ddd\u0083d";
                var5_18 = "3\f,\u00bc\u00c3\u00e0\u008d\u00c2\u001a\u00b4c\u0084\u0095\u00ec\u009f\\c\u00d5|\u00d7\u00c1\u00e2\u00a64Yg\u0007Q\u00ac\u00eb+v}\u00a5\u0094\u00a5\u00e1\u00e5V\u00ed~\u00e4\u00c1\u0093\u00ddd\u0083d".length();
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
                    var4_17 = "v)\u00fe4\u00b1r4Ot\u0085}\u001a\u001aU\u0096@";
                    var5_18 = "v)\u00fe4\u00b1r4Ot\u0085}\u001a\u001aU\u0096@".length();
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
        NE.e = var6_15;
        NE.f = new Long[8];
        v27 = new String[NE.a(22450, 2447396704374102251L)];
        v27[0] = " ";
        v27[1] = ".";
        v27[2] = ",";
        v27[3] = ":";
        v27[4] = ";";
        v27[5] = "/";
        v27[NE.a((int)25763, (long)6906786942854278131L)] = "\\";
        v27[NE.a((int)7024, (long)59832708882879549L)] = "\n";
        v27[NE.a((int)29640, (long)102588712377040004L)] = "\t";
        v27[NE.a((int)22485, (long)1528996239239288989L)] = "|";
        v27[NE.a((int)30480, (long)8967552325923223633L)] = "{";
        v27[NE.a((int)23988, (long)5143166813132690161L)] = "}";
        v27[NE.a((int)3580, (long)6801053931530142395L)] = "[";
        v27[NE.a((int)19706, (long)5905034868969046948L)] = "]";
        v27[NE.a((int)15708, (long)5577384847999136271L)] = "(";
        v27[NE.a((int)9092, (long)1422294075442326735L)] = ")";
        v27[NE.a((int)12334, (long)8452702970952580985L)] = "<";
        v27[NE.a((int)18392, (long)1800242119775586466L)] = ">";
        v27[NE.a((int)19719, (long)1164114883281683016L)] = "-";
        v27[NE.a((int)2297, (long)8602976591564457863L)] = "+";
        v27[NE.a((int)3896, (long)5230546006055239748L)] = "\"";
        v27[NE.a((int)27431, (long)5956272136598398076L)] = "'";
        v27[NE.a((int)18447, (long)982858211016312651L)] = "*";
        v27[NE.a((int)18231, (long)5410003839787173990L)] = "%";
        v27[NE.a((int)28937, (long)7916625809539677791L)] = "$";
        v27[NE.a((int)4651, (long)7810696704350281087L)] = "#";
        v27[NE.a((int)32067, (long)7659907886289760773L)] = "@";
        v27[NE.a((int)2788, (long)3284697325978568121L)] = "!";
        v27[NE.a((int)6632, (long)8603825648652637847L)] = "~";
        v27[NE.a((int)14418, (long)308768085072246556L)] = "^";
        v27[NE.a((int)1396, (long)9124085833070529086L)] = "&";
        v27[NE.a((int)23453, (long)1236539876941468895L)] = "?";
        NE.Y = Arrays.asList(v27);
        NE.J = new iw_0();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x7BCA) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 15;
                    break;
                }
                case 1: {
                    n14 = 155;
                    break;
                }
                case 2: {
                    n14 = 240;
                    break;
                }
                case 3: {
                    n14 = 153;
                    break;
                }
                case 4: {
                    n14 = 63;
                    break;
                }
                case 5: {
                    n14 = 215;
                    break;
                }
                case 6: {
                    n14 = 233;
                    break;
                }
                case 7: {
                    n14 = 71;
                    break;
                }
                case 8: {
                    n14 = 99;
                    break;
                }
                case 9: {
                    n14 = 64;
                    break;
                }
                case 10: {
                    n14 = 17;
                    break;
                }
                case 11: {
                    n14 = 158;
                    break;
                }
                case 12: {
                    n14 = 90;
                    break;
                }
                case 13: {
                    n14 = 236;
                    break;
                }
                case 14: {
                    n14 = 38;
                    break;
                }
                case 15: {
                    n14 = 254;
                    break;
                }
                case 16: {
                    n14 = 250;
                    break;
                }
                case 17: {
                    n14 = 107;
                    break;
                }
                case 18: {
                    n14 = 218;
                    break;
                }
                case 19: {
                    n14 = 34;
                    break;
                }
                case 20: {
                    n14 = 103;
                    break;
                }
                case 21: {
                    n14 = 58;
                    break;
                }
                case 22: {
                    n14 = 45;
                    break;
                }
                case 23: {
                    n14 = 95;
                    break;
                }
                case 24: {
                    n14 = 57;
                    break;
                }
                case 25: {
                    n14 = 220;
                    break;
                }
                case 26: {
                    n14 = 93;
                    break;
                }
                case 27: {
                    n14 = 14;
                    break;
                }
                case 28: {
                    n14 = 0;
                    break;
                }
                case 29: {
                    n14 = 159;
                    break;
                }
                case 30: {
                    n14 = 143;
                    break;
                }
                case 31: {
                    n14 = 195;
                    break;
                }
                case 32: {
                    n14 = 53;
                    break;
                }
                case 33: {
                    n14 = 31;
                    break;
                }
                case 34: {
                    n14 = 227;
                    break;
                }
                case 35: {
                    n14 = 139;
                    break;
                }
                case 36: {
                    n14 = 112;
                    break;
                }
                case 37: {
                    n14 = 52;
                    break;
                }
                case 38: {
                    n14 = 48;
                    break;
                }
                case 39: {
                    n14 = 252;
                    break;
                }
                case 40: {
                    n14 = 16;
                    break;
                }
                case 41: {
                    n14 = 154;
                    break;
                }
                case 42: {
                    n14 = 74;
                    break;
                }
                case 43: {
                    n14 = 243;
                    break;
                }
                case 44: {
                    n14 = 136;
                    break;
                }
                case 45: {
                    n14 = 237;
                    break;
                }
                case 46: {
                    n14 = 133;
                    break;
                }
                case 47: {
                    n14 = 30;
                    break;
                }
                case 48: {
                    n14 = 85;
                    break;
                }
                case 49: {
                    n14 = 162;
                    break;
                }
                case 50: {
                    n14 = 208;
                    break;
                }
                case 51: {
                    n14 = 223;
                    break;
                }
                case 52: {
                    n14 = 246;
                    break;
                }
                case 53: {
                    n14 = 161;
                    break;
                }
                case 54: {
                    n14 = 152;
                    break;
                }
                case 55: {
                    n14 = 67;
                    break;
                }
                case 56: {
                    n14 = 116;
                    break;
                }
                case 57: {
                    n14 = 3;
                    break;
                }
                case 58: {
                    n14 = 178;
                    break;
                }
                case 59: {
                    n14 = 91;
                    break;
                }
                case 60: {
                    n14 = 156;
                    break;
                }
                case 61: {
                    n14 = 70;
                    break;
                }
                case 62: {
                    n14 = 35;
                    break;
                }
                case 63: {
                    n14 = 92;
                    break;
                }
                case 64: {
                    n14 = 65;
                    break;
                }
                case 65: {
                    n14 = 1;
                    break;
                }
                case 66: {
                    n14 = 142;
                    break;
                }
                case 67: {
                    n14 = 216;
                    break;
                }
                case 68: {
                    n14 = 97;
                    break;
                }
                case 69: {
                    n14 = 211;
                    break;
                }
                case 70: {
                    n14 = 187;
                    break;
                }
                case 71: {
                    n14 = 135;
                    break;
                }
                case 72: {
                    n14 = 206;
                    break;
                }
                case 73: {
                    n14 = 222;
                    break;
                }
                case 74: {
                    n14 = 83;
                    break;
                }
                case 75: {
                    n14 = 255;
                    break;
                }
                case 76: {
                    n14 = 41;
                    break;
                }
                case 77: {
                    n14 = 94;
                    break;
                }
                case 78: {
                    n14 = 245;
                    break;
                }
                case 79: {
                    n14 = 194;
                    break;
                }
                case 80: {
                    n14 = 244;
                    break;
                }
                case 81: {
                    n14 = 229;
                    break;
                }
                case 82: {
                    n14 = 81;
                    break;
                }
                case 83: {
                    n14 = 247;
                    break;
                }
                case 84: {
                    n14 = 167;
                    break;
                }
                case 85: {
                    n14 = 210;
                    break;
                }
                case 86: {
                    n14 = 82;
                    break;
                }
                case 87: {
                    n14 = 200;
                    break;
                }
                case 88: {
                    n14 = 62;
                    break;
                }
                case 89: {
                    n14 = 177;
                    break;
                }
                case 90: {
                    n14 = 32;
                    break;
                }
                case 91: {
                    n14 = 37;
                    break;
                }
                case 92: {
                    n14 = 219;
                    break;
                }
                case 93: {
                    n14 = 36;
                    break;
                }
                case 94: {
                    n14 = 131;
                    break;
                }
                case 95: {
                    n14 = 242;
                    break;
                }
                case 96: {
                    n14 = 89;
                    break;
                }
                case 97: {
                    n14 = 46;
                    break;
                }
                case 98: {
                    n14 = 23;
                    break;
                }
                case 99: {
                    n14 = 196;
                    break;
                }
                case 100: {
                    n14 = 61;
                    break;
                }
                case 101: {
                    n14 = 140;
                    break;
                }
                case 102: {
                    n14 = 183;
                    break;
                }
                case 103: {
                    n14 = 115;
                    break;
                }
                case 104: {
                    n14 = 122;
                    break;
                }
                case 105: {
                    n14 = 198;
                    break;
                }
                case 106: {
                    n14 = 42;
                    break;
                }
                case 107: {
                    n14 = 164;
                    break;
                }
                case 108: {
                    n14 = 134;
                    break;
                }
                case 109: {
                    n14 = 173;
                    break;
                }
                case 110: {
                    n14 = 231;
                    break;
                }
                case 111: {
                    n14 = 113;
                    break;
                }
                case 112: {
                    n14 = 29;
                    break;
                }
                case 113: {
                    n14 = 150;
                    break;
                }
                case 114: {
                    n14 = 172;
                    break;
                }
                case 115: {
                    n14 = 76;
                    break;
                }
                case 116: {
                    n14 = 180;
                    break;
                }
                case 117: {
                    n14 = 225;
                    break;
                }
                case 118: {
                    n14 = 55;
                    break;
                }
                case 119: {
                    n14 = 4;
                    break;
                }
                case 120: {
                    n14 = 197;
                    break;
                }
                case 121: {
                    n14 = 204;
                    break;
                }
                case 122: {
                    n14 = 10;
                    break;
                }
                case 123: {
                    n14 = 117;
                    break;
                }
                case 124: {
                    n14 = 185;
                    break;
                }
                case 125: {
                    n14 = 9;
                    break;
                }
                case 126: {
                    n14 = 230;
                    break;
                }
                case 127: {
                    n14 = 119;
                    break;
                }
                case 128: {
                    n14 = 66;
                    break;
                }
                case 129: {
                    n14 = 123;
                    break;
                }
                case 130: {
                    n14 = 234;
                    break;
                }
                case 131: {
                    n14 = 221;
                    break;
                }
                case 132: {
                    n14 = 102;
                    break;
                }
                case 133: {
                    n14 = 145;
                    break;
                }
                case 134: {
                    n14 = 203;
                    break;
                }
                case 135: {
                    n14 = 8;
                    break;
                }
                case 136: {
                    n14 = 238;
                    break;
                }
                case 137: {
                    n14 = 199;
                    break;
                }
                case 138: {
                    n14 = 169;
                    break;
                }
                case 139: {
                    n14 = 253;
                    break;
                }
                case 140: {
                    n14 = 51;
                    break;
                }
                case 141: {
                    n14 = 49;
                    break;
                }
                case 142: {
                    n14 = 241;
                    break;
                }
                case 143: {
                    n14 = 56;
                    break;
                }
                case 144: {
                    n14 = 126;
                    break;
                }
                case 145: {
                    n14 = 124;
                    break;
                }
                case 146: {
                    n14 = 193;
                    break;
                }
                case 147: {
                    n14 = 144;
                    break;
                }
                case 148: {
                    n14 = 217;
                    break;
                }
                case 149: {
                    n14 = 40;
                    break;
                }
                case 150: {
                    n14 = 157;
                    break;
                }
                case 151: {
                    n14 = 120;
                    break;
                }
                case 152: {
                    n14 = 86;
                    break;
                }
                case 153: {
                    n14 = 182;
                    break;
                }
                case 154: {
                    n14 = 60;
                    break;
                }
                case 155: {
                    n14 = 43;
                    break;
                }
                case 156: {
                    n14 = 106;
                    break;
                }
                case 157: {
                    n14 = 175;
                    break;
                }
                case 158: {
                    n14 = 163;
                    break;
                }
                case 159: {
                    n14 = 13;
                    break;
                }
                case 160: {
                    n14 = 235;
                    break;
                }
                case 161: {
                    n14 = 73;
                    break;
                }
                case 162: {
                    n14 = 22;
                    break;
                }
                case 163: {
                    n14 = 184;
                    break;
                }
                case 164: {
                    n14 = 239;
                    break;
                }
                case 165: {
                    n14 = 181;
                    break;
                }
                case 166: {
                    n14 = 192;
                    break;
                }
                case 167: {
                    n14 = 101;
                    break;
                }
                case 168: {
                    n14 = 25;
                    break;
                }
                case 169: {
                    n14 = 20;
                    break;
                }
                case 170: {
                    n14 = 138;
                    break;
                }
                case 171: {
                    n14 = 109;
                    break;
                }
                case 172: {
                    n14 = 21;
                    break;
                }
                case 173: {
                    n14 = 149;
                    break;
                }
                case 174: {
                    n14 = 24;
                    break;
                }
                case 175: {
                    n14 = 232;
                    break;
                }
                case 176: {
                    n14 = 59;
                    break;
                }
                case 177: {
                    n14 = 87;
                    break;
                }
                case 178: {
                    n14 = 26;
                    break;
                }
                case 179: {
                    n14 = 7;
                    break;
                }
                case 180: {
                    n14 = 121;
                    break;
                }
                case 181: {
                    n14 = 176;
                    break;
                }
                case 182: {
                    n14 = 47;
                    break;
                }
                case 183: {
                    n14 = 27;
                    break;
                }
                case 184: {
                    n14 = 28;
                    break;
                }
                case 185: {
                    n14 = 54;
                    break;
                }
                case 186: {
                    n14 = 96;
                    break;
                }
                case 187: {
                    n14 = 110;
                    break;
                }
                case 188: {
                    n14 = 105;
                    break;
                }
                case 189: {
                    n14 = 205;
                    break;
                }
                case 190: {
                    n14 = 179;
                    break;
                }
                case 191: {
                    n14 = 75;
                    break;
                }
                case 192: {
                    n14 = 165;
                    break;
                }
                case 193: {
                    n14 = 79;
                    break;
                }
                case 194: {
                    n14 = 151;
                    break;
                }
                case 195: {
                    n14 = 114;
                    break;
                }
                case 196: {
                    n14 = 171;
                    break;
                }
                case 197: {
                    n14 = 104;
                    break;
                }
                case 198: {
                    n14 = 111;
                    break;
                }
                case 199: {
                    n14 = 72;
                    break;
                }
                case 200: {
                    n14 = 174;
                    break;
                }
                case 201: {
                    n14 = 77;
                    break;
                }
                case 202: {
                    n14 = 141;
                    break;
                }
                case 203: {
                    n14 = 68;
                    break;
                }
                case 204: {
                    n14 = 137;
                    break;
                }
                case 205: {
                    n14 = 78;
                    break;
                }
                case 206: {
                    n14 = 148;
                    break;
                }
                case 207: {
                    n14 = 146;
                    break;
                }
                case 208: {
                    n14 = 118;
                    break;
                }
                case 209: {
                    n14 = 130;
                    break;
                }
                case 210: {
                    n14 = 226;
                    break;
                }
                case 211: {
                    n14 = 251;
                    break;
                }
                case 212: {
                    n14 = 18;
                    break;
                }
                case 213: {
                    n14 = 160;
                    break;
                }
                case 214: {
                    n14 = 88;
                    break;
                }
                case 215: {
                    n14 = 84;
                    break;
                }
                case 216: {
                    n14 = 147;
                    break;
                }
                case 217: {
                    n14 = 190;
                    break;
                }
                case 218: {
                    n14 = 213;
                    break;
                }
                case 219: {
                    n14 = 39;
                    break;
                }
                case 220: {
                    n14 = 224;
                    break;
                }
                case 221: {
                    n14 = 11;
                    break;
                }
                case 222: {
                    n14 = 98;
                    break;
                }
                case 223: {
                    n14 = 127;
                    break;
                }
                case 224: {
                    n14 = 125;
                    break;
                }
                case 225: {
                    n14 = 44;
                    break;
                }
                case 226: {
                    n14 = 209;
                    break;
                }
                case 227: {
                    n14 = 249;
                    break;
                }
                case 228: {
                    n14 = 5;
                    break;
                }
                case 229: {
                    n14 = 19;
                    break;
                }
                case 230: {
                    n14 = 214;
                    break;
                }
                case 231: {
                    n14 = 212;
                    break;
                }
                case 232: {
                    n14 = 6;
                    break;
                }
                case 233: {
                    n14 = 132;
                    break;
                }
                case 234: {
                    n14 = 100;
                    break;
                }
                case 235: {
                    n14 = 202;
                    break;
                }
                case 236: {
                    n14 = 186;
                    break;
                }
                case 237: {
                    n14 = 168;
                    break;
                }
                case 238: {
                    n14 = 201;
                    break;
                }
                case 239: {
                    n14 = 129;
                    break;
                }
                case 240: {
                    n14 = 170;
                    break;
                }
                case 241: {
                    n14 = 2;
                    break;
                }
                case 242: {
                    n14 = 189;
                    break;
                }
                case 243: {
                    n14 = 188;
                    break;
                }
                case 244: {
                    n14 = 80;
                    break;
                }
                case 245: {
                    n14 = 128;
                    break;
                }
                case 246: {
                    n14 = 248;
                    break;
                }
                case 247: {
                    n14 = 166;
                    break;
                }
                case 248: {
                    n14 = 33;
                    break;
                }
                case 249: {
                    n14 = 69;
                    break;
                }
                case 250: {
                    n14 = 207;
                    break;
                }
                case 251: {
                    n14 = 108;
                    break;
                }
                case 252: {
                    n14 = 50;
                    break;
                }
                case 253: {
                    n14 = 191;
                    break;
                }
                case 254: {
                    n14 = 228;
                    break;
                }
                default: {
                    n14 = 12;
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
            NE.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4F5E;
        if (d[n11] == null) {
            NE.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x1B0C) & Short.MAX_VALUE;
        if (f[n11] == null) {
            NE.f[n11] = e[n11] ^ l2;
        }
        return f[n11];
    }
}

