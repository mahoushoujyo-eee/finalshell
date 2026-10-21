package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Li4 extends Ln4_2 {
   public static Random H;
   public ArrayList z;

   public Li4() {
      ArrayList var10001 = new ArrayList();
      long var2 = 343117406904829554L;
      ArrayList var1 = var10001;
      Ref.s(343117406904829554L, var1, var2);
   }

   public void w(Lj4_2 var1) {
      AppendCarriageReturnCRPanel.Y();
      Object var5 = 343117406904829554L;
      Iterator var3 = ((ArrayList)Ref.g(343117406904829554L, var5)).iterator();
      Li4 var2 = this;

      while (var3.hasNext()) {
         label20: {
            Lj4_2 var4 = (Lj4_2)var3.next();
            boolean var10001 = var1.equals(var4);
            if (var2 == null) {
               if (!var10001) {
                  break label20;
               }

               Object var7 = 343117406904829554L;
               ((ArrayList)Ref.g(343117406904829554L, var7)).remove(var1);
            }

            if (var2 == null) {
               break;
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public ArrayList Z() {
      Object var1 = 343117406904829554L;
      return (ArrayList)Ref.g(343117406904829554L, var1);
   }

   public void m(ArrayList var1) {
      long var3 = 343117406904829554L;
      Ref.s(343117406904829554L, var1, var3);
   }

   @Override
   public Ln4_2 B() {
      return new Li4();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      Ref.setField(0L, null, new Random());
   }
}





