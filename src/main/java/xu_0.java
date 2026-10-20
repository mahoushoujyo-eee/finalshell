/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Renamed from xu
 */
class xu_0
implements Runnable {
    final li_0 v;
    private static final long a;

    xu_0(li_0 li_02) {
        this.v = li_02;
    }

    @Override
    public void run() {
        try {
            Socket socket = new Socket(this.v.l, (int)a);
            socket.close();
        }
        catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8490971560785463072L;
        a = 0x55C7485BBE8FC770L ^ l2;
    }
}

