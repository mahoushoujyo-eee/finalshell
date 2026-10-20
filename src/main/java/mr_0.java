/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from mr
 */
class mr_0
implements ActionListener {
    final mi_0 H;

    mr_0(mi_0 mi_02) {
        this.H = mi_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.H.e(null);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

