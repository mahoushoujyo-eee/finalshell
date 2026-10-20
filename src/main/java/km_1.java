/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from kM
 */
class km_1
implements ActionListener {
    final on_2 e;

    km_1(on_2 on_22) {
        this.e = on_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.e.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

