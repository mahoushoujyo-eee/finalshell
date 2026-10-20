/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class YY
implements ActionListener {
    final Y_ R;

    YY(Y_ y_) {
        this.R = y_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.R.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

