/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import com._y_0;
import com.c;
import com.oc_0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;

/*
 * Renamed from Yf
 */
public class yf_0 {
    HashMap P;
    HashMap e;
    HashMap k;
    boolean o;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long f;

    public yf_0() {
        this.P = new HashMap();
        this.e = new HashMap();
        this.k = new HashMap();
        this.o = false;
    }

    public void o() {
    }

    public O0 d() {
        oc_0 oc_02 = new oc_0();
        oc_0 oc_03 = new oc_0();
        try {
            this.D((Object)new File((String)dd_1.d), (Object)oc_02, oc_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        O0 o0 = new O0();
        o0.C("dirs", oc_02);
        o0.C("files", oc_03);
        return o0;
    }

    public ArrayList y() {
        ArrayList<lv_2> arrayList;
        block2: {
            arrayList = new ArrayList<lv_2>();
            Iterator iterator = ((HashMap)this.P).keySet().iterator();
            int[] nArray = lv_2.H();
            while (iterator.hasNext()) {
                arrayList.add((lv_2)((HashMap)this.P).get(iterator.next()));
                if (nArray != null) {
                    if (nArray != null) continue;
                }
                break block2;
            }
            Collections.sort(arrayList, new f0_0(this));
        }
        return arrayList;
    }

    public ArrayList E() {
        ArrayList<lv_2> arrayList;
        block2: {
            arrayList = new ArrayList<lv_2>();
            Iterator iterator = ((HashMap)this.P).keySet().iterator();
            int[] nArray = lv_2.H();
            while (iterator.hasNext()) {
                arrayList.add((lv_2)((HashMap)this.P).get(iterator.next()));
                if (nArray != null) {
                    if (nArray != null) continue;
                }
                break block2;
            }
            Collections.sort(arrayList, new k9_0(this));
        }
        return arrayList;
    }

    public ArrayList V() {
        ArrayList arrayList;
        block18: {
            long l2;
            Object object;
            Object object2;
            arrayList = new ArrayList();
            Iterator iterator = ((HashMap)this.P).keySet().iterator();
            int[] nArray = lv_2.H();
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
                l2 = (Long)object.D();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            long l3 = l2;
            while (iterator.hasNext()) {
                long l4;
                long l5;
                long l6;
                lv_2 lv_22 = (lv_2)((HashMap)this.P).get(iterator.next());
                try {
                    l6 = (Long)lv_22.b();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                long l7 = l6;
                if (nArray == null) break block18;
                try {
                    l5 = (Long)lv_22.y();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    l4 = (Long)lv_22.b();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                long l8 = l5 - l4;
                long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (nArray != null) {
                    if (l9 > 0) {
                        long l10;
                        try {
                            l10 = (Long)lv_22.y();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        l7 = l10;
                    }
                    l9 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
                }
                if (nArray != null && l9 > 0) {
                    l9 = (long)arrayList.add(lv_22);
                }
                if (nArray != null) continue;
            }
            Collections.sort(arrayList, new K9(this));
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void q(File var1_1, ArrayList var2_2, ArrayList var3_3) {
        block31: {
            block30: {
                var5_4 = var1_1.listFiles();
                var4_5 = lv_2.H();
                try {
                    v0 = var5_4;
                    if (var4_5 == null) break block30;
                    if (v0 == null) break block31;
                }
                catch (Exception v1) {
                    throw yf_0.a(v1);
                }
                v0 = var5_4;
            }
            for (File var9_9 : v0) {
                block32: {
                    block33: {
                        block36: {
                            v2 = var9_9.isFile();
                            if (var4_5 == null) break block32;
                            if (!v2) ** GOTO lbl86
                            break block36;
                            catch (Exception v3) {
                                throw yf_0.a(v3);
                            }
                        }
                        try {
                            block37: {
                                v4 = var9_9.getName().endsWith("_connect_config.json");
                                if (var4_5 == null) break block33;
                                break block37;
                                catch (Exception v5) {
                                    throw yf_0.a(v5);
                                }
                            }
                            if (v4) {
                            }
                            ** GOTO lbl57
                        }
                        catch (Exception v6) {
                            throw yf_0.a(v6);
                        }
                        var10_10 /* !! */  = new lv_2();
                        try {
                            var10_10 /* !! */.n(var9_9.getAbsolutePath());
                        }
                        catch (InvocationTargetException v7) {
                            throw v7.getTargetException();
                        }
                        try {
                            try {
                                var10_10 /* !! */.L();
                            }
                            catch (InvocationTargetException v8) {
                                throw v8.getTargetException();
                            }
                        }
                        catch (Exception var11_12) {
                            var11_12.printStackTrace();
                        }
                        try {
                            var3_3.add(var10_10 /* !! */ );
                            if (var4_5 != null) continue;
lbl57:
                            // 2 sources

                            v4 = var9_9.getName().equals("folder.json");
                        }
                        catch (Exception v9) {
                            throw yf_0.a(v9);
                        }
                    }
                    if (!v4) continue;
                    var10_10 /* !! */  = new lo_1();
                    try {
                        var10_10 /* !! */.e(var9_9.getAbsolutePath());
                    }
                    catch (InvocationTargetException v10) {
                        throw v10.getTargetException();
                    }
                    try {
                        try {
                            var10_10 /* !! */.w();
                        }
                        catch (InvocationTargetException v11) {
                            throw v11.getTargetException();
                        }
                    }
                    catch (Exception var11_13) {
                        var11_13.printStackTrace();
                    }
                    try {
                        var2_2.add(var10_10 /* !! */ );
                        if (var4_5 != null) continue;
lbl86:
                        // 2 sources

                        v2 = var9_9.isDirectory();
                    }
                    catch (Exception v12) {
                        throw yf_0.a(v12);
                    }
                }
                try {
                    if (!v2) continue;
                    try {
                        this.q((Object)var9_9, (Object)var2_2, var3_3);
                    }
                    catch (InvocationTargetException v13) {
                        throw v13.getTargetException();
                    }
                }
                catch (Exception v14) {
                    throw yf_0.a(v14);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void D(File var1_1, oc_0 var2_2, oc_0 var3_3) {
        block29: {
            block28: {
                var5_4 = var1_1.listFiles();
                var4_5 = lv_2.H();
                try {
                    v0 = var5_4;
                    if (var4_5 == null) break block28;
                    if (v0 == null) break block29;
                }
                catch (Exception v1) {
                    throw yf_0.a(v1);
                }
                v0 = var5_4;
            }
            for (File var9_9 : v0) {
                block30: {
                    block31: {
                        block32: {
                            v2 = var9_9.isFile();
                            if (var4_5 == null) break block30;
                            if (!v2) ** GOTO lbl77
                            break block32;
                            catch (Exception v3) {
                                throw yf_0.a(v3);
                            }
                        }
                        try {
                            block33: {
                                v4 = var9_9.getName().endsWith("_connect_config.json");
                                if (var4_5 == null) break block31;
                                break block33;
                                catch (Exception v5) {
                                    throw yf_0.a(v5);
                                }
                            }
                            if (v4) {
                            }
                            ** GOTO lbl49
                        }
                        catch (Exception v6) {
                            throw yf_0.a(v6);
                        }
                        try {
                            try {
                                v7 = (String)lk_0.p(var9_9.getAbsolutePath());
                            }
                            catch (InvocationTargetException v8) {
                                throw v8.getTargetException();
                            }
                            var10_10 = v7;
                            var11_13 = O0.y(var10_10);
                            var3_3.add(var11_13);
                            continue;
                        }
                        catch (Exception var10_11) {
                            var10_11.printStackTrace();
                            if (var4_5 != null) continue;
lbl49:
                            // 2 sources

                            try {
                                block34: {
                                    v9 = var9_9.getName();
                                    if (var4_5 == null) ** GOTO lbl68
                                    break block34;
                                    catch (Exception v10) {
                                        throw yf_0.a(v10);
                                    }
                                }
                                v4 = v9.equals("folder.json");
                            }
                            catch (Exception v11) {
                                throw yf_0.a(v11);
                            }
                        }
                    }
                    if (!v4) continue;
                    try {
                        try {
                            v9 = (String)lk_0.p(var9_9.getAbsolutePath());
                        }
                        catch (InvocationTargetException v12) {
                            throw v12.getTargetException();
                        }
lbl68:
                        // 2 sources

                        var10_10 = v9;
                        var11_13 = O0.y(var10_10);
                        var2_2.add(var11_13);
                        continue;
                    }
                    catch (Exception var10_12) {
                        try {
                            var10_12.printStackTrace();
                            if (var4_5 != null) continue;
lbl77:
                            // 2 sources

                            v2 = var9_9.isDirectory();
                        }
                        catch (Exception v13) {
                            throw yf_0.a(v13);
                        }
                    }
                }
                try {
                    if (!v2) continue;
                    try {
                        this.D((Object)var9_9, (Object)var2_2, var3_3);
                    }
                    catch (InvocationTargetException v14) {
                        throw v14.getTargetException();
                    }
                }
                catch (Exception v15) {
                    throw yf_0.a(v15);
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void X(O0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [88[DOLOOP]], but top level block is 19[TRYBLOCK]
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

    private String Z(String string, lv_2 lv_22, HashMap hashMap, HashMap hashMap2) {
        block6: {
            String string2;
            block5: {
                String string3;
                String string4;
                try {
                    string4 = (String)this.Z((Object)string, (Object)lv_22, (Object)hashMap, (Object)hashMap2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string5 = string4;
                int[] nArray = lv_2.H();
                string2 = string5;
                if (nArray == null) break block5;
                if (string2 == null) break block6;
                try {
                    string3 = (String)lv_22.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                string2 = string5 + File.separator + string3 + "_connect_config.json";
            }
            return string2;
        }
        return null;
    }

    private String Z(String string, ln_2 ln_22, HashMap hashMap, HashMap hashMap2) {
        lo_1 lo_12;
        String string2;
        String string3 = null;
        try {
            string2 = (String)ln_22.J();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string4 = string2;
        int[] nArray = lv_2.H();
        String string5 = string4;
        if (nArray != null) {
            String string6;
            if (string5.equals("root")) {
                return string;
            }
            try {
                string6 = (String)ln_22.J();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            string5 = hashMap2.get(string6);
        }
        if ((lo_12 = (lo_1)((Object)string5)) != null) {
            String string7;
            try {
                string7 = (String)this.Z((Object)string, (Object)lo_12, (Object)hashMap, (Object)hashMap2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string8 = string3 = string7;
            if (nArray != null) {
                if (string8 == null) {
                    return null;
                }
                string8 = string3;
            }
            if (nArray != null) {
                String string9;
                if (!string8.endsWith(File.separator)) {
                    string3 = string3 + File.separator;
                }
                try {
                    string9 = (String)ln_22.J();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                string8 = string3 + string9;
            }
            string3 = string8;
        }
        return string3;
    }

    private String C(String string, lo_1 lo_12, HashMap hashMap) {
        block6: {
            String string2;
            block5: {
                String string3;
                String string4;
                try {
                    string4 = (String)this.m((Object)string, (Object)lo_12, hashMap);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string5 = string4;
                int[] nArray = lv_2.H();
                string2 = string5;
                if (nArray == null) break block5;
                if (string2 == null) break block6;
                try {
                    string3 = (String)lo_12.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                string2 = string5 + File.separator + string3 + File.separator + "folder.json";
            }
            return string2;
        }
        return null;
    }

    private String m(String string, lo_1 lo_12, HashMap hashMap) {
        String string2;
        block18: {
            lo_1 lo_13;
            lo_1 lo_14;
            int[] nArray;
            block17: {
                String string3;
                String string4;
                string2 = "";
                try {
                    string4 = (String)lo_12.J();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string5 = string4;
                nArray = lv_2.H();
                String string6 = string5;
                if (nArray != null) {
                    String string7;
                    if (string6.equals("root")) {
                        return string;
                    }
                    try {
                        string7 = (String)lo_12.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    string6 = hashMap.get(string7);
                }
                lo_1 lo_15 = (lo_1)((Object)string6);
                try {
                    string3 = (String)lo_15.J();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                lo_14 = (lo_1)hashMap.get(string3);
                lo_13 = lo_15;
                if (nArray == null) break block17;
                if (lo_13 == null) break block18;
                lo_13 = lo_14;
            }
            if (lo_13 != null) {
                String string8;
                try {
                    string8 = (String)this.m((Object)string, (Object)lo_14, hashMap);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string9 = string2 = string8;
                if (nArray != null) {
                    String string10;
                    if (!string9.endsWith(File.separator)) {
                        string2 = string2 + File.separator;
                    }
                    try {
                        string10 = (String)lo_12.J();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    string9 = string2 + string10 + File.separator;
                }
                string2 = string9;
            }
        }
        return string2;
    }

    /*
     * Loose catch block
     */
    public void U() {
        block15: {
            try {
                this.G((Object)new File((String)dd_1.d), new ArrayList());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            int[] nArray = lv_2.H();
            ArrayList arrayList = new ArrayList();
            try {
                this.o((Object)new File((String)dd_1.d), arrayList);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            int[] nArray2 = nArray;
            for (File file : arrayList) {
                block16: {
                    block17: {
                        block18: {
                            if (nArray2 == null) break block15;
                            if (nArray2 == null) break block16;
                            break block18;
                            catch (Exception exception) {
                                throw yf_0.a(exception);
                            }
                        }
                        try {
                            block19: {
                                if (file.getAbsolutePath().endsWith("_connect_config.json")) break block17;
                                break block19;
                                catch (Exception exception) {
                                    throw yf_0.a(exception);
                                }
                            }
                            if (nArray2 != null) continue;
                        }
                        catch (Exception exception) {
                            throw yf_0.a(exception);
                        }
                    }
                    try {
                        try {
                            this.c(file.getAbsolutePath());
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                if (nArray2 != null) continue;
            }
            this.o = true;
        }
    }

    public boolean A() {
        return this.o;
    }

    public HashSet s() {
        HashSet hashSet = new HashSet();
        try {
            this.U((Object)new File((String)dd_1.d), hashSet);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return hashSet;
    }

    /*
     * Unable to fully structure code
     */
    private void U(File var1_1, HashSet var2_2) {
        block44: {
            block43: {
                var4_3 = var1_1.listFiles();
                var3_4 = lv_2.H();
                try {
                    v0 = var4_3;
                    if (var3_4 == null) break block43;
                    if (v0 == null) break block44;
                }
                catch (Exception v1) {
                    throw yf_0.a(v1);
                }
                v0 = var4_3;
            }
            for (File var8_8 : v0) {
                block45: {
                    block50: {
                        block54: {
                            block51: {
                                block49: {
                                    block46: {
                                        block47: {
                                            block52: {
                                                block48: {
                                                    try {
                                                        v2 = var8_8.isFile();
                                                        if (var3_4 == null) break block45;
                                                        if (v2) {
                                                        }
                                                        ** GOTO lbl133
                                                    }
                                                    catch (Exception v3) {
                                                        throw yf_0.a(v3);
                                                    }
                                                    var9_9 = null;
                                                    try {
                                                        v4 = var8_8.getName().endsWith("_connect_config.json");
                                                        if (var3_4 == null) break block46;
                                                        if (!v4) break block47;
                                                    }
                                                    catch (Exception v5) {
                                                        throw yf_0.a(v5);
                                                    }
                                                    try {
                                                        v6 = (Boolean)KT.u(var8_8.getAbsolutePath());
                                                    }
                                                    catch (InvocationTargetException v7) {
                                                        throw v7.getTargetException();
                                                    }
                                                    var10_10 = v6;
                                                    if (var10_10) break block52;
                                                    try {
                                                        v8 = (O0)KT.b(var8_8.getAbsolutePath());
                                                    }
                                                    catch (InvocationTargetException v9) {
                                                        throw v9.getTargetException();
                                                    }
                                                    var11_11 = v8;
                                                    try {
                                                        v10 = var11_11;
                                                        if (var3_4 != null) {
                                                            if (v10 == null) break block48;
                                                        }
                                                        ** GOTO lbl52
                                                    }
                                                    catch (Exception v11) {
                                                        throw yf_0.a(v11);
                                                    }
                                                    try {
                                                        v10 = var11_11;
lbl52:
                                                        // 2 sources

                                                        try {
                                                            lk_0.L((Object)v10.toString(), (Object)var8_8);
                                                        }
                                                        catch (InvocationTargetException v12) {
                                                            throw v12.getTargetException();
                                                        }
                                                        var9_9 = "connect_config_" + var8_8.getName().substring(0, yf_0.a(29726, 1827515249212320220L));
                                                    }
                                                    catch (Exception var12_13) {
                                                        var12_13.printStackTrace();
                                                    }
                                                    break block50;
                                                }
                                                var8_8.delete();
                                                break block50;
                                            }
                                            var9_9 = "connect_config_" + var8_8.getName().substring(0, yf_0.a(2797, 9146014943586326318L));
                                            break block50;
                                        }
                                        v4 = var8_8.getName().equals("folder.json");
                                    }
                                    if (var3_4 == null) break block49;
                                    try {
                                        block53: {
                                            if (!v4) break block50;
                                            break block53;
                                            catch (Exception v13) {
                                                throw yf_0.a(v13);
                                            }
                                        }
                                        try {
                                            v4 = (Boolean)KT.u(var8_8.getAbsolutePath());
                                        }
                                        catch (InvocationTargetException v14) {
                                            throw v14.getTargetException();
                                        }
                                    }
                                    catch (Exception v15) {
                                        throw yf_0.a(v15);
                                    }
                                }
                                if (var10_10 = v4) break block54;
                                try {
                                    v16 = (O0)KT.D(var8_8.getAbsolutePath());
                                }
                                catch (InvocationTargetException v17) {
                                    throw v17.getTargetException();
                                }
                                var11_11 = v16;
                                try {
                                    v18 = var11_11;
                                    if (var3_4 != null) {
                                        if (v18 == null) break block51;
                                    }
                                    ** GOTO lbl106
                                }
                                catch (Exception v19) {
                                    throw yf_0.a(v19);
                                }
                                try {
                                    v18 = var11_11;
lbl106:
                                    // 2 sources

                                    try {
                                        lk_0.L((Object)v18.toString(), (Object)var8_8);
                                    }
                                    catch (InvocationTargetException v20) {
                                        throw v20.getTargetException();
                                    }
                                    var9_9 = "folder_config_" + var8_8.getParentFile().getName();
                                }
                                catch (Exception var12_14) {
                                    var12_14.printStackTrace();
                                }
                                break block50;
                            }
                            var8_8.delete();
                            break block50;
                        }
                        var9_9 = "folder_config_" + var8_8.getParentFile().getName();
                    }
                    try {
                        if (var9_9 != null) {
                            var2_2.add(var9_9);
                        }
                    }
                    catch (Exception v21) {
                        throw yf_0.a(v21);
                    }
                    try {
                        if (var3_4 != null) continue;
lbl133:
                        // 2 sources

                        v2 = var8_8.isDirectory();
                    }
                    catch (Exception v22) {
                        throw yf_0.a(v22);
                    }
                }
                try {
                    if (!v2) continue;
                    try {
                        this.U((Object)var8_8, (Object)var2_2);
                    }
                    catch (InvocationTargetException v23) {
                        throw v23.getTargetException();
                    }
                }
                catch (Exception v24) {
                    throw yf_0.a(v24);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void v() {
        block96: {
            block89: {
                var2_1 = new ArrayList<E>();
                var3_2 = new ArrayList<E>();
                v0 = lv_2.H();
                try {
                    this.q((Object)new File((String)dd_1.d), var2_1, var3_2);
                }
                catch (InvocationTargetException v1) {
                    throw v1.getTargetException();
                }
                var1_3 = v0;
                var4_4 = yf_0.f;
                var6_5 = 0;
                var7_6 = var3_2.iterator();
                while (var7_6.hasNext()) {
                    block87: {
                        block88: {
                            var8_7 = (lv_2)var7_6.next();
                            try {
                                try {
                                    v2 = (Boolean)le_2.H(var8_7);
                                }
                                catch (InvocationTargetException v3) {
                                    throw v3.getTargetException();
                                }
                                if (var1_3 != null) {
                                    if (!v2) break block87;
                                }
                                ** GOTO lbl80
                            }
                            catch (IOException v4) {
                                throw yf_0.a(v4);
                            }
                            try {
                                v5 = yt_1.i();
                            }
                            catch (InvocationTargetException v6) {
                                throw v6.getTargetException();
                            }
                            try {
                                v7 = v5.A();
                            }
                            catch (InvocationTargetException v8) {
                                throw v8.getTargetException();
                            }
                            try {
                                v9 = var8_7.g();
                            }
                            catch (InvocationTargetException v10) {
                                throw v10.getTargetException();
                            }
                            try {
                                v11 = (Long)v7.Y(v9);
                            }
                            catch (InvocationTargetException v12) {
                                throw v12.getTargetException();
                            }
                            var9_8 = v11;
                            cfr_temp_0 = var9_8 - 0L;
                            v13 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                            if (var1_3 == null) break block88;
                            try {
                                block94: {
                                    if (v13 <= 0) break block87;
                                    break block94;
                                    catch (IOException v14) {
                                        throw yf_0.a(v14);
                                    }
                                }
                                cfr_temp_1 = System.currentTimeMillis() - var9_8 - var4_4;
                                v13 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                            }
                            catch (IOException v15) {
                                throw yf_0.a(v15);
                            }
                        }
                        if (v13 > 0) {
                            try {
                                v16 = (String)var8_7.G();
                            }
                            catch (InvocationTargetException v17) {
                                throw v17.getTargetException();
                            }
                            var11_11 = new File(v16);
                            var6_5 = 1;
                        }
                    }
                    if (var1_3 != null) continue;
                }
                var7_6 = var2_1.iterator();
                do {
                    block90: {
                        v2 = var7_6.hasNext();
lbl80:
                        // 2 sources

                        if (!v2) break;
                        var8_7 = (lo_1)var7_6.next();
                        try {
                            try {
                                v18 = ((Boolean)le_2.H(var8_7)).booleanValue();
                            }
                            catch (InvocationTargetException v19) {
                                throw v19.getTargetException();
                            }
                            if (var1_3 != null) {
                                if (v18 == 0) continue;
                            }
                            break block89;
                        }
                        catch (IOException v20) {
                            throw yf_0.a(v20);
                        }
                        try {
                            v21 = (String)var8_7.v();
                        }
                        catch (InvocationTargetException v22) {
                            throw v22.getTargetException();
                        }
                        var9_9 = new File(v21).getParentFile();
                        try {
                            v23 = yt_1.i();
                        }
                        catch (InvocationTargetException v24) {
                            throw v24.getTargetException();
                        }
                        try {
                            v25 = v23.A();
                        }
                        catch (InvocationTargetException v26) {
                            throw v26.getTargetException();
                        }
                        try {
                            v27 = var8_7.g();
                        }
                        catch (InvocationTargetException v28) {
                            throw v28.getTargetException();
                        }
                        try {
                            v29 = (Long)v25.Y(v27);
                        }
                        catch (InvocationTargetException v30) {
                            throw v30.getTargetException();
                        }
                        var10_13 = v29;
                        cfr_temp_2 = var10_13 - 0L;
                        v31 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                        if (var1_3 == null) break block90;
                        try {
                            block95: {
                                if (v31 <= 0) continue;
                                break block95;
                                catch (IOException v32) {
                                    throw yf_0.a(v32);
                                }
                            }
                            cfr_temp_3 = System.currentTimeMillis() - var10_13 - var4_4;
                            v31 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                        }
                        catch (IOException v33) {
                            throw yf_0.a(v33);
                        }
                    }
                    try {
                        if (var1_3 == null || v31 <= 0) continue;
                    }
                    catch (IOException v34) {
                        throw yf_0.a(v34);
                    }
                    var6_5 = (int)((long)1);
                    v31 = var6_5;
                } while (var1_3 != null);
                v18 = var6_5;
            }
            if (v18 == 0) break block96;
            var7_6 = "yyyyMMddHHmmssSSS";
            var8_7 = new SimpleDateFormat((String)var7_6);
            var9_10 = var8_7.format(new Date());
            var10_14 = new File((String)dd_1.p + var9_10);
            try {
                FileUtils.copyDirectory(new File((String)dd_1.d), var10_14);
            }
            catch (IOException var11_12) {
                var11_12.printStackTrace();
            }
            var11_11 = var3_2.iterator();
            while (var11_11.hasNext()) {
                block91: {
                    block92: {
                        var12_15 /* !! */  = (lv_2)var11_11.next();
                        try {
                            try {
                                v35 = (Boolean)le_2.H(var12_15 /* !! */);
                            }
                            catch (InvocationTargetException v36) {
                                throw v36.getTargetException();
                            }
                            if (var1_3 != null) {
                                if (!v35) break block91;
                            }
                            ** GOTO lbl224
                        }
                        catch (IOException v37) {
                            throw yf_0.a(v37);
                        }
                        try {
                            v38 = yt_1.i();
                        }
                        catch (InvocationTargetException v39) {
                            throw v39.getTargetException();
                        }
                        try {
                            v40 = v38.A();
                        }
                        catch (InvocationTargetException v41) {
                            throw v41.getTargetException();
                        }
                        try {
                            v42 = var12_15 /* !! */.g();
                        }
                        catch (InvocationTargetException v43) {
                            throw v43.getTargetException();
                        }
                        try {
                            v44 = (Long)v40.Y(v42);
                        }
                        catch (InvocationTargetException v45) {
                            throw v45.getTargetException();
                        }
                        var13_16 = v44;
                        cfr_temp_4 = var13_16 - 0L;
                        v46 = cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                        if (var1_3 == null) break block92;
                        try {
                            block97: {
                                if (v46 <= 0) break block91;
                                break block97;
                                catch (IOException v47) {
                                    throw yf_0.a(v47);
                                }
                            }
                            cfr_temp_5 = System.currentTimeMillis() - var13_16 - var4_4;
                            v46 = cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                        }
                        catch (IOException v48) {
                            throw yf_0.a(v48);
                        }
                    }
                    if (v46 > 0) {
                        try {
                            v49 = (String)var12_15 /* !! */.G();
                        }
                        catch (InvocationTargetException v50) {
                            throw v50.getTargetException();
                        }
                        var15_18 = new File(v49);
                        var15_18.delete();
                    }
                }
                if (var1_3 != null) continue;
            }
            var11_11 = var2_1.iterator();
            do {
                block93: {
                    v35 = var11_11.hasNext();
lbl224:
                    // 2 sources

                    if (!v35) break;
                    var12_15 /* !! */  = (lo_1)var11_11.next();
                    try {
                        v51 = (Boolean)le_2.H(var12_15 /* !! */);
                    }
                    catch (InvocationTargetException v52) {
                        throw v52.getTargetException();
                    }
                    if (!v51) continue;
                    try {
                        v53 = (String)var12_15 /* !! */.v();
                    }
                    catch (InvocationTargetException v54) {
                        throw v54.getTargetException();
                    }
                    var13_17 = new File(v53).getParentFile();
                    try {
                        v55 = yt_1.i();
                    }
                    catch (InvocationTargetException v56) {
                        throw v56.getTargetException();
                    }
                    try {
                        v57 = v55.A();
                    }
                    catch (InvocationTargetException v58) {
                        throw v58.getTargetException();
                    }
                    try {
                        v59 = var12_15 /* !! */.g();
                    }
                    catch (InvocationTargetException v60) {
                        throw v60.getTargetException();
                    }
                    try {
                        v61 = (Long)v57.Y(v59);
                    }
                    catch (InvocationTargetException v62) {
                        throw v62.getTargetException();
                    }
                    var14_19 = v61;
                    cfr_temp_6 = var14_19 - 0L;
                    v63 = cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1);
                    if (var1_3 == null) break block93;
                    try {
                        block98: {
                            if (v63 <= 0) continue;
                            break block98;
                            catch (IOException v64) {
                                throw yf_0.a(v64);
                            }
                        }
                        cfr_temp_7 = System.currentTimeMillis() - var14_19 - var4_4;
                        v63 = cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1);
                    }
                    catch (IOException v65) {
                        throw yf_0.a(v65);
                    }
                }
                if (v63 <= 0) continue;
                try {
                    FileUtils.forceDelete(var13_17);
                }
                catch (IOException var16_20) {
                    var16_20.printStackTrace();
                }
            } while (var1_3 != null);
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    void G(File var1_1, ArrayList var2_2) {
        block79: {
            block78: {
                var4_3 = var1_1.listFiles();
                var3_4 = lv_2.H();
                try {
                    v0 = var4_3;
                    if (var3_4 == null) break block78;
                    if (v0 == null) break block79;
                }
                catch (Exception v1) {
                    throw yf_0.a(v1);
                }
                v0 = var4_3;
            }
            for (Object var8_8 : v0) {
                block87: {
                    block85: {
                        block86: {
                            block94: {
                                block84: {
                                    block80: {
                                        block81: {
                                            block82: {
                                                block90: {
                                                    block89: {
                                                        block88: {
                                                            v2 = var8_8.isFile();
                                                            if (var3_4 == null) break block80;
                                                            if (!v2) break block81;
                                                            break block88;
                                                            catch (Exception v3) {
                                                                throw yf_0.a(v3);
                                                            }
                                                        }
                                                        v4 = var8_8.getName().endsWith("_connect_config.json");
                                                        if (var3_4 == null) break block81;
                                                        break block89;
                                                        catch (Exception v5) {
                                                            throw yf_0.a(v5);
                                                        }
                                                    }
                                                    if (v4) break block82;
                                                    break block90;
                                                    catch (Exception v6) {
                                                        throw yf_0.a(v6);
                                                    }
                                                }
                                                try {
                                                    block91: {
                                                        v4 = var8_8.getName().endsWith("folder.json");
                                                        if (var3_4 == null) break block81;
                                                        break block91;
                                                        catch (Exception v7) {
                                                            throw yf_0.a(v7);
                                                        }
                                                    }
                                                    if (v4) break block82;
                                                }
                                                catch (Exception v8) {
                                                    throw yf_0.a(v8);
                                                }
                                                try {
                                                    v9 = (String)lk_0.J(var8_8.getName());
                                                }
                                                catch (InvocationTargetException v10) {
                                                    throw v10.getTargetException();
                                                }
                                                var9_9 = v9;
                                                try {
                                                    v11 = (String)le_2.q();
                                                }
                                                catch (InvocationTargetException v12) {
                                                    throw v12.getTargetException();
                                                }
                                                var10_10 = v11;
                                                var11_11 = (String)var10_10 + "_connect_config.json";
                                                var12_13 = new File(var8_8.getParentFile().getAbsolutePath() + File.separator + var11_11);
                                                var8_8.renameTo((File)var12_13);
                                                var8_8 = var12_13;
                                                try {
                                                    block83: {
                                                        block92: {
                                                            try {
                                                                v13 = (String)lk_0.p(var8_8.getAbsolutePath());
                                                            }
                                                            catch (InvocationTargetException v14) {
                                                                throw v14.getTargetException();
                                                            }
                                                            var13_14 = O0.y(v13);
                                                            try {
                                                                v15 = var13_14;
                                                                if (var3_4 != null) {
                                                                    if (v15.containsKey("create_time")) break block83;
                                                                }
                                                                ** GOTO lbl110
                                                            }
                                                            catch (Exception v16) {
                                                                throw yf_0.a(v16);
                                                            }
                                                            var13_14.C("name", var9_9);
                                                            var13_14.C("id", var10_10);
                                                            var14_15 = System.currentTimeMillis();
                                                            var13_14.C("create_time", var14_15);
                                                            var16_20 = var8_8.getParentFile().getName();
                                                            v17 = var16_20;
                                                            if (var3_4 == null) break block83;
                                                            if (v17.equals("conn")) ** GOTO lbl102
                                                            break block92;
                                                            catch (Exception v18) {
                                                                throw yf_0.a(v18);
                                                            }
                                                        }
                                                        try {
                                                            block93: {
                                                                var13_14.C("parent_id", var16_20);
                                                                if (var3_4 != null) break block83;
                                                                break block93;
                                                                catch (Exception v19) {
                                                                    throw yf_0.a(v19);
                                                                }
                                                            }
                                                            v17 = var13_14.C("parent_id", "root");
                                                        }
                                                        catch (Exception v20) {
                                                            throw yf_0.a(v20);
                                                        }
                                                    }
                                                    try {
                                                        v15 = var13_14;
lbl110:
                                                        // 2 sources

                                                        try {
                                                            lk_0.S((Object)v15.toString(), (Object)var8_8.getAbsolutePath());
                                                        }
                                                        catch (InvocationTargetException v21) {
                                                            throw v21.getTargetException();
                                                        }
                                                    }
                                                    catch (Exception var14_16) {
                                                        var14_16.printStackTrace();
                                                    }
                                                }
                                                catch (Exception var14_17) {
                                                    var14_17.printStackTrace();
                                                }
                                            }
                                            v4 = var2_2.add(var8_8);
                                        }
                                        try {
                                            v22 = var8_8;
                                            if (var3_4 == null) break block84;
                                            v2 = v22.isDirectory();
                                        }
                                        catch (Exception v23) {
                                            throw yf_0.a(v23);
                                        }
                                    }
                                    try {
                                        if (!v2) continue;
                                        v22 = new File(var8_8.getAbsolutePath() + File.separator + "folder.json");
                                    }
                                    catch (Exception v24) {
                                        throw yf_0.a(v24);
                                    }
                                }
                                var9_9 = v22;
                                var10_10 = null;
                                v25 = var9_9;
                                if (var3_4 == null) break block94;
                                try {
                                    block95: {
                                        if (v25.exists()) break block85;
                                        break block95;
                                        catch (Exception v26) {
                                            throw yf_0.a(v26);
                                        }
                                    }
                                    v25 = var8_8;
                                }
                                catch (Exception v27) {
                                    throw yf_0.a(v27);
                                }
                            }
                            var11_11 = v25.getName();
                            try {
                                v28 = (String)le_2.q();
                            }
                            catch (InvocationTargetException v29) {
                                throw v29.getTargetException();
                            }
                            var12_13 = v28;
                            var13_14 = new File(var8_8.getParentFile().getAbsolutePath() + File.separator + (String)var12_13);
                            var8_8.renameTo((File)var13_14);
                            var8_8 = var13_14;
                            var9_9 = new File(var8_8.getAbsolutePath() + File.separator + "folder.json");
                            var10_10 = new lo_1();
                            try {
                                var10_10.z(var11_11);
                            }
                            catch (InvocationTargetException v30) {
                                throw v30.getTargetException();
                            }
                            try {
                                var10_10.p(var12_13);
                            }
                            catch (InvocationTargetException v31) {
                                throw v31.getTargetException();
                            }
                            try {
                                var10_10.Z(System.currentTimeMillis());
                            }
                            catch (InvocationTargetException v32) {
                                throw v32.getTargetException();
                            }
                            var14_18 = var8_8.getParentFile().getName();
                            if (var3_4 == null) break block86;
                            try {
                                block96: {
                                    if (var14_18.equals("conn")) ** GOTO lbl208
                                    break block96;
                                    catch (Exception v33) {
                                        throw yf_0.a(v33);
                                    }
                                }
                                try {
                                    var10_10.R(var14_18);
                                }
                                catch (InvocationTargetException v34) {
                                    throw v34.getTargetException();
                                }
                            }
                            catch (Exception v35) {
                                throw yf_0.a(v35);
                            }
                        }
                        try {
                            if (var3_4 != null) ** GOTO lbl216
lbl208:
                            // 2 sources

                            try {
                                var10_10.R("root");
                            }
                            catch (InvocationTargetException v36) {
                                throw v36.getTargetException();
                            }
                        }
                        catch (Exception v37) {
                            throw yf_0.a(v37);
                        }
lbl216:
                        // 2 sources

                        try {
                            var10_10.e(var9_9.getAbsolutePath());
                        }
                        catch (InvocationTargetException v38) {
                            throw v38.getTargetException();
                        }
                        try {
                            v39 = (O0)var10_10.r();
                        }
                        catch (InvocationTargetException v40) {
                            throw v40.getTargetException();
                        }
                        var15_19 = v39;
                        try {
                            try {
                                lk_0.S((Object)var15_19.toString(), (Object)var9_9.getAbsolutePath());
                                break block87;
                            }
                            catch (InvocationTargetException v41) {
                                throw v41.getTargetException();
                            }
                        }
                        catch (Exception var16_21) {
                            var16_21.printStackTrace();
                        }
                        break block87;
                    }
                    var10_10 = new lo_1();
                    try {
                        var10_10.e(var9_9.getAbsolutePath());
                    }
                    catch (InvocationTargetException v42) {
                        throw v42.getTargetException();
                    }
                    try {
                        try {
                            var10_10.w();
                        }
                        catch (InvocationTargetException v43) {
                            throw v43.getTargetException();
                        }
                    }
                    catch (Exception var11_12) {
                        var11_12.printStackTrace();
                    }
                }
                try {
                    v44 = (String)var10_10.g();
                }
                catch (InvocationTargetException v45) {
                    throw v45.getTargetException();
                }
                ((HashMap)this.k).put(v44, var10_10);
                try {
                    this.G(var8_8, (Object)var2_2);
                }
                catch (InvocationTargetException v46) {
                    throw v46.getTargetException();
                }
            }
        }
    }

    public lv_2 c(String string) throws Exception {
        lv_2 lv_22 = new lv_2();
        try {
            lv_22.n(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            String string2;
            try {
                lv_22.L();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                string2 = (String)lv_22.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((HashMap)this.P).put(string2, lv_22);
            ((HashMap)this.e).put(string, lv_22);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return lv_22;
    }

    public void U(String string, String string2) {
        Object object;
        lv_2 lv_22;
        block22: {
            String string3;
            block23: {
                lv_2 lv_23;
                try {
                    lv_23 = (lv_2)this.q(string);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                lv_22 = lv_23;
                int[] nArray = lv_2.H();
                try {
                    lv_22.n(string2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int[] nArray2 = nArray;
                string3 = new File(string2).getParentFile().getName();
                try {
                    if (nArray2 == null) break block22;
                    if (!string3.equals("conn")) break block23;
                }
                catch (Exception exception) {
                    throw yf_0.a(exception);
                }
                string3 = "root";
            }
            try {
                lv_22.R(string3);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lv_22.v(System.currentTimeMillis());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                try {
                    lv_22.A();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        try {
            String string4;
            try {
                string4 = (String)lv_22.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((HashMap)this.P).put(string4, lv_22);
            ((HashMap)this.e).remove(string);
            ((HashMap)this.e).put(string2, lv_22);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object, com.c.a(new tq_1("", tq_1.R, -1)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Loose catch block
     */
    public void D(String string) {
        block34: {
            Object object;
            lo_1 lo_12;
            String string2;
            int[] nArray;
            String string3;
            block32: {
                String string4;
                block31: {
                    string3 = new File(string).getName();
                    nArray = lv_2.H();
                    string2 = new File(string).getParentFile().getName();
                    string4 = string2;
                    if (nArray == null) break block31;
                    try {
                        block36: {
                            if (!string4.equals("conn")) break block32;
                            break block36;
                            catch (Exception exception) {
                                throw yf_0.a(exception);
                            }
                        }
                        string4 = "root";
                    }
                    catch (Exception exception) {
                        throw yf_0.a(exception);
                    }
                }
                string2 = string4;
            }
            try {
                lo_12 = (lo_1)this.m(string3);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            lo_1 lo_13 = lo_12;
            try {
                lo_13.R(string2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lo_13.v(System.currentTimeMillis());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lo_13.e(string + File.separator + "folder.json");
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                try {
                    lo_13.r();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            ArrayList arrayList = new ArrayList();
            try {
                this.o((Object)new File(string), arrayList);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            for (File file : arrayList) {
                block35: {
                    if (nArray == null) break block34;
                    try {
                        block37: {
                            if (nArray == null) break block35;
                            break block37;
                            catch (Exception exception) {
                                throw yf_0.a(exception);
                            }
                        }
                        if (!file.getName().endsWith("_connect_config.json")) break block35;
                    }
                    catch (Exception exception) {
                        throw yf_0.a(exception);
                    }
                    try {
                        try {
                            this.c(file.getAbsolutePath());
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                if (nArray != null) continue;
            }
            try {
                object = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                com.c.d(473928376202613579L).invoke(object, com.c.a(new tq_1("", tq_1.v, -1)));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public lo_1 D(String var1_1, String var2_2) {
        block30: {
            var4_3 = new lo_1();
            var3_4 = lv_2.H();
            try {
                var4_3.z(var2_2);
            }
            catch (InvocationTargetException v0) {
                throw v0.getTargetException();
            }
            var5_5 = new File(var1_1).getName();
            if (var3_4 == null) break block30;
            try {
                block32: {
                    if (!var5_5.equals("conn")) ** GOTO lbl31
                    break block32;
                    catch (Exception v1) {
                        throw yf_0.a(v1);
                    }
                }
                try {
                    var4_3.R("root");
                }
                catch (InvocationTargetException v2) {
                    throw v2.getTargetException();
                }
            }
            catch (Exception v3) {
                throw yf_0.a(v3);
            }
        }
        try {
            if (var3_4 != null) ** GOTO lbl39
lbl31:
            // 2 sources

            try {
                var4_3.R(var5_5);
            }
            catch (InvocationTargetException v4) {
                throw v4.getTargetException();
            }
        }
        catch (Exception v5) {
            throw yf_0.a(v5);
        }
lbl39:
        // 2 sources

        try {
            v6 = (String)var4_3.g();
        }
        catch (InvocationTargetException v7) {
            throw v7.getTargetException();
        }
        var6_6 = var1_1 + File.separator + v6 + File.separator + "folder.json";
        try {
            var4_3.e(var6_6);
        }
        catch (InvocationTargetException v8) {
            throw v8.getTargetException();
        }
        try {
            var4_3.Z(System.currentTimeMillis());
        }
        catch (InvocationTargetException v9) {
            throw v9.getTargetException();
        }
        try {
            try {
                var4_3.r();
            }
            catch (InvocationTargetException v10) {
                throw v10.getTargetException();
            }
        }
        catch (Exception var7_7) {
            var7_7.printStackTrace();
        }
        try {
            v11 = (String)var4_3.g();
        }
        catch (InvocationTargetException v12) {
            throw v12.getTargetException();
        }
        ((HashMap)this.k).put(v11, var4_3);
        try {
            v13 = yt_1.i();
        }
        catch (InvocationTargetException v14) {
            throw v14.getTargetException();
        }
        try {
            v15 = v13.Q();
        }
        catch (InvocationTargetException v16) {
            throw v16.getTargetException();
        }
        try {
            v15.G();
        }
        catch (InvocationTargetException v17) {
            throw v17.getTargetException();
        }
        return var4_3;
    }

    public void f() {
        Object object;
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object, com.c.a(new tq_1("", tq_1.S, -1)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void K(lv_2 lv_22) {
        try {
            this.n((Object)lv_22, -1, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void n(lv_2 var1_1, int var2_2, boolean var3_3) {
        block79: {
            block71: {
                block72: {
                    var4_4 = lv_2.H();
                    try {
                        v0 = var3_3;
                        if (var4_4 != null) {
                            if (v0 != 0) break block71;
                        }
                        ** GOTO lbl80
                    }
                    catch (Exception v1) {
                        throw yf_0.a(v1);
                    }
                    try {
                        v2 = le_2.q();
                    }
                    catch (InvocationTargetException v3) {
                        throw v3.getTargetException();
                    }
                    try {
                        var1_1.p(v2);
                    }
                    catch (InvocationTargetException v4) {
                        throw v4.getTargetException();
                    }
                    try {
                        var1_1.Z(System.currentTimeMillis());
                    }
                    catch (InvocationTargetException v5) {
                        throw v5.getTargetException();
                    }
                    try {
                        v6 = (String)var1_1.w();
                    }
                    catch (InvocationTargetException v7) {
                        throw v7.getTargetException();
                    }
                    var5_5 = new File(v6).getName();
                    if (var4_4 == null) break block72;
                    try {
                        block81: {
                            if (var5_5.equals("conn")) ** GOTO lbl53
                            break block81;
                            catch (Exception v8) {
                                throw yf_0.a(v8);
                            }
                        }
                        try {
                            var1_1.R(var5_5);
                        }
                        catch (InvocationTargetException v9) {
                            throw v9.getTargetException();
                        }
                    }
                    catch (Exception v10) {
                        throw yf_0.a(v10);
                    }
                }
                try {
                    if (var4_4 != null) ** GOTO lbl61
lbl53:
                    // 2 sources

                    try {
                        var1_1.R("root");
                    }
                    catch (InvocationTargetException v11) {
                        throw v11.getTargetException();
                    }
                }
                catch (Exception v12) {
                    throw yf_0.a(v12);
                }
lbl61:
                // 2 sources

                try {
                    v13 = (String)var1_1.w();
                }
                catch (InvocationTargetException v14) {
                    throw v14.getTargetException();
                }
                try {
                    v15 = (String)var1_1.g();
                }
                catch (InvocationTargetException v16) {
                    throw v16.getTargetException();
                }
                try {
                    var1_1.n(v13 + File.separator + v15 + "_connect_config.json");
                }
                catch (InvocationTargetException v17) {
                    throw v17.getTargetException();
                }
            }
            try {
                block80: {
                    block78: {
                        block77: {
                            block75: {
                                block76: {
                                    block73: {
                                        block74: {
                                            block82: {
                                                v0 = 0;
lbl80:
                                                // 2 sources

                                                var5_6 = v0;
                                                try {
                                                    v18 = (String)var1_1.G();
                                                }
                                                catch (InvocationTargetException v19) {
                                                    throw v19.getTargetException();
                                                }
                                                var6_8 = v18;
                                                try {
                                                    var1_1.A();
                                                }
                                                catch (InvocationTargetException v20) {
                                                    throw v20.getTargetException();
                                                }
                                                try {
                                                    v21 = (String)var1_1.G();
                                                }
                                                catch (InvocationTargetException v22) {
                                                    throw v22.getTargetException();
                                                }
                                                var7_9 = v21;
                                                v23 = var6_8;
                                                if (var4_4 == null) break block73;
                                                if (v23 == null) break block74;
                                                break block82;
                                                catch (Exception v24) {
                                                    throw yf_0.a(v24);
                                                }
                                            }
                                            try {
                                                block83: {
                                                    v23 = var7_9;
                                                    if (var4_4 == null) break block73;
                                                    break block83;
                                                    catch (Exception v25) {
                                                        throw yf_0.a(v25);
                                                    }
                                                }
                                                if (v23.equals(var6_8)) break block74;
                                            }
                                            catch (Exception v26) {
                                                throw yf_0.a(v26);
                                            }
                                            ((HashMap)this.e).remove(var6_8);
                                            ((HashMap)this.e).put(var7_9, var1_1);
                                            new File(var6_8).delete();
                                            var5_6 = 1;
                                        }
                                        try {
                                            v27 = (String)var1_1.g();
                                        }
                                        catch (InvocationTargetException v28) {
                                            throw v28.getTargetException();
                                        }
                                        ((HashMap)this.P).put(v27, var1_1);
                                        try {
                                            v29 = (String)var1_1.G();
                                        }
                                        catch (InvocationTargetException v30) {
                                            throw v30.getTargetException();
                                        }
                                        ((HashMap)this.e).put(v29, var1_1);
                                        try {
                                            v23 = (String)var1_1.G();
                                        }
                                        catch (InvocationTargetException v31) {
                                            throw v31.getTargetException();
                                        }
                                    }
                                    var8_10 = v23;
                                    var9_11 = tq_1.Q;
                                    try {
                                        v32 = var5_6;
                                        if (var4_4 == null) break block75;
                                        if (v32 == 0) break block76;
                                    }
                                    catch (Exception v33) {
                                        throw yf_0.a(v33);
                                    }
                                    var9_11 = tq_1.U;
                                }
                                v32 = var3_3;
                            }
                            try {
                                if (var4_4 == null) break block77;
                                if (v32 == 0) break block78;
                            }
                            catch (Exception v34) {
                                throw yf_0.a(v34);
                            }
                            v32 = tq_1.O;
                        }
                        var9_11 = v32;
                    }
                    var10_12 = new tq_1(var8_10, var9_11, var2_2);
                    try {
                        var10_12.M(var8_10);
                    }
                    catch (InvocationTargetException v35) {
                        throw v35.getTargetException();
                    }
                    if (var4_4 == null) break block79;
                    try {
                        block84: {
                            if (var5_6 == 0) break block80;
                            break block84;
                            catch (Exception v36) {
                                throw yf_0.a(v36);
                            }
                        }
                        try {
                            var10_12.I(var6_8);
                        }
                        catch (InvocationTargetException v37) {
                            throw v37.getTargetException();
                        }
                    }
                    catch (Exception v38) {
                        throw yf_0.a(v38);
                    }
                }
                try {
                    v39 = yt_1.i();
                }
                catch (InvocationTargetException v40) {
                    throw v40.getTargetException();
                }
                try {
                    com.c.d(473928376202613579L).invoke(v39, com.c.a(var10_12));
                }
                catch (InvocationTargetException v41) {
                    throw v41.getTargetException();
                }
                try {
                    v42 = yt_1.i();
                }
                catch (InvocationTargetException v43) {
                    throw v43.getTargetException();
                }
                try {
                    v44 = v42.O();
                }
                catch (InvocationTargetException v45) {
                    throw v45.getTargetException();
                }
                try {
                    v46 = v44.G();
                }
                catch (InvocationTargetException v47) {
                    throw v47.getTargetException();
                }
                try {
                    v46.e(new cx_0(this, var1_1));
                }
                catch (InvocationTargetException v48) {
                    throw v48.getTargetException();
                }
            }
            catch (Exception var5_7) {
                var5_7.printStackTrace();
            }
        }
    }

    public void R(File file) throws Exception {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        String string;
        String string2;
        HashMap hashMap;
        lv_2 lv_22;
        block38: {
            String string3;
            String string4;
            block39: {
                int[] nArray = lv_2.H();
                lv_22 = new lv_2();
                try {
                    lv_22.n(file.getAbsolutePath());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    lv_22.L();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int[] nArray2 = nArray;
                try {
                    Object object5;
                    try {
                        hashMap = (HashMap)this.P;
                        try {
                            string2 = (String)lv_22.g();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (nArray2 == null) break block38;
                        if (!hashMap.containsKey(string2)) break block39;
                    }
                    catch (Exception exception) {
                        throw yf_0.a(exception);
                    }
                    try {
                        object5 = le_2.q();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        lv_22.p(object5);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        lv_22.A();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (Exception exception) {
                    throw yf_0.a(exception);
                }
            }
            try {
                string4 = (String)lv_22.G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((HashMap)this.e).put(string4, lv_22);
            try {
                string3 = (String)lv_22.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((HashMap)this.P).put(string3, lv_22);
            hashMap = (HashMap)this.e;
            try {
                string2 = (String)lv_22.G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        hashMap.put(string2, lv_22);
        try {
            string = (String)lv_22.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string5 = string;
        int n10 = tq_1.Q;
        tq_1 tq_12 = new tq_1(string5, n10, 0);
        try {
            tq_12.M(string5);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object4, com.c.a(tq_12));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.e(new yh_2(this, lv_22));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void Y(File file) throws Exception {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        String string;
        String string2;
        String string3;
        String string4;
        Object object5;
        lv_2 lv_22 = new lv_2();
        try {
            lv_22.n(file.getAbsolutePath());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22.L();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        lv_2 lv_23 = (lv_2)((HashMap)this.e).get(file.getAbsolutePath());
        try {
            object5 = lv_23.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22.p(object5);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string4 = (String)lv_22.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.e).put(string4, lv_22);
        try {
            string3 = (String)lv_22.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.P).put(string3, lv_22);
        try {
            string2 = (String)lv_22.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.e).put(string2, lv_22);
        try {
            string = (String)lv_22.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string5 = string;
        int n10 = tq_1.O;
        tq_1 tq_12 = new tq_1(string5, n10, 0);
        try {
            tq_12.M(string5);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object4, com.c.a(tq_12));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.e(new ad_0(this, lv_22));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void h(String string) {
        String string2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        int n10 = tq_1.d;
        tq_1 tq_12 = new tq_1(string, n10, -1);
        try {
            tq_12.M(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object8 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object8, com.c.a(tq_12));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        lv_2 lv_22 = (lv_2)((HashMap)this.e).get(string);
        try {
            lv_22.d(System.currentTimeMillis());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            try {
                lv_22.A();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object7 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object6 = object7.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object5 = lv_22.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = lv_22.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object6.h(object5, object4, ct_1.o);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string2 = (String)lv_22.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object, com.c.a(new tq_1(string2, tq_1.d, -1)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void g(String string) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        int n10 = tq_1.m;
        tq_1 tq_12 = new tq_1(string, n10, -1);
        try {
            tq_12.M(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object7 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object7, com.c.a(tq_12));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = new File(string).getName();
        lo_1 lo_12 = (lo_1)((HashMap)this.k).get(string2);
        try {
            lo_12.v(System.currentTimeMillis());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            try {
                lo_12.r();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object6 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object5 = object6.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = lo_12.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = lo_12.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object5.h(object4, object3, ct_1.r);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void Y(String string) {
        String string2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        int n10 = tq_1.b;
        tq_1 tq_12 = new tq_1(string, n10, -1);
        try {
            tq_12.M(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object8 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object8, com.c.a(tq_12));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        lv_2 lv_22 = (lv_2)((HashMap)this.e).get(string);
        try {
            object7 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object6 = object7.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object5 = lv_22.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = lv_22.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object6.v(object5, object4, ct_1.o);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string2 = (String)lv_22.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object, com.c.a(new tq_1(string2, tq_1.b, -1)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void x(String string) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        int n10 = tq_1.v;
        tq_1 tq_12 = new tq_1(string, n10, -1);
        try {
            tq_12.M(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object7 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(object7, com.c.a(tq_12));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = new File(string).getName();
        lo_1 lo_12 = (lo_1)((HashMap)this.k).get(string2);
        try {
            object6 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object5 = object6.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = lo_12.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = lo_12.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object5.v(object4, object3, ct_1.r);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public lo_1 m(String string) {
        return (lo_1)((HashMap)this.k).get(string);
    }

    public lv_2 q(String string) {
        return (lv_2)((HashMap)this.e).get(string);
    }

    public lv_2 T(String string) {
        lv_2 lv_22 = new lv_2();
        try {
            lv_22.n(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            try {
                lv_22.L();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return lv_22;
    }

    public lv_2 E(_y_0 _y_02) {
        lv_2 lv_22;
        Object object;
        lv_2 lv_23;
        Object object2;
        lv_2 lv_24 = _y_02.a();
        _y_02.H(null);
        try {
            object2 = lv_24.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_23 = (lv_2)this.S(object2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        lv_2 lv_25 = lv_23;
        try {
            object = lv_25.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22 = (lv_2)this.r((Object)_y_02, object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        lv_2 lv_26 = lv_22;
        return lv_26;
    }

    public lv_2 r(_y_0 _y_02, String string) {
        lv_2 lv_22;
        block13: {
            lv_2 lv_23;
            int[] nArray;
            block11: {
                block12: {
                    lv_2 lv_24;
                    lv_22 = _y_02.a();
                    nArray = lv_2.H();
                    lv_23 = lv_22;
                    if (nArray == null) break block11;
                    if (lv_23 != null) break block12;
                    try {
                        lv_24 = (lv_2)this.T(string);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    lv_22 = lv_24;
                    _y_02.H(lv_22);
                    if (nArray != null) break block13;
                }
                lv_23 = lv_22;
            }
            if (nArray != null) {
                String string2;
                try {
                    string2 = (String)lv_23.G();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (!string2.equals(string)) {
                    try {
                        lv_23 = (lv_2)this.T(string);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else {
                lv_22 = lv_23;
                _y_02.H(lv_22);
            }
        }
        return lv_22;
    }

    public lv_2 S(String string) {
        return (lv_2)((HashMap)this.P).get(string);
    }

    public void p(String string, String string2, boolean bl) {
        lv_2 lv_22 = (lv_2)((HashMap)this.e).get(string);
        try {
            lv_22.n(string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void o(File file, ArrayList arrayList) {
        block9: {
            File[] fileArray;
            int[] nArray;
            block8: {
                File[] fileArray2 = file.listFiles();
                nArray = lv_2.H();
                fileArray = fileArray2;
                if (nArray == null) break block8;
                if (fileArray == null) break block9;
                fileArray = fileArray2;
            }
            for (File file2 : fileArray) {
                boolean bl = file2.isFile();
                if (nArray != null) {
                    if (bl) {
                        arrayList.add(file2);
                    }
                    bl = file2.isDirectory();
                }
                if (!bl) continue;
                try {
                    this.o((Object)file2, (Object)arrayList);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            var15 = new String[23];
                            var13_1 = 0;
                            var12_2 = "\u00e6$Ca\u0018\n\u00a2;6B\u00ae\u001a\u00f9\u0092\u000e\u000b\u00bb>O(\u00dby\u0080Ss\u00dc\u0014\u000e\r\u00ac\u0099z\u00013\u00aa\u0013u\u00fdC\u00c3C\u007f\u0005\u00eb\u00a5E\u009c\u008c\u0004\u0092\u00f1b\u001f\u0004\u00bf\u0083\u0093N\u0005Y{\u0013GF\t\u00f0\u00e6\u00ec\u00fdy\u00e4\u00cf%\u00d2\u000by%\u00bb\u00f0|\u00d06\u008d\u00e0\u00d84\u00044\u00a9+\u00ca\u0014\u00d0\u00b9?_\u00bd\u00cbk\u00ee\u00c6\u00ba\n\u0080C\u00c6\u008fI\u00ee\u00b8#\u0082\u000b\u008b\u0013I\u008d\u001b\u00cd\u0098\u00c5p\u000et\u0014\u001biFE\u0092\u0088\u008e\u0086z\u00b7\u009d!\u00b1\u00f2\u00d1\u00cf%hZ\u0098\u0004\u00a4\u00cc9f\u0011\u00d1\u0000\u00eb&\u00d09\u0086\u008d\u008b\u00efTg\u00dfC\u009f\u00ddg\u0002\u0087\u0010\u0004N*V\u00a0\u000e\u008b\u0013I\u008d\u001b\u00cd\u00e9\u00cc\u001d\u0006N\u00bc\u00e2\u0090\u0004%\t\u00c0\u001f\t\u00b6\u0082$q`u\u00ec\u0017\u00b6\u000f\u00af\u000bj\u0084=\u00b6\u0006\u00ac\u00a2\u00b0<D\u00abYD";
                            var14_3 = "\u00e6$Ca\u0018\n\u00a2;6B\u00ae\u001a\u00f9\u0092\u000e\u000b\u00bb>O(\u00dby\u0080Ss\u00dc\u0014\u000e\r\u00ac\u0099z\u00013\u00aa\u0013u\u00fdC\u00c3C\u007f\u0005\u00eb\u00a5E\u009c\u008c\u0004\u0092\u00f1b\u001f\u0004\u00bf\u0083\u0093N\u0005Y{\u0013GF\t\u00f0\u00e6\u00ec\u00fdy\u00e4\u00cf%\u00d2\u000by%\u00bb\u00f0|\u00d06\u008d\u00e0\u00d84\u00044\u00a9+\u00ca\u0014\u00d0\u00b9?_\u00bd\u00cbk\u00ee\u00c6\u00ba\n\u0080C\u00c6\u008fI\u00ee\u00b8#\u0082\u000b\u008b\u0013I\u008d\u001b\u00cd\u0098\u00c5p\u000et\u0014\u001biFE\u0092\u0088\u008e\u0086z\u00b7\u009d!\u00b1\u00f2\u00d1\u00cf%hZ\u0098\u0004\u00a4\u00cc9f\u0011\u00d1\u0000\u00eb&\u00d09\u0086\u008d\u008b\u00efTg\u00dfC\u009f\u00ddg\u0002\u0087\u0010\u0004N*V\u00a0\u000e\u008b\u0013I\u008d\u001b\u00cd\u00e9\u00cc\u001d\u0006N\u00bc\u00e2\u0090\u0004%\t\u00c0\u001f\t\u00b6\u0082$q`u\u00ec\u0017\u00b6\u000f\u00af\u000bj\u0084=\u00b6\u0006\u00ac\u00a2\u00b0<D\u00abYD".length();
                            var11_4 = 15;
                            var10_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 70;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block22;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "\u0096\u00bdk\u00ceK:\u00fd\u00fd\u00b4\u00fb\u0093\u0004,\u00a87\u00dd";
                                var14_3 = "\u0096\u00bdk\u00ceK:\u00fd\u00fd\u00b4\u00fb\u0093\u0004,\u00a87\u00dd".length();
                                var11_4 = 11;
                                var10_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 110;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block22;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block23;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 8;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 127;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 113;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 104;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 22;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 101;
                                        break;
                                    }
                                    default: {
                                        v15 = 80;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var16_6;
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
                        } while (v10 > var16_6);
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
                    yf_0.a = var15;
                    yf_0.b = new String[23];
                    var2_7 = 7780681785457742111L;
                    var8_8 = new long[2];
                    var5_9 = 0;
                    var6_10 = "a\u00cc\u00f2\u0099\u00eegx\u00d3\u0089\u0017\u00e2\u000b\u0002o\u0006!";
                    var7_11 = "a\u00cc\u00f2\u0099\u00eegx\u00d3\u0089\u0017\u00e2\u000b\u0002o\u0006!".length();
                    var4_12 = 0;
                    while (true) {
                        break block24;
                        break;
                    }
lbl107:
                    // 1 sources

                    while (true) {
                        var8_8[v17] = (((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L) ^ var2_7;
                        if (var4_12 < var7_11) ** continue;
                        break block25;
                        break;
                    }
                }
                var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                v17 = var5_9++;
                ** while (true)
            }
            yf_0.c = var8_8;
            yf_0.d = new Integer[2];
            break block26;
lbl122:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 4118265833767677246L;
        ** while (true)
        yf_0.f = 4118265831516235070L ^ var0_14;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFBB33) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 75;
                    break;
                }
                case 1: {
                    n14 = 88;
                    break;
                }
                case 2: {
                    n14 = 254;
                    break;
                }
                case 3: {
                    n14 = 231;
                    break;
                }
                case 4: {
                    n14 = 94;
                    break;
                }
                case 5: {
                    n14 = 135;
                    break;
                }
                case 6: {
                    n14 = 238;
                    break;
                }
                case 7: {
                    n14 = 141;
                    break;
                }
                case 8: {
                    n14 = 182;
                    break;
                }
                case 9: {
                    n14 = 81;
                    break;
                }
                case 10: {
                    n14 = 7;
                    break;
                }
                case 11: {
                    n14 = 68;
                    break;
                }
                case 12: {
                    n14 = 9;
                    break;
                }
                case 13: {
                    n14 = 95;
                    break;
                }
                case 14: {
                    n14 = 106;
                    break;
                }
                case 15: {
                    n14 = 157;
                    break;
                }
                case 16: {
                    n14 = 85;
                    break;
                }
                case 17: {
                    n14 = 74;
                    break;
                }
                case 18: {
                    n14 = 0;
                    break;
                }
                case 19: {
                    n14 = 54;
                    break;
                }
                case 20: {
                    n14 = 183;
                    break;
                }
                case 21: {
                    n14 = 156;
                    break;
                }
                case 22: {
                    n14 = 48;
                    break;
                }
                case 23: {
                    n14 = 206;
                    break;
                }
                case 24: {
                    n14 = 232;
                    break;
                }
                case 25: {
                    n14 = 13;
                    break;
                }
                case 26: {
                    n14 = 158;
                    break;
                }
                case 27: {
                    n14 = 123;
                    break;
                }
                case 28: {
                    n14 = 96;
                    break;
                }
                case 29: {
                    n14 = 52;
                    break;
                }
                case 30: {
                    n14 = 218;
                    break;
                }
                case 31: {
                    n14 = 220;
                    break;
                }
                case 32: {
                    n14 = 155;
                    break;
                }
                case 33: {
                    n14 = 202;
                    break;
                }
                case 34: {
                    n14 = 208;
                    break;
                }
                case 35: {
                    n14 = 39;
                    break;
                }
                case 36: {
                    n14 = 38;
                    break;
                }
                case 37: {
                    n14 = 51;
                    break;
                }
                case 38: {
                    n14 = 226;
                    break;
                }
                case 39: {
                    n14 = 57;
                    break;
                }
                case 40: {
                    n14 = 27;
                    break;
                }
                case 41: {
                    n14 = 241;
                    break;
                }
                case 42: {
                    n14 = 150;
                    break;
                }
                case 43: {
                    n14 = 198;
                    break;
                }
                case 44: {
                    n14 = 185;
                    break;
                }
                case 45: {
                    n14 = 43;
                    break;
                }
                case 46: {
                    n14 = 61;
                    break;
                }
                case 47: {
                    n14 = 83;
                    break;
                }
                case 48: {
                    n14 = 33;
                    break;
                }
                case 49: {
                    n14 = 79;
                    break;
                }
                case 50: {
                    n14 = 19;
                    break;
                }
                case 51: {
                    n14 = 145;
                    break;
                }
                case 52: {
                    n14 = 152;
                    break;
                }
                case 53: {
                    n14 = 31;
                    break;
                }
                case 54: {
                    n14 = 205;
                    break;
                }
                case 55: {
                    n14 = 139;
                    break;
                }
                case 56: {
                    n14 = 102;
                    break;
                }
                case 57: {
                    n14 = 176;
                    break;
                }
                case 58: {
                    n14 = 146;
                    break;
                }
                case 59: {
                    n14 = 84;
                    break;
                }
                case 60: {
                    n14 = 64;
                    break;
                }
                case 61: {
                    n14 = 132;
                    break;
                }
                case 62: {
                    n14 = 137;
                    break;
                }
                case 63: {
                    n14 = 178;
                    break;
                }
                case 64: {
                    n14 = 97;
                    break;
                }
                case 65: {
                    n14 = 105;
                    break;
                }
                case 66: {
                    n14 = 253;
                    break;
                }
                case 67: {
                    n14 = 120;
                    break;
                }
                case 68: {
                    n14 = 80;
                    break;
                }
                case 69: {
                    n14 = 223;
                    break;
                }
                case 70: {
                    n14 = 200;
                    break;
                }
                case 71: {
                    n14 = 49;
                    break;
                }
                case 72: {
                    n14 = 133;
                    break;
                }
                case 73: {
                    n14 = 201;
                    break;
                }
                case 74: {
                    n14 = 177;
                    break;
                }
                case 75: {
                    n14 = 82;
                    break;
                }
                case 76: {
                    n14 = 16;
                    break;
                }
                case 77: {
                    n14 = 45;
                    break;
                }
                case 78: {
                    n14 = 213;
                    break;
                }
                case 79: {
                    n14 = 189;
                    break;
                }
                case 80: {
                    n14 = 228;
                    break;
                }
                case 81: {
                    n14 = 41;
                    break;
                }
                case 82: {
                    n14 = 89;
                    break;
                }
                case 83: {
                    n14 = 204;
                    break;
                }
                case 84: {
                    n14 = 187;
                    break;
                }
                case 85: {
                    n14 = 4;
                    break;
                }
                case 86: {
                    n14 = 71;
                    break;
                }
                case 87: {
                    n14 = 227;
                    break;
                }
                case 88: {
                    n14 = 35;
                    break;
                }
                case 89: {
                    n14 = 72;
                    break;
                }
                case 90: {
                    n14 = 138;
                    break;
                }
                case 91: {
                    n14 = 143;
                    break;
                }
                case 92: {
                    n14 = 180;
                    break;
                }
                case 93: {
                    n14 = 214;
                    break;
                }
                case 94: {
                    n14 = 255;
                    break;
                }
                case 95: {
                    n14 = 173;
                    break;
                }
                case 96: {
                    n14 = 108;
                    break;
                }
                case 97: {
                    n14 = 234;
                    break;
                }
                case 98: {
                    n14 = 203;
                    break;
                }
                case 99: {
                    n14 = 167;
                    break;
                }
                case 100: {
                    n14 = 5;
                    break;
                }
                case 101: {
                    n14 = 216;
                    break;
                }
                case 102: {
                    n14 = 128;
                    break;
                }
                case 103: {
                    n14 = 112;
                    break;
                }
                case 104: {
                    n14 = 159;
                    break;
                }
                case 105: {
                    n14 = 118;
                    break;
                }
                case 106: {
                    n14 = 40;
                    break;
                }
                case 107: {
                    n14 = 6;
                    break;
                }
                case 108: {
                    n14 = 26;
                    break;
                }
                case 109: {
                    n14 = 142;
                    break;
                }
                case 110: {
                    n14 = 115;
                    break;
                }
                case 111: {
                    n14 = 87;
                    break;
                }
                case 112: {
                    n14 = 91;
                    break;
                }
                case 113: {
                    n14 = 55;
                    break;
                }
                case 114: {
                    n14 = 229;
                    break;
                }
                case 115: {
                    n14 = 56;
                    break;
                }
                case 116: {
                    n14 = 174;
                    break;
                }
                case 117: {
                    n14 = 162;
                    break;
                }
                case 118: {
                    n14 = 86;
                    break;
                }
                case 119: {
                    n14 = 148;
                    break;
                }
                case 120: {
                    n14 = 32;
                    break;
                }
                case 121: {
                    n14 = 237;
                    break;
                }
                case 122: {
                    n14 = 53;
                    break;
                }
                case 123: {
                    n14 = 245;
                    break;
                }
                case 124: {
                    n14 = 29;
                    break;
                }
                case 125: {
                    n14 = 184;
                    break;
                }
                case 126: {
                    n14 = 24;
                    break;
                }
                case 127: {
                    n14 = 161;
                    break;
                }
                case 128: {
                    n14 = 147;
                    break;
                }
                case 129: {
                    n14 = 92;
                    break;
                }
                case 130: {
                    n14 = 22;
                    break;
                }
                case 131: {
                    n14 = 169;
                    break;
                }
                case 132: {
                    n14 = 251;
                    break;
                }
                case 133: {
                    n14 = 30;
                    break;
                }
                case 134: {
                    n14 = 14;
                    break;
                }
                case 135: {
                    n14 = 37;
                    break;
                }
                case 136: {
                    n14 = 124;
                    break;
                }
                case 137: {
                    n14 = 23;
                    break;
                }
                case 138: {
                    n14 = 217;
                    break;
                }
                case 139: {
                    n14 = 107;
                    break;
                }
                case 140: {
                    n14 = 10;
                    break;
                }
                case 141: {
                    n14 = 192;
                    break;
                }
                case 142: {
                    n14 = 193;
                    break;
                }
                case 143: {
                    n14 = 140;
                    break;
                }
                case 144: {
                    n14 = 171;
                    break;
                }
                case 145: {
                    n14 = 116;
                    break;
                }
                case 146: {
                    n14 = 101;
                    break;
                }
                case 147: {
                    n14 = 63;
                    break;
                }
                case 148: {
                    n14 = 70;
                    break;
                }
                case 149: {
                    n14 = 44;
                    break;
                }
                case 150: {
                    n14 = 18;
                    break;
                }
                case 151: {
                    n14 = 160;
                    break;
                }
                case 152: {
                    n14 = 59;
                    break;
                }
                case 153: {
                    n14 = 209;
                    break;
                }
                case 154: {
                    n14 = 114;
                    break;
                }
                case 155: {
                    n14 = 2;
                    break;
                }
                case 156: {
                    n14 = 110;
                    break;
                }
                case 157: {
                    n14 = 60;
                    break;
                }
                case 158: {
                    n14 = 36;
                    break;
                }
                case 159: {
                    n14 = 163;
                    break;
                }
                case 160: {
                    n14 = 121;
                    break;
                }
                case 161: {
                    n14 = 179;
                    break;
                }
                case 162: {
                    n14 = 153;
                    break;
                }
                case 163: {
                    n14 = 100;
                    break;
                }
                case 164: {
                    n14 = 122;
                    break;
                }
                case 165: {
                    n14 = 119;
                    break;
                }
                case 166: {
                    n14 = 221;
                    break;
                }
                case 167: {
                    n14 = 242;
                    break;
                }
                case 168: {
                    n14 = 197;
                    break;
                }
                case 169: {
                    n14 = 25;
                    break;
                }
                case 170: {
                    n14 = 109;
                    break;
                }
                case 171: {
                    n14 = 222;
                    break;
                }
                case 172: {
                    n14 = 235;
                    break;
                }
                case 173: {
                    n14 = 246;
                    break;
                }
                case 174: {
                    n14 = 247;
                    break;
                }
                case 175: {
                    n14 = 47;
                    break;
                }
                case 176: {
                    n14 = 66;
                    break;
                }
                case 177: {
                    n14 = 188;
                    break;
                }
                case 178: {
                    n14 = 1;
                    break;
                }
                case 179: {
                    n14 = 130;
                    break;
                }
                case 180: {
                    n14 = 149;
                    break;
                }
                case 181: {
                    n14 = 240;
                    break;
                }
                case 182: {
                    n14 = 136;
                    break;
                }
                case 183: {
                    n14 = 65;
                    break;
                }
                case 184: {
                    n14 = 76;
                    break;
                }
                case 185: {
                    n14 = 212;
                    break;
                }
                case 186: {
                    n14 = 225;
                    break;
                }
                case 187: {
                    n14 = 224;
                    break;
                }
                case 188: {
                    n14 = 244;
                    break;
                }
                case 189: {
                    n14 = 20;
                    break;
                }
                case 190: {
                    n14 = 207;
                    break;
                }
                case 191: {
                    n14 = 11;
                    break;
                }
                case 192: {
                    n14 = 58;
                    break;
                }
                case 193: {
                    n14 = 230;
                    break;
                }
                case 194: {
                    n14 = 42;
                    break;
                }
                case 195: {
                    n14 = 233;
                    break;
                }
                case 196: {
                    n14 = 154;
                    break;
                }
                case 197: {
                    n14 = 46;
                    break;
                }
                case 198: {
                    n14 = 195;
                    break;
                }
                case 199: {
                    n14 = 15;
                    break;
                }
                case 200: {
                    n14 = 117;
                    break;
                }
                case 201: {
                    n14 = 129;
                    break;
                }
                case 202: {
                    n14 = 250;
                    break;
                }
                case 203: {
                    n14 = 151;
                    break;
                }
                case 204: {
                    n14 = 98;
                    break;
                }
                case 205: {
                    n14 = 73;
                    break;
                }
                case 206: {
                    n14 = 252;
                    break;
                }
                case 207: {
                    n14 = 3;
                    break;
                }
                case 208: {
                    n14 = 17;
                    break;
                }
                case 209: {
                    n14 = 8;
                    break;
                }
                case 210: {
                    n14 = 181;
                    break;
                }
                case 211: {
                    n14 = 134;
                    break;
                }
                case 212: {
                    n14 = 239;
                    break;
                }
                case 213: {
                    n14 = 125;
                    break;
                }
                case 214: {
                    n14 = 50;
                    break;
                }
                case 215: {
                    n14 = 236;
                    break;
                }
                case 216: {
                    n14 = 12;
                    break;
                }
                case 217: {
                    n14 = 111;
                    break;
                }
                case 218: {
                    n14 = 186;
                    break;
                }
                case 219: {
                    n14 = 113;
                    break;
                }
                case 220: {
                    n14 = 211;
                    break;
                }
                case 221: {
                    n14 = 67;
                    break;
                }
                case 222: {
                    n14 = 243;
                    break;
                }
                case 223: {
                    n14 = 190;
                    break;
                }
                case 224: {
                    n14 = 196;
                    break;
                }
                case 225: {
                    n14 = 175;
                    break;
                }
                case 226: {
                    n14 = 191;
                    break;
                }
                case 227: {
                    n14 = 194;
                    break;
                }
                case 228: {
                    n14 = 144;
                    break;
                }
                case 229: {
                    n14 = 77;
                    break;
                }
                case 230: {
                    n14 = 69;
                    break;
                }
                case 231: {
                    n14 = 21;
                    break;
                }
                case 232: {
                    n14 = 62;
                    break;
                }
                case 233: {
                    n14 = 99;
                    break;
                }
                case 234: {
                    n14 = 170;
                    break;
                }
                case 235: {
                    n14 = 131;
                    break;
                }
                case 236: {
                    n14 = 34;
                    break;
                }
                case 237: {
                    n14 = 78;
                    break;
                }
                case 238: {
                    n14 = 127;
                    break;
                }
                case 239: {
                    n14 = 168;
                    break;
                }
                case 240: {
                    n14 = 215;
                    break;
                }
                case 241: {
                    n14 = 93;
                    break;
                }
                case 242: {
                    n14 = 248;
                    break;
                }
                case 243: {
                    n14 = 28;
                    break;
                }
                case 244: {
                    n14 = 210;
                    break;
                }
                case 245: {
                    n14 = 165;
                    break;
                }
                case 246: {
                    n14 = 166;
                    break;
                }
                case 247: {
                    n14 = 126;
                    break;
                }
                case 248: {
                    n14 = 249;
                    break;
                }
                case 249: {
                    n14 = 219;
                    break;
                }
                case 250: {
                    n14 = 199;
                    break;
                }
                case 251: {
                    n14 = 103;
                    break;
                }
                case 252: {
                    n14 = 104;
                    break;
                }
                case 253: {
                    n14 = 172;
                    break;
                }
                case 254: {
                    n14 = 164;
                    break;
                }
                default: {
                    n14 = 90;
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
            yf_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1DC2;
        if (d[n11] == null) {
            yf_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

