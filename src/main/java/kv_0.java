/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Kv
 */
class kv_0
implements ActionListener {
    final l5_0 C;

    kv_0(l5_0 l5_02) {
        this.C = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.C.D.Y(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

