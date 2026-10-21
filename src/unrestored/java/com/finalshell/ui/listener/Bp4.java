package com.finalshell.ui.listener;

import com.finalshell.core.YT3_2;
import com.finalshell.ui.panel.Ky4;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.HyperlinkEvent.EventType;

public class Bp4 implements HyperlinkListener {
   @Override
   public void hyperlinkUpdate(HyperlinkEvent var1) {
      Ky4[] var10000 = YT3_2.c();
      EventType var3 = var1.getEventType();
      Ky4[] var2 = var10000;
      URL var4 = var1.getURL();

      try {
         if (var2 == null || var3 != EventType.ACTIVATED) {
            return;
         }
      } catch (MalformedURLException var9) {
         throw new RuntimeException(a(var9));
      }

      try {
         Desktop.getDesktop().browse(var4.toURI());
      } catch (MalformedURLException var6) {
         var6.printStackTrace();
      } catch (IOException var7) {
         var7.printStackTrace();
      } catch (URISyntaxException var8) {
         var8.printStackTrace();
      }
   }

   public static MalformedURLException a(MalformedURLException var0) {
      return var0;
   }
}





