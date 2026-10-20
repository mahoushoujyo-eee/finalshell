/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.HashMap;
import javax.swing.JFrame;

public class OI {
    HashMap b;

    public OI() {
        this.b = new HashMap();
    }

    public void j(String string, JFrame jFrame) {
        ((HashMap)this.b).put(string, jFrame);
    }

    public JFrame c(String string) {
        return (JFrame)((HashMap)this.b).get(string);
    }

    public void N(String string) {
        ((HashMap)this.b).remove(string);
    }

    public boolean H(String string) {
        return ((HashMap)this.b).containsKey(string);
    }
}

