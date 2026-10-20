/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class DX
implements ActionListener {
    final zU d;

    DX(zU zU2) {
        this.d = zU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.d.e();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

