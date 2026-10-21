package com.finalshell.core;

import com.finalshell.io.YM3;
import com.finalshell.ui.model.EP;
import java.io.IOException;
import java.lang.reflect.Type;

public class Nl2 implements Ak2 {
   public static Nl2 v;

   @Override
   public void u(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      String var6 = Nv4.o();

      label27: {
         try {
            if (var6 == null) {
               return;
            }

            if (var2 == null) {
               break label27;
            }
         } catch (IOException var8) {
            throw new RuntimeException(a(var8));
         }

         var1.l(var2.toString());
         return;
      }

      YM3 var7 = var1.w;
      var7.x(EP.WriteNullStringAsEmpty);
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static void __vfClinit__() {
      v = new Nl2();
   }
}





