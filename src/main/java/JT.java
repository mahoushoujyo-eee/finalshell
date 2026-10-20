/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class JT {
    private static final Map U = new HashMap();

    JT() {
    }

    public ImageIcon P(String string) {
        ImageIcon imageIcon;
        try {
            imageIcon = (ImageIcon)this.l(this.getClass(), (Object)string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return imageIcon;
    }

    public ImageIcon l(Class clazz, String string) {
        String string2 = clazz.getCanonicalName() + ":" + string;
        if (!((Map)JT.U).containsKey(string2)) {
            ((Map)JT.U).put(string2, new ImageIcon(clazz.getResource("/" + string)));
        }
        return (ImageIcon)((Map)JT.U).get(string2);
    }
}

