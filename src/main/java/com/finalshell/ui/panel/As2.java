package com.finalshell.ui.panel;

import com.finalshell.core.Dy4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;

public class As2 extends JComponent {
   public Connection5 U;
   public Tv2 V;
   public Dy4_2 q;

   public As2(ShowDeletedPanel var1, Connection5 var2) {
      Dy4_2 var10001 = new Dy4_2();
      long var4 = 165188491801132237L;
      Dy4_2 var3 = var10001;
      Ref.s(165188491801132237L, var3, var4);
      Object var5 = 165188491801132237L;
      this.setLayout((Dy4_2)Ref.g(165188491801132237L, var5));
      long var8 = 539292081619626259L;
      Ref.s(539292081619626259L, var2, var8);
      Tv2 var10005;
      Object var9 = 539292081619626259L;
var1 = new As2(this, (Connection5)Ref.g(539292081619626259L, var9));
      long var12 = 229342211508771365L;
      Tv2 var11 = var10005;
      Ref.s(229342211508771365L, var11, var12);
      Object var13 = 229342211508771365L;
      this.add((Tv2)Ref.g(229342211508771365L, var13));
      Object var15 = 539292081619626259L;
      this.add((Connection5)Ref.g(539292081619626259L, var15));
      Object var17 = 539292081619626259L;
      Ref.g(539292081619626259L, var17);
      Object[] var10009 = Registry.packArgs(this);
      long var20 = 460622801446089528L;
      Object[] var19 = var10009;
      Ref.h(460622801446089528L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }
   }

   @Override
   public Dimension getPreferredSize() {
      String var1 = AA.z();
      Object var2 = 539292081619626259L;
      Object var10001 = (Connection5)Ref.g(539292081619626259L, var2);
      if (var1 == null) {
         if (var10001 == null) {
            return super.getPreferredSize();
         }

         var10001 = this;
         Object var4 = 539292081619626259L;
         Connection5 var10002 = (Connection5)Ref.g(539292081619626259L, var4);
      }

      return ((Connection5)var10001).getPreferredSize();
   }

   public Dy4_2 C() {
      Object var1 = 165188491801132237L;
      return (Dy4_2)Ref.g(165188491801132237L, var1);
   }

   public void Z(Dy4_2 var1) {
      long var3 = 165188491801132237L;
      Ref.s(165188491801132237L, var1, var3);
   }

   public Tv2 Y() {
      Object var1 = 229342211508771365L;
      return (Tv2)Ref.g(229342211508771365L, var1);
   }

   public void P(Tv2 var1) {
      long var3 = 229342211508771365L;
      Ref.s(229342211508771365L, var1, var3);
   }
}





