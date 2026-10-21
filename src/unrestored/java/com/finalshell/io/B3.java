package com.finalshell.io;

import com.finalshell.core.CH;
import com.finalshell.core.CN3;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;

public class B3 extends PrintStream {
   public HashSet K = new HashSet();
   public StringBuffer k = new StringBuffer();
   public static long a;

   public B3(OutputStream var1) {
      super(var1);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      super.write(var1, var2, var3);
      this.d(new String(var1, var2, var3));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void d(String var1) {
      boolean var2;
      B3 var10000;
      var2 = CN3.B();
      var10000 = this;
      label21:
      if (!var2) {
         if (this.k != null) {
            var10000 = this;
            if (var2) {
               break label21;
            }

            if (this.k.length() < (int)a) {
               this.k.append(var1);
            }
         }

         var10000 = this;
      }

      Iterator var4 = var10000.K.iterator();
      if (var2 || var4.hasNext()) {
         do {
            CH var3 = (CH)var4.next();
            var3.d(var1);
         } while (var4.hasNext());
      }
   }

   public void W(CH var1) {
      this.K.add(var1);
   }

   public void j(CH var1) {
      this.K.remove(var1);
   }

   public StringBuffer C() {
      return this.k;
   }

   public void p(StringBuffer var1) {
      this.k = var1;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3432898752115771358L;
      long var10002 = -4504073319083007794L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





