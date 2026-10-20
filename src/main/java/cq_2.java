/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from cq
 */
class cq_2
implements ActionListener {
    final DU v;

    cq_2(DU dU) {
        this.v = dU;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.v.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

