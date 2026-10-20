/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

/*
 * Renamed from oo
 */
class oo_2
implements fb_0 {
    final DU C;

    oo_2(DU dU) {
        this.C = dU;
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
            String string2;
            try {
                string2 = (String)ty_22.G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string3 = string2;
            try {
                string = (String)ty_22.G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((JLabel)this.C.c).setText(string);
        }
    }
}

