/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import org.fife.rsta.ui.search.SearchEvent;

/*
 * Renamed from fc
 */
class fc_2 {
    static final int[] f = new int[SearchEvent.Type.values().length];

    static {
        try {
            ((int[])c.c((long)145952206637596212L).get(null))[SearchEvent.Type.MARK_ALL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ((int[])c.c((long)145952206637596212L).get(null))[SearchEvent.Type.FIND.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ((int[])c.c((long)145952206637596212L).get(null))[SearchEvent.Type.REPLACE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ((int[])c.c((long)145952206637596212L).get(null))[SearchEvent.Type.REPLACE_ALL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

