/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import com.oe_0;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableModel;

/*
 * Renamed from Bx
 */
class bx_0
extends oe_0 {
    Color t;
    Border y;
    JLabel z;
    final n_0 A;
    final JR d;

    bx_0(JR jR, n_0 n_02) {
        this.d = jR;
        this.A = n_02;
        this.t = Color.white;
        this.y = BorderFactory.createEmptyBorder(0, 3, 0, 0);
        this.z = new up_0(this);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n10, int n11) {
        block12: {
            block14: {
                int n12;
                int n13;
                ky_2[] ky_2Array;
                block13: {
                    int n14;
                    block9: {
                        int n15;
                        block10: {
                            block11: {
                                int n16;
                                block8: {
                                    String string;
                                    TableModel tableModel;
                                    block7: {
                                        ky_2[] ky_2Array2 = ka_1.y();
                                        ((JLabel)this.z).setOpaque(true);
                                        ky_2Array = ky_2Array2;
                                        ((JLabel)this.z).setIcon(null);
                                        ((JLabel)this.z).setForeground(Color.white);
                                        ((JLabel)this.z).setBorder((Border)this.y);
                                        n14 = jTable.convertColumnIndexToModel(n11);
                                        tableModel = jTable.getModel();
                                        if (ky_2Array != null) break block7;
                                        if (tableModel == null) break block8;
                                        tableModel = jTable.getModel();
                                    }
                                    k4_0 k4_02 = (k4_0)tableModel;
                                    try {
                                        string = (String)k4_02.c(n14);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    ((JLabel)this.z).setText(string);
                                }
                                try {
                                    n16 = (Integer)this.A.R();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                n13 = n15 = n16;
                                n12 = n_0.I;
                                if (ky_2Array != null) break block9;
                                if (n13 != n12) break block10;
                                if (n14 != 0) break block11;
                                ((JLabel)this.z).setBackground((Color)this.d.k);
                                if (ky_2Array == null) break block12;
                            }
                            ((JLabel)this.z).setBackground((Color)this.d.i);
                            if (ky_2Array == null) break block12;
                        }
                        n13 = n15;
                        n12 = n_0.d;
                    }
                    if (ky_2Array != null) break block13;
                    if (n13 != n12) break block12;
                    n13 = n14;
                    n12 = 1;
                }
                if (n13 != n12) break block14;
                ((JLabel)this.z).setBackground((Color)this.d.k);
                if (ky_2Array == null) break block12;
            }
            ((JLabel)this.z).setBackground((Color)this.d.i);
        }
        this.t = ((JLabel)this.z).getBackground();
        return (JLabel)this.z;
    }
}

