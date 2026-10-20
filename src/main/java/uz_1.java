/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uZ
 */
class uz_1
implements ActionListener {
    final yb_1 p;

    uz_1(yb_1 yb_12) {
        this.p = yb_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.p.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

