/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fq
 */
class fq_2
implements ActionListener {
    final gS l;

    fq_2(gS gS2) {
        this.l = gS2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.l.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

