import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.beans.ConstructorProperties;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

public class VS extends AbstractBorder {
   private static Border n;
   private static Border e;
   protected int m;
   protected Color j;
   protected boolean t;

   public static Border z() {
      String var0 = Km_2.U();
      Border var10000 = (Border)com.c.c(333992247045906415L).get(null);
      if (var0 == null) {
         if (var10000 == null) {
            com.c.c(333992247045906415L).set(null, new VS(Color.black, 1));
         }

         var10000 = (Border)com.c.c(333992247045906415L).get(null);
      }

      return var10000;
   }

   public static Border i() {
      String var0 = Km_2.U();
      Border var10000 = (Border)com.c.c(375346943577876783L).get(null);
      if (var0 == null) {
         if (var10000 == null) {
            com.c.c(375346943577876783L).set(null, new VS(Color.gray, 1));
         }

         var10000 = (Border)com.c.c(375346943577876783L).get(null);
      }

      return var10000;
   }

   public VS(Color var1) {
      this(var1, 1, false);
   }

   public VS(Color var1, int var2) {
      this(var1, var2, false);
   }

   @ConstructorProperties({"lineColor", "thickness", "roundedCorners"})
   public VS(Color var1, int var2, boolean var3) {
      com.c.c(419689797620814599L).set(this, var1);
      com.c.c(176342309188219212L).setInt(this, var2);
      com.c.c(359212022061030172L).setBoolean(this, var3);
   }

   @Override
   public void paintBorder(Component var1, Graphics var2, int var3, int var4, int var5, int var6) {
      Graphics var10;
      label24: {
         String var7 = Km_2.U();
         int var10000 = com.c.c(176342309188219212L).getInt(this);
         if (var7 == null) {
            if (var10000 <= 0) {
               return;
            }

            var10 = var2;
            if (var7 != null) {
               break label24;
            }

            var10000 = var2 instanceof Graphics2D;
         }

         if (var10000 == 0) {
            return;
         }

         var10 = var2;
      }

      Graphics2D var8 = (Graphics2D)var10;
      Color var9 = var8.getColor();
      var8.setColor((Color)com.c.c(419689797620814599L).get(this));
      var8.drawRect(0, 0, var5 - 1, var6 - 1);
      var8.setColor(var9);
   }

   @Override
   public Insets getBorderInsets(Component var1, Insets var2) {
      var2.set(
         com.c.c(176342309188219212L).getInt(this),
         com.c.c(176342309188219212L).getInt(this),
         com.c.c(176342309188219212L).getInt(this),
         com.c.c(176342309188219212L).getInt(this)
      );
      return var2;
   }

   public Color getJ() {
      return (Color)com.c.c(419689797620814599L).get(this);
   }

   public int getM() {
      return com.c.c(176342309188219212L).getInt(this);
   }

   public boolean getT() {
      return com.c.c(359212022061030172L).getBoolean(this);
   }

   @Override
   public boolean isBorderOpaque() {
      String var1 = Km_2.U();
      boolean var10000 = com.c.c(359212022061030172L).getBoolean(this);
      if (var1 == null) {
         var10000 = !var10000;
      }

      return var10000;
   }
}





