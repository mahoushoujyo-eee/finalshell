/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ua
 */
class ua_0
implements ActionListener {
    final aW V;

    ua_0(aW aW2) {
        this.V = aW2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.V.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

