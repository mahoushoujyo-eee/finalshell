package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.MouseEvent;

public class Y9 {
   public T32 K;
   public static int D;
   public static int u;
   public static int C;
   public static int f;
   public static int n;
   public boolean i;
   public MouseEvent e;
   public int V;
   public int v;
   public int I;
   public int Y;
   public boolean S;
   public boolean L;

   public Y9(T32 var1, int var2) {
      long var4 = 503850750474376128L;
      Ref.s(503850750474376128L, var1, var4);
      Registry.lookupField(128694443696326857L).setInt(this, var2);
   }

   public T32 l() {
      Object var1 = 503850750474376128L;
      return (T32)Ref.g(503850750474376128L, var1);
   }

   public void r(T32 var1) {
      long var3 = 503850750474376128L;
      Ref.s(503850750474376128L, var1, var3);
   }

   public int Z() {
      return Registry.lookupField(128694443696326857L).getInt(this);
   }

   public void L(int var1) {
      Registry.lookupField(128694443696326857L).setInt(this, var1);
   }

   public MouseEvent K() {
      Object var1 = 235836144414111419L;
      return (MouseEvent)Ref.g(235836144414111419L, var1);
   }

   public void I(MouseEvent var1) {
      long var3 = 235836144414111419L;
      Ref.s(235836144414111419L, var1, var3);
   }

   public boolean R() {
      return Registry.lookupField(324549244723961442L).getBoolean(this);
   }

   public void a(boolean var1) {
      Registry.lookupField(324549244723961442L).setBoolean(this, var1);
   }

   public boolean g() {
      return Registry.lookupField(524433428041456995L).getBoolean(this);
   }

   public void I(boolean var1) {
      Registry.lookupField(524433428041456995L).setBoolean(this, var1);
   }

   public int L() {
      return Registry.lookupField(566514661120379665L).getInt(this);
   }

   public void j(int var1) {
      Registry.lookupField(566514661120379665L).setInt(this, var1);
   }

   public int b() {
      return Registry.lookupField(442691960412597171L).getInt(this);
   }

   public void m(int var1) {
      Registry.lookupField(442691960412597171L).setInt(this, var1);
   }

   public int d() {
      return Registry.lookupField(301346640398574700L).getInt(this);
   }

   public void P(int var1) {
      Registry.lookupField(301346640398574700L).setInt(this, var1);
   }

   public boolean r() {
      return Registry.lookupField(621682701384588437L).getBoolean(this);
   }

   public void Y(boolean var1) {
      Registry.lookupField(621682701384588437L).setBoolean(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 4881907864969284400L;
      long[] var0 = new long[5];
      int var4 = 0;
      String var5 = "\u008b\u0012g\u008fu®\u000bW6ÜÕ\nu®\u000bTá\u0082>ëu®\u000bV";
      int var6 = "\u008b\u0012g\u008fu®\u000bW6ÜÕ\nu®\u000bTá\u0082>ëu®\u000bV".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var10000 = var0;
         var10001 = var4++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var3 >= var6) {
                     Registry.lookupField(307190072297206240L).setInt(null, (int)var0[1]);
                     Registry.lookupField(141500763651848578L).setInt(null, (int)var0[3]);
                     Registry.lookupField(534616084670407665L).setInt(null, (int)var0[2]);
                     Registry.lookupField(454291477903395804L).setInt(null, (int)var0[0]);
                     Registry.lookupField(527075857672909373L).setInt(null, (int)var0[4]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "u$±\u0092u®\u000bU îu\nu®\u000bX";
                  var6 = "u$±\u0092u®\u000bU îu\nu®\u000bX".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes("ISO-8859-1");
            var10000 = var0;
            var10001 = var4++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





