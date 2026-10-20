/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from cA
 */
public class ca_1 {
    public static int I(DatagramPacket datagramPacket) {
        short s2 = B8.M(datagramPacket.getData(), 0);
        return s2;
    }

    public static int m(DatagramPacket datagramPacket) {
        short s2 = B8.M(datagramPacket.getData(), 2);
        return s2;
    }
}

