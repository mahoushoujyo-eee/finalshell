/*
 * Decompiled with CFR 0.152.
 */
package com.T;

import com.FN;
import com.GA;
import com.GO;
import com.KD;
import com.T.E;
import com.T.u;
import com.ky_2;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class s
extends BasicOptionPaneUI {
    public static final ImageIcon l;
    public static final ImageIcon s;
    public static final ImageIcon q;
    public static final ImageIcon T;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static ComponentUI createUI(JComponent jComponent) {
        return new s();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.optionPane);
        int n10 = E.f();
        LookAndFeel.installProperty(this.optionPane, com.T.s.a(-30498, -21373), Boolean.FALSE);
        this.optionPane.setBackground(u.m);
        this.optionPane.setBorder(GA.C(com.T.s.a(31406, 3617500034880960480L), com.T.s.a(25868, 887088478996424769L), com.T.s.a(25868, 887088478996424769L), com.T.s.a(25868, 887088478996424769L)));
        int n11 = n10;
        if (n11 != 0) {
            ky_2.K(new String[3]);
        }
    }

    @Override
    protected Container createMessageArea() {
        Container container = super.createMessageArea();
        FN.F(container, false);
        return container;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void addButtonComponents(Container var1_1, Object[] var2_2, int var3_3) {
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

    @Override
    protected Object[] getButtons() {
        block8: {
            Object[] objectArray;
            block9: {
                Object[] objectArray2;
                block10: {
                    Object[] objectArray3;
                    block6: {
                        Object[] objectArray4;
                        int n10;
                        block13: {
                            int n11;
                            block16: {
                                block17: {
                                    int n12;
                                    block14: {
                                        int n13;
                                        block15: {
                                            block11: {
                                                block12: {
                                                    JOptionPane jOptionPane;
                                                    block7: {
                                                        n10 = E.D();
                                                        jOptionPane = this.optionPane;
                                                        if (n10 == 0) break block7;
                                                        if (jOptionPane == null) break block8;
                                                        jOptionPane = this.optionPane;
                                                    }
                                                    objectArray = objectArray2 = jOptionPane.getOptions();
                                                    if (n10 == 0) break block9;
                                                    if (objectArray != null) break block10;
                                                    n11 = n13 = this.optionPane.getOptionType();
                                                    if (n10 == 0) break block11;
                                                    if (n11 != 0) break block12;
                                                    objectArray4 = new KD[2];
                                                    objectArray4[0] = new KD("");
                                                    objectArray4[0].u(GO.Fv);
                                                    objectArray4[0].u(com.T.s.a(-30508, 22442), new Object[0]);
                                                    objectArray4[1] = new KD("");
                                                    objectArray4[1].u(GO.FN);
                                                    objectArray4[1].u(com.T.s.a(-30502, -19051), new Object[0]);
                                                    if (n10 != 0) break block13;
                                                }
                                                n11 = n13;
                                            }
                                            n12 = 1;
                                            if (n10 == 0) break block14;
                                            if (n11 != n12) break block15;
                                            objectArray4 = new KD[3];
                                            objectArray4[0] = new KD("");
                                            objectArray4[0].u(GO.Fv);
                                            objectArray4[0].u(com.T.s.a(-30506, 29999), new Object[0]);
                                            objectArray4[1] = new KD("");
                                            objectArray4[1].u(GO.FN);
                                            ((KD)objectArray4[1]).u(com.T.s.a(-30503, 28487), new Object[0]);
                                            objectArray4[2] = new KD("");
                                            ((KD)objectArray4[2]).u(GO.g);
                                            ((KD)objectArray4[2]).u(com.T.s.a(-30501, 28221), new Object[0]);
                                            if (n10 != 0) break block13;
                                        }
                                        n11 = n13;
                                        if (n10 == 0) break block16;
                                        n12 = 2;
                                    }
                                    if (n11 != n12) break block17;
                                    objectArray4 = new KD[2];
                                    objectArray4[0] = new KD("");
                                    objectArray4[0].u(GO.Fv);
                                    objectArray4[0].u(com.T.s.a(-30510, -8370), new Object[0]);
                                    objectArray4[1] = new KD("");
                                    objectArray4[1].u(GO.FN);
                                    ((KD)objectArray4[1]).u(com.T.s.a(-30500, -30673), new Object[0]);
                                    if (n10 != 0) break block13;
                                }
                                n11 = 1;
                            }
                            objectArray4 = new KD[n11];
                            objectArray4[0] = new KD("");
                            objectArray4[0].u(GO.Fv);
                            objectArray4[0].u(com.T.s.a(-30504, 1015), new Object[0]);
                        }
                        int n14 = 0;
                        Object[] objectArray5 = objectArray4;
                        int n15 = objectArray5.length;
                        for (int i2 = 0; i2 < n15; ++i2) {
                            objectArray3 = objectArray5;
                            if (n10 != 0) {
                                Object object = objectArray3[i2];
                                this.F((KD)object);
                                ((AbstractButton)object).addActionListener(this.createButtonActionListener(n14));
                                ++n14;
                                if (n10 != 0) continue;
                            }
                            break block6;
                        }
                        objectArray3 = objectArray4;
                    }
                    return objectArray3;
                }
                objectArray = objectArray2;
            }
            return objectArray;
        }
        return null;
    }

    private void F(KD kD) {
        kD.O(com.T.s.a(9658, 199156779108542709L));
        kD.setMinimumSize(new Dimension(com.T.s.a(12972, 2513358303502483424L), 0));
        kD.S(u.e);
        Font font = UIManager.getFont(com.T.s.a(-30499, -5380));
        if (font != null) {
            kD.setFont(font);
        }
    }

    @Override
    protected Icon getIconForType(int n10) {
        return com.T.s.l(n10);
    }

    public static ImageIcon l(int n10) {
        int n11;
        block10: {
            block11: {
                block9: {
                    int n12;
                    block8: {
                        n12 = E.D();
                        n11 = n10;
                        if (n12 == 0) break block8;
                        if (n11 < 0) break block9;
                        n11 = n10;
                    }
                    if (n12 == 0) break block10;
                    if (n11 <= 3) break block11;
                }
                return null;
            }
            n11 = n10;
        }
        switch (n11) {
            case 0: {
                return q;
            }
            case 1: {
                return l;
            }
            case 2: {
                return s;
            }
            case 3: {
                return T;
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
                        var13 = new String[16];
                        var11_1 = 0;
                        var10_2 = "\u00a5\u00d7\u00d1\u00deD/)^\fT?\u00ca\u00a7p\"\u0086g\"\u00c8\u00d8\u00e8M[p\u00f4\u00e5\u000fn\u00ed\u00da\u0003\u008e\u0014\u0093S>\u00fcc\u00c6|d\t\u00cd\u0005\u00c7Ty1\"\u00b9\u00faz\u0001\u0012v\u008cR\u00c3P*\u0015\u0083\u0085o>r\u008c\u0017D,\u00ba\u00af\u0015\rJ=\u001b\u00bd1\u00b0\u00fb)\u0004\u00ce\u0084ZW\u0016b_\u00d3\u00d3!\u0010\u0011\u00a3\u0089\u0011\u0015\\V*ql\u00b13v&\u00e7\u0012ta\u0015\u0090\u00e1^\u00aao\f\u00fd=9\u00e6\u0003\u00a2\u0094\u00d5)\u00b7\u00baH\fY\u00d7\u0011\u00a8k\u0089?+\u00b5|dy\u0018I%\u00d4Z\u0018\u00d3\u00ad\u0015\u0001\u00d9l\u00ad)\u00ec5! e \u00d2\u00f0\u00db\u00a5v+p>^\u0091\u0018\u00ed\u00e9\u00f1\u00ab\u009a,C9\u00eef\u00f9\u00b2\u00cb\u00d7\u00c2\u00f7\u00c7@\u00b9\\%\u00dc\u007fO\u0014L\u009b\u00c5\u00e5\u001c\u00e5\u0093\u0000\u00f4A\u00baV\u00a3K\u00cfdf2\u0080\u001c\u0014-\"\u00e9\u00d2\u0099\u0003#\u00dc\u00e2\u00dax%\u00fb%\u00c4\u00a9\u0007\u008b\u00ac+\u0014\u0092\u00a9\u001e\u00a3g-\u00fc\u0019\u0019b\u00072\u0014\u00c79\u00f5\u00b8\u0000Z^\u000fl\u00b0\u0011D8\u00da\f\u009a'\u00b7\u0099\u00b1\u00a1\u00c0T\u0006\u0081\u00e0d _\u00e0";
                        var12_3 = "\u00a5\u00d7\u00d1\u00deD/)^\fT?\u00ca\u00a7p\"\u0086g\"\u00c8\u00d8\u00e8M[p\u00f4\u00e5\u000fn\u00ed\u00da\u0003\u008e\u0014\u0093S>\u00fcc\u00c6|d\t\u00cd\u0005\u00c7Ty1\"\u00b9\u00faz\u0001\u0012v\u008cR\u00c3P*\u0015\u0083\u0085o>r\u008c\u0017D,\u00ba\u00af\u0015\rJ=\u001b\u00bd1\u00b0\u00fb)\u0004\u00ce\u0084ZW\u0016b_\u00d3\u00d3!\u0010\u0011\u00a3\u0089\u0011\u0015\\V*ql\u00b13v&\u00e7\u0012ta\u0015\u0090\u00e1^\u00aao\f\u00fd=9\u00e6\u0003\u00a2\u0094\u00d5)\u00b7\u00baH\fY\u00d7\u0011\u00a8k\u0089?+\u00b5|dy\u0018I%\u00d4Z\u0018\u00d3\u00ad\u0015\u0001\u00d9l\u00ad)\u00ec5! e \u00d2\u00f0\u00db\u00a5v+p>^\u0091\u0018\u00ed\u00e9\u00f1\u00ab\u009a,C9\u00eef\u00f9\u00b2\u00cb\u00d7\u00c2\u00f7\u00c7@\u00b9\\%\u00dc\u007fO\u0014L\u009b\u00c5\u00e5\u001c\u00e5\u0093\u0000\u00f4A\u00baV\u00a3K\u00cfdf2\u0080\u001c\u0014-\"\u00e9\u00d2\u0099\u0003#\u00dc\u00e2\u00dax%\u00fb%\u00c4\u00a9\u0007\u008b\u00ac+\u0014\u0092\u00a9\u001e\u00a3g-\u00fc\u0019\u0019b\u00072\u0014\u00c79\u00f5\u00b8\u0000Z^\u000fl\u00b0\u0011D8\u00da\f\u009a'\u00b7\u0099\u00b1\u00a1\u00c0T\u0006\u0081\u00e0d _\u00e0".length();
                        var9_4 = 32;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 106;
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
                            var10_2 = "w{\u00de\u001e\u00f0b\u00ea\u00a2!\u009e\u00cf\u00c6\u00ec\u00a4\u001eI\u00b5\u008b\u00c4\u001aH\u0018\u00bb%ng<\u00e0\u00c2\u00f5\u008b\u00aa\u0000~\u00a1\u001b\u00da;\u0091\u008c&\u0090\u0083\u0010\u00fe\u0083";
                            var12_3 = "w{\u00de\u001e\u00f0b\u00ea\u00a2!\u009e\u00cf\u00c6\u00ec\u00a4\u001eI\u00b5\u008b\u00c4\u001aH\u0018\u00bb%ng<\u00e0\u00c2\u00f5\u008b\u00aa\u0000~\u00a1\u001b\u00da;\u0091\u008c&\u0090\u0083\u0010\u00fe\u0083".length();
                            var9_4 = 21;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 89;
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
                                    v15 = 61;
                                    break;
                                }
                                case 1: {
                                    v15 = 24;
                                    break;
                                }
                                case 2: {
                                    v15 = 55;
                                    break;
                                }
                                case 3: {
                                    v15 = 23;
                                    break;
                                }
                                case 4: {
                                    v15 = 42;
                                    break;
                                }
                                case 5: {
                                    v15 = 27;
                                    break;
                                }
                                default: {
                                    v15 = 17;
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
                com.T.s.a = var13;
                com.T.s.b = new String[16];
                var0_7 = 2953019395917100918L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "\u00f4\u00b8dO&\u0096_8\u00dd\u00e1Wi%\u00f1\b\u00d0";
                var5_11 = "\u00f4\u00b8dO&\u0096_8\u00dd\u00e1Wi%\u00f1\b\u00d0".length();
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
                    var4_10 = "\u00ec\u0018\u001f\u001d\u00bd\u001a\u001f\u0089\u007fy\u00b8C&p\u00c0\u0099";
                    var5_11 = "\u00ec\u0018\u001f\u001d\u00bd\u001a\u001f\u0089\u007fy\u00b8C&p\u00c0\u0099".length();
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
        com.T.s.c = var6_8;
        com.T.s.d = new Integer[4];
        com.T.s.l = new ImageIcon(s.class.getResource(com.T.s.a(-30512, 15123)));
        com.T.s.s = new ImageIcon(s.class.getResource(com.T.s.a(-30507, -9482)));
        com.T.s.q = new ImageIcon(s.class.getResource(com.T.s.a(-30497, -29635)));
        com.T.s.T = new ImageIcon(s.class.getResource(com.T.s.a(-30511, 24587)));
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF88D3) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 230;
                    break;
                }
                case 1: {
                    n14 = 126;
                    break;
                }
                case 2: {
                    n14 = 114;
                    break;
                }
                case 3: {
                    n14 = 178;
                    break;
                }
                case 4: {
                    n14 = 98;
                    break;
                }
                case 5: {
                    n14 = 156;
                    break;
                }
                case 6: {
                    n14 = 52;
                    break;
                }
                case 7: {
                    n14 = 192;
                    break;
                }
                case 8: {
                    n14 = 165;
                    break;
                }
                case 9: {
                    n14 = 49;
                    break;
                }
                case 10: {
                    n14 = 115;
                    break;
                }
                case 11: {
                    n14 = 219;
                    break;
                }
                case 12: {
                    n14 = 20;
                    break;
                }
                case 13: {
                    n14 = 56;
                    break;
                }
                case 14: {
                    n14 = 102;
                    break;
                }
                case 15: {
                    n14 = 17;
                    break;
                }
                case 16: {
                    n14 = 181;
                    break;
                }
                case 17: {
                    n14 = 129;
                    break;
                }
                case 18: {
                    n14 = 233;
                    break;
                }
                case 19: {
                    n14 = 160;
                    break;
                }
                case 20: {
                    n14 = 68;
                    break;
                }
                case 21: {
                    n14 = 239;
                    break;
                }
                case 22: {
                    n14 = 236;
                    break;
                }
                case 23: {
                    n14 = 205;
                    break;
                }
                case 24: {
                    n14 = 82;
                    break;
                }
                case 25: {
                    n14 = 50;
                    break;
                }
                case 26: {
                    n14 = 94;
                    break;
                }
                case 27: {
                    n14 = 41;
                    break;
                }
                case 28: {
                    n14 = 249;
                    break;
                }
                case 29: {
                    n14 = 172;
                    break;
                }
                case 30: {
                    n14 = 37;
                    break;
                }
                case 31: {
                    n14 = 189;
                    break;
                }
                case 32: {
                    n14 = 214;
                    break;
                }
                case 33: {
                    n14 = 195;
                    break;
                }
                case 34: {
                    n14 = 164;
                    break;
                }
                case 35: {
                    n14 = 240;
                    break;
                }
                case 36: {
                    n14 = 238;
                    break;
                }
                case 37: {
                    n14 = 75;
                    break;
                }
                case 38: {
                    n14 = 159;
                    break;
                }
                case 39: {
                    n14 = 212;
                    break;
                }
                case 40: {
                    n14 = 36;
                    break;
                }
                case 41: {
                    n14 = 204;
                    break;
                }
                case 42: {
                    n14 = 59;
                    break;
                }
                case 43: {
                    n14 = 171;
                    break;
                }
                case 44: {
                    n14 = 42;
                    break;
                }
                case 45: {
                    n14 = 93;
                    break;
                }
                case 46: {
                    n14 = 176;
                    break;
                }
                case 47: {
                    n14 = 13;
                    break;
                }
                case 48: {
                    n14 = 220;
                    break;
                }
                case 49: {
                    n14 = 116;
                    break;
                }
                case 50: {
                    n14 = 44;
                    break;
                }
                case 51: {
                    n14 = 22;
                    break;
                }
                case 52: {
                    n14 = 27;
                    break;
                }
                case 53: {
                    n14 = 54;
                    break;
                }
                case 54: {
                    n14 = 182;
                    break;
                }
                case 55: {
                    n14 = 91;
                    break;
                }
                case 56: {
                    n14 = 95;
                    break;
                }
                case 57: {
                    n14 = 246;
                    break;
                }
                case 58: {
                    n14 = 203;
                    break;
                }
                case 59: {
                    n14 = 235;
                    break;
                }
                case 60: {
                    n14 = 103;
                    break;
                }
                case 61: {
                    n14 = 162;
                    break;
                }
                case 62: {
                    n14 = 19;
                    break;
                }
                case 63: {
                    n14 = 46;
                    break;
                }
                case 64: {
                    n14 = 39;
                    break;
                }
                case 65: {
                    n14 = 40;
                    break;
                }
                case 66: {
                    n14 = 97;
                    break;
                }
                case 67: {
                    n14 = 206;
                    break;
                }
                case 68: {
                    n14 = 38;
                    break;
                }
                case 69: {
                    n14 = 251;
                    break;
                }
                case 70: {
                    n14 = 14;
                    break;
                }
                case 71: {
                    n14 = 63;
                    break;
                }
                case 72: {
                    n14 = 12;
                    break;
                }
                case 73: {
                    n14 = 9;
                    break;
                }
                case 74: {
                    n14 = 61;
                    break;
                }
                case 75: {
                    n14 = 221;
                    break;
                }
                case 76: {
                    n14 = 79;
                    break;
                }
                case 77: {
                    n14 = 122;
                    break;
                }
                case 78: {
                    n14 = 6;
                    break;
                }
                case 79: {
                    n14 = 153;
                    break;
                }
                case 80: {
                    n14 = 51;
                    break;
                }
                case 81: {
                    n14 = 191;
                    break;
                }
                case 82: {
                    n14 = 65;
                    break;
                }
                case 83: {
                    n14 = 194;
                    break;
                }
                case 84: {
                    n14 = 201;
                    break;
                }
                case 85: {
                    n14 = 170;
                    break;
                }
                case 86: {
                    n14 = 137;
                    break;
                }
                case 87: {
                    n14 = 117;
                    break;
                }
                case 88: {
                    n14 = 237;
                    break;
                }
                case 89: {
                    n14 = 223;
                    break;
                }
                case 90: {
                    n14 = 224;
                    break;
                }
                case 91: {
                    n14 = 8;
                    break;
                }
                case 92: {
                    n14 = 90;
                    break;
                }
                case 93: {
                    n14 = 104;
                    break;
                }
                case 94: {
                    n14 = 147;
                    break;
                }
                case 95: {
                    n14 = 157;
                    break;
                }
                case 96: {
                    n14 = 167;
                    break;
                }
                case 97: {
                    n14 = 118;
                    break;
                }
                case 98: {
                    n14 = 28;
                    break;
                }
                case 99: {
                    n14 = 245;
                    break;
                }
                case 100: {
                    n14 = 3;
                    break;
                }
                case 101: {
                    n14 = 124;
                    break;
                }
                case 102: {
                    n14 = 121;
                    break;
                }
                case 103: {
                    n14 = 177;
                    break;
                }
                case 104: {
                    n14 = 88;
                    break;
                }
                case 105: {
                    n14 = 211;
                    break;
                }
                case 106: {
                    n14 = 110;
                    break;
                }
                case 107: {
                    n14 = 200;
                    break;
                }
                case 108: {
                    n14 = 187;
                    break;
                }
                case 109: {
                    n14 = 66;
                    break;
                }
                case 110: {
                    n14 = 130;
                    break;
                }
                case 111: {
                    n14 = 198;
                    break;
                }
                case 112: {
                    n14 = 16;
                    break;
                }
                case 113: {
                    n14 = 74;
                    break;
                }
                case 114: {
                    n14 = 108;
                    break;
                }
                case 115: {
                    n14 = 133;
                    break;
                }
                case 116: {
                    n14 = 225;
                    break;
                }
                case 117: {
                    n14 = 242;
                    break;
                }
                case 118: {
                    n14 = 64;
                    break;
                }
                case 119: {
                    n14 = 215;
                    break;
                }
                case 120: {
                    n14 = 173;
                    break;
                }
                case 121: {
                    n14 = 226;
                    break;
                }
                case 122: {
                    n14 = 58;
                    break;
                }
                case 123: {
                    n14 = 158;
                    break;
                }
                case 124: {
                    n14 = 222;
                    break;
                }
                case 125: {
                    n14 = 77;
                    break;
                }
                case 126: {
                    n14 = 227;
                    break;
                }
                case 127: {
                    n14 = 208;
                    break;
                }
                case 128: {
                    n14 = 183;
                    break;
                }
                case 129: {
                    n14 = 140;
                    break;
                }
                case 130: {
                    n14 = 83;
                    break;
                }
                case 131: {
                    n14 = 148;
                    break;
                }
                case 132: {
                    n14 = 154;
                    break;
                }
                case 133: {
                    n14 = 216;
                    break;
                }
                case 134: {
                    n14 = 168;
                    break;
                }
                case 135: {
                    n14 = 101;
                    break;
                }
                case 136: {
                    n14 = 232;
                    break;
                }
                case 137: {
                    n14 = 21;
                    break;
                }
                case 138: {
                    n14 = 111;
                    break;
                }
                case 139: {
                    n14 = 85;
                    break;
                }
                case 140: {
                    n14 = 166;
                    break;
                }
                case 141: {
                    n14 = 0;
                    break;
                }
                case 142: {
                    n14 = 143;
                    break;
                }
                case 143: {
                    n14 = 120;
                    break;
                }
                case 144: {
                    n14 = 45;
                    break;
                }
                case 145: {
                    n14 = 146;
                    break;
                }
                case 146: {
                    n14 = 175;
                    break;
                }
                case 147: {
                    n14 = 32;
                    break;
                }
                case 148: {
                    n14 = 99;
                    break;
                }
                case 149: {
                    n14 = 57;
                    break;
                }
                case 150: {
                    n14 = 255;
                    break;
                }
                case 151: {
                    n14 = 161;
                    break;
                }
                case 152: {
                    n14 = 31;
                    break;
                }
                case 153: {
                    n14 = 141;
                    break;
                }
                case 154: {
                    n14 = 26;
                    break;
                }
                case 155: {
                    n14 = 244;
                    break;
                }
                case 156: {
                    n14 = 136;
                    break;
                }
                case 157: {
                    n14 = 72;
                    break;
                }
                case 158: {
                    n14 = 199;
                    break;
                }
                case 159: {
                    n14 = 35;
                    break;
                }
                case 160: {
                    n14 = 210;
                    break;
                }
                case 161: {
                    n14 = 60;
                    break;
                }
                case 162: {
                    n14 = 252;
                    break;
                }
                case 163: {
                    n14 = 71;
                    break;
                }
                case 164: {
                    n14 = 234;
                    break;
                }
                case 165: {
                    n14 = 105;
                    break;
                }
                case 166: {
                    n14 = 179;
                    break;
                }
                case 167: {
                    n14 = 138;
                    break;
                }
                case 168: {
                    n14 = 4;
                    break;
                }
                case 169: {
                    n14 = 185;
                    break;
                }
                case 170: {
                    n14 = 81;
                    break;
                }
                case 171: {
                    n14 = 76;
                    break;
                }
                case 172: {
                    n14 = 34;
                    break;
                }
                case 173: {
                    n14 = 151;
                    break;
                }
                case 174: {
                    n14 = 197;
                    break;
                }
                case 175: {
                    n14 = 78;
                    break;
                }
                case 176: {
                    n14 = 24;
                    break;
                }
                case 177: {
                    n14 = 70;
                    break;
                }
                case 178: {
                    n14 = 1;
                    break;
                }
                case 179: {
                    n14 = 152;
                    break;
                }
                case 180: {
                    n14 = 55;
                    break;
                }
                case 181: {
                    n14 = 53;
                    break;
                }
                case 182: {
                    n14 = 125;
                    break;
                }
                case 183: {
                    n14 = 174;
                    break;
                }
                case 184: {
                    n14 = 193;
                    break;
                }
                case 185: {
                    n14 = 84;
                    break;
                }
                case 186: {
                    n14 = 112;
                    break;
                }
                case 187: {
                    n14 = 128;
                    break;
                }
                case 188: {
                    n14 = 92;
                    break;
                }
                case 189: {
                    n14 = 243;
                    break;
                }
                case 190: {
                    n14 = 87;
                    break;
                }
                case 191: {
                    n14 = 248;
                    break;
                }
                case 192: {
                    n14 = 169;
                    break;
                }
                case 193: {
                    n14 = 119;
                    break;
                }
                case 194: {
                    n14 = 23;
                    break;
                }
                case 195: {
                    n14 = 196;
                    break;
                }
                case 196: {
                    n14 = 155;
                    break;
                }
                case 197: {
                    n14 = 69;
                    break;
                }
                case 198: {
                    n14 = 109;
                    break;
                }
                case 199: {
                    n14 = 127;
                    break;
                }
                case 200: {
                    n14 = 180;
                    break;
                }
                case 201: {
                    n14 = 67;
                    break;
                }
                case 202: {
                    n14 = 131;
                    break;
                }
                case 203: {
                    n14 = 113;
                    break;
                }
                case 204: {
                    n14 = 7;
                    break;
                }
                case 205: {
                    n14 = 241;
                    break;
                }
                case 206: {
                    n14 = 107;
                    break;
                }
                case 207: {
                    n14 = 254;
                    break;
                }
                case 208: {
                    n14 = 86;
                    break;
                }
                case 209: {
                    n14 = 29;
                    break;
                }
                case 210: {
                    n14 = 10;
                    break;
                }
                case 211: {
                    n14 = 163;
                    break;
                }
                case 212: {
                    n14 = 89;
                    break;
                }
                case 213: {
                    n14 = 25;
                    break;
                }
                case 214: {
                    n14 = 202;
                    break;
                }
                case 215: {
                    n14 = 142;
                    break;
                }
                case 216: {
                    n14 = 11;
                    break;
                }
                case 217: {
                    n14 = 33;
                    break;
                }
                case 218: {
                    n14 = 30;
                    break;
                }
                case 219: {
                    n14 = 184;
                    break;
                }
                case 220: {
                    n14 = 2;
                    break;
                }
                case 221: {
                    n14 = 228;
                    break;
                }
                case 222: {
                    n14 = 144;
                    break;
                }
                case 223: {
                    n14 = 135;
                    break;
                }
                case 224: {
                    n14 = 47;
                    break;
                }
                case 225: {
                    n14 = 145;
                    break;
                }
                case 226: {
                    n14 = 229;
                    break;
                }
                case 227: {
                    n14 = 139;
                    break;
                }
                case 228: {
                    n14 = 190;
                    break;
                }
                case 229: {
                    n14 = 207;
                    break;
                }
                case 230: {
                    n14 = 15;
                    break;
                }
                case 231: {
                    n14 = 106;
                    break;
                }
                case 232: {
                    n14 = 247;
                    break;
                }
                case 233: {
                    n14 = 48;
                    break;
                }
                case 234: {
                    n14 = 43;
                    break;
                }
                case 235: {
                    n14 = 132;
                    break;
                }
                case 236: {
                    n14 = 134;
                    break;
                }
                case 237: {
                    n14 = 250;
                    break;
                }
                case 238: {
                    n14 = 213;
                    break;
                }
                case 239: {
                    n14 = 5;
                    break;
                }
                case 240: {
                    n14 = 150;
                    break;
                }
                case 241: {
                    n14 = 186;
                    break;
                }
                case 242: {
                    n14 = 253;
                    break;
                }
                case 243: {
                    n14 = 218;
                    break;
                }
                case 244: {
                    n14 = 73;
                    break;
                }
                case 245: {
                    n14 = 188;
                    break;
                }
                case 246: {
                    n14 = 123;
                    break;
                }
                case 247: {
                    n14 = 231;
                    break;
                }
                case 248: {
                    n14 = 100;
                    break;
                }
                case 249: {
                    n14 = 209;
                    break;
                }
                case 250: {
                    n14 = 80;
                    break;
                }
                case 251: {
                    n14 = 62;
                    break;
                }
                case 252: {
                    n14 = 217;
                    break;
                }
                case 253: {
                    n14 = 149;
                    break;
                }
                case 254: {
                    n14 = 18;
                    break;
                }
                default: {
                    n14 = 96;
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
            com.T.s.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xD4D;
        if (d[n11] == null) {
            com.T.s.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

