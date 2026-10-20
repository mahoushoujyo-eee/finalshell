/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Wn
 */
class wn_0
implements ActionListener {
    final zs_0 Y;

    wn_0(zs_0 zs_02) {
        this.Y = zs_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Y.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

