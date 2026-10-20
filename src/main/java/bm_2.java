/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bm
 */
class bm_2
implements ActionListener {
    final yb_1 R;

    bm_2(yb_1 yb_12) {
        this.R = yb_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.R.d.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

