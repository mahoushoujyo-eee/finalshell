/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.A.E;
import com.CI;
import com.FN;
import com.FQ;
import com.H8;
import com.KR;
import com.OB;
import com.O_;
import com.SZ;
import com.TO;
import com.ac_0;
import com.ch_1;
import com.cz_0;
import com.dm_1;
import com.ke_1;
import com.ky_2;
import com.ow_1;
import java.awt.Insets;
import java.awt.Point;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/*
 * Renamed from com.kd
 */
public class kd_2
extends ke_1 {
    public static ImageIcon o;
    public static ImageIcon Y;
    public static ImageIcon t;
    private boolean T = ow_1.E;
    private boolean V;
    private boolean g;
    private int Z;
    private int z;
    private boolean x;
    private int E;
    private boolean B;
    private File J;
    private File S;

    public kd_2() {
        this(cz_0.f());
    }

    public kd_2(String string) {
        this(new File(string));
    }

    public kd_2(File file) {
        this.V = ow_1.c;
        this.g = ow_1.b;
        this.Z = ow_1.G;
        this.z = ow_1.K;
        this.x = ow_1.U;
        this.E = ow_1.x;
        this.B = ow_1.I;
        this.H();
        this.h(file);
    }

    public kd_2(boolean bl) {
        super(bl);
        this.V = ow_1.c;
        this.g = ow_1.b;
        this.Z = ow_1.G;
        this.z = ow_1.K;
        this.x = ow_1.U;
        this.E = ow_1.x;
        this.B = ow_1.I;
        this.H();
        this.h(cz_0.f());
    }

    public kd_2(String string, boolean bl) {
        this(new File(string), bl);
    }

    public kd_2(File file, boolean bl) {
        super(bl);
        String string = ke_1.v();
        this.V = ow_1.c;
        this.g = ow_1.b;
        this.Z = ow_1.G;
        this.z = ow_1.K;
        this.x = ow_1.U;
        this.E = ow_1.x;
        this.B = ow_1.I;
        this.H();
        this.h(file);
        if (ky_2.F() != null) {
            ke_1.O("Ikll7b");
        }
    }

    private void H() {
        this.b(ow_1.d);
    }

    public File K() {
        return this.J;
    }

    public void q(String string) {
        this.h(new File(string));
    }

    public void h(File file) {
        this.J = file.getAbsoluteFile();
        this.u(file);
    }

    public File D() {
        return this.S;
    }

    public void Z(String string) {
        this.u(new File(string));
    }

    public void u(File file) {
        kd_2 kd_22;
        block4: {
            block5: {
                file = file.getAbsoluteFile();
                String string = ke_1.v();
                kd_22 = this;
                if (string != null) break block4;
                if (cz_0.n(kd_22.J, file)) break block5;
                kd_22 = this;
                if (string != null) break block4;
                if (!cz_0.Z(kd_22.J, file)) {
                    this.J = cz_0.x(file);
                }
            }
            this.S = file;
            kd_22 = this;
        }
        kd_22.g();
    }

    public boolean w() {
        return this.T;
    }

    public void c(boolean bl) {
        this.T = bl;
        this.g();
    }

    public boolean p() {
        return this.V;
    }

    public void u(boolean bl) {
        this.V = bl;
        this.g();
    }

    public boolean U() {
        return this.g;
    }

    public void L(boolean bl) {
        this.g = bl;
        this.g();
    }

    public int h() {
        return this.Z;
    }

    public void m(int n10) {
        this.Z = n10;
        this.g();
    }

    public int P() {
        return this.z;
    }

    public void X(int n10) {
        this.z = n10;
    }

    public boolean G() {
        return this.x;
    }

    public void k(boolean bl) {
        this.x = bl;
        this.g();
    }

    public int e() {
        return this.E;
    }

    public void E(int n10) {
        this.E = n10;
    }

    public boolean M() {
        return this.B;
    }

    public void o(boolean bl) {
        this.B = bl;
    }

    private void g() {
        block2: {
            this.U(false);
            this.removeAll();
            File file = this.S;
            String string = ke_1.v();
            while (!cz_0.n(file, this.J)) {
                this.Y(file);
                file = file.getParentFile();
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            this.Y(this.J);
            this.U(true);
        }
    }

    /*
     * Exception decompiling
     */
    private void Y(File var1_1) {
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

    private void I(File[] fileArray, KR kR) {
        CI cI;
        E e2;
        block4: {
            Insets insets;
            Point point;
            SZ sZ;
            block3: {
                String string;
                block2: {
                    e2 = new E(FN.L(kR));
                    e2.W(true);
                    e2.setAlwaysOnTop(true);
                    cI = new CI(fileArray);
                    cI.d(true);
                    String string2 = ke_1.v();
                    cI.setSelectedIndex(0);
                    cI.setVisibleRowCount(Math.min(this.E, fileArray.length));
                    cI.setCellRenderer(new OB(this));
                    H8 h82 = new H8(this, cI);
                    cI.addMouseListener(h82);
                    cI.addKeyListener(new dm_1(this, kR));
                    sZ = new SZ(cI);
                    sZ.G(0);
                    string = string2;
                    sZ.r(false);
                    e2.add(sZ);
                    e2.applyComponentOrientation(this.getComponentOrientation());
                    e2.pack();
                    point = kR.getLocationOnScreen();
                    insets = cI.f().getBorder().getBorderInsets(cI);
                    if (string != null) break block2;
                    if (!this.getComponentOrientation().isLeftToRight()) break block3;
                    e2.setLocation(point.x + kR.getInsets().left - sZ.getInsets().left - insets.left, point.y + kR.getHeight() + 2);
                }
                if (string == null) break block4;
            }
            e2.setLocation(point.x + kR.getWidth() - kR.getInsets().right - sZ.getWidth() + sZ.getInsets().right + insets.right, point.y + kR.getHeight() + 2);
        }
        e2.setVisible(true);
        cI.requestFocusInWindow();
    }

    private void T(File file, JComponent jComponent, boolean bl) {
        block6: {
            boolean bl2;
            ky_2 ky_22;
            block5: {
                ky_22 = new ky_2(new TO(4, 4));
                String string = ke_1.v();
                ky_22.setOpaque(false);
                bl2 = bl;
                if (string != null) break block5;
                if (bl2) {
                    ky_22.add(new O_(cz_0.X(file), cz_0.B(file)));
                    ky_22.add(new ch_1(false, 0, true));
                }
                ky_22.add(new O_(cz_0.T(file), o));
                if (string != null) break block6;
                bl2 = cz_0.V(file);
            }
            if (bl2) {
                ky_22.add(new O_(cz_0.F(file), Y));
                ky_22.add(new O_(cz_0.n(file), t));
            }
            ac_0.k(jComponent, ky_22);
            jComponent.addAncestorListener(new FQ(this, jComponent));
        }
    }

    static void I(kd_2 kd_22, File[] fileArray, KR kR) {
        kd_22.I(fileArray, kR);
    }

    static int L(kd_2 kd_22) {
        return kd_22.z;
    }

    static boolean M(kd_2 kd_22) {
        return kd_22.B;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "&`x\u0006wNI&orGp\u0018_*-g\u0006c\u0013&`x\u0006wNI&orG`\u0000[*-g\u0006c\u0013&`x\u0006wNI&orGw\bU*-g\u0006c";
            var5_3 = "&`x\u0006wNI&orGp\u0018_*-g\u0006c\u0013&`x\u0006wNI&orG`\u0000[*-g\u0006c\u0013&`x\u0006wNI&orGw\bU*-g\u0006c".length();
            var2_4 = 19;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 122;
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
                            v11 = 53;
                            break;
                        }
                        case 1: {
                            v11 = 121;
                            break;
                        }
                        case 2: {
                            v11 = 109;
                            break;
                        }
                        case 3: {
                            v11 = 18;
                            break;
                        }
                        case 4: {
                            v11 = 126;
                            break;
                        }
                        case 5: {
                            v11 = 27;
                            break;
                        }
                        default: {
                            v11 = 85;
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
        kd_2.o = new ImageIcon(kd_2.class.getResource(var0[0]));
        kd_2.Y = new ImageIcon(kd_2.class.getResource(var0[1]));
        kd_2.t = new ImageIcon(kd_2.class.getResource(var0[2]));
    }
}

