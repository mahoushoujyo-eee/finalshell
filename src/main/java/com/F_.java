package com;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class F_ extends com.an_2 implements SwingConstants {
   protected final GraphicsDevice u;

   public F_() {
      this(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice());
   }

   public F_(GraphicsDevice var1) {
      this.u = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void w() {
      com.ky_4[] var10000 = com.QQ.N();
      Object var2 = this.B;
      synchronized (this.B){} // $VF: monitorenter 
      com.ky_4[] var1 = var10000;

      try {
         var10000 = this.i;
         if (var1 == null) {
            if (this.i.size() > 0) {
               Rectangle var3;
               label41: {
                  Rectangle var4 = this.u.getDefaultConfiguration().getBounds();
                  if (com.lq_4.l()) {
                     Insets var5 = Toolkit.getDefaultToolkit().getScreenInsets(this.u.getDefaultConfiguration());
                     var3 = new Rectangle(var4.x + var5.left, var4.y + var5.top, var4.width - var5.left - var5.right, var4.height - var5.top - var5.bottom);
                     if (var1 == null) {
                        break label41;
                     }
                  }

                  var3 = var4;
               }

               com.CJ.O(this.i, var3);
            }

            var10000 = (com.ky_4[])var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }
}





