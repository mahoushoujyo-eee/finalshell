/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class FJ
implements ActionListener {
    final U n;

    FJ(U u10) {
        this.n = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((da_1)U.f).setLocationRelativeTo(null);
        try {
            U.f.setVisible(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((da_1)U.f).requestFocus();
    }
}

