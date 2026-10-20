/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ne_2;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Dv
 */
public class dv_0
extends ne_2 {
    FK N;
    private static final long a;

    public dv_0() {
        try {
            this.setFont(fx_2.j);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.h(0);
    }

    @Override
    public void setFont(Font font) {
        String[] stringArray = FK.i();
        if (stringArray == null) {
            if (font.getSize() == (int)a) {
                new Exception().printStackTrace();
            }
            super.setFont(font);
        }
    }

    @Override
    public Font getFont() {
        return super.getFont();
    }

    public FK u() {
        return (FK)this.N;
    }

    public void A(FK fK2) {
        this.N = fK2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5245860697566201968L;
        a = 0x6F3D27FDBB9DC87DL ^ l2;
    }
}

