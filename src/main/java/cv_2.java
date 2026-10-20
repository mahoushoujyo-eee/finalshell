/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

/*
 * Renamed from cv
 */
class cv_2
implements ActionListener {
    final CV A;

    cv_2(CV cV) {
        this.A = cV;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10 = ((JTable)this.A.Y).getSelectedRow();
        int n11 = ((JTable)this.A.Y).convertRowIndexToModel(n10);
        String string = (String)((JTable)this.A.Y).getModel().getValueAt(n11, 1);
        try {
            lk_0.u(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

