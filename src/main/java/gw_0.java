/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Renamed from gw
 */
class gw_0
implements ListSelectionListener {
    final zn_0 e;

    gw_0(zn_0 zn_02) {
        this.e = zn_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        block5: {
            int n10;
            block4: {
                int n11 = ((JTable)this.e.n).getSelectedRow();
                int[] nArray = zn_0.g();
                n10 = n11;
                if (nArray != null) break block4;
                if (n10 <= -1) break block5;
                n10 = ((JTable)this.e.n).convertRowIndexToModel(n11);
            }
            int n12 = n10;
            String string = (String)((JTable)this.e.n).getValueAt(n12, 0);
            String string2 = (String)((HashMap)this.e.T).get(string);
            this.e.o = string2;
            try {
                this.e.n();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

