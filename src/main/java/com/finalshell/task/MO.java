package com.finalshell.task;

import com.finalshell.core.Ca4;
import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import java.io.IOException;

public class MO implements Runnable {
   final YT3_2 j;

   MO(YT3_2 var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      try {
         Object var2 = 157811870559881943L;
         Ref.g(157811870559881943L, var2);
         Ca4 var10002 = new Ca4();
         long var5 = 581577507203115864L;
         Ca4 var4 = var10002;
         Ref.s(581577507203115864L, var4, var5);
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }
}





