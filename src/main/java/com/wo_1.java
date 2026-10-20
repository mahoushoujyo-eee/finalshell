/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.DD;
import com.HW;
import com.K3;
import com.X5;
import com.ax_0;
import com.el_2;
import com.ky_2;
import com.nv_1;
import com.wz_0;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

/*
 * Renamed from com.wO
 */
public abstract class wo_1
implements K3 {
    protected int f = -1;
    protected Object b;
    protected Component d;
    protected ComponentAdapter j;
    protected MouseAdapter Y = null;
    protected int R = (int)a;
    protected KeyAdapter Q = null;
    private static int k;
    private static final long a;

    @Override
    public void V(JList jList) {
        this.j = new nv_1(this, jList);
        jList.addComponentListener(this.j);
        this.W(jList);
    }

    protected void W(JList jList) {
        int n10 = wo_1.f();
        this.Y = new DD(this, jList);
        jList.addMouseListener(this.Y);
        int n11 = n10;
        this.Q = new HW(this, jList);
        jList.addKeyListener(this.Q);
        if (n11 != 0) {
            ky_2.K(new String[4]);
        }
    }

    @Override
    public void S(JList jList) {
        jList.removeComponentListener(this.j);
        this.H(jList);
    }

    protected void H(JList jList) {
        int n10 = wo_1.f();
        wo_1 wo_12 = this;
        if (n10 == 0) {
            if (wo_12.Y != null) {
                jList.removeMouseListener(this.Y);
            }
            wo_12 = this;
        }
        if (wo_12.Q != null) {
            jList.removeKeyListener(this.Q);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean T(JList jList, int n10, Object object) {
        int n11 = wo_1.H();
        boolean bl = jList instanceof CI;
        if (n11 == 0) return bl;
        if (bl) {
            boolean bl2 = ((CI)jList).z();
            if (n11 != 0) {
                if (!bl2) return false;
                bl2 = jList.isEnabled();
            }
            if (n11 == 0) return bl2;
            if (!bl2) return false;
            return true;
        }
        bl = jList.isEnabled();
        return bl;
    }

    @Override
    public Component I(JList jList, int n10, Object object) {
        this.d = this.j(jList, n10, object);
        this.b(jList, n10, object);
        return this.d;
    }

    protected abstract Component j(JList var1, int var2, Object var3);

    protected void b(JList jList, int n10, Object object) {
        el_2 el_22 = new el_2(this, jList);
        int n11 = wo_1.f();
        this.d.addFocusListener(el_22);
        int n12 = n11;
        this.d.addKeyListener(new X5(this, el_22, jList));
        if (ky_2.F() != null) {
            wo_1.S(++n12);
        }
    }

    @Override
    public void N(JList jList, int n10) {
        wo_1 wo_12;
        block8: {
            int n11;
            block7: {
                int n12 = wo_1.f();
                n11 = n10;
                if (n12 == 0) {
                    if (n11 == -1) {
                        return;
                    }
                    this.b = jList.getModel().getElementAt(n10);
                    n11 = this.T(jList, n10, this.b) ? 1 : 0;
                }
                if (n12 != 0) break block7;
                if (n11 == 0) {
                    this.b = null;
                    return;
                }
                this.d = this.I(jList, n10, this.b);
                this.d.setBounds(this.n(jList, n10, this.b));
                this.d(jList);
                wo_12 = this;
                if (n12 != 0) break block8;
                n11 = wo_12.d.isFocusable() ? 1 : 0;
            }
            if (n11 != 0) {
                this.d.requestFocusInWindow();
            }
            wo_12 = this;
        }
        wo_12.n(jList, n10);
    }

    @Override
    public void w(JList jList) {
        this.k(jList);
        this.X(jList, this.f);
    }

    @Override
    public boolean C(JList jList) {
        block8: {
            JList jList2;
            wo_1 wo_12;
            block6: {
                block7: {
                    int n10;
                    block5: {
                        boolean bl;
                        block4: {
                            n10 = wo_1.f();
                            bl = this.D();
                            if (n10 != 0) break block4;
                            if (bl) break block5;
                            bl = false;
                        }
                        return bl;
                    }
                    int[] nArray = jList.getSelectedIndices();
                    Object object = this.E(jList, this.f, this.b);
                    boolean bl = this.U(jList, this.f, this.b, object, true);
                    wo_12 = this;
                    jList2 = jList;
                    if (n10 != 0) break block6;
                    wo_12.k(jList2);
                    if (!bl) break block7;
                    jList.setSelectedIndices(nArray);
                    this.q(jList, this.f, this.b, object);
                    if (n10 == 0) break block8;
                }
                wo_12 = this;
                jList2 = jList;
            }
            wo_12.X(jList2, this.f);
        }
        return true;
    }

    protected void d(JList jList) {
        jList.add(this.d);
        jList.revalidate();
        jList.repaint();
    }

    protected void k(JList jList) {
        jList.remove(this.d);
        jList.revalidate();
        jList.repaint();
    }

    protected Rectangle O(JList jList, int n10, Object object, Rectangle rectangle) {
        return new Rectangle(0, 0, rectangle.width, rectangle.height);
    }

    protected Rectangle n(JList jList, int n10, Object object) {
        block3: {
            Rectangle rectangle;
            Rectangle rectangle2;
            block2: {
                rectangle2 = jList.getCellBounds(n10, n10);
                int n11 = wo_1.f();
                rectangle = rectangle2;
                if (n11 != 0) break block2;
                if (rectangle == null) break block3;
                rectangle = this.O(jList, n10, object, rectangle2);
            }
            Rectangle rectangle3 = rectangle;
            return new Rectangle(rectangle2.x + rectangle3.x, rectangle2.y + rectangle3.y, rectangle3.width, rectangle3.height);
        }
        return null;
    }

    @Override
    public boolean U(JList jList, int n10, Object object, Object object2, boolean bl) {
        int n11;
        block14: {
            boolean bl2;
            block13: {
                n11 = wo_1.f();
                bl2 = ax_0.Z(object, new Object[]{object2});
                if (n11 != 0) break block13;
                if (!bl2) break block14;
                bl2 = false;
            }
            return bl2;
        }
        ListModel listModel = jList.getModel();
        boolean bl3 = listModel instanceof DefaultListModel;
        if (n11 == 0) {
            if (bl3) {
                DefaultListModel defaultListModel = (DefaultListModel)listModel;
                defaultListModel.setElementAt(object2, n10);
                return true;
            }
            bl3 = listModel instanceof AbstractListModel;
        }
        if (n11 == 0) {
            if (bl3) {
                int n12;
                block12: {
                    Object[] objectArray = new Object[listModel.getSize()];
                    for (int i2 = 0; i2 < listModel.getSize(); ++i2) {
                        n12 = this.f;
                        if (n11 == 0) {
                            if (n12 != i2) {
                                objectArray[i2] = listModel.getElementAt(i2);
                                if (n11 == 0) continue;
                            }
                            objectArray[i2] = object2;
                            if (n11 == 0) continue;
                        }
                        break block12;
                    }
                    jList.setModel(new wz_0(this, objectArray));
                    n12 = 1;
                }
                return n12 != 0;
            }
            bl3 = false;
        }
        return bl3;
    }

    @Override
    public void n(JList jList, int n10) {
        block3: {
            JList jList2;
            block2: {
                this.f = n10;
                int n11 = wo_1.f();
                jList2 = jList;
                if (n11 != 0) break block2;
                if (!(jList2 instanceof CI)) break block3;
                jList2 = jList;
            }
            ((CI)jList2).D(n10);
        }
    }

    @Override
    public void q(JList jList, int n10, Object object, Object object2) {
        block3: {
            JList jList2;
            block2: {
                this.f = -1;
                int n11 = wo_1.H();
                jList2 = jList;
                if (n11 == 0) break block2;
                if (!(jList2 instanceof CI)) break block3;
                jList2 = jList;
            }
            ((CI)jList2).h(n10, object, object2);
        }
    }

    @Override
    public void X(JList jList, int n10) {
        block3: {
            JList jList2;
            block2: {
                this.f = -1;
                int n11 = wo_1.H();
                jList2 = jList;
                if (n11 == 0) break block2;
                if (!(jList2 instanceof CI)) break block3;
                jList2 = jList;
            }
            ((CI)jList2).M(n10);
        }
    }

    @Override
    public boolean D() {
        int n10 = wo_1.f();
        boolean bl = this.f;
        if (n10 == 0) {
            bl = !bl;
        }
        return bl;
    }

    public int x() {
        return this.R;
    }

    public void x(int n10) {
        this.R = n10;
    }

    public static void S(int n10) {
        k = n10;
    }

    public static int H() {
        return k;
    }

    public static int f() {
        int n10 = wo_1.H();
        if (n10 == 0) {
            return 49;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (wo_1.H() == 0) {
            wo_1.S(87);
        }
        long l2 = 1741073322583063234L;
        a = 0x143CD6465878FAC0L ^ l2;
    }
}

