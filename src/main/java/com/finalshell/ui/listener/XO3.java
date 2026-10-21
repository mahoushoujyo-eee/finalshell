package com.finalshell.ui.listener;

import com.finalshell.core.Cz2;
import com.finalshell.core.Ne4;
import com.finalshell.core.RZ3;
import com.finalshell.ui.panel.Kz4;
import com.finalshell.ui.panel.Wb2;
import java.io.File;
import javax.swing.text.JTextComponent;

public class XO3 extends XA3 {
   public final RZ3 h;

   public XO3(RZ3 var1) {
      super(var1);
      this.h = var1;
   }

   public void s(File var1) {
      ((Ne4)RZ3.c(this.h)).v(new Wb2(Cz2.B(var1)));
      Cz2.D((JTextComponent)RZ3.n(this.h), var1);
      super.y(var1);
   }

   @Override
   public boolean p() {
      String var10000 = Kz4.M();
      String var2 = ((Ne4)RZ3.k(this.h)).getText();
      String var1 = var10000;
      boolean var4 = var2.equals(((File)this.j).getName());
      if (var1 != null) {
         if (!var4) {
            File var3 = new File(((File)this.j).getParent(), var2);
            boolean var5 = ((File)this.j).renameTo(var3);
            if (var1 != null) {
               if (var5) {
                  this.j = var3;
               }

               var5 = super.p();
            }

            return var5;
         }

         super.a();
         var4 = true;
      }

      return var4;
   }

   @Override
   public void y(Object var1) {
      this.s((File)var1);
   }
}





