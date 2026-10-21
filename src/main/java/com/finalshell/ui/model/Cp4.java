package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import javax.swing.tree.DefaultMutableTreeNode;

public class Cp4 implements Comparator {
   public final Collator D;

   public Cp4(Collator var1) {
      this.D = var1;
   }

   public int z(DefaultMutableTreeNode var1, DefaultMutableTreeNode var2) {
      Tf4 var3 = (Tf4)var1.getUserObject();
      Tf4 var4 = (Tf4)var2.getUserObject();
      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10002 = Registry.emptyArgs();
      long var10 = 410905379772103887L;
      Object[] var9 = var10002;
      Ref.h(410905379772103887L, var9, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var12 = 179612178163941306L;
      Object[] var11 = var10004;
      var10004 = Registry.packArgs(Ref.h(179612178163941306L, var11, var12));
      long var14 = 133273064107181210L;
      Object[] var13 = var10004;
      Ref.h(133273064107181210L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Registry.emptyArgs();
      long var15 = 270389152141252877L;
      Ref.h2(270389152141252877L, var15);
      Object[] var10006 = Registry.emptyArgs();
      long var18 = 410905379772103887L;
      Object[] var17 = var10006;
      Ref.h(410905379772103887L, var17, var18);
      Object[] var10008 = Registry.emptyArgs();
      long var20 = 179612178163941306L;
      Object[] var19 = var10008;
      var10008 = Registry.packArgs(Ref.h(179612178163941306L, var19, var20));
      long var22 = 133273064107181210L;
      Object[] var21 = var10008;
      var10008 = Ref.h(133273064107181210L, var21, var22);

      try {
         var10008 = (com.finalshell.core.LO3)var10008;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      com.finalshell.core.LO3 var6 = var10008;
      Object var23 = 188947662693861377L;
      Collator var10009 = (Collator)Ref.g(188947662693861377L, var23);
      String var10011 = (String)(Registry.emptyArgs());
      long var26 = 286931176286176762L;
      Object[] var25 = var10011;
      var10011 = Ref.h(286931176286176762L, var25, var26);

      try {
         var10011 = (String)var10011;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      String var10013 = (String)(Registry.emptyArgs());
      long var28 = 286931176286176762L;
      Object[] var27 = var10013;
      var10013 = Ref.h(286931176286176762L, var27, var28);

      try {
         var10013 = (String)var10013;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      return var10011.compare((String)var6, (String)var10013);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((DefaultMutableTreeNode)var1, (DefaultMutableTreeNode)var2);
      long var4 = 503973597807962376L;
      Object[] var3 = var10001;
      var10001 = Ref.h(503973597807962376L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





