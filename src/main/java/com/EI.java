/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C8;
import com.K6;
import com.es_0;
import com.ls_1;
import com.oj_0;
import com.pb_0;
import com.yy_0;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public final class EI
implements SwingConstants {
    private static final Comparator J;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static void F(yy_0 yy_02, List list) {
        block10: {
            int n10;
            int n11;
            int n12;
            String string;
            block8: {
                int n13;
                boolean bl;
                List list2;
                block11: {
                    String string2;
                    block9: {
                        list.clear();
                        list2 = yy_02.J();
                        bl = oj_0.V();
                        Collections.sort(list2, J);
                        string2 = string = yy_02.getText();
                        if (bl) break block9;
                        if (string2 == null) break block10;
                        string2 = string;
                    }
                    n13 = string2.length();
                    if (bl) break block11;
                    if (n13 <= 0) break block10;
                    n13 = 0;
                }
                n12 = n13;
                for (ls_1 ls_12 : list2) {
                    block13: {
                        String string3;
                        block14: {
                            int n14;
                            int n15;
                            block12: {
                                n11 = n12;
                                n10 = string.length();
                                if (bl) break block8;
                                if (!bl) {
                                    if (n11 >= n10 && !bl) break;
                                    n15 = ls_12.H();
                                    n14 = n12;
                                }
                                if (!bl) {
                                    if (n15 > n14) {
                                        string3 = string.substring(n12, Math.min(ls_12.H(), string.length()));
                                        ls_1 ls_13 = new ls_1(n12, ls_12.H() - n12, new K6[0]);
                                        EI.G(string3, ls_13, list);
                                        n12 = ls_12.H();
                                    }
                                    n15 = ls_12.H();
                                    n14 = n12;
                                }
                                if (bl) break block12;
                                if (n15 != n14) break block13;
                                n15 = ls_12.F();
                                n14 = -1;
                            }
                            if (n15 != n14) break block14;
                            string3 = string.substring(n12);
                            EI.G(string3, ls_12, list);
                            n12 = string.length();
                            if (!bl) break block13;
                        }
                        string3 = string.substring(n12, Math.min(n12 + ls_12.F(), string.length()));
                        EI.G(string3, ls_12, list);
                        n12 += ls_12.F();
                    }
                    if (!bl) continue;
                }
                n11 = n12;
                n10 = string.length();
            }
            if (n11 < n10) {
                ls_1 ls_12;
                String string4 = string.substring(n12, string.length());
                ls_12 = new ls_1(n12, string.length() - n12, new K6[0]);
                EI.G(string4, ls_12, list);
            }
        }
    }

    private static void G(String string, ls_1 ls_12, List list) {
        int n10;
        boolean bl;
        block20: {
            ls_12 = new ls_1(ls_12);
            int n11 = string.indexOf(EI.a(9869, 408594966773347042L));
            int n12 = string.indexOf(EI.a(15537, 1662597904632588508L));
            bl = oj_0.V();
            do {
                int n13;
                block25: {
                    int n14;
                    ls_1 ls_13;
                    int n15;
                    block26: {
                        block22: {
                            int n16;
                            block23: {
                                block24: {
                                    block21: {
                                        int n17;
                                        if (n11 < 0) {
                                            n17 = n12;
                                            if (!bl) {
                                                if (!bl) {
                                                    if (n17 < 0) break;
                                                }
                                                break block20;
                                            }
                                        } else {
                                            n17 = n11;
                                        }
                                        if (!bl) {
                                            n17 = n17 >= 0 ? n11 : -1;
                                        }
                                        n15 = n17;
                                        n16 = n12;
                                        if (bl) break block21;
                                        if (n16 < 0) break block22;
                                        n16 = n12;
                                    }
                                    if (bl) break block23;
                                    if (n16 < n11) break block24;
                                    n16 = n15;
                                    if (bl) break block23;
                                    if (n16 >= 0) break block22;
                                }
                                n16 = n12;
                            }
                            n15 = n16;
                        }
                        String string2 = string.substring(0, n15);
                        ls_13 = new ls_1(ls_12);
                        ls_13.H(ls_12.H());
                        ls_13.w(n15);
                        list.add(new C8(string2, ls_13));
                        n14 = 1;
                        n13 = string.charAt(n15);
                        if (bl) break block25;
                        if (n13 != EI.a(9869, 408594966773347042L)) break block26;
                        n13 = n15 + 1;
                        if (bl) break block25;
                        if (n13 >= string.length()) break block26;
                        n13 = string.charAt(n15 + 1);
                        if (bl) break block25;
                        if (n13 == EI.a(15537, 1662597904632588508L)) {
                            ++n14;
                        }
                    }
                    ls_13 = new ls_1(ls_12);
                    ls_13.H(ls_12.H() + n15);
                    ls_13.w(n14);
                    list.add(new C8(string.substring(n15, n15 + n14), ls_13));
                    string = string.substring(n15 + n14);
                    ls_12.H(ls_12.H() + n15 + n14);
                    ls_12.w(ls_12.F() - n15 - n14);
                    n11 = string.indexOf(EI.a(9869, 408594966773347042L));
                    n13 = string.indexOf(EI.a(15537, 1662597904632588508L));
                }
                n12 = n13;
            } while (!bl);
            n10 = string.length();
        }
        if (!bl && n10 > 0) {
            n10 = list.add(new C8(string, ls_12)) ? 1 : 0;
        }
    }

    public static Font s(yy_0 yy_02) {
        Font font = yy_02.getFont();
        boolean bl = oj_0.V();
        Font font2 = font;
        if (!bl) {
            if (font2 == null) {
                font = UIManager.getFont(EI.a(14546, 26064));
            }
            font2 = font;
        }
        return font2;
    }

    /*
     * Unable to fully structure code
     */
    public static int j(String var0, int var1_1) {
        block7: {
            var2_2 = oj_0.g();
            v0 = var1_1;
            if (var2_2) {
                v0 = v0 < 0 ? 1 : 0;
            }
            var3_3 = v0;
            for (var4_4 = var1_1 + 1; var4_4 < var0.length(); ++var4_4) {
                block8: {
                    block9: {
                        var5_5 = var0.charAt(var4_4);
                        v1 = var5_5;
                        if (!var2_2) break block7;
                        if (!var2_2) break block8;
                        if (v1 == EI.a(19255, 3641229676422029147L)) break block9;
                        v2 = var5_5;
                        if (!var2_2) break block8;
                        if (v2 == EI.a(11801, 456213457870862963L)) break block9;
                        v2 = var5_5;
                        if (var2_2) {
                            if (v2 != EI.a(26363, 6113360339356316306L)) {
                                v2 = var5_5;
                                if (var2_2) {
                                    if (v2 != EI.a(6728, 6661894428686028320L)) {
                                        v3 = var3_3;
                                        if (var2_2) {
                                            if (v3 != 0) continue;
                                            v3 = var4_4;
                                        }
                                        return v3;
                                    } else {
                                        ** GOTO lbl29
                                    }
                                } else {
                                    ** GOTO lbl28
                                }
                            } else {
                                ** GOTO lbl27
                            }
                        }
                        break block8;
lbl27:
                        // 2 sources

                        break block9;
lbl28:
                        // 2 sources

                        break block8;
                    }
                    v2 = '\u0000';
                }
                var3_3 = v2;
                if (var2_2) continue;
            }
            v1 = var0.length();
        }
        return v1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int h(String string) {
        int n10 = 0;
        int n11 = string.length() - 1;
        boolean bl = oj_0.V();
        do {
            block9: {
                int n12;
                int n13;
                block12: {
                    int n14;
                    block11: {
                        block10: {
                            block5: {
                                block6: {
                                    int n15;
                                    block7: {
                                        block8: {
                                            if (n11 < 0) return -1;
                                            n14 = string.charAt(n11);
                                            int n16 = n10;
                                            if (bl) return n16;
                                            if (bl) break block5;
                                            if (n16 != 0) break block6;
                                            n15 = n14;
                                            if (bl) break block7;
                                            if (n15 == EI.a(31619, 7846944831991345128L)) break block8;
                                            n15 = n14;
                                            if (bl) break block7;
                                            if (n15 == EI.a(2954, 6102690886178185188L)) break block8;
                                            n15 = n14;
                                            if (bl) break block7;
                                            if (n15 == EI.a(9869, 408594966773347042L)) break block8;
                                            n15 = n14;
                                            if (bl) break block7;
                                            if (n15 != EI.a(15537, 1662597904632588508L)) break block9;
                                        }
                                        n15 = 1;
                                    }
                                    n10 = n15;
                                    if (!bl) break block9;
                                }
                                n13 = n14;
                            }
                            n12 = EI.a(31619, 7846944831991345128L);
                            if (bl) break block10;
                            if (n13 == n12) break block9;
                            n13 = n14;
                            n12 = EI.a(2954, 6102690886178185188L);
                        }
                        if (bl) break block11;
                        if (n13 == n12) break block9;
                        n13 = n14;
                        n12 = EI.a(9869, 408594966773347042L);
                    }
                    if (bl) break block12;
                    if (n13 == n12) break block9;
                    n13 = n14;
                    if (bl) return n13;
                    n12 = EI.a(15537, 1662597904632588508L);
                }
                if (n13 != n12) {
                    n13 = n11;
                    return n13;
                }
            }
            --n11;
        } while (!bl);
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    public static String r(yy_0 var0, String var1_1, Icon var2_2, int var3_3, int var4_4, int var5_5, int var6_6, Rectangle var7_7, Rectangle var8_8, Rectangle var9_9, int var10_10) {
        block19: {
            block18: {
                block17: {
                    var12_11 = 1;
                    var11_12 = oj_0.g();
                    var13_13 = var4_4;
                    var14_14 = var6_6;
                    v0 = var0;
                    if (!var11_12) break block17;
                    if (v0 == null) break block18;
                    v0 = var0;
                }
                v1 = (int)v0.getComponentOrientation().isLeftToRight();
                if (!var11_12) break block19;
                if (v1 == 0) {
                    var12_11 = 0;
                }
            }
            v1 = var4_4;
        }
        if (var11_12) {
            switch (v1) {
                case 10: {
                    v2 = var12_11;
                    if (var11_12) {
                        v2 = var13_13 = v2 != 0 ? 2 : 4;
                    }
                    if (var11_12) break;
                }
                case 11: {
                    v3 = var12_11;
                    if (var11_12) {
                        v3 = v3 != 0 ? 4 : 2;
                    }
                    var13_13 = v3;
                }
            }
            v1 = var6_6;
        }
        if (!var11_12) ** GOTO lbl34
        switch (v1) {
            case 10: {
                v1 = var12_11;
lbl34:
                // 2 sources

                if (var11_12) {
                    v1 = var14_14 = v1 != 0 ? 2 : 4;
                }
                if (var11_12) break;
            }
            case 11: {
                v4 = var12_11;
                if (var11_12) {
                    v4 = v4 != 0 ? 4 : 2;
                }
                var14_14 = v4;
            }
        }
        return EI.D(var0, var1_1, var2_2, var3_3, var13_13, var5_5, var14_14, var7_7, var8_8, var9_9, var10_10);
    }

    public static String l(String string, Icon icon, int n10, int n11, int n12, int n13, Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, int n14) {
        return EI.D(null, string, icon, n10, n11, n12, n13, rectangle, rectangle2, rectangle3, n14);
    }

    /*
     * Exception decompiling
     */
    private static String D(yy_0 var0, String var1_1, Icon var2_2, int var3_3, int var4_4, int var5_5, int var6_6, Rectangle var7_7, Rectangle var8_8, Rectangle var9_9, int var10_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static String C(String string, List list) {
        boolean bl;
        String string2;
        block4: {
            int n10;
            string2 = "";
            bl = oj_0.g();
            String string3 = string;
            int n11 = n10 = EI.V(string3, "{", 0);
            int n12 = -1;
            boolean bl2 = true;
            do {
                block7: {
                    int n13;
                    block10: {
                        block9: {
                            C8 c8;
                            C8 c82;
                            block8: {
                                block6: {
                                    block5: {
                                        if (!bl2 || (bl2 = false)) break block5;
                                        if (!bl) break block6;
                                        if (n11 == n12) return string;
                                    }
                                    n11 = n10;
                                    n12 = -1;
                                }
                                if (n11 == n12) break;
                                n13 = EI.V(string3, "}", n10 + 1);
                                if (!bl) break block4;
                                if (n13 == -1) break block7;
                                c8 = c82 = EI.s(string3.substring(n10 + 1, n13));
                                if (!bl) break block8;
                                if (c8 == null) break block9;
                                string2 = string2 + string3.substring(0, n10);
                                c8 = c82;
                            }
                            c8.h().H(string2.length());
                            list.add(c82.h());
                            string2 = string2 + c82.K();
                            if (bl) break block10;
                        }
                        string2 = string2 + string3;
                    }
                    string3 = string3.substring(n13 + 1);
                    n10 = EI.V(string3, "{", 0);
                    if (bl) continue;
                }
                string2 = string2 + string3;
            } while (bl);
            string2 = string2 + string3;
        }
        if (bl) return string2;
        return string;
    }

    private static int V(String string, String string2, int n10) {
        return string.indexOf(string2, n10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static C8 s(String var0) {
        block169: {
            var2_1 = var0.indexOf(":");
            var1_2 = oj_0.V();
            if (var2_1 == -1) break block169;
            try {
                block163: {
                    block168: {
                        block166: {
                            block167: {
                                block164: {
                                    block165: {
                                        block161: {
                                            block162: {
                                                block209: {
                                                    block208: {
                                                        block137: {
                                                            var3_3 = var0.substring(0, var2_1);
                                                            var4_5 = 0;
                                                            var5_6 = 0;
                                                            var6_7 = 0;
                                                            var7_8 /* !! */  = null;
                                                            var8_9 /* !! */  = null;
                                                            var9_10 = new ArrayList<K6>();
                                                            var10_11 = var0.substring(var2_1 + 1);
                                                            var11_12 = new StringTokenizer(var10_11, ";", false);
                                                            while (var11_12.hasMoreTokens()) {
                                                                block140: {
                                                                    block160: {
                                                                        block206: {
                                                                            block157: {
                                                                                block159: {
                                                                                    block158: {
                                                                                        block155: {
                                                                                            block156: {
                                                                                                block203: {
                                                                                                    block202: {
                                                                                                        block201: {
                                                                                                            block200: {
                                                                                                                block154: {
                                                                                                                    block153: {
                                                                                                                        block197: {
                                                                                                                            block196: {
                                                                                                                                block152: {
                                                                                                                                    block151: {
                                                                                                                                        block194: {
                                                                                                                                            block193: {
                                                                                                                                                block150: {
                                                                                                                                                    block149: {
                                                                                                                                                        block191: {
                                                                                                                                                            block190: {
                                                                                                                                                                block189: {
                                                                                                                                                                    block188: {
                                                                                                                                                                        block148: {
                                                                                                                                                                            block147: {
                                                                                                                                                                                block186: {
                                                                                                                                                                                    block185: {
                                                                                                                                                                                        block184: {
                                                                                                                                                                                            block183: {
                                                                                                                                                                                                block146: {
                                                                                                                                                                                                    block145: {
                                                                                                                                                                                                        block181: {
                                                                                                                                                                                                            block180: {
                                                                                                                                                                                                                block144: {
                                                                                                                                                                                                                    block143: {
                                                                                                                                                                                                                        block177: {
                                                                                                                                                                                                                            block178: {
                                                                                                                                                                                                                                block142: {
                                                                                                                                                                                                                                    block141: {
                                                                                                                                                                                                                                        block174: {
                                                                                                                                                                                                                                            block175: {
                                                                                                                                                                                                                                                block139: {
                                                                                                                                                                                                                                                    block138: {
                                                                                                                                                                                                                                                        block171: {
                                                                                                                                                                                                                                                            block172: {
                                                                                                                                                                                                                                                                block170: {
                                                                                                                                                                                                                                                                    var12_13 = var11_12.nextToken();
                                                                                                                                                                                                                                                                    v0 = var12_13.equals("p");
                                                                                                                                                                                                                                                                    if (var1_2) break block137;
                                                                                                                                                                                                                                                                    if (var1_2) break block138;
                                                                                                                                                                                                                                                                    break block170;
                                                                                                                                                                                                                                                                    catch (Throwable v1) {
                                                                                                                                                                                                                                                                        throw EI.a(v1);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (v0 != 0) break block171;
                                                                                                                                                                                                                                                                break block172;
                                                                                                                                                                                                                                                                catch (Throwable v2) {
                                                                                                                                                                                                                                                                    throw EI.a(v2);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                block173: {
                                                                                                                                                                                                                                                                    v3 = var12_13.equals(EI.a(14549, 7759));
                                                                                                                                                                                                                                                                    if (var1_2) break block139;
                                                                                                                                                                                                                                                                    break block173;
                                                                                                                                                                                                                                                                    catch (Throwable v4) {
                                                                                                                                                                                                                                                                        throw EI.a(v4);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (v3) {
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                ** GOTO lbl49
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            catch (Throwable v5) {
                                                                                                                                                                                                                                                                throw EI.a(v5);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        v6 = true;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    var4_5 = v6;
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        if (!var1_2) break block140;
lbl49:
                                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                                        v3 = var12_13.equals("b");
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (Throwable v7) {
                                                                                                                                                                                                                                                        throw EI.a(v7);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (var1_2) break block141;
                                                                                                                                                                                                                                                if (v3) break block174;
                                                                                                                                                                                                                                                break block175;
                                                                                                                                                                                                                                                catch (Throwable v8) {
                                                                                                                                                                                                                                                    throw EI.a(v8);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                block176: {
                                                                                                                                                                                                                                                    v9 = var12_13.equals(EI.a(14544, -10645));
                                                                                                                                                                                                                                                    if (var1_2) break block142;
                                                                                                                                                                                                                                                    break block176;
                                                                                                                                                                                                                                                    catch (Throwable v10) {
                                                                                                                                                                                                                                                        throw EI.a(v10);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (v9) {
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                ** GOTO lbl80
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (Throwable v11) {
                                                                                                                                                                                                                                                throw EI.a(v11);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        v3 = true;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var5_6 = (int)v3;
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        if (!var1_2) break block140;
lbl80:
                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                        v9 = var12_13.equals("i");
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (Throwable v12) {
                                                                                                                                                                                                                                        throw EI.a(v12);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (var1_2) break block143;
                                                                                                                                                                                                                                if (v9) break block177;
                                                                                                                                                                                                                                break block178;
                                                                                                                                                                                                                                catch (Throwable v13) {
                                                                                                                                                                                                                                    throw EI.a(v13);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                block179: {
                                                                                                                                                                                                                                    v14 = var12_13.equals(EI.a(14555, 22952));
                                                                                                                                                                                                                                    if (var1_2) break block144;
                                                                                                                                                                                                                                    break block179;
                                                                                                                                                                                                                                    catch (Throwable v15) {
                                                                                                                                                                                                                                        throw EI.a(v15);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (v14) {
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                ** GOTO lbl111
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (Throwable v16) {
                                                                                                                                                                                                                                throw EI.a(v16);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v9 = true;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    var6_7 = (int)v9;
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        if (!var1_2) break block140;
lbl111:
                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                        v14 = var12_13.equals("u");
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (Throwable v17) {
                                                                                                                                                                                                                        throw EI.a(v17);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (var1_2) break block145;
                                                                                                                                                                                                                if (v14) ** GOTO lbl136
                                                                                                                                                                                                                break block180;
                                                                                                                                                                                                                catch (Throwable v18) {
                                                                                                                                                                                                                    throw EI.a(v18);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v19 = var12_13.equals(EI.a(14553, -29417));
                                                                                                                                                                                                            if (var1_2) break block146;
                                                                                                                                                                                                            break block181;
                                                                                                                                                                                                            catch (Throwable v20) {
                                                                                                                                                                                                                throw EI.a(v20);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            block182: {
                                                                                                                                                                                                                if (!v19) ** GOTO lbl144
                                                                                                                                                                                                                break block182;
                                                                                                                                                                                                                catch (Throwable v21) {
                                                                                                                                                                                                                    throw EI.a(v21);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v14 = var9_10.add(K6.underlined);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (Throwable v22) {
                                                                                                                                                                                                            throw EI.a(v22);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        if (!var1_2) break block140;
lbl144:
                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                        v19 = var12_13.equals(EI.a(14557, 25656));
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (Throwable v23) {
                                                                                                                                                                                                        throw EI.a(v23);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var1_2) break block147;
                                                                                                                                                                                                if (v19) ** GOTO lbl182
                                                                                                                                                                                                break block183;
                                                                                                                                                                                                catch (Throwable v24) {
                                                                                                                                                                                                    throw EI.a(v24);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            v19 = var12_13.equals(EI.a(14559, 5834));
                                                                                                                                                                                            if (var1_2) break block147;
                                                                                                                                                                                            break block184;
                                                                                                                                                                                            catch (Throwable v25) {
                                                                                                                                                                                                throw EI.a(v25);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        if (v19) ** GOTO lbl182
                                                                                                                                                                                        break block185;
                                                                                                                                                                                        catch (Throwable v26) {
                                                                                                                                                                                            throw EI.a(v26);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v27 = var12_13.equals(EI.a(14545, 11434));
                                                                                                                                                                                    if (var1_2) break block148;
                                                                                                                                                                                    break block186;
                                                                                                                                                                                    catch (Throwable v28) {
                                                                                                                                                                                        throw EI.a(v28);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                try {
                                                                                                                                                                                    block187: {
                                                                                                                                                                                        if (!v27) ** GOTO lbl190
                                                                                                                                                                                        break block187;
                                                                                                                                                                                        catch (Throwable v29) {
                                                                                                                                                                                            throw EI.a(v29);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v19 = var9_10.add(K6.superscript);
                                                                                                                                                                                }
                                                                                                                                                                                catch (Throwable v30) {
                                                                                                                                                                                    throw EI.a(v30);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                if (!var1_2) break block140;
lbl190:
                                                                                                                                                                                // 2 sources

                                                                                                                                                                                v27 = var12_13.equals(EI.a(14550, 14937));
                                                                                                                                                                            }
                                                                                                                                                                            catch (Throwable v31) {
                                                                                                                                                                                throw EI.a(v31);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (var1_2) break block149;
                                                                                                                                                                        if (v27) ** GOTO lbl228
                                                                                                                                                                        break block188;
                                                                                                                                                                        catch (Throwable v32) {
                                                                                                                                                                            throw EI.a(v32);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v27 = var12_13.equals(EI.a(14554, -17376));
                                                                                                                                                                    if (var1_2) break block149;
                                                                                                                                                                    break block189;
                                                                                                                                                                    catch (Throwable v33) {
                                                                                                                                                                        throw EI.a(v33);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if (v27) ** GOTO lbl228
                                                                                                                                                                break block190;
                                                                                                                                                                catch (Throwable v34) {
                                                                                                                                                                    throw EI.a(v34);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v35 = var12_13.equals(EI.a(14547, 4099));
                                                                                                                                                            if (var1_2) break block150;
                                                                                                                                                            break block191;
                                                                                                                                                            catch (Throwable v36) {
                                                                                                                                                                throw EI.a(v36);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            block192: {
                                                                                                                                                                if (!v35) ** GOTO lbl236
                                                                                                                                                                break block192;
                                                                                                                                                                catch (Throwable v37) {
                                                                                                                                                                    throw EI.a(v37);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v27 = var9_10.add(K6.subscript);
                                                                                                                                                        }
                                                                                                                                                        catch (Throwable v38) {
                                                                                                                                                            throw EI.a(v38);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        if (!var1_2) break block140;
lbl236:
                                                                                                                                                        // 2 sources

                                                                                                                                                        v35 = var12_13.equals("s");
                                                                                                                                                    }
                                                                                                                                                    catch (Throwable v39) {
                                                                                                                                                        throw EI.a(v39);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (var1_2) break block151;
                                                                                                                                                if (v35) ** GOTO lbl261
                                                                                                                                                break block193;
                                                                                                                                                catch (Throwable v40) {
                                                                                                                                                    throw EI.a(v40);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v41 = var12_13.equals(EI.a(14537, -8368));
                                                                                                                                            if (var1_2) break block152;
                                                                                                                                            break block194;
                                                                                                                                            catch (Throwable v42) {
                                                                                                                                                throw EI.a(v42);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            block195: {
                                                                                                                                                if (!v41) ** GOTO lbl269
                                                                                                                                                break block195;
                                                                                                                                                catch (Throwable v43) {
                                                                                                                                                    throw EI.a(v43);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v35 = var9_10.add(K6.strikeThrough);
                                                                                                                                        }
                                                                                                                                        catch (Throwable v44) {
                                                                                                                                            throw EI.a(v44);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        if (!var1_2) break block140;
lbl269:
                                                                                                                                        // 2 sources

                                                                                                                                        v41 = var12_13.equals(EI.a(14548, -25687));
                                                                                                                                    }
                                                                                                                                    catch (Throwable v45) {
                                                                                                                                        throw EI.a(v45);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var1_2) break block153;
                                                                                                                                if (v41) ** GOTO lbl294
                                                                                                                                break block196;
                                                                                                                                catch (Throwable v46) {
                                                                                                                                    throw EI.a(v46);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v47 = var12_13.equals(EI.a(14536, 29708));
                                                                                                                            if (var1_2) break block154;
                                                                                                                            break block197;
                                                                                                                            catch (Throwable v48) {
                                                                                                                                throw EI.a(v48);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            block198: {
                                                                                                                                if (!v47) ** GOTO lbl302
                                                                                                                                break block198;
                                                                                                                                catch (Throwable v49) {
                                                                                                                                    throw EI.a(v49);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v41 = var9_10.add(K6.doubleStrikeThrough);
                                                                                                                        }
                                                                                                                        catch (Throwable v50) {
                                                                                                                            throw EI.a(v50);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (!var1_2) break block140;
lbl302:
                                                                                                                    // 2 sources

                                                                                                                    try {
                                                                                                                        block199: {
                                                                                                                            v51 = var12_13;
                                                                                                                            if (var1_2) break block155;
                                                                                                                            break block199;
                                                                                                                            catch (Throwable v52) {
                                                                                                                                throw EI.a(v52);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v47 = v51.startsWith("c");
                                                                                                                    }
                                                                                                                    catch (Throwable v53) {
                                                                                                                        throw EI.a(v53);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (v47) break block156;
                                                                                                                v51 = var12_13;
                                                                                                                if (var1_2) break block155;
                                                                                                                break block200;
                                                                                                                catch (Throwable v54) {
                                                                                                                    throw EI.a(v54);
                                                                                                                }
                                                                                                            }
                                                                                                            if (v51.startsWith(EI.a(14551, 26161))) break block156;
                                                                                                            break block201;
                                                                                                            catch (Throwable v55) {
                                                                                                                throw EI.a(v55);
                                                                                                            }
                                                                                                        }
                                                                                                        v51 = var12_13;
                                                                                                        if (var1_2) break block155;
                                                                                                        break block202;
                                                                                                        catch (Throwable v56) {
                                                                                                            throw EI.a(v56);
                                                                                                        }
                                                                                                    }
                                                                                                    if (v51.startsWith("f")) break block156;
                                                                                                    break block203;
                                                                                                    catch (Throwable v57) {
                                                                                                        throw EI.a(v57);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    block204: {
                                                                                                        v58 = var12_13.startsWith(EI.a(14558, 3950));
                                                                                                        if (var1_2) break block157;
                                                                                                        break block204;
                                                                                                        catch (Throwable v59) {
                                                                                                            throw EI.a(v59);
                                                                                                        }
                                                                                                    }
                                                                                                    if (v58) {
                                                                                                    }
                                                                                                    ** GOTO lbl371
                                                                                                }
                                                                                                catch (Throwable v60) {
                                                                                                    throw EI.a(v60);
                                                                                                }
                                                                                            }
                                                                                            v51 = var12_13;
                                                                                        }
                                                                                        var13_15 /* !! */  = EI.p(v51);
                                                                                        try {
                                                                                            v61 /* !! */  = var13_15 /* !! */ ;
                                                                                            if (var1_2) break block158;
                                                                                            if (v61 /* !! */  == null) break block159;
                                                                                        }
                                                                                        catch (Throwable v62) {
                                                                                            throw EI.a(v62);
                                                                                        }
                                                                                        v61 /* !! */  = var13_15 /* !! */ ;
                                                                                    }
                                                                                    var7_8 /* !! */  = v61 /* !! */ ;
                                                                                }
                                                                                if (!var1_2) break block140;
lbl371:
                                                                                // 2 sources

                                                                                try {
                                                                                    block205: {
                                                                                        v63 = var12_13;
                                                                                        if (var1_2) break block160;
                                                                                        break block205;
                                                                                        catch (Throwable v64) {
                                                                                            throw EI.a(v64);
                                                                                        }
                                                                                    }
                                                                                    v58 = v63.startsWith("b");
                                                                                }
                                                                                catch (Throwable v65) {
                                                                                    throw EI.a(v65);
                                                                                }
                                                                            }
                                                                            if (v58) ** GOTO lbl397
                                                                            v63 = var12_13;
                                                                            if (var1_2) break block160;
                                                                            break block206;
                                                                            catch (Throwable v66) {
                                                                                throw EI.a(v66);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block207: {
                                                                                if (!v63.startsWith(EI.a(14552, -31536))) break block140;
                                                                                break block207;
                                                                                catch (Throwable v67) {
                                                                                    throw EI.a(v67);
                                                                                }
                                                                            }
                                                                            v63 = var12_13;
                                                                        }
                                                                        catch (Throwable v68) {
                                                                            throw EI.a(v68);
                                                                        }
                                                                    }
                                                                    var13_15 /* !! */  = EI.p(v63);
                                                                    try {
                                                                        v69 /* !! */  = var13_15 /* !! */ ;
                                                                        if (var1_2 || v69 /* !! */  == null) break block140;
                                                                    }
                                                                    catch (Throwable v70) {
                                                                        throw EI.a(v70);
                                                                    }
                                                                    v69 /* !! */  = var8_9 /* !! */  = var13_15 /* !! */ ;
                                                                }
                                                                if (!var1_2) continue;
                                                            }
                                                            v0 = var5_6;
                                                        }
                                                        if (var1_2) break block161;
                                                        if (v0 == 0) break block162;
                                                        break block208;
                                                        catch (Throwable v71) {
                                                            throw EI.a(v71);
                                                        }
                                                    }
                                                    v0 = var6_7;
                                                    if (var1_2) break block161;
                                                    break block209;
                                                    catch (Throwable v72) {
                                                        throw EI.a(v72);
                                                    }
                                                }
                                                try {
                                                    block210: {
                                                        if (v0 == 0) break block162;
                                                        break block210;
                                                        catch (Throwable v73) {
                                                            throw EI.a(v73);
                                                        }
                                                    }
                                                    v0 = 3;
                                                    break block163;
                                                }
                                                catch (Throwable v74) {
                                                    throw EI.a(v74);
                                                }
                                            }
                                            v0 = var5_6;
                                        }
                                        if (var1_2) break block164;
                                        try {
                                            block211: {
                                                if (v0 == 0) break block165;
                                                break block211;
                                                catch (Throwable v75) {
                                                    throw EI.a(v75);
                                                }
                                            }
                                            v0 = 1;
                                            break block163;
                                        }
                                        catch (Throwable v76) {
                                            throw EI.a(v76);
                                        }
                                    }
                                    v0 = var6_7;
                                }
                                if (var1_2) break block166;
                                try {
                                    block212: {
                                        if (v0 == 0) break block167;
                                        break block212;
                                        catch (Throwable v77) {
                                            throw EI.a(v77);
                                        }
                                    }
                                    v0 = 2;
                                    break block163;
                                }
                                catch (Throwable v78) {
                                    throw EI.a(v78);
                                }
                            }
                            v0 = var4_5;
                        }
                        try {
                            if (var1_2) break block163;
                            if (v0 == 0) break block168;
                        }
                        catch (Throwable v79) {
                            throw EI.a(v79);
                        }
                        v0 = 0;
                        break block163;
                    }
                    v0 = -1;
                }
                var12_14 = v0;
                var13_15 /* !! */  = var9_10.toArray(new K6[var9_10.size()]);
                return new C8(var3_3, new ls_1(0, var3_3.length(), var12_14, (Color)var7_8 /* !! */ , (Color)var8_9 /* !! */ , var13_15 /* !! */ ));
            }
            catch (Throwable var3_4) {
                return null;
            }
        }
        return null;
    }

    /*
     * Loose catch block
     */
    private static Color p(String string) {
        block8: {
            int n10;
            int n11;
            int n12;
            int n13;
            block7: {
                n13 = string.indexOf("(");
                n12 = string.lastIndexOf(")");
                boolean bl = oj_0.g();
                n11 = n13;
                n10 = -1;
                if (!bl) break block7;
                try {
                    block9: {
                        if (n11 == n10) break block8;
                        break block9;
                        catch (Throwable throwable) {
                            throw EI.a(throwable);
                        }
                    }
                    n11 = n12;
                    n10 = -1;
                }
                catch (Throwable throwable) {
                    throw EI.a(throwable);
                }
            }
            if (n11 != n10) {
                try {
                    String string2 = string.substring(n13 + 1, n12);
                    return pb_0.f(string2);
                }
                catch (Throwable throwable) {
                    return null;
                }
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[18];
                        var11_1 = 0;
                        var10_2 = "/\u009b\u008bH\u00d4\u00f5L`\u009a\u001a\nI\u00a7\u00b5/\u00e1\u00c8[\u0001\u00b5N\u0006:\u00b5\u00b3\u00ddm`\u0003\u009a\u00d9\u00fd\u0002\u00b2D\u0004\u00ee\u00a5\u0004\u00df\u0003!\u00d2\u0098\n@\u0089\u0001+D\u0087\u00ef\u00e8#s\u000b\u001e\u00bf\u007f\u00b4\u00dcuG\u0090\u00bc\u008fZ\u0004\u00a6eG\u00b7\t\u00da\u008e\u00f5\u0084\u00cc\u00a6|\u00c9\u008d\nL\u00fd\u00ffj\u0082\u00f3T\u00ab|R\u0005\u00e9\u0005\u00f3\u00d5b\u0002Z^\u0005\u00e2\u0094\u00ee\u0082q\u0002\u00a7\u00f6";
                        var12_3 = "/\u009b\u008bH\u00d4\u00f5L`\u009a\u001a\nI\u00a7\u00b5/\u00e1\u00c8[\u0001\u00b5N\u0006:\u00b5\u00b3\u00ddm`\u0003\u009a\u00d9\u00fd\u0002\u00b2D\u0004\u00ee\u00a5\u0004\u00df\u0003!\u00d2\u0098\n@\u0089\u0001+D\u0087\u00ef\u00e8#s\u000b\u001e\u00bf\u007f\u00b4\u00dcuG\u0090\u00bc\u008fZ\u0004\u00a6eG\u00b7\t\u00da\u008e\u00f5\u0084\u00cc\u00a6|\u00c9\u008d\nL\u00fd\u00ffj\u0082\u00f3T\u00ab|R\u0005\u00e9\u0005\u00f3\u00d5b\u0002Z^\u0005\u00e2\u0094\u00ee\u0082q\u0002\u00a7\u00f6".length();
                        var9_4 = 10;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 124;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
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
                            var10_2 = "Z\u008b\u0096|\u00d9\u0094\f\u001c\u008e\u00ac\u00af~\u0084\u00bd\u001f\u0089\u00c2\u00f8%";
                            var12_3 = "Z\u008b\u0096|\u00d9\u0094\f\u001c\u008e\u00ac\u00af~\u0084\u00bd\u001f\u0089\u00c2\u00f8%".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 127;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
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
                            break block27;
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
                                    v15 = 106;
                                    break;
                                }
                                case 1: {
                                    v15 = 75;
                                    break;
                                }
                                case 2: {
                                    v15 = 111;
                                    break;
                                }
                                case 3: {
                                    v15 = 103;
                                    break;
                                }
                                case 4: {
                                    v15 = 33;
                                    break;
                                }
                                case 5: {
                                    v15 = 70;
                                    break;
                                }
                                default: {
                                    v15 = 84;
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
                EI.a = var13;
                EI.b = new String[18];
                var0_7 = 6529028561496559547L;
                var6_8 = new long[8];
                var3_9 = 0;
                var4_10 = "\u00f2\u00fb\u00a8\u00e6\u009a\u008f\u00a0s\u00e9\u00f2\u00f2\u007fbD\u00f5\u00c1 Ao\u00f8\u00db*\u00bd$u\u00bdOO\u00a0\u009d\u00c1\u0091bF$\u00f9s\u00e8}T\u00c6\b\u0092\u00abd\u00cb\u00d0V";
                var5_11 = "\u00f2\u00fb\u00a8\u00e6\u009a\u008f\u00a0s\u00e9\u00f2\u00f2\u007fbD\u00f5\u00c1 Ao\u00f8\u00db*\u00bd$u\u00bdOO\u00a0\u009d\u00c1\u0091bF$\u00f9s\u00e8}T\u00c6\b\u0092\u00abd\u00cb\u00d0V".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\b\u0003;\u000f-\u008e\u00e7m!Z\u00857(\u00df\u0010\u00c0";
                    var5_11 = "\b\u0003;\u000f-\u008e\u00e7m!Z\u00857(\u00df\u0010\u00c0".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
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
        EI.c = var6_8;
        EI.d = new Integer[8];
        EI.J = new es_0();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x38D9) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 13;
                    break;
                }
                case 1: {
                    n14 = 114;
                    break;
                }
                case 2: {
                    n14 = 127;
                    break;
                }
                case 3: {
                    n14 = 243;
                    break;
                }
                case 4: {
                    n14 = 175;
                    break;
                }
                case 5: {
                    n14 = 6;
                    break;
                }
                case 6: {
                    n14 = 26;
                    break;
                }
                case 7: {
                    n14 = 85;
                    break;
                }
                case 8: {
                    n14 = 47;
                    break;
                }
                case 9: {
                    n14 = 159;
                    break;
                }
                case 10: {
                    n14 = 252;
                    break;
                }
                case 11: {
                    n14 = 156;
                    break;
                }
                case 12: {
                    n14 = 160;
                    break;
                }
                case 13: {
                    n14 = 56;
                    break;
                }
                case 14: {
                    n14 = 35;
                    break;
                }
                case 15: {
                    n14 = 2;
                    break;
                }
                case 16: {
                    n14 = 138;
                    break;
                }
                case 17: {
                    n14 = 74;
                    break;
                }
                case 18: {
                    n14 = 109;
                    break;
                }
                case 19: {
                    n14 = 117;
                    break;
                }
                case 20: {
                    n14 = 199;
                    break;
                }
                case 21: {
                    n14 = 241;
                    break;
                }
                case 22: {
                    n14 = 66;
                    break;
                }
                case 23: {
                    n14 = 189;
                    break;
                }
                case 24: {
                    n14 = 249;
                    break;
                }
                case 25: {
                    n14 = 1;
                    break;
                }
                case 26: {
                    n14 = 184;
                    break;
                }
                case 27: {
                    n14 = 214;
                    break;
                }
                case 28: {
                    n14 = 172;
                    break;
                }
                case 29: {
                    n14 = 206;
                    break;
                }
                case 30: {
                    n14 = 133;
                    break;
                }
                case 31: {
                    n14 = 72;
                    break;
                }
                case 32: {
                    n14 = 193;
                    break;
                }
                case 33: {
                    n14 = 46;
                    break;
                }
                case 34: {
                    n14 = 28;
                    break;
                }
                case 35: {
                    n14 = 121;
                    break;
                }
                case 36: {
                    n14 = 177;
                    break;
                }
                case 37: {
                    n14 = 94;
                    break;
                }
                case 38: {
                    n14 = 92;
                    break;
                }
                case 39: {
                    n14 = 87;
                    break;
                }
                case 40: {
                    n14 = 113;
                    break;
                }
                case 41: {
                    n14 = 123;
                    break;
                }
                case 42: {
                    n14 = 225;
                    break;
                }
                case 43: {
                    n14 = 238;
                    break;
                }
                case 44: {
                    n14 = 99;
                    break;
                }
                case 45: {
                    n14 = 227;
                    break;
                }
                case 46: {
                    n14 = 155;
                    break;
                }
                case 47: {
                    n14 = 90;
                    break;
                }
                case 48: {
                    n14 = 195;
                    break;
                }
                case 49: {
                    n14 = 205;
                    break;
                }
                case 50: {
                    n14 = 93;
                    break;
                }
                case 51: {
                    n14 = 187;
                    break;
                }
                case 52: {
                    n14 = 12;
                    break;
                }
                case 53: {
                    n14 = 48;
                    break;
                }
                case 54: {
                    n14 = 247;
                    break;
                }
                case 55: {
                    n14 = 134;
                    break;
                }
                case 56: {
                    n14 = 67;
                    break;
                }
                case 57: {
                    n14 = 203;
                    break;
                }
                case 58: {
                    n14 = 65;
                    break;
                }
                case 59: {
                    n14 = 60;
                    break;
                }
                case 60: {
                    n14 = 79;
                    break;
                }
                case 61: {
                    n14 = 164;
                    break;
                }
                case 62: {
                    n14 = 236;
                    break;
                }
                case 63: {
                    n14 = 190;
                    break;
                }
                case 64: {
                    n14 = 173;
                    break;
                }
                case 65: {
                    n14 = 104;
                    break;
                }
                case 66: {
                    n14 = 253;
                    break;
                }
                case 67: {
                    n14 = 110;
                    break;
                }
                case 68: {
                    n14 = 37;
                    break;
                }
                case 69: {
                    n14 = 228;
                    break;
                }
                case 70: {
                    n14 = 41;
                    break;
                }
                case 71: {
                    n14 = 63;
                    break;
                }
                case 72: {
                    n14 = 25;
                    break;
                }
                case 73: {
                    n14 = 219;
                    break;
                }
                case 74: {
                    n14 = 135;
                    break;
                }
                case 75: {
                    n14 = 201;
                    break;
                }
                case 76: {
                    n14 = 129;
                    break;
                }
                case 77: {
                    n14 = 30;
                    break;
                }
                case 78: {
                    n14 = 100;
                    break;
                }
                case 79: {
                    n14 = 20;
                    break;
                }
                case 80: {
                    n14 = 174;
                    break;
                }
                case 81: {
                    n14 = 115;
                    break;
                }
                case 82: {
                    n14 = 122;
                    break;
                }
                case 83: {
                    n14 = 220;
                    break;
                }
                case 84: {
                    n14 = 242;
                    break;
                }
                case 85: {
                    n14 = 45;
                    break;
                }
                case 86: {
                    n14 = 62;
                    break;
                }
                case 87: {
                    n14 = 244;
                    break;
                }
                case 88: {
                    n14 = 10;
                    break;
                }
                case 89: {
                    n14 = 81;
                    break;
                }
                case 90: {
                    n14 = 186;
                    break;
                }
                case 91: {
                    n14 = 226;
                    break;
                }
                case 92: {
                    n14 = 139;
                    break;
                }
                case 93: {
                    n14 = 183;
                    break;
                }
                case 94: {
                    n14 = 197;
                    break;
                }
                case 95: {
                    n14 = 147;
                    break;
                }
                case 96: {
                    n14 = 202;
                    break;
                }
                case 97: {
                    n14 = 136;
                    break;
                }
                case 98: {
                    n14 = 176;
                    break;
                }
                case 99: {
                    n14 = 204;
                    break;
                }
                case 100: {
                    n14 = 149;
                    break;
                }
                case 101: {
                    n14 = 128;
                    break;
                }
                case 102: {
                    n14 = 71;
                    break;
                }
                case 103: {
                    n14 = 16;
                    break;
                }
                case 104: {
                    n14 = 40;
                    break;
                }
                case 105: {
                    n14 = 76;
                    break;
                }
                case 106: {
                    n14 = 0;
                    break;
                }
                case 107: {
                    n14 = 9;
                    break;
                }
                case 108: {
                    n14 = 131;
                    break;
                }
                case 109: {
                    n14 = 157;
                    break;
                }
                case 110: {
                    n14 = 96;
                    break;
                }
                case 111: {
                    n14 = 178;
                    break;
                }
                case 112: {
                    n14 = 75;
                    break;
                }
                case 113: {
                    n14 = 216;
                    break;
                }
                case 114: {
                    n14 = 36;
                    break;
                }
                case 115: {
                    n14 = 213;
                    break;
                }
                case 116: {
                    n14 = 70;
                    break;
                }
                case 117: {
                    n14 = 163;
                    break;
                }
                case 118: {
                    n14 = 19;
                    break;
                }
                case 119: {
                    n14 = 132;
                    break;
                }
                case 120: {
                    n14 = 254;
                    break;
                }
                case 121: {
                    n14 = 171;
                    break;
                }
                case 122: {
                    n14 = 8;
                    break;
                }
                case 123: {
                    n14 = 111;
                    break;
                }
                case 124: {
                    n14 = 224;
                    break;
                }
                case 125: {
                    n14 = 3;
                    break;
                }
                case 126: {
                    n14 = 200;
                    break;
                }
                case 127: {
                    n14 = 215;
                    break;
                }
                case 128: {
                    n14 = 150;
                    break;
                }
                case 129: {
                    n14 = 69;
                    break;
                }
                case 130: {
                    n14 = 209;
                    break;
                }
                case 131: {
                    n14 = 231;
                    break;
                }
                case 132: {
                    n14 = 245;
                    break;
                }
                case 133: {
                    n14 = 124;
                    break;
                }
                case 134: {
                    n14 = 140;
                    break;
                }
                case 135: {
                    n14 = 218;
                    break;
                }
                case 136: {
                    n14 = 235;
                    break;
                }
                case 137: {
                    n14 = 107;
                    break;
                }
                case 138: {
                    n14 = 82;
                    break;
                }
                case 139: {
                    n14 = 77;
                    break;
                }
                case 140: {
                    n14 = 33;
                    break;
                }
                case 141: {
                    n14 = 239;
                    break;
                }
                case 142: {
                    n14 = 251;
                    break;
                }
                case 143: {
                    n14 = 55;
                    break;
                }
                case 144: {
                    n14 = 144;
                    break;
                }
                case 145: {
                    n14 = 17;
                    break;
                }
                case 146: {
                    n14 = 162;
                    break;
                }
                case 147: {
                    n14 = 89;
                    break;
                }
                case 148: {
                    n14 = 130;
                    break;
                }
                case 149: {
                    n14 = 7;
                    break;
                }
                case 150: {
                    n14 = 112;
                    break;
                }
                case 151: {
                    n14 = 246;
                    break;
                }
                case 152: {
                    n14 = 44;
                    break;
                }
                case 153: {
                    n14 = 64;
                    break;
                }
                case 154: {
                    n14 = 52;
                    break;
                }
                case 155: {
                    n14 = 145;
                    break;
                }
                case 156: {
                    n14 = 43;
                    break;
                }
                case 157: {
                    n14 = 31;
                    break;
                }
                case 158: {
                    n14 = 54;
                    break;
                }
                case 159: {
                    n14 = 4;
                    break;
                }
                case 160: {
                    n14 = 11;
                    break;
                }
                case 161: {
                    n14 = 103;
                    break;
                }
                case 162: {
                    n14 = 98;
                    break;
                }
                case 163: {
                    n14 = 108;
                    break;
                }
                case 164: {
                    n14 = 97;
                    break;
                }
                case 165: {
                    n14 = 83;
                    break;
                }
                case 166: {
                    n14 = 120;
                    break;
                }
                case 167: {
                    n14 = 208;
                    break;
                }
                case 168: {
                    n14 = 59;
                    break;
                }
                case 169: {
                    n14 = 21;
                    break;
                }
                case 170: {
                    n14 = 233;
                    break;
                }
                case 171: {
                    n14 = 58;
                    break;
                }
                case 172: {
                    n14 = 61;
                    break;
                }
                case 173: {
                    n14 = 78;
                    break;
                }
                case 174: {
                    n14 = 57;
                    break;
                }
                case 175: {
                    n14 = 126;
                    break;
                }
                case 176: {
                    n14 = 153;
                    break;
                }
                case 177: {
                    n14 = 151;
                    break;
                }
                case 178: {
                    n14 = 234;
                    break;
                }
                case 179: {
                    n14 = 237;
                    break;
                }
                case 180: {
                    n14 = 137;
                    break;
                }
                case 181: {
                    n14 = 142;
                    break;
                }
                case 182: {
                    n14 = 166;
                    break;
                }
                case 183: {
                    n14 = 210;
                    break;
                }
                case 184: {
                    n14 = 188;
                    break;
                }
                case 185: {
                    n14 = 194;
                    break;
                }
                case 186: {
                    n14 = 230;
                    break;
                }
                case 187: {
                    n14 = 88;
                    break;
                }
                case 188: {
                    n14 = 125;
                    break;
                }
                case 189: {
                    n14 = 86;
                    break;
                }
                case 190: {
                    n14 = 141;
                    break;
                }
                case 191: {
                    n14 = 106;
                    break;
                }
                case 192: {
                    n14 = 95;
                    break;
                }
                case 193: {
                    n14 = 118;
                    break;
                }
                case 194: {
                    n14 = 143;
                    break;
                }
                case 195: {
                    n14 = 196;
                    break;
                }
                case 196: {
                    n14 = 211;
                    break;
                }
                case 197: {
                    n14 = 80;
                    break;
                }
                case 198: {
                    n14 = 51;
                    break;
                }
                case 199: {
                    n14 = 250;
                    break;
                }
                case 200: {
                    n14 = 53;
                    break;
                }
                case 201: {
                    n14 = 102;
                    break;
                }
                case 202: {
                    n14 = 223;
                    break;
                }
                case 203: {
                    n14 = 169;
                    break;
                }
                case 204: {
                    n14 = 68;
                    break;
                }
                case 205: {
                    n14 = 14;
                    break;
                }
                case 206: {
                    n14 = 24;
                    break;
                }
                case 207: {
                    n14 = 191;
                    break;
                }
                case 208: {
                    n14 = 146;
                    break;
                }
                case 209: {
                    n14 = 248;
                    break;
                }
                case 210: {
                    n14 = 38;
                    break;
                }
                case 211: {
                    n14 = 18;
                    break;
                }
                case 212: {
                    n14 = 255;
                    break;
                }
                case 213: {
                    n14 = 22;
                    break;
                }
                case 214: {
                    n14 = 232;
                    break;
                }
                case 215: {
                    n14 = 84;
                    break;
                }
                case 216: {
                    n14 = 116;
                    break;
                }
                case 217: {
                    n14 = 34;
                    break;
                }
                case 218: {
                    n14 = 229;
                    break;
                }
                case 219: {
                    n14 = 39;
                    break;
                }
                case 220: {
                    n14 = 170;
                    break;
                }
                case 221: {
                    n14 = 152;
                    break;
                }
                case 222: {
                    n14 = 198;
                    break;
                }
                case 223: {
                    n14 = 15;
                    break;
                }
                case 224: {
                    n14 = 182;
                    break;
                }
                case 225: {
                    n14 = 29;
                    break;
                }
                case 226: {
                    n14 = 32;
                    break;
                }
                case 227: {
                    n14 = 185;
                    break;
                }
                case 228: {
                    n14 = 207;
                    break;
                }
                case 229: {
                    n14 = 27;
                    break;
                }
                case 230: {
                    n14 = 148;
                    break;
                }
                case 231: {
                    n14 = 101;
                    break;
                }
                case 232: {
                    n14 = 221;
                    break;
                }
                case 233: {
                    n14 = 23;
                    break;
                }
                case 234: {
                    n14 = 179;
                    break;
                }
                case 235: {
                    n14 = 180;
                    break;
                }
                case 236: {
                    n14 = 73;
                    break;
                }
                case 237: {
                    n14 = 240;
                    break;
                }
                case 238: {
                    n14 = 50;
                    break;
                }
                case 239: {
                    n14 = 161;
                    break;
                }
                case 240: {
                    n14 = 217;
                    break;
                }
                case 241: {
                    n14 = 119;
                    break;
                }
                case 242: {
                    n14 = 42;
                    break;
                }
                case 243: {
                    n14 = 5;
                    break;
                }
                case 244: {
                    n14 = 154;
                    break;
                }
                case 245: {
                    n14 = 222;
                    break;
                }
                case 246: {
                    n14 = 167;
                    break;
                }
                case 247: {
                    n14 = 168;
                    break;
                }
                case 248: {
                    n14 = 212;
                    break;
                }
                case 249: {
                    n14 = 91;
                    break;
                }
                case 250: {
                    n14 = 49;
                    break;
                }
                case 251: {
                    n14 = 165;
                    break;
                }
                case 252: {
                    n14 = 158;
                    break;
                }
                case 253: {
                    n14 = 181;
                    break;
                }
                case 254: {
                    n14 = 105;
                    break;
                }
                default: {
                    n14 = 192;
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
            EI.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x146B;
        if (d[n11] == null) {
            EI.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

