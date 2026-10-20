/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

public class UI
extends JPopupMenu
implements MouseListener,
ActionListener {
    private static final long serialVersionUID;
    private static UI V;
    JMenuItem o = new JMenuItem("剪切");
    JMenuItem U;
    JMenuItem K;
    JMenuItem b;
    JMenuItem P;
    private static final String[] a;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;

    public static void T(JTextComponent jTextComponent) {
        block3: {
            JTextComponent jTextComponent2;
            block4: {
                boolean bl;
                block2: {
                    int n10 = jy_0.G();
                    bl = jTextComponent instanceof JTextField;
                    if (n10 == 0) break block2;
                    if (!bl) break block3;
                    jTextComponent2 = jTextComponent;
                    if (n10 == 0) break block4;
                    bl = jTextComponent2 instanceof JPasswordField;
                }
                if (bl) break block3;
                jTextComponent2 = jTextComponent;
            }
            jTextComponent2.addMouseListener(UI.j());
        }
    }

    public static void X(JTextComponent jTextComponent) {
        block3: {
            JTextComponent jTextComponent2;
            block4: {
                boolean bl;
                block2: {
                    int n10 = jy_0.G();
                    bl = jTextComponent instanceof JTextField;
                    if (n10 == 0) break block2;
                    if (!bl) break block3;
                    jTextComponent2 = jTextComponent;
                    if (n10 == 0) break block4;
                    bl = jTextComponent2 instanceof JPasswordField;
                }
                if (bl) break block3;
                jTextComponent2 = jTextComponent;
            }
            jTextComponent2.removeMouseListener(UI.j());
        }
    }

    public UI() {
        this.add(this.o);
        this.U = new JMenuItem("复制");
        this.add(this.U);
        this.K = new JMenuItem("粘贴");
        this.add(this.K);
        this.b = new JMenuItem("删除");
        this.add(this.b);
        this.addSeparator();
        this.P = new JMenuItem("全选");
        this.add(this.P);
        this.o.setMnemonic((char)UI.a(15773, 2118457290168183857L));
        this.U.setMnemonic((char)UI.a(17720, 7221675473609544854L));
        int n10 = jy_0.G();
        this.K.setMnemonic((char)UI.a(18983, 7383434219860614026L));
        int n11 = n10;
        this.b.setMnemonic((char)UI.a(24044, 2639102508753439815L));
        this.P.setMnemonic((char)UI.a(4296, 7348651717493227879L));
        this.o.addActionListener(this);
        this.U.addActionListener(this);
        this.K.addActionListener(this);
        this.b.addActionListener(this);
        this.P.addActionListener(this);
        if (n11 == 0) {
            ky_2.K(new String[1]);
        }
    }

    static UI j() {
        int n10 = jy_0.C();
        UI uI2 = V;
        if (n10 == 0) {
            if (uI2 == null) {
                V = new UI();
            }
            uI2 = V;
        }
        return uI2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block6: {
            Object object;
            int n10;
            block7: {
                boolean bl;
                block5: {
                    n10 = jy_0.G();
                    bl = mouseEvent.isPopupTrigger();
                    if (n10 == 0) break block5;
                    if (!bl) break block6;
                    object = mouseEvent.getSource();
                    if (n10 == 0) break block7;
                    bl = object instanceof JTextField;
                }
                if (!bl) break block6;
                object = mouseEvent.getSource();
            }
            JTextField jTextField = (JTextField)object;
            boolean bl = Boolean.TRUE.equals(jTextField.getClientProperty("DisablePopupMenu"));
            if (n10 != 0) {
                if (bl) {
                    return;
                }
                bl = jTextField.requestFocusInWindow();
            }
            this.show(jTextField, mouseEvent.getX(), mouseEvent.getY());
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    /*
     * Exception decompiling
     */
    @Override
    public void show(Component var1_1, int var2_2, int var3_3) {
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
     * Unable to fully structure code
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        block35: {
            block38: {
                block47: {
                    block37: {
                        block45: {
                            block36: {
                                block43: {
                                    block34: {
                                        block41: {
                                            var3_2 = (JTextComponent)this.getInvoker();
                                            var2_3 = jy_0.G();
                                            var4_4 = var3_2.getSelectedText();
                                            v0 = var1_1.getSource();
                                            v1 = this.o;
                                            if (var2_3 == 0) break block34;
                                            if (v0 != v1) ** GOTO lbl20
                                            break block41;
                                            catch (BadLocationException v2) {
                                                throw UI.a(v2);
                                            }
                                        }
                                        try {
                                            block42: {
                                                var3_2.cut();
                                                if (var2_3 != 0) break block35;
                                                break block42;
                                                catch (BadLocationException v3) {
                                                    throw UI.a(v3);
                                                }
                                            }
                                            v0 = var1_1.getSource();
                                            v1 = this.U;
                                        }
                                        catch (BadLocationException v4) {
                                            throw UI.a(v4);
                                        }
                                    }
                                    if (var2_3 == 0) break block36;
                                    if (v0 != v1) ** GOTO lbl41
                                    break block43;
                                    catch (BadLocationException v5) {
                                        throw UI.a(v5);
                                    }
                                }
                                try {
                                    block44: {
                                        var3_2.copy();
                                        if (var2_3 != 0) break block35;
                                        break block44;
                                        catch (BadLocationException v6) {
                                            throw UI.a(v6);
                                        }
                                    }
                                    v0 = var1_1.getSource();
                                    v1 = this.K;
                                }
                                catch (BadLocationException v7) {
                                    throw UI.a(v7);
                                }
                            }
                            if (var2_3 == 0) break block37;
                            if (v0 != v1) ** GOTO lbl62
                            break block45;
                            catch (BadLocationException v8) {
                                throw UI.a(v8);
                            }
                        }
                        try {
                            block46: {
                                var3_2.paste();
                                if (var2_3 != 0) break block35;
                                break block46;
                                catch (BadLocationException v9) {
                                    throw UI.a(v9);
                                }
                            }
                            v0 = var1_1.getSource();
                            v1 = this.P;
                        }
                        catch (BadLocationException v10) {
                            throw UI.a(v10);
                        }
                    }
                    if (var2_3 == 0) break block38;
                    if (v0 != v1) ** GOTO lbl83
                    break block47;
                    catch (BadLocationException v11) {
                        throw UI.a(v11);
                    }
                }
                try {
                    block48: {
                        var3_2.selectAll();
                        if (var2_3 != 0) break block35;
                        break block48;
                        catch (BadLocationException v12) {
                            throw UI.a(v12);
                        }
                    }
                    v0 = var1_1.getSource();
                    v1 = this.b;
                }
                catch (BadLocationException v13) {
                    throw UI.a(v13);
                }
            }
            if (v0 == v1) {
                var5_5 = var3_2.getDocument();
                var6_6 = var3_2.getSelectionStart();
                var7_7 = var3_2.getSelectionEnd();
                try {
                    block40: {
                        block39: {
                            var8_8 = var5_5.createPosition(var6_6);
                            var9_10 = var5_5.createPosition(var7_7);
                            try {
                                v14 = var8_8;
                                if (var2_3 == 0) break block39;
                                if (v14 == null) break block35;
                            }
                            catch (BadLocationException v15) {
                                throw UI.a(v15);
                            }
                            v14 = var9_10;
                        }
                        try {
                            if (var2_3 == 0) break block40;
                            if (v14 == null) break block35;
                        }
                        catch (BadLocationException v16) {
                            throw UI.a(v16);
                        }
                        v14 = var8_8;
                    }
                    try {
                        if (v14.getOffset() != var9_10.getOffset()) {
                            var5_5.remove(var8_8.getOffset(), var9_10.getOffset() - var8_8.getOffset());
                        }
                    }
                    catch (BadLocationException v17) {
                        throw UI.a(v17);
                    }
                }
                catch (BadLocationException var8_9) {
                    // empty catch block
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var17 = new String[6];
                            var15_1 = 0;
                            var14_2 = "\u7ca0\u8d85\u0002\u5278\u9608\u0002\u594c\u521c\u0010;G\u0017\u00e5K\u00d64\u00b5\u00bfS(\u00b2\u00d8[OH";
                            var16_3 = "\u7ca0\u8d85\u0002\u5278\u9608\u0002\u594c\u521c\u0010;G\u0017\u00e5K\u00d64\u00b5\u00bfS(\u00b2\u00d8[OH".length();
                            var13_4 = 2;
                            var12_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 34;
                                v1 = ++var12_5;
                                v2 = var14_2.substring(v1, v1 + var13_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                var14_2 = "\u511c\u900f\u0002\u52fe\u525b";
                                var16_3 = "\u511c\u900f\u0002\u52fe\u525b".length();
                                var13_4 = 2;
                                var12_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 82;
                                    v5 = ++var12_5;
                                    v2 = var14_2.substring(v5, v5 + var13_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var18_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v15 = 61;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 50;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 14;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 8;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 113;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 44;
                                        break;
                                    }
                                    default: {
                                        v15 = 94;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var18_6;
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
                        } while (v10 > var18_6);
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
                    UI.a = var17;
                    UI.c = new String[6];
                    var4_7 = 3407586523925465768L;
                    var10_8 = new long[5];
                    var7_9 = 0;
                    var8_10 = "\u00ab\u00ef<\u001c\u00f4\u00c3\u00cb\u008e\u001c\u0013\u0017\u00bblY\u009e}k\u0081`Yb\u00bd\u0011r";
                    var9_11 = "\u00ab\u00ef<\u001c\u00f4\u00c3\u00cb\u008e\u001c\u0013\u0017\u00bblY\u009e}k\u0081`Yb\u00bd\u0011r".length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                        v17 = var10_8;
                        v18 = var7_9++;
                        v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl112:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 = "jN/\u00c7\u00c7\u00b3\u00e6\u00cdy\u008e\u00cd\u0099c\u00eb\u0006\u00ab";
                        var9_11 = "jN/\u00c7\u00c7\u00b3\u00e6\u00cdy\u008e\u00cd\u0099c\u00eb\u0006\u00ab".length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                            v17 = var10_8;
                            v18 = var7_9++;
                            v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl125:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var4_7;
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
            UI.d = var10_8;
            UI.e = new Integer[5];
            break block31;
lbl141:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 1890958937393795570L;
        ** while (true)
        UI.serialVersionUID = var0_15 = 1990040959123623740L ^ var2_14;
        UI.V = null;
    }

    private static BadLocationException a(BadLocationException badLocationException) {
        return badLocationException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF060) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 219;
                    break;
                }
                case 1: {
                    n14 = 103;
                    break;
                }
                case 2: {
                    n14 = 35;
                    break;
                }
                case 3: {
                    n14 = 244;
                    break;
                }
                case 4: {
                    n14 = 78;
                    break;
                }
                case 5: {
                    n14 = 110;
                    break;
                }
                case 6: {
                    n14 = 58;
                    break;
                }
                case 7: {
                    n14 = 13;
                    break;
                }
                case 8: {
                    n14 = 80;
                    break;
                }
                case 9: {
                    n14 = 86;
                    break;
                }
                case 10: {
                    n14 = 77;
                    break;
                }
                case 11: {
                    n14 = 247;
                    break;
                }
                case 12: {
                    n14 = 182;
                    break;
                }
                case 13: {
                    n14 = 191;
                    break;
                }
                case 14: {
                    n14 = 170;
                    break;
                }
                case 15: {
                    n14 = 213;
                    break;
                }
                case 16: {
                    n14 = 179;
                    break;
                }
                case 17: {
                    n14 = 69;
                    break;
                }
                case 18: {
                    n14 = 239;
                    break;
                }
                case 19: {
                    n14 = 188;
                    break;
                }
                case 20: {
                    n14 = 125;
                    break;
                }
                case 21: {
                    n14 = 173;
                    break;
                }
                case 22: {
                    n14 = 207;
                    break;
                }
                case 23: {
                    n14 = 227;
                    break;
                }
                case 24: {
                    n14 = 235;
                    break;
                }
                case 25: {
                    n14 = 192;
                    break;
                }
                case 26: {
                    n14 = 30;
                    break;
                }
                case 27: {
                    n14 = 39;
                    break;
                }
                case 28: {
                    n14 = 217;
                    break;
                }
                case 29: {
                    n14 = 232;
                    break;
                }
                case 30: {
                    n14 = 49;
                    break;
                }
                case 31: {
                    n14 = 64;
                    break;
                }
                case 32: {
                    n14 = 156;
                    break;
                }
                case 33: {
                    n14 = 132;
                    break;
                }
                case 34: {
                    n14 = 150;
                    break;
                }
                case 35: {
                    n14 = 18;
                    break;
                }
                case 36: {
                    n14 = 238;
                    break;
                }
                case 37: {
                    n14 = 143;
                    break;
                }
                case 38: {
                    n14 = 122;
                    break;
                }
                case 39: {
                    n14 = 231;
                    break;
                }
                case 40: {
                    n14 = 108;
                    break;
                }
                case 41: {
                    n14 = 128;
                    break;
                }
                case 42: {
                    n14 = 7;
                    break;
                }
                case 43: {
                    n14 = 52;
                    break;
                }
                case 44: {
                    n14 = 178;
                    break;
                }
                case 45: {
                    n14 = 162;
                    break;
                }
                case 46: {
                    n14 = 102;
                    break;
                }
                case 47: {
                    n14 = 127;
                    break;
                }
                case 48: {
                    n14 = 24;
                    break;
                }
                case 49: {
                    n14 = 72;
                    break;
                }
                case 50: {
                    n14 = 176;
                    break;
                }
                case 51: {
                    n14 = 91;
                    break;
                }
                case 52: {
                    n14 = 161;
                    break;
                }
                case 53: {
                    n14 = 85;
                    break;
                }
                case 54: {
                    n14 = 92;
                    break;
                }
                case 55: {
                    n14 = 134;
                    break;
                }
                case 56: {
                    n14 = 44;
                    break;
                }
                case 57: {
                    n14 = 105;
                    break;
                }
                case 58: {
                    n14 = 224;
                    break;
                }
                case 59: {
                    n14 = 37;
                    break;
                }
                case 60: {
                    n14 = 202;
                    break;
                }
                case 61: {
                    n14 = 126;
                    break;
                }
                case 62: {
                    n14 = 149;
                    break;
                }
                case 63: {
                    n14 = 46;
                    break;
                }
                case 64: {
                    n14 = 113;
                    break;
                }
                case 65: {
                    n14 = 172;
                    break;
                }
                case 66: {
                    n14 = 252;
                    break;
                }
                case 67: {
                    n14 = 138;
                    break;
                }
                case 68: {
                    n14 = 38;
                    break;
                }
                case 69: {
                    n14 = 209;
                    break;
                }
                case 70: {
                    n14 = 97;
                    break;
                }
                case 71: {
                    n14 = 76;
                    break;
                }
                case 72: {
                    n14 = 96;
                    break;
                }
                case 73: {
                    n14 = 101;
                    break;
                }
                case 74: {
                    n14 = 16;
                    break;
                }
                case 75: {
                    n14 = 117;
                    break;
                }
                case 76: {
                    n14 = 57;
                    break;
                }
                case 77: {
                    n14 = 237;
                    break;
                }
                case 78: {
                    n14 = 137;
                    break;
                }
                case 79: {
                    n14 = 81;
                    break;
                }
                case 80: {
                    n14 = 250;
                    break;
                }
                case 81: {
                    n14 = 240;
                    break;
                }
                case 82: {
                    n14 = 181;
                    break;
                }
                case 83: {
                    n14 = 99;
                    break;
                }
                case 84: {
                    n14 = 22;
                    break;
                }
                case 85: {
                    n14 = 123;
                    break;
                }
                case 86: {
                    n14 = 163;
                    break;
                }
                case 87: {
                    n14 = 139;
                    break;
                }
                case 88: {
                    n14 = 1;
                    break;
                }
                case 89: {
                    n14 = 12;
                    break;
                }
                case 90: {
                    n14 = 148;
                    break;
                }
                case 91: {
                    n14 = 68;
                    break;
                }
                case 92: {
                    n14 = 83;
                    break;
                }
                case 93: {
                    n14 = 0;
                    break;
                }
                case 94: {
                    n14 = 159;
                    break;
                }
                case 95: {
                    n14 = 26;
                    break;
                }
                case 96: {
                    n14 = 168;
                    break;
                }
                case 97: {
                    n14 = 62;
                    break;
                }
                case 98: {
                    n14 = 40;
                    break;
                }
                case 99: {
                    n14 = 5;
                    break;
                }
                case 100: {
                    n14 = 230;
                    break;
                }
                case 101: {
                    n14 = 15;
                    break;
                }
                case 102: {
                    n14 = 177;
                    break;
                }
                case 103: {
                    n14 = 241;
                    break;
                }
                case 104: {
                    n14 = 73;
                    break;
                }
                case 105: {
                    n14 = 115;
                    break;
                }
                case 106: {
                    n14 = 34;
                    break;
                }
                case 107: {
                    n14 = 2;
                    break;
                }
                case 108: {
                    n14 = 31;
                    break;
                }
                case 109: {
                    n14 = 98;
                    break;
                }
                case 110: {
                    n14 = 195;
                    break;
                }
                case 111: {
                    n14 = 59;
                    break;
                }
                case 112: {
                    n14 = 8;
                    break;
                }
                case 113: {
                    n14 = 114;
                    break;
                }
                case 114: {
                    n14 = 197;
                    break;
                }
                case 115: {
                    n14 = 249;
                    break;
                }
                case 116: {
                    n14 = 216;
                    break;
                }
                case 117: {
                    n14 = 186;
                    break;
                }
                case 118: {
                    n14 = 255;
                    break;
                }
                case 119: {
                    n14 = 74;
                    break;
                }
                case 120: {
                    n14 = 118;
                    break;
                }
                case 121: {
                    n14 = 187;
                    break;
                }
                case 122: {
                    n14 = 131;
                    break;
                }
                case 123: {
                    n14 = 3;
                    break;
                }
                case 124: {
                    n14 = 144;
                    break;
                }
                case 125: {
                    n14 = 71;
                    break;
                }
                case 126: {
                    n14 = 84;
                    break;
                }
                case 127: {
                    n14 = 229;
                    break;
                }
                case 128: {
                    n14 = 220;
                    break;
                }
                case 129: {
                    n14 = 153;
                    break;
                }
                case 130: {
                    n14 = 19;
                    break;
                }
                case 131: {
                    n14 = 95;
                    break;
                }
                case 132: {
                    n14 = 215;
                    break;
                }
                case 133: {
                    n14 = 23;
                    break;
                }
                case 134: {
                    n14 = 9;
                    break;
                }
                case 135: {
                    n14 = 171;
                    break;
                }
                case 136: {
                    n14 = 4;
                    break;
                }
                case 137: {
                    n14 = 79;
                    break;
                }
                case 138: {
                    n14 = 45;
                    break;
                }
                case 139: {
                    n14 = 27;
                    break;
                }
                case 140: {
                    n14 = 194;
                    break;
                }
                case 141: {
                    n14 = 120;
                    break;
                }
                case 142: {
                    n14 = 107;
                    break;
                }
                case 143: {
                    n14 = 48;
                    break;
                }
                case 144: {
                    n14 = 189;
                    break;
                }
                case 145: {
                    n14 = 109;
                    break;
                }
                case 146: {
                    n14 = 20;
                    break;
                }
                case 147: {
                    n14 = 151;
                    break;
                }
                case 148: {
                    n14 = 94;
                    break;
                }
                case 149: {
                    n14 = 147;
                    break;
                }
                case 150: {
                    n14 = 136;
                    break;
                }
                case 151: {
                    n14 = 87;
                    break;
                }
                case 152: {
                    n14 = 206;
                    break;
                }
                case 153: {
                    n14 = 130;
                    break;
                }
                case 154: {
                    n14 = 253;
                    break;
                }
                case 155: {
                    n14 = 226;
                    break;
                }
                case 156: {
                    n14 = 41;
                    break;
                }
                case 157: {
                    n14 = 175;
                    break;
                }
                case 158: {
                    n14 = 236;
                    break;
                }
                case 159: {
                    n14 = 185;
                    break;
                }
                case 160: {
                    n14 = 129;
                    break;
                }
                case 161: {
                    n14 = 248;
                    break;
                }
                case 162: {
                    n14 = 135;
                    break;
                }
                case 163: {
                    n14 = 243;
                    break;
                }
                case 164: {
                    n14 = 201;
                    break;
                }
                case 165: {
                    n14 = 25;
                    break;
                }
                case 166: {
                    n14 = 242;
                    break;
                }
                case 167: {
                    n14 = 210;
                    break;
                }
                case 168: {
                    n14 = 14;
                    break;
                }
                case 169: {
                    n14 = 33;
                    break;
                }
                case 170: {
                    n14 = 89;
                    break;
                }
                case 171: {
                    n14 = 196;
                    break;
                }
                case 172: {
                    n14 = 82;
                    break;
                }
                case 173: {
                    n14 = 183;
                    break;
                }
                case 174: {
                    n14 = 141;
                    break;
                }
                case 175: {
                    n14 = 158;
                    break;
                }
                case 176: {
                    n14 = 60;
                    break;
                }
                case 177: {
                    n14 = 61;
                    break;
                }
                case 178: {
                    n14 = 100;
                    break;
                }
                case 179: {
                    n14 = 198;
                    break;
                }
                case 180: {
                    n14 = 124;
                    break;
                }
                case 181: {
                    n14 = 152;
                    break;
                }
                case 182: {
                    n14 = 251;
                    break;
                }
                case 183: {
                    n14 = 233;
                    break;
                }
                case 184: {
                    n14 = 246;
                    break;
                }
                case 185: {
                    n14 = 21;
                    break;
                }
                case 186: {
                    n14 = 169;
                    break;
                }
                case 187: {
                    n14 = 222;
                    break;
                }
                case 188: {
                    n14 = 43;
                    break;
                }
                case 189: {
                    n14 = 10;
                    break;
                }
                case 190: {
                    n14 = 11;
                    break;
                }
                case 191: {
                    n14 = 193;
                    break;
                }
                case 192: {
                    n14 = 63;
                    break;
                }
                case 193: {
                    n14 = 212;
                    break;
                }
                case 194: {
                    n14 = 200;
                    break;
                }
                case 195: {
                    n14 = 106;
                    break;
                }
                case 196: {
                    n14 = 211;
                    break;
                }
                case 197: {
                    n14 = 199;
                    break;
                }
                case 198: {
                    n14 = 93;
                    break;
                }
                case 199: {
                    n14 = 228;
                    break;
                }
                case 200: {
                    n14 = 50;
                    break;
                }
                case 201: {
                    n14 = 142;
                    break;
                }
                case 202: {
                    n14 = 119;
                    break;
                }
                case 203: {
                    n14 = 214;
                    break;
                }
                case 204: {
                    n14 = 225;
                    break;
                }
                case 205: {
                    n14 = 75;
                    break;
                }
                case 206: {
                    n14 = 54;
                    break;
                }
                case 207: {
                    n14 = 223;
                    break;
                }
                case 208: {
                    n14 = 51;
                    break;
                }
                case 209: {
                    n14 = 203;
                    break;
                }
                case 210: {
                    n14 = 67;
                    break;
                }
                case 211: {
                    n14 = 112;
                    break;
                }
                case 212: {
                    n14 = 36;
                    break;
                }
                case 213: {
                    n14 = 180;
                    break;
                }
                case 214: {
                    n14 = 42;
                    break;
                }
                case 215: {
                    n14 = 133;
                    break;
                }
                case 216: {
                    n14 = 157;
                    break;
                }
                case 217: {
                    n14 = 221;
                    break;
                }
                case 218: {
                    n14 = 90;
                    break;
                }
                case 219: {
                    n14 = 55;
                    break;
                }
                case 220: {
                    n14 = 204;
                    break;
                }
                case 221: {
                    n14 = 154;
                    break;
                }
                case 222: {
                    n14 = 218;
                    break;
                }
                case 223: {
                    n14 = 111;
                    break;
                }
                case 224: {
                    n14 = 234;
                    break;
                }
                case 225: {
                    n14 = 121;
                    break;
                }
                case 226: {
                    n14 = 116;
                    break;
                }
                case 227: {
                    n14 = 165;
                    break;
                }
                case 228: {
                    n14 = 104;
                    break;
                }
                case 229: {
                    n14 = 146;
                    break;
                }
                case 230: {
                    n14 = 140;
                    break;
                }
                case 231: {
                    n14 = 145;
                    break;
                }
                case 232: {
                    n14 = 66;
                    break;
                }
                case 233: {
                    n14 = 65;
                    break;
                }
                case 234: {
                    n14 = 29;
                    break;
                }
                case 235: {
                    n14 = 174;
                    break;
                }
                case 236: {
                    n14 = 190;
                    break;
                }
                case 237: {
                    n14 = 155;
                    break;
                }
                case 238: {
                    n14 = 53;
                    break;
                }
                case 239: {
                    n14 = 254;
                    break;
                }
                case 240: {
                    n14 = 47;
                    break;
                }
                case 241: {
                    n14 = 88;
                    break;
                }
                case 242: {
                    n14 = 167;
                    break;
                }
                case 243: {
                    n14 = 160;
                    break;
                }
                case 244: {
                    n14 = 32;
                    break;
                }
                case 245: {
                    n14 = 166;
                    break;
                }
                case 246: {
                    n14 = 6;
                    break;
                }
                case 247: {
                    n14 = 17;
                    break;
                }
                case 248: {
                    n14 = 70;
                    break;
                }
                case 249: {
                    n14 = 208;
                    break;
                }
                case 250: {
                    n14 = 245;
                    break;
                }
                case 251: {
                    n14 = 28;
                    break;
                }
                case 252: {
                    n14 = 205;
                    break;
                }
                case 253: {
                    n14 = 56;
                    break;
                }
                case 254: {
                    n14 = 184;
                    break;
                }
                default: {
                    n14 = 164;
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
            UI.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x11AF;
        if (e[n11] == null) {
            UI.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

