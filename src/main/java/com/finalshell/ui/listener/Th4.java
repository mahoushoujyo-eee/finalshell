package com.finalshell.ui.listener;

import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class Th4 implements ActionListener {
   public final SetExternalEditorPanel B;

   public Th4(SetExternalEditorPanel var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.core.Km2.U$String();
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Object var10002 = Ref.h2(270389152141252877L, var6);
      U62 var10003 = (U62)(Registry.emptyArgs());
      long var9 = 306266403902896148L;
      Object[] var8 = var10003;
      var10003 = Ref.h(306266403902896148L, var8, var9);

      try {
         var10003 = (U62)var10003;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      U62 var3 = var10003;
      Object var2 = var10002;
      var10003 = Registry.packArgs(1);
      long var11 = 355959850244158035L;
      Object[] var10 = var10003;
      Ref.h(355959850244158035L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10005 = Registry.emptyArgs();
      long var15 = 578864097947885485L;
      Object[] var14 = var10005;
      Object[] var10006 = var14;
      Ref.h(578864097947885485L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      label85: {
         label79: {
            boolean var4 = false;
            if (var2 == null) {
               var10006 = Registry.emptyArgs();
               long var17 = 620011176897972573L;
               Object[] var16 = var10006;
               var10006 = Ref.h(620011176897972573L, var16, var17);

               try {
                  var10006 = (String)var10006;
               } catch (InvocationTargetException var28) {
                  throw var28.getTargetException();
               }

               if (var10006 != null) {
                  break label79;
               }

               var10006 = var4 = true;
            }

            if (var2 == null) {
               break label85;
            }
         }

         File var40;
         String var10008 = (String)(Registry.emptyArgs());
         long var19 = 620011176897972573L;
         Object[] var18 = var10008;
         var10008 = Ref.h(620011176897972573L, var18, var19);

         try {
            var10008 = (String)var10008;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

var3 = new Th4(var10008);
         File var5 = var40;
         var10006 = var5.exists();
         if (var2 == null && var10006 == false) {
            boolean var33;
            var10006 = var33 = true;
         }
      }

      if (var10006 == null) {
         Object var20 = 207788080053309886L;
         Ref.g(207788080053309886L, var20);
         Object var22 = 166731455568463101L;
         Registry.packArgs(Ref.g(166731455568463101L, var22));
         long var24 = 211273487601650149L;
         Ref.h2(211273487601650149L, var24);

         try {
            ;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }
      }
   }
}





