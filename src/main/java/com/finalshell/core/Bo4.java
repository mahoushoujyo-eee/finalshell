package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;

public class Bo4 {
   public String i;
   public String g;
   public String J;
   public static int f;
   public static int q;
   public static int p;
   public static int e;
   public static int E;
   public static int B;
   public int r;
   public boolean R;
   public boolean n;
   public boolean Q;
   public String A;

   public Bo4(String var1, String var2, String var3) {
      this(var1, var2, var3, null);
   }

   public Bo4(String var1, String var2, String var3, String var4) {
   super();
      String var10000 = W2.F();
      String var5 = var10000;
      Registry.lookupField(441230096973232620L).setInt(this, 0);
      Registry.lookupField(195748561367902473L).setBoolean(this, false);
      Registry.lookupField(305641141513071189L).setBoolean(this, false);
      Registry.lookupField(588368480142043900L).setBoolean(this, false);
      long var8 = 203055800283390440L;
      Ref.s(203055800283390440L, var1, var8);
      long var10 = 606241115808562000L;
      Ref.s(606241115808562000L, var2, var10);
      long var12 = 252837156333601103L;
      Ref.s(252837156333601103L, var3, var12);
      int var6 = var1.lastIndexOf("/");
      int var10003 = var6;
      if (var5 != null) {
         if (var6 > -1) {
            var2 = var1.substring(var6);
         }

         var10003 = (var3.startsWith("d")) ? 1 : 0;
      }

      label72: {
         if (var5 != null) {
            if (var10003 != 0) {
               Registry.lookupField(441230096973232620L).setInt(this, Registry.lookupField(565021139729850169L).getInt(null));
               Registry.lookupField(195748561367902473L).setBoolean(this, true);
               if (var5 != null) {
                  break label72;
               }
            }

            var10003 = (var3.startsWith("l")) ? 1 : 0;
         }

         if (var5 != null) {
            if (var10003 != 0) {
               Registry.lookupField(441230096973232620L).setInt(this, Registry.lookupField(542137494819116319L).getInt(null));
               Registry.lookupField(305641141513071189L).setBoolean(this, true);
               long var14 = 407914632857802381L;
               Ref.s(407914632857802381L, var4, var14);
               if (var5 != null) {
                  break label72;
               }
            }

            var10003 = (var3.startsWith("-")) ? 1 : 0;
         }

         if (var5 != null) {
            if (var10003 != 0) {
               Registry.lookupField(441230096973232620L).setInt(this, Registry.lookupField(280278024323397611L).getInt(null));
               if (var5 != null) {
                  break label72;
               }
            }

            var10003 = (var3.startsWith("s")) ? 1 : 0;
         }

         if (var5 != null) {
            if (var10003 != 0) {
               Registry.lookupField(441230096973232620L).setInt(this, Registry.lookupField(365044829646503437L).getInt(null));
               if (var5 != null) {
                  break label72;
               }
            }

            var10003 = (var3.startsWith("c")) ? 1 : 0;
         }

         if (var5 != null) {
            if (var10003 != 0) {
               Registry.lookupField(441230096973232620L).setInt(this, Registry.lookupField(554335396504449933L).getInt(null));
               if (var5 != null) {
                  break label72;
               }
            }

            var10003 = (var3.startsWith("b")) ? 1 : 0;
         }

         if (var10003 != 0) {
            Registry.lookupField(441230096973232620L).setInt(this, Registry.lookupField(383882141393946944L).getInt(null));
         }
      }

      if (Ky4.F$arrString() != null) {
         W2.d("yD84Kc");
      }
   }

   public String X() {
      Object var1 = 606241115808562000L;
      return (String)Ref.g(606241115808562000L, var1);
   }

   public String U() {
      Object var1 = 203055800283390440L;
      return (String)Ref.g(203055800283390440L, var1);
   }

   public String B() {
      Object var1 = 252837156333601103L;
      return (String)Ref.g(252837156333601103L, var1);
   }

   public void T(String var1) {
      long var3 = 252837156333601103L;
      Ref.s(252837156333601103L, var1, var3);
   }

   public boolean n() {
      return Registry.lookupField(195748561367902473L).getBoolean(this);
   }

   public boolean Y(boolean var1) {
      Registry.lookupField(195748561367902473L).setBoolean(this, var1);
      return var1;
   }

   public int P() {
      return Registry.lookupField(441230096973232620L).getInt(this);
   }

   public void R(int var1) {
      Registry.lookupField(441230096973232620L).setInt(this, var1);
   }

   public String i() {
      Object var1 = 407914632857802381L;
      return (String)Ref.g(407914632857802381L, var1);
   }

   public boolean t() {
      return Registry.lookupField(588368480142043900L).getBoolean(this);
   }

   public void N(boolean var1) {
      Registry.lookupField(588368480142043900L).setBoolean(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 5935041026846809866L;
      long[] var0 = new long[5];
      int var4 = 0;
      String var5 = "\u0004y×ìd\u0092ß\t¯\u00adbÃd\u0092ß\u000eÿ8Ó#d\u0092ß\u000f";
      int var6 = "\u0004y×ìd\u0092ß\t¯\u00adbÃd\u0092ß\u000eÿ8Ó#d\u0092ß\u000f".length();
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
                     Registry.lookupField(280278024323397611L).setInt(null, 1);
                     Registry.lookupField(565021139729850169L).setInt(null, (int)var0[3]);
                     Registry.lookupField(542137494819116319L).setInt(null, (int)var0[0]);
                     Registry.lookupField(365044829646503437L).setInt(null, (int)var0[1]);
                     Registry.lookupField(554335396504449933L).setInt(null, (int)var0[2]);
                     Registry.lookupField(383882141393946944L).setInt(null, (int)var0[4]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "h¾c¦d\u0092ß\bÎiC\nd\u0092ß\u000f";
                  var6 = "h¾c¦d\u0092ß\bÎiC\nd\u0092ß\u000f".length();
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





