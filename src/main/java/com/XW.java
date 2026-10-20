/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.WC;
import com._7;
import com.aL;
import com.gw_0;
import com.ky_2;
import com.n6_0;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class XW
extends JComponent
implements ActionListener {
    protected List N;
    protected BufferedImage Z;
    protected BufferedImage X;
    protected List I;
    protected WC R;
    protected boolean u;
    protected boolean O;
    protected n6_0 e;
    private static String[] S;
    private static final String a;

    public XW() {
        this(null, null);
    }

    public XW(BufferedImage bufferedImage) {
        this(bufferedImage, null);
    }

    public XW(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        String[] stringArray = XW.w();
        this.N = new ArrayList(1);
        this.Z = null;
        this.X = null;
        String[] stringArray2 = stringArray;
        this.I = new ArrayList();
        this.R = null;
        this.u = false;
        this.O = false;
        this.e = null;
        this.Z = bufferedImage;
        this.X = bufferedImage2;
        FN.Y(this);
        this.setOpaque(false);
        if (stringArray2 != null) {
            ky_2.K(new String[3]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean C() {
        String[] stringArray = XW.w();
        WC wC = this.R;
        if (stringArray == null) {
            if (wC == null) return false;
            wC = this.R;
        }
        boolean bl = wC.i();
        if (stringArray == null) {
            if (!bl) return false;
            bl = this.u;
        }
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    public boolean l() {
        return this.O;
    }

    public void b(boolean bl) {
        this.O = bl;
    }

    public BufferedImage R() {
        return this.Z;
    }

    public void o(BufferedImage bufferedImage) {
        this.Z = bufferedImage;
    }

    public BufferedImage y() {
        return this.X;
    }

    public void m(BufferedImage bufferedImage) {
        this.X = bufferedImage;
    }

    public List p() {
        return this.I;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public n6_0 E() {
        String[] stringArray = XW.w();
        List list = this.I;
        if (stringArray == null) {
            if (list == null) return null;
            list = this.I;
        }
        if (stringArray == null) {
            if (list.size() <= 0) return null;
            list = this.I.get(0);
        }
        n6_0 n6_02 = (n6_0)((Object)list);
        return n6_02;
    }

    public void C(n6_0 n6_02) {
        String[] stringArray = XW.w();
        List list = this.I;
        if (stringArray == null) {
            if (list == null) {
                this.I = new ArrayList();
            }
            list = this.I;
        }
        list.add(n6_02);
    }

    public void W() {
        block3: {
            List list;
            block2: {
                String[] stringArray = XW.w();
                list = this.I;
                if (stringArray != null) break block2;
                if (list == null) break block3;
                list = this.I;
            }
            list.clear();
            this.I = null;
        }
    }

    public void f(n6_0 n6_02) {
        block3: {
            List list;
            block2: {
                String[] stringArray = XW.w();
                list = this.I;
                if (stringArray != null) break block2;
                if (list == null) break block3;
                list = this.I;
            }
            list.remove(n6_02);
        }
    }

    public void Z(n6_0 n6_02) {
        this.I = n6_02 != null ? aL.e(new n6_0[]{n6_02}) : null;
    }

    public void C(List list) {
        this.I = list;
    }

    /*
     * Unable to fully structure code
     */
    public void W(n6_0[] var1_1) {
        var2_2 = XW.w();
        v0 = var1_1;
        if (var2_2 != null) ** GOTO lbl6
        if (v0 != null) {
            v0 = var1_1;
lbl6:
            // 2 sources

            v1 = aL.e(v0);
        } else {
            v1 = null;
        }
        this.I = v1;
    }

    public void R() {
        block15: {
            BufferedImage bufferedImage;
            block14: {
                XW xW2;
                String[] stringArray;
                block13: {
                    int n10;
                    block12: {
                        block10: {
                            block11: {
                                stringArray = XW.w();
                                xW2 = this;
                                if (stringArray != null) break block10;
                                if (xW2.R == null) break block11;
                                n10 = this.R.i() ? '\u0001' : '\u0000';
                                if (stringArray != null) break block12;
                                if (n10 != 0) {
                                    this.R.Y();
                                    this.R = null;
                                }
                            }
                            xW2 = this;
                        }
                        if (stringArray != null) break block13;
                        n10 = xW2.N.size();
                    }
                    if (n10 > 0) {
                        this.N.clear();
                    }
                    xW2 = this;
                }
                bufferedImage = xW2.Z;
                if (stringArray == null) {
                    if (bufferedImage != null) {
                        this.Z.flush();
                        this.Z = null;
                    }
                    bufferedImage = this.X;
                }
                if (stringArray != null) break block14;
                if (bufferedImage == null) break block15;
                bufferedImage = this.X;
            }
            bufferedImage.flush();
            this.X = null;
        }
    }

    public void X(BufferedImage bufferedImage) {
        block3: {
            XW xW2;
            block2: {
                String[] stringArray = XW.w();
                xW2 = this;
                if (stringArray != null) break block2;
                if (xW2.C()) break block3;
                this.m(bufferedImage);
                xW2 = this;
            }
            xW2.x();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void x() {
        block20: {
            block17: {
                block18: {
                    block19: {
                        block15: {
                            block16: {
                                block13: {
                                    block14: {
                                        block11: {
                                            block12: {
                                                block10: {
                                                    block9: {
                                                        var1_1 = XW.w();
                                                        v0 = this.C();
                                                        if (var1_1 != null) break block9;
                                                        if (v0) break block10;
                                                        v1 = this;
                                                        if (var1_1 != null) break block11;
                                                        v0 = v1.l();
                                                    }
                                                    if (!v0) break block12;
                                                }
                                                return;
                                            }
                                            v1 = this;
                                        }
                                        if (var1_1 != null) break block13;
                                        if (v1.I == null) break block14;
                                        v2 = this.I.size();
                                        if (var1_1 != null) break block15;
                                        if (v2 > 0) break block16;
                                    }
                                    v1 = this;
                                }
                                v1.e = null;
                                if (var1_1 == null) break block17;
                            }
                            v2 = this.I.size();
                        }
                        v3 = 1;
                        if (var1_1 != null) break block18;
                        if (v2 != v3) break block19;
                        this.e = (n6_0)this.I.get(0);
                        if (var1_1 == null) break block17;
                    }
                    v4 = this;
                    if (var1_1 != null) break block20;
                    v2 = v4.I.size();
                    v3 = 1;
                }
                if (v2 > v3) {
                    this.e = (n6_0)this.I.get(gw_0.K(this.I.size()));
                }
            }
            v4 = this;
        }
        v5 = v4.e;
        if (var1_1 != null) ** GOTO lbl48
        if (v5 != null) {
            v5 = this.e;
lbl48:
            // 2 sources

            v6 = v5.y();
        } else {
            v6 = 0L;
        }
        var2_2 = v6;
        this.R = new WC(XW.a, var2_2, (ActionListener)this);
        this.S();
        this.R.u();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            XW xW2;
            block2: {
                block3: {
                    String[] stringArray = XW.w();
                    xW2 = this;
                    if (stringArray != null) break block2;
                    if (xW2.e == null) break block3;
                    xW2 = this;
                    if (stringArray != null) break block2;
                    if (!xW2.e.J(this)) break block4;
                }
                this.R.Y();
                xW2 = this;
            }
            xW2.u();
        }
    }

    public void d() {
        String[] stringArray = XW.w();
        WC wC = this.R;
        if (stringArray == null && wC != null) {
            wC = this.R.Y();
        }
    }

    protected void u() {
        BufferedImage bufferedImage = this.Z;
        this.Z = this.X;
        this.X = bufferedImage;
        this.e = null;
        this.repaint();
        this.r();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        block7: {
            BufferedImage bufferedImage;
            Graphics2D graphics2D;
            block6: {
                XW xW2;
                block4: {
                    block5: {
                        String[] stringArray = XW.w();
                        super.paintComponent(graphics);
                        String[] stringArray2 = stringArray;
                        graphics2D = (Graphics2D)graphics;
                        xW2 = this;
                        if (stringArray2 != null) break block4;
                        if (xW2.e == null) break block5;
                        xW2 = this;
                        if (stringArray2 != null) break block4;
                        if (!xW2.e.X()) break block5;
                        bufferedImage = this.Z;
                        if (stringArray2 != null) break block6;
                        if (bufferedImage == null) break block5;
                        bufferedImage = this.X;
                        if (stringArray2 != null) break block6;
                        if (bufferedImage == null) break block5;
                        this.e.D(graphics2D, this);
                        if (stringArray2 == null) break block7;
                    }
                    xW2 = this;
                }
                bufferedImage = xW2.Z;
            }
            if (bufferedImage != null) {
                graphics2D.drawImage(this.Z, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        String[] stringArray = XW.w();
        BufferedImage bufferedImage = this.Z;
        if (stringArray == null) {
            if (bufferedImage != null) {
                return new Dimension(this.Z.getWidth(), this.Z.getHeight());
            }
            bufferedImage = this.X;
        }
        if (bufferedImage != null) {
            return new Dimension(this.X.getWidth(), this.X.getHeight());
        }
        return new Dimension(0, 0);
    }

    public void s(_7 _72) {
        this.N.add(_72);
    }

    public void Q(_7 _72) {
        this.N.remove(_72);
    }

    public void S() {
        Iterator iterator = aL.J((Collection)this.N).iterator();
        String[] stringArray = XW.w();
        while (iterator.hasNext()) {
            _7 _72 = (_7)iterator.next();
            _72.X();
            if (stringArray == null) continue;
        }
    }

    public void r() {
        Iterator iterator = aL.J((Collection)this.N).iterator();
        String[] stringArray = XW.w();
        while (iterator.hasNext()) {
            _7 _72 = (_7)iterator.next();
            _72.L();
            if (stringArray == null) continue;
        }
    }

    public static void N(String[] stringArray) {
        S = stringArray;
    }

    public static String[] w() {
        return S;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (XW.w() != null) {
                    XW.N(new String[4]);
                }
                char[] cArray3 = "9VK\u000e:\u000f'\u0011UY\u0000+2:\u001e\u0015K\u0007664\u0004TX".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 14;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 126;
                            break;
                        }
                        case 1: {
                            n17 = 53;
                            break;
                        }
                        case 2: {
                            n17 = 36;
                            break;
                        }
                        case 3: {
                            n17 = 103;
                            break;
                        }
                        case 4: {
                            n17 = 81;
                            break;
                        }
                        case 5: {
                            n17 = 85;
                            break;
                        }
                        default: {
                            n17 = 91;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

