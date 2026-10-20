/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fd
 */
class fd_2
implements ActionListener {
    final U O;

    fd_2(U u10) {
        this.O = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.O.v(U.hI);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

