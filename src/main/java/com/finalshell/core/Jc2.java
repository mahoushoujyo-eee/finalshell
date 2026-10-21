package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Bq2;
import java.awt.Window;

public class Jc2 {
   public com.finalshell.ui.panel.AM f;
   public com.finalshell.ui.panel.AM o;
   public Bq2 I;
   public Bq2 F;
   public Window h;
   public Window s;
   public boolean m;
   public boolean n;
   public int Y;
   public static int g;
   public static int S;
   public static int w;
   public static int p;
   public static int e;

   public Jc2() {
      Registry.lookupField(148152484588410919L).setInt(this, Registry.lookupField(299739253213373636L).getInt(null));
   }

   public com.finalshell.ui.panel.AM X() {
      Object var1 = 264585922666744083L;
      return (com.finalshell.ui.panel.AM)Ref.g(264585922666744083L, var1);
   }

   public void V(com.finalshell.ui.panel.AM var1) {
      long var3 = 264585922666744083L;
      Ref.s(264585922666744083L, var1, var3);
   }

   public com.finalshell.ui.panel.AM c() {
      Object var1 = 252180046907826841L;
      return (com.finalshell.ui.panel.AM)Ref.g(252180046907826841L, var1);
   }

   public void Q(com.finalshell.ui.panel.AM var1) {
      long var3 = 252180046907826841L;
      Ref.s(252180046907826841L, var1, var3);
   }

   public Bq2 I() {
      Object var1 = 394102060859089866L;
      return (Bq2)Ref.g(394102060859089866L, var1);
   }

   public void k(Bq2 var1) {
      long var3 = 394102060859089866L;
      Ref.s(394102060859089866L, var1, var3);
   }

   public Bq2 e() {
      Object var1 = 161960474906314787L;
      return (Bq2)Ref.g(161960474906314787L, var1);
   }

   public void m(Bq2 var1) {
      long var3 = 161960474906314787L;
      Ref.s(161960474906314787L, var1, var3);
   }

   public boolean s() {
      return Registry.lookupField(287677674021479590L).getBoolean(this);
   }

   public void c(boolean var1) {
      Registry.lookupField(287677674021479590L).setBoolean(this, var1);
   }

   public boolean x() {
      return Registry.lookupField(473767691927863239L).getBoolean(this);
   }

   public void M(boolean var1) {
      Registry.lookupField(473767691927863239L).setBoolean(this, var1);
   }

   public Window o() {
      Object var1 = 617836175434715301L;
      return (Window)Ref.g(617836175434715301L, var1);
   }

   public void v(Window var1) {
      long var3 = 617836175434715301L;
      Ref.s(617836175434715301L, var1, var3);
   }

   public Window k() {
      Object var1 = 244283170258878415L;
      return (Window)Ref.g(244283170258878415L, var1);
   }

   public void G(Window var1) {
      long var3 = 244283170258878415L;
      Ref.s(244283170258878415L, var1, var3);
   }

   public int V() {
      return Registry.lookupField(148152484588410919L).getInt(this);
   }

   public void u(int var1) {
      Registry.lookupField(148152484588410919L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 2241013989760599604L;
      long[] var0 = new long[5];
      int var4 = 0;
      String var5 = "Ë@Æ?¬\\\u0086\\\u0097¥>\u0097¬\\\u0086R\u008b9\u0099W¬\\\u0086Q";
      int var6 = "Ë@Æ?¬\\\u0086\\\u0097¥>\u0097¬\\\u0086R\u008b9\u0099W¬\\\u0086Q".length();
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
                     Registry.lookupField(299739253213373636L).setInt(null, (int)var0[3]);
                     Registry.lookupField(581124220784366544L).setInt(null, (int)var0[2]);
                     Registry.lookupField(489009438537732568L).setInt(null, (int)var0[1]);
                     Registry.lookupField(617945104086657545L).setInt(null, (int)var0[4]);
                     Registry.lookupField(470891030811937041L).setInt(null, (int)var0[0]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "Ó\u0002«Ü¬\\\u0086Pà\"Á5¬\\\u0086S";
                  var6 = "Ó\u0002«Ü¬\\\u0086Pà\"Á5¬\\\u0086S".length();
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





