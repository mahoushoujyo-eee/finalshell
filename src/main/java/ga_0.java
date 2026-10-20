/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;

/*
 * Renamed from ga
 */
class ga_0
implements Runnable {
    final xB K;

    ga_0(xB xB2) {
        this.K = xB2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        while (true) {
            try {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 = ((ServerSocket)this.K.y).accept();
                    try {
                        yt_1.F.J(new lj_1(this, var1_1));
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
                continue;
            }
            {
                ** while (true)
            }
            break;
        }
    }
}

