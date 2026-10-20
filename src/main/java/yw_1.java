/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yW
 */
class yw_1
implements ActionListener {
    final km_2 K;

    yw_1(km_2 km_22) {
        this.K = km_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            try {
                this.K.L(this.K.W, true);
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

