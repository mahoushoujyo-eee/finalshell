/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;

/*
 * Renamed from ct
 */
public class ct_2 {
    public static boolean W(long l2) {
        String string = d5_0.k();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2);
        String string2 = string;
        Calendar calendar2 = Calendar.getInstance();
        boolean bl = false;
        int n10 = calendar2.get(1);
        if (string2 == null) {
            n10 = n10 == calendar.get(1) ? 1 : 0;
        }
        int n11 = calendar2.get(2);
        if (string2 == null) {
            n11 = n11 > calendar.get(2) ? 1 : 0;
        }
        int n12 = n10 & n11;
        int n13 = calendar2.get(1);
        if (string2 == null) {
            n13 = n13 > calendar.get(1) ? 1 : 0;
        }
        boolean bl2 = n12 | n13;
        return bl2;
    }

    public static boolean D(long l2) {
        String string = d5_0.k();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2);
        Calendar calendar2 = Calendar.getInstance();
        boolean bl = false;
        String string2 = string;
        int n10 = calendar2.get(1);
        if (string2 == null) {
            n10 = n10 == calendar.get(1) ? 1 : 0;
        }
        int n11 = calendar2.get(2);
        if (string2 == null) {
            n11 = n11 > calendar.get(2) ? 1 : 0;
        }
        int n12 = n10 & n11;
        int n13 = calendar2.get(1);
        if (string2 == null) {
            n13 = n13 > calendar.get(1) ? 1 : 0;
        }
        boolean bl2 = n12 | n13;
        return bl2;
    }

    public static boolean f(long l2) {
        String string = d5_0.k();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2);
        String string2 = string;
        Calendar calendar2 = Calendar.getInstance();
        boolean bl = false;
        int n10 = calendar2.get(1);
        if (string2 == null) {
            n10 = n10 == calendar.get(1) ? 1 : 0;
        }
        int n11 = calendar2.get(2);
        if (string2 == null) {
            n11 = n11 > calendar.get(2) ? 1 : 0;
        }
        boolean bl2 = n10 & n11;
        return bl2;
    }
}

