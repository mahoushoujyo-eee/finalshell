/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Qo
 */
class qo_0
implements ActionListener {
    final aJ w;
    final nj_0 l;
    final tv_0 u;

    qo_0(tv_0 tv_02, aJ aJ2, nj_0 nj_02) {
        this.u = tv_02;
        this.w = aJ2;
        this.l = nj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        KQ kQ;
        try {
            this.w.A(this.u.T);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            kQ = (KQ)this.l.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        KQ kQ2 = kQ;
        try {
            kQ2.s(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            kQ2.c(this.u.B, this.u.V);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((tv_0)this.u).setVisible(false);
    }
}

