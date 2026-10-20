/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Os
 */
class os_0
implements ActionListener {
    final Y_ x;

    os_0(Y_ y_) {
        this.x = y_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ln_1 ln_12;
        try {
            ln_12 = (ln_1)this.x.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ln_1 ln_13 = ln_12;
        if (ln_13 != null) {
            try {
                this.x.e(ln_13);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

