/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Bt
 */
class bt_0
implements ActionListener {
    final km_2 r;

    bt_0(km_2 km_22) {
        this.r = km_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            try {
                this.r.L(this.r.W, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

