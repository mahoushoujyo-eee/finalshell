/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.AbstractAction;

/*
 * Renamed from Od
 */
class od_0
extends AbstractAction {
    final U W;

    od_0(U u10, String string) {
        this.W = u10;
        super(string);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.W.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

