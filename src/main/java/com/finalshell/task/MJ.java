package com.finalshell.task;

import com.finalshell.core.DQ3;
import com.finalshell.core.Ty2;
import com.finalshell.reflect.Ref;
import java.io.IOException;

public class MJ implements Runnable {
   public final DQ3 C;
   public final String J;
   public final Ty2 d;

   public MJ(Ty2 var1, DQ3 var2, String var3) {
      this.d = var1;
      this.C = var2;
      this.J = var3;
   }

   @Override
   public void run() {
      try {
         Object var2 = 558646295097493228L;
         ((DQ3)Ref.g(558646295097493228L, var2)).j();
         Object var4 = 408840269454195855L;
         this.write(((String)Ref.g(408840269454195855L, var4)).getBytes());
         Object var6 = 558646295097493228L;
         ((DQ3)Ref.g(558646295097493228L, var6)).j().flush();
      } catch (IOException var8) {
         var8.printStackTrace();
      }
   }
}





