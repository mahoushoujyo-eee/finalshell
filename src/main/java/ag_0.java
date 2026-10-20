/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ag
 */
class ag_0
implements ActionListener {
    final CW Q;

    ag_0(CW cW) {
        this.Q = cW;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Q.h.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

