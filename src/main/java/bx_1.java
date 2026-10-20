/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bX
 */
class bx_1
implements ActionListener {
    final zw_0 v;

    bx_1(zw_0 zw_02) {
        this.v = zw_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10 = ((nH)this.v.a).getSelectedRow();
        if (n10 > -1) {
            YE yE;
            try {
                yE = (YE)this.v.u.s(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            YE yE2 = yE;
            try {
                this.v.o(yE2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

