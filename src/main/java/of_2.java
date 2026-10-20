/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from of
 */
class of_2
implements ActionListener {
    final WS I;

    of_2(WS wS) {
        this.I = wS;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.I.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

