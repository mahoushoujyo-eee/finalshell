/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

/*
 * Renamed from yn
 */
class yn_2
implements ActionListener {
    final CV e;

    yn_2(CV cV) {
        this.e = cV;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10 = ((JTable)this.e.Y).getSelectedRow();
        int n11 = ((JTable)this.e.Y).convertRowIndexToModel(n10);
        String string = (String)((JTable)this.e.Y).getModel().getValueAt(n11, 0);
        try {
            lk_0.u(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

