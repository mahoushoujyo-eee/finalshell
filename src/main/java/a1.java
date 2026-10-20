/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Socket;

public class a1
implements xz_0 {
    @Override
    public Object[] J(int n10, Socket socket) throws IOException {
        int n11;
        block4: {
            block5: {
                String[] stringArray = jk_0.Y();
                try {
                    try {
                        n11 = n10;
                        if (stringArray == null) break block4;
                        if (n11 == 0) break block5;
                    }
                    catch (IOException iOException) {
                        throw a1.a(iOException);
                    }
                    return null;
                }
                catch (IOException iOException) {
                    throw a1.a(iOException);
                }
            }
            n11 = 2;
        }
        Object[] objectArray = new Object[n11];
        objectArray[0] = socket.getInputStream();
        objectArray[1] = socket.getOutputStream();
        return objectArray;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

