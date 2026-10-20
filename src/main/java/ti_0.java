/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from Ti
 */
public class ti_0
extends TN {
    String w;
    String V;

    public ti_0(String string, String string2) {
        this.n = dq_0.M;
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

    public ti_0(byte[] byArray) {
        this.n = dq_0.M;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            this.n = dataInputStream.readShort();
            byte[] byArray2 = new byte[dataInputStream.readInt()];
            dataInputStream.read(byArray2);
            this.V = new String(byArray2);
            byte[] byArray3 = new byte[dataInputStream.readInt()];
            dataInputStream.read(byArray3);
            this.w = new String(byArray3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String X() {
        return this.w;
    }

    public void H(String string) {
        this.w = string;
    }

    public String t() {
        return this.V;
    }

    public void P(String string) {
        this.V = string;
    }
}

