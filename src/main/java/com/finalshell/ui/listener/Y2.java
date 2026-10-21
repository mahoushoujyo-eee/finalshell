package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Y2 implements ActionListener {
   final ClearListDialog y;
   public static long a;

   Y2(ClearListDialog var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      ClearListDialog.i$arrString();
      System.currentTimeMillis();
      Object var6 = 603322144267344178L;
      Object var10003 = Ref.g(603322144267344178L, var6);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 598310545867820014L;
      Object[] var8 = var10004;
      var10004 = Ref.h(598310545867820014L, var8, var9);

      try {
         var44 = (Long)var10004;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      label81: {
         label82: {
            label83: {
               long var3 = var10003 - var44;
               Object var10 = 603322144267344178L;
               var10003 = ((ClearListDialog)Ref.g(603322144267344178L, var10)).isVisible();
               if (this == null) {
                  if (var10003 != 0) {
                     Object var12 = 603322144267344178L;
                     Ref.g(603322144267344178L, var12);
                     Object[] var10005 = Registry.emptyArgs();
                     long var15 = 496821856781947383L;
                     Object[] var14 = var10005;
                     Ref.h(496821856781947383L, var14, var15);

                     try {
                        ;
                     } catch (InvocationTargetException var40) {
                        throw var40.getTargetException();
                     }

                     if (this == null) {
                        break label83;
                     }
                  }

                  long var52;
                  var10003 = (var52 = var3 - a) == 0L ? 0 : (var52 < 0L ? -1 : 1);
               }

               if (this != null) {
                  break label82;
               }

               if (var10003 > 0) {
                  Object var16 = 603322144267344178L;
                  Ref.g(603322144267344178L, var16);
                  Object[] var47 = Registry.emptyArgs();
                  long var19 = 306221011327708335L;
                  Object[] var18 = var47;
                  Ref.h(306221011327708335L, var18, var19);

                  try {
                     ;
                  } catch (InvocationTargetException var39) {
                     throw var39.getTargetException();
                  }

                  Object var20 = 603322144267344178L;
                  Ref.g(603322144267344178L, var20);
                  Object[] var10007 = Registry.emptyArgs();
                  long var23 = 612990022110170911L;
                  Object[] var22 = var10007;
                  Ref.h(612990022110170911L, var22, var23);

                  try {
                     ;
                  } catch (InvocationTargetException var38) {
                     throw var38.getTargetException();
                  }
               }
            }

            var10003 = this;
            Object var24 = 603322144267344178L;
            ClearListDialog var45 = (ClearListDialog)Ref.g(603322144267344178L, var24);
            if (this != null) {
               break label81;
            }

            Registry.lookupField(433591404553967252L).getBoolean(var45);
         }

         if (var10003 != 0) {
            Object var26 = 603322144267344178L;
            Ref.g(603322144267344178L, var26);
            Object[] var48 = Registry.packArgs(true);
            long var29 = 464995000560394494L;
            Object[] var28 = var48;
            Ref.h(464995000560394494L, var28, var29);

            try {
               ;
            } catch (InvocationTargetException var37) {
               throw var37.getTargetException();
            }
         }

         Object var30 = 603322144267344178L;
         ClearListDialog var46 = (ClearListDialog)Ref.g(603322144267344178L, var30);
      }

      Rectangle var49 = (Rectangle)(Registry.emptyArgs());
      long var33 = 590715370702654304L;
      Object[] var32 = var49;
      var49 = Ref.h(590715370702654304L, var32, var33);

      try {
         var49 = (Rectangle)var49;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Rectangle var5 = var49;
      Object var34 = 603322144267344178L;
      ((ClearListDialog)Ref.g(603322144267344178L, var34)).setBounds(var5);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7647438739696825250L;
      long var10002 = 7647438739696825176L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





