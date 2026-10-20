/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.L.m;
import com.WC;
import com.sm_0;
import com.x3_0;
import com.xa_1;
import com.xc_1;
import com.xi_1;
import java.awt.Component;
import java.util.EventObject;
import javax.swing.AbstractButton;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.TableCellEditor;
import javax.swing.tree.TreeCellEditor;

/*
 * Renamed from com.rt
 */
public class rt_2
extends AbstractCellEditor
implements TableCellEditor,
TreeCellEditor {
    protected JComponent G;
    protected xa_1 m;
    protected int B = sm_0.G;
    private static final String a;

    public rt_2() {
    }

    public rt_2(JTextField jTextField) {
        this.i(jTextField);
    }

    public rt_2(JCheckBox jCheckBox) {
        this.i(jCheckBox);
    }

    public rt_2(JComboBox jComboBox) {
        this.i(jComboBox);
    }

    protected void i(JComponent jComponent) {
        block7: {
            JComponent jComponent2;
            JComponent jComponent3;
            int[] nArray;
            block10: {
                boolean bl;
                block8: {
                    block9: {
                        block5: {
                            block6: {
                                this.G = jComponent;
                                nArray = WC.V();
                                bl = jComponent instanceof JTextField;
                                if (nArray != null) break block5;
                                if (!bl) break block6;
                                jComponent3 = (JTextField)jComponent;
                                this.m = new x3_0(this, (JTextField)jComponent3);
                                ((JTextField)jComponent3).addActionListener(this.m);
                                if (nArray == null) break block7;
                            }
                            bl = jComponent instanceof JCheckBox;
                        }
                        if (nArray != null) break block8;
                        if (!bl) break block9;
                        jComponent3 = (JCheckBox)jComponent;
                        this.m = new xi_1(this, (JCheckBox)jComponent3);
                        ((AbstractButton)jComponent3).addActionListener(this.m);
                        jComponent3.setRequestFocusEnabled(false);
                        if (nArray == null) break block7;
                    }
                    jComponent2 = jComponent;
                    if (nArray != null) break block10;
                    bl = jComponent2 instanceof JComboBox;
                }
                if (!bl) break block7;
                jComponent2 = jComponent;
            }
            JComponent jComponent4 = jComponent3 = (JComboBox)jComponent2;
            if (nArray == null) {
                if (((JComboBox)jComponent4).getUI() instanceof m) {
                    m m10 = (m)((JComboBox)jComponent3).getUI();
                    m10.n(false);
                }
                jComponent3.putClientProperty(a, Boolean.TRUE);
                this.m = new xc_1(this, (JComboBox)jComponent3);
                jComponent4 = jComponent3;
            }
            ((JComboBox)jComponent4).addActionListener(this.m);
        }
    }

    public Component l() {
        return this.G;
    }

    public void N(int n10) {
        this.B = n10;
    }

    public int q() {
        return this.B;
    }

    @Override
    public Object getCellEditorValue() {
        return this.m.G();
    }

    @Override
    public boolean isCellEditable(EventObject eventObject) {
        return this.m.T(eventObject);
    }

    @Override
    public boolean shouldSelectCell(EventObject eventObject) {
        return this.m.P(eventObject);
    }

    @Override
    public boolean stopCellEditing() {
        return this.m.p();
    }

    @Override
    public void cancelCellEditing() {
        this.m.a();
    }

    @Override
    public Component getTreeCellEditorComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10) {
        this.m.y(object);
        return this.G;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n10, int n11) {
        this.m.y(object);
        return this.G;
    }

    static void H(rt_2 rt_22) {
        rt_22.fireEditingStopped();
    }

    static void u(rt_2 rt_22) {
        rt_22.fireEditingCanceled();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "b4\u001ds\u001bK,G\u000f\\w\np\u000fJ\u001b\u0017]\u001cH\u0002m\u0013\u001bj\u0016V".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 23;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 63;
                            break;
                        }
                        case 1: {
                            n17 = 96;
                            break;
                        }
                        case 2: {
                            n17 = 101;
                            break;
                        }
                        case 3: {
                            n17 = 9;
                            break;
                        }
                        case 4: {
                            n17 = 110;
                            break;
                        }
                        case 5: {
                            n17 = 51;
                            break;
                        }
                        default: {
                            n17 = 121;
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

