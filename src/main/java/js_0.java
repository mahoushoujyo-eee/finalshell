/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Js
 */
class js_0
implements ActionListener {
    final U r;

    js_0(U u10) {
        this.r = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.r.w();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

