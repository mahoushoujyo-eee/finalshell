package com;

import java.io.IOException;
import java.lang.reflect.Type;

public class Nl_2 implements com.ak_2 {
   public static final Nl_2 v = new Nl_2();

   @Override
   public void u(nL_3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      String var6 = nv_4.o();

      label27: {
         try {
            if (var6 == null) {
               return;
            }

            if (var2 == null) {
               break label27;
            }
         } catch (IOException var8) {
            throw a(var8);
         }

         var1.l(var2.toString());
         return;
      }

      com.yM_3 var7 = var1.w;
      var7.x(EP.WriteNullStringAsEmpty);
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





