/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JSplitPane;

public class aE
extends JSplitPane {
    boolean N;
    int s;

    public aE(int n10) {
        super(n10);
        this.N = false;
    }

    @Override
    public int getDividerLocation() {
        int n10 = super.getDividerLocation();
        if (this.N) {
            // empty if block
        }
        return n10;
    }

    public boolean b() {
        return this.N;
    }

    public void B(boolean bl) {
        int n10;
        try {
            n10 = (Integer)this.getDividerLocation();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.s = n10;
        this.N = bl;
    }
}

