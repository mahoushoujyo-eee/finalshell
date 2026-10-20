/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oX
 */
class ox_1
implements ActionListener {
    final fl_2 A;
    final WT k;

    ox_1(WT wT, fl_2 fl_22) {
        this.k = wT;
        this.A = fl_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            yt_1.F.J(new oj_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

