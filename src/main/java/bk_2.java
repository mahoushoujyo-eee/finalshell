/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bk
 */
class bk_2
implements ActionListener {
    final l5_0 o;

    bk_2(l5_0 l5_02) {
        this.o = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.o.D.Y(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

