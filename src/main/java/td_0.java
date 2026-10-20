/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Td
 */
class td_0
implements ActionListener {
    final yb_1 a;

    td_0(yb_1 yb_12) {
        this.a = yb_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.a.x();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

