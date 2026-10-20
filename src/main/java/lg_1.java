/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lG
 */
class lg_1
implements ActionListener {
    final m4 g;

    lg_1(m4 m42) {
        this.g = m42;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.g.o.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

