/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Renamed from c5
 */
class c5_0
implements ListSelectionListener {
    final zs_0 N;

    c5_0(zs_0 zs_02) {
        this.N = zs_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        block6: {
            Object object;
            int n10;
            block5: {
                int n11 = ((JTable)this.N.s).getSelectedRow();
                ky_2[] ky_2Array = zM.I();
                n10 = n11;
                if (ky_2Array == null) break block5;
                if (n10 <= -1) break block6;
                n10 = ((JTable)this.N.s).convertRowIndexToModel(n11);
            }
            int n12 = n10;
            try {
                object = this.N.Z.getValueAt(n12, 0);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string = (String)object;
            try {
                this.N.k(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

