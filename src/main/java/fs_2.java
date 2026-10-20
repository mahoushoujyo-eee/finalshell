/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Renamed from fs
 */
class fs_2
extends Thread {
    final yf_1 n;
    private final ServerSocket V;

    fs_2(yf_1 yf_12, ServerSocket serverSocket) {
        this.n = yf_12;
        this.V = serverSocket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    Socket socket = this.V.accept();
                    this.n.n(socket);
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

