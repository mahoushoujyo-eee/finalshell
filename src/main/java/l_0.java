/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from l
 */
class l_0
implements ActionListener {
    final F6 j;

    l_0(F6 f62) {
        this.j = f62;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.j.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

