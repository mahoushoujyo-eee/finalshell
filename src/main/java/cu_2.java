/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from cu
 */
class cu_2
implements ActionListener {
    final zs_0 I;

    cu_2(zs_0 zs_02) {
        this.I = zs_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.I.k(this.I.V);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

