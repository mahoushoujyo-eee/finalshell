/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.mail.Authenticator
 *  javax.mail.PasswordAuthentication
 */
import com.c;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/*
 * Renamed from u2
 */
class u2_0
extends Authenticator {
    final String j;
    final String z;
    final zU Q;

    u2_0(zU zU2, String string, String string2) {
        this.Q = zU2;
        this.j = string;
        this.z = string2;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication((String)(Object)this.j, (String)(Object)this.z);
    }
}

