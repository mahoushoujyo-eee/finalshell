/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Uq
 */
class uq_0
implements ActionListener {
    final nj_0 E;

    uq_0(nj_0 nj_02) {
        this.E = nj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.E.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

