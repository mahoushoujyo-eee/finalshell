package com;

import com.A.C;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class x0_2 extends C {
   private static final long a;

   public x0_2(String var1) {
      this.e(new com.Wb_2(var1));
   }

   public x0_2(Class var1, String var2) {
      this.e(new com.Wb_2(var1, var2));
   }

   public x0_2(URL var1) {
      this.e(new com.Wb_2(var1));
   }

   public x0_2(Icon var1) {
      this.e(new com.Wb_2(var1));
   }

   public x0_2(ImageIcon var1) {
      this.e(new com.Wb_2(var1));
   }

   public x0_2(Image var1) {
      this.e(new com.Wb_2(var1));
   }

   public x0_2(BufferedImage var1) {
      this.e(new com.Wb_2(var1));
   }

   private void e(com.Wb_2 var1) {
      this.setIconImages(com.a9.e());
      this.setLayout(new BorderLayout());
      com.ky_4 var2 = new com.ky_4(new com.LK());
      var2.C(Math.max(5, (int)a - var1.getWidth()));
      this.add(var2);
      var2.add(var1);
      this.setDefaultCloseOperation(3);
      this.setResizable(true);
      this.pack();
      this.U();
      this.setVisible(true);
   }

   static {
      long var0 = 2621116915874242962L;
      long var10002 = -3937877299982786110L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





