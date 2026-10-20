/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from Tj
 */
public class tj_0
extends TN {
    boolean e;
    long c;

    public tj_0(boolean bl, long l2) {
        this.n = dq_0.Z;
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

    public tj_0(byte[] byArray) {
        this.n = dq_0.Z;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            this.n = dataInputStream.readShort();
            this.e = dataInputStream.readBoolean();
            this.c = dataInputStream.readLong();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean d() {
        return this.e;
    }

    public void z(boolean bl) {
        this.e = bl;
    }

    public long Q() {
        return this.c;
    }
}

