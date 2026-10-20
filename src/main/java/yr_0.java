/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Yr
 */
class yr_0
implements ActionListener {
    final nj_0 s;

    yr_0(nj_0 nj_02) {
        this.s = nj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

