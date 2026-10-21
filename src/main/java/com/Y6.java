package com;

import com.C.v_2;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Y6 extends v_2 {
   public static Color G;
   public static int K;

   public void Z(Graphics2D var1, Rectangle var2, com.O8 var3) {
      Object var4 = RV.X(var1);
      var1.setColor(G);
      var1.fillRoundRect(var2.x, var2.y, var2.width, var2.height, K * 2, K * 2);
      RV.X(var1, var4);
      super.u(var1, var2, (JLabel)var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JLabel var3) {
      this.Z(var1, var2, (com.O8)var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.Z(var1, var2, (com.O8)var3);
   }

   static {
      long var1 = 8666983656198584621L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "¤V´x5Õ9\u009f7\u0099·Q5Õ9Ò\u001fÿ\u008f\u00115Õ9Ò";
      int var6 = "¤V´x5Õ9\u009f7\u0099·Q5Õ9Ò\u001fÿ\u008f\u00115Õ9Ò".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      G = new Color((int)var0[1], (int)var0[2], (int)var0[2], (int)var0[0]);
      K = GO.Fx;
   }
}





