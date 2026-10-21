package com.finalshell.ui.frame;

import com.finalshell.core.A9;
import com.finalshell.core.LK_2;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.Wb2;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class X02 extends C {
   public static long a;

   public X02(String var1) {
      this.e(new Wb2(var1));
   }

   public X02(Class var1, String var2) {
      this.e(new Wb2(var1, var2));
   }

   public X02(URL var1) {
      this.e(new Wb2(var1));
   }

   public X02(Icon var1) {
      this.e(new Wb2(var1));
   }

   public X02(ImageIcon var1) {
      this.e(new Wb2(var1));
   }

   public X02(Image var1) {
      this.e(new Wb2(var1));
   }

   public X02(BufferedImage var1) {
      this.e(new Wb2(var1));
   }

   public void e(Wb2 var1) {
      this.setIconImages(A9.e());
      this.setLayout(new BorderLayout());
      Ky4 var2 = new Ky4(new LK_2());
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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2621116915874242962L;
      long var10002 = -3937877299982786110L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





