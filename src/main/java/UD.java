/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

public class UD {
    private static String[] E;

    public UD(DatagramPacket datagramPacket) {
    }

    public void X() {
    }

    public static void W(String[] stringArray) {
        E = stringArray;
    }

    public static String[] L() {
        return E;
    }

    static {
        if (UD.L() == null) {
            UD.W(new String[3]);
        }
    }
}

