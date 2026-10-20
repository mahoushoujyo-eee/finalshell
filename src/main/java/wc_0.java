/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Wc
 */
class wc_0
implements ActionListener {
    final F6 n;

    wc_0(F6 f62) {
        this.n = f62;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.n.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

