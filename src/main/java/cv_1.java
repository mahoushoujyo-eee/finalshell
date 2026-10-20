/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from cV
 */
class cv_1
implements ActionListener {
    final F7 G;

    cv_1(F7 f72) {
        this.G = f72;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.G.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

