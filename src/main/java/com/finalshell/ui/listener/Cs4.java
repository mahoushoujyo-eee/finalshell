package com.finalshell.ui.listener;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Bq2;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.CopyMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Cs4 implements ActionListener {
   public final Bq2 Z;
   public final T32 y;
   public final CopyMenu k;

   public Cs4(CopyMenu var1, Bq2 var2, T32 var3) {
      this.k = var1;
      this.Z = var2;
      this.y = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var6 = 145480031395295354L;
      Ref.g(145480031395295354L, var6);
      Object[] var10002 = Registry.e(System.currentTimeMillis());
      long var9 = 629956276110918730L;
      Object[] var8 = var10002;
      Ref.h(629956276110918730L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Object var10 = 610859697146086932L;
      Ref.g(610859697146086932L, var10);
      Object var12 = 272626629694387105L;
      Lv4_2 var2 = ((ConnectionProperty)Ref.g(272626629694387105L, var12)).a();
      String var10005 = (String)(Registry.emptyArgs());
      long var15 = 432693308750455264L;
      Object[] var14 = var10005;
      var10005 = Ref.h(432693308750455264L, var14, var15);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      String var3 = var10005;
      Registry.emptyArgs();
      long var16 = 270389152141252877L;
      Ref.h2(270389152141252877L, var16);
      Object[] var10007 = Registry.emptyArgs();
      long var19 = 634817973682994708L;
      Object[] var18 = var10007;
      Ref.h(634817973682994708L, var18, var19);
      Object[] var10008 = Registry.emptyArgs();
      long var21 = 240567170779145617L;
      Object[] var20 = var10008;
      Ref.h(240567170779145617L, var20, var21);
      Object[] var10009 = Registry.emptyArgs();
      long var23 = 226341449505323490L;
      Object[] var22 = var10009;
      Ref.h(226341449505323490L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      Object var24 = 388053628828140941L;
      Ref.g(388053628828140941L, var24);
      Object[] var10012 = Registry.emptyArgs();
      long var27 = 328118709254946779L;
      Object[] var26 = var10012;
      var10012 = Ref.h(328118709254946779L, var26, var27);

      try {
         var41 = (Integer)var10012;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      var10012 = Registry.packArgs(var41 + 1);
      long var29 = 373772676770569629L;
      Object[] var28 = var10012;
      var10012 = Ref.h(373772676770569629L, var28, var29);

      try {
         var10012 = (ConnectionProperty)var10012;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      ConnectionProperty var5 = var10012;
      var5.H(var2);
      Object[] var10013 = Registry.packArgs(var5, var3, false);
      long var31 = 274870394042991893L;
      Object[] var30 = var10013;
      Ref.h(274870394042991893L, var30, var31);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }
   }
}





