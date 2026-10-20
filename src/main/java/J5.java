/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;

class J5
implements Runnable {
    final String Q;
    final F5 c;

    J5(F5 f52, String string) {
        this.c = f52;
        this.Q = string;
    }

    @Override
    public void run() {
        try {
            zh_0 zh_02;
            try {
                zh_02 = (zh_0)lk_0.J(InetAddress.getByName((String)this.Q).getHostAddress());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            zh_0 zh_03 = zh_02;
            try {
                this.c.L.l(zh_03);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
    }
}

