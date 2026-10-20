/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBoxMenuItem;

/*
 * Renamed from Lf
 */
class lf_0
implements ActionListener {
    final JCheckBoxMenuItem C;
    final kj_0 L;
    final U J;

    lf_0(U u10, JCheckBoxMenuItem jCheckBoxMenuItem, kj_0 kj_02) {
        this.J = u10;
        this.C = jCheckBoxMenuItem;
        this.L = kj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        Object object2;
        boolean bl = ((JCheckBoxMenuItem)this.C).isSelected();
        try {
            this.L.A(bl);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = this.J.hr.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.A(((JCheckBoxMenuItem)this.C).isSelected());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.J.h(this.J.hr);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

