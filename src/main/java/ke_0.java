/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ke
 */
class ke_0
implements ActionListener {
    final fp_2 c;

    ke_0(fp_2 fp_22) {
        this.c = fp_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.c.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

