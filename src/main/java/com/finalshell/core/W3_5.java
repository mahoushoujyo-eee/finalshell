package com.finalshell.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public class W3_5 implements Z_5 {
   public final List W;
   public final File B;
   public final FilenameFilter h;
   public final FilenameFilter c;

   public W3_5(File var1, FilenameFilter var2, FilenameFilter var3) {
      this.B = var1;
      this.h = var2;
      this.c = var3;
      this.W = com.finalshell.ui.model.Q_3.V(new Z3_3(this, this.B));
   }

   @C_9
   public File u() {
      boolean var1 = F3_3.s();

      while (!this.W.isEmpty()) {
         label39: {
            Z3_3 var2 = (Z3_3)this.W.get(this.W.size() - 1);
            boolean var10000 = var2.w.hasNext();
            if (var1) {
               if (var10000) {
                  this.W.add(new Z3_3(this, (File)var2.w.next()));
                  if (var1) {
                     break label39;
                  }
               }

               if (!var1) {
                  break label39;
               }

               var10000 = var2.Y.hasNext();
            }

            if (var10000) {
               return (File)var2.Y.next();
            }

            this.W.remove(this.W.size() - 1);
         }

         if (!var1) {
            break;
         }
      }

      return null;
   }

   @C_9
   @Override
   public Object h() {
      return this.u();
   }
}





