/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TZ
extends TN {
    boolean x;
    long C;

    public TZ(boolean bl, long l2) {
        this.n = dq_0.d;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(this.n);
            dataOutputStream.writeBoolean(bl);
            dataOutputStream.writeLong(l2);
            this.u = byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public TZ(byte[] byArray) {
        this.n = dq_0.d;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            this.n = dataInputStream.readShort();
            this.x = dataInputStream.readBoolean();
            this.C = dataInputStream.readLong();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean W() {
        return this.x;
    }

    public void B(boolean bl) {
        this.x = bl;
    }

    public long o() {
        return this.C;
    }
}

