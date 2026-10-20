/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JMenuItem;

class LS
implements ActionListener {
    final JMenuItem V;
    final wx_0 M;

    LS(wx_0 wx_02, JMenuItem jMenuItem) {
        this.M = wx_02;
        this.V = jMenuItem;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            yt_1.F.J(new KH(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

