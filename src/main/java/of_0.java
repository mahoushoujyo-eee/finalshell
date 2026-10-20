/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Of
 */
class of_0
implements ActionListener {
    final dr_2 L;

    of_0(dr_2 dr_22) {
        this.L = dr_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.L.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

