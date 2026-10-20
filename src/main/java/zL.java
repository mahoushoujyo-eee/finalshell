/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class zL
implements ActionListener {
    final aM X;
    final t3_0 n;
    final xT I;

    zL(xT xT2, aM aM2, t3_0 t3_02) {
        this.I = xT2;
        this.X = aM2;
        this.n = t3_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.X.N(this.n);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

