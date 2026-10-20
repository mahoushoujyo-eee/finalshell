/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uL
 */
class ul_1
implements ActionListener {
    final ak_0 b;

    ul_1(ak_0 ak_02) {
        this.b = ak_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            yt_1.F.J(new ok_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

