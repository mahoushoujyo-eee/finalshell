package com.finalshell.ui.listener;

import com.finalshell.core.Dv2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Xa2 implements DocumentListener {
   final ClearListDialog u;

   Xa2(ClearListDialog var1) {
      this.u = var1;
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      label65: {
         String[] var2 = ClearListDialog.i$arrString();
         Object var3 = 402898185977671634L;
         Xa2 var10001 = Registry.lookupField(187877731600446636L).getBoolean(Ref.g(402898185977671634L, var3));
         if (var2 == null) {
            if (var10001 == false) {
               return;
            }

            var10001 = this;
            Object var5 = 402898185977671634L;
            Registry.lookupField(410723057057853227L).setBoolean(Ref.g(402898185977671634L, var5), true);
            Object var7 = 402898185977671634L;
            Ref.g(402898185977671634L, var7);
            Object[] var10004 = Registry.emptyArgs();
            long var10 = 306221011327708335L;
            Object[] var9 = var10004;
            Ref.h(306221011327708335L, var9, var10);

            try {
               ;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            Object var11 = 402898185977671634L;
            Ref.g(402898185977671634L, var11);
            Object[] var10006 = Registry.emptyArgs();
            long var14 = 612990022110170911L;
            Object[] var13 = var10006;
            Ref.h(612990022110170911L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            Object var15 = 402898185977671634L;
            Ref.g(402898185977671634L, var15);
            Object[] var10008 = Registry.emptyArgs();
            long var18 = 260951206679444801L;
            Object[] var17 = var10008;
            Ref.h(260951206679444801L, var17, var18);

            try {
               ;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            Object var19 = 402898185977671634L;
            ClearListDialog var10009 = (ClearListDialog)Ref.g(402898185977671634L, var19);
            if (var2 != null) {
               break label65;
            }

            Registry.lookupField(546619646805113494L).getBoolean(var10009);
         }

         if (var10001 != false) {
            Object var21 = 402898185977671634L;
            ClearListDialog var10002 = (ClearListDialog)Ref.g(402898185977671634L, var21);
            if (var2 != null) {
               break label65;
            }

            Object var23 = 265132846717086219L;
            if (((Dv2)Ref.g(265132846717086219L, var23)).getText().length() <= 0) {
               return;
            }
         }

         Object var25 = 402898185977671634L;
         ClearListDialog var33 = (ClearListDialog)Ref.g(402898185977671634L, var25);
      }

      Object[] var10003 = Registry.emptyArgs();
      long var28 = 587140723221156561L;
      Object[] var27 = var10003;
      Ref.h(587140723221156561L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      String[] var2 = ClearListDialog.i$arrString();
      Object var3 = 402898185977671634L;
      Xa2 var10001 = Registry.lookupField(210701759688696485L).getBoolean(Ref.g(402898185977671634L, var3));
      if (var2 == null) {
         if (var10001 != false) {
            Object var5 = 402898185977671634L;
            Registry.lookupField(210701759688696485L).setBoolean(Ref.g(402898185977671634L, var5), false);
            return;
         }

         var10001 = this;
         Object var7 = 402898185977671634L;
         Registry.lookupField(187877731600446636L).getBoolean(Ref.g(402898185977671634L, var7));
      }

      if (var2 == null) {
         if (var10001 == false) {
            return;
         }

         var10001 = this;
         Object var9 = 402898185977671634L;
         Registry.lookupField(410723057057853227L).setBoolean(Ref.g(402898185977671634L, var9), true);
         Object var11 = 402898185977671634L;
         Ref.g(402898185977671634L, var11);
         Object[] var10004 = Registry.emptyArgs();
         long var14 = 306221011327708335L;
         Object[] var13 = var10004;
         Ref.h(306221011327708335L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var40) {
            throw var40.getTargetException();
         }

         Object var15 = 402898185977671634L;
         Registry.lookupField(278860969542151097L).getBoolean(Ref.g(402898185977671634L, var15));
      }

      label79: {
         if (var2 == null) {
            if (var10001 == false) {
               Object var17 = 402898185977671634L;
               Ref.g(402898185977671634L, var17);
               Object[] var10003 = Registry.emptyArgs();
               long var20 = 612990022110170911L;
               Object[] var19 = var10003;
               Ref.h(612990022110170911L, var19, var20);

               try {
                  ;
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }
            }

            var10001 = this;
            Object var21 = 402898185977671634L;
            Registry.lookupField(278860969542151097L).setBoolean(Ref.g(402898185977671634L, var21), false);
            Object var23 = 402898185977671634L;
            Ref.g(402898185977671634L, var23);
            Object[] var43 = Registry.emptyArgs();
            long var26 = 260951206679444801L;
            Object[] var25 = var43;
            Ref.h(260951206679444801L, var25, var26);

            try {
               ;
            } catch (InvocationTargetException var38) {
               throw var38.getTargetException();
            }

            Object var27 = 402898185977671634L;
            ClearListDialog var10005 = (ClearListDialog)Ref.g(402898185977671634L, var27);
            if (var2 != null) {
               break label79;
            }

            Registry.lookupField(546619646805113494L).getBoolean(var10005);
         }

         if (var10001 != false) {
            Object var29 = 402898185977671634L;
            ClearListDialog var10002 = (ClearListDialog)Ref.g(402898185977671634L, var29);
            if (var2 != null) {
               break label79;
            }

            Object var31 = 265132846717086219L;
            if (((Dv2)Ref.g(265132846717086219L, var31)).getText().length() <= 0) {
               return;
            }
         }

         Object var33 = 402898185977671634L;
         ClearListDialog var41 = (ClearListDialog)Ref.g(402898185977671634L, var33);
      }

      Object[] var42 = Registry.emptyArgs();
      long var36 = 587140723221156561L;
      Object[] var35 = var42;
      Ref.h(587140723221156561L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      label65: {
         String[] var2 = ClearListDialog.i$arrString();
         Object var3 = 402898185977671634L;
         Xa2 var10001 = Registry.lookupField(187877731600446636L).getBoolean(Ref.g(402898185977671634L, var3));
         if (var2 == null) {
            if (var10001 == false) {
               return;
            }

            var10001 = this;
            Object var5 = 402898185977671634L;
            Registry.lookupField(410723057057853227L).setBoolean(Ref.g(402898185977671634L, var5), true);
            Object var7 = 402898185977671634L;
            Ref.g(402898185977671634L, var7);
            Object[] var10004 = Registry.emptyArgs();
            long var10 = 306221011327708335L;
            Object[] var9 = var10004;
            Ref.h(306221011327708335L, var9, var10);

            try {
               ;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            Object var11 = 402898185977671634L;
            Ref.g(402898185977671634L, var11);
            Object[] var10006 = Registry.emptyArgs();
            long var14 = 612990022110170911L;
            Object[] var13 = var10006;
            Ref.h(612990022110170911L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            Object var15 = 402898185977671634L;
            Ref.g(402898185977671634L, var15);
            Object[] var10008 = Registry.emptyArgs();
            long var18 = 260951206679444801L;
            Object[] var17 = var10008;
            Ref.h(260951206679444801L, var17, var18);

            try {
               ;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            Object var19 = 402898185977671634L;
            ClearListDialog var10009 = (ClearListDialog)Ref.g(402898185977671634L, var19);
            if (var2 != null) {
               break label65;
            }

            Registry.lookupField(546619646805113494L).getBoolean(var10009);
         }

         if (var10001 != false) {
            Object var21 = 402898185977671634L;
            ClearListDialog var10002 = (ClearListDialog)Ref.g(402898185977671634L, var21);
            if (var2 != null) {
               break label65;
            }

            Object var23 = 265132846717086219L;
            if (((Dv2)Ref.g(265132846717086219L, var23)).getText().length() <= 0) {
               return;
            }
         }

         Object var25 = 402898185977671634L;
         ClearListDialog var33 = (ClearListDialog)Ref.g(402898185977671634L, var25);
      }

      Object[] var10003 = Registry.emptyArgs();
      long var28 = 587140723221156561L;
      Object[] var27 = var10003;
      Ref.h(587140723221156561L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }
   }
}





