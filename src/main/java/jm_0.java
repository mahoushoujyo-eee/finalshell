/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Socket;

/*
 * Renamed from Jm
 */
class jm_0
extends Thread {
    final bg_0 P;

    jm_0(bg_0 bg_02) {
        this.P = bg_02;
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    Socket socket = this.P.v.accept();
                    this.P.T(socket);
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                continue;
            }
            break;
        }
    }
}

