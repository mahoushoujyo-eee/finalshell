/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from nu
 */
class nu_0
implements MouseMotionListener {
    final aJ J;
    private static final long a;

    nu_0(aJ aJ2) {
        this.J = aJ2;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        aJ aJ2;
        block27: {
            block28: {
                tv_0 tv_02;
                Object object;
                tv_0 tv_03;
                DefaultMutableTreeNode defaultMutableTreeNode;
                aJ aJ3;
                int n10;
                block32: {
                    int n11;
                    block31: {
                        int n12;
                        String string;
                        block30: {
                            l5_0 l5_02;
                            block29: {
                                string = aA.z();
                                aJ2 = (aJ)this.J;
                                if (string != null) break block27;
                                if ((as_0)aJ2.L == null) break block28;
                                n12 = 0;
                                l5_02 = (l5_0)this.J.k;
                                if (string != null) break block29;
                                if (l5_02 == null) break block30;
                                l5_02 = (l5_0)this.J.k;
                            }
                            n12 = l5_02.isVisible();
                        }
                        int n13 = n12;
                        if (string == null) {
                            if (n13 != 0) {
                                tv_0 tv_04;
                                try {
                                    tv_04 = (tv_0)this.J.L.Y();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                tv_04.setVisible(false);
                                return;
                            }
                            try {
                                n13 = (Integer)this.J.U(mouseEvent.getPoint());
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        n11 = n10 = n13;
                        if (string != null) break block31;
                        if (n11 <= 0) {
                            tv_0 tv_05;
                            try {
                                tv_05 = (tv_0)this.J.L.Y();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            tv_05.setVisible(false);
                            return;
                        }
                        aJ3 = (aJ)this.J.D;
                        if (string != null) break block32;
                        n11 = aJ3.getWidth() - mouseEvent.getX();
                    }
                    if (n11 < 5) {
                        tv_0 tv_06;
                        try {
                            tv_06 = (tv_0)this.J.L.Y();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        tv_06.setVisible(false);
                        return;
                    }
                    aJ3 = (aJ)this.J.D;
                }
                try {
                    defaultMutableTreeNode = (DefaultMutableTreeNode)aJ3.i(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
                Rectangle rectangle = ((aJ)this.J.D).getRowBounds(n10);
                try {
                    tv_03 = (tv_0)this.J.L.Y();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                tv_0 tv_07 = tv_03;
                int n14 = tv_07.getPreferredSize().width;
                int n15 = ((aJ)this.J).getWidth() - n14 + (int)a;
                Rectangle rectangle2 = new Rectangle(n15, rectangle.y + (rectangle.height - tv_07.getPreferredSize().height) / 2, n14, tv_07.getPreferredSize().height);
                try {
                    object = this.J.L.C();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.v((Object)rectangle2, (Object)defaultMutableTreeNode2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    tv_02 = (tv_0)this.J.L.Y();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                tv_02.setVisible(true);
            }
            aJ2 = (aJ)this.J;
        }
        aJ2.g = false;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        this.J.g = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6369184685716270362L;
        a = 0x65233D3DECF9ED12L ^ l2;
    }
}

