/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yb
 */
class yb_2
implements ActionListener {
    final U k;

    yb_2(U u10) {
        this.k = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.k.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

