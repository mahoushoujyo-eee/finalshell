/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

class nZ
implements Runnable {
    final F_ j;

    nZ(F_ f_2) {
        this.j = f_2;
    }

    @Override
    public void run() {
        dv_0 dv_02;
        try {
            dv_02 = (dv_0)F_.l(this.j);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        dv_02.n().add((Component)((JButton)this.j.hR), 1);
    }
}

