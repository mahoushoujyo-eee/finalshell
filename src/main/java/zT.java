/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class zT
implements xz_0 {
    String Z;
    String u;
    byte[] l;

    public zT(String string, String string2) {
        this.Z = string;
        this.u = string2;
        this.V();
    }

    public String h() {
        return this.Z;
    }

    public String P() {
        return this.u;
    }

    @Override
    public Object[] J(int n10, Socket socket) throws IOException {
        int n11;
        OutputStream outputStream;
        InputStream inputStream;
        block13: {
            block14: {
                int n12;
                String[] stringArray;
                block11: {
                    block12: {
                        stringArray = jk_0.Y();
                        try {
                            if (n10 != 2) {
                                return null;
                            }
                        }
                        catch (IOException iOException) {
                            throw zT.a(iOException);
                        }
                        inputStream = socket.getInputStream();
                        outputStream = socket.getOutputStream();
                        outputStream.write(this.l);
                        int n13 = inputStream.read();
                        try {
                            try {
                                n12 = n13;
                                if (stringArray == null) break block11;
                                if (n12 >= 0) break block12;
                            }
                            catch (IOException iOException) {
                                throw zT.a(iOException);
                            }
                            return null;
                        }
                        catch (IOException iOException) {
                            throw zT.a(iOException);
                        }
                    }
                    n12 = inputStream.read();
                }
                int n14 = n12;
                try {
                    try {
                        n11 = n14;
                        if (stringArray == null) break block13;
                        if (n11 == 0) break block14;
                    }
                    catch (IOException iOException) {
                        throw zT.a(iOException);
                    }
                    return null;
                }
                catch (IOException iOException) {
                    throw zT.a(iOException);
                }
            }
            n11 = 2;
        }
        Object[] objectArray = new Object[n11];
        objectArray[0] = inputStream;
        objectArray[1] = outputStream;
        return objectArray;
    }

    private void V() {
        byte[] byArray = this.Z.getBytes();
        byte[] byArray2 = this.u.getBytes();
        this.l = new byte[3 + byArray.length + byArray2.length];
        this.l[0] = 1;
        this.l[1] = (byte)byArray.length;
        System.arraycopy(byArray, 0, this.l, 2, byArray.length);
        this.l[2 + byArray.length] = (byte)byArray2.length;
        System.arraycopy(byArray2, 0, this.l, 3 + byArray.length, byArray2.length);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

