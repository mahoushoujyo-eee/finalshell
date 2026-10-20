/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.SwingConstants;

/*
 * Renamed from com.Tz
 */
public class tz_0
extends T4
implements SwingConstants {
    public static final List T;
    public static final List H;
    protected final Map Q = new HashMap();
    protected int w = 0;
    protected int K = 0;
    protected boolean Y = false;
    protected boolean Z = false;
    private static final String[] a;
    private static final String[] b;

    public int u() {
        return this.w;
    }

    public void p(int n10) {
        this.w = n10;
    }

    public int n() {
        return this.K;
    }

    public void a(int n10) {
        this.K = n10;
    }

    public boolean t() {
        return this.Y;
    }

    public void Y(boolean bl) {
        this.Y = bl;
    }

    public boolean b() {
        return this.Z;
    }

    public void x(boolean bl) {
        this.Z = bl;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void A(Component var1_1, Object var2_2) {
        block21: {
            block18: {
                block22: {
                    var4_3 = (String)var2_2;
                    var3_4 = T4.O();
                    v0 = var4_3;
                    if (var3_4 != 0) break block18;
                    if (v0 == null) ** GOTO lbl53
                    break block22;
                    catch (Throwable v1) {
                        throw tz_0.a(v1);
                    }
                }
                try {
                    block23: {
                        v0 = var4_3.trim();
                        if (var3_4 != 0) break block18;
                        break block23;
                        catch (Throwable v2) {
                            throw tz_0.a(v2);
                        }
                    }
                    if (!v0.equals("")) {
                    }
                    ** GOTO lbl53
                }
                catch (Throwable v3) {
                    throw tz_0.a(v3);
                }
                try {
                    block19: {
                        block20: {
                            var5_5 = this.u(var4_3);
                            v4 = tz_0.T.contains(var5_5);
                            if (var3_4 != 0) break block19;
                            try {
                                block24: {
                                    if (v4 != 0) break block20;
                                    break block24;
                                    catch (Throwable v5) {
                                        throw tz_0.a(v5);
                                    }
                                }
                                this.R();
                            }
                            catch (Throwable v6) {
                                throw tz_0.a(v6);
                            }
                        }
                        v4 = this.c(var4_3);
                    }
                    var6_7 = v4;
                    try {
                        if (!tz_0.H.contains(var6_7)) {
                            this.R();
                        }
                        break block21;
                    }
                    catch (Throwable v7) {
                        throw tz_0.a(v7);
                    }
                }
                catch (Throwable var5_6) {
                    try {
                        this.R();
                        if (var3_4 == 0) break block21;
lbl53:
                        // 3 sources

                        v0 = tz_0.a(19251, -23407);
                    }
                    catch (Throwable v8) {
                        throw tz_0.a(v8);
                    }
                }
            }
            var4_3 = v0;
        }
        this.Q.put(var1_1, var4_3);
    }

    protected void R() {
        throw new IllegalArgumentException(tz_0.a(19250, -11561));
    }

    protected int u(String string) {
        int n10;
        block6: {
            String string2;
            block4: {
                block5: {
                    int n11 = T4.O();
                    try {
                        try {
                            string2 = string;
                            if (n11 != 0) break block4;
                            if (string2 != null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw tz_0.a(illegalArgumentException);
                        }
                        n10 = 0;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw tz_0.a(illegalArgumentException);
                    }
                }
                string2 = string.substring(0, string.indexOf(","));
            }
            n10 = Integer.parseInt(string2);
        }
        return n10;
    }

    protected int c(String string) {
        int n10;
        block6: {
            String string2;
            block4: {
                block5: {
                    int n11 = T4.b();
                    try {
                        try {
                            string2 = string;
                            if (n11 == 0) break block4;
                            if (string2 != null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw tz_0.a(illegalArgumentException);
                        }
                        n10 = 0;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw tz_0.a(illegalArgumentException);
                    }
                }
                string2 = string.substring(string.indexOf(",") + ",".length());
            }
            n10 = Integer.parseInt(string2);
        }
        return n10;
    }

    @Override
    public void F(Component component) {
        this.Q.remove(component);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Dimension preferredLayoutSize(Container var1_1) {
        block72: {
            block76: {
                block75: {
                    block56: {
                        block71: {
                            block70: {
                                block77: {
                                    block67: {
                                        block66: {
                                            block57: {
                                                var2_2 = T4.b();
                                                try {
                                                    v0 = var1_1.getComponentCount();
                                                    v1 = 1;
                                                    if (var2_2 == 0) break block56;
                                                    if (v0 > v1) {
                                                    }
                                                    ** GOTO lbl180
                                                }
                                                catch (IllegalArgumentException v2) {
                                                    throw tz_0.a(v2);
                                                }
                                                var4_3 = new HashMap<K, V>();
                                                var5_4 = new HashMap<Integer, Integer>();
                                                var6_5 = tz_0.T.iterator();
                                                while (var6_5.hasNext()) {
                                                    var7_6 = (Integer)var6_5.next();
                                                    var8_8 = tz_0.H.iterator();
                                                    while (var8_8.hasNext()) {
                                                        block58: {
                                                            block64: {
                                                                block65: {
                                                                    block63: {
                                                                        block59: {
                                                                            block60: {
                                                                                block61: {
                                                                                    block62: {
                                                                                        var9_9 = (Integer)var8_8.next();
                                                                                        var10_10 = this.S(var1_1, var7_6, var9_9);
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v3 = var10_10;
                                                                                                                if (var2_2 == 0) break block57;
                                                                                                                if (v3 == null) break block58;
                                                                                                            }
                                                                                                            catch (IllegalArgumentException v4) {
                                                                                                                throw tz_0.a(v4);
                                                                                                            }
                                                                                                            v5 = this.Y;
                                                                                                            if (var2_2 == 0) break block59;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v6) {
                                                                                                            throw tz_0.a(v6);
                                                                                                        }
                                                                                                        if (v5 != 0) break block60;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v7) {
                                                                                                        throw tz_0.a(v7);
                                                                                                    }
                                                                                                    v8 = var4_3.containsKey(var7_6);
                                                                                                    if (var2_2 == 0) break block61;
                                                                                                }
                                                                                                catch (IllegalArgumentException v9) {
                                                                                                    throw tz_0.a(v9);
                                                                                                }
                                                                                                if (v8 == 0) break block62;
                                                                                            }
                                                                                            catch (IllegalArgumentException v10) {
                                                                                                throw tz_0.a(v10);
                                                                                            }
                                                                                            v8 = (Integer)var4_3.get(var7_6);
                                                                                            break block61;
                                                                                        }
                                                                                        catch (IllegalArgumentException v11) {
                                                                                            throw tz_0.a(v11);
                                                                                        }
                                                                                    }
                                                                                    v8 = 0;
                                                                                }
                                                                                var11_11 = v8;
                                                                                var4_3.put(var7_6, Math.max(var11_11, var10_10.width));
                                                                            }
                                                                            v5 = this.Z;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var2_2 == 0) break block63;
                                                                                if (v5 != 0) break block58;
                                                                            }
                                                                            catch (IllegalArgumentException v12) {
                                                                                throw tz_0.a(v12);
                                                                            }
                                                                            v5 = var4_3.containsKey(var9_9);
                                                                        }
                                                                        catch (IllegalArgumentException v13) {
                                                                            throw tz_0.a(v13);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var2_2 == 0) break block64;
                                                                            if (v5 == 0) break block65;
                                                                        }
                                                                        catch (IllegalArgumentException v14) {
                                                                            throw tz_0.a(v14);
                                                                        }
                                                                        v5 = (Integer)var4_3.get(var9_9);
                                                                        break block64;
                                                                    }
                                                                    catch (IllegalArgumentException v15) {
                                                                        throw tz_0.a(v15);
                                                                    }
                                                                }
                                                                v5 = 0;
                                                            }
                                                            var11_11 = v5;
                                                            var5_4.put(var9_9, Math.max(var11_11, var10_10.height));
                                                        }
                                                        if (var2_2 != 0) continue;
                                                    }
                                                    if (var2_2 != 0) continue;
                                                }
                                                v3 = new Dimension(0, 0);
                                            }
                                            var3_12 = v3;
                                            try {
                                                try {
                                                    if (var2_2 == 0) break block66;
                                                    if (!this.Y) break block67;
                                                }
                                                catch (IllegalArgumentException v16) {
                                                    throw tz_0.a(v16);
                                                }
                                                var3_12.width = FN.f(var1_1.getComponents());
                                            }
                                            catch (IllegalArgumentException v17) {
                                                throw tz_0.a(v17);
                                            }
                                        }
                                        if (var2_2 != 0) break block77;
                                    }
                                    var6_5 = var4_3.values().iterator();
                                    while (var6_5.hasNext()) {
                                        block68: {
                                            block69: {
                                                var7_7 = (Integer)var6_5.next();
                                                try {
                                                    try {
                                                        try {
                                                            v18 = var3_12;
                                                            v19 = v18;
                                                            v20 = v18.width;
                                                            v21 = var3_12.width;
                                                            if (var2_2 != 0) {
                                                                if (var2_2 == 0) break block68;
                                                            }
                                                            ** GOTO lbl160
                                                        }
                                                        catch (IllegalArgumentException v22) {
                                                            throw tz_0.a(v22);
                                                        }
                                                        if (v21 <= 0) break block69;
                                                    }
                                                    catch (IllegalArgumentException v23) {
                                                        throw tz_0.a(v23);
                                                    }
                                                    v24 = this.w + var7_7;
                                                    break block68;
                                                }
                                                catch (IllegalArgumentException v25) {
                                                    throw tz_0.a(v25);
                                                }
                                            }
                                            v24 = var7_7;
                                        }
                                        v19.width = v20 + v24;
                                        if (var2_2 != 0) continue;
                                    }
                                }
                                try {
                                    if (!this.Z) break block70;
                                    var3_12.height = FN.T(var1_1.getComponents());
                                    if (var2_2 != 0) break block71;
                                }
                                catch (IllegalArgumentException v26) {
                                    throw tz_0.a(v26);
                                }
                            }
                            for (Integer var7_7 : var5_4.values()) {
                                block73: {
                                    block74: {
                                        try {
                                            if (var2_2 == 0) break block72;
                                            v27 = var3_12;
                                            v19 = v27;
                                            v20 = v27.height;
                                            v21 = var3_12.height;
                                        }
                                        catch (IllegalArgumentException v28) {
                                            throw tz_0.a(v28);
                                        }
lbl160:
                                        // 2 sources

                                        try {
                                            try {
                                                if (var2_2 == 0) break block73;
                                                if (v21 <= 0) break block74;
                                            }
                                            catch (IllegalArgumentException v29) {
                                                throw tz_0.a(v29);
                                            }
                                            v21 = this.K + var7_7;
                                            break block73;
                                        }
                                        catch (IllegalArgumentException v30) {
                                            throw tz_0.a(v30);
                                        }
                                    }
                                    v21 = var7_7;
                                }
                                v19.height = v20 + v21;
                                if (var2_2 != 0) continue;
                            }
                        }
                        try {
                            try {
                                if (var2_2 != 0) break block72;
lbl180:
                                // 2 sources

                                v31 = var1_1;
                                if (var2_2 == 0) break block75;
                            }
                            catch (IllegalArgumentException v32) {
                                throw tz_0.a(v32);
                            }
                            v0 = v31.getComponentCount();
                            v1 = 1;
                        }
                        catch (IllegalArgumentException v33) {
                            throw tz_0.a(v33);
                        }
                    }
                    try {
                        if (v0 != v1) break block76;
                        v31 = var1_1.getComponent(0);
                    }
                    catch (IllegalArgumentException v34) {
                        throw tz_0.a(v34);
                    }
                }
                var3_12 = v31.getPreferredSize();
                if (var2_2 != 0) break block72;
            }
            var3_12 = new Dimension(0, 0);
        }
        var4_3 = var1_1.getInsets();
        var3_12.width += var4_3.left + var4_3.right;
        var3_12.height += var4_3.top + var4_3.bottom;
        return var3_12;
    }

    protected Dimension S(Container container, int n10, int n11) {
        Dimension dimension;
        block18: {
            block20: {
                int n12;
                int n13;
                Dimension dimension2;
                block16: {
                    dimension2 = new Dimension(0, 0);
                    Component[] componentArray = container.getComponents();
                    n13 = T4.O();
                    int n14 = componentArray.length;
                    int n15 = 0;
                    while (n15 < n14) {
                        block15: {
                            block17: {
                                Component component = componentArray[n15];
                                String string = (String)this.Q.get(component);
                                try {
                                    try {
                                        try {
                                            if (n13 != 0) break block15;
                                            n12 = this.u(string);
                                            if (n13 != 0) break block16;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw tz_0.a(illegalArgumentException);
                                        }
                                        if (n12 != n10) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw tz_0.a(illegalArgumentException);
                                    }
                                    if (this.c(string) != n11) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw tz_0.a(illegalArgumentException);
                                }
                                dimension2 = FN.h(dimension2, component.getPreferredSize());
                            }
                            ++n15;
                        }
                        if (n13 == 0) continue;
                    }
                    try {
                        dimension = dimension2;
                        if (n13 != 0) break block18;
                        n12 = dimension.width;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw tz_0.a(illegalArgumentException);
                    }
                }
                try {
                    block19: {
                        try {
                            try {
                                if (n12 > 0) break block19;
                                dimension = dimension2;
                                if (n13 != 0) break block18;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw tz_0.a(illegalArgumentException);
                            }
                            if (dimension.height <= 0) break block20;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw tz_0.a(illegalArgumentException);
                        }
                    }
                    dimension = dimension2;
                    break block18;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw tz_0.a(illegalArgumentException);
                }
            }
            dimension = null;
        }
        return dimension;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void layoutContainer(Container var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 14[SWITCH]
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

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u009e\u00f5\u009a>\u000bD\u009e\u00b2\u0011sIf6K\u0089\u00ae\u00a5T\u0003(\u00dc~\u0014\u008b:e\u00a9\u00d9\u00a9\u0003m\u00bb$\u0083\u00b0\u00ec\u001e\u00b76s\u00de\u00d4v\u00f1\u009f\u00d5Ch\u001fJ\u00a7\u00eb\u00eaj\u0090[\u00d2\u0018\u0081\u00cf?\u00f8\u0099\u008ea\u0003\u00camS";
            var4_3 = "\u009e\u00f5\u009a>\u000bD\u009e\u00b2\u0011sIf6K\u0089\u00ae\u00a5T\u0003(\u00dc~\u0014\u008b:e\u00a9\u00d9\u00a9\u0003m\u00bb$\u0083\u00b0\u00ec\u001e\u00b76s\u00de\u00d4v\u00f1\u009f\u00d5Ch\u001fJ\u00a7\u00eb\u00eaj\u0090[\u00d2\u0018\u0081\u00cf?\u00f8\u0099\u008ea\u0003\u00camS".length();
            var1_4 = 65;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 28;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 31;
                            break;
                        }
                        case 1: {
                            v11 = 81;
                            break;
                        }
                        case 2: {
                            v11 = 112;
                            break;
                        }
                        case 3: {
                            v11 = 22;
                            break;
                        }
                        case 4: {
                            v11 = 5;
                            break;
                        }
                        case 5: {
                            v11 = 9;
                            break;
                        }
                        default: {
                            v11 = 98;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        tz_0.a = var5;
        tz_0.b = new String[2];
        tz_0.T = Arrays.asList(new Integer[]{2, 0, 4});
        tz_0.H = Arrays.asList(new Integer[]{1, 0, 3});
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4B32) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 243;
                    break;
                }
                case 1: {
                    n14 = 173;
                    break;
                }
                case 2: {
                    n14 = 100;
                    break;
                }
                case 3: {
                    n14 = 236;
                    break;
                }
                case 4: {
                    n14 = 139;
                    break;
                }
                case 5: {
                    n14 = 187;
                    break;
                }
                case 6: {
                    n14 = 238;
                    break;
                }
                case 7: {
                    n14 = 253;
                    break;
                }
                case 8: {
                    n14 = 17;
                    break;
                }
                case 9: {
                    n14 = 251;
                    break;
                }
                case 10: {
                    n14 = 207;
                    break;
                }
                case 11: {
                    n14 = 170;
                    break;
                }
                case 12: {
                    n14 = 115;
                    break;
                }
                case 13: {
                    n14 = 172;
                    break;
                }
                case 14: {
                    n14 = 62;
                    break;
                }
                case 15: {
                    n14 = 160;
                    break;
                }
                case 16: {
                    n14 = 71;
                    break;
                }
                case 17: {
                    n14 = 25;
                    break;
                }
                case 18: {
                    n14 = 196;
                    break;
                }
                case 19: {
                    n14 = 19;
                    break;
                }
                case 20: {
                    n14 = 93;
                    break;
                }
                case 21: {
                    n14 = 119;
                    break;
                }
                case 22: {
                    n14 = 248;
                    break;
                }
                case 23: {
                    n14 = 188;
                    break;
                }
                case 24: {
                    n14 = 74;
                    break;
                }
                case 25: {
                    n14 = 225;
                    break;
                }
                case 26: {
                    n14 = 209;
                    break;
                }
                case 27: {
                    n14 = 31;
                    break;
                }
                case 28: {
                    n14 = 234;
                    break;
                }
                case 29: {
                    n14 = 28;
                    break;
                }
                case 30: {
                    n14 = 45;
                    break;
                }
                case 31: {
                    n14 = 208;
                    break;
                }
                case 32: {
                    n14 = 233;
                    break;
                }
                case 33: {
                    n14 = 86;
                    break;
                }
                case 34: {
                    n14 = 126;
                    break;
                }
                case 35: {
                    n14 = 175;
                    break;
                }
                case 36: {
                    n14 = 35;
                    break;
                }
                case 37: {
                    n14 = 138;
                    break;
                }
                case 38: {
                    n14 = 193;
                    break;
                }
                case 39: {
                    n14 = 53;
                    break;
                }
                case 40: {
                    n14 = 227;
                    break;
                }
                case 41: {
                    n14 = 101;
                    break;
                }
                case 42: {
                    n14 = 13;
                    break;
                }
                case 43: {
                    n14 = 222;
                    break;
                }
                case 44: {
                    n14 = 5;
                    break;
                }
                case 45: {
                    n14 = 18;
                    break;
                }
                case 46: {
                    n14 = 199;
                    break;
                }
                case 47: {
                    n14 = 228;
                    break;
                }
                case 48: {
                    n14 = 216;
                    break;
                }
                case 49: {
                    n14 = 12;
                    break;
                }
                case 50: {
                    n14 = 89;
                    break;
                }
                case 51: {
                    n14 = 137;
                    break;
                }
                case 52: {
                    n14 = 179;
                    break;
                }
                case 53: {
                    n14 = 73;
                    break;
                }
                case 54: {
                    n14 = 168;
                    break;
                }
                case 55: {
                    n14 = 49;
                    break;
                }
                case 56: {
                    n14 = 102;
                    break;
                }
                case 57: {
                    n14 = 15;
                    break;
                }
                case 58: {
                    n14 = 51;
                    break;
                }
                case 59: {
                    n14 = 223;
                    break;
                }
                case 60: {
                    n14 = 57;
                    break;
                }
                case 61: {
                    n14 = 224;
                    break;
                }
                case 62: {
                    n14 = 61;
                    break;
                }
                case 63: {
                    n14 = 92;
                    break;
                }
                case 64: {
                    n14 = 162;
                    break;
                }
                case 65: {
                    n14 = 26;
                    break;
                }
                case 66: {
                    n14 = 182;
                    break;
                }
                case 67: {
                    n14 = 127;
                    break;
                }
                case 68: {
                    n14 = 151;
                    break;
                }
                case 69: {
                    n14 = 63;
                    break;
                }
                case 70: {
                    n14 = 149;
                    break;
                }
                case 71: {
                    n14 = 78;
                    break;
                }
                case 72: {
                    n14 = 64;
                    break;
                }
                case 73: {
                    n14 = 85;
                    break;
                }
                case 74: {
                    n14 = 165;
                    break;
                }
                case 75: {
                    n14 = 52;
                    break;
                }
                case 76: {
                    n14 = 177;
                    break;
                }
                case 77: {
                    n14 = 191;
                    break;
                }
                case 78: {
                    n14 = 197;
                    break;
                }
                case 79: {
                    n14 = 84;
                    break;
                }
                case 80: {
                    n14 = 143;
                    break;
                }
                case 81: {
                    n14 = 109;
                    break;
                }
                case 82: {
                    n14 = 32;
                    break;
                }
                case 83: {
                    n14 = 27;
                    break;
                }
                case 84: {
                    n14 = 106;
                    break;
                }
                case 85: {
                    n14 = 217;
                    break;
                }
                case 86: {
                    n14 = 87;
                    break;
                }
                case 87: {
                    n14 = 94;
                    break;
                }
                case 88: {
                    n14 = 90;
                    break;
                }
                case 89: {
                    n14 = 178;
                    break;
                }
                case 90: {
                    n14 = 9;
                    break;
                }
                case 91: {
                    n14 = 81;
                    break;
                }
                case 92: {
                    n14 = 11;
                    break;
                }
                case 93: {
                    n14 = 72;
                    break;
                }
                case 94: {
                    n14 = 99;
                    break;
                }
                case 95: {
                    n14 = 198;
                    break;
                }
                case 96: {
                    n14 = 136;
                    break;
                }
                case 97: {
                    n14 = 47;
                    break;
                }
                case 98: {
                    n14 = 2;
                    break;
                }
                case 99: {
                    n14 = 22;
                    break;
                }
                case 100: {
                    n14 = 212;
                    break;
                }
                case 101: {
                    n14 = 105;
                    break;
                }
                case 102: {
                    n14 = 4;
                    break;
                }
                case 103: {
                    n14 = 147;
                    break;
                }
                case 104: {
                    n14 = 46;
                    break;
                }
                case 105: {
                    n14 = 135;
                    break;
                }
                case 106: {
                    n14 = 250;
                    break;
                }
                case 107: {
                    n14 = 226;
                    break;
                }
                case 108: {
                    n14 = 20;
                    break;
                }
                case 109: {
                    n14 = 14;
                    break;
                }
                case 110: {
                    n14 = 55;
                    break;
                }
                case 111: {
                    n14 = 98;
                    break;
                }
                case 112: {
                    n14 = 219;
                    break;
                }
                case 113: {
                    n14 = 60;
                    break;
                }
                case 114: {
                    n14 = 190;
                    break;
                }
                case 115: {
                    n14 = 205;
                    break;
                }
                case 116: {
                    n14 = 218;
                    break;
                }
                case 117: {
                    n14 = 108;
                    break;
                }
                case 118: {
                    n14 = 116;
                    break;
                }
                case 119: {
                    n14 = 112;
                    break;
                }
                case 120: {
                    n14 = 189;
                    break;
                }
                case 121: {
                    n14 = 124;
                    break;
                }
                case 122: {
                    n14 = 247;
                    break;
                }
                case 123: {
                    n14 = 194;
                    break;
                }
                case 124: {
                    n14 = 36;
                    break;
                }
                case 125: {
                    n14 = 150;
                    break;
                }
                case 126: {
                    n14 = 254;
                    break;
                }
                case 127: {
                    n14 = 186;
                    break;
                }
                case 128: {
                    n14 = 231;
                    break;
                }
                case 129: {
                    n14 = 155;
                    break;
                }
                case 130: {
                    n14 = 220;
                    break;
                }
                case 131: {
                    n14 = 122;
                    break;
                }
                case 132: {
                    n14 = 10;
                    break;
                }
                case 133: {
                    n14 = 244;
                    break;
                }
                case 134: {
                    n14 = 50;
                    break;
                }
                case 135: {
                    n14 = 110;
                    break;
                }
                case 136: {
                    n14 = 158;
                    break;
                }
                case 137: {
                    n14 = 181;
                    break;
                }
                case 138: {
                    n14 = 176;
                    break;
                }
                case 139: {
                    n14 = 82;
                    break;
                }
                case 140: {
                    n14 = 163;
                    break;
                }
                case 141: {
                    n14 = 21;
                    break;
                }
                case 142: {
                    n14 = 166;
                    break;
                }
                case 143: {
                    n14 = 120;
                    break;
                }
                case 144: {
                    n14 = 211;
                    break;
                }
                case 145: {
                    n14 = 245;
                    break;
                }
                case 146: {
                    n14 = 229;
                    break;
                }
                case 147: {
                    n14 = 255;
                    break;
                }
                case 148: {
                    n14 = 157;
                    break;
                }
                case 149: {
                    n14 = 29;
                    break;
                }
                case 150: {
                    n14 = 129;
                    break;
                }
                case 151: {
                    n14 = 41;
                    break;
                }
                case 152: {
                    n14 = 192;
                    break;
                }
                case 153: {
                    n14 = 204;
                    break;
                }
                case 154: {
                    n14 = 239;
                    break;
                }
                case 155: {
                    n14 = 125;
                    break;
                }
                case 156: {
                    n14 = 3;
                    break;
                }
                case 157: {
                    n14 = 249;
                    break;
                }
                case 158: {
                    n14 = 134;
                    break;
                }
                case 159: {
                    n14 = 140;
                    break;
                }
                case 160: {
                    n14 = 79;
                    break;
                }
                case 161: {
                    n14 = 43;
                    break;
                }
                case 162: {
                    n14 = 111;
                    break;
                }
                case 163: {
                    n14 = 30;
                    break;
                }
                case 164: {
                    n14 = 24;
                    break;
                }
                case 165: {
                    n14 = 67;
                    break;
                }
                case 166: {
                    n14 = 34;
                    break;
                }
                case 167: {
                    n14 = 213;
                    break;
                }
                case 168: {
                    n14 = 107;
                    break;
                }
                case 169: {
                    n14 = 141;
                    break;
                }
                case 170: {
                    n14 = 123;
                    break;
                }
                case 171: {
                    n14 = 184;
                    break;
                }
                case 172: {
                    n14 = 167;
                    break;
                }
                case 173: {
                    n14 = 159;
                    break;
                }
                case 174: {
                    n14 = 146;
                    break;
                }
                case 175: {
                    n14 = 235;
                    break;
                }
                case 176: {
                    n14 = 23;
                    break;
                }
                case 177: {
                    n14 = 8;
                    break;
                }
                case 178: {
                    n14 = 246;
                    break;
                }
                case 179: {
                    n14 = 37;
                    break;
                }
                case 180: {
                    n14 = 171;
                    break;
                }
                case 181: {
                    n14 = 232;
                    break;
                }
                case 182: {
                    n14 = 130;
                    break;
                }
                case 183: {
                    n14 = 156;
                    break;
                }
                case 184: {
                    n14 = 161;
                    break;
                }
                case 185: {
                    n14 = 169;
                    break;
                }
                case 186: {
                    n14 = 65;
                    break;
                }
                case 187: {
                    n14 = 174;
                    break;
                }
                case 188: {
                    n14 = 54;
                    break;
                }
                case 189: {
                    n14 = 97;
                    break;
                }
                case 190: {
                    n14 = 240;
                    break;
                }
                case 191: {
                    n14 = 230;
                    break;
                }
                case 192: {
                    n14 = 154;
                    break;
                }
                case 193: {
                    n14 = 131;
                    break;
                }
                case 194: {
                    n14 = 80;
                    break;
                }
                case 195: {
                    n14 = 153;
                    break;
                }
                case 196: {
                    n14 = 38;
                    break;
                }
                case 197: {
                    n14 = 210;
                    break;
                }
                case 198: {
                    n14 = 69;
                    break;
                }
                case 199: {
                    n14 = 180;
                    break;
                }
                case 200: {
                    n14 = 96;
                    break;
                }
                case 201: {
                    n14 = 152;
                    break;
                }
                case 202: {
                    n14 = 164;
                    break;
                }
                case 203: {
                    n14 = 58;
                    break;
                }
                case 204: {
                    n14 = 114;
                    break;
                }
                case 205: {
                    n14 = 148;
                    break;
                }
                case 206: {
                    n14 = 201;
                    break;
                }
                case 207: {
                    n14 = 88;
                    break;
                }
                case 208: {
                    n14 = 142;
                    break;
                }
                case 209: {
                    n14 = 77;
                    break;
                }
                case 210: {
                    n14 = 215;
                    break;
                }
                case 211: {
                    n14 = 206;
                    break;
                }
                case 212: {
                    n14 = 91;
                    break;
                }
                case 213: {
                    n14 = 237;
                    break;
                }
                case 214: {
                    n14 = 6;
                    break;
                }
                case 215: {
                    n14 = 252;
                    break;
                }
                case 216: {
                    n14 = 33;
                    break;
                }
                case 217: {
                    n14 = 117;
                    break;
                }
                case 218: {
                    n14 = 76;
                    break;
                }
                case 219: {
                    n14 = 83;
                    break;
                }
                case 220: {
                    n14 = 75;
                    break;
                }
                case 221: {
                    n14 = 42;
                    break;
                }
                case 222: {
                    n14 = 200;
                    break;
                }
                case 223: {
                    n14 = 185;
                    break;
                }
                case 224: {
                    n14 = 183;
                    break;
                }
                case 225: {
                    n14 = 0;
                    break;
                }
                case 226: {
                    n14 = 44;
                    break;
                }
                case 227: {
                    n14 = 145;
                    break;
                }
                case 228: {
                    n14 = 7;
                    break;
                }
                case 229: {
                    n14 = 16;
                    break;
                }
                case 230: {
                    n14 = 195;
                    break;
                }
                case 231: {
                    n14 = 121;
                    break;
                }
                case 232: {
                    n14 = 221;
                    break;
                }
                case 233: {
                    n14 = 128;
                    break;
                }
                case 234: {
                    n14 = 133;
                    break;
                }
                case 235: {
                    n14 = 144;
                    break;
                }
                case 236: {
                    n14 = 40;
                    break;
                }
                case 237: {
                    n14 = 95;
                    break;
                }
                case 238: {
                    n14 = 48;
                    break;
                }
                case 239: {
                    n14 = 113;
                    break;
                }
                case 240: {
                    n14 = 39;
                    break;
                }
                case 241: {
                    n14 = 59;
                    break;
                }
                case 242: {
                    n14 = 56;
                    break;
                }
                case 243: {
                    n14 = 214;
                    break;
                }
                case 244: {
                    n14 = 68;
                    break;
                }
                case 245: {
                    n14 = 70;
                    break;
                }
                case 246: {
                    n14 = 132;
                    break;
                }
                case 247: {
                    n14 = 103;
                    break;
                }
                case 248: {
                    n14 = 202;
                    break;
                }
                case 249: {
                    n14 = 104;
                    break;
                }
                case 250: {
                    n14 = 242;
                    break;
                }
                case 251: {
                    n14 = 1;
                    break;
                }
                case 252: {
                    n14 = 66;
                    break;
                }
                case 253: {
                    n14 = 118;
                    break;
                }
                case 254: {
                    n14 = 241;
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
            tz_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

