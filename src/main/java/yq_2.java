/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yq
 */
class yq_2
implements ActionListener {
    final DU H;

    yq_2(DU dU) {
        this.H = dU;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            DU.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

