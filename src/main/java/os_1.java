/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from oS
 */
class os_1
implements ActionListener {
    final z2 A;

    os_1(z2 z22) {
        this.A = z22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.A.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

