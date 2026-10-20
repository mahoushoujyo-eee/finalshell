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
 * Renamed from gf
 */
class gf_0
implements ListSelectionListener {
    final zn_0 B;

    gf_0(zn_0 zn_02) {
        this.B = zn_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        block6: {
            Object object;
            int n10;
            block5: {
                int n11 = ((JTable)this.B.t).getSelectedRow();
                int[] nArray = zn_0.g();
                n10 = n11;
                if (nArray != null) break block5;
                if (n10 <= -1) break block6;
                n10 = ((JTable)this.B.t).convertRowIndexToModel(n11);
            }
            int n12 = n10;
            try {
                object = this.B.H.getValueAt(n12, 0);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string = (String)object;
            String string2 = (String)((HashMap)this.B.T).get(string);
            this.B.u = string2;
            try {
                this.B.n();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

