/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class gW
implements ListSelectionListener {
    final FK n;

    gW(FK fK2) {
        this.n = fK2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        block6: {
            Object object;
            int n10;
            block7: {
                int n11;
                int n12;
                block5: {
                    n12 = ((tq_2)this.n.s).getSelectedRow();
                    String[] stringArray = FK.i();
                    n10 = n12;
                    n11 = -1;
                    if (stringArray != null) break block5;
                    if (n10 <= n11) break block6;
                    n10 = ((tq_2)this.n.s).getModel().getRowCount();
                    if (stringArray != null) break block7;
                    n11 = n12;
                }
                if (n10 <= n11) break block6;
                n10 = ((tq_2)this.n.s).convertRowIndexToModel(n12);
            }
            int n13 = n10;
            try {
                object = this.n.H.getValueAt(n13, 0);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            L1 l1 = (L1)object;
            try {
                this.n.r.q();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

