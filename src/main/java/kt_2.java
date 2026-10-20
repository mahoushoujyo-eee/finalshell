/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/*
 * Renamed from kt
 */
class kt_2
implements Runnable {
    final Socket F;
    final wh_0 f;

    kt_2(wh_0 wh_02, Socket socket) {
        this.f = wh_02;
        this.F = socket;
    }

    @Override
    public void run() {
        int n10 = ((ServerSocket)this.f.s).getLocalPort();
        BS bS = (BS)((HashMap)this.f.t.n).get(n10);
        if (bS != null) {
            tb_2 tb_22 = new tb_2((String)dd_1.W, dd_1.E, (String)bS.P, bS.J, null, dd_1.w);
            try {
                tb_22.l(this.F);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

