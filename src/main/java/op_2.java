/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from op
 */
class op_2
implements ActionListener {
    final uq_1 k;

    op_2(uq_1 uq_12) {
        this.k = uq_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.k.v();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

