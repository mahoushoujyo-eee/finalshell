/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lW
 */
class lw_1
implements ActionListener {
    final km_2 V;

    lw_1(km_2 km_22) {
        this.V = km_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.V.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

