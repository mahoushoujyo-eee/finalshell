/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

/*
 * Renamed from u3
 */
class u3_0
implements fb_0 {
    final aW l;

    u3_0(aW aW2) {
        this.l = aW2;
    }

    @Override
    public void O(ty_2 ty_22) {
        int n10;
        try {
            n10 = (Integer)ty_22.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n11 = n10;
        if (n11 == ty_2.Y) {
            String string;
            try {
                string = (String)ty_22.G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((JLabel)this.l.Z).setText(string);
        }
    }
}

