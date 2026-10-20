/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Kc
 */
class kc_0
implements ActionListener {
    final aM H;
    final xT F;

    kc_0(xT xT2, aM aM2) {
        this.F = xT2;
        this.H = aM2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.H.n(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

