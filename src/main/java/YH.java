/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class YH
implements ActionListener {
    final ox_2 t;

    YH(ox_2 ox_22) {
        this.t = ox_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.t.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

