/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TD
extends TN {
    String D;
    String L;

    public TD(String string, String string2) {
        this.n = dq_0.Z;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(this.n);
            dataOutputStream.writeInt(string.getBytes().length);
            dataOutputStream.write(string.getBytes());
            dataOutputStream.writeInt(string2.getBytes().length);
            dataOutputStream.write(string2.getBytes());
            this.u = byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public TD(byte[] byArray) {
        this.n = dq_0.Z;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            this.n = dataInputStream.readShort();
            byte[] byArray2 = new byte[dataInputStream.readInt()];
            dataInputStream.read(byArray2);
            this.L = new String(byArray2);
            byte[] byArray3 = new byte[dataInputStream.readInt()];
            dataInputStream.read(byArray3);
            this.D = new String(byArray3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String x() {
        return this.D;
    }

    public void m(String string) {
        this.D = string;
    }

    public String T() {
        return this.L;
    }

    public void Z(String string) {
        this.L = string;
    }
}

