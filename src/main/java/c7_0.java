/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;

/*
 * Renamed from c7
 */
public class c7_0 {
    /*
     * Loose catch block
     */
    public static void N(Connection connection) {
        block9: {
            String string = d5_0.k();
            try {
                Connection connection2;
                block10: {
                    block8: {
                        try {
                            connection2 = connection;
                            if (string != null) break block8;
                            if (connection2 == null) break block9;
                        }
                        catch (Exception exception) {
                            throw c7_0.a(exception);
                        }
                        connection2 = connection;
                    }
                    if (string != null) break block10;
                    try {
                        block11: {
                            if (connection2.isClosed()) break block9;
                            break block11;
                            catch (Exception exception) {
                                throw c7_0.a(exception);
                            }
                        }
                        connection2 = connection;
                    }
                    catch (Exception exception) {
                        throw c7_0.a(exception);
                    }
                }
                connection2.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

