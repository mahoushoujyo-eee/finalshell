/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yJ
 */
class yj_1
implements ActionListener {
    final wx_0 W;

    yj_1(wx_0 wx_02) {
        this.W = wx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            yt_1.F.J(new du_1(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

