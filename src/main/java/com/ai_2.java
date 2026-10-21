package com;

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

public class ai_2 implements Icon {
   private com.cJ_3 F;
   private final Map k;
   private int g = 0;
   private int K;
   private int V;
   private Thread j;
   private boolean E;

   public ai_2(Class var1, String var2) throws IOException {
      this(new BufferedInputStream(var1.getResource(var2).openStream()));
   }

   public ai_2(String var1) throws FileNotFoundException {
      this(new BufferedInputStream(new FileInputStream(var1)));
   }

   public ai_2(BufferedInputStream var1) {
      com.ky_4[] var10000 = com.kj_4.d();
      this.K = 0;
      com.ky_4[] var2 = var10000;
      this.V = -1;
      this.E = false;
      this.k = new HashMap();
      nS_3 var3 = new nS_3();
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
         this.k.put(var4, new com.kj_4(var3.j(var4), var3.F(var4)));
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
      com.ky_4[] var1 = com.kj_4.d();
      com.ai_2 var10000 = this;
      if (var1 != null) {
         if (this.K <= 1) {
            return;
         }

         this.V = 0;
         this.j = new Thread(new com.LG(this));
         this.j.setDaemon(true);
         var10000 = this;
      }

      var10000.j.start();
   }

   public void Q() {
      com.ky_4[] var1 = com.kj_4.d();
      com.ai_2 var10000 = this;
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
      com.ky_4[] var5 = com.kj_4.d();
      if (var5 != null && this.K > 0) {
         var2.drawImage(((com.kj_4)this.k.get(this.V)).W, var3, var4, var1);
      }
   }

   @Override
   public int getIconWidth() {
      return ((com.kj_4)this.k.get(this.V)).W.getWidth();
   }

   @Override
   public int getIconHeight() {
      return ((com.kj_4)this.k.get(this.V)).W.getHeight();
   }

   public BufferedImage o() {
      return ((com.kj_4)this.k.get(this.V)).W;
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

   public com.cJ_3 g() {
      return this.F;
   }

   public void v(com.cJ_3 var1) {
      this.F = var1;
   }

   static boolean r(com.ai_2 var0) {
      return var0.E;
   }

   static int E(com.ai_2 var0) {
      return var0.V;
   }

   static Map q(com.ai_2 var0) {
      return var0.k;
   }

   static int C(com.ai_2 var0) {
      return var0.K;
   }

   static int g(com.ai_2 var0, int var1) {
      return var0.V = var1;
   }

   static int z(com.ai_2 var0) {
      return var0.V++;
   }

   static com.cJ_3 I(com.ai_2 var0) {
      return var0.F;
   }
}





