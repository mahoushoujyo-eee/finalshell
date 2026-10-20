/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;

public class xB {
    ServerSocket y;
    int d;
    String H;
    int x;
    String p;
    int F;
    Object v;
    lv_2 R;
    int g;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    xB(int n10, String string, int n11, String string2, int n12, lv_2 lv_22, int n13) {
        this.v = new Object();
        this.H = string;
        this.x = n11;
        this.p = string2;
        this.F = n12;
        this.d = n10;
        this.R = lv_22;
        this.g = n13;
        try {
            this.y = new ServerSocket(n10);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        try {
            yt_1.F.J(new ga_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object object = this.v;
        synchronized (object) {
            this.v.notifyAll();
        }
    }

    void Y(Socket socket) {
        tb_2 tb_22 = new tb_2((String)this.H, this.x, (String)this.p, this.F, (lv_2)this.R, this.g);
        try {
            tb_22.l(socket);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public int H() {
        return this.d;
    }

    public void X(int n10) {
        this.d = n10;
    }
}

