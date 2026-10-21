package com.finalshell.core;

import com.finalshell.task.LG;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;

public class Ai2_2 implements Icon {
   public CJ3 F;
   public final Map k;
   public int g = 0;
   public int K;
   public int V;
   public Thread j;
   public boolean E;

   public Ai2_2(java.lang.Class var1, String var2) throws IOException {
      this(new BufferedInputStream(var1.getResource(var2).openStream()));
   }

   public Ai2_2(String var1) throws FileNotFoundException {
      this(new BufferedInputStream(new FileInputStream(var1)));
   }

   public Ai2_2(BufferedInputStream var1) {
      Ky4[] var10000 = Kj4.d();
      this.K = 0;
      Ky4[] var2 = var10000;
      this.V = -1;
      this.E = false;
      this.k = new HashMap();
      NS3 var3 = new NS3();
      this.g = var3.P(var1);
      int var5 = this.g;
      if (var2 != null) {
         if (this.g != 0) {
            return;
         }

         this.K = var3.f();
         this.V = 0;
         var5 = 0;
      }

      int var4 = var5;

      while (var4 < this.K) {
         this.k.put(var4, new Kj4(var3.j(var4), var3.F(var4)));
         var4++;
         if (var2 == null) {
            return;
         }

         if (var2 == null) {
            break;
         }
      }

      this.b();
   }

   public void b() {
      Ky4[] var1 = Kj4.d();
      Ai2_2 var10000 = this;
      if (var1 != null) {
         if (this.K <= 1) {
            return;
         }

         this.V = 0;
         this.j = new Thread(new LG(this));
         this.j.setDaemon(true);
         var10000 = this;
      }

      var10000.j.start();
   }

   public void Q() {
      Ky4[] var1 = Kj4.d();
      Ai2_2 var10000 = this;
      if (var1 != null) {
         if (!this.j.isAlive()) {
            return;
         }

         var10000 = this;
      }

      var10000.E = true;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      Ky4[] var5 = Kj4.d();
      if (var5 != null && this.K > 0) {
         var2.drawImage(((Kj4)this.k.get(this.V)).W, var3, var4, var1);
      }
   }

   @Override
   public int getIconWidth() {
      return ((Kj4)this.k.get(this.V)).W.getWidth();
   }

   @Override
   public int getIconHeight() {
      return ((Kj4)this.k.get(this.V)).W.getHeight();
   }

   public BufferedImage o() {
      return ((Kj4)this.k.get(this.V)).W;
   }

   public int t() {
      return this.g;
   }

   public int F() {
      return this.K;
   }

   public int x() {
      return this.V;
   }

   public Map H() {
      return this.k;
   }

   public CJ3 g() {
      return this.F;
   }

   public void v(CJ3 var1) {
      this.F = var1;
   }

   public static boolean r(Ai2_2 var0) {
      return var0.E;
   }

   public static int E(Ai2_2 var0) {
      return var0.V;
   }

   public static Map q(Ai2_2 var0) {
      return var0.k;
   }

   public static int C(Ai2_2 var0) {
      return var0.K;
   }

   public static int g(Ai2_2 var0, int var1) {
      return var0.V = var1;
   }

   public static int z(Ai2_2 var0) {
      return var0.V++;
   }

   public static CJ3 I(Ai2_2 var0) {
      return var0.F;
   }
}





