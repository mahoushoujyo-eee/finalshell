/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FJ;
import com.KD;
import com.KH;
import com.SL;
import com.W6;
import com.a9;
import com.el_1;
import com.gf_0;
import com.gi_0;
import com.kp_0;
import com.ne_1;
import com.tk_0;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KP
extends KD
implements MouseMotionListener,
MouseListener,
ActionListener,
Serializable {
    protected boolean J = W6.c;
    protected el_1 N = W6.b;
    protected JPopupMenu c = null;
    protected boolean v = false;
    private static final long[] a;
    private static final Integer[] b;

    public KP() {
    }

    public KP(Icon icon) {
        super(icon);
    }

    public KP(String string) {
        super(string);
    }

    public KP(String string, Icon icon) {
        super(string, icon);
    }

    public KP(ActionListener actionListener) {
        super(actionListener);
    }

    public KP(Icon icon, ActionListener actionListener) {
        super(icon, actionListener);
    }

    public KP(String string, ActionListener actionListener) {
        super(string, actionListener);
    }

    public KP(String string, Icon icon, ActionListener actionListener) {
        super(string, icon, actionListener);
    }

    public KP(Action action) {
        super(action);
    }

    @Override
    protected void init(String string, Icon icon) {
        super.init(string, icon);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.addActionListener(this);
    }

    public JPopupMenu r() {
        return this.c;
    }

    public void O(JPopupMenu jPopupMenu) {
        this.c = jPopupMenu;
    }

    public boolean f() {
        return this.J;
    }

    public void M(boolean bl) {
        this.J = bl;
    }

    public el_1 A() {
        return this.N;
    }

    public void B(el_1 el_12) {
        this.N = el_12;
    }

    public ImageIcon t() {
        return this.z().g();
    }

    public void C(ImageIcon imageIcon) {
        this.z().o(imageIcon);
    }

    public int e() {
        return this.z().U();
    }

    public void p(int n10) {
        this.z().g(n10);
    }

    public int D() {
        return this.z().O();
    }

    public void M(int n10) {
        this.z().T(n10);
    }

    public void A(SL sL) {
        this.listenerList.add(SL.class, sL);
    }

    public void g(SL sL) {
        block4: {
            KP kP;
            block3: {
                block2: {
                    boolean bl = tk_0.B();
                    if (sL == null) break block2;
                    kP = this;
                    if (bl) break block3;
                    if (kP.getAction() != sL) break block2;
                    this.setAction(null);
                    if (!bl) break block4;
                }
                kP = this;
            }
            kP.listenerList.remove(SL.class, sL);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            KP kP;
            block7: {
                block8: {
                    boolean bl;
                    boolean bl2;
                    block5: {
                        block6: {
                            KP kP2;
                            block2: {
                                block3: {
                                    bl2 = tk_0.B();
                                    kP2 = this;
                                    if (bl2) break block2;
                                    if (kP2.c != null) break block3;
                                    this.n(actionEvent);
                                    if (!bl2) break block4;
                                }
                                kP2 = this;
                            }
                            bl = kP2.J;
                            if (bl2) break block5;
                            if (!bl) break block6;
                            this.e();
                            this.n(actionEvent);
                            if (!bl2) break block4;
                        }
                        kP = this;
                        if (bl2) break block7;
                        bl = kP.v;
                    }
                    if (!bl) break block8;
                    this.e();
                    this.X(actionEvent);
                    if (!bl2) break block4;
                }
                kP = this;
            }
            kP.n(actionEvent);
        }
    }

    public void e() {
        block7: {
            KP kP;
            block5: {
                block6: {
                    boolean bl;
                    boolean bl2;
                    block4: {
                        bl2 = tk_0.Q();
                        bl = this.c.getUI() instanceof FJ;
                        if (!bl2) break block4;
                        if (bl) {
                            ((FJ)this.c.getUI()).N(this.N);
                        }
                        kP = this;
                        if (!bl2) break block5;
                        bl = kP.getComponentOrientation().isLeftToRight();
                    }
                    if (!bl) break block6;
                    this.c.show(this, 0, this.getHeight());
                    if (bl2) break block7;
                }
                kP = this;
            }
            kP.c.show(this, this.getWidth() - this.c.getPreferredSize().width, this.getHeight());
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        block3: {
            Rectangle rectangle;
            KP kP;
            block2: {
                boolean bl = this.v;
                boolean bl2 = tk_0.B();
                kP = this;
                rectangle = this.z().o(this);
                if (bl2) break block2;
                kP.v = rectangle.contains(mouseEvent.getPoint());
                if (bl == this.v) break block3;
                kP = this;
                rectangle = this.z().D(this);
            }
            kP.repaint(rectangle);
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        block3: {
            KP kP;
            block2: {
                boolean bl = this.v;
                boolean bl2 = tk_0.Q();
                kP = this;
                if (!bl2) break block2;
                kP.v = false;
                if (bl == this.v) break block3;
                kP = this;
            }
            kP.repaint(this.z().D(this));
        }
    }

    protected void n(ActionEvent actionEvent) {
        Object[] objectArray = this.listenerList.getListenerList();
        Object object = null;
        boolean bl = tk_0.B();
        for (int i2 = objectArray.length - 2; i2 >= 0; i2 -= 2) {
            Object object2;
            block3: {
                block4: {
                    String string;
                    block6: {
                        String string2;
                        block5: {
                            if (objectArray[i2] != SL.class) continue;
                            object2 = object;
                            if (bl) break block3;
                            if (object2 != null) break block4;
                            string2 = string = actionEvent.getActionCommand();
                            if (bl) break block5;
                            if (string2 != null) break block6;
                            string2 = this.getActionCommand();
                        }
                        string = string2;
                    }
                    object = new ActionEvent(this, KP.a(26610, 6430039751003275732L), string, actionEvent.getWhen(), actionEvent.getModifiers());
                }
                object2 = objectArray[i2 + 1];
            }
            ((SL)object2).K((ActionEvent)object);
            if (!bl) continue;
        }
    }

    protected void X(ActionEvent actionEvent) {
        Object[] objectArray = this.listenerList.getListenerList();
        boolean bl = tk_0.B();
        Object object = null;
        for (int i2 = objectArray.length - 2; i2 >= 0; i2 -= 2) {
            Object object2;
            block3: {
                block4: {
                    String string;
                    block6: {
                        String string2;
                        block5: {
                            if (objectArray[i2] != SL.class) continue;
                            object2 = object;
                            if (bl) break block3;
                            if (object2 != null) break block4;
                            string2 = string = actionEvent.getActionCommand();
                            if (bl) break block5;
                            if (string2 != null) break block6;
                            string2 = this.getActionCommand();
                        }
                        string = string2;
                    }
                    object = new ActionEvent(this, KP.a(8905, 7117045198216414446L), string, actionEvent.getWhen(), actionEvent.getModifiers());
                }
                object2 = objectArray[i2 + 1];
            }
            ((SL)object2).i((ActionEvent)object);
            if (!bl) continue;
        }
    }

    public gf_0 z() {
        return (gf_0)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block13: {
            block12: {
                block11: {
                    block14: {
                        var1_1 = tk_0.Q();
                        v0 = this;
                        if (!var1_1) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw KP.b(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (!var1_1) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw KP.b(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof gf_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw KP.b(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((gf_0)kp_0.w(a9.zL, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new gf_0());
                        if (var1_1) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw KP.b(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    @Override
    public String getUIClassID() {
        return KH.splitButton.n();
    }

    @Override
    public gi_0 f() {
        return this.z();
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5084559714687166735L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u001c:\u00bc\u00f5{&n\b`\u00a5P\u0086\u00e3\u0001\u00ab2";
        int n11 = "\u001c:\u00bc\u00f5{&n\b`\u00a5P\u0086\u00e3\u0001\u00ab2".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6627;
        if (b[n11] == null) {
            KP.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

