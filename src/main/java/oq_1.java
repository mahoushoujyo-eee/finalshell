/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/*
 * Renamed from oQ
 */
class oq_1
implements MouseListener {
    long B;
    final nj_0 r;
    final boolean F;
    final aJ L;
    private static final long[] a;
    private static final Long[] b;

    oq_1(aJ aJ2, nj_0 nj_02, boolean bl) {
        this.L = aJ2;
        this.r = nj_02;
        this.F = bl;
        this.B = 0L;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block8: {
            int n10;
            int n11;
            String string;
            block7: {
                string = aA.z();
                int n12 = mouseEvent.getClickCount();
                if (string == null) {
                    n12 = n12 == 2 ? 1 : 0;
                }
                n11 = n12;
                try {
                    n10 = ((Boolean)vk_0.g()).booleanValue();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (string != null) break block7;
                if (n10 == 0) break block8;
                long l2 = System.currentTimeMillis() - this.B - oq_1.a(880, 8800055089297986574L);
                n10 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
            }
            if (string == null) {
                n10 = n10 < 0 ? 1 : 0;
            }
            n11 = n10;
            this.B = System.currentTimeMillis();
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block12: {
            int n10;
            int n11;
            String string;
            block10: {
                block11: {
                    block14: {
                        long l2;
                        long l3;
                        block13: {
                            String string2 = aA.z();
                            int n12 = ((aJ)this.L.D).getRowForLocation(mouseEvent.getX(), mouseEvent.getY());
                            this.L.N = ((aJ)this.L.D).getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                            string = string2;
                            n11 = n12;
                            n10 = -1;
                            if (string != null) break block10;
                            if (n11 == n10) break block11;
                            if (mouseEvent.getClickCount() != 1) break block12;
                            long l4 = System.currentTimeMillis() - this.L.S;
                            long l5 = l4 - oq_1.a(9273, 9088079100375348038L);
                            l3 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                            if (string != null) break block13;
                            if (l3 <= 0) break block14;
                            l3 = ((aJ)this.L.D).getSelectionCount();
                        }
                        if ((l2 = l3) == true) {
                            this.L.g = true;
                        }
                    }
                    if (string == null) break block12;
                }
                n11 = mouseEvent.getButton();
                n10 = 1;
            }
            if (string == null) {
                if (n11 == n10) {
                    ((aJ)this.L).getSelectionModel().clearSelection();
                }
                n11 = mouseEvent.getButton();
                n10 = 3;
            }
            if (n11 == n10) {
                // empty if block
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block58: {
            aJ aJ2;
            block57: {
                int n10;
                block53: {
                    String string;
                    block54: {
                        TreePath treePath;
                        aJ aJ3;
                        block44: {
                            List list;
                            tv_0 tv_02;
                            Object object;
                            Object object2;
                            Serializable serializable;
                            int n11;
                            DefaultMutableTreeNode defaultMutableTreeNode;
                            boolean bl;
                            KQ kQ;
                            block48: {
                                block47: {
                                    int n12;
                                    int n13;
                                    block52: {
                                        block50: {
                                            block51: {
                                                Object object3;
                                                U u10;
                                                block49: {
                                                    TreePath treePath2;
                                                    DefaultMutableTreeNode defaultMutableTreeNode2;
                                                    boolean bl2;
                                                    block46: {
                                                        boolean bl3;
                                                        block45: {
                                                            boolean bl4;
                                                            U u11;
                                                            KQ kQ2;
                                                            try {
                                                                kQ2 = (KQ)this.r.p();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            kQ = kQ2;
                                                            try {
                                                                u11 = (U)kQ.S();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            u10 = u11;
                                                            aJ3 = (aJ)mouseEvent.getSource();
                                                            try {
                                                                bl4 = ((Integer)this.L.U(mouseEvent.getPoint())).intValue();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            bl2 = bl4;
                                                            bl = false;
                                                            string = aA.z();
                                                            bl3 = bl2;
                                                            if (string != null) break block45;
                                                            if (bl3) break block46;
                                                            bl3 = true;
                                                        }
                                                        bl = bl3;
                                                    }
                                                    try {
                                                        defaultMutableTreeNode2 = (DefaultMutableTreeNode)aJ3.i(bl2 ? 1 : 0);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    defaultMutableTreeNode = defaultMutableTreeNode2;
                                                    treePath = null;
                                                    if (bl2 <= -1 != 0) break block47;
                                                    try {
                                                        treePath2 = (TreePath)aJ3.y(defaultMutableTreeNode);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    treePath = treePath2;
                                                    int n11 = mouseEvent.getButton();
                                                    n11 = 1;
                                                    if (string != null) break block48;
                                                    if (n10 != n11) break block47;
                                                    object3 = defaultMutableTreeNode;
                                                    if (string != null) break block49;
                                                    if (object3 == null) break block47;
                                                    object3 = defaultMutableTreeNode.getUserObject();
                                                }
                                                n13 = object3.getClass().equals(ck_2.class);
                                                if (string != null) break block50;
                                                if (n13 == 0) break block51;
                                                serializable = (ck_2)defaultMutableTreeNode.getUserObject();
                                                int n12 = mouseEvent.getClickCount();
                                                n12 = 2;
                                                if (string != null) break block52;
                                                if (n13 == n12) {
                                                    F8 f82;
                                                    Object object4;
                                                    Object object5;
                                                    try {
                                                        object5 = u10.o();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        object4 = object5.Q();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        f82 = (F8)object4.P();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    object2 = f82;
                                                    SwingUtilities.invokeLater(new gO(this, (F8)object2, (ck_2)serializable, u10));
                                                }
                                            }
                                            n13 = mouseEvent.getClickCount();
                                        }
                                        n12 = 1;
                                    }
                                    if (n13 == n12) {
                                        // empty if block
                                    }
                                }
                                n10 = mouseEvent.getButton();
                                if (string != null) break block53;
                                n11 = 3;
                            }
                            if (n10 != n11) break block54;
                            try {
                                object = this.L.p();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                tv_02 = (tv_0)object.Y();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            tv_02.setVisible(false);
                            serializable = defaultMutableTreeNode;
                            if (string == null) {
                                if (serializable == null) {
                                    serializable = (DefaultMutableTreeNode)this.L.p;
                                    bl = true;
                                }
                                this.L.k = new l5_0(aJ3, (DefaultMutableTreeNode)serializable, kQ, bl, this.F);
                                ((l5_0)this.L.k).show((Component)mouseEvent.getSource(), mouseEvent.getX() + 1, mouseEvent.getY() + 1);
                                try {
                                    kQ.r(true);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                ((l5_0)this.L.k).addPopupMenuListener(new tk_1(this, kQ));
                            }
                            try {
                                list = (List)aJ3.B();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            object2 = list;
                            Serializable serializable2 = serializable;
                            int n14 = 0;
                            Iterator iterator = object2.iterator();
                            while (iterator.hasNext()) {
                                block56: {
                                    block55: {
                                        DefaultMutableTreeNode defaultMutableTreeNode3 = (DefaultMutableTreeNode)iterator.next();
                                        n10 = defaultMutableTreeNode3.equals(serializable2) ? 1 : 0;
                                        if (string != null) break block44;
                                        if (string != null) break block55;
                                        if (n10 == 0) break block56;
                                        int n15 = n14 = 1;
                                    }
                                    if (string == null) break;
                                }
                                if (string == null) continue;
                            }
                            n10 = n14;
                        }
                        if (string != null) break block53;
                        if (n10 == 0) {
                            aJ3.setSelectionPath(treePath);
                        }
                    }
                    aJ2 = (aJ)this.L;
                    if (string != null) break block57;
                    n10 = aJ2.g ? 1 : 0;
                }
                if (n10 == 0) break block58;
                aJ2 = (aJ)this.L;
            }
            aJ2.g = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.L.g = false;
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.L.g = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 9201609407459792327L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0001\u00ad\u00f8\u00cay\u000e\u00a6\u0095\u0005\u0092\u00bcz\\\u00f1\u0004\u0015";
        int n11 = "\u0001\u00ad\u00f8\u00cay\u000e\u00a6\u0095\u0005\u0092\u00bcz\\\u00f1\u0004\u0015".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x177F) & Short.MAX_VALUE;
        if (b[n11] == null) {
            oq_1.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

