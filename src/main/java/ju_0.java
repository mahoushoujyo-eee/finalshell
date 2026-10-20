/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ju
 */
class ju_0
implements ActionListener {
    final F7 e;

    ju_0(F7 f72) {
        this.e = f72;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.e.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((F7)this.e).setVisible(false);
    }
}

