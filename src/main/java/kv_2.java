/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Window;
import javax.swing.JFrame;

/*
 * Renamed from kv
 */
class kv_2
implements Runnable {
    final Window v;

    kv_2(Window window) {
        this.v = window;
    }

    @Override
    public void run() {
        ky_2[] ky_2Array = yt_1.c();
        ((Window)this.v).setVisible(true);
        ky_2[] ky_2Array2 = ky_2Array;
        Window window = (Window)this.v;
        if (ky_2Array2 != null) {
            if (window instanceof JFrame) {
                JFrame jFrame = (JFrame)this.v;
                jFrame.setState(0);
            }
            window = (Window)this.v;
        }
        window.toFront();
    }
}

