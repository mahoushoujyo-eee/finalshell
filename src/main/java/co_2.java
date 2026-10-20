/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from co
 */
class co_2
implements ActionListener {
    final z_ I;

    co_2(z_ z_3) {
        this.I = z_3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10 = ((yy_0)this.I.E).getSelectedRow();
        if (n10 > -1) {
            ld_1 ld_12;
            try {
                ld_12 = (ld_1)this.I.q.p(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ld_1 ld_13 = ld_12;
            try {
                this.I.c(ld_13);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

