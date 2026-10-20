/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

class x4
implements ActionListener {
    final u6_0 B;
    final JMenuItem o;
    final tg_0 f;

    x4(tg_0 tg_02, u6_0 u6_02, JMenuItem jMenuItem) {
        this.f = tg_02;
        this.B = u6_02;
        this.o = jMenuItem;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        try {
            this.B.J(((JMenuItem)this.o).isSelected());
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

