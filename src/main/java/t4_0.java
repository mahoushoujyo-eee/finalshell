/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from t4
 */
class t4_0
implements ActionListener {
    final zK f;

    t4_0(zK zK2) {
        this.f = zK2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10 = ((LQ)this.f.r).getSelectedRow();
        if (n10 > -1) {
            zG zG2;
            try {
                zG2 = (zG)this.f.Q.q(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            zG zG3 = zG2;
            try {
                this.f.W(zG3);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

