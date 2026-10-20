/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;
import javax.swing.table.TableCellEditor;

class TO
implements MouseListener {
    final boolean D;
    final a3 U;
    final F6 O;
    final km_0 b;
    private static final long a;

    TO(km_0 km_02, boolean bl, a3 a32, F6 f62) {
        this.b = km_02;
        this.D = bl;
        this.U = a32;
        this.O = f62;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            this.b.G = mouseEvent.getLocationOnScreen();
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block76: {
            TableCellEditor tableCellEditor;
            block75: {
                km_0 km_02;
                String string;
                block74: {
                    block73: {
                        long l2;
                        Object object;
                        int n10;
                        int n11;
                        int n12;
                        block70: {
                            block72: {
                                block71: {
                                    Object object2;
                                    block60: {
                                        int n13;
                                        block58: {
                                            block59: {
                                                boolean bl;
                                                block61: {
                                                    block62: {
                                                        block69: {
                                                            Object object3;
                                                            F6 f62;
                                                            tf_2 tf_22;
                                                            block68: {
                                                                block67: {
                                                                    Object object4;
                                                                    block64: {
                                                                        boolean bl2;
                                                                        String string2;
                                                                        block66: {
                                                                            Object object5;
                                                                            TO tO;
                                                                            block65: {
                                                                                boolean bl3;
                                                                                block63: {
                                                                                    Object object6;
                                                                                    int n14;
                                                                                    block57: {
                                                                                        string = km_0.U();
                                                                                        n13 = mouseEvent.getButton();
                                                                                        n14 = 3;
                                                                                        if (string != null) break block57;
                                                                                        if (n13 == n14) {
                                                                                            this.b.n = mouseEvent.getLocationOnScreen();
                                                                                            try {
                                                                                                this.b.L();
                                                                                            }
                                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                                throw invocationTargetException.getTargetException();
                                                                                            }
                                                                                        }
                                                                                        n13 = mouseEvent.getButton();
                                                                                        if (string != null) break block58;
                                                                                        n14 = 1;
                                                                                    }
                                                                                    if (n13 != n14) break block59;
                                                                                    n12 = ((km_0)this.b).rowAtPoint(mouseEvent.getPoint());
                                                                                    if (!((km_0)this.b).isRowSelected(n12)) {
                                                                                        // empty if block
                                                                                    }
                                                                                    n11 = mouseEvent.getClickCount();
                                                                                    n10 = 2;
                                                                                    if (string != null) break block60;
                                                                                    if (n11 != n10) break block59;
                                                                                    try {
                                                                                        object6 = this.b.L(n12);
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    object2 = object6;
                                                                                    bl = object2.getClass().equals(tf_2.class);
                                                                                    if (string != null) break block61;
                                                                                    if (!bl) break block62;
                                                                                    tf_22 = (tf_2)object2;
                                                                                    try {
                                                                                        bl3 = (Boolean)vk_0.g();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    if (string != null) break block63;
                                                                                    if (!bl3) break block64;
                                                                                    tO = this;
                                                                                    if (string != null) break block65;
                                                                                    bl3 = tO.D;
                                                                                }
                                                                                if (bl3) break block66;
                                                                                tO = this;
                                                                            }
                                                                            try {
                                                                                object5 = tf_22.k();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            try {
                                                                                tO.U.j(object5, true, true);
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            if (string == null) break block67;
                                                                        }
                                                                        try {
                                                                            string2 = (String)tf_22.k();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        object = string2;
                                                                        File file = new File((String)object);
                                                                        try {
                                                                            bl2 = (Boolean)lk_0.C(file);
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                        if (!bl2) {
                                                                            Object object7;
                                                                            try {
                                                                                object7 = tf_22.k();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            try {
                                                                                this.U.j(object7, true, true);
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                        }
                                                                        if (string == null) break block67;
                                                                    }
                                                                    try {
                                                                        object4 = tf_22.k();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    try {
                                                                        this.U.j(object4, true, true);
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                }
                                                                f62 = (F6)this.O;
                                                                if (string != null) break block68;
                                                                if (f62 == null) break block69;
                                                                f62 = (F6)this.O;
                                                            }
                                                            try {
                                                                object3 = tf_22.k();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                f62.H(object3, true);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                        }
                                                        if (string == null) break block59;
                                                    }
                                                    bl = object2.getClass().equals(ck_2.class);
                                                }
                                                if (bl) {
                                                    // empty if block
                                                }
                                            }
                                            n13 = ((km_0)this.b).rowAtPoint(mouseEvent.getPoint());
                                        }
                                        n12 = n13;
                                        n11 = mouseEvent.getButton();
                                        n10 = 3;
                                    }
                                    if (string != null) break block70;
                                    if (n11 != n10) break block71;
                                    n11 = ((km_0)this.b).isRowSelected(n12) ? 1 : 0;
                                    if (string == null) {
                                        if (n11 == 0) {
                                            ((km_0)this.b).getSelectionModel().setSelectionInterval(n12, n12);
                                        }
                                        n11 = this.b.E ? 1 : 0;
                                    }
                                    if (string != null) break block72;
                                    if (n11 != 0) {
                                        object2 = new nx_0((km_0)this.b.q, (kl_2)this.b.v, (a3)this.U);
                                        ((JPopupMenu)object2).show((Component)mouseEvent.getSource(), mouseEvent.getX(), mouseEvent.getY());
                                    }
                                }
                                n11 = mouseEvent.getButton();
                            }
                            n10 = 1;
                        }
                        if (n11 != n10 || (l2 = System.currentTimeMillis() - this.b.S) <= a) break block73;
                        object = mouseEvent;
                        int n15 = ((MouseEvent)object).getClickCount();
                        this.b.m = n15;
                        int n16 = ((km_0)this.b).columnAtPoint(((MouseEvent)object).getPoint());
                        km_02 = (km_0)this.b;
                        if (string != null) break block74;
                        int n17 = km_02.convertColumnIndexToModel(n16);
                        if (n17 == 0) {
                            int n18 = n15;
                            int n19 = 1;
                            if (string == null) {
                                if (n18 == n19) {
                                    this.b.b = false;
                                    try {
                                        yt_1.F.J(new o3_0(this, n12, n16));
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                n18 = n15;
                                n19 = 2;
                            }
                            if (n18 == n19) {
                                this.b.b = true;
                            }
                        }
                    }
                    km_02 = (km_0)this.b;
                }
                tableCellEditor = km_02.getCellEditor();
                if (string != null) break block75;
                if (tableCellEditor == null) break block76;
                tableCellEditor = ((km_0)this.b).getCellEditor();
            }
            tableCellEditor.stopCellEditing();
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2165292594098707291L;
        a = 0x1E0CAA2462099B51L ^ l2;
    }
}

