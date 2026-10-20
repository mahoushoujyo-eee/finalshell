/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * Renamed from ow
 */
public class ow_2 {
    Socket U;
    InputStream j;
    OutputStream s;

    public Socket a() {
        return (Socket)this.U;
    }

    public void S(Socket socket) {
        this.U = socket;
    }

    public InputStream B() {
        return (InputStream)this.j;
    }

    public void R(InputStream inputStream) {
        this.j = inputStream;
    }

    public OutputStream l() {
        return (OutputStream)this.s;
    }

    public void G(OutputStream outputStream) {
        this.s = outputStream;
    }
}

