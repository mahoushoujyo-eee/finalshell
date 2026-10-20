/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;

class gU
implements Runnable {
    final String y;
    final F5 q;

    gU(F5 f52, String string) {
        this.q = f52;
        this.y = string;
    }

    @Override
    public void run() {
        try {
            String string;
            InetAddress inetAddress = InetAddress.getByName((String)this.y);
            try {
                this.q.L.z(inetAddress.getHostAddress());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                string = (String)lk_0.G(inetAddress.getHostAddress());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string2 = string;
            try {
                this.q.L.g(string2);
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

