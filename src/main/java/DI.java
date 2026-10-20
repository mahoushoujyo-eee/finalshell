/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

class DI
implements ActionListener {
    final u6_0 r;
    final JMenuItem Y;
    final tg_0 P;

    DI(tg_0 tg_02, u6_0 u6_02, JMenuItem jMenuItem) {
        this.P = tg_02;
        this.r = u6_02;
        this.Y = jMenuItem;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        try {
            this.r.i(((JMenuItem)this.Y).isSelected());
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
    }
}

