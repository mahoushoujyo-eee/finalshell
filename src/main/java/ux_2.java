/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ux
 */
class ux_2
implements ActionListener {
    final fl_2 y;
    final WT i;

    ux_2(WT wT, fl_2 fl_22) {
        this.i = wT;
        this.y = fl_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            yt_1.F.J(new F1(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

