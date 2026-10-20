/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/*
 * Renamed from bp
 */
class bp_2
implements HyperlinkListener {
    bp_2() {
    }

    @Override
    public void hyperlinkUpdate(HyperlinkEvent hyperlinkEvent) {
        block6: {
            HyperlinkEvent.EventType eventType = hyperlinkEvent.getEventType();
            ky_2[] ky_2Array = yt_1.c();
            URL uRL = hyperlinkEvent.getURL();
            try {
                if (ky_2Array == null || eventType != HyperlinkEvent.EventType.ACTIVATED) break block6;
            }
            catch (MalformedURLException malformedURLException) {
                throw bp_2.a(malformedURLException);
            }
            try {
                Desktop.getDesktop().browse(uRL.toURI());
            }
            catch (MalformedURLException malformedURLException) {
                malformedURLException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            catch (URISyntaxException uRISyntaxException) {
                uRISyntaxException.printStackTrace();
            }
        }
    }

    private static MalformedURLException a(MalformedURLException malformedURLException) {
        return malformedURLException;
    }
}

