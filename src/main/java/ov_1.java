/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JTable;

/*
 * Renamed from oV
 */
class ov_1
implements ItemListener {
    final JComboBox u;
    final JTable D;
    final int[] Y;

    ov_1(JComboBox jComboBox, JTable jTable, int[] nArray) {
        this.u = jComboBox;
        this.D = jTable;
        this.Y = nArray;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        int n10 = ((JComboBox)this.u).getSelectedIndex();
        ((JTable)this.D).setAutoResizeMode(((int[])this.Y)[n10]);
    }
}

