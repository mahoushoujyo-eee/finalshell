package com.finalshell.ui.listener;

import com.finalshell.core.Cz2;
import com.finalshell.core.Ne4;
import com.finalshell.core.RY3;
import com.finalshell.ui.model.CB3;
import com.finalshell.ui.model.CY3;
import com.finalshell.ui.panel.Wb2;
import java.io.File;
import javax.swing.text.JTextComponent;

public class Xs4 extends XA3 {
   public final RY3 U;

   public Xs4(RY3 var1) {
      super(var1);
      this.U = var1;
   }

   public void E(CY3 var1) {
      File var2 = var1.D();
      ((Ne4)RY3.x(this.U)).v(new Wb2(Cz2.B(var2)));
      Cz2.D((JTextComponent)RY3.P(this.U), var2);
      super.y(var1);
   }

   @Override
   public boolean p() {
      File var2 = ((CY3)this.j).D();
      String[] var10000 = CB3.C$arrString();
      String var3 = ((Ne4)RY3.T(this.U)).getText();
      String[] var1 = var10000;
      boolean var5 = var3.equals(var2.getName());
      if (var1 != null) {
         if (!var5) {
            File var4 = new File(var2.getParent(), var3);
            boolean var6 = var2.renameTo(var4);
            if (var1 != null) {
               if (var6) {
                  ((CY3)this.j).h(var4);
               }

               var6 = super.p();
            }

            return var6;
         }

         super.a();
         var5 = true;
      }

      return var5;
   }

   @Override
   public void y(Object var1) {
      this.E((CY3)var1);
   }
}





