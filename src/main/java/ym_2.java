/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from ym
 */
public class ym_2 {
    public static int i(DatagramPacket datagramPacket) {
        short s2 = nb_0.Q(datagramPacket.getData(), 0);
        return s2;
    }

    public static int y(DatagramPacket datagramPacket) {
        short s2 = nb_0.Q(datagramPacket.getData(), 2);
        return s2;
    }
}

