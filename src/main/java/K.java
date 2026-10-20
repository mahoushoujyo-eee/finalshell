/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class K
implements ActionListener {
    final CW c;

    K(CW cW) {
        this.c = cW;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.c.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

