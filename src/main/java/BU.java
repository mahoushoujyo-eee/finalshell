/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

class BU
implements ActionListener {
    final JMenuItem Y;
    final nx_0 x;

    BU(nx_0 nx_02, JMenuItem jMenuItem) {
        this.x = nx_02;
        this.Y = jMenuItem;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            yt_1.F.J(new ki_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

