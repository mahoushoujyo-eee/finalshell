package com.finalshell.ui.listener;

import com.finalshell.connection.Copy;
import com.finalshell.core.Y62_2;
import com.finalshell.core.YA3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class AK implements ActionListener {
   public final Copy d;

   public AK(Copy var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var5 = 584370662052237266L;
      Ref.g(584370662052237266L, var5);
      Object var7 = 406455305964270214L;
      int var2 = ((Y62_2)Ref.g(406455305964270214L, var7)).getSelectedRow();
      Object var9 = 584370662052237266L;
      Ref.g(584370662052237266L, var9);
      Object var11 = 406455305964270214L;
      int var3 = ((Y62_2)Ref.g(406455305964270214L, var11)).convertRowIndexToModel(var2);
      Object var13 = 584370662052237266L;
      Ref.g(584370662052237266L, var13);
      Object var15 = 347284645451059683L;
      Ref.g(347284645451059683L, var15);
      ArrayList var10007 = Registry.emptyArgs();
      long var18 = 530247999995353660L;
      Object[] var17 = var10007;
      var10007 = Ref.h(530247999995353660L, var17, var18);

      try {
         var10007 = (ArrayList)var10007;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      YA3_2 var4 = (YA3_2)var10007.get(var3);
      Registry.emptyArgs();
      long var19 = 270389152141252877L;
      Ref.h2(270389152141252877L, var19);
      Object[] var10009 = Registry.emptyArgs();
      long var22 = 634817973682994708L;
      Object[] var21 = var10009;
      Ref.h(634817973682994708L, var21, var22);
      Object[] var10010 = Registry.emptyArgs();
      long var24 = 240567170779145617L;
      Object[] var23 = var10010;
      Ref.h(240567170779145617L, var23, var24);
      Object[] var10011 = Registry.emptyArgs();
      long var26 = 226341449505323490L;
      Object[] var25 = var10011;
      Ref.h(226341449505323490L, var25, var26);
      Object[] var10012 = Registry.emptyArgs();
      long var28 = 153346140499032202L;
      Object[] var27 = var10012;
      Ref.h(153346140499032202L, var27, var28);
      Object[] var10013 = Registry.emptyArgs();
      long var30 = 221034384446077256L;
      Object[] var29 = var10013;
      Ref.h(221034384446077256L, var29, var30);
      Object[] var10015 = Registry.emptyArgs();
      long var32 = 593117720967762508L;
      Object[] var31 = var10015;
      var10015 = Registry.packArgs(Ref.h(593117720967762508L, var31, var32), null);
      long var34 = 407547220859876749L;
      Object[] var33 = var10015;
      Ref.h(407547220859876749L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }
   }
}





