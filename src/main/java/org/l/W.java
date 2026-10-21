package org.l;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

class W implements org.T.z {
   private final List W;
   final File B;
   final FilenameFilter h;
   final FilenameFilter c;

   W(File var1, FilenameFilter var2, FilenameFilter var3) {
      this.B = var1;
      this.h = var2;
      this.c = var3;
      this.W = q.V(new org.l.z(this, this.B));
   }

   @org.F.c
   public File u() {
      boolean var1 = F.s();

      while (!this.W.isEmpty()) {
         label39: {
            org.l.z var2 = (org.l.z)this.W.get(this.W.size() - 1);
            boolean var10000 = var2.w.hasNext();
            if (var1) {
               if (var10000) {
                  this.W.add(new org.l.z(this, (File)var2.w.next()));
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

   @org.F.c
   @Override
   public Object h() {
      return this.u();
   }
}





