/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from us
 */
class us_2
implements ActionListener {
    final vi_0 f;

    us_2(vi_0 vi_02) {
        this.f = vi_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.f.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

