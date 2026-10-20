/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Renamed from gt
 */
public class gt_0
implements di_2 {
    @Override
    public void O(DataInputStream dataInputStream, DataOutputStream dataOutputStream, String string, String string2) throws IOException {
        dataOutputStream.writeInt(string.getBytes().length);
        dataOutputStream.write(string.getBytes());
        dataOutputStream.writeInt(string2.getBytes().length);
        dataOutputStream.write(string2.getBytes());
    }
}

