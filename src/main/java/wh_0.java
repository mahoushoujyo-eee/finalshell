/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;

/*
 * Renamed from Wh
 */
class wh_0
implements Runnable {
    final ServerSocket s;
    final ta_0 t;

    wh_0(ta_0 ta_02, ServerSocket serverSocket) {
        this.t = ta_02;
        this.s = serverSocket;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        try {
            while (true) lbl-1000:
            // 2 sources

            {
                var1_1 = ((ServerSocket)this.s).accept();
                try {
                    yt_1.F.J(new kt_2(this, var1_1));
                    continue;
                }
                catch (InvocationTargetException v0) {
                    throw v0.getTargetException();
                }
                break;
            }
        }
        catch (IOException var1_2) {
            var1_2.printStackTrace();
            return;
        }
        {
            ** while (true)
        }
    }
}

